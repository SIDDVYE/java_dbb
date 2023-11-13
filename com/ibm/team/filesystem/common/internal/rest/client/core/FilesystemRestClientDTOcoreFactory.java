// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcoreFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOcoreFactory extends EFactory
{
    public static final FilesystemRestClientDTOcoreFactory eINSTANCE = FilesystemRestClientDTOcoreFactoryImpl.init();
    
    ShareDTO createShareDTO();
    
    PathDTO createPathDTO();
    
    TeamRepositoryDTO createTeamRepositoryDTO();
    
    TeamRepositoriesDTO createTeamRepositoriesDTO();
    
    ConnectionDescriptorDTO createConnectionDescriptorDTO();
    
    ConfigurationDescriptorDTO createConfigurationDescriptorDTO();
    
    BaselineSetDTO createBaselineSetDTO();
    
    BaselineDTO createBaselineDTO();
    
    WorkspaceDetailsDTO createWorkspaceDetailsDTO();
    
    WorkspaceComponentDTO createWorkspaceComponentDTO();
    
    WorkspaceFlowEntryDTO createWorkspaceFlowEntryDTO();
    
    ShareableDTO createShareableDTO();
    
    SandboxDTO createSandboxDTO();
    
    ContributorDTO createContributorDTO();
    
    ReadScopeDTO createReadScopeDTO();
    
    ConfigurationWithUncheckedInChangesDTO createConfigurationWithUncheckedInChangesDTO();
    
    ChangeSetDTO createChangeSetDTO();
    
    ComponentDTO createComponentDTO();
    
    ComponentHierarchyDTO createComponentHierarchyDTO();
    
    StatusDTO createStatusDTO();
    
    ExceptionDTO createExceptionDTO();
    
    StackTraceElementDTO createStackTraceElementDTO();
    
    ConfigurationWithUncheckedInChanges2DTO createConfigurationWithUncheckedInChanges2DTO();
    
    ConfigurationDescriptor2DTO createConfigurationDescriptor2DTO();
    
    ConnectionDescriptor2DTO createConnectionDescriptor2DTO();
    
    BaselineHierarchyDTO createBaselineHierarchyDTO();
    
    HierarchyDTO createHierarchyDTO();
    
    FilesystemRestClientDTOcorePackage getFilesystemRestClientDTOcorePackage();
}
