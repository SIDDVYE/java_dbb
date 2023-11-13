// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface UnresolvedFolderSyncDTO
{
    List getConflicts();
    
    void unsetConflicts();
    
    boolean isSetConflicts();
    
    List getLocalChanges();
    
    void unsetLocalChanges();
    
    boolean isSetLocalChanges();
    
    String getPath();
    
    void setPath(final String p0);
    
    void unsetPath();
    
    boolean isSetPath();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
}
