// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

public interface ConnectionDescriptorDTO
{
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getContextItemId();
    
    void setContextItemId(final String p0);
    
    void unsetContextItemId();
    
    boolean isSetContextItemId();
    
    boolean isIsWorkspaceContext();
    
    void setIsWorkspaceContext(final boolean p0);
    
    void unsetIsWorkspaceContext();
    
    boolean isSetIsWorkspaceContext();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
}
