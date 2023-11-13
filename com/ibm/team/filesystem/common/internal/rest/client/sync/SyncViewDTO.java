// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface SyncViewDTO
{
    List getWorkspaces();
    
    void unsetWorkspaces();
    
    boolean isSetWorkspaces();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
}
