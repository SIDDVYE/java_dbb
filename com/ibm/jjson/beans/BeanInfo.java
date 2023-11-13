// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.beans;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

public class BeanInfo<T>
{
    protected Class<T> _class;
    protected List<String> propertyNames;
    protected Map<String, String> getterNames;
    protected Map<String, String> setterNames;
    
    public BeanInfo(final Class<T> c, final String... propertyNames) {
        this.propertyNames = new LinkedList<String>();
        this.getterNames = new HashMap<String, String>();
        this.setterNames = new HashMap<String, String>();
        this._class = c;
        for (final String s : propertyNames) {
            this.propertyNames.add(s);
        }
    }
    
    public BeanInfo<T> setGetter(final String propertyName, final String getterName) {
        this.getterNames.put(propertyName, getterName);
        return this;
    }
    
    public BeanInfo<T> setSetter(final String propertyName, final String setterName) {
        this.setterNames.put(propertyName, setterName);
        return this;
    }
}
