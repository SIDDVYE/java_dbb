// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.scm.common.IFolderHandle;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;

public interface IBasicChange
{
    public static final int ADD = 1;
    public static final int DELETE = 2;
    public static final int MODIFY = 4;
    public static final int MOVE = 8;
    public static final int NOOP = 16;
    public static final int MISSING_DETAILS = 32;
    public static final int LINE_DELIMITER_CHANGE = 1;
    public static final int CONTENT_TYPE_CHANGE = 2;
    public static final int CONTENT_CHANGE = 4;
    public static final int EXECUTABLE_CHANGE = 8;
    public static final int USER_PROPERTY_CHANGE = 16;
    
    boolean isChangeType(final int p0);
    
    IComponentHandle component();
    
    IVersionableHandle item();
    
    IVersionableHandle beforeState();
    
    IVersionableHandle afterState();
    
    IFolderHandle parent();
    
    IFolderHandle oldParent();
    
    boolean isSameChangeType(final IBasicChange p0);
    
    boolean isModificationChange(final int p0);
}
