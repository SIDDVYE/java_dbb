// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;

public interface PathDTO
{
    List getSegments();
    
    void unsetSegments();
    
    boolean isSetSegments();
}
