// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.HierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineHierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptor2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptor2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChanges2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.StackTraceElementDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ExceptionDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentHierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ChangeSetDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ReadScopeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.SandboxDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceFlowEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceDetailsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineSetDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.TeamRepositoriesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.TeamRepositoryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcoreFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOcoreFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOcoreFactory
{
    public static FilesystemRestClientDTOcoreFactory init() {
        try {
            final FilesystemRestClientDTOcoreFactory theFilesystemRestClientDTOcoreFactory = (FilesystemRestClientDTOcoreFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.core");
            if (theFilesystemRestClientDTOcoreFactory != null) {
                return theFilesystemRestClientDTOcoreFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOcoreFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createShareDTO();
            }
            case 1: {
                return (EObject)this.createPathDTO();
            }
            case 2: {
                return (EObject)this.createTeamRepositoryDTO();
            }
            case 3: {
                return (EObject)this.createTeamRepositoriesDTO();
            }
            case 4: {
                return (EObject)this.createConnectionDescriptorDTO();
            }
            case 5: {
                return (EObject)this.createConfigurationDescriptorDTO();
            }
            case 6: {
                return (EObject)this.createBaselineSetDTO();
            }
            case 7: {
                return (EObject)this.createBaselineDTO();
            }
            case 8: {
                return (EObject)this.createWorkspaceDetailsDTO();
            }
            case 9: {
                return (EObject)this.createWorkspaceComponentDTO();
            }
            case 10: {
                return (EObject)this.createComponentHierarchyDTO();
            }
            case 11: {
                return (EObject)this.createWorkspaceFlowEntryDTO();
            }
            case 12: {
                return (EObject)this.createShareableDTO();
            }
            case 13: {
                return (EObject)this.createSandboxDTO();
            }
            case 14: {
                return (EObject)this.createContributorDTO();
            }
            case 15: {
                return (EObject)this.createReadScopeDTO();
            }
            case 16: {
                return (EObject)this.createConfigurationWithUncheckedInChangesDTO();
            }
            case 17: {
                return (EObject)this.createChangeSetDTO();
            }
            case 18: {
                return (EObject)this.createComponentDTO();
            }
            case 19: {
                return (EObject)this.createStatusDTO();
            }
            case 20: {
                return (EObject)this.createExceptionDTO();
            }
            case 21: {
                return (EObject)this.createStackTraceElementDTO();
            }
            case 22: {
                return (EObject)this.createConfigurationWithUncheckedInChanges2DTO();
            }
            case 23: {
                return (EObject)this.createConfigurationDescriptor2DTO();
            }
            case 24: {
                return (EObject)this.createConnectionDescriptor2DTO();
            }
            case 25: {
                return (EObject)this.createBaselineHierarchyDTO();
            }
            case 26: {
                return (EObject)this.createHierarchyDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public ShareDTO createShareDTO() {
        final ShareDTOImpl shareDTO = new ShareDTOImpl();
        return shareDTO;
    }
    
    public PathDTO createPathDTO() {
        final PathDTOImpl pathDTO = new PathDTOImpl();
        return pathDTO;
    }
    
    public TeamRepositoryDTO createTeamRepositoryDTO() {
        final TeamRepositoryDTOImpl teamRepositoryDTO = new TeamRepositoryDTOImpl();
        return teamRepositoryDTO;
    }
    
    public TeamRepositoriesDTO createTeamRepositoriesDTO() {
        final TeamRepositoriesDTOImpl teamRepositoriesDTO = new TeamRepositoriesDTOImpl();
        return teamRepositoriesDTO;
    }
    
    public ConnectionDescriptorDTO createConnectionDescriptorDTO() {
        final ConnectionDescriptorDTOImpl connectionDescriptorDTO = new ConnectionDescriptorDTOImpl();
        return connectionDescriptorDTO;
    }
    
    public ConfigurationDescriptorDTO createConfigurationDescriptorDTO() {
        final ConfigurationDescriptorDTOImpl configurationDescriptorDTO = new ConfigurationDescriptorDTOImpl();
        return configurationDescriptorDTO;
    }
    
    public BaselineSetDTO createBaselineSetDTO() {
        final BaselineSetDTOImpl baselineSetDTO = new BaselineSetDTOImpl();
        return baselineSetDTO;
    }
    
    public BaselineDTO createBaselineDTO() {
        final BaselineDTOImpl baselineDTO = new BaselineDTOImpl();
        return baselineDTO;
    }
    
    public WorkspaceDetailsDTO createWorkspaceDetailsDTO() {
        final WorkspaceDetailsDTOImpl workspaceDetailsDTO = new WorkspaceDetailsDTOImpl();
        return workspaceDetailsDTO;
    }
    
    public WorkspaceComponentDTO createWorkspaceComponentDTO() {
        final WorkspaceComponentDTOImpl workspaceComponentDTO = new WorkspaceComponentDTOImpl();
        return workspaceComponentDTO;
    }
    
    public WorkspaceFlowEntryDTO createWorkspaceFlowEntryDTO() {
        final WorkspaceFlowEntryDTOImpl workspaceFlowEntryDTO = new WorkspaceFlowEntryDTOImpl();
        return workspaceFlowEntryDTO;
    }
    
    public ShareableDTO createShareableDTO() {
        final ShareableDTOImpl shareableDTO = new ShareableDTOImpl();
        return shareableDTO;
    }
    
    public SandboxDTO createSandboxDTO() {
        final SandboxDTOImpl sandboxDTO = new SandboxDTOImpl();
        return sandboxDTO;
    }
    
    public ContributorDTO createContributorDTO() {
        final ContributorDTOImpl contributorDTO = new ContributorDTOImpl();
        return contributorDTO;
    }
    
    public ReadScopeDTO createReadScopeDTO() {
        final ReadScopeDTOImpl readScopeDTO = new ReadScopeDTOImpl();
        return readScopeDTO;
    }
    
    public ConfigurationWithUncheckedInChangesDTO createConfigurationWithUncheckedInChangesDTO() {
        final ConfigurationWithUncheckedInChangesDTOImpl configurationWithUncheckedInChangesDTO = new ConfigurationWithUncheckedInChangesDTOImpl();
        return configurationWithUncheckedInChangesDTO;
    }
    
    public ChangeSetDTO createChangeSetDTO() {
        final ChangeSetDTOImpl changeSetDTO = new ChangeSetDTOImpl();
        return changeSetDTO;
    }
    
    public ComponentDTO createComponentDTO() {
        final ComponentDTOImpl componentDTO = new ComponentDTOImpl();
        return componentDTO;
    }
    
    public ComponentHierarchyDTO createComponentHierarchyDTO() {
        final ComponentHierarchyDTOImpl componentHierarchyDTO = new ComponentHierarchyDTOImpl();
        return componentHierarchyDTO;
    }
    
    public StatusDTO createStatusDTO() {
        final StatusDTOImpl statusDTO = new StatusDTOImpl();
        return statusDTO;
    }
    
    public ExceptionDTO createExceptionDTO() {
        final ExceptionDTOImpl exceptionDTO = new ExceptionDTOImpl();
        return exceptionDTO;
    }
    
    public StackTraceElementDTO createStackTraceElementDTO() {
        final StackTraceElementDTOImpl stackTraceElementDTO = new StackTraceElementDTOImpl();
        return stackTraceElementDTO;
    }
    
    public ConfigurationWithUncheckedInChanges2DTO createConfigurationWithUncheckedInChanges2DTO() {
        final ConfigurationWithUncheckedInChanges2DTOImpl configurationWithUncheckedInChanges2DTO = new ConfigurationWithUncheckedInChanges2DTOImpl();
        return configurationWithUncheckedInChanges2DTO;
    }
    
    public ConfigurationDescriptor2DTO createConfigurationDescriptor2DTO() {
        final ConfigurationDescriptor2DTOImpl configurationDescriptor2DTO = new ConfigurationDescriptor2DTOImpl();
        return configurationDescriptor2DTO;
    }
    
    public ConnectionDescriptor2DTO createConnectionDescriptor2DTO() {
        final ConnectionDescriptor2DTOImpl connectionDescriptor2DTO = new ConnectionDescriptor2DTOImpl();
        return connectionDescriptor2DTO;
    }
    
    public BaselineHierarchyDTO createBaselineHierarchyDTO() {
        final BaselineHierarchyDTOImpl baselineHierarchyDTO = new BaselineHierarchyDTOImpl();
        return baselineHierarchyDTO;
    }
    
    public HierarchyDTO createHierarchyDTO() {
        final HierarchyDTOImpl hierarchyDTO = new HierarchyDTOImpl();
        return hierarchyDTO;
    }
    
    public FilesystemRestClientDTOcorePackage getFilesystemRestClientDTOcorePackage() {
        return (FilesystemRestClientDTOcorePackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOcorePackage getPackage() {
        return FilesystemRestClientDTOcorePackage.eINSTANCE;
    }
}
