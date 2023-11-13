// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

import com.ibm.team.repository.common.model.Helper;

public interface ChangeSetSourceDTO extends Helper
{
    String getSourceId();
    
    void setSourceId(final String p0);
    
    void unsetSourceId();
    
    boolean isSetSourceId();
    
    String getSourceType();
    
    void setSourceType(final String p0);
    
    void unsetSourceType();
    
    boolean isSetSourceType();
}
