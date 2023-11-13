// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.impl.FilesystemRestClientDTOworkspacePackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOworkspacePackage extends EPackage
{
    public static final String eNAME = "workspace";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.workspace";
    public static final String eNS_PREFIX = "filesystemRestClientDTOworkspace";
    public static final FilesystemRestClientDTOworkspacePackage eINSTANCE = FilesystemRestClientDTOworkspacePackageImpl.init();
    public static final int CREATE_BASELINE_SET_RESULT_DTO = 0;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__BASELINE_SET = 0;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__CANCELLED = 1;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__COMMIT_DILEMMA = 2;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__CONFIGURATIONS_WITH_CONFLICTS = 3;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 4;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__OUT_OF_SYNC_SHARES = 5;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 6;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__UPDATE_DILEMMA = 7;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__ACTIVE_CHANGE_SETS_IN_SUBCOMPONENTS = 8;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__INACCESSIBLE_CONFIGURATIONS_IN_SUBCOMPONENTS = 9;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__NOT_FOUND_CONFIGURATIONS_IN_SUBCOMPONENTS = 10;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES_IN_SUBCOMPONENTS = 11;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__CONFIGURATIONS_WITH_CONFLICTS_IN_SUBCOMPONENTS = 12;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__ENTIRE_HIERARCHY_NOT_INCLUDED_IN_SNAPSHOT = 13;
    public static final int CREATE_BASELINE_SET_RESULT_DTO__ACTIVE_CHANGE_SETS_IN_CONFIGURATIONS = 14;
    public static final int CREATE_BASELINE_SET_RESULT_DTO_FEATURE_COUNT = 15;
    public static final int CREATE_BASELINE_RESULT_DTO = 1;
    public static final int CREATE_BASELINE_RESULT_DTO__BASELINES = 0;
    public static final int CREATE_BASELINE_RESULT_DTO__CANCELLED = 1;
    public static final int CREATE_BASELINE_RESULT_DTO__COMMIT_DILEMMA = 2;
    public static final int CREATE_BASELINE_RESULT_DTO__CONFIGURATIONS_WITH_CONFLICTS = 3;
    public static final int CREATE_BASELINE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 4;
    public static final int CREATE_BASELINE_RESULT_DTO__OUT_OF_SYNC_SHARES = 5;
    public static final int CREATE_BASELINE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 6;
    public static final int CREATE_BASELINE_RESULT_DTO__UPDATE_DILEMMA = 7;
    public static final int CREATE_BASELINE_RESULT_DTO__ACTIVE_CHANGE_SETS_IN_SUBCOMPONENTS = 8;
    public static final int CREATE_BASELINE_RESULT_DTO__INACCESSIBLE_CONFIGURATIONS_IN_SUBCOMPONENTS = 9;
    public static final int CREATE_BASELINE_RESULT_DTO__NOT_FOUND_CONFIGURATIONS_IN_SUBCOMPONENTS = 10;
    public static final int CREATE_BASELINE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES_IN_SUBCOMPONENTS = 11;
    public static final int CREATE_BASELINE_RESULT_DTO__CONFIGURATIONS_WITH_CONFLICTS_IN_SUBCOMPONENTS = 12;
    public static final int CREATE_BASELINE_RESULT_DTO_FEATURE_COUNT = 13;
    public static final int DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO = 2;
    public static final int DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO__CANCELLED = 0;
    public static final int DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 2;
    public static final int DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO_FEATURE_COUNT = 3;
    public static final int MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO = 3;
    public static final int MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__CANCELLED = 0;
    public static final int MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 2;
    public static final int MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 3;
    public static final int MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__COMMIT_DILEMMA = 4;
    public static final int MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__UPDATE_DILEMMA = 5;
    public static final int MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO_FEATURE_COUNT = 6;
    public static final int PUT_WORKSPACE_RESULT_DTO = 4;
    public static final int PUT_WORKSPACE_RESULT_DTO__CANCELLED = 0;
    public static final int PUT_WORKSPACE_RESULT_DTO__WORKSPACE = 1;
    public static final int PUT_WORKSPACE_RESULT_DTO__OUT_OF_SYNC_SHARES = 2;
    public static final int PUT_WORKSPACE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 3;
    public static final int PUT_WORKSPACE_RESULT_DTO__COMPONENTS_ADDED = 4;
    public static final int PUT_WORKSPACE_RESULT_DTO__COMPONENTS_CREATED = 5;
    public static final int PUT_WORKSPACE_RESULT_DTO__COMPONENT_HIERARCHY_UPDATE_RESULT = 6;
    public static final int PUT_WORKSPACE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 7;
    public static final int PUT_WORKSPACE_RESULT_DTO__COMMIT_DILEMMA = 8;
    public static final int PUT_WORKSPACE_RESULT_DTO__UPDATE_DILEMMA = 9;
    public static final int PUT_WORKSPACE_RESULT_DTO__NO_BACKUP_BASELINES_COMPONENTS = 10;
    public static final int PUT_WORKSPACE_RESULT_DTO__SELECTED_COMPONENTS_WITH_MULTIPLE_PARTICIPANTS = 11;
    public static final int PUT_WORKSPACE_RESULT_DTO__SUBCOMPONENTS_WITH_MULTIPLE_PARTICIPANTS = 12;
    public static final int PUT_WORKSPACE_RESULT_DTO__COMPONENTS_REMOVED = 13;
    public static final int PUT_WORKSPACE_RESULT_DTO_FEATURE_COUNT = 14;
    public static final int GET_WORKSPACE_DETAILS_RESULT_DTO = 5;
    public static final int GET_WORKSPACE_DETAILS_RESULT_DTO__WORKSPACE_DETAILS = 0;
    public static final int GET_WORKSPACE_DETAILS_RESULT_DTO__ERRORS = 1;
    public static final int GET_WORKSPACE_DETAILS_RESULT_DTO_FEATURE_COUNT = 2;
    public static final int GET_WORKSPACE_DETAILS_ERROR_DTO = 6;
    public static final int GET_WORKSPACE_DETAILS_ERROR_DTO__MESSAGE = 0;
    public static final int GET_WORKSPACE_DETAILS_ERROR_DTO__REPOSITORY_ID = 1;
    public static final int GET_WORKSPACE_DETAILS_ERROR_DTO__REPOSITORY_URL = 2;
    public static final int GET_WORKSPACE_DETAILS_ERROR_DTO__WORKSPACE_ID = 3;
    public static final int GET_WORKSPACE_DETAILS_ERROR_DTO_FEATURE_COUNT = 4;
    public static final int WORKSPACE_CUSTOM_ATTRIBUTES_DTO = 7;
    public static final int WORKSPACE_CUSTOM_ATTRIBUTES_DTO__WORKSPACE = 0;
    public static final int WORKSPACE_CUSTOM_ATTRIBUTES_DTO__CUSTOM_ATTRIBUTES = 1;
    public static final int WORKSPACE_CUSTOM_ATTRIBUTES_DTO_FEATURE_COUNT = 2;
    public static final int BASELINE_CUSTOM_ATTRIBUTES_DTO = 8;
    public static final int BASELINE_CUSTOM_ATTRIBUTES_DTO__CUSTOM_ATTRIBUTES = 0;
    public static final int BASELINE_CUSTOM_ATTRIBUTES_DTO_FEATURE_COUNT = 1;
    public static final int COMPONENT_HIERARCHY_UPDATE_RESULT_DTO = 9;
    public static final int COMPONENT_HIERARCHY_UPDATE_RESULT_DTO__INTERNAL_ID = 0;
    public static final int COMPONENT_HIERARCHY_UPDATE_RESULT_DTO__AFFECTED_CHANGE_SET_ITEM_ID = 1;
    public static final int COMPONENT_HIERARCHY_UPDATE_RESULT_DTO__UPDATED_CHILDREN_ITEM_IDS = 2;
    public static final int COMPONENT_HIERARCHY_UPDATE_RESULT_DTO_FEATURE_COUNT = 3;
    
    EClass getCreateBaselineSetResultDTO();
    
    EReference getCreateBaselineSetResultDTO_BaselineSet();
    
    EAttribute getCreateBaselineSetResultDTO_Cancelled();
    
    EReference getCreateBaselineSetResultDTO_CommitDilemma();
    
    EReference getCreateBaselineSetResultDTO_ConfigurationsWithConflicts();
    
    EReference getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getCreateBaselineSetResultDTO_OutOfSyncShares();
    
    EReference getCreateBaselineSetResultDTO_SandboxUpdateDilemma();
    
    EReference getCreateBaselineSetResultDTO_UpdateDilemma();
    
    EReference getCreateBaselineSetResultDTO_ActiveChangeSetsInSubcomponents();
    
    EReference getCreateBaselineSetResultDTO_InaccessibleConfigurationsInSubcomponents();
    
    EReference getCreateBaselineSetResultDTO_NotFoundConfigurationsInSubcomponents();
    
    EReference getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents();
    
    EReference getCreateBaselineSetResultDTO_ConfigurationsWithConflictsInSubcomponents();
    
    EReference getCreateBaselineSetResultDTO_EntireHierarchyNotIncludedInSnapshot();
    
    EReference getCreateBaselineSetResultDTO_ActiveChangeSetsInConfigurations();
    
    EClass getCreateBaselineResultDTO();
    
    EAttribute getCreateBaselineResultDTO_Cancelled();
    
    EReference getCreateBaselineResultDTO_OutOfSyncShares();
    
    EReference getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents();
    
    EReference getCreateBaselineResultDTO_ConfigurationsWithConflicts();
    
    EReference getCreateBaselineResultDTO_ConfigurationsWithConflictsInSubcomponents();
    
    EReference getCreateBaselineResultDTO_Baselines();
    
    EReference getCreateBaselineResultDTO_SandboxUpdateDilemma();
    
    EReference getCreateBaselineResultDTO_CommitDilemma();
    
    EReference getCreateBaselineResultDTO_UpdateDilemma();
    
    EReference getCreateBaselineResultDTO_ActiveChangeSetsInSubcomponents();
    
    EReference getCreateBaselineResultDTO_InaccessibleConfigurationsInSubcomponents();
    
    EReference getCreateBaselineResultDTO_NotFoundConfigurationsInSubcomponents();
    
    EClass getDeleteFoldersInWorkspaceResultDTO();
    
    EAttribute getDeleteFoldersInWorkspaceResultDTO_Cancelled();
    
    EReference getDeleteFoldersInWorkspaceResultDTO_OutOfSyncShares();
    
    EReference getDeleteFoldersInWorkspaceResultDTO_SandboxUpdateDilemma();
    
    EClass getMoveFoldersInWorkspaceResultDTO();
    
    EAttribute getMoveFoldersInWorkspaceResultDTO_Cancelled();
    
    EReference getMoveFoldersInWorkspaceResultDTO_OutOfSyncShares();
    
    EReference getMoveFoldersInWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getMoveFoldersInWorkspaceResultDTO_SandboxUpdateDilemma();
    
    EReference getMoveFoldersInWorkspaceResultDTO_CommitDilemma();
    
    EReference getMoveFoldersInWorkspaceResultDTO_UpdateDilemma();
    
    EClass getPutWorkspaceResultDTO();
    
    EAttribute getPutWorkspaceResultDTO_Cancelled();
    
    EReference getPutWorkspaceResultDTO_Workspace();
    
    EReference getPutWorkspaceResultDTO_OutOfSyncShares();
    
    EReference getPutWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getPutWorkspaceResultDTO_ComponentsAdded();
    
    EReference getPutWorkspaceResultDTO_ComponentsCreated();
    
    EReference getPutWorkspaceResultDTO_ComponentHierarchyUpdateResult();
    
    EReference getPutWorkspaceResultDTO_SandboxUpdateDilemma();
    
    EReference getPutWorkspaceResultDTO_CommitDilemma();
    
    EReference getPutWorkspaceResultDTO_UpdateDilemma();
    
    EReference getPutWorkspaceResultDTO_NoBackupBaselinesComponents();
    
    EReference getPutWorkspaceResultDTO_SelectedComponentsWithMultipleParticipants();
    
    EReference getPutWorkspaceResultDTO_SubcomponentsWithMultipleParticipants();
    
    EReference getPutWorkspaceResultDTO_ComponentsRemoved();
    
    EClass getGetWorkspaceDetailsResultDTO();
    
    EReference getGetWorkspaceDetailsResultDTO_WorkspaceDetails();
    
    EReference getGetWorkspaceDetailsResultDTO_Errors();
    
    EClass getGetWorkspaceDetailsErrorDTO();
    
    EAttribute getGetWorkspaceDetailsErrorDTO_Message();
    
    EAttribute getGetWorkspaceDetailsErrorDTO_RepositoryId();
    
    EAttribute getGetWorkspaceDetailsErrorDTO_RepositoryUrl();
    
    EAttribute getGetWorkspaceDetailsErrorDTO_WorkspaceId();
    
    EClass getWorkspaceCustomAttributesDTO();
    
    EReference getWorkspaceCustomAttributesDTO_Workspace();
    
    EReference getWorkspaceCustomAttributesDTO_CustomAttributes();
    
    EClass getBaselineCustomAttributesDTO();
    
    EReference getBaselineCustomAttributesDTO_CustomAttributes();
    
    EClass getComponentHierarchyUpdateResultDTO();
    
    EAttribute getComponentHierarchyUpdateResultDTO_AffectedChangeSetItemId();
    
    EAttribute getComponentHierarchyUpdateResultDTO_UpdatedChildrenItemIds();
    
    FilesystemRestClientDTOworkspaceFactory getFilesystemRestClientDTOworkspaceFactory();
    
    public interface Literals
    {
        public static final EClass CREATE_BASELINE_SET_RESULT_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__BASELINE_SET = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_BaselineSet();
        public static final EAttribute CREATE_BASELINE_SET_RESULT_DTO__CANCELLED = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_Cancelled();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_CommitDilemma();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__CONFIGURATIONS_WITH_CONFLICTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_ConfigurationsWithConflicts();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_OutOfSyncShares();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_SandboxUpdateDilemma();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_UpdateDilemma();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__ACTIVE_CHANGE_SETS_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_ActiveChangeSetsInSubcomponents();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__INACCESSIBLE_CONFIGURATIONS_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_InaccessibleConfigurationsInSubcomponents();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__NOT_FOUND_CONFIGURATIONS_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_NotFoundConfigurationsInSubcomponents();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__CONFIGURATIONS_WITH_CONFLICTS_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_ConfigurationsWithConflictsInSubcomponents();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__ENTIRE_HIERARCHY_NOT_INCLUDED_IN_SNAPSHOT = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_EntireHierarchyNotIncludedInSnapshot();
        public static final EReference CREATE_BASELINE_SET_RESULT_DTO__ACTIVE_CHANGE_SETS_IN_CONFIGURATIONS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineSetResultDTO_ActiveChangeSetsInConfigurations();
        public static final EClass CREATE_BASELINE_RESULT_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO();
        public static final EAttribute CREATE_BASELINE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_Cancelled();
        public static final EReference CREATE_BASELINE_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_OutOfSyncShares();
        public static final EReference CREATE_BASELINE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference CREATE_BASELINE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents();
        public static final EReference CREATE_BASELINE_RESULT_DTO__CONFIGURATIONS_WITH_CONFLICTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_ConfigurationsWithConflicts();
        public static final EReference CREATE_BASELINE_RESULT_DTO__CONFIGURATIONS_WITH_CONFLICTS_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_ConfigurationsWithConflictsInSubcomponents();
        public static final EReference CREATE_BASELINE_RESULT_DTO__BASELINES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_Baselines();
        public static final EReference CREATE_BASELINE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_SandboxUpdateDilemma();
        public static final EReference CREATE_BASELINE_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_CommitDilemma();
        public static final EReference CREATE_BASELINE_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_UpdateDilemma();
        public static final EReference CREATE_BASELINE_RESULT_DTO__ACTIVE_CHANGE_SETS_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_ActiveChangeSetsInSubcomponents();
        public static final EReference CREATE_BASELINE_RESULT_DTO__INACCESSIBLE_CONFIGURATIONS_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_InaccessibleConfigurationsInSubcomponents();
        public static final EReference CREATE_BASELINE_RESULT_DTO__NOT_FOUND_CONFIGURATIONS_IN_SUBCOMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getCreateBaselineResultDTO_NotFoundConfigurationsInSubcomponents();
        public static final EClass DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getDeleteFoldersInWorkspaceResultDTO();
        public static final EAttribute DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getDeleteFoldersInWorkspaceResultDTO_Cancelled();
        public static final EReference DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getDeleteFoldersInWorkspaceResultDTO_OutOfSyncShares();
        public static final EReference DELETE_FOLDERS_IN_WORKSPACE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getDeleteFoldersInWorkspaceResultDTO_SandboxUpdateDilemma();
        public static final EClass MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getMoveFoldersInWorkspaceResultDTO();
        public static final EAttribute MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getMoveFoldersInWorkspaceResultDTO_Cancelled();
        public static final EReference MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getMoveFoldersInWorkspaceResultDTO_OutOfSyncShares();
        public static final EReference MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getMoveFoldersInWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getMoveFoldersInWorkspaceResultDTO_SandboxUpdateDilemma();
        public static final EReference MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getMoveFoldersInWorkspaceResultDTO_CommitDilemma();
        public static final EReference MOVE_FOLDERS_IN_WORKSPACE_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getMoveFoldersInWorkspaceResultDTO_UpdateDilemma();
        public static final EClass PUT_WORKSPACE_RESULT_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO();
        public static final EAttribute PUT_WORKSPACE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_Cancelled();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__WORKSPACE = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_Workspace();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_OutOfSyncShares();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__COMPONENTS_ADDED = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_ComponentsAdded();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__COMPONENTS_CREATED = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_ComponentsCreated();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__COMPONENT_HIERARCHY_UPDATE_RESULT = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_ComponentHierarchyUpdateResult();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_SandboxUpdateDilemma();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_CommitDilemma();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_UpdateDilemma();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__NO_BACKUP_BASELINES_COMPONENTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_NoBackupBaselinesComponents();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__SELECTED_COMPONENTS_WITH_MULTIPLE_PARTICIPANTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_SelectedComponentsWithMultipleParticipants();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__SUBCOMPONENTS_WITH_MULTIPLE_PARTICIPANTS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_SubcomponentsWithMultipleParticipants();
        public static final EReference PUT_WORKSPACE_RESULT_DTO__COMPONENTS_REMOVED = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getPutWorkspaceResultDTO_ComponentsRemoved();
        public static final EClass GET_WORKSPACE_DETAILS_RESULT_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getGetWorkspaceDetailsResultDTO();
        public static final EReference GET_WORKSPACE_DETAILS_RESULT_DTO__WORKSPACE_DETAILS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getGetWorkspaceDetailsResultDTO_WorkspaceDetails();
        public static final EReference GET_WORKSPACE_DETAILS_RESULT_DTO__ERRORS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getGetWorkspaceDetailsResultDTO_Errors();
        public static final EClass GET_WORKSPACE_DETAILS_ERROR_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getGetWorkspaceDetailsErrorDTO();
        public static final EAttribute GET_WORKSPACE_DETAILS_ERROR_DTO__MESSAGE = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getGetWorkspaceDetailsErrorDTO_Message();
        public static final EAttribute GET_WORKSPACE_DETAILS_ERROR_DTO__REPOSITORY_ID = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getGetWorkspaceDetailsErrorDTO_RepositoryId();
        public static final EAttribute GET_WORKSPACE_DETAILS_ERROR_DTO__REPOSITORY_URL = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getGetWorkspaceDetailsErrorDTO_RepositoryUrl();
        public static final EAttribute GET_WORKSPACE_DETAILS_ERROR_DTO__WORKSPACE_ID = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getGetWorkspaceDetailsErrorDTO_WorkspaceId();
        public static final EClass WORKSPACE_CUSTOM_ATTRIBUTES_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getWorkspaceCustomAttributesDTO();
        public static final EReference WORKSPACE_CUSTOM_ATTRIBUTES_DTO__WORKSPACE = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getWorkspaceCustomAttributesDTO_Workspace();
        public static final EReference WORKSPACE_CUSTOM_ATTRIBUTES_DTO__CUSTOM_ATTRIBUTES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getWorkspaceCustomAttributesDTO_CustomAttributes();
        public static final EClass BASELINE_CUSTOM_ATTRIBUTES_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getBaselineCustomAttributesDTO();
        public static final EReference BASELINE_CUSTOM_ATTRIBUTES_DTO__CUSTOM_ATTRIBUTES = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getBaselineCustomAttributesDTO_CustomAttributes();
        public static final EClass COMPONENT_HIERARCHY_UPDATE_RESULT_DTO = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getComponentHierarchyUpdateResultDTO();
        public static final EAttribute COMPONENT_HIERARCHY_UPDATE_RESULT_DTO__AFFECTED_CHANGE_SET_ITEM_ID = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getComponentHierarchyUpdateResultDTO_AffectedChangeSetItemId();
        public static final EAttribute COMPONENT_HIERARCHY_UPDATE_RESULT_DTO__UPDATED_CHILDREN_ITEM_IDS = FilesystemRestClientDTOworkspacePackage.eINSTANCE.getComponentHierarchyUpdateResultDTO_UpdatedChildrenItemIds();
    }
}
