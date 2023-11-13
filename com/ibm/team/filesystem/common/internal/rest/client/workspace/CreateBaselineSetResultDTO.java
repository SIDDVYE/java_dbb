// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineSetDTO;

public interface CreateBaselineSetResultDTO
{
    BaselineSetDTO getBaselineSet();
    
    void setBaselineSet(final BaselineSetDTO p0);
    
    void unsetBaselineSet();
    
    boolean isSetBaselineSet();
    
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
    
    CommitDilemmaDTO getCommitDilemma();
    
    void setCommitDilemma(final CommitDilemmaDTO p0);
    
    void unsetCommitDilemma();
    
    boolean isSetCommitDilemma();
    
    List getConfigurationsWithConflicts();
    
    void unsetConfigurationsWithConflicts();
    
    boolean isSetConfigurationsWithConflicts();
    
    List getConfigurationsWithUncheckedInChanges();
    
    void unsetConfigurationsWithUncheckedInChanges();
    
    boolean isSetConfigurationsWithUncheckedInChanges();
    
    List getOutOfSyncShares();
    
    void unsetOutOfSyncShares();
    
    boolean isSetOutOfSyncShares();
    
    SandboxUpdateDilemmaDTO getSandboxUpdateDilemma();
    
    void setSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO p0);
    
    void unsetSandboxUpdateDilemma();
    
    boolean isSetSandboxUpdateDilemma();
    
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
    
    List getConfigurationsWithUncheckedInChangesInSubcomponents();
    
    void unsetConfigurationsWithUncheckedInChangesInSubcomponents();
    
    boolean isSetConfigurationsWithUncheckedInChangesInSubcomponents();
    
    List getConfigurationsWithConflictsInSubcomponents();
    
    void unsetConfigurationsWithConflictsInSubcomponents();
    
    boolean isSetConfigurationsWithConflictsInSubcomponents();
    
    List getEntireHierarchyNotIncludedInSnapshot();
    
    void unsetEntireHierarchyNotIncludedInSnapshot();
    
    boolean isSetEntireHierarchyNotIncludedInSnapshot();
    
    List getActiveChangeSetsInConfigurations();
    
    void unsetActiveChangeSetsInConfigurations();
    
    boolean isSetActiveChangeSetsInConfigurations();
}
