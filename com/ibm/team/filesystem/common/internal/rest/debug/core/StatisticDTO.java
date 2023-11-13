// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core;

public interface StatisticDTO
{
    String getContextType();
    
    void setContextType(final String p0);
    
    void unsetContextType();
    
    boolean isSetContextType();
    
    String getContext();
    
    void setContext(final String p0);
    
    void unsetContext();
    
    boolean isSetContext();
    
    String getStatisticName();
    
    void setStatisticName(final String p0);
    
    void unsetStatisticName();
    
    boolean isSetStatisticName();
    
    long getValue();
    
    void setValue(final long p0);
    
    void unsetValue();
    
    boolean isSetValue();
}
