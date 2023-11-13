// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;

public interface DeliverResultDTO
{
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
    
    boolean isComponentsToFlow();
    
    void setComponentsToFlow(final boolean p0);
    
    void unsetComponentsToFlow();
    
    boolean isSetComponentsToFlow();
    
    boolean isFlowToNonDefaultTarget();
    
    void setFlowToNonDefaultTarget(final boolean p0);
    
    void unsetFlowToNonDefaultTarget();
    
    boolean isSetFlowToNonDefaultTarget();
    
    List getOutOfSyncShares();
    
    void unsetOutOfSyncShares();
    
    boolean isSetOutOfSyncShares();
    
    List getConfigurationsWithUncheckedInChanges();
    
    void unsetConfigurationsWithUncheckedInChanges();
    
    boolean isSetConfigurationsWithUncheckedInChanges();
    
    List getLocksToRelease();
    
    void unsetLocksToRelease();
    
    boolean isSetLocksToRelease();
    
    List getLocksWereHeld();
    
    void unsetLocksWereHeld();
    
    boolean isSetLocksWereHeld();
    
    List getStructuredResult();
    
    void unsetStructuredResult();
    
    boolean isSetStructuredResult();
    
    List getDeliveryRequiresHistoryReordering();
    
    void unsetDeliveryRequiresHistoryReordering();
    
    boolean isSetDeliveryRequiresHistoryReordering();
    
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
    
    List getComponentsWithConflictingTargets();
    
    void unsetComponentsWithConflictingTargets();
    
    boolean isSetComponentsWithConflictingTargets();
    
    List getComponentsWithMultipleParticipants();
    
    void unsetComponentsWithMultipleParticipants();
    
    boolean isSetComponentsWithMultipleParticipants();
}
