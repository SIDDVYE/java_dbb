// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Iterator;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Date;
import java.util.LinkedList;
import com.ibm.jjson.JsonMap;
import com.ibm.jjson.beans.BeanMapFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Collection;

public class MapListFilter
{
    public static List<Map<String, Object>> filter(final Collection input, Map search, List view, Map sort, List groupBy, final boolean isCaseInsensitive, final int pos, final int limit, final Class narrowTo, final MapAugmenter mapAugmenter) {
        if (search == null) {
            search = Collections.emptyMap();
        }
        if (view == null) {
            view = Collections.emptyList();
        }
        if (sort == null) {
            sort = Collections.emptyMap();
        }
        if (groupBy == null) {
            groupBy = Collections.emptyList();
        }
        final Map<String, IMatcher> searchMatchers = new HashMap<String, IMatcher>();
        Collection<Map> inputMaps = new ArrayList<Map>(input.size());
        for (final Object o : input) {
            if (o instanceof Map) {
                inputMaps.add((Map)o);
            }
            else {
                inputMaps.add(BeanMapFactory.DEFAULT_SAFE.forBean(o, (narrowTo == null) ? o.getClass() : narrowTo));
            }
        }
        if (mapAugmenter != null) {
            final Collection<Map> inputMaps2 = new ArrayList<Map>(inputMaps.size());
            for (final Map m1 : inputMaps) {
                final JsonMap m2 = new JsonMap(m1);
                mapAugmenter.augment(m2);
                inputMaps2.add(m2);
            }
            inputMaps = inputMaps2;
        }
        if (!search.isEmpty()) {
            final List<Map> filtered = new LinkedList<Map>();
            for (final Map i : inputMaps) {
                boolean matches = true;
                for (final Object c : search.keySet()) {
                    final String columnName = c.toString();
                    final Object o2 = i.get(columnName);
                    if (o2 != null) {
                        if (!searchMatchers.containsKey(columnName)) {
                            final String searchVal = search.get(columnName);
                            if (o2 instanceof Date) {
                                searchMatchers.put(columnName, new DateMatcher(searchVal));
                            }
                            else if (o2 instanceof Number) {
                                searchMatchers.put(columnName, new NumberMatcher(searchVal));
                            }
                            else {
                                searchMatchers.put(columnName, new StringMatcher(searchVal, isCaseInsensitive));
                            }
                        }
                        matches &= searchMatchers.get(columnName).matches(o2);
                    }
                    else {
                        matches = false;
                    }
                }
                if (matches) {
                    filtered.add(i);
                }
            }
            inputMaps = filtered;
        }
        if (!groupBy.isEmpty()) {
            final Map<String, Map> filtered2 = new LinkedHashMap<String, Map>();
            for (final Map i : inputMaps) {
                final StringBuffer key = new StringBuffer();
                for (final Object g : groupBy) {
                    key.append(i.get(g)).append(".");
                }
                if (!filtered2.containsKey(key)) {
                    final Map m3 = new LinkedHashMap();
                    for (final Object g2 : groupBy) {
                        m3.put(g2, i.get(g2));
                    }
                    m3.put("limit", 1);
                }
                else {
                    final Map m3 = filtered2.get(key);
                    m3.put("limit", m3.get("limit") + 1);
                }
            }
            inputMaps = (Collection<Map>)filtered2.values();
        }
        if (!sort.isEmpty()) {
            final MapComparator mc = new MapComparator();
            for (final Object o3 : sort.keySet()) {
                final String key2 = o3.toString();
                final Object value = sort.get(key2);
                final boolean isAscending = value == null || !value.toString().toLowerCase().startsWith("d");
                mc.addSortColumn(key2, isAscending);
            }
            List list = null;
            if (inputMaps instanceof List) {
                list = (List)inputMaps;
            }
            else {
                list = new ArrayList(inputMaps);
            }
            Collections.sort((List<Object>)list, (Comparator<? super Object>)mc);
            inputMaps = (Collection<Map>)list;
        }
        if (pos != 0 || limit != 0) {
            final List<Map> l = (inputMaps instanceof List) ? ((List)inputMaps) : new ArrayList<Map>(inputMaps);
            final int end = (limit == 0 || limit + pos >= l.size()) ? (l.size() - 1) : (limit + pos);
            inputMaps = l.subList(pos, end);
        }
        if (!view.isEmpty()) {
            final List<Map> l = new ArrayList<Map>(input.size());
            for (final Map i : inputMaps) {
                final Map m4 = new LinkedHashMap();
                for (final Object s : view) {
                    m4.put(s, i.get(s));
                }
                l.add(m4);
            }
            inputMaps = l;
        }
        return (inputMaps instanceof List) ? ((List)inputMaps) : new ArrayList<Map<String, Object>>((Collection<? extends Map<String, Object>>)inputMaps);
    }
    
    public static List<Map<String, Object>> filter(final Collection<?> input, final JsonMap req, final Class narrowTo, final MapAugmenter ma) {
        return filter(input, req.getMap("search", null), StringUtils.toStringList(req.get("view", null)), req.getMap("sort", null), StringUtils.toStringList(req.get("groupBy", null)), req.getBoolean("isCaseInsensitive", false), req.getInt("pos", 0), req.getInt("limit", 0), narrowTo, ma);
    }
}
