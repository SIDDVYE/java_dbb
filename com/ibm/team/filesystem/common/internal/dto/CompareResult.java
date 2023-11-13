// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.List;
import com.ibm.team.filesystem.common.ILogicalConflictReport;
import com.ibm.team.scm.common.dto.IChangeHistorySyncReport;
import com.ibm.team.filesystem.common.IWorkspaceCompareReport;

public interface CompareResult extends IWorkspaceCompareReport
{
    IChangeHistorySyncReport getSyncReport();
    
    void setSyncReport(final IChangeHistorySyncReport p0);
    
    void unsetSyncReport();
    
    boolean isSetSyncReport();
    
    ILogicalConflictReport getLogicalConflictReport();
    
    void setLogicalConflictReport(final ILogicalConflictReport p0);
    
    void unsetLogicalConflictReport();
    
    boolean isSetLogicalConflictReport();
    
    List getItemNWayConflictReports();
    
    void unsetItemNWayConflictReports();
    
    boolean isSetItemNWayConflictReports();
}
