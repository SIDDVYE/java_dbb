// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.repository.common.IHelper;
import com.ibm.team.filesystem.common.internal.rest.client.core.HierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineHierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptor2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptor2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChanges2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.StackTraceElementDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ExceptionDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ChangeSetDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ReadScopeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.SandboxDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceFlowEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentHierarchyDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOcoreAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOcorePackage modelPackage;
    protected FilesystemRestClientDTOcoreSwitch modelSwitch;
    
    public FilesystemRestClientDTOcoreAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOcoreSwitch() {
            @Override
            public Object caseShareDTO(final ShareDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createShareDTOAdapter();
            }
            
            @Override
            public Object casePathDTO(final PathDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createPathDTOAdapter();
            }
            
            @Override
            public Object caseTeamRepositoryDTO(final TeamRepositoryDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createTeamRepositoryDTOAdapter();
            }
            
            @Override
            public Object caseTeamRepositoriesDTO(final TeamRepositoriesDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createTeamRepositoriesDTOAdapter();
            }
            
            @Override
            public Object caseConnectionDescriptorDTO(final ConnectionDescriptorDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createConnectionDescriptorDTOAdapter();
            }
            
            @Override
            public Object caseConfigurationDescriptorDTO(final ConfigurationDescriptorDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createConfigurationDescriptorDTOAdapter();
            }
            
            @Override
            public Object caseBaselineSetDTO(final BaselineSetDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createBaselineSetDTOAdapter();
            }
            
            @Override
            public Object caseBaselineDTO(final BaselineDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createBaselineDTOAdapter();
            }
            
            @Override
            public Object caseWorkspaceDetailsDTO(final WorkspaceDetailsDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createWorkspaceDetailsDTOAdapter();
            }
            
            @Override
            public Object caseWorkspaceComponentDTO(final WorkspaceComponentDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createWorkspaceComponentDTOAdapter();
            }
            
            @Override
            public Object caseComponentHierarchyDTO(final ComponentHierarchyDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createComponentHierarchyDTOAdapter();
            }
            
            @Override
            public Object caseWorkspaceFlowEntryDTO(final WorkspaceFlowEntryDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createWorkspaceFlowEntryDTOAdapter();
            }
            
            @Override
            public Object caseShareableDTO(final ShareableDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createShareableDTOAdapter();
            }
            
            @Override
            public Object caseSandboxDTO(final SandboxDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createSandboxDTOAdapter();
            }
            
            @Override
            public Object caseContributorDTO(final ContributorDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createContributorDTOAdapter();
            }
            
            @Override
            public Object caseReadScopeDTO(final ReadScopeDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createReadScopeDTOAdapter();
            }
            
            @Override
            public Object caseConfigurationWithUncheckedInChangesDTO(final ConfigurationWithUncheckedInChangesDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createConfigurationWithUncheckedInChangesDTOAdapter();
            }
            
            @Override
            public Object caseChangeSetDTO(final ChangeSetDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createChangeSetDTOAdapter();
            }
            
            @Override
            public Object caseComponentDTO(final ComponentDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createComponentDTOAdapter();
            }
            
            @Override
            public Object caseStatusDTO(final StatusDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createStatusDTOAdapter();
            }
            
            @Override
            public Object caseExceptionDTO(final ExceptionDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createExceptionDTOAdapter();
            }
            
            @Override
            public Object caseStackTraceElementDTO(final StackTraceElementDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createStackTraceElementDTOAdapter();
            }
            
            @Override
            public Object caseConfigurationWithUncheckedInChanges2DTO(final ConfigurationWithUncheckedInChanges2DTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createConfigurationWithUncheckedInChanges2DTOAdapter();
            }
            
            @Override
            public Object caseConfigurationDescriptor2DTO(final ConfigurationDescriptor2DTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createConfigurationDescriptor2DTOAdapter();
            }
            
            @Override
            public Object caseConnectionDescriptor2DTO(final ConnectionDescriptor2DTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createConnectionDescriptor2DTOAdapter();
            }
            
            @Override
            public Object caseBaselineHierarchyDTO(final BaselineHierarchyDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createBaselineHierarchyDTOAdapter();
            }
            
            @Override
            public Object caseHierarchyDTO(final HierarchyDTO object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createHierarchyDTOAdapter();
            }
            
            @Override
            public Object caseHelperFacade(final IHelper object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createHelperFacadeAdapter();
            }
            
            @Override
            public Object caseHelper(final Helper object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createHelperAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOcoreAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOcoreAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOcoreAdapterFactory.modelPackage = FilesystemRestClientDTOcorePackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOcoreAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOcoreAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createShareDTOAdapter() {
        return null;
    }
    
    public Adapter createPathDTOAdapter() {
        return null;
    }
    
    public Adapter createTeamRepositoryDTOAdapter() {
        return null;
    }
    
    public Adapter createTeamRepositoriesDTOAdapter() {
        return null;
    }
    
    public Adapter createConnectionDescriptorDTOAdapter() {
        return null;
    }
    
    public Adapter createConfigurationDescriptorDTOAdapter() {
        return null;
    }
    
    public Adapter createBaselineSetDTOAdapter() {
        return null;
    }
    
    public Adapter createBaselineDTOAdapter() {
        return null;
    }
    
    public Adapter createWorkspaceDetailsDTOAdapter() {
        return null;
    }
    
    public Adapter createWorkspaceComponentDTOAdapter() {
        return null;
    }
    
    public Adapter createWorkspaceFlowEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createShareableDTOAdapter() {
        return null;
    }
    
    public Adapter createSandboxDTOAdapter() {
        return null;
    }
    
    public Adapter createContributorDTOAdapter() {
        return null;
    }
    
    public Adapter createReadScopeDTOAdapter() {
        return null;
    }
    
    public Adapter createConfigurationWithUncheckedInChangesDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeSetDTOAdapter() {
        return null;
    }
    
    public Adapter createComponentDTOAdapter() {
        return null;
    }
    
    public Adapter createComponentHierarchyDTOAdapter() {
        return null;
    }
    
    public Adapter createStatusDTOAdapter() {
        return null;
    }
    
    public Adapter createExceptionDTOAdapter() {
        return null;
    }
    
    public Adapter createStackTraceElementDTOAdapter() {
        return null;
    }
    
    public Adapter createConfigurationWithUncheckedInChanges2DTOAdapter() {
        return null;
    }
    
    public Adapter createConfigurationDescriptor2DTOAdapter() {
        return null;
    }
    
    public Adapter createConnectionDescriptor2DTOAdapter() {
        return null;
    }
    
    public Adapter createBaselineHierarchyDTOAdapter() {
        return null;
    }
    
    public Adapter createHierarchyDTOAdapter() {
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
