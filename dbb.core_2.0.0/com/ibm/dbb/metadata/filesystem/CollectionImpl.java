// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import org.slf4j.LoggerFactory;
import java.io.IOException;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.json.java.JSONObject;
import com.ibm.dbb.metadata.MetadataStoreFactory;
import java.util.ArrayList;
import com.ibm.dbb.dependency.LogicalDependency;
import com.ibm.dbb.metadata.common.MetadataStoreUtil;
import java.util.Iterator;
import java.util.List;
import com.ibm.dbb.dependency.LogicalFile;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.metadata.ManagedObject;
import java.util.Date;
import org.slf4j.Logger;
import java.io.File;
import com.ibm.dbb.metadata.common.Collection;

public class CollectionImpl extends Collection
{
    private File location;
    private String group;
    private LogicalFileIndex logicalFileIndex;
    private static Logger logger;
    
    public CollectionImpl(final String name, final String group, final File location, final String owner, final String team, final int permission, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(name, owner, team, permission, created, createdBy, lastUpdated, lastUpdatedBy);
        this.location = location;
        this.group = group;
        this.logicalFileIndex = new LogicalFileIndex(location);
    }
    
    private CollectionImpl(final String name, final String group, final File location, final ManagedObject obj) throws BuildException {
        this(name, group, location, obj.getOwner(), obj.getTeam(), obj.getPermission(), obj.getCreated(), obj.getCreatedBy(), obj.getLastUpdated(), obj.getLastUpdatedBy());
    }
    
    @Override
    public void addLogicalFile(final LogicalFile logicalFile) throws BuildException {
        this.logicalFileIndex.loadAll();
        this.saveLogicalFile(logicalFile, true);
        this.updateCollection();
    }
    
    @Override
    public void addLogicalFiles(final List<LogicalFile> logicalFiles) throws BuildException {
        this.logicalFileIndex.loadAll();
        for (final LogicalFile lfile : logicalFiles) {
            this.saveLogicalFile(lfile, false);
        }
        this.logicalFileIndex.saveAll();
        this.updateCollection();
    }
    
    private void saveLogicalFile(final LogicalFile lfile, final boolean saveIndex) throws BuildException {
        final File saveFile = this.getSerializedFile(lfile.getFile());
        saveFile.getParentFile().mkdirs();
        MetadataStoreUtil.saveLogicalFileToJSON(lfile, saveFile);
        final String relSaveFilePath = Utils.relativizePath(this.location, saveFile);
        this.logicalFileIndex.addToLogicalFilesMap(lfile.getLname(), relSaveFilePath);
        for (final LogicalDependency lDep : lfile.getLogicalDependencies()) {
            this.logicalFileIndex.addToReferencedByMap(lDep.getLname(), relSaveFilePath);
        }
        if (saveIndex) {
            this.logicalFileIndex.saveAll();
        }
    }
    
    @Override
    public void deleteLogicalFile(final String file) throws BuildException {
        this.logicalFileIndex.loadAll();
        final File saveFile = this.getSerializedFile(file);
        saveFile.delete();
        this.logicalFileIndex.removeLogicalFile(MetadataStoreUtil.getLogicalName(file), Utils.relativizePath(this.location, saveFile));
        this.logicalFileIndex.saveAll();
        this.updateCollection();
    }
    
    @Override
    public LogicalFile getLogicalFile(final String file) throws BuildException {
        final File saveFile = this.getSerializedFile(file);
        return MetadataStoreUtil.parseLogicalFileFromJSON(saveFile);
    }
    
    @Override
    public List<LogicalFile> getLogicalFiles(final String logicalName) throws BuildException {
        this.logicalFileIndex.loadAll();
        final List<String> relativeSavePaths = this.logicalFileIndex.getLogicalFilePaths(logicalName);
        return this.parseLogicalFilesFromRelativePaths(relativeSavePaths);
    }
    
    @Override
    public List<LogicalFile> getLogicalFiles() throws BuildException {
        this.logicalFileIndex.loadAll();
        final List<String> relativeSavePaths = this.logicalFileIndex.getAllLogicalFilePaths();
        return this.parseLogicalFilesFromRelativePaths(relativeSavePaths);
    }
    
    @Override
    public List<LogicalFile> getLogicalFiles(final LogicalDependency logicalDependency) throws BuildException {
        this.logicalFileIndex.loadAll();
        final List<String> relativeSavePaths = this.logicalFileIndex.getReferencedByPaths(logicalDependency.getLname());
        return this.parseLogicalFilesFromRelativePaths(relativeSavePaths);
    }
    
    public List<LogicalFile> getLogicalFiles(final List<LogicalDependency> lds) throws BuildException {
        final List<LogicalFile> lfiles = new ArrayList<LogicalFile>();
        for (final LogicalDependency logicalDependency : lds) {
            lfiles.addAll(this.getLogicalFiles(logicalDependency));
        }
        return lfiles;
    }
    
    @Override
    public void setName(final String newName) throws BuildException {
        final File newLocation = ((FileMetadataStore)MetadataStoreFactory.getMetadataStore()).getBuildGroup(this.group).renameCollection(this, newName);
        super.setName(newName);
        this.setLocation(newLocation);
        this.updateCollection();
    }
    
    @Override
    public void setOwner(final String owner) throws BuildException {
        super.setOwner(owner);
        this.updateCollection();
    }
    
    @Override
    public void setPermission(final int permission) throws BuildException {
        super.setPermission(permission);
        this.updateCollection();
    }
    
    @Override
    public void setTeam(final String team) throws BuildException {
        super.setTeam(team);
        this.updateCollection();
    }
    
    @Override
    public JSONObject toJSON() throws BuildException {
        final JSONObject jObj = super.toJSON();
        jObj.put((Object)"group", (Object)this.group);
        return jObj;
    }
    
    private File getSerializedFile(final String file) {
        final String fileName = new File(file).getName() + ".json";
        final File subDirectory = this.getSubDirectory(file);
        final File saveFile = new File(subDirectory, fileName);
        return saveFile;
    }
    
    private List<LogicalFile> parseLogicalFilesFromRelativePaths(final List<String> relativePaths) throws BuildException {
        final List<LogicalFile> logicalFiles = new ArrayList<LogicalFile>();
        if (relativePaths != null) {
            for (final String relativeSavePath : relativePaths) {
                final File saveFile = new File(this.location, relativeSavePath);
                logicalFiles.add(MetadataStoreUtil.parseLogicalFileFromJSON(saveFile));
            }
        }
        return logicalFiles;
    }
    
    private File getSubDirectory(final String path) {
        final File sourceFile = new File(path);
        final File parent = sourceFile.getParentFile();
        String relativePath;
        if (parent != null) {
            relativePath = parent.toString();
        }
        else {
            relativePath = ".dot";
        }
        final File subDirectory = new File(this.location, relativePath);
        return subDirectory;
    }
    
    protected void updateCollection() throws BuildException {
        super.objectUpdated();
        this.saveCollection();
    }
    
    protected void saveCollection() throws BuildException {
        final File saveFile = new File(this.location, "collection.json");
        saveFile.getParentFile().mkdirs();
        final JSONObject jObj = this.toJSON();
        try {
            MetadataStoreUtil.exportJSONToFile(jObj, saveFile);
        }
        catch (IOException ioe) {
            throw new BuildException(Messages.getMessage("MetadataStore_FILE_SAVE_ERROR", this.getName(), this.getClass().getName(), ioe.getMessage()));
        }
    }
    
    protected static CollectionImpl loadCollection(final File location) throws BuildException {
        final File saveFile = new File(location, "collection.json");
        JSONObject jObj;
        try {
            jObj = MetadataStoreUtil.importJSONFromFile(saveFile);
        }
        catch (IOException ioe) {
            throw new BuildException(Messages.getMessage("MetadataStore_READ_JSON_FORMAT", saveFile.getAbsolutePath(), ioe.getMessage()));
        }
        final ManagedObject obj = com.ibm.dbb.metadata.common.ManagedObject.loadManagedObject(jObj);
        final String name = (String)jObj.get((Object)"name");
        final String group = (String)jObj.get((Object)"group");
        CollectionImpl.logger.debug("Loaded collection '" + name + "' of group '" + group + "'' from file " + saveFile.getPath());
        return new CollectionImpl(name, group, location, obj);
    }
    
    protected File getLocation() {
        return this.location;
    }
    
    protected void setLocation(final File location) {
        this.location = location;
        this.logicalFileIndex.setLocation(location);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    static {
        CollectionImpl.logger = LoggerFactory.getLogger((Class)CollectionImpl.class);
    }
}
