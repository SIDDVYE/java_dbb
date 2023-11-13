// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores;

import java.util.List;

public interface IgnoreRulesDTO
{
    List getRules();
    
    void unsetRules();
    
    boolean isSetRules();
}
