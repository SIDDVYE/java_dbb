// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

public interface LineDelimiterChangeDetailDTO extends ChangeDetailDTO
{
    String getBeforeLineDelimiter();
    
    void setBeforeLineDelimiter(final String p0);
    
    void unsetBeforeLineDelimiter();
    
    boolean isSetBeforeLineDelimiter();
    
    String getAfterLineDelimiter();
    
    void setAfterLineDelimiter(final String p0);
    
    void unsetAfterLineDelimiter();
    
    boolean isSetAfterLineDelimiter();
}
