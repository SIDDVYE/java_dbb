// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.repository.common.UUID;
import com.ibm.team.scm.common.IFolderHandle;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.filesystem.common.IBasicChange;

public interface BasicChange extends IBasicChange
{
    IComponentHandle getComponent();
    
    void setComponent(final IComponentHandle p0);
    
    void unsetComponent();
    
    boolean isSetComponent();
    
    int getChangeType();
    
    void setChangeType(final int p0);
    
    void unsetChangeType();
    
    boolean isSetChangeType();
    
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    String getOldName();
    
    void setOldName(final String p0);
    
    void unsetOldName();
    
    boolean isSetOldName();
    
    IVersionableHandle getItem();
    
    void setItem(final IVersionableHandle p0);
    
    void unsetItem();
    
    boolean isSetItem();
    
    IFolderHandle getSourceParent();
    
    void setSourceParent(final IFolderHandle p0);
    
    void unsetSourceParent();
    
    boolean isSetSourceParent();
    
    IFolderHandle getDestinationParent();
    
    void setDestinationParent(final IFolderHandle p0);
    
    void unsetDestinationParent();
    
    boolean isSetDestinationParent();
    
    UUID getBefore();
    
    void setBefore(final UUID p0);
    
    void unsetBefore();
    
    boolean isSetBefore();
    
    UUID getAfter();
    
    void setAfter(final UUID p0);
    
    void unsetAfter();
    
    boolean isSetAfter();
    
    IComponentHandle getPreviousComponent();
    
    void setPreviousComponent(final IComponentHandle p0);
    
    void unsetPreviousComponent();
    
    boolean isSetPreviousComponent();
    
    int getChangeDetails();
    
    void setChangeDetails(final int p0);
    
    void unsetChangeDetails();
    
    boolean isSetChangeDetails();
}
