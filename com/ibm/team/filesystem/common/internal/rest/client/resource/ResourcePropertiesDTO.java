// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import java.util.Map;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;

public interface ResourcePropertiesDTO
{
    String getFullPath();
    
    void setFullPath(final String p0);
    
    void unsetFullPath();
    
    boolean isSetFullPath();
    
    ShareableDTO getPath();
    
    void setPath(final ShareableDTO p0);
    
    void unsetPath();
    
    boolean isSetPath();
    
    PathDTO getRemotePath();
    
    void setRemotePath(final PathDTO p0);
    
    void unsetRemotePath();
    
    boolean isSetRemotePath();
    
    boolean isShared();
    
    void setShared(final boolean p0);
    
    void unsetShared();
    
    boolean isSetShared();
    
    ShareDTO getShare();
    
    void setShare(final ShareDTO p0);
    
    void unsetShare();
    
    boolean isSetShare();
    
    String getVersionableItemType();
    
    void setVersionableItemType(final String p0);
    
    void unsetVersionableItemType();
    
    boolean isSetVersionableItemType();
    
    String getItemId();
    
    void setItemId(final String p0);
    
    void unsetItemId();
    
    boolean isSetItemId();
    
    String getStateId();
    
    void setStateId(final String p0);
    
    void unsetStateId();
    
    boolean isSetStateId();
    
    boolean isIgnored();
    
    void setIgnored(final boolean p0);
    
    void unsetIgnored();
    
    boolean isSetIgnored();
    
    boolean isLocal();
    
    void setLocal(final boolean p0);
    
    void unsetLocal();
    
    boolean isSetLocal();
    
    boolean isRemote();
    
    void setRemote(final boolean p0);
    
    void unsetRemote();
    
    boolean isSetRemote();
    
    boolean isDirty();
    
    void setDirty(final boolean p0);
    
    void unsetDirty();
    
    boolean isSetDirty();
    
    FilePropertiesDTO getFileProperties();
    
    void setFileProperties(final FilePropertiesDTO p0);
    
    void unsetFileProperties();
    
    boolean isSetFileProperties();
    
    IgnoreReasonDTO getIgnoreReason();
    
    void setIgnoreReason(final IgnoreReasonDTO p0);
    
    void unsetIgnoreReason();
    
    boolean isSetIgnoreReason();
    
    Map getUserProperties();
    
    void unsetUserProperties();
    
    boolean isSetUserProperties();
    
    SymlinkPropertiesDTO getSymlinkProperties();
    
    void setSymlinkProperties(final SymlinkPropertiesDTO p0);
    
    void unsetSymlinkProperties();
    
    boolean isSetSymlinkProperties();
    
    PermissionsContextDTO getPermissionsContext();
    
    void setPermissionsContext(final PermissionsContextDTO p0);
    
    void unsetPermissionsContext();
    
    boolean isSetPermissionsContext();
}
