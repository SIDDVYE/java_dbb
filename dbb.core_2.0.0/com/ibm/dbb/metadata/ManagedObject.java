// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata;

import com.ibm.dbb.build.BuildException;

public interface ManagedObject extends MetadataObject
{
    String getOwner() throws BuildException;
    
    void setOwner(final String p0) throws BuildException;
    
    String getTeam() throws BuildException;
    
    void setTeam(final String p0) throws BuildException;
    
    int getPermission() throws BuildException;
    
    void setPermission(final int p0) throws BuildException;
}
