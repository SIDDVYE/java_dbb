// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Map;
import java.util.HashMap;

public class BidiMap<K, V> extends HashMap<K, V>
{
    private Map<V, K> reverseMap;
    
    public BidiMap() {
        this.reverseMap = new HashMap<V, K>();
    }
    
    @Override
    public V put(final K key, final V value) {
        final V v = super.put(key, value);
        this.reverseMap.put(value, key);
        return v;
    }
    
    @Override
    public V remove(final Object key) {
        final V v = super.remove(key);
        this.reverseMap.remove(v);
        return v;
    }
    
    public K getKey(final V value) {
        return this.reverseMap.get(value);
    }
    
    public K removeValue(final V value) {
        final K key = this.reverseMap.get(value);
        this.remove(key);
        return key;
    }
}
