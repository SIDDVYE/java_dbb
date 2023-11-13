// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.scm.common.internal.VersionedContent;
import com.ibm.team.scm.common.IVersionedContent;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.repository.common.IHelper;
import com.ibm.team.scm.common.internal.Versionable;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.VersionableHandle;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.repository.common.model.UnmanagedItem;
import com.ibm.team.repository.common.IUnmanagedItem;
import com.ibm.team.repository.common.model.UnmanagedItemHandle;
import com.ibm.team.repository.common.IUnmanagedItemHandle;
import com.ibm.team.repository.common.model.Item;
import com.ibm.team.repository.common.IItem;
import com.ibm.team.repository.common.model.ItemHandle;
import com.ibm.team.repository.common.IItemHandle;
import com.ibm.team.filesystem.common.ISymbolicLink;
import com.ibm.team.filesystem.common.ISymbolicLinkHandle;
import com.ibm.team.filesystem.common.internal.SymbolicLinkHandle;
import com.ibm.team.filesystem.common.internal.SymbolicLink;
import java.util.Map;
import com.ibm.team.filesystem.common.IFileContent;
import com.ibm.team.filesystem.common.internal.FileContent;
import com.ibm.team.filesystem.common.IFileItem;
import com.ibm.team.filesystem.common.IFileItemHandle;
import com.ibm.team.filesystem.common.internal.FileItemHandle;
import com.ibm.team.filesystem.common.internal.FileItem;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemPackage modelPackage;
    protected FilesystemSwitch modelSwitch;
    
    public FilesystemAdapterFactory() {
        this.modelSwitch = new FilesystemSwitch() {
            @Override
            public Object caseFileItem(final FileItem object) {
                return FilesystemAdapterFactory.this.createFileItemAdapter();
            }
            
            @Override
            public Object caseFileItemHandle(final FileItemHandle object) {
                return FilesystemAdapterFactory.this.createFileItemHandleAdapter();
            }
            
            @Override
            public Object caseFileItemHandleFacade(final IFileItemHandle object) {
                return FilesystemAdapterFactory.this.createFileItemHandleFacadeAdapter();
            }
            
            @Override
            public Object caseFileItemFacade(final IFileItem object) {
                return FilesystemAdapterFactory.this.createFileItemFacadeAdapter();
            }
            
            @Override
            public Object caseFileContent(final FileContent object) {
                return FilesystemAdapterFactory.this.createFileContentAdapter();
            }
            
            @Override
            public Object caseFileContentFacade(final IFileContent object) {
                return FilesystemAdapterFactory.this.createFileContentFacadeAdapter();
            }
            
            @Override
            public Object caseProperty(final Map.Entry object) {
                return FilesystemAdapterFactory.this.createPropertyAdapter();
            }
            
            @Override
            public Object caseSymbolicLink(final SymbolicLink object) {
                return FilesystemAdapterFactory.this.createSymbolicLinkAdapter();
            }
            
            @Override
            public Object caseSymbolicLinkHandle(final SymbolicLinkHandle object) {
                return FilesystemAdapterFactory.this.createSymbolicLinkHandleAdapter();
            }
            
            @Override
            public Object caseSymbolicLinkHandleFacade(final ISymbolicLinkHandle object) {
                return FilesystemAdapterFactory.this.createSymbolicLinkHandleFacadeAdapter();
            }
            
            @Override
            public Object caseSymbolicLinkFacade(final ISymbolicLink object) {
                return FilesystemAdapterFactory.this.createSymbolicLinkFacadeAdapter();
            }
            
            @Override
            public Object caseItemHandleFacade(final IItemHandle object) {
                return FilesystemAdapterFactory.this.createItemHandleFacadeAdapter();
            }
            
            @Override
            public Object caseItemHandle(final ItemHandle object) {
                return FilesystemAdapterFactory.this.createItemHandleAdapter();
            }
            
            @Override
            public Object caseItemFacade(final IItem object) {
                return FilesystemAdapterFactory.this.createItemFacadeAdapter();
            }
            
            @Override
            public Object caseItem(final Item object) {
                return FilesystemAdapterFactory.this.createItemAdapter();
            }
            
            @Override
            public Object caseUnmanagedItemHandleFacade(final IUnmanagedItemHandle object) {
                return FilesystemAdapterFactory.this.createUnmanagedItemHandleFacadeAdapter();
            }
            
            @Override
            public Object caseUnmanagedItemHandle(final UnmanagedItemHandle object) {
                return FilesystemAdapterFactory.this.createUnmanagedItemHandleAdapter();
            }
            
            @Override
            public Object caseUnmanagedItemFacade(final IUnmanagedItem object) {
                return FilesystemAdapterFactory.this.createUnmanagedItemFacadeAdapter();
            }
            
            @Override
            public Object caseUnmanagedItem(final UnmanagedItem object) {
                return FilesystemAdapterFactory.this.createUnmanagedItemAdapter();
            }
            
            @Override
            public Object caseVersionableHandleFacade(final IVersionableHandle object) {
                return FilesystemAdapterFactory.this.createVersionableHandleFacadeAdapter();
            }
            
            @Override
            public Object caseVersionableHandle(final VersionableHandle object) {
                return FilesystemAdapterFactory.this.createVersionableHandleAdapter();
            }
            
            @Override
            public Object caseVersionableFacade(final IVersionable object) {
                return FilesystemAdapterFactory.this.createVersionableFacadeAdapter();
            }
            
            @Override
            public Object caseVersionable(final Versionable object) {
                return FilesystemAdapterFactory.this.createVersionableAdapter();
            }
            
            @Override
            public Object caseHelperFacade(final IHelper object) {
                return FilesystemAdapterFactory.this.createHelperFacadeAdapter();
            }
            
            @Override
            public Object caseHelper(final Helper object) {
                return FilesystemAdapterFactory.this.createHelperAdapter();
            }
            
            @Override
            public Object caseVersionedContentFacade(final IVersionedContent object) {
                return FilesystemAdapterFactory.this.createVersionedContentFacadeAdapter();
            }
            
            @Override
            public Object caseVersionedContent(final VersionedContent object) {
                return FilesystemAdapterFactory.this.createVersionedContentAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemAdapterFactory.modelPackage == null) {
            FilesystemAdapterFactory.modelPackage = FilesystemPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createFileItemAdapter() {
        return null;
    }
    
    public Adapter createFileItemHandleAdapter() {
        return null;
    }
    
    public Adapter createFileItemHandleFacadeAdapter() {
        return null;
    }
    
    public Adapter createFileItemFacadeAdapter() {
        return null;
    }
    
    public Adapter createFileContentAdapter() {
        return null;
    }
    
    public Adapter createFileContentFacadeAdapter() {
        return null;
    }
    
    public Adapter createPropertyAdapter() {
        return null;
    }
    
    public Adapter createSymbolicLinkAdapter() {
        return null;
    }
    
    public Adapter createSymbolicLinkHandleAdapter() {
        return null;
    }
    
    public Adapter createSymbolicLinkHandleFacadeAdapter() {
        return null;
    }
    
    public Adapter createSymbolicLinkFacadeAdapter() {
        return null;
    }
    
    public Adapter createItemHandleFacadeAdapter() {
        return null;
    }
    
    public Adapter createItemHandleAdapter() {
        return null;
    }
    
    public Adapter createItemFacadeAdapter() {
        return null;
    }
    
    public Adapter createItemAdapter() {
        return null;
    }
    
    public Adapter createUnmanagedItemHandleFacadeAdapter() {
        return null;
    }
    
    public Adapter createUnmanagedItemHandleAdapter() {
        return null;
    }
    
    public Adapter createUnmanagedItemFacadeAdapter() {
        return null;
    }
    
    public Adapter createUnmanagedItemAdapter() {
        return null;
    }
    
    public Adapter createVersionableHandleFacadeAdapter() {
        return null;
    }
    
    public Adapter createVersionableHandleAdapter() {
        return null;
    }
    
    public Adapter createVersionableFacadeAdapter() {
        return null;
    }
    
    public Adapter createVersionableAdapter() {
        return null;
    }
    
    public Adapter createHelperFacadeAdapter() {
        return null;
    }
    
    public Adapter createHelperAdapter() {
        return null;
    }
    
    public Adapter createVersionedContentFacadeAdapter() {
        return null;
    }
    
    public Adapter createVersionedContentAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
