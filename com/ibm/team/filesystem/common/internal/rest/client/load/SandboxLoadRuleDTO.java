// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptorDTO;

public interface SandboxLoadRuleDTO
{
    String getRule();
    
    void setRule(final String p0);
    
    void unsetRule();
    
    boolean isSetRule();
    
    ConnectionDescriptorDTO getConnection();
    
    void setConnection(final ConnectionDescriptorDTO p0);
    
    void unsetConnection();
    
    boolean isSetConnection();
}
