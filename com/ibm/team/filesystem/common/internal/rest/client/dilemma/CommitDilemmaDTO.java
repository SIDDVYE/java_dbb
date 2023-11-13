// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma;

import java.util.List;

public interface CommitDilemmaDTO
{
    List getLineDelimiterFailures();
    
    void unsetLineDelimiterFailures();
    
    boolean isSetLineDelimiterFailures();
    
    List getEncodingFailures();
    
    void unsetEncodingFailures();
    
    boolean isSetEncodingFailures();
    
    List getBrokenLinks();
    
    void unsetBrokenLinks();
    
    boolean isSetBrokenLinks();
    
    List getNonInteroperableLinks();
    
    void unsetNonInteroperableLinks();
    
    boolean isSetNonInteroperableLinks();
    
    List getPredecessorDeletedShareables();
    
    void unsetPredecessorDeletedShareables();
    
    boolean isSetPredecessorDeletedShareables();
    
    List getNonPatchShareables();
    
    void unsetNonPatchShareables();
    
    boolean isSetNonPatchShareables();
}
