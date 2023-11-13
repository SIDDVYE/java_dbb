// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

public interface ConflictSyncDTO
{
    String getPathHint();
    
    void setPathHint(final String p0);
    
    void unsetPathHint();
    
    boolean isSetPathHint();
    
    String getVersionableItemId();
    
    void setVersionableItemId(final String p0);
    
    void unsetVersionableItemId();
    
    boolean isSetVersionableItemId();
    
    String getVersionableItemType();
    
    void setVersionableItemType(final String p0);
    
    void unsetVersionableItemType();
    
    boolean isSetVersionableItemType();
    
    String getConflictTypeOutgoing();
    
    void setConflictTypeOutgoing(final String p0);
    
    void unsetConflictTypeOutgoing();
    
    boolean isSetConflictTypeOutgoing();
    
    String getConflictTypeProposed();
    
    void setConflictTypeProposed(final String p0);
    
    void unsetConflictTypeProposed();
    
    boolean isSetConflictTypeProposed();
    
    String getNewPathHint();
    
    void setNewPathHint(final String p0);
    
    void unsetNewPathHint();
    
    boolean isSetNewPathHint();
    
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    String getCommonAncestorVersionableStateId();
    
    void setCommonAncestorVersionableStateId(final String p0);
    
    void unsetCommonAncestorVersionableStateId();
    
    boolean isSetCommonAncestorVersionableStateId();
    
    String getSelectedContributorVersionableStateId();
    
    void setSelectedContributorVersionableStateId(final String p0);
    
    void unsetSelectedContributorVersionableStateId();
    
    boolean isSetSelectedContributorVersionableStateId();
    
    String getOriginalSelectedContributorVersionableStateId();
    
    void setOriginalSelectedContributorVersionableStateId(final String p0);
    
    void unsetOriginalSelectedContributorVersionableStateId();
    
    boolean isSetOriginalSelectedContributorVersionableStateId();
    
    String getProposedContributorVersionableStateId();
    
    void setProposedContributorVersionableStateId(final String p0);
    
    void unsetProposedContributorVersionableStateId();
    
    boolean isSetProposedContributorVersionableStateId();
    
    String getKind();
    
    void setKind(final String p0);
    
    void unsetKind();
    
    boolean isSetKind();
    
    String getConflictType();
    
    void setConflictType(final String p0);
    
    void unsetConflictType();
    
    boolean isSetConflictType();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    boolean isContentConflict();
    
    void setContentConflict(final boolean p0);
    
    void unsetContentConflict();
    
    boolean isSetContentConflict();
    
    boolean isPropertyConflict();
    
    void setPropertyConflict(final boolean p0);
    
    void unsetPropertyConflict();
    
    boolean isSetPropertyConflict();
}
