// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

import java.util.List;

public interface ChangeLogEntryDTO
{
    String getEntryType();
    
    void setEntryType(final String p0);
    
    void unsetEntryType();
    
    boolean isSetEntryType();
    
    String getItemId();
    
    void setItemId(final String p0);
    
    void unsetItemId();
    
    boolean isSetItemId();
    
    List getChildEntries();
    
    void unsetChildEntries();
    
    boolean isSetChildEntries();
    
    String getEntryName();
    
    void setEntryName(final String p0);
    
    void unsetEntryName();
    
    boolean isSetEntryName();
}
