// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;

public interface ExceptionDTO
{
    String getMessage();
    
    void setMessage(final String p0);
    
    void unsetMessage();
    
    boolean isSetMessage();
    
    List getStackTrace();
    
    void unsetStackTrace();
    
    boolean isSetStackTrace();
    
    ExceptionDTO getCause();
    
    void setCause(final ExceptionDTO p0);
    
    void unsetCause();
    
    boolean isSetCause();
}
