// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import java.util.List;

public interface OutOfSyncComponentDTO
{
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
    
    int getOutOfSyncSharesCount();
    
    void setOutOfSyncSharesCount(final int p0);
    
    void unsetOutOfSyncSharesCount();
    
    boolean isSetOutOfSyncSharesCount();
    
    List getOutOfSyncShares();
    
    void unsetOutOfSyncShares();
    
    boolean isSetOutOfSyncShares();
}
