// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import java.util.Set;
import com.ibm.dmh.cfgmgr.ConfigMgr;

public class IfVar extends AbstractVar
{
    @Override
    public String resolve(final String varName, final String[] args, final VarTracker t) throws VarException {
        if (args.length < 1 || args.length > 2) {
            throw new VarException(varName, args, "Invalid number of arguments.  Must be 1-2.");
        }
        final String key = args[0];
        final String val = ConfigMgr.get(key);
        if (val != null) {
            if (t != null) {
                t.notifyVarUsed(key);
            }
            return val;
        }
        if (t != null) {
            t.notifyVarNotFound(key);
        }
        if (args.length > 1) {
            return args[1];
        }
        throw new VarException(varName, args, "Property not found for variable and no default specified.");
    }
    
    @Override
    public Set<String> getKeys() throws Exception {
        return ConfigMgr.getAllValues().keySet();
    }
}
