// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

public class JclSubmitStatus
{
    private static final String STATUS_MSG_WAITING = "waiting";
    private static final String STATUS_MSG_EXECUTING = "executing";
    private JclJob job;
    private STATUS status;
    
    public JclSubmitStatus(final JclJob job) {
        this.job = job;
    }
    
    public void parse(final String statusMsg) {
        if (statusMsg == null) {
            this.status = STATUS.NA;
        }
        final String statusMsgTemp = statusMsg.toLowerCase();
        if (statusMsgTemp.startsWith("waiting")) {
            this.status = STATUS.WAITING;
        }
        else if (statusMsgTemp.startsWith("executing")) {
            this.status = STATUS.EXECUTING;
        }
        else {
            this.status = STATUS.ON_OUTPUT_QUEUE;
        }
    }
    
    public JclJob getJob() {
        return this.job;
    }
    
    public STATUS getStatus() {
        return this.status;
    }
    
    public void setStatus(final STATUS status) {
        this.status = status;
    }
    
    public boolean isCompleted() {
        return this.status != STATUS.WAITING && this.status != STATUS.EXECUTING;
    }
    
    private enum STATUS
    {
        NA, 
        WAITING, 
        EXECUTING, 
        ON_OUTPUT_QUEUE;
    }
}
