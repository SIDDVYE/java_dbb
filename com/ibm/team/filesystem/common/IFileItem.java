// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import org.eclipse.core.runtime.IStatus;
import java.util.Date;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import com.ibm.team.repository.common.IItemType;
import com.ibm.team.scm.common.IVersionable;

public interface IFileItem extends IFileItemHandle, IVersionable
{
    public static final IItemType ITEM_TYPE = IItemType.IRegistry.INSTANCE.getItemType(FilesystemPackage.eINSTANCE.getFileItem().getName(), "com.ibm.team.filesystem");
    public static final String CONTENT_TYPE_TEXT = "text/plain";
    public static final String CONTENT_TYPE_XML = "application/xml";
    public static final String CONTENT_TYPE_UNKNOWN = "application/unknown";
    
    String getContentType();
    
    void setContentType(final String p0);
    
    IFileContent getContent();
    
    void setContent(final IFileContent p0);
    
    boolean isExecutable();
    
    void setExecutable(final boolean p0);
    
    Date getFileTimestamp();
    
    void setFileTimestamp(final Date p0);
    
    IStatus validate();
}
