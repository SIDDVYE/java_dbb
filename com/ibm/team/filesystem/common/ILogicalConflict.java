// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import java.util.Collection;

public interface ILogicalConflict extends ILogicalChange
{
    public static final int ADD_ADD = 1;
    public static final int ADD_DELETE = 2;
    public static final int DELETE_ADD = 3;
    public static final int DELETE_MOVE = 4;
    public static final int DELETE_MODIFY = 5;
    public static final int MOVE_MOVE = 6;
    public static final int MOVE_ADD = 7;
    public static final int MOVE_DELETE = 8;
    public static final int MODIFY_MODIFY = 9;
    public static final int MODIFY_DELETE = 10;
    public static final int UNKNOWN_CONFLICT = 11;
    
    Collection conflictingItems();
    
    int conflictType();
    
    boolean isModificationConflict(final int p0);
    
    boolean isSelectedModificationChange(final int p0);
}
