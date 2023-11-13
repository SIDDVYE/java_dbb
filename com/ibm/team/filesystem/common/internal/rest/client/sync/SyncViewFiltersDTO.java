// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

public interface SyncViewFiltersDTO
{
    int getMaxNumberChangesShownInChangeSet();
    
    void setMaxNumberChangesShownInChangeSet(final int p0);
    
    void unsetMaxNumberChangesShownInChangeSet();
    
    boolean isSetMaxNumberChangesShownInChangeSet();
    
    boolean isAllFlowTargets();
    
    void setAllFlowTargets(final boolean p0);
    
    void unsetAllFlowTargets();
    
    boolean isSetAllFlowTargets();
    
    int getMaxNumberChangesShownInChangeSetDefault();
    
    void setMaxNumberChangesShownInChangeSetDefault(final int p0);
    
    void unsetMaxNumberChangesShownInChangeSetDefault();
    
    boolean isSetMaxNumberChangesShownInChangeSetDefault();
    
    boolean isAllFlowTargetsDefault();
    
    void setAllFlowTargetsDefault(final boolean p0);
    
    void unsetAllFlowTargetsDefault();
    
    boolean isSetAllFlowTargetsDefault();
    
    boolean isShowAllBaselines();
    
    void setShowAllBaselines(final boolean p0);
    
    void unsetShowAllBaselines();
    
    boolean isSetShowAllBaselines();
    
    boolean isShowAllBaselinesDefault();
    
    void setShowAllBaselinesDefault(final boolean p0);
    
    void unsetShowAllBaselinesDefault();
    
    boolean isSetShowAllBaselinesDefault();
}
