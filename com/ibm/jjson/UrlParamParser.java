// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.math.BigInteger;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.io.IOException;
import java.io.Reader;

public class UrlParamParser extends Parser
{
    private static final long serialVersionUID = 1L;
    public static UrlParamParser DEFAULT;
    private int bufferSize;
    
    public UrlParamParser() {
        this.bufferSize = 8096;
    }
    
    public UrlParamParser clone() {
        try {
            return (UrlParamParser)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public UrlParamParser setBufferSize(final int bufferSize) {
        this.bufferSize = bufferSize;
        return this;
    }
    
    @Override
    public JsonMap parse(final CharSequence cs) throws ParseException {
        return this.parseInto(cs, new JsonMap());
    }
    
    @Override
    public Object parse(final Reader r, final long length) throws ParseException, IOException {
        return this.parseInto(JsonUtils.read(r, 0L, this.bufferSize), new JsonMap());
    }
    
    protected JsonMap parseInto(final CharSequence cs, final JsonMap m) throws ParseException {
        try {
            if (cs == null || cs.length() == 0) {
                return m;
            }
            String s = (String)((cs instanceof String) ? cs : cs.toString());
            if (s.indexOf(63) != -1) {
                s = s.substring(s.indexOf(63) + 1);
            }
            final int S1 = 1;
            final int S2 = 2;
            int i1 = 0;
            int state = S1;
            String paramName = null;
            for (int j = 0; j < s.length(); ++j) {
                final char c = s.charAt(j);
                if (state == S1) {
                    if (c == '=') {
                        paramName = URLDecoder.decode(s.substring(i1, j), "UTF-8");
                        i1 = j + 1;
                        state = S2;
                    }
                    else if (c == '&') {
                        paramName = URLDecoder.decode(s.substring(i1, j), "UTF-8");
                        i1 = j + 1;
                        m.put(paramName, null);
                        state = S1;
                    }
                }
                else if (state == S2 && c == '&') {
                    final String val = URLDecoder.decode(s.substring(i1, j), "UTF-8");
                    m.put(paramName, this.interpretValue(val));
                    state = S1;
                    i1 = j + 1;
                }
            }
            if (state == S1 && i1 < s.length()) {
                m.put(URLDecoder.decode(s.substring(i1, s.length()), "UTF-8"), null);
            }
            else if (state == S2) {
                final String val2 = URLDecoder.decode(s.substring(i1, s.length()), "UTF-8");
                m.put(paramName, this.interpretValue(val2));
            }
        }
        catch (UnsupportedEncodingException ex) {}
        return m;
    }
    
    private Object interpretValue(final String s) {
        final char c2 = (s.length() == 0) ? '\0' : s.charAt(0);
        if (c2 == '{' || c2 == '[' || c2 == '\'') {
            return JsonParser.DEFAULT.parse(s);
        }
        if (s.equals("true") || s.equals("false")) {
            return Boolean.valueOf(s);
        }
        if (s.equals("null")) {
            return null;
        }
        if (this.isNumeric(s)) {
            final BigInteger bigInt = BigInteger.valueOf(Long.valueOf(s));
            return bigInt;
        }
        return s;
    }
    
    private boolean isNumeric(final String s) {
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
    
    @Override
    protected void parseInto(final CharSequence s, final Object o) throws ParseException {
        this.parseInto(s, (JsonMap)o);
    }
    
    @Override
    protected void parseInto(final Reader r, final long length, final Object o) throws ParseException, IOException {
        this.parseInto(JsonUtils.read(r, length, this.bufferSize), (JsonMap)o);
    }
    
    static {
        UrlParamParser.DEFAULT = new UrlParamParser();
    }
}
