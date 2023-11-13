// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import com.ibm.team.repository.common.IAuditableHandle;

public interface ReadScopeDTO
{
    String getReadScope();
    
    void setReadScope(final String p0);
    
    void unsetReadScope();
    
    boolean isSetReadScope();
    
    IAuditableHandle getDefersTo();
    
    void setDefersTo(final IAuditableHandle p0);
    
    void unsetDefersTo();
    
    boolean isSetDefersTo();
}
