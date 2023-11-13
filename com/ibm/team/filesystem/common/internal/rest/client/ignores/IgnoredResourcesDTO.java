// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores;

import java.util.List;

public interface IgnoredResourcesDTO
{
    List getIgnoredFiles();
    
    void unsetIgnoredFiles();
    
    boolean isSetIgnoredFiles();
    
    List getIgnoredFolders();
    
    void unsetIgnoredFolders();
    
    boolean isSetIgnoredFolders();
    
    List getIgnoredSymbolicLinks();
    
    void unsetIgnoredSymbolicLinks();
    
    boolean isSetIgnoredSymbolicLinks();
    
    List getUnknownPaths();
    
    void unsetUnknownPaths();
    
    boolean isSetUnknownPaths();
}
