// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

public class Mutable<T>
{
    T o;
    
    public Mutable(final T o) {
        this.o = o;
    }
    
    public T get() {
        return this.o;
    }
    
    public void set(final T o) {
        this.o = o;
    }
}
