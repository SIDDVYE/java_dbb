// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;

public interface ProcessAcceptQueueResultDTO
{
    CurrentPatchDTO getCurrentPatch();
    
    void setCurrentPatch(final CurrentPatchDTO p0);
    
    void unsetCurrentPatch();
    
    boolean isSetCurrentPatch();
    
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
    
    long getAcceptQueueSize();
    
    void setAcceptQueueSize(final long p0);
    
    void unsetAcceptQueueSize();
    
    boolean isSetAcceptQueueSize();
}
