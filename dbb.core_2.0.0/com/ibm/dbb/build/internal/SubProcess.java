// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import com.ibm.dbb.build.DDStatement;
import com.ibm.dbb.build.BuildException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.slf4j.Logger;

public class SubProcess extends AbstractDDProcess implements DDProcess
{
    public static final int SUCCESS = 0;
    private static Logger logger;
    private static final String COMMAND_BPXWDYN = "BPXWDYN";
    private static final String COMMAND_MVSEXEC = "MVSEXEC";
    private static final String COMMAND_STOP = "STOP";
    private static final String COMMAND_GETPID = "GETPID";
    private static final String COMMAND_INSTREAM = "INSTREAM";
    private static final String COMMAND_COPYDD = "COPYDD";
    private static final String COMMAND_GETDDNAMES = "GETDDNAMES";
    private static final String C_MODULE_NAME = "SubProcess";
    private static final String LIB_DIR = "lib";
    private Process process;
    private int pid;
    private PrintStream sendPipe;
    private InputStreamReader receivePipe;
    
    @Override
    public void dispose() {
    }
    
    public SubProcess() {
        this.pid = -1;
        try {
            final File subProcessExe = new File(Utils.getDBBSubDir("lib"), "SubProcess");
            if (!subProcessExe.exists()) {
                throw new FileNotFoundException(Messages.getMessage("ERROR_FILE_NOT_FOUND", subProcessExe.getPath()));
            }
            final List<String> commands = Arrays.asList(subProcessExe.getAbsolutePath());
            final ProcessBuilder processBuilder = new ProcessBuilder(commands);
            final Map<String, String> environment = processBuilder.environment();
            for (final Map.Entry<String, String> entry : System.getenv().entrySet()) {
                environment.put(entry.getKey(), entry.getValue());
            }
            this.process = processBuilder.start();
            this.pid = this.execute("GETPID").rc;
            final String subProcessTraceFile = System.getProperty("DBB_SUBPROCESS_TRACE");
            if (subProcessTraceFile != null) {
                SubProcess.logger.debug("Write trace to " + subProcessTraceFile);
                this.execute("DEBUG file://" + subProcessTraceFile);
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getPid() {
        return this.pid;
    }
    
    @Override
    public int executeMvsPgm(final String pgm, final String parm, final String ddNames, final boolean attachx) throws BuildException {
        final String parmStr = (parm == null) ? "" : parm;
        final String ddNameStr = (ddNames == null) ? "" : ddNames;
        return this.execute("MVSEXEC " + pgm + " \"" + parmStr + "\" \"" + ddNameStr + "\" " + attachx).rc;
    }
    
    @Override
    public int allocateDDForInstreamData(final DDStatement dd) throws BuildException {
        final String inStreamData = dd.getInstreamData();
        if (inStreamData == null) {
            return -1;
        }
        File tempFile = null;
        try {
            tempFile = File.createTempFile("InstreamData", null);
            final FileOutputStream fos = new FileOutputStream(tempFile);
            final int numBytes = this.saveInstreamDataToOutputStream(inStreamData, fos, 80);
            final int rc = this.execute("INSTREAM " + dd.getName() + " " + tempFile.getAbsolutePath()).rc;
            return (rc == 0) ? numBytes : rc;
        }
        catch (IOException e) {
            throw new BuildException(e);
        }
        finally {
            if (tempFile != null) {
                tempFile.delete();
            }
        }
    }
    
    public int bpxwdyn(final String command) throws BuildException {
        final int rc = this.execute("BPXWDYN " + command).rc;
        if (rc != 0) {
            throw new BuildException(Messages.getMessage("SubProcess_BPXWDYN_COMMAND_FAILED", command, Integer.toString(rc), Integer.toHexString(rc)));
        }
        return rc;
    }
    
    @Override
    public int copydd(final String ddName, final String ddEncoding, final String readOptions, final File destinationFile, final String fileEncoding, final boolean append, final boolean convertControlCharacters) throws BuildException {
        int rc = 0;
        final String appendString = append ? " -a " : " ";
        File tempFile = null;
        try {
            tempFile = File.createTempFile("TempFor_" + destinationFile.getName(), null);
            rc = this.execute("COPYDD" + appendString + ddName + " \"" + tempFile.getAbsolutePath() + "\"").rc;
            if (rc == 0) {
                InputStream inputStream;
                if (convertControlCharacters) {
                    final FileInputStream in;
                    inputStream = new EBCDICFilterInputStream(in);
                    in = new FileInputStream(tempFile);
                }
                else {
                    inputStream = new FileInputStream(tempFile);
                }
                final InputStream is = inputStream;
                Utils.saveContentToFile(is, destinationFile, ddEncoding, fileEncoding, append);
            }
        }
        catch (IOException e) {
            throw new BuildException(e);
        }
        finally {
            if (tempFile != null) {
                tempFile.delete();
            }
        }
        return rc;
    }
    
    public int stop() throws BuildException {
        return this.execute("STOP").rc;
    }
    
    private Response execute(final String command) throws BuildException {
        if (command == null) {
            throw new NullPointerException(Messages.getMessage("INVALID_NULL_PARAMETER", "command"));
        }
        if (this.process == null) {
            throw new NullPointerException(Messages.getMessage("INVALID_NULL_PARAMETER", "process"));
        }
        try {
            SubProcess.logger.debug("Send command to SubProcess(" + this.pid + "): " + command);
            if (this.sendPipe == null) {
                this.sendPipe = new PrintStream(this.process.getOutputStream());
            }
            this.sendPipe.println(command);
            this.sendPipe.flush();
            if (this.receivePipe == null) {
                this.receivePipe = new InputStreamReader(this.process.getInputStream());
            }
            final BufferedReader br = new BufferedReader(this.receivePipe);
            final String response = br.readLine();
            SubProcess.logger.debug("Response from SubProcess(" + this.pid + "): " + response);
            if (response == null) {
                throw new RuntimeException(Messages.getMessage("SubProcess_NULL_RESPONSE", command));
            }
            return new Response(response);
        }
        catch (IOException e) {
            throw new BuildException(e);
        }
    }
    
    @Override
    public List<String> getDDNames() throws BuildException {
        final Response response = this.execute("GETDDNAMES");
        final int numDDs = response.rc;
        final String ddNameStr = response.message;
        if (numDDs <= 0) {
            return (List<String>)Collections.EMPTY_LIST;
        }
        final List<String> ddNames = new ArrayList<String>(numDDs);
        final String[] split;
        final String[] segments = split = ddNameStr.split(",");
        for (final String segment : split) {
            ddNames.add(segment);
        }
        return ddNames;
    }
    
    @Override
    public final boolean supportMultiThread() {
        return true;
    }
    
    static {
        SubProcess.logger = LoggerFactory.getLogger((Class)SubProcess.class);
    }
    
    class Response
    {
        int rc;
        String message;
        
        public Response(final String respondStr) {
            final String[] segments = respondStr.split(":");
            if (segments.length == 1) {
                this.rc = Utils.parseInt(segments[0], -1);
            }
            else if (segments.length == 2) {
                this.rc = Utils.parseInt(segments[0], -1);
                this.message = segments[1];
            }
            else {
                this.rc = -1;
            }
        }
    }
}
