// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

import org.slf4j.LoggerFactory;
import java.util.Iterator;
import java.util.Properties;
import com.ibm.jzos.ZUtil;
import java.io.File;
import com.ibm.jzos.Exec;
import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import org.slf4j.Logger;

public class JclSubmitStatusRetriever
{
    private static Logger logger;
    private static final String JOB_STATUS_REXX = "jobStatus";
    private JclJob job;
    private String configDir;
    private String jobStatusRexxCommand;
    private String[] environment;
    private long timeout;
    private static final String ENV_SHARED = "_BPX_SHAREAS";
    private static final String ENV_SPAWN_SCRIPT = "_BPX_SPAWN_SCRIPT";
    private static final String YES_VALUE = "YES";
    private static final String JOB_STATUS_MSG_PREFIX = "IKJ";
    private static final String JOB_KEYWORD = "JOB";
    private static final char SPACE_CHAR = ' ';
    
    public JclSubmitStatusRetriever(final JclJob job) {
        this.job = job;
    }
    
    public void setConfigDir(final String configDir) {
        this.configDir = configDir;
    }
    
    public void setTimeout(final long timeoutInMilliseconds) {
        this.timeout = timeoutInMilliseconds;
    }
    
    public JclSubmitStatus getStatus() throws BuildException {
        if (this.jobStatusRexxCommand == null) {
            this.jobStatusRexxCommand = this.getJobStatusRexxCommand();
        }
        if (this.environment == null) {
            this.environment = this.getEnvironment();
        }
        final JclSubmitStatus jobStatus = new JclSubmitStatus(this.job);
        String statusMsg;
        try {
            statusMsg = this.executeJobStatusRexx();
        }
        catch (IOException e) {
            throw new BuildException(Messages.getMessage("JobStatusRetriever_INTERNAL_ERROR", e.getMessage()), e);
        }
        jobStatus.parse(statusMsg);
        return jobStatus;
    }
    
    private String executeJobStatusRexx() throws IOException {
        final Exec exec = new Exec(this.jobStatusRexxCommand, this.environment);
        if (this.timeout > 0L) {
            exec.setTimeout((int)this.timeout);
        }
        else {
            exec.setTimeout(0);
        }
        exec.run();
        final String line = exec.readLine();
        if (line == null) {
            throw new IOException(Messages.getMessage("JobStatusRetriever_NO_OUTPUT_FROM_JOB_STATUS", this.jobStatusRexxCommand));
        }
        exec.getStdinWriter().close();
        exec.consumeOutput();
        final int rc = exec.getReturnCode();
        if (rc != 0) {
            throw new IOException(Messages.getMessage("JobStatusRetriever_JOB_STATUS_FAILED", line, rc));
        }
        JclSubmitStatusRetriever.logger.debug("Jcl submit status msg:\"" + line + "\"");
        final String[] outputSegments = line.split(" ");
        if (outputSegments.length < 3) {
            JclSubmitStatusRetriever.logger.warn(Messages.getMessage("JobStatusRetriever_JOB_STATUS_INVALID_OUTPUT", line));
        }
        int nextSegmentIndex = 0;
        if (outputSegments[nextSegmentIndex].startsWith("IKJ")) {
            ++nextSegmentIndex;
        }
        if (!outputSegments[nextSegmentIndex].equalsIgnoreCase("JOB")) {
            JclSubmitStatusRetriever.logger.warn(Messages.getMessage("JobStatusRetriever_JOB_STATUS_INVALID_OUTPUT", line));
        }
        final StringBuilder statusMsg = new StringBuilder();
        for (int i = ++nextSegmentIndex + 1; i < outputSegments.length; ++i) {
            statusMsg.append(outputSegments[i]);
            if (i + 1 < outputSegments.length) {
                statusMsg.append(' ');
            }
        }
        return statusMsg.toString();
    }
    
    protected String getJobStatusRexxCommand() {
        String cmdPath = "jobStatus";
        if (this.configDir != null) {
            final File jobStatusRexx = new File(this.configDir + '/' + "jobStatus");
            if (jobStatusRexx.exists()) {
                cmdPath = jobStatusRexx.getAbsolutePath();
            }
        }
        cmdPath = cmdPath + " " + this.job.getJobName() + " ";
        if (this.job.getJobId() != null) {
            cmdPath += this.job.getJobId();
        }
        return cmdPath;
    }
    
    protected String[] getEnvironment() {
        final Properties p = ZUtil.getEnvironment();
        p.put("_BPX_SHAREAS", "YES");
        p.put("_BPX_SPAWN_SCRIPT", "YES");
        final String[] environ = new String[p.size()];
        int i = 0;
        for (final String key : p.keySet()) {
            environ[i++] = key + "=" + p.getProperty(key);
        }
        return environ;
    }
    
    static {
        JclSubmitStatusRetriever.logger = LoggerFactory.getLogger((Class)JclSubmitStatusRetriever.class);
    }
}
