// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core;

import java.util.List;

public interface MetronomeStatisticsDTO
{
    List getMethodStats();
    
    void unsetMethodStats();
    
    boolean isSetMethodStats();
    
    List getServiceStats();
    
    void unsetServiceStats();
    
    boolean isSetServiceStats();
}
