// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict;

import java.util.List;

public interface ResolveWithProposedEvaluationDTO
{
    List getNeedContentToRemoved();
    
    void unsetNeedContentToRemoved();
    
    boolean isSetNeedContentToRemoved();
    
    List getNeedParentForResolution();
    
    void unsetNeedParentForResolution();
    
    boolean isSetNeedParentForResolution();
}
