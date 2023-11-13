// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.scm.common.dto.ISynchronizationTime;

public interface LocalChangeUndoReport
{
    FileAreaUpdateReport2 getUpdates();
    
    void setUpdates(final FileAreaUpdateReport2 p0);
    
    void unsetUpdates();
    
    boolean isSetUpdates();
    
    ISynchronizationTime getConfigurationState();
    
    void setConfigurationState(final ISynchronizationTime p0);
    
    void unsetConfigurationState();
    
    boolean isSetConfigurationState();
    
    Inaccessible getInaccessible();
    
    void setInaccessible(final Inaccessible p0);
    
    void unsetInaccessible();
    
    boolean isSetInaccessible();
}
