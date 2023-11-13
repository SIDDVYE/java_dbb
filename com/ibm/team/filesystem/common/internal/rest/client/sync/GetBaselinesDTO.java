// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface GetBaselinesDTO
{
    long getTotalEntries();
    
    void setTotalEntries(final long p0);
    
    void unsetTotalEntries();
    
    boolean isSetTotalEntries();
    
    List getBaselineHistoryEntriesInWorkspace();
    
    void unsetBaselineHistoryEntriesInWorkspace();
    
    boolean isSetBaselineHistoryEntriesInWorkspace();
    
    List getBaselinesInRepository();
    
    void unsetBaselinesInRepository();
    
    boolean isSetBaselinesInRepository();
}
