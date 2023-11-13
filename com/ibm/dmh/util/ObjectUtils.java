// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

public class ObjectUtils
{
    public static boolean toBoolean(final Object o) {
        if (o instanceof Boolean) {
            return (boolean)o;
        }
        if (o instanceof String) {
            return StringUtils.getBoolean((String)o);
        }
        if (o != null) {
            return StringUtils.getBoolean(o.toString());
        }
        throw new RuntimeException("Null passed to ObjectUtils.toBoolean()");
    }
    
    public static boolean toBoolean(final Object o, final boolean defaultVal) {
        if (o == null) {
            return defaultVal;
        }
        return toBoolean(o);
    }
    
    public static int toInt(final Object o) {
        if (o instanceof Integer) {
            return (int)o;
        }
        if (o instanceof String && StringUtils.isNumeric((String)o)) {
            return StringUtils.getInt((String)o, 0);
        }
        throw new RuntimeException("Null or non-number passed to ObjectUtils.toInt().  o.class=[" + o.getClass().getName() + "], o.value=[" + o + "]");
    }
    
    public static int toInt(final Object o, final int defaultVal) {
        if (o == null) {
            return defaultVal;
        }
        return toInt(o);
    }
    
    public static long toLong(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).longValue();
        }
        if (o instanceof String && StringUtils.isNumeric((String)o)) {
            return StringUtils.getInt((String)o, 0);
        }
        throw new RuntimeException("Null or non-number passed to ObjectUtils.toInt().  o.class=[" + o.getClass().getName() + "], o.value=[" + o + "]");
    }
    
    public static long toLong(final Object o, final long defaultVal) {
        if (o == null) {
            return defaultVal;
        }
        return toLong(o);
    }
    
    public static String toString(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o != null) {
            return o.toString();
        }
        throw new RuntimeException("Null passed to ObjectUtils.toString()");
    }
    
    public static String toString(final Object o, final String defaultVal) {
        if (o == null) {
            return defaultVal;
        }
        return toString(o);
    }
    
    public static boolean[] toBooleanArray(final Object[] o) {
        final boolean[] b = new boolean[o.length];
        for (int i = 0; i < o.length; ++i) {
            b[i] = toBoolean(o[i]);
        }
        return b;
    }
    
    public static int[] toIntArray(final Object[] o) {
        final int[] x = new int[o.length];
        for (int i = 0; i < o.length; ++i) {
            x[i] = toInt(o[i]);
        }
        return x;
    }
    
    public static String[] toStringArray(final Object[] o) {
        final String[] s = new String[o.length];
        for (int i = 0; i < o.length; ++i) {
            s[i] = toString(o[i]);
        }
        return s;
    }
}
