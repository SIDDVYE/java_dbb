// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.Writer;
import com.ibm.jjson.beans.BeanMapFactory;
import java.text.DateFormat;

public class JsonSerializer extends Serializer
{
    public static final JsonSerializer DEFAULT;
    public static final JsonSerializer DEFAULT_CONDENSED;
    public static final JsonSerializer DEFAULT_STRICT;
    public static final JsonSerializer DEFAULT_STRICT_CONDENSED;
    public static final JsonSerializer DEFAULT_RECONSTRUCTIBLE;
    private boolean strictMode;
    private boolean useWhitespace;
    private boolean useIndentation;
    private boolean trimNulls;
    private boolean enumsAsStrings;
    private char quoteChar;
    private int maxDepth;
    private DateFormat dateFormat;
    private BeanMapFactory beanMapFactory;
    
    public JsonSerializer() {
        this.strictMode = false;
        this.useWhitespace = true;
        this.useIndentation = true;
        this.trimNulls = false;
        this.enumsAsStrings = true;
        this.quoteChar = '\"';
        this.maxDepth = 100;
        this.beanMapFactory = BeanMapFactory.DEFAULT;
    }
    
    public JsonSerializer clone() {
        try {
            return (JsonSerializer)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public JsonSerializer setStrictMode(final boolean strictMode) {
        this.strictMode = strictMode;
        return this;
    }
    
    public JsonSerializer setUseWhitespace(final boolean useWhitespace) {
        this.useWhitespace = useWhitespace;
        return this;
    }
    
    public JsonSerializer setUseIndentation(final boolean useIndentation) {
        this.useIndentation = useIndentation;
        return this;
    }
    
    public JsonSerializer setDateFormat(final DateFormat dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }
    
    public JsonSerializer setTrimNulls(final boolean trimNulls) {
        this.trimNulls = trimNulls;
        return this;
    }
    
    public JsonSerializer setEnumsAsStrings(final boolean enumsAsStrings) {
        this.enumsAsStrings = enumsAsStrings;
        return this;
    }
    
    public JsonSerializer setQuoteChar(final char quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }
    
    public JsonSerializer setBeanMapFactory(final BeanMapFactory beanMapFactory) {
        this.beanMapFactory = beanMapFactory;
        return this;
    }
    
    public JsonSerializer setMaxDepth(final int maxDepth) {
        this.maxDepth = maxDepth;
        return this;
    }
    
    @Override
    public Writer serialize(final Writer w, final Object o, final int indentation) throws IOException {
        this.serializeAnything(w, o, indentation);
        return w;
    }
    
    public String serializeFromXml(final String xml) throws ParseException, ParserConfigurationException, SAXException, IOException {
        return this.serialize(XmlParser.DEFAULT.parse(xml));
    }
    
    private Writer serializeAnything(final Writer w, Object o, final int depth) throws IOException {
        if (depth > this.maxDepth) {
            throw new SerializeException("Depth too deep.  Possible recursion.", o);
        }
        try {
            if (o instanceof PojoRest) {
                return this.serializeAnything(w, ((PojoRest)o).getRootObject(), depth);
            }
            if (o == null) {
                w.write("null");
            }
            else if (o instanceof String || (this.enumsAsStrings && o instanceof Enum)) {
                w.write(this.quoteChar + JsonUtils.toJsonString(o.toString(), this.quoteChar) + this.quoteChar);
            }
            else if (o instanceof Number || o instanceof Boolean) {
                w.write(o.toString());
            }
            else if (o instanceof Map) {
                this.serializeMap((Map)o, w, depth);
            }
            else if (o instanceof Date || o instanceof Calendar) {
                if (o instanceof Calendar) {
                    o = ((Calendar)o).getTime();
                }
                w.write((this.dateFormat == null) ? ("" + ((Date)o).getTime()) : (this.quoteChar + this.dateFormat.format((Date)o) + this.quoteChar));
            }
            else if (o instanceof Collection) {
                this.serializeCollection((Collection)o, w, depth);
            }
            else if (o.getClass().isArray()) {
                this.serializeCollection(Arrays.asList((Object[])o), w, depth);
            }
            else if (this.beanMapFactory != null) {
                final Map bean = this.beanMapFactory.forBean(o);
                if (bean != null) {
                    this.serializeMap(bean, w, depth);
                }
                else {
                    w.write(this.quoteChar + JsonUtils.toJsonString(o.toString(), this.quoteChar) + this.quoteChar);
                }
            }
            else {
                w.write(this.quoteChar + JsonUtils.toJsonString(o.toString(), this.quoteChar) + this.quoteChar);
            }
            return w;
        }
        catch (SerializeException e) {
            e.objectStack.addFirst(o);
            throw e;
        }
        catch (StackOverflowError e3) {
            throw new SerializeException("Stack overflow error", o);
        }
        catch (Throwable e2) {
            throw new SerializeException(e2, o);
        }
    }
    
    private Writer serializeMap(final Map m, final Writer out, final int depth) throws IOException {
        out.write(123);
        final Iterator i = m.entrySet().iterator();
        while (i.hasNext()) {
            final Map.Entry e = i.next();
            final Object value = e.getValue();
            if (this.trimNulls && value == null) {
                continue;
            }
            if (this.useIndentation) {
                Serializer.cr(out, depth + 1);
            }
            final String attr = (e.getKey() == null) ? "null" : e.getKey().toString();
            out.write(this.toJsonAttr(attr));
            out.write(58);
            if (this.useWhitespace) {
                out.write(32);
            }
            this.serializeAnything(out, e.getValue(), depth + 1);
            if (!i.hasNext()) {
                continue;
            }
            out.write(44);
            if (!this.useWhitespace) {
                continue;
            }
            out.write(32);
        }
        if (this.useIndentation) {
            Serializer.cr(out, depth);
        }
        out.write(125);
        return out;
    }
    
    private Writer serializeCollection(final Collection c, final Writer out, final int depth) throws IOException {
        out.write(91);
        final Iterator i = c.iterator();
        while (i.hasNext()) {
            if (this.useIndentation) {
                Serializer.cr(out, depth + 1);
            }
            this.serializeAnything(out, i.next(), depth + 1);
            if (i.hasNext()) {
                out.write(44);
                if (!this.useWhitespace) {
                    continue;
                }
                out.write(32);
            }
        }
        if (this.useIndentation) {
            Serializer.cr(out, depth);
        }
        out.write(93);
        return out;
    }
    
    private String toJsonAttr(final String s) {
        boolean doConvert = this.strictMode;
        char c;
        for (int i = 0; i < s.length() && !doConvert; doConvert |= ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') && c != '_'), ++i) {
            c = s.charAt(i);
        }
        if (!doConvert) {
            return s;
        }
        boolean useQuotes = this.strictMode;
        final StringBuffer sb = new StringBuffer(s.length() + 2);
        sb.append(this.quoteChar);
        for (int j = 0; j < s.length(); ++j) {
            final char c2 = s.charAt(j);
            if (c2 == '\n') {
                sb.append('\\').append('n');
            }
            else if (c2 == '\t') {
                sb.append('\\').append('t');
            }
            else if (c2 == '\'') {
                sb.append('\\').append('\'');
            }
            else if (c2 == '\"') {
                sb.append('\\').append('\"');
            }
            else if (c2 != '\r') {
                sb.append(c2);
            }
            if ((c2 < 'A' || c2 > 'Z') && (c2 < 'a' || c2 > 'z') && (c2 < '0' || c2 > '9') && c2 != '_') {
                useQuotes = true;
            }
        }
        sb.append(this.quoteChar);
        return useQuotes ? sb.toString() : sb.substring(1, sb.length() - 1);
    }
    
    static {
        DEFAULT = new JsonSerializer();
        DEFAULT_CONDENSED = new JsonSerializer().setUseWhitespace(false).setUseIndentation(false);
        DEFAULT_STRICT = new JsonSerializer().setStrictMode(true);
        DEFAULT_STRICT_CONDENSED = new JsonSerializer().setStrictMode(true).setUseWhitespace(false).setUseIndentation(false);
        DEFAULT_RECONSTRUCTIBLE = new JsonSerializer().setBeanMapFactory(BeanMapFactory.DEFAULT_RECONSTRUCTIBLE);
    }
    
    private static class SerializeException extends RuntimeException
    {
        protected LinkedList<Object> objectStack;
        private String msg;
        
        public SerializeException(final String msg, final Object o) {
            this.objectStack = new LinkedList<Object>();
            this.msg = msg;
            this.objectStack.add(o);
        }
        
        public SerializeException(final Throwable cause, final Object o) {
            super(cause);
            this.objectStack = new LinkedList<Object>();
            this.msg = cause.getMessage();
            this.objectStack.add(o);
        }
        
        @Override
        public String getMessage() {
            final StringBuilder sb = new StringBuilder("Exception in JsonSerializer: [" + this.msg + "].");
            sb.append("\nObject stack:");
            for (final Object o : this.objectStack) {
                sb.append("\n\t->" + o.getClass().getName());
            }
            return sb.toString();
        }
    }
}
