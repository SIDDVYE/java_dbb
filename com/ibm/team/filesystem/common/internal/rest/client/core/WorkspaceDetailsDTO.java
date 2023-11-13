// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;
import com.ibm.team.repository.common.IAuditableHandle;

public interface WorkspaceDetailsDTO
{
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getItemId();
    
    void setItemId(final String p0);
    
    void unsetItemId();
    
    boolean isSetItemId();
    
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    String getDescription();
    
    void setDescription(final String p0);
    
    void unsetDescription();
    
    boolean isSetDescription();
    
    boolean isStream();
    
    void setStream(final boolean p0);
    
    void unsetStream();
    
    boolean isSetStream();
    
    String getExclusiveFileLockPatterns();
    
    void setExclusiveFileLockPatterns(final String p0);
    
    void unsetExclusiveFileLockPatterns();
    
    boolean isSetExclusiveFileLockPatterns();
    
    IAuditableHandle getOwner();
    
    void setOwner(final IAuditableHandle p0);
    
    void unsetOwner();
    
    boolean isSetOwner();
    
    List getComponents();
    
    void unsetComponents();
    
    boolean isSetComponents();
    
    List getComponentHierarchies();
    
    void unsetComponentHierarchies();
    
    boolean isSetComponentHierarchies();
    
    List getFlowEntries();
    
    void unsetFlowEntries();
    
    boolean isSetFlowEntries();
    
    ReadScopeDTO getReadScope();
    
    void setReadScope(final ReadScopeDTO p0);
    
    void unsetReadScope();
    
    boolean isSetReadScope();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
}
