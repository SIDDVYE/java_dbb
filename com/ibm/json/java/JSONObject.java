// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java;

import java.io.StringWriter;
import com.ibm.json.java.internal.Serializer;
import com.ibm.json.java.internal.SerializerVerbose;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.StringReader;
import java.io.IOException;
import com.ibm.json.java.internal.Parser;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.HashMap;

public class JSONObject extends HashMap implements JSONArtifact
{
    private static final long serialVersionUID = -3269263069889337298L;
    
    public static boolean isValidObject(final Object o) {
        return null == o || isValidType(o.getClass());
    }
    
    public static boolean isValidType(final Class clazz) {
        if (null == clazz) {
            throw new IllegalArgumentException();
        }
        return String.class == clazz || Boolean.class == clazz || JSONObject.class.isAssignableFrom(clazz) || JSONArray.class == clazz || Number.class.isAssignableFrom(clazz);
    }
    
    public static JSONObject parse(final Reader in) throws IOException {
        return new Parser(new BufferedReader(in)).parse();
    }
    
    public static JSONObject parse(final String s) throws IOException {
        return parse(new StringReader(s));
    }
    
    public static JSONObject parse(final InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        }
        catch (Exception ex) {
            inputStreamReader = new InputStreamReader(inputStream);
        }
        return parse(inputStreamReader);
    }
    
    public void serialize(final OutputStream outputStream) throws IOException {
        this.serialize(outputStream, false);
    }
    
    public void serialize(final OutputStream out, final boolean b) throws IOException {
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
        }
        catch (UnsupportedEncodingException cause) {
            final IOException ex = new IOException(cause.toString());
            ex.initCause(cause);
            throw ex;
        }
        this.serialize(bufferedWriter, b);
    }
    
    public void serialize(final Writer out) throws IOException {
        this.serialize(new BufferedWriter(out), false);
    }
    
    public void serialize(final Writer writer, final boolean b) throws IOException {
        Serializer serializer;
        if (b) {
            serializer = new SerializerVerbose(writer);
        }
        else {
            serializer = new Serializer(writer);
        }
        serializer.writeObject(this).flush();
    }
    
    public String serialize(final boolean b) throws IOException {
        final StringWriter stringWriter = new StringWriter();
        Serializer serializer;
        if (b) {
            serializer = new SerializerVerbose(stringWriter);
        }
        else {
            serializer = new Serializer(stringWriter);
        }
        serializer.writeObject(this).flush();
        return stringWriter.toString();
    }
    
    public String serialize() throws IOException {
        return this.serialize(false);
    }
    
    public Object put(final Object key, final Object value) {
        if (null == key) {
            throw new IllegalArgumentException("key must not be null");
        }
        if (!(key instanceof String)) {
            throw new IllegalArgumentException("key must be a String");
        }
        if (isValidObject(value)) {
            return super.put(key, value);
        }
        if (value != null) {
            throw new IllegalArgumentException("Invalid type of value.  Type: [" + value.getClass().getName() + "] with value: [" + value.toString() + "]");
        }
        throw new IllegalArgumentException("Invalid type of value.");
    }
    
    public String toString() {
        String s;
        try {
            s = this.serialize(false);
        }
        catch (IOException ex) {
            s = "JSON Generation Error: [" + ex.toString() + "]";
        }
        return s;
    }
}
