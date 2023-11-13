// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ListUtils
{
    public static String[] getList(final String s, final String defaultVal) {
        return getList(s, ',', defaultVal);
    }
    
    public static String[] getList(String s, final char delim, final String defaultVal) {
        if (s == null || s.length() == 0) {
            s = defaultVal;
        }
        if (s == null) {
            return new String[0];
        }
        if (s.length() == 0) {
            return new String[] { "" };
        }
        final String[] a = StringUtils.splitBracketed(s, delim, true);
        return a;
    }
    
    public static String[] getList(final String s) {
        return getList(s, null);
    }
    
    public static String[] getList(final String s, final String defaultVal, final int fillCount) {
        String[] list = getList(s, defaultVal);
        if (fillCount != 1 && list.length == 1) {
            final String[] list2 = new String[fillCount];
            Arrays.fill(list2, list[0]);
            list = list2;
        }
        return list;
    }
    
    public static Object[] addToArray(final Object[] array, final Object o) {
        final Object[] x = (Object[])Array.newInstance(o.getClass(), array.length + 1);
        for (int i = 0; i < array.length; ++i) {
            x[i] = array[i];
        }
        x[array.length] = o;
        return x;
    }
    
    public static List<List<?>> splitCollection(final Collection<?> c, final int size) {
        if (c == null) {
            return null;
        }
        int i1 = 0;
        int i2 = c.size();
        final List<List<?>> l = new ArrayList<List<?>>((int)Math.ceil(i2 / size));
        List<Object> l2 = null;
        if (c.size() > 0) {
            for (final Object o : c) {
                if (i1 == 0) {
                    i1 = Math.min(i2, size);
                    l2 = new ArrayList<Object>(i1);
                    l.add(l2);
                }
                l2.add(o);
                --i1;
                --i2;
            }
        }
        return l;
    }
}
