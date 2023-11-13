// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

import java.util.Arrays;

class ByteArrayLine
{
    boolean hashComputed;
    int hash;
    byte[] bytes;
    
    public ByteArrayLine(final byte[] bytes) {
        this.bytes = bytes;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ByteArrayLine)) {
            return false;
        }
        final ByteArrayLine other = (ByteArrayLine)obj;
        return this.bytes.length == other.bytes.length && (this.hashCode() == other.hashCode() && Arrays.equals(this.bytes, other.bytes));
    }
    
    @Override
    public int hashCode() {
        if (this.hashComputed) {
            return this.hash;
        }
        int hash = 0;
        for (int top = this.bytes.length, i = 0; i < top; ++i) {
            hash = hash * 31 + this.bytes[i];
        }
        this.hash = hash;
        this.hashComputed = true;
        return hash;
    }
    
    @Override
    public String toString() {
        return "ByteArrayLine(" + new String(this.bytes) + ")";
    }
}
