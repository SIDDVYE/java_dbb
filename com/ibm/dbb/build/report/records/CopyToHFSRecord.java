// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONObject;
import com.ibm.dbb.build.DBBConstants;
import java.io.File;

public class CopyToHFSRecord extends Record
{
    private String source;
    private File destination;
    private DBBConstants.CopyMode mode;
    public static final String PROP_SOURCE = "source";
    public static final String PROP_DESTINATION = "destination";
    public static final String PROP_MODE = "mode";
    
    public CopyToHFSRecord() {
        super("COPY_TO_HFS");
        this.mode = DBBConstants.CopyMode.TEXT;
    }
    
    public CopyToHFSRecord(final String id) {
        super(id, "COPY_TO_HFS");
        this.mode = DBBConstants.CopyMode.TEXT;
    }
    
    public String getSource() {
        return this.source;
    }
    
    public void setSource(final String source) {
        this.source = source;
    }
    
    public File getDestination() {
        return this.destination;
    }
    
    public void setDestination(final File destination) {
        this.destination = destination;
    }
    
    public DBBConstants.CopyMode getMode() {
        return this.mode;
    }
    
    public void setMode(final DBBConstants.CopyMode mode) {
        this.mode = mode;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject recordObj = super.toJSON();
        recordObj.put((Object)"source", (Object)this.getSource());
        final String destination = (this.getDestination() == null) ? "" : this.getDestination().getAbsolutePath();
        recordObj.put((Object)"destination", (Object)destination);
        recordObj.put((Object)"mode", (Object)this.mode.name());
        return recordObj;
    }
    
    @Override
    public CopyToHFSRecord parse(final JSONObject jsonObj) {
        super.parse(jsonObj);
        this.source = (String)jsonObj.get((Object)"source");
        this.destination = new File((String)jsonObj.get((Object)"destination"));
        final String modeValue = (String)jsonObj.get((Object)"mode");
        this.mode = ((modeValue == null) ? DBBConstants.CopyMode.TEXT : DBBConstants.CopyMode.valueOf(modeValue));
        return this;
    }
}
