// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

public interface ExecuteBitChangeDetailDTO extends ChangeDetailDTO
{
    boolean isExecutable();
    
    void setExecutable(final boolean p0);
    
    void unsetExecutable();
    
    boolean isSetExecutable();
}
