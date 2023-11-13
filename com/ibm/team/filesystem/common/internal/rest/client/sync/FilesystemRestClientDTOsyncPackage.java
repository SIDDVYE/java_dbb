// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.impl.FilesystemRestClientDTOsyncPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOsyncPackage extends EPackage
{
    public static final String eNAME = "sync";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.sync";
    public static final String eNS_PREFIX = "filesystemRestClientDTOsync";
    public static final FilesystemRestClientDTOsyncPackage eINSTANCE = FilesystemRestClientDTOsyncPackageImpl.init();
    public static final int SYNC_VIEW_DTO = 0;
    public static final int SYNC_VIEW_DTO__ID = 0;
    public static final int SYNC_VIEW_DTO__WORKSPACES = 1;
    public static final int SYNC_VIEW_DTO_FEATURE_COUNT = 2;
    public static final int WORKSPACE_SYNC_DTO = 1;
    public static final int WORKSPACE_SYNC_DTO__COMPONENTS = 0;
    public static final int WORKSPACE_SYNC_DTO__ID = 1;
    public static final int WORKSPACE_SYNC_DTO__REPOSITORY_ID = 2;
    public static final int WORKSPACE_SYNC_DTO__REPOSITORY_URL = 3;
    public static final int WORKSPACE_SYNC_DTO__REPOSITORY_LOGGED_IN = 4;
    public static final int WORKSPACE_SYNC_DTO__TARGET_REPOSITORY_LOGGED_IN = 5;
    public static final int WORKSPACE_SYNC_DTO__TARGET_REPOSITORY_ID = 6;
    public static final int WORKSPACE_SYNC_DTO__TARGET_REPOSITORY_URL = 7;
    public static final int WORKSPACE_SYNC_DTO__TARGET_WORKSPACE_ITEM_ID = 8;
    public static final int WORKSPACE_SYNC_DTO__TARGET_WORKSPACE_NAME = 9;
    public static final int WORKSPACE_SYNC_DTO__WORKSPACE_ITEM_ID = 10;
    public static final int WORKSPACE_SYNC_DTO__WORKSPACE_NAME = 11;
    public static final int WORKSPACE_SYNC_DTO__IS_STREAM = 12;
    public static final int WORKSPACE_SYNC_DTO_FEATURE_COUNT = 13;
    public static final int COMPONENT_SYNC_DTO = 2;
    public static final int COMPONENT_SYNC_DTO__BOTH_TYPE = 0;
    public static final int COMPONENT_SYNC_DTO__COMPONENT_NAME = 1;
    public static final int COMPONENT_SYNC_DTO__COMPONENT_ITEM_ID = 2;
    public static final int COMPONENT_SYNC_DTO__CURRENT_OUTGOING_CHANGE_SET_ITEM_ID = 3;
    public static final int COMPONENT_SYNC_DTO__ID = 4;
    public static final int COMPONENT_SYNC_DTO__INCOMING_BASELINES = 5;
    public static final int COMPONENT_SYNC_DTO__INCOMING_CHANGE_SETS_AFTER_BASIS = 6;
    public static final int COMPONENT_SYNC_DTO__OUTGOING_BASELINES = 7;
    public static final int COMPONENT_SYNC_DTO__OUTGOING_CHANGE_SETS_AFTER_BASIS = 8;
    public static final int COMPONENT_SYNC_DTO__LOADED = 9;
    public static final int COMPONENT_SYNC_DTO__PRIVATE_TYPE = 10;
    public static final int COMPONENT_SYNC_DTO__REPLACED = 11;
    public static final int COMPONENT_SYNC_DTO__SUSPENDED = 12;
    public static final int COMPONENT_SYNC_DTO__LOCAL_REPOSITORY_ID = 13;
    public static final int COMPONENT_SYNC_DTO__LOCAL_REPOSITORY_URL = 14;
    public static final int COMPONENT_SYNC_DTO__LOCAL_REPOSITORY_LOGGED_IN = 15;
    public static final int COMPONENT_SYNC_DTO__LOCAL_WORKSPACE_ITEM_ID = 16;
    public static final int COMPONENT_SYNC_DTO__LOCAL_WORKSPACE_NAME = 17;
    public static final int COMPONENT_SYNC_DTO__LOCAL_ADDED_TYPE = 18;
    public static final int COMPONENT_SYNC_DTO__LOCAL_REMOVED_TYPE = 19;
    public static final int COMPONENT_SYNC_DTO__ISLOCAL_STREAM = 20;
    public static final int COMPONENT_SYNC_DTO__TARGET_REPOSITORY_ID = 21;
    public static final int COMPONENT_SYNC_DTO__TARGET_REPOSITORY_URL = 22;
    public static final int COMPONENT_SYNC_DTO__TARGET_REPOSITORY_LOGGED_IN = 23;
    public static final int COMPONENT_SYNC_DTO__TARGET_WORKSPACE_ITEM_ID = 24;
    public static final int COMPONENT_SYNC_DTO__TARGET_WORKSPACE_NAME = 25;
    public static final int COMPONENT_SYNC_DTO__TARGET_ADDED_TYPE = 26;
    public static final int COMPONENT_SYNC_DTO__TARGET_REMOVED_TYPE = 27;
    public static final int COMPONENT_SYNC_DTO__IS_TARGET_STREAM = 28;
    public static final int COMPONENT_SYNC_DTO__UNRESOLVED = 29;
    public static final int COMPONENT_SYNC_DTO__CURRENT_PATCH = 30;
    public static final int COMPONENT_SYNC_DTO__ACCEPT_QUEUE_SIZE = 31;
    public static final int COMPONENT_SYNC_DTO__LOCAL_BASELINE = 32;
    public static final int COMPONENT_SYNC_DTO__REMOTE_BASELINE = 33;
    public static final int COMPONENT_SYNC_DTO_FEATURE_COUNT = 34;
    public static final int BASELINE_SYNC_DTO = 3;
    public static final int BASELINE_SYNC_DTO__BASELINE_ID = 0;
    public static final int BASELINE_SYNC_DTO__BASELINE_ITEM_ID = 1;
    public static final int BASELINE_SYNC_DTO__BASELINE_NAME = 2;
    public static final int BASELINE_SYNC_DTO__CHANGE_SETS = 3;
    public static final int BASELINE_SYNC_DTO__CHANGE_SETS_RESOLVED = 4;
    public static final int BASELINE_SYNC_DTO__CREATION_DATE = 5;
    public static final int BASELINE_SYNC_DTO__ID = 6;
    public static final int BASELINE_SYNC_DTO__PREVIOUS_BASELINE_ITEM_ID = 7;
    public static final int BASELINE_SYNC_DTO__PREVIOUS_BASELINE_NAME = 8;
    public static final int BASELINE_SYNC_DTO_FEATURE_COUNT = 9;
    public static final int CHANGE_SET_SYNC_DTO = 4;
    public static final int CHANGE_SET_SYNC_DTO__AUTHOR_CONTRIBUTOR_ITEM_ID = 0;
    public static final int CHANGE_SET_SYNC_DTO__AUTHOR_CONTRIBUTOR_NAME = 1;
    public static final int CHANGE_SET_SYNC_DTO__CHANGE_SET_COMMENT = 2;
    public static final int CHANGE_SET_SYNC_DTO__CHANGE_SET_ITEM_ID = 3;
    public static final int CHANGE_SET_SYNC_DTO__CHANGES = 4;
    public static final int CHANGE_SET_SYNC_DTO__COMPONENT_ITEM_ID = 5;
    public static final int CHANGE_SET_SYNC_DTO__COMPONENT_NAME = 6;
    public static final int CHANGE_SET_SYNC_DTO__HIDDEN_CHANGES = 7;
    public static final int CHANGE_SET_SYNC_DTO__ID = 8;
    public static final int CHANGE_SET_SYNC_DTO__INACCESSIBLE_CHANGES = 9;
    public static final int CHANGE_SET_SYNC_DTO__IS_ACTIVE = 10;
    public static final int CHANGE_SET_SYNC_DTO__LAST_CHANGE_DATE = 11;
    public static final int CHANGE_SET_SYNC_DTO__LAST_CHANGE_FORMATTED_DATE = 12;
    public static final int CHANGE_SET_SYNC_DTO__OSLC_LINKS = 13;
    public static final int CHANGE_SET_SYNC_DTO__REPOSITORY_ID = 14;
    public static final int CHANGE_SET_SYNC_DTO__REPOSITORY_URL = 15;
    public static final int CHANGE_SET_SYNC_DTO__WORK_ITEMS = 16;
    public static final int CHANGE_SET_SYNC_DTO__SOURCE = 17;
    public static final int CHANGE_SET_SYNC_DTO__ORIGINAL_SOURCE = 18;
    public static final int CHANGE_SET_SYNC_DTO__LINKED_TO_CHANGE_SET_IN_OTHER_DIRECTION = 19;
    public static final int CHANGE_SET_SYNC_DTO_FEATURE_COUNT = 20;
    public static final int WORK_ITEM_SYNC_DTO = 5;
    public static final int WORK_ITEM_SYNC_DTO__ID = 0;
    public static final int WORK_ITEM_SYNC_DTO__LABEL = 1;
    public static final int WORK_ITEM_SYNC_DTO__WORK_ITEM_ITEM_ID = 2;
    public static final int WORK_ITEM_SYNC_DTO_FEATURE_COUNT = 3;
    public static final int CHANGE_FOLDER_SYNC_DTO = 6;
    public static final int CHANGE_FOLDER_SYNC_DTO__ID = 0;
    public static final int CHANGE_FOLDER_SYNC_DTO__CHANGES = 1;
    public static final int CHANGE_FOLDER_SYNC_DTO__FOLDER_CHANGE = 2;
    public static final int CHANGE_FOLDER_SYNC_DTO__PATH = 3;
    public static final int CHANGE_FOLDER_SYNC_DTO_FEATURE_COUNT = 4;
    public static final int CHANGE_SYNC_DTO = 7;
    public static final int CHANGE_SYNC_DTO__ADD_TYPE = 0;
    public static final int CHANGE_SYNC_DTO__AFTER_STATE_ID = 1;
    public static final int CHANGE_SYNC_DTO__BEFORE_STATE_ID = 2;
    public static final int CHANGE_SYNC_DTO__CONTENT_CHANGE = 3;
    public static final int CHANGE_SYNC_DTO__DELETE_TYPE = 4;
    public static final int CHANGE_SYNC_DTO__ID = 5;
    public static final int CHANGE_SYNC_DTO__LAST_MERGE_STATE = 6;
    public static final int CHANGE_SYNC_DTO__MISSING_DETAILS = 7;
    public static final int CHANGE_SYNC_DTO__MODIFY_TYPE = 8;
    public static final int CHANGE_SYNC_DTO__MOVE_TYPE = 9;
    public static final int CHANGE_SYNC_DTO__NEW_PATH_HINT = 10;
    public static final int CHANGE_SYNC_DTO__NOOP_TYPE = 11;
    public static final int CHANGE_SYNC_DTO__PATH_HINT = 12;
    public static final int CHANGE_SYNC_DTO__POTENTIAL_CONFLICT = 13;
    public static final int CHANGE_SYNC_DTO__PROPERTY_CHANGE = 14;
    public static final int CHANGE_SYNC_DTO__START_LINE = 15;
    public static final int CHANGE_SYNC_DTO__VERSIONABLE_ITEM_ID = 16;
    public static final int CHANGE_SYNC_DTO__VERSIONABLE_ITEM_TYPE = 17;
    public static final int CHANGE_SYNC_DTO__VERSIONABLE_NAME = 18;
    public static final int CHANGE_SYNC_DTO__BEFORE_PARENT_ITEM_ID = 19;
    public static final int CHANGE_SYNC_DTO__AFTER_PARENT_ITEM_ID = 20;
    public static final int CHANGE_SYNC_DTO__MERGE_STATES = 21;
    public static final int CHANGE_SYNC_DTO_FEATURE_COUNT = 22;
    public static final int UNRESOLVED_FOLDER_SYNC_DTO = 8;
    public static final int UNRESOLVED_FOLDER_SYNC_DTO__CONFLICTS = 0;
    public static final int UNRESOLVED_FOLDER_SYNC_DTO__ID = 1;
    public static final int UNRESOLVED_FOLDER_SYNC_DTO__LOCAL_CHANGES = 2;
    public static final int UNRESOLVED_FOLDER_SYNC_DTO__PATH = 3;
    public static final int UNRESOLVED_FOLDER_SYNC_DTO_FEATURE_COUNT = 4;
    public static final int CONFLICT_SYNC_DTO = 9;
    public static final int CONFLICT_SYNC_DTO__COMMON_ANCESTOR_VERSIONABLE_STATE_ID = 0;
    public static final int CONFLICT_SYNC_DTO__CONFLICT_TYPE = 1;
    public static final int CONFLICT_SYNC_DTO__CONFLICT_TYPE_OUTGOING = 2;
    public static final int CONFLICT_SYNC_DTO__CONFLICT_TYPE_PROPOSED = 3;
    public static final int CONFLICT_SYNC_DTO__CONTENT_CONFLICT = 4;
    public static final int CONFLICT_SYNC_DTO__ID = 5;
    public static final int CONFLICT_SYNC_DTO__KIND = 6;
    public static final int CONFLICT_SYNC_DTO__NAME = 7;
    public static final int CONFLICT_SYNC_DTO__NEW_PATH_HINT = 8;
    public static final int CONFLICT_SYNC_DTO__ORIGINAL_SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID = 9;
    public static final int CONFLICT_SYNC_DTO__PATH_HINT = 10;
    public static final int CONFLICT_SYNC_DTO__PROPERTY_CONFLICT = 11;
    public static final int CONFLICT_SYNC_DTO__PROPOSED_CONTRIBUTOR_VERSIONABLE_STATE_ID = 12;
    public static final int CONFLICT_SYNC_DTO__SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID = 13;
    public static final int CONFLICT_SYNC_DTO__VERSIONABLE_ITEM_ID = 14;
    public static final int CONFLICT_SYNC_DTO__VERSIONABLE_ITEM_TYPE = 15;
    public static final int CONFLICT_SYNC_DTO_FEATURE_COUNT = 16;
    public static final int LOCAL_CHANGE_SYNC_DTO = 10;
    public static final int LOCAL_CHANGE_SYNC_DTO__ADDITION_TYPE = 0;
    public static final int LOCAL_CHANGE_SYNC_DTO__ATTRIBUTES_TYPE = 1;
    public static final int LOCAL_CHANGE_SYNC_DTO__CONTENT_TYPE = 2;
    public static final int LOCAL_CHANGE_SYNC_DTO__DELETION_TYPE = 3;
    public static final int LOCAL_CHANGE_SYNC_DTO__ID = 4;
    public static final int LOCAL_CHANGE_SYNC_DTO__MOVE_TYPE = 5;
    public static final int LOCAL_CHANGE_SYNC_DTO__NAME = 6;
    public static final int LOCAL_CHANGE_SYNC_DTO__ORIGINAL_PATH = 7;
    public static final int LOCAL_CHANGE_SYNC_DTO__PATH = 8;
    public static final int LOCAL_CHANGE_SYNC_DTO__RESULTING_PATH = 9;
    public static final int LOCAL_CHANGE_SYNC_DTO__SANDBOX_PATH = 10;
    public static final int LOCAL_CHANGE_SYNC_DTO__TARGET_VERSIONABLE_ITEM_ID = 11;
    public static final int LOCAL_CHANGE_SYNC_DTO__TARGET_VERSIONABLE_STATE_ID = 12;
    public static final int LOCAL_CHANGE_SYNC_DTO__VERSIONABLE_ITEM_TYPE = 13;
    public static final int LOCAL_CHANGE_SYNC_DTO_FEATURE_COUNT = 14;
    public static final int CE_SYNC_DTO = 11;
    public static final int CE_SYNC_DTO__ADDED_COMPONENTS = 0;
    public static final int CE_SYNC_DTO__CHANGED_COMPONENTS = 1;
    public static final int CE_SYNC_DTO__REMOVED_COMPONENTS = 2;
    public static final int CE_SYNC_DTO_FEATURE_COUNT = 3;
    public static final int CE_COMPONENT_SYNC_DTO = 12;
    public static final int CE_COMPONENT_SYNC_DTO__CHANGE_SETS = 0;
    public static final int CE_COMPONENT_SYNC_DTO__BASELINES = 1;
    public static final int CE_COMPONENT_SYNC_DTO_FEATURE_COUNT = 2;
    public static final int CE_BASELINE_SYNC_DTO = 13;
    public static final int CE_BASELINE_SYNC_DTO__CHANGE_SETS = 0;
    public static final int CE_BASELINE_SYNC_DTO_FEATURE_COUNT = 1;
    public static final int DESCRIPTION_SYNC_DTO = 14;
    public static final int DESCRIPTION_SYNC_DTO__ITEMS = 0;
    public static final int DESCRIPTION_SYNC_DTO_FEATURE_COUNT = 1;
    public static final int DESCRIPTION_ITEM_SYNC_DTO = 15;
    public static final int DESCRIPTION_ITEM_SYNC_DTO__CATEGORY = 0;
    public static final int DESCRIPTION_ITEM_SYNC_DTO__VALUE = 1;
    public static final int DESCRIPTION_ITEM_SYNC_DTO_FEATURE_COUNT = 2;
    public static final int PENDING_PATCHES_DTO = 16;
    public static final int PENDING_PATCHES_DTO__PATCHES = 0;
    public static final int PENDING_PATCHES_DTO_FEATURE_COUNT = 1;
    public static final int SYNC_VIEW_FILTERS_DTO = 17;
    public static final int SYNC_VIEW_FILTERS_DTO__ALL_FLOW_TARGETS = 0;
    public static final int SYNC_VIEW_FILTERS_DTO__ALL_FLOW_TARGETS_DEFAULT = 1;
    public static final int SYNC_VIEW_FILTERS_DTO__MAX_NUMBER_CHANGES_SHOWN_IN_CHANGE_SET = 2;
    public static final int SYNC_VIEW_FILTERS_DTO__MAX_NUMBER_CHANGES_SHOWN_IN_CHANGE_SET_DEFAULT = 3;
    public static final int SYNC_VIEW_FILTERS_DTO__SHOW_ALL_BASELINES = 4;
    public static final int SYNC_VIEW_FILTERS_DTO__SHOW_ALL_BASELINES_DEFAULT = 5;
    public static final int SYNC_VIEW_FILTERS_DTO_FEATURE_COUNT = 6;
    public static final int MERGE_PATCH_DTO = 18;
    public static final int MERGE_PATCH_DTO__SOME_HUNKS_FAILED = 0;
    public static final int MERGE_PATCH_DTO__SOME_HUNKS_MATCHED = 1;
    public static final int MERGE_PATCH_DTO_FEATURE_COUNT = 2;
    public static final int ACCEPT_AS_PATCH_DTO = 19;
    public static final int ACCEPT_AS_PATCH_DTO__PENDING_PATCH_IDS = 0;
    public static final int ACCEPT_AS_PATCH_DTO_FEATURE_COUNT = 1;
    public static final int GET_BASELINES_DTO = 20;
    public static final int GET_BASELINES_DTO__BASELINE_HISTORY_ENTRIES_IN_WORKSPACE = 0;
    public static final int GET_BASELINES_DTO__BASELINES_IN_REPOSITORY = 1;
    public static final int GET_BASELINES_DTO__TOTAL_ENTRIES = 2;
    public static final int GET_BASELINES_DTO_FEATURE_COUNT = 3;
    public static final int BASELINE_HISTORY_ENTRY_DTO = 21;
    public static final int BASELINE_HISTORY_ENTRY_DTO__BASELINE = 0;
    public static final int BASELINE_HISTORY_ENTRY_DTO__DELIVERED_BY_ITEM_ID = 1;
    public static final int BASELINE_HISTORY_ENTRY_DTO__DELIVERY_DATE = 2;
    public static final int BASELINE_HISTORY_ENTRY_DTO_FEATURE_COUNT = 3;
    public static final int SAME_OCCURRENCE_SYNC_DTO = 22;
    public static final int SAME_OCCURRENCE_SYNC_DTO__ID = 0;
    public static final int SAME_OCCURRENCE_SYNC_DTO__INCOMING = 1;
    public static final int SAME_OCCURRENCE_SYNC_DTO__OUTGOING = 2;
    public static final int SAME_OCCURRENCE_SYNC_DTO__SUSPENDED = 3;
    public static final int SAME_OCCURRENCE_SYNC_DTO__UNRESOLVED = 4;
    public static final int SAME_OCCURRENCE_SYNC_DTO_FEATURE_COUNT = 5;
    public static final int SAME_OCCURRENCES_SYNC_DTO = 23;
    public static final int SAME_OCCURRENCES_SYNC_DTO__OCCURRENCES = 0;
    public static final int SAME_OCCURRENCES_SYNC_DTO_FEATURE_COUNT = 1;
    public static final int GET_BASELINE_SETS_DTO = 24;
    public static final int GET_BASELINE_SETS_DTO__BASELINE_SETS = 0;
    public static final int GET_BASELINE_SETS_DTO_FEATURE_COUNT = 1;
    public static final int OUT_OF_SYNC_WORKSPACE_DTO = 25;
    public static final int OUT_OF_SYNC_WORKSPACE_DTO__COMPONENTS = 0;
    public static final int OUT_OF_SYNC_WORKSPACE_DTO__REPOSITORY_ID = 1;
    public static final int OUT_OF_SYNC_WORKSPACE_DTO__REPOSITORY_URL = 2;
    public static final int OUT_OF_SYNC_WORKSPACE_DTO__WORKSPACE_ITEM_ID = 3;
    public static final int OUT_OF_SYNC_WORKSPACE_DTO_FEATURE_COUNT = 4;
    public static final int OUT_OF_SYNC_WORKSPACES_DTO = 26;
    public static final int OUT_OF_SYNC_WORKSPACES_DTO__WORKSPACES = 0;
    public static final int OUT_OF_SYNC_WORKSPACES_DTO_FEATURE_COUNT = 1;
    public static final int OUT_OF_SYNC_COMPONENT_DTO = 27;
    public static final int OUT_OF_SYNC_COMPONENT_DTO__COMPONENT_ITEM_ID = 0;
    public static final int OUT_OF_SYNC_COMPONENT_DTO__OUT_OF_SYNC_SHARES_COUNT = 1;
    public static final int OUT_OF_SYNC_COMPONENT_DTO__OUT_OF_SYNC_SHARES = 2;
    public static final int OUT_OF_SYNC_COMPONENT_DTO_FEATURE_COUNT = 3;
    public static final int VERIFY_IN_SYNC_RESULT_DTO = 28;
    public static final int VERIFY_IN_SYNC_RESULT_DTO__CANCELLED = 0;
    public static final int VERIFY_IN_SYNC_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int VERIFY_IN_SYNC_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 2;
    public static final int VERIFY_IN_SYNC_RESULT_DTO_FEATURE_COUNT = 3;
    public static final int OSLC_LINK_DTO = 29;
    public static final int OSLC_LINK_DTO__LINK_TYPE_ID = 0;
    public static final int OSLC_LINK_DTO__LOCAL_DESCRIPTION = 1;
    public static final int OSLC_LINK_DTO__REPOSITORY_ID = 2;
    public static final int OSLC_LINK_DTO__REPOSITORY_URL = 3;
    public static final int OSLC_LINK_DTO__RESOLVED_DESCRIPTION = 4;
    public static final int OSLC_LINK_DTO__RESOLVED_ICON_URI = 5;
    public static final int OSLC_LINK_DTO__TARGET_EXTRA_INFO = 6;
    public static final int OSLC_LINK_DTO__TARGET_CONTENT_TYPE = 7;
    public static final int OSLC_LINK_DTO__TARGET_REPOSITORY_ID = 8;
    public static final int OSLC_LINK_DTO__TARGET_REPOSITORY_URL = 9;
    public static final int OSLC_LINK_DTO__TARGET_URI = 10;
    public static final int OSLC_LINK_DTO_FEATURE_COUNT = 11;
    public static final int SYNC_STATUS_DTO = 30;
    public static final int SYNC_STATUS_DTO__NCOLLISION = 0;
    public static final int SYNC_STATUS_DTO__NCOMPONENT_CHANGES = 1;
    public static final int SYNC_STATUS_DTO__NCONFLICT = 2;
    public static final int SYNC_STATUS_DTO__NINCOMING = 3;
    public static final int SYNC_STATUS_DTO__NINCOMING_BASELINES = 4;
    public static final int SYNC_STATUS_DTO__NLOCAL = 5;
    public static final int SYNC_STATUS_DTO__NOUTGOING = 6;
    public static final int SYNC_STATUS_DTO__NOUTGOING_BASELINES = 7;
    public static final int SYNC_STATUS_DTO_FEATURE_COUNT = 8;
    
    EClass getSyncViewDTO();
    
    EReference getSyncViewDTO_Workspaces();
    
    EAttribute getSyncViewDTO_Id();
    
    EClass getWorkspaceSyncDTO();
    
    EAttribute getWorkspaceSyncDTO_WorkspaceName();
    
    EAttribute getWorkspaceSyncDTO_IsStream();
    
    EAttribute getWorkspaceSyncDTO_RepositoryUrl();
    
    EAttribute getWorkspaceSyncDTO_RepositoryLoggedIn();
    
    EAttribute getWorkspaceSyncDTO_WorkspaceItemId();
    
    EAttribute getWorkspaceSyncDTO_TargetWorkspaceItemId();
    
    EAttribute getWorkspaceSyncDTO_TargetRepositoryLoggedIn();
    
    EAttribute getWorkspaceSyncDTO_TargetRepositoryId();
    
    EReference getWorkspaceSyncDTO_Components();
    
    EAttribute getWorkspaceSyncDTO_TargetWorkspaceName();
    
    EAttribute getWorkspaceSyncDTO_TargetRepositoryUrl();
    
    EAttribute getWorkspaceSyncDTO_Id();
    
    EAttribute getWorkspaceSyncDTO_RepositoryId();
    
    EClass getComponentSyncDTO();
    
    EAttribute getComponentSyncDTO_ComponentName();
    
    EAttribute getComponentSyncDTO_ComponentItemId();
    
    EReference getComponentSyncDTO_OutgoingChangeSetsAfterBasis();
    
    EReference getComponentSyncDTO_OutgoingBaselines();
    
    EReference getComponentSyncDTO_IncomingChangeSetsAfterBasis();
    
    EReference getComponentSyncDTO_IncomingBaselines();
    
    EReference getComponentSyncDTO_Suspended();
    
    EAttribute getComponentSyncDTO_LocalRepositoryId();
    
    EAttribute getComponentSyncDTO_LocalRepositoryUrl();
    
    EAttribute getComponentSyncDTO_LocalRepositoryLoggedIn();
    
    EAttribute getComponentSyncDTO_LocalWorkspaceItemId();
    
    EAttribute getComponentSyncDTO_LocalWorkspaceName();
    
    EAttribute getComponentSyncDTO_TargetRepositoryId();
    
    EReference getComponentSyncDTO_Unresolved();
    
    EAttribute getComponentSyncDTO_IsTargetStream();
    
    EReference getComponentSyncDTO_CurrentPatch();
    
    EAttribute getComponentSyncDTO_AcceptQueueSize();
    
    EReference getComponentSyncDTO_LocalBaseline();
    
    EReference getComponentSyncDTO_RemoteBaseline();
    
    EAttribute getComponentSyncDTO_TargetRepositoryUrl();
    
    EAttribute getComponentSyncDTO_TargetRepositoryLoggedIn();
    
    EAttribute getComponentSyncDTO_TargetWorkspaceItemId();
    
    EAttribute getComponentSyncDTO_TargetWorkspaceName();
    
    EAttribute getComponentSyncDTO_CurrentOutgoingChangeSetItemId();
    
    EAttribute getComponentSyncDTO_PrivateType();
    
    EAttribute getComponentSyncDTO_BothType();
    
    EAttribute getComponentSyncDTO_LocalAddedType();
    
    EAttribute getComponentSyncDTO_LocalRemovedType();
    
    EAttribute getComponentSyncDTO_IslocalStream();
    
    EAttribute getComponentSyncDTO_TargetAddedType();
    
    EAttribute getComponentSyncDTO_TargetRemovedType();
    
    EAttribute getComponentSyncDTO_Replaced();
    
    EAttribute getComponentSyncDTO_Id();
    
    EAttribute getComponentSyncDTO_Loaded();
    
    EClass getBaselineSyncDTO();
    
    EAttribute getBaselineSyncDTO_BaselineName();
    
    EAttribute getBaselineSyncDTO_BaselineItemId();
    
    EAttribute getBaselineSyncDTO_PreviousBaselineItemId();
    
    EAttribute getBaselineSyncDTO_ChangeSetsResolved();
    
    EReference getBaselineSyncDTO_ChangeSets();
    
    EAttribute getBaselineSyncDTO_PreviousBaselineName();
    
    EAttribute getBaselineSyncDTO_Id();
    
    EAttribute getBaselineSyncDTO_CreationDate();
    
    EAttribute getBaselineSyncDTO_BaselineId();
    
    EClass getChangeSetSyncDTO();
    
    EAttribute getChangeSetSyncDTO_ChangeSetComment();
    
    EAttribute getChangeSetSyncDTO_ChangeSetItemId();
    
    EReference getChangeSetSyncDTO_WorkItems();
    
    EReference getChangeSetSyncDTO_Source();
    
    EReference getChangeSetSyncDTO_OriginalSource();
    
    EAttribute getChangeSetSyncDTO_LinkedToChangeSetInOtherDirection();
    
    EReference getChangeSetSyncDTO_Changes();
    
    EAttribute getChangeSetSyncDTO_HiddenChanges();
    
    EAttribute getChangeSetSyncDTO_InaccessibleChanges();
    
    EAttribute getChangeSetSyncDTO_IsActive();
    
    EAttribute getChangeSetSyncDTO_AuthorContributorItemId();
    
    EAttribute getChangeSetSyncDTO_LastChangeFormattedDate();
    
    EAttribute getChangeSetSyncDTO_LastChangeDate();
    
    EAttribute getChangeSetSyncDTO_AuthorContributorName();
    
    EAttribute getChangeSetSyncDTO_ComponentItemId();
    
    EAttribute getChangeSetSyncDTO_ComponentName();
    
    EAttribute getChangeSetSyncDTO_RepositoryUrl();
    
    EAttribute getChangeSetSyncDTO_Id();
    
    EReference getChangeSetSyncDTO_OslcLinks();
    
    EAttribute getChangeSetSyncDTO_RepositoryId();
    
    EClass getWorkItemSyncDTO();
    
    EAttribute getWorkItemSyncDTO_Label();
    
    EAttribute getWorkItemSyncDTO_WorkItemItemId();
    
    EAttribute getWorkItemSyncDTO_Id();
    
    EClass getChangeFolderSyncDTO();
    
    EAttribute getChangeFolderSyncDTO_Path();
    
    EReference getChangeFolderSyncDTO_Changes();
    
    EReference getChangeFolderSyncDTO_FolderChange();
    
    EAttribute getChangeFolderSyncDTO_Id();
    
    EClass getChangeSyncDTO();
    
    EAttribute getChangeSyncDTO_VersionableName();
    
    EAttribute getChangeSyncDTO_BeforeParentItemId();
    
    EAttribute getChangeSyncDTO_AfterParentItemId();
    
    EAttribute getChangeSyncDTO_MergeStates();
    
    EAttribute getChangeSyncDTO_VersionableItemId();
    
    EAttribute getChangeSyncDTO_VersionableItemType();
    
    EAttribute getChangeSyncDTO_BeforeStateId();
    
    EAttribute getChangeSyncDTO_AfterStateId();
    
    EAttribute getChangeSyncDTO_AddType();
    
    EAttribute getChangeSyncDTO_DeleteType();
    
    EAttribute getChangeSyncDTO_ModifyType();
    
    EAttribute getChangeSyncDTO_NoopType();
    
    EAttribute getChangeSyncDTO_MissingDetails();
    
    EAttribute getChangeSyncDTO_StartLine();
    
    EAttribute getChangeSyncDTO_ContentChange();
    
    EAttribute getChangeSyncDTO_PropertyChange();
    
    EAttribute getChangeSyncDTO_PathHint();
    
    EAttribute getChangeSyncDTO_NewPathHint();
    
    EAttribute getChangeSyncDTO_MoveType();
    
    EAttribute getChangeSyncDTO_PotentialConflict();
    
    EAttribute getChangeSyncDTO_LastMergeState();
    
    EAttribute getChangeSyncDTO_Id();
    
    EClass getUnresolvedFolderSyncDTO();
    
    EReference getUnresolvedFolderSyncDTO_Conflicts();
    
    EReference getUnresolvedFolderSyncDTO_LocalChanges();
    
    EAttribute getUnresolvedFolderSyncDTO_Path();
    
    EAttribute getUnresolvedFolderSyncDTO_Id();
    
    EClass getConflictSyncDTO();
    
    EAttribute getConflictSyncDTO_PathHint();
    
    EAttribute getConflictSyncDTO_VersionableItemId();
    
    EAttribute getConflictSyncDTO_VersionableItemType();
    
    EAttribute getConflictSyncDTO_ConflictTypeOutgoing();
    
    EAttribute getConflictSyncDTO_ConflictTypeProposed();
    
    EAttribute getConflictSyncDTO_NewPathHint();
    
    EAttribute getConflictSyncDTO_Name();
    
    EAttribute getConflictSyncDTO_CommonAncestorVersionableStateId();
    
    EAttribute getConflictSyncDTO_SelectedContributorVersionableStateId();
    
    EAttribute getConflictSyncDTO_OriginalSelectedContributorVersionableStateId();
    
    EAttribute getConflictSyncDTO_ProposedContributorVersionableStateId();
    
    EAttribute getConflictSyncDTO_Kind();
    
    EAttribute getConflictSyncDTO_ConflictType();
    
    EAttribute getConflictSyncDTO_Id();
    
    EAttribute getConflictSyncDTO_ContentConflict();
    
    EAttribute getConflictSyncDTO_PropertyConflict();
    
    EClass getLocalChangeSyncDTO();
    
    EAttribute getLocalChangeSyncDTO_Name();
    
    EAttribute getLocalChangeSyncDTO_TargetVersionableItemId();
    
    EAttribute getLocalChangeSyncDTO_VersionableItemType();
    
    EAttribute getLocalChangeSyncDTO_ContentType();
    
    EAttribute getLocalChangeSyncDTO_AdditionType();
    
    EAttribute getLocalChangeSyncDTO_DeletionType();
    
    EAttribute getLocalChangeSyncDTO_MoveType();
    
    EAttribute getLocalChangeSyncDTO_AttributesType();
    
    EAttribute getLocalChangeSyncDTO_Path();
    
    EAttribute getLocalChangeSyncDTO_ResultingPath();
    
    EAttribute getLocalChangeSyncDTO_OriginalPath();
    
    EAttribute getLocalChangeSyncDTO_TargetVersionableStateId();
    
    EAttribute getLocalChangeSyncDTO_Id();
    
    EAttribute getLocalChangeSyncDTO_SandboxPath();
    
    EClass getCESyncDTO();
    
    EAttribute getCESyncDTO_AddedComponents();
    
    EAttribute getCESyncDTO_RemovedComponents();
    
    EAttribute getCESyncDTO_ChangedComponents();
    
    EClass getCEComponentSyncDTO();
    
    EAttribute getCEComponentSyncDTO_ChangeSets();
    
    EAttribute getCEComponentSyncDTO_Baselines();
    
    EClass getCEBaselineSyncDTO();
    
    EAttribute getCEBaselineSyncDTO_ChangeSets();
    
    EClass getDescriptionSyncDTO();
    
    EReference getDescriptionSyncDTO_Items();
    
    EClass getDescriptionItemSyncDTO();
    
    EAttribute getDescriptionItemSyncDTO_Category();
    
    EAttribute getDescriptionItemSyncDTO_Value();
    
    EClass getSyncViewFiltersDTO();
    
    EAttribute getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSet();
    
    EAttribute getSyncViewFiltersDTO_AllFlowTargets();
    
    EAttribute getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSetDefault();
    
    EAttribute getSyncViewFiltersDTO_AllFlowTargetsDefault();
    
    EAttribute getSyncViewFiltersDTO_ShowAllBaselines();
    
    EAttribute getSyncViewFiltersDTO_ShowAllBaselinesDefault();
    
    EClass getMergePatchDTO();
    
    EAttribute getMergePatchDTO_SomeHunksMatched();
    
    EAttribute getMergePatchDTO_SomeHunksFailed();
    
    EClass getAcceptAsPatchDTO();
    
    EAttribute getAcceptAsPatchDTO_PendingPatchIds();
    
    EClass getGetBaselinesDTO();
    
    EAttribute getGetBaselinesDTO_TotalEntries();
    
    EReference getGetBaselinesDTO_BaselineHistoryEntriesInWorkspace();
    
    EReference getGetBaselinesDTO_BaselinesInRepository();
    
    EClass getBaselineHistoryEntryDTO();
    
    EAttribute getBaselineHistoryEntryDTO_DeliveredByItemId();
    
    EAttribute getBaselineHistoryEntryDTO_DeliveryDate();
    
    EReference getBaselineHistoryEntryDTO_Baseline();
    
    EClass getSameOccurrenceSyncDTO();
    
    EAttribute getSameOccurrenceSyncDTO_Id();
    
    EAttribute getSameOccurrenceSyncDTO_Outgoing();
    
    EAttribute getSameOccurrenceSyncDTO_Incoming();
    
    EAttribute getSameOccurrenceSyncDTO_Suspended();
    
    EAttribute getSameOccurrenceSyncDTO_Unresolved();
    
    EClass getSameOccurrencesSyncDTO();
    
    EReference getSameOccurrencesSyncDTO_Occurrences();
    
    EClass getGetBaselineSetsDTO();
    
    EReference getGetBaselineSetsDTO_BaselineSets();
    
    EClass getOutOfSyncWorkspaceDTO();
    
    EAttribute getOutOfSyncWorkspaceDTO_RepositoryUrl();
    
    EAttribute getOutOfSyncWorkspaceDTO_WorkspaceItemId();
    
    EReference getOutOfSyncWorkspaceDTO_Components();
    
    EAttribute getOutOfSyncWorkspaceDTO_RepositoryId();
    
    EClass getOutOfSyncWorkspacesDTO();
    
    EReference getOutOfSyncWorkspacesDTO_Workspaces();
    
    EClass getOutOfSyncComponentDTO();
    
    EAttribute getOutOfSyncComponentDTO_ComponentItemId();
    
    EAttribute getOutOfSyncComponentDTO_OutOfSyncSharesCount();
    
    EReference getOutOfSyncComponentDTO_OutOfSyncShares();
    
    EClass getVerifyInSyncResultDTO();
    
    EAttribute getVerifyInSyncResultDTO_Cancelled();
    
    EReference getVerifyInSyncResultDTO_OutOfSyncShares();
    
    EReference getVerifyInSyncResultDTO_SandboxUpdateDilemma();
    
    EClass getOslcLinkDTO();
    
    EAttribute getOslcLinkDTO_TargetUri();
    
    EAttribute getOslcLinkDTO_LinkTypeId();
    
    EAttribute getOslcLinkDTO_TargetExtraInfo();
    
    EAttribute getOslcLinkDTO_TargetContentType();
    
    EAttribute getOslcLinkDTO_TargetRepositoryId();
    
    EAttribute getOslcLinkDTO_LocalDescription();
    
    EAttribute getOslcLinkDTO_RepositoryId();
    
    EAttribute getOslcLinkDTO_ResolvedDescription();
    
    EAttribute getOslcLinkDTO_ResolvedIconUri();
    
    EAttribute getOslcLinkDTO_RepositoryUrl();
    
    EAttribute getOslcLinkDTO_TargetRepositoryUrl();
    
    EClass getSyncStatusDTO();
    
    EAttribute getSyncStatusDTO_NLocal();
    
    EAttribute getSyncStatusDTO_NIncomingBaselines();
    
    EAttribute getSyncStatusDTO_NIncoming();
    
    EAttribute getSyncStatusDTO_NOutgoingBaselines();
    
    EAttribute getSyncStatusDTO_NOutgoing();
    
    EAttribute getSyncStatusDTO_NConflict();
    
    EAttribute getSyncStatusDTO_NCollision();
    
    EAttribute getSyncStatusDTO_NComponentChanges();
    
    EClass getPendingPatchesDTO();
    
    EReference getPendingPatchesDTO_Patches();
    
    FilesystemRestClientDTOsyncFactory getFilesystemRestClientDTOsyncFactory();
    
    public interface Literals
    {
        public static final EClass SYNC_VIEW_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewDTO();
        public static final EReference SYNC_VIEW_DTO__WORKSPACES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewDTO_Workspaces();
        public static final EAttribute SYNC_VIEW_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewDTO_Id();
        public static final EClass WORKSPACE_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO();
        public static final EAttribute WORKSPACE_SYNC_DTO__WORKSPACE_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_WorkspaceName();
        public static final EAttribute WORKSPACE_SYNC_DTO__IS_STREAM = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_IsStream();
        public static final EAttribute WORKSPACE_SYNC_DTO__REPOSITORY_URL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_RepositoryUrl();
        public static final EAttribute WORKSPACE_SYNC_DTO__REPOSITORY_LOGGED_IN = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_RepositoryLoggedIn();
        public static final EAttribute WORKSPACE_SYNC_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_WorkspaceItemId();
        public static final EAttribute WORKSPACE_SYNC_DTO__TARGET_WORKSPACE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_TargetWorkspaceItemId();
        public static final EAttribute WORKSPACE_SYNC_DTO__TARGET_REPOSITORY_LOGGED_IN = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_TargetRepositoryLoggedIn();
        public static final EAttribute WORKSPACE_SYNC_DTO__TARGET_REPOSITORY_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_TargetRepositoryId();
        public static final EReference WORKSPACE_SYNC_DTO__COMPONENTS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_Components();
        public static final EAttribute WORKSPACE_SYNC_DTO__TARGET_WORKSPACE_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_TargetWorkspaceName();
        public static final EAttribute WORKSPACE_SYNC_DTO__TARGET_REPOSITORY_URL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_TargetRepositoryUrl();
        public static final EAttribute WORKSPACE_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_Id();
        public static final EAttribute WORKSPACE_SYNC_DTO__REPOSITORY_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkspaceSyncDTO_RepositoryId();
        public static final EClass COMPONENT_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO();
        public static final EAttribute COMPONENT_SYNC_DTO__COMPONENT_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_ComponentName();
        public static final EAttribute COMPONENT_SYNC_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_ComponentItemId();
        public static final EReference COMPONENT_SYNC_DTO__OUTGOING_CHANGE_SETS_AFTER_BASIS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_OutgoingChangeSetsAfterBasis();
        public static final EReference COMPONENT_SYNC_DTO__OUTGOING_BASELINES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_OutgoingBaselines();
        public static final EReference COMPONENT_SYNC_DTO__INCOMING_CHANGE_SETS_AFTER_BASIS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_IncomingChangeSetsAfterBasis();
        public static final EReference COMPONENT_SYNC_DTO__INCOMING_BASELINES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_IncomingBaselines();
        public static final EReference COMPONENT_SYNC_DTO__SUSPENDED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_Suspended();
        public static final EAttribute COMPONENT_SYNC_DTO__LOCAL_REPOSITORY_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_LocalRepositoryId();
        public static final EAttribute COMPONENT_SYNC_DTO__LOCAL_REPOSITORY_URL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_LocalRepositoryUrl();
        public static final EAttribute COMPONENT_SYNC_DTO__LOCAL_REPOSITORY_LOGGED_IN = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_LocalRepositoryLoggedIn();
        public static final EAttribute COMPONENT_SYNC_DTO__LOCAL_WORKSPACE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_LocalWorkspaceItemId();
        public static final EAttribute COMPONENT_SYNC_DTO__LOCAL_WORKSPACE_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_LocalWorkspaceName();
        public static final EAttribute COMPONENT_SYNC_DTO__TARGET_REPOSITORY_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_TargetRepositoryId();
        public static final EReference COMPONENT_SYNC_DTO__UNRESOLVED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_Unresolved();
        public static final EAttribute COMPONENT_SYNC_DTO__IS_TARGET_STREAM = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_IsTargetStream();
        public static final EReference COMPONENT_SYNC_DTO__CURRENT_PATCH = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_CurrentPatch();
        public static final EAttribute COMPONENT_SYNC_DTO__ACCEPT_QUEUE_SIZE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_AcceptQueueSize();
        public static final EReference COMPONENT_SYNC_DTO__LOCAL_BASELINE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_LocalBaseline();
        public static final EReference COMPONENT_SYNC_DTO__REMOTE_BASELINE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_RemoteBaseline();
        public static final EAttribute COMPONENT_SYNC_DTO__TARGET_REPOSITORY_URL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_TargetRepositoryUrl();
        public static final EAttribute COMPONENT_SYNC_DTO__TARGET_REPOSITORY_LOGGED_IN = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_TargetRepositoryLoggedIn();
        public static final EAttribute COMPONENT_SYNC_DTO__TARGET_WORKSPACE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_TargetWorkspaceItemId();
        public static final EAttribute COMPONENT_SYNC_DTO__TARGET_WORKSPACE_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_TargetWorkspaceName();
        public static final EAttribute COMPONENT_SYNC_DTO__CURRENT_OUTGOING_CHANGE_SET_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_CurrentOutgoingChangeSetItemId();
        public static final EAttribute COMPONENT_SYNC_DTO__PRIVATE_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_PrivateType();
        public static final EAttribute COMPONENT_SYNC_DTO__BOTH_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_BothType();
        public static final EAttribute COMPONENT_SYNC_DTO__LOCAL_ADDED_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_LocalAddedType();
        public static final EAttribute COMPONENT_SYNC_DTO__LOCAL_REMOVED_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_LocalRemovedType();
        public static final EAttribute COMPONENT_SYNC_DTO__ISLOCAL_STREAM = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_IslocalStream();
        public static final EAttribute COMPONENT_SYNC_DTO__TARGET_ADDED_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_TargetAddedType();
        public static final EAttribute COMPONENT_SYNC_DTO__TARGET_REMOVED_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_TargetRemovedType();
        public static final EAttribute COMPONENT_SYNC_DTO__REPLACED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_Replaced();
        public static final EAttribute COMPONENT_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_Id();
        public static final EAttribute COMPONENT_SYNC_DTO__LOADED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getComponentSyncDTO_Loaded();
        public static final EClass BASELINE_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO();
        public static final EAttribute BASELINE_SYNC_DTO__BASELINE_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_BaselineName();
        public static final EAttribute BASELINE_SYNC_DTO__BASELINE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_BaselineItemId();
        public static final EAttribute BASELINE_SYNC_DTO__PREVIOUS_BASELINE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_PreviousBaselineItemId();
        public static final EAttribute BASELINE_SYNC_DTO__CHANGE_SETS_RESOLVED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_ChangeSetsResolved();
        public static final EReference BASELINE_SYNC_DTO__CHANGE_SETS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_ChangeSets();
        public static final EAttribute BASELINE_SYNC_DTO__PREVIOUS_BASELINE_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_PreviousBaselineName();
        public static final EAttribute BASELINE_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_Id();
        public static final EAttribute BASELINE_SYNC_DTO__CREATION_DATE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_CreationDate();
        public static final EAttribute BASELINE_SYNC_DTO__BASELINE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineSyncDTO_BaselineId();
        public static final EClass CHANGE_SET_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO();
        public static final EAttribute CHANGE_SET_SYNC_DTO__CHANGE_SET_COMMENT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_ChangeSetComment();
        public static final EAttribute CHANGE_SET_SYNC_DTO__CHANGE_SET_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_ChangeSetItemId();
        public static final EReference CHANGE_SET_SYNC_DTO__WORK_ITEMS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_WorkItems();
        public static final EReference CHANGE_SET_SYNC_DTO__SOURCE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_Source();
        public static final EReference CHANGE_SET_SYNC_DTO__ORIGINAL_SOURCE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_OriginalSource();
        public static final EAttribute CHANGE_SET_SYNC_DTO__LINKED_TO_CHANGE_SET_IN_OTHER_DIRECTION = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_LinkedToChangeSetInOtherDirection();
        public static final EReference CHANGE_SET_SYNC_DTO__CHANGES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_Changes();
        public static final EAttribute CHANGE_SET_SYNC_DTO__HIDDEN_CHANGES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_HiddenChanges();
        public static final EAttribute CHANGE_SET_SYNC_DTO__INACCESSIBLE_CHANGES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_InaccessibleChanges();
        public static final EAttribute CHANGE_SET_SYNC_DTO__IS_ACTIVE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_IsActive();
        public static final EAttribute CHANGE_SET_SYNC_DTO__AUTHOR_CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_AuthorContributorItemId();
        public static final EAttribute CHANGE_SET_SYNC_DTO__LAST_CHANGE_FORMATTED_DATE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_LastChangeFormattedDate();
        public static final EAttribute CHANGE_SET_SYNC_DTO__LAST_CHANGE_DATE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_LastChangeDate();
        public static final EAttribute CHANGE_SET_SYNC_DTO__AUTHOR_CONTRIBUTOR_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_AuthorContributorName();
        public static final EAttribute CHANGE_SET_SYNC_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_ComponentItemId();
        public static final EAttribute CHANGE_SET_SYNC_DTO__COMPONENT_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_ComponentName();
        public static final EAttribute CHANGE_SET_SYNC_DTO__REPOSITORY_URL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_RepositoryUrl();
        public static final EAttribute CHANGE_SET_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_Id();
        public static final EReference CHANGE_SET_SYNC_DTO__OSLC_LINKS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_OslcLinks();
        public static final EAttribute CHANGE_SET_SYNC_DTO__REPOSITORY_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSetSyncDTO_RepositoryId();
        public static final EClass WORK_ITEM_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkItemSyncDTO();
        public static final EAttribute WORK_ITEM_SYNC_DTO__LABEL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkItemSyncDTO_Label();
        public static final EAttribute WORK_ITEM_SYNC_DTO__WORK_ITEM_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkItemSyncDTO_WorkItemItemId();
        public static final EAttribute WORK_ITEM_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getWorkItemSyncDTO_Id();
        public static final EClass CHANGE_FOLDER_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeFolderSyncDTO();
        public static final EAttribute CHANGE_FOLDER_SYNC_DTO__PATH = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeFolderSyncDTO_Path();
        public static final EReference CHANGE_FOLDER_SYNC_DTO__CHANGES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeFolderSyncDTO_Changes();
        public static final EReference CHANGE_FOLDER_SYNC_DTO__FOLDER_CHANGE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeFolderSyncDTO_FolderChange();
        public static final EAttribute CHANGE_FOLDER_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeFolderSyncDTO_Id();
        public static final EClass CHANGE_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO();
        public static final EAttribute CHANGE_SYNC_DTO__VERSIONABLE_NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_VersionableName();
        public static final EAttribute CHANGE_SYNC_DTO__BEFORE_PARENT_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_BeforeParentItemId();
        public static final EAttribute CHANGE_SYNC_DTO__AFTER_PARENT_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_AfterParentItemId();
        public static final EAttribute CHANGE_SYNC_DTO__MERGE_STATES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_MergeStates();
        public static final EAttribute CHANGE_SYNC_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_VersionableItemId();
        public static final EAttribute CHANGE_SYNC_DTO__VERSIONABLE_ITEM_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_VersionableItemType();
        public static final EAttribute CHANGE_SYNC_DTO__BEFORE_STATE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_BeforeStateId();
        public static final EAttribute CHANGE_SYNC_DTO__AFTER_STATE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_AfterStateId();
        public static final EAttribute CHANGE_SYNC_DTO__ADD_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_AddType();
        public static final EAttribute CHANGE_SYNC_DTO__DELETE_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_DeleteType();
        public static final EAttribute CHANGE_SYNC_DTO__MODIFY_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_ModifyType();
        public static final EAttribute CHANGE_SYNC_DTO__NOOP_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_NoopType();
        public static final EAttribute CHANGE_SYNC_DTO__MISSING_DETAILS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_MissingDetails();
        public static final EAttribute CHANGE_SYNC_DTO__PATH_HINT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_PathHint();
        public static final EAttribute CHANGE_SYNC_DTO__NEW_PATH_HINT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_NewPathHint();
        public static final EAttribute CHANGE_SYNC_DTO__MOVE_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_MoveType();
        public static final EAttribute CHANGE_SYNC_DTO__POTENTIAL_CONFLICT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_PotentialConflict();
        public static final EAttribute CHANGE_SYNC_DTO__LAST_MERGE_STATE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_LastMergeState();
        public static final EAttribute CHANGE_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_Id();
        public static final EAttribute CHANGE_SYNC_DTO__START_LINE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_StartLine();
        public static final EAttribute CHANGE_SYNC_DTO__CONTENT_CHANGE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_ContentChange();
        public static final EAttribute CHANGE_SYNC_DTO__PROPERTY_CHANGE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getChangeSyncDTO_PropertyChange();
        public static final EClass UNRESOLVED_FOLDER_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getUnresolvedFolderSyncDTO();
        public static final EReference UNRESOLVED_FOLDER_SYNC_DTO__CONFLICTS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getUnresolvedFolderSyncDTO_Conflicts();
        public static final EReference UNRESOLVED_FOLDER_SYNC_DTO__LOCAL_CHANGES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getUnresolvedFolderSyncDTO_LocalChanges();
        public static final EAttribute UNRESOLVED_FOLDER_SYNC_DTO__PATH = FilesystemRestClientDTOsyncPackage.eINSTANCE.getUnresolvedFolderSyncDTO_Path();
        public static final EAttribute UNRESOLVED_FOLDER_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getUnresolvedFolderSyncDTO_Id();
        public static final EClass CONFLICT_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO();
        public static final EAttribute CONFLICT_SYNC_DTO__PATH_HINT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_PathHint();
        public static final EAttribute CONFLICT_SYNC_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_VersionableItemId();
        public static final EAttribute CONFLICT_SYNC_DTO__VERSIONABLE_ITEM_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_VersionableItemType();
        public static final EAttribute CONFLICT_SYNC_DTO__CONFLICT_TYPE_OUTGOING = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_ConflictTypeOutgoing();
        public static final EAttribute CONFLICT_SYNC_DTO__CONFLICT_TYPE_PROPOSED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_ConflictTypeProposed();
        public static final EAttribute CONFLICT_SYNC_DTO__NEW_PATH_HINT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_NewPathHint();
        public static final EAttribute CONFLICT_SYNC_DTO__NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_Name();
        public static final EAttribute CONFLICT_SYNC_DTO__COMMON_ANCESTOR_VERSIONABLE_STATE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_CommonAncestorVersionableStateId();
        public static final EAttribute CONFLICT_SYNC_DTO__SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_SelectedContributorVersionableStateId();
        public static final EAttribute CONFLICT_SYNC_DTO__ORIGINAL_SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_OriginalSelectedContributorVersionableStateId();
        public static final EAttribute CONFLICT_SYNC_DTO__PROPOSED_CONTRIBUTOR_VERSIONABLE_STATE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_ProposedContributorVersionableStateId();
        public static final EAttribute CONFLICT_SYNC_DTO__KIND = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_Kind();
        public static final EAttribute CONFLICT_SYNC_DTO__CONFLICT_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_ConflictType();
        public static final EAttribute CONFLICT_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_Id();
        public static final EAttribute CONFLICT_SYNC_DTO__CONTENT_CONFLICT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_ContentConflict();
        public static final EAttribute CONFLICT_SYNC_DTO__PROPERTY_CONFLICT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getConflictSyncDTO_PropertyConflict();
        public static final EClass LOCAL_CHANGE_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__NAME = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_Name();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__TARGET_VERSIONABLE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_TargetVersionableItemId();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__VERSIONABLE_ITEM_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_VersionableItemType();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__CONTENT_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_ContentType();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__ADDITION_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_AdditionType();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__DELETION_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_DeletionType();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__MOVE_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_MoveType();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__ATTRIBUTES_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_AttributesType();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__PATH = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_Path();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__RESULTING_PATH = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_ResultingPath();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__ORIGINAL_PATH = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_OriginalPath();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__TARGET_VERSIONABLE_STATE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_TargetVersionableStateId();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_Id();
        public static final EAttribute LOCAL_CHANGE_SYNC_DTO__SANDBOX_PATH = FilesystemRestClientDTOsyncPackage.eINSTANCE.getLocalChangeSyncDTO_SandboxPath();
        public static final EClass CE_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCESyncDTO();
        public static final EAttribute CE_SYNC_DTO__ADDED_COMPONENTS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCESyncDTO_AddedComponents();
        public static final EAttribute CE_SYNC_DTO__REMOVED_COMPONENTS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCESyncDTO_RemovedComponents();
        public static final EAttribute CE_SYNC_DTO__CHANGED_COMPONENTS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCESyncDTO_ChangedComponents();
        public static final EClass CE_COMPONENT_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCEComponentSyncDTO();
        public static final EAttribute CE_COMPONENT_SYNC_DTO__CHANGE_SETS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCEComponentSyncDTO_ChangeSets();
        public static final EAttribute CE_COMPONENT_SYNC_DTO__BASELINES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCEComponentSyncDTO_Baselines();
        public static final EClass CE_BASELINE_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCEBaselineSyncDTO();
        public static final EAttribute CE_BASELINE_SYNC_DTO__CHANGE_SETS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getCEBaselineSyncDTO_ChangeSets();
        public static final EClass DESCRIPTION_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getDescriptionSyncDTO();
        public static final EReference DESCRIPTION_SYNC_DTO__ITEMS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getDescriptionSyncDTO_Items();
        public static final EClass DESCRIPTION_ITEM_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getDescriptionItemSyncDTO();
        public static final EAttribute DESCRIPTION_ITEM_SYNC_DTO__CATEGORY = FilesystemRestClientDTOsyncPackage.eINSTANCE.getDescriptionItemSyncDTO_Category();
        public static final EAttribute DESCRIPTION_ITEM_SYNC_DTO__VALUE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getDescriptionItemSyncDTO_Value();
        public static final EClass PENDING_PATCHES_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getPendingPatchesDTO();
        public static final EReference PENDING_PATCHES_DTO__PATCHES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getPendingPatchesDTO_Patches();
        public static final EClass SYNC_VIEW_FILTERS_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewFiltersDTO();
        public static final EAttribute SYNC_VIEW_FILTERS_DTO__MAX_NUMBER_CHANGES_SHOWN_IN_CHANGE_SET = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSet();
        public static final EAttribute SYNC_VIEW_FILTERS_DTO__ALL_FLOW_TARGETS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewFiltersDTO_AllFlowTargets();
        public static final EAttribute SYNC_VIEW_FILTERS_DTO__MAX_NUMBER_CHANGES_SHOWN_IN_CHANGE_SET_DEFAULT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSetDefault();
        public static final EAttribute SYNC_VIEW_FILTERS_DTO__ALL_FLOW_TARGETS_DEFAULT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewFiltersDTO_AllFlowTargetsDefault();
        public static final EAttribute SYNC_VIEW_FILTERS_DTO__SHOW_ALL_BASELINES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewFiltersDTO_ShowAllBaselines();
        public static final EAttribute SYNC_VIEW_FILTERS_DTO__SHOW_ALL_BASELINES_DEFAULT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncViewFiltersDTO_ShowAllBaselinesDefault();
        public static final EClass MERGE_PATCH_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getMergePatchDTO();
        public static final EAttribute MERGE_PATCH_DTO__SOME_HUNKS_MATCHED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getMergePatchDTO_SomeHunksMatched();
        public static final EAttribute MERGE_PATCH_DTO__SOME_HUNKS_FAILED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getMergePatchDTO_SomeHunksFailed();
        public static final EClass ACCEPT_AS_PATCH_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getAcceptAsPatchDTO();
        public static final EAttribute ACCEPT_AS_PATCH_DTO__PENDING_PATCH_IDS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getAcceptAsPatchDTO_PendingPatchIds();
        public static final EClass GET_BASELINES_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getGetBaselinesDTO();
        public static final EAttribute GET_BASELINES_DTO__TOTAL_ENTRIES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getGetBaselinesDTO_TotalEntries();
        public static final EReference GET_BASELINES_DTO__BASELINE_HISTORY_ENTRIES_IN_WORKSPACE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getGetBaselinesDTO_BaselineHistoryEntriesInWorkspace();
        public static final EReference GET_BASELINES_DTO__BASELINES_IN_REPOSITORY = FilesystemRestClientDTOsyncPackage.eINSTANCE.getGetBaselinesDTO_BaselinesInRepository();
        public static final EClass BASELINE_HISTORY_ENTRY_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineHistoryEntryDTO();
        public static final EAttribute BASELINE_HISTORY_ENTRY_DTO__DELIVERED_BY_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineHistoryEntryDTO_DeliveredByItemId();
        public static final EAttribute BASELINE_HISTORY_ENTRY_DTO__DELIVERY_DATE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineHistoryEntryDTO_DeliveryDate();
        public static final EReference BASELINE_HISTORY_ENTRY_DTO__BASELINE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getBaselineHistoryEntryDTO_Baseline();
        public static final EClass SAME_OCCURRENCE_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSameOccurrenceSyncDTO();
        public static final EAttribute SAME_OCCURRENCE_SYNC_DTO__ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSameOccurrenceSyncDTO_Id();
        public static final EAttribute SAME_OCCURRENCE_SYNC_DTO__OUTGOING = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSameOccurrenceSyncDTO_Outgoing();
        public static final EAttribute SAME_OCCURRENCE_SYNC_DTO__INCOMING = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSameOccurrenceSyncDTO_Incoming();
        public static final EAttribute SAME_OCCURRENCE_SYNC_DTO__SUSPENDED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSameOccurrenceSyncDTO_Suspended();
        public static final EAttribute SAME_OCCURRENCE_SYNC_DTO__UNRESOLVED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSameOccurrenceSyncDTO_Unresolved();
        public static final EClass SAME_OCCURRENCES_SYNC_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSameOccurrencesSyncDTO();
        public static final EReference SAME_OCCURRENCES_SYNC_DTO__OCCURRENCES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSameOccurrencesSyncDTO_Occurrences();
        public static final EClass GET_BASELINE_SETS_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getGetBaselineSetsDTO();
        public static final EReference GET_BASELINE_SETS_DTO__BASELINE_SETS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getGetBaselineSetsDTO_BaselineSets();
        public static final EClass OUT_OF_SYNC_WORKSPACE_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncWorkspaceDTO();
        public static final EAttribute OUT_OF_SYNC_WORKSPACE_DTO__REPOSITORY_URL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncWorkspaceDTO_RepositoryUrl();
        public static final EAttribute OUT_OF_SYNC_WORKSPACE_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncWorkspaceDTO_WorkspaceItemId();
        public static final EReference OUT_OF_SYNC_WORKSPACE_DTO__COMPONENTS = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncWorkspaceDTO_Components();
        public static final EAttribute OUT_OF_SYNC_WORKSPACE_DTO__REPOSITORY_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncWorkspaceDTO_RepositoryId();
        public static final EClass OUT_OF_SYNC_WORKSPACES_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncWorkspacesDTO();
        public static final EReference OUT_OF_SYNC_WORKSPACES_DTO__WORKSPACES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncWorkspacesDTO_Workspaces();
        public static final EClass OUT_OF_SYNC_COMPONENT_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncComponentDTO();
        public static final EAttribute OUT_OF_SYNC_COMPONENT_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncComponentDTO_ComponentItemId();
        public static final EAttribute OUT_OF_SYNC_COMPONENT_DTO__OUT_OF_SYNC_SHARES_COUNT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncComponentDTO_OutOfSyncSharesCount();
        public static final EReference OUT_OF_SYNC_COMPONENT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOutOfSyncComponentDTO_OutOfSyncShares();
        public static final EClass VERIFY_IN_SYNC_RESULT_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getVerifyInSyncResultDTO();
        public static final EAttribute VERIFY_IN_SYNC_RESULT_DTO__CANCELLED = FilesystemRestClientDTOsyncPackage.eINSTANCE.getVerifyInSyncResultDTO_Cancelled();
        public static final EReference VERIFY_IN_SYNC_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getVerifyInSyncResultDTO_OutOfSyncShares();
        public static final EReference VERIFY_IN_SYNC_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOsyncPackage.eINSTANCE.getVerifyInSyncResultDTO_SandboxUpdateDilemma();
        public static final EClass OSLC_LINK_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO();
        public static final EAttribute OSLC_LINK_DTO__TARGET_URI = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_TargetUri();
        public static final EAttribute OSLC_LINK_DTO__LINK_TYPE_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_LinkTypeId();
        public static final EAttribute OSLC_LINK_DTO__TARGET_EXTRA_INFO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_TargetExtraInfo();
        public static final EAttribute OSLC_LINK_DTO__TARGET_CONTENT_TYPE = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_TargetContentType();
        public static final EAttribute OSLC_LINK_DTO__TARGET_REPOSITORY_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_TargetRepositoryId();
        public static final EAttribute OSLC_LINK_DTO__LOCAL_DESCRIPTION = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_LocalDescription();
        public static final EAttribute OSLC_LINK_DTO__REPOSITORY_ID = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_RepositoryId();
        public static final EAttribute OSLC_LINK_DTO__RESOLVED_DESCRIPTION = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_ResolvedDescription();
        public static final EAttribute OSLC_LINK_DTO__RESOLVED_ICON_URI = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_ResolvedIconUri();
        public static final EAttribute OSLC_LINK_DTO__REPOSITORY_URL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_RepositoryUrl();
        public static final EAttribute OSLC_LINK_DTO__TARGET_REPOSITORY_URL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getOslcLinkDTO_TargetRepositoryUrl();
        public static final EClass SYNC_STATUS_DTO = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO();
        public static final EAttribute SYNC_STATUS_DTO__NLOCAL = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO_NLocal();
        public static final EAttribute SYNC_STATUS_DTO__NINCOMING_BASELINES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO_NIncomingBaselines();
        public static final EAttribute SYNC_STATUS_DTO__NINCOMING = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO_NIncoming();
        public static final EAttribute SYNC_STATUS_DTO__NOUTGOING_BASELINES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO_NOutgoingBaselines();
        public static final EAttribute SYNC_STATUS_DTO__NOUTGOING = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO_NOutgoing();
        public static final EAttribute SYNC_STATUS_DTO__NCONFLICT = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO_NConflict();
        public static final EAttribute SYNC_STATUS_DTO__NCOLLISION = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO_NCollision();
        public static final EAttribute SYNC_STATUS_DTO__NCOMPONENT_CHANGES = FilesystemRestClientDTOsyncPackage.eINSTANCE.getSyncStatusDTO_NComponentChanges();
    }
}
