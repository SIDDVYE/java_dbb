// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONObject;

public class ModeRecord extends Record
{
    private String buildMode;
    public static final String PROP_BUILD_MODE = "build-mode";
    
    public ModeRecord() {
        super("BUILD_MODE");
    }
    
    public ModeRecord(final String id) {
        super(id, "BUILD_MODE");
    }
    
    public String getBuildMode() {
        return this.buildMode;
    }
    
    public void setBuildMode(final String buildMode) {
        this.buildMode = buildMode;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject recordObj = super.toJSON();
        recordObj.put((Object)"build-mode", (Object)this.buildMode);
        return recordObj;
    }
    
    @Override
    public ModeRecord parse(final JSONObject jsonObj) {
        super.parse(jsonObj);
        this.buildMode = (String)jsonObj.get((Object)"build-mode");
        return this;
    }
}
