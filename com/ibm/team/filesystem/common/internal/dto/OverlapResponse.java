// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.scm.common.IContextHandle;
import java.util.List;
import com.ibm.team.scm.common.IBaselineHandle;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IWorkspaceHandle;

public interface OverlapResponse
{
    IWorkspaceHandle getWorkspace();
    
    void setWorkspace(final IWorkspaceHandle p0);
    
    void unsetWorkspace();
    
    boolean isSetWorkspace();
    
    IComponentHandle getComponent();
    
    void setComponent(final IComponentHandle p0);
    
    void unsetComponent();
    
    boolean isSetComponent();
    
    IBaselineHandle getBaseline();
    
    void setBaseline(final IBaselineHandle p0);
    
    void unsetBaseline();
    
    boolean isSetBaseline();
    
    List getOverlapDescriptions();
    
    void unsetOverlapDescriptions();
    
    boolean isSetOverlapDescriptions();
    
    List getAncestorReports();
    
    void unsetAncestorReports();
    
    boolean isSetAncestorReports();
    
    void setContext(final IContextHandle p0);
    
    IContextHandle getContext();
}
