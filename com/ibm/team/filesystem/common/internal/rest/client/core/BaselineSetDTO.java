// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;

public interface BaselineSetDTO
{
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getItemId();
    
    void setItemId(final String p0);
    
    void unsetItemId();
    
    boolean isSetItemId();
    
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    String getComment();
    
    void setComment(final String p0);
    
    void unsetComment();
    
    boolean isSetComment();
    
    String getOwnerWorkspaceItemId();
    
    void setOwnerWorkspaceItemId(final String p0);
    
    void unsetOwnerWorkspaceItemId();
    
    boolean isSetOwnerWorkspaceItemId();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    List getBaselineItemIds();
    
    void unsetBaselineItemIds();
    
    boolean isSetBaselineItemIds();
    
    String getCreatorContributorItemId();
    
    void setCreatorContributorItemId(final String p0);
    
    void unsetCreatorContributorItemId();
    
    boolean isSetCreatorContributorItemId();
    
    long getCreationDate();
    
    void setCreationDate(final long p0);
    
    void unsetCreationDate();
    
    boolean isSetCreationDate();
    
    String getModifierContributorItemId();
    
    void setModifierContributorItemId(final String p0);
    
    void unsetModifierContributorItemId();
    
    boolean isSetModifierContributorItemId();
    
    long getModifiedDate();
    
    void setModifiedDate(final long p0);
    
    void unsetModifiedDate();
    
    boolean isSetModifiedDate();
}
