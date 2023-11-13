// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

public interface ContentTypeChangeDetailDTO extends ChangeDetailDTO
{
    String getBeforeContentType();
    
    void setBeforeContentType(final String p0);
    
    void unsetBeforeContentType();
    
    boolean isSetBeforeContentType();
    
    String getAfterContentType();
    
    void setAfterContentType(final String p0);
    
    void unsetAfterContentType();
    
    boolean isSetAfterContentType();
}
