// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.util.ArrayList;
import java.util.List;
import com.ibm.dbb.build.DBBConstants;
import java.io.File;

public class CopyToPDSRecord extends Record
{
    private File source;
    private String destination;
    private DBBConstants.CopyMode mode;
    private boolean output;
    private String dataset;
    private String deployType;
    private String file;
    private String command;
    private int rc;
    private List<OutputInfo> outputs;
    public static final String PROP_SOURCE = "source";
    public static final String PROP_DESTINATION = "destination";
    public static final String PROP_MODE = "mode";
    public static final String PROP_OUTPUTS = "outputs";
    public static final String PROP_DEPLOY_TYPE = "deployType";
    public static final String PROP_FILE = "file";
    public static final String PROP_COMMAND = "command";
    public static final String PROP_RC = "rc";
    public static final String PROP_DATASET = "dataset";
    
    public CopyToPDSRecord() {
        super("COPY_TO_PDS");
        this.mode = DBBConstants.CopyMode.TEXT;
        this.output = false;
        this.command = "DBBCOPY";
        this.rc = 0;
        this.outputs = new ArrayList<OutputInfo>();
    }
    
    public CopyToPDSRecord(final String id) {
        super(id, "COPY_TO_PDS");
        this.mode = DBBConstants.CopyMode.TEXT;
        this.output = false;
        this.command = "DBBCOPY";
        this.rc = 0;
        this.outputs = new ArrayList<OutputInfo>();
    }
    
    public File getSource() {
        return this.source;
    }
    
    public void setSource(final File source) {
        this.source = source;
    }
    
    public String getDestination() {
        return this.destination;
    }
    
    public void setDestination(final String destination) {
        this.destination = destination;
    }
    
    public DBBConstants.CopyMode getMode() {
        return this.mode;
    }
    
    public void setMode(final DBBConstants.CopyMode mode) {
        this.mode = mode;
    }
    
    public boolean getOutput() {
        return this.output;
    }
    
    public void setOutput(final boolean output) {
        this.output = output;
    }
    
    public String getDeployType() {
        return this.deployType;
    }
    
    public void setDeployType(final String deployType) {
        this.deployType = deployType;
    }
    
    public String getDataset() {
        return this.dataset;
    }
    
    public void setDataset(final String dataset) {
        this.dataset = dataset;
    }
    
    public void setFile(final String file) {
        this.file = file;
    }
    
    public String getFile() {
        return this.file;
    }
    
    public String getCommand() {
        return this.command;
    }
    
    public void setCommand(final String command) {
        this.command = command;
    }
    
    public int getRc() {
        return this.rc;
    }
    
    public void setRc(final int rc) {
        this.rc = rc;
    }
    
    public void addOutput(final String dataset, final String deployType) {
        final OutputInfo output = new OutputInfo();
        output.dataset = dataset;
        output.deployType = deployType;
        this.outputs.add(output);
    }
    
    public List<OutputInfo> getOutputs() {
        return this.outputs;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject recordObj = super.toJSON();
        final String source = (this.getSource() == null) ? "" : this.getSource().getAbsolutePath();
        recordObj.put((Object)"source", (Object)source);
        recordObj.put((Object)"destination", (Object)this.getDestination());
        recordObj.put((Object)"mode", (Object)this.mode.name());
        if (this.output) {
            recordObj.put((Object)"command", (Object)this.command);
            recordObj.put((Object)"rc", (Object)this.rc);
            if (this.file != null) {
                recordObj.put((Object)"file", (Object)this.file);
            }
            final JSONArray outputObjs = new JSONArray();
            final JSONObject outputObj = new JSONObject();
            outputObj.put((Object)"dataset", (Object)this.destination);
            if (this.deployType != null) {
                outputObj.put((Object)"deployType", (Object)this.deployType);
            }
            outputObjs.add((Object)outputObj);
            recordObj.put((Object)"outputs", (Object)outputObjs);
        }
        return recordObj;
    }
    
    @Override
    public CopyToPDSRecord parse(final JSONObject jsonObj) {
        super.parse(jsonObj);
        this.source = new File((String)jsonObj.get((Object)"source"));
        this.destination = (String)jsonObj.get((Object)"destination");
        final String modeValue = (String)jsonObj.get((Object)"mode");
        this.mode = ((modeValue == null) ? DBBConstants.CopyMode.TEXT : DBBConstants.CopyMode.valueOf(modeValue));
        final JSONArray outputObjs = (JSONArray)jsonObj.get((Object)"outputs");
        this.output = (outputObjs != null);
        if (this.output) {
            this.command = (String)jsonObj.get((Object)"command");
            this.rc = ((Long)jsonObj.get((Object)"rc")).intValue();
            this.file = (String)jsonObj.get((Object)"file");
            if (outputObjs != null) {
                final JSONObject outputObj = (JSONObject)outputObjs.get(0);
                this.dataset = (String)outputObj.get((Object)"dataset");
                this.deployType = (String)outputObj.get((Object)"deployType");
                this.addOutput(this.dataset, this.deployType);
            }
        }
        return this;
    }
    
    public static class OutputInfo
    {
        public String dataset;
        public String deployType;
    }
}
