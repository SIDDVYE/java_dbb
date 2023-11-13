// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.dbb.build.report.ParseException;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.json.java.JSONObject;

public class BuildResultRecord extends Record
{
    private String group;
    private String label;
    private String url;
    private String storeType;
    private String location;
    public static final String PROP_GROUP = "group";
    public static final String PROP_LABEL = "label";
    public static final String PROP_URL = "url";
    public static final String PROP_STORE_TYPE = "storeType";
    public static final String PROP_LOCATION = "location";
    
    public BuildResultRecord() {
        super("BUILD_RESULT");
    }
    
    public BuildResultRecord(final String id) {
        super(id, "BUILD_RESULT");
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject recordObj = super.toJSON();
        recordObj.put((Object)"group", (Object)this.getGroup());
        recordObj.put((Object)"label", (Object)this.getLabel());
        recordObj.put((Object)"storeType", (Object)this.getStoreType());
        if (this.getUrl() != null) {
            recordObj.put((Object)"url", (Object)this.getUrl());
        }
        if (this.getLocation() != null) {
            recordObj.put((Object)"location", (Object)this.getLocation());
        }
        return recordObj;
    }
    
    @Override
    public BuildResultRecord parse(final JSONObject jsonObj) throws ParseException {
        try {
            super.parse(jsonObj);
            this.setGroup((String)jsonObj.get((Object)"group"));
            this.setLabel((String)jsonObj.get((Object)"label"));
            this.setUrl((String)jsonObj.get((Object)"url"));
            this.setStoreType((String)jsonObj.get((Object)"storeType"));
            this.setLocation((String)jsonObj.get((Object)"location"));
        }
        catch (Exception e) {
            throw new ParseException(Messages.getMessage("ParseException_ERROR_PARSING_JSON"), e);
        }
        return this;
    }
    
    public String getGroup() {
        return this.group;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public String getStoreType() {
        return this.storeType;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public void setGroup(final String group) {
        this.group = group;
    }
    
    public void setLabel(final String label) {
        this.label = label;
    }
    
    public void setUrl(final String url) {
        this.url = url;
    }
    
    public void setStoreType(final String type) throws ParseException {
        this.storeType = type;
    }
    
    public void setLocation(final String location) {
        this.location = location;
    }
}
