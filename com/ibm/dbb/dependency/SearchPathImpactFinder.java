// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.metadata.MetadataStoreFactory;
import java.util.Collection;
import com.ibm.dbb.dependency.internal.SearchPathParser;
import java.util.Iterator;
import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import java.util.ArrayList;
import com.ibm.dbb.dependency.internal.DependencyUtilities;
import java.util.HashSet;
import com.ibm.dbb.build.internal.DBBSMFWriter;
import com.ibm.dbb.build.internal.ProductRegistrationChecker;
import java.util.Set;
import org.slf4j.Logger;
import com.ibm.dbb.dependency.internal.SearchPath;
import java.util.List;

public class SearchPathImpactFinder
{
    private String searchPath;
    private List<SearchPath> searchPathList;
    private List<String> collections;
    private boolean disableCache;
    private static Logger logger;
    
    public SearchPathImpactFinder(final String searchPath, final List<String> collections) {
        this.searchPath = searchPath;
        this.collections = collections;
    }
    
    public SearchPathImpactFinder(final String searchPath, final List<String> collections, final boolean disableCache) {
        this.searchPath = searchPath;
        this.collections = collections;
        this.disableCache = disableCache;
    }
    
    public Set<ImpactFile> findImpactedFiles(final String changedFile, final String sourceDir) throws BuildException, DependencyException, IOException {
        ProductRegistrationChecker.check();
        DBBSMFWriter.writeDBBSMFRecord();
        final HashSet<ImpactFile> impactedFiles = new HashSet<ImpactFile>();
        final LogicalFile logicalFile = DependencyUtilities.getLogicalFile(changedFile, sourceDir, this.disableCache);
        if (this.inSearchPath(logicalFile)) {
            SearchPathImpactFinder.logger.debug("Resolving impacted files for changed file " + changedFile);
            final List<LogicalFile> logicalFiles = new ArrayList<LogicalFile>();
            logicalFiles.add(logicalFile);
            this.findImpactedFiles(logicalFiles, impactedFiles);
        }
        else {
            SearchPathImpactFinder.logger.debug("Changed file " + changedFile + " is not in searchpath.  Skipping impact search.");
        }
        return impactedFiles;
    }
    
    private void findImpactedFiles(final List<LogicalFile> logicalFiles, final Set<ImpactFile> allImpacts) throws BuildException, DependencyException, IOException {
        final List<ImpactFile> impacts = this.findImpacts(logicalFiles);
        final List<LogicalFile> nextLevelImpacts = new ArrayList<LogicalFile>();
        for (final ImpactFile impact : impacts) {
            if (!allImpacts.contains(impact)) {
                SearchPathImpactFinder.logger.debug("Impact file {} is not already contained in allImpacts master set. Adding to set.", (Object)impact.getFile());
                allImpacts.add(impact);
                nextLevelImpacts.add(impact.getLogicalFile());
            }
        }
        if (!nextLevelImpacts.isEmpty()) {
            SearchPathImpactFinder.logger.debug("Recursively calling findImpactedFiles for nextLevelImpacts: {} ", (Object)nextLevelImpacts.toString());
            this.findImpactedFiles(nextLevelImpacts, allImpacts);
        }
    }
    
    private boolean inSearchPath(final LogicalFile logicalFile) throws BuildException, IOException {
        for (final SearchPath path : this.getSearchPathList()) {
            final LogicalDependency ldep = new LogicalDependency(logicalFile.getLname(), null, null);
            final PhysicalDependency pdep = path.find(ldep, true);
            if (pdep.isResolved()) {
                return true;
            }
        }
        return false;
    }
    
    public List<SearchPath> getSearchPathList() throws BuildException {
        if (this.searchPathList == null) {
            final SearchPathParser parser = new SearchPathParser();
            this.searchPathList = parser.parse(this.getSearchPath());
        }
        return this.searchPathList;
    }
    
    public String getSearchPath() {
        return this.searchPath;
    }
    
    public List<String> getCollections() {
        return this.collections;
    }
    
    public boolean isDisableCache() {
        return this.disableCache;
    }
    
    private List<String> searchLnames(final List<LogicalFile> logicalFiles) {
        final Set<String> lnames = new HashSet<String>();
        for (final LogicalFile logicalFile : logicalFiles) {
            lnames.add(logicalFile.getLname());
        }
        return new ArrayList<String>(lnames);
    }
    
    private List<String> searchFiles(final List<LogicalFile> logicalFiles) {
        final Set<String> files = new HashSet<String>();
        for (final LogicalFile logicalFile : logicalFiles) {
            files.add(logicalFile.getFile());
        }
        return new ArrayList<String>(files);
    }
    
    private List<ImpactFile> findImpacts(final List<LogicalFile> logicalFiles) throws IOException, BuildException, DependencyException {
        SearchPathImpactFinder.logger.debug("Entering SearchPathImpactFinder.findImpacts");
        final List<ImpactFile> impactFileList = new ArrayList<ImpactFile>();
        SearchPathImpactFinder.logger.debug("Searching collections '{}' for logical files '{}'", (Object)this.collections, (Object)logicalFiles);
        final List<com.ibm.dbb.metadata.Collection> impactFiles = this.getImpactedFiles(logicalFiles);
        if (impactFiles == null || impactFiles.size() == 0) {
            SearchPathImpactFinder.logger.debug("No impacted files returned from repository collections");
        }
        final List<String> searchLnames = this.searchLnames(logicalFiles);
        final List<String> searchFiles = this.searchFiles(logicalFiles);
        for (final com.ibm.dbb.metadata.Collection collection : impactFiles) {
            for (final LogicalFile logicalFile : collection.getLogicalFiles()) {
                SearchPathImpactFinder.logger.debug("Potential impacted file: {}", (Object)logicalFile);
                if (this.searchPath == null) {
                    final ImpactFile impactedFile = new ImpactFile(logicalFile, collection);
                    if (impactFileList.contains(impactedFile)) {
                        continue;
                    }
                    SearchPathImpactFinder.logger.debug("Searchpath is null so automatically adding to list");
                    impactFileList.add(impactedFile);
                }
                else {
                    final List<PhysicalDependency> physicalDependencies = logicalFile.resolveDependencies(this.getSearchPathList(), searchLnames);
                    if (physicalDependencies.size() == 0) {
                        SearchPathImpactFinder.logger.debug("No physical dependencies returned from resolveDependencies");
                    }
                    for (final PhysicalDependency physicalDependency : physicalDependencies) {
                        SearchPathImpactFinder.logger.debug("Processing physical dependency {}", (Object)physicalDependency);
                        if (physicalDependency.isResolved() && searchFiles.contains(physicalDependency.getFile())) {
                            final ImpactFile impactedFile2 = new ImpactFile(logicalFile, collection);
                            if (impactFileList.contains(impactedFile2)) {
                                continue;
                            }
                            SearchPathImpactFinder.logger.debug("Impact file {} is impacted by {}. Adding to list", (Object)impactedFile2.getFile(), (Object)physicalDependency.getFile());
                            impactFileList.add(impactedFile2);
                        }
                        else {
                            SearchPathImpactFinder.logger.debug("Impact file {} is NOT impacted by this file {}. Skipping.", (Object)logicalFile.getFile(), (Object)physicalDependency.getFile());
                        }
                    }
                }
            }
        }
        SearchPathImpactFinder.logger.debug("Leaving SearchPathImpactFinder.findImpacts");
        return impactFileList;
    }
    
    private List<com.ibm.dbb.metadata.Collection> getImpactedFiles(final List<LogicalFile> logicalFiles) throws BuildException {
        List<com.ibm.dbb.metadata.Collection> impactedFiles = null;
        if (this.collections != null && !this.collections.isEmpty()) {
            final List<LogicalDependency> lds = new ArrayList<LogicalDependency>();
            final List<String> lnames = this.searchLnames(logicalFiles);
            for (final String lname : lnames) {
                lds.add(new LogicalDependency(lname, null, null));
            }
            impactedFiles = MetadataStoreFactory.getMetadataStore().getImpactedFiles(this.collections, lds);
        }
        return impactedFiles;
    }
    
    static {
        SearchPathImpactFinder.logger = LoggerFactory.getLogger((Class)SearchPathImpactFinder.class);
    }
}
