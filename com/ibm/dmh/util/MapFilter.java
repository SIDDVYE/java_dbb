// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Iterator;
import java.util.List;
import com.ibm.jjson.JsonMap;
import com.ibm.jjson.beans.BeanMapFactory;
import java.util.Collections;
import java.util.Map;

public class MapFilter
{
    public static Map filter(final Object input, final Object view, final Class narrowTo, final MapAugmenter mapAugmenter) {
        if (input == null) {
            return Collections.emptyMap();
        }
        final List<String> v = StringUtils.toStringList(view);
        Map inputMap = (input instanceof Map) ? ((Map)input) : BeanMapFactory.DEFAULT_SAFE.forBean(input, (narrowTo == null) ? input.getClass() : narrowTo);
        if (mapAugmenter != null) {
            inputMap = new JsonMap(inputMap);
            mapAugmenter.augment(inputMap);
        }
        if (!v.isEmpty()) {
            final Map m2 = new JsonMap();
            for (final Object k : v) {
                m2.put(k, inputMap.get(k));
            }
            inputMap = m2;
        }
        return inputMap;
    }
}
