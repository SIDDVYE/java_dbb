// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import org.slf4j.LoggerFactory;
import java.util.Map;
import com.ibm.dbb.metadata.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import com.ibm.dbb.metadata.BuildResult;
import java.util.Date;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.BuildException;
import java.util.List;
import org.slf4j.Logger;
import java.util.LinkedHashMap;
import java.io.File;

public class BuildGroup
{
    private String name;
    private File location;
    private File buildResultsLocation;
    private BuildResultIndex buildIndex;
    private File collectionsLocation;
    private LinkedHashMap<String, CollectionImpl> collectionCache;
    private final int collectionCacheSize = 25;
    private static Logger logger;
    
    protected BuildGroup(final String name, final File location) {
        this.location = location;
        this.name = name;
        this.buildResultsLocation = new File(location, "buildresults/");
        this.collectionsLocation = new File(location, "collections/");
        this.buildIndex = new BuildResultIndex(this.buildResultsLocation);
        this.collectionCache = new LinkedHashMap<String, CollectionImpl>();
    }
    
    protected List<String> listBuildResultLabels() throws BuildException {
        this.buildIndex.load();
        return this.buildIndex.listBuildResultLabels();
    }
    
    protected BuildResultImpl createBuildResult(final String label) throws BuildException {
        return this.createBuildResult(label, System.getProperty("user.name"), null, 436);
    }
    
    protected BuildResultImpl createBuildResult(final String label, final String owner, final String team, final int permission) throws BuildException {
        this.buildIndex.load();
        if (this.buildIndex.buildResultExists(label)) {
            throw new BuildException(Messages.getMessage("MetadataStore_BUILD_RESULT_EXISTS", label, this.getName()));
        }
        final String dirName = Utils.encodeFilename(label);
        final File location = new File(this.buildResultsLocation, dirName);
        final String user = System.getProperty("user.name");
        final Date creationDate = new Date();
        this.buildIndex.addNewBuildResult(label, dirName, 0, 0);
        this.buildResultsLocation.mkdirs();
        this.buildIndex.save();
        final BuildResultImpl buildResult = new BuildResultImpl(this.getName(), location, label, 0, 0, owner, team, permission, creationDate, user, creationDate, user);
        buildResult.save();
        return buildResult;
    }
    
    protected boolean buildResultExists(final String label) throws BuildException {
        this.buildIndex.load();
        return this.buildIndex.buildResultExists(label);
    }
    
    protected BuildResultImpl getBuildResult(final String label) throws BuildException {
        this.buildIndex.load();
        if (!this.buildResultExists(label)) {
            return null;
        }
        final String relativeDir = this.buildIndex.getBuildResultDir(label);
        return this.loadBuildResult(relativeDir);
    }
    
    private BuildResultImpl loadBuildResult(final String relativePath) throws BuildException {
        final File location = new File(this.buildResultsLocation, relativePath);
        return BuildResultImpl.loadBuildResult(location);
    }
    
    protected List<BuildResult> getAllBuildResults() throws BuildException {
        final List<BuildResult> buildResults = new ArrayList<BuildResult>();
        this.buildIndex.load();
        for (final String relativeDir : this.buildIndex.listBuildResultDirs()) {
            buildResults.add(this.loadBuildResult(relativeDir));
        }
        return buildResults;
    }
    
    protected BuildResultImpl getLastBuildResult(final int state, final int status) throws BuildException {
        this.buildIndex.load();
        final String relativeDir = this.buildIndex.getLastBuildResultDir(state, status);
        if (relativeDir == null) {
            return null;
        }
        return this.loadBuildResult(relativeDir);
    }
    
    protected List<BuildResult> getBuildResults(final int state, final int status) throws BuildException {
        final List<BuildResult> buildResults = new ArrayList<BuildResult>();
        this.buildIndex.load();
        for (final String relativeDir : this.buildIndex.getBuildDirs(state, status)) {
            buildResults.add(this.loadBuildResult(relativeDir));
        }
        return buildResults;
    }
    
    protected boolean deleteBuildResult(final String label) throws BuildException {
        return this.buildResultExists(label) && this.deleteBuildResult(this.getBuildResult(label));
    }
    
    protected boolean deleteBuildResult(final BuildResultImpl buildResult) throws BuildException {
        this.buildIndex.load();
        final boolean isDeleted = this.buildIndex.removeBuildResult(buildResult.getLabel());
        if (isDeleted) {
            Utils.deleteDirectory(buildResult.getLocation());
        }
        this.buildIndex.save();
        return isDeleted;
    }
    
    protected void deleteAllBuildResults() throws BuildException {
        for (final String label : this.listBuildResultLabels()) {
            this.deleteBuildResult(label);
        }
    }
    
    protected void updateBuildResultStatus(final String label, final int value) throws BuildException {
        this.buildIndex.load();
        this.buildIndex.updateStatus(label, value);
        this.buildIndex.save();
    }
    
    protected void updateBuildResultState(final String label, final int value) throws BuildException {
        this.buildIndex.load();
        this.buildIndex.updateState(label, value);
        this.buildIndex.save();
    }
    
    protected void refreshBuildResult(final String label) throws BuildException {
        this.buildIndex.load();
        this.buildIndex.refreshBuildResult(label);
        this.buildIndex.save();
    }
    
    protected List<String> listCollections() throws BuildException {
        return Utils.listDecodeFilenames(this.collectionsLocation);
    }
    
    protected List<Collection> getCollections() throws BuildException {
        final List<String> collectionFilenames = Utils.listFilenames(this.collectionsLocation);
        final List<Collection> collections = new ArrayList<Collection>();
        for (final String collectionFilename : collectionFilenames) {
            final File location = new File(this.collectionsLocation, collectionFilename);
            final Collection collection = CollectionImpl.loadCollection(location);
            collections.add(collection);
        }
        return collections;
    }
    
    protected boolean collectionExists(final String name) throws BuildException {
        return this.getCollectionLocation(name).exists();
    }
    
    protected CollectionImpl getCollection(final String name) throws BuildException {
        if (this.collectionCache.containsKey(name)) {
            return this.collectionCache.get(name);
        }
        if (!this.collectionExists(name)) {
            BuildGroup.logger.debug("Collection '" + name + "' does not exist. Returning null...");
            return null;
        }
        final File location = this.getCollectionLocation(name);
        final CollectionImpl collection = CollectionImpl.loadCollection(location);
        this.addToCollectionCache(collection);
        return collection;
    }
    
    private void addToCollectionCache(final CollectionImpl collection) {
        if (this.collectionCache.size() >= 25) {
            this.collectionCache.remove(this.collectionCache.entrySet().iterator().next().getKey());
        }
        this.collectionCache.put(collection.getName(), collection);
    }
    
    protected CollectionImpl createCollection(final String name) throws BuildException {
        return this.createCollection(name, System.getProperty("user.name"), null, 436);
    }
    
    protected CollectionImpl createCollection(final String name, final String owner, final String team, final int permission) throws BuildException {
        if (this.collectionExists(name)) {
            throw new BuildException(Messages.getMessage("MetadataStore_COLLECTION_EXISTS", name));
        }
        final File location = this.getCollectionLocation(name);
        final String user = System.getProperty("user.name");
        final Date creationDate = new Date();
        final CollectionImpl collection = new CollectionImpl(name, this.getName(), location, owner, team, permission, creationDate, user, creationDate, user);
        collection.saveCollection();
        return collection;
    }
    
    protected boolean deleteCollection(final String collectionName) throws BuildException {
        return this.collectionExists(collectionName) && this.deleteCollection(this.getCollection(collectionName));
    }
    
    protected boolean deleteCollection(final CollectionImpl collection) throws BuildException {
        final File location = collection.getLocation();
        final boolean rc = Utils.deleteDirectory(location);
        if (rc) {
            this.collectionCache.remove(collection.getName());
            BuildGroup.logger.debug(collection.getName() + " collection deleted!");
        }
        return rc;
    }
    
    protected File renameCollection(final CollectionImpl collection, final String newName) throws BuildException {
        final File oldLocation = collection.getLocation();
        final String oldName = collection.getName();
        final File newLocation = this.getCollectionLocation(newName);
        if (this.collectionExists(newName)) {
            throw new BuildException(Messages.getMessage("MetadataStore_COLLECTION_EXISTS", newName));
        }
        if (!oldLocation.renameTo(newLocation)) {
            throw new FileSystemStoreException("Unable to rename collection ");
        }
        this.collectionCache.remove(oldName);
        BuildGroup.logger.debug("Renamed collection directory: " + oldLocation.getPath() + " -> " + newLocation.getPath());
        return newLocation;
    }
    
    protected CollectionImpl copyCollection(final String collection, final String newName) throws BuildException {
        return this.copyCollection(this.getCollection(collection), newName);
    }
    
    protected CollectionImpl copyCollection(final CollectionImpl collection, final String name) throws BuildException {
        final CollectionImpl newCollection = this.createCollection(name, collection.getOwner(), collection.getTeam(), collection.getPermission());
        newCollection.addLogicalFiles(collection.getLogicalFiles());
        BuildGroup.logger.info("Copied '" + collection.getName() + "' to new collection '" + name + "'.");
        return newCollection;
    }
    
    private File getCollectionLocation(final String name) {
        final String encodedFilename = Utils.encodeFilename(name);
        return new File(this.collectionsLocation, encodedFilename);
    }
    
    public String getName() {
        return this.name;
    }
    
    public File getLocation() {
        return this.location;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final BuildGroup other = (BuildGroup)obj;
        return this.getName().equals(other.getName()) && this.getLocation().equals(other.getLocation());
    }
    
    static {
        BuildGroup.logger = LoggerFactory.getLogger((Class)BuildGroup.class);
    }
}
