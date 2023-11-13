// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma;

import java.util.List;

public interface SandboxUpdateDilemmaDTO
{
    List getDeletedContentShareables();
    
    void unsetDeletedContentShareables();
    
    boolean isSetDeletedContentShareables();
    
    List getBackedUpToShed();
    
    void unsetBackedUpToShed();
    
    boolean isSetBackedUpToShed();
}
