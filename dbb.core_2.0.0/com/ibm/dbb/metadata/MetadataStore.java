// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata;

import java.util.Map;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.dependency.LogicalDependency;
import java.util.List;

public interface MetadataStore
{
    List<Collection> getImpactedFiles(final List<String> p0, final List<LogicalDependency> p1) throws BuildException;
    
    Collection createCollection(final String p0) throws BuildException;
    
    Collection createCollection(final String p0, final String p1, final String p2, final int p3) throws BuildException;
    
    boolean collectionExists(final String p0) throws BuildException;
    
    List<Collection> getCollections() throws BuildException;
    
    Collection getCollection(final String p0) throws BuildException;
    
    void deleteCollection(final String p0) throws BuildException;
    
    void deleteCollection(final Collection p0) throws BuildException;
    
    Collection copyCollection(final Collection p0, final String p1) throws BuildException;
    
    Collection copyCollection(final String p0, final String p1) throws BuildException;
    
    BuildResult createBuildResult(final String p0, final String p1, final String p2, final String p3, final int p4) throws BuildException;
    
    BuildResult createBuildResult(final String p0, final String p1) throws BuildException;
    
    boolean buildResultExists(final String p0, final String p1) throws BuildException;
    
    BuildResult getLastBuildResult(final String p0, final int p1, final int p2) throws BuildException;
    
    List<BuildResult> getBuildResults(final Map<BuildResult.QueryParms, String> p0) throws BuildException;
    
    List<BuildResult> getBuildResults(final String p0) throws BuildException;
    
    BuildResult getBuildResult(final String p0, final String p1) throws BuildException;
    
    List<String> listBuildResultGroups() throws BuildException;
    
    List<String> listBuildResultLabels(final String p0) throws BuildException;
    
    void deleteBuildResults(final String p0) throws BuildException;
    
    void deleteBuildResult(final BuildResult p0) throws BuildException;
}
