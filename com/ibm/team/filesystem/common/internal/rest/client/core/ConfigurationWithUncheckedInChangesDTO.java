// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

public interface ConfigurationWithUncheckedInChangesDTO
{
    ConfigurationDescriptorDTO getConfiguration();
    
    void setConfiguration(final ConfigurationDescriptorDTO p0);
    
    void unsetConfiguration();
    
    boolean isSetConfiguration();
    
    int getChangeCount();
    
    void setChangeCount(final int p0);
    
    void unsetChangeCount();
    
    boolean isSetChangeCount();
}
