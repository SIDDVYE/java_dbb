// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

public interface SyncStatusDTO
{
    int getNLocal();
    
    void setNLocal(final int p0);
    
    void unsetNLocal();
    
    boolean isSetNLocal();
    
    int getNIncomingBaselines();
    
    void setNIncomingBaselines(final int p0);
    
    void unsetNIncomingBaselines();
    
    boolean isSetNIncomingBaselines();
    
    int getNIncoming();
    
    void setNIncoming(final int p0);
    
    void unsetNIncoming();
    
    boolean isSetNIncoming();
    
    int getNOutgoingBaselines();
    
    void setNOutgoingBaselines(final int p0);
    
    void unsetNOutgoingBaselines();
    
    boolean isSetNOutgoingBaselines();
    
    int getNOutgoing();
    
    void setNOutgoing(final int p0);
    
    void unsetNOutgoing();
    
    boolean isSetNOutgoing();
    
    int getNConflict();
    
    void setNConflict(final int p0);
    
    void unsetNConflict();
    
    boolean isSetNConflict();
    
    int getNCollision();
    
    void setNCollision(final int p0);
    
    void unsetNCollision();
    
    boolean isSetNCollision();
    
    int getNComponentChanges();
    
    void setNComponentChanges(final int p0);
    
    void unsetNComponentChanges();
    
    boolean isSetNComponentChanges();
}
