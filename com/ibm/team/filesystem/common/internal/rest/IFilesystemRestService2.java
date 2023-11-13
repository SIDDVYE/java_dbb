// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest;

import com.ibm.team.repository.common.transport.IParameterWrapper;
import com.ibm.team.filesystem.common.internal.rest2.dto.CheckInStatePlusDTO;
import com.ibm.team.scm.common.internal.rest2.dto.InitTestDTO;
import com.ibm.team.repository.common.TeamRepositoryException;
import com.ibm.team.scm.common.internal.rest2.dto.ChangeSetPlusDTO;
import com.ibm.team.scm.common.internal.rest.IScmRestService2;
import com.ibm.team.filesystem.common.FileLineDelimiter;
import com.ibm.team.repository.common.transport.ITeamModelledRestService;

public interface IFilesystemRestService2 extends ITeamModelledRestService
{
    public static final String UPDATE = "UPDATE";
    public static final String DELETE = "DELETE";
    public static final String NEW_ITEM_ID = "_xf9MgJcPEd6rDbE8csAykA";
    public static final String DELIBERATELY_NULL_UUID = "Null_JuvZIKbREd6Hkq-ObO81hQ";
    public static final String COMPONENT_ROOT_FOLDER_ID = "ComponentRoot__augr4KoREd6Iq4JQTSRgPQ";
    public static final int LINE_DELIMITER_NONE = FileLineDelimiter.LINE_DELIMITER_NONE.ordinal();
    public static final int LINE_DELIMITER_LF = FileLineDelimiter.LINE_DELIMITER_LF.ordinal();
    public static final int LINE_DELIMITER_CR = FileLineDelimiter.LINE_DELIMITER_CR.ordinal();
    public static final int LINE_DELIMITER_CRLF = FileLineDelimiter.LINE_DELIMITER_CRLF.ordinal();
    public static final int LINE_DELIMITER_PLATFORM = FileLineDelimiter.LINE_DELIMITER_PLATFORM.ordinal();
    
    ChangeSetPlusDTO getChangeSetPlus(final IScmRestService2.ParmsGetChangeSetPlus p0) throws TeamRepositoryException;
    
    String[] getBlame(final ParmsGetBlame p0) throws TeamRepositoryException;
    
    String postCreateChangeSetForStream(final ParmsCreateChangeSetForStream p0) throws TeamRepositoryException;
    
    void postDeliver(final ParmsDeliver p0) throws TeamRepositoryException;
    
    InitTestDTO getInternalInitTest(final ParmsInitTest p0) throws TeamRepositoryException;
    
    CheckInStatePlusDTO[] getChangeSetCheckinHistory(final IScmRestService2.ParmsGetChangeSetCheckinHistory p0) throws TeamRepositoryException;
    
    public static final class ParmsGetBlame implements IParameterWrapper
    {
        public String workspaceItemId;
        public String componentItemId;
        public String baselineItemId;
        public String changeSetItemId;
        public String fileItemId;
        public String fileStateId;
    }
    
    public static final class ParmsCreateChangeSetForStream implements IParameterWrapper, Cloneable
    {
        public String streamId;
        public String componentId;
        public String changeSetComment;
        public String[] instruction;
        public String[] versionableItemId;
        public String[] versionableItemType;
        public String[] versionableNamespace;
        public String[] parentId;
        public String[] nameInParent;
        public String[] contentHashId;
        public boolean[] isExecutable;
        public long[] timestamp;
        public String[] previousOwnerItemId;
        public String[] previousOwnerStateId;
        public String[] contentType;
        public int[] delimiter;
        public String[] encoding;
        public long[] contentLength;
        public long[] delimiterCount;
        
        public Object clone() throws CloneNotSupportedException {
            final ParmsCreateChangeSetForStream result = new ParmsCreateChangeSetForStream();
            result.streamId = this.streamId;
            result.componentId = this.componentId;
            result.changeSetComment = this.changeSetComment;
            result.contentHashId = new String[this.contentHashId.length];
            System.arraycopy(this.contentHashId, 0, result.contentHashId, 0, this.contentHashId.length);
            result.contentLength = new long[this.contentLength.length];
            System.arraycopy(this.contentLength, 0, result.contentLength, 0, this.contentLength.length);
            result.contentType = new String[this.contentType.length];
            System.arraycopy(this.contentType, 0, result.contentType, 0, this.contentType.length);
            result.delimiter = new int[this.delimiter.length];
            System.arraycopy(this.delimiter, 0, result.delimiter, 0, this.delimiter.length);
            result.encoding = new String[this.encoding.length];
            System.arraycopy(this.encoding, 0, result.encoding, 0, this.encoding.length);
            result.instruction = new String[this.instruction.length];
            System.arraycopy(this.instruction, 0, result.instruction, 0, this.instruction.length);
            result.isExecutable = new boolean[this.isExecutable.length];
            System.arraycopy(this.isExecutable, 0, result.isExecutable, 0, this.isExecutable.length);
            result.nameInParent = new String[this.nameInParent.length];
            System.arraycopy(this.nameInParent, 0, result.nameInParent, 0, this.nameInParent.length);
            result.parentId = new String[this.parentId.length];
            System.arraycopy(this.parentId, 0, result.parentId, 0, this.parentId.length);
            result.previousOwnerItemId = new String[this.previousOwnerItemId.length];
            System.arraycopy(this.previousOwnerItemId, 0, result.previousOwnerItemId, 0, this.previousOwnerItemId.length);
            result.previousOwnerStateId = new String[this.previousOwnerStateId.length];
            System.arraycopy(this.previousOwnerStateId, 0, result.previousOwnerStateId, 0, this.previousOwnerStateId.length);
            result.timestamp = new long[this.timestamp.length];
            System.arraycopy(this.timestamp, 0, result.timestamp, 0, this.timestamp.length);
            result.versionableItemId = new String[this.versionableItemId.length];
            System.arraycopy(this.versionableItemId, 0, result.versionableItemId, 0, this.versionableItemId.length);
            result.versionableItemType = new String[this.versionableItemType.length];
            System.arraycopy(this.versionableItemType, 0, result.versionableItemType, 0, this.versionableItemType.length);
            result.versionableNamespace = new String[this.versionableNamespace.length];
            System.arraycopy(this.versionableNamespace, 0, result.versionableNamespace, 0, this.versionableNamespace.length);
            result.delimiterCount = new long[this.delimiterCount.length];
            System.arraycopy(this.delimiterCount, 0, result.delimiterCount, 0, this.delimiterCount.length);
            return result;
        }
    }
    
    public static final class ParmsDeliver implements IParameterWrapper
    {
        public String streamId;
        public String[] changeSetIds;
        public boolean unlockAllAffectedItems;
    }
    
    public static final class ParmsInitTest implements IParameterWrapper
    {
        public String projectAreaItemId;
        public String folderName;
        public String fileName;
        public String fileOwnerId;
        public boolean deleteFileContent;
    }
}
