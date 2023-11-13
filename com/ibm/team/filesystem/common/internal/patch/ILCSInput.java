// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

public interface ILCSInput<T>
{
    int length1();
    
    int length2();
    
    T get1(final int p0);
    
    T get2(final int p0);
    
    boolean match(final T p0, final T p1);
}
