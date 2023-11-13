// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

public interface MagicDTO
{
    String getPattern();
    
    void setPattern(final String p0);
    
    void unsetPattern();
    
    boolean isSetPattern();
    
    String getEncoding();
    
    void setEncoding(final String p0);
    
    void unsetEncoding();
    
    boolean isSetEncoding();
    
    String getMimeType();
    
    void setMimeType(final String p0);
    
    void unsetMimeType();
    
    boolean isSetMimeType();
    
    String getLineDelimiter();
    
    void setLineDelimiter(final String p0);
    
    void unsetLineDelimiter();
    
    boolean isSetLineDelimiter();
    
    boolean isBuiltIn();
    
    void setBuiltIn(final boolean p0);
    
    void unsetBuiltIn();
    
    boolean isSetBuiltIn();
    
    boolean isIgnoreCase();
    
    void setIgnoreCase(final boolean p0);
    
    void unsetIgnoreCase();
    
    boolean isSetIgnoreCase();
}
