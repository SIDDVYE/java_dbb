// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import java.util.List;

public interface StructuredUpdateReportDTO
{
    String getRepositoryUrl();
    
    void setRepositoryUrl(final String p0);
    
    void unsetRepositoryUrl();
    
    boolean isSetRepositoryUrl();
    
    String getWorkspaceName();
    
    void setWorkspaceName(final String p0);
    
    void unsetWorkspaceName();
    
    boolean isSetWorkspaceName();
    
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    boolean isHasConflicts();
    
    void setHasConflicts(final boolean p0);
    
    void unsetHasConflicts();
    
    boolean isSetHasConflicts();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    List getComponents();
    
    void unsetComponents();
    
    boolean isSetComponents();
}
