// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

import com.ibm.team.repository.common.model.Helper;

public interface PageDescriptorDTO extends Helper
{
    String getRepositoryURI();
    
    void setRepositoryURI(final String p0);
    
    void unsetRepositoryURI();
    
    boolean isSetRepositoryURI();
    
    String getWorkspaceID();
    
    void setWorkspaceID(final String p0);
    
    void unsetWorkspaceID();
    
    boolean isSetWorkspaceID();
    
    String getComponentID();
    
    void setComponentID(final String p0);
    
    void unsetComponentID();
    
    boolean isSetComponentID();
    
    int getMaxPageSize();
    
    void setMaxPageSize(final int p0);
    
    void unsetMaxPageSize();
    
    boolean isSetMaxPageSize();
    
    long getStartIndex();
    
    void setStartIndex(final long p0);
    
    void unsetStartIndex();
    
    boolean isSetStartIndex();
    
    long getTotalSize();
    
    void setTotalSize(final long p0);
    
    void unsetTotalSize();
    
    boolean isSetTotalSize();
    
    long getSyncTime();
    
    void setSyncTime(final long p0);
    
    void unsetSyncTime();
    
    boolean isSetSyncTime();
}
