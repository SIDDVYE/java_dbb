// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

public interface ChangeLogOslcLinkEntryDTO extends ChangeLogEntryDTO
{
    String getTargetUri();
    
    void setTargetUri(final String p0);
    
    void unsetTargetUri();
    
    boolean isSetTargetUri();
}
