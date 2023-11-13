// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedHashMap;

public class JsonMap<K, V> extends LinkedHashMap<K, V>
{
    private static final long serialVersionUID = 1L;
    
    public JsonMap(final CharSequence s, final DataFormat df) throws ParseException {
        switch (df) {
            case HTML: {
                HtmlParser.DEFAULT.parseInto(s, this);
                break;
            }
            case JSON: {
                JsonParser.DEFAULT.parseInto(s, this);
                break;
            }
            case URLPARAM: {
                UrlParamParser.DEFAULT.parseInto(s, this);
                break;
            }
            case XML: {
                XmlParser.DEFAULT.parseInto(s, this);
                break;
            }
            default: {
                throw new RuntimeException("Unsupported data format specified: [" + df + "]");
            }
        }
    }
    
    public JsonMap(final CharSequence s) throws ParseException {
        this(s, DataFormat.JSON);
    }
    
    public JsonMap(final Reader r, final DataFormat df) throws ParseException, IOException {
        this.parseReader(r, -1L, df);
    }
    
    public JsonMap(final Reader r) throws ParseException, IOException {
        this.parseReader(r, -1L, DataFormat.JSON);
    }
    
    public JsonMap(final Reader r, final long length, final DataFormat df) throws ParseException, IOException {
        this.parseReader(r, length, df);
    }
    
    public JsonMap(final File f, final DataFormat df) throws ParseException, FileNotFoundException, IOException {
        final FileReader r = new FileReader(f);
        try {
            this.parseReader(r, f.length(), df);
        }
        finally {
            r.close();
        }
    }
    
    public JsonMap(final File f) throws ParseException, FileNotFoundException, IOException {
        this(f, DataFormat.JSON);
    }
    
    private void parseReader(final Reader r, final long length, final DataFormat df) throws IOException {
        switch (df) {
            case HTML: {
                HtmlParser.DEFAULT.parseInto(r, length, this);
                break;
            }
            case JSON: {
                JsonParser.DEFAULT.parseInto(r, length, this);
                break;
            }
            case URLPARAM: {
                UrlParamParser.DEFAULT.parseInto(r, length, this);
                break;
            }
            case XML: {
                XmlParser.DEFAULT.parseInto(r, length, this);
                break;
            }
            default: {
                throw new RuntimeException("Unsupported data format specified: [" + df + "]");
            }
        }
    }
    
    public JsonMap() {
    }
    
    public JsonMap(final Map<? extends K, ? extends V> m) {
        super(m);
    }
    
    public V get(final K key, final V def) {
        final V o = this.get(key);
        return (o == null) ? def : o;
    }
    
    public V find(final K... keys) {
        for (final K key : keys) {
            if (this.containsKey(key)) {
                return this.get(key);
            }
        }
        return null;
    }
    
    public void putJson(final K key, final String json) {
        this.put(key, (V)JsonParser.DEFAULT.parse(json));
    }
    
    public void putAll(final Object... o) {
        if (o.length % 2 != 0) {
            throw new RuntimeException("Invalid set of arguments passed to JsonMap.putAll().  Must be an even number of arguments.");
        }
        for (int i = 0; i < o.length; i += 2) {
            this.put((K)o[i], (V)o[i + 1]);
        }
    }
    
    public String getString(final K key) {
        return JsonUtils.toString(this.get(key), null);
    }
    
    public String getString(final K key, final String defVal) {
        return JsonUtils.toString(this.get(key), defVal);
    }
    
    public String findString(final K... keys) {
        return JsonUtils.toString(this.find(keys), null);
    }
    
    public Integer getInt(final K key) {
        return JsonUtils.toInt(this.get(key), null);
    }
    
    public Integer getInt(final K key, final Integer defVal) {
        return JsonUtils.toInt(this.get(key), defVal);
    }
    
    public Integer findInt(final K... keys) {
        return JsonUtils.toInt(this.find(keys), null);
    }
    
    public Long getLong(final K key) {
        return JsonUtils.toLong(this.get(key), null);
    }
    
    public Long getLong(final K key, final Long defVal) {
        return JsonUtils.toLong(this.get(key), defVal);
    }
    
    public Long findLong(final K... keys) {
        return JsonUtils.toLong(this.find(keys), null);
    }
    
    public Boolean getBoolean(final K key) {
        return JsonUtils.toBoolean(this.get(key), null);
    }
    
    public Boolean getBoolean(final K key, final Boolean defVal) {
        return JsonUtils.toBoolean(this.get(key), defVal);
    }
    
    public Boolean findBoolean(final K... keys) {
        return JsonUtils.toBoolean(this.find(keys), null);
    }
    
    public Map<?, ?> getMap(final K key) {
        return (Map<?, ?>)JsonUtils.toMap(this.get(key), null);
    }
    
    public Map<?, ?> getMap(final K key, final Map<?, ?> def) {
        return (Map<?, ?>)JsonUtils.toMap(this.get(key), def);
    }
    
    public Map<?, ?> findMap(final K... keys) {
        return (Map<?, ?>)JsonUtils.toMap(this.find(keys), null);
    }
    
    public List<?> getList(final K key) {
        return (List<?>)JsonUtils.toList(this.get(key), null);
    }
    
    public List<?> getList(final K key, final List<?> def) {
        return (List<?>)JsonUtils.toList(this.get(key), def);
    }
    
    public List<?> findList(final K... keys) {
        return (List<?>)JsonUtils.toList(this.find(keys), null);
    }
    
    public JsonMap<?, ?> getJsonMap(final K key) {
        return (JsonMap<?, ?>)JsonUtils.toJsonMap(this.get(key), null);
    }
    
    public JsonMap<?, ?> getJsonMap(final K key, final JsonMap<?, ?> def) {
        return (JsonMap<?, ?>)JsonUtils.toJsonMap(this.get(key), def);
    }
    
    public JsonMap<?, ?> findJsonMap(final K... keys) {
        return (JsonMap<?, ?>)JsonUtils.toJsonMap(this.find(keys), null);
    }
    
    public JsonList<?> getJsonList(final K key) {
        return (JsonList<?>)JsonUtils.toJsonList(this.get(key), null);
    }
    
    public JsonList<?> getJsonList(final K key, final JsonList<?> def) {
        return (JsonList<?>)JsonUtils.toJsonList(this.get(key), def);
    }
    
    public JsonList<?> findJsonList(final K... keys) {
        return (JsonList<?>)JsonUtils.toJsonList(this.find(keys), null);
    }
    
    public K getFirstKey() {
        return this.isEmpty() ? null : this.keySet().iterator().next();
    }
    
    public DataType getDataType(final K attr) {
        return JsonUtils.getDataType(this.get(attr));
    }
    
    public void removeAll(final Collection<K> c) {
        for (final K k : c) {
            this.remove(k);
        }
    }
    
    public void removeAll(final K... c) {
        for (final K k : c) {
            this.remove(k);
        }
    }
    
    public String toString(final JsonSerializer serializer) {
        return serializer.serialize(this);
    }
    
    @Override
    public String toString() {
        return this.toString(JsonSerializer.DEFAULT_CONDENSED);
    }
    
    public boolean containsKey(final K... keys) {
        for (final K k : keys) {
            if (super.containsKey(k)) {
                return true;
            }
        }
        return false;
    }
}
