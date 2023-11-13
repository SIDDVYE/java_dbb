// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.net.URLEncoder;
import java.util.Formatter;
import com.ibm.jjson.JsonSerializer;
import java.util.Map;
import com.ibm.jjson.JsonParser;
import java.net.URLDecoder;
import com.ibm.jjson.JsonMap;
import com.ibm.jjson.JsonList;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CharsetEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.Charset;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.HashSet;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Pattern;

public class StringUtils
{
    private static Pattern javaIdPattern;
    private static Set<String> javaKeywords;
    protected static Pattern applySubREPattern;
    private static Pattern timePattern;
    private static long SECOND;
    private static long MINUTE;
    private static long HOUR;
    private static long DAY;
    private static long WEEK;
    private static long MONTH;
    private static long YEAR;
    private static Pattern replaceVarsPattern;
    
    public static String[] split(final String s, final char c) {
        return split(s, c, false);
    }
    
    public static String[] split(final String s, final char c, final boolean removeEscapes) {
        return split(s, c, removeEscapes, false);
    }
    
    public static String[] split(final String s, final char c, final boolean removeEscapes, final boolean preserveBlankSingleEntry) {
        final char[] unEscapeChars = { '\\', c };
        if (s == null) {
            return null;
        }
        if (isEmpty(s) && !preserveBlankSingleEntry) {
            return new String[0];
        }
        final List<String> l = new LinkedList<String>();
        final char[] sArray = s.toCharArray();
        int x1 = 0;
        int escapeCount = 0;
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] == '\\') {
                ++escapeCount;
            }
            else if (sArray[i] == c && escapeCount % 2 == 0) {
                final String s2 = new String(sArray, x1, i - x1);
                l.add(strip(removeEscapes ? unEscapeChars(s2, unEscapeChars) : s2));
                x1 = i + 1;
            }
            if (sArray[i] != '\\') {
                escapeCount = 0;
            }
        }
        final String s3 = new String(sArray, x1, sArray.length - x1);
        l.add(strip(removeEscapes ? unEscapeChars(s3, unEscapeChars) : s3));
        return l.toArray(new String[l.size()]);
    }
    
    public static String[] split2(final String s, final char c, final boolean removeEscapes) {
        return split(s, c, removeEscapes, false);
    }
    
    public static String[] splitQuoted(final String s, final char c) {
        return splitQuoted(s, c, false, false);
    }
    
    public static String[] splitQuoted(final String s, final char c, final boolean removeEscapes, final boolean removeQuotes) {
        return splitQuoted(s, c, removeEscapes, removeQuotes, false);
    }
    
    public static String[] splitQuoted(final String s, final char c, final boolean removeEscapes, final boolean removeQuotes, final boolean ignoreEmptyTokens) {
        return splitQuoted(s, c, removeEscapes ? EscapeHandling.REMOVE : EscapeHandling.DONT_REMOVE, removeQuotes, ignoreEmptyTokens);
    }
    
    public static String[] splitQuoted(final String s, final char c, final EscapeHandling removeEscapes, final boolean removeQuotes, final boolean ignoreEmptyTokens) {
        final char[] unEscapeChars = { '\\', c };
        final String quote = "\"";
        final String quotequote = "\"\"";
        final String apost = "'";
        final String apostapost = "''";
        if (s == null) {
            return null;
        }
        if (isEmpty(s)) {
            return new String[0];
        }
        final List<String> l = new LinkedList<String>();
        final char[] sArray = s.toCharArray();
        int x1 = 0;
        int escapeCount = 0;
        boolean inSingleQuote = false;
        boolean inDoubleQuote = false;
        for (int i = 0; i < sArray.length; ++i) {
            if (removeEscapes != EscapeHandling.IGNORE && sArray[i] == '\\') {
                ++escapeCount;
            }
            else if (escapeCount % 2 == 0) {
                if (sArray[i] == '\'' && !inDoubleQuote) {
                    inSingleQuote = !inSingleQuote;
                }
                else if (sArray[i] == '\"' && !inSingleQuote) {
                    inDoubleQuote = !inDoubleQuote;
                }
                else if (sArray[i] == c && !inSingleQuote && !inDoubleQuote) {
                    boolean isQuoted = false;
                    String s2 = strip(new String(sArray, x1, i - x1));
                    if (removeEscapes == EscapeHandling.REMOVE) {
                        s2 = unEscapeChars(s2, unEscapeChars);
                    }
                    if (removeQuotes && s2.length() > 1) {
                        final char c2 = s2.charAt(0);
                        final char c3 = s2.charAt(s2.length() - 1);
                        if ((c2 == '\'' && c3 == '\'') || (c2 == '\"' && c3 == '\"')) {
                            s2 = s2.substring(1, s2.length() - 1);
                            if (c2 == '\'') {
                                s2 = s2.replaceAll("''", "'");
                            }
                            else {
                                s2 = s2.replaceAll("\"\"", "\"");
                            }
                            isQuoted = true;
                        }
                    }
                    if (isQuoted || !ignoreEmptyTokens || !isEmpty(s2)) {
                        l.add(s2);
                    }
                    x1 = i + 1;
                }
            }
            if (sArray[i] != '\\') {
                escapeCount = 0;
            }
        }
        String s3 = strip(new String(sArray, x1, sArray.length - x1));
        if (removeEscapes == EscapeHandling.REMOVE) {
            s3 = unEscapeChars(s3, unEscapeChars);
        }
        if (removeQuotes && s3.length() > 1) {
            final char c4 = s3.charAt(0);
            final char c5 = s3.charAt(s3.length() - 1);
            if ((c4 == '\'' && c5 == '\'') || (c4 == '\"' && c5 == '\"')) {
                s3 = s3.substring(1, s3.length() - 1);
            }
        }
        if (!ignoreEmptyTokens || !isEmpty(s3)) {
            l.add(s3);
        }
        return l.toArray(new String[l.size()]);
    }
    
    public static String[] splitParenthesized(final String s, final char c, final boolean removeEscapes) {
        final char[] unEscapeChars = { '\\', c };
        if (s == null) {
            return null;
        }
        if (isEmpty(s)) {
            return new String[0];
        }
        final List<String> l = new LinkedList<String>();
        final char[] sArray = s.toCharArray();
        int parenthesisCount = 0;
        int escapeCount = 0;
        int x1 = 0;
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] == '(') {
                ++parenthesisCount;
            }
            else if (sArray[i] == ')') {
                --parenthesisCount;
            }
            else if (parenthesisCount == 0 && sArray[i] == '\\') {
                ++escapeCount;
            }
            else if (sArray[i] == c && parenthesisCount == 0 && escapeCount % 2 == 0) {
                String s2 = strip(new String(sArray, x1, i - x1));
                if (removeEscapes) {
                    s2 = unEscapeChars(s2, unEscapeChars);
                }
                l.add(s2);
                x1 = i + 1;
            }
            if (sArray[i] != '\\') {
                escapeCount = 0;
            }
        }
        final String s3 = strip(new String(sArray, x1, sArray.length - x1));
        l.add(s3);
        return l.toArray(new String[l.size()]);
    }
    
    public static String[] splitBracketed(final String s, final char c, final boolean removeEscapes) {
        final char[] unEscapeChars = { '\\', c };
        if (s == null) {
            return null;
        }
        if (isEmpty(s)) {
            return new String[0];
        }
        final List<String> l = new LinkedList<String>();
        final char[] sArray = s.toCharArray();
        int x1 = 0;
        int bracketCount = 0;
        int escapeCount = 0;
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] == '{') {
                ++bracketCount;
            }
            else if (sArray[i] == '}') {
                --bracketCount;
            }
            else if (bracketCount == 0 && sArray[i] == '\\') {
                ++escapeCount;
            }
            else if (sArray[i] == c && bracketCount == 0 && escapeCount % 2 == 0) {
                String s2 = strip(new String(sArray, x1, i - x1));
                if (removeEscapes) {
                    s2 = unEscapeChars(s2, unEscapeChars);
                }
                l.add(s2);
                x1 = i + 1;
            }
            if (sArray[i] != '\\') {
                escapeCount = 0;
            }
        }
        final String s3 = strip(new String(sArray, x1, sArray.length - x1));
        l.add(s3);
        return l.toArray(new String[l.size()]);
    }
    
    public static String[] splitOnAny(final String s, final String delim) {
        final LinkedList<String> strings = new LinkedList<String>();
        if (s != null && s.length() > 0) {
            final StringTokenizer tokens = new StringTokenizer(s, delim);
            int i = 0;
            while (tokens.hasMoreTokens()) {
                strings.add(tokens.nextToken());
                ++i;
            }
        }
        return strings.toArray(new String[strings.size()]);
    }
    
    public static String[] split(final String s, final String delim) {
        if (s == null) {
            return null;
        }
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        if (delim == null || delim.length() == 0) {
            throw new RuntimeException(((delim == null) ? "Null" : "Blank") + " delimiter passed to StringUtils.split(s, delim)");
        }
        final List<String> l = new LinkedList<String>();
        int i1 = 0;
        for (int i2 = 0; (i2 = s.indexOf(delim, i1)) != -1; i1 = i2 + delim.length()) {
            l.add(strip(s.substring(i1, i2)));
        }
        l.add(strip(s.substring(i1)));
        return l.toArray(new String[l.size()]);
    }
    
    public static String[] split(final String s) {
        if (s == null) {
            return null;
        }
        final List<String> l = new LinkedList<String>();
        final StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            l.add(st.nextToken());
        }
        return l.toArray(new String[l.size()]);
    }
    
    public static int countChars(final String s, final char c, final boolean ignoreEscapedChars) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        int escapeCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            final char sc = s.charAt(i);
            if (sc == '\\') {
                ++escapeCount;
            }
            else if (sc == c && escapeCount % 2 == 0) {
                ++n;
            }
            if (sc != '\\') {
                escapeCount = 0;
            }
        }
        return n;
    }
    
    public static String replace(final String s, final String from, String to) {
        if (s == null) {
            return null;
        }
        if (from == null || from.length() == 0 || s.indexOf(from) == -1) {
            return s;
        }
        if (to == null) {
            to = "";
        }
        final StringBuffer sb = new StringBuffer(s.length());
        int i1 = 0;
        for (int i2 = 0; (i2 = s.indexOf(from, i1)) != -1; i1 = i2 + from.length()) {
            sb.append(s.substring(i1, i2)).append(to);
        }
        return sb.append(s.substring(i1)).toString();
    }
    
    public static String replace(final String s, final char from, final char to) {
        return replace(s, from, to, false, false);
    }
    
    public static String replace(final String s, final char from, final char to, final boolean ignoreEscapedChars, final boolean ignoreQuoted) {
        if (s == null) {
            return null;
        }
        final char[] sArray = s.toCharArray();
        int escapeCount = 0;
        int singleQuoteCount = 0;
        int doubleQuoteCount = 0;
        for (int i = 0; i < sArray.length; ++i) {
            final char c = sArray[i];
            if (c == '\\' && ignoreEscapedChars) {
                ++escapeCount;
            }
            else if (escapeCount % 2 == 0) {
                if (c == '\'' && ignoreQuoted) {
                    ++singleQuoteCount;
                }
                else if (c == '\"' && ignoreQuoted) {
                    ++doubleQuoteCount;
                }
                else if (c == from && singleQuoteCount % 2 == 0 && doubleQuoteCount % 2 == 0) {
                    sArray[i] = to;
                }
            }
            if (sArray[i] != '\\') {
                escapeCount = 0;
            }
        }
        return new String(sArray);
    }
    
    public static String escapeChars(final String s, final char[] toEscape) {
        return escapeChars(s, toEscape, '\\');
    }
    
    public static String escapeDoubleQuotes(final String s) {
        return escapeChars(s, new char[] { '\"' }, '\\');
    }
    
    public static String escapeChar(final String s, final char c) {
        return escapeChars(s, new char[] { c }, '\\');
    }
    
    public static String escapeChars(final String s, final char[] toEscape, final char escapeChar) {
        if (s == null) {
            return null;
        }
        final StringBuffer sb = new StringBuffer(s.length());
        final char[] sArray = s.toCharArray();
        for (int i = 0; i < sArray.length; ++i) {
            boolean isOneOf = false;
            for (int j = 0; j < toEscape.length && !isOneOf; isOneOf = (sArray[i] == toEscape[j] || sArray[i] == escapeChar), ++j) {}
            if (isOneOf) {
                sb.append(escapeChar);
            }
            sb.append(sArray[i]);
        }
        return sb.toString();
    }
    
    public static String unEscapeChars(final String s, final char[] toEscape) {
        return unEscapeChars(s, toEscape, '\\');
    }
    
    public static String unEscapeChars(final String s, final char[] toEscape, final char escapeChar) {
        if (s == null) {
            return null;
        }
        if (s.length() == 0) {
            return s;
        }
        final StringBuffer sb = new StringBuffer(s.length());
        final char[] sArray = s.toCharArray();
        for (int i = 0; i < sArray.length; ++i) {
            final char c = sArray[i];
            if (c == escapeChar && i + 1 != sArray.length) {
                final char c2 = sArray[i + 1];
                boolean isOneOf = false;
                for (int j = 0; j < toEscape.length && !isOneOf; isOneOf = (c2 == toEscape[j]), ++j) {}
                if (isOneOf) {
                    ++i;
                }
                else if (c2 == escapeChar) {
                    sb.append(escapeChar);
                    ++i;
                }
            }
            sb.append(sArray[i]);
        }
        return sb.toString();
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
    
    public static String join(final Object[] o, String delim) {
        if (o == null) {
            return null;
        }
        if (delim == null) {
            delim = "";
        }
        final StringBuffer sb = new StringBuffer();
        if (o.length > 0) {
            sb.append(o[0]);
        }
        for (int i = 1; i < o.length; ++i) {
            sb.append(delim).append(o[i]);
        }
        return sb.toString();
    }
    
    public static String join(final int[] ints, final String delim) {
        final Object[] o = new Object[ints.length];
        for (int i = 0; i < ints.length; ++i) {
            o[i] = ints[i];
        }
        return join(o, delim);
    }
    
    public static String join(final Object[] o, final char delim, final boolean escapeExisting) {
        if (o == null) {
            return null;
        }
        final char[] c = { delim };
        final StringBuffer sb = new StringBuffer();
        if (o.length > 0) {
            sb.append(escapeExisting ? escapeChars((o[0] == null) ? "null" : o[0].toString(), c) : o[0]);
        }
        for (int i = 1; i < o.length; ++i) {
            sb.append(delim).append(escapeExisting ? escapeChars((o[i] == null) ? "null" : o[i].toString(), c) : o[i]);
        }
        return sb.toString();
    }
    
    public static String join(final Iterator i, String delim) {
        if (i == null) {
            return null;
        }
        if (delim == null) {
            delim = "";
        }
        final StringBuffer sb = new StringBuffer();
        if (i.hasNext()) {
            sb.append(i.next());
        }
        while (i.hasNext()) {
            sb.append(delim).append(i.next());
        }
        return sb.toString();
    }
    
    public static String join(final Collection c, final String delim) {
        return (c == null) ? "" : join(c.iterator(), delim);
    }
    
    public static String quoteAndJoin(final Iterator i, final String delim) {
        return quoteAndJoin(i, '\'', delim);
    }
    
    public static String quoteAndJoin(final Iterator i, final char quoteChar, final String delim) {
        return quoteAndJoin(i, quoteChar + "", quoteChar + "", delim);
    }
    
    public static String quoteAndJoin(final Iterator i, final String startQuote, final String endQuote, String delim) {
        if (i == null) {
            return null;
        }
        if (delim == null) {
            delim = "";
        }
        final StringBuffer sb = new StringBuffer();
        if (i.hasNext()) {
            sb.append(startQuote).append(i.next()).append(endQuote);
        }
        while (i.hasNext()) {
            sb.append(delim).append(startQuote).append(i.next()).append(endQuote);
        }
        return sb.toString();
    }
    
    public static String join(final Collection c, final char delim, final boolean escapeExisting) {
        return join(c.iterator(), delim, escapeExisting);
    }
    
    public static String join(final Iterator i, final char delim, final boolean escapeExisting) {
        if (i == null) {
            return null;
        }
        final char[] c = { delim };
        final StringBuffer sb = new StringBuffer();
        if (i.hasNext()) {
            final Object o = i.next();
            final String s = (o == null) ? "null" : o.toString();
            sb.append(escapeExisting ? escapeChars(s, c) : s);
        }
        while (i.hasNext()) {
            final Object o = i.next();
            final String s = (o == null) ? "null" : o.toString();
            sb.append(delim).append(escapeExisting ? escapeChars(s, c) : s);
        }
        return sb.toString();
    }
    
    public static String strip(final String s, final String stripChars) {
        if (s == null || s.length() == 0 || stripChars == null || stripChars.length() == 0) {
            return s;
        }
        final char[] sc = stripChars.toCharArray();
        final char[] sArray = s.toCharArray();
        int startPos = 0;
        int endPos = sArray.length - 1;
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] == ' ' || sArray[i] == '\t' || charIsOneOf(sArray[i], sc)) {
                ++startPos;
            }
            else {
                i = sArray.length;
            }
        }
        for (int i = endPos; i > startPos; --i) {
            if (sArray[i] == ' ' || sArray[i] == '\t' || charIsOneOf(sArray[i], sc)) {
                --endPos;
            }
            else {
                i = startPos;
            }
        }
        return new String(sArray, startPos, endPos - startPos + 1);
    }
    
    public static String strip(final String s) {
        return strip(s, " \t\r\n");
    }
    
    public static String[] strip(final String[] s, final boolean removeEmpty) {
        final List<String> l = new ArrayList<String>(s.length);
        for (int i = 0; i < s.length; ++i) {
            if (!removeEmpty || !isEmpty(s[i])) {
                l.add(s[i]);
            }
        }
        return l.toArray(new String[l.size()]);
    }
    
    private static boolean charIsOneOf(final char c, final char[] cArray) {
        for (int i = 0; i < cArray.length; ++i) {
            if (c == cArray[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isEmpty(final CharSequence s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        for (int len = s.length(), i = 0; i < len; ++i) {
            final char c = s.charAt(i);
            if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
                return false;
            }
        }
        return true;
    }
    
    public static boolean getBoolean(final String s) {
        return getBoolean(s, false);
    }
    
    public static boolean getBoolean(final String s, final boolean defaultVal) {
        if (s == null || s.length() == 0) {
            return defaultVal;
        }
        final char c = s.charAt(0);
        return c == 'T' || c == 't' || c == 'Y' || c == 'y' || c == '1';
    }
    
    public static int getInt(final String s, final int defaultVal) {
        if (!isNumeric(s)) {
            return defaultVal;
        }
        return Integer.parseInt(s);
    }
    
    public static int[] getInts(final String s) {
        if (s == null) {
            return new int[0];
        }
        final int[] l = new int[countChars(s, ',', false) + 1];
        int i = 0;
        for (final String s2 : split(s, ',')) {
            l[i++] = Integer.parseInt(s2);
        }
        return l;
    }
    
    public static Integer[] getIntegers(final String s) {
        if (s == null) {
            return new Integer[0];
        }
        final Integer[] l = new Integer[countChars(s, ',', false) + 1];
        int i = 0;
        for (final String s2 : split(s, ',')) {
            l[i++] = Integer.valueOf(s2);
        }
        return l;
    }
    
    public static Integer getInteger(final String s, final Integer defaultVal) {
        if (!isNumeric(s)) {
            return defaultVal;
        }
        return Integer.parseInt(s);
    }
    
    public static long getLong(final String s, final long defaultVal) {
        if (!isNumeric(s)) {
            return defaultVal;
        }
        return Long.parseLong(s);
    }
    
    public static Long getLong(final String s, final Long defaultVal) {
        if (!isNumeric(s)) {
            return defaultVal;
        }
        return Long.parseLong(s);
    }
    
    public static char getChar(final String s, final char defaultVal) {
        if (s == null || s.length() == 0) {
            return defaultVal;
        }
        return s.charAt(0);
    }
    
    public static String[] getVars(String type, final String s) {
        type += "{";
        final int varLength = type.length();
        final List<String> l = new LinkedList<String>();
        int x1 = s.indexOf(type);
        while (x1 != -1) {
            final int x2 = s.indexOf(125, x1);
            if (x2 != -1) {
                l.add(s.substring(x1 + varLength, x2));
                x1 = s.indexOf(type, x2);
            }
            else {
                x1 = -1;
            }
        }
        return l.toArray(new String[l.size()]);
    }
    
    public static String getString(final String s, final String def) {
        return coalesce(s, def);
    }
    
    public static String coalesce(final String... strings) {
        for (final String s : strings) {
            if (!isEmpty(s)) {
                return s;
            }
        }
        return strings[strings.length - 1];
    }
    
    public static String getString(String s, final String defaultVal, final boolean trim) {
        if (s == null || s.length() == 0) {
            s = defaultVal;
        }
        if (s == null) {
            return null;
        }
        return trim ? s.trim() : s;
    }
    
    public static LinkedHashMap<String, String> getMap(final String s) throws ParseException {
        return getMap(s, ',', '=');
    }
    
    public static LinkedHashMap<String, String> getMap(final String s, final char delim, final char equals) throws ParseException {
        final LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
        final String[] tokens = split(s, delim, true);
        for (int i = 0; i < tokens.length; ++i) {
            final String[] s2 = split(tokens[i], equals, true);
            if (s2.length != 2) {
                throw new ParseException("Invalid map string: [" + s + "]", 0);
            }
            final Object o = m.put(s2[0], s2[1]);
            if (o != null) {
                throw new ParseException("Duplicate keys in map string: [" + s + "]", 0);
            }
        }
        return m;
    }
    
    public static String makeUnicodeReadable(final String s) {
        final StringBuffer sb = new StringBuffer(s.length() * 2);
        for (int i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);
            if ((c < ' ' && c != '\t' && c != '\n') || c > '~') {
                sb.append("\\u" + toHex(c));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static String convertToCsv(final String input) {
        final StringBuffer buf = new StringBuffer();
        boolean specialCharExists = false;
        for (int i = 0; i < input.length(); ++i) {
            final char curChar = input.charAt(i);
            switch (curChar) {
                case '\n': {
                    specialCharExists = true;
                    break;
                }
                case ',': {
                    specialCharExists = true;
                    break;
                }
                case '\"': {
                    buf.append('\"');
                    specialCharExists = true;
                    break;
                }
            }
            buf.append(curChar);
        }
        return specialCharExists ? ("\"" + (Object)buf + "\"") : input;
    }
    
    public static String toValidXmlString(final String s) {
        if (s == null) {
            return "null";
        }
        final StringBuffer sb = new StringBuffer(s.length());
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            char c = chars[i];
            if (c == '>' || c == '<' || c == '\"' || c == '\'') {
                c = '?';
            }
            else if (c != '\n' && (c < ' ' || c > '\ud7ff') && (c < '\ue000' || c > '\ufffd')) {
                c = '?';
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static String htmlEscape(final String s) {
        final StringBuffer sb = new StringBuffer(s.length() * 2);
        final char[] cArray = s.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            final char c = cArray[i];
            if ((c >= '@' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '-' && c <= '9') || c == '*' || c == '+' || c == '_') {
                sb.append(c);
            }
            else if (c > '\u00ff') {
                sb.append("%u" + toHex(c));
            }
            else {
                sb.append("%" + toHex(c, 2));
            }
        }
        return sb.toString();
    }
    
    public static String toHex(final int num, final int numDigits) {
        final String s = toHex(num);
        return (numDigits == 4) ? s : s.substring(4 - numDigits);
    }
    
    public static String toHex(final int num) {
        final char[] c = new char[4];
        int a = num % 16;
        c[3] = (char)((a > 9) ? (65 + a - 10) : (48 + a));
        int base = 16;
        for (int i = 1; i < 4; ++i) {
            a = num / base % 16;
            base <<= 4;
            c[3 - i] = (char)((a > 9) ? (65 + a - 10) : (48 + a));
        }
        return new String(c);
    }
    
    public static String toHex(final long num) {
        final char[] c = new char[8];
        long a = num % 16L;
        c[7] = (char)((a > 9L) ? (65L + a - 10L) : (48L + a));
        int base = 16;
        for (int i = 1; i < 8; ++i) {
            a = num / base % 16L;
            base <<= 4;
            c[7 - i] = (char)((a > 9L) ? (65L + a - 10L) : (48L + a));
        }
        return new String(c);
    }
    
    public static boolean isValidIdentifier(final String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        final char[] c = s.toCharArray();
        for (int i = 0; i < c.length; ++i) {
            if (i == 0 && !Character.isLetter(c[i])) {
                return false;
            }
            if (!Character.isLetterOrDigit(c[i]) && c[i] != '_') {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isValidJavaIdentifier(final String s) {
        if (StringUtils.javaIdPattern == null) {
            final String idRegex = "([\\p{L}_$}]++[\\p{L}\\p{N}_$]*)+";
            StringUtils.javaIdPattern = Pattern.compile(idRegex);
            (StringUtils.javaKeywords = new HashSet<String>()).add("abstract");
            StringUtils.javaKeywords.add("assert");
            StringUtils.javaKeywords.add("boolean");
            StringUtils.javaKeywords.add("break");
            StringUtils.javaKeywords.add("byte");
            StringUtils.javaKeywords.add("case");
            StringUtils.javaKeywords.add("catch");
            StringUtils.javaKeywords.add("char");
            StringUtils.javaKeywords.add("class");
            StringUtils.javaKeywords.add("const");
            StringUtils.javaKeywords.add("continue");
            StringUtils.javaKeywords.add("default");
            StringUtils.javaKeywords.add("do");
            StringUtils.javaKeywords.add("double");
            StringUtils.javaKeywords.add("else");
            StringUtils.javaKeywords.add("enum");
            StringUtils.javaKeywords.add("extends");
            StringUtils.javaKeywords.add("final");
            StringUtils.javaKeywords.add("finally");
            StringUtils.javaKeywords.add("float");
            StringUtils.javaKeywords.add("for");
            StringUtils.javaKeywords.add("goto");
            StringUtils.javaKeywords.add("if");
            StringUtils.javaKeywords.add("implements");
            StringUtils.javaKeywords.add("import");
            StringUtils.javaKeywords.add("instanceof");
            StringUtils.javaKeywords.add("int");
            StringUtils.javaKeywords.add("interface");
            StringUtils.javaKeywords.add("long");
            StringUtils.javaKeywords.add("native");
            StringUtils.javaKeywords.add("new");
            StringUtils.javaKeywords.add("package");
            StringUtils.javaKeywords.add("private");
            StringUtils.javaKeywords.add("protected");
            StringUtils.javaKeywords.add("public");
            StringUtils.javaKeywords.add("return");
            StringUtils.javaKeywords.add("short");
            StringUtils.javaKeywords.add("static");
            StringUtils.javaKeywords.add("strictfp");
            StringUtils.javaKeywords.add("super");
            StringUtils.javaKeywords.add("switch");
            StringUtils.javaKeywords.add("synchronized");
            StringUtils.javaKeywords.add("this");
            StringUtils.javaKeywords.add("throw");
            StringUtils.javaKeywords.add("throws");
            StringUtils.javaKeywords.add("transient");
            StringUtils.javaKeywords.add("try");
            StringUtils.javaKeywords.add("void");
            StringUtils.javaKeywords.add("volatile");
            StringUtils.javaKeywords.add("while");
        }
        final Matcher matcher = StringUtils.javaIdPattern.matcher(s);
        return matcher.matches() && !StringUtils.javaKeywords.contains(s);
    }
    
    public static String escapeApostrophes(final String s) {
        final char[] c = s.toCharArray();
        final StringBuffer sb = new StringBuffer(s.length() + 1);
        int escapeCount = 0;
        boolean inSingleQuote = false;
        boolean inDoubleQuote = false;
        for (int i = 0; i < c.length; ++i) {
            if (c[i] == '\\') {
                ++escapeCount;
            }
            else if (escapeCount % 2 == 0) {
                if (c[i] == '\'') {
                    if (inDoubleQuote || (i > 0 && i < c.length - 1 && !Character.isWhitespace(c[i - 1]) && c[i - 1] != '+' && c[i - 1] != '-' && !Character.isWhitespace(c[i + 1]))) {
                        sb.append('\\');
                    }
                    else {
                        inSingleQuote = !inSingleQuote;
                    }
                }
                else if (c[i] == '\"') {
                    if (inSingleQuote || (i > 0 && i < c.length - 1 && !Character.isWhitespace(c[i - 1]) && c[i - 1] != '+' && c[i - 1] != '-' && !Character.isWhitespace(c[i + 1]))) {
                        sb.append('\\');
                    }
                    else {
                        inDoubleQuote = !inDoubleQuote;
                    }
                }
            }
            if (c[i] != '\\') {
                escapeCount = 0;
            }
            sb.append(c[i]);
        }
        if (inSingleQuote || inDoubleQuote) {
            throw new RuntimeException("Single or double quote not properly closed in the following expression: [" + s + "]");
        }
        return sb.toString();
    }
    
    public static String[] fragment(String s, final int length, final String encoding) throws UnsupportedEncodingException {
        final List<String> l = new LinkedList<String>();
        while (!isEmpty(s)) {
            final String fragment = truncateBytes(s, length, encoding);
            s = s.substring(fragment.length());
            l.add(fragment);
        }
        return l.toArray(new String[l.size()]);
    }
    
    public static String applySubRE(final String re, final String s) {
        final Matcher m = StringUtils.applySubREPattern.matcher(re);
        if (!m.find()) {
            return s;
        }
        final boolean isGlobal = m.group(3).indexOf(103) != -1;
        final boolean isMultiLine = m.group(3).indexOf(115) == -1;
        final Pattern p = Pattern.compile(m.group(1), isMultiLine ? 8 : 32);
        final Matcher m2 = p.matcher(s);
        if (isGlobal) {
            return m2.replaceAll(m.group(2));
        }
        return m2.replaceFirst(m.group(2));
    }
    
    public static boolean containsUnEscapedChars(final String s, final char[] chars) {
        final char[] sArray = s.toCharArray();
        boolean inEscape = false;
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] == '\\') {
                inEscape = !inEscape;
            }
            else {
                if (!inEscape) {
                    for (int j = 0; j < chars.length; ++j) {
                        if (sArray[i] == chars[j]) {
                            return true;
                        }
                    }
                }
                inEscape = false;
            }
        }
        return false;
    }
    
    public static boolean containsEscapedChars(final String s, final char[] chars) {
        final char[] sArray = s.toCharArray();
        boolean inEscape = false;
        for (int i = 0; i < sArray.length; ++i) {
            if (sArray[i] == '\\') {
                inEscape = !inEscape;
            }
            else {
                if (inEscape) {
                    for (int j = 0; j < chars.length; ++j) {
                        if (sArray[i] == chars[j]) {
                            return true;
                        }
                    }
                }
                inEscape = false;
            }
        }
        return false;
    }
    
    public static String chop(final String s, final int length) {
        return chop(s, length, false, false);
    }
    
    public static String chop(final String s, final int length, final boolean chopBeginning, final boolean doPad) {
        if (s == null) {
            return null;
        }
        if (s.length() < length) {
            if (doPad) {
                final StringBuilder sb = new StringBuilder(length);
                sb.append(s);
                for (int i = s.length(); i < length; ++i) {
                    sb.append(' ');
                }
                return sb.toString();
            }
            return s;
        }
        else {
            if (chopBeginning) {
                return s.substring(s.length() - length);
            }
            return s.substring(0, length);
        }
    }
    
    public static String[] addToArray(final String[] array, final String s) {
        final String[] newArray = (array == null) ? new String[1] : new String[array.length + 1];
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                newArray[i] = array[i];
            }
        }
        newArray[newArray.length - 1] = s;
        return newArray;
    }
    
    public static String toValidXml(final String s) {
        if (s == null) {
            return "null";
        }
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '&' || c == '<' || c == '>' || c == '\"' || Character.isISOControl(c)) {
                final StringBuffer sb = new StringBuffer(s.length());
                for (i = 0; i < s.length(); ++i) {
                    c = s.charAt(i);
                    if (c == '&') {
                        sb.append("&amp;");
                    }
                    else if (c == '<') {
                        sb.append("&lt;");
                    }
                    else if (c == '>') {
                        sb.append("&gt;");
                    }
                    else if (c == '\"') {
                        sb.append("&quot;");
                    }
                    else if (c != '\r' && c != '\n' && c != '\t' && Character.isISOControl(c)) {
                        sb.append("&#" + (int)c + ";");
                    }
                    else {
                        sb.append(c);
                    }
                }
                return sb.toString();
            }
        }
        return s;
    }
    
    public static String toValidHtml(final String s) {
        if (s == null) {
            return "null";
        }
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '&' || c == '<' || c == '>' || c == '\"' || c == '\n' || c == '\t' || Character.isISOControl(c)) {
                final StringBuffer sb = new StringBuffer(s.length());
                for (i = 0; i < s.length(); ++i) {
                    c = s.charAt(i);
                    if (c == '&') {
                        sb.append("&amp;");
                    }
                    else if (c == '<') {
                        sb.append("&lt;");
                    }
                    else if (c == '>') {
                        sb.append("&gt;");
                    }
                    else if (c == '\"') {
                        sb.append("&quot;");
                    }
                    else if (c == '\n') {
                        sb.append("<br>");
                    }
                    else if (c == '\t') {
                        sb.append("&nbsp;&nbsp;&nbsp;");
                    }
                    else if (Character.isISOControl(c)) {
                        sb.append("&#" + (int)c + ";");
                    }
                    else {
                        sb.append(c);
                    }
                }
                return sb.toString();
            }
        }
        return s;
    }
    
    public static String[] toValidHtml(final String[] s) {
        if (s == null) {
            return s;
        }
        for (int i = 0; i < s.length; ++i) {
            s[i] = toValidHtml(s[i]);
        }
        return s;
    }
    
    public static String toValidXmlAttr(String s) {
        if (s == null) {
            s = "";
        }
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '\"' || c == '\'' || c == '&' || c == '<' || Character.isISOControl(c)) {
                final StringBuffer sb = new StringBuffer(s.length());
                for (i = 0; i < s.length(); ++i) {
                    c = s.charAt(i);
                    if (c == '\"') {
                        sb.append("&quot;");
                    }
                    else if (c == '\'') {
                        sb.append("&#39;");
                    }
                    else if (c == '&') {
                        sb.append("&amp;");
                    }
                    else if (c == '<') {
                        sb.append("&lt;");
                    }
                    else if (Character.isISOControl(c)) {
                        sb.append("&#" + (int)c + ";");
                    }
                    else {
                        sb.append(c);
                    }
                }
                return sb.toString();
            }
        }
        return s;
    }
    
    public static String toXMLSafeString(final String in) {
        if (in == null) {
            return "";
        }
        final int len = in.length();
        if (len == 0) {
            return "";
        }
        final StringBuffer out = new StringBuffer(len);
        for (int i = 0; i < len; ++i) {
            final char c = in.charAt(i);
            switch (c) {
                case '<': {
                    out.append("&lt;");
                    break;
                }
                case '>': {
                    out.append("&gt;");
                    break;
                }
                case '&': {
                    out.append("&amp;");
                    break;
                }
                case '\"': {
                    out.append("&quot;");
                    break;
                }
                case '\'': {
                    out.append("&#039;");
                    break;
                }
                default: {
                    out.append(c);
                    break;
                }
            }
        }
        return out.toString();
    }
    
    public static String toValidJavascriptParam(String s) {
        if (s == null) {
            return null;
        }
        s = s.replaceAll("\\\\", "\\\\\\\\");
        s = s.replaceAll("\"", "\\\\&quot;");
        s = s.replaceAll("'", "\\\\&apos;");
        s = s.replaceAll("\\n", "\\\\n");
        return s;
    }
    
    public static long parseTime(String s) {
        if (StringUtils.timePattern == null) {
            StringUtils.timePattern = Pattern.compile("(\\d+)\\s*(\\w*)");
        }
        s = s.toUpperCase();
        if (s.equals("NEVER")) {
            return Long.MAX_VALUE;
        }
        if (s.equals("")) {
            return 0L;
        }
        final Matcher m = StringUtils.timePattern.matcher(s);
        if (!m.matches()) {
            throw new RuntimeException("Invalid time string format: [" + s + "]");
        }
        long n = Long.parseLong(m.group(1));
        final String x = m.group(2);
        if (x.startsWith("S")) {
            n *= StringUtils.SECOND;
        }
        else if (x.startsWith("MIN")) {
            n *= StringUtils.MINUTE;
        }
        else if (x.startsWith("H")) {
            n *= StringUtils.HOUR;
        }
        else if (x.startsWith("D")) {
            n *= StringUtils.DAY;
        }
        else if (x.startsWith("W")) {
            n *= StringUtils.WEEK;
        }
        else if (x.startsWith("MO")) {
            n *= StringUtils.MONTH;
        }
        else if (x.startsWith("Y")) {
            n *= StringUtils.YEAR;
        }
        return n;
    }
    
    public static String getTimeString(long l) {
        final List<String> parts = new LinkedList<String>();
        if (l == Long.MAX_VALUE) {
            return "never";
        }
        if (l >= StringUtils.YEAR) {
            final long x = l / StringUtils.YEAR;
            l %= StringUtils.YEAR;
            parts.add(x + " year" + ((x > 1L) ? "s" : ""));
        }
        if (l >= StringUtils.MONTH) {
            final long x = l / StringUtils.MONTH;
            l %= StringUtils.MONTH;
            parts.add(x + " month" + ((x > 1L) ? "s" : ""));
        }
        if (l >= StringUtils.DAY) {
            final long x = l / StringUtils.DAY;
            l %= StringUtils.DAY;
            parts.add(x + " day" + ((x > 1L) ? "s" : ""));
        }
        if (l >= StringUtils.HOUR) {
            final long x = l / StringUtils.HOUR;
            l %= StringUtils.HOUR;
            parts.add(x + " hour" + ((x > 1L) ? "s" : ""));
        }
        if (l >= StringUtils.MINUTE) {
            final long x = l / StringUtils.MINUTE;
            l %= StringUtils.MINUTE;
            parts.add(x + " minute" + ((x > 1L) ? "s" : ""));
        }
        if (l >= StringUtils.SECOND) {
            final long x = l / StringUtils.SECOND;
            l %= StringUtils.SECOND;
            parts.add(x + " second" + ((x > 1L) ? "s" : ""));
        }
        return join(parts.iterator(), ",");
    }
    
    public static String getTimeStringShort(long l) {
        final StringBuffer sb = new StringBuffer();
        if (l < 0L) {
            return "00:00:00.000";
        }
        long x = l / StringUtils.HOUR;
        l %= StringUtils.HOUR;
        sb.append(((x < 10L) ? "0" : "") + x + ":");
        x = l / StringUtils.MINUTE;
        l %= StringUtils.MINUTE;
        sb.append(((x < 10L) ? "0" : "") + x + ":");
        x = l / StringUtils.SECOND;
        l %= StringUtils.SECOND;
        sb.append(((x < 10L) ? "0" : "") + x + ".");
        x = l;
        sb.append(((x < 10L) ? "00" : ((x < 100L) ? "0" : "")) + x);
        return sb.toString();
    }
    
    public static boolean needsTruncate(final String s, final int length, final String charset) throws UnsupportedEncodingException {
        return s.getBytes(charset).length > length;
    }
    
    public static String truncateBytes(String s, final int length, final String charset) throws UnsupportedEncodingException {
        final Charset cs = Charset.forName(charset);
        final CharsetEncoder encoder = cs.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith(new byte[] { 63 });
        try {
            final CharBuffer in = CharBuffer.wrap(s);
            final ByteBuffer out = ByteBuffer.allocate(length);
            final CoderResult result = encoder.encode(in, out, true);
            boolean hadReplacement = false;
            final byte[] buf = out.array();
            for (int i = 0; i < buf.length && !hadReplacement; ++i) {
                if (buf[i] == 63) {
                    hadReplacement = true;
                }
            }
            String s2 = null;
            if (result.isOverflow() || hadReplacement) {
                out.limit(out.position());
                final CharsetDecoder decoder = cs.newDecoder();
                out.rewind();
                s2 = decoder.decode(out).toString();
            }
            else {
                s2 = s;
            }
            if (s2.getBytes(charset).length > length) {
                return s2.substring(0, s2.length() - 1);
            }
            return s2;
        }
        catch (Throwable t) {
            while (s.getBytes(charset).length > length) {
                s = s.substring(0, s.length() - 1);
            }
            return s;
        }
    }
    
    public static String getReaderContents(final Reader r) throws IOException {
        final StringBuffer sb = new StringBuffer();
        final char[] cbuf = new char[1024];
        int charsRead = 0;
        while ((charsRead = r.read(cbuf, 0, 1024)) != -1) {
            sb.append(cbuf, 0, charsRead);
        }
        return sb.toString();
    }
    
    public static boolean isHexChars(final String iString) {
        if (iString == null || iString.length() == 0) {
            return false;
        }
        final char[] c = iString.toCharArray();
        for (int i = 0; i < c.length; ++i) {
            if ((c[i] < '0' || c[i] > '9') && (c[i] < 'a' || c[i] > 'f') && (c[i] < 'A' || c[i] > 'F')) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isLike(final String pattern, final String source) {
        final char zeroOrMore = '*';
        final char anyChar = '?';
        return isLike(pattern, source, zeroOrMore, anyChar);
    }
    
    public static boolean isLike(final String pattern, final String source, final char zeroOrMore, final char anyChar) {
        if (source == null || pattern == null) {
            return false;
        }
        if (source.equals(pattern)) {
            return true;
        }
        final int patternLen = pattern.length();
        final StringBuffer wildcard = new StringBuffer(pattern);
        final StringBuffer receiver = new StringBuffer(source);
        int iText = 0;
        int iPattern = 0;
        int lastStar = 0;
        final int len = source.length();
        while (iPattern < patternLen) {
            final char p = wildcard.charAt(iPattern++);
            if (p == zeroOrMore) {
                if (iPattern >= patternLen) {
                    return true;
                }
                lastStar = iPattern;
            }
            else {
                if (iText >= len) {
                    return false;
                }
                final char t = receiver.charAt(iText++);
                if (p == anyChar || p == t) {
                    if (lastStar <= 0 || iPattern < patternLen || iText >= len) {
                        continue;
                    }
                }
                else if (lastStar == 0) {
                    return false;
                }
                final int matched = iPattern - lastStar - 1;
                iPattern = lastStar;
                iText -= matched;
            }
        }
        return iText >= len;
    }
    
    public static String[] removeDuplicates(final String[] dups) {
        final Set nd = new HashSet(dups.length);
        for (final String s : dups) {
            nd.add(s);
        }
        final String[] noDups = nd.toArray(new String[nd.size()]);
        return noDups;
    }
    
    public static String substitute(final String input, final Pattern p, final IStringSubstituter ss) {
        if (input == null) {
            return null;
        }
        final Matcher m = p.matcher(input);
        final StringBuffer sb = new StringBuffer(input.length());
        int i = 0;
        while (m.find()) {
            sb.append(input.substring(i, m.start()));
            sb.append(ss.substitute(m));
            i = m.end();
        }
        if (i == 0) {
            return input;
        }
        sb.append(input.substring(i));
        return sb.toString();
    }
    
    public static List<String> splitToList(final String s, final char d) {
        return splitToList(s, d, true);
    }
    
    public static List<String> splitToList(final String s, final char d, final boolean removeEscapes) {
        if (s == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(split(s, d, removeEscapes, false));
    }
    
    public static List<String> splitQuotedToList(final String s, final char d) {
        return splitQuotedToList(s, d, true, true, false);
    }
    
    public static List<String> splitQuotedToList(final String s, final char d, final boolean removeEscapes, final boolean removeQuotes, final boolean ignoreEmptyTokens) {
        if (s == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(splitQuoted(s, d, removeEscapes, removeQuotes, ignoreEmptyTokens));
    }
    
    public static JsonList splitList(final String s) {
        if (s == null) {
            return new JsonList();
        }
        if (s.startsWith("[")) {
            return new JsonList(s);
        }
        return new JsonList((Collection<? extends E>)splitToList(s, ','));
    }
    
    public static JsonMap<String, Object> parseUrlQuery(String queryString) throws Exception {
        if (isEmpty(queryString)) {
            return new JsonMap<String, Object>();
        }
        if (queryString.charAt(0) == '?') {
            queryString = queryString.substring(1);
        }
        final JsonMap<String, Object> m = new JsonMap<String, Object>();
        final int S1 = 1;
        final int S2 = 2;
        int i1 = 0;
        int state = S1;
        String paramName = null;
        for (int j = 0; j < queryString.length(); ++j) {
            final char c = queryString.charAt(j);
            if (state == S1) {
                if (c == '=') {
                    paramName = URLDecoder.decode(queryString.substring(i1, j), "UTF-8");
                    i1 = j + 1;
                    state = S2;
                }
                else if (c == '&') {
                    paramName = URLDecoder.decode(queryString.substring(i1, j), "UTF-8");
                    i1 = j + 1;
                    m.put(paramName, null);
                    state = S1;
                }
            }
            else if (state == S2 && c == '&') {
                final String val = URLDecoder.decode(queryString.substring(i1, j), "UTF-8");
                final char c2 = (val.length() == 0) ? '\0' : val.charAt(0);
                m.put(paramName, (c2 == '{' || c2 == '[') ? JsonParser.DEFAULT.parse(val) : val);
                state = S1;
                i1 = j + 1;
            }
        }
        if (state == S1 && i1 < queryString.length()) {
            m.put(URLDecoder.decode(queryString.substring(i1, queryString.length()), "UTF-8"), null);
        }
        else if (state == S2) {
            final String val2 = URLDecoder.decode(queryString.substring(i1, queryString.length()), "UTF-8");
            final char c3 = (val2.length() == 0) ? '\0' : val2.charAt(0);
            m.put(paramName, (c3 == '{' || c3 == '[') ? JsonParser.DEFAULT.parse(val2) : val2);
        }
        return m;
    }
    
    public static String createUrlQuery(final JsonMap queryParams) {
        char d = '?';
        final StringBuffer sb = new StringBuffer();
        for (final Map.Entry e : queryParams.entrySet()) {
            sb.append(d);
            d = '&';
            sb.append(urlEncode(e.getKey().toString()));
            final Object val = e.getValue();
            if (val != null) {
                sb.append("=");
                if (val instanceof Map || val instanceof Collection) {
                    sb.append(urlEncode(JsonSerializer.DEFAULT_CONDENSED.serialize(val)));
                }
                else {
                    sb.append(urlEncode(val.toString()));
                }
            }
        }
        return sb.toString();
    }
    
    public static List<String> toStringList(final Object o) {
        if (o == null) {
            return Collections.emptyList();
        }
        if (o instanceof Collection) {
            final Collection<?> c = (Collection<?>)o;
            final List<String> l2 = new ArrayList<String>(c.size());
            for (final Object o2 : c) {
                l2.add((o2 == null) ? null : o2.toString());
            }
            return l2;
        }
        return splitToList(o.toString(), ',');
    }
    
    public static String[] append(final String[] s, final String... add) {
        final List<String> l = new ArrayList<String>(s.length + add.length);
        l.addAll(Arrays.asList(s));
        l.addAll(Arrays.asList(add));
        return l.toArray(new String[l.size()]);
    }
    
    public static String[] prepend(final String[] s, final String... add) {
        final List<String> l = new ArrayList<String>(s.length + add.length);
        l.addAll(Arrays.asList(add));
        l.addAll(Arrays.asList(s));
        return l.toArray(new String[l.size()]);
    }
    
    public static String[] remove(final String[] s, final String... remove) {
        if (s == null) {
            return new String[0];
        }
        final List<String> l = new LinkedList<String>(Arrays.asList(s));
        for (final String r : remove) {
            l.remove(r);
        }
        return l.toArray(new String[l.size()]);
    }
    
    public static String replaceVars(final String in, final Map m) {
        return substitute(in, StringUtils.replaceVarsPattern, new IStringSubstituter() {
            @Override
            public String substitute(final Matcher matcher) {
                final String v = matcher.group(1);
                return m.containsKey(v) ? m.get(v).toString() : null;
            }
        });
    }
    
    public static String repeat(final String pattern, final int n) {
        return repeat(pattern, n, null);
    }
    
    public static String repeat(final String pattern, final int n, final String separator) {
        return repeatAndAppend(new StringBuilder(), pattern, n, separator).toString();
    }
    
    public static StringBuilder repeatAndAppend(final StringBuilder sb, final String pattern, final int n, final String separator) {
        for (int i = 0; i < n; ++i) {
            sb.append(pattern);
            if (i < n - 1 && separator != null) {
                sb.append(separator);
            }
        }
        return sb;
    }
    
    public static String format(final String s, final Object... args) {
        final StringBuilder sb = new StringBuilder();
        new Formatter(sb).format(s, args);
        return sb.toString();
    }
    
    public static String bytesToHex(final byte[] b) {
        final StringBuffer sb = new StringBuffer(b.length * 2);
        for (int i = 0; i < b.length; ++i) {
            final int v = b[i] & 0xFF;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }
    
    public static byte[] hexToBytes(final String s) {
        final byte[] b = new byte[s.length() / 2];
        for (int i = 0; i < b.length; ++i) {
            final int index = i * 2;
            final int v = Integer.parseInt(s.substring(index, index + 2), 16);
            b[i] = (byte)v;
        }
        return b;
    }
    
    public static String toValidUrl(final String url) {
        boolean needsEncoding = false;
        for (int i = 0; i < url.length() && !needsEncoding; ++i) {
            if (url.charAt(i) > '\u007f' || url.charAt(i) == ' ') {
                needsEncoding = true;
            }
        }
        if (!needsEncoding) {
            return url;
        }
        final StringBuilder sb = new StringBuilder(url.length() * 2);
        for (int j = 0; j < url.length(); ++j) {
            final char c = url.charAt(j);
            if (c == ' ') {
                sb.append('+');
            }
            else if (c > '\u007f') {
                sb.append(urlEncode("" + c));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static String trimEnd(final String iString) {
        int i;
        for (i = iString.length() - 1; i > 0 && Character.isWhitespace(iString.charAt(i)); --i) {}
        return iString.substring(0, i + 1);
    }
    
    public static String getStackTrace(final Throwable t) {
        if (t == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(t.toString() + "\n");
        for (final StackTraceElement e : t.getStackTrace()) {
            sb.append("\tat " + e + "\n");
        }
        StackTraceElement[] parentStack = t.getStackTrace();
        for (Throwable cause = t.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("Caused by: " + cause + "\n");
            final StackTraceElement[] currentStack = cause.getStackTrace();
            final int duplicates = countTraceDuplicates(currentStack, parentStack);
            for (int i = 0; i < currentStack.length - duplicates; ++i) {
                sb.append("\tat " + currentStack[i] + "\n");
            }
            if (duplicates > 0) {
                sb.append("\t... " + duplicates + " more\n");
            }
            parentStack = currentStack;
        }
        return sb.toString();
    }
    
    private static int countTraceDuplicates(final StackTraceElement[] currentStack, final StackTraceElement[] parentStack) {
        int duplicates = 0;
        int parentIndex = parentStack.length;
        int i = currentStack.length;
        while (--i >= 0 && --parentIndex >= 0) {
            final StackTraceElement parentFrame = parentStack[parentIndex];
            if (!parentFrame.equals(currentStack[i])) {
                break;
            }
            ++duplicates;
        }
        return duplicates;
    }
    
    public static String urlEncode(String s) {
        try {
            s = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return s;
    }
    
    static {
        StringUtils.javaIdPattern = null;
        StringUtils.javaKeywords = null;
        StringUtils.applySubREPattern = Pattern.compile("^s/(.*[^/])/(.*)/(.*)$");
        StringUtils.SECOND = 1000L;
        StringUtils.MINUTE = StringUtils.SECOND * 60L;
        StringUtils.HOUR = StringUtils.MINUTE * 60L;
        StringUtils.DAY = StringUtils.HOUR * 24L;
        StringUtils.WEEK = StringUtils.DAY * 7L;
        StringUtils.MONTH = StringUtils.DAY * 31L;
        StringUtils.YEAR = StringUtils.DAY * 365L;
        StringUtils.replaceVarsPattern = Pattern.compile("\\{([^\\}]+)\\}");
    }
    
    public enum EscapeHandling
    {
        REMOVE, 
        DONT_REMOVE, 
        IGNORE;
    }
}
