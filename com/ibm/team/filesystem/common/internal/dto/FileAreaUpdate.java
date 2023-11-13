// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.Map;
import com.ibm.team.filesystem.common.IFileContent;
import com.ibm.team.filesystem.common.internal.IFileAreaUpdate;

public interface FileAreaUpdate extends BasicChange, IFileAreaUpdate
{
    IFileContent getOptionalContent();
    
    void setOptionalContent(final IFileContent p0);
    
    void unsetOptionalContent();
    
    boolean isSetOptionalContent();
    
    boolean isExecutable();
    
    void setExecutable(final boolean p0);
    
    void unsetExecutable();
    
    boolean isSetExecutable();
    
    Map getProperties();
    
    void unsetProperties();
    
    boolean isSetProperties();
}
