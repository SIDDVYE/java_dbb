// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.scm.common.IVersionableHandle;

public interface OverlappedItemDTO
{
    IVersionableHandle getVersionableHandle();
    
    void setVersionableHandle(final IVersionableHandle p0);
    
    void unsetVersionableHandle();
    
    boolean isSetVersionableHandle();
    
    PathDTO getPath();
    
    void setPath(final PathDTO p0);
    
    void unsetPath();
    
    boolean isSetPath();
}
