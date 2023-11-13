// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.scm.common.dto.ISynchronizationTime;
import java.util.List;

public interface LoadTree
{
    List getFileAreaUpdates();
    
    void unsetFileAreaUpdates();
    
    boolean isSetFileAreaUpdates();
    
    ISynchronizationTime getConfigurationState();
    
    void setConfigurationState(final ISynchronizationTime p0);
    
    void unsetConfigurationState();
    
    boolean isSetConfigurationState();
    
    Inaccessible getInaccessible();
    
    void setInaccessible(final Inaccessible p0);
    
    void unsetInaccessible();
    
    boolean isSetInaccessible();
}
