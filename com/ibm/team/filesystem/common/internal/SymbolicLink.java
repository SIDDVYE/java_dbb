// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import com.ibm.team.filesystem.common.ISymbolicLink;
import com.ibm.team.scm.common.internal.Versionable;

public interface SymbolicLink extends Versionable, SymbolicLinkHandle, ISymbolicLink
{
    String getTarget();
    
    void setTarget(final String p0);
    
    void unsetTarget();
    
    boolean isSetTarget();
}
