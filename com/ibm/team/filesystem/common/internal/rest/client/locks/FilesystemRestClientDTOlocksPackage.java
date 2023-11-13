// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.locks.impl.FilesystemRestClientDTOlocksPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOlocksPackage extends EPackage
{
    public static final String eNAME = "locks";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.locks";
    public static final String eNS_PREFIX = "filesystemRestClientDTOlocks";
    public static final FilesystemRestClientDTOlocksPackage eINSTANCE = FilesystemRestClientDTOlocksPackageImpl.init();
    public static final int LOCKED_SHAREABLE_DTO = 0;
    public static final int LOCKED_SHAREABLE_DTO__COMPONENT_ITEM_ID = 0;
    public static final int LOCKED_SHAREABLE_DTO__LOCKED_SHAREABLE = 1;
    public static final int LOCKED_SHAREABLE_DTO__VERSIONABLE_ITEM_ID = 2;
    public static final int LOCKED_SHAREABLE_DTO__STREAM_ITEM_ID = 3;
    public static final int LOCKED_SHAREABLE_DTO_FEATURE_COUNT = 4;
    public static final int LOCKED_RESOURCES_DTO = 1;
    public static final int LOCKED_RESOURCES_DTO__LOCKED_SHAREABLES = 0;
    public static final int LOCKED_RESOURCES_DTO__OWNERS = 1;
    public static final int LOCKED_RESOURCES_DTO__TEAM_LOCKS = 2;
    public static final int LOCKED_RESOURCES_DTO__USER_LOCKS = 3;
    public static final int LOCKED_RESOURCES_DTO_FEATURE_COUNT = 4;
    public static final int STREAM_LOCK_REPORT_DTO = 2;
    public static final int STREAM_LOCK_REPORT_DTO__COMPONENT_LOCK_REPORTS = 0;
    public static final int STREAM_LOCK_REPORT_DTO__STREAM_ITEM_ID = 1;
    public static final int STREAM_LOCK_REPORT_DTO__STREAM_NAME = 2;
    public static final int STREAM_LOCK_REPORT_DTO_FEATURE_COUNT = 3;
    public static final int COMPONENT_LOCK_REPORT_DTO = 3;
    public static final int COMPONENT_LOCK_REPORT_DTO__COMPONENT_ITEM_ID = 0;
    public static final int COMPONENT_LOCK_REPORT_DTO__VERSIONABLE_LOCKS = 1;
    public static final int COMPONENT_LOCK_REPORT_DTO_FEATURE_COUNT = 2;
    public static final int VERSIONABLE_LOCK_DTO = 4;
    public static final int VERSIONABLE_LOCK_DTO__CONTRIBUTOR_ITEM_ID = 0;
    public static final int VERSIONABLE_LOCK_DTO__VERSIONABLE_ITEM_ID = 1;
    public static final int VERSIONABLE_LOCK_DTO_FEATURE_COUNT = 2;
    public static final int CONTRIBUTOR_NAME_DTO = 5;
    public static final int CONTRIBUTOR_NAME_DTO__CONTRIBUTOR_ITEM_ID = 0;
    public static final int CONTRIBUTOR_NAME_DTO__NAME = 1;
    public static final int CONTRIBUTOR_NAME_DTO_FEATURE_COUNT = 2;
    public static final int UNLOCK_RESOURCES_RESULT_DTO = 6;
    public static final int UNLOCK_RESOURCES_RESULT_DTO__CANCELLED = 0;
    public static final int UNLOCK_RESOURCES_RESULT_DTO__CURRENT_USER_DOESNT_OWN_LOCKS = 1;
    public static final int UNLOCK_RESOURCES_RESULT_DTO_FEATURE_COUNT = 2;
    public static final int LOCK_ENTRY_DTO = 7;
    public static final int LOCK_ENTRY_DTO__REPOSITORY_ID = 0;
    public static final int LOCK_ENTRY_DTO__REPOSITORY_ITEM_ID = 1;
    public static final int LOCK_ENTRY_DTO__WORKSPACE_ITEM_ID = 2;
    public static final int LOCK_ENTRY_DTO__COMPONENT_ITEM_ID = 3;
    public static final int LOCK_ENTRY_DTO__VERSIONABLE_ITEM_ID = 4;
    public static final int LOCK_ENTRY_DTO_FEATURE_COUNT = 5;
    
    EClass getLockedShareableDTO();
    
    EReference getLockedShareableDTO_LockedShareable();
    
    EAttribute getLockedShareableDTO_VersionableItemId();
    
    EAttribute getLockedShareableDTO_ComponentItemId();
    
    EAttribute getLockedShareableDTO_StreamItemId();
    
    EClass getLockedResourcesDTO();
    
    EReference getLockedResourcesDTO_LockedShareables();
    
    EReference getLockedResourcesDTO_UserLocks();
    
    EReference getLockedResourcesDTO_TeamLocks();
    
    EReference getLockedResourcesDTO_Owners();
    
    EClass getStreamLockReportDTO();
    
    EReference getStreamLockReportDTO_ComponentLockReports();
    
    EAttribute getStreamLockReportDTO_StreamItemId();
    
    EAttribute getStreamLockReportDTO_StreamName();
    
    EClass getComponentLockReportDTO();
    
    EReference getComponentLockReportDTO_VersionableLocks();
    
    EAttribute getComponentLockReportDTO_ComponentItemId();
    
    EClass getVersionableLockDTO();
    
    EAttribute getVersionableLockDTO_VersionableItemId();
    
    EAttribute getVersionableLockDTO_ContributorItemId();
    
    EClass getContributorNameDTO();
    
    EAttribute getContributorNameDTO_ContributorItemId();
    
    EAttribute getContributorNameDTO_Name();
    
    EClass getUnlockResourcesResultDTO();
    
    EAttribute getUnlockResourcesResultDTO_Cancelled();
    
    EReference getUnlockResourcesResultDTO_CurrentUserDoesntOwnLocks();
    
    EClass getLockEntryDTO();
    
    EAttribute getLockEntryDTO_RepositoryId();
    
    EAttribute getLockEntryDTO_RepositoryItemId();
    
    EAttribute getLockEntryDTO_WorkspaceItemId();
    
    EAttribute getLockEntryDTO_ComponentItemId();
    
    EAttribute getLockEntryDTO_VersionableItemId();
    
    FilesystemRestClientDTOlocksFactory getFilesystemRestClientDTOlocksFactory();
    
    public interface Literals
    {
        public static final EClass LOCKED_SHAREABLE_DTO = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedShareableDTO();
        public static final EReference LOCKED_SHAREABLE_DTO__LOCKED_SHAREABLE = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedShareableDTO_LockedShareable();
        public static final EAttribute LOCKED_SHAREABLE_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedShareableDTO_VersionableItemId();
        public static final EAttribute LOCKED_SHAREABLE_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedShareableDTO_ComponentItemId();
        public static final EAttribute LOCKED_SHAREABLE_DTO__STREAM_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedShareableDTO_StreamItemId();
        public static final EClass LOCKED_RESOURCES_DTO = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedResourcesDTO();
        public static final EReference LOCKED_RESOURCES_DTO__LOCKED_SHAREABLES = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedResourcesDTO_LockedShareables();
        public static final EReference LOCKED_RESOURCES_DTO__USER_LOCKS = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedResourcesDTO_UserLocks();
        public static final EReference LOCKED_RESOURCES_DTO__TEAM_LOCKS = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedResourcesDTO_TeamLocks();
        public static final EReference LOCKED_RESOURCES_DTO__OWNERS = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockedResourcesDTO_Owners();
        public static final EClass STREAM_LOCK_REPORT_DTO = FilesystemRestClientDTOlocksPackage.eINSTANCE.getStreamLockReportDTO();
        public static final EReference STREAM_LOCK_REPORT_DTO__COMPONENT_LOCK_REPORTS = FilesystemRestClientDTOlocksPackage.eINSTANCE.getStreamLockReportDTO_ComponentLockReports();
        public static final EAttribute STREAM_LOCK_REPORT_DTO__STREAM_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getStreamLockReportDTO_StreamItemId();
        public static final EAttribute STREAM_LOCK_REPORT_DTO__STREAM_NAME = FilesystemRestClientDTOlocksPackage.eINSTANCE.getStreamLockReportDTO_StreamName();
        public static final EClass COMPONENT_LOCK_REPORT_DTO = FilesystemRestClientDTOlocksPackage.eINSTANCE.getComponentLockReportDTO();
        public static final EReference COMPONENT_LOCK_REPORT_DTO__VERSIONABLE_LOCKS = FilesystemRestClientDTOlocksPackage.eINSTANCE.getComponentLockReportDTO_VersionableLocks();
        public static final EAttribute COMPONENT_LOCK_REPORT_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getComponentLockReportDTO_ComponentItemId();
        public static final EClass VERSIONABLE_LOCK_DTO = FilesystemRestClientDTOlocksPackage.eINSTANCE.getVersionableLockDTO();
        public static final EAttribute VERSIONABLE_LOCK_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getVersionableLockDTO_VersionableItemId();
        public static final EAttribute VERSIONABLE_LOCK_DTO__CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getVersionableLockDTO_ContributorItemId();
        public static final EClass CONTRIBUTOR_NAME_DTO = FilesystemRestClientDTOlocksPackage.eINSTANCE.getContributorNameDTO();
        public static final EAttribute CONTRIBUTOR_NAME_DTO__CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getContributorNameDTO_ContributorItemId();
        public static final EAttribute CONTRIBUTOR_NAME_DTO__NAME = FilesystemRestClientDTOlocksPackage.eINSTANCE.getContributorNameDTO_Name();
        public static final EClass UNLOCK_RESOURCES_RESULT_DTO = FilesystemRestClientDTOlocksPackage.eINSTANCE.getUnlockResourcesResultDTO();
        public static final EAttribute UNLOCK_RESOURCES_RESULT_DTO__CANCELLED = FilesystemRestClientDTOlocksPackage.eINSTANCE.getUnlockResourcesResultDTO_Cancelled();
        public static final EReference UNLOCK_RESOURCES_RESULT_DTO__CURRENT_USER_DOESNT_OWN_LOCKS = FilesystemRestClientDTOlocksPackage.eINSTANCE.getUnlockResourcesResultDTO_CurrentUserDoesntOwnLocks();
        public static final EClass LOCK_ENTRY_DTO = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockEntryDTO();
        public static final EAttribute LOCK_ENTRY_DTO__REPOSITORY_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockEntryDTO_RepositoryId();
        public static final EAttribute LOCK_ENTRY_DTO__REPOSITORY_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockEntryDTO_RepositoryItemId();
        public static final EAttribute LOCK_ENTRY_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockEntryDTO_WorkspaceItemId();
        public static final EAttribute LOCK_ENTRY_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockEntryDTO_ComponentItemId();
        public static final EAttribute LOCK_ENTRY_DTO__VERSIONABLE_ITEM_ID = FilesystemRestClientDTOlocksPackage.eINSTANCE.getLockEntryDTO_VersionableItemId();
    }
}
