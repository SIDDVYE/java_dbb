// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface OutOfSyncWorkspaceDTO
{
    String getRepositoryUrl();
    
    void setRepositoryUrl(final String p0);
    
    void unsetRepositoryUrl();
    
    boolean isSetRepositoryUrl();
    
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    List getComponents();
    
    void unsetComponents();
    
    boolean isSetComponents();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
}
