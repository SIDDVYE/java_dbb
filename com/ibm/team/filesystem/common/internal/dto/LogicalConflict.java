// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.List;
import com.ibm.team.filesystem.common.ILogicalConflict;

public interface LogicalConflict extends LogicalChange, ILogicalConflict
{
    List getConflicts();
    
    void unsetConflicts();
    
    boolean isSetConflicts();
    
    int getConflictType();
    
    void setConflictType(final int p0);
    
    void unsetConflictType();
    
    boolean isSetConflictType();
    
    int getSelectedChangeDetails();
    
    void setSelectedChangeDetails(final int p0);
    
    void unsetSelectedChangeDetails();
    
    boolean isSetSelectedChangeDetails();
}
