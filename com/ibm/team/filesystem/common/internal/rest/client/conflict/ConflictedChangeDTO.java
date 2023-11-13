// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict;

import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;

public interface ConflictedChangeDTO
{
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    String getVersionableItemId();
    
    void setVersionableItemId(final String p0);
    
    void unsetVersionableItemId();
    
    boolean isSetVersionableItemId();
    
    String getVersionableItemType();
    
    void setVersionableItemType(final String p0);
    
    void unsetVersionableItemType();
    
    boolean isSetVersionableItemType();
    
    PathDTO getPath();
    
    void setPath(final PathDTO p0);
    
    void unsetPath();
    
    boolean isSetPath();
    
    String getKind();
    
    void setKind(final String p0);
    
    void unsetKind();
    
    boolean isSetKind();
    
    String getConflictType();
    
    void setConflictType(final String p0);
    
    void unsetConflictType();
    
    boolean isSetConflictType();
}
