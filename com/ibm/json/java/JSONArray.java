// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java;

import java.util.Iterator;
import java.io.StringWriter;
import com.ibm.json.java.internal.Serializer;
import com.ibm.json.java.internal.SerializerVerbose;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Collection;
import java.util.ArrayList;

public class JSONArray extends ArrayList implements JSONArtifact
{
    private static final long serialVersionUID = 9076798781015779954L;
    
    public JSONArray() {
    }
    
    public JSONArray(final int initialCapacity) {
        super(initialCapacity);
    }
    
    public void add(final int index, final Object element) {
        this.checkElement(element);
        super.add(index, element);
    }
    
    public boolean add(final Object e) {
        this.checkElement(e);
        return super.add(e);
    }
    
    public boolean addAll(final Collection c) {
        this.checkElements(c);
        return super.addAll(c);
    }
    
    public boolean addAll(final int index, final Collection c) {
        this.checkElements(c);
        return super.addAll(index, c);
    }
    
    public Object set(final int index, final Object element) {
        this.checkElement(element);
        return super.set(index, element);
    }
    
    public static JSONArray parse(final InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        }
        catch (Exception ex) {
            inputStreamReader = new InputStreamReader(inputStream);
        }
        return parse(inputStreamReader);
    }
    
    public static JSONArray parse(final Reader reader) throws IOException {
        final StringBuffer sb = new StringBuffer("");
        sb.append("{\"jsonArray\":");
        final char[] str = new char[8196];
        for (int i = reader.read(str, 0, 8196); i != -1; i = reader.read(str, 0, 8196)) {
            sb.append(str, 0, i);
        }
        sb.append("}");
        return (JSONArray)JSONObject.parse(sb.toString()).get("jsonArray");
    }
    
    public static JSONArray parse(final String s) throws IOException {
        return parse(new StringReader(s));
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
        serializer.writeArray(this).flush();
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
        serializer.writeArray(this).flush();
        return stringWriter.toString();
    }
    
    public String serialize() throws IOException {
        return this.serialize(false);
    }
    
    private void checkElement(final Object o) {
        if (!JSONObject.isValidObject(o)) {
            throw new IllegalArgumentException("invalid type of element");
        }
    }
    
    private void checkElements(final Collection collection) {
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!JSONObject.isValidObject(iterator.next())) {
                throw new IllegalArgumentException("invalid type of element");
            }
        }
    }
}
