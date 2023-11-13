// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest;

import com.ibm.team.repository.common.transport.IParameterWrapper;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.ContentStatusDTO;
import com.ibm.team.repository.common.TeamRepositoryException;
import com.ibm.team.repository.common.transport.ITeamModelledRestService;

public interface IFilesystemRichClientRestService extends ITeamModelledRestService
{
    String[] getBlame(final ParmsGetBlame p0) throws TeamRepositoryException;
    
    ContentStatusDTO[] getContentStatus(final ParmsContentStatus p0) throws TeamRepositoryException;
    
    public static final class ParmsGetBlame implements IParameterWrapper
    {
        public String workspaceItemId;
        public String componentItemId;
        public String baselineItemId;
        public String changeSetItemId;
        public String fileItemId;
        public String fileStateId;
    }
    
    public static final class ParmsContentStatus implements IParameterWrapper
    {
        public String[] fileItemId;
        public String[] fileItemStateId;
    }
}
