// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONObject;

public class CreatePDSRecord extends Record
{
    private String dataset;
    private String options;
    private boolean exists;
    public static final String PROP_DATASET = "dataset";
    public static final String PROP_OPTIONS = "options";
    public static final String PROP_EXISTS = "exists";
    
    public CreatePDSRecord() {
        super("CREATE_PDS");
    }
    
    public CreatePDSRecord(final String id) {
        super(id, "CREATE_PDS");
    }
    
    public String getDataset() {
        return this.dataset;
    }
    
    public void setDataset(final String dataset) {
        this.dataset = dataset;
    }
    
    public String getOptions() {
        return this.options;
    }
    
    public void setOptions(final String options) {
        this.options = options;
    }
    
    public boolean isExists() {
        return this.exists;
    }
    
    public void setExists(final boolean exists) {
        this.exists = exists;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject recordObj = super.toJSON();
        recordObj.put((Object)"dataset", (Object)this.dataset);
        if (this.options != null) {
            recordObj.put((Object)"options", (Object)this.options);
        }
        recordObj.put((Object)"exists", (Object)this.exists);
        return recordObj;
    }
    
    @Override
    public CreatePDSRecord parse(final JSONObject jsonObj) {
        super.parse(jsonObj);
        this.dataset = (String)jsonObj.get((Object)"dataset");
        this.options = (String)jsonObj.get((Object)"options");
        this.exists = (boolean)jsonObj.get((Object)"exists");
        return this;
    }
}
