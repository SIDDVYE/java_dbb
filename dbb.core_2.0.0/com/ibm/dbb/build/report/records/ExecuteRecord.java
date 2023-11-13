// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.dbb.build.report.ParseException;
import com.ibm.dbb.build.internal.Messages;
import java.util.Iterator;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.util.ArrayList;
import java.io.File;
import java.util.List;

public class ExecuteRecord extends Record
{
    private String command;
    private String options;
    private int rc;
    private String file;
    private List<String> datasets;
    private List<OutputInfo> outputs;
    private List<File> logFiles;
    public static final String PROP_COMMAND = "command";
    public static final String PROP_OPTIONS = "options";
    public static final String PROP_RC = "rc";
    public static final String PROP_FILE = "file";
    public static final String PROP_DATASETS = "datasets";
    public static final String PROP_OUTPUTS = "outputs";
    public static final String PROP_LOGS = "logs";
    public static final String PROP_DATASET = "dataset";
    public static final String PROP_DEPLOY_TYPE = "deployType";
    
    public ExecuteRecord() {
        super("EXECUTE");
        this.datasets = new ArrayList<String>();
        this.outputs = new ArrayList<OutputInfo>();
        this.logFiles = new ArrayList<File>();
    }
    
    public ExecuteRecord(final String id) {
        super(id, "EXECUTE");
        this.datasets = new ArrayList<String>();
        this.outputs = new ArrayList<OutputInfo>();
        this.logFiles = new ArrayList<File>();
    }
    
    public String getCommand() {
        return this.command;
    }
    
    public void setCommand(final String command) {
        this.command = command;
    }
    
    public String getOptions() {
        return this.options;
    }
    
    public void setOptions(final String options) {
        this.options = options;
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
    
    public void setFile(final String file) {
        this.file = file;
    }
    
    public String getFile() {
        return this.file;
    }
    
    public void addDataset(final String dataset) {
        this.datasets.add(dataset);
    }
    
    public List<String> getDatasets() {
        return this.datasets;
    }
    
    public void addLogFile(final File logFile) {
        this.logFiles.add(logFile);
    }
    
    public List<File> getLogFiles() {
        return this.logFiles;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject recordObj = super.toJSON();
        recordObj.put((Object)"command", (Object)this.getCommand());
        recordObj.put((Object)"options", (Object)this.getOptions());
        recordObj.put((Object)"rc", (Object)this.getRc());
        if (this.file != null) {
            recordObj.put((Object)"file", (Object)this.file);
        }
        if (this.outputs.size() > 0) {
            final JSONArray outputObjs = new JSONArray();
            for (final OutputInfo output : this.outputs) {
                final JSONObject outputObj = new JSONObject();
                outputObj.put((Object)"dataset", (Object)output.dataset);
                if (output.deployType != null) {
                    outputObj.put((Object)"deployType", (Object)output.deployType);
                }
                outputObjs.add((Object)outputObj);
            }
            recordObj.put((Object)"outputs", (Object)outputObjs);
        }
        if (this.datasets.size() > 0) {
            final JSONArray datasetObjs = new JSONArray();
            for (final String dataset : this.datasets) {
                datasetObjs.add((Object)dataset);
            }
            recordObj.put((Object)"datasets", (Object)datasetObjs);
        }
        if (this.logFiles.size() > 0) {
            final JSONArray logFileObjs = new JSONArray();
            for (final File logFile : this.logFiles) {
                logFileObjs.add((Object)logFile.getAbsolutePath());
            }
            recordObj.put((Object)"logs", (Object)logFileObjs);
        }
        return recordObj;
    }
    
    @Override
    public ExecuteRecord parse(final JSONObject jsonObj) throws ParseException {
        try {
            super.parse(jsonObj);
            this.command = (String)jsonObj.get((Object)"command");
            this.options = (String)jsonObj.get((Object)"options");
            this.rc = ((Long)jsonObj.get((Object)"rc")).intValue();
            this.file = (String)jsonObj.get((Object)"file");
            final JSONArray outputObjs = (JSONArray)jsonObj.get((Object)"outputs");
            if (outputObjs != null) {
                for (int i = 0; i < outputObjs.size(); ++i) {
                    final JSONObject outputObj = (JSONObject)outputObjs.get(i);
                    final String dataset = (String)outputObj.get((Object)"dataset");
                    final String deployType = (String)outputObj.get((Object)"deployType");
                    this.addOutput(dataset, deployType);
                }
            }
            final JSONArray datasetObjs = (JSONArray)jsonObj.get((Object)"datasets");
            if (datasetObjs != null) {
                for (int j = 0; j < datasetObjs.size(); ++j) {
                    final String dataset = (String)datasetObjs.get(j);
                    this.addDataset(dataset);
                }
            }
            final JSONArray logFileObjs = (JSONArray)jsonObj.get((Object)"logs");
            if (logFileObjs != null) {
                for (int k = 0; k < logFileObjs.size(); ++k) {
                    final String logFilePath = (String)logFileObjs.get(k);
                    this.addLogFile(new File(logFilePath));
                }
            }
            return this;
        }
        catch (Exception e) {
            throw new ParseException(Messages.getMessage("ParseException_ERROR_PARSING_JSON"), e);
        }
    }
    
    public static class OutputInfo
    {
        public String dataset;
        public String deployType;
    }
}
