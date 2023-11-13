// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.process;

import com.ibm.team.scm.common.internal.process.AdvisorDetailConstants;
import com.ibm.team.filesystem.common.ISymbolicLinkHandle;
import com.ibm.team.scm.common.IFolderHandle;
import com.ibm.team.filesystem.common.IFileItemHandle;
import org.w3c.dom.Element;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IContextHandle;
import com.ibm.team.repository.common.UUID;
import org.w3c.dom.Document;

public class AdvisorConstants
{
    public static final String ID_DISALLOWED_INCOMING_CHANGE = "com.ibm.team.process.definitions.server.disallowIncomingChanges";
    public static final String ID_REQUIRED_CONTENT_PROBLEM = "com.ibm.team.process.internal.definitions.requiredContentProblem";
    public static final String ID_DELTA_REQUIRED_CONTENT = "com.ibm.team.process.definitions.server.deltaRequiredContent";
    public static final String ID_OLD_REQUIRED_CONTENT = "com.ibm.team.process.definitions.server.requiredContent";
    public static final String ID_REQUIRE_STATIC_ANALYSIS = "com.ibm.team.process.vsclient.deliver.requireStaticAnalysis";
    public static final String ID_REQUIRE_VS_TEST_RUN = "com.ibm.team.process.vsclient.deliver.requireVsTestRun";
    public static final String ID_PROTECT_FILE_TYPE = "com.ibm.team.process.definitions.server.protectFileType.disallowedChangeProblem";
    public static final String ID_CHANGES_CLOSED_ON_LINK = "com.ibm.team.scm.server.changesClosedOnLinkAdvisor";
    public static final String ID_PREVENT_LINK_TO_APPROVED_WORKITEM = "com.ibm.team.scm.server.preventLinkToApprovedWorkItem";
    public static final String ID_WORK_ITEMS_MATCH_QUERY_DELIVER = "com.ibm.team.scm.server.workItemsMatchQueryDeliverAdvisor";
    public static final String ID_STREAM_COMPONENTS_PERMISSION = "com.ibm.team.process.definitions.server.componentPermissions";
    public static final String ID_PROTECT_CLOSED_CHANGE_SETS = "com.ibm.team.scm.server.protectClosedChangeSetsAdvisor";
    public static final String ID_REQUIRE_WORKITEM = "com.ibm.team.process.deliver.server.deltaRequireWorkItem";
    public static final String ID_DEPRECATED_REQUIRE_WORKITEM = "com.ibm.team.process.deliver.server.requireWorkItem";
    public static final String ID_REQUIRE_WORKITEM_APPROVAL = "com.ibm.team.process.deliver.server.deltaRequireWorkItemApproval";
    public static final String ID_DEPRECATED_REQUIRE_WORKITEM_APPROVAL = "com.ibm.team.process.deliver.server.requireWorkItemApproval";
    public static final String ID_DISINTERESTED_REVIEWER_CONSTANTS = "com.ibm.team.process.definitions.server.disinterestedApproverWorkItemSaveAdvisor";
    public static final String ID_DISINTERESTED_CSAUTHOR_CONSTANTS = "com.ibm.team.process.definitions.server.disinterestedApproverChangeSetLinkAdvisor";
    public static final String ID_DELTA_PROTECT_FILE_TYPE = "com.ibm.team.process.definitions.server.deltaProtectFileType";
    public static final String NS_DELTA_PROTECT_FILE_TYPE = "http://com.ibm.team.process/server/protectFileType";
    public static final String NS_DELTA_REQUIRED_CONTENT = "http://com.ibm.team.process/server/requireContent";
    public static final String TAG_DATA = "data";
    public static final String ATTR_DATA_REPO_ROOT = "repositoryRoot";
    public static final String ATTR_DATA_REQUIRED_CONTENT = "requiredContent";
    public static final String ATTR_DATA_INSERT_TEXT = "insertText";
    public static final String ATTR_DATA_COMPONENT_ITEMID = "componentItemId";
    public static final String ATTR_DATA_SOURCE_BASELINE_ITEMID = "sourceBaselineId";
    public static final String ATTR_DATA_SOURCE_WORKSPACE_ITEMID = "sourceWorkspaceId";
    public static final String TAG_FILE = "file";
    public static final String ATTR_FILE_ITEMID = "fileItemId";
    public static final String ATTR_FILE_NAME = "fileName";
    
    public static Element makeVersionableLink(final Document doc, final UUID repoRoot, final IContextHandle ctx, final IComponentHandle comp, final String name, final IVersionableHandle handle) {
        String type;
        if (handle instanceof IFileItemHandle) {
            type = "file";
        }
        else if (handle instanceof IFolderHandle) {
            type = "directory";
        }
        else if (handle instanceof ISymbolicLinkHandle) {
            type = "symlink";
        }
        else {
            type = null;
        }
        return AdvisorDetailConstants.makeVersionableLink(doc, repoRoot, ctx, comp, name, handle, type);
    }
}
