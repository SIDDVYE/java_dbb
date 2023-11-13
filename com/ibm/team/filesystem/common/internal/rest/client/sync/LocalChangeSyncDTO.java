// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

public interface LocalChangeSyncDTO
{
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    String getTargetVersionableItemId();
    
    void setTargetVersionableItemId(final String p0);
    
    void unsetTargetVersionableItemId();
    
    boolean isSetTargetVersionableItemId();
    
    String getVersionableItemType();
    
    void setVersionableItemType(final String p0);
    
    void unsetVersionableItemType();
    
    boolean isSetVersionableItemType();
    
    boolean isContentType();
    
    void setContentType(final boolean p0);
    
    void unsetContentType();
    
    boolean isSetContentType();
    
    boolean isAdditionType();
    
    void setAdditionType(final boolean p0);
    
    void unsetAdditionType();
    
    boolean isSetAdditionType();
    
    boolean isDeletionType();
    
    void setDeletionType(final boolean p0);
    
    void unsetDeletionType();
    
    boolean isSetDeletionType();
    
    boolean isMoveType();
    
    void setMoveType(final boolean p0);
    
    void unsetMoveType();
    
    boolean isSetMoveType();
    
    boolean isAttributesType();
    
    void setAttributesType(final boolean p0);
    
    void unsetAttributesType();
    
    boolean isSetAttributesType();
    
    String getPath();
    
    void setPath(final String p0);
    
    void unsetPath();
    
    boolean isSetPath();
    
    String getResultingPath();
    
    void setResultingPath(final String p0);
    
    void unsetResultingPath();
    
    boolean isSetResultingPath();
    
    String getOriginalPath();
    
    void setOriginalPath(final String p0);
    
    void unsetOriginalPath();
    
    boolean isSetOriginalPath();
    
    String getTargetVersionableStateId();
    
    void setTargetVersionableStateId(final String p0);
    
    void unsetTargetVersionableStateId();
    
    boolean isSetTargetVersionableStateId();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    String getSandboxPath();
    
    void setSandboxPath(final String p0);
    
    void unsetSandboxPath();
    
    boolean isSetSandboxPath();
}
