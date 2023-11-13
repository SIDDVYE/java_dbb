// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;

public interface PropertyFailureDTO
{
    PathDTO getFileName();
    
    void setFileName(final PathDTO p0);
    
    void unsetFileName();
    
    boolean isSetFileName();
    
    ShareDTO getShare();
    
    void setShare(final ShareDTO p0);
    
    void unsetShare();
    
    boolean isSetShare();
    
    List getInvalidProperties();
    
    void unsetInvalidProperties();
    
    boolean isSetInvalidProperties();
}
