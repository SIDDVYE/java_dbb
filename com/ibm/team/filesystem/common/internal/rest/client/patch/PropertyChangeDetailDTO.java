// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

public interface PropertyChangeDetailDTO extends ChangeDetailDTO
{
    String getPropertyName();
    
    void setPropertyName(final String p0);
    
    void unsetPropertyName();
    
    boolean isSetPropertyName();
    
    String getBeforeValue();
    
    void setBeforeValue(final String p0);
    
    void unsetBeforeValue();
    
    boolean isSetBeforeValue();
    
    String getAfterValue();
    
    void setAfterValue(final String p0);
    
    void unsetAfterValue();
    
    boolean isSetAfterValue();
    
    String getType();
    
    void setType(final String p0);
    
    void unsetType();
    
    boolean isSetType();
}
