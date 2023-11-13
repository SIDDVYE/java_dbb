// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core;

public interface MetronomeBaseDTO
{
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    long getElapsedTime();
    
    void setElapsedTime(final long p0);
    
    void unsetElapsedTime();
    
    boolean isSetElapsedTime();
    
    long getCallCount();
    
    void setCallCount(final long p0);
    
    void unsetCallCount();
    
    boolean isSetCallCount();
}
