// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface CEBaselineSyncDTO
{
    List getChangeSets();
    
    void unsetChangeSets();
    
    boolean isSetChangeSets();
}
