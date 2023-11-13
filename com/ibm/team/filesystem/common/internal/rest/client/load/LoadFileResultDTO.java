// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;

public interface LoadFileResultDTO
{
    String getFileItemId();
    
    void setFileItemId(final String p0);
    
    void unsetFileItemId();
    
    boolean isSetFileItemId();
    
    String getFileItemStateId();
    
    void setFileItemStateId(final String p0);
    
    void unsetFileItemStateId();
    
    boolean isSetFileItemStateId();
    
    StatusDTO getFailureStatus();
    
    void setFailureStatus(final StatusDTO p0);
    
    void unsetFailureStatus();
    
    boolean isSetFailureStatus();
}
