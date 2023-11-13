// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.impl.FilesystemRestClientDTOresourcePackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOresourcePackage extends EPackage
{
    public static final String eNAME = "resource";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.resource";
    public static final String eNS_PREFIX = "filesystemRestClientDTOresource";
    public static final FilesystemRestClientDTOresourcePackage eINSTANCE = FilesystemRestClientDTOresourcePackageImpl.init();
    public static final int RESOURCES_DTO = 0;
    public static final int RESOURCES_DTO__RESOURCE_PROPERTIES = 0;
    public static final int RESOURCES_DTO_FEATURE_COUNT = 1;
    public static final int RESOURCE_PROPERTY_CHANGE_RESULT_DTO = 1;
    public static final int RESOURCE_PROPERTY_CHANGE_RESULT_DTO__CANCELLED = 0;
    public static final int RESOURCE_PROPERTY_CHANGE_RESULT_DTO__LINE_DELIMITER_FAILURES = 1;
    public static final int RESOURCE_PROPERTY_CHANGE_RESULT_DTO__BACKED_UP_TO_SHED = 2;
    public static final int RESOURCE_PROPERTY_CHANGE_RESULT_DTO__PROPERTY_FAILURES = 3;
    public static final int RESOURCE_PROPERTY_CHANGE_RESULT_DTO__MIME_TYPE_FAILURES = 4;
    public static final int RESOURCE_PROPERTY_CHANGE_RESULT_DTO__EXECUTABLE_FAILURES = 5;
    public static final int RESOURCE_PROPERTY_CHANGE_RESULT_DTO_FEATURE_COUNT = 6;
    public static final int RESOURCE_PROPERTIES_DTO = 2;
    public static final int RESOURCE_PROPERTIES_DTO__FULL_PATH = 0;
    public static final int RESOURCE_PROPERTIES_DTO__PATH = 1;
    public static final int RESOURCE_PROPERTIES_DTO__REMOTE_PATH = 2;
    public static final int RESOURCE_PROPERTIES_DTO__SHARED = 3;
    public static final int RESOURCE_PROPERTIES_DTO__SHARE = 4;
    public static final int RESOURCE_PROPERTIES_DTO__VERSIONABLE_ITEM_TYPE = 5;
    public static final int RESOURCE_PROPERTIES_DTO__ITEM_ID = 6;
    public static final int RESOURCE_PROPERTIES_DTO__STATE_ID = 7;
    public static final int RESOURCE_PROPERTIES_DTO__IGNORED = 8;
    public static final int RESOURCE_PROPERTIES_DTO__LOCAL = 9;
    public static final int RESOURCE_PROPERTIES_DTO__REMOTE = 10;
    public static final int RESOURCE_PROPERTIES_DTO__DIRTY = 11;
    public static final int RESOURCE_PROPERTIES_DTO__FILE_PROPERTIES = 12;
    public static final int RESOURCE_PROPERTIES_DTO__IGNORE_REASON = 13;
    public static final int RESOURCE_PROPERTIES_DTO__USER_PROPERTIES = 14;
    public static final int RESOURCE_PROPERTIES_DTO__SYMLINK_PROPERTIES = 15;
    public static final int RESOURCE_PROPERTIES_DTO__PERMISSIONS_CONTEXT = 16;
    public static final int RESOURCE_PROPERTIES_DTO_FEATURE_COUNT = 17;
    public static final int FILE_PROPERTIES_DTO = 3;
    public static final int FILE_PROPERTIES_DTO__CONTENT_TYPE = 0;
    public static final int FILE_PROPERTIES_DTO__LINE_DELIMITER = 1;
    public static final int FILE_PROPERTIES_DTO__EXECUTABLE = 2;
    public static final int FILE_PROPERTIES_DTO__ENCODING = 3;
    public static final int FILE_PROPERTIES_DTO__ORIGINAL_CONTENT_TYPE = 4;
    public static final int FILE_PROPERTIES_DTO__ORIGINAL_LINE_DELIMITER = 5;
    public static final int FILE_PROPERTIES_DTO__ORIGINAL_EXECUTABLE = 6;
    public static final int FILE_PROPERTIES_DTO__ORIGINAL_ENCODING = 7;
    public static final int FILE_PROPERTIES_DTO_FEATURE_COUNT = 8;
    public static final int IGNORE_REASON_DTO = 4;
    public static final int IGNORE_REASON_DTO__RULES = 0;
    public static final int IGNORE_REASON_DTO__INHERITS_FROM = 1;
    public static final int IGNORE_REASON_DTO_FEATURE_COUNT = 2;
    public static final int FILE_ERROR_DTO = 19;
    public static final int FILE_ERROR_DTO__FILE_NAME = 0;
    public static final int FILE_ERROR_DTO__SHARE = 1;
    public static final int FILE_ERROR_DTO_FEATURE_COUNT = 2;
    public static final int LINE_DELIMITER_ERROR_DTO = 5;
    public static final int LINE_DELIMITER_ERROR_DTO__FILE_NAME = 0;
    public static final int LINE_DELIMITER_ERROR_DTO__SHARE = 1;
    public static final int LINE_DELIMITER_ERROR_DTO__LINE_DELIMITER = 2;
    public static final int LINE_DELIMITER_ERROR_DTO_FEATURE_COUNT = 3;
    public static final int SANDBOX_PATHS_RESULT_DTO = 6;
    public static final int SANDBOX_PATHS_RESULT_DTO__PATHS = 0;
    public static final int SANDBOX_PATHS_RESULT_DTO_FEATURE_COUNT = 1;
    public static final int CHECKIN_POLICY_DTO = 7;
    public static final int CHECKIN_POLICY_DTO__AUTO_CHECKIN = 0;
    public static final int CHECKIN_POLICY_DTO__AUTO_CHECKIN_DEFAULT = 1;
    public static final int CHECKIN_POLICY_DTO_FEATURE_COUNT = 2;
    public static final int CONTENT_TRANSFER_DTO = 8;
    public static final int CONTENT_TRANSFER_DTO__MAX_THREADS = 0;
    public static final int CONTENT_TRANSFER_DTO__MAX_THREADS_DEFAULT = 1;
    public static final int CONTENT_TRANSFER_DTO__MAX_THREADS_LIMIT = 2;
    public static final int CONTENT_TRANSFER_DTO_FEATURE_COUNT = 3;
    public static final int CHANGE_SUMMARY_DTO = 9;
    public static final int CHANGE_SUMMARY_DTO__BEFORE_STATE_ID = 0;
    public static final int CHANGE_SUMMARY_DTO__AFTER_STATE_ID = 1;
    public static final int CHANGE_SUMMARY_DTO__LAST_MERGE_STATE = 2;
    public static final int CHANGE_SUMMARY_DTO__PATH_HINT = 3;
    public static final int CHANGE_SUMMARY_DTO__NEW_PATH_HINT = 4;
    public static final int CHANGE_SUMMARY_DTO_FEATURE_COUNT = 5;
    public static final int MAGIC_DTO = 10;
    public static final int MAGIC_DTO__PATTERN = 0;
    public static final int MAGIC_DTO__ENCODING = 1;
    public static final int MAGIC_DTO__MIME_TYPE = 2;
    public static final int MAGIC_DTO__LINE_DELIMITER = 3;
    public static final int MAGIC_DTO__BUILT_IN = 4;
    public static final int MAGIC_DTO__IGNORE_CASE = 5;
    public static final int MAGIC_DTO_FEATURE_COUNT = 6;
    public static final int FIND_SHAREABLES_DTO = 11;
    public static final int FIND_SHAREABLES_DTO__RESULTS = 0;
    public static final int FIND_SHAREABLES_DTO_FEATURE_COUNT = 1;
    public static final int FIND_SHAREABLE_DTO = 12;
    public static final int FIND_SHAREABLE_DTO__SHAREABLES = 0;
    public static final int FIND_SHAREABLE_DTO_FEATURE_COUNT = 1;
    public static final int ENCODING_ERROR_DTO = 13;
    public static final int ENCODING_ERROR_DTO__SHAREABLE = 0;
    public static final int ENCODING_ERROR_DTO__MALFORMED_CONTENT = 1;
    public static final int ENCODING_ERROR_DTO__UNKNOWN_ENCODING = 2;
    public static final int ENCODING_ERROR_DTO__ENCODING = 3;
    public static final int ENCODING_ERROR_DTO__PREDECESSOR_ENCODING = 4;
    public static final int ENCODING_ERROR_DTO__ATOMIC_COMMIT = 5;
    public static final int ENCODING_ERROR_DTO__DIRECTION_PROVIDED = 6;
    public static final int ENCODING_ERROR_DTO_FEATURE_COUNT = 7;
    public static final int PROPERTY_FAILURE_DTO = 14;
    public static final int PROPERTY_FAILURE_DTO__FILE_NAME = 0;
    public static final int PROPERTY_FAILURE_DTO__SHARE = 1;
    public static final int PROPERTY_FAILURE_DTO__INVALID_PROPERTIES = 2;
    public static final int PROPERTY_FAILURE_DTO_FEATURE_COUNT = 3;
    public static final int INVALID_PROPERTY_DTO = 15;
    public static final int INVALID_PROPERTY_DTO__PROPERTY_NAME = 0;
    public static final int INVALID_PROPERTY_DTO__REASON = 1;
    public static final int INVALID_PROPERTY_DTO_FEATURE_COUNT = 2;
    public static final int SYMLINK_PROPERTIES_DTO = 16;
    public static final int SYMLINK_PROPERTIES_DTO__TYPE = 0;
    public static final int SYMLINK_PROPERTIES_DTO_FEATURE_COUNT = 1;
    public static final int SYMLINK_WARNING_DTO = 17;
    public static final int SYMLINK_WARNING_DTO__TARGET = 0;
    public static final int SYMLINK_WARNING_DTO__TYPE = 1;
    public static final int SYMLINK_WARNING_DTO__LOCATION = 2;
    public static final int SYMLINK_WARNING_DTO__SANDBOX_LOCATION = 3;
    public static final int SYMLINK_WARNING_DTO_FEATURE_COUNT = 4;
    public static final int MIME_TYPE_ERROR_DTO = 18;
    public static final int MIME_TYPE_ERROR_DTO__FILE_NAME = 0;
    public static final int MIME_TYPE_ERROR_DTO__SHARE = 1;
    public static final int MIME_TYPE_ERROR_DTO__MIME_TYPE = 2;
    public static final int MIME_TYPE_ERROR_DTO_FEATURE_COUNT = 3;
    public static final int PERMISSIONS_CONTEXT_DTO = 20;
    public static final int PERMISSIONS_CONTEXT_DTO__ACCESSIBLE = 0;
    public static final int PERMISSIONS_CONTEXT_DTO__READ_CONTEXT = 1;
    public static final int PERMISSIONS_CONTEXT_DTO_FEATURE_COUNT = 2;
    public static final int CUSTOM_ATTRIBUTES_DTO = 21;
    public static final int CUSTOM_ATTRIBUTES_DTO__FULL_PATH = 0;
    public static final int CUSTOM_ATTRIBUTES_DTO__ITEM_ID = 1;
    public static final int CUSTOM_ATTRIBUTES_DTO__CUSTOM_ATTRIBUTES = 2;
    public static final int CUSTOM_ATTRIBUTES_DTO_FEATURE_COUNT = 3;
    
    EClass getResourcesDTO();
    
    EReference getResourcesDTO_ResourceProperties();
    
    EClass getResourcePropertyChangeResultDTO();
    
    EAttribute getResourcePropertyChangeResultDTO_Cancelled();
    
    EReference getResourcePropertyChangeResultDTO_LineDelimiterFailures();
    
    EReference getResourcePropertyChangeResultDTO_BackedUpToShed();
    
    EReference getResourcePropertyChangeResultDTO_PropertyFailures();
    
    EReference getResourcePropertyChangeResultDTO_MimeTypeFailures();
    
    EReference getResourcePropertyChangeResultDTO_ExecutableFailures();
    
    EClass getResourcePropertiesDTO();
    
    EAttribute getResourcePropertiesDTO_FullPath();
    
    EReference getResourcePropertiesDTO_Path();
    
    EReference getResourcePropertiesDTO_RemotePath();
    
    EAttribute getResourcePropertiesDTO_Shared();
    
    EReference getResourcePropertiesDTO_Share();
    
    EAttribute getResourcePropertiesDTO_VersionableItemType();
    
    EAttribute getResourcePropertiesDTO_ItemId();
    
    EAttribute getResourcePropertiesDTO_StateId();
    
    EAttribute getResourcePropertiesDTO_Ignored();
    
    EAttribute getResourcePropertiesDTO_Local();
    
    EAttribute getResourcePropertiesDTO_Remote();
    
    EAttribute getResourcePropertiesDTO_Dirty();
    
    EReference getResourcePropertiesDTO_FileProperties();
    
    EReference getResourcePropertiesDTO_IgnoreReason();
    
    EReference getResourcePropertiesDTO_UserProperties();
    
    EReference getResourcePropertiesDTO_SymlinkProperties();
    
    EReference getResourcePropertiesDTO_PermissionsContext();
    
    EClass getFilePropertiesDTO();
    
    EAttribute getFilePropertiesDTO_OriginalLineDelimiter();
    
    EAttribute getFilePropertiesDTO_OriginalContentType();
    
    EAttribute getFilePropertiesDTO_LineDelimiter();
    
    EAttribute getFilePropertiesDTO_ContentType();
    
    EAttribute getFilePropertiesDTO_Executable();
    
    EAttribute getFilePropertiesDTO_Encoding();
    
    EAttribute getFilePropertiesDTO_OriginalExecutable();
    
    EAttribute getFilePropertiesDTO_OriginalEncoding();
    
    EClass getIgnoreReasonDTO();
    
    EReference getIgnoreReasonDTO_Rules();
    
    EReference getIgnoreReasonDTO_InheritsFrom();
    
    EClass getLineDelimiterErrorDTO();
    
    EAttribute getLineDelimiterErrorDTO_LineDelimiter();
    
    EClass getSandboxPathsResultDTO();
    
    EReference getSandboxPathsResultDTO_Paths();
    
    EClass getCheckinPolicyDTO();
    
    EAttribute getCheckinPolicyDTO_AutoCheckin();
    
    EAttribute getCheckinPolicyDTO_AutoCheckinDefault();
    
    EClass getContentTransferDTO();
    
    EAttribute getContentTransferDTO_MaxThreads();
    
    EAttribute getContentTransferDTO_MaxThreadsDefault();
    
    EAttribute getContentTransferDTO_MaxThreadsLimit();
    
    EClass getChangeSummaryDTO();
    
    EAttribute getChangeSummaryDTO_BeforeStateId();
    
    EAttribute getChangeSummaryDTO_AfterStateId();
    
    EAttribute getChangeSummaryDTO_LastMergeState();
    
    EAttribute getChangeSummaryDTO_PathHint();
    
    EAttribute getChangeSummaryDTO_NewPathHint();
    
    EClass getMagicDTO();
    
    EAttribute getMagicDTO_Pattern();
    
    EAttribute getMagicDTO_Encoding();
    
    EAttribute getMagicDTO_MimeType();
    
    EAttribute getMagicDTO_LineDelimiter();
    
    EAttribute getMagicDTO_BuiltIn();
    
    EAttribute getMagicDTO_IgnoreCase();
    
    EClass getFindShareablesDTO();
    
    EReference getFindShareablesDTO_Results();
    
    EClass getFindShareableDTO();
    
    EReference getFindShareableDTO_Shareables();
    
    EClass getEncodingErrorDTO();
    
    EReference getEncodingErrorDTO_Shareable();
    
    EAttribute getEncodingErrorDTO_MalformedContent();
    
    EAttribute getEncodingErrorDTO_UnknownEncoding();
    
    EAttribute getEncodingErrorDTO_Encoding();
    
    EAttribute getEncodingErrorDTO_PredecessorEncoding();
    
    EAttribute getEncodingErrorDTO_AtomicCommit();
    
    EAttribute getEncodingErrorDTO_DirectionProvided();
    
    EClass getPropertyFailureDTO();
    
    EReference getPropertyFailureDTO_FileName();
    
    EReference getPropertyFailureDTO_Share();
    
    EReference getPropertyFailureDTO_InvalidProperties();
    
    EClass getInvalidPropertyDTO();
    
    EAttribute getInvalidPropertyDTO_PropertyName();
    
    EAttribute getInvalidPropertyDTO_Reason();
    
    EClass getSymlinkPropertiesDTO();
    
    EAttribute getSymlinkPropertiesDTO_Type();
    
    EClass getSymlinkWarningDTO();
    
    EAttribute getSymlinkWarningDTO_Location();
    
    EAttribute getSymlinkWarningDTO_Target();
    
    EAttribute getSymlinkWarningDTO_Type();
    
    EAttribute getSymlinkWarningDTO_SandboxLocation();
    
    EClass getMimeTypeErrorDTO();
    
    EAttribute getMimeTypeErrorDTO_MimeType();
    
    EClass getFileErrorDTO();
    
    EReference getFileErrorDTO_FileName();
    
    EReference getFileErrorDTO_Share();
    
    EClass getPermissionsContextDTO();
    
    EAttribute getPermissionsContextDTO_Accessible();
    
    EReference getPermissionsContextDTO_ReadContext();
    
    EClass getCustomAttributesDTO();
    
    EAttribute getCustomAttributesDTO_FullPath();
    
    EAttribute getCustomAttributesDTO_ItemId();
    
    EReference getCustomAttributesDTO_CustomAttributes();
    
    FilesystemRestClientDTOresourceFactory getFilesystemRestClientDTOresourceFactory();
    
    public interface Literals
    {
        public static final EClass RESOURCES_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcesDTO();
        public static final EReference RESOURCES_DTO__RESOURCE_PROPERTIES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcesDTO_ResourceProperties();
        public static final EClass RESOURCE_PROPERTY_CHANGE_RESULT_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertyChangeResultDTO();
        public static final EAttribute RESOURCE_PROPERTY_CHANGE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertyChangeResultDTO_Cancelled();
        public static final EReference RESOURCE_PROPERTY_CHANGE_RESULT_DTO__LINE_DELIMITER_FAILURES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertyChangeResultDTO_LineDelimiterFailures();
        public static final EReference RESOURCE_PROPERTY_CHANGE_RESULT_DTO__BACKED_UP_TO_SHED = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertyChangeResultDTO_BackedUpToShed();
        public static final EReference RESOURCE_PROPERTY_CHANGE_RESULT_DTO__PROPERTY_FAILURES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertyChangeResultDTO_PropertyFailures();
        public static final EReference RESOURCE_PROPERTY_CHANGE_RESULT_DTO__MIME_TYPE_FAILURES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertyChangeResultDTO_MimeTypeFailures();
        public static final EReference RESOURCE_PROPERTY_CHANGE_RESULT_DTO__EXECUTABLE_FAILURES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertyChangeResultDTO_ExecutableFailures();
        public static final EClass RESOURCE_PROPERTIES_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__FULL_PATH = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_FullPath();
        public static final EReference RESOURCE_PROPERTIES_DTO__PATH = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_Path();
        public static final EReference RESOURCE_PROPERTIES_DTO__REMOTE_PATH = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_RemotePath();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__SHARED = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_Shared();
        public static final EReference RESOURCE_PROPERTIES_DTO__SHARE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_Share();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__VERSIONABLE_ITEM_TYPE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_VersionableItemType();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__ITEM_ID = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_ItemId();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__STATE_ID = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_StateId();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__IGNORED = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_Ignored();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__LOCAL = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_Local();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__REMOTE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_Remote();
        public static final EAttribute RESOURCE_PROPERTIES_DTO__DIRTY = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_Dirty();
        public static final EReference RESOURCE_PROPERTIES_DTO__FILE_PROPERTIES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_FileProperties();
        public static final EReference RESOURCE_PROPERTIES_DTO__IGNORE_REASON = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_IgnoreReason();
        public static final EReference RESOURCE_PROPERTIES_DTO__USER_PROPERTIES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_UserProperties();
        public static final EReference RESOURCE_PROPERTIES_DTO__SYMLINK_PROPERTIES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_SymlinkProperties();
        public static final EReference RESOURCE_PROPERTIES_DTO__PERMISSIONS_CONTEXT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getResourcePropertiesDTO_PermissionsContext();
        public static final EClass FILE_PROPERTIES_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO();
        public static final EAttribute FILE_PROPERTIES_DTO__ORIGINAL_LINE_DELIMITER = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO_OriginalLineDelimiter();
        public static final EAttribute FILE_PROPERTIES_DTO__ORIGINAL_CONTENT_TYPE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO_OriginalContentType();
        public static final EAttribute FILE_PROPERTIES_DTO__LINE_DELIMITER = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO_LineDelimiter();
        public static final EAttribute FILE_PROPERTIES_DTO__CONTENT_TYPE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO_ContentType();
        public static final EAttribute FILE_PROPERTIES_DTO__EXECUTABLE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO_Executable();
        public static final EAttribute FILE_PROPERTIES_DTO__ENCODING = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO_Encoding();
        public static final EAttribute FILE_PROPERTIES_DTO__ORIGINAL_EXECUTABLE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO_OriginalExecutable();
        public static final EAttribute FILE_PROPERTIES_DTO__ORIGINAL_ENCODING = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFilePropertiesDTO_OriginalEncoding();
        public static final EClass IGNORE_REASON_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getIgnoreReasonDTO();
        public static final EReference IGNORE_REASON_DTO__RULES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getIgnoreReasonDTO_Rules();
        public static final EReference IGNORE_REASON_DTO__INHERITS_FROM = FilesystemRestClientDTOresourcePackage.eINSTANCE.getIgnoreReasonDTO_InheritsFrom();
        public static final EClass LINE_DELIMITER_ERROR_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getLineDelimiterErrorDTO();
        public static final EAttribute LINE_DELIMITER_ERROR_DTO__LINE_DELIMITER = FilesystemRestClientDTOresourcePackage.eINSTANCE.getLineDelimiterErrorDTO_LineDelimiter();
        public static final EClass SANDBOX_PATHS_RESULT_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSandboxPathsResultDTO();
        public static final EReference SANDBOX_PATHS_RESULT_DTO__PATHS = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSandboxPathsResultDTO_Paths();
        public static final EClass CHECKIN_POLICY_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getCheckinPolicyDTO();
        public static final EAttribute CHECKIN_POLICY_DTO__AUTO_CHECKIN = FilesystemRestClientDTOresourcePackage.eINSTANCE.getCheckinPolicyDTO_AutoCheckin();
        public static final EAttribute CHECKIN_POLICY_DTO__AUTO_CHECKIN_DEFAULT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getCheckinPolicyDTO_AutoCheckinDefault();
        public static final EClass CONTENT_TRANSFER_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getContentTransferDTO();
        public static final EAttribute CONTENT_TRANSFER_DTO__MAX_THREADS = FilesystemRestClientDTOresourcePackage.eINSTANCE.getContentTransferDTO_MaxThreads();
        public static final EAttribute CONTENT_TRANSFER_DTO__MAX_THREADS_DEFAULT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getContentTransferDTO_MaxThreadsDefault();
        public static final EAttribute CONTENT_TRANSFER_DTO__MAX_THREADS_LIMIT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getContentTransferDTO_MaxThreadsLimit();
        public static final EClass CHANGE_SUMMARY_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getChangeSummaryDTO();
        public static final EAttribute CHANGE_SUMMARY_DTO__BEFORE_STATE_ID = FilesystemRestClientDTOresourcePackage.eINSTANCE.getChangeSummaryDTO_BeforeStateId();
        public static final EAttribute CHANGE_SUMMARY_DTO__AFTER_STATE_ID = FilesystemRestClientDTOresourcePackage.eINSTANCE.getChangeSummaryDTO_AfterStateId();
        public static final EAttribute CHANGE_SUMMARY_DTO__LAST_MERGE_STATE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getChangeSummaryDTO_LastMergeState();
        public static final EAttribute CHANGE_SUMMARY_DTO__PATH_HINT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getChangeSummaryDTO_PathHint();
        public static final EAttribute CHANGE_SUMMARY_DTO__NEW_PATH_HINT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getChangeSummaryDTO_NewPathHint();
        public static final EClass MAGIC_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMagicDTO();
        public static final EAttribute MAGIC_DTO__PATTERN = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMagicDTO_Pattern();
        public static final EAttribute MAGIC_DTO__ENCODING = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMagicDTO_Encoding();
        public static final EAttribute MAGIC_DTO__MIME_TYPE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMagicDTO_MimeType();
        public static final EAttribute MAGIC_DTO__LINE_DELIMITER = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMagicDTO_LineDelimiter();
        public static final EAttribute MAGIC_DTO__BUILT_IN = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMagicDTO_BuiltIn();
        public static final EAttribute MAGIC_DTO__IGNORE_CASE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMagicDTO_IgnoreCase();
        public static final EClass FIND_SHAREABLES_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFindShareablesDTO();
        public static final EReference FIND_SHAREABLES_DTO__RESULTS = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFindShareablesDTO_Results();
        public static final EClass FIND_SHAREABLE_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFindShareableDTO();
        public static final EReference FIND_SHAREABLE_DTO__SHAREABLES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFindShareableDTO_Shareables();
        public static final EClass ENCODING_ERROR_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getEncodingErrorDTO();
        public static final EReference ENCODING_ERROR_DTO__SHAREABLE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getEncodingErrorDTO_Shareable();
        public static final EAttribute ENCODING_ERROR_DTO__MALFORMED_CONTENT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getEncodingErrorDTO_MalformedContent();
        public static final EAttribute ENCODING_ERROR_DTO__UNKNOWN_ENCODING = FilesystemRestClientDTOresourcePackage.eINSTANCE.getEncodingErrorDTO_UnknownEncoding();
        public static final EAttribute ENCODING_ERROR_DTO__ENCODING = FilesystemRestClientDTOresourcePackage.eINSTANCE.getEncodingErrorDTO_Encoding();
        public static final EAttribute ENCODING_ERROR_DTO__PREDECESSOR_ENCODING = FilesystemRestClientDTOresourcePackage.eINSTANCE.getEncodingErrorDTO_PredecessorEncoding();
        public static final EAttribute ENCODING_ERROR_DTO__ATOMIC_COMMIT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getEncodingErrorDTO_AtomicCommit();
        public static final EAttribute ENCODING_ERROR_DTO__DIRECTION_PROVIDED = FilesystemRestClientDTOresourcePackage.eINSTANCE.getEncodingErrorDTO_DirectionProvided();
        public static final EClass PROPERTY_FAILURE_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getPropertyFailureDTO();
        public static final EReference PROPERTY_FAILURE_DTO__FILE_NAME = FilesystemRestClientDTOresourcePackage.eINSTANCE.getPropertyFailureDTO_FileName();
        public static final EReference PROPERTY_FAILURE_DTO__SHARE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getPropertyFailureDTO_Share();
        public static final EReference PROPERTY_FAILURE_DTO__INVALID_PROPERTIES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getPropertyFailureDTO_InvalidProperties();
        public static final EClass INVALID_PROPERTY_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getInvalidPropertyDTO();
        public static final EAttribute INVALID_PROPERTY_DTO__PROPERTY_NAME = FilesystemRestClientDTOresourcePackage.eINSTANCE.getInvalidPropertyDTO_PropertyName();
        public static final EAttribute INVALID_PROPERTY_DTO__REASON = FilesystemRestClientDTOresourcePackage.eINSTANCE.getInvalidPropertyDTO_Reason();
        public static final EClass SYMLINK_PROPERTIES_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSymlinkPropertiesDTO();
        public static final EAttribute SYMLINK_PROPERTIES_DTO__TYPE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSymlinkPropertiesDTO_Type();
        public static final EClass SYMLINK_WARNING_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSymlinkWarningDTO();
        public static final EAttribute SYMLINK_WARNING_DTO__LOCATION = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSymlinkWarningDTO_Location();
        public static final EAttribute SYMLINK_WARNING_DTO__TARGET = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSymlinkWarningDTO_Target();
        public static final EAttribute SYMLINK_WARNING_DTO__TYPE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSymlinkWarningDTO_Type();
        public static final EAttribute SYMLINK_WARNING_DTO__SANDBOX_LOCATION = FilesystemRestClientDTOresourcePackage.eINSTANCE.getSymlinkWarningDTO_SandboxLocation();
        public static final EClass MIME_TYPE_ERROR_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMimeTypeErrorDTO();
        public static final EAttribute MIME_TYPE_ERROR_DTO__MIME_TYPE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getMimeTypeErrorDTO_MimeType();
        public static final EClass FILE_ERROR_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFileErrorDTO();
        public static final EReference FILE_ERROR_DTO__FILE_NAME = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFileErrorDTO_FileName();
        public static final EReference FILE_ERROR_DTO__SHARE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getFileErrorDTO_Share();
        public static final EClass PERMISSIONS_CONTEXT_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getPermissionsContextDTO();
        public static final EAttribute PERMISSIONS_CONTEXT_DTO__ACCESSIBLE = FilesystemRestClientDTOresourcePackage.eINSTANCE.getPermissionsContextDTO_Accessible();
        public static final EReference PERMISSIONS_CONTEXT_DTO__READ_CONTEXT = FilesystemRestClientDTOresourcePackage.eINSTANCE.getPermissionsContextDTO_ReadContext();
        public static final EClass CUSTOM_ATTRIBUTES_DTO = FilesystemRestClientDTOresourcePackage.eINSTANCE.getCustomAttributesDTO();
        public static final EAttribute CUSTOM_ATTRIBUTES_DTO__FULL_PATH = FilesystemRestClientDTOresourcePackage.eINSTANCE.getCustomAttributesDTO_FullPath();
        public static final EAttribute CUSTOM_ATTRIBUTES_DTO__ITEM_ID = FilesystemRestClientDTOresourcePackage.eINSTANCE.getCustomAttributesDTO_ItemId();
        public static final EReference CUSTOM_ATTRIBUTES_DTO__CUSTOM_ATTRIBUTES = FilesystemRestClientDTOresourcePackage.eINSTANCE.getCustomAttributesDTO_CustomAttributes();
    }
}
