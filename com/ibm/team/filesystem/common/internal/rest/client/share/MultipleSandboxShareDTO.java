// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share;

import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;

public interface MultipleSandboxShareDTO
{
    ConfigurationDescriptorDTO getConfiguration();
    
    void setConfiguration(final ConfigurationDescriptorDTO p0);
    
    void unsetConfiguration();
    
    boolean isSetConfiguration();
    
    List getSandboxes();
    
    void unsetSandboxes();
    
    boolean isSetSandboxes();
    
    List getRoots();
    
    void unsetRoots();
    
    boolean isSetRoots();
}
