// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;

public interface ResolveWithProposedResultDTO
{
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
    
    List getOutOfSyncShares();
    
    void unsetOutOfSyncShares();
    
    boolean isSetOutOfSyncShares();
    
    List getMissingRequiredChanges();
    
    void unsetMissingRequiredChanges();
    
    boolean isSetMissingRequiredChanges();
    
    SandboxUpdateDilemmaDTO getSandboxUpdateDilemma();
    
    void setSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO p0);
    
    void unsetSandboxUpdateDilemma();
    
    boolean isSetSandboxUpdateDilemma();
    
    UpdateDilemmaDTO getUpdateDilemma();
    
    void setUpdateDilemma(final UpdateDilemmaDTO p0);
    
    void unsetUpdateDilemma();
    
    boolean isSetUpdateDilemma();
}
