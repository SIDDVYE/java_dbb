// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import com.ibm.dbb.build.BuildException;
import java.util.List;
import java.io.InputStream;
import java.io.FileNotFoundException;

public interface IDependencyScanner
{
    LogicalFile scan(final String p0, final String p1) throws FileNotFoundException;
    
    LogicalFile scan(final String p0, final String p1, final String p2) throws FileNotFoundException;
    
    LogicalFile scan(final String p0, final InputStream p1);
    
    LogicalFile scan(final String p0, final InputStream p1, final String p2);
    
    List<LogicalFile> scanArchive(final String p0, final String p1, final String p2) throws BuildException;
    
    List<LogicalFile> scanArchive(final String p0, final String p1) throws BuildException;
    
    LogicalFile scanArchivedFile(final String p0, final String p1, final String p2) throws BuildException;
    
    LogicalFile scanArchivedFile(final String p0, final String p1, final String p2, final String p3) throws BuildException;
}
