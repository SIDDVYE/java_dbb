// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

public interface ChangeLogVersionableEntry2DTO extends ChangeLogVersionableEntryDTO
{
    String getShortVersionId();
    
    void setShortVersionId(final String p0);
    
    void unsetShortVersionId();
    
    boolean isSetShortVersionId();
    
    String getLongVersionId();
    
    void setLongVersionId(final String p0);
    
    void unsetLongVersionId();
    
    boolean isSetLongVersionId();
}
