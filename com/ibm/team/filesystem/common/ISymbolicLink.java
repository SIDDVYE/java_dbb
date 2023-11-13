// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import org.eclipse.core.runtime.IStatus;
import java.util.Date;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import com.ibm.team.repository.common.IItemType;
import com.ibm.team.scm.common.IVersionable;

public interface ISymbolicLink extends IVersionable, ISymbolicLinkHandle
{
    public static final IItemType ITEM_TYPE = IItemType.IRegistry.INSTANCE.getItemType(FilesystemPackage.eINSTANCE.getSymbolicLink().getName(), "com.ibm.team.filesystem");
    
    String getTarget();
    
    void setTarget(final String p0);
    
    Date getLinkTimestamp();
    
    void setLinkTimestamp(final Date p0);
    
    void setIsDirectoryLink(final boolean p0);
    
    boolean isDirectoryLink();
    
    IStatus validate();
}
