// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceDetailsDTO;

public interface PutWorkspaceResultDTO
{
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
    
    WorkspaceDetailsDTO getWorkspace();
    
    void setWorkspace(final WorkspaceDetailsDTO p0);
    
    void unsetWorkspace();
    
    boolean isSetWorkspace();
    
    List getOutOfSyncShares();
    
    void unsetOutOfSyncShares();
    
    boolean isSetOutOfSyncShares();
    
    List getConfigurationsWithUncheckedInChanges();
    
    void unsetConfigurationsWithUncheckedInChanges();
    
    boolean isSetConfigurationsWithUncheckedInChanges();
    
    List getComponentsAdded();
    
    void unsetComponentsAdded();
    
    boolean isSetComponentsAdded();
    
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
    
    List getNoBackupBaselinesComponents();
    
    void unsetNoBackupBaselinesComponents();
    
    boolean isSetNoBackupBaselinesComponents();
    
    List getSelectedComponentsWithMultipleParticipants();
    
    void unsetSelectedComponentsWithMultipleParticipants();
    
    boolean isSetSelectedComponentsWithMultipleParticipants();
    
    List getSubcomponentsWithMultipleParticipants();
    
    void unsetSubcomponentsWithMultipleParticipants();
    
    boolean isSetSubcomponentsWithMultipleParticipants();
    
    List getComponentsRemoved();
    
    void unsetComponentsRemoved();
    
    boolean isSetComponentsRemoved();
    
    List getComponentsCreated();
    
    void unsetComponentsCreated();
    
    boolean isSetComponentsCreated();
    
    ComponentHierarchyUpdateResultDTO getComponentHierarchyUpdateResult();
    
    void setComponentHierarchyUpdateResult(final ComponentHierarchyUpdateResultDTO p0);
    
    void unsetComponentHierarchyUpdateResult();
    
    boolean isSetComponentHierarchyUpdateResult();
}
