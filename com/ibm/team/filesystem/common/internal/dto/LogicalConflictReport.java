// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.scm.common.dto.IUpdateReport;
import java.util.List;
import com.ibm.team.filesystem.common.ILogicalConflictReport;

public interface LogicalConflictReport extends ILogicalConflictReport
{
    List getConflicts();
    
    void unsetConflicts();
    
    boolean isSetConflicts();
    
    List getPendingChanges();
    
    void unsetPendingChanges();
    
    boolean isSetPendingChanges();
    
    List getDeferredChanges();
    
    void unsetDeferredChanges();
    
    boolean isSetDeferredChanges();
    
    IUpdateReport getConflictReport();
    
    void setConflictReport(final IUpdateReport p0);
    
    void unsetConflictReport();
    
    boolean isSetConflictReport();
}
