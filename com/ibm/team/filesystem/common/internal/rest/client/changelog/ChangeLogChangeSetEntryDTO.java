// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import java.util.List;

public interface ChangeLogChangeSetEntryDTO extends ChangeLogEntryDTO
{
    List getWorkItems();
    
    void unsetWorkItems();
    
    boolean isSetWorkItems();
    
    List getOslcLinks();
    
    void unsetOslcLinks();
    
    boolean isSetOslcLinks();
    
    long getCreationDate();
    
    void setCreationDate(final long p0);
    
    void unsetCreationDate();
    
    boolean isSetCreationDate();
    
    ContributorDTO getCreator();
    
    void setCreator(final ContributorDTO p0);
    
    void unsetCreator();
    
    boolean isSetCreator();
}
