// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

public interface RemoveChangeRequestDTO
{
    boolean isLinkRemoved();
    
    void setLinkRemoved(final boolean p0);
    
    void unsetLinkRemoved();
    
    boolean isSetLinkRemoved();
    
    boolean isBackLinkRemoved();
    
    void setBackLinkRemoved(final boolean p0);
    
    void unsetBackLinkRemoved();
    
    boolean isSetBackLinkRemoved();
}
