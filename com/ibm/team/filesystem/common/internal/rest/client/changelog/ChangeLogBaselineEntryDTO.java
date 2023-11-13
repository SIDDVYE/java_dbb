// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;

public interface ChangeLogBaselineEntryDTO extends ChangeLogEntryDTO
{
    int getBaselineId();
    
    void setBaselineId(final int p0);
    
    void unsetBaselineId();
    
    boolean isSetBaselineId();
    
    long getCreationDate();
    
    void setCreationDate(final long p0);
    
    void unsetCreationDate();
    
    boolean isSetCreationDate();
    
    ContributorDTO getCreator();
    
    void setCreator(final ContributorDTO p0);
    
    void unsetCreator();
    
    boolean isSetCreator();
}
