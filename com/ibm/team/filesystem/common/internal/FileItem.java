// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import com.ibm.team.filesystem.common.IFileContent;
import com.ibm.team.filesystem.common.IFileItem;
import com.ibm.team.scm.common.internal.Versionable;

public interface FileItem extends Versionable, FileItemHandle, IFileItem
{
    IFileContent getContent();
    
    void setContent(final IFileContent p0);
    
    void unsetContent();
    
    boolean isSetContent();
    
    boolean isExecutable();
    
    void setExecutable(final boolean p0);
    
    void unsetExecutable();
    
    boolean isSetExecutable();
}
