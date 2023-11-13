// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

public interface LockEntryDTO
{
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    String getRepositoryItemId();
    
    void setRepositoryItemId(final String p0);
    
    void unsetRepositoryItemId();
    
    boolean isSetRepositoryItemId();
    
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    String getVersionableItemId();
    
    void setVersionableItemId(final String p0);
    
    void unsetVersionableItemId();
    
    boolean isSetVersionableItemId();
}
