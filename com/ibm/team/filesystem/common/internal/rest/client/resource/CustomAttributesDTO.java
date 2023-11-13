// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import java.util.Map;

public interface CustomAttributesDTO
{
    String getFullPath();
    
    void setFullPath(final String p0);
    
    void unsetFullPath();
    
    boolean isSetFullPath();
    
    String getItemId();
    
    void setItemId(final String p0);
    
    void unsetItemId();
    
    boolean isSetItemId();
    
    Map getCustomAttributes();
    
    void unsetCustomAttributes();
    
    boolean isSetCustomAttributes();
}
