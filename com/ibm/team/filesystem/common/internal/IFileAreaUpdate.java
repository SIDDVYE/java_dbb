// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import java.util.Map;
import java.util.Date;

public interface IFileAreaUpdate
{
    public static final String INTERNAL_LINK_TARGET = "scm.SymbolicLinkTarget";
    public static final String INTERNAL_LINK_TYPE_IS_DIRECTORY = "scm.SymbolicLinkIsDirectory";
    public static final String INTERNAL_LINK_TYPE_VALUE = "true";
    
    Date getFileTimestamp();
    
    void setFileTimestamp(final Date p0);
    
    String getContentType();
    
    void setContentType(final String p0);
    
    String getLinkTarget();
    
    boolean isDirectoryLink();
    
    Map<String, String> getMetadataProperties();
}
