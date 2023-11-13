// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

public interface VersionableLockDTO
{
    String getVersionableItemId();
    
    void setVersionableItemId(final String p0);
    
    void unsetVersionableItemId();
    
    boolean isSetVersionableItemId();
    
    String getContributorItemId();
    
    void setContributorItemId(final String p0);
    
    void unsetContributorItemId();
    
    boolean isSetContributorItemId();
}
