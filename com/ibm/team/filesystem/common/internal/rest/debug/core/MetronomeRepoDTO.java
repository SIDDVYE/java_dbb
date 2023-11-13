// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core;

import java.util.List;

public interface MetronomeRepoDTO
{
    String getUri();
    
    void setUri(final String p0);
    
    void unsetUri();
    
    boolean isSetUri();
    
    String getRepoId();
    
    void setRepoId(final String p0);
    
    void unsetRepoId();
    
    boolean isSetRepoId();
    
    List getServices();
    
    void unsetServices();
    
    boolean isSetServices();
}
