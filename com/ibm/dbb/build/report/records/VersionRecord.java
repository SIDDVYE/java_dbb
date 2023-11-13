// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONObject;

public class VersionRecord extends Record
{
    private String version;
    private String build;
    private String date;
    public static final String PROP_VERSION = "version";
    public static final String PROP_BUILD = "build";
    public static final String PROP_DATE = "date";
    
    public VersionRecord() {
        super("VERSION");
    }
    
    public VersionRecord(final String id) {
        super(id, "VERSION");
    }
    
    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(final String version) {
        this.version = version;
    }
    
    public String getBuild() {
        return this.build;
    }
    
    public void setBuild(final String build) {
        this.build = build;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public void setDate(final String date) {
        this.date = date;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject recordObj = super.toJSON();
        recordObj.put((Object)"version", (Object)this.version);
        recordObj.put((Object)"build", (Object)this.build);
        recordObj.put((Object)"date", (Object)this.date);
        return recordObj;
    }
    
    @Override
    public VersionRecord parse(final JSONObject jsonObj) {
        super.parse(jsonObj);
        this.version = (String)jsonObj.get((Object)"version");
        this.build = (String)jsonObj.get((Object)"build");
        this.date = (String)jsonObj.get((Object)"date");
        return this;
    }
}
