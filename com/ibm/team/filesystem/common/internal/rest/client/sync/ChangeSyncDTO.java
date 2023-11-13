// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface ChangeSyncDTO
{
    String getVersionableName();
    
    void setVersionableName(final String p0);
    
    void unsetVersionableName();
    
    boolean isSetVersionableName();
    
    String getBeforeParentItemId();
    
    void setBeforeParentItemId(final String p0);
    
    void unsetBeforeParentItemId();
    
    boolean isSetBeforeParentItemId();
    
    String getAfterParentItemId();
    
    void setAfterParentItemId(final String p0);
    
    void unsetAfterParentItemId();
    
    boolean isSetAfterParentItemId();
    
    List getMergeStates();
    
    void unsetMergeStates();
    
    boolean isSetMergeStates();
    
    String getVersionableItemId();
    
    void setVersionableItemId(final String p0);
    
    void unsetVersionableItemId();
    
    boolean isSetVersionableItemId();
    
    String getVersionableItemType();
    
    void setVersionableItemType(final String p0);
    
    void unsetVersionableItemType();
    
    boolean isSetVersionableItemType();
    
    String getBeforeStateId();
    
    void setBeforeStateId(final String p0);
    
    void unsetBeforeStateId();
    
    boolean isSetBeforeStateId();
    
    String getAfterStateId();
    
    void setAfterStateId(final String p0);
    
    void unsetAfterStateId();
    
    boolean isSetAfterStateId();
    
    boolean isAddType();
    
    void setAddType(final boolean p0);
    
    void unsetAddType();
    
    boolean isSetAddType();
    
    boolean isDeleteType();
    
    void setDeleteType(final boolean p0);
    
    void unsetDeleteType();
    
    boolean isSetDeleteType();
    
    boolean isModifyType();
    
    void setModifyType(final boolean p0);
    
    void unsetModifyType();
    
    boolean isSetModifyType();
    
    boolean isNoopType();
    
    void setNoopType(final boolean p0);
    
    void unsetNoopType();
    
    boolean isSetNoopType();
    
    boolean isMissingDetails();
    
    void setMissingDetails(final boolean p0);
    
    void unsetMissingDetails();
    
    boolean isSetMissingDetails();
    
    String getPathHint();
    
    void setPathHint(final String p0);
    
    void unsetPathHint();
    
    boolean isSetPathHint();
    
    String getNewPathHint();
    
    void setNewPathHint(final String p0);
    
    void unsetNewPathHint();
    
    boolean isSetNewPathHint();
    
    boolean isMoveType();
    
    void setMoveType(final boolean p0);
    
    void unsetMoveType();
    
    boolean isSetMoveType();
    
    boolean isPotentialConflict();
    
    void setPotentialConflict(final boolean p0);
    
    void unsetPotentialConflict();
    
    boolean isSetPotentialConflict();
    
    String getLastMergeState();
    
    void setLastMergeState(final String p0);
    
    void unsetLastMergeState();
    
    boolean isSetLastMergeState();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    int getStartLine();
    
    void setStartLine(final int p0);
    
    void unsetStartLine();
    
    boolean isSetStartLine();
    
    boolean isContentChange();
    
    void setContentChange(final boolean p0);
    
    void unsetContentChange();
    
    boolean isSetContentChange();
    
    boolean isPropertyChange();
    
    void setPropertyChange(final boolean p0);
    
    void unsetPropertyChange();
    
    boolean isSetPropertyChange();
}
