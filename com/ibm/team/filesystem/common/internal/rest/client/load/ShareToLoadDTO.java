// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;

public interface ShareToLoadDTO
{
    PathDTO getPath();
    
    void setPath(final PathDTO p0);
    
    void unsetPath();
    
    boolean isSetPath();
    
    LoadLocationDTO getLoadLocation();
    
    void setLoadLocation(final LoadLocationDTO p0);
    
    void unsetLoadLocation();
    
    boolean isSetLoadLocation();
}
