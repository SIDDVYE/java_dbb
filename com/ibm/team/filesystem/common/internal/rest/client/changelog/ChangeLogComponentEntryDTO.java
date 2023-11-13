// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

public interface ChangeLogComponentEntryDTO extends ChangeLogEntryDTO
{
    String getChangeType();
    
    void setChangeType(final String p0);
    
    void unsetChangeType();
    
    boolean isSetChangeType();
}
