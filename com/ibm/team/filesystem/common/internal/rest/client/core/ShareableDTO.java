// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

public interface ShareableDTO
{
    String getSandboxPath();
    
    void setSandboxPath(final String p0);
    
    void unsetSandboxPath();
    
    boolean isSetSandboxPath();
    
    PathDTO getRelativePath();
    
    void setRelativePath(final PathDTO p0);
    
    void unsetRelativePath();
    
    boolean isSetRelativePath();
}
