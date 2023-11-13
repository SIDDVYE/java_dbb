// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java;

import java.io.Writer;
import java.io.IOException;
import java.io.OutputStream;

public interface JSONArtifact
{
    void serialize(final OutputStream p0) throws IOException;
    
    void serialize(final OutputStream p0, final boolean p1) throws IOException;
    
    void serialize(final Writer p0) throws IOException;
    
    void serialize(final Writer p0, final boolean p1) throws IOException;
    
    String serialize(final boolean p0) throws IOException;
    
    String serialize() throws IOException;
}
