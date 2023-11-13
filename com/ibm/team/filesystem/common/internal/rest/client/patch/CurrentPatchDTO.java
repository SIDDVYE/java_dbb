// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

import java.util.List;

public interface CurrentPatchDTO
{
    String getWorkspaceId();
    
    void setWorkspaceId(final String p0);
    
    void unsetWorkspaceId();
    
    boolean isSetWorkspaceId();
    
    String getComponentId();
    
    void setComponentId(final String p0);
    
    void unsetComponentId();
    
    boolean isSetComponentId();
    
    ChangeSetSourceDTO getSource();
    
    void setSource(final ChangeSetSourceDTO p0);
    
    void unsetSource();
    
    boolean isSetSource();
    
    String getTargetChangeSetId();
    
    void setTargetChangeSetId(final String p0);
    
    void unsetTargetChangeSetId();
    
    boolean isSetTargetChangeSetId();
    
    List getChanges();
    
    void unsetChanges();
    
    boolean isSetChanges();
}
