// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata;

import com.ibm.dbb.dependency.LogicalDependency;
import java.util.List;
import com.ibm.dbb.dependency.LogicalFile;
import com.ibm.dbb.build.BuildException;

public interface Collection extends ManagedObject
{
    Collection copy(final String p0) throws BuildException;
    
    String getName();
    
    void setName(final String p0) throws BuildException;
    
    LogicalFile getLogicalFile(final String p0) throws BuildException;
    
    List<LogicalFile> getLogicalFiles(final String p0) throws BuildException;
    
    List<LogicalFile> getLogicalFiles(final LogicalDependency p0) throws BuildException;
    
    List<LogicalFile> getLogicalFiles() throws BuildException;
    
    void deleteLogicalFile(final String p0) throws BuildException;
    
    void addLogicalFile(final LogicalFile p0) throws BuildException;
    
    void addLogicalFiles(final List<LogicalFile> p0) throws BuildException;
}
