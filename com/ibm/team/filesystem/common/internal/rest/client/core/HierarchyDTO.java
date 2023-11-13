// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;
import com.ibm.team.repository.common.model.Helper;

public interface HierarchyDTO extends Helper
{
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    List getAncestorPath();
    
    void unsetAncestorPath();
    
    boolean isSetAncestorPath();
    
    boolean isRoot();
    
    void setRoot(final boolean p0);
    
    void unsetRoot();
    
    boolean isSetRoot();
    
    boolean isBranchContainsCycles();
    
    void setBranchContainsCycles(final boolean p0);
    
    void unsetBranchContainsCycles();
    
    boolean isSetBranchContainsCycles();
    
    boolean isInCycle();
    
    void setInCycle(final boolean p0);
    
    void unsetInCycle();
    
    boolean isSetInCycle();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    boolean isAccessible();
    
    void setAccessible(final boolean p0);
    
    void unsetAccessible();
    
    boolean isSetAccessible();
}
