// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core;

import java.util.Map;

public interface CompatabilityDTO
{
    Map getServices();
    
    void unsetServices();
    
    boolean isSetServices();
}
