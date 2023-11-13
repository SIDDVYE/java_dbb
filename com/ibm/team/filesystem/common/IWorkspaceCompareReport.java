// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.scm.common.dto.IItemNWayConflictReport;
import java.util.List;
import com.ibm.team.scm.common.dto.IChangeHistorySyncReport;

public interface IWorkspaceCompareReport
{
    IChangeHistorySyncReport syncReport();
    
    ILogicalConflictReport logicalConflictReport();
    
    List<IItemNWayConflictReport> getNWayConflictReports();
}
