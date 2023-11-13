// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;

public interface WorkspaceFlowEntryDTO
{
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    List getScopedComponentItemIds();
    
    void unsetScopedComponentItemIds();
    
    boolean isSetScopedComponentItemIds();
    
    boolean isDefaultFlow();
    
    void setDefaultFlow(final boolean p0);
    
    void unsetDefaultFlow();
    
    boolean isSetDefaultFlow();
    
    boolean isCurrentFlow();
    
    void setCurrentFlow(final boolean p0);
    
    void unsetCurrentFlow();
    
    boolean isSetCurrentFlow();
}
