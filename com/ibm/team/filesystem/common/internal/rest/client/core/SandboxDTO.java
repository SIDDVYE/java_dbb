// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

import java.util.List;

public interface SandboxDTO
{
    String getSandboxPath();
    
    void setSandboxPath(final String p0);
    
    void unsetSandboxPath();
    
    boolean isSetSandboxPath();
    
    List getAllShares();
    
    void unsetAllShares();
    
    boolean isSetAllShares();
    
    Boolean getCaseSensitive();
    
    void setCaseSensitive(final Boolean p0);
    
    void unsetCaseSensitive();
    
    boolean isSetCaseSensitive();
    
    Boolean getCorrupted();
    
    void setCorrupted(final Boolean p0);
    
    void unsetCorrupted();
    
    boolean isSetCorrupted();
    
    Boolean getSandboxListening();
    
    void setSandboxListening(final Boolean p0);
    
    void unsetSandboxListening();
    
    boolean isSetSandboxListening();
}
