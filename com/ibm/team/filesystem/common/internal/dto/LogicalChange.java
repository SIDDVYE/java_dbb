// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.List;
import com.ibm.team.repository.common.UUID;
import com.ibm.team.filesystem.common.ILogicalChange;

public interface LogicalChange extends ChangeSynopsis, ILogicalChange
{
    UUID getId();
    
    void setId(final UUID p0);
    
    void unsetId();
    
    boolean isSetId();
    
    List getDependentChanges();
    
    void unsetDependentChanges();
    
    boolean isSetDependentChanges();
    
    List getRelatedChanges();
    
    void unsetRelatedChanges();
    
    boolean isSetRelatedChanges();
    
    int getKind();
    
    void setKind(final int p0);
    
    void unsetKind();
    
    boolean isSetKind();
}
