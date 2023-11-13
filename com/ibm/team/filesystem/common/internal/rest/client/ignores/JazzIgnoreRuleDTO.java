// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores;

import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;

public interface JazzIgnoreRuleDTO extends IgnoreRuleDTO
{
    String getPattern();
    
    void setPattern(final String p0);
    
    void unsetPattern();
    
    boolean isSetPattern();
    
    String getScope();
    
    void setScope(final String p0);
    
    void unsetScope();
    
    boolean isSetScope();
    
    PathDTO getPath();
    
    void setPath(final PathDTO p0);
    
    void unsetPath();
    
    boolean isSetPath();
}
