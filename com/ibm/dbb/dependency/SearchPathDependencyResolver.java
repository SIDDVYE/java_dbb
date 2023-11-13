// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.dependency.internal.SearchPathParser;
import java.util.Iterator;
import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.report.records.DependencySetRecord;
import com.ibm.dbb.dependency.internal.DependencyUtilities;
import com.ibm.dbb.build.internal.DBBSMFWriter;
import com.ibm.dbb.build.internal.ProductRegistrationChecker;
import java.util.ArrayList;
import org.slf4j.Logger;
import com.ibm.dbb.dependency.internal.SearchPath;
import java.util.List;

public class SearchPathDependencyResolver
{
    protected String searchPath;
    protected boolean disableCache;
    protected List<SearchPath> searchPathList;
    protected static Logger logger;
    
    public SearchPathDependencyResolver(final String searchPath) {
        this(searchPath, false);
    }
    
    public SearchPathDependencyResolver(final String searchPath, final boolean disableCache) {
        this.searchPath = searchPath;
        this.disableCache = disableCache;
    }
    
    public List<PhysicalDependency> resolveDependencies(final String file, final String sourceDir) throws BuildException, DependencyException, IOException {
        final List<PhysicalDependency> dependencies = new ArrayList<PhysicalDependency>();
        ProductRegistrationChecker.check();
        DBBSMFWriter.writeDBBSMFRecord();
        final LogicalFile logicalFile = DependencyUtilities.getLogicalFile(file, sourceDir, this.disableCache);
        this.resolveDependencies(logicalFile, dependencies);
        final DependencySetRecord record = new DependencySetRecord();
        record.setFile(logicalFile.getFile());
        record.addAllDependencies(dependencies);
        BuildReportFactory.getBuildReport().addRecord(record);
        return dependencies;
    }
    
    public LogicalFile resolveSubsystems(final String file, final String sourceDir) throws BuildException, DependencyException, IOException {
        final LogicalFile logicalFile = DependencyUtilities.getLogicalFile(file, sourceDir, this.disableCache);
        final List<PhysicalDependency> dependencies = new ArrayList<PhysicalDependency>();
        ProductRegistrationChecker.check();
        DBBSMFWriter.writeDBBSMFRecord();
        this.resolveDependencies(logicalFile, dependencies);
        for (final PhysicalDependency dependency : dependencies) {
            if (dependency.isResolved()) {
                final LogicalFile dependencyLogicalFile = DependencyUtilities.getLogicalFile(dependency.getFile(), dependency.getSourceDir(), this.disableCache);
                if (dependencyLogicalFile.isCICS()) {
                    logicalFile.setCICS(true);
                }
                if (dependencyLogicalFile.isDLI()) {
                    logicalFile.setDLI(true);
                }
                if (dependencyLogicalFile.isMQ()) {
                    logicalFile.setMQ(true);
                }
                if (!dependencyLogicalFile.isSQL()) {
                    continue;
                }
                logicalFile.setSQL(true);
            }
        }
        return logicalFile;
    }
    
    public static LogicalFile getLogicalFile(final String file, final String sourceDir) throws BuildException {
        return DependencyUtilities.getLogicalFile(file, sourceDir, false);
    }
    
    public static LogicalFile getLogicalFile(final String file, final String sourceDir, final boolean disableCache) throws BuildException {
        return DependencyUtilities.getLogicalFile(file, sourceDir, disableCache);
    }
    
    public static LogicalFile getArchivedLogicalFile(final String file, final String archive) throws BuildException {
        return getArchivedLogicalFile(archive, file, false);
    }
    
    public static LogicalFile getArchivedLogicalFile(final String file, final String archive, final boolean disableCache) throws BuildException {
        return DependencyUtilities.getArchivedLogicalFile(archive, file, disableCache);
    }
    
    public boolean isDisableCache() {
        return this.disableCache;
    }
    
    public String getSearchPath() {
        return this.searchPath;
    }
    
    public List<SearchPath> getSearchPathList() throws BuildException {
        if (this.searchPathList == null) {
            final SearchPathParser searchPathParser = new SearchPathParser();
            this.searchPathList = searchPathParser.parse(this.getSearchPath());
        }
        return this.searchPathList;
    }
    
    private void resolveDependencies(final LogicalFile logicalFile, final List<PhysicalDependency> allDependencies) throws BuildException, DependencyException, IOException {
        final List<PhysicalDependency> dependencies = logicalFile.resolveDependencies(this.getSearchPathList());
        for (final PhysicalDependency dependency : dependencies) {
            if (!allDependencies.contains(dependency)) {
                allDependencies.add(dependency);
                if (!dependency.isResolved()) {
                    continue;
                }
                LogicalFile dependencyLogicalFile = null;
                if (dependency.getArchive() != null) {
                    dependencyLogicalFile = DependencyUtilities.getArchivedLogicalFile(dependency.getFile(), dependency.getArchive(), this.disableCache);
                }
                else {
                    dependencyLogicalFile = DependencyUtilities.getLogicalFile(dependency.getFile(), dependency.getSourceDir(), this.disableCache);
                }
                this.resolveDependencies(dependencyLogicalFile, allDependencies);
            }
        }
    }
    
    static {
        SearchPathDependencyResolver.logger = LoggerFactory.getLogger((Class)SearchPathDependencyResolver.class);
    }
}
