// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import com.ibm.team.filesystem.common.ISymbolicLinkHandle;
import com.ibm.team.filesystem.common.ISymbolicLink;
import com.ibm.team.filesystem.common.internal.SymbolicLinkHandle;
import com.ibm.team.filesystem.common.internal.SymbolicLink;
import java.util.Map;
import com.ibm.team.repository.common.IHelper;
import com.ibm.team.scm.common.IVersionedContent;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.filesystem.common.IFileContent;
import com.ibm.team.scm.common.internal.VersionedContent;
import com.ibm.team.filesystem.common.internal.FileContent;
import com.ibm.team.repository.common.IItemHandle;
import com.ibm.team.repository.common.IUnmanagedItemHandle;
import com.ibm.team.repository.common.IItem;
import com.ibm.team.repository.common.model.ItemHandle;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.repository.common.IUnmanagedItem;
import com.ibm.team.repository.common.model.UnmanagedItemHandle;
import com.ibm.team.repository.common.model.Item;
import com.ibm.team.filesystem.common.IFileItemHandle;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.VersionableHandle;
import com.ibm.team.repository.common.model.UnmanagedItem;
import com.ibm.team.filesystem.common.IFileItem;
import com.ibm.team.filesystem.common.internal.FileItemHandle;
import com.ibm.team.scm.common.internal.Versionable;
import com.ibm.team.filesystem.common.internal.FileItem;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;

public class FilesystemSwitch
{
    protected static FilesystemPackage modelPackage;
    
    public FilesystemSwitch() {
        if (FilesystemSwitch.modelPackage == null) {
            FilesystemSwitch.modelPackage = FilesystemPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final FileItem fileItem = (FileItem)theEObject;
                Object result = this.caseFileItem(fileItem);
                if (result == null) {
                    result = this.caseVersionable((Versionable)fileItem);
                }
                if (result == null) {
                    result = this.caseFileItemHandle(fileItem);
                }
                if (result == null) {
                    result = this.caseFileItemFacade(fileItem);
                }
                if (result == null) {
                    result = this.caseUnmanagedItem((UnmanagedItem)fileItem);
                }
                if (result == null) {
                    result = this.caseVersionableHandle((VersionableHandle)fileItem);
                }
                if (result == null) {
                    result = this.caseVersionableFacade((IVersionable)fileItem);
                }
                if (result == null) {
                    result = this.caseFileItemHandleFacade(fileItem);
                }
                if (result == null) {
                    result = this.caseItem((Item)fileItem);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemHandle((UnmanagedItemHandle)fileItem);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemFacade((IUnmanagedItem)fileItem);
                }
                if (result == null) {
                    result = this.caseVersionableHandleFacade((IVersionableHandle)fileItem);
                }
                if (result == null) {
                    result = this.caseItemHandle((ItemHandle)fileItem);
                }
                if (result == null) {
                    result = this.caseItemFacade((IItem)fileItem);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemHandleFacade((IUnmanagedItemHandle)fileItem);
                }
                if (result == null) {
                    result = this.caseItemHandleFacade((IItemHandle)fileItem);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final FileItemHandle fileItemHandle = (FileItemHandle)theEObject;
                Object result = this.caseFileItemHandle(fileItemHandle);
                if (result == null) {
                    result = this.caseVersionableHandle((VersionableHandle)fileItemHandle);
                }
                if (result == null) {
                    result = this.caseFileItemHandleFacade(fileItemHandle);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemHandle((UnmanagedItemHandle)fileItemHandle);
                }
                if (result == null) {
                    result = this.caseVersionableHandleFacade((IVersionableHandle)fileItemHandle);
                }
                if (result == null) {
                    result = this.caseItemHandle((ItemHandle)fileItemHandle);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemHandleFacade((IUnmanagedItemHandle)fileItemHandle);
                }
                if (result == null) {
                    result = this.caseItemHandleFacade((IItemHandle)fileItemHandle);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final FileContent fileContent = (FileContent)theEObject;
                Object result = this.caseFileContent(fileContent);
                if (result == null) {
                    result = this.caseVersionedContent((VersionedContent)fileContent);
                }
                if (result == null) {
                    result = this.caseFileContentFacade(fileContent);
                }
                if (result == null) {
                    result = this.caseHelper((Helper)fileContent);
                }
                if (result == null) {
                    result = this.caseVersionedContentFacade((IVersionedContent)fileContent);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)fileContent);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final Map.Entry property = (Map.Entry)theEObject;
                Object result = this.caseProperty(property);
                if (result == null) {
                    result = this.caseHelper((Helper)property);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)property);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final SymbolicLink symbolicLink = (SymbolicLink)theEObject;
                Object result = this.caseSymbolicLink(symbolicLink);
                if (result == null) {
                    result = this.caseVersionable((Versionable)symbolicLink);
                }
                if (result == null) {
                    result = this.caseSymbolicLinkHandle(symbolicLink);
                }
                if (result == null) {
                    result = this.caseSymbolicLinkFacade(symbolicLink);
                }
                if (result == null) {
                    result = this.caseUnmanagedItem((UnmanagedItem)symbolicLink);
                }
                if (result == null) {
                    result = this.caseVersionableHandle((VersionableHandle)symbolicLink);
                }
                if (result == null) {
                    result = this.caseVersionableFacade((IVersionable)symbolicLink);
                }
                if (result == null) {
                    result = this.caseSymbolicLinkHandleFacade(symbolicLink);
                }
                if (result == null) {
                    result = this.caseItem((Item)symbolicLink);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemHandle((UnmanagedItemHandle)symbolicLink);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemFacade((IUnmanagedItem)symbolicLink);
                }
                if (result == null) {
                    result = this.caseVersionableHandleFacade((IVersionableHandle)symbolicLink);
                }
                if (result == null) {
                    result = this.caseItemHandle((ItemHandle)symbolicLink);
                }
                if (result == null) {
                    result = this.caseItemFacade((IItem)symbolicLink);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemHandleFacade((IUnmanagedItemHandle)symbolicLink);
                }
                if (result == null) {
                    result = this.caseItemHandleFacade((IItemHandle)symbolicLink);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final SymbolicLinkHandle symbolicLinkHandle = (SymbolicLinkHandle)theEObject;
                Object result = this.caseSymbolicLinkHandle(symbolicLinkHandle);
                if (result == null) {
                    result = this.caseVersionableHandle((VersionableHandle)symbolicLinkHandle);
                }
                if (result == null) {
                    result = this.caseSymbolicLinkHandleFacade(symbolicLinkHandle);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemHandle((UnmanagedItemHandle)symbolicLinkHandle);
                }
                if (result == null) {
                    result = this.caseVersionableHandleFacade((IVersionableHandle)symbolicLinkHandle);
                }
                if (result == null) {
                    result = this.caseItemHandle((ItemHandle)symbolicLinkHandle);
                }
                if (result == null) {
                    result = this.caseUnmanagedItemHandleFacade((IUnmanagedItemHandle)symbolicLinkHandle);
                }
                if (result == null) {
                    result = this.caseItemHandleFacade((IItemHandle)symbolicLinkHandle);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            default: {
                return this.defaultCase(theEObject);
            }
        }
    }
    
    public Object caseFileItem(final FileItem object) {
        return null;
    }
    
    public Object caseFileItemHandle(final FileItemHandle object) {
        return null;
    }
    
    public Object caseFileItemHandleFacade(final IFileItemHandle object) {
        return null;
    }
    
    public Object caseFileItemFacade(final IFileItem object) {
        return null;
    }
    
    public Object caseFileContent(final FileContent object) {
        return null;
    }
    
    public Object caseFileContentFacade(final IFileContent object) {
        return null;
    }
    
    public Object caseProperty(final Map.Entry object) {
        return null;
    }
    
    public Object caseSymbolicLink(final SymbolicLink object) {
        return null;
    }
    
    public Object caseSymbolicLinkHandle(final SymbolicLinkHandle object) {
        return null;
    }
    
    public Object caseSymbolicLinkHandleFacade(final ISymbolicLinkHandle object) {
        return null;
    }
    
    public Object caseSymbolicLinkFacade(final ISymbolicLink object) {
        return null;
    }
    
    public Object caseItemHandleFacade(final IItemHandle object) {
        return null;
    }
    
    public Object caseItemHandle(final ItemHandle object) {
        return null;
    }
    
    public Object caseItemFacade(final IItem object) {
        return null;
    }
    
    public Object caseItem(final Item object) {
        return null;
    }
    
    public Object caseUnmanagedItemHandleFacade(final IUnmanagedItemHandle object) {
        return null;
    }
    
    public Object caseUnmanagedItemHandle(final UnmanagedItemHandle object) {
        return null;
    }
    
    public Object caseUnmanagedItemFacade(final IUnmanagedItem object) {
        return null;
    }
    
    public Object caseUnmanagedItem(final UnmanagedItem object) {
        return null;
    }
    
    public Object caseVersionableHandleFacade(final IVersionableHandle object) {
        return null;
    }
    
    public Object caseVersionableHandle(final VersionableHandle object) {
        return null;
    }
    
    public Object caseVersionableFacade(final IVersionable object) {
        return null;
    }
    
    public Object caseVersionable(final Versionable object) {
        return null;
    }
    
    public Object caseHelperFacade(final IHelper object) {
        return null;
    }
    
    public Object caseHelper(final Helper object) {
        return null;
    }
    
    public Object caseVersionedContentFacade(final IVersionedContent object) {
        return null;
    }
    
    public Object caseVersionedContent(final VersionedContent object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
