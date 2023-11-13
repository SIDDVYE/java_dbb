// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;

public interface BaselineHierarchyDTO extends HierarchyDTO
{
    List getSubbaselines();
    
    void unsetSubbaselines();
    
    boolean isSetSubbaselines();
    
    String getComment();
    
    void setComment(final String p0);
    
    void unsetComment();
    
    boolean isSetComment();
    
    long getCreationDate();
    
    void setCreationDate(final long p0);
    
    void unsetCreationDate();
    
    boolean isSetCreationDate();
    
    String getCreatorContributorItemId();
    
    void setCreatorContributorItemId(final String p0);
    
    void unsetCreatorContributorItemId();
    
    boolean isSetCreatorContributorItemId();
    
    String getCreatorContributorName();
    
    void setCreatorContributorName(final String p0);
    
    void unsetCreatorContributorName();
    
    boolean isSetCreatorContributorName();
    
    long getModifiedDate();
    
    void setModifiedDate(final long p0);
    
    void unsetModifiedDate();
    
    boolean isSetModifiedDate();
    
    String getModifierContributorItemId();
    
    void setModifierContributorItemId(final String p0);
    
    void unsetModifierContributorItemId();
    
    boolean isSetModifierContributorItemId();
    
    String getModifierContributorName();
    
    void setModifierContributorName(final String p0);
    
    void unsetModifierContributorName();
    
    boolean isSetModifierContributorName();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getItemId();
    
    void setItemId(final String p0);
    
    void unsetItemId();
    
    boolean isSetItemId();
    
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    String getComponentName();
    
    void setComponentName(final String p0);
    
    void unsetComponentName();
    
    boolean isSetComponentName();
}
