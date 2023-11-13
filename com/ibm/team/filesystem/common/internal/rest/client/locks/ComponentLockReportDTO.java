// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

import java.util.List;

public interface ComponentLockReportDTO
{
    List getVersionableLocks();
    
    void unsetVersionableLocks();
    
    boolean isSetVersionableLocks();
    
    String getComponentItemId();
    
    void setComponentItemId(final String p0);
    
    void unsetComponentItemId();
    
    boolean isSetComponentItemId();
}
