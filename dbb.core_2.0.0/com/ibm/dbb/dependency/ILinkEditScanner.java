// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import java.io.IOException;
import com.ibm.dbb.build.BuildException;

public interface ILinkEditScanner
{
    LogicalFile scan(final String p0) throws BuildException, IOException;
    
    LogicalFile scan(final String p0, final String p1) throws BuildException, IOException;
    
    LogicalFile scan(final String p0, final String p1, final String p2) throws BuildException, IOException;
    
    String getScannerOutput();
    
    void setExcludeFilter(final String p0);
    
    String getExcludeFilter();
    
    String getLibpath();
    
    void setLibpath(final String p0);
}
