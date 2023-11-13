// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.impl;

import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import com.ibm.team.filesystem.common.internal.SymbolicLinkHandle;
import com.ibm.team.filesystem.common.internal.SymbolicLink;
import java.util.Map;
import com.ibm.team.filesystem.common.internal.FileContent;
import com.ibm.team.filesystem.common.internal.FileItemHandle;
import com.ibm.team.filesystem.common.internal.FileItem;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.FilesystemFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemFactoryImpl extends EFactoryImpl implements FilesystemFactory
{
    public static FilesystemFactory init() {
        try {
            final FilesystemFactory theFilesystemFactory = (FilesystemFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem");
            if (theFilesystemFactory != null) {
                return theFilesystemFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createFileItem();
            }
            case 1: {
                return (EObject)this.createFileItemHandle();
            }
            case 4: {
                return (EObject)this.createFileContent();
            }
            case 6: {
                return (EObject)this.createProperty();
            }
            case 7: {
                return (EObject)this.createSymbolicLink();
            }
            case 8: {
                return (EObject)this.createSymbolicLinkHandle();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public FileItem createFileItem() {
        final FileItemImpl fileItem = new FileItemImpl();
        return fileItem;
    }
    
    public FileItemHandle createFileItemHandle() {
        final FileItemHandleImpl fileItemHandle = new FileItemHandleImpl();
        return fileItemHandle;
    }
    
    public FileContent createFileContent() {
        final FileContentImpl fileContent = new FileContentImpl();
        return fileContent;
    }
    
    public Map.Entry createProperty() {
        final PropertyImpl property = new PropertyImpl();
        return (Map.Entry)property;
    }
    
    public SymbolicLink createSymbolicLink() {
        final SymbolicLinkImpl symbolicLink = new SymbolicLinkImpl();
        return symbolicLink;
    }
    
    public SymbolicLinkHandle createSymbolicLinkHandle() {
        final SymbolicLinkHandleImpl symbolicLinkHandle = new SymbolicLinkHandleImpl();
        return symbolicLinkHandle;
    }
    
    public FilesystemPackage getFilesystemPackage() {
        return (FilesystemPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemPackage getPackage() {
        return FilesystemPackage.eINSTANCE;
    }
}
