// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.util.List;
import java.util.Map;
import java.util.Collection;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;

public class JsonList<E> extends LinkedList<E>
{
    private static final long serialVersionUID = 1L;
    
    public JsonList(final CharSequence s, final DataFormat df) throws ParseException {
        switch (df) {
            case JSON: {
                JsonParser.DEFAULT.parseInto(s, this);
                break;
            }
            case XML: {
                XmlParser.DEFAULT.parseInto(s, this);
                break;
            }
            case HTML: {
                HtmlParser.DEFAULT.parseInto(s, this);
                break;
            }
            default: {
                throw new RuntimeException("Unsupported data format specified: [" + df + "]");
            }
        }
    }
    
    public JsonList(final CharSequence s) throws ParseException {
        this(s, DataFormat.JSON);
    }
    
    public JsonList(final Reader r, final DataFormat df) throws ParseException, IOException {
        this.parseReader(r, -1L, df);
    }
    
    public JsonList(final Reader r, final long length, final DataFormat df) throws ParseException, IOException {
        this.parseReader(r, length, df);
    }
    
    public JsonList(final File f, final DataFormat df) throws ParseException, FileNotFoundException, IOException {
        final FileReader r = new FileReader(f);
        try {
            this.parseReader(r, f.length(), df);
        }
        finally {
            r.close();
        }
    }
    
    public JsonList(final File f) throws ParseException, FileNotFoundException, IOException {
        this(f, DataFormat.JSON);
    }
    
    private void parseReader(final Reader r, final long length, final DataFormat df) throws IOException {
        switch (df) {
            case JSON: {
                JsonParser.DEFAULT.parseInto(r, length, this);
                break;
            }
            case XML: {
                XmlParser.DEFAULT.parseInto(r, length, this);
                break;
            }
            case HTML: {
                HtmlParser.DEFAULT.parseInto(r, length, this);
                break;
            }
            default: {
                throw new RuntimeException("Unsupported data format specified: [" + df + "]");
            }
        }
    }
    
    public JsonList() {
    }
    
    public JsonList(final E... o) {
        super(Arrays.asList(o));
    }
    
    public JsonList(final Collection<? extends E> o) {
        super(o);
    }
    
    public String getString(final int index) {
        return this.get(index).toString();
    }
    
    public String getString(final int index, final String defVal) {
        return JsonUtils.toString(this.get(index), defVal);
    }
    
    public Boolean getBoolean(final int index) {
        return JsonUtils.toBoolean(this.get(index), null);
    }
    
    public Boolean getBoolean(final int index, final Boolean defVal) {
        return JsonUtils.toBoolean(this.get(index), defVal);
    }
    
    public Integer getInt(final int index) {
        return JsonUtils.toInt(this.get(index), null);
    }
    
    public Integer getInt(final int index, final Integer defVal) {
        return JsonUtils.toInt(this.get(index), defVal);
    }
    
    public Long getLong(final int index) {
        return JsonUtils.toLong(this.get(index), null);
    }
    
    public Long getLong(final int index, final Long defVal) {
        return JsonUtils.toLong(this.get(index), defVal);
    }
    
    public Map<?, ?> getMap(final int index) {
        return (Map<?, ?>)JsonUtils.toMap(this.get(index), null);
    }
    
    public List<?> getList(final int index) {
        return (List<?>)JsonUtils.toList(this.get(index), null);
    }
    
    public JsonMap<?, ?> getJsonMap(final int index) {
        return (JsonMap<?, ?>)JsonUtils.toJsonMap(this.get(index), null);
    }
    
    public JsonList<?> getJsonList(final int index) {
        return (JsonList<?>)JsonUtils.toJsonList(this.get(index), null);
    }
    
    public String[] toStringArray() {
        return JsonUtils.toStringArray(this.toArray());
    }
    
    public Boolean[] toBooleanArray() {
        return JsonUtils.toBooleanArray(this.toArray());
    }
    
    public Integer[] toIntArray() {
        return JsonUtils.toIntArray(this.toArray());
    }
    
    public Long[] toLongArray() {
        return JsonUtils.toLongArray(this.toArray());
    }
    
    public Map<?, ?>[] toMapArray() {
        return (Map<?, ?>[])JsonUtils.toMapArray(this.toArray());
    }
    
    public JsonMap<?, ?>[] toJsonMapArray() {
        return (JsonMap<?, ?>[])JsonUtils.toJsonMapArray(this.toArray());
    }
    
    public List<?>[] toListArray() {
        return (List<?>[])JsonUtils.toListArray(this.toArray());
    }
    
    public JsonList<?>[] toJsonListArray() {
        return (JsonList<?>[])JsonUtils.toJsonListArray(this.toArray());
    }
    
    public DataType getDataType(final int index) {
        return JsonUtils.getDataType(this.get(index));
    }
    
    public String toString(final JsonSerializer serializer) {
        return serializer.serialize(this);
    }
    
    @Override
    public String toString() {
        return this.toString(JsonSerializer.DEFAULT_CONDENSED);
    }
}
