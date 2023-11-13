// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;

public interface StatusDTO
{
    int getSeverity();
    
    void setSeverity(final int p0);
    
    void unsetSeverity();
    
    boolean isSetSeverity();
    
    String getPluginId();
    
    void setPluginId(final String p0);
    
    void unsetPluginId();
    
    boolean isSetPluginId();
    
    int getCode();
    
    void setCode(final int p0);
    
    void unsetCode();
    
    boolean isSetCode();
    
    String getMessage();
    
    void setMessage(final String p0);
    
    void unsetMessage();
    
    boolean isSetMessage();
    
    ExceptionDTO getException();
    
    void setException(final ExceptionDTO p0);
    
    void unsetException();
    
    boolean isSetException();
    
    List getChildren();
    
    void unsetChildren();
    
    boolean isSetChildren();
}
