// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;

public interface MultipleSandboxLoadDTO
{
    ConfigurationDescriptorDTO getConfiguration();
    
    void setConfiguration(final ConfigurationDescriptorDTO p0);
    
    void unsetConfiguration();
    
    boolean isSetConfiguration();
    
    List getSandboxes();
    
    void unsetSandboxes();
    
    boolean isSetSandboxes();
    
    List getLoadLocations();
    
    void unsetLoadLocations();
    
    boolean isSetLoadLocations();
}
