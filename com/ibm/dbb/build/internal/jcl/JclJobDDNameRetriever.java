// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

import java.util.Iterator;
import com.ibm.zos.sdsf.core.ISFException;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.zos.sdsf.core.ISFJobDataSet;
import com.ibm.zos.sdsf.core.ISFStatus;
import java.util.ArrayList;
import com.ibm.dbb.build.BuildException;
import java.util.List;

public class JclJobDDNameRetriever extends SdsfAccess implements ISdsfConstants
{
    public static final String STEPNAME = "STEPN";
    public static final String PROCSTEPNAME = "PROCS";
    public static final String QSEPARATOR = ":";
    
    public JclJobDDNameRetriever(final JclJob job) {
        super(job);
    }
    
    public List<String> getDDNames() throws BuildException {
        return this.getDDNames(false);
    }
    
    public List<String> getDDNames(final boolean qualified) throws BuildException {
        final List<String> ddNames = new ArrayList<String>();
        final List<ISFStatus> statuses = this.status(null);
        try {
            final List<ISFJobDataSet> isfJobDatasets = (List<ISFJobDataSet>)statuses.get(0).getJobDataSets();
            for (final ISFJobDataSet isfJobDataset : isfJobDatasets) {
                String ddName = isfJobDataset.getDDName();
                if (qualified) {
                    ddName = ddName + ":" + isfJobDataset.getValue("STEPN") + ":" + isfJobDataset.getValue("PROCS");
                }
                ddNames.add(ddName);
            }
        }
        catch (ISFException e) {
            throw new BuildException(Messages.getMessage("JobStatusRetriever_INTERNAL_ERROR", e.getMessage()), (Throwable)e);
        }
        return ddNames;
    }
    
    public JclJobDDNameRetriever traceEnabled(final boolean value) {
        this.setTraceEnabled(value);
        return this;
    }
}
