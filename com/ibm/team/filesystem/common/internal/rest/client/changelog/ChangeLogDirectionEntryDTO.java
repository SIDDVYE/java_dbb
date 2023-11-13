// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

public interface ChangeLogDirectionEntryDTO extends ChangeLogEntryDTO
{
    String getFlowDirection();
    
    void setFlowDirection(final String p0);
    
    void unsetFlowDirection();
    
    boolean isSetFlowDirection();
}
