// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import java.util.Collection;
import java.util.TreeSet;
import java.util.Set;

public class VarTracker
{
    private boolean trackUsed;
    private boolean trackNotFound;
    public Set<String> used;
    public Set<String> notFound;
    
    public VarTracker(final boolean trackUsed, final boolean trackNotFound) {
        this.used = new TreeSet<String>();
        this.notFound = new TreeSet<String>();
        this.trackUsed = trackUsed;
        this.trackNotFound = trackNotFound;
    }
    
    public void notifyVarUsed(final String var) {
        if (this.trackUsed) {
            this.used.add(var);
        }
    }
    
    public void notifyVarNotFound(final String var) {
        if (this.trackNotFound) {
            this.notFound.add(var);
        }
    }
    
    public Set<String> getNotFound() {
        return this.notFound;
    }
    
    public Set<String> getNotUsed(Set<String> all) {
        if (!this.trackUsed || all == null) {
            return new TreeSet<String>();
        }
        all = new TreeSet<String>(all);
        all.removeAll(this.used);
        return all;
    }
}
