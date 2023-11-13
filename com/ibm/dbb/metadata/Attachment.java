// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata;

import com.ibm.json.java.JSONObject;
import com.ibm.dbb.build.BuildException;
import java.io.InputStream;

public interface Attachment
{
    String getName();
    
    void setName(final String p0);
    
    String getContentType();
    
    void setContentType(final String p0);
    
    long getSize();
    
    void setSize(final long p0);
    
    long getChecksum();
    
    void setChecksum(final long p0);
    
    InputStream getContent() throws BuildException;
    
    void setContent(final InputStream p0) throws BuildException;
    
    JSONObject toJSON();
    
    String toString();
}
