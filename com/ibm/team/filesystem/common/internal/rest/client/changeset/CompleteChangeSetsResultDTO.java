// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import java.util.List;
import com.ibm.team.repository.common.model.Helper;

public interface CompleteChangeSetsResultDTO extends Helper
{
    List getTargetChangeSets();
    
    void unsetTargetChangeSets();
    
    boolean isSetTargetChangeSets();
    
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
}
