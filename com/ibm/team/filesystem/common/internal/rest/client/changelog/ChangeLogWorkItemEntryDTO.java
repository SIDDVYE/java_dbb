// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;

public interface ChangeLogWorkItemEntryDTO extends ChangeLogEntryDTO
{
    long getWorkItemNumber();
    
    void setWorkItemNumber(final long p0);
    
    void unsetWorkItemNumber();
    
    boolean isSetWorkItemNumber();
    
    ContributorDTO getResolver();
    
    void setResolver(final ContributorDTO p0);
    
    void unsetResolver();
    
    boolean isSetResolver();
}
