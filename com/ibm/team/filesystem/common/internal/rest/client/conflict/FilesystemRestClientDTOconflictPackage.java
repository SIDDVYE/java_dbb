// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.impl.FilesystemRestClientDTOconflictPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOconflictPackage extends EPackage
{
    public static final String eNAME = "conflict";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.conflict";
    public static final String eNS_PREFIX = "filesystemRestClientDTOconflict";
    public static final FilesystemRestClientDTOconflictPackage eINSTANCE = FilesystemRestClientDTOconflictPackageImpl.init();
    public static final int RESOLVE_WITH_PROPOSED_RESULT_DTO = 0;
    public static final int RESOLVE_WITH_PROPOSED_RESULT_DTO__CANCELLED = 0;
    public static final int RESOLVE_WITH_PROPOSED_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int RESOLVE_WITH_PROPOSED_RESULT_DTO__MISSING_REQUIRED_CHANGES = 2;
    public static final int RESOLVE_WITH_PROPOSED_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 3;
    public static final int RESOLVE_WITH_PROPOSED_RESULT_DTO__UPDATE_DILEMMA = 4;
    public static final int RESOLVE_WITH_PROPOSED_RESULT_DTO_FEATURE_COUNT = 5;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO = 1;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO__CANCELLED = 0;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO__MISSING_REQUIRED_CHANGES = 2;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO__UNMERGED_CHANGES = 3;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 4;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 5;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO__COMMIT_DILEMMA = 6;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO__UPDATE_DILEMMA = 7;
    public static final int RESOLVE_AS_MERGED_RESULT_DTO_FEATURE_COUNT = 8;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO = 2;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__CANCELLED = 0;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__OUT_OF_SYNC_SHARES = 1;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = 2;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__MISSING_REQUIRED_CHANGES = 3;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__MISSING_STORAGE_MERGERS = 4;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__NUMBER_CONFLICTS_RESOLVED = 5;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 6;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__COMMIT_DILEMMA = 7;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO__UPDATE_DILEMMA = 8;
    public static final int RESOLVE_AUTO_MERGE_RESULT_DTO_FEATURE_COUNT = 9;
    public static final int CONFLICTED_CHANGE_DTO = 3;
    public static final int CONFLICTED_CHANGE_DTO__COMPONENT_ITEM_ID = 0;
    public static final int CONFLICTED_CHANGE_DTO__VERSIONABLE_ITEM_ID = 1;
    public static final int CONFLICTED_CHANGE_DTO__VERSIONABLE_ITEM_TYPE = 2;
    public static final int CONFLICTED_CHANGE_DTO__PATH = 3;
    public static final int CONFLICTED_CHANGE_DTO__KIND = 4;
    public static final int CONFLICTED_CHANGE_DTO__CONFLICT_TYPE = 5;
    public static final int CONFLICTED_CHANGE_DTO_FEATURE_COUNT = 6;
    public static final int FAILED_MERGE_DTO = 4;
    public static final int FAILED_MERGE_DTO__COMPONENT_ITEM_ID = 0;
    public static final int FAILED_MERGE_DTO__VERSIONABLE_ITEM_ID = 1;
    public static final int FAILED_MERGE_DTO__VERSIONABLE_ITEM_TYPE = 2;
    public static final int FAILED_MERGE_DTO__PATH = 3;
    public static final int FAILED_MERGE_DTO__UNKNOWN_CONTENT_TYPE = 4;
    public static final int FAILED_MERGE_DTO__NO_MERGER_FOR_CONTENT_TYPE = 5;
    public static final int FAILED_MERGE_DTO_FEATURE_COUNT = 6;
    public static final int RESOLVE_WITH_PROPOSED_EVALUATION_DTO = 5;
    public static final int RESOLVE_WITH_PROPOSED_EVALUATION_DTO__NEED_CONTENT_TO_REMOVED = 0;
    public static final int RESOLVE_WITH_PROPOSED_EVALUATION_DTO__NEED_PARENT_FOR_RESOLUTION = 1;
    public static final int RESOLVE_WITH_PROPOSED_EVALUATION_DTO_FEATURE_COUNT = 2;
    
    EClass getResolveWithProposedResultDTO();
    
    EAttribute getResolveWithProposedResultDTO_Cancelled();
    
    EReference getResolveWithProposedResultDTO_OutOfSyncShares();
    
    EReference getResolveWithProposedResultDTO_MissingRequiredChanges();
    
    EReference getResolveWithProposedResultDTO_SandboxUpdateDilemma();
    
    EReference getResolveWithProposedResultDTO_UpdateDilemma();
    
    EClass getResolveAsMergedResultDTO();
    
    EAttribute getResolveAsMergedResultDTO_Cancelled();
    
    EReference getResolveAsMergedResultDTO_OutOfSyncShares();
    
    EReference getResolveAsMergedResultDTO_MissingRequiredChanges();
    
    EReference getResolveAsMergedResultDTO_UnmergedChanges();
    
    EReference getResolveAsMergedResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getResolveAsMergedResultDTO_SandboxUpdateDilemma();
    
    EReference getResolveAsMergedResultDTO_CommitDilemma();
    
    EReference getResolveAsMergedResultDTO_UpdateDilemma();
    
    EClass getResolveAutoMergeResultDTO();
    
    EAttribute getResolveAutoMergeResultDTO_Cancelled();
    
    EReference getResolveAutoMergeResultDTO_OutOfSyncShares();
    
    EReference getResolveAutoMergeResultDTO_ConfigurationsWithUncheckedInChanges();
    
    EReference getResolveAutoMergeResultDTO_MissingRequiredChanges();
    
    EReference getResolveAutoMergeResultDTO_MissingStorageMergers();
    
    EAttribute getResolveAutoMergeResultDTO_NumberConflictsResolved();
    
    EReference getResolveAutoMergeResultDTO_SandboxUpdateDilemma();
    
    EReference getResolveAutoMergeResultDTO_CommitDilemma();
    
    EReference getResolveAutoMergeResultDTO_UpdateDilemma();
    
    EClass getConflictedChangeDTO();
    
    EAttribute getConflictedChangeDTO_ComponentItemId();
    
    EAttribute getConflictedChangeDTO_VersionableItemId();
    
    EAttribute getConflictedChangeDTO_VersionableItemType();
    
    EReference getConflictedChangeDTO_Path();
    
    EAttribute getConflictedChangeDTO_Kind();
    
    EAttribute getConflictedChangeDTO_ConflictType();
    
    EClass getFailedMergeDTO();
    
    EAttribute getFailedMergeDTO_ComponentItemId();
    
    EAttribute getFailedMergeDTO_VersionableItemId();
    
    EAttribute getFailedMergeDTO_VersionableItemType();
    
    EReference getFailedMergeDTO_Path();
    
    EAttribute getFailedMergeDTO_UnknownContentType();
    
    EAttribute getFailedMergeDTO_NoMergerForContentType();
    
    EClass getResolveWithProposedEvaluationDTO();
    
    EReference getResolveWithProposedEvaluationDTO_NeedContentToRemoved();
    
    EReference getResolveWithProposedEvaluationDTO_NeedParentForResolution();
    
    FilesystemRestClientDTOconflictFactory getFilesystemRestClientDTOconflictFactory();
    
    public interface Literals
    {
        public static final EClass RESOLVE_WITH_PROPOSED_RESULT_DTO = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedResultDTO();
        public static final EAttribute RESOLVE_WITH_PROPOSED_RESULT_DTO__CANCELLED = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedResultDTO_Cancelled();
        public static final EReference RESOLVE_WITH_PROPOSED_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedResultDTO_OutOfSyncShares();
        public static final EReference RESOLVE_WITH_PROPOSED_RESULT_DTO__MISSING_REQUIRED_CHANGES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedResultDTO_MissingRequiredChanges();
        public static final EReference RESOLVE_WITH_PROPOSED_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedResultDTO_SandboxUpdateDilemma();
        public static final EReference RESOLVE_WITH_PROPOSED_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedResultDTO_UpdateDilemma();
        public static final EClass RESOLVE_AS_MERGED_RESULT_DTO = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO();
        public static final EAttribute RESOLVE_AS_MERGED_RESULT_DTO__CANCELLED = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO_Cancelled();
        public static final EReference RESOLVE_AS_MERGED_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO_OutOfSyncShares();
        public static final EReference RESOLVE_AS_MERGED_RESULT_DTO__MISSING_REQUIRED_CHANGES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO_MissingRequiredChanges();
        public static final EReference RESOLVE_AS_MERGED_RESULT_DTO__UNMERGED_CHANGES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO_UnmergedChanges();
        public static final EReference RESOLVE_AS_MERGED_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference RESOLVE_AS_MERGED_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO_SandboxUpdateDilemma();
        public static final EReference RESOLVE_AS_MERGED_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO_CommitDilemma();
        public static final EReference RESOLVE_AS_MERGED_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAsMergedResultDTO_UpdateDilemma();
        public static final EClass RESOLVE_AUTO_MERGE_RESULT_DTO = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO();
        public static final EAttribute RESOLVE_AUTO_MERGE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_Cancelled();
        public static final EReference RESOLVE_AUTO_MERGE_RESULT_DTO__OUT_OF_SYNC_SHARES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_OutOfSyncShares();
        public static final EReference RESOLVE_AUTO_MERGE_RESULT_DTO__CONFIGURATIONS_WITH_UNCHECKED_IN_CHANGES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_ConfigurationsWithUncheckedInChanges();
        public static final EReference RESOLVE_AUTO_MERGE_RESULT_DTO__MISSING_REQUIRED_CHANGES = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_MissingRequiredChanges();
        public static final EReference RESOLVE_AUTO_MERGE_RESULT_DTO__MISSING_STORAGE_MERGERS = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_MissingStorageMergers();
        public static final EAttribute RESOLVE_AUTO_MERGE_RESULT_DTO__NUMBER_CONFLICTS_RESOLVED = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_NumberConflictsResolved();
        public static final EReference RESOLVE_AUTO_MERGE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_SandboxUpdateDilemma();
        public static final EReference RESOLVE_AUTO_MERGE_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_CommitDilemma();
        public static final EReference RESOLVE_AUTO_MERGE_RESULT_DTO__UPDATE_DILEMMA = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveAutoMergeResultDTO_UpdateDilemma();
        public static final EClass CONFLICTED_CHANGE_DTO = FilesystemRestClientDTOconflictPackage.eINSTANCE.getConflictedChangeDTO();
        public static final EAttribute CONFLICTED_CHANGE_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOconflictPackage.eINSTANCE.getConflictedChangeDTO_ComponentItemId();
        public static final EAttribute CONFLICTED_CHANGE_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOconflictPackage.eINSTANCE.getConflictedChangeDTO_VersionableItemId();
        public static final EAttribute CONFLICTED_CHANGE_DTO__VERSIONABLE_ITEM_TYPE = FilesystemRestClientDTOconflictPackage.eINSTANCE.getConflictedChangeDTO_VersionableItemType();
        public static final EReference CONFLICTED_CHANGE_DTO__PATH = FilesystemRestClientDTOconflictPackage.eINSTANCE.getConflictedChangeDTO_Path();
        public static final EAttribute CONFLICTED_CHANGE_DTO__KIND = FilesystemRestClientDTOconflictPackage.eINSTANCE.getConflictedChangeDTO_Kind();
        public static final EAttribute CONFLICTED_CHANGE_DTO__CONFLICT_TYPE = FilesystemRestClientDTOconflictPackage.eINSTANCE.getConflictedChangeDTO_ConflictType();
        public static final EClass FAILED_MERGE_DTO = FilesystemRestClientDTOconflictPackage.eINSTANCE.getFailedMergeDTO();
        public static final EAttribute FAILED_MERGE_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOconflictPackage.eINSTANCE.getFailedMergeDTO_ComponentItemId();
        public static final EAttribute FAILED_MERGE_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOconflictPackage.eINSTANCE.getFailedMergeDTO_VersionableItemId();
        public static final EAttribute FAILED_MERGE_DTO__VERSIONABLE_ITEM_TYPE = FilesystemRestClientDTOconflictPackage.eINSTANCE.getFailedMergeDTO_VersionableItemType();
        public static final EReference FAILED_MERGE_DTO__PATH = FilesystemRestClientDTOconflictPackage.eINSTANCE.getFailedMergeDTO_Path();
        public static final EAttribute FAILED_MERGE_DTO__UNKNOWN_CONTENT_TYPE = FilesystemRestClientDTOconflictPackage.eINSTANCE.getFailedMergeDTO_UnknownContentType();
        public static final EAttribute FAILED_MERGE_DTO__NO_MERGER_FOR_CONTENT_TYPE = FilesystemRestClientDTOconflictPackage.eINSTANCE.getFailedMergeDTO_NoMergerForContentType();
        public static final EClass RESOLVE_WITH_PROPOSED_EVALUATION_DTO = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedEvaluationDTO();
        public static final EReference RESOLVE_WITH_PROPOSED_EVALUATION_DTO__NEED_CONTENT_TO_REMOVED = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedEvaluationDTO_NeedContentToRemoved();
        public static final EReference RESOLVE_WITH_PROPOSED_EVALUATION_DTO__NEED_PARENT_FOR_RESOLUTION = FilesystemRestClientDTOconflictPackage.eINSTANCE.getResolveWithProposedEvaluationDTO_NeedParentForResolution();
    }
}
