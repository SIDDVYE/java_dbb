// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest;

import com.ibm.team.repository.common.transport.IParameterWrapper;
import com.ibm.team.repository.common.TeamRepositoryException;
import com.ibm.team.scm.common.internal.rest.dto.ChangeSetDTO;
import com.ibm.team.scm.common.internal.rest.IScmRestService;
import com.ibm.team.repository.common.transport.ITeamModelledRestService;

public interface IFilesystemRestService extends ITeamModelledRestService
{
    ChangeSetDTO getChangeSet(final IScmRestService.ParmsGetChangeSet p0) throws TeamRepositoryException;
    
    String[] getBlame(final ParmsGetBlame p0) throws TeamRepositoryException;
    
    public static final class ParmsGetBlame implements IParameterWrapper
    {
        public String workspaceItemId;
        public String componentItemId;
        public String baselineItemId;
        public String changeSetItemId;
        public String fileItemId;
        public String fileStateId;
    }
}
