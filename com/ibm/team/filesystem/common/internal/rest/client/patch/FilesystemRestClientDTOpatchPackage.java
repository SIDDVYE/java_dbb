// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.impl.FilesystemRestClientDTOpatchPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOpatchPackage extends EPackage
{
    public static final String eNAME = "patch";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.patch";
    public static final String eNS_PREFIX = "filesystemRestClientDTOpatch";
    public static final FilesystemRestClientDTOpatchPackage eINSTANCE = FilesystemRestClientDTOpatchPackageImpl.init();
    public static final int ACCEPT_QUEUE_DTO = 0;
    public static final int ACCEPT_QUEUE_DTO__ACCEPT_QUEUE = 0;
    public static final int ACCEPT_QUEUE_DTO__CURRENT_PATCH = 1;
    public static final int ACCEPT_QUEUE_DTO__PAGE_DESCRIPTOR = 2;
    public static final int ACCEPT_QUEUE_DTO_FEATURE_COUNT = 3;
    public static final int CHANGE_SET_SOURCE_DTO = 1;
    public static final int CHANGE_SET_SOURCE_DTO__INTERNAL_ID = 0;
    public static final int CHANGE_SET_SOURCE_DTO__SOURCE_ID = 1;
    public static final int CHANGE_SET_SOURCE_DTO__SOURCE_TYPE = 2;
    public static final int CHANGE_SET_SOURCE_DTO_FEATURE_COUNT = 3;
    public static final int CURRENT_PATCH_DTO = 2;
    public static final int CURRENT_PATCH_DTO__WORKSPACE_ID = 0;
    public static final int CURRENT_PATCH_DTO__COMPONENT_ID = 1;
    public static final int CURRENT_PATCH_DTO__SOURCE = 2;
    public static final int CURRENT_PATCH_DTO__TARGET_CHANGE_SET_ID = 3;
    public static final int CURRENT_PATCH_DTO__CHANGES = 4;
    public static final int CURRENT_PATCH_DTO_FEATURE_COUNT = 5;
    public static final int VERSIONABLE_CHANGE_DTO = 3;
    public static final int VERSIONABLE_CHANGE_DTO__RESOLVED = 0;
    public static final int VERSIONABLE_CHANGE_DTO__VERSIONABLE_ITEM_ID = 1;
    public static final int VERSIONABLE_CHANGE_DTO__VERSIONABLE_TYPE = 2;
    public static final int VERSIONABLE_CHANGE_DTO__NAME = 3;
    public static final int VERSIONABLE_CHANGE_DTO__PARENT_PATH_HINT = 4;
    public static final int VERSIONABLE_CHANGE_DTO__BEFORE_STATE_ID = 5;
    public static final int VERSIONABLE_CHANGE_DTO__AFTER_STATE_ID = 6;
    public static final int VERSIONABLE_CHANGE_DTO__CONFIGURATION_STATE_ID = 7;
    public static final int VERSIONABLE_CHANGE_DTO__KIND = 8;
    public static final int VERSIONABLE_CHANGE_DTO__CHANGE_TYPE = 9;
    public static final int VERSIONABLE_CHANGE_DTO__INCIDENTALS = 10;
    public static final int VERSIONABLE_CHANGE_DTO__CHANGE_DETAILS = 11;
    public static final int VERSIONABLE_CHANGE_DTO__CHILD_CHANGES = 12;
    public static final int VERSIONABLE_CHANGE_DTO__DEPENDS_ON_ID = 13;
    public static final int VERSIONABLE_CHANGE_DTO_FEATURE_COUNT = 14;
    public static final int CHANGE_DETAIL_DTO = 4;
    public static final int CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int CHANGE_DETAIL_DTO__ID = 1;
    public static final int CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int CHANGE_DETAIL_DTO__KIND = 3;
    public static final int CHANGE_DETAIL_DTO_FEATURE_COUNT = 4;
    public static final int PROPERTY_CHANGE_DETAIL_DTO = 5;
    public static final int PROPERTY_CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int PROPERTY_CHANGE_DETAIL_DTO__ID = 1;
    public static final int PROPERTY_CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int PROPERTY_CHANGE_DETAIL_DTO__KIND = 3;
    public static final int PROPERTY_CHANGE_DETAIL_DTO__PROPERTY_NAME = 4;
    public static final int PROPERTY_CHANGE_DETAIL_DTO__BEFORE_VALUE = 5;
    public static final int PROPERTY_CHANGE_DETAIL_DTO__AFTER_VALUE = 6;
    public static final int PROPERTY_CHANGE_DETAIL_DTO__TYPE = 7;
    public static final int PROPERTY_CHANGE_DETAIL_DTO_FEATURE_COUNT = 8;
    public static final int MOVE_CHANGE_DETAIL_DTO = 6;
    public static final int MOVE_CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int MOVE_CHANGE_DETAIL_DTO__ID = 1;
    public static final int MOVE_CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int MOVE_CHANGE_DETAIL_DTO__KIND = 3;
    public static final int MOVE_CHANGE_DETAIL_DTO__BEFORE_PARENT_ID = 4;
    public static final int MOVE_CHANGE_DETAIL_DTO__AFTER_PARENT_ID = 5;
    public static final int MOVE_CHANGE_DETAIL_DTO__BEFORE_NAME = 6;
    public static final int MOVE_CHANGE_DETAIL_DTO__AFTER_NAME = 7;
    public static final int MOVE_CHANGE_DETAIL_DTO__BEFORE_PARENT_PATH_HINT = 8;
    public static final int MOVE_CHANGE_DETAIL_DTO__AFTER_PARENT_PATH_HINT = 9;
    public static final int MOVE_CHANGE_DETAIL_DTO__MOVE = 10;
    public static final int MOVE_CHANGE_DETAIL_DTO__RENAME = 11;
    public static final int MOVE_CHANGE_DETAIL_DTO__INCIDENTAL_DETAILS = 12;
    public static final int MOVE_CHANGE_DETAIL_DTO_FEATURE_COUNT = 13;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO = 7;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO__ID = 1;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO__KIND = 3;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO__BEFORE_TARGET = 4;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO__AFTER_TARGET = 5;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO__BEFORE_DIRECTORY = 6;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO__AFTER_DIRECTORY = 7;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_DTO_FEATURE_COUNT = 8;
    public static final int CONTENT_CHANGE_DETAIL_DTO = 8;
    public static final int CONTENT_CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int CONTENT_CHANGE_DETAIL_DTO__ID = 1;
    public static final int CONTENT_CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int CONTENT_CHANGE_DETAIL_DTO__KIND = 3;
    public static final int CONTENT_CHANGE_DETAIL_DTO__BEFORE_CONTENT_HASH = 4;
    public static final int CONTENT_CHANGE_DETAIL_DTO__AFTER_CONTENT_HASH = 5;
    public static final int CONTENT_CHANGE_DETAIL_DTO_FEATURE_COUNT = 6;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_DTO = 9;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_DTO__ID = 1;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_DTO__KIND = 3;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_DTO__BEFORE_CONTENT_TYPE = 4;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_DTO__AFTER_CONTENT_TYPE = 5;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_DTO_FEATURE_COUNT = 6;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_DTO = 10;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_DTO__ID = 1;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_DTO__KIND = 3;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_DTO__BEFORE_LINE_DELIMITER = 4;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_DTO__AFTER_LINE_DELIMITER = 5;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_DTO_FEATURE_COUNT = 6;
    public static final int ENCODING_CHANGE_DETAIL_DTO = 11;
    public static final int ENCODING_CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int ENCODING_CHANGE_DETAIL_DTO__ID = 1;
    public static final int ENCODING_CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int ENCODING_CHANGE_DETAIL_DTO__KIND = 3;
    public static final int ENCODING_CHANGE_DETAIL_DTO__BEFORE_CHARACTER_ENCODING = 4;
    public static final int ENCODING_CHANGE_DETAIL_DTO__AFTER_CHARACTER_ENCODING = 5;
    public static final int ENCODING_CHANGE_DETAIL_DTO_FEATURE_COUNT = 6;
    public static final int EXECUTE_BIT_CHANGE_DETAIL_DTO = 12;
    public static final int EXECUTE_BIT_CHANGE_DETAIL_DTO__PORT_CHANGE_ID = 0;
    public static final int EXECUTE_BIT_CHANGE_DETAIL_DTO__ID = 1;
    public static final int EXECUTE_BIT_CHANGE_DETAIL_DTO__RESOLVED = 2;
    public static final int EXECUTE_BIT_CHANGE_DETAIL_DTO__KIND = 3;
    public static final int EXECUTE_BIT_CHANGE_DETAIL_DTO__EXECUTABLE = 4;
    public static final int EXECUTE_BIT_CHANGE_DETAIL_DTO_FEATURE_COUNT = 5;
    public static final int ABORT_CURRENT_PATCH_RESULT_DTO = 13;
    public static final int ABORT_CURRENT_PATCH_RESULT_DTO__CANCELLED = 0;
    public static final int ABORT_CURRENT_PATCH_RESULT_DTO__COMMIT_DILEMMA = 1;
    public static final int ABORT_CURRENT_PATCH_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 2;
    public static final int ABORT_CURRENT_PATCH_RESULT_DTO__OUT_OF_SYNC_SHARES = 3;
    public static final int ABORT_CURRENT_PATCH_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 4;
    public static final int ABORT_CURRENT_PATCH_RESULT_DTO__UPDATE_DILEMMA = 5;
    public static final int ABORT_CURRENT_PATCH_RESULT_DTO_FEATURE_COUNT = 6;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO = 14;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__CURRENT_PATCH = 0;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__RESOLVED_VERSIONABLE_IDS = 1;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__RESOLVED_CHANGE_DETAIL_IDS = 2;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__CANCELLED = 3;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__OUT_OF_SYNC_SHARES = 4;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 5;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 6;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__COMMIT_DILEMMA = 7;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__UPDATE_DILEMMA = 8;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO__VERSIONABLE_IDS = 9;
    public static final int UPDATE_CURRENT_PATCH_RESULT_DTO_FEATURE_COUNT = 10;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO = 15;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO__CANCELLED = 0;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 2;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 3;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO__COMMIT_DILEMMA = 4;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO__UPDATE_DILEMMA = 5;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO__UNRESOLVED_CHANGES = 6;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO__ACCEPT_QUEUE_SIZE = 7;
    public static final int COMPLETE_CURRENT_PATCH_RESULT_DTO_FEATURE_COUNT = 8;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO = 16;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO__CURRENT_PATCH = 0;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO__CANCELLED = 1;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO__OUT_OF_SYNC_SHARES = 2;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 3;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 4;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO__COMMIT_DILEMMA = 5;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO__UPDATE_DILEMMA = 6;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO__ACCEPT_QUEUE_SIZE = 7;
    public static final int PROCESS_ACCEPT_QUEUE_RESULT_DTO_FEATURE_COUNT = 8;
    public static final int PAGE_DESCRIPTOR_DTO = 17;
    public static final int PAGE_DESCRIPTOR_DTO__INTERNAL_ID = 0;
    public static final int PAGE_DESCRIPTOR_DTO__REPOSITORY_URI = 1;
    public static final int PAGE_DESCRIPTOR_DTO__WORKSPACE_ID = 2;
    public static final int PAGE_DESCRIPTOR_DTO__COMPONENT_ID = 3;
    public static final int PAGE_DESCRIPTOR_DTO__MAX_PAGE_SIZE = 4;
    public static final int PAGE_DESCRIPTOR_DTO__START_INDEX = 5;
    public static final int PAGE_DESCRIPTOR_DTO__TOTAL_SIZE = 6;
    public static final int PAGE_DESCRIPTOR_DTO__SYNC_TIME = 7;
    public static final int PAGE_DESCRIPTOR_DTO_FEATURE_COUNT = 8;
    
    EClass getAcceptQueueDTO();
    
    EReference getAcceptQueueDTO_AcceptQueue();
    
    EReference getAcceptQueueDTO_CurrentPatch();
    
    EReference getAcceptQueueDTO_PageDescriptor();
    
    EClass getChangeSetSourceDTO();
    
    EAttribute getChangeSetSourceDTO_SourceId();
    
    EAttribute getChangeSetSourceDTO_SourceType();
    
    EClass getCurrentPatchDTO();
    
    EAttribute getCurrentPatchDTO_WorkspaceId();
    
    EAttribute getCurrentPatchDTO_ComponentId();
    
    EReference getCurrentPatchDTO_Source();
    
    EAttribute getCurrentPatchDTO_TargetChangeSetId();
    
    EReference getCurrentPatchDTO_Changes();
    
    EClass getVersionableChangeDTO();
    
    EAttribute getVersionableChangeDTO_Resolved();
    
    EAttribute getVersionableChangeDTO_VersionableItemId();
    
    EAttribute getVersionableChangeDTO_VersionableType();
    
    EAttribute getVersionableChangeDTO_Name();
    
    EAttribute getVersionableChangeDTO_ParentPathHint();
    
    EAttribute getVersionableChangeDTO_BeforeStateId();
    
    EAttribute getVersionableChangeDTO_AfterStateId();
    
    EAttribute getVersionableChangeDTO_ConfigurationStateId();
    
    EAttribute getVersionableChangeDTO_Kind();
    
    EAttribute getVersionableChangeDTO_ChangeType();
    
    EAttribute getVersionableChangeDTO_Incidentals();
    
    EReference getVersionableChangeDTO_ChangeDetails();
    
    EAttribute getVersionableChangeDTO_ChildChanges();
    
    EAttribute getVersionableChangeDTO_DependsOnId();
    
    EClass getChangeDetailDTO();
    
    EAttribute getChangeDetailDTO_PortChangeId();
    
    EAttribute getChangeDetailDTO_Id();
    
    EAttribute getChangeDetailDTO_Resolved();
    
    EAttribute getChangeDetailDTO_Kind();
    
    EClass getPropertyChangeDetailDTO();
    
    EAttribute getPropertyChangeDetailDTO_PropertyName();
    
    EAttribute getPropertyChangeDetailDTO_BeforeValue();
    
    EAttribute getPropertyChangeDetailDTO_AfterValue();
    
    EAttribute getPropertyChangeDetailDTO_Type();
    
    EClass getMoveChangeDetailDTO();
    
    EAttribute getMoveChangeDetailDTO_BeforeParentId();
    
    EAttribute getMoveChangeDetailDTO_AfterParentId();
    
    EAttribute getMoveChangeDetailDTO_BeforeName();
    
    EAttribute getMoveChangeDetailDTO_AfterName();
    
    EAttribute getMoveChangeDetailDTO_BeforeParentPathHint();
    
    EAttribute getMoveChangeDetailDTO_AfterParentPathHint();
    
    EAttribute getMoveChangeDetailDTO_Move();
    
    EAttribute getMoveChangeDetailDTO_Rename();
    
    EAttribute getMoveChangeDetailDTO_IncidentalDetails();
    
    EClass getSymbolicLinkChangeDetailDTO();
    
    EAttribute getSymbolicLinkChangeDetailDTO_BeforeTarget();
    
    EAttribute getSymbolicLinkChangeDetailDTO_AfterTarget();
    
    EAttribute getSymbolicLinkChangeDetailDTO_BeforeDirectory();
    
    EAttribute getSymbolicLinkChangeDetailDTO_AfterDirectory();
    
    EClass getContentChangeDetailDTO();
    
    EAttribute getContentChangeDetailDTO_BeforeContentHash();
    
    EAttribute getContentChangeDetailDTO_AfterContentHash();
    
    EClass getContentTypeChangeDetailDTO();
    
    EAttribute getContentTypeChangeDetailDTO_BeforeContentType();
    
    EAttribute getContentTypeChangeDetailDTO_AfterContentType();
    
    EClass getLineDelimiterChangeDetailDTO();
    
    EAttribute getLineDelimiterChangeDetailDTO_BeforeLineDelimiter();
    
    EAttribute getLineDelimiterChangeDetailDTO_AfterLineDelimiter();
    
    EClass getEncodingChangeDetailDTO();
    
    EAttribute getEncodingChangeDetailDTO_BeforeCharacterEncoding();
    
    EAttribute getEncodingChangeDetailDTO_AfterCharacterEncoding();
    
    EClass getExecuteBitChangeDetailDTO();
    
    EAttribute getExecuteBitChangeDetailDTO_Executable();
    
    EClass getAbortCurrentPatchResultDTO();
    
    EAttribute getAbortCurrentPatchResultDTO_Cancelled();
    
    EReference getAbortCurrentPatchResultDTO_CommitDilemma();
    
    EReference getAbortCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getAbortCurrentPatchResultDTO_OutOfSyncShares();
    
    EReference getAbortCurrentPatchResultDTO_SandboxUpdateDilemma();
    
    EReference getAbortCurrentPatchResultDTO_UpdateDilemma();
    
    EClass getUpdateCurrentPatchResultDTO();
    
    EReference getUpdateCurrentPatchResultDTO_CurrentPatch();
    
    EAttribute getUpdateCurrentPatchResultDTO_ResolvedVersionableIds();
    
    EAttribute getUpdateCurrentPatchResultDTO_ResolvedChangeDetailIds();
    
    EAttribute getUpdateCurrentPatchResultDTO_Cancelled();
    
    EReference getUpdateCurrentPatchResultDTO_OutOfSyncShares();
    
    EReference getUpdateCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getUpdateCurrentPatchResultDTO_SandboxUpdateDilemma();
    
    EReference getUpdateCurrentPatchResultDTO_CommitDilemma();
    
    EReference getUpdateCurrentPatchResultDTO_UpdateDilemma();
    
    EAttribute getUpdateCurrentPatchResultDTO_VersionableIds();
    
    EClass getCompleteCurrentPatchResultDTO();
    
    EAttribute getCompleteCurrentPatchResultDTO_Cancelled();
    
    EReference getCompleteCurrentPatchResultDTO_OutOfSyncShares();
    
    EReference getCompleteCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getCompleteCurrentPatchResultDTO_SandboxUpdateDilemma();
    
    EReference getCompleteCurrentPatchResultDTO_CommitDilemma();
    
    EReference getCompleteCurrentPatchResultDTO_UpdateDilemma();
    
    EReference getCompleteCurrentPatchResultDTO_UnresolvedChanges();
    
    EAttribute getCompleteCurrentPatchResultDTO_AcceptQueueSize();
    
    EClass getProcessAcceptQueueResultDTO();
    
    EReference getProcessAcceptQueueResultDTO_CurrentPatch();
    
    EAttribute getProcessAcceptQueueResultDTO_Cancelled();
    
    EReference getProcessAcceptQueueResultDTO_OutOfSyncShares();
    
    EReference getProcessAcceptQueueResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getProcessAcceptQueueResultDTO_SandboxUpdateDilemma();
    
    EReference getProcessAcceptQueueResultDTO_CommitDilemma();
    
    EReference getProcessAcceptQueueResultDTO_UpdateDilemma();
    
    EAttribute getProcessAcceptQueueResultDTO_AcceptQueueSize();
    
    EClass getPageDescriptorDTO();
    
    EAttribute getPageDescriptorDTO_RepositoryURI();
    
    EAttribute getPageDescriptorDTO_WorkspaceID();
    
    EAttribute getPageDescriptorDTO_ComponentID();
    
    EAttribute getPageDescriptorDTO_MaxPageSize();
    
    EAttribute getPageDescriptorDTO_StartIndex();
    
    EAttribute getPageDescriptorDTO_TotalSize();
    
    EAttribute getPageDescriptorDTO_SyncTime();
    
    FilesystemRestClientDTOpatchFactory getFilesystemRestClientDTOpatchFactory();
    
    public interface Literals
    {
        public static final EClass ACCEPT_QUEUE_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAcceptQueueDTO();
        public static final EReference ACCEPT_QUEUE_DTO__ACCEPT_QUEUE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAcceptQueueDTO_AcceptQueue();
        public static final EReference ACCEPT_QUEUE_DTO__CURRENT_PATCH = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAcceptQueueDTO_CurrentPatch();
        public static final EReference ACCEPT_QUEUE_DTO__PAGE_DESCRIPTOR = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAcceptQueueDTO_PageDescriptor();
        public static final EClass CHANGE_SET_SOURCE_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getChangeSetSourceDTO();
        public static final EAttribute CHANGE_SET_SOURCE_DTO__SOURCE_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getChangeSetSourceDTO_SourceId();
        public static final EAttribute CHANGE_SET_SOURCE_DTO__SOURCE_TYPE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getChangeSetSourceDTO_SourceType();
        public static final EClass CURRENT_PATCH_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCurrentPatchDTO();
        public static final EAttribute CURRENT_PATCH_DTO__WORKSPACE_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCurrentPatchDTO_WorkspaceId();
        public static final EAttribute CURRENT_PATCH_DTO__COMPONENT_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCurrentPatchDTO_ComponentId();
        public static final EReference CURRENT_PATCH_DTO__SOURCE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCurrentPatchDTO_Source();
        public static final EAttribute CURRENT_PATCH_DTO__TARGET_CHANGE_SET_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCurrentPatchDTO_TargetChangeSetId();
        public static final EReference CURRENT_PATCH_DTO__CHANGES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCurrentPatchDTO_Changes();
        public static final EClass VERSIONABLE_CHANGE_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__RESOLVED = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_Resolved();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_VersionableItemId();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__VERSIONABLE_TYPE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_VersionableType();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__NAME = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_Name();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__PARENT_PATH_HINT = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_ParentPathHint();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__BEFORE_STATE_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_BeforeStateId();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__AFTER_STATE_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_AfterStateId();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__CONFIGURATION_STATE_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_ConfigurationStateId();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__KIND = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_Kind();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__CHANGE_TYPE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_ChangeType();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__INCIDENTALS = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_Incidentals();
        public static final EReference VERSIONABLE_CHANGE_DTO__CHANGE_DETAILS = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_ChangeDetails();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__CHILD_CHANGES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_ChildChanges();
        public static final EAttribute VERSIONABLE_CHANGE_DTO__DEPENDS_ON_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getVersionableChangeDTO_DependsOnId();
        public static final EClass CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getChangeDetailDTO();
        public static final EAttribute CHANGE_DETAIL_DTO__PORT_CHANGE_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getChangeDetailDTO_PortChangeId();
        public static final EAttribute CHANGE_DETAIL_DTO__ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getChangeDetailDTO_Id();
        public static final EAttribute CHANGE_DETAIL_DTO__RESOLVED = FilesystemRestClientDTOpatchPackage.eINSTANCE.getChangeDetailDTO_Resolved();
        public static final EAttribute CHANGE_DETAIL_DTO__KIND = FilesystemRestClientDTOpatchPackage.eINSTANCE.getChangeDetailDTO_Kind();
        public static final EClass PROPERTY_CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPropertyChangeDetailDTO();
        public static final EAttribute PROPERTY_CHANGE_DETAIL_DTO__PROPERTY_NAME = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPropertyChangeDetailDTO_PropertyName();
        public static final EAttribute PROPERTY_CHANGE_DETAIL_DTO__BEFORE_VALUE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPropertyChangeDetailDTO_BeforeValue();
        public static final EAttribute PROPERTY_CHANGE_DETAIL_DTO__AFTER_VALUE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPropertyChangeDetailDTO_AfterValue();
        public static final EAttribute PROPERTY_CHANGE_DETAIL_DTO__TYPE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPropertyChangeDetailDTO_Type();
        public static final EClass MOVE_CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__BEFORE_PARENT_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_BeforeParentId();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__AFTER_PARENT_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_AfterParentId();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__BEFORE_NAME = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_BeforeName();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__AFTER_NAME = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_AfterName();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__BEFORE_PARENT_PATH_HINT = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_BeforeParentPathHint();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__AFTER_PARENT_PATH_HINT = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_AfterParentPathHint();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__MOVE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_Move();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__RENAME = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_Rename();
        public static final EAttribute MOVE_CHANGE_DETAIL_DTO__INCIDENTAL_DETAILS = FilesystemRestClientDTOpatchPackage.eINSTANCE.getMoveChangeDetailDTO_IncidentalDetails();
        public static final EClass SYMBOLIC_LINK_CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getSymbolicLinkChangeDetailDTO();
        public static final EAttribute SYMBOLIC_LINK_CHANGE_DETAIL_DTO__BEFORE_TARGET = FilesystemRestClientDTOpatchPackage.eINSTANCE.getSymbolicLinkChangeDetailDTO_BeforeTarget();
        public static final EAttribute SYMBOLIC_LINK_CHANGE_DETAIL_DTO__AFTER_TARGET = FilesystemRestClientDTOpatchPackage.eINSTANCE.getSymbolicLinkChangeDetailDTO_AfterTarget();
        public static final EAttribute SYMBOLIC_LINK_CHANGE_DETAIL_DTO__BEFORE_DIRECTORY = FilesystemRestClientDTOpatchPackage.eINSTANCE.getSymbolicLinkChangeDetailDTO_BeforeDirectory();
        public static final EAttribute SYMBOLIC_LINK_CHANGE_DETAIL_DTO__AFTER_DIRECTORY = FilesystemRestClientDTOpatchPackage.eINSTANCE.getSymbolicLinkChangeDetailDTO_AfterDirectory();
        public static final EClass CONTENT_CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getContentChangeDetailDTO();
        public static final EAttribute CONTENT_CHANGE_DETAIL_DTO__BEFORE_CONTENT_HASH = FilesystemRestClientDTOpatchPackage.eINSTANCE.getContentChangeDetailDTO_BeforeContentHash();
        public static final EAttribute CONTENT_CHANGE_DETAIL_DTO__AFTER_CONTENT_HASH = FilesystemRestClientDTOpatchPackage.eINSTANCE.getContentChangeDetailDTO_AfterContentHash();
        public static final EClass CONTENT_TYPE_CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getContentTypeChangeDetailDTO();
        public static final EAttribute CONTENT_TYPE_CHANGE_DETAIL_DTO__BEFORE_CONTENT_TYPE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getContentTypeChangeDetailDTO_BeforeContentType();
        public static final EAttribute CONTENT_TYPE_CHANGE_DETAIL_DTO__AFTER_CONTENT_TYPE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getContentTypeChangeDetailDTO_AfterContentType();
        public static final EClass LINE_DELIMITER_CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getLineDelimiterChangeDetailDTO();
        public static final EAttribute LINE_DELIMITER_CHANGE_DETAIL_DTO__BEFORE_LINE_DELIMITER = FilesystemRestClientDTOpatchPackage.eINSTANCE.getLineDelimiterChangeDetailDTO_BeforeLineDelimiter();
        public static final EAttribute LINE_DELIMITER_CHANGE_DETAIL_DTO__AFTER_LINE_DELIMITER = FilesystemRestClientDTOpatchPackage.eINSTANCE.getLineDelimiterChangeDetailDTO_AfterLineDelimiter();
        public static final EClass ENCODING_CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getEncodingChangeDetailDTO();
        public static final EAttribute ENCODING_CHANGE_DETAIL_DTO__BEFORE_CHARACTER_ENCODING = FilesystemRestClientDTOpatchPackage.eINSTANCE.getEncodingChangeDetailDTO_BeforeCharacterEncoding();
        public static final EAttribute ENCODING_CHANGE_DETAIL_DTO__AFTER_CHARACTER_ENCODING = FilesystemRestClientDTOpatchPackage.eINSTANCE.getEncodingChangeDetailDTO_AfterCharacterEncoding();
        public static final EClass EXECUTE_BIT_CHANGE_DETAIL_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getExecuteBitChangeDetailDTO();
        public static final EAttribute EXECUTE_BIT_CHANGE_DETAIL_DTO__EXECUTABLE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getExecuteBitChangeDetailDTO_Executable();
        public static final EClass ABORT_CURRENT_PATCH_RESULT_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAbortCurrentPatchResultDTO();
        public static final EAttribute ABORT_CURRENT_PATCH_RESULT_DTO__CANCELLED = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAbortCurrentPatchResultDTO_Cancelled();
        public static final EReference ABORT_CURRENT_PATCH_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAbortCurrentPatchResultDTO_CommitDilemma();
        public static final EReference ABORT_CURRENT_PATCH_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAbortCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference ABORT_CURRENT_PATCH_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAbortCurrentPatchResultDTO_OutOfSyncShares();
        public static final EReference ABORT_CURRENT_PATCH_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAbortCurrentPatchResultDTO_SandboxUpdateDilemma();
        public static final EReference ABORT_CURRENT_PATCH_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getAbortCurrentPatchResultDTO_UpdateDilemma();
        public static final EClass UPDATE_CURRENT_PATCH_RESULT_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO();
        public static final EReference UPDATE_CURRENT_PATCH_RESULT_DTO__CURRENT_PATCH = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_CurrentPatch();
        public static final EAttribute UPDATE_CURRENT_PATCH_RESULT_DTO__RESOLVED_VERSIONABLE_IDS = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_ResolvedVersionableIds();
        public static final EAttribute UPDATE_CURRENT_PATCH_RESULT_DTO__RESOLVED_CHANGE_DETAIL_IDS = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_ResolvedChangeDetailIds();
        public static final EAttribute UPDATE_CURRENT_PATCH_RESULT_DTO__CANCELLED = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_Cancelled();
        public static final EReference UPDATE_CURRENT_PATCH_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_OutOfSyncShares();
        public static final EReference UPDATE_CURRENT_PATCH_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference UPDATE_CURRENT_PATCH_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_SandboxUpdateDilemma();
        public static final EReference UPDATE_CURRENT_PATCH_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_CommitDilemma();
        public static final EReference UPDATE_CURRENT_PATCH_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_UpdateDilemma();
        public static final EAttribute UPDATE_CURRENT_PATCH_RESULT_DTO__VERSIONABLE_IDS = FilesystemRestClientDTOpatchPackage.eINSTANCE.getUpdateCurrentPatchResultDTO_VersionableIds();
        public static final EClass COMPLETE_CURRENT_PATCH_RESULT_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO();
        public static final EAttribute COMPLETE_CURRENT_PATCH_RESULT_DTO__CANCELLED = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO_Cancelled();
        public static final EReference COMPLETE_CURRENT_PATCH_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO_OutOfSyncShares();
        public static final EReference COMPLETE_CURRENT_PATCH_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference COMPLETE_CURRENT_PATCH_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO_SandboxUpdateDilemma();
        public static final EReference COMPLETE_CURRENT_PATCH_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO_CommitDilemma();
        public static final EReference COMPLETE_CURRENT_PATCH_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO_UpdateDilemma();
        public static final EReference COMPLETE_CURRENT_PATCH_RESULT_DTO__UNRESOLVED_CHANGES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO_UnresolvedChanges();
        public static final EAttribute COMPLETE_CURRENT_PATCH_RESULT_DTO__ACCEPT_QUEUE_SIZE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getCompleteCurrentPatchResultDTO_AcceptQueueSize();
        public static final EClass PROCESS_ACCEPT_QUEUE_RESULT_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO();
        public static final EReference PROCESS_ACCEPT_QUEUE_RESULT_DTO__CURRENT_PATCH = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO_CurrentPatch();
        public static final EAttribute PROCESS_ACCEPT_QUEUE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO_Cancelled();
        public static final EReference PROCESS_ACCEPT_QUEUE_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO_OutOfSyncShares();
        public static final EReference PROCESS_ACCEPT_QUEUE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference PROCESS_ACCEPT_QUEUE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO_SandboxUpdateDilemma();
        public static final EReference PROCESS_ACCEPT_QUEUE_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO_CommitDilemma();
        public static final EReference PROCESS_ACCEPT_QUEUE_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO_UpdateDilemma();
        public static final EAttribute PROCESS_ACCEPT_QUEUE_RESULT_DTO__ACCEPT_QUEUE_SIZE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getProcessAcceptQueueResultDTO_AcceptQueueSize();
        public static final EClass PAGE_DESCRIPTOR_DTO = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPageDescriptorDTO();
        public static final EAttribute PAGE_DESCRIPTOR_DTO__REPOSITORY_URI = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPageDescriptorDTO_RepositoryURI();
        public static final EAttribute PAGE_DESCRIPTOR_DTO__WORKSPACE_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPageDescriptorDTO_WorkspaceID();
        public static final EAttribute PAGE_DESCRIPTOR_DTO__COMPONENT_ID = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPageDescriptorDTO_ComponentID();
        public static final EAttribute PAGE_DESCRIPTOR_DTO__MAX_PAGE_SIZE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPageDescriptorDTO_MaxPageSize();
        public static final EAttribute PAGE_DESCRIPTOR_DTO__START_INDEX = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPageDescriptorDTO_StartIndex();
        public static final EAttribute PAGE_DESCRIPTOR_DTO__TOTAL_SIZE = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPageDescriptorDTO_TotalSize();
        public static final EAttribute PAGE_DESCRIPTOR_DTO__SYNC_TIME = FilesystemRestClientDTOpatchPackage.eINSTANCE.getPageDescriptorDTO_SyncTime();
    }
}
