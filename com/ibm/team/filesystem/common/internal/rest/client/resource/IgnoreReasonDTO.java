// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;

public interface IgnoreReasonDTO
{
    PathDTO getInheritsFrom();
    
    void setInheritsFrom(final PathDTO p0);
    
    void unsetInheritsFrom();
    
    boolean isSetInheritsFrom();
    
    List getRules();
    
    void unsetRules();
    
    boolean isSetRules();
}
