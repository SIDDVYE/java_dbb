// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;

public interface CreateBaselineResultDTO
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
    
    List getConfigurationsWithUncheckedInChangesInSubcomponents();
    
    void unsetConfigurationsWithUncheckedInChangesInSubcomponents();
    
    boolean isSetConfigurationsWithUncheckedInChangesInSubcomponents();
    
    List getConfigurationsWithConflicts();
    
    void unsetConfigurationsWithConflicts();
    
    boolean isSetConfigurationsWithConflicts();
    
    List getConfigurationsWithConflictsInSubcomponents();
    
    void unsetConfigurationsWithConflictsInSubcomponents();
    
    boolean isSetConfigurationsWithConflictsInSubcomponents();
    
    List getBaselines();
    
    void unsetBaselines();
    
    boolean isSetBaselines();
    
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
    
    List getActiveChangeSetsInSubcomponents();
    
    void unsetActiveChangeSetsInSubcomponents();
    
    boolean isSetActiveChangeSetsInSubcomponents();
    
    List getInaccessibleConfigurationsInSubcomponents();
    
    void unsetInaccessibleConfigurationsInSubcomponents();
    
    boolean isSetInaccessibleConfigurationsInSubcomponents();
    
    List getNotFoundConfigurationsInSubcomponents();
    
    void unsetNotFoundConfigurationsInSubcomponents();
    
    boolean isSetNotFoundConfigurationsInSubcomponents();
}
