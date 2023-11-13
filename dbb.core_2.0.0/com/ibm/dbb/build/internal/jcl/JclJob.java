// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

public class JclJob
{
    private String jobName;
    private String jobId;
    
    public JclJob(final String jobName) {
        this.jobName = jobName;
    }
    
    public JclJob(final String jobName, final String jobId) {
        this.jobName = jobName;
        this.jobId = jobId;
    }
    
    public String getJobName() {
        return this.jobName;
    }
    
    public String getJobId() {
        return this.jobId;
    }
    
    public void setJobId(final String jobId) {
        this.jobId = jobId;
    }
    
    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder(this.jobName);
        if (this.jobId != null) {
            buffer.append('(').append(this.jobId).append(')');
        }
        return buffer.toString();
    }
}
