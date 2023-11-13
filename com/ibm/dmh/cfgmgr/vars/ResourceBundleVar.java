// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class ResourceBundleVar extends GenericMapVar
{
    public ResourceBundleVar(final ResourceBundle rb) {
        super(null);
        this.loadMap(rb);
    }
    
    public ResourceBundleVar(final ResourceBundle rb, final boolean preserveUnknownVars) {
        super(null, preserveUnknownVars);
        this.loadMap(rb);
    }
    
    public ResourceBundleVar(final ResourceBundle rb, final Object defaultVal) {
        super(null, defaultVal);
        this.loadMap(rb);
    }
    
    private void loadMap(final ResourceBundle rb) {
        this.map = new HashMap<String, Object>();
        final Enumeration<String> i = rb.getKeys();
        while (i.hasMoreElements()) {
            final String key = i.nextElement();
            final String val = rb.getString(key);
            this.map.put(key, val);
        }
    }
}
