// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import java.util.Set;
import com.ibm.dmh.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

public class ThreadLocalMapVar extends AbstractVar
{
    protected ThreadLocal<Map<String, Object>> map;
    protected Object defaultVal;
    protected boolean preserveUnknownVars;
    
    public ThreadLocalMapVar(final boolean preserveUnknownVars) {
        this.map = new ThreadLocal<Map<String, Object>>() {
            @Override
            protected synchronized Map<String, Object> initialValue() {
                return new HashMap<String, Object>();
            }
        };
        this.defaultVal = null;
        this.preserveUnknownVars = preserveUnknownVars;
    }
    
    public ThreadLocalMapVar(final Object defaultVal) {
        this.map = new ThreadLocal<Map<String, Object>>() {
            @Override
            protected synchronized Map<String, Object> initialValue() {
                return new HashMap<String, Object>();
            }
        };
        this.defaultVal = defaultVal;
        this.preserveUnknownVars = false;
    }
    
    public void put(final String key, final Object val) {
        this.map.get().put(key, val);
    }
    
    @Override
    public String resolve(final String varName, final String[] args, final VarTracker t) throws VarException {
        if (args.length < 1 || args.length > 2) {
            throw new VarException(varName, args, "Invalid number of arguments.  Must be 1-2.");
        }
        final String key = args[0];
        final Object val = this.map.get().get(key);
        if (val == null) {
            if (t != null) {
                t.notifyVarNotFound(key);
            }
            if (args.length > 1) {
                return args[1];
            }
            if (this.preserveUnknownVars) {
                return "$" + varName + "{" + StringUtils.join(args, ",") + "}";
            }
            if (this.defaultVal != null) {
                return this.defaultVal.toString();
            }
            return "null";
        }
        else {
            if (t != null) {
                t.notifyVarUsed(key);
            }
            if (val instanceof Object[]) {
                return StringUtils.join((Object[])val, ',', true);
            }
            return val.toString();
        }
    }
    
    @Override
    public Set<String> getKeys() throws Exception {
        return this.map.get().keySet();
    }
}
