// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.impl;

import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.FileItemHandle;
import com.ibm.team.scm.common.internal.impl.VersionableHandleImpl;

public class FileItemHandleImpl extends VersionableHandleImpl implements FileItemHandle
{
    protected int ALL_FLAGS;
    
    protected FileItemHandleImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemPackage.Literals.FILE_ITEM_HANDLE;
    }
}
