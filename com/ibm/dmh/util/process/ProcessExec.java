// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util.process;

import java.io.Reader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.Writer;
import java.io.IOException;
import java.io.OutputStreamWriter;
import com.ibm.jjson.JsonMap;
import java.util.Iterator;
import com.ibm.dmh.util.StringUtils;
import java.util.List;
import java.util.Map;

public class ProcessExec
{
    private boolean isConsoleLogging;
    private boolean isFinished;
    private boolean isLogging;
    private Exception exception;
    private int returnCode;
    private int timeout;
    private long consoleLogLimit;
    private long logLimit;
    private Process p;
    private Map<String, String> envVars;
    private ProcessBuilder pb;
    private String input;
    private String submitPw;
    private StringBuffer log;
    private StringBuffer stderr;
    private StringBuffer stdout;
    
    public ProcessExec(final String... command) {
        this.init();
        this.pb = new ProcessBuilder(command);
    }
    
    public ProcessExec(final List<String> command) {
        this.init();
        this.pb = new ProcessBuilder(command);
    }
    
    public StringBuffer getStdOut() {
        return this.stdout;
    }
    
    public StringBuffer getStdErr() {
        return this.stderr;
    }
    
    public void appendEnvVar(String key, final String val, final String sep) {
        final Map<String, String> env = this.pb.environment();
        for (final String k : env.keySet()) {
            if (k.equalsIgnoreCase(key)) {
                key = k;
            }
        }
        final String s = StringUtils.getString(env.get(key), "");
        env.put(key, s + ((s.length() == 0 || s.endsWith(sep)) ? "" : sep) + val);
    }
    
    public Exception getException() {
        return this.exception;
    }
    
    public StringBuffer getLog() {
        return this.log;
    }
    
    public int getReturnCode() {
        return this.returnCode;
    }
    
    private void init() {
        this.consoleLogLimit = Long.MAX_VALUE;
        this.envVars = new JsonMap<String, String>();
        this.exception = null;
        this.input = null;
        this.isConsoleLogging = false;
        this.isFinished = false;
        this.isLogging = false;
        this.log = null;
        this.logLimit = Long.MAX_VALUE;
        this.p = null;
        this.pb = null;
        this.returnCode = 0;
        this.stderr = new StringBuffer();
        this.stdout = new StringBuffer();
        this.submitPw = null;
        this.timeout = 0;
    }
    
    private void log(final String msg) {
        if (this.isLogging) {
            this.log.append(msg + "\n");
        }
        if (this.isConsoleLogging) {
            System.out.println(msg);
        }
    }
    
    public int run() {
        this.returnCode = 0;
        try {
            if (this.isLogging) {
                this.log = new StringBuffer();
            }
            String cmdString = StringUtils.join(this.pb.command().iterator(), " ");
            if (this.submitPw != null) {
                cmdString = StringUtils.replace(cmdString, this.submitPw, "********");
            }
            this.log("Starting command:  " + cmdString);
            this.log("   From location:  " + ((this.pb.directory() == null) ? "not-specified" : this.pb.directory().getAbsolutePath()));
            this.log("    Timeout(sec):  " + this.timeout);
            this.log("        Env vars:  " + this.envVars.toString());
            this.p = this.pb.start();
            ProcessWatcher pw = null;
            if (this.timeout > 0) {
                pw = new ProcessWatcher();
                pw.start();
            }
            final StreamWatcher outWatcher = new StreamWatcher(1);
            outWatcher.start();
            final StreamWatcher errWatcher = new StreamWatcher(2);
            errWatcher.start();
            if (this.input != null) {
                Thread.sleep(1000L);
                final Writer w = new OutputStreamWriter(this.p.getOutputStream());
                w.write(this.input);
                w.flush();
                w.close();
            }
            this.p.waitFor();
            if (outWatcher.isAlive()) {
                outWatcher.join(10000L);
            }
            if (errWatcher.isAlive()) {
                errWatcher.join(10000L);
            }
            this.isFinished = true;
            if (this.isLogging) {
                this.log("---STDOUT---");
                this.log(this.stdout.toString());
                this.log("---STDERR---");
                this.log(this.stderr.toString());
            }
            this.log("");
            if (this.timeout < 0) {
                throw new IOException("Command timed out.");
            }
            this.returnCode = this.p.exitValue();
        }
        catch (IOException e) {
            this.exception = e;
            this.returnCode = 1;
        }
        catch (InterruptedException e2) {
            this.exception = e2;
            this.returnCode = 2;
        }
        this.log("Return code:  " + this.returnCode);
        if (this.exception != null) {
            this.log("Exception:  " + this.exception.getLocalizedMessage());
        }
        return this.returnCode;
    }
    
    public void setConsoleLogging(final boolean b) {
        this.setConsoleLogging(b, Long.MAX_VALUE);
    }
    
    public void setConsoleLogging(final boolean b, final long iConsoleLogLimit) {
        this.isConsoleLogging = b;
        this.consoleLogLimit = iConsoleLogLimit;
    }
    
    public void setEnvVar(final String key, final String value) {
        this.envVars.put(key, value);
        this.pb.environment().put(key, value);
    }
    
    public void setInput(final String iSetting) {
        this.input = iSetting;
    }
    
    public void setLocation(final String s) {
        this.pb.directory(new File(s));
    }
    
    public void setLogging(final boolean b) {
        this.setLogging(b, Long.MAX_VALUE);
    }
    
    public void setLogging(final boolean b, final long iLogLimit) {
        this.isLogging = b;
        this.logLimit = iLogLimit;
    }
    
    public void setSubmitPw(final String iSetting) {
        this.submitPw = iSetting;
    }
    
    public void setTimeout(final int iSetting) {
        this.timeout = iSetting;
    }
    
    public class ProcessWatcher extends Thread
    {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException ex) {}
                ProcessExec.this.timeout--;
                if (ProcessExec.this.isFinished) {
                    break;
                }
                if (ProcessExec.this.timeout < 0) {
                    System.err.println("Process watcher thread timed out!  Will destroy process.");
                    ProcessExec.this.p.destroy();
                    break;
                }
            }
        }
    }
    
    public class StreamWatcher extends Thread
    {
        private int type;
        private StringBuffer buffer;
        
        public StreamWatcher(final int iType) {
            this.buffer = ((iType == 1) ? ProcessExec.this.stdout : ProcessExec.this.stderr);
            this.type = iType;
        }
        
        @Override
        public void run() {
            final Reader r = new InputStreamReader((this.type == 1) ? ProcessExec.this.p.getInputStream() : ProcessExec.this.p.getErrorStream());
            try {
                int c;
                while ((c = r.read()) != -1) {
                    if (ProcessExec.this.timeout < 0) {
                        System.err.println("Stream watcher thread timed out!");
                        break;
                    }
                    if (ProcessExec.this.isLogging && ProcessExec.this.logLimit-- > 0L) {
                        this.buffer.append((char)c);
                    }
                    if (!ProcessExec.this.isConsoleLogging || ProcessExec.this.consoleLogLimit-- <= 0L) {
                        continue;
                    }
                    System.out.print((char)c);
                }
            }
            catch (Exception e) {
                final ByteArrayOutputStream baos = new ByteArrayOutputStream(10000);
                e.printStackTrace(new PrintStream(baos));
                this.buffer.append(baos.toString());
            }
            finally {
                try {
                    r.close();
                }
                catch (IOException ex) {}
            }
        }
    }
}
