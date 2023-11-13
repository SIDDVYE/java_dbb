// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import java.util.List;

public interface InvalidLoadRequestDTO
{
    LoadLocationDTO getLoadLocation();
    
    void setLoadLocation(final LoadLocationDTO p0);
    
    void unsetLoadLocation();
    
    boolean isSetLoadLocation();
    
    List getReason();
    
    void unsetReason();
    
    boolean isSetReason();
}
