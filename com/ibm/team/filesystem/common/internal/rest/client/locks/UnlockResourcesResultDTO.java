// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

import java.util.List;

public interface UnlockResourcesResultDTO
{
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
    
    List getCurrentUserDoesntOwnLocks();
    
    void unsetCurrentUserDoesntOwnLocks();
    
    boolean isSetCurrentUserDoesntOwnLocks();
}
