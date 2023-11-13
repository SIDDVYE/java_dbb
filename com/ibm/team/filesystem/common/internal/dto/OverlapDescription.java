// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.List;
import com.ibm.team.scm.common.IVersionableHandle;

public interface OverlapDescription
{
    IVersionableHandle getElement();
    
    void setElement(final IVersionableHandle p0);
    
    void unsetElement();
    
    boolean isSetElement();
    
    List getOverlappedChildren();
    
    void unsetOverlappedChildren();
    
    boolean isSetOverlappedChildren();
}
