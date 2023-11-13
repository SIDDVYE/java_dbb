// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share;

import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;

public interface ShareOverlapDTO
{
    String getRepositoryURL();
    
    void setRepositoryURL(final String p0);
    
    void unsetRepositoryURL();
    
    boolean isSetRepositoryURL();
    
    String getWorkspaceItemId();
    
    void setWorkspaceItemId(final String p0);
    
    void unsetWorkspaceItemId();
    
    boolean isSetWorkspaceItemId();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    ShareableDTO getRoot();
    
    void setRoot(final ShareableDTO p0);
    
    void unsetRoot();
    
    boolean isSetRoot();
    
    List getOverlappingShares();
    
    void unsetOverlappingShares();
    
    boolean isSetOverlappingShares();
    
    String getRepositoryId();
    
    void setRepositoryId(final String p0);
    
    void unsetRepositoryId();
    
    boolean isSetRepositoryId();
    
    List getOverlappingRoots();
    
    void unsetOverlappingRoots();
    
    boolean isSetOverlappingRoots();
}
