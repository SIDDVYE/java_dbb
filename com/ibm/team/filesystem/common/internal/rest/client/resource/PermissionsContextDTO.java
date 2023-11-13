// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import com.ibm.team.repository.common.IAuditableHandle;

public interface PermissionsContextDTO
{
    boolean isAccessible();
    
    void setAccessible(final boolean p0);
    
    void unsetAccessible();
    
    boolean isSetAccessible();
    
    IAuditableHandle getReadContext();
    
    void setReadContext(final IAuditableHandle p0);
    
    void unsetReadContext();
    
    boolean isSetReadContext();
}
