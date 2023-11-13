// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

public interface ConfigurationDescriptorDTO
{
    ConnectionDescriptorDTO getConnection();
    
    void setConnection(final ConnectionDescriptorDTO p0);
    
    void unsetConnection();
    
    boolean isSetConnection();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
}
