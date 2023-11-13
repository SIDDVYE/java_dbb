// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;

public interface StructuredComponentUpdateReportDTO
{
    String getComponentName();
    
    void setComponentName(final String p0);
    
    void unsetComponentName();
    
    boolean isSetComponentName();
    
    CurrentPatchDTO getCurrentPatch();
    
    void setCurrentPatch(final CurrentPatchDTO p0);
    
    void unsetCurrentPatch();
    
    boolean isSetCurrentPatch();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    List getConflictedItemIds();
    
    void unsetConflictedItemIds();
    
    boolean isSetConflictedItemIds();
    
    List getChangeSetItemIds();
    
    void unsetChangeSetItemIds();
    
    boolean isSetChangeSetItemIds();
    
    List getBaselines();
    
    void unsetBaselines();
    
    boolean isSetBaselines();
}
