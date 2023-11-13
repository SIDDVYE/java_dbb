// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import java.util.List;

public interface GapChangeSetsDTO
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
    
    boolean isHandlingSuspended();
    
    void setHandlingSuspended(final boolean p0);
    
    void unsetHandlingSuspended();
    
    boolean isSetHandlingSuspended();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
}
