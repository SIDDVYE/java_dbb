// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.io.File;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.DDStatement;
import java.util.List;

public interface DDProcess
{
    List<DDStatement> getDDs();
    
    int alloc(final DDStatement p0) throws BuildException;
    
    int alloc(final List<DDStatement> p0) throws BuildException;
    
    int allocateDDForInstreamData(final DDStatement p0) throws BuildException;
    
    int executeMvsPgm(final String p0, final String p1, final String p2, final boolean p3) throws BuildException;
    
    void free(final DDStatement p0, final boolean p1);
    
    void freeAll(final boolean p0);
    
    void free(final String p0);
    
    void dispose();
    
    boolean supportMultiThread();
    
    int copydd(final String p0, final String p1, final String p2, final File p3, final String p4, final boolean p5, final boolean p6) throws BuildException;
    
    List<String> getDDNames() throws BuildException;
}
