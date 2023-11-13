// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import com.ibm.jjson.beans.BeanMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import com.ibm.jjson.beans.BeanMapFactory;
import java.lang.annotation.Annotation;
import java.util.Date;
import java.util.Calendar;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import com.ibm.jjson.beans.annotation.HtmlLink;

public class HtmlSerializer extends Serializer
{
    public static HtmlSerializer DEFAULT;
    private Class<HtmlLink> hyperlinkAnnotation;
    private boolean useIndentation;
    private DateFormat dateFormat;
    
    public HtmlSerializer() {
        this.hyperlinkAnnotation = HtmlLink.class;
        this.useIndentation = true;
        this.dateFormat = DateFormats.DEFAULT;
    }
    
    public HtmlSerializer clone() {
        try {
            return (HtmlSerializer)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public HtmlSerializer setUseIndentation(final boolean useIndentation) {
        this.useIndentation = useIndentation;
        return this;
    }
    
    public HtmlSerializer setDateFormat(final DateFormat dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }
    
    @Override
    public Writer serialize(final Writer w, final Object o, final int depth) throws IOException {
        this.serialize(null, o, w, depth);
        return w;
    }
    
    private void serialize(final String name, Object o, final Writer w, final int depth) throws IOException {
        if (o == null) {
            w.write("");
        }
        else if (o instanceof Calendar || o instanceof Date) {
            if (o instanceof Calendar) {
                o = ((Calendar)o).getTime();
            }
            final Date d = (Date)o;
            if (this.dateFormat == null) {
                w.write("" + d.getTime());
            }
            else {
                w.write(toValidHtml(this.dateFormat.format(d)));
            }
        }
        else if (o instanceof String) {
            final String string = (String)o;
            if (string.startsWith("<center>") && string.endsWith("</center>")) {
                w.write(string);
            }
            else {
                w.write(toValidHtml(o.toString()));
            }
        }
        else if (o instanceof Number || o instanceof Boolean || o instanceof Enum) {
            w.write(toValidHtml(o.toString()));
        }
        else if (o.getClass().isAnnotationPresent(this.hyperlinkAnnotation)) {
            final BeanMap m = BeanMapFactory.DEFAULT.forBean(o);
            final HtmlLink h = o.getClass().getAnnotation(this.hyperlinkAnnotation);
            final Object urlProp = m.get(h.urlProperty());
            final Object nameProp = m.get(h.nameProperty());
            w.write("<a href='" + urlProp + "'>" + toValidHtml((nameProp == null) ? null : nameProp.toString()) + "</a>");
        }
        else if (o instanceof Map) {
            this.serializeMap(name, (Map)o, w, depth);
        }
        else if (o instanceof Collection) {
            this.serializeCollection(name, (Collection)o, w, depth);
        }
        else if (o.getClass().isArray()) {
            this.serializeCollection(name, Arrays.asList((Object[])o), w, depth);
        }
        else {
            final BeanMap m = BeanMapFactory.DEFAULT.forBean(o);
            if (m != null) {
                this.serializeMap(name, m, w, depth);
            }
            else {
                w.write(toValidHtml(o.toString()));
            }
        }
    }
    
    private void serializeMap(final String name, final Map m, final Writer w, final int depth) throws IOException {
        if (this.useIndentation) {
            Serializer.cr(w, depth);
        }
        w.write("<table>");
        if (this.useIndentation) {
            Serializer.cr(w, depth + 1);
        }
        w.write("<tr><th>key</th><th>value</th></tr>");
        for (final Map.Entry e : m.entrySet()) {
            if (this.useIndentation) {
                Serializer.cr(w, depth + 1);
            }
            w.write("<tr><td>" + e.getKey() + "</td><td>");
            try {
                this.serialize(e.getKey().toString(), e.getValue(), w, depth + 2);
            }
            catch (Exception e2) {
                e2.printStackTrace(System.err);
                System.err.println("Couldn't serialize field [" + e.getKey() + "]");
            }
            w.write("</td></tr>");
        }
        if (this.useIndentation) {
            Serializer.cr(w, depth);
        }
        w.write("</table>\n");
    }
    
    private void serializeCollection(final String name, final Collection c, final Writer w, final int depth) throws IOException {
        if (this.useIndentation) {
            Serializer.cr(w, depth);
        }
        if (c.isEmpty()) {
            w.write((name == null) ? "No results" : "&nbsp;");
            return;
        }
        Object oc = c.iterator().next();
        if (oc instanceof String || oc instanceof Number || oc instanceof Boolean || oc instanceof Date || oc instanceof Enum || oc == null || oc.getClass().isAnnotationPresent(HtmlLink.class)) {
            w.write("<ol>");
            for (final Object o : c) {
                if (this.useIndentation) {
                    Serializer.cr(w, depth + 1);
                }
                w.write("<li>");
                this.serialize(name, o, w, depth + 2);
            }
            if (this.useIndentation) {
                Serializer.cr(w, depth);
            }
            w.write("</ol>");
        }
        else {
            if (!(oc instanceof Map)) {
                final Object oc2 = BeanMapFactory.DEFAULT.forBean(oc);
                if (oc2 == null) {
                    w.write(oc.toString());
                    return;
                }
                oc = oc2;
            }
            final List keys = new LinkedList(((Map)oc).keySet());
            w.write("<table><tr>");
            for (final Object key : keys) {
                w.write("<th>" + key + "</th>");
            }
            w.write("</tr>");
            for (final Object m : c) {
                w.write("<tr>");
                final Map m2 = (m instanceof Map) ? ((Map)m) : BeanMapFactory.DEFAULT.forBean(m);
                if (m2 == null) {
                    this.serialize(w, m, depth + 1);
                }
                else {
                    for (final Object key2 : keys) {
                        w.write("<td>");
                        this.serialize(key2.toString(), m2.get(key2), w, depth + 1);
                        w.write("</td>");
                    }
                }
                w.write("</tr>");
            }
            w.write("</table>");
        }
    }
    
    protected static String toValidHtml(final String s) {
        if (s == null) {
            return "null";
        }
        final StringBuffer sb = new StringBuffer(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char test = s.charAt(i);
            if (test == '&') {
                sb.append("&amp;");
            }
            else if (test == '<') {
                sb.append("&lt;");
            }
            else if (test == '>') {
                sb.append("&gt;");
            }
            else if (test == '\n') {
                sb.append("<br>");
            }
            else if (test == '\t') {
                sb.append("&nbsp;&nbsp;&nbsp;");
            }
            else if (Character.isISOControl(test)) {
                sb.append("&#" + (int)test + ";");
            }
            else {
                sb.append(test);
            }
        }
        return sb.toString();
    }
    
    static {
        HtmlSerializer.DEFAULT = new HtmlSerializer();
    }
}
