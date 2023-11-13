// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr;

import java.util.LinkedList;
import java.util.List;

public class ConfigRuntimeException extends RuntimeException
{
    private static final long serialVersionUID = 1L;
    String msg;
    List<String> errorList;
    
    public ConfigRuntimeException(final String msg) {
        super(msg);
        this.msg = null;
        this.errorList = null;
        this.msg = msg;
    }
    
    public ConfigRuntimeException(final String msg, final Throwable causedBy) {
        super(msg, causedBy);
        this.msg = null;
        this.errorList = null;
        this.msg = msg;
    }
    
    public ConfigRuntimeException(final String msg, final List<String> errorList) {
        this.msg = null;
        this.errorList = null;
        this.errorList = errorList;
        final StringBuffer sb = new StringBuffer(msg + "\n");
        for (int i = 0; i < errorList.size(); ++i) {
            sb.append("   [" + (i + 1) + "] - " + errorList.get(i) + "\n");
        }
        this.msg = sb.toString();
    }
    
    @Override
    public String getMessage() {
        return "ConfigRuntimeException: " + this.msg;
    }
    
    @Override
    public String getLocalizedMessage() {
        return this.getMessage();
    }
    
    public List<String> getErrors() {
        return (this.errorList == null) ? new LinkedList<String>() : this.errorList;
    }
}
