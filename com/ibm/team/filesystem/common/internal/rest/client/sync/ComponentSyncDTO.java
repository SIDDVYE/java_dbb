// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import java.util.List;

public interface ComponentSyncDTO
{
    String getComponentName();
    
    void setComponentName(final String p0);
    
    void unsetComponentName();
    
    boolean isSetComponentName();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    List getOutgoingChangeSetsAfterBasis();
    
    void unsetOutgoingChangeSetsAfterBasis();
    
    boolean isSetOutgoingChangeSetsAfterBasis();
    
    List getOutgoingBaselines();
    
    void unsetOutgoingBaselines();
    
    boolean isSetOutgoingBaselines();
    
    List getIncomingChangeSetsAfterBasis();
    
    void unsetIncomingChangeSetsAfterBasis();
    
    boolean isSetIncomingChangeSetsAfterBasis();
    
    List getIncomingBaselines();
    
    void unsetIncomingBaselines();
    
    boolean isSetIncomingBaselines();
    
    List getSuspended();
    
    void unsetSuspended();
    
    boolean isSetSuspended();
    
    String getLocalRepositoryId();
    
    void setLocalRepositoryId(final String p0);
    
    void unsetLocalRepositoryId();
    
    boolean isSetLocalRepositoryId();
    
    String getLocalRepositoryUrl();
    
    void setLocalRepositoryUrl(final String p0);
    
    void unsetLocalRepositoryUrl();
    
    boolean isSetLocalRepositoryUrl();
    
    boolean isLocalRepositoryLoggedIn();
    
    void setLocalRepositoryLoggedIn(final boolean p0);
    
    void unsetLocalRepositoryLoggedIn();
    
    boolean isSetLocalRepositoryLoggedIn();
    
    String getLocalWorkspaceItemId();
    
    void setLocalWorkspaceItemId(final String p0);
    
    void unsetLocalWorkspaceItemId();
    
    boolean isSetLocalWorkspaceItemId();
    
    String getLocalWorkspaceName();
    
    void setLocalWorkspaceName(final String p0);
    
    void unsetLocalWorkspaceName();
    
    boolean isSetLocalWorkspaceName();
    
    String getTargetRepositoryId();
    
    void setTargetRepositoryId(final String p0);
    
    void unsetTargetRepositoryId();
    
    boolean isSetTargetRepositoryId();
    
    List getUnresolved();
    
    void unsetUnresolved();
    
    boolean isSetUnresolved();
    
    boolean isIsTargetStream();
    
    void setIsTargetStream(final boolean p0);
    
    void unsetIsTargetStream();
    
    boolean isSetIsTargetStream();
    
    CurrentPatchDTO getCurrentPatch();
    
    void setCurrentPatch(final CurrentPatchDTO p0);
    
    void unsetCurrentPatch();
    
    boolean isSetCurrentPatch();
    
    long getAcceptQueueSize();
    
    void setAcceptQueueSize(final long p0);
    
    void unsetAcceptQueueSize();
    
    boolean isSetAcceptQueueSize();
    
    BaselineSyncDTO getLocalBaseline();
    
    void setLocalBaseline(final BaselineSyncDTO p0);
    
    void unsetLocalBaseline();
    
    boolean isSetLocalBaseline();
    
    BaselineSyncDTO getRemoteBaseline();
    
    void setRemoteBaseline(final BaselineSyncDTO p0);
    
    void unsetRemoteBaseline();
    
    boolean isSetRemoteBaseline();
    
    String getTargetRepositoryUrl();
    
    void setTargetRepositoryUrl(final String p0);
    
    void unsetTargetRepositoryUrl();
    
    boolean isSetTargetRepositoryUrl();
    
    boolean isTargetRepositoryLoggedIn();
    
    void setTargetRepositoryLoggedIn(final boolean p0);
    
    void unsetTargetRepositoryLoggedIn();
    
    boolean isSetTargetRepositoryLoggedIn();
    
    String getTargetWorkspaceItemId();
    
    void setTargetWorkspaceItemId(final String p0);
    
    void unsetTargetWorkspaceItemId();
    
    boolean isSetTargetWorkspaceItemId();
    
    String getTargetWorkspaceName();
    
    void setTargetWorkspaceName(final String p0);
    
    void unsetTargetWorkspaceName();
    
    boolean isSetTargetWorkspaceName();
    
    String getCurrentOutgoingChangeSetItemId();
    
    void setCurrentOutgoingChangeSetItemId(final String p0);
    
    void unsetCurrentOutgoingChangeSetItemId();
    
    boolean isSetCurrentOutgoingChangeSetItemId();
    
    boolean isPrivateType();
    
    void setPrivateType(final boolean p0);
    
    void unsetPrivateType();
    
    boolean isSetPrivateType();
    
    boolean isBothType();
    
    void setBothType(final boolean p0);
    
    void unsetBothType();
    
    boolean isSetBothType();
    
    boolean isLocalAddedType();
    
    void setLocalAddedType(final boolean p0);
    
    void unsetLocalAddedType();
    
    boolean isSetLocalAddedType();
    
    boolean isLocalRemovedType();
    
    void setLocalRemovedType(final boolean p0);
    
    void unsetLocalRemovedType();
    
    boolean isSetLocalRemovedType();
    
    boolean isIslocalStream();
    
    void setIslocalStream(final boolean p0);
    
    void unsetIslocalStream();
    
    boolean isSetIslocalStream();
    
    boolean isTargetAddedType();
    
    void setTargetAddedType(final boolean p0);
    
    void unsetTargetAddedType();
    
    boolean isSetTargetAddedType();
    
    boolean isTargetRemovedType();
    
    void setTargetRemovedType(final boolean p0);
    
    void unsetTargetRemovedType();
    
    boolean isSetTargetRemovedType();
    
    boolean isReplaced();
    
    void setReplaced(final boolean p0);
    
    void unsetReplaced();
    
    boolean isSetReplaced();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    boolean isLoaded();
    
    void setLoaded(final boolean p0);
    
    void unsetLoaded();
    
    boolean isSetLoaded();
}
