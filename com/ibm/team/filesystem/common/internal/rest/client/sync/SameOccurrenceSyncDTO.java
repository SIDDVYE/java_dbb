// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

public interface SameOccurrenceSyncDTO
{
    int getId();
    
    void setId(final int p0);
    
    void unsetId();
    
    boolean isSetId();
    
    boolean isOutgoing();
    
    void setOutgoing(final boolean p0);
    
    void unsetOutgoing();
    
    boolean isSetOutgoing();
    
    boolean isIncoming();
    
    void setIncoming(final boolean p0);
    
    void unsetIncoming();
    
    boolean isSetIncoming();
    
    boolean isSuspended();
    
    void setSuspended(final boolean p0);
    
    void unsetSuspended();
    
    boolean isSetSuspended();
    
    boolean isUnresolved();
    
    void setUnresolved(final boolean p0);
    
    void unsetUnresolved();
    
    boolean isSetUnresolved();
}
