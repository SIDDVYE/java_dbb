// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

public interface LoadLocationDTO
{
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    String getContextItemId();
    
    void setContextItemId(final String p0);
    
    void unsetContextItemId();
    
    boolean isSetContextItemId();
    
    boolean isIsWorkspaceContext();
    
    void setIsWorkspaceContext(final boolean p0);
    
    void unsetIsWorkspaceContext();
    
    boolean isSetIsWorkspaceContext();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    String getVersionableItemId();
    
    void setVersionableItemId(final String p0);
    
    void unsetVersionableItemId();
    
    boolean isSetVersionableItemId();
    
    String getVersionableItemType();
    
    void setVersionableItemType(final String p0);
    
    void unsetVersionableItemType();
    
    boolean isSetVersionableItemType();
}
