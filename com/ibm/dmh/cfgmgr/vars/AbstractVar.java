// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import java.util.Set;

public abstract class AbstractVar
{
    public abstract String resolve(final String p0, final String[] p1, final VarTracker p2) throws VarException;
    
    public Set<String> getKeys() throws Exception {
        return null;
    }
}
