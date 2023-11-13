// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

public interface ContentTransferDTO
{
    int getMaxThreads();
    
    void setMaxThreads(final int p0);
    
    void unsetMaxThreads();
    
    boolean isSetMaxThreads();
    
    int getMaxThreadsDefault();
    
    void setMaxThreadsDefault(final int p0);
    
    void unsetMaxThreadsDefault();
    
    boolean isSetMaxThreadsDefault();
    
    int getMaxThreadsLimit();
    
    void setMaxThreadsLimit(final int p0);
    
    void unsetMaxThreadsLimit();
    
    boolean isSetMaxThreadsLimit();
}
