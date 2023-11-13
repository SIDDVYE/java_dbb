// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;

public interface ComponentHierarchyDTO extends HierarchyDTO
{
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    List getSubcomponents();
    
    void unsetSubcomponents();
    
    boolean isSetSubcomponents();
    
    boolean isInWorkspace();
    
    void setInWorkspace(final boolean p0);
    
    void unsetInWorkspace();
    
    boolean isSetInWorkspace();
}
