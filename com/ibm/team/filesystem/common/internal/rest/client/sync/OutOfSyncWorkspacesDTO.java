// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface OutOfSyncWorkspacesDTO
{
    List getWorkspaces();
    
    void unsetWorkspaces();
    
    boolean isSetWorkspaces();
}
