// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IFolderHandle;

public interface ConflictResolution
{
    IFolderHandle getParent();
    
    void setParent(final IFolderHandle p0);
    
    void unsetParent();
    
    boolean isSetParent();
    
    IVersionableHandle getItem();
    
    void setItem(final IVersionableHandle p0);
    
    void unsetItem();
    
    boolean isSetItem();
    
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    int getConflictType();
    
    void setConflictType(final int p0);
    
    void unsetConflictType();
    
    boolean isSetConflictType();
}
