// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;

public interface CollisionDTO
{
    PathDTO getPath();
    
    void setPath(final PathDTO p0);
    
    void unsetPath();
    
    boolean isSetPath();
    
    String getDetail();
    
    void setDetail(final String p0);
    
    void unsetDetail();
    
    boolean isSetDetail();
    
    List getLoadLocations();
    
    void unsetLoadLocations();
    
    boolean isSetLoadLocations();
    
    boolean isCollidedWithExistingContent();
    
    void setCollidedWithExistingContent(final boolean p0);
    
    void unsetCollidedWithExistingContent();
    
    boolean isSetCollidedWithExistingContent();
    
    boolean isCollidedWithExistingShare();
    
    void setCollidedWithExistingShare(final boolean p0);
    
    void unsetCollidedWithExistingShare();
    
    boolean isSetCollidedWithExistingShare();
}
