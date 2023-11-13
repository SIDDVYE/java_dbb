// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.impl;

import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.SymbolicLinkHandle;
import com.ibm.team.scm.common.internal.impl.VersionableHandleImpl;

public class SymbolicLinkHandleImpl extends VersionableHandleImpl implements SymbolicLinkHandle
{
    protected int ALL_FLAGS;
    
    protected SymbolicLinkHandleImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemPackage.Literals.SYMBOLIC_LINK_HANDLE;
    }
}
