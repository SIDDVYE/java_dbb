// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

public class JclJobStatus
{
    private JclJob job;
    private String returnCode;
    
    public JclJobStatus(final JclJob job) {
        this.job = job;
    }
    
    public JclJob getJob() {
        return this.job;
    }
    
    public String getReturnCode() {
        return this.returnCode;
    }
    
    public void setReturnCode(final String returnCode) {
        this.returnCode = returnCode;
    }
}
