// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import org.slf4j.LoggerFactory;
import java.util.Collections;
import java.util.Map;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.report.records.BuildResultRecord;
import com.ibm.dbb.metadata.BuildResult;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.dependency.LogicalFile;
import java.util.Iterator;
import java.util.ArrayList;
import com.ibm.dbb.metadata.Collection;
import com.ibm.dbb.dependency.LogicalDependency;
import java.util.List;
import org.slf4j.Logger;
import java.io.File;
import com.ibm.dbb.metadata.common.MetadataStoreConstants;
import com.ibm.dbb.metadata.MetadataStore;

public class FileMetadataStore implements MetadataStore, MetadataStoreConstants
{
    private File location;
    private File buildGroupsLocation;
    private BuildGroup defaultBuildGroup;
    private final String defaultBuildGroupName = "dbb_default";
    private static Logger logger;
    
    public FileMetadataStore(final String location) {
        this(new File(location));
    }
    
    public FileMetadataStore(final File location) {
        this.location = location;
        this.buildGroupsLocation = new File(location, ".dbb/metadata/");
        FileMetadataStore.logger.debug("Created new File MetadataStore at location: " + location.getAbsolutePath());
        FileMetadataStore.logger.debug("Build Groups Location: " + this.buildGroupsLocation.getAbsolutePath());
    }
    
    @Override
    public List<Collection> getImpactedFiles(final List<String> collections, final List<LogicalDependency> lds) throws BuildException {
        final List<Collection> impacts = new ArrayList<Collection>();
        for (final String collectionName : collections) {
            FileMetadataStore.logger.debug("Checking collection " + collectionName + " for impacted files of logical dependencies " + lds.toString());
            final CollectionImpl collection = this.getDefaultBuildGroup().getCollection(collectionName);
            if (collection == null) {
                FileMetadataStore.logger.debug("Collection '" + collectionName + "' not found. Skipping... ");
            }
            else {
                final List<LogicalFile> lfiles = collection.getLogicalFiles(lds);
                FileMetadataStore.logger.debug("Impacted logical files for lds: " + lfiles.toString());
                final Collection readOnlyCollection = new com.ibm.dbb.metadata.common.Collection(collection);
                readOnlyCollection.addLogicalFiles(lfiles);
                impacts.add(readOnlyCollection);
            }
        }
        return impacts;
    }
    
    @Override
    public Collection createCollection(final String collectionName) throws BuildException {
        return this.getDefaultBuildGroup().createCollection(collectionName);
    }
    
    @Override
    public Collection createCollection(final String name, final String owner, final String team, final int permission) throws BuildException {
        return this.getDefaultBuildGroup().createCollection(name, owner, team, permission);
    }
    
    @Override
    public boolean collectionExists(final String collectionName) throws BuildException {
        return this.getDefaultBuildGroup().collectionExists(collectionName);
    }
    
    @Override
    public List<Collection> getCollections() throws BuildException {
        return this.getDefaultBuildGroup().getCollections();
    }
    
    @Override
    public Collection getCollection(final String name) throws BuildException {
        return this.getDefaultBuildGroup().getCollection(name);
    }
    
    @Override
    public void deleteCollection(final String collectionName) throws BuildException {
        this.getDefaultBuildGroup().deleteCollection(collectionName);
    }
    
    @Override
    public void deleteCollection(final Collection collection) throws BuildException {
        this.deleteCollection(collection.getName());
    }
    
    @Override
    public Collection copyCollection(final Collection collection, final String newName) throws BuildException {
        return this.copyCollection(collection.getName(), newName);
    }
    
    @Override
    public Collection copyCollection(final String collectionName, final String newName) throws BuildException {
        return this.getDefaultBuildGroup().copyCollection(collectionName, newName);
    }
    
    @Override
    public BuildResult createBuildResult(final String group, final String label) throws BuildException {
        BuildGroup buildGroup;
        if (this.buildGroupExists(group)) {
            buildGroup = this.getBuildGroup(group);
        }
        else {
            buildGroup = this.createBuildGroup(group);
        }
        final BuildResult buildResult = buildGroup.createBuildResult(label);
        final BuildResultRecord buildResultRecord = new BuildResultRecord();
        buildResultRecord.setGroup(group);
        buildResultRecord.setLabel(label);
        buildResultRecord.setStoreType("file");
        buildResultRecord.setLocation(this.location.getPath());
        BuildReportFactory.getBuildReport().addRecord(buildResultRecord);
        return buildResult;
    }
    
    @Override
    public BuildResult createBuildResult(final String group, final String label, final String owner, final String team, final int permission) throws BuildException {
        BuildGroup buildGroup;
        if (this.buildGroupExists(group)) {
            buildGroup = this.getBuildGroup(group);
        }
        else {
            buildGroup = this.createBuildGroup(group);
        }
        final BuildResult buildResult = buildGroup.createBuildResult(label, owner, team, permission);
        final BuildResultRecord buildResultRecord = new BuildResultRecord();
        buildResultRecord.setGroup(group);
        buildResultRecord.setLabel(label);
        buildResultRecord.setStoreType("file");
        buildResultRecord.setLocation(this.location.getPath());
        BuildReportFactory.getBuildReport().addRecord(buildResultRecord);
        return buildResult;
    }
    
    @Override
    public boolean buildResultExists(final String group, final String label) throws BuildException {
        return this.buildGroupExists(group) && this.getBuildGroup(group).buildResultExists(label);
    }
    
    @Override
    public BuildResult getLastBuildResult(final String group, final int state, final int status) throws BuildException {
        if (this.buildGroupExists(group)) {
            final BuildGroup buildGroup = this.getBuildGroup(group);
            return buildGroup.getLastBuildResult(state, status);
        }
        throw new BuildException(Messages.getMessage("MetadataStore_GROUP_DNE", group));
    }
    
    @Override
    public List<BuildResult> getBuildResults(final Map<BuildResult.QueryParms, String> queryParms) throws BuildException {
        final List<BuildResult> buildResults = new ArrayList<BuildResult>();
        if (queryParms.containsKey(BuildResult.QueryParms.GROUP)) {
            final BuildGroup group = this.getBuildGroup(queryParms.get(BuildResult.QueryParms.GROUP));
            int state = -1;
            int status = -1;
            if (queryParms.containsKey(BuildResult.QueryParms.STATE)) {
                state = Integer.parseInt(queryParms.get(BuildResult.QueryParms.STATE));
            }
            if (queryParms.containsKey(BuildResult.QueryParms.STATUS)) {
                status = Integer.parseInt(queryParms.get(BuildResult.QueryParms.STATUS));
            }
            buildResults.addAll(group.getBuildResults(state, status));
        }
        if (queryParms.containsKey(BuildResult.QueryParms.ORDER_BY)) {
            final String orderBy = queryParms.get(BuildResult.QueryParms.ORDER_BY);
            if (!orderBy.equals("lastUpdated")) {
                throw new IllegalArgumentException(Messages.getMessage("MetadataStore_ORDERBY_NOT_SUPPORTED"));
            }
        }
        if (queryParms.containsKey(BuildResult.QueryParms.ORDER)) {
            final String order = queryParms.get(BuildResult.QueryParms.ORDER);
            if (order.equals("ASC")) {
                Collections.reverse(buildResults);
            }
        }
        return buildResults;
    }
    
    @Override
    public List<BuildResult> getBuildResults(final String group) throws BuildException {
        final List<BuildResult> buildResults = new ArrayList<BuildResult>();
        if (this.buildGroupExists(group)) {
            buildResults.addAll(this.getBuildGroup(group).getAllBuildResults());
        }
        return buildResults;
    }
    
    @Override
    public BuildResult getBuildResult(final String group, final String label) throws BuildException {
        if (!this.buildGroupExists(group)) {
            return null;
        }
        return this.getBuildGroup(group).getBuildResult(label);
    }
    
    @Override
    public List<String> listBuildResultGroups() throws BuildException {
        return this.listBuildGroups();
    }
    
    @Override
    public List<String> listBuildResultLabels(final String group) throws BuildException {
        final List<String> buildResultLabels = new ArrayList<String>();
        if (this.buildGroupExists(group)) {
            buildResultLabels.addAll(this.getBuildGroup(group).listBuildResultLabels());
        }
        return buildResultLabels;
    }
    
    @Override
    public void deleteBuildResults(final String group) throws BuildException {
        if (!this.buildGroupExists(group)) {
            return;
        }
        this.getBuildGroup(group).deleteAllBuildResults();
        this.deleteBuildGroup(group);
    }
    
    @Override
    public void deleteBuildResult(final BuildResult buildResult) throws BuildException {
        final String group = buildResult.getGroup();
        this.getBuildGroup(group).deleteBuildResult(buildResult.getLabel());
        if (this.getBuildGroup(group).listBuildResultLabels().size() == 0) {
            this.deleteBuildGroup(group);
        }
    }
    
    public List<String> listBuildGroups() throws BuildException {
        return Utils.listDecodeFilenames(this.buildGroupsLocation);
    }
    
    protected boolean buildGroupExists(final String name) throws BuildException {
        return this.getGroupLocation(name).exists();
    }
    
    protected BuildGroup getBuildGroup(final String name) throws BuildException {
        if (!this.buildGroupExists(name)) {
            throw new BuildException(Messages.getMessage("MetadataStore_GROUP_DNE", name));
        }
        final File location = this.getGroupLocation(name);
        return new BuildGroup(name, location);
    }
    
    private BuildGroup getDefaultBuildGroup() throws BuildException {
        if (this.defaultBuildGroup == null) {
            if (this.buildGroupExists("dbb_default")) {
                this.defaultBuildGroup = this.getBuildGroup("dbb_default");
            }
            else {
                this.defaultBuildGroup = this.createBuildGroup("dbb_default");
            }
        }
        return this.defaultBuildGroup;
    }
    
    private BuildGroup createBuildGroup(final String name) throws BuildException {
        if (this.buildGroupExists(name)) {
            throw new BuildException(Messages.getMessage("MetadataStore_GROUP_EXISTS", name));
        }
        final File location = this.getGroupLocation(name);
        return new BuildGroup(name, location);
    }
    
    private void deleteBuildGroup(final String name) throws BuildException {
        if (!this.buildGroupExists(name)) {
            throw new BuildException(Messages.getMessage("MetadataStore_GROUP_DNE", name));
        }
        final File location = this.getGroupLocation(name);
        Utils.deleteDirectory(location);
    }
    
    private File getGroupLocation(final String name) throws BuildException {
        final String encodedFilename = Utils.encodeFilename(name);
        return new File(this.buildGroupsLocation, encodedFilename);
    }
    
    public boolean fullReset() {
        return Utils.deleteDirectory(this.location);
    }
    
    static {
        FileMetadataStore.logger = LoggerFactory.getLogger((Class)BuildGroup.class);
    }
}
