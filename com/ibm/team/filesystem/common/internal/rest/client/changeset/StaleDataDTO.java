// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

public interface StaleDataDTO
{
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getSourceRepositoryId();
    
    void setSourceRepositoryId(final String p0);
    
    void unsetSourceRepositoryId();
    
    boolean isSetSourceRepositoryId();
    
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    String getSourceRepositoryURL();
    
    void setSourceRepositoryURL(final String p0);
    
    void unsetSourceRepositoryURL();
    
    boolean isSetSourceRepositoryURL();
    
    String getSourceWorkspaceItemId();
    
    void setSourceWorkspaceItemId(final String p0);
    
    void unsetSourceWorkspaceItemId();
    
    boolean isSetSourceWorkspaceItemId();
}
