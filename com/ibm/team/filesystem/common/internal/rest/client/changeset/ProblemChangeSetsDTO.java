// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import java.util.List;

public interface ProblemChangeSetsDTO
{
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    List getChangeSetItemIds();
    
    void unsetChangeSetItemIds();
    
    boolean isSetChangeSetItemIds();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
}
