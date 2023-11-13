// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;

public interface BackupInShedDTO
{
    ShareableDTO getShareable();
    
    void setShareable(final ShareableDTO p0);
    
    void unsetShareable();
    
    boolean isSetShareable();
    
    String getShedLocation();
    
    void setShedLocation(final String p0);
    
    void unsetShedLocation();
    
    boolean isSetShedLocation();
}
