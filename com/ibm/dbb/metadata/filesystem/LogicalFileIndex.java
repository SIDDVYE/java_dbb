// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.util.List;
import java.util.HashMap;
import java.io.File;

public class LogicalFileIndex
{
    private File location;
    private HashMap<String, List<String>> logicalFilesMap;
    private HashMap<String, List<String>> referencedByMap;
    private long logicalFilesMapModified;
    private long referencedByMapModified;
    private final String logicalFilesMapFilename = "logicalfiles.json";
    private final String referencedByMapFilename = "references.json";
    
    protected LogicalFileIndex(final File location) {
        this.location = location;
        this.logicalFilesMap = (HashMap<String, List<String>>)new JSONObject();
        this.referencedByMap = (HashMap<String, List<String>>)new JSONObject();
    }
    
    protected void addToLogicalFilesMap(final String lname, final String saveFilePath) {
        List<String> lFiles = this.logicalFilesMap.get(lname);
        if (lFiles == null) {
            lFiles = (List<String>)new JSONArray();
            lFiles.add(saveFilePath);
            this.logicalFilesMap.put(lname, lFiles);
        }
        else if (!lFiles.contains(saveFilePath)) {
            lFiles.add(saveFilePath);
        }
    }
    
    protected void addToReferencedByMap(final String lname, final String saveFilePath) {
        List<String> lFiles = this.referencedByMap.get(lname);
        if (lFiles == null) {
            lFiles = (List<String>)new JSONArray();
            lFiles.add(saveFilePath);
            this.referencedByMap.put(lname, lFiles);
        }
        else if (!lFiles.contains(saveFilePath)) {
            lFiles.add(saveFilePath);
        }
    }
    
    protected void removeLogicalFile(final String lname, final String saveFilePath) {
        final List<String> lfiles = this.logicalFilesMap.get(lname);
        if (lfiles != null) {
            lfiles.remove(saveFilePath);
        }
        for (final List<String> references : this.referencedByMap.values()) {
            if (references.contains(saveFilePath)) {
                references.remove(saveFilePath);
            }
        }
    }
    
    protected List<String> getLogicalFilePaths(final String lname) {
        return this.logicalFilesMap.get(lname);
    }
    
    protected List<String> getAllLogicalFilePaths() {
        final List<String> paths = new ArrayList<String>();
        for (final List<String> relativePaths : this.logicalFilesMap.values()) {
            if (relativePaths != null) {
                paths.addAll(relativePaths);
            }
        }
        return paths;
    }
    
    protected List<String> getReferencedByPaths(final String lname) {
        List<String> jsonPaths = new ArrayList<String>();
        if (this.referencedByMap.containsKey(lname)) {
            jsonPaths = this.referencedByMap.get(lname);
        }
        return jsonPaths;
    }
    
    protected List<String> getlNames() {
        return new ArrayList<String>(this.logicalFilesMap.keySet());
    }
    
    protected void saveAll() throws FileSystemStoreException {
        this.saveReferencedByMap();
        this.saveLogicalFileMap();
    }
    
    protected void saveReferencedByMap() throws FileSystemStoreException {
        final File saveFile = new File(this.location, "references.json");
        Utils.saveMap(this.referencedByMap, saveFile);
        this.logicalFilesMapModified = saveFile.lastModified();
    }
    
    protected void saveLogicalFileMap() throws FileSystemStoreException {
        final File saveFile = new File(this.location, "logicalfiles.json");
        Utils.saveMap(this.logicalFilesMap, saveFile);
        this.referencedByMapModified = saveFile.lastModified();
    }
    
    protected void loadAll() throws FileSystemStoreException {
        this.loadLogicalFileMap();
        this.loadReferencedByMap();
    }
    
    protected void loadLogicalFileMap() throws FileSystemStoreException {
        final File saveFile = new File(this.location, "logicalfiles.json");
        if (saveFile.exists() && Utils.isFileModified(saveFile, this.logicalFilesMapModified)) {
            Utils.loadMap(this.logicalFilesMap, saveFile);
            this.logicalFilesMapModified = saveFile.lastModified();
        }
    }
    
    protected void loadReferencedByMap() throws FileSystemStoreException {
        final File saveFile = new File(this.location, "references.json");
        if (saveFile.exists() && Utils.isFileModified(saveFile, this.referencedByMapModified)) {
            Utils.loadMap(this.referencedByMap, saveFile);
            this.referencedByMapModified = saveFile.lastModified();
        }
    }
    
    protected File getLocation() {
        return this.location;
    }
    
    protected void setLocation(final File location) {
        this.location = location;
    }
}
