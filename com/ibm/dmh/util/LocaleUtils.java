// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.Map;

public class LocaleUtils
{
    public static Map<String, Object> getResourceBundleMap(final String bundleName) {
        final ResourceBundle rb = ResourceBundle.getBundle(bundleName);
        if (rb == null) {
            return null;
        }
        final Map<String, Object> m = new LinkedHashMap<String, Object>();
        final Enumeration<String> e = rb.getKeys();
        while (e.hasMoreElements()) {
            final String key = e.nextElement();
            m.put(key, rb.getObject(key));
        }
        return m;
    }
}
