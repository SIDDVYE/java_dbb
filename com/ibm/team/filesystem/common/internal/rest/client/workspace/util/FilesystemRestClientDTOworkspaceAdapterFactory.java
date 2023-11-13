// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.repository.common.IHelper;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.ComponentHierarchyUpdateResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.BaselineCustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.WorkspaceCustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.PutWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.MoveFoldersInWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.DeleteFoldersInWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.CreateBaselineResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.CreateBaselineSetResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOworkspaceAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOworkspacePackage modelPackage;
    protected FilesystemRestClientDTOworkspaceSwitch modelSwitch;
    
    public FilesystemRestClientDTOworkspaceAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOworkspaceSwitch() {
            @Override
            public Object caseCreateBaselineSetResultDTO(final CreateBaselineSetResultDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createCreateBaselineSetResultDTOAdapter();
            }
            
            @Override
            public Object caseCreateBaselineResultDTO(final CreateBaselineResultDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createCreateBaselineResultDTOAdapter();
            }
            
            @Override
            public Object caseDeleteFoldersInWorkspaceResultDTO(final DeleteFoldersInWorkspaceResultDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createDeleteFoldersInWorkspaceResultDTOAdapter();
            }
            
            @Override
            public Object caseMoveFoldersInWorkspaceResultDTO(final MoveFoldersInWorkspaceResultDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createMoveFoldersInWorkspaceResultDTOAdapter();
            }
            
            @Override
            public Object casePutWorkspaceResultDTO(final PutWorkspaceResultDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createPutWorkspaceResultDTOAdapter();
            }
            
            @Override
            public Object caseGetWorkspaceDetailsResultDTO(final GetWorkspaceDetailsResultDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createGetWorkspaceDetailsResultDTOAdapter();
            }
            
            @Override
            public Object caseGetWorkspaceDetailsErrorDTO(final GetWorkspaceDetailsErrorDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createGetWorkspaceDetailsErrorDTOAdapter();
            }
            
            @Override
            public Object caseWorkspaceCustomAttributesDTO(final WorkspaceCustomAttributesDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createWorkspaceCustomAttributesDTOAdapter();
            }
            
            @Override
            public Object caseBaselineCustomAttributesDTO(final BaselineCustomAttributesDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createBaselineCustomAttributesDTOAdapter();
            }
            
            @Override
            public Object caseComponentHierarchyUpdateResultDTO(final ComponentHierarchyUpdateResultDTO object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createComponentHierarchyUpdateResultDTOAdapter();
            }
            
            @Override
            public Object caseHelperFacade(final IHelper object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createHelperFacadeAdapter();
            }
            
            @Override
            public Object caseHelper(final Helper object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createHelperAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOworkspaceAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOworkspaceAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOworkspaceAdapterFactory.modelPackage = FilesystemRestClientDTOworkspacePackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOworkspaceAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOworkspaceAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createCreateBaselineSetResultDTOAdapter() {
        return null;
    }
    
    public Adapter createCreateBaselineResultDTOAdapter() {
        return null;
    }
    
    public Adapter createDeleteFoldersInWorkspaceResultDTOAdapter() {
        return null;
    }
    
    public Adapter createMoveFoldersInWorkspaceResultDTOAdapter() {
        return null;
    }
    
    public Adapter createPutWorkspaceResultDTOAdapter() {
        return null;
    }
    
    public Adapter createGetWorkspaceDetailsResultDTOAdapter() {
        return null;
    }
    
    public Adapter createGetWorkspaceDetailsErrorDTOAdapter() {
        return null;
    }
    
    public Adapter createWorkspaceCustomAttributesDTOAdapter() {
        return null;
    }
    
    public Adapter createBaselineCustomAttributesDTOAdapter() {
        return null;
    }
    
    public Adapter createComponentHierarchyUpdateResultDTOAdapter() {
        return null;
    }
    
    public Adapter createHelperFacadeAdapter() {
        return null;
    }
    
    public Adapter createHelperAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
