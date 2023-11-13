// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.util;

import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineHierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptor2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptor2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChanges2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.StackTraceElementDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ExceptionDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ChangeSetDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ReadScopeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.SandboxDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceFlowEntryDTO;
import com.ibm.team.repository.common.IHelper;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.filesystem.common.internal.rest.client.core.HierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentHierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentDTO;
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
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;

public class FilesystemRestClientDTOcoreSwitch
{
    protected static FilesystemRestClientDTOcorePackage modelPackage;
    
    public FilesystemRestClientDTOcoreSwitch() {
        if (FilesystemRestClientDTOcoreSwitch.modelPackage == null) {
            FilesystemRestClientDTOcoreSwitch.modelPackage = FilesystemRestClientDTOcorePackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOcoreSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final ShareDTO shareDTO = (ShareDTO)theEObject;
                Object result = this.caseShareDTO(shareDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final PathDTO pathDTO = (PathDTO)theEObject;
                Object result = this.casePathDTO(pathDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final TeamRepositoryDTO teamRepositoryDTO = (TeamRepositoryDTO)theEObject;
                Object result = this.caseTeamRepositoryDTO(teamRepositoryDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final TeamRepositoriesDTO teamRepositoriesDTO = (TeamRepositoriesDTO)theEObject;
                Object result = this.caseTeamRepositoriesDTO(teamRepositoriesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final ConnectionDescriptorDTO connectionDescriptorDTO = (ConnectionDescriptorDTO)theEObject;
                Object result = this.caseConnectionDescriptorDTO(connectionDescriptorDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final ConfigurationDescriptorDTO configurationDescriptorDTO = (ConfigurationDescriptorDTO)theEObject;
                Object result = this.caseConfigurationDescriptorDTO(configurationDescriptorDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final BaselineSetDTO baselineSetDTO = (BaselineSetDTO)theEObject;
                Object result = this.caseBaselineSetDTO(baselineSetDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final BaselineDTO baselineDTO = (BaselineDTO)theEObject;
                Object result = this.caseBaselineDTO(baselineDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final WorkspaceDetailsDTO workspaceDetailsDTO = (WorkspaceDetailsDTO)theEObject;
                Object result = this.caseWorkspaceDetailsDTO(workspaceDetailsDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final WorkspaceComponentDTO workspaceComponentDTO = (WorkspaceComponentDTO)theEObject;
                Object result = this.caseWorkspaceComponentDTO(workspaceComponentDTO);
                if (result == null) {
                    result = this.caseComponentDTO(workspaceComponentDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 10: {
                final ComponentHierarchyDTO componentHierarchyDTO = (ComponentHierarchyDTO)theEObject;
                Object result = this.caseComponentHierarchyDTO(componentHierarchyDTO);
                if (result == null) {
                    result = this.caseHierarchyDTO(componentHierarchyDTO);
                }
                if (result == null) {
                    result = this.caseHelper((Helper)componentHierarchyDTO);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)componentHierarchyDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 11: {
                final WorkspaceFlowEntryDTO workspaceFlowEntryDTO = (WorkspaceFlowEntryDTO)theEObject;
                Object result = this.caseWorkspaceFlowEntryDTO(workspaceFlowEntryDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 12: {
                final ShareableDTO shareableDTO = (ShareableDTO)theEObject;
                Object result = this.caseShareableDTO(shareableDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 13: {
                final SandboxDTO sandboxDTO = (SandboxDTO)theEObject;
                Object result = this.caseSandboxDTO(sandboxDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 14: {
                final ContributorDTO contributorDTO = (ContributorDTO)theEObject;
                Object result = this.caseContributorDTO(contributorDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 15: {
                final ReadScopeDTO readScopeDTO = (ReadScopeDTO)theEObject;
                Object result = this.caseReadScopeDTO(readScopeDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 16: {
                final ConfigurationWithUncheckedInChangesDTO configurationWithUncheckedInChangesDTO = (ConfigurationWithUncheckedInChangesDTO)theEObject;
                Object result = this.caseConfigurationWithUncheckedInChangesDTO(configurationWithUncheckedInChangesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 17: {
                final ChangeSetDTO changeSetDTO = (ChangeSetDTO)theEObject;
                Object result = this.caseChangeSetDTO(changeSetDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 18: {
                final ComponentDTO componentDTO = (ComponentDTO)theEObject;
                Object result = this.caseComponentDTO(componentDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 19: {
                final StatusDTO statusDTO = (StatusDTO)theEObject;
                Object result = this.caseStatusDTO(statusDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 20: {
                final ExceptionDTO exceptionDTO = (ExceptionDTO)theEObject;
                Object result = this.caseExceptionDTO(exceptionDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 21: {
                final StackTraceElementDTO stackTraceElementDTO = (StackTraceElementDTO)theEObject;
                Object result = this.caseStackTraceElementDTO(stackTraceElementDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 22: {
                final ConfigurationWithUncheckedInChanges2DTO configurationWithUncheckedInChanges2DTO = (ConfigurationWithUncheckedInChanges2DTO)theEObject;
                Object result = this.caseConfigurationWithUncheckedInChanges2DTO(configurationWithUncheckedInChanges2DTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 23: {
                final ConfigurationDescriptor2DTO configurationDescriptor2DTO = (ConfigurationDescriptor2DTO)theEObject;
                Object result = this.caseConfigurationDescriptor2DTO(configurationDescriptor2DTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 24: {
                final ConnectionDescriptor2DTO connectionDescriptor2DTO = (ConnectionDescriptor2DTO)theEObject;
                Object result = this.caseConnectionDescriptor2DTO(connectionDescriptor2DTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 25: {
                final BaselineHierarchyDTO baselineHierarchyDTO = (BaselineHierarchyDTO)theEObject;
                Object result = this.caseBaselineHierarchyDTO(baselineHierarchyDTO);
                if (result == null) {
                    result = this.caseHierarchyDTO(baselineHierarchyDTO);
                }
                if (result == null) {
                    result = this.caseHelper((Helper)baselineHierarchyDTO);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)baselineHierarchyDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 26: {
                final HierarchyDTO hierarchyDTO = (HierarchyDTO)theEObject;
                Object result = this.caseHierarchyDTO(hierarchyDTO);
                if (result == null) {
                    result = this.caseHelper((Helper)hierarchyDTO);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)hierarchyDTO);
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
    
    public Object caseShareDTO(final ShareDTO object) {
        return null;
    }
    
    public Object casePathDTO(final PathDTO object) {
        return null;
    }
    
    public Object caseTeamRepositoryDTO(final TeamRepositoryDTO object) {
        return null;
    }
    
    public Object caseTeamRepositoriesDTO(final TeamRepositoriesDTO object) {
        return null;
    }
    
    public Object caseConnectionDescriptorDTO(final ConnectionDescriptorDTO object) {
        return null;
    }
    
    public Object caseConfigurationDescriptorDTO(final ConfigurationDescriptorDTO object) {
        return null;
    }
    
    public Object caseBaselineSetDTO(final BaselineSetDTO object) {
        return null;
    }
    
    public Object caseBaselineDTO(final BaselineDTO object) {
        return null;
    }
    
    public Object caseWorkspaceDetailsDTO(final WorkspaceDetailsDTO object) {
        return null;
    }
    
    public Object caseWorkspaceComponentDTO(final WorkspaceComponentDTO object) {
        return null;
    }
    
    public Object caseWorkspaceFlowEntryDTO(final WorkspaceFlowEntryDTO object) {
        return null;
    }
    
    public Object caseShareableDTO(final ShareableDTO object) {
        return null;
    }
    
    public Object caseSandboxDTO(final SandboxDTO object) {
        return null;
    }
    
    public Object caseContributorDTO(final ContributorDTO object) {
        return null;
    }
    
    public Object caseReadScopeDTO(final ReadScopeDTO object) {
        return null;
    }
    
    public Object caseConfigurationWithUncheckedInChangesDTO(final ConfigurationWithUncheckedInChangesDTO object) {
        return null;
    }
    
    public Object caseChangeSetDTO(final ChangeSetDTO object) {
        return null;
    }
    
    public Object caseComponentDTO(final ComponentDTO object) {
        return null;
    }
    
    public Object caseComponentHierarchyDTO(final ComponentHierarchyDTO object) {
        return null;
    }
    
    public Object caseStatusDTO(final StatusDTO object) {
        return null;
    }
    
    public Object caseExceptionDTO(final ExceptionDTO object) {
        return null;
    }
    
    public Object caseStackTraceElementDTO(final StackTraceElementDTO object) {
        return null;
    }
    
    public Object caseConfigurationWithUncheckedInChanges2DTO(final ConfigurationWithUncheckedInChanges2DTO object) {
        return null;
    }
    
    public Object caseConfigurationDescriptor2DTO(final ConfigurationDescriptor2DTO object) {
        return null;
    }
    
    public Object caseConnectionDescriptor2DTO(final ConnectionDescriptor2DTO object) {
        return null;
    }
    
    public Object caseBaselineHierarchyDTO(final BaselineHierarchyDTO object) {
        return null;
    }
    
    public Object caseHierarchyDTO(final HierarchyDTO object) {
        return null;
    }
    
    public Object caseHelperFacade(final IHelper object) {
        return null;
    }
    
    public Object caseHelper(final Helper object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
