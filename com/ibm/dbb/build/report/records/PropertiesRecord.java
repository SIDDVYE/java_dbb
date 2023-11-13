// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import java.util.Iterator;
import com.ibm.json.java.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class PropertiesRecord extends Record
{
    public static final String PROP_PROPERTIES = "properties";
    protected Map<String, String> properties;
    
    public PropertiesRecord() {
        super("PROPERTIES");
        this.properties = new HashMap<String, String>();
    }
    
    public PropertiesRecord(final String id) {
        super(id, "PROPERTIES");
        this.properties = new HashMap<String, String>();
    }
    
    public void addProperty(final String name, final String value) {
        this.properties.put(name, value);
    }
    
    public String getProperty(final String name) {
        return this.properties.get(name);
    }
    
    public Map<String, String> getProperties() {
        return this.properties;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject jsonObj = super.toJSON();
        if (this.properties.size() > 0) {
            final JSONObject propertiesObj = new JSONObject();
            for (final String name : this.properties.keySet()) {
                final String value = this.properties.get(name);
                propertiesObj.put((Object)name, (Object)value);
            }
            jsonObj.put((Object)"properties", (Object)propertiesObj);
        }
        return jsonObj;
    }
    
    @Override
    public Record parse(final JSONObject jsonObj) {
        this.properties.clear();
        final PropertiesRecord record = (PropertiesRecord)super.parse(jsonObj);
        final JSONObject propertiesObj = (JSONObject)jsonObj.get((Object)"properties");
        if (propertiesObj != null) {
            for (final Object key : propertiesObj.keySet()) {
                this.properties.put((String)key, (String)propertiesObj.get(key));
            }
        }
        return record;
    }
}
