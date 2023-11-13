// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

public interface ILogicalChange extends IChangeSummary
{
    public static final int CONFLICTED_CHANGE = 1;
    public static final int AUTOMERGE_CHANGE = 2;
    public static final int INCIDENTAL_CHANGE = 3;
    
    int kind();
}
