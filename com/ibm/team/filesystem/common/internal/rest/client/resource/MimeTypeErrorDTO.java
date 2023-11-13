// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

public interface MimeTypeErrorDTO extends FileErrorDTO
{
    String getMimeType();
    
    void setMimeType(final String p0);
    
    void unsetMimeType();
    
    boolean isSetMimeType();
}
