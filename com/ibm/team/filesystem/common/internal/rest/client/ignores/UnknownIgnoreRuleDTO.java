// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores;

public interface UnknownIgnoreRuleDTO extends IgnoreRuleDTO
{
    String getProviderType();
    
    void setProviderType(final String p0);
    
    void unsetProviderType();
    
    boolean isSetProviderType();
    
    String getDescription();
    
    void setDescription(final String p0);
    
    void unsetDescription();
    
    boolean isSetDescription();
}
