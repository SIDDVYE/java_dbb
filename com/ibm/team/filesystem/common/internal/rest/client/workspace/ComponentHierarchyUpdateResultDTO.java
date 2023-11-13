// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace;

import java.util.List;
import com.ibm.team.repository.common.model.Helper;

public interface ComponentHierarchyUpdateResultDTO extends Helper
{
    String getAffectedChangeSetItemId();
    
    void setAffectedChangeSetItemId(final String p0);
    
    void unsetAffectedChangeSetItemId();
    
    boolean isSetAffectedChangeSetItemId();
    
    List getUpdatedChildrenItemIds();
    
    void unsetUpdatedChildrenItemIds();
    
    boolean isSetUpdatedChildrenItemIds();
}
