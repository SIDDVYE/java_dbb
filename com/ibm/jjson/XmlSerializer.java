// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.util.Iterator;
import com.ibm.jjson.beans.BeanMap;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Collection;
import java.util.Map;
import java.io.IOException;
import java.io.Writer;
import com.ibm.jjson.beans.BeanMapFactory;
import java.text.DateFormat;

public class XmlSerializer extends Serializer
{
    public static final XmlSerializer DEFAULT;
    private boolean useIndentation;
    private boolean renderTypeAttrs;
    private boolean enumsAsStrings;
    private boolean trimNulls;
    private char quoteChar;
    private String namespace;
    private String rootElementName;
    private DateFormat dateFormat;
    private BeanMapFactory beanMapFactory;
    
    public XmlSerializer() {
        this.useIndentation = true;
        this.renderTypeAttrs = true;
        this.enumsAsStrings = true;
        this.trimNulls = false;
        this.quoteChar = '\'';
        this.namespace = "";
        this.beanMapFactory = BeanMapFactory.DEFAULT;
    }
    
    public XmlSerializer clone() {
        try {
            return (XmlSerializer)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public XmlSerializer setQuoteChar(final char quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }
    
    public XmlSerializer setUseIndentation(final boolean useIndentation) {
        this.useIndentation = useIndentation;
        return this;
    }
    
    public XmlSerializer setDateFormat(final DateFormat dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }
    
    public XmlSerializer setRenderTypeAttrs(final boolean renderTypeAttrs) {
        this.renderTypeAttrs = renderTypeAttrs;
        return this;
    }
    
    public XmlSerializer setEnumsAsStrings(final boolean enumsAsStrings) {
        this.enumsAsStrings = enumsAsStrings;
        return this;
    }
    
    public XmlSerializer setTrimNulls(final boolean trimNulls) {
        this.trimNulls = trimNulls;
        return this;
    }
    
    public XmlSerializer setNamespace(final String namespace) {
        this.namespace = ((namespace == null) ? "" : (namespace + ":"));
        return this;
    }
    
    @Override
    public Writer serialize(final Writer w, final Object o, final int depth) throws IOException {
        return this.serialize(w, o, this.rootElementName, depth);
    }
    
    public Writer serialize(final Writer out, Object o, String elementName, final int depth) throws IOException {
        if (o instanceof PojoRest) {
            return this.serialize(out, ((PojoRest)o).getRootObject(), elementName, depth);
        }
        elementName = encodeName(elementName);
        String type = null;
        if (o == null) {
            type = "null";
        }
        else if (o instanceof String || (this.enumsAsStrings && o instanceof Enum)) {
            type = "string";
        }
        else if (o instanceof Number) {
            type = "number";
        }
        else if (o instanceof Boolean) {
            type = "boolean";
        }
        else if (o instanceof Map) {
            type = "object";
        }
        else if (o instanceof Collection) {
            type = "array";
        }
        else if (o instanceof Date || o instanceof Calendar) {
            if (o instanceof Calendar) {
                o = ((Calendar)o).getTime();
            }
            type = ((this.dateFormat == null) ? "number" : "string");
            if (this.dateFormat == null) {
                o = new Long(((Date)o).getTime());
            }
            else {
                o = this.dateFormat.format((Date)o);
            }
        }
        else if (o.getClass().isArray()) {
            type = "array";
            o = Arrays.asList((Object[])o);
        }
        else {
            final BeanMap bean = this.beanMapFactory.forBean(o);
            if (bean != null) {
                type = ((bean.getName() != null) ? bean.getName() : "object");
                o = bean;
            }
            else {
                type = "string";
            }
        }
        if (this.useIndentation && depth > 0) {
            Serializer.cr(out, depth);
        }
        out.write((elementName == null) ? ("<" + this.namespace + type + ">") : ("<" + this.namespace + elementName + (this.renderTypeAttrs ? (" type=" + this.quoteChar + type + this.quoteChar + "") : "") + ">"));
        if (o != null) {
            if (o instanceof String) {
                out.write(toValidXml(o.toString()));
            }
            else if (o instanceof Number || o instanceof Boolean) {
                out.write(o.toString());
            }
            else if (o instanceof Map) {
                final Map m = (Map)o;
                for (final Map.Entry e : m.entrySet()) {
                    if (!this.trimNulls || e.getValue() != null) {
                        final String attr = (e.getKey() == null) ? "null" : e.getKey().toString();
                        this.serialize(out, e.getValue(), attr, depth + 1);
                    }
                }
            }
            else if (o instanceof Collection) {
                final Collection c = (Collection)o;
                final Iterator i = c.iterator();
                while (i.hasNext()) {
                    this.serialize(out, i.next(), null, depth + 1);
                }
            }
            else {
                out.write(toValidXml(o.toString()));
            }
        }
        if ((o instanceof Map || o instanceof Collection) && this.useIndentation) {
            Serializer.cr(out, depth);
        }
        out.write((elementName == null) ? ("</" + this.namespace + type + ">") : ("</" + this.namespace + elementName + ">"));
        return out;
    }
    
    private static String encodeName(String s) {
        if (s == null) {
            return null;
        }
        boolean needsConvert = false;
        for (int i = 0; i < s.length() && !needsConvert; ++i) {
            final char c = s.charAt(i);
            if ((c >= '0' && c <= '\t') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_') {
                needsConvert = true;
            }
        }
        if (needsConvert) {
            final StringBuffer sb = new StringBuffer(s.length() + 12);
            for (int j = 0; j < s.length(); ++j) {
                final char c2 = s.charAt(j);
                if ((c2 >= '0' && c2 <= '\t') || (c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z') || c2 == '_') {
                    sb.append(c2);
                }
                else {
                    sb.append("_x" + toPaddedHex(c2) + "_");
                }
            }
            s = sb.toString();
        }
        return s;
    }
    
    private static String toValidXml(final String s) {
        if (s == null) {
            return "null";
        }
        boolean needsConvert = false;
        char c;
        for (int i = 0; i < s.length() && !needsConvert; needsConvert |= (c == '&' || c == '<' || c == '>' || !isValidXmlCharacter(c)), ++i) {
            c = s.charAt(i);
        }
        if (!needsConvert) {
            return s;
        }
        final StringBuffer sb = new StringBuffer(s.length());
        for (int j = 0; j < s.length(); ++j) {
            final char test = s.charAt(j);
            if (test == '&') {
                sb.append("&amp;");
            }
            else if (test == '<') {
                sb.append("&lt;");
            }
            else if (test == '>') {
                sb.append("&gt;");
            }
            else if (isValidXmlCharacter(test)) {
                sb.append(test);
            }
            else {
                sb.append("?x" + toPaddedHex(test));
            }
        }
        return sb.toString();
    }
    
    private static boolean isValidXmlCharacter(final char c) {
        return (c >= ' ' && c <= '\ud7ff') || c == '\n' || c == '\r' || (c >= '\ue000' && c <= '\ufffd') || (c >= 65536 && c <= 1114111);
    }
    
    private static String toPaddedHex(final int num) {
        final char[] n = new char[4];
        int a = num % 16;
        n[3] = (char)((a > 9) ? (65 + a - 10) : (48 + a));
        int base = 16;
        for (int i = 1; i < 4; ++i) {
            a = num / base % 16;
            base <<= 4;
            n[3 - i] = (char)((a > 9) ? (65 + a - 10) : (48 + a));
        }
        return new String(n);
    }
    
    static {
        DEFAULT = new XmlSerializer();
    }
}
