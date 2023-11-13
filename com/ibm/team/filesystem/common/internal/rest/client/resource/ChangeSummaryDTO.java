// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

public interface ChangeSummaryDTO
{
    String getBeforeStateId();
    
    void setBeforeStateId(final String p0);
    
    void unsetBeforeStateId();
    
    boolean isSetBeforeStateId();
    
    String getAfterStateId();
    
    void setAfterStateId(final String p0);
    
    void unsetAfterStateId();
    
    boolean isSetAfterStateId();
    
    String getLastMergeState();
    
    void setLastMergeState(final String p0);
    
    void unsetLastMergeState();
    
    boolean isSetLastMergeState();
    
    String getPathHint();
    
    void setPathHint(final String p0);
    
    void unsetPathHint();
    
    boolean isSetPathHint();
    
    String getNewPathHint();
    
    void setNewPathHint(final String p0);
    
    void unsetNewPathHint();
    
    boolean isSetNewPathHint();
}
