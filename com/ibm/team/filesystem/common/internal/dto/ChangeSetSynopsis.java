// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IChangeSetHandle;
import java.util.List;
import com.ibm.team.filesystem.common.IChangeSetSummary;

public interface ChangeSetSynopsis extends IChangeSetSummary
{
    List getChanges();
    
    void unsetChanges();
    
    boolean isSetChanges();
    
    IChangeSetHandle getUnderlyingChangeSet();
    
    void setUnderlyingChangeSet(final IChangeSetHandle p0);
    
    void unsetUnderlyingChangeSet();
    
    boolean isSetUnderlyingChangeSet();
    
    IComponentHandle getComponent();
    
    void setComponent(final IComponentHandle p0);
    
    void unsetComponent();
    
    boolean isSetComponent();
}
