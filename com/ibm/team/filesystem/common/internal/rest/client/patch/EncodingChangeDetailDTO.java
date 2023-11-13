// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

public interface EncodingChangeDetailDTO extends ChangeDetailDTO
{
    String getBeforeCharacterEncoding();
    
    void setBeforeCharacterEncoding(final String p0);
    
    void unsetBeforeCharacterEncoding();
    
    boolean isSetBeforeCharacterEncoding();
    
    String getAfterCharacterEncoding();
    
    void setAfterCharacterEncoding(final String p0);
    
    void unsetAfterCharacterEncoding();
    
    boolean isSetAfterCharacterEncoding();
}
