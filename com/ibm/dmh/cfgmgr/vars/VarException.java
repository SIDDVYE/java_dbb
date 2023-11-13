// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import com.ibm.dmh.util.StringUtils;

public class VarException extends Exception
{
    private static final long serialVersionUID = 1L;
    String varName;
    String[] varArgs;
    String message;
    
    public VarException(final String varName, final String[] varArgs, final String message) {
        this.varName = varName;
        this.varArgs = varArgs;
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return "VarException(var=$" + this.varName + "{" + StringUtils.join(this.varArgs, ",") + "}) - " + this.message;
    }
    
    @Override
    public String toString() {
        return this.getMessage();
    }
}
