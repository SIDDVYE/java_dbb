// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.proto;

import java.util.Map;
import com.ibm.jjson.beans.BeanMapFactory;
import com.ibm.jjson.JsonUtils;
import com.ibm.jjson.JsonList;
import com.ibm.jjson.JsonMap;
import com.ibm.jjson.ParseException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class JsonParser2
{
    private static final int ARRAY_S0 = 0;
    private static final int ARRAY_S1 = 1;
    private static final int ARRAY_S2 = 2;
    private static final int BUFFER_SIZE = 65535;
    private static final int MAP_S0 = 0;
    private static final int MAP_S1 = 1;
    private static final int MAP_S2 = 2;
    private static final int MAP_S3 = 3;
    private static final int MAP_S4 = 4;
    
    private JsonParser2() {
    }
    
    public static Object parse(final CharSequence s) throws ParseException {
        try {
            return parse(new StringReader(s.toString()));
        }
        catch (IOException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
    
    public static Object parse(final Reader r) throws ParseException, IOException {
        final PeekableReader pr = (PeekableReader)((r instanceof PeekableReader) ? r : new PeekableReader(r, 65535));
        final Object o = parseAnything(pr);
        skipCommentsAndSpace(pr);
        validateEnd(pr);
        return o;
    }
    
    public static boolean parseInto(final PeekableReader r, final Object o) throws ParseException, IOException {
        skipCommentsAndSpace(r);
        r.peekReset();
        if (o instanceof JsonMap) {
            parseMap((JsonMap)o, r);
        }
        else if (o instanceof JsonList) {
            parseArray((JsonList)o, r);
        }
        skipCommentsAndSpace(r);
        final int c = r.peek();
        r.peekReset();
        return c != -1;
    }
    
    private static void validateEnd(final PeekableReader r) throws ParseException, IOException {
        if (r.read() != -1) {
            throw new ParseException(r.getLineNo(), r.getColumnNo(), "Remainder after parse.");
        }
    }
    
    private static Object parseAnything(final PeekableReader r) throws ParseException, IOException {
        r.peekReset();
        final int c = r.peek();
        r.peekReset();
        if (c == -1) {
            return null;
        }
        if (c == 123) {
            return parseObject(r);
        }
        if (c == 91) {
            return parseArray(new JsonList(), r);
        }
        if (c == 39 || c == 34) {
            return parseString(r);
        }
        if ((c >= 48 && c <= 57) || c == 45) {
            return parseNumber(r);
        }
        if (c == 102 || c == 110 || c == 116) {
            return parseKeyword(r);
        }
        if (c == 47 || Character.isWhitespace(c)) {
            skipCommentsAndSpace(r);
            return parseAnything(r);
        }
        throw new ParseException(r.getLineNo(), r.getColumnNo(), "Unrecognized syntax");
    }
    
    private static Object parseKeyword(final PeekableReader r) throws ParseException, IOException {
        final int c = r.peek();
        final int count = (c == 102) ? 5 : 4;
        final String s = r.readString(count);
        if (s.equals("true")) {
            return Boolean.TRUE;
        }
        if (s.equals("false")) {
            return Boolean.FALSE;
        }
        if (s.equals("null")) {
            return null;
        }
        throw new ParseException(r.getLineNo(), r.getColumnNo(), "Unrecognized syntax.");
    }
    
    private static void skipCommentsAndSpace(final PeekableReader r) throws IOException {
        int c;
        while ((c = r.peek()) != -1) {
            if (Character.isWhitespace(c)) {
                continue;
            }
            if (c != 47) {
                r.reset(-1);
                return;
            }
            r.reset(-1);
            skipComments(r);
        }
        r.reset(0);
    }
    
    private static void skipComments(final PeekableReader r) throws IOException {
        r.read();
        int c = r.read();
        if (c == 42) {
            while ((c = r.read()) != -1) {
                if (c == 42 && r.read() == 47) {
                    return;
                }
            }
        }
        else if (c == 47) {
            while ((c = r.read()) != -1) {
                if (r.read() == 10) {
                    return;
                }
            }
        }
        throw new ParseException(r.getLineNo(), r.getColumnNo(), "Unrecognized syntax");
    }
    
    private static Number parseNumber(final PeekableReader r) throws IOException {
        boolean isDouble = false;
        boolean isHex = false;
        boolean isInt = false;
        int c = r.peek();
        if (c == 45) {
            c = r.peek();
        }
        if (c != 48) {
            isInt = true;
        }
        while ((c = r.peek()) != -1) {
            if (c == 120 || c == 88) {
                isHex = true;
            }
            else if (c == 46) {
                isDouble = true;
            }
            else {
                if ((c >= 48 && c <= 57) || (isHex && ((c >= 97 && c <= 102) || (c >= 65 && c <= 70)))) {
                    continue;
                }
                if (!isDouble) {
                    break;
                }
                if (c == 101 || c == 69 || c == 43) {
                    continue;
                }
                if (c == 45) {
                    continue;
                }
                break;
            }
        }
        String s = r.read(-1);
        Number o = null;
        if (isDouble) {
            o = Double.valueOf(s);
        }
        else if (isHex) {
            s = ((s.charAt(0) == '-') ? ('-' + s.substring(3)) : s.substring(2));
            o = (Number)((s.length() > 7) ? Long.valueOf(s, 16) : Integer.valueOf(s, 16));
        }
        else if (isInt) {
            o = (Number)((s.length() > 8) ? Long.valueOf(s, 10) : Integer.valueOf(s, 10));
        }
        else {
            o = (Number)((s.length() > 9) ? Long.valueOf(s, 8) : Integer.valueOf(s, 8));
        }
        return o;
    }
    
    private static String parseString(final PeekableReader r) throws ParseException, IOException {
        final int qc = r.read();
        String s = null;
        boolean isInEscape = false;
        boolean hasEscapes = false;
        int c;
        while ((c = r.peek()) != -1 && s == null) {
            if (c == 92) {
                isInEscape = !isInEscape;
                hasEscapes = true;
            }
            else if (!isInEscape && c == qc) {
                s = r.read(-1);
            }
            else {
                isInEscape = false;
            }
        }
        if (s == null) {
            throw new ParseException(r.getLineNo(), r.getColumnNo(), "Could not find expected end character [" + qc + "].");
        }
        r.read();
        if (hasEscapes) {
            s = JsonUtils.unEscapeChars(s, new char[] { '\'', '\"' });
        }
        while ((c = r.peek()) != -1) {
            if (c == 43) {
                r.readPeeked();
                while ((c = r.peek()) != -1) {
                    if (c == 34 || c == 39) {
                        r.reset(-1);
                        return s + parseString(r);
                    }
                    if (c == 47) {
                        r.reset(-1);
                        skipCommentsAndSpace(r);
                    }
                    else {
                        if (!Character.isWhitespace(c)) {
                            throw new ParseException(r.getLineNo(), r.getColumnNo(), "Expected [\"] or ['] following [+].  c=[" + c + "]");
                        }
                        continue;
                    }
                }
            }
            else if (c == 47) {
                r.reset(-1);
                skipCommentsAndSpace(r);
            }
            else {
                if (!Character.isWhitespace(c)) {
                    r.peekReset();
                    break;
                }
                continue;
            }
        }
        return s;
    }
    
    private static JsonList parseArray(final JsonList jsonList, final PeekableReader r) throws IOException {
        int state = 0;
        int c;
        while ((c = r.peek()) != -1) {
            switch (state) {
                case 0: {
                    if (c == 91) {
                        state = 1;
                        continue;
                    }
                    continue;
                }
                case 1: {
                    if (c == 93) {
                        return jsonList;
                    }
                    if (c == 47) {
                        r.reset(-1);
                        skipCommentsAndSpace(r);
                        continue;
                    }
                    if (!Character.isWhitespace(c)) {
                        r.reset(-1);
                        jsonList.add(parseAnything(r));
                        state = 2;
                        continue;
                    }
                    continue;
                }
                default: {
                    if (c == 44) {
                        state = 1;
                        continue;
                    }
                    if (c == 47) {
                        r.reset(-1);
                        skipCommentsAndSpace(r);
                        continue;
                    }
                    if (c == 93) {
                        r.reset(0);
                        return jsonList;
                    }
                    continue;
                }
            }
        }
        switch (state) {
            case 0: {
                throw new ParseException(r.getLineNo(), r.getColumnNo(), "Expected '[' at beginning of JSON array.");
            }
            case 1: {
                throw new ParseException(r.getLineNo(), r.getColumnNo(), "Expected one of the following characters: {,[,',\",LITERAL.");
            }
            default: {
                throw new ParseException(r.getLineNo(), r.getColumnNo(), "Expected ',' or ']'.");
            }
        }
    }
    
    private static String parseFieldName(final PeekableReader r) throws IOException {
        r.peekReset();
        int c = r.peek();
        final int quoteChar = (c == 39 || c == 34) ? c : 0;
        if (quoteChar == 0) {
            while ((c = r.peek()) != -1) {
                if (c == 58 || Character.isWhitespace(c) || c == 47) {
                    return r.read(-1).intern();
                }
            }
        }
        else {
            boolean isInEscape = false;
            r.read();
            while ((c = r.peek()) != -1) {
                if (c == 92) {
                    isInEscape = !isInEscape;
                }
                else {
                    if (c == quoteChar && !isInEscape) {
                        final String s = r.read(-1).intern();
                        r.read();
                        return s;
                    }
                    continue;
                }
            }
        }
        throw new ParseException(r.getLineNo(), r.getColumnNo(), "Couldn't find the end of the field name.");
    }
    
    private static Object parseObject(final PeekableReader r) throws IOException {
        final JsonMap m = parseMap(new JsonMap(), r);
        if (m.containsKey("_class")) {
            try {
                return BeanMapFactory.DEFAULT.newInstance(Class.forName((String)m.get("_class")), m).getBean();
            }
            catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
        return m;
    }
    
    private static JsonMap parseMap(final JsonMap jsonMap, final PeekableReader r) throws IOException {
        int state = 0;
        String currAttr = null;
        int c;
        while ((c = r.peek()) != -1) {
            switch (state) {
                case 0: {
                    if (c == 123) {
                        state = 1;
                        continue;
                    }
                    continue;
                }
                case 1: {
                    if (c == 125) {
                        return jsonMap;
                    }
                    if (c == 47) {
                        r.reset(-1);
                        skipCommentsAndSpace(r);
                        continue;
                    }
                    if (!Character.isWhitespace(c)) {
                        r.reset(-1);
                        currAttr = parseFieldName(r);
                        state = 2;
                        continue;
                    }
                    continue;
                }
                case 2: {
                    if (c == 58) {
                        state = 3;
                        continue;
                    }
                    continue;
                }
                case 3: {
                    if (c == 47) {
                        r.reset(-1);
                        skipCommentsAndSpace(r);
                        continue;
                    }
                    if (!Character.isWhitespace(c)) {
                        r.reset(-1);
                        jsonMap.put(currAttr, parseAnything(r));
                        state = 4;
                        continue;
                    }
                    continue;
                }
                default: {
                    if (c == 44) {
                        state = 1;
                        continue;
                    }
                    if (c == 47) {
                        r.reset(-1);
                        skipCommentsAndSpace(r);
                        continue;
                    }
                    if (c == 125) {
                        r.reset(0);
                        return jsonMap;
                    }
                    continue;
                }
            }
        }
        switch (state) {
            case 0: {
                throw new ParseException(r.getLineNo(), r.getColumnNo(), "Expected '{' at beginning of JSON object.");
            }
            case 1: {
                throw new ParseException(r.getLineNo(), r.getColumnNo(), "Could not find attribute name on JSON object.");
            }
            case 2: {
                throw new ParseException(r.getLineNo(), r.getColumnNo(), "Could not find ':' following attribute name on JSON object.");
            }
            case 3: {
                throw new ParseException(r.getLineNo(), r.getColumnNo(), "Expected one of the following characters: {,[,',\",LITERAL.");
            }
            default: {
                throw new ParseException(r.getLineNo(), r.getColumnNo(), "Could not find '}' marking end of JSON object.");
            }
        }
    }
}
