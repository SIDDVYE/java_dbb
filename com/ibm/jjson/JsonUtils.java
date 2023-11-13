// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import com.ibm.jjson.beans.BeanMapFactory;
import java.util.Collection;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonUtils
{
    public static String reformat(final String json, final JsonSerializer serializer) {
        return serializer.serialize(JsonParser.DEFAULT.parse(json));
    }
    
    public static Object deepClone(final Object o) {
        if (o instanceof Map) {
            final Map m = new JsonMap((Map)o);
            for (final Map.Entry e : m.entrySet()) {
                e.setValue(deepClone(e.getValue()));
            }
            return m;
        }
        if (o instanceof List) {
            final List l = new JsonList();
            final Iterator i = ((List)o).iterator();
            while (i.hasNext()) {
                l.add(deepClone(i.next()));
            }
            return l;
        }
        return o;
    }
    
    public static String toJsonString(final String s, final char quoteChar) {
        boolean doConvert = false;
        char c;
        for (int i = 0; i < s.length() && !doConvert; doConvert |= (c == '\n' || c == '\t' || c == '\b' || c == '\f' || c == '\r' || (c == '\'' && c == quoteChar) || (c == '\"' && c == quoteChar) || c == '\\'), ++i) {
            c = s.charAt(i);
        }
        if (!doConvert) {
            return s;
        }
        final StringBuffer sb = new StringBuffer(s.length());
        for (int j = 0; j < s.length(); ++j) {
            final char c2 = s.charAt(j);
            if (c2 == '\n') {
                sb.append('\\').append('n');
            }
            else if (c2 == '\t') {
                sb.append('\\').append('t');
            }
            else if (c2 == '\b') {
                sb.append('\\').append('b');
            }
            else if (c2 == '\f') {
                sb.append('\\').append('f');
            }
            else if (c2 == '\'' && c2 == quoteChar) {
                sb.append('\\').append('\'');
            }
            else if (c2 == '\"' && c2 == quoteChar) {
                sb.append('\\').append('\"');
            }
            else if (c2 == '\\') {
                sb.append('\\').append('\\');
            }
            else if (c2 != '\r') {
                sb.append(c2);
            }
        }
        return sb.toString();
    }
    
    public static String toString(final Object o, final String d) {
        if (o == null) {
            return d;
        }
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof Number || o instanceof Boolean || o instanceof Enum || o instanceof Date || o instanceof Calendar) {
            return o.toString();
        }
        if (o instanceof Map || o instanceof Collection || o.getClass().isArray() || BeanMapFactory.DEFAULT.isBean(o)) {
            return JsonSerializer.DEFAULT_CONDENSED.serialize(o);
        }
        return o.toString();
    }
    
    public static Integer toInt(final Object o, final Integer d) {
        try {
            if (o == null) {
                return d;
            }
            if (o instanceof Number) {
                return ((Number)o).intValue();
            }
            if (o instanceof Boolean) {
                return ((boolean)o) ? 1 : 0;
            }
            if (o instanceof String) {
                return Integer.parseInt((String)o);
            }
            if (o instanceof Date) {
                return (int)(((Date)o).getTime() / 1000L);
            }
            if (o instanceof Calendar) {
                return (int)(((Calendar)o).getTime().getTime() / 1000L);
            }
            if (o instanceof Map) {
                return ((Map)o).size();
            }
            if (o instanceof Collection) {
                return ((Collection)o).size();
            }
            if (o.getClass().isArray()) {
                return ((Object[])o).length;
            }
            if (o instanceof Enum) {
                return ((Enum)o).ordinal();
            }
            if (BeanMapFactory.DEFAULT.isBean(o)) {
                return BeanMapFactory.DEFAULT.forBean(o).size();
            }
        }
        catch (NumberFormatException ex) {}
        throw new InvalidDataConversionException(o.getClass(), Integer.class);
    }
    
    public static Long toLong(final Object o, final Long d) {
        try {
            if (o == null) {
                return d;
            }
            if (o instanceof Number) {
                return ((Number)o).longValue();
            }
            if (o instanceof Boolean) {
                return (long)(((boolean)o) ? 1 : 0);
            }
            if (o instanceof String) {
                return Long.parseLong((String)o);
            }
            if (o instanceof Date) {
                return ((Date)o).getTime();
            }
            if (o instanceof Calendar) {
                return ((Calendar)o).getTimeInMillis();
            }
            if (o instanceof Map) {
                return (long)((Map)o).size();
            }
            if (o instanceof Collection) {
                return (long)((Collection)o).size();
            }
            if (o.getClass().isArray()) {
                return (long)((Object[])o).length;
            }
            if (o instanceof Enum) {
                return (long)((Enum)o).ordinal();
            }
            if (BeanMapFactory.DEFAULT.isBean(o)) {
                return (long)BeanMapFactory.DEFAULT.forBean(o).size();
            }
        }
        catch (NumberFormatException ex) {}
        throw new InvalidDataConversionException(o.getClass(), Long.class);
    }
    
    public static Boolean toBoolean(final Object o, final Boolean d) {
        if (o == null) {
            return d;
        }
        if (o instanceof Boolean) {
            return (boolean)o;
        }
        if (o instanceof String) {
            final String s = o.toString();
            if (s == null || s.length() == 0) {
                return false;
            }
            final char c = s.charAt(0);
            return c == 'T' || c == 't' || c == 'Y' || c == 'y' || c == '1';
        }
        else {
            if (o instanceof Number) {
                return ((Number)o).intValue() != 0;
            }
            if (o instanceof Map) {
                return !((Map)o).isEmpty();
            }
            if (o instanceof Collection) {
                return !((Collection)o).isEmpty();
            }
            if (o.getClass().isArray()) {
                return ((Object[])o).length != 0;
            }
            if (o instanceof Enum) {
                throw new InvalidDataConversionException(o.getClass(), Boolean.class);
            }
            if (BeanMapFactory.DEFAULT.isBean(o)) {
                return !BeanMapFactory.DEFAULT.forBean(o).isEmpty();
            }
            throw new InvalidDataConversionException(o.getClass(), Boolean.class);
        }
    }
    
    public static Map toMap(final Object o, final Map d) {
        if (o == null) {
            return d;
        }
        if (o instanceof Map) {
            return (Map)o;
        }
        return toJsonMap(o, null);
    }
    
    public static JsonMap toJsonMap(final Object o, final JsonMap def) {
        if (o == null) {
            return def;
        }
        if (o instanceof JsonMap) {
            return (JsonMap)o;
        }
        if (o instanceof Map) {
            return new JsonMap((Map<? extends K, ? extends V>)o);
        }
        if (o instanceof Collection) {
            final JsonMap m = new JsonMap();
            int i = 0;
            for (final Object o2 : (Collection)o) {
                m.put(i++, o2);
            }
            return m;
        }
        if (o.getClass().isArray()) {
            final JsonMap m = new JsonMap();
            int i = 0;
            for (final Object o3 : (Object[])o) {
                m.put(i++, o3);
            }
            return m;
        }
        if (o instanceof Date) {
            final JsonMap m = new JsonMap();
            final Calendar c = Calendar.getInstance();
            c.setTime((Date)o);
            m.put("y", c.get(1));
            m.put("M", c.get(2));
            m.put("d", c.get(5));
            m.put("H", c.get(11));
            m.put("m", c.get(12));
            m.put("s", c.get(13));
            m.put("S", c.get(14));
            return m;
        }
        if (o instanceof Calendar) {
            final JsonMap m = new JsonMap();
            final Calendar c = (Calendar)o;
            m.put("y", c.get(1));
            m.put("M", c.get(2));
            m.put("d", c.get(5));
            m.put("H", c.get(11));
            m.put("m", c.get(12));
            m.put("s", c.get(13));
            m.put("S", c.get(14));
            return m;
        }
        if (o instanceof Enum) {
            throw new InvalidDataConversionException(o.getClass(), JsonMap.class);
        }
        if (BeanMapFactory.DEFAULT.isBean(o)) {
            return new JsonMap((Map<? extends K, ? extends V>)BeanMapFactory.DEFAULT.forBean(o));
        }
        throw new InvalidDataConversionException(o.getClass(), JsonMap.class);
    }
    
    public static List toList(final Object o, final List d) {
        if (o == null) {
            return d;
        }
        if (o instanceof List) {
            return (List)o;
        }
        return toJsonList(o, null);
    }
    
    public static JsonList toJsonList(final Object o, final JsonList d) {
        if (o == null) {
            return d;
        }
        if (o instanceof JsonList) {
            return (JsonList)o;
        }
        if (o instanceof Collection) {
            return new JsonList((Collection<? extends E>)o);
        }
        if (o.getClass().isArray()) {
            return new JsonList((E[])o);
        }
        final JsonList l = new JsonList();
        l.add(o);
        return l;
    }
    
    public static List[] toListArray(final Object[] l) {
        if (l == null) {
            return null;
        }
        if (l instanceof List[]) {
            return (List[])l;
        }
        return toJsonListArray(l);
    }
    
    public static JsonList[] toJsonListArray(final Object[] l) {
        if (l == null) {
            return null;
        }
        if (l instanceof JsonList[]) {
            return (JsonList[])l;
        }
        final JsonList[] l2 = new JsonList[l.length];
        for (int i = 0; i < l.length; ++i) {
            l2[i] = toJsonList(l[i], null);
        }
        return l2;
    }
    
    public static JsonMap[] toJsonMapArray(final Object[] l) {
        if (l == null) {
            return null;
        }
        if (l instanceof JsonMap[]) {
            return (JsonMap[])l;
        }
        final JsonMap[] l2 = new JsonMap[l.length];
        for (int i = 0; i < l.length; ++i) {
            l2[i] = toJsonMap(l[i], null);
        }
        return l2;
    }
    
    public static Map[] toMapArray(final Object[] l) {
        if (l == null) {
            return null;
        }
        if (l instanceof Map[]) {
            return (Map[])l;
        }
        return toJsonMapArray(l);
    }
    
    public static Boolean[] toBooleanArray(final Object[] o) {
        if (o == null) {
            return null;
        }
        final Boolean[] b = new Boolean[o.length];
        for (int i = 0; i < o.length; ++i) {
            b[i] = toBoolean(o[i], null);
        }
        return b;
    }
    
    public static Integer[] toIntArray(final Object[] o) {
        if (o == null) {
            return null;
        }
        final Integer[] x = new Integer[o.length];
        for (int i = 0; i < o.length; ++i) {
            x[i] = toInt(o[i], null);
        }
        return x;
    }
    
    public static Long[] toLongArray(final Object[] o) {
        if (o == null) {
            return null;
        }
        final Long[] x = new Long[o.length];
        for (int i = 0; i < o.length; ++i) {
            x[i] = toLong(o[i], null);
        }
        return x;
    }
    
    public static String[] toStringArray(final Object[] o) {
        final String[] s = new String[o.length];
        for (int i = 0; i < o.length; ++i) {
            s[i] = toString(o[i], null);
        }
        return s;
    }
    
    public static String unEscapeChars(final String s, final char[] toEscape) {
        if (s == null) {
            return null;
        }
        if (s.length() == 0 || s.indexOf(92) == -1) {
            return s;
        }
        final StringBuffer sb = new StringBuffer(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);
            if (c == '\\' && i + 1 != s.length()) {
                final char c2 = s.charAt(i + 1);
                boolean isOneOf = false;
                for (int j = 0; j < toEscape.length && !isOneOf; isOneOf = (c2 == toEscape[j]), ++j) {}
                if (isOneOf) {
                    ++i;
                }
                else if (c2 == '\\') {
                    sb.append('\\');
                    ++i;
                }
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    protected static DataType getDataType(final Object o) {
        if (o == null) {
            return DataType.NULL;
        }
        if (o instanceof String || o instanceof Enum) {
            return DataType.STRING;
        }
        if (o instanceof Number || o instanceof Date || o instanceof Calendar) {
            return DataType.NUMBER;
        }
        if (o instanceof Boolean) {
            return DataType.BOOLEAN;
        }
        if (o instanceof Collection || o.getClass().isArray()) {
            return DataType.LIST;
        }
        if (o instanceof Map || BeanMapFactory.DEFAULT.forBean(o) != null) {
            return DataType.MAP;
        }
        return DataType.STRING;
    }
    
    public static int getInt(final String s, final int defaultVal) {
        if (!isNumeric(s)) {
            return defaultVal;
        }
        return Integer.parseInt(s);
    }
    
    public static boolean isNumeric(final String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        final char[] c = s.toCharArray();
        for (int i = (c[0] == '-') ? 1 : 0; i < c.length; ++i) {
            if (c[i] < '0' || c[i] > '9') {
                return false;
            }
        }
        return true;
    }
    
    protected static CharSequence read(Reader r, long length, final int bufferSize) throws IOException {
        length = ((length <= 0L) ? bufferSize : length);
        final StringBuilder sb = new StringBuilder((int)length);
        if (!(r instanceof BufferedReader)) {
            r = new BufferedReader(r, (length <= 0L || length > bufferSize) ? bufferSize : ((int)length));
        }
        final char[] buf = new char[Math.min(bufferSize, (int)length)];
        int i = 0;
        while ((i = r.read(buf)) != -1) {
            sb.append(buf, 0, i);
        }
        return sb;
    }
}
