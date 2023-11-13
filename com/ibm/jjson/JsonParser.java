// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.util.Map;
import com.ibm.jjson.beans.BeanMapFactory;
import java.io.IOException;
import java.io.Reader;

public class JsonParser extends Parser
{
    private static final long serialVersionUID = 1L;
    public static final JsonParser DEFAULT;
    private static final int STATE_0 = 0;
    private static final int STATE_1 = 1;
    private static final int STATE_2 = 2;
    private static final int STATE_3 = 3;
    private static final int STATE_4 = 4;
    private static final int STATE_5 = 5;
    private static final int STATE_6 = 6;
    private static final int STATE_7 = 7;
    private int bufferSize;
    
    public JsonParser() {
        this.bufferSize = 8096;
    }
    
    public JsonParser clone() {
        try {
            return (JsonParser)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public JsonParser setBufferSize(final int iSetting) {
        this.bufferSize = iSetting;
        return this;
    }
    
    @Override
    public Object parse(final CharSequence s) throws ParseException {
        final MutableInt pos = new MutableInt(0);
        final Object o = this.parseAnything(s, pos);
        if (o == null) {
            return null;
        }
        this.validateEnd(s, pos);
        return o;
    }
    
    @Override
    public Object parse(final Reader r, final long length) throws ParseException, IOException {
        return this.parse(JsonUtils.read(r, length, this.bufferSize));
    }
    
    @Override
    protected void parseInto(final CharSequence s, final Object o) throws ParseException {
        final MutableInt pos = new MutableInt(0);
        if (o instanceof JsonMap) {
            this.parseMap((JsonMap)o, s, pos);
        }
        else if (o instanceof JsonList) {
            this.parseArray((JsonList)o, s, pos);
        }
        this.validateEnd(s, pos);
    }
    
    @Override
    protected void parseInto(final Reader r, final long length, final Object o) throws ParseException, IOException {
        this.parseInto(JsonUtils.read(r, length, this.bufferSize), o);
    }
    
    private void validateEnd(final CharSequence cs, final MutableInt pos) throws ParseException {
        final int length = cs.length();
        if (pos.val == length) {
            return;
        }
        this.skipCommentsAndSpace(cs, pos, true);
        if (pos.val < length) {
            throw new ParseException(cs, pos.val, "Remainder after parse.");
        }
    }
    
    private Object parseAnything(final CharSequence cs, final MutableInt pos) throws ParseException {
        if (cs == null) {
            return null;
        }
        this.skipCommentsAndSpace(cs, pos, true);
        final int length = cs.length();
        if (length == 0 || pos.val >= length) {
            return null;
        }
        final char c = cs.charAt(pos.val);
        if (c == '{') {
            return this.parseObject(cs, pos);
        }
        if (c == '[') {
            final JsonList list = new JsonList();
            return this.parseArray(list, cs, pos);
        }
        if (c == '\'' || c == '\"') {
            return this.parseString(cs, pos);
        }
        if ((c >= '0' && c <= '9') || c == '-') {
            return parseNumber(cs, pos);
        }
        if (c == 't' || c == 'f' || c == 'n') {
            return this.parseKeyword(cs, pos);
        }
        if (c == '/' || Character.isWhitespace(c)) {
            this.skipCommentsAndSpace(cs, pos, true);
            return this.parseAnything(cs, pos);
        }
        throw new ParseException(cs, pos.val, "Unrecognized syntax");
    }
    
    private Object parseKeyword(final CharSequence cs, final MutableInt pos) throws ParseException {
        Object o;
        try {
            final int count = (cs.charAt(pos.val) == 'f') ? 5 : 4;
            final String s = cs.subSequence(pos.val, pos.val + count).toString();
            if (s.equals("true")) {
                o = Boolean.TRUE;
            }
            else if (s.equals("false")) {
                o = Boolean.FALSE;
            }
            else {
                if (!s.equals("null")) {
                    throw new ParseException(cs, pos.val, "Unrecognized syntax.");
                }
                o = null;
            }
            pos.val += count;
        }
        catch (IndexOutOfBoundsException e) {
            throw new ParseException(cs, pos.val, "Unrecognized syntax.");
        }
        return o;
    }
    
    private void skipCommentsAndSpace(final CharSequence cs, final MutableInt pos, final boolean positionOnNext) {
        final int length = cs.length();
        while (pos.val < length) {
            final char c = cs.charAt(pos.val);
            if (!Character.isWhitespace(c)) {
                if (c != '/') {
                    if (!positionOnNext) {
                        --pos.val;
                    }
                    return;
                }
                this.skipComments(cs, pos);
            }
            ++pos.val;
        }
    }
    
    private void skipComments(final CharSequence cs, final MutableInt pos) {
        final char c = cs.charAt(++pos.val);
        final int length = cs.length();
        if (c == '*') {
            while (pos.val < length) {
                if (cs.charAt(++pos.val) == '*' && cs.charAt(++pos.val) == '/') {
                    return;
                }
            }
        }
        else if (c == '/') {
            while (pos.val < length) {
                ++pos.val;
                if (pos.val == length) {
                    return;
                }
                if (cs.charAt(pos.val) == '\n') {
                    return;
                }
            }
        }
        throw new ParseException(cs, pos.val, "Unrecognized syntax");
    }
    
    protected static Number parseNumber(final CharSequence cs, final MutableInt pos) {
        int i = pos.val;
        boolean isInt = false;
        boolean isHex = false;
        boolean isDouble = false;
        if (cs.charAt(i) == '-') {
            ++i;
        }
        if (cs.charAt(i) != '0') {
            isInt = true;
        }
        for (int length = cs.length(); i < length; ++i) {
            final char c = cs.charAt(i);
            if (c == 'x' || c == 'X') {
                isHex = true;
            }
            else if (c == '.') {
                isDouble = true;
            }
            else if ((c < '0' || c > '9') && (isHex || ((c < 'a' || c > 'f') && (c < 'A' || c > 'F'))) && (!isDouble || (c != 'e' && c != 'E' && c != '+' && c != '-'))) {
                break;
            }
        }
        String s = cs.subSequence(pos.val, i).toString();
        Number o = null;
        if (isDouble) {
            final Double d = Double.valueOf(s);
            final Float f = Float.valueOf(s);
            o = (Number)(d.toString().equals(f.toString()) ? f : d);
        }
        else if (isHex) {
            s = ((cs.charAt(pos.val) == '-') ? ('-' + s.substring(3)) : s.substring(2));
            o = (Number)((i - pos.val > 7) ? Long.valueOf(s, 16) : Integer.valueOf(s, 16));
        }
        else if (isInt) {
            final Long l = Long.valueOf(s, 10);
            o = (Number)((l < -2147483648L || l > 2147483647L) ? l : Integer.valueOf(l.intValue()));
        }
        else {
            o = (Number)((i - pos.val > 9) ? Long.valueOf(s, 8) : Integer.valueOf(s, 8));
        }
        pos.val = i;
        return o;
    }
    
    private String parseString(final CharSequence cs, final MutableInt pos) throws ParseException {
        final char qc = cs.charAt(pos.val++);
        int i = pos.val;
        String s = null;
        final StringBuilder sb = new StringBuilder();
        boolean isInEscape = false;
        final int length = cs.length();
        while (pos.val < length && s == null) {
            final char c = cs.charAt(pos.val);
            if (isInEscape) {
                switch (c) {
                    case 'n': {
                        sb.append('\n');
                        break;
                    }
                    case 'r': {
                        sb.append('\r');
                        break;
                    }
                    case 't': {
                        sb.append('\t');
                        break;
                    }
                    case 'f': {
                        sb.append('\f');
                        break;
                    }
                    case 'b': {
                        sb.append('\b');
                        break;
                    }
                    case '\\': {
                        sb.append('\\');
                        break;
                    }
                    case '/': {
                        sb.append('/');
                        break;
                    }
                    case '\'': {
                        sb.append('\'');
                        break;
                    }
                    case '\"': {
                        sb.append('\"');
                        break;
                    }
                    case 'u': {
                        sb.append((char)Integer.parseInt(cs.subSequence(pos.val + 1, pos.val + 5).toString(), 16));
                        pos.val += 4;
                        break;
                    }
                    default: {
                        throw new ParseException(cs, i, "Invalid escape sequence in string.");
                    }
                }
                isInEscape = false;
            }
            else if (c == '\\') {
                isInEscape = true;
            }
            else if (c == qc) {
                s = sb.toString();
            }
            else {
                sb.append(c);
            }
            ++pos.val;
        }
        if (s == null) {
            throw new ParseException(cs, i, "Could not find expected end character [" + qc + "].");
        }
        i = pos.val;
        while (pos.val < length) {
            final char c = cs.charAt(pos.val);
            if (c == '+') {
                while (pos.val < length) {
                    final char c2 = cs.charAt(++pos.val);
                    if (c2 == '\"' || c2 == '\'') {
                        return s + this.parseString(cs, pos);
                    }
                    if (c2 == '/') {
                        this.skipCommentsAndSpace(cs, pos, false);
                    }
                    else {
                        if (!Character.isWhitespace(c2)) {
                            throw new ParseException(cs, i, "Expected [\"] or ['] following [+].  c2=[" + c2 + "]");
                        }
                        continue;
                    }
                }
            }
            else if (c == '/') {
                this.skipCommentsAndSpace(cs, pos, false);
            }
            else if (!Character.isWhitespace(c)) {
                break;
            }
            ++pos.val;
        }
        pos.val = i;
        return s;
    }
    
    protected JsonList parseArray(final JsonList jsonList, final CharSequence cs, final MutableInt pos) {
        final int length = cs.length();
        int state = 1;
        while (pos.val < length) {
            final char c = cs.charAt(pos.val);
            switch (state) {
                case 1: {
                    if (c == '[') {
                        state = 5;
                        break;
                    }
                    return this.parseArray(jsonList, "[" + (Object)cs + "]", pos);
                }
                case 5: {
                    if (c == ']') {
                        ++pos.val;
                        return jsonList;
                    }
                    if (c == '/') {
                        this.skipCommentsAndSpace(cs, pos, false);
                        break;
                    }
                    if (!Character.isWhitespace(c)) {
                        jsonList.add(this.parseAnything(cs, pos));
                        --pos.val;
                        state = 6;
                        break;
                    }
                    break;
                }
                case 6: {
                    if (c == ',') {
                        state = 5;
                        break;
                    }
                    if (c == '/') {
                        this.skipCommentsAndSpace(cs, pos, false);
                        break;
                    }
                    if (c == ']') {
                        ++pos.val;
                        return jsonList;
                    }
                    break;
                }
            }
            ++pos.val;
        }
        switch (state) {
            case 1: {
                throw new ParseException(cs, pos.val, "Expected '[' at beginning of JSON array.");
            }
            case 5: {
                throw new ParseException(cs, pos.val, "Expected one of the following characters: {,[,',\",LITERAL.");
            }
            case 6: {
                throw new ParseException(cs, pos.val, "Expected ',' or ']'.");
            }
            default: {
                return null;
            }
        }
    }
    
    private String parseFieldName(final CharSequence cs, final MutableInt pos) {
        int i = pos.val;
        char c = cs.charAt(i);
        final char quoteChar = (c == '\'' || c == '\"') ? c : '\0';
        final int length = cs.length();
        if (quoteChar == '\0') {
            while (pos.val < length) {
                c = cs.charAt(pos.val);
                if (c == ':' || Character.isWhitespace(c) || c == '/') {
                    return cs.subSequence(i, pos.val).toString().intern();
                }
                ++pos.val;
            }
        }
        else {
            boolean isInEscape = false;
            ++i;
            ++pos.val;
            final StringBuilder str = new StringBuilder();
            while (pos.val < length) {
                c = cs.charAt(pos.val);
                if (c == '\\' && !isInEscape) {
                    isInEscape = true;
                }
                else {
                    if (c == quoteChar && !isInEscape) {
                        ++pos.val;
                        return str.toString().intern();
                    }
                    isInEscape = false;
                    str.append(c);
                }
                ++pos.val;
            }
        }
        throw new ParseException(cs, pos.val, "Couldn't find the end of the field name.");
    }
    
    protected Object parseObject(final CharSequence cs, final MutableInt pos) {
        final JsonMap map = new JsonMap();
        final JsonMap m = this.parseMap(map, cs, pos);
        if (m.containsKey("_class")) {
            try {
                return BeanMapFactory.DEFAULT_SAFE.newInstance(Class.forName((String)m.get("_class")), m).getBean();
            }
            catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
        return m;
    }
    
    protected JsonMap parseMap(final JsonMap jsonMap, final CharSequence cs, final MutableInt pos) {
        final int length = cs.length();
        int state = 0;
        String currAttr = null;
        while (pos.val < length) {
            final char c = cs.charAt(pos.val);
            switch (state) {
                case 0: {
                    if (c == '{') {
                        state = 2;
                        break;
                    }
                    break;
                }
                case 2: {
                    if (c == '}') {
                        ++pos.val;
                        return jsonMap;
                    }
                    if (c == '/') {
                        this.skipCommentsAndSpace(cs, pos, false);
                        break;
                    }
                    if (!Character.isWhitespace(c)) {
                        currAttr = this.parseFieldName(cs, pos);
                        --pos.val;
                        state = 3;
                        break;
                    }
                    break;
                }
                case 3: {
                    if (c == ':') {
                        state = 4;
                        break;
                    }
                    break;
                }
                case 4: {
                    if (c == '/') {
                        this.skipCommentsAndSpace(cs, pos, false);
                        break;
                    }
                    if (!Character.isWhitespace(c)) {
                        jsonMap.put(currAttr, this.parseAnything(cs, pos));
                        --pos.val;
                        state = 7;
                        break;
                    }
                    break;
                }
                case 7: {
                    if (c == ',') {
                        state = 2;
                        break;
                    }
                    if (c == '/') {
                        this.skipCommentsAndSpace(cs, pos, false);
                        break;
                    }
                    if (c == '}') {
                        ++pos.val;
                        return jsonMap;
                    }
                    break;
                }
            }
            ++pos.val;
        }
        switch (state) {
            case 0: {
                throw new ParseException(cs, pos.val, "Expected '{' at beginning of JSON object.");
            }
            case 2: {
                throw new ParseException(cs, pos.val, "Could not find attribute name on JSON object.");
            }
            case 3: {
                throw new ParseException(cs, pos.val, "Could not find ':' following attribute name on JSON object.");
            }
            case 4: {
                throw new ParseException(cs, pos.val, "Expected one of the following characters: {,[,',\",LITERAL.");
            }
            case 7: {
                throw new ParseException(cs, pos.val, "Could not find '}' marking end of JSON object.");
            }
            default: {
                return null;
            }
        }
    }
    
    static {
        DEFAULT = new JsonParser();
    }
    
    static class MutableInt
    {
        int val;
        
        public MutableInt(final int iVal) {
            this.val = 0;
            this.val = iVal;
        }
    }
}
