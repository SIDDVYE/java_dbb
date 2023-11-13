// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

public interface CheckinPolicyDTO
{
    boolean isAutoCheckin();
    
    void setAutoCheckin(final boolean p0);
    
    void unsetAutoCheckin();
    
    boolean isSetAutoCheckin();
    
    boolean isAutoCheckinDefault();
    
    void setAutoCheckinDefault(final boolean p0);
    
    void unsetAutoCheckinDefault();
    
    boolean isSetAutoCheckinDefault();
}
