// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import java.util.List;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IChangeSetHandle;

public interface IChangeSetSummary
{
    IChangeSetHandle underlyingChange();
    
    IComponentHandle component();
    
    List changes();
}
