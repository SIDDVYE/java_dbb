// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.beans;

import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractSet;
import java.util.Set;
import java.util.Map;
import com.ibm.jjson.JsonMap;
import java.util.AbstractMap;

public class BeanMap extends AbstractMap<String, Object>
{
    final Object bean;
    final BeanMeta meta;
    
    BeanMap(final Object bean, final BeanMeta meta) {
        this.bean = bean;
        this.meta = meta;
    }
    
    public Object getBean() {
        return this.bean;
    }
    
    public String getName() {
        return this.meta.name;
    }
    
    @Override
    public Object put(final String property, final Object value) {
        final BeanMeta.Property p = this.meta.properties.get(property);
        if (property.equals("_class")) {
            return null;
        }
        if (p == null) {
            throw new IllegalArgumentException("Unknown property: " + property);
        }
        return p.set(this.bean, value);
    }
    
    @Override
    public Object get(final Object property) {
        final BeanMeta.Property p = this.meta.properties.get(property);
        if (p == null) {
            return null;
        }
        return p.get(this.bean);
    }
    
    public void putAll(final String json) {
        this.putAll(new JsonMap<String, Object>(json));
    }
    
    @Override
    public Set<String> keySet() {
        return this.meta.properties.keySet();
    }
    
    @Override
    public Set<Map.Entry<String, Object>> entrySet() {
        return new AbstractSet<Map.Entry<String, Object>>() {
            final Collection<BeanMeta.Property> pSet = BeanMap.this.meta.properties.values();
            
            @Override
            public Iterator<Map.Entry<String, Object>> iterator() {
                return new Iterator<Map.Entry<String, Object>>() {
                    Iterator<BeanMeta.Property> pIterator = AbstractSet.this.pSet.iterator();
                    
                    @Override
                    public boolean hasNext() {
                        return this.pIterator.hasNext();
                    }
                    
                    @Override
                    public Map.Entry<String, Object> next() {
                        return new BeanMapEntry(this.pIterator.next());
                    }
                    
                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException("Cannot remove item from iterator.");
                    }
                };
            }
            
            @Override
            public int size() {
                return this.pSet.size();
            }
        };
    }
    
    private class BeanMapEntry implements Map.Entry<String, Object>
    {
        BeanMeta.Property property;
        
        BeanMapEntry(final BeanMeta.Property property) {
            this.property = property;
        }
        
        @Override
        public String getKey() {
            return this.property.name;
        }
        
        @Override
        public Object getValue() {
            return this.property.get(BeanMap.this.bean);
        }
        
        @Override
        public Object setValue(final Object value) {
            return this.property.set(BeanMap.this.bean, value);
        }
        
        @Override
        public String toString() {
            return this.getKey() + "=" + this.getValue();
        }
    }
}
