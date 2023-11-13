// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.List;
import com.ibm.team.scm.common.dto.IUpdateReport;

public interface Resolution
{
    IUpdateReport getUpdateReport();
    
    void setUpdateReport(final IUpdateReport p0);
    
    void unsetUpdateReport();
    
    boolean isSetUpdateReport();
    
    List getChangeSet();
    
    void unsetChangeSet();
    
    boolean isSetChangeSet();
}
