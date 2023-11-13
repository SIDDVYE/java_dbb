// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;

public interface LockedShareableDTO
{
    ShareableDTO getLockedShareable();
    
    void setLockedShareable(final ShareableDTO p0);
    
    void unsetLockedShareable();
    
    boolean isSetLockedShareable();
    
    String getVersionableItemId();
    
    void setVersionableItemId(final String p0);
    
    void unsetVersionableItemId();
    
    boolean isSetVersionableItemId();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    String getStreamItemId();
    
    void setStreamItemId(final String p0);
    
    void unsetStreamItemId();
    
    boolean isSetStreamItemId();
}
