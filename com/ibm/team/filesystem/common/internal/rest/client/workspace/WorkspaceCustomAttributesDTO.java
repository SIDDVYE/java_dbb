// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace;

import java.util.Map;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceDetailsDTO;

public interface WorkspaceCustomAttributesDTO
{
    WorkspaceDetailsDTO getWorkspace();
    
    void setWorkspace(final WorkspaceDetailsDTO p0);
    
    void unsetWorkspace();
    
    boolean isSetWorkspace();
    
    Map getCustomAttributes();
    
    void unsetCustomAttributes();
    
    boolean isSetCustomAttributes();
}
