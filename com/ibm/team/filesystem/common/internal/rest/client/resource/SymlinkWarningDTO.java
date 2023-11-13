// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

public interface SymlinkWarningDTO
{
    String getLocation();
    
    void setLocation(final String p0);
    
    void unsetLocation();
    
    boolean isSetLocation();
    
    String getTarget();
    
    void setTarget(final String p0);
    
    void unsetTarget();
    
    boolean isSetTarget();
    
    String getType();
    
    void setType(final String p0);
    
    void unsetType();
    
    boolean isSetType();
    
    String getSandboxLocation();
    
    void setSandboxLocation(final String p0);
    
    void unsetSandboxLocation();
    
    boolean isSetSandboxLocation();
}
