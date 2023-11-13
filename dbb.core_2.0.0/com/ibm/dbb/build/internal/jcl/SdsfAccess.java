// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

import java.util.Iterator;
import com.ibm.zos.sdsf.core.ISFException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.DBBConstants;
import com.ibm.zos.sdsf.core.ISFSecTraceConstants;
import com.ibm.zos.sdsf.core.ISFStatus;
import java.util.List;
import com.ibm.zos.sdsf.core.ISFRequestSettings;
import com.ibm.zos.sdsf.core.ISFStatusRunner;

public class SdsfAccess implements ISdsfConstants
{
    protected JclJob job;
    protected ISFStatusRunner statusRunner;
    protected boolean traceEnabled;
    
    public SdsfAccess(final JclJob job) {
        this.statusRunner = null;
        this.traceEnabled = false;
        this.job = job;
    }
    
    protected ISFRequestSettings getDefaultSettings() {
        final ISFRequestSettings settings = new ISFRequestSettings();
        settings.addISFPrefix("*");
        settings.addNoModify();
        settings.addISFLineLim(500);
        settings.addISFOwner("*");
        settings.addISFDest("");
        return settings;
    }
    
    public List<ISFStatus> status(final String[] colNames) throws BuildException {
        final ISFRequestSettings settings = this.getDefaultSettings();
        if (this.traceEnabled) {
            settings.addISFSecTrace(ISFSecTraceConstants.Options.ON);
        }
        if (colNames != null && colNames.length > 0) {
            final StringBuilder temp = new StringBuilder();
            for (int i = 0; i < colNames.length; ++i) {
                temp.append(colNames[i]);
                if (i + 1 < colNames.length) {
                    temp.append(' ');
                }
            }
            settings.addISFCols(temp.toString());
        }
        final StringBuilder filtering = new StringBuilder();
        filtering.append("JNAME").append(' ').append("EQ").append(' ').append(this.job.getJobName());
        if (this.job.getJobId() != null) {
            filtering.append(' ').append("JOBID").append(' ').append("EQ").append(' ').append(this.job.getJobId());
        }
        settings.addISFFilter(filtering.toString());
        this.statusRunner = new ISFStatusRunner(settings);
        try {
            final List<ISFStatus> statuses = (List<ISFStatus>)this.statusRunner.exec();
            if (statuses == null || statuses.size() == 0) {
                final List<String> sdsfMsgs = (List<String>)this.statusRunner.getRequestResults().getMessageList();
                final StringBuilder buffer = new StringBuilder();
                buffer.append("Job: " + this.job).append(DBBConstants.DEFAULT_NEWLINE);
                for (final String sdsfMsg : sdsfMsgs) {
                    buffer.append(sdsfMsg).append(DBBConstants.DEFAULT_NEWLINE);
                }
                throw new BuildException(Messages.getMessage("JobStatusRetriever_INTERNAL_ERROR", buffer.toString()));
            }
            return statuses;
        }
        catch (ISFException e) {
            final List<String> sdsfMsgs = (List<String>)e.getRequestResults().getMessageList();
            final StringBuilder buffer = new StringBuilder();
            for (final String sdsfMsg : sdsfMsgs) {
                buffer.append(sdsfMsg).append(DBBConstants.DEFAULT_NEWLINE);
            }
            throw new BuildException(Messages.getMessage("JobStatusRetriever_INTERNAL_ERROR", buffer.toString()), (Throwable)e);
        }
    }
    
    public boolean isTraceEnabled() {
        return this.traceEnabled;
    }
    
    public void setTraceEnabled(final boolean traceEnabled) {
        this.traceEnabled = traceEnabled;
    }
}
