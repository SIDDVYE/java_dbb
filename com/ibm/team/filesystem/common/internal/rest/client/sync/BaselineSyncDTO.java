// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface BaselineSyncDTO
{
    String getBaselineName();
    
    void setBaselineName(final String p0);
    
    void unsetBaselineName();
    
    boolean isSetBaselineName();
    
    String getBaselineItemId();
    
    void setBaselineItemId(final String p0);
    
    void unsetBaselineItemId();
    
    boolean isSetBaselineItemId();
    
    String getPreviousBaselineItemId();
    
    void setPreviousBaselineItemId(final String p0);
    
    void unsetPreviousBaselineItemId();
    
    boolean isSetPreviousBaselineItemId();
    
    boolean isChangeSetsResolved();
    
    void setChangeSetsResolved(final boolean p0);
    
    void unsetChangeSetsResolved();
    
    boolean isSetChangeSetsResolved();
    
    List getChangeSets();
    
    void unsetChangeSets();
    
    boolean isSetChangeSets();
    
    String getPreviousBaselineName();
    
    void setPreviousBaselineName(final String p0);
    
    void unsetPreviousBaselineName();
    
    boolean isSetPreviousBaselineName();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    String getCreationDate();
    
    void setCreationDate(final String p0);
    
    void unsetCreationDate();
    
    boolean isSetCreationDate();
    
    int getBaselineId();
    
    void setBaselineId(final int p0);
    
    void unsetBaselineId();
    
    boolean isSetBaselineId();
}
