// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface CESyncDTO
{
    List getAddedComponents();
    
    void unsetAddedComponents();
    
    boolean isSetAddedComponents();
    
    List getRemovedComponents();
    
    void unsetRemovedComponents();
    
    boolean isSetRemovedComponents();
    
    List getChangedComponents();
    
    void unsetChangedComponents();
    
    boolean isSetChangedComponents();
}
