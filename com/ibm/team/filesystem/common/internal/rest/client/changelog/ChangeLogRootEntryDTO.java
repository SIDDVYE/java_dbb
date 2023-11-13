// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

public interface ChangeLogRootEntryDTO extends ChangeLogEntryDTO
{
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    String getRepositoryUri();
    
    void setRepositoryUri(final String p0);
    
    void unsetRepositoryUri();
    
    boolean isSetRepositoryUri();
}
