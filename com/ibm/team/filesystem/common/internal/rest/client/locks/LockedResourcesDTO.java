// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

import java.util.List;

public interface LockedResourcesDTO
{
    List getLockedShareables();
    
    void unsetLockedShareables();
    
    boolean isSetLockedShareables();
    
    List getUserLocks();
    
    void unsetUserLocks();
    
    boolean isSetUserLocks();
    
    List getTeamLocks();
    
    void unsetTeamLocks();
    
    boolean isSetTeamLocks();
    
    List getOwners();
    
    void unsetOwners();
    
    boolean isSetOwners();
}
