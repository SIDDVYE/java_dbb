// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

import java.util.List;

public interface ChangeLogVersionableEntryDTO extends ChangeLogEntryDTO
{
    List getSegments();
    
    void unsetSegments();
    
    boolean isSetSegments();
    
    boolean isResolved();
    
    void setResolved(final boolean p0);
    
    void unsetResolved();
    
    boolean isSetResolved();
}
