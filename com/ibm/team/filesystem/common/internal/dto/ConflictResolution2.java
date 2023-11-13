// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.scm.common.IFolderHandle;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;

public interface ConflictResolution2
{
    IComponentHandle getComponent();
    
    void setComponent(final IComponentHandle p0);
    
    void unsetComponent();
    
    boolean isSetComponent();
    
    IVersionableHandle getItem();
    
    void setItem(final IVersionableHandle p0);
    
    void unsetItem();
    
    boolean isSetItem();
    
    IFolderHandle getParent();
    
    void setParent(final IFolderHandle p0);
    
    void unsetParent();
    
    boolean isSetParent();
    
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
}
