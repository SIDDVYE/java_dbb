// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

public class MapFactory
{
    String[] keys;
    
    public MapFactory(final String... keys) {
        this.keys = keys;
    }
    
    public JsonMap<String, Object> getMap(final Object... vals) {
        final JsonMap<String, Object> m = new JsonMap<String, Object>();
        for (int i = 0; i < Math.min(this.keys.length, vals.length); ++i) {
            m.put(this.keys[i], vals[i]);
        }
        return m;
    }
}
