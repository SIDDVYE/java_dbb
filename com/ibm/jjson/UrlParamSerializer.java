// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.io.Writer;
import com.ibm.jjson.beans.BeanMapFactory;

public class UrlParamSerializer extends Serializer
{
    public static final UrlParamSerializer DEFAULT;
    public static final UrlParamSerializer DEFAULT_LAX;
    private boolean trimNulls;
    private Serializer valueSerializer;
    private BeanMapFactory beanMapFactory;
    
    public UrlParamSerializer() {
        this.trimNulls = false;
        this.valueSerializer = new JsonSerializer().setUseWhitespace(false).setUseIndentation(false).setQuoteChar('\'');
        this.beanMapFactory = BeanMapFactory.DEFAULT;
    }
    
    public UrlParamSerializer clone() {
        try {
            return (UrlParamSerializer)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public UrlParamSerializer setTrimNulls(final boolean trimNulls) {
        this.trimNulls = trimNulls;
        return this;
    }
    
    public UrlParamSerializer setValueSerializer(final Serializer valueSerializer) {
        this.valueSerializer = valueSerializer;
        return this;
    }
    
    public UrlParamSerializer setBeanMapFactory(final BeanMapFactory beanMapFactory) {
        this.beanMapFactory = beanMapFactory;
        return this;
    }
    
    @Override
    public Writer serialize(final Writer w, final Object o, final int depth) throws IOException {
        if (o == null) {
            return w;
        }
        final Map m = (o instanceof Map) ? ((Map)o) : this.beanMapFactory.forBean(o);
        char d = '?';
        for (final Map.Entry e : m.entrySet()) {
            final Object val = e.getValue();
            if (val != null || !this.trimNulls) {
                w.write(d);
                d = '&';
                w.write(encodeParamPart(e.getKey().toString()));
                w.write("=");
                w.write(encodeParamPart(this.valueSerializer.serialize(val)));
            }
        }
        return w;
    }
    
    public static String encodeParamPart(final String s) {
        try {
            if (s == null) {
                return null;
            }
            boolean needsReplace = false;
            for (int i = 0; i < s.length() && !needsReplace; ++i) {
                final char c = s.charAt(i);
                if (c == ' ' || c == '&' || c == '?' || c == '=' || c > '\u007f') {
                    needsReplace = true;
                }
            }
            if (!needsReplace) {
                return s;
            }
            final StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); ++j) {
                final char c2 = s.charAt(j);
                if (c2 == ' ') {
                    sb.append("+");
                }
                else if (c2 == '&' || c2 == '?' || c2 == '=' || c2 > '\u007f') {
                    sb.append(URLEncoder.encode("" + c2, "UTF-8"));
                }
                else {
                    sb.append(c2);
                }
            }
            return sb.toString();
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return s;
        }
    }
    
    static {
        DEFAULT = new UrlParamSerializer();
        DEFAULT_LAX = new UrlParamSerializer();
    }
}
