// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

public interface ContentChangeDetailDTO extends ChangeDetailDTO
{
    String getBeforeContentHash();
    
    void setBeforeContentHash(final String p0);
    
    void unsetBeforeContentHash();
    
    boolean isSetBeforeContentHash();
    
    String getAfterContentHash();
    
    void setAfterContentHash(final String p0);
    
    void unsetAfterContentHash();
    
    boolean isSetAfterContentHash();
}
