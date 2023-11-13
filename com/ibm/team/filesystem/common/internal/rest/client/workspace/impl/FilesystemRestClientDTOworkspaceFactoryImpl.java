// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspaceFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOworkspaceFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOworkspaceFactory
{
    public static FilesystemRestClientDTOworkspaceFactory init() {
        try {
            final FilesystemRestClientDTOworkspaceFactory theFilesystemRestClientDTOworkspaceFactory = (FilesystemRestClientDTOworkspaceFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.workspace");
            if (theFilesystemRestClientDTOworkspaceFactory != null) {
                return theFilesystemRestClientDTOworkspaceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOworkspaceFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createCreateBaselineSetResultDTO();
            }
            case 1: {
                return (EObject)this.createCreateBaselineResultDTO();
            }
            case 2: {
                return (EObject)this.createDeleteFoldersInWorkspaceResultDTO();
            }
            case 3: {
                return (EObject)this.createMoveFoldersInWorkspaceResultDTO();
            }
            case 4: {
                return (EObject)this.createPutWorkspaceResultDTO();
            }
            case 5: {
                return (EObject)this.createGetWorkspaceDetailsResultDTO();
            }
            case 6: {
                return (EObject)this.createGetWorkspaceDetailsErrorDTO();
            }
            case 7: {
                return (EObject)this.createWorkspaceCustomAttributesDTO();
            }
            case 8: {
                return (EObject)this.createBaselineCustomAttributesDTO();
            }
            case 9: {
                return (EObject)this.createComponentHierarchyUpdateResultDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public CreateBaselineSetResultDTO createCreateBaselineSetResultDTO() {
        final CreateBaselineSetResultDTOImpl createBaselineSetResultDTO = new CreateBaselineSetResultDTOImpl();
        return createBaselineSetResultDTO;
    }
    
    public CreateBaselineResultDTO createCreateBaselineResultDTO() {
        final CreateBaselineResultDTOImpl createBaselineResultDTO = new CreateBaselineResultDTOImpl();
        return createBaselineResultDTO;
    }
    
    public DeleteFoldersInWorkspaceResultDTO createDeleteFoldersInWorkspaceResultDTO() {
        final DeleteFoldersInWorkspaceResultDTOImpl deleteFoldersInWorkspaceResultDTO = new DeleteFoldersInWorkspaceResultDTOImpl();
        return deleteFoldersInWorkspaceResultDTO;
    }
    
    public MoveFoldersInWorkspaceResultDTO createMoveFoldersInWorkspaceResultDTO() {
        final MoveFoldersInWorkspaceResultDTOImpl moveFoldersInWorkspaceResultDTO = new MoveFoldersInWorkspaceResultDTOImpl();
        return moveFoldersInWorkspaceResultDTO;
    }
    
    public PutWorkspaceResultDTO createPutWorkspaceResultDTO() {
        final PutWorkspaceResultDTOImpl putWorkspaceResultDTO = new PutWorkspaceResultDTOImpl();
        return putWorkspaceResultDTO;
    }
    
    public GetWorkspaceDetailsResultDTO createGetWorkspaceDetailsResultDTO() {
        final GetWorkspaceDetailsResultDTOImpl getWorkspaceDetailsResultDTO = new GetWorkspaceDetailsResultDTOImpl();
        return getWorkspaceDetailsResultDTO;
    }
    
    public GetWorkspaceDetailsErrorDTO createGetWorkspaceDetailsErrorDTO() {
        final GetWorkspaceDetailsErrorDTOImpl getWorkspaceDetailsErrorDTO = new GetWorkspaceDetailsErrorDTOImpl();
        return getWorkspaceDetailsErrorDTO;
    }
    
    public WorkspaceCustomAttributesDTO createWorkspaceCustomAttributesDTO() {
        final WorkspaceCustomAttributesDTOImpl workspaceCustomAttributesDTO = new WorkspaceCustomAttributesDTOImpl();
        return workspaceCustomAttributesDTO;
    }
    
    public BaselineCustomAttributesDTO createBaselineCustomAttributesDTO() {
        final BaselineCustomAttributesDTOImpl baselineCustomAttributesDTO = new BaselineCustomAttributesDTOImpl();
        return baselineCustomAttributesDTO;
    }
    
    public ComponentHierarchyUpdateResultDTO createComponentHierarchyUpdateResultDTO() {
        final ComponentHierarchyUpdateResultDTOImpl componentHierarchyUpdateResultDTO = new ComponentHierarchyUpdateResultDTOImpl();
        return componentHierarchyUpdateResultDTO;
    }
    
    public FilesystemRestClientDTOworkspacePackage getFilesystemRestClientDTOworkspacePackage() {
        return (FilesystemRestClientDTOworkspacePackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOworkspacePackage getPackage() {
        return FilesystemRestClientDTOworkspacePackage.eINSTANCE;
    }
}
