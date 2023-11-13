// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.scm.common.IContextHandle;
import java.util.List;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IBaselineHandle;
import com.ibm.team.scm.common.IWorkspaceHandle;

public interface SharePoint
{
    IWorkspaceHandle getWorkspace();
    
    void setWorkspace(final IWorkspaceHandle p0);
    
    void unsetWorkspace();
    
    boolean isSetWorkspace();
    
    IBaselineHandle getBaseline();
    
    void setBaseline(final IBaselineHandle p0);
    
    void unsetBaseline();
    
    boolean isSetBaseline();
    
    IComponentHandle getComponent();
    
    void setComponent(final IComponentHandle p0);
    
    void unsetComponent();
    
    boolean isSetComponent();
    
    IVersionableHandle getVersionable();
    
    void setVersionable(final IVersionableHandle p0);
    
    void unsetVersionable();
    
    boolean isSetVersionable();
    
    String getCopyFileArea();
    
    void setCopyFileArea(final String p0);
    
    void unsetCopyFileArea();
    
    boolean isSetCopyFileArea();
    
    List getRelativePath();
    
    void unsetRelativePath();
    
    boolean isSetRelativePath();
    
    void setContext(final IContextHandle p0);
    
    IContextHandle getContext();
}
