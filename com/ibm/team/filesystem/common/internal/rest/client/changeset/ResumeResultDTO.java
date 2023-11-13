// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;

public interface ResumeResultDTO
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
    
    List getActiveChangeSetsOverlap();
    
    void unsetActiveChangeSetsOverlap();
    
    boolean isSetActiveChangeSetsOverlap();
    
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
    
    List getGap();
    
    void unsetGap();
    
    boolean isSetGap();
    
    List getChangeSetsBlockedByPortInProgress();
    
    void unsetChangeSetsBlockedByPortInProgress();
    
    boolean isSetChangeSetsBlockedByPortInProgress();
    
    List getLocksWereHeld();
    
    void unsetLocksWereHeld();
    
    boolean isSetLocksWereHeld();
    
    List getLocksToAcquire();
    
    void unsetLocksToAcquire();
    
    boolean isSetLocksToAcquire();
}
