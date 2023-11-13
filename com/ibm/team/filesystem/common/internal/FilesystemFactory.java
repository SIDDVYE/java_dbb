// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import com.ibm.team.filesystem.common.internal.impl.FilesystemFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemFactory extends EFactory
{
    public static final FilesystemFactory eINSTANCE = FilesystemFactoryImpl.init();
    
    FileItem createFileItem();
    
    FileItemHandle createFileItemHandle();
    
    FileContent createFileContent();
    
    SymbolicLink createSymbolicLink();
    
    SymbolicLinkHandle createSymbolicLinkHandle();
    
    FilesystemPackage getFilesystemPackage();
}
