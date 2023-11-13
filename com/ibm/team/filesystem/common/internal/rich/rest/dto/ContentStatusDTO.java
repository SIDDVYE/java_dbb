// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rich.rest.dto;

public interface ContentStatusDTO
{
    String getStatus();
    
    void setStatus(final String p0);
    
    void unsetStatus();
    
    boolean isSetStatus();
    
    String getDeletedByContributorId();
    
    void setDeletedByContributorId(final String p0);
    
    void unsetDeletedByContributorId();
    
    boolean isSetDeletedByContributorId();
    
    long getDeletedOn();
    
    void setDeletedOn(final long p0);
    
    void unsetDeletedOn();
    
    boolean isSetDeletedOn();
}
