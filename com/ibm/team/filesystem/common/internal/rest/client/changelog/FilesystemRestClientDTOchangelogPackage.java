// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.impl.FilesystemRestClientDTOchangelogPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOchangelogPackage extends EPackage
{
    public static final String eNAME = "changelog";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.changelog";
    public static final String eNS_PREFIX = "filesystemRestClientDTOsync";
    public static final FilesystemRestClientDTOchangelogPackage eINSTANCE = FilesystemRestClientDTOchangelogPackageImpl.init();
    public static final int CHANGE_LOG_ENTRY_DTO = 0;
    public static final int CHANGE_LOG_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_ENTRY_DTO_FEATURE_COUNT = 4;
    public static final int CHANGE_LOG_COMPONENT_ENTRY_DTO = 1;
    public static final int CHANGE_LOG_COMPONENT_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_COMPONENT_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_COMPONENT_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_COMPONENT_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_COMPONENT_ENTRY_DTO__CHANGE_TYPE = 4;
    public static final int CHANGE_LOG_COMPONENT_ENTRY_DTO_FEATURE_COUNT = 5;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO = 2;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO__WORK_ITEMS = 4;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO__OSLC_LINKS = 5;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO__CREATION_DATE = 6;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO__CREATOR = 7;
    public static final int CHANGE_LOG_CHANGE_SET_ENTRY_DTO_FEATURE_COUNT = 8;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY_DTO = 3;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY_DTO__SEGMENTS = 4;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY_DTO__RESOLVED = 5;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY_DTO_FEATURE_COUNT = 6;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO = 4;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__SEGMENTS = 4;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__RESOLVED = 5;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__SHORT_VERSION_ID = 6;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__LONG_VERSION_ID = 7;
    public static final int CHANGE_LOG_VERSIONABLE_ENTRY2_DTO_FEATURE_COUNT = 8;
    public static final int CHANGE_LOG_WORK_ITEM_ENTRY_DTO = 5;
    public static final int CHANGE_LOG_WORK_ITEM_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_WORK_ITEM_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_WORK_ITEM_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_WORK_ITEM_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_WORK_ITEM_ENTRY_DTO__WORK_ITEM_NUMBER = 4;
    public static final int CHANGE_LOG_WORK_ITEM_ENTRY_DTO__RESOLVER = 5;
    public static final int CHANGE_LOG_WORK_ITEM_ENTRY_DTO_FEATURE_COUNT = 6;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO = 6;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO__BASELINE_ID = 4;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO__CREATION_DATE = 5;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO__CREATOR = 6;
    public static final int CHANGE_LOG_BASELINE_ENTRY_DTO_FEATURE_COUNT = 7;
    public static final int CHANGE_LOG_DIRECTION_ENTRY_DTO = 7;
    public static final int CHANGE_LOG_DIRECTION_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_DIRECTION_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_DIRECTION_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_DIRECTION_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_DIRECTION_ENTRY_DTO__FLOW_DIRECTION = 4;
    public static final int CHANGE_LOG_DIRECTION_ENTRY_DTO_FEATURE_COUNT = 5;
    public static final int CHANGE_LOG_ROOT_ENTRY_DTO = 8;
    public static final int CHANGE_LOG_ROOT_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_ROOT_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_ROOT_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_ROOT_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_ROOT_ENTRY_DTO__REPOSITORY_ID = 4;
    public static final int CHANGE_LOG_ROOT_ENTRY_DTO__REPOSITORY_URI = 5;
    public static final int CHANGE_LOG_ROOT_ENTRY_DTO_FEATURE_COUNT = 6;
    public static final int CHANGE_LOG_OSLC_LINK_ENTRY_DTO = 9;
    public static final int CHANGE_LOG_OSLC_LINK_ENTRY_DTO__ENTRY_TYPE = 0;
    public static final int CHANGE_LOG_OSLC_LINK_ENTRY_DTO__ITEM_ID = 1;
    public static final int CHANGE_LOG_OSLC_LINK_ENTRY_DTO__CHILD_ENTRIES = 2;
    public static final int CHANGE_LOG_OSLC_LINK_ENTRY_DTO__ENTRY_NAME = 3;
    public static final int CHANGE_LOG_OSLC_LINK_ENTRY_DTO__TARGET_URI = 4;
    public static final int CHANGE_LOG_OSLC_LINK_ENTRY_DTO_FEATURE_COUNT = 5;
    
    EClass getChangeLogEntryDTO();
    
    EAttribute getChangeLogEntryDTO_EntryType();
    
    EAttribute getChangeLogEntryDTO_ItemId();
    
    EReference getChangeLogEntryDTO_ChildEntries();
    
    EAttribute getChangeLogEntryDTO_EntryName();
    
    EClass getChangeLogComponentEntryDTO();
    
    EAttribute getChangeLogComponentEntryDTO_ChangeType();
    
    EClass getChangeLogChangeSetEntryDTO();
    
    EReference getChangeLogChangeSetEntryDTO_WorkItems();
    
    EReference getChangeLogChangeSetEntryDTO_OslcLinks();
    
    EAttribute getChangeLogChangeSetEntryDTO_CreationDate();
    
    EReference getChangeLogChangeSetEntryDTO_Creator();
    
    EClass getChangeLogVersionableEntryDTO();
    
    EAttribute getChangeLogVersionableEntryDTO_Segments();
    
    EAttribute getChangeLogVersionableEntryDTO_Resolved();
    
    EClass getChangeLogVersionableEntry2DTO();
    
    EAttribute getChangeLogVersionableEntry2DTO_ShortVersionId();
    
    EAttribute getChangeLogVersionableEntry2DTO_LongVersionId();
    
    EClass getChangeLogWorkItemEntryDTO();
    
    EAttribute getChangeLogWorkItemEntryDTO_WorkItemNumber();
    
    EReference getChangeLogWorkItemEntryDTO_Resolver();
    
    EClass getChangeLogBaselineEntryDTO();
    
    EAttribute getChangeLogBaselineEntryDTO_BaselineId();
    
    EAttribute getChangeLogBaselineEntryDTO_CreationDate();
    
    EReference getChangeLogBaselineEntryDTO_Creator();
    
    EClass getChangeLogDirectionEntryDTO();
    
    EAttribute getChangeLogDirectionEntryDTO_FlowDirection();
    
    EClass getChangeLogRootEntryDTO();
    
    EAttribute getChangeLogRootEntryDTO_RepositoryId();
    
    EAttribute getChangeLogRootEntryDTO_RepositoryUri();
    
    EClass getChangeLogOslcLinkEntryDTO();
    
    EAttribute getChangeLogOslcLinkEntryDTO_TargetUri();
    
    FilesystemRestClientDTOchangelogFactory getFilesystemRestClientDTOchangelogFactory();
    
    public interface Literals
    {
        public static final EClass CHANGE_LOG_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogEntryDTO();
        public static final EAttribute CHANGE_LOG_ENTRY_DTO__ENTRY_TYPE = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogEntryDTO_EntryType();
        public static final EAttribute CHANGE_LOG_ENTRY_DTO__ITEM_ID = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogEntryDTO_ItemId();
        public static final EReference CHANGE_LOG_ENTRY_DTO__CHILD_ENTRIES = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogEntryDTO_ChildEntries();
        public static final EAttribute CHANGE_LOG_ENTRY_DTO__ENTRY_NAME = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogEntryDTO_EntryName();
        public static final EClass CHANGE_LOG_COMPONENT_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogComponentEntryDTO();
        public static final EAttribute CHANGE_LOG_COMPONENT_ENTRY_DTO__CHANGE_TYPE = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogComponentEntryDTO_ChangeType();
        public static final EClass CHANGE_LOG_CHANGE_SET_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogChangeSetEntryDTO();
        public static final EReference CHANGE_LOG_CHANGE_SET_ENTRY_DTO__WORK_ITEMS = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogChangeSetEntryDTO_WorkItems();
        public static final EReference CHANGE_LOG_CHANGE_SET_ENTRY_DTO__OSLC_LINKS = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogChangeSetEntryDTO_OslcLinks();
        public static final EAttribute CHANGE_LOG_CHANGE_SET_ENTRY_DTO__CREATION_DATE = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogChangeSetEntryDTO_CreationDate();
        public static final EReference CHANGE_LOG_CHANGE_SET_ENTRY_DTO__CREATOR = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogChangeSetEntryDTO_Creator();
        public static final EClass CHANGE_LOG_VERSIONABLE_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogVersionableEntryDTO();
        public static final EAttribute CHANGE_LOG_VERSIONABLE_ENTRY_DTO__SEGMENTS = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogVersionableEntryDTO_Segments();
        public static final EAttribute CHANGE_LOG_VERSIONABLE_ENTRY_DTO__RESOLVED = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogVersionableEntryDTO_Resolved();
        public static final EClass CHANGE_LOG_VERSIONABLE_ENTRY2_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogVersionableEntry2DTO();
        public static final EAttribute CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__SHORT_VERSION_ID = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogVersionableEntry2DTO_ShortVersionId();
        public static final EAttribute CHANGE_LOG_VERSIONABLE_ENTRY2_DTO__LONG_VERSION_ID = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogVersionableEntry2DTO_LongVersionId();
        public static final EClass CHANGE_LOG_WORK_ITEM_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogWorkItemEntryDTO();
        public static final EAttribute CHANGE_LOG_WORK_ITEM_ENTRY_DTO__WORK_ITEM_NUMBER = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogWorkItemEntryDTO_WorkItemNumber();
        public static final EReference CHANGE_LOG_WORK_ITEM_ENTRY_DTO__RESOLVER = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogWorkItemEntryDTO_Resolver();
        public static final EClass CHANGE_LOG_BASELINE_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogBaselineEntryDTO();
        public static final EAttribute CHANGE_LOG_BASELINE_ENTRY_DTO__BASELINE_ID = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogBaselineEntryDTO_BaselineId();
        public static final EAttribute CHANGE_LOG_BASELINE_ENTRY_DTO__CREATION_DATE = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogBaselineEntryDTO_CreationDate();
        public static final EReference CHANGE_LOG_BASELINE_ENTRY_DTO__CREATOR = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogBaselineEntryDTO_Creator();
        public static final EClass CHANGE_LOG_DIRECTION_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogDirectionEntryDTO();
        public static final EAttribute CHANGE_LOG_DIRECTION_ENTRY_DTO__FLOW_DIRECTION = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogDirectionEntryDTO_FlowDirection();
        public static final EClass CHANGE_LOG_ROOT_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogRootEntryDTO();
        public static final EAttribute CHANGE_LOG_ROOT_ENTRY_DTO__REPOSITORY_ID = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogRootEntryDTO_RepositoryId();
        public static final EAttribute CHANGE_LOG_ROOT_ENTRY_DTO__REPOSITORY_URI = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogRootEntryDTO_RepositoryUri();
        public static final EClass CHANGE_LOG_OSLC_LINK_ENTRY_DTO = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogOslcLinkEntryDTO();
        public static final EAttribute CHANGE_LOG_OSLC_LINK_ENTRY_DTO__TARGET_URI = FilesystemRestClientDTOchangelogPackage.eINSTANCE.getChangeLogOslcLinkEntryDTO_TargetUri();
    }
}
