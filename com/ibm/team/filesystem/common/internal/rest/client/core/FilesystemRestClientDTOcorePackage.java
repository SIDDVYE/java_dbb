// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcorePackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOcorePackage extends EPackage
{
    public static final String eNAME = "core";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.core";
    public static final String eNS_PREFIX = "filesystemRestClientDTOcore";
    public static final FilesystemRestClientDTOcorePackage eINSTANCE = FilesystemRestClientDTOcorePackageImpl.init();
    public static final int SHARE_DTO = 0;
    public static final int SHARE_DTO__COMPONENT_ITEM_ID = 0;
    public static final int SHARE_DTO__COMPONENT_NAME = 1;
    public static final int SHARE_DTO__CONTEXT_ITEM_ID = 2;
    public static final int SHARE_DTO__CONTEXT_NAME = 3;
    public static final int SHARE_DTO__IS_WORKSPACE_CONTEXT = 4;
    public static final int SHARE_DTO__PATH = 5;
    public static final int SHARE_DTO__REPOSITORY_ID = 6;
    public static final int SHARE_DTO__ROOT_VERSIONABLE_ITEM_ID = 7;
    public static final int SHARE_DTO__ROOT_VERSIONABLE_ITEM_TYPE = 8;
    public static final int SHARE_DTO__SANDBOX_PATH = 9;
    public static final int SHARE_DTO__IS_LOADED_WITH_ANOTHER_NAME = 10;
    public static final int SHARE_DTO_FEATURE_COUNT = 11;
    public static final int PATH_DTO = 1;
    public static final int PATH_DTO__SEGMENTS = 0;
    public static final int PATH_DTO_FEATURE_COUNT = 1;
    public static final int TEAM_REPOSITORY_DTO = 2;
    public static final int TEAM_REPOSITORY_DTO__CONNECTION_TIMEOUT = 0;
    public static final int TEAM_REPOSITORY_DTO__ERROR_STATE_AUTH = 1;
    public static final int TEAM_REPOSITORY_DTO__ERROR_STATE_IO = 2;
    public static final int TEAM_REPOSITORY_DTO__ERROR_STATE_NONE = 3;
    public static final int TEAM_REPOSITORY_DTO__LAST_ERROR = 4;
    public static final int TEAM_REPOSITORY_DTO__NAME = 5;
    public static final int TEAM_REPOSITORY_DTO__REPOSITORY_ID = 6;
    public static final int TEAM_REPOSITORY_DTO__REPOSITORY_ITEM_ID_ID = 7;
    public static final int TEAM_REPOSITORY_DTO__REPOSITORY_URI = 8;
    public static final int TEAM_REPOSITORY_DTO__STATE_LOGGED_IN = 9;
    public static final int TEAM_REPOSITORY_DTO__STATE_LOGGING_IN = 10;
    public static final int TEAM_REPOSITORY_DTO__STATE_LOGGED_OUT = 11;
    public static final int TEAM_REPOSITORY_DTO__STATE_LOGGING_OUT = 12;
    public static final int TEAM_REPOSITORY_DTO__USER_ID = 13;
    public static final int TEAM_REPOSITORY_DTO__CONTRIBUTOR_ITEM_ID_LOGGED_IN_CONTRIBUTOR = 14;
    public static final int TEAM_REPOSITORY_DTO_FEATURE_COUNT = 15;
    public static final int TEAM_REPOSITORIES_DTO = 3;
    public static final int TEAM_REPOSITORIES_DTO__REPOSITORIES = 0;
    public static final int TEAM_REPOSITORIES_DTO_FEATURE_COUNT = 1;
    public static final int CONNECTION_DESCRIPTOR_DTO = 4;
    public static final int CONNECTION_DESCRIPTOR_DTO__CONTEXT_ITEM_ID = 0;
    public static final int CONNECTION_DESCRIPTOR_DTO__IS_WORKSPACE_CONTEXT = 1;
    public static final int CONNECTION_DESCRIPTOR_DTO__REPOSITORY_ID = 2;
    public static final int CONNECTION_DESCRIPTOR_DTO__REPOSITORY_URL = 3;
    public static final int CONNECTION_DESCRIPTOR_DTO_FEATURE_COUNT = 4;
    public static final int CONFIGURATION_DESCRIPTOR_DTO = 5;
    public static final int CONFIGURATION_DESCRIPTOR_DTO__COMPONENT_ITEM_ID = 0;
    public static final int CONFIGURATION_DESCRIPTOR_DTO__CONNECTION = 1;
    public static final int CONFIGURATION_DESCRIPTOR_DTO_FEATURE_COUNT = 2;
    public static final int BASELINE_SET_DTO = 6;
    public static final int BASELINE_SET_DTO__BASELINE_ITEM_IDS = 0;
    public static final int BASELINE_SET_DTO__COMMENT = 1;
    public static final int BASELINE_SET_DTO__CREATOR_CONTRIBUTOR_ITEM_ID = 2;
    public static final int BASELINE_SET_DTO__CREATION_DATE = 3;
    public static final int BASELINE_SET_DTO__ITEM_ID = 4;
    public static final int BASELINE_SET_DTO__MODIFIED_DATE = 5;
    public static final int BASELINE_SET_DTO__MODIFIER_CONTRIBUTOR_ITEM_ID = 6;
    public static final int BASELINE_SET_DTO__NAME = 7;
    public static final int BASELINE_SET_DTO__OWNER_WORKSPACE_ITEM_ID = 8;
    public static final int BASELINE_SET_DTO__REPOSITORY_ID = 9;
    public static final int BASELINE_SET_DTO__REPOSITORY_URL = 10;
    public static final int BASELINE_SET_DTO_FEATURE_COUNT = 11;
    public static final int BASELINE_DTO = 7;
    public static final int BASELINE_DTO__COMMENT = 0;
    public static final int BASELINE_DTO__COMPONENT_ITEM_ID = 1;
    public static final int BASELINE_DTO__CREATION_DATE = 2;
    public static final int BASELINE_DTO__CREATOR_CONTRIBUTOR_ITEM_ID = 3;
    public static final int BASELINE_DTO__CREATOR_CONTRIBUTOR_NAME = 4;
    public static final int BASELINE_DTO__ID = 5;
    public static final int BASELINE_DTO__ITEM_ID = 6;
    public static final int BASELINE_DTO__MODIFIED_DATE = 7;
    public static final int BASELINE_DTO__MODIFIER_CONTRIBUTOR_ITEM_ID = 8;
    public static final int BASELINE_DTO__MODIFIER_CONTRIBUTOR_NAME = 9;
    public static final int BASELINE_DTO__NAME = 10;
    public static final int BASELINE_DTO__REPOSITORY_ID = 11;
    public static final int BASELINE_DTO__REPOSITORY_URL = 12;
    public static final int BASELINE_DTO__HIERARCHY = 13;
    public static final int BASELINE_DTO__COMPONENT_NAME = 14;
    public static final int BASELINE_DTO_FEATURE_COUNT = 15;
    public static final int WORKSPACE_DETAILS_DTO = 8;
    public static final int WORKSPACE_DETAILS_DTO__COMPONENTS = 0;
    public static final int WORKSPACE_DETAILS_DTO__COMPONENT_HIERARCHIES = 1;
    public static final int WORKSPACE_DETAILS_DTO__DESCRIPTION = 2;
    public static final int WORKSPACE_DETAILS_DTO__FLOW_ENTRIES = 3;
    public static final int WORKSPACE_DETAILS_DTO__ITEM_ID = 4;
    public static final int WORKSPACE_DETAILS_DTO__NAME = 5;
    public static final int WORKSPACE_DETAILS_DTO__OWNER = 6;
    public static final int WORKSPACE_DETAILS_DTO__READ_SCOPE = 7;
    public static final int WORKSPACE_DETAILS_DTO__REPOSITORY_ID = 8;
    public static final int WORKSPACE_DETAILS_DTO__REPOSITORY_URL = 9;
    public static final int WORKSPACE_DETAILS_DTO__STREAM = 10;
    public static final int WORKSPACE_DETAILS_DTO__EXCLUSIVE_FILE_LOCK_PATTERNS = 11;
    public static final int WORKSPACE_DETAILS_DTO_FEATURE_COUNT = 12;
    public static final int WORKSPACE_COMPONENT_DTO = 9;
    public static final int WORKSPACE_FLOW_ENTRY_DTO = 11;
    public static final int SHAREABLE_DTO = 12;
    public static final int SANDBOX_DTO = 13;
    public static final int CONTRIBUTOR_DTO = 14;
    public static final int READ_SCOPE_DTO = 15;
    public static final int CONFIGURATION_WITH_UNCHECKED_IN_CHANGES_DTO = 16;
    public static final int CHANGE_SET_DTO = 17;
    public static final int COMPONENT_DTO = 18;
    public static final int COMPONENT_DTO__ITEM_ID = 0;
    public static final int COMPONENT_DTO__NAME = 1;
    public static final int COMPONENT_DTO_FEATURE_COUNT = 2;
    public static final int WORKSPACE_COMPONENT_DTO__ITEM_ID = 0;
    public static final int WORKSPACE_COMPONENT_DTO__NAME = 1;
    public static final int WORKSPACE_COMPONENT_DTO__ACTIVE_CHANGE_SET_IDS = 2;
    public static final int WORKSPACE_COMPONENT_DTO__BASELINE = 3;
    public static final int WORKSPACE_COMPONENT_DTO__READ_SCOPE = 4;
    public static final int WORKSPACE_COMPONENT_DTO__ROOT_FOLDER = 5;
    public static final int WORKSPACE_COMPONENT_DTO__OWNER = 6;
    public static final int WORKSPACE_COMPONENT_DTO__CURRENT_CHANGE_SET_ID = 7;
    public static final int WORKSPACE_COMPONENT_DTO_FEATURE_COUNT = 8;
    public static final int HIERARCHY_DTO = 26;
    public static final int HIERARCHY_DTO__INTERNAL_ID = 0;
    public static final int HIERARCHY_DTO__NAME = 1;
    public static final int HIERARCHY_DTO__ANCESTOR_PATH = 2;
    public static final int HIERARCHY_DTO__ROOT = 3;
    public static final int HIERARCHY_DTO__BRANCH_CONTAINS_CYCLES = 4;
    public static final int HIERARCHY_DTO__IN_CYCLE = 5;
    public static final int HIERARCHY_DTO__COMPONENT_ITEM_ID = 6;
    public static final int HIERARCHY_DTO__ACCESSIBLE = 7;
    public static final int HIERARCHY_DTO_FEATURE_COUNT = 8;
    public static final int COMPONENT_HIERARCHY_DTO = 10;
    public static final int COMPONENT_HIERARCHY_DTO__INTERNAL_ID = 0;
    public static final int COMPONENT_HIERARCHY_DTO__NAME = 1;
    public static final int COMPONENT_HIERARCHY_DTO__ANCESTOR_PATH = 2;
    public static final int COMPONENT_HIERARCHY_DTO__ROOT = 3;
    public static final int COMPONENT_HIERARCHY_DTO__BRANCH_CONTAINS_CYCLES = 4;
    public static final int COMPONENT_HIERARCHY_DTO__IN_CYCLE = 5;
    public static final int COMPONENT_HIERARCHY_DTO__COMPONENT_ITEM_ID = 6;
    public static final int COMPONENT_HIERARCHY_DTO__ACCESSIBLE = 7;
    public static final int COMPONENT_HIERARCHY_DTO__WORKSPACE_ITEM_ID = 8;
    public static final int COMPONENT_HIERARCHY_DTO__SUBCOMPONENTS = 9;
    public static final int COMPONENT_HIERARCHY_DTO__IN_WORKSPACE = 10;
    public static final int COMPONENT_HIERARCHY_DTO_FEATURE_COUNT = 11;
    public static final int WORKSPACE_FLOW_ENTRY_DTO__CURRENT_FLOW = 0;
    public static final int WORKSPACE_FLOW_ENTRY_DTO__DEFAULT_FLOW = 1;
    public static final int WORKSPACE_FLOW_ENTRY_DTO__REPOSITORY_ID = 2;
    public static final int WORKSPACE_FLOW_ENTRY_DTO__REPOSITORY_URL = 3;
    public static final int WORKSPACE_FLOW_ENTRY_DTO__SCOPED_COMPONENT_ITEM_IDS = 4;
    public static final int WORKSPACE_FLOW_ENTRY_DTO__WORKSPACE_ITEM_ID = 5;
    public static final int WORKSPACE_FLOW_ENTRY_DTO_FEATURE_COUNT = 6;
    public static final int SHAREABLE_DTO__RELATIVE_PATH = 0;
    public static final int SHAREABLE_DTO__SANDBOX_PATH = 1;
    public static final int SHAREABLE_DTO_FEATURE_COUNT = 2;
    public static final int SANDBOX_DTO__ALL_SHARES = 0;
    public static final int SANDBOX_DTO__CASE_SENSITIVE = 1;
    public static final int SANDBOX_DTO__CORRUPTED = 2;
    public static final int SANDBOX_DTO__SANDBOX_LISTENING = 3;
    public static final int SANDBOX_DTO__SANDBOX_PATH = 4;
    public static final int SANDBOX_DTO_FEATURE_COUNT = 5;
    public static final int CONTRIBUTOR_DTO__CONTRIBUTOR_ITEM_ID = 0;
    public static final int CONTRIBUTOR_DTO__EMAIL_ADDRESS = 1;
    public static final int CONTRIBUTOR_DTO__FULL_NAME = 2;
    public static final int CONTRIBUTOR_DTO__USER_ID = 3;
    public static final int CONTRIBUTOR_DTO_FEATURE_COUNT = 4;
    public static final int READ_SCOPE_DTO__DEFERS_TO = 0;
    public static final int READ_SCOPE_DTO__READ_SCOPE = 1;
    public static final int READ_SCOPE_DTO_FEATURE_COUNT = 2;
    public static final int CONFIGURATION_WITH_UNCHECKED_IN_CHANGES_DTO__CHANGE_COUNT = 0;
    public static final int CONFIGURATION_WITH_UNCHECKED_IN_CHANGES_DTO__CONFIGURATION = 1;
    public static final int CONFIGURATION_WITH_UNCHECKED_IN_CHANGES_DTO_FEATURE_COUNT = 2;
    public static final int CHANGE_SET_DTO__AUTHOR = 0;
    public static final int CHANGE_SET_DTO__COMMENT = 1;
    public static final int CHANGE_SET_DTO__COMPONENT = 2;
    public static final int CHANGE_SET_DTO__ITEM_ID = 3;
    public static final int CHANGE_SET_DTO__LAST_CHANGE_DATE = 4;
    public static final int CHANGE_SET_DTO_FEATURE_COUNT = 5;
    public static final int STATUS_DTO = 19;
    public static final int STATUS_DTO__CHILDREN = 0;
    public static final int STATUS_DTO__CODE = 1;
    public static final int STATUS_DTO__EXCEPTION = 2;
    public static final int STATUS_DTO__MESSAGE = 3;
    public static final int STATUS_DTO__PLUGIN_ID = 4;
    public static final int STATUS_DTO__SEVERITY = 5;
    public static final int STATUS_DTO_FEATURE_COUNT = 6;
    public static final int EXCEPTION_DTO = 20;
    public static final int EXCEPTION_DTO__CAUSE = 0;
    public static final int EXCEPTION_DTO__MESSAGE = 1;
    public static final int EXCEPTION_DTO__STACK_TRACE = 2;
    public static final int EXCEPTION_DTO_FEATURE_COUNT = 3;
    public static final int STACK_TRACE_ELEMENT_DTO = 21;
    public static final int STACK_TRACE_ELEMENT_DTO__CLASS_NAME = 0;
    public static final int STACK_TRACE_ELEMENT_DTO__FILE_NAME = 1;
    public static final int STACK_TRACE_ELEMENT_DTO__LINE_NUMBER = 2;
    public static final int STACK_TRACE_ELEMENT_DTO__METHOD_NAME = 3;
    public static final int STACK_TRACE_ELEMENT_DTO_FEATURE_COUNT = 4;
    public static final int CONFIGURATION_WITH_UNCHECKED_IN_CHANGES2_DTO = 22;
    public static final int CONFIGURATION_WITH_UNCHECKED_IN_CHANGES2_DTO__CHANGE_COUNT = 0;
    public static final int CONFIGURATION_WITH_UNCHECKED_IN_CHANGES2_DTO__CONFIGURATION = 1;
    public static final int CONFIGURATION_WITH_UNCHECKED_IN_CHANGES2_DTO_FEATURE_COUNT = 2;
    public static final int CONFIGURATION_DESCRIPTOR2_DTO = 23;
    public static final int CONFIGURATION_DESCRIPTOR2_DTO__COMPONENT_ITEM_ID = 0;
    public static final int CONFIGURATION_DESCRIPTOR2_DTO__CONNECTION = 1;
    public static final int CONFIGURATION_DESCRIPTOR2_DTO_FEATURE_COUNT = 2;
    public static final int CONNECTION_DESCRIPTOR2_DTO = 24;
    public static final int CONNECTION_DESCRIPTOR2_DTO__CONTEXT_ITEM_ID = 0;
    public static final int CONNECTION_DESCRIPTOR2_DTO__IS_WORKSPACE_CONTEXT = 1;
    public static final int CONNECTION_DESCRIPTOR2_DTO__REPOSITORY_ID = 2;
    public static final int CONNECTION_DESCRIPTOR2_DTO_FEATURE_COUNT = 3;
    public static final int BASELINE_HIERARCHY_DTO = 25;
    public static final int BASELINE_HIERARCHY_DTO__INTERNAL_ID = 0;
    public static final int BASELINE_HIERARCHY_DTO__NAME = 1;
    public static final int BASELINE_HIERARCHY_DTO__ANCESTOR_PATH = 2;
    public static final int BASELINE_HIERARCHY_DTO__ROOT = 3;
    public static final int BASELINE_HIERARCHY_DTO__BRANCH_CONTAINS_CYCLES = 4;
    public static final int BASELINE_HIERARCHY_DTO__IN_CYCLE = 5;
    public static final int BASELINE_HIERARCHY_DTO__COMPONENT_ITEM_ID = 6;
    public static final int BASELINE_HIERARCHY_DTO__ACCESSIBLE = 7;
    public static final int BASELINE_HIERARCHY_DTO__SUBBASELINES = 8;
    public static final int BASELINE_HIERARCHY_DTO__COMMENT = 9;
    public static final int BASELINE_HIERARCHY_DTO__CREATION_DATE = 10;
    public static final int BASELINE_HIERARCHY_DTO__CREATOR_CONTRIBUTOR_ITEM_ID = 11;
    public static final int BASELINE_HIERARCHY_DTO__CREATOR_CONTRIBUTOR_NAME = 12;
    public static final int BASELINE_HIERARCHY_DTO__MODIFIED_DATE = 13;
    public static final int BASELINE_HIERARCHY_DTO__MODIFIER_CONTRIBUTOR_ITEM_ID = 14;
    public static final int BASELINE_HIERARCHY_DTO__MODIFIER_CONTRIBUTOR_NAME = 15;
    public static final int BASELINE_HIERARCHY_DTO__REPOSITORY_ID = 16;
    public static final int BASELINE_HIERARCHY_DTO__REPOSITORY_URL = 17;
    public static final int BASELINE_HIERARCHY_DTO__ITEM_ID = 18;
    public static final int BASELINE_HIERARCHY_DTO__ID = 19;
    public static final int BASELINE_HIERARCHY_DTO__COMPONENT_NAME = 20;
    public static final int BASELINE_HIERARCHY_DTO_FEATURE_COUNT = 21;
    
    EClass getShareDTO();
    
    EAttribute getShareDTO_ComponentItemId();
    
    EAttribute getShareDTO_ComponentName();
    
    EAttribute getShareDTO_RootVersionableItemId();
    
    EAttribute getShareDTO_RootVersionableItemType();
    
    EAttribute getShareDTO_SandboxPath();
    
    EAttribute getShareDTO_IsLoadedWithAnotherName();
    
    EReference getShareDTO_Path();
    
    EAttribute getShareDTO_RepositoryId();
    
    EAttribute getShareDTO_ContextItemId();
    
    EAttribute getShareDTO_IsWorkspaceContext();
    
    EAttribute getShareDTO_ContextName();
    
    EClass getPathDTO();
    
    EAttribute getPathDTO_Segments();
    
    EClass getTeamRepositoryDTO();
    
    EAttribute getTeamRepositoryDTO_RepositoryURI();
    
    EAttribute getTeamRepositoryDTO_StateLoggingIn();
    
    EAttribute getTeamRepositoryDTO_StateLoggedIn();
    
    EAttribute getTeamRepositoryDTO_StateLoggingOut();
    
    EAttribute getTeamRepositoryDTO_StateLoggedOut();
    
    EAttribute getTeamRepositoryDTO_ErrorStateNone();
    
    EAttribute getTeamRepositoryDTO_ErrorStateIO();
    
    EAttribute getTeamRepositoryDTO_ErrorStateAuth();
    
    EAttribute getTeamRepositoryDTO_LastError();
    
    EAttribute getTeamRepositoryDTO_Name();
    
    EAttribute getTeamRepositoryDTO_RepositoryId();
    
    EAttribute getTeamRepositoryDTO_RepositoryItemIdId();
    
    EAttribute getTeamRepositoryDTO_UserId();
    
    EAttribute getTeamRepositoryDTO_ConnectionTimeout();
    
    EAttribute getTeamRepositoryDTO_ContributorItemIdLoggedInContributor();
    
    EClass getTeamRepositoriesDTO();
    
    EReference getTeamRepositoriesDTO_Repositories();
    
    EClass getConnectionDescriptorDTO();
    
    EAttribute getConnectionDescriptorDTO_RepositoryURL();
    
    EAttribute getConnectionDescriptorDTO_ContextItemId();
    
    EAttribute getConnectionDescriptorDTO_IsWorkspaceContext();
    
    EAttribute getConnectionDescriptorDTO_RepositoryId();
    
    EClass getConfigurationDescriptorDTO();
    
    EReference getConfigurationDescriptorDTO_Connection();
    
    EAttribute getConfigurationDescriptorDTO_ComponentItemId();
    
    EClass getBaselineSetDTO();
    
    EAttribute getBaselineSetDTO_RepositoryURL();
    
    EAttribute getBaselineSetDTO_ItemId();
    
    EAttribute getBaselineSetDTO_Name();
    
    EAttribute getBaselineSetDTO_Comment();
    
    EAttribute getBaselineSetDTO_OwnerWorkspaceItemId();
    
    EAttribute getBaselineSetDTO_RepositoryId();
    
    EAttribute getBaselineSetDTO_BaselineItemIds();
    
    EAttribute getBaselineSetDTO_CreatorContributorItemId();
    
    EAttribute getBaselineSetDTO_CreationDate();
    
    EAttribute getBaselineSetDTO_ModifierContributorItemId();
    
    EAttribute getBaselineSetDTO_ModifiedDate();
    
    EClass getBaselineDTO();
    
    EAttribute getBaselineDTO_RepositoryURL();
    
    EReference getBaselineDTO_Hierarchy();
    
    EAttribute getBaselineDTO_ComponentName();
    
    EAttribute getBaselineDTO_ItemId();
    
    EAttribute getBaselineDTO_Name();
    
    EAttribute getBaselineDTO_RepositoryId();
    
    EAttribute getBaselineDTO_Comment();
    
    EAttribute getBaselineDTO_Id();
    
    EAttribute getBaselineDTO_ComponentItemId();
    
    EAttribute getBaselineDTO_CreatorContributorItemId();
    
    EAttribute getBaselineDTO_CreationDate();
    
    EAttribute getBaselineDTO_ModifierContributorItemId();
    
    EAttribute getBaselineDTO_ModifiedDate();
    
    EAttribute getBaselineDTO_CreatorContributorName();
    
    EAttribute getBaselineDTO_ModifierContributorName();
    
    EClass getWorkspaceDetailsDTO();
    
    EAttribute getWorkspaceDetailsDTO_RepositoryURL();
    
    EAttribute getWorkspaceDetailsDTO_ItemId();
    
    EAttribute getWorkspaceDetailsDTO_Name();
    
    EAttribute getWorkspaceDetailsDTO_Description();
    
    EAttribute getWorkspaceDetailsDTO_Stream();
    
    EAttribute getWorkspaceDetailsDTO_ExclusiveFileLockPatterns();
    
    EReference getWorkspaceDetailsDTO_Owner();
    
    EReference getWorkspaceDetailsDTO_Components();
    
    EReference getWorkspaceDetailsDTO_ComponentHierarchies();
    
    EReference getWorkspaceDetailsDTO_FlowEntries();
    
    EReference getWorkspaceDetailsDTO_ReadScope();
    
    EAttribute getWorkspaceDetailsDTO_RepositoryId();
    
    EClass getWorkspaceComponentDTO();
    
    EReference getWorkspaceComponentDTO_Baseline();
    
    EAttribute getWorkspaceComponentDTO_RootFolder();
    
    EReference getWorkspaceComponentDTO_Owner();
    
    EAttribute getWorkspaceComponentDTO_CurrentChangeSetId();
    
    EReference getWorkspaceComponentDTO_ReadScope();
    
    EAttribute getWorkspaceComponentDTO_ActiveChangeSetIds();
    
    EClass getWorkspaceFlowEntryDTO();
    
    EAttribute getWorkspaceFlowEntryDTO_RepositoryURL();
    
    EAttribute getWorkspaceFlowEntryDTO_RepositoryId();
    
    EAttribute getWorkspaceFlowEntryDTO_WorkspaceItemId();
    
    EAttribute getWorkspaceFlowEntryDTO_ScopedComponentItemIds();
    
    EAttribute getWorkspaceFlowEntryDTO_DefaultFlow();
    
    EAttribute getWorkspaceFlowEntryDTO_CurrentFlow();
    
    EClass getShareableDTO();
    
    EAttribute getShareableDTO_SandboxPath();
    
    EReference getShareableDTO_RelativePath();
    
    EClass getSandboxDTO();
    
    EAttribute getSandboxDTO_SandboxPath();
    
    EReference getSandboxDTO_AllShares();
    
    EAttribute getSandboxDTO_CaseSensitive();
    
    EAttribute getSandboxDTO_Corrupted();
    
    EAttribute getSandboxDTO_SandboxListening();
    
    EClass getContributorDTO();
    
    EAttribute getContributorDTO_UserId();
    
    EAttribute getContributorDTO_FullName();
    
    EAttribute getContributorDTO_EmailAddress();
    
    EAttribute getContributorDTO_ContributorItemId();
    
    EClass getReadScopeDTO();
    
    EAttribute getReadScopeDTO_ReadScope();
    
    EReference getReadScopeDTO_DefersTo();
    
    EClass getConfigurationWithUncheckedInChangesDTO();
    
    EReference getConfigurationWithUncheckedInChangesDTO_Configuration();
    
    EAttribute getConfigurationWithUncheckedInChangesDTO_ChangeCount();
    
    EClass getChangeSetDTO();
    
    EAttribute getChangeSetDTO_ItemId();
    
    EAttribute getChangeSetDTO_Comment();
    
    EAttribute getChangeSetDTO_LastChangeDate();
    
    EReference getChangeSetDTO_Component();
    
    EReference getChangeSetDTO_Author();
    
    EClass getComponentDTO();
    
    EAttribute getComponentDTO_ItemId();
    
    EAttribute getComponentDTO_Name();
    
    EClass getComponentHierarchyDTO();
    
    EAttribute getComponentHierarchyDTO_WorkspaceItemId();
    
    EReference getComponentHierarchyDTO_Subcomponents();
    
    EAttribute getComponentHierarchyDTO_InWorkspace();
    
    EClass getStatusDTO();
    
    EAttribute getStatusDTO_Severity();
    
    EAttribute getStatusDTO_PluginId();
    
    EAttribute getStatusDTO_Code();
    
    EAttribute getStatusDTO_Message();
    
    EReference getStatusDTO_Exception();
    
    EReference getStatusDTO_Children();
    
    EClass getExceptionDTO();
    
    EAttribute getExceptionDTO_Message();
    
    EReference getExceptionDTO_StackTrace();
    
    EReference getExceptionDTO_Cause();
    
    EClass getStackTraceElementDTO();
    
    EAttribute getStackTraceElementDTO_ClassName();
    
    EAttribute getStackTraceElementDTO_MethodName();
    
    EClass getConfigurationWithUncheckedInChanges2DTO();
    
    EAttribute getConfigurationWithUncheckedInChanges2DTO_ChangeCount();
    
    EReference getConfigurationWithUncheckedInChanges2DTO_Configuration();
    
    EClass getConfigurationDescriptor2DTO();
    
    EAttribute getConfigurationDescriptor2DTO_ComponentItemId();
    
    EReference getConfigurationDescriptor2DTO_Connection();
    
    EClass getConnectionDescriptor2DTO();
    
    EAttribute getConnectionDescriptor2DTO_ContextItemId();
    
    EAttribute getConnectionDescriptor2DTO_IsWorkspaceContext();
    
    EAttribute getConnectionDescriptor2DTO_RepositoryId();
    
    EClass getBaselineHierarchyDTO();
    
    EReference getBaselineHierarchyDTO_Subbaselines();
    
    EAttribute getBaselineHierarchyDTO_Comment();
    
    EAttribute getBaselineHierarchyDTO_CreationDate();
    
    EAttribute getBaselineHierarchyDTO_CreatorContributorItemId();
    
    EAttribute getBaselineHierarchyDTO_CreatorContributorName();
    
    EAttribute getBaselineHierarchyDTO_ModifiedDate();
    
    EAttribute getBaselineHierarchyDTO_ModifierContributorItemId();
    
    EAttribute getBaselineHierarchyDTO_ModifierContributorName();
    
    EAttribute getBaselineHierarchyDTO_RepositoryId();
    
    EAttribute getBaselineHierarchyDTO_RepositoryURL();
    
    EAttribute getBaselineHierarchyDTO_ItemId();
    
    EAttribute getBaselineHierarchyDTO_Id();
    
    EAttribute getBaselineHierarchyDTO_ComponentName();
    
    EClass getHierarchyDTO();
    
    EAttribute getHierarchyDTO_Name();
    
    EAttribute getHierarchyDTO_AncestorPath();
    
    EAttribute getHierarchyDTO_Root();
    
    EAttribute getHierarchyDTO_BranchContainsCycles();
    
    EAttribute getHierarchyDTO_InCycle();
    
    EAttribute getHierarchyDTO_ComponentItemId();
    
    EAttribute getHierarchyDTO_Accessible();
    
    EAttribute getStackTraceElementDTO_FileName();
    
    EAttribute getStackTraceElementDTO_LineNumber();
    
    FilesystemRestClientDTOcoreFactory getFilesystemRestClientDTOcoreFactory();
    
    public interface Literals
    {
        public static final EClass SHARE_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO();
        public static final EAttribute SHARE_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_ComponentItemId();
        public static final EAttribute SHARE_DTO__COMPONENT_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_ComponentName();
        public static final EAttribute SHARE_DTO__ROOT_VERSIONABLE_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_RootVersionableItemId();
        public static final EAttribute SHARE_DTO__ROOT_VERSIONABLE_ITEM_TYPE = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_RootVersionableItemType();
        public static final EAttribute SHARE_DTO__SANDBOX_PATH = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_SandboxPath();
        public static final EAttribute SHARE_DTO__IS_LOADED_WITH_ANOTHER_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_IsLoadedWithAnotherName();
        public static final EReference SHARE_DTO__PATH = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_Path();
        public static final EAttribute SHARE_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_RepositoryId();
        public static final EAttribute SHARE_DTO__CONTEXT_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_ContextItemId();
        public static final EAttribute SHARE_DTO__IS_WORKSPACE_CONTEXT = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_IsWorkspaceContext();
        public static final EAttribute SHARE_DTO__CONTEXT_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareDTO_ContextName();
        public static final EClass PATH_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getPathDTO();
        public static final EAttribute PATH_DTO__SEGMENTS = FilesystemRestClientDTOcorePackage.eINSTANCE.getPathDTO_Segments();
        public static final EClass TEAM_REPOSITORY_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO();
        public static final EAttribute TEAM_REPOSITORY_DTO__REPOSITORY_URI = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_RepositoryURI();
        public static final EAttribute TEAM_REPOSITORY_DTO__STATE_LOGGING_IN = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_StateLoggingIn();
        public static final EAttribute TEAM_REPOSITORY_DTO__STATE_LOGGED_IN = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_StateLoggedIn();
        public static final EAttribute TEAM_REPOSITORY_DTO__STATE_LOGGING_OUT = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_StateLoggingOut();
        public static final EAttribute TEAM_REPOSITORY_DTO__STATE_LOGGED_OUT = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_StateLoggedOut();
        public static final EAttribute TEAM_REPOSITORY_DTO__ERROR_STATE_NONE = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_ErrorStateNone();
        public static final EAttribute TEAM_REPOSITORY_DTO__ERROR_STATE_IO = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_ErrorStateIO();
        public static final EAttribute TEAM_REPOSITORY_DTO__ERROR_STATE_AUTH = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_ErrorStateAuth();
        public static final EAttribute TEAM_REPOSITORY_DTO__LAST_ERROR = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_LastError();
        public static final EAttribute TEAM_REPOSITORY_DTO__NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_Name();
        public static final EAttribute TEAM_REPOSITORY_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_RepositoryId();
        public static final EAttribute TEAM_REPOSITORY_DTO__REPOSITORY_ITEM_ID_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_RepositoryItemIdId();
        public static final EAttribute TEAM_REPOSITORY_DTO__USER_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_UserId();
        public static final EAttribute TEAM_REPOSITORY_DTO__CONNECTION_TIMEOUT = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_ConnectionTimeout();
        public static final EAttribute TEAM_REPOSITORY_DTO__CONTRIBUTOR_ITEM_ID_LOGGED_IN_CONTRIBUTOR = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoryDTO_ContributorItemIdLoggedInContributor();
        public static final EClass TEAM_REPOSITORIES_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoriesDTO();
        public static final EReference TEAM_REPOSITORIES_DTO__REPOSITORIES = FilesystemRestClientDTOcorePackage.eINSTANCE.getTeamRepositoriesDTO_Repositories();
        public static final EClass CONNECTION_DESCRIPTOR_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptorDTO();
        public static final EAttribute CONNECTION_DESCRIPTOR_DTO__REPOSITORY_URL = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptorDTO_RepositoryURL();
        public static final EAttribute CONNECTION_DESCRIPTOR_DTO__CONTEXT_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptorDTO_ContextItemId();
        public static final EAttribute CONNECTION_DESCRIPTOR_DTO__IS_WORKSPACE_CONTEXT = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptorDTO_IsWorkspaceContext();
        public static final EAttribute CONNECTION_DESCRIPTOR_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptorDTO_RepositoryId();
        public static final EClass CONFIGURATION_DESCRIPTOR_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationDescriptorDTO();
        public static final EReference CONFIGURATION_DESCRIPTOR_DTO__CONNECTION = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationDescriptorDTO_Connection();
        public static final EAttribute CONFIGURATION_DESCRIPTOR_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationDescriptorDTO_ComponentItemId();
        public static final EClass BASELINE_SET_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO();
        public static final EAttribute BASELINE_SET_DTO__REPOSITORY_URL = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_RepositoryURL();
        public static final EAttribute BASELINE_SET_DTO__ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_ItemId();
        public static final EAttribute BASELINE_SET_DTO__NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_Name();
        public static final EAttribute BASELINE_SET_DTO__COMMENT = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_Comment();
        public static final EAttribute BASELINE_SET_DTO__OWNER_WORKSPACE_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_OwnerWorkspaceItemId();
        public static final EAttribute BASELINE_SET_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_RepositoryId();
        public static final EAttribute BASELINE_SET_DTO__BASELINE_ITEM_IDS = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_BaselineItemIds();
        public static final EAttribute BASELINE_SET_DTO__CREATOR_CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_CreatorContributorItemId();
        public static final EAttribute BASELINE_SET_DTO__CREATION_DATE = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_CreationDate();
        public static final EAttribute BASELINE_SET_DTO__MODIFIER_CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_ModifierContributorItemId();
        public static final EAttribute BASELINE_SET_DTO__MODIFIED_DATE = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineSetDTO_ModifiedDate();
        public static final EClass BASELINE_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO();
        public static final EAttribute BASELINE_DTO__REPOSITORY_URL = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_RepositoryURL();
        public static final EReference BASELINE_DTO__HIERARCHY = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_Hierarchy();
        public static final EAttribute BASELINE_DTO__COMPONENT_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_ComponentName();
        public static final EAttribute BASELINE_DTO__ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_ItemId();
        public static final EAttribute BASELINE_DTO__NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_Name();
        public static final EAttribute BASELINE_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_RepositoryId();
        public static final EAttribute BASELINE_DTO__COMMENT = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_Comment();
        public static final EAttribute BASELINE_DTO__ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_Id();
        public static final EAttribute BASELINE_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_ComponentItemId();
        public static final EAttribute BASELINE_DTO__CREATOR_CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_CreatorContributorItemId();
        public static final EAttribute BASELINE_DTO__CREATION_DATE = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_CreationDate();
        public static final EAttribute BASELINE_DTO__MODIFIER_CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_ModifierContributorItemId();
        public static final EAttribute BASELINE_DTO__MODIFIED_DATE = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_ModifiedDate();
        public static final EAttribute BASELINE_DTO__CREATOR_CONTRIBUTOR_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_CreatorContributorName();
        public static final EAttribute BASELINE_DTO__MODIFIER_CONTRIBUTOR_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineDTO_ModifierContributorName();
        public static final EClass WORKSPACE_DETAILS_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO();
        public static final EAttribute WORKSPACE_DETAILS_DTO__REPOSITORY_URL = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_RepositoryURL();
        public static final EAttribute WORKSPACE_DETAILS_DTO__ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_ItemId();
        public static final EAttribute WORKSPACE_DETAILS_DTO__NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_Name();
        public static final EAttribute WORKSPACE_DETAILS_DTO__DESCRIPTION = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_Description();
        public static final EAttribute WORKSPACE_DETAILS_DTO__STREAM = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_Stream();
        public static final EAttribute WORKSPACE_DETAILS_DTO__EXCLUSIVE_FILE_LOCK_PATTERNS = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_ExclusiveFileLockPatterns();
        public static final EReference WORKSPACE_DETAILS_DTO__OWNER = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_Owner();
        public static final EReference WORKSPACE_DETAILS_DTO__COMPONENTS = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_Components();
        public static final EReference WORKSPACE_DETAILS_DTO__COMPONENT_HIERARCHIES = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_ComponentHierarchies();
        public static final EReference WORKSPACE_DETAILS_DTO__FLOW_ENTRIES = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_FlowEntries();
        public static final EReference WORKSPACE_DETAILS_DTO__READ_SCOPE = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_ReadScope();
        public static final EAttribute WORKSPACE_DETAILS_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceDetailsDTO_RepositoryId();
        public static final EClass WORKSPACE_COMPONENT_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceComponentDTO();
        public static final EReference WORKSPACE_COMPONENT_DTO__BASELINE = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceComponentDTO_Baseline();
        public static final EAttribute WORKSPACE_COMPONENT_DTO__ROOT_FOLDER = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceComponentDTO_RootFolder();
        public static final EReference WORKSPACE_COMPONENT_DTO__OWNER = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceComponentDTO_Owner();
        public static final EAttribute WORKSPACE_COMPONENT_DTO__CURRENT_CHANGE_SET_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceComponentDTO_CurrentChangeSetId();
        public static final EReference WORKSPACE_COMPONENT_DTO__READ_SCOPE = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceComponentDTO_ReadScope();
        public static final EAttribute WORKSPACE_COMPONENT_DTO__ACTIVE_CHANGE_SET_IDS = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceComponentDTO_ActiveChangeSetIds();
        public static final EClass WORKSPACE_FLOW_ENTRY_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceFlowEntryDTO();
        public static final EAttribute WORKSPACE_FLOW_ENTRY_DTO__REPOSITORY_URL = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceFlowEntryDTO_RepositoryURL();
        public static final EAttribute WORKSPACE_FLOW_ENTRY_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceFlowEntryDTO_RepositoryId();
        public static final EAttribute WORKSPACE_FLOW_ENTRY_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceFlowEntryDTO_WorkspaceItemId();
        public static final EAttribute WORKSPACE_FLOW_ENTRY_DTO__SCOPED_COMPONENT_ITEM_IDS = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceFlowEntryDTO_ScopedComponentItemIds();
        public static final EAttribute WORKSPACE_FLOW_ENTRY_DTO__DEFAULT_FLOW = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceFlowEntryDTO_DefaultFlow();
        public static final EAttribute WORKSPACE_FLOW_ENTRY_DTO__CURRENT_FLOW = FilesystemRestClientDTOcorePackage.eINSTANCE.getWorkspaceFlowEntryDTO_CurrentFlow();
        public static final EClass SHAREABLE_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareableDTO();
        public static final EAttribute SHAREABLE_DTO__SANDBOX_PATH = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareableDTO_SandboxPath();
        public static final EReference SHAREABLE_DTO__RELATIVE_PATH = FilesystemRestClientDTOcorePackage.eINSTANCE.getShareableDTO_RelativePath();
        public static final EClass SANDBOX_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getSandboxDTO();
        public static final EAttribute SANDBOX_DTO__SANDBOX_PATH = FilesystemRestClientDTOcorePackage.eINSTANCE.getSandboxDTO_SandboxPath();
        public static final EReference SANDBOX_DTO__ALL_SHARES = FilesystemRestClientDTOcorePackage.eINSTANCE.getSandboxDTO_AllShares();
        public static final EAttribute SANDBOX_DTO__CASE_SENSITIVE = FilesystemRestClientDTOcorePackage.eINSTANCE.getSandboxDTO_CaseSensitive();
        public static final EAttribute SANDBOX_DTO__CORRUPTED = FilesystemRestClientDTOcorePackage.eINSTANCE.getSandboxDTO_Corrupted();
        public static final EAttribute SANDBOX_DTO__SANDBOX_LISTENING = FilesystemRestClientDTOcorePackage.eINSTANCE.getSandboxDTO_SandboxListening();
        public static final EClass CONTRIBUTOR_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getContributorDTO();
        public static final EAttribute CONTRIBUTOR_DTO__USER_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getContributorDTO_UserId();
        public static final EAttribute CONTRIBUTOR_DTO__FULL_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getContributorDTO_FullName();
        public static final EAttribute CONTRIBUTOR_DTO__EMAIL_ADDRESS = FilesystemRestClientDTOcorePackage.eINSTANCE.getContributorDTO_EmailAddress();
        public static final EAttribute CONTRIBUTOR_DTO__CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getContributorDTO_ContributorItemId();
        public static final EClass READ_SCOPE_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getReadScopeDTO();
        public static final EAttribute READ_SCOPE_DTO__READ_SCOPE = FilesystemRestClientDTOcorePackage.eINSTANCE.getReadScopeDTO_ReadScope();
        public static final EReference READ_SCOPE_DTO__DEFERS_TO = FilesystemRestClientDTOcorePackage.eINSTANCE.getReadScopeDTO_DefersTo();
        public static final EClass CONFIGURATION_WITH_UNCHECKED_IN_CHANGES_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationWithUncheckedInChangesDTO();
        public static final EReference CONFIGURATION_WITH_UNCHECKED_IN_CHANGES_DTO__CONFIGURATION = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationWithUncheckedInChangesDTO_Configuration();
        public static final EAttribute CONFIGURATION_WITH_UNCHECKED_IN_CHANGES_DTO__CHANGE_COUNT = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationWithUncheckedInChangesDTO_ChangeCount();
        public static final EClass CHANGE_SET_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getChangeSetDTO();
        public static final EAttribute CHANGE_SET_DTO__ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getChangeSetDTO_ItemId();
        public static final EAttribute CHANGE_SET_DTO__COMMENT = FilesystemRestClientDTOcorePackage.eINSTANCE.getChangeSetDTO_Comment();
        public static final EAttribute CHANGE_SET_DTO__LAST_CHANGE_DATE = FilesystemRestClientDTOcorePackage.eINSTANCE.getChangeSetDTO_LastChangeDate();
        public static final EReference CHANGE_SET_DTO__COMPONENT = FilesystemRestClientDTOcorePackage.eINSTANCE.getChangeSetDTO_Component();
        public static final EReference CHANGE_SET_DTO__AUTHOR = FilesystemRestClientDTOcorePackage.eINSTANCE.getChangeSetDTO_Author();
        public static final EClass COMPONENT_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getComponentDTO();
        public static final EAttribute COMPONENT_DTO__ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getComponentDTO_ItemId();
        public static final EAttribute COMPONENT_DTO__NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getComponentDTO_Name();
        public static final EClass COMPONENT_HIERARCHY_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getComponentHierarchyDTO();
        public static final EAttribute COMPONENT_HIERARCHY_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getComponentHierarchyDTO_WorkspaceItemId();
        public static final EReference COMPONENT_HIERARCHY_DTO__SUBCOMPONENTS = FilesystemRestClientDTOcorePackage.eINSTANCE.getComponentHierarchyDTO_Subcomponents();
        public static final EAttribute COMPONENT_HIERARCHY_DTO__IN_WORKSPACE = FilesystemRestClientDTOcorePackage.eINSTANCE.getComponentHierarchyDTO_InWorkspace();
        public static final EClass STATUS_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getStatusDTO();
        public static final EAttribute STATUS_DTO__SEVERITY = FilesystemRestClientDTOcorePackage.eINSTANCE.getStatusDTO_Severity();
        public static final EAttribute STATUS_DTO__PLUGIN_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getStatusDTO_PluginId();
        public static final EAttribute STATUS_DTO__CODE = FilesystemRestClientDTOcorePackage.eINSTANCE.getStatusDTO_Code();
        public static final EAttribute STATUS_DTO__MESSAGE = FilesystemRestClientDTOcorePackage.eINSTANCE.getStatusDTO_Message();
        public static final EReference STATUS_DTO__EXCEPTION = FilesystemRestClientDTOcorePackage.eINSTANCE.getStatusDTO_Exception();
        public static final EReference STATUS_DTO__CHILDREN = FilesystemRestClientDTOcorePackage.eINSTANCE.getStatusDTO_Children();
        public static final EClass EXCEPTION_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getExceptionDTO();
        public static final EAttribute EXCEPTION_DTO__MESSAGE = FilesystemRestClientDTOcorePackage.eINSTANCE.getExceptionDTO_Message();
        public static final EReference EXCEPTION_DTO__STACK_TRACE = FilesystemRestClientDTOcorePackage.eINSTANCE.getExceptionDTO_StackTrace();
        public static final EReference EXCEPTION_DTO__CAUSE = FilesystemRestClientDTOcorePackage.eINSTANCE.getExceptionDTO_Cause();
        public static final EClass STACK_TRACE_ELEMENT_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getStackTraceElementDTO();
        public static final EAttribute STACK_TRACE_ELEMENT_DTO__CLASS_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getStackTraceElementDTO_ClassName();
        public static final EAttribute STACK_TRACE_ELEMENT_DTO__METHOD_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getStackTraceElementDTO_MethodName();
        public static final EClass CONFIGURATION_WITH_UNCHECKED_IN_CHANGES2_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationWithUncheckedInChanges2DTO();
        public static final EAttribute CONFIGURATION_WITH_UNCHECKED_IN_CHANGES2_DTO__CHANGE_COUNT = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationWithUncheckedInChanges2DTO_ChangeCount();
        public static final EReference CONFIGURATION_WITH_UNCHECKED_IN_CHANGES2_DTO__CONFIGURATION = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationWithUncheckedInChanges2DTO_Configuration();
        public static final EClass CONFIGURATION_DESCRIPTOR2_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationDescriptor2DTO();
        public static final EAttribute CONFIGURATION_DESCRIPTOR2_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationDescriptor2DTO_ComponentItemId();
        public static final EReference CONFIGURATION_DESCRIPTOR2_DTO__CONNECTION = FilesystemRestClientDTOcorePackage.eINSTANCE.getConfigurationDescriptor2DTO_Connection();
        public static final EClass CONNECTION_DESCRIPTOR2_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptor2DTO();
        public static final EAttribute CONNECTION_DESCRIPTOR2_DTO__CONTEXT_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptor2DTO_ContextItemId();
        public static final EAttribute CONNECTION_DESCRIPTOR2_DTO__IS_WORKSPACE_CONTEXT = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptor2DTO_IsWorkspaceContext();
        public static final EAttribute CONNECTION_DESCRIPTOR2_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getConnectionDescriptor2DTO_RepositoryId();
        public static final EClass BASELINE_HIERARCHY_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO();
        public static final EReference BASELINE_HIERARCHY_DTO__SUBBASELINES = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_Subbaselines();
        public static final EAttribute BASELINE_HIERARCHY_DTO__COMMENT = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_Comment();
        public static final EAttribute BASELINE_HIERARCHY_DTO__CREATION_DATE = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_CreationDate();
        public static final EAttribute BASELINE_HIERARCHY_DTO__CREATOR_CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_CreatorContributorItemId();
        public static final EAttribute BASELINE_HIERARCHY_DTO__CREATOR_CONTRIBUTOR_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_CreatorContributorName();
        public static final EAttribute BASELINE_HIERARCHY_DTO__MODIFIED_DATE = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_ModifiedDate();
        public static final EAttribute BASELINE_HIERARCHY_DTO__MODIFIER_CONTRIBUTOR_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_ModifierContributorItemId();
        public static final EAttribute BASELINE_HIERARCHY_DTO__MODIFIER_CONTRIBUTOR_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_ModifierContributorName();
        public static final EAttribute BASELINE_HIERARCHY_DTO__REPOSITORY_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_RepositoryId();
        public static final EAttribute BASELINE_HIERARCHY_DTO__REPOSITORY_URL = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_RepositoryURL();
        public static final EAttribute BASELINE_HIERARCHY_DTO__ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_ItemId();
        public static final EAttribute BASELINE_HIERARCHY_DTO__ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_Id();
        public static final EAttribute BASELINE_HIERARCHY_DTO__COMPONENT_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getBaselineHierarchyDTO_ComponentName();
        public static final EClass HIERARCHY_DTO = FilesystemRestClientDTOcorePackage.eINSTANCE.getHierarchyDTO();
        public static final EAttribute HIERARCHY_DTO__NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getHierarchyDTO_Name();
        public static final EAttribute HIERARCHY_DTO__ANCESTOR_PATH = FilesystemRestClientDTOcorePackage.eINSTANCE.getHierarchyDTO_AncestorPath();
        public static final EAttribute HIERARCHY_DTO__ROOT = FilesystemRestClientDTOcorePackage.eINSTANCE.getHierarchyDTO_Root();
        public static final EAttribute HIERARCHY_DTO__BRANCH_CONTAINS_CYCLES = FilesystemRestClientDTOcorePackage.eINSTANCE.getHierarchyDTO_BranchContainsCycles();
        public static final EAttribute HIERARCHY_DTO__IN_CYCLE = FilesystemRestClientDTOcorePackage.eINSTANCE.getHierarchyDTO_InCycle();
        public static final EAttribute HIERARCHY_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOcorePackage.eINSTANCE.getHierarchyDTO_ComponentItemId();
        public static final EAttribute HIERARCHY_DTO__ACCESSIBLE = FilesystemRestClientDTOcorePackage.eINSTANCE.getHierarchyDTO_Accessible();
        public static final EAttribute STACK_TRACE_ELEMENT_DTO__FILE_NAME = FilesystemRestClientDTOcorePackage.eINSTANCE.getStackTraceElementDTO_FileName();
        public static final EAttribute STACK_TRACE_ELEMENT_DTO__LINE_NUMBER = FilesystemRestClientDTOcorePackage.eINSTANCE.getStackTraceElementDTO_LineNumber();
    }
}
