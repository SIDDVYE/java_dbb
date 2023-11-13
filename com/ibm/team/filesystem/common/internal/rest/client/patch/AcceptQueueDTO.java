// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

import java.util.List;

public interface AcceptQueueDTO
{
    List getAcceptQueue();
    
    void unsetAcceptQueue();
    
    boolean isSetAcceptQueue();
    
    CurrentPatchDTO getCurrentPatch();
    
    void setCurrentPatch(final CurrentPatchDTO p0);
    
    void unsetCurrentPatch();
    
    boolean isSetCurrentPatch();
    
    PageDescriptorDTO getPageDescriptor();
    
    void setPageDescriptor(final PageDescriptorDTO p0);
    
    void unsetPageDescriptor();
    
    boolean isSetPageDescriptor();
}
