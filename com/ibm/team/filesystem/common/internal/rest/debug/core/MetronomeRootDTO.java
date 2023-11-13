// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public interface MetronomeRootDTO
{
    List getRepos();
    
    void unsetRepos();
    
    boolean isSetRepos();
    
    MetronomeMethodDTO getMethod(final String p0, final String p1);
    
    MetronomeServiceDTO getService(final String p0, final String p1);
    
    long getMethodCallCount(final String p0, final String p1);
    
    long getMethodTime(final String p0, final String p1);
    
    long getServiceCallCount(final String p0, final String p1);
    
    long getServiceTime(final String p0, final String p1);
    
    void tabulate(final Writer p0) throws IOException;
}
