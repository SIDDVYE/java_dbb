// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;

public interface RemovedShareDTO
{
    int getUncommittedChangeCount();
    
    void setUncommittedChangeCount(final int p0);
    
    void unsetUncommittedChangeCount();
    
    boolean isSetUncommittedChangeCount();
    
    ShareDTO getShare();
    
    void setShare(final ShareDTO p0);
    
    void unsetShare();
    
    boolean isSetShare();
}
