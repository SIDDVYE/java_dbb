// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace;

import com.ibm.team.filesystem.common.internal.rest.client.workspace.impl.FilesystemRestClientDTOworkspaceFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOworkspaceFactory extends EFactory
{
    public static final FilesystemRestClientDTOworkspaceFactory eINSTANCE = FilesystemRestClientDTOworkspaceFactoryImpl.init();
    
    CreateBaselineSetResultDTO createCreateBaselineSetResultDTO();
    
    CreateBaselineResultDTO createCreateBaselineResultDTO();
    
    DeleteFoldersInWorkspaceResultDTO createDeleteFoldersInWorkspaceResultDTO();
    
    MoveFoldersInWorkspaceResultDTO createMoveFoldersInWorkspaceResultDTO();
    
    PutWorkspaceResultDTO createPutWorkspaceResultDTO();
    
    GetWorkspaceDetailsResultDTO createGetWorkspaceDetailsResultDTO();
    
    GetWorkspaceDetailsErrorDTO createGetWorkspaceDetailsErrorDTO();
    
    WorkspaceCustomAttributesDTO createWorkspaceCustomAttributesDTO();
    
    BaselineCustomAttributesDTO createBaselineCustomAttributesDTO();
    
    ComponentHierarchyUpdateResultDTO createComponentHierarchyUpdateResultDTO();
    
    FilesystemRestClientDTOworkspacePackage getFilesystemRestClientDTOworkspacePackage();
}
