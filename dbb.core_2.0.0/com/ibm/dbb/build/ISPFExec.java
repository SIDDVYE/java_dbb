// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.io.File;

public class ISPFExec extends AbstractCommandExec
{
    private static final String SERVICE_ISPF = "ISPF";
    
    @Override
    protected final String getService() {
        return "ISPF";
    }
    
    public ISPFExec shExec(final String shExec) {
        this.setShExec(shExec);
        return this;
    }
    
    public ISPFExec command(final String command) {
        this.setCommand(command);
        return this;
    }
    
    public ISPFExec options(final String options) {
        this.setOptions(options);
        return this;
    }
    
    public ISPFExec confDir(final String confDir) {
        this.setConfDir(confDir);
        return this;
    }
    
    public ISPFExec logFile(final File logFile) {
        this.setLogFile(logFile);
        return this;
    }
    
    public ISPFExec reuseIspfSession(final boolean reuseIspfSession) {
        this.setReuseIspfSession(reuseIspfSession);
        return this;
    }
    
    public ISPFExec keepCommandScript(final boolean keepCommandScript) {
        this.setKeepCommandScript(keepCommandScript);
        return this;
    }
    
    public ISPFExec file(final String file) {
        this.setFile(file);
        return this;
    }
    
    public ISPFExec logEncoding(final String logEncoding) {
        this.setLogEncoding(logEncoding);
        return this;
    }
    
    public ISPFExec response(final String response) {
        this.setResponse(response);
        return this;
    }
    
    public ISPFExec gatewayType(final String gatewayType) {
        this.setGatewayType(gatewayType);
        return this;
    }
    
    public ISPFExec procedureName(final String procedureName) {
        this.setProcedureName(procedureName);
        return this;
    }
    
    public ISPFExec accountNumber(final String accountNumber) {
        this.setAccountNumber(accountNumber);
        return this;
    }
    
    public ISPFExec groupId(final String groupId) {
        this.setGroupId(groupId);
        return this;
    }
    
    public ISPFExec regionSize(final String regionSize) {
        this.setRegionSize(regionSize);
        return this;
    }
    
    public ISPFExec logLevel(final int logLevel) {
        this.setLogLevel(logLevel);
        return this;
    }
}
