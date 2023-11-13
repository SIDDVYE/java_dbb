// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.load.impl.FilesystemRestClientDTOloadPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOloadPackage extends EPackage
{
    public static final String eNAME = "load";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.load";
    public static final String eNS_PREFIX = "filesystemRestClientDTOload";
    public static final FilesystemRestClientDTOloadPackage eINSTANCE = FilesystemRestClientDTOloadPackageImpl.init();
    public static final int LOAD_EVALUATION_DTO = 0;
    public static final int LOAD_EVALUATION_DTO__OVERLAPPING_LOAD_REQUESTS = 0;
    public static final int LOAD_EVALUATION_DTO__SHARES_TO_BE_REMOVED = 1;
    public static final int LOAD_EVALUATION_DTO__COLLISIONS = 2;
    public static final int LOAD_EVALUATION_DTO__SHARES_OUT_OF_SYNC = 3;
    public static final int LOAD_EVALUATION_DTO__NEW_SHARES_TO_LOAD = 4;
    public static final int LOAD_EVALUATION_DTO__INVALID_LOAD_REQUESTS = 5;
    public static final int LOAD_EVALUATION_DTO__MULTIPLE_SANDBOX_LOADS = 6;
    public static final int LOAD_EVALUATION_DTO__INVALID_FILTER_FOR_OLD_LOAD_RULE_FORMAT = 7;
    public static final int LOAD_EVALUATION_DTO__INVALID_LOAD_LOCATIONS = 8;
    public static final int LOAD_EVALUATION_DTO__LOAD_RULE_PROBLEMS = 9;
    public static final int LOAD_EVALUATION_DTO_FEATURE_COUNT = 10;
    public static final int LOAD_OVERLAP_DTO = 1;
    public static final int LOAD_OVERLAP_DTO__LOAD_LOCATION = 0;
    public static final int LOAD_OVERLAP_DTO__PATH = 1;
    public static final int LOAD_OVERLAP_DTO__OVERLAPPING_SHARES = 2;
    public static final int LOAD_OVERLAP_DTO__OVERLAPPING_ITEMS = 3;
    public static final int LOAD_OVERLAP_DTO_FEATURE_COUNT = 4;
    public static final int REMOVED_SHARE_DTO = 2;
    public static final int REMOVED_SHARE_DTO__UNCOMMITTED_CHANGE_COUNT = 0;
    public static final int REMOVED_SHARE_DTO__SHARE = 1;
    public static final int REMOVED_SHARE_DTO_FEATURE_COUNT = 2;
    public static final int COLLISION_DTO = 3;
    public static final int COLLISION_DTO__PATH = 0;
    public static final int COLLISION_DTO__DETAIL = 1;
    public static final int COLLISION_DTO__LOAD_LOCATIONS = 2;
    public static final int COLLISION_DTO__COLLIDED_WITH_EXISTING_CONTENT = 3;
    public static final int COLLISION_DTO__COLLIDED_WITH_EXISTING_SHARE = 4;
    public static final int COLLISION_DTO_FEATURE_COUNT = 5;
    public static final int LOAD_LOCATION_DTO = 4;
    public static final int LOAD_LOCATION_DTO__REPOSITORY_URL = 0;
    public static final int LOAD_LOCATION_DTO__REPOSITORY_ID = 1;
    public static final int LOAD_LOCATION_DTO__CONTEXT_ITEM_ID = 2;
    public static final int LOAD_LOCATION_DTO__IS_WORKSPACE_CONTEXT = 3;
    public static final int LOAD_LOCATION_DTO__COMPONENT_ITEM_ID = 4;
    public static final int LOAD_LOCATION_DTO__VERSIONABLE_ITEM_ID = 5;
    public static final int LOAD_LOCATION_DTO__VERSIONABLE_ITEM_TYPE = 6;
    public static final int LOAD_LOCATION_DTO_FEATURE_COUNT = 7;
    public static final int SHARE_TO_LOAD_DTO = 5;
    public static final int SHARE_TO_LOAD_DTO__PATH = 0;
    public static final int SHARE_TO_LOAD_DTO__LOAD_LOCATION = 1;
    public static final int SHARE_TO_LOAD_DTO_FEATURE_COUNT = 2;
    public static final int INVALID_LOAD_REQUEST_DTO = 6;
    public static final int INVALID_LOAD_REQUEST_DTO__LOAD_LOCATION = 0;
    public static final int INVALID_LOAD_REQUEST_DTO__REASON = 1;
    public static final int INVALID_LOAD_REQUEST_DTO_FEATURE_COUNT = 2;
    public static final int LOAD_FILE_OPERATION_RESULT_DTO = 7;
    public static final int LOAD_FILE_OPERATION_RESULT_DTO__FILE_RESULTS = 0;
    public static final int LOAD_FILE_OPERATION_RESULT_DTO__BACKED_UP_TO_SHED = 1;
    public static final int LOAD_FILE_OPERATION_RESULT_DTO__DELETED_CONTENT_LOCATIONS = 2;
    public static final int LOAD_FILE_OPERATION_RESULT_DTO__LOCAL_CHANGE_LOCATIONS = 3;
    public static final int LOAD_FILE_OPERATION_RESULT_DTO__CANCELLED = 4;
    public static final int LOAD_FILE_OPERATION_RESULT_DTO_FEATURE_COUNT = 5;
    public static final int LOAD_FILE_RESULT_DTO = 8;
    public static final int LOAD_FILE_RESULT_DTO__FILE_ITEM_ID = 0;
    public static final int LOAD_FILE_RESULT_DTO__FILE_ITEM_STATE_ID = 1;
    public static final int LOAD_FILE_RESULT_DTO__FAILURE_STATUS = 2;
    public static final int LOAD_FILE_RESULT_DTO_FEATURE_COUNT = 3;
    public static final int OVERLAPPED_ITEM_DTO = 9;
    public static final int OVERLAPPED_ITEM_DTO__VERSIONABLE_HANDLE = 0;
    public static final int OVERLAPPED_ITEM_DTO__PATH = 1;
    public static final int OVERLAPPED_ITEM_DTO_FEATURE_COUNT = 2;
    public static final int MULTIPLE_SANDBOX_LOAD_DTO = 10;
    public static final int MULTIPLE_SANDBOX_LOAD_DTO__CONFIGURATION = 0;
    public static final int MULTIPLE_SANDBOX_LOAD_DTO__SANDBOXES = 1;
    public static final int MULTIPLE_SANDBOX_LOAD_DTO__LOAD_LOCATIONS = 2;
    public static final int MULTIPLE_SANDBOX_LOAD_DTO_FEATURE_COUNT = 3;
    public static final int LOAD_RESULT_DTO = 11;
    public static final int LOAD_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 0;
    public static final int LOAD_RESULT_DTO__LOAD_RULE_PROBLEMS = 1;
    public static final int LOAD_RESULT_DTO__ECLIPSE_READ_FAILURE_MESSAGE = 2;
    public static final int LOAD_RESULT_DTO_FEATURE_COUNT = 3;
    public static final int SANDBOX_LOAD_RULES_RESULT_DTO = 12;
    public static final int SANDBOX_LOAD_RULES_RESULT_DTO__CANCELLED = 0;
    public static final int SANDBOX_LOAD_RULES_RESULT_DTO__LOAD_RULES = 1;
    public static final int SANDBOX_LOAD_RULES_RESULT_DTO__LOAD_RULE_FILES = 2;
    public static final int SANDBOX_LOAD_RULES_RESULT_DTO__OUT_OF_SYNC_SHARES = 3;
    public static final int SANDBOX_LOAD_RULES_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 4;
    public static final int SANDBOX_LOAD_RULES_RESULT_DTO_FEATURE_COUNT = 5;
    public static final int SANDBOX_LOAD_RULE_DTO = 13;
    public static final int SANDBOX_LOAD_RULE_DTO__RULE = 0;
    public static final int SANDBOX_LOAD_RULE_DTO__CONNECTION = 1;
    public static final int SANDBOX_LOAD_RULE_DTO_FEATURE_COUNT = 2;
    public static final int UN_LOAD_RESULT_DTO = 14;
    public static final int UN_LOAD_RESULT_DTO__CANCELLED = 0;
    public static final int UN_LOAD_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int UN_LOAD_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 2;
    public static final int UN_LOAD_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 3;
    public static final int UN_LOAD_RESULT_DTO__COMMIT_DILEMMA = 4;
    public static final int UN_LOAD_RESULT_DTO__UPDATE_DILEMMA = 5;
    public static final int UN_LOAD_RESULT_DTO_FEATURE_COUNT = 6;
    
    EClass getLoadEvaluationDTO();
    
    EReference getLoadEvaluationDTO_OverlappingLoadRequests();
    
    EReference getLoadEvaluationDTO_SharesToBeRemoved();
    
    EReference getLoadEvaluationDTO_Collisions();
    
    EReference getLoadEvaluationDTO_SharesOutOfSync();
    
    EReference getLoadEvaluationDTO_NewSharesToLoad();
    
    EReference getLoadEvaluationDTO_InvalidLoadRequests();
    
    EReference getLoadEvaluationDTO_MultipleSandboxLoads();
    
    EAttribute getLoadEvaluationDTO_InvalidFilterForOldLoadRuleFormat();
    
    EReference getLoadEvaluationDTO_LoadRuleProblems();
    
    EReference getLoadEvaluationDTO_InvalidLoadLocations();
    
    EClass getLoadOverlapDTO();
    
    EReference getLoadOverlapDTO_LoadLocation();
    
    EReference getLoadOverlapDTO_Path();
    
    EReference getLoadOverlapDTO_OverlappingShares();
    
    EReference getLoadOverlapDTO_OverlappingItems();
    
    EClass getRemovedShareDTO();
    
    EAttribute getRemovedShareDTO_UncommittedChangeCount();
    
    EReference getRemovedShareDTO_Share();
    
    EClass getCollisionDTO();
    
    EReference getCollisionDTO_Path();
    
    EAttribute getCollisionDTO_Detail();
    
    EReference getCollisionDTO_LoadLocations();
    
    EAttribute getCollisionDTO_CollidedWithExistingContent();
    
    EAttribute getCollisionDTO_CollidedWithExistingShare();
    
    EClass getLoadLocationDTO();
    
    EAttribute getLoadLocationDTO_RepositoryURL();
    
    EAttribute getLoadLocationDTO_RepositoryId();
    
    EAttribute getLoadLocationDTO_ContextItemId();
    
    EAttribute getLoadLocationDTO_IsWorkspaceContext();
    
    EAttribute getLoadLocationDTO_ComponentItemId();
    
    EAttribute getLoadLocationDTO_VersionableItemId();
    
    EAttribute getLoadLocationDTO_VersionableItemType();
    
    EClass getShareToLoadDTO();
    
    EReference getShareToLoadDTO_Path();
    
    EReference getShareToLoadDTO_LoadLocation();
    
    EClass getInvalidLoadRequestDTO();
    
    EReference getInvalidLoadRequestDTO_LoadLocation();
    
    EAttribute getInvalidLoadRequestDTO_Reason();
    
    EClass getLoadFileOperationResultDTO();
    
    EReference getLoadFileOperationResultDTO_FileResults();
    
    EReference getLoadFileOperationResultDTO_BackedUpToShed();
    
    EAttribute getLoadFileOperationResultDTO_DeletedContentLocations();
    
    EAttribute getLoadFileOperationResultDTO_LocalChangeLocations();
    
    EAttribute getLoadFileOperationResultDTO_Cancelled();
    
    EClass getLoadFileResultDTO();
    
    EAttribute getLoadFileResultDTO_FileItemId();
    
    EAttribute getLoadFileResultDTO_FileItemStateId();
    
    EReference getLoadFileResultDTO_FailureStatus();
    
    EClass getOverlappedItemDTO();
    
    EReference getOverlappedItemDTO_VersionableHandle();
    
    EReference getOverlappedItemDTO_Path();
    
    EClass getMultipleSandboxLoadDTO();
    
    EReference getMultipleSandboxLoadDTO_Configuration();
    
    EAttribute getMultipleSandboxLoadDTO_Sandboxes();
    
    EReference getMultipleSandboxLoadDTO_LoadLocations();
    
    EClass getLoadResultDTO();
    
    EReference getLoadResultDTO_LoadRuleProblems();
    
    EAttribute getLoadResultDTO_EclipseReadFailureMessage();
    
    EReference getLoadResultDTO_SandboxUpdateDilemma();
    
    EClass getSandboxLoadRulesResultDTO();
    
    EAttribute getSandboxLoadRulesResultDTO_Cancelled();
    
    EReference getSandboxLoadRulesResultDTO_LoadRules();
    
    EReference getSandboxLoadRulesResultDTO_LoadRuleFiles();
    
    EReference getSandboxLoadRulesResultDTO_OutOfSyncShares();
    
    EReference getSandboxLoadRulesResultDTO_SandboxUpdateDilemma();
    
    EClass getSandboxLoadRuleDTO();
    
    EAttribute getSandboxLoadRuleDTO_Rule();
    
    EReference getSandboxLoadRuleDTO_Connection();
    
    EClass getUnLoadResultDTO();
    
    EAttribute getUnLoadResultDTO_Cancelled();
    
    EReference getUnLoadResultDTO_OutOfSyncShares();
    
    EReference getUnLoadResultDTO_SandboxUpdateDilemma();
    
    EReference getUnLoadResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getUnLoadResultDTO_CommitDilemma();
    
    EReference getUnLoadResultDTO_UpdateDilemma();
    
    FilesystemRestClientDTOloadFactory getFilesystemRestClientDTOloadFactory();
    
    public interface Literals
    {
        public static final EClass LOAD_EVALUATION_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO();
        public static final EReference LOAD_EVALUATION_DTO__OVERLAPPING_LOAD_REQUESTS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_OverlappingLoadRequests();
        public static final EReference LOAD_EVALUATION_DTO__SHARES_TO_BE_REMOVED = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_SharesToBeRemoved();
        public static final EReference LOAD_EVALUATION_DTO__COLLISIONS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_Collisions();
        public static final EReference LOAD_EVALUATION_DTO__SHARES_OUT_OF_SYNC = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_SharesOutOfSync();
        public static final EReference LOAD_EVALUATION_DTO__NEW_SHARES_TO_LOAD = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_NewSharesToLoad();
        public static final EReference LOAD_EVALUATION_DTO__INVALID_LOAD_REQUESTS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_InvalidLoadRequests();
        public static final EReference LOAD_EVALUATION_DTO__MULTIPLE_SANDBOX_LOADS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_MultipleSandboxLoads();
        public static final EAttribute LOAD_EVALUATION_DTO__INVALID_FILTER_FOR_OLD_LOAD_RULE_FORMAT = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_InvalidFilterForOldLoadRuleFormat();
        public static final EReference LOAD_EVALUATION_DTO__LOAD_RULE_PROBLEMS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_LoadRuleProblems();
        public static final EReference LOAD_EVALUATION_DTO__INVALID_LOAD_LOCATIONS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadEvaluationDTO_InvalidLoadLocations();
        public static final EClass LOAD_OVERLAP_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadOverlapDTO();
        public static final EReference LOAD_OVERLAP_DTO__LOAD_LOCATION = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadOverlapDTO_LoadLocation();
        public static final EReference LOAD_OVERLAP_DTO__PATH = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadOverlapDTO_Path();
        public static final EReference LOAD_OVERLAP_DTO__OVERLAPPING_SHARES = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadOverlapDTO_OverlappingShares();
        public static final EReference LOAD_OVERLAP_DTO__OVERLAPPING_ITEMS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadOverlapDTO_OverlappingItems();
        public static final EClass REMOVED_SHARE_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getRemovedShareDTO();
        public static final EAttribute REMOVED_SHARE_DTO__UNCOMMITTED_CHANGE_COUNT = FilesystemRestClientDTOloadPackage.eINSTANCE.getRemovedShareDTO_UncommittedChangeCount();
        public static final EReference REMOVED_SHARE_DTO__SHARE = FilesystemRestClientDTOloadPackage.eINSTANCE.getRemovedShareDTO_Share();
        public static final EClass COLLISION_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getCollisionDTO();
        public static final EReference COLLISION_DTO__PATH = FilesystemRestClientDTOloadPackage.eINSTANCE.getCollisionDTO_Path();
        public static final EAttribute COLLISION_DTO__DETAIL = FilesystemRestClientDTOloadPackage.eINSTANCE.getCollisionDTO_Detail();
        public static final EReference COLLISION_DTO__LOAD_LOCATIONS = FilesystemRestClientDTOloadPackage.eINSTANCE.getCollisionDTO_LoadLocations();
        public static final EAttribute COLLISION_DTO__COLLIDED_WITH_EXISTING_CONTENT = FilesystemRestClientDTOloadPackage.eINSTANCE.getCollisionDTO_CollidedWithExistingContent();
        public static final EAttribute COLLISION_DTO__COLLIDED_WITH_EXISTING_SHARE = FilesystemRestClientDTOloadPackage.eINSTANCE.getCollisionDTO_CollidedWithExistingShare();
        public static final EClass LOAD_LOCATION_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadLocationDTO();
        public static final EAttribute LOAD_LOCATION_DTO__REPOSITORY_URL = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadLocationDTO_RepositoryURL();
        public static final EAttribute LOAD_LOCATION_DTO__REPOSITORY_ID = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadLocationDTO_RepositoryId();
        public static final EAttribute LOAD_LOCATION_DTO__CONTEXT_ITEM_ID = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadLocationDTO_ContextItemId();
        public static final EAttribute LOAD_LOCATION_DTO__IS_WORKSPACE_CONTEXT = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadLocationDTO_IsWorkspaceContext();
        public static final EAttribute LOAD_LOCATION_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadLocationDTO_ComponentItemId();
        public static final EAttribute LOAD_LOCATION_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadLocationDTO_VersionableItemId();
        public static final EAttribute LOAD_LOCATION_DTO__VERSIONABLE_ITEM_TYPE = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadLocationDTO_VersionableItemType();
        public static final EClass SHARE_TO_LOAD_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getShareToLoadDTO();
        public static final EReference SHARE_TO_LOAD_DTO__PATH = FilesystemRestClientDTOloadPackage.eINSTANCE.getShareToLoadDTO_Path();
        public static final EReference SHARE_TO_LOAD_DTO__LOAD_LOCATION = FilesystemRestClientDTOloadPackage.eINSTANCE.getShareToLoadDTO_LoadLocation();
        public static final EClass INVALID_LOAD_REQUEST_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getInvalidLoadRequestDTO();
        public static final EReference INVALID_LOAD_REQUEST_DTO__LOAD_LOCATION = FilesystemRestClientDTOloadPackage.eINSTANCE.getInvalidLoadRequestDTO_LoadLocation();
        public static final EAttribute INVALID_LOAD_REQUEST_DTO__REASON = FilesystemRestClientDTOloadPackage.eINSTANCE.getInvalidLoadRequestDTO_Reason();
        public static final EClass LOAD_FILE_OPERATION_RESULT_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileOperationResultDTO();
        public static final EReference LOAD_FILE_OPERATION_RESULT_DTO__FILE_RESULTS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileOperationResultDTO_FileResults();
        public static final EReference LOAD_FILE_OPERATION_RESULT_DTO__BACKED_UP_TO_SHED = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileOperationResultDTO_BackedUpToShed();
        public static final EAttribute LOAD_FILE_OPERATION_RESULT_DTO__DELETED_CONTENT_LOCATIONS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileOperationResultDTO_DeletedContentLocations();
        public static final EAttribute LOAD_FILE_OPERATION_RESULT_DTO__LOCAL_CHANGE_LOCATIONS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileOperationResultDTO_LocalChangeLocations();
        public static final EAttribute LOAD_FILE_OPERATION_RESULT_DTO__CANCELLED = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileOperationResultDTO_Cancelled();
        public static final EClass LOAD_FILE_RESULT_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileResultDTO();
        public static final EAttribute LOAD_FILE_RESULT_DTO__FILE_ITEM_ID = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileResultDTO_FileItemId();
        public static final EAttribute LOAD_FILE_RESULT_DTO__FILE_ITEM_STATE_ID = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileResultDTO_FileItemStateId();
        public static final EReference LOAD_FILE_RESULT_DTO__FAILURE_STATUS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadFileResultDTO_FailureStatus();
        public static final EClass OVERLAPPED_ITEM_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getOverlappedItemDTO();
        public static final EReference OVERLAPPED_ITEM_DTO__VERSIONABLE_HANDLE = FilesystemRestClientDTOloadPackage.eINSTANCE.getOverlappedItemDTO_VersionableHandle();
        public static final EReference OVERLAPPED_ITEM_DTO__PATH = FilesystemRestClientDTOloadPackage.eINSTANCE.getOverlappedItemDTO_Path();
        public static final EClass MULTIPLE_SANDBOX_LOAD_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getMultipleSandboxLoadDTO();
        public static final EReference MULTIPLE_SANDBOX_LOAD_DTO__CONFIGURATION = FilesystemRestClientDTOloadPackage.eINSTANCE.getMultipleSandboxLoadDTO_Configuration();
        public static final EAttribute MULTIPLE_SANDBOX_LOAD_DTO__SANDBOXES = FilesystemRestClientDTOloadPackage.eINSTANCE.getMultipleSandboxLoadDTO_Sandboxes();
        public static final EReference MULTIPLE_SANDBOX_LOAD_DTO__LOAD_LOCATIONS = FilesystemRestClientDTOloadPackage.eINSTANCE.getMultipleSandboxLoadDTO_LoadLocations();
        public static final EClass LOAD_RESULT_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadResultDTO();
        public static final EReference LOAD_RESULT_DTO__LOAD_RULE_PROBLEMS = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadResultDTO_LoadRuleProblems();
        public static final EAttribute LOAD_RESULT_DTO__ECLIPSE_READ_FAILURE_MESSAGE = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadResultDTO_EclipseReadFailureMessage();
        public static final EReference LOAD_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOloadPackage.eINSTANCE.getLoadResultDTO_SandboxUpdateDilemma();
        public static final EClass SANDBOX_LOAD_RULES_RESULT_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRulesResultDTO();
        public static final EAttribute SANDBOX_LOAD_RULES_RESULT_DTO__CANCELLED = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRulesResultDTO_Cancelled();
        public static final EReference SANDBOX_LOAD_RULES_RESULT_DTO__LOAD_RULES = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRulesResultDTO_LoadRules();
        public static final EReference SANDBOX_LOAD_RULES_RESULT_DTO__LOAD_RULE_FILES = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRulesResultDTO_LoadRuleFiles();
        public static final EReference SANDBOX_LOAD_RULES_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRulesResultDTO_OutOfSyncShares();
        public static final EReference SANDBOX_LOAD_RULES_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRulesResultDTO_SandboxUpdateDilemma();
        public static final EClass SANDBOX_LOAD_RULE_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRuleDTO();
        public static final EAttribute SANDBOX_LOAD_RULE_DTO__RULE = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRuleDTO_Rule();
        public static final EReference SANDBOX_LOAD_RULE_DTO__CONNECTION = FilesystemRestClientDTOloadPackage.eINSTANCE.getSandboxLoadRuleDTO_Connection();
        public static final EClass UN_LOAD_RESULT_DTO = FilesystemRestClientDTOloadPackage.eINSTANCE.getUnLoadResultDTO();
        public static final EAttribute UN_LOAD_RESULT_DTO__CANCELLED = FilesystemRestClientDTOloadPackage.eINSTANCE.getUnLoadResultDTO_Cancelled();
        public static final EReference UN_LOAD_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOloadPackage.eINSTANCE.getUnLoadResultDTO_OutOfSyncShares();
        public static final EReference UN_LOAD_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOloadPackage.eINSTANCE.getUnLoadResultDTO_SandboxUpdateDilemma();
        public static final EReference UN_LOAD_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOloadPackage.eINSTANCE.getUnLoadResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference UN_LOAD_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOloadPackage.eINSTANCE.getUnLoadResultDTO_CommitDilemma();
        public static final EReference UN_LOAD_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOloadPackage.eINSTANCE.getUnLoadResultDTO_UpdateDilemma();
    }
}
