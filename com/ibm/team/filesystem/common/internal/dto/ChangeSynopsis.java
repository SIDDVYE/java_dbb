// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.List;
import com.ibm.team.filesystem.common.IChangeSummary;

public interface ChangeSynopsis extends BasicChange, IChangeSummary
{
    public static final String UNKNOWN_PATH = "<unknown>";
    public static final String COMPONENT_ROOT_FOLDER = "<component root folder>";
    
    List getSourceParentPath();
    
    void unsetSourceParentPath();
    
    boolean isSetSourceParentPath();
    
    List getDestinationParentPath();
    
    void unsetDestinationParentPath();
    
    boolean isSetDestinationParentPath();
}
