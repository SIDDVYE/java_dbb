// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface WorkspaceSyncDTO
{
    String getWorkspaceName();
    
    void setWorkspaceName(final String p0);
    
    void unsetWorkspaceName();
    
    boolean isSetWorkspaceName();
    
    boolean isIsStream();
    
    void setIsStream(final boolean p0);
    
    void unsetIsStream();
    
    boolean isSetIsStream();
    
    String getRepositoryUrl();
    
    void setRepositoryUrl(final String p0);
    
    void unsetRepositoryUrl();
    
    boolean isSetRepositoryUrl();
    
    boolean isRepositoryLoggedIn();
    
    void setRepositoryLoggedIn(final boolean p0);
    
    void unsetRepositoryLoggedIn();
    
    boolean isSetRepositoryLoggedIn();
    
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    String getTargetWorkspaceItemId();
    
    void setTargetWorkspaceItemId(final String p0);
    
    void unsetTargetWorkspaceItemId();
    
    boolean isSetTargetWorkspaceItemId();
    
    boolean isTargetRepositoryLoggedIn();
    
    void setTargetRepositoryLoggedIn(final boolean p0);
    
    void unsetTargetRepositoryLoggedIn();
    
    boolean isSetTargetRepositoryLoggedIn();
    
    String getTargetRepositoryId();
    
    void setTargetRepositoryId(final String p0);
    
    void unsetTargetRepositoryId();
    
    boolean isSetTargetRepositoryId();
    
    List getComponents();
    
    void unsetComponents();
    
    boolean isSetComponents();
    
    String getTargetWorkspaceName();
    
    void setTargetWorkspaceName(final String p0);
    
    void unsetTargetWorkspaceName();
    
    boolean isSetTargetWorkspaceName();
    
    String getTargetRepositoryUrl();
    
    void setTargetRepositoryUrl(final String p0);
    
    void unsetTargetRepositoryUrl();
    
    boolean isSetTargetRepositoryUrl();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
}
