// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import org.slf4j.LoggerFactory;
import java.io.IOException;
import com.ibm.dbb.metadata.common.MetadataStoreUtil;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.json.java.JSONArray;
import org.slf4j.Logger;
import java.io.File;
import com.ibm.json.java.JSONObject;
import java.util.HashMap;
import java.util.ArrayList;

public class BuildResultIndex
{
    private ArrayList<String> orderedBuildResultList;
    private HashMap<String, JSONObject> buildResultMap;
    private File saveFile;
    private long saveFileModified;
    private static Logger logger;
    
    protected BuildResultIndex(final File location) {
        this.buildResultMap = (HashMap<String, JSONObject>)new JSONObject();
        this.orderedBuildResultList = (ArrayList<String>)new JSONArray();
        this.saveFile = new File(location, "buildResults.json");
    }
    
    protected String getBuildResultDir(final String label) {
        String dir = null;
        final JSONObject data = this.buildResultMap.get(label);
        if (data != null) {
            dir = (String)data.get((Object)"dir");
        }
        return dir;
    }
    
    protected void addNewBuildResult(final String label, final String dir, final Integer state, final Integer status) throws BuildException {
        if (this.buildResultMap.containsKey(label)) {
            throw new BuildException(Messages.getMessage("MetadataStore_BUILD_RESULT_EXISTS", label));
        }
        final JSONObject data = new JSONObject();
        data.put((Object)"state", (Object)state);
        data.put((Object)"status", (Object)status);
        data.put((Object)"dir", (Object)dir);
        this.buildResultMap.put(label, data);
        this.orderedBuildResultList.add(label);
    }
    
    protected void refreshBuildResult(final String label) throws BuildException {
        if (!this.orderedBuildResultList.remove(label)) {
            BuildResultIndex.logger.error("Error: no build result with label '" + label + "' exists.");
            return;
        }
        this.orderedBuildResultList.add(label);
    }
    
    protected void updateStatus(final String label, final int status) throws BuildException {
        final JSONObject data = this.buildResultMap.get(label);
        if (data == null) {
            BuildResultIndex.logger.error("Error: no build result with label '" + label + "' exists.");
            return;
        }
        data.put((Object)"status", (Object)status);
    }
    
    protected void updateState(final String label, final int state) throws BuildException {
        final JSONObject data = this.buildResultMap.get(label);
        if (data == null) {
            BuildResultIndex.logger.error("Error: no build result with label '" + label + "' exists.");
            return;
        }
        data.put((Object)"state", (Object)state);
    }
    
    protected void updateDir(final String label, final String dir) throws BuildException {
        final JSONObject data = this.buildResultMap.get(label);
        if (data == null) {
            BuildResultIndex.logger.error("Error: no build result with label '" + label + "' exists.");
            return;
        }
        data.put((Object)"dir", (Object)dir);
    }
    
    protected boolean removeBuildResult(final String label) {
        this.buildResultMap.remove(label);
        return this.orderedBuildResultList.remove(label);
    }
    
    protected List<String> listBuildResultLabels() {
        return new ArrayList<String>(this.orderedBuildResultList);
    }
    
    protected List<String> listBuildResultDirs() {
        final List<String> dirs = new ArrayList<String>();
        for (final JSONObject data : this.buildResultMap.values()) {
            dirs.add((String)data.get((Object)"dir"));
        }
        return dirs;
    }
    
    protected boolean buildResultExists(final String label) {
        return this.orderedBuildResultList.contains(label);
    }
    
    protected String getLastBuildResultDir(final int state, final int status) {
        final int size = this.orderedBuildResultList.size();
        String dir = null;
        for (int i = size - 1; i > -1; --i) {
            final JSONObject data = this.buildResultMap.get(this.orderedBuildResultList.get(i));
            final Number brState = (Number)data.get((Object)"state");
            final Number brStatus = (Number)data.get((Object)"status");
            if (brState.intValue() == state && brStatus.intValue() == status) {
                dir = (String)data.get((Object)"dir");
                break;
            }
        }
        return dir;
    }
    
    protected List<String> getBuildDirs(final int state, final int status) {
        final List<String> dirs = new ArrayList<String>();
        final int size = this.orderedBuildResultList.size();
        String dir = null;
        for (int i = size - 1; i > -1; --i) {
            final JSONObject data = this.buildResultMap.get(this.orderedBuildResultList.get(i));
            final Number brState = (Number)data.get((Object)"state");
            final Number brStatus = (Number)data.get((Object)"status");
            if (brState.intValue() == state && brStatus.intValue() == status) {
                dir = (String)data.get((Object)"dir");
                dirs.add(dir);
            }
        }
        return dirs;
    }
    
    protected void save() throws BuildException {
        final JSONObject jObj = new JSONObject();
        jObj.put((Object)"buildResultMap", (Object)this.buildResultMap);
        jObj.put((Object)"orderedBuildResults", (Object)this.orderedBuildResultList);
        try {
            MetadataStoreUtil.exportJSONToFile(jObj, this.saveFile);
        }
        catch (IOException ioe) {
            throw new BuildException(Messages.getMessage("MetadataStore_FILE_SAVE_ERROR", this.saveFile, this.getClass().getName(), ioe));
        }
        this.saveFileModified = this.saveFile.lastModified();
    }
    
    protected void load() throws BuildException {
        if (this.saveFile.exists() && Utils.isFileModified(this.saveFile, this.saveFileModified)) {
            try {
                final JSONObject jObj = MetadataStoreUtil.importJSONFromFile(this.saveFile);
                this.buildResultMap = (HashMap<String, JSONObject>)jObj.get((Object)"buildResultMap");
                this.orderedBuildResultList = (ArrayList<String>)jObj.get((Object)"orderedBuildResults");
                this.saveFileModified = this.saveFile.lastModified();
            }
            catch (IOException ioe) {
                throw new BuildException(Messages.getMessage("MetadataStore_READ_JSON_FORMAT", this.saveFile, ioe));
            }
        }
    }
    
    static {
        BuildResultIndex.logger = LoggerFactory.getLogger((Class)BuildGroup.class);
    }
}
