// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java.internal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import com.ibm.json.java.OrderedJSONObject;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.io.IOException;
import java.io.Writer;

public class Serializer
{
    private Writer writer;
    
    public Serializer(final Writer writer) {
        this.writer = writer;
    }
    
    public void flush() throws IOException {
        this.writer.flush();
    }
    
    public void close() throws IOException {
        this.writer.close();
    }
    
    public Serializer writeRawString(final String str) throws IOException {
        this.writer.write(str);
        return this;
    }
    
    public Serializer writeNull() throws IOException {
        this.writeRawString("null");
        return this;
    }
    
    public Serializer writeNumber(final Number n) throws IOException {
        if (null == n) {
            return this.writeNull();
        }
        if (n instanceof Float) {
            if (((Float)n).isNaN()) {
                return this.writeNull();
            }
            if (Float.NEGATIVE_INFINITY == n.floatValue()) {
                return this.writeNull();
            }
            if (Float.POSITIVE_INFINITY == n.floatValue()) {
                return this.writeNull();
            }
        }
        if (n instanceof Double) {
            if (((Double)n).isNaN()) {
                return this.writeNull();
            }
            if (Double.NEGATIVE_INFINITY == n.doubleValue()) {
                return this.writeNull();
            }
            if (Double.POSITIVE_INFINITY == n.doubleValue()) {
                return this.writeNull();
            }
        }
        this.writeRawString(n.toString());
        return this;
    }
    
    public Serializer writeBoolean(final Boolean b) throws IOException {
        if (null == b) {
            return this.writeNull();
        }
        this.writeRawString(b.toString());
        return this;
    }
    
    private String rightAlignedZero(final String str, final int n) {
        if (n == str.length()) {
            return str;
        }
        final StringBuffer sb = new StringBuffer(str);
        while (sb.length() < n) {
            sb.insert(0, '0');
        }
        return sb.toString();
    }
    
    public Serializer writeString(final String s) throws IOException {
        if (null == s) {
            return this.writeNull();
        }
        this.writer.write(34);
        final char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            final char c = charArray[i];
            switch (c) {
                case 34: {
                    this.writer.write("\\\"");
                    break;
                }
                case 92: {
                    this.writer.write("\\\\");
                    break;
                }
                case 0: {
                    this.writer.write("\\0");
                    break;
                }
                case 8: {
                    this.writer.write("\\b");
                    break;
                }
                case 9: {
                    this.writer.write("\\t");
                    break;
                }
                case 10: {
                    this.writer.write("\\n");
                    break;
                }
                case 12: {
                    this.writer.write("\\f");
                    break;
                }
                case 13: {
                    this.writer.write("\\r");
                    break;
                }
                case 47: {
                    this.writer.write("\\/");
                    break;
                }
                default: {
                    if (c >= ' ' && c <= '~') {
                        this.writer.write(c);
                        break;
                    }
                    this.writer.write("\\u");
                    this.writer.write(this.rightAlignedZero(Integer.toHexString(c), 4));
                    break;
                }
            }
        }
        this.writer.write(34);
        return this;
    }
    
    private Serializer write(final Object obj) throws IOException {
        if (null == obj) {
            return this.writeNull();
        }
        if (obj instanceof Number) {
            return this.writeNumber((Number)obj);
        }
        if (obj instanceof String) {
            return this.writeString((String)obj);
        }
        if (obj instanceof Boolean) {
            return this.writeBoolean((Boolean)obj);
        }
        if (obj instanceof JSONObject) {
            return this.writeObject((JSONObject)obj);
        }
        if (obj instanceof JSONArray) {
            return this.writeArray((JSONArray)obj);
        }
        throw new IOException("Attempting to serialize unserializable object: '" + obj + "'");
    }
    
    public Serializer writeObject(final JSONObject jsonObject) throws IOException {
        if (null == jsonObject) {
            return this.writeNull();
        }
        this.writeRawString("{");
        this.indentPush();
        Iterator iterator;
        if (jsonObject instanceof OrderedJSONObject) {
            iterator = ((OrderedJSONObject)jsonObject).getOrder();
        }
        else {
            iterator = this.getPropertyNames(jsonObject).iterator();
        }
        while (iterator.hasNext()) {
            final String next = iterator.next();
            if (!(next instanceof String)) {
                throw new IOException("attempting to serialize object with an invalid property name: '" + (Object)next + "'");
            }
            final Object value = jsonObject.get(next);
            if (!JSONObject.isValidObject(value)) {
                throw new IOException("attempting to serialize object with an invalid property value: '" + value + "'");
            }
            this.newLine();
            this.indent();
            this.writeString(next);
            this.writeRawString(":");
            this.space();
            this.write(value);
            if (!iterator.hasNext()) {
                continue;
            }
            this.writeRawString(",");
        }
        this.indentPop();
        this.newLine();
        this.indent();
        this.writeRawString("}");
        return this;
    }
    
    public Serializer writeArray(final JSONArray obj) throws IOException {
        if (null == obj) {
            return this.writeNull();
        }
        this.writeRawString("[");
        this.indentPush();
        final Iterator<Object> iterator = obj.iterator();
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (!JSONObject.isValidObject(next)) {
                throw new IOException("attempting to serialize array with an invalid element: '" + obj + "'");
            }
            this.newLine();
            this.indent();
            this.write(next);
            if (!iterator.hasNext()) {
                continue;
            }
            this.writeRawString(",");
        }
        this.indentPop();
        this.newLine();
        this.indent();
        this.writeRawString("]");
        return this;
    }
    
    public void space() throws IOException {
    }
    
    public void newLine() throws IOException {
    }
    
    public void indent() throws IOException {
    }
    
    public void indentPush() {
    }
    
    public void indentPop() {
    }
    
    public List getPropertyNames(final Map map) {
        return new ArrayList(map.keySet());
    }
}
