// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import java.util.List;

public interface ChangeSetSyncDTO
{
    String getChangeSetComment();
    
    void setChangeSetComment(final String p0);
    
    void unsetChangeSetComment();
    
    boolean isSetChangeSetComment();
    
    String getChangeSetItemId();
    
    void setChangeSetItemId(final String p0);
    
    void unsetChangeSetItemId();
    
    boolean isSetChangeSetItemId();
    
    List getWorkItems();
    
    void unsetWorkItems();
    
    boolean isSetWorkItems();
    
    ChangeSetSourceDTO getSource();
    
    void setSource(final ChangeSetSourceDTO p0);
    
    void unsetSource();
    
    boolean isSetSource();
    
    ChangeSetSourceDTO getOriginalSource();
    
    void setOriginalSource(final ChangeSetSourceDTO p0);
    
    void unsetOriginalSource();
    
    boolean isSetOriginalSource();
    
    boolean isLinkedToChangeSetInOtherDirection();
    
    void setLinkedToChangeSetInOtherDirection(final boolean p0);
    
    void unsetLinkedToChangeSetInOtherDirection();
    
    boolean isSetLinkedToChangeSetInOtherDirection();
    
    List getChanges();
    
    void unsetChanges();
    
    boolean isSetChanges();
    
    int getHiddenChanges();
    
    void setHiddenChanges(final int p0);
    
    void unsetHiddenChanges();
    
    boolean isSetHiddenChanges();
    
    int getInaccessibleChanges();
    
    void setInaccessibleChanges(final int p0);
    
    void unsetInaccessibleChanges();
    
    boolean isSetInaccessibleChanges();
    
    boolean isIsActive();
    
    void setIsActive(final boolean p0);
    
    void unsetIsActive();
    
    boolean isSetIsActive();
    
    String getAuthorContributorItemId();
    
    void setAuthorContributorItemId(final String p0);
    
    void unsetAuthorContributorItemId();
    
    boolean isSetAuthorContributorItemId();
    
    String getLastChangeFormattedDate();
    
    void setLastChangeFormattedDate(final String p0);
    
    void unsetLastChangeFormattedDate();
    
    boolean isSetLastChangeFormattedDate();
    
    long getLastChangeDate();
    
    void setLastChangeDate(final long p0);
    
    void unsetLastChangeDate();
    
    boolean isSetLastChangeDate();
    
    String getAuthorContributorName();
    
    void setAuthorContributorName(final String p0);
    
    void unsetAuthorContributorName();
    
    boolean isSetAuthorContributorName();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    String getComponentName();
    
    void setComponentName(final String p0);
    
    void unsetComponentName();
    
    boolean isSetComponentName();
    
    String getRepositoryUrl();
    
    void setRepositoryUrl(final String p0);
    
    void unsetRepositoryUrl();
    
    boolean isSetRepositoryUrl();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    List getOslcLinks();
    
    void unsetOslcLinks();
    
    boolean isSetOslcLinks();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
}
