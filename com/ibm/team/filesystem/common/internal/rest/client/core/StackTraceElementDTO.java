// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

public interface StackTraceElementDTO
{
    String getClassName();
    
    void setClassName(final String p0);
    
    void unsetClassName();
    
    boolean isSetClassName();
    
    String getMethodName();
    
    void setMethodName(final String p0);
    
    void unsetMethodName();
    
    boolean isSetMethodName();
    
    String getFileName();
    
    void setFileName(final String p0);
    
    void unsetFileName();
    
    boolean isSetFileName();
    
    int getLineNumber();
    
    void setLineNumber(final int p0);
    
    void unsetLineNumber();
    
    boolean isSetLineNumber();
}
