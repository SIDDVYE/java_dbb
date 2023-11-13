// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

import java.util.List;

public interface StreamLockReportDTO
{
    List getComponentLockReports();
    
    void unsetComponentLockReports();
    
    boolean isSetComponentLockReports();
    
    String getStreamItemId();
    
    void setStreamItemId(final String p0);
    
    void unsetStreamItemId();
    
    boolean isSetStreamItemId();
    
    String getStreamName();
    
    void setStreamName(final String p0);
    
    void unsetStreamName();
    
    boolean isSetStreamName();
}
