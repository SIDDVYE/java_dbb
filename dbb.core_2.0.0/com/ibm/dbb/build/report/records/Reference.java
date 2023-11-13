// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONObject;

public class Reference extends Record
{
    public static final String PROP_REF_TYPE = "refType";
    public static final String PROP_REF_ID = "refId";
    private String refId;
    private String refType;
    
    public Reference() {
        super("REFERENCE");
    }
    
    public Reference(final String id) {
        super(id, "REFERENCE");
    }
    
    public String getRefId() {
        return this.refId;
    }
    
    public void setRefId(final String refId) {
        this.refId = refId;
    }
    
    public String getRefType() {
        return this.refType;
    }
    
    public void setRefType(final String refType) {
        this.refType = refType;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject recordObj = super.toJSON();
        recordObj.put((Object)"refId", (Object)this.refId);
        recordObj.put((Object)"refType", (Object)this.refType);
        return recordObj;
    }
    
    @Override
    public Record parse(final JSONObject jsonObj) {
        final String refId = (String)jsonObj.get((Object)"refId");
        this.setRefId(refId);
        final String refType = (String)jsonObj.get((Object)"refType");
        this.setRefType(refType);
        return this;
    }
}
