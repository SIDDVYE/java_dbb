// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core;

import java.util.List;

public interface MetronomeServiceDTO extends MetronomeBaseDTO
{
    List getMethods();
    
    void unsetMethods();
    
    boolean isSetMethods();
}
