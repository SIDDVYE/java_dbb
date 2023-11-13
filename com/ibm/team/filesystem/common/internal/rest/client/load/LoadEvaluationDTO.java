// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import java.util.List;

public interface LoadEvaluationDTO
{
    List getOverlappingLoadRequests();
    
    void unsetOverlappingLoadRequests();
    
    boolean isSetOverlappingLoadRequests();
    
    List getSharesToBeRemoved();
    
    void unsetSharesToBeRemoved();
    
    boolean isSetSharesToBeRemoved();
    
    List getCollisions();
    
    void unsetCollisions();
    
    boolean isSetCollisions();
    
    List getSharesOutOfSync();
    
    void unsetSharesOutOfSync();
    
    boolean isSetSharesOutOfSync();
    
    List getNewSharesToLoad();
    
    void unsetNewSharesToLoad();
    
    boolean isSetNewSharesToLoad();
    
    List getInvalidLoadRequests();
    
    void unsetInvalidLoadRequests();
    
    boolean isSetInvalidLoadRequests();
    
    List getMultipleSandboxLoads();
    
    void unsetMultipleSandboxLoads();
    
    boolean isSetMultipleSandboxLoads();
    
    boolean isInvalidFilterForOldLoadRuleFormat();
    
    void setInvalidFilterForOldLoadRuleFormat(final boolean p0);
    
    void unsetInvalidFilterForOldLoadRuleFormat();
    
    boolean isSetInvalidFilterForOldLoadRuleFormat();
    
    List getLoadRuleProblems();
    
    void unsetLoadRuleProblems();
    
    boolean isSetLoadRuleProblems();
    
    List getInvalidLoadLocations();
    
    void unsetInvalidLoadLocations();
    
    boolean isSetInvalidLoadLocations();
}
