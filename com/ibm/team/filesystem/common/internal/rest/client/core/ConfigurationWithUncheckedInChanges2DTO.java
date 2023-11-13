// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

public interface ConfigurationWithUncheckedInChanges2DTO
{
    int getChangeCount();
    
    void setChangeCount(final int p0);
    
    void unsetChangeCount();
    
    boolean isSetChangeCount();
    
    ConfigurationDescriptor2DTO getConfiguration();
    
    void setConfiguration(final ConfigurationDescriptor2DTO p0);
    
    void unsetConfiguration();
    
    boolean isSetConfiguration();
}
