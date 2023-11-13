// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;

public interface EncodingErrorDTO
{
    ShareableDTO getShareable();
    
    void setShareable(final ShareableDTO p0);
    
    void unsetShareable();
    
    boolean isSetShareable();
    
    boolean isMalformedContent();
    
    void setMalformedContent(final boolean p0);
    
    void unsetMalformedContent();
    
    boolean isSetMalformedContent();
    
    boolean isUnknownEncoding();
    
    void setUnknownEncoding(final boolean p0);
    
    void unsetUnknownEncoding();
    
    boolean isSetUnknownEncoding();
    
    String getEncoding();
    
    void setEncoding(final String p0);
    
    void unsetEncoding();
    
    boolean isSetEncoding();
    
    String getPredecessorEncoding();
    
    void setPredecessorEncoding(final String p0);
    
    void unsetPredecessorEncoding();
    
    boolean isSetPredecessorEncoding();
    
    boolean isAtomicCommit();
    
    void setAtomicCommit(final boolean p0);
    
    void unsetAtomicCommit();
    
    boolean isSetAtomicCommit();
    
    boolean isDirectionProvided();
    
    void setDirectionProvided(final boolean p0);
    
    void unsetDirectionProvided();
    
    boolean isSetDirectionProvided();
}
