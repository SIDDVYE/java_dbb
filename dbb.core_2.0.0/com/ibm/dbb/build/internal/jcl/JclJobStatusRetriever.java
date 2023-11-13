// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

import com.ibm.dbb.build.BuildException;
import java.util.List;
import com.ibm.zos.sdsf.core.ISFStatus;

public class JclJobStatusRetriever extends SdsfAccess implements ISdsfConstants
{
    public JclJobStatusRetriever(final JclJob job) {
        super(job);
    }
    
    public JclJobStatus getStatus() throws BuildException {
        final JclJobStatus jobStatus = new JclJobStatus(this.job);
        final List<ISFStatus> statuses = this.status(new String[] { "RETCODE" });
        final ISFStatus isfStatus = statuses.get(0);
        final String retCode = isfStatus.getValue("RETCODE");
        jobStatus.setReturnCode(retCode);
        return jobStatus;
    }
    
    public JclJobStatusRetriever traceEnabled(final boolean value) {
        this.setTraceEnabled(value);
        return this;
    }
}
