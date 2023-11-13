// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONArray;
import java.util.Iterator;
import com.ibm.json.java.JSONObject;
import java.util.List;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import java.util.HashMap;
import java.util.Map;

public class AnyTypeRecord extends Record
{
    protected Map<String, Object> attributes;
    
    public AnyTypeRecord(final String type) {
        super(type);
        this.attributes = new HashMap<String, Object>();
    }
    
    public AnyTypeRecord(final String id, final String type) {
        super(id, type);
        this.attributes = new HashMap<String, Object>();
    }
    
    public void setAttribute(final String name, final String value) throws BuildException {
        if ("id".equals(name)) {
            throw new BuildException(Messages.getMessage("AnyTypeRecord_RESERVED_ATTRIBUTE_NAME", "id"));
        }
        if ("type".equals(name)) {
            throw new BuildException(Messages.getMessage("AnyTypeRecord_RESERVED_ATTRIBUTE_NAME", "type"));
        }
        this.attributes.put(name, value);
    }
    
    public void setAttribute(final String name, final List<String> value) throws BuildException {
        if ("id".equals(name)) {
            throw new BuildException(Messages.getMessage("AnyTypeRecord_RESERVED_ATTRIBUTE_NAME", "id"));
        }
        if ("type".equals(name)) {
            throw new BuildException(Messages.getMessage("AnyTypeRecord_RESERVED_ATTRIBUTE_NAME", "type"));
        }
        this.attributes.put(name, value);
    }
    
    public Object getAttribute(final String name) {
        return this.attributes.get(name);
    }
    
    public String getAttributeAsString(final String name) throws ClassCastException {
        return this.attributes.get(name);
    }
    
    public List<String> getAttributeAsList(final String name) throws ClassCastException {
        return this.attributes.get(name);
    }
    
    public void deleteAttribute(final String name) {
        this.attributes.remove(name);
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject jsonObj = super.toJSON();
        if (this.attributes.size() > 0) {
            for (final String name : this.attributes.keySet()) {
                final Object value = this.attributes.get(name);
                if (value instanceof List) {
                    jsonObj.put((Object)name, (Object)this.toJSONArray((List<String>)value));
                }
                else {
                    jsonObj.put((Object)name, value);
                }
            }
        }
        return jsonObj;
    }
    
    @Override
    public Record parse(final JSONObject jsonObj) {
        this.attributes.clear();
        final AnyTypeRecord record = (AnyTypeRecord)super.parse(jsonObj);
        for (final Object key : jsonObj.keySet()) {
            if (!"id".equals(key) && !"type".equals(key)) {
                final Object value = jsonObj.get(key);
                if (value instanceof JSONArray) {
                    this.attributes.put((String)key, value);
                }
                else {
                    this.attributes.put((String)key, value);
                }
            }
        }
        return record;
    }
    
    private JSONArray toJSONArray(final List<String> list) {
        final JSONArray jsonArray = new JSONArray();
        for (final String element : list) {
            jsonArray.add((Object)element);
        }
        return jsonArray;
    }
}
