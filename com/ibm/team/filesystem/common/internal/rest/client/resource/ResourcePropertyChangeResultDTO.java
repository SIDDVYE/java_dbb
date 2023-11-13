// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import java.util.List;

public interface ResourcePropertyChangeResultDTO
{
    boolean isCancelled();
    
    void setCancelled(final boolean p0);
    
    void unsetCancelled();
    
    boolean isSetCancelled();
    
    List getLineDelimiterFailures();
    
    void unsetLineDelimiterFailures();
    
    boolean isSetLineDelimiterFailures();
    
    List getBackedUpToShed();
    
    void unsetBackedUpToShed();
    
    boolean isSetBackedUpToShed();
    
    List getPropertyFailures();
    
    void unsetPropertyFailures();
    
    boolean isSetPropertyFailures();
    
    List getMimeTypeFailures();
    
    void unsetMimeTypeFailures();
    
    boolean isSetMimeTypeFailures();
    
    List getExecutableFailures();
    
    void unsetExecutableFailures();
    
    boolean isSetExecutableFailures();
}
