// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;

public interface LoadResultDTO
{
    List getLoadRuleProblems();
    
    void unsetLoadRuleProblems();
    
    boolean isSetLoadRuleProblems();
    
    List getEclipseReadFailureMessage();
    
    void unsetEclipseReadFailureMessage();
    
    boolean isSetEclipseReadFailureMessage();
    
    SandboxUpdateDilemmaDTO getSandboxUpdateDilemma();
    
    void setSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO p0);
    
    void unsetSandboxUpdateDilemma();
    
    boolean isSetSandboxUpdateDilemma();
}
