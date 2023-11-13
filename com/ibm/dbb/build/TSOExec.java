// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.io.File;

public class TSOExec extends AbstractCommandExec
{
    private static final String SERVICE_TSO = "TSO";
    
    @Override
    protected final String getService() {
        return "TSO";
    }
    
    public TSOExec shExec(final String shExec) {
        this.setShExec(shExec);
        return this;
    }
    
    public TSOExec command(final String command) {
        this.setCommand(command);
        return this;
    }
    
    public TSOExec options(final String options) {
        this.setOptions(options);
        return this;
    }
    
    public TSOExec confDir(final String confDir) {
        this.setConfDir(confDir);
        return this;
    }
    
    public TSOExec logFile(final File logFile) {
        this.setLogFile(logFile);
        return this;
    }
    
    public TSOExec reuseIspfSession(final boolean reuseIspfSession) {
        this.setReuseIspfSession(reuseIspfSession);
        return this;
    }
    
    public TSOExec keepCommandScript(final boolean keepCommandScript) {
        this.setKeepCommandScript(keepCommandScript);
        return this;
    }
    
    public TSOExec file(final String file) {
        this.setFile(file);
        return this;
    }
    
    public TSOExec logEncoding(final String logEncoding) {
        this.setLogEncoding(logEncoding);
        return this;
    }
    
    public TSOExec response(final String response) {
        this.setResponse(response);
        return this;
    }
    
    public TSOExec gatewayType(final String gatewayType) {
        this.setGatewayType(gatewayType);
        return this;
    }
    
    public TSOExec procedureName(final String procedureName) {
        this.setProcedureName(procedureName);
        return this;
    }
    
    public TSOExec accountNumber(final String accountNumber) {
        this.setAccountNumber(accountNumber);
        return this;
    }
    
    public TSOExec groupId(final String groupId) {
        this.setGroupId(groupId);
        return this;
    }
    
    public TSOExec regionSize(final String regionSize) {
        this.setRegionSize(regionSize);
        return this;
    }
    
    public TSOExec logLevel(final int logLevel) {
        this.setLogLevel(logLevel);
        return this;
    }
}
