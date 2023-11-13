// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import com.ibm.dbb.EnvVars;
import java.util.List;
import com.ibm.dbb.build.internal.BpxwdynCommandGenerator;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
import com.ibm.dbb.build.report.records.ExecuteRecord;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.internal.Utils;
import com.ibm.dbb.build.internal.ValidationHelper;
import com.ibm.dbb.build.internal.Messages;
import org.slf4j.LoggerFactory;
import java.nio.charset.StandardCharsets;
import com.ibm.dbb.build.internal.GatewayXmlUtility;
import java.io.File;

public abstract class AbstractCommandExec extends AbstractExec
{
    protected String shExec;
    protected String command;
    protected String options;
    protected String confDir;
    protected File logFile;
    protected Boolean reuseIspfSession;
    protected boolean keepCommandScript;
    protected String logEncoding;
    protected String output;
    protected boolean waitingForResponse;
    protected String response;
    protected String procedureName;
    protected String accountNumber;
    protected String groupId;
    protected String regionSize;
    protected String gatewayType;
    protected Integer logLevel;
    protected GatewayXmlUtility gatewayXmlUtility;
    protected String sessionId;
    protected boolean lastExecuteWasResponse;
    protected StringBuilder logOutput;
    public static final String DEFAULT_SH_EXEC = "/bin/sh";
    protected static final String ISPFINPUT_FILE_NAME = "ispfinput";
    protected static final String ISPFINPUT_FILE_EXTENSION = ".xml";
    protected static final String DD_CMDSCP = "CMDSCP";
    protected static final String RUN_ISPF_SHELL = "runIspf.sh";
    public static final String ISPF_RETURN_CODE = "ISPF_RETURN_CODE";
    public static final String INTERACTIVE_GATEWAY = "interactive";
    public static final String LEGACY_GATEWAY = "legacy";
    private static final int MAX_CHARS = 255;
    private static final String ALLOCATE_COMMAND = "ALLOCATE";
    public static final String FREE_COMMAND = "FREE";
    public static final String DDNAME_KEYWORD = "DDNAME";
    public static final String DSNAME_KEYWORD = "DSNAME";
    public static final String PATH_KEYWORD = "PATH";
    public static final char SPACE = ' ';
    public static final char OPEN_PAREN = '(';
    public static final char CLOSED_PAREN = ')';
    public static final char SINGLE_QUOTE = '\'';
    private static final String PROPERTY_GATEWAY_TYPE = "dbb.gateway.type";
    private static final String PROPERTY_REUSE_ISPF_SESSION = "dbb.gateway.reuseIspfSession";
    private static final String PROPERTY_PROCEDURE_NAME = "dbb.gateway.procedureName";
    private static final String PROPERTY_ACCOUNT_NUMBER = "dbb.gateway.accountNumber";
    private static final String PROPERTY_GROUP_ID = "dbb.gateway.groupId";
    private static final String PROPERTY_REGION_SIZE = "dbb.gateway.regionSize";
    private static final String PROPERTY_LOG_LEVEL = "dbb.gateway.logLevel";
    private static int INSTREAM_CHAR_LIMIT;
    
    public AbstractCommandExec() {
        this.logEncoding = StandardCharsets.UTF_8.name();
        AbstractCommandExec.logger = LoggerFactory.getLogger((Class)AbstractCommandExec.class);
    }
    
    @Override
    protected void validateInputs() {
        super.validateInputs();
        ValidationHelper.isNotNull(this.getConfDir(), Messages.getMessage("INVALID_NULL_PARAMETER", "confDir"));
        ValidationHelper.fileExists(new File(this.getConfDir() + "runIspf.sh"), Messages.getMessage("ValidationArgError_ISPF_SH_DOES_NOT_EXIST", new File(this.getConfDir() + "runIspf.sh").getAbsolutePath()));
        if (this.getGatewayType().equals("legacy")) {
            ValidationHelper.isNotNull(this.command, Messages.getMessage("INVALID_NULL_PARAMETER", "command"));
            ValidationHelper.isDDDefined(this.ddStatements, "CMDSCP", Messages.getMessage("ValidationArgError_DD_CMDSCP_NOT_DEFINED"));
        }
        else if (this.waitingForResponse) {
            ValidationHelper.isNotNull(this.response, Messages.getMessage("INVALID_NULL_PARAMETER", "response"));
        }
        else {
            ValidationHelper.isNotNull(this.getProcedureName(), Messages.getMessage("INVALID_NULL_PARAMETER", "procedureName"));
            ValidationHelper.isNotNull(this.getAccountNumber(), Messages.getMessage("INVALID_NULL_PARAMETER", "accountNumber"));
            ValidationHelper.isNotNull(this.getGroupId(), Messages.getMessage("INVALID_NULL_PARAMETER", "groupId"));
            ValidationHelper.isNotNull(this.getRegionSize(), Messages.getMessage("INVALID_NULL_PARAMETER", "regionSize"));
            ValidationHelper.isNotNull(this.command, Messages.getMessage("INVALID_NULL_PARAMETER", "command"));
        }
    }
    
    @Override
    protected int doExecute() throws BuildException {
        this.gatewayXmlUtility = new GatewayXmlUtility(this.getGatewayType(), this.getService(), this.isReuseIspfSession(), this.getLogLevel());
        int rc = 0;
        if (Utils.isBuildReportOnly()) {
            this.lastExecuteWasResponse = false;
            this.createBuildRecord(rc);
        }
        else {
            try {
                if (this.getGatewayType().equals("legacy")) {
                    rc = this.doLegacyExecute();
                }
                else {
                    rc = this.doInteractiveExecute();
                }
            }
            finally {
                this.createBuildRecord(rc);
            }
        }
        return rc;
    }
    
    private void createBuildRecord(final int rc) {
        final ExecuteRecord execRecord = this.createReportRecord();
        if (this.lastExecuteWasResponse) {
            execRecord.setCommand("RESPONSE '" + this.response + "'");
        }
        else {
            execRecord.setCommand(this.command);
            execRecord.setOptions(this.options);
        }
        execRecord.setRc(rc);
        if (this.logFile != null) {
            execRecord.addLogFile(this.logFile);
        }
        BuildReportFactory.getBuildReport().addRecord(execRecord);
    }
    
    protected int doLegacyExecute() throws BuildException {
        AbstractCommandExec.logger.debug("Connecting to legacy gateway.");
        int rc = 0;
        this.lastExecuteWasResponse = false;
        if (this.logFile != null) {
            this.logOutput = new StringBuilder();
        }
        final String cmdscpPds = this.generateCommandScript();
        AbstractCommandExec.logger.debug("Command script PDS: " + cmdscpPds);
        try {
            AbstractCommandExec.logger.debug("Sending command to legacy gateway");
            rc = this.callGateway(this.gatewayXmlUtility.createCommandXML("EXEC '" + cmdscpPds + "'", this.getService(), null));
        }
        finally {
            if (this.logFile != null) {
                AbstractCommandExec.logger.debug("Log file: " + this.logFile.getAbsolutePath());
                Utils.createFile(this.logFile, this.logOutput.toString(), this.logEncoding);
            }
            if (!this.keepCommandScript) {
                Utils.deleteDataset(cmdscpPds);
            }
        }
        return rc;
    }
    
    protected int doInteractiveExecute() throws BuildException {
        int rc = 0;
        int startrc = 0;
        int endrc = 0;
        try {
            if (this.waitingForResponse) {
                this.lastExecuteWasResponse = true;
                AbstractCommandExec.logger.debug("Sending response to interactive gateway");
                rc = this.callGateway(this.gatewayXmlUtility.createResponseXML(this.response, this.sessionId));
            }
            else {
                this.lastExecuteWasResponse = false;
                if (this.logFile != null) {
                    this.logOutput = new StringBuilder();
                }
                this.sessionId = null;
                AbstractCommandExec.logger.debug("Starting interactive gateway session.");
                startrc = this.callGateway(this.gatewayXmlUtility.createStartSessionXML(this.getProcedureName(), this.getAccountNumber(), this.getGroupId(), this.getRegionSize()));
                if (startrc > 0) {
                    throw new BuildException("Failed to start CEA Session rc=" + startrc);
                }
                AbstractCommandExec.logger.debug("Allocating DD Statements");
                for (final DDStatement dd : this.ddStatements) {
                    if (dd.getName().equals("CMDSCP")) {
                        continue;
                    }
                    final String tsoAlloc = this.generateTSOAllocCommand(dd);
                    startrc = this.callGateway(this.gatewayXmlUtility.createCommandXML(tsoAlloc, null, this.sessionId));
                    if (startrc > 0) {
                        throw new BuildException("Failure in allocating dd(" + dd.getName() + ") rc=" + startrc);
                    }
                }
                AbstractCommandExec.logger.debug("Sending command to interactive gateway");
                rc = this.callGateway(this.gatewayXmlUtility.createCommandXML(this.command, this.options, this.sessionId));
            }
        }
        catch (BuildException be) {
            AbstractCommandExec.logger.debug("Freeing DD Statements");
            for (final DDStatement dd2 : this.ddStatements) {
                if (dd2.getName().equals("CMDSCP")) {
                    continue;
                }
                final String tsoFree = "FREE DDNAME(" + dd2.getName().trim() + ")";
                endrc = this.callGateway(this.gatewayXmlUtility.createCommandXML(tsoFree, null, this.sessionId));
                if (endrc > 0) {
                    throw new BuildException("Failure in freeing dd(" + dd2.getName() + ") rc=" + endrc);
                }
            }
            throw be;
        }
        finally {
            if (this.logFile != null) {
                AbstractCommandExec.logger.debug("Log file: " + this.logFile.getAbsolutePath());
                Utils.createFile(this.logFile, this.logOutput.toString(), this.logEncoding);
            }
        }
        if (!this.waitingForResponse) {
            AbstractCommandExec.logger.debug("Freeing DD Statements");
            for (final DDStatement dd : this.ddStatements) {
                if (dd.getName().equals("CMDSCP")) {
                    continue;
                }
                final String tsoFree2 = "FREE DDNAME(" + dd.getName().trim() + ")";
                endrc = this.callGateway(this.gatewayXmlUtility.createCommandXML(tsoFree2, null, this.sessionId));
                if (endrc > 0) {
                    throw new BuildException("Failure in freeing dd(" + dd.getName() + ") rc=" + endrc);
                }
            }
            AbstractCommandExec.logger.debug("Ending interactive gateway session");
            endrc = this.callGateway(this.gatewayXmlUtility.createStopSessionXML(this.sessionId));
            if (endrc > 0) {
                throw new BuildException("Failure stopping session rc=" + endrc);
            }
            if (this.logFile != null) {
                AbstractCommandExec.logger.debug("Log file: " + this.logFile.getAbsolutePath());
                Utils.createFile(this.logFile, this.logOutput.toString(), this.logEncoding);
            }
        }
        return rc;
    }
    
    protected int cancel() throws BuildException {
        AbstractCommandExec.logger.debug("Cancelling gateway session");
        int rc = 0;
        try {
            if (this.sessionId != null) {
                rc = this.callGateway(this.gatewayXmlUtility.createCancelXML(this.sessionId));
            }
            this.output = null;
            this.waitingForResponse = false;
            this.sessionId = null;
            this.lastExecuteWasResponse = false;
            return rc;
        }
        finally {
            if (this.logFile != null) {
                AbstractCommandExec.logger.debug("Log file: " + this.logFile.getAbsolutePath());
                Utils.createFile(this.logFile, this.logOutput.toString(), this.logEncoding);
            }
        }
    }
    
    protected int callGateway(final String requestXML) throws BuildException {
        final String sh = (this.shExec == null) ? "/bin/sh" : this.shExec;
        int rc = 0;
        File ispfInputFile = null;
        AbstractCommandExec.logger.debug("Input sent to ISPZXML:\n" + requestXML);
        try {
            ispfInputFile = File.createTempFile("ispfinput", ".xml");
            Utils.createFile(ispfInputFile, requestXML, "ibm1047");
            final ProcessBuilder processBuilder = new ProcessBuilder(new String[] { sh, this.getConfDir() + "runIspf.sh", ispfInputFile.getCanonicalPath() });
            AbstractCommandExec.logger.debug("Executing '" + sh + " " + this.getConfDir() + "runIspf.sh" + " < " + ispfInputFile.getCanonicalPath());
            final Process process = processBuilder.start();
            final ProcessOutputHandler outputHandler = new ProcessOutputHandler(process.getInputStream());
            outputHandler.start();
            rc = process.waitFor();
            AbstractCommandExec.logger.debug("shell command rc=" + rc);
            final String gatewayOutput = outputHandler.getOutputBuffer().toString();
            AbstractCommandExec.logger.debug("Gateway output: \n" + gatewayOutput);
            if (this.logFile != null) {
                this.logOutput.append(gatewayOutput + "\n");
            }
            if (rc == 0) {
                this.gatewayXmlUtility.parse(gatewayOutput);
                rc = this.gatewayXmlUtility.getReturnCode();
                this.waitingForResponse = this.gatewayXmlUtility.isPrompt();
                this.sessionId = ((this.gatewayXmlUtility.getSessionId() != null) ? this.gatewayXmlUtility.getSessionId() : this.sessionId);
                this.output = ((this.gatewayXmlUtility.getOutput() != null && !this.gatewayXmlUtility.getOutput().trim().isEmpty()) ? this.gatewayXmlUtility.getOutput() : this.output);
                AbstractCommandExec.logger.debug("Gateway output values:");
                AbstractCommandExec.logger.debug("rc=" + rc);
                AbstractCommandExec.logger.debug("waitingForResponse=" + this.waitingForResponse);
                AbstractCommandExec.logger.debug("sessionId=" + this.sessionId);
                AbstractCommandExec.logger.debug("output:\n" + this.output);
            }
            else {
                this.output = null;
                this.waitingForResponse = false;
                this.sessionId = null;
            }
        }
        catch (IOException ex) {}
        catch (InterruptedException e) {
            throw new BuildException(e);
        }
        finally {
            if (ispfInputFile != null && ispfInputFile.exists()) {
                ispfInputFile.delete();
            }
        }
        return rc;
    }
    
    protected String generateTSOAllocCommand(final DDStatement dd) {
        final StringBuilder buffer = new StringBuilder("ALLOCATE");
        if (dd.getName() != null && !dd.getName().isEmpty()) {
            buffer.append(' ').append("DDNAME").append('(').append(dd.getName().trim()).append(')');
        }
        if (dd.getDsn() != null && !dd.getDsn().isEmpty()) {
            buffer.append(' ').append("DSNAME").append('(').append(dd.getDsn().trim());
            for (final DDStatement concat : dd.getConcatenations()) {
                buffer.append(' ').append(concat.getDsn().trim());
            }
            buffer.append(')');
        }
        if (dd.getPath() != null && !dd.getPath().isEmpty()) {
            buffer.append(' ').append("PATH").append('(').append('\'').append(dd.getPath().trim()).append('\'').append(')');
        }
        if (dd.getOptions() != null && !dd.getOptions().isEmpty()) {
            buffer.append(' ').append(dd.getOptions());
        }
        else if (dd.getInstreamData() != null) {}
        return buffer.toString();
    }
    
    protected String generateCommandScript() throws BuildException {
        final DDStatement cmdscpDD = Utils.findDD(this.ddStatements, "CMDSCP");
        final List<String> contents = new ArrayList<String>(2 + this.ddStatements.size() * 5 + 3 + this.ddStatements.size() + 1);
        addLine(contents, "/* REXX */");
        addLine(contents, "Signal on failure");
        for (final DDStatement dd : this.ddStatements) {
            if (dd.getName().equals("CMDSCP")) {
                continue;
            }
            this.generateAllocCommand(contents, dd);
            if (dd.getConcatenations().size() <= 0) {
                continue;
            }
            final List<String> ddNames = new ArrayList<String>(dd.getConcatenations().size() + 1);
            ddNames.add(dd.getName());
            for (final DDStatement concatDD : dd.getConcatenations()) {
                this.generateAllocCommand(contents, concatDD);
                ddNames.add(concatDD.getName());
            }
            this.generateConcatCommand(contents, ddNames);
        }
        String tempCommand = this.command;
        if (this.options != null && !this.options.isEmpty()) {
            tempCommand = tempCommand + " " + this.options;
        }
        addLine(contents, "\"" + tempCommand + "\"");
        addLine(contents, "FAILURE:");
        addLine(contents, "Say \"ISPF_RETURN_CODE =\" rc");
        for (final DDStatement dd2 : this.ddStatements) {
            if (dd2.getName().equals("CMDSCP")) {
                continue;
            }
            addLine(contents, "rc = BPXWDYN(\"" + BpxwdynCommandGenerator.generateFreeCommand(dd2.getName(), null) + "\")");
            if (dd2.getConcatenations().size() <= 0) {
                continue;
            }
            for (final DDStatement concatDD : dd2.getConcatenations()) {
                addLine(contents, "rc = BPXWDYN(\"" + BpxwdynCommandGenerator.generateFreeCommand(concatDD.getName(), null) + "\")");
            }
        }
        addLine(contents, "Return rc");
        AbstractCommandExec.logger.debug("REXX script contents: " + contents);
        Utils.storeToPDS(cmdscpDD.getDsn(), contents);
        return cmdscpDD.getDsn();
    }
    
    private void generateConcatCommand(final List<String> contents, final List<String> ddNames) {
        addLine(contents, "rc = BPXWDYN(\"" + BpxwdynCommandGenerator.generateConcatCommand(ddNames, null) + "\")");
        addLine(contents, "If rc /= 0 Then");
        addLine(contents, "Do");
        addLine(contents, "  Say 'failure in concatenating dds(" + ddNames + ") reason ' rc");
        addLine(contents, "End");
    }
    
    private void generateAllocCommand(final List<String> contents, final DDStatement dd) {
        final String bpxwdynAlloc = BpxwdynCommandGenerator.generateAllocCommand(dd, null);
        addLine(contents, "rc = BPXWDYN(\"" + bpxwdynAlloc + "\")");
        if (dd.getInstreamData() != null) {
            final String[] instreamData = dd.getInstreamData().split("\n");
            addLine(contents, dd.getName() + ".0 = " + instreamData.length);
            for (int i = 0; i < instreamData.length; ++i) {
                if (instreamData[i].length() > AbstractCommandExec.INSTREAM_CHAR_LIMIT) {
                    throw new IllegalArgumentException(Messages.getMessage("InstreamData_EXCEEDS_MAX_LENGTH", AbstractCommandExec.INSTREAM_CHAR_LIMIT));
                }
                addLine(contents, dd.getName() + "." + (i + 1) + " = '" + instreamData[i].replace("'", "''") + "'");
            }
            addLine(contents, "\"EXECIO * DISKW " + dd.getName() + " (STEM " + dd.getName() + ". FINIS)\"");
        }
        addLine(contents, "If rc /= 0 Then");
        addLine(contents, "Do");
        addLine(contents, "  Say 'failure in allocating dd(" + dd.getName() + ") reason ' rc");
        addLine(contents, "End");
    }
    
    private static void addLine(final List<String> list, final String line) {
        if (line != null) {
            if (line.length() > 255) {
                final List<String> lines = splitLine(line);
                for (final String aline : lines) {
                    list.add(aline);
                }
            }
            else {
                list.add(line);
            }
        }
    }
    
    private static List<String> splitLine(final String line) {
        final List<String> l = new ArrayList<String>();
        return splitLine(l, line);
    }
    
    private static List<String> splitLine(final List<String> l, final String line) {
        if (line == null) {
            return l;
        }
        if (line.length() < 255) {
            l.add(line);
            return l;
        }
        final StringBuffer sb = new StringBuffer(line);
        boolean inString = false;
        char quote = ' ';
        final int length = line.length();
        int counter = 0;
        for (int i = 0; i < length; ++i) {
            final char c = sb.charAt(i);
            if (++counter >= 255) {
                String s = sb.substring(0, i);
                String s2 = sb.substring(i);
                if (inString) {
                    if (c == quote) {
                        s = s + quote + "||,";
                        s2 = s2.substring(1);
                    }
                    else {
                        s = s + quote + "||,";
                        s2 = quote + s2;
                    }
                }
                else {
                    s += "||,";
                }
                l.add(s);
                return splitLine(l, s2);
            }
            if (c == '\"' || c == '\'') {
                inString = ((!inString || (inString && quote == c)) ? (!inString) : inString);
                quote = (inString ? ((quote == ' ') ? c : quote) : ' ');
            }
        }
        return l;
    }
    
    public String getShExec() {
        return this.shExec;
    }
    
    public void setShExec(final String shExec) {
        this.shExec = shExec;
    }
    
    public String getCommand() {
        return this.command;
    }
    
    public void setCommand(final String command) {
        this.command = command;
    }
    
    public String getOptions() {
        return this.options;
    }
    
    public void setOptions(final String options) {
        this.options = options;
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
        if (confDir != null && !confDir.endsWith("/")) {
            this.confDir = confDir + '/';
        }
        else {
            this.confDir = confDir;
        }
    }
    
    public File getLogFile() {
        return this.logFile;
    }
    
    public void setLogFile(final File logFile) {
        this.logFile = logFile;
    }
    
    public String getLogEncoding() {
        return this.logEncoding;
    }
    
    public void setLogEncoding(final String logEncoding) {
        this.logEncoding = logEncoding;
    }
    
    public void setResponse(final String response) {
        this.response = response;
    }
    
    public void setGatewayType(final String gatewayType) {
        this.gatewayType = gatewayType;
    }
    
    public void setProcedureName(final String procedureName) {
        this.procedureName = procedureName;
    }
    
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setGroupId(final String groupId) {
        this.groupId = groupId;
    }
    
    public void setRegionSize(final String regionSize) {
        this.regionSize = regionSize;
    }
    
    public void setLogLevel(final int logLevel) {
        this.logLevel = logLevel;
    }
    
    public String getGatewayType() {
        if (this.gatewayType == null) {
            this.gatewayType = BuildProperties.getProperty("dbb.gateway.type");
        }
        if (this.gatewayType == null) {
            this.gatewayType = "legacy";
        }
        return this.gatewayType;
    }
    
    public String getProcedureName() {
        if (this.procedureName == null) {
            this.procedureName = BuildProperties.getProperty("dbb.gateway.procedureName");
        }
        return this.procedureName;
    }
    
    public String getAccountNumber() {
        if (this.accountNumber == null) {
            this.accountNumber = BuildProperties.getProperty("dbb.gateway.accountNumber");
        }
        return this.accountNumber;
    }
    
    public String getGroupId() {
        if (this.groupId == null) {
            this.groupId = BuildProperties.getProperty("dbb.gateway.groupId");
        }
        return this.groupId;
    }
    
    public String getRegionSize() {
        if (this.regionSize == null) {
            this.regionSize = BuildProperties.getProperty("dbb.gateway.regionSize");
        }
        return this.regionSize;
    }
    
    public int getLogLevel() {
        if (this.logLevel == null) {
            final String ll = BuildProperties.getProperty("dbb.gateway.logLevel");
            if (ll != null && !ll.trim().isEmpty()) {
                try {
                    this.logLevel = Integer.valueOf(ll);
                }
                catch (NumberFormatException exception) {
                    this.logLevel = 2;
                }
            }
            else {
                this.logLevel = 2;
            }
        }
        return this.logLevel;
    }
    
    public String getOutput() {
        return this.output;
    }
    
    public boolean isWaitingForResponse() {
        return this.waitingForResponse;
    }
    
    public boolean isReuseIspfSession() {
        if (this.reuseIspfSession == null) {
            final String prop = BuildProperties.getProperty("dbb.gateway.reuseIspfSession");
            if (prop != null) {
                this.reuseIspfSession = Boolean.valueOf(prop);
            }
            else {
                this.reuseIspfSession = Boolean.FALSE;
            }
        }
        return this.reuseIspfSession;
    }
    
    public void setReuseIspfSession(final boolean reuseIspfSession) {
        this.reuseIspfSession = reuseIspfSession;
    }
    
    public void setKeepCommandScript(final boolean keepCommandScript) {
        this.keepCommandScript = keepCommandScript;
    }
    
    public boolean isKeepCommandScript() {
        return this.keepCommandScript;
    }
    
    protected abstract String getService();
    
    static {
        AbstractCommandExec.INSTREAM_CHAR_LIMIT = 80;
    }
    
    private static class ProcessOutputHandler extends Thread
    {
        private InputStream is;
        private StringBuilder buffer;
        
        public ProcessOutputHandler(final InputStream is) {
            this.buffer = new StringBuilder();
            this.is = is;
        }
        
        @Override
        public void run() {
            try {
                final BufferedReader br = new BufferedReader(new InputStreamReader(this.is));
                String line;
                while ((line = br.readLine()) != null) {
                    this.buffer.append(line);
                    this.buffer.append(DBBConstants.DEFAULT_NEWLINE);
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        
        public StringBuilder getOutputBuffer() {
            return this.buffer;
        }
    }
}
