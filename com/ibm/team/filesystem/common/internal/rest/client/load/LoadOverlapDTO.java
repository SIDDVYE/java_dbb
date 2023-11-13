// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;

public interface LoadOverlapDTO
{
    LoadLocationDTO getLoadLocation();
    
    void setLoadLocation(final LoadLocationDTO p0);
    
    void unsetLoadLocation();
    
    boolean isSetLoadLocation();
    
    PathDTO getPath();
    
    void setPath(final PathDTO p0);
    
    void unsetPath();
    
    boolean isSetPath();
    
    List getOverlappingShares();
    
    void unsetOverlappingShares();
    
    boolean isSetOverlappingShares();
    
    List getOverlappingItems();
    
    void unsetOverlappingItems();
    
    boolean isSetOverlappingItems();
}
