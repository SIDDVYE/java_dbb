// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

import java.util.List;

public interface VersionableChangeDTO
{
    boolean isResolved();
    
    void setResolved(final boolean p0);
    
    void unsetResolved();
    
    boolean isSetResolved();
    
    String getVersionableItemId();
    
    void setVersionableItemId(final String p0);
    
    void unsetVersionableItemId();
    
    boolean isSetVersionableItemId();
    
    String getVersionableType();
    
    void setVersionableType(final String p0);
    
    void unsetVersionableType();
    
    boolean isSetVersionableType();
    
    String getName();
    
    void setName(final String p0);
    
    void unsetName();
    
    boolean isSetName();
    
    String getParentPathHint();
    
    void setParentPathHint(final String p0);
    
    void unsetParentPathHint();
    
    boolean isSetParentPathHint();
    
    String getBeforeStateId();
    
    void setBeforeStateId(final String p0);
    
    void unsetBeforeStateId();
    
    boolean isSetBeforeStateId();
    
    String getAfterStateId();
    
    void setAfterStateId(final String p0);
    
    void unsetAfterStateId();
    
    boolean isSetAfterStateId();
    
    String getConfigurationStateId();
    
    void setConfigurationStateId(final String p0);
    
    void unsetConfigurationStateId();
    
    boolean isSetConfigurationStateId();
    
    String getKind();
    
    void setKind(final String p0);
    
    void unsetKind();
    
    boolean isSetKind();
    
    String getChangeType();
    
    void setChangeType(final String p0);
    
    void unsetChangeType();
    
    boolean isSetChangeType();
    
    List getIncidentals();
    
    void unsetIncidentals();
    
    boolean isSetIncidentals();
    
    List getChangeDetails();
    
    void unsetChangeDetails();
    
    boolean isSetChangeDetails();
    
    List getChildChanges();
    
    void unsetChildChanges();
    
    boolean isSetChildChanges();
    
    String getDependsOnId();
    
    void setDependsOnId(final String p0);
    
    void unsetDependsOnId();
    
    boolean isSetDependsOnId();
}
