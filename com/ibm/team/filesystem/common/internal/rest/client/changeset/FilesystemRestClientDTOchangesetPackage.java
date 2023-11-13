// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.impl.FilesystemRestClientDTOchangesetPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOchangesetPackage extends EPackage
{
    public static final String eNAME = "changeset";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.changeset";
    public static final String eNS_PREFIX = "filesystemRestClientDTOchangeset";
    public static final FilesystemRestClientDTOchangesetPackage eINSTANCE = FilesystemRestClientDTOchangesetPackageImpl.init();
    public static final int CHECK_IN_RESULT_DTO = 0;
    public static final int CHECK_IN_RESULT_DTO__CANCELLED = 0;
    public static final int CHECK_IN_RESULT_DTO__CHANGE_SETS_COMMITTED = 1;
    public static final int CHECK_IN_RESULT_DTO__COMMIT_DILEMMA = 2;
    public static final int CHECK_IN_RESULT_DTO__OUT_OF_SYNC_SHARES = 3;
    public static final int CHECK_IN_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 4;
    public static final int CHECK_IN_RESULT_DTO__UPDATE_DILEMMA = 5;
    public static final int CHECK_IN_RESULT_DTO_FEATURE_COUNT = 6;
    public static final int SUSPEND_RESULT_DTO = 1;
    public static final int SUSPEND_RESULT_DTO__CANCELLED = 0;
    public static final int SUSPEND_RESULT_DTO__COMMIT_DILEMMA = 1;
    public static final int SUSPEND_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 2;
    public static final int SUSPEND_RESULT_DTO__OUT_OF_SYNC_SHARES = 3;
    public static final int SUSPEND_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 4;
    public static final int SUSPEND_RESULT_DTO__UPDATE_DILEMMA = 5;
    public static final int SUSPEND_RESULT_DTO__LOCKS_TO_RELEASE = 6;
    public static final int SUSPEND_RESULT_DTO_FEATURE_COUNT = 7;
    public static final int RESUME_RESULT_DTO = 2;
    public static final int RESUME_RESULT_DTO__ACTIVE_CHANGE_SETS_OVERLAP = 0;
    public static final int RESUME_RESULT_DTO__CANCELLED = 1;
    public static final int RESUME_RESULT_DTO__COMMIT_DILEMMA = 2;
    public static final int RESUME_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 3;
    public static final int RESUME_RESULT_DTO__OUT_OF_SYNC_SHARES = 4;
    public static final int RESUME_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 5;
    public static final int RESUME_RESULT_DTO__UPDATE_DILEMMA = 6;
    public static final int RESUME_RESULT_DTO__GAP = 7;
    public static final int RESUME_RESULT_DTO__CHANGE_SETS_BLOCKED_BY_PORT_IN_PROGRESS = 8;
    public static final int RESUME_RESULT_DTO__LOCKS_WERE_HELD = 9;
    public static final int RESUME_RESULT_DTO__LOCKS_TO_ACQUIRE = 10;
    public static final int RESUME_RESULT_DTO_FEATURE_COUNT = 11;
    public static final int DISCARD_RESULT_DTO = 3;
    public static final int DISCARD_RESULT_DTO__CANCELLED = 0;
    public static final int DISCARD_RESULT_DTO__COMMIT_DILEMMA = 1;
    public static final int DISCARD_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 2;
    public static final int DISCARD_RESULT_DTO__OUT_OF_SYNC_SHARES = 3;
    public static final int DISCARD_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 4;
    public static final int DISCARD_RESULT_DTO__UPDATE_DILEMMA = 5;
    public static final int DISCARD_RESULT_DTO__LOCKS_TO_RELEASE = 6;
    public static final int DISCARD_RESULT_DTO_FEATURE_COUNT = 7;
    public static final int CREATE_RESULT_DTO = 4;
    public static final int CREATE_RESULT_DTO__CHANGE_SET_ITEM_ID = 0;
    public static final int CREATE_RESULT_DTO_FEATURE_COUNT = 1;
    public static final int WORKSPACE_UPDATE_RESULT_DTO = 5;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__ACCEPTED_SUSPENDED_CHANGES = 0;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__ACTIVE_CHANGE_SETS = 1;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__ACTIVE_CHANGE_SETS_OVERLAP = 2;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__ACTIVE_CHANGE_SETS_IN_COMPONENT = 3;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__CANCELLED = 4;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__CHANGE_SETS_ALREADY_IN_HISTORY = 5;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__CHANGE_SETS_BLOCKED_BY_PORT_IN_PROGRESS = 6;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__COMMIT_DILEMMA = 7;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__COMPONENT_FLOW_ADDITIONS = 8;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__COMPONENT_FLOW_DELETIONS = 9;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__COMPONENT_REPLACEMENT_CANDIDATES = 10;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__COMPONENTS_ADDED = 11;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 12;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__DISCONNECTED_COMPONENTS = 13;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__GAP = 14;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__OUT_OF_SYNC_SHARES = 15;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 16;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__STALE_DATA = 17;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__STRUCTURED_RESULT = 18;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__UPDATE_DILEMMA = 19;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__ECLIPSE_READ_FAILURE_MESSAGE = 20;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__LOCKS_WERE_HELD = 21;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__LOCKS_TO_ACQUIRE = 22;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__COMPONENTS_WITH_NWAY_CONFLICTS = 23;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__COMPONENTS_WITH_CONFLICTING_TARGETS = 24;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__COMPONENTS_WITH_MULTIPLE_PARTICIPANTS = 25;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__NO_BACKUP_BASELINES_COMPONENTS = 26;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__SELECTED_COMPONENTS_IN_MULTIPLE_HIERARCHIES = 27;
    public static final int WORKSPACE_UPDATE_RESULT_DTO__SUBCOMPONENTS_IN_MULTIPLE_HIERARCHIES = 28;
    public static final int WORKSPACE_UPDATE_RESULT_DTO_FEATURE_COUNT = 29;
    public static final int UNDO_CHECKED_IN_CHANGES_RESULT_DTO = 6;
    public static final int UNDO_CHECKED_IN_CHANGES_RESULT_DTO__CANCELLED = 0;
    public static final int UNDO_CHECKED_IN_CHANGES_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int UNDO_CHECKED_IN_CHANGES_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 2;
    public static final int UNDO_CHECKED_IN_CHANGES_RESULT_DTO__UPDATE_DILEMMA = 3;
    public static final int UNDO_CHECKED_IN_CHANGES_RESULT_DTO__LOCKS_TO_RELEASE = 4;
    public static final int UNDO_CHECKED_IN_CHANGES_RESULT_DTO_FEATURE_COUNT = 5;
    public static final int UNDO_LOCAL_CHANGES_RESULT_DTO = 7;
    public static final int UNDO_LOCAL_CHANGES_RESULT_DTO__CANCELLED = 0;
    public static final int UNDO_LOCAL_CHANGES_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int UNDO_LOCAL_CHANGES_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 2;
    public static final int UNDO_LOCAL_CHANGES_RESULT_DTO__UPDATE_DILEMMA = 3;
    public static final int UNDO_LOCAL_CHANGES_RESULT_DTO__LOCKS_TO_RELEASE = 4;
    public static final int UNDO_LOCAL_CHANGES_RESULT_DTO_FEATURE_COUNT = 5;
    public static final int DELIVER_RESULT_DTO = 8;
    public static final int DELIVER_RESULT_DTO__CANCELLED = 0;
    public static final int DELIVER_RESULT_DTO__COMMIT_DILEMMA = 1;
    public static final int DELIVER_RESULT_DTO__COMPONENTS_TO_FLOW = 2;
    public static final int DELIVER_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 3;
    public static final int DELIVER_RESULT_DTO__DELIVERY_REQUIRES_HISTORY_REORDERING = 4;
    public static final int DELIVER_RESULT_DTO__FLOW_TO_NON_DEFAULT_TARGET = 5;
    public static final int DELIVER_RESULT_DTO__OUT_OF_SYNC_SHARES = 6;
    public static final int DELIVER_RESULT_DTO__LOCKS_TO_RELEASE = 7;
    public static final int DELIVER_RESULT_DTO__LOCKS_WERE_HELD = 8;
    public static final int DELIVER_RESULT_DTO__STRUCTURED_RESULT = 9;
    public static final int DELIVER_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 10;
    public static final int DELIVER_RESULT_DTO__UPDATE_DILEMMA = 11;
    public static final int DELIVER_RESULT_DTO__COMPONENTS_WITH_CONFLICTING_TARGETS = 12;
    public static final int DELIVER_RESULT_DTO__COMPONENTS_WITH_MULTIPLE_PARTICIPANTS = 13;
    public static final int DELIVER_RESULT_DTO_FEATURE_COUNT = 14;
    public static final int STALE_DATA_DTO = 9;
    public static final int STALE_DATA_DTO__REPOSITORY_ID = 0;
    public static final int STALE_DATA_DTO__REPOSITORY_URL = 1;
    public static final int STALE_DATA_DTO__SOURCE_REPOSITORY_ID = 2;
    public static final int STALE_DATA_DTO__SOURCE_REPOSITORY_URL = 3;
    public static final int STALE_DATA_DTO__SOURCE_WORKSPACE_ITEM_ID = 4;
    public static final int STALE_DATA_DTO__WORKSPACE_ITEM_ID = 5;
    public static final int STALE_DATA_DTO_FEATURE_COUNT = 6;
    public static final int PROBLEM_CHANGE_SETS_DTO = 10;
    public static final int PROBLEM_CHANGE_SETS_DTO__CHANGE_SET_ITEM_IDS = 0;
    public static final int PROBLEM_CHANGE_SETS_DTO__REPOSITORY_ID = 1;
    public static final int PROBLEM_CHANGE_SETS_DTO__REPOSITORY_URL = 2;
    public static final int PROBLEM_CHANGE_SETS_DTO__WORKSPACE_ITEM_ID = 3;
    public static final int PROBLEM_CHANGE_SETS_DTO_FEATURE_COUNT = 4;
    public static final int GAP_CHANGE_SETS_DTO = 11;
    public static final int GAP_CHANGE_SETS_DTO__CHANGE_SET_ITEM_IDS = 0;
    public static final int GAP_CHANGE_SETS_DTO__HANDLING_SUSPENDED = 1;
    public static final int GAP_CHANGE_SETS_DTO__REPOSITORY_ID = 2;
    public static final int GAP_CHANGE_SETS_DTO__REPOSITORY_URL = 3;
    public static final int GAP_CHANGE_SETS_DTO__WORKSPACE_ITEM_ID = 4;
    public static final int GAP_CHANGE_SETS_DTO_FEATURE_COUNT = 5;
    public static final int STRUCTURED_UPDATE_REPORT_DTO = 12;
    public static final int STRUCTURED_UPDATE_REPORT_DTO__COMPONENTS = 0;
    public static final int STRUCTURED_UPDATE_REPORT_DTO__HAS_CONFLICTS = 1;
    public static final int STRUCTURED_UPDATE_REPORT_DTO__REPOSITORY_ID = 2;
    public static final int STRUCTURED_UPDATE_REPORT_DTO__REPOSITORY_URL = 3;
    public static final int STRUCTURED_UPDATE_REPORT_DTO__WORKSPACE_ITEM_ID = 4;
    public static final int STRUCTURED_UPDATE_REPORT_DTO__WORKSPACE_NAME = 5;
    public static final int STRUCTURED_UPDATE_REPORT_DTO_FEATURE_COUNT = 6;
    public static final int STRUCTURED_COMPONENT_UPDATE_REPORT_DTO = 13;
    public static final int STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__BASELINES = 0;
    public static final int STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__CHANGE_SET_ITEM_IDS = 1;
    public static final int STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__CONFLICTED_ITEM_IDS = 2;
    public static final int STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__COMPONENT_ITEM_ID = 3;
    public static final int STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__COMPONENT_NAME = 4;
    public static final int STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__CURRENT_PATCH = 5;
    public static final int STRUCTURED_COMPONENT_UPDATE_REPORT_DTO_FEATURE_COUNT = 6;
    public static final int STRUCTURED_BASELINE_UPDATE_REPORT_DTO = 14;
    public static final int STRUCTURED_BASELINE_UPDATE_REPORT_DTO__BASELINE_ID = 0;
    public static final int STRUCTURED_BASELINE_UPDATE_REPORT_DTO__BASELINE_ITEM_ID = 1;
    public static final int STRUCTURED_BASELINE_UPDATE_REPORT_DTO__BASELINE_NAME = 2;
    public static final int STRUCTURED_BASELINE_UPDATE_REPORT_DTO_FEATURE_COUNT = 3;
    public static final int BACKUP_IN_SHED_DTO = 15;
    public static final int BACKUP_IN_SHED_DTO__SHAREABLE = 0;
    public static final int BACKUP_IN_SHED_DTO__SHED_LOCATION = 1;
    public static final int BACKUP_IN_SHED_DTO_FEATURE_COUNT = 2;
    public static final int REMOVE_CHANGE_REQUEST_DTO = 16;
    public static final int REMOVE_CHANGE_REQUEST_DTO__BACK_LINK_REMOVED = 0;
    public static final int REMOVE_CHANGE_REQUEST_DTO__LINK_REMOVED = 1;
    public static final int REMOVE_CHANGE_REQUEST_DTO_FEATURE_COUNT = 2;
    public static final int ASSOCIATE_CHANGE_REQUEST_INFO_DTO = 17;
    public static final int ASSOCIATE_CHANGE_REQUEST_INFO_DTO__PROJECT_LINK_TYPE = 0;
    public static final int ASSOCIATE_CHANGE_REQUEST_INFO_DTO__PROJECT_LINK_LABEL = 1;
    public static final int ASSOCIATE_CHANGE_REQUEST_INFO_DTO__PROJECT_LINK_TARGET_SERVICE_URL = 2;
    public static final int ASSOCIATE_CHANGE_REQUEST_INFO_DTO_FEATURE_COUNT = 3;
    public static final int ADD_CHANGE_REQUEST_DTO = 18;
    public static final int ADD_CHANGE_REQUEST_DTO__LINK_ADDED = 0;
    public static final int ADD_CHANGE_REQUEST_DTO__BACK_LINK_ADDED = 1;
    public static final int ADD_CHANGE_REQUEST_DTO_FEATURE_COUNT = 2;
    public static final int DELIVERY_REQUIRES_HISTORY_REORDERING_DTO = 19;
    public static final int DELIVERY_REQUIRES_HISTORY_REORDERING_DTO__WORKSPACE_ITEM_ID = 0;
    public static final int DELIVERY_REQUIRES_HISTORY_REORDERING_DTO__TARGET_WORKSPACE_ITEM_ID = 1;
    public static final int DELIVERY_REQUIRES_HISTORY_REORDERING_DTO__COMPONENT_ITEM_ID = 2;
    public static final int DELIVERY_REQUIRES_HISTORY_REORDERING_DTO_FEATURE_COUNT = 3;
    public static final int COMPLETE_CHANGE_SETS_RESULT_DTO = 20;
    public static final int COMPLETE_CHANGE_SETS_RESULT_DTO__INTERNAL_ID = 0;
    public static final int COMPLETE_CHANGE_SETS_RESULT_DTO__TARGET_CHANGE_SETS = 1;
    public static final int COMPLETE_CHANGE_SETS_RESULT_DTO__CANCELLED = 2;
    public static final int COMPLETE_CHANGE_SETS_RESULT_DTO_FEATURE_COUNT = 3;
    
    EClass getCheckInResultDTO();
    
    EAttribute getCheckInResultDTO_Cancelled();
    
    EReference getCheckInResultDTO_OutOfSyncShares();
    
    EAttribute getCheckInResultDTO_ChangeSetsCommitted();
    
    EReference getCheckInResultDTO_SandboxUpdateDilemma();
    
    EReference getCheckInResultDTO_CommitDilemma();
    
    EReference getCheckInResultDTO_UpdateDilemma();
    
    EClass getCreateResultDTO();
    
    EAttribute getCreateResultDTO_ChangeSetItemId();
    
    EClass getWorkspaceUpdateResultDTO();
    
    EAttribute getWorkspaceUpdateResultDTO_Cancelled();
    
    EReference getWorkspaceUpdateResultDTO_OutOfSyncShares();
    
    EReference getWorkspaceUpdateResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getWorkspaceUpdateResultDTO_StaleData();
    
    EReference getWorkspaceUpdateResultDTO_DisconnectedComponents();
    
    EReference getWorkspaceUpdateResultDTO_ComponentFlowAdditions();
    
    EReference getWorkspaceUpdateResultDTO_ComponentFlowDeletions();
    
    EReference getWorkspaceUpdateResultDTO_ComponentReplacementCandidates();
    
    EReference getWorkspaceUpdateResultDTO_ComponentsAdded();
    
    EAttribute getWorkspaceUpdateResultDTO_ChangeSetsAlreadyInHistory();
    
    EReference getWorkspaceUpdateResultDTO_ChangeSetsBlockedByPortInProgress();
    
    EAttribute getWorkspaceUpdateResultDTO_AcceptedSuspendedChanges();
    
    EReference getWorkspaceUpdateResultDTO_ActiveChangeSets();
    
    EReference getWorkspaceUpdateResultDTO_ActiveChangeSetsOverlap();
    
    EReference getWorkspaceUpdateResultDTO_ActiveChangeSetsInComponent();
    
    EReference getWorkspaceUpdateResultDTO_Gap();
    
    EReference getWorkspaceUpdateResultDTO_StructuredResult();
    
    EReference getWorkspaceUpdateResultDTO_SandboxUpdateDilemma();
    
    EReference getWorkspaceUpdateResultDTO_CommitDilemma();
    
    EReference getWorkspaceUpdateResultDTO_UpdateDilemma();
    
    EAttribute getWorkspaceUpdateResultDTO_EclipseReadFailureMessage();
    
    EReference getWorkspaceUpdateResultDTO_LocksWereHeld();
    
    EReference getWorkspaceUpdateResultDTO_LocksToAcquire();
    
    EReference getWorkspaceUpdateResultDTO_ComponentsWithNWayConflicts();
    
    EReference getWorkspaceUpdateResultDTO_ComponentsWithConflictingTargets();
    
    EReference getWorkspaceUpdateResultDTO_ComponentsWithMultipleParticipants();
    
    EReference getWorkspaceUpdateResultDTO_NoBackupBaselinesComponents();
    
    EReference getWorkspaceUpdateResultDTO_SelectedComponentsInMultipleHierarchies();
    
    EReference getWorkspaceUpdateResultDTO_SubcomponentsInMultipleHierarchies();
    
    EClass getUndoCheckedInChangesResultDTO();
    
    EAttribute getUndoCheckedInChangesResultDTO_Cancelled();
    
    EReference getUndoCheckedInChangesResultDTO_OutOfSyncShares();
    
    EReference getUndoCheckedInChangesResultDTO_SandboxUpdateDilemma();
    
    EReference getUndoCheckedInChangesResultDTO_UpdateDilemma();
    
    EReference getUndoCheckedInChangesResultDTO_LocksToRelease();
    
    EClass getUndoLocalChangesResultDTO();
    
    EAttribute getUndoLocalChangesResultDTO_Cancelled();
    
    EReference getUndoLocalChangesResultDTO_OutOfSyncShares();
    
    EReference getUndoLocalChangesResultDTO_SandboxUpdateDilemma();
    
    EReference getUndoLocalChangesResultDTO_UpdateDilemma();
    
    EReference getUndoLocalChangesResultDTO_LocksToRelease();
    
    EClass getDeliverResultDTO();
    
    EAttribute getDeliverResultDTO_Cancelled();
    
    EAttribute getDeliverResultDTO_ComponentsToFlow();
    
    EAttribute getDeliverResultDTO_FlowToNonDefaultTarget();
    
    EReference getDeliverResultDTO_OutOfSyncShares();
    
    EReference getDeliverResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getDeliverResultDTO_LocksToRelease();
    
    EReference getDeliverResultDTO_LocksWereHeld();
    
    EReference getDeliverResultDTO_StructuredResult();
    
    EReference getDeliverResultDTO_DeliveryRequiresHistoryReordering();
    
    EReference getDeliverResultDTO_SandboxUpdateDilemma();
    
    EReference getDeliverResultDTO_CommitDilemma();
    
    EReference getDeliverResultDTO_UpdateDilemma();
    
    EReference getDeliverResultDTO_ComponentsWithConflictingTargets();
    
    EReference getDeliverResultDTO_ComponentsWithMultipleParticipants();
    
    EClass getStaleDataDTO();
    
    EAttribute getStaleDataDTO_RepositoryId();
    
    EAttribute getStaleDataDTO_RepositoryURL();
    
    EAttribute getStaleDataDTO_SourceRepositoryId();
    
    EAttribute getStaleDataDTO_WorkspaceItemId();
    
    EAttribute getStaleDataDTO_SourceRepositoryURL();
    
    EAttribute getStaleDataDTO_SourceWorkspaceItemId();
    
    EClass getProblemChangeSetsDTO();
    
    EAttribute getProblemChangeSetsDTO_RepositoryURL();
    
    EAttribute getProblemChangeSetsDTO_WorkspaceItemId();
    
    EAttribute getProblemChangeSetsDTO_ChangeSetItemIds();
    
    EAttribute getProblemChangeSetsDTO_RepositoryId();
    
    EClass getGapChangeSetsDTO();
    
    EAttribute getGapChangeSetsDTO_RepositoryURL();
    
    EAttribute getGapChangeSetsDTO_WorkspaceItemId();
    
    EAttribute getGapChangeSetsDTO_ChangeSetItemIds();
    
    EAttribute getGapChangeSetsDTO_HandlingSuspended();
    
    EAttribute getGapChangeSetsDTO_RepositoryId();
    
    EClass getStructuredUpdateReportDTO();
    
    EAttribute getStructuredUpdateReportDTO_RepositoryUrl();
    
    EAttribute getStructuredUpdateReportDTO_WorkspaceName();
    
    EAttribute getStructuredUpdateReportDTO_WorkspaceItemId();
    
    EAttribute getStructuredUpdateReportDTO_HasConflicts();
    
    EAttribute getStructuredUpdateReportDTO_RepositoryId();
    
    EReference getStructuredUpdateReportDTO_Components();
    
    EClass getStructuredComponentUpdateReportDTO();
    
    EAttribute getStructuredComponentUpdateReportDTO_ComponentName();
    
    EReference getStructuredComponentUpdateReportDTO_CurrentPatch();
    
    EAttribute getStructuredComponentUpdateReportDTO_ComponentItemId();
    
    EAttribute getStructuredComponentUpdateReportDTO_ConflictedItemIds();
    
    EAttribute getStructuredComponentUpdateReportDTO_ChangeSetItemIds();
    
    EReference getStructuredComponentUpdateReportDTO_Baselines();
    
    EClass getStructuredBaselineUpdateReportDTO();
    
    EAttribute getStructuredBaselineUpdateReportDTO_BaselineName();
    
    EAttribute getStructuredBaselineUpdateReportDTO_BaselineItemId();
    
    EAttribute getStructuredBaselineUpdateReportDTO_BaselineId();
    
    EClass getBackupInShedDTO();
    
    EReference getBackupInShedDTO_Shareable();
    
    EAttribute getBackupInShedDTO_ShedLocation();
    
    EClass getRemoveChangeRequestDTO();
    
    EAttribute getRemoveChangeRequestDTO_LinkRemoved();
    
    EAttribute getRemoveChangeRequestDTO_BackLinkRemoved();
    
    EClass getAssociateChangeRequestInfoDTO();
    
    EAttribute getAssociateChangeRequestInfoDTO_ProjectLinkType();
    
    EAttribute getAssociateChangeRequestInfoDTO_ProjectLinkLabel();
    
    EAttribute getAssociateChangeRequestInfoDTO_ProjectLinkTargetServiceUrl();
    
    EClass getAddChangeRequestDTO();
    
    EAttribute getAddChangeRequestDTO_LinkAdded();
    
    EAttribute getAddChangeRequestDTO_BackLinkAdded();
    
    EClass getDeliveryRequiresHistoryReorderingDTO();
    
    EAttribute getDeliveryRequiresHistoryReorderingDTO_WorkspaceItemId();
    
    EAttribute getDeliveryRequiresHistoryReorderingDTO_TargetWorkspaceItemId();
    
    EAttribute getDeliveryRequiresHistoryReorderingDTO_ComponentItemId();
    
    EClass getCompleteChangeSetsResultDTO();
    
    EReference getCompleteChangeSetsResultDTO_TargetChangeSets();
    
    EAttribute getCompleteChangeSetsResultDTO_Cancelled();
    
    EClass getSuspendResultDTO();
    
    EAttribute getSuspendResultDTO_Cancelled();
    
    EReference getSuspendResultDTO_OutOfSyncShares();
    
    EReference getSuspendResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getSuspendResultDTO_SandboxUpdateDilemma();
    
    EReference getSuspendResultDTO_CommitDilemma();
    
    EReference getSuspendResultDTO_UpdateDilemma();
    
    EReference getSuspendResultDTO_LocksToRelease();
    
    EClass getResumeResultDTO();
    
    EAttribute getResumeResultDTO_Cancelled();
    
    EReference getResumeResultDTO_OutOfSyncShares();
    
    EReference getResumeResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getResumeResultDTO_ActiveChangeSetsOverlap();
    
    EReference getResumeResultDTO_SandboxUpdateDilemma();
    
    EReference getResumeResultDTO_CommitDilemma();
    
    EReference getResumeResultDTO_UpdateDilemma();
    
    EReference getResumeResultDTO_Gap();
    
    EReference getResumeResultDTO_ChangeSetsBlockedByPortInProgress();
    
    EReference getResumeResultDTO_LocksWereHeld();
    
    EReference getResumeResultDTO_LocksToAcquire();
    
    EClass getDiscardResultDTO();
    
    EAttribute getDiscardResultDTO_Cancelled();
    
    EReference getDiscardResultDTO_OutOfSyncShares();
    
    EReference getDiscardResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getDiscardResultDTO_SandboxUpdateDilemma();
    
    EReference getDiscardResultDTO_CommitDilemma();
    
    EReference getDiscardResultDTO_UpdateDilemma();
    
    EReference getDiscardResultDTO_LocksToRelease();
    
    FilesystemRestClientDTOchangesetFactory getFilesystemRestClientDTOchangesetFactory();
    
    public interface Literals
    {
        public static final EClass CHECK_IN_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCheckInResultDTO();
        public static final EAttribute CHECK_IN_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCheckInResultDTO_Cancelled();
        public static final EReference CHECK_IN_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCheckInResultDTO_OutOfSyncShares();
        public static final EAttribute CHECK_IN_RESULT_DTO__CHANGE_SETS_COMMITTED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCheckInResultDTO_ChangeSetsCommitted();
        public static final EReference CHECK_IN_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCheckInResultDTO_SandboxUpdateDilemma();
        public static final EReference CHECK_IN_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCheckInResultDTO_CommitDilemma();
        public static final EReference CHECK_IN_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCheckInResultDTO_UpdateDilemma();
        public static final EClass CREATE_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCreateResultDTO();
        public static final EAttribute CREATE_RESULT_DTO__CHANGE_SET_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCreateResultDTO_ChangeSetItemId();
        public static final EClass WORKSPACE_UPDATE_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO();
        public static final EAttribute WORKSPACE_UPDATE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_Cancelled();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_OutOfSyncShares();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__STALE_DATA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_StaleData();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__DISCONNECTED_COMPONENTS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_DisconnectedComponents();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__COMPONENT_FLOW_ADDITIONS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ComponentFlowAdditions();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__COMPONENT_FLOW_DELETIONS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ComponentFlowDeletions();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__COMPONENT_REPLACEMENT_CANDIDATES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ComponentReplacementCandidates();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__COMPONENTS_ADDED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ComponentsAdded();
        public static final EAttribute WORKSPACE_UPDATE_RESULT_DTO__CHANGE_SETS_ALREADY_IN_HISTORY = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ChangeSetsAlreadyInHistory();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__CHANGE_SETS_BLOCKED_BY_PORT_IN_PROGRESS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ChangeSetsBlockedByPortInProgress();
        public static final EAttribute WORKSPACE_UPDATE_RESULT_DTO__ACCEPTED_SUSPENDED_CHANGES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_AcceptedSuspendedChanges();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__ACTIVE_CHANGE_SETS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ActiveChangeSets();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__ACTIVE_CHANGE_SETS_OVERLAP = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ActiveChangeSetsOverlap();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__ACTIVE_CHANGE_SETS_IN_COMPONENT = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ActiveChangeSetsInComponent();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__GAP = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_Gap();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__STRUCTURED_RESULT = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_StructuredResult();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_SandboxUpdateDilemma();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_CommitDilemma();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_UpdateDilemma();
        public static final EAttribute WORKSPACE_UPDATE_RESULT_DTO__ECLIPSE_READ_FAILURE_MESSAGE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_EclipseReadFailureMessage();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__LOCKS_WERE_HELD = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_LocksWereHeld();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__LOCKS_TO_ACQUIRE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_LocksToAcquire();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__COMPONENTS_WITH_NWAY_CONFLICTS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ComponentsWithNWayConflicts();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__COMPONENTS_WITH_CONFLICTING_TARGETS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ComponentsWithConflictingTargets();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__COMPONENTS_WITH_MULTIPLE_PARTICIPANTS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_ComponentsWithMultipleParticipants();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__NO_BACKUP_BASELINES_COMPONENTS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_NoBackupBaselinesComponents();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__SELECTED_COMPONENTS_IN_MULTIPLE_HIERARCHIES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_SelectedComponentsInMultipleHierarchies();
        public static final EReference WORKSPACE_UPDATE_RESULT_DTO__SUBCOMPONENTS_IN_MULTIPLE_HIERARCHIES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getWorkspaceUpdateResultDTO_SubcomponentsInMultipleHierarchies();
        public static final EClass UNDO_CHECKED_IN_CHANGES_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoCheckedInChangesResultDTO();
        public static final EAttribute UNDO_CHECKED_IN_CHANGES_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoCheckedInChangesResultDTO_Cancelled();
        public static final EReference UNDO_CHECKED_IN_CHANGES_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoCheckedInChangesResultDTO_OutOfSyncShares();
        public static final EReference UNDO_CHECKED_IN_CHANGES_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoCheckedInChangesResultDTO_SandboxUpdateDilemma();
        public static final EReference UNDO_CHECKED_IN_CHANGES_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoCheckedInChangesResultDTO_UpdateDilemma();
        public static final EReference UNDO_CHECKED_IN_CHANGES_RESULT_DTO__LOCKS_TO_RELEASE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoCheckedInChangesResultDTO_LocksToRelease();
        public static final EClass UNDO_LOCAL_CHANGES_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoLocalChangesResultDTO();
        public static final EAttribute UNDO_LOCAL_CHANGES_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoLocalChangesResultDTO_Cancelled();
        public static final EReference UNDO_LOCAL_CHANGES_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoLocalChangesResultDTO_OutOfSyncShares();
        public static final EReference UNDO_LOCAL_CHANGES_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoLocalChangesResultDTO_SandboxUpdateDilemma();
        public static final EReference UNDO_LOCAL_CHANGES_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoLocalChangesResultDTO_UpdateDilemma();
        public static final EReference UNDO_LOCAL_CHANGES_RESULT_DTO__LOCKS_TO_RELEASE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getUndoLocalChangesResultDTO_LocksToRelease();
        public static final EClass DELIVER_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO();
        public static final EAttribute DELIVER_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_Cancelled();
        public static final EAttribute DELIVER_RESULT_DTO__COMPONENTS_TO_FLOW = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_ComponentsToFlow();
        public static final EAttribute DELIVER_RESULT_DTO__FLOW_TO_NON_DEFAULT_TARGET = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_FlowToNonDefaultTarget();
        public static final EReference DELIVER_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_OutOfSyncShares();
        public static final EReference DELIVER_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference DELIVER_RESULT_DTO__LOCKS_TO_RELEASE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_LocksToRelease();
        public static final EReference DELIVER_RESULT_DTO__LOCKS_WERE_HELD = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_LocksWereHeld();
        public static final EReference DELIVER_RESULT_DTO__STRUCTURED_RESULT = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_StructuredResult();
        public static final EReference DELIVER_RESULT_DTO__DELIVERY_REQUIRES_HISTORY_REORDERING = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_DeliveryRequiresHistoryReordering();
        public static final EReference DELIVER_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_SandboxUpdateDilemma();
        public static final EReference DELIVER_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_CommitDilemma();
        public static final EReference DELIVER_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_UpdateDilemma();
        public static final EReference DELIVER_RESULT_DTO__COMPONENTS_WITH_CONFLICTING_TARGETS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_ComponentsWithConflictingTargets();
        public static final EReference DELIVER_RESULT_DTO__COMPONENTS_WITH_MULTIPLE_PARTICIPANTS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliverResultDTO_ComponentsWithMultipleParticipants();
        public static final EClass STALE_DATA_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStaleDataDTO();
        public static final EAttribute STALE_DATA_DTO__REPOSITORY_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStaleDataDTO_RepositoryId();
        public static final EAttribute STALE_DATA_DTO__REPOSITORY_URL = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStaleDataDTO_RepositoryURL();
        public static final EAttribute STALE_DATA_DTO__SOURCE_REPOSITORY_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStaleDataDTO_SourceRepositoryId();
        public static final EAttribute STALE_DATA_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStaleDataDTO_WorkspaceItemId();
        public static final EAttribute STALE_DATA_DTO__SOURCE_REPOSITORY_URL = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStaleDataDTO_SourceRepositoryURL();
        public static final EAttribute STALE_DATA_DTO__SOURCE_WORKSPACE_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStaleDataDTO_SourceWorkspaceItemId();
        public static final EClass PROBLEM_CHANGE_SETS_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getProblemChangeSetsDTO();
        public static final EAttribute PROBLEM_CHANGE_SETS_DTO__REPOSITORY_URL = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getProblemChangeSetsDTO_RepositoryURL();
        public static final EAttribute PROBLEM_CHANGE_SETS_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getProblemChangeSetsDTO_WorkspaceItemId();
        public static final EAttribute PROBLEM_CHANGE_SETS_DTO__CHANGE_SET_ITEM_IDS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getProblemChangeSetsDTO_ChangeSetItemIds();
        public static final EAttribute PROBLEM_CHANGE_SETS_DTO__REPOSITORY_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getProblemChangeSetsDTO_RepositoryId();
        public static final EClass GAP_CHANGE_SETS_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getGapChangeSetsDTO();
        public static final EAttribute GAP_CHANGE_SETS_DTO__REPOSITORY_URL = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getGapChangeSetsDTO_RepositoryURL();
        public static final EAttribute GAP_CHANGE_SETS_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getGapChangeSetsDTO_WorkspaceItemId();
        public static final EAttribute GAP_CHANGE_SETS_DTO__CHANGE_SET_ITEM_IDS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getGapChangeSetsDTO_ChangeSetItemIds();
        public static final EAttribute GAP_CHANGE_SETS_DTO__HANDLING_SUSPENDED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getGapChangeSetsDTO_HandlingSuspended();
        public static final EAttribute GAP_CHANGE_SETS_DTO__REPOSITORY_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getGapChangeSetsDTO_RepositoryId();
        public static final EClass STRUCTURED_UPDATE_REPORT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredUpdateReportDTO();
        public static final EAttribute STRUCTURED_UPDATE_REPORT_DTO__REPOSITORY_URL = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredUpdateReportDTO_RepositoryUrl();
        public static final EAttribute STRUCTURED_UPDATE_REPORT_DTO__WORKSPACE_NAME = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredUpdateReportDTO_WorkspaceName();
        public static final EAttribute STRUCTURED_UPDATE_REPORT_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredUpdateReportDTO_WorkspaceItemId();
        public static final EAttribute STRUCTURED_UPDATE_REPORT_DTO__HAS_CONFLICTS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredUpdateReportDTO_HasConflicts();
        public static final EAttribute STRUCTURED_UPDATE_REPORT_DTO__REPOSITORY_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredUpdateReportDTO_RepositoryId();
        public static final EReference STRUCTURED_UPDATE_REPORT_DTO__COMPONENTS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredUpdateReportDTO_Components();
        public static final EClass STRUCTURED_COMPONENT_UPDATE_REPORT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredComponentUpdateReportDTO();
        public static final EAttribute STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__COMPONENT_NAME = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredComponentUpdateReportDTO_ComponentName();
        public static final EReference STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__CURRENT_PATCH = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredComponentUpdateReportDTO_CurrentPatch();
        public static final EAttribute STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredComponentUpdateReportDTO_ComponentItemId();
        public static final EAttribute STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__CONFLICTED_ITEM_IDS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredComponentUpdateReportDTO_ConflictedItemIds();
        public static final EAttribute STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__CHANGE_SET_ITEM_IDS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredComponentUpdateReportDTO_ChangeSetItemIds();
        public static final EReference STRUCTURED_COMPONENT_UPDATE_REPORT_DTO__BASELINES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredComponentUpdateReportDTO_Baselines();
        public static final EClass STRUCTURED_BASELINE_UPDATE_REPORT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredBaselineUpdateReportDTO();
        public static final EAttribute STRUCTURED_BASELINE_UPDATE_REPORT_DTO__BASELINE_NAME = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredBaselineUpdateReportDTO_BaselineName();
        public static final EAttribute STRUCTURED_BASELINE_UPDATE_REPORT_DTO__BASELINE_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredBaselineUpdateReportDTO_BaselineItemId();
        public static final EAttribute STRUCTURED_BASELINE_UPDATE_REPORT_DTO__BASELINE_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getStructuredBaselineUpdateReportDTO_BaselineId();
        public static final EClass BACKUP_IN_SHED_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getBackupInShedDTO();
        public static final EReference BACKUP_IN_SHED_DTO__SHAREABLE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getBackupInShedDTO_Shareable();
        public static final EAttribute BACKUP_IN_SHED_DTO__SHED_LOCATION = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getBackupInShedDTO_ShedLocation();
        public static final EClass REMOVE_CHANGE_REQUEST_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getRemoveChangeRequestDTO();
        public static final EAttribute REMOVE_CHANGE_REQUEST_DTO__LINK_REMOVED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getRemoveChangeRequestDTO_LinkRemoved();
        public static final EAttribute REMOVE_CHANGE_REQUEST_DTO__BACK_LINK_REMOVED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getRemoveChangeRequestDTO_BackLinkRemoved();
        public static final EClass ASSOCIATE_CHANGE_REQUEST_INFO_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getAssociateChangeRequestInfoDTO();
        public static final EAttribute ASSOCIATE_CHANGE_REQUEST_INFO_DTO__PROJECT_LINK_TYPE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getAssociateChangeRequestInfoDTO_ProjectLinkType();
        public static final EAttribute ASSOCIATE_CHANGE_REQUEST_INFO_DTO__PROJECT_LINK_LABEL = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getAssociateChangeRequestInfoDTO_ProjectLinkLabel();
        public static final EAttribute ASSOCIATE_CHANGE_REQUEST_INFO_DTO__PROJECT_LINK_TARGET_SERVICE_URL = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getAssociateChangeRequestInfoDTO_ProjectLinkTargetServiceUrl();
        public static final EClass ADD_CHANGE_REQUEST_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getAddChangeRequestDTO();
        public static final EAttribute ADD_CHANGE_REQUEST_DTO__LINK_ADDED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getAddChangeRequestDTO_LinkAdded();
        public static final EAttribute ADD_CHANGE_REQUEST_DTO__BACK_LINK_ADDED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getAddChangeRequestDTO_BackLinkAdded();
        public static final EClass DELIVERY_REQUIRES_HISTORY_REORDERING_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliveryRequiresHistoryReorderingDTO();
        public static final EAttribute DELIVERY_REQUIRES_HISTORY_REORDERING_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliveryRequiresHistoryReorderingDTO_WorkspaceItemId();
        public static final EAttribute DELIVERY_REQUIRES_HISTORY_REORDERING_DTO__TARGET_WORKSPACE_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliveryRequiresHistoryReorderingDTO_TargetWorkspaceItemId();
        public static final EAttribute DELIVERY_REQUIRES_HISTORY_REORDERING_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDeliveryRequiresHistoryReorderingDTO_ComponentItemId();
        public static final EClass COMPLETE_CHANGE_SETS_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCompleteChangeSetsResultDTO();
        public static final EReference COMPLETE_CHANGE_SETS_RESULT_DTO__TARGET_CHANGE_SETS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCompleteChangeSetsResultDTO_TargetChangeSets();
        public static final EAttribute COMPLETE_CHANGE_SETS_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getCompleteChangeSetsResultDTO_Cancelled();
        public static final EClass SUSPEND_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getSuspendResultDTO();
        public static final EAttribute SUSPEND_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getSuspendResultDTO_Cancelled();
        public static final EReference SUSPEND_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getSuspendResultDTO_OutOfSyncShares();
        public static final EReference SUSPEND_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getSuspendResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference SUSPEND_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getSuspendResultDTO_SandboxUpdateDilemma();
        public static final EReference SUSPEND_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getSuspendResultDTO_CommitDilemma();
        public static final EReference SUSPEND_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getSuspendResultDTO_UpdateDilemma();
        public static final EReference SUSPEND_RESULT_DTO__LOCKS_TO_RELEASE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getSuspendResultDTO_LocksToRelease();
        public static final EClass RESUME_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO();
        public static final EAttribute RESUME_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_Cancelled();
        public static final EReference RESUME_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_OutOfSyncShares();
        public static final EReference RESUME_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference RESUME_RESULT_DTO__ACTIVE_CHANGE_SETS_OVERLAP = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_ActiveChangeSetsOverlap();
        public static final EReference RESUME_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_SandboxUpdateDilemma();
        public static final EReference RESUME_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_CommitDilemma();
        public static final EReference RESUME_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_UpdateDilemma();
        public static final EReference RESUME_RESULT_DTO__GAP = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_Gap();
        public static final EReference RESUME_RESULT_DTO__CHANGE_SETS_BLOCKED_BY_PORT_IN_PROGRESS = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_ChangeSetsBlockedByPortInProgress();
        public static final EReference RESUME_RESULT_DTO__LOCKS_WERE_HELD = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_LocksWereHeld();
        public static final EReference RESUME_RESULT_DTO__LOCKS_TO_ACQUIRE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getResumeResultDTO_LocksToAcquire();
        public static final EClass DISCARD_RESULT_DTO = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDiscardResultDTO();
        public static final EAttribute DISCARD_RESULT_DTO__CANCELLED = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDiscardResultDTO_Cancelled();
        public static final EReference DISCARD_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDiscardResultDTO_OutOfSyncShares();
        public static final EReference DISCARD_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDiscardResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference DISCARD_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDiscardResultDTO_SandboxUpdateDilemma();
        public static final EReference DISCARD_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDiscardResultDTO_CommitDilemma();
        public static final EReference DISCARD_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDiscardResultDTO_UpdateDilemma();
        public static final EReference DISCARD_RESULT_DTO__LOCKS_TO_RELEASE = FilesystemRestClientDTOchangesetPackage.eINSTANCE.getDiscardResultDTO_LocksToRelease();
    }
}
