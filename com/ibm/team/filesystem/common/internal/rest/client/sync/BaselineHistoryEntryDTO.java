// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineDTO;

public interface BaselineHistoryEntryDTO
{
    String getDeliveredByItemId();
    
    void setDeliveredByItemId(final String p0);
    
    void unsetDeliveredByItemId();
    
    boolean isSetDeliveredByItemId();
    
    long getDeliveryDate();
    
    void setDeliveryDate(final long p0);
    
    void unsetDeliveryDate();
    
    boolean isSetDeliveryDate();
    
    BaselineDTO getBaseline();
    
    void setBaseline(final BaselineDTO p0);
    
    void unsetBaseline();
    
    boolean isSetBaseline();
}
