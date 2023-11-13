// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import java.util.List;

public interface LoadFileOperationResultDTO
{
    List getFileResults();
    
    void unsetFileResults();
    
    boolean isSetFileResults();
    
    List getBackedUpToShed();
    
    void unsetBackedUpToShed();
    
    boolean isSetBackedUpToShed();
    
    List getDeletedContentLocations();
    
    void unsetDeletedContentLocations();
    
    boolean isSetDeletedContentLocations();
    
    List getLocalChangeLocations();
    
    void unsetLocalChangeLocations();
    
    boolean isSetLocalChangeLocations();
    
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
}
