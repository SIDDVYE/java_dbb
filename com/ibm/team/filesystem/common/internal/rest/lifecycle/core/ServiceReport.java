// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core;

public interface ServiceReport
{
    boolean isCompatible();
    
    void setCompatible(final boolean p0);
    
    void unsetCompatible();
    
    boolean isSetCompatible();
    
    String getInstalledVersion();
    
    void setInstalledVersion(final String p0);
    
    void unsetInstalledVersion();
    
    boolean isSetInstalledVersion();
}
