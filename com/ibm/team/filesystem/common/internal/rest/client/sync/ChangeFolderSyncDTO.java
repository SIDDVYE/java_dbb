// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface ChangeFolderSyncDTO
{
    String getPath();
    
    void setPath(final String p0);
    
    void unsetPath();
    
    boolean isSetPath();
    
    List getChanges();
    
    void unsetChanges();
    
    boolean isSetChanges();
    
    ChangeSyncDTO getFolderChange();
    
    void setFolderChange(final ChangeSyncDTO p0);
    
    void unsetFolderChange();
    
    boolean isSetFolderChange();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
}
