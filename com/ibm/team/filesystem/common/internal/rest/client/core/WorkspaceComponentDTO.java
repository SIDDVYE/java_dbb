// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;
import com.ibm.team.repository.common.IAuditableHandle;

public interface WorkspaceComponentDTO extends ComponentDTO
{
    BaselineDTO getBaseline();
    
    void setBaseline(final BaselineDTO p0);
    
    void unsetBaseline();
    
    boolean isSetBaseline();
    
    String getRootFolder();
    
    void setRootFolder(final String p0);
    
    void unsetRootFolder();
    
    boolean isSetRootFolder();
    
    IAuditableHandle getOwner();
    
    void setOwner(final IAuditableHandle p0);
    
    void unsetOwner();
    
    boolean isSetOwner();
    
    String getCurrentChangeSetId();
    
    void setCurrentChangeSetId(final String p0);
    
    void unsetCurrentChangeSetId();
    
    boolean isSetCurrentChangeSetId();
    
    ReadScopeDTO getReadScope();
    
    void setReadScope(final ReadScopeDTO p0);
    
    void unsetReadScope();
    
    boolean isSetReadScope();
    
    List getActiveChangeSetIds();
    
    void unsetActiveChangeSetIds();
    
    boolean isSetActiveChangeSetIds();
}
