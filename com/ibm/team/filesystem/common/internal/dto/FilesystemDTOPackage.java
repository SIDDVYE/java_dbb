// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.dto.impl.FilesystemDTOPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemDTOPackage extends EPackage
{
    public static final String eNAME = "dto";
    public static final String eNS_URI = "com.ibm.team.filesystem.dto";
    public static final String eNS_PREFIX = "filesystemDTO";
    public static final FilesystemDTOPackage eINSTANCE = FilesystemDTOPackageImpl.init();
    public static final int RESOLUTION = 0;
    public static final int RESOLUTION__UPDATE_REPORT = 0;
    public static final int RESOLUTION__CHANGE_SET = 1;
    public static final int RESOLUTION_FEATURE_COUNT = 2;
    public static final int LOGICAL_CONFLICT_REPORT_FACADE = 2;
    public static final int LOGICAL_CONFLICT_REPORT_FACADE_FEATURE_COUNT = 0;
    public static final int LOGICAL_CONFLICT_REPORT = 1;
    public static final int LOGICAL_CONFLICT_REPORT__CONFLICTS = 0;
    public static final int LOGICAL_CONFLICT_REPORT__PENDING_CHANGES = 1;
    public static final int LOGICAL_CONFLICT_REPORT__DEFERRED_CHANGES = 2;
    public static final int LOGICAL_CONFLICT_REPORT__CONFLICT_REPORT = 3;
    public static final int LOGICAL_CONFLICT_REPORT_FEATURE_COUNT = 4;
    public static final int BASIC_CHANGE_FACADE = 12;
    public static final int BASIC_CHANGE_FACADE_FEATURE_COUNT = 0;
    public static final int BASIC_CHANGE = 11;
    public static final int BASIC_CHANGE__COMPONENT = 0;
    public static final int BASIC_CHANGE__CHANGE_TYPE = 1;
    public static final int BASIC_CHANGE__NAME = 2;
    public static final int BASIC_CHANGE__OLD_NAME = 3;
    public static final int BASIC_CHANGE__ITEM = 4;
    public static final int BASIC_CHANGE__SOURCE_PARENT = 5;
    public static final int BASIC_CHANGE__DESTINATION_PARENT = 6;
    public static final int BASIC_CHANGE__BEFORE = 7;
    public static final int BASIC_CHANGE__AFTER = 8;
    public static final int BASIC_CHANGE__PREVIOUS_COMPONENT = 9;
    public static final int BASIC_CHANGE__CHANGE_DETAILS = 10;
    public static final int BASIC_CHANGE_FEATURE_COUNT = 11;
    public static final int CHANGE_SYNOPSIS = 13;
    public static final int CHANGE_SYNOPSIS__COMPONENT = 0;
    public static final int CHANGE_SYNOPSIS__CHANGE_TYPE = 1;
    public static final int CHANGE_SYNOPSIS__NAME = 2;
    public static final int CHANGE_SYNOPSIS__OLD_NAME = 3;
    public static final int CHANGE_SYNOPSIS__ITEM = 4;
    public static final int CHANGE_SYNOPSIS__SOURCE_PARENT = 5;
    public static final int CHANGE_SYNOPSIS__DESTINATION_PARENT = 6;
    public static final int CHANGE_SYNOPSIS__BEFORE = 7;
    public static final int CHANGE_SYNOPSIS__AFTER = 8;
    public static final int CHANGE_SYNOPSIS__PREVIOUS_COMPONENT = 9;
    public static final int CHANGE_SYNOPSIS__CHANGE_DETAILS = 10;
    public static final int CHANGE_SYNOPSIS__SOURCE_PARENT_PATH = 11;
    public static final int CHANGE_SYNOPSIS__DESTINATION_PARENT_PATH = 12;
    public static final int CHANGE_SYNOPSIS_FEATURE_COUNT = 13;
    public static final int LOGICAL_CHANGE = 5;
    public static final int LOGICAL_CHANGE__COMPONENT = 0;
    public static final int LOGICAL_CHANGE__CHANGE_TYPE = 1;
    public static final int LOGICAL_CHANGE__NAME = 2;
    public static final int LOGICAL_CHANGE__OLD_NAME = 3;
    public static final int LOGICAL_CHANGE__ITEM = 4;
    public static final int LOGICAL_CHANGE__SOURCE_PARENT = 5;
    public static final int LOGICAL_CHANGE__DESTINATION_PARENT = 6;
    public static final int LOGICAL_CHANGE__BEFORE = 7;
    public static final int LOGICAL_CHANGE__AFTER = 8;
    public static final int LOGICAL_CHANGE__PREVIOUS_COMPONENT = 9;
    public static final int LOGICAL_CHANGE__CHANGE_DETAILS = 10;
    public static final int LOGICAL_CHANGE__SOURCE_PARENT_PATH = 11;
    public static final int LOGICAL_CHANGE__DESTINATION_PARENT_PATH = 12;
    public static final int LOGICAL_CHANGE__ID = 13;
    public static final int LOGICAL_CHANGE__DEPENDENT_CHANGES = 14;
    public static final int LOGICAL_CHANGE__RELATED_CHANGES = 15;
    public static final int LOGICAL_CHANGE__KIND = 16;
    public static final int LOGICAL_CHANGE_FEATURE_COUNT = 17;
    public static final int LOGICAL_CONFLICT = 3;
    public static final int LOGICAL_CONFLICT__COMPONENT = 0;
    public static final int LOGICAL_CONFLICT__CHANGE_TYPE = 1;
    public static final int LOGICAL_CONFLICT__NAME = 2;
    public static final int LOGICAL_CONFLICT__OLD_NAME = 3;
    public static final int LOGICAL_CONFLICT__ITEM = 4;
    public static final int LOGICAL_CONFLICT__SOURCE_PARENT = 5;
    public static final int LOGICAL_CONFLICT__DESTINATION_PARENT = 6;
    public static final int LOGICAL_CONFLICT__BEFORE = 7;
    public static final int LOGICAL_CONFLICT__AFTER = 8;
    public static final int LOGICAL_CONFLICT__PREVIOUS_COMPONENT = 9;
    public static final int LOGICAL_CONFLICT__CHANGE_DETAILS = 10;
    public static final int LOGICAL_CONFLICT__SOURCE_PARENT_PATH = 11;
    public static final int LOGICAL_CONFLICT__DESTINATION_PARENT_PATH = 12;
    public static final int LOGICAL_CONFLICT__ID = 13;
    public static final int LOGICAL_CONFLICT__DEPENDENT_CHANGES = 14;
    public static final int LOGICAL_CONFLICT__RELATED_CHANGES = 15;
    public static final int LOGICAL_CONFLICT__KIND = 16;
    public static final int LOGICAL_CONFLICT__CONFLICTS = 17;
    public static final int LOGICAL_CONFLICT__CONFLICT_TYPE = 18;
    public static final int LOGICAL_CONFLICT__SELECTED_CHANGE_DETAILS = 19;
    public static final int LOGICAL_CONFLICT_FEATURE_COUNT = 20;
    public static final int LOGICAL_CONFLICT_FACADE = 4;
    public static final int LOGICAL_CONFLICT_FACADE_FEATURE_COUNT = 0;
    public static final int LOGICAL_CHANGE_FACADE = 6;
    public static final int LOGICAL_CHANGE_FACADE_FEATURE_COUNT = 0;
    public static final int FILE_AREA_UPDATE = 7;
    public static final int FILE_AREA_UPDATE__COMPONENT = 0;
    public static final int FILE_AREA_UPDATE__CHANGE_TYPE = 1;
    public static final int FILE_AREA_UPDATE__NAME = 2;
    public static final int FILE_AREA_UPDATE__OLD_NAME = 3;
    public static final int FILE_AREA_UPDATE__ITEM = 4;
    public static final int FILE_AREA_UPDATE__SOURCE_PARENT = 5;
    public static final int FILE_AREA_UPDATE__DESTINATION_PARENT = 6;
    public static final int FILE_AREA_UPDATE__BEFORE = 7;
    public static final int FILE_AREA_UPDATE__AFTER = 8;
    public static final int FILE_AREA_UPDATE__PREVIOUS_COMPONENT = 9;
    public static final int FILE_AREA_UPDATE__CHANGE_DETAILS = 10;
    public static final int FILE_AREA_UPDATE__EXECUTABLE = 11;
    public static final int FILE_AREA_UPDATE__PROPERTIES = 12;
    public static final int FILE_AREA_UPDATE__OPTIONAL_CONTENT = 13;
    public static final int FILE_AREA_UPDATE_FEATURE_COUNT = 14;
    public static final int FILE_AREA_UPDATE_FACADE = 8;
    public static final int FILE_AREA_UPDATE_FACADE_FEATURE_COUNT = 0;
    public static final int CONFLICT_RESOLUTION_REPORT = 9;
    public static final int CONFLICT_RESOLUTION_REPORT__RESOLUTIONS = 0;
    public static final int CONFLICT_RESOLUTION_REPORT_FEATURE_COUNT = 1;
    public static final int CONFLICT_RESOLUTION = 10;
    public static final int CONFLICT_RESOLUTION__PARENT = 0;
    public static final int CONFLICT_RESOLUTION__ITEM = 1;
    public static final int CONFLICT_RESOLUTION__NAME = 2;
    public static final int CONFLICT_RESOLUTION__CONFLICT_TYPE = 3;
    public static final int CONFLICT_RESOLUTION_FEATURE_COUNT = 4;
    public static final int CHANGE_SYNOPSIS_FACADE = 14;
    public static final int CHANGE_SYNOPSIS_FACADE_FEATURE_COUNT = 0;
    public static final int CHANGE_SET_SYNOPSIS_FACADE = 16;
    public static final int CHANGE_SET_SYNOPSIS_FACADE_FEATURE_COUNT = 0;
    public static final int CHANGE_SET_SYNOPSIS = 15;
    public static final int CHANGE_SET_SYNOPSIS__CHANGES = 0;
    public static final int CHANGE_SET_SYNOPSIS__UNDERLYING_CHANGE_SET = 1;
    public static final int CHANGE_SET_SYNOPSIS__COMPONENT = 2;
    public static final int CHANGE_SET_SYNOPSIS_FEATURE_COUNT = 3;
    public static final int LOAD_TREE = 17;
    public static final int LOAD_TREE__FILE_AREA_UPDATES = 0;
    public static final int LOAD_TREE__CONFIGURATION_STATE = 1;
    public static final int LOAD_TREE__INACCESSIBLE = 2;
    public static final int LOAD_TREE_FEATURE_COUNT = 3;
    public static final int FILE_AREA_UPDATE_REPORT = 23;
    public static final int OVERLAP_REQUEST = 18;
    public static final int OVERLAP_DESCRIPTION = 20;
    public static final int OVERLAP_RESPONSE = 19;
    public static final int SHARE_POINT = 24;
    public static final int OVERLAP_REQUEST__WORKSPACE = 0;
    public static final int OVERLAP_REQUEST__BASELINE = 1;
    public static final int OVERLAP_REQUEST__COMPONENT = 2;
    public static final int OVERLAP_REQUEST__GROUP = 3;
    public static final int OVERLAP_REQUEST_FEATURE_COUNT = 4;
    public static final int OVERLAP_RESPONSE__WORKSPACE = 0;
    public static final int OVERLAP_RESPONSE__COMPONENT = 1;
    public static final int OVERLAP_RESPONSE__BASELINE = 2;
    public static final int OVERLAP_RESPONSE__OVERLAP_DESCRIPTIONS = 3;
    public static final int OVERLAP_RESPONSE__ANCESTOR_REPORTS = 4;
    public static final int OVERLAP_RESPONSE_FEATURE_COUNT = 5;
    public static final int OVERLAP_DESCRIPTION__ELEMENT = 0;
    public static final int OVERLAP_DESCRIPTION__OVERLAPPED_CHILDREN = 1;
    public static final int OVERLAP_DESCRIPTION_FEATURE_COUNT = 2;
    public static final int COMPARE_RESULT_FACADE = 22;
    public static final int COMPARE_RESULT_FACADE_FEATURE_COUNT = 0;
    public static final int COMPARE_RESULT = 21;
    public static final int COMPARE_RESULT__SYNC_REPORT = 0;
    public static final int COMPARE_RESULT__LOGICAL_CONFLICT_REPORT = 1;
    public static final int COMPARE_RESULT__ITEM_NWAY_CONFLICT_REPORTS = 2;
    public static final int COMPARE_RESULT_FEATURE_COUNT = 3;
    public static final int FILE_AREA_UPDATE_REPORT__ADDS = 0;
    public static final int FILE_AREA_UPDATE_REPORT__MOVES = 1;
    public static final int FILE_AREA_UPDATE_REPORT__DELETES = 2;
    public static final int FILE_AREA_UPDATE_REPORT__MODIFIES = 3;
    public static final int FILE_AREA_UPDATE_REPORT__SHARE_PARENTS = 4;
    public static final int FILE_AREA_UPDATE_REPORT__COPY_FILE_AREAS_WITH_OVERLAPS = 5;
    public static final int FILE_AREA_UPDATE_REPORT__OVERLAPS = 6;
    public static final int FILE_AREA_UPDATE_REPORT_FEATURE_COUNT = 7;
    public static final int SHARE_POINT__WORKSPACE = 0;
    public static final int SHARE_POINT__BASELINE = 1;
    public static final int SHARE_POINT__COMPONENT = 2;
    public static final int SHARE_POINT__VERSIONABLE = 3;
    public static final int SHARE_POINT__COPY_FILE_AREA = 4;
    public static final int SHARE_POINT__RELATIVE_PATH = 5;
    public static final int SHARE_POINT_FEATURE_COUNT = 6;
    public static final int CONFLICT_RESOLUTION2 = 25;
    public static final int CONFLICT_RESOLUTION2__COMPONENT = 0;
    public static final int CONFLICT_RESOLUTION2__ITEM = 1;
    public static final int CONFLICT_RESOLUTION2__PARENT = 2;
    public static final int CONFLICT_RESOLUTION2__NAME = 3;
    public static final int CONFLICT_RESOLUTION2_FEATURE_COUNT = 4;
    public static final int INACCESSIBLE = 26;
    public static final int INACCESSIBLE__REQUESTS = 0;
    public static final int INACCESSIBLE_FEATURE_COUNT = 1;
    public static final int FILE_AREA_UPDATE_REPORT2 = 27;
    public static final int FILE_AREA_UPDATE_REPORT2__ADDS = 0;
    public static final int FILE_AREA_UPDATE_REPORT2__MOVES = 1;
    public static final int FILE_AREA_UPDATE_REPORT2__DELETES = 2;
    public static final int FILE_AREA_UPDATE_REPORT2__MODIFIES = 3;
    public static final int FILE_AREA_UPDATE_REPORT2_FEATURE_COUNT = 4;
    public static final int LOCAL_CHANGE_UNDO_REPORT = 28;
    public static final int LOCAL_CHANGE_UNDO_REPORT__UPDATES = 0;
    public static final int LOCAL_CHANGE_UNDO_REPORT__CONFIGURATION_STATE = 1;
    public static final int LOCAL_CHANGE_UNDO_REPORT__INACCESSIBLE = 2;
    public static final int LOCAL_CHANGE_UNDO_REPORT_FEATURE_COUNT = 3;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL = 29;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL__PARENT_ID = 0;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL__ID = 1;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL__RESOLVED = 2;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL__FLAGS = 3;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL__BEFORE_TARGET = 4;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL__AFTER_TARGET = 5;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL__BEFORE_DIRECTORY = 6;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL__AFTER_DIRECTORY = 7;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_FEATURE_COUNT = 8;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_FACADE = 30;
    public static final int SYMBOLIC_LINK_CHANGE_DETAIL_FACADE_FEATURE_COUNT = 0;
    public static final int CONTENT_CHANGE_DETAIL = 31;
    public static final int CONTENT_CHANGE_DETAIL__PARENT_ID = 0;
    public static final int CONTENT_CHANGE_DETAIL__ID = 1;
    public static final int CONTENT_CHANGE_DETAIL__RESOLVED = 2;
    public static final int CONTENT_CHANGE_DETAIL__FLAGS = 3;
    public static final int CONTENT_CHANGE_DETAIL__BEFORE_HASH_STRING = 4;
    public static final int CONTENT_CHANGE_DETAIL__AFTER_HASH_STRING = 5;
    public static final int CONTENT_CHANGE_DETAIL_FEATURE_COUNT = 6;
    public static final int CONTENT_CHANGE_DETAIL_FACADE = 32;
    public static final int CONTENT_CHANGE_DETAIL_FACADE_FEATURE_COUNT = 0;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL = 33;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL__PARENT_ID = 0;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL__ID = 1;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL__RESOLVED = 2;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL__FLAGS = 3;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL__EXECUTABLE = 4;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL_FEATURE_COUNT = 5;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL_FACADE = 34;
    public static final int EXECUTABLE_BIT_CHANGE_DETAIL_FACADE_FEATURE_COUNT = 0;
    public static final int CONTENT_TYPE_CHANGE_DETAIL = 35;
    public static final int CONTENT_TYPE_CHANGE_DETAIL__PARENT_ID = 0;
    public static final int CONTENT_TYPE_CHANGE_DETAIL__ID = 1;
    public static final int CONTENT_TYPE_CHANGE_DETAIL__RESOLVED = 2;
    public static final int CONTENT_TYPE_CHANGE_DETAIL__FLAGS = 3;
    public static final int CONTENT_TYPE_CHANGE_DETAIL__BEFORE_CONTENT_TYPE = 4;
    public static final int CONTENT_TYPE_CHANGE_DETAIL__AFTER_CONTENT_TYPE = 5;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_FEATURE_COUNT = 6;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_FACADE = 36;
    public static final int CONTENT_TYPE_CHANGE_DETAIL_FACADE_FEATURE_COUNT = 0;
    public static final int LINE_DELIMITER_CHANGE_DETAIL = 37;
    public static final int LINE_DELIMITER_CHANGE_DETAIL__PARENT_ID = 0;
    public static final int LINE_DELIMITER_CHANGE_DETAIL__ID = 1;
    public static final int LINE_DELIMITER_CHANGE_DETAIL__RESOLVED = 2;
    public static final int LINE_DELIMITER_CHANGE_DETAIL__FLAGS = 3;
    public static final int LINE_DELIMITER_CHANGE_DETAIL__BEFORE_LINE_DELIMITER_VALUE = 4;
    public static final int LINE_DELIMITER_CHANGE_DETAIL__AFTER_LINE_DELIMITER_VALUE = 5;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_FEATURE_COUNT = 6;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_FACADE = 38;
    public static final int LINE_DELIMITER_CHANGE_DETAIL_FACADE_FEATURE_COUNT = 0;
    public static final int ENCODING_CHANGE_DETAIL = 39;
    public static final int ENCODING_CHANGE_DETAIL__PARENT_ID = 0;
    public static final int ENCODING_CHANGE_DETAIL__ID = 1;
    public static final int ENCODING_CHANGE_DETAIL__RESOLVED = 2;
    public static final int ENCODING_CHANGE_DETAIL__FLAGS = 3;
    public static final int ENCODING_CHANGE_DETAIL__BEFORE_CHARACTER_ENCODING = 4;
    public static final int ENCODING_CHANGE_DETAIL__AFTER_CHARACTER_ENCODING = 5;
    public static final int ENCODING_CHANGE_DETAIL_FEATURE_COUNT = 6;
    public static final int ENCODING_CHANGE_DETAIL_FACADE = 40;
    public static final int ENCODING_CHANGE_DETAIL_FACADE_FEATURE_COUNT = 0;
    
    EClass getResolution();
    
    EReference getResolution_UpdateReport();
    
    EReference getResolution_ChangeSet();
    
    EClass getLogicalConflictReport();
    
    EReference getLogicalConflictReport_Conflicts();
    
    EReference getLogicalConflictReport_PendingChanges();
    
    EReference getLogicalConflictReport_DeferredChanges();
    
    EReference getLogicalConflictReport_ConflictReport();
    
    EClass getLogicalConflictReportFacade();
    
    EClass getLogicalConflict();
    
    EReference getLogicalConflict_Conflicts();
    
    EAttribute getLogicalConflict_ConflictType();
    
    EAttribute getLogicalConflict_SelectedChangeDetails();
    
    EClass getLogicalConflictFacade();
    
    EClass getLogicalChange();
    
    EAttribute getLogicalChange_Id();
    
    EAttribute getLogicalChange_DependentChanges();
    
    EAttribute getLogicalChange_RelatedChanges();
    
    EAttribute getLogicalChange_Kind();
    
    EClass getLogicalChangeFacade();
    
    EClass getFileAreaUpdate();
    
    EReference getFileAreaUpdate_OptionalContent();
    
    EClass getFileAreaUpdateFacade();
    
    EAttribute getFileAreaUpdate_Executable();
    
    EReference getFileAreaUpdate_Properties();
    
    EClass getConflictResolutionReport();
    
    EReference getConflictResolutionReport_Resolutions();
    
    EClass getConflictResolution();
    
    EReference getConflictResolution_Parent();
    
    EReference getConflictResolution_Item();
    
    EAttribute getConflictResolution_Name();
    
    EAttribute getConflictResolution_ConflictType();
    
    EClass getBasicChange();
    
    EReference getBasicChange_Component();
    
    EAttribute getBasicChange_ChangeType();
    
    EAttribute getBasicChange_Name();
    
    EAttribute getBasicChange_OldName();
    
    EReference getBasicChange_Item();
    
    EReference getBasicChange_SourceParent();
    
    EReference getBasicChange_DestinationParent();
    
    EAttribute getBasicChange_Before();
    
    EAttribute getBasicChange_After();
    
    EReference getBasicChange_PreviousComponent();
    
    EAttribute getBasicChange_ChangeDetails();
    
    EClass getBasicChangeFacade();
    
    EClass getChangeSynopsis();
    
    EReference getChangeSynopsis_SourceParentPath();
    
    EReference getChangeSynopsis_DestinationParentPath();
    
    EClass getChangeSynopsisFacade();
    
    EClass getChangeSetSynopsis();
    
    EReference getChangeSetSynopsis_Changes();
    
    EReference getChangeSetSynopsis_UnderlyingChangeSet();
    
    EReference getChangeSetSynopsis_Component();
    
    EClass getChangeSetSynopsisFacade();
    
    EClass getLoadTree();
    
    EReference getLoadTree_FileAreaUpdates();
    
    EReference getLoadTree_ConfigurationState();
    
    EReference getLoadTree_Inaccessible();
    
    EClass getFileAreaUpdateReport();
    
    EReference getFileAreaUpdateReport_Adds();
    
    EReference getFileAreaUpdateReport_Moves();
    
    EReference getFileAreaUpdateReport_Deletes();
    
    EReference getFileAreaUpdateReport_Modifies();
    
    EReference getFileAreaUpdateReport_ShareParents();
    
    EAttribute getFileAreaUpdateReport_CopyFileAreasWithOverlaps();
    
    EReference getFileAreaUpdateReport_Overlaps();
    
    EClass getOverlapRequest();
    
    EReference getOverlapRequest_Workspace();
    
    EReference getOverlapRequest_Component();
    
    EReference getOverlapRequest_Baseline();
    
    EReference getOverlapRequest_Group();
    
    EClass getOverlapDescription();
    
    EReference getOverlapDescription_Element();
    
    EReference getOverlapDescription_OverlappedChildren();
    
    EClass getCompareResult();
    
    EReference getCompareResult_SyncReport();
    
    EReference getCompareResult_LogicalConflictReport();
    
    EReference getCompareResult_ItemNWayConflictReports();
    
    EClass getCompareResultFacade();
    
    EClass getSharePoint();
    
    EReference getSharePoint_Workspace();
    
    EReference getSharePoint_Baseline();
    
    EReference getSharePoint_Component();
    
    EReference getSharePoint_Versionable();
    
    EAttribute getSharePoint_CopyFileArea();
    
    EAttribute getSharePoint_RelativePath();
    
    EClass getConflictResolution2();
    
    EReference getConflictResolution2_Component();
    
    EReference getConflictResolution2_Item();
    
    EReference getConflictResolution2_Parent();
    
    EAttribute getConflictResolution2_Name();
    
    EClass getInaccessible();
    
    EReference getInaccessible_Requests();
    
    EClass getFileAreaUpdateReport2();
    
    EReference getFileAreaUpdateReport2_Adds();
    
    EReference getFileAreaUpdateReport2_Moves();
    
    EReference getFileAreaUpdateReport2_Deletes();
    
    EReference getFileAreaUpdateReport2_Modifies();
    
    EClass getLocalChangeUndoReport();
    
    EReference getLocalChangeUndoReport_Updates();
    
    EReference getLocalChangeUndoReport_ConfigurationState();
    
    EReference getLocalChangeUndoReport_Inaccessible();
    
    EClass getSymbolicLinkChangeDetail();
    
    EAttribute getSymbolicLinkChangeDetail_BeforeTarget();
    
    EAttribute getSymbolicLinkChangeDetail_AfterTarget();
    
    EAttribute getSymbolicLinkChangeDetail_BeforeDirectory();
    
    EAttribute getSymbolicLinkChangeDetail_AfterDirectory();
    
    EClass getSymbolicLinkChangeDetailFacade();
    
    EClass getContentChangeDetail();
    
    EAttribute getContentChangeDetail_BeforeHashString();
    
    EAttribute getContentChangeDetail_AfterHashString();
    
    EClass getContentChangeDetailFacade();
    
    EClass getExecutableBitChangeDetail();
    
    EAttribute getExecutableBitChangeDetail_Executable();
    
    EClass getExecutableBitChangeDetailFacade();
    
    EClass getContentTypeChangeDetail();
    
    EAttribute getContentTypeChangeDetail_BeforeContentType();
    
    EAttribute getContentTypeChangeDetail_AfterContentType();
    
    EClass getContentTypeChangeDetailFacade();
    
    EClass getLineDelimiterChangeDetail();
    
    EAttribute getLineDelimiterChangeDetail_BeforeLineDelimiterValue();
    
    EAttribute getLineDelimiterChangeDetail_AfterLineDelimiterValue();
    
    EClass getLineDelimiterChangeDetailFacade();
    
    EClass getEncodingChangeDetail();
    
    EAttribute getEncodingChangeDetail_BeforeCharacterEncoding();
    
    EAttribute getEncodingChangeDetail_AfterCharacterEncoding();
    
    EClass getEncodingChangeDetailFacade();
    
    EClass getOverlapResponse();
    
    EReference getOverlapResponse_Workspace();
    
    EReference getOverlapResponse_Component();
    
    EReference getOverlapResponse_Baseline();
    
    EReference getOverlapResponse_OverlapDescriptions();
    
    EReference getOverlapResponse_AncestorReports();
    
    FilesystemDTOFactory getFilesystemDTOFactory();
    
    public interface Literals
    {
        public static final EClass RESOLUTION = FilesystemDTOPackage.eINSTANCE.getResolution();
        public static final EReference RESOLUTION__UPDATE_REPORT = FilesystemDTOPackage.eINSTANCE.getResolution_UpdateReport();
        public static final EReference RESOLUTION__CHANGE_SET = FilesystemDTOPackage.eINSTANCE.getResolution_ChangeSet();
        public static final EClass LOGICAL_CONFLICT_REPORT = FilesystemDTOPackage.eINSTANCE.getLogicalConflictReport();
        public static final EReference LOGICAL_CONFLICT_REPORT__CONFLICTS = FilesystemDTOPackage.eINSTANCE.getLogicalConflictReport_Conflicts();
        public static final EReference LOGICAL_CONFLICT_REPORT__PENDING_CHANGES = FilesystemDTOPackage.eINSTANCE.getLogicalConflictReport_PendingChanges();
        public static final EReference LOGICAL_CONFLICT_REPORT__DEFERRED_CHANGES = FilesystemDTOPackage.eINSTANCE.getLogicalConflictReport_DeferredChanges();
        public static final EReference LOGICAL_CONFLICT_REPORT__CONFLICT_REPORT = FilesystemDTOPackage.eINSTANCE.getLogicalConflictReport_ConflictReport();
        public static final EClass LOGICAL_CONFLICT_REPORT_FACADE = FilesystemDTOPackage.eINSTANCE.getLogicalConflictReportFacade();
        public static final EClass LOGICAL_CONFLICT = FilesystemDTOPackage.eINSTANCE.getLogicalConflict();
        public static final EReference LOGICAL_CONFLICT__CONFLICTS = FilesystemDTOPackage.eINSTANCE.getLogicalConflict_Conflicts();
        public static final EAttribute LOGICAL_CONFLICT__CONFLICT_TYPE = FilesystemDTOPackage.eINSTANCE.getLogicalConflict_ConflictType();
        public static final EAttribute LOGICAL_CONFLICT__SELECTED_CHANGE_DETAILS = FilesystemDTOPackage.eINSTANCE.getLogicalConflict_SelectedChangeDetails();
        public static final EClass LOGICAL_CONFLICT_FACADE = FilesystemDTOPackage.eINSTANCE.getLogicalConflictFacade();
        public static final EClass LOGICAL_CHANGE = FilesystemDTOPackage.eINSTANCE.getLogicalChange();
        public static final EAttribute LOGICAL_CHANGE__ID = FilesystemDTOPackage.eINSTANCE.getLogicalChange_Id();
        public static final EAttribute LOGICAL_CHANGE__DEPENDENT_CHANGES = FilesystemDTOPackage.eINSTANCE.getLogicalChange_DependentChanges();
        public static final EAttribute LOGICAL_CHANGE__RELATED_CHANGES = FilesystemDTOPackage.eINSTANCE.getLogicalChange_RelatedChanges();
        public static final EAttribute LOGICAL_CHANGE__KIND = FilesystemDTOPackage.eINSTANCE.getLogicalChange_Kind();
        public static final EClass LOGICAL_CHANGE_FACADE = FilesystemDTOPackage.eINSTANCE.getLogicalChangeFacade();
        public static final EClass FILE_AREA_UPDATE = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdate();
        public static final EReference FILE_AREA_UPDATE__OPTIONAL_CONTENT = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdate_OptionalContent();
        public static final EClass FILE_AREA_UPDATE_FACADE = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateFacade();
        public static final EAttribute FILE_AREA_UPDATE__EXECUTABLE = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdate_Executable();
        public static final EReference FILE_AREA_UPDATE__PROPERTIES = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdate_Properties();
        public static final EClass CONFLICT_RESOLUTION_REPORT = FilesystemDTOPackage.eINSTANCE.getConflictResolutionReport();
        public static final EReference CONFLICT_RESOLUTION_REPORT__RESOLUTIONS = FilesystemDTOPackage.eINSTANCE.getConflictResolutionReport_Resolutions();
        public static final EClass CONFLICT_RESOLUTION = FilesystemDTOPackage.eINSTANCE.getConflictResolution();
        public static final EReference CONFLICT_RESOLUTION__PARENT = FilesystemDTOPackage.eINSTANCE.getConflictResolution_Parent();
        public static final EReference CONFLICT_RESOLUTION__ITEM = FilesystemDTOPackage.eINSTANCE.getConflictResolution_Item();
        public static final EAttribute CONFLICT_RESOLUTION__NAME = FilesystemDTOPackage.eINSTANCE.getConflictResolution_Name();
        public static final EAttribute CONFLICT_RESOLUTION__CONFLICT_TYPE = FilesystemDTOPackage.eINSTANCE.getConflictResolution_ConflictType();
        public static final EClass BASIC_CHANGE = FilesystemDTOPackage.eINSTANCE.getBasicChange();
        public static final EReference BASIC_CHANGE__COMPONENT = FilesystemDTOPackage.eINSTANCE.getBasicChange_Component();
        public static final EAttribute BASIC_CHANGE__CHANGE_TYPE = FilesystemDTOPackage.eINSTANCE.getBasicChange_ChangeType();
        public static final EAttribute BASIC_CHANGE__NAME = FilesystemDTOPackage.eINSTANCE.getBasicChange_Name();
        public static final EAttribute BASIC_CHANGE__OLD_NAME = FilesystemDTOPackage.eINSTANCE.getBasicChange_OldName();
        public static final EReference BASIC_CHANGE__ITEM = FilesystemDTOPackage.eINSTANCE.getBasicChange_Item();
        public static final EReference BASIC_CHANGE__SOURCE_PARENT = FilesystemDTOPackage.eINSTANCE.getBasicChange_SourceParent();
        public static final EReference BASIC_CHANGE__DESTINATION_PARENT = FilesystemDTOPackage.eINSTANCE.getBasicChange_DestinationParent();
        public static final EAttribute BASIC_CHANGE__BEFORE = FilesystemDTOPackage.eINSTANCE.getBasicChange_Before();
        public static final EAttribute BASIC_CHANGE__AFTER = FilesystemDTOPackage.eINSTANCE.getBasicChange_After();
        public static final EReference BASIC_CHANGE__PREVIOUS_COMPONENT = FilesystemDTOPackage.eINSTANCE.getBasicChange_PreviousComponent();
        public static final EAttribute BASIC_CHANGE__CHANGE_DETAILS = FilesystemDTOPackage.eINSTANCE.getBasicChange_ChangeDetails();
        public static final EClass BASIC_CHANGE_FACADE = FilesystemDTOPackage.eINSTANCE.getBasicChangeFacade();
        public static final EClass CHANGE_SYNOPSIS = FilesystemDTOPackage.eINSTANCE.getChangeSynopsis();
        public static final EReference CHANGE_SYNOPSIS__SOURCE_PARENT_PATH = FilesystemDTOPackage.eINSTANCE.getChangeSynopsis_SourceParentPath();
        public static final EReference CHANGE_SYNOPSIS__DESTINATION_PARENT_PATH = FilesystemDTOPackage.eINSTANCE.getChangeSynopsis_DestinationParentPath();
        public static final EClass CHANGE_SYNOPSIS_FACADE = FilesystemDTOPackage.eINSTANCE.getChangeSynopsisFacade();
        public static final EClass CHANGE_SET_SYNOPSIS = FilesystemDTOPackage.eINSTANCE.getChangeSetSynopsis();
        public static final EReference CHANGE_SET_SYNOPSIS__CHANGES = FilesystemDTOPackage.eINSTANCE.getChangeSetSynopsis_Changes();
        public static final EReference CHANGE_SET_SYNOPSIS__UNDERLYING_CHANGE_SET = FilesystemDTOPackage.eINSTANCE.getChangeSetSynopsis_UnderlyingChangeSet();
        public static final EReference CHANGE_SET_SYNOPSIS__COMPONENT = FilesystemDTOPackage.eINSTANCE.getChangeSetSynopsis_Component();
        public static final EClass CHANGE_SET_SYNOPSIS_FACADE = FilesystemDTOPackage.eINSTANCE.getChangeSetSynopsisFacade();
        public static final EClass LOAD_TREE = FilesystemDTOPackage.eINSTANCE.getLoadTree();
        public static final EReference LOAD_TREE__FILE_AREA_UPDATES = FilesystemDTOPackage.eINSTANCE.getLoadTree_FileAreaUpdates();
        public static final EReference LOAD_TREE__CONFIGURATION_STATE = FilesystemDTOPackage.eINSTANCE.getLoadTree_ConfigurationState();
        public static final EReference LOAD_TREE__INACCESSIBLE = FilesystemDTOPackage.eINSTANCE.getLoadTree_Inaccessible();
        public static final EClass FILE_AREA_UPDATE_REPORT = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport();
        public static final EReference FILE_AREA_UPDATE_REPORT__ADDS = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport_Adds();
        public static final EReference FILE_AREA_UPDATE_REPORT__MOVES = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport_Moves();
        public static final EReference FILE_AREA_UPDATE_REPORT__DELETES = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport_Deletes();
        public static final EReference FILE_AREA_UPDATE_REPORT__MODIFIES = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport_Modifies();
        public static final EReference FILE_AREA_UPDATE_REPORT__SHARE_PARENTS = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport_ShareParents();
        public static final EAttribute FILE_AREA_UPDATE_REPORT__COPY_FILE_AREAS_WITH_OVERLAPS = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport_CopyFileAreasWithOverlaps();
        public static final EReference FILE_AREA_UPDATE_REPORT__OVERLAPS = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport_Overlaps();
        public static final EClass OVERLAP_REQUEST = FilesystemDTOPackage.eINSTANCE.getOverlapRequest();
        public static final EReference OVERLAP_REQUEST__WORKSPACE = FilesystemDTOPackage.eINSTANCE.getOverlapRequest_Workspace();
        public static final EReference OVERLAP_REQUEST__COMPONENT = FilesystemDTOPackage.eINSTANCE.getOverlapRequest_Component();
        public static final EReference OVERLAP_REQUEST__BASELINE = FilesystemDTOPackage.eINSTANCE.getOverlapRequest_Baseline();
        public static final EReference OVERLAP_REQUEST__GROUP = FilesystemDTOPackage.eINSTANCE.getOverlapRequest_Group();
        public static final EClass OVERLAP_DESCRIPTION = FilesystemDTOPackage.eINSTANCE.getOverlapDescription();
        public static final EReference OVERLAP_DESCRIPTION__ELEMENT = FilesystemDTOPackage.eINSTANCE.getOverlapDescription_Element();
        public static final EReference OVERLAP_DESCRIPTION__OVERLAPPED_CHILDREN = FilesystemDTOPackage.eINSTANCE.getOverlapDescription_OverlappedChildren();
        public static final EClass COMPARE_RESULT = FilesystemDTOPackage.eINSTANCE.getCompareResult();
        public static final EReference COMPARE_RESULT__SYNC_REPORT = FilesystemDTOPackage.eINSTANCE.getCompareResult_SyncReport();
        public static final EReference COMPARE_RESULT__LOGICAL_CONFLICT_REPORT = FilesystemDTOPackage.eINSTANCE.getCompareResult_LogicalConflictReport();
        public static final EReference COMPARE_RESULT__ITEM_NWAY_CONFLICT_REPORTS = FilesystemDTOPackage.eINSTANCE.getCompareResult_ItemNWayConflictReports();
        public static final EClass COMPARE_RESULT_FACADE = FilesystemDTOPackage.eINSTANCE.getCompareResultFacade();
        public static final EClass SHARE_POINT = FilesystemDTOPackage.eINSTANCE.getSharePoint();
        public static final EReference SHARE_POINT__WORKSPACE = FilesystemDTOPackage.eINSTANCE.getSharePoint_Workspace();
        public static final EReference SHARE_POINT__BASELINE = FilesystemDTOPackage.eINSTANCE.getSharePoint_Baseline();
        public static final EReference SHARE_POINT__COMPONENT = FilesystemDTOPackage.eINSTANCE.getSharePoint_Component();
        public static final EReference SHARE_POINT__VERSIONABLE = FilesystemDTOPackage.eINSTANCE.getSharePoint_Versionable();
        public static final EAttribute SHARE_POINT__COPY_FILE_AREA = FilesystemDTOPackage.eINSTANCE.getSharePoint_CopyFileArea();
        public static final EAttribute SHARE_POINT__RELATIVE_PATH = FilesystemDTOPackage.eINSTANCE.getSharePoint_RelativePath();
        public static final EClass CONFLICT_RESOLUTION2 = FilesystemDTOPackage.eINSTANCE.getConflictResolution2();
        public static final EReference CONFLICT_RESOLUTION2__COMPONENT = FilesystemDTOPackage.eINSTANCE.getConflictResolution2_Component();
        public static final EReference CONFLICT_RESOLUTION2__ITEM = FilesystemDTOPackage.eINSTANCE.getConflictResolution2_Item();
        public static final EReference CONFLICT_RESOLUTION2__PARENT = FilesystemDTOPackage.eINSTANCE.getConflictResolution2_Parent();
        public static final EAttribute CONFLICT_RESOLUTION2__NAME = FilesystemDTOPackage.eINSTANCE.getConflictResolution2_Name();
        public static final EClass INACCESSIBLE = FilesystemDTOPackage.eINSTANCE.getInaccessible();
        public static final EReference INACCESSIBLE__REQUESTS = FilesystemDTOPackage.eINSTANCE.getInaccessible_Requests();
        public static final EClass FILE_AREA_UPDATE_REPORT2 = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport2();
        public static final EReference FILE_AREA_UPDATE_REPORT2__ADDS = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport2_Adds();
        public static final EReference FILE_AREA_UPDATE_REPORT2__MOVES = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport2_Moves();
        public static final EReference FILE_AREA_UPDATE_REPORT2__DELETES = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport2_Deletes();
        public static final EReference FILE_AREA_UPDATE_REPORT2__MODIFIES = FilesystemDTOPackage.eINSTANCE.getFileAreaUpdateReport2_Modifies();
        public static final EClass LOCAL_CHANGE_UNDO_REPORT = FilesystemDTOPackage.eINSTANCE.getLocalChangeUndoReport();
        public static final EReference LOCAL_CHANGE_UNDO_REPORT__UPDATES = FilesystemDTOPackage.eINSTANCE.getLocalChangeUndoReport_Updates();
        public static final EReference LOCAL_CHANGE_UNDO_REPORT__CONFIGURATION_STATE = FilesystemDTOPackage.eINSTANCE.getLocalChangeUndoReport_ConfigurationState();
        public static final EReference LOCAL_CHANGE_UNDO_REPORT__INACCESSIBLE = FilesystemDTOPackage.eINSTANCE.getLocalChangeUndoReport_Inaccessible();
        public static final EClass SYMBOLIC_LINK_CHANGE_DETAIL = FilesystemDTOPackage.eINSTANCE.getSymbolicLinkChangeDetail();
        public static final EAttribute SYMBOLIC_LINK_CHANGE_DETAIL__BEFORE_TARGET = FilesystemDTOPackage.eINSTANCE.getSymbolicLinkChangeDetail_BeforeTarget();
        public static final EAttribute SYMBOLIC_LINK_CHANGE_DETAIL__AFTER_TARGET = FilesystemDTOPackage.eINSTANCE.getSymbolicLinkChangeDetail_AfterTarget();
        public static final EAttribute SYMBOLIC_LINK_CHANGE_DETAIL__BEFORE_DIRECTORY = FilesystemDTOPackage.eINSTANCE.getSymbolicLinkChangeDetail_BeforeDirectory();
        public static final EAttribute SYMBOLIC_LINK_CHANGE_DETAIL__AFTER_DIRECTORY = FilesystemDTOPackage.eINSTANCE.getSymbolicLinkChangeDetail_AfterDirectory();
        public static final EClass SYMBOLIC_LINK_CHANGE_DETAIL_FACADE = FilesystemDTOPackage.eINSTANCE.getSymbolicLinkChangeDetailFacade();
        public static final EClass CONTENT_CHANGE_DETAIL = FilesystemDTOPackage.eINSTANCE.getContentChangeDetail();
        public static final EAttribute CONTENT_CHANGE_DETAIL__BEFORE_HASH_STRING = FilesystemDTOPackage.eINSTANCE.getContentChangeDetail_BeforeHashString();
        public static final EAttribute CONTENT_CHANGE_DETAIL__AFTER_HASH_STRING = FilesystemDTOPackage.eINSTANCE.getContentChangeDetail_AfterHashString();
        public static final EClass CONTENT_CHANGE_DETAIL_FACADE = FilesystemDTOPackage.eINSTANCE.getContentChangeDetailFacade();
        public static final EClass EXECUTABLE_BIT_CHANGE_DETAIL = FilesystemDTOPackage.eINSTANCE.getExecutableBitChangeDetail();
        public static final EAttribute EXECUTABLE_BIT_CHANGE_DETAIL__EXECUTABLE = FilesystemDTOPackage.eINSTANCE.getExecutableBitChangeDetail_Executable();
        public static final EClass EXECUTABLE_BIT_CHANGE_DETAIL_FACADE = FilesystemDTOPackage.eINSTANCE.getExecutableBitChangeDetailFacade();
        public static final EClass CONTENT_TYPE_CHANGE_DETAIL = FilesystemDTOPackage.eINSTANCE.getContentTypeChangeDetail();
        public static final EAttribute CONTENT_TYPE_CHANGE_DETAIL__BEFORE_CONTENT_TYPE = FilesystemDTOPackage.eINSTANCE.getContentTypeChangeDetail_BeforeContentType();
        public static final EAttribute CONTENT_TYPE_CHANGE_DETAIL__AFTER_CONTENT_TYPE = FilesystemDTOPackage.eINSTANCE.getContentTypeChangeDetail_AfterContentType();
        public static final EClass CONTENT_TYPE_CHANGE_DETAIL_FACADE = FilesystemDTOPackage.eINSTANCE.getContentTypeChangeDetailFacade();
        public static final EClass LINE_DELIMITER_CHANGE_DETAIL = FilesystemDTOPackage.eINSTANCE.getLineDelimiterChangeDetail();
        public static final EAttribute LINE_DELIMITER_CHANGE_DETAIL__BEFORE_LINE_DELIMITER_VALUE = FilesystemDTOPackage.eINSTANCE.getLineDelimiterChangeDetail_BeforeLineDelimiterValue();
        public static final EAttribute LINE_DELIMITER_CHANGE_DETAIL__AFTER_LINE_DELIMITER_VALUE = FilesystemDTOPackage.eINSTANCE.getLineDelimiterChangeDetail_AfterLineDelimiterValue();
        public static final EClass LINE_DELIMITER_CHANGE_DETAIL_FACADE = FilesystemDTOPackage.eINSTANCE.getLineDelimiterChangeDetailFacade();
        public static final EClass ENCODING_CHANGE_DETAIL = FilesystemDTOPackage.eINSTANCE.getEncodingChangeDetail();
        public static final EAttribute ENCODING_CHANGE_DETAIL__BEFORE_CHARACTER_ENCODING = FilesystemDTOPackage.eINSTANCE.getEncodingChangeDetail_BeforeCharacterEncoding();
        public static final EAttribute ENCODING_CHANGE_DETAIL__AFTER_CHARACTER_ENCODING = FilesystemDTOPackage.eINSTANCE.getEncodingChangeDetail_AfterCharacterEncoding();
        public static final EClass ENCODING_CHANGE_DETAIL_FACADE = FilesystemDTOPackage.eINSTANCE.getEncodingChangeDetailFacade();
        public static final EClass OVERLAP_RESPONSE = FilesystemDTOPackage.eINSTANCE.getOverlapResponse();
        public static final EReference OVERLAP_RESPONSE__WORKSPACE = FilesystemDTOPackage.eINSTANCE.getOverlapResponse_Workspace();
        public static final EReference OVERLAP_RESPONSE__COMPONENT = FilesystemDTOPackage.eINSTANCE.getOverlapResponse_Component();
        public static final EReference OVERLAP_RESPONSE__BASELINE = FilesystemDTOPackage.eINSTANCE.getOverlapResponse_Baseline();
        public static final EReference OVERLAP_RESPONSE__OVERLAP_DESCRIPTIONS = FilesystemDTOPackage.eINSTANCE.getOverlapResponse_OverlapDescriptions();
        public static final EReference OVERLAP_RESPONSE__ANCESTOR_REPORTS = FilesystemDTOPackage.eINSTANCE.getOverlapResponse_AncestorReports();
    }
}
