// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

public class HashUtils
{
    public static long toHash(final String s) {
        return toHash(0L, s);
    }
    
    public static String toHashHex(final String s) {
        return StringUtils.toHex(toHash(0L, s));
    }
    
    public static long toHash(final byte[] b) {
        return toHash(0L, b);
    }
    
    public static long toHash(long hash, final String s) {
        hash += 5381L;
        for (int i = 0; i < s.length(); ++i) {
            hash = clshift(hash, 5) + hash + s.charAt(i);
        }
        hash -= 5381L;
        return hash;
    }
    
    public static long toHash(long hash, final byte[] b) {
        hash += 5381L;
        for (int i = 0; i < b.length; ++i) {
            hash = clshift(hash, 5) + hash + b[i];
        }
        hash -= 5381L;
        return hash;
    }
    
    private static long clshift(long hash, final int pos) {
        for (int i = 0; i < pos; ++i) {
            hash = (hash << 1 ^ (long)((hash < 0L) ? 1 : 0));
        }
        return hash;
    }
}
