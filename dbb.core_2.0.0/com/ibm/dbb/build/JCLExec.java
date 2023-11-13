// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import org.slf4j.LoggerFactory;
import java.util.Iterator;
import java.util.Set;
import com.ibm.dbb.build.internal.jcl.JclJobOutputRetriever;
import com.ibm.dbb.build.internal.jcl.JclJobDDNameRetriever;
import java.util.List;
import com.ibm.dbb.EnvVars;
import com.ibm.jzos.MvsJobSubmitter;
import java.io.Reader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ByteArrayInputStream;
import com.ibm.jzos.FileFactory;
import java.io.BufferedReader;
import com.ibm.dbb.build.internal.ValidationHelper;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.report.records.ExecuteRecord;
import com.ibm.dbb.build.internal.jcl.JclJobStatus;
import com.ibm.dbb.build.internal.jcl.JclSubmitStatus;
import com.ibm.dbb.build.internal.jcl.JclJobStatusRetriever;
import com.ibm.dbb.build.internal.jcl.JclSubmitStatusRetriever;
import java.text.DateFormat;
import java.io.IOException;
import com.ibm.dbb.build.internal.Utils;
import com.ibm.dbb.build.internal.DBBSMFWriter;
import com.ibm.dbb.build.internal.ProductRegistrationChecker;
import java.util.concurrent.TimeUnit;
import com.ibm.dbb.build.internal.jcl.JclJob;
import java.io.File;
import org.slf4j.Logger;

public class JCLExec implements IExecute2
{
    private static Logger logger;
    private static final String DOUBLE_SLASHES = "//";
    private static final String DELIMITER_SPACE = "\\s+";
    private static final long WAIT_FOREVER = -1L;
    private static final long delay = 1000L;
    private String dataset;
    private String member;
    private File file;
    private String text;
    private String jclEncoding;
    private String confDir;
    private String maxRC;
    private JclJob job;
    private String volser;
    
    @Override
    public int executeAndWaitFor(final int timeout, final TimeUnit unit) throws BuildException {
        return this.doExecute(unit.toMillis(timeout));
    }
    
    @Override
    public int execute() throws BuildException {
        ProductRegistrationChecker.check();
        DBBSMFWriter.writeDBBSMFRecord();
        return this.doExecute(-1L);
    }
    
    private int doExecute(final long maxWaitTimeInMilliseconds) throws BuildException {
        this.validateInputs();
        this.maxRC = "";
        int rc = 0;
        if (Utils.isBuildReportOnly()) {
            try {
                this.buildJcl();
            }
            catch (IOException e) {
                throw new BuildException(e);
            }
            this.createBuildRecord(rc);
        }
        else {
            try {
                JCLExec.logger.debug("Enable Security Trace: " + this.isSecurityTraceEnabled());
                this.job = this.submitJcl();
                final long begin = System.currentTimeMillis();
                JCLExec.logger.debug("Submitting job '" + this.job + "' at " + DateFormat.getDateTimeInstance().format(begin));
                final JclSubmitStatusRetriever jobStatusRetriever = new JclSubmitStatusRetriever(this.job);
                if (maxWaitTimeInMilliseconds > 0L) {
                    jobStatusRetriever.setTimeout(maxWaitTimeInMilliseconds);
                }
                else {
                    jobStatusRetriever.setTimeout(0L);
                }
                jobStatusRetriever.setConfigDir(this.confDir);
                boolean isTimeout = false;
                JclSubmitStatus submitStatus;
                do {
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (InterruptedException ex) {}
                    submitStatus = jobStatusRetriever.getStatus();
                    isTimeout = (maxWaitTimeInMilliseconds != -1L && System.currentTimeMillis() - begin >= maxWaitTimeInMilliseconds);
                } while (!submitStatus.isCompleted() && !isTimeout);
                if (isTimeout) {
                    rc = 1;
                    JCLExec.logger.debug("Reaching timeout after " + maxWaitTimeInMilliseconds + " milliseconds");
                }
                int count = 0;
                do {
                    JCLExec.logger.debug("return code attempt:" + ++count);
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (InterruptedException ex2) {}
                    final JclJobStatus jobStatus = new JclJobStatusRetriever(this.job).traceEnabled(this.isSecurityTraceEnabled()).getStatus();
                    this.maxRC = jobStatus.getReturnCode();
                } while ((this.maxRC == null || this.maxRC.trim().isEmpty()) && (maxWaitTimeInMilliseconds == -1L || count * 1000 <= maxWaitTimeInMilliseconds));
                JCLExec.logger.debug("Max RC: " + this.maxRC);
            }
            catch (IOException e) {
                throw new BuildException(e);
            }
            finally {
                if (this.job != null) {
                    this.createBuildRecord(rc);
                }
            }
        }
        return rc;
    }
    
    private void createBuildRecord(final int rc) {
        final ExecuteRecord execRecord = new ExecuteRecord();
        execRecord.setCommand(Messages.getMessage("JCLExec_Label", this.job.getJobName()));
        execRecord.setFile((this.file != null) ? this.file.getAbsolutePath() : null);
        if (this.dataset != null && !this.dataset.isEmpty()) {
            execRecord.getDatasets().add(Utils.getFullyQualifiedDsn(this.dataset, this.member));
        }
        execRecord.setRc(rc);
        BuildReportFactory.getBuildReport().addRecord(execRecord);
    }
    
    protected void validateInputs() throws BuildException {
        if (this.dataset == null && this.file == null && this.text == null) {
            throw new ValidationException(Messages.getMessage("ValidationArgError_INVALID_NULL_PARAMETERS"));
        }
        if (this.dataset == null ^ this.file == null ^ this.text == null) {
            throw new ValidationException(Messages.getMessage("ValidationArgError_TOO_MANY_PARAMETERS"));
        }
        ValidationHelper.isNotNull(this.getConfDir(), Messages.getMessage("INVALID_NULL_PARAMETER", "confDir"));
    }
    
    public String getSubmittedJobId() {
        if (this.job == null) {
            return null;
        }
        return this.job.toString();
    }
    
    public String getSubmittedJobName() {
        if (this.job == null) {
            return null;
        }
        return this.job.getJobName();
    }
    
    protected BufferedReader readJCLContent() throws IOException {
        if (this.dataset != null) {
            return this.readJCLContentFromDataset();
        }
        if (this.file != null) {
            return this.readJCLContentFromFile();
        }
        return this.readJCLContentFromText();
    }
    
    private BufferedReader readJCLContentFromDataset() throws IOException {
        final String encoding = Utils.retrieveEncoding(this.jclEncoding);
        if (this.volser == null) {
            return FileFactory.newBufferedReader(Utils.getSlashSlashQuotedDsn(this.dataset, this.member), encoding);
        }
        return Utils.readUncatalogedDataset(Utils.getFullyQualifiedDsn(this.dataset, this.member), this.volser, encoding);
    }
    
    private BufferedReader readJCLContentFromFile() throws IOException {
        return FileFactory.newBufferedReader(this.file.getAbsolutePath(), (this.jclEncoding != null) ? this.jclEncoding : Utils.retrieveHFSEncoding(this.file));
    }
    
    private BufferedReader readJCLContentFromText() throws IOException {
        return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.text.getBytes(Utils.retrieveEncoding(this.jclEncoding)))));
    }
    
    protected JclJob submitJcl() throws IOException {
        final BufferedReader br = this.readJCLContent();
        final MvsJobSubmitter jobSubmitter = new MvsJobSubmitter();
        try {
            String line;
            while ((line = br.readLine()) != null) {
                if (this.job == null) {
                    final String[] words = line.split("\\s+");
                    if (words.length > 0) {
                        final String firstWord = words[0];
                        if (firstWord.startsWith("//")) {
                            this.job = new JclJob(firstWord.substring(2));
                        }
                    }
                }
                jobSubmitter.write(line);
            }
        }
        finally {
            if (br != null) {
                br.close();
            }
        }
        jobSubmitter.close();
        if (this.job != null) {
            this.job.setJobId(jobSubmitter.getJobid());
        }
        return this.job;
    }
    
    protected JclJob buildJcl() throws IOException {
        final BufferedReader br = this.readJCLContent();
        try {
            String line;
            while ((line = br.readLine()) != null) {
                if (this.job == null) {
                    final String[] words = line.split("\\s+");
                    if (words.length <= 0) {
                        continue;
                    }
                    final String firstWord = words[0];
                    if (!firstWord.startsWith("//")) {
                        continue;
                    }
                    this.job = new JclJob(firstWord.substring(2));
                }
            }
        }
        finally {
            if (br != null) {
                br.close();
            }
        }
        return this.job;
    }
    
    public String getDataset() {
        return this.dataset;
    }
    
    public void setDataset(final String dataset) {
        this.dataset = dataset;
    }
    
    public JCLExec dataset(final String dataset) {
        this.setDataset(dataset);
        return this;
    }
    
    public String getMember() {
        return this.member;
    }
    
    public void setMember(final String member) {
        this.member = member;
    }
    
    public JCLExec member(final String member) {
        this.setMember(member);
        return this;
    }
    
    public File getFile() {
        return this.file;
    }
    
    public void setFile(final File file) {
        this.file = file;
    }
    
    public JCLExec file(final File file) {
        this.setFile(file);
        return this;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(final String text) {
        this.text = text;
    }
    
    public JCLExec text(final String text) {
        this.setText(text);
        return this;
    }
    
    public String getJclEncoding() {
        return this.jclEncoding;
    }
    
    public void setJclEncoding(final String jclEncoding) {
        this.jclEncoding = jclEncoding;
    }
    
    public JCLExec jclEncoding(final String jclEncoding) {
        this.setJclEncoding(jclEncoding);
        return this;
    }
    
    public String getConfDir() {
        try {
            if (this.confDir == null) {
                this.setConfDir(EnvVars.getConf());
            }
        }
        catch (BuildException ex) {}
        return this.confDir;
    }
    
    public void setConfDir(final String confDir) {
        this.confDir = confDir;
    }
    
    public JCLExec confDir(final String confDir) {
        this.setConfDir(confDir);
        return this;
    }
    
    public String getMaxRC() {
        return this.maxRC;
    }
    
    public List<String> getAllDDNames() throws BuildException {
        return this.getAllDDNames(false);
    }
    
    public List<String> getAllDDNames(final boolean qualified) throws BuildException {
        if (this.job == null) {
            throw new NullPointerException("job");
        }
        return new JclJobDDNameRetriever(this.job).traceEnabled(this.isSecurityTraceEnabled()).getDDNames(qualified);
    }
    
    public void saveOutput(final File file) throws BuildException {
        this.saveOutput("*", file, null);
    }
    
    public void saveOutput(final File file, final String encoding) throws BuildException {
        this.saveOutput("*", file, encoding);
    }
    
    public void saveOutput(final String ddName, final File file) throws BuildException {
        this.saveOutput(ddName, file, null);
    }
    
    public void saveOutput(final String ddName, final File file, final String encoding) throws BuildException {
        this.saveOutput(ddName, file, encoding, false);
    }
    
    public void saveOutput(final String ddName, final File file, final boolean removeASA) throws BuildException {
        this.saveOutput(ddName, file, null, removeASA);
    }
    
    public void saveOutput(final String ddName, final File file, final String encoding, final boolean removeASA) throws BuildException {
        this.saveOutput(ddName, null, file, encoding, removeASA);
    }
    
    public void saveOutput(final String ddName, final String sourceEncoding, final File file, final String targetEncoding, final boolean removeASA) throws BuildException {
        JCLExec.logger.debug("Saving " + ddName + " (encoding=" + Utils.retrieveEncoding(sourceEncoding) + ") to " + file + " (encoding=" + Utils.retrieveEncoding(targetEncoding) + ").");
        final Set<String> messages = new JclJobOutputRetriever(this.job).traceEnabled(this.isSecurityTraceEnabled()).saveOutput(ddName, file, targetEncoding, sourceEncoding, removeASA);
        if (JCLExec.logger.isDebugEnabled() && messages.size() > 0) {
            final StringBuilder buffer = new StringBuilder();
            final Iterator<String> messageIterator = messages.iterator();
            while (messageIterator.hasNext()) {
                buffer.append(messageIterator.next());
                if (messageIterator.hasNext()) {
                    buffer.append('\n');
                }
            }
            JCLExec.logger.debug("Getting following messages when saving output of " + ddName + " to " + file.getAbsolutePath() + " : " + buffer.toString());
        }
    }
    
    private boolean isSecurityTraceEnabled() {
        return DBBConstants.SECURITY_TRACE;
    }
    
    public String getVolser() {
        return this.volser;
    }
    
    public void setVolser(final String volser) {
        this.volser = volser;
    }
    
    public JCLExec volser(final String volser) {
        this.setVolser(volser);
        return this;
    }
    
    static {
        JCLExec.logger = LoggerFactory.getLogger((Class)JCLExec.class);
    }
}
