// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;

public interface WorkspaceUpdateResultDTO
{
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
    
    List getOutOfSyncShares();
    
    void unsetOutOfSyncShares();
    
    boolean isSetOutOfSyncShares();
    
    List getConfigurationsWithUncheckedInChanges();
    
    void unsetConfigurationsWithUncheckedInChanges();
    
    boolean isSetConfigurationsWithUncheckedInChanges();
    
    List getStaleData();
    
    void unsetStaleData();
    
    boolean isSetStaleData();
    
    List getDisconnectedComponents();
    
    void unsetDisconnectedComponents();
    
    boolean isSetDisconnectedComponents();
    
    List getComponentFlowAdditions();
    
    void unsetComponentFlowAdditions();
    
    boolean isSetComponentFlowAdditions();
    
    List getComponentFlowDeletions();
    
    void unsetComponentFlowDeletions();
    
    boolean isSetComponentFlowDeletions();
    
    List getComponentReplacementCandidates();
    
    void unsetComponentReplacementCandidates();
    
    boolean isSetComponentReplacementCandidates();
    
    List getComponentsAdded();
    
    void unsetComponentsAdded();
    
    boolean isSetComponentsAdded();
    
    boolean isChangeSetsAlreadyInHistory();
    
    void setChangeSetsAlreadyInHistory(final boolean p0);
    
    void unsetChangeSetsAlreadyInHistory();
    
    boolean isSetChangeSetsAlreadyInHistory();
    
    List getChangeSetsBlockedByPortInProgress();
    
    void unsetChangeSetsBlockedByPortInProgress();
    
    boolean isSetChangeSetsBlockedByPortInProgress();
    
    boolean isAcceptedSuspendedChanges();
    
    void setAcceptedSuspendedChanges(final boolean p0);
    
    void unsetAcceptedSuspendedChanges();
    
    boolean isSetAcceptedSuspendedChanges();
    
    List getActiveChangeSets();
    
    void unsetActiveChangeSets();
    
    boolean isSetActiveChangeSets();
    
    List getActiveChangeSetsOverlap();
    
    void unsetActiveChangeSetsOverlap();
    
    boolean isSetActiveChangeSetsOverlap();
    
    List getActiveChangeSetsInComponent();
    
    void unsetActiveChangeSetsInComponent();
    
    boolean isSetActiveChangeSetsInComponent();
    
    List getGap();
    
    void unsetGap();
    
    boolean isSetGap();
    
    List getStructuredResult();
    
    void unsetStructuredResult();
    
    boolean isSetStructuredResult();
    
    SandboxUpdateDilemmaDTO getSandboxUpdateDilemma();
    
    void setSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO p0);
    
    void unsetSandboxUpdateDilemma();
    
    boolean isSetSandboxUpdateDilemma();
    
    CommitDilemmaDTO getCommitDilemma();
    
    void setCommitDilemma(final CommitDilemmaDTO p0);
    
    void unsetCommitDilemma();
    
    boolean isSetCommitDilemma();
    
    UpdateDilemmaDTO getUpdateDilemma();
    
    void setUpdateDilemma(final UpdateDilemmaDTO p0);
    
    void unsetUpdateDilemma();
    
    boolean isSetUpdateDilemma();
    
    List getEclipseReadFailureMessage();
    
    void unsetEclipseReadFailureMessage();
    
    boolean isSetEclipseReadFailureMessage();
    
    List getLocksWereHeld();
    
    void unsetLocksWereHeld();
    
    boolean isSetLocksWereHeld();
    
    List getLocksToAcquire();
    
    void unsetLocksToAcquire();
    
    boolean isSetLocksToAcquire();
    
    List getComponentsWithNWayConflicts();
    
    void unsetComponentsWithNWayConflicts();
    
    boolean isSetComponentsWithNWayConflicts();
    
    List getComponentsWithConflictingTargets();
    
    void unsetComponentsWithConflictingTargets();
    
    boolean isSetComponentsWithConflictingTargets();
    
    List getComponentsWithMultipleParticipants();
    
    void unsetComponentsWithMultipleParticipants();
    
    boolean isSetComponentsWithMultipleParticipants();
    
    List getNoBackupBaselinesComponents();
    
    void unsetNoBackupBaselinesComponents();
    
    boolean isSetNoBackupBaselinesComponents();
    
    List getSelectedComponentsInMultipleHierarchies();
    
    void unsetSelectedComponentsInMultipleHierarchies();
    
    boolean isSetSelectedComponentsInMultipleHierarchies();
    
    List getSubcomponentsInMultipleHierarchies();
    
    void unsetSubcomponentsInMultipleHierarchies();
    
    boolean isSetSubcomponentsInMultipleHierarchies();
}
