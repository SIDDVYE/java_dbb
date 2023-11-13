// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONObject;

public class Record
{
    public static final String PROP_ID = "id";
    public static final String PROP_TYPE = "type";
    public String id;
    public String type;
    
    public Record(final String type) {
        this.id = RecordFactoryManager.getInstance().getNextId(type);
        this.type = type;
    }
    
    public Record(final String id, final String type) {
        this.id = id;
        this.type = type;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public JSONObject toJSON() {
        final JSONObject recordObj = new JSONObject();
        recordObj.put((Object)"id", (Object)this.getId());
        recordObj.put((Object)"type", (Object)this.getType());
        return recordObj;
    }
    
    public Record parse(final JSONObject jsonObj) {
        this.id = (String)jsonObj.get((Object)"id");
        this.type = (String)jsonObj.get((Object)"type");
        return this;
    }
}
