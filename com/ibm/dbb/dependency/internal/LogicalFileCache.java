// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency.internal;

import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import com.ibm.dbb.dependency.LogicalFile;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogicalFileCache
{
    private static Map<String, RootCache> rootCache;
    private static List<LogicalFileCacheFilter> filterList;
    
    public static void init() {
        LogicalFileCache.filterList = null;
    }
    
    private static Map<String, RootCache> getRootCache() {
        if (LogicalFileCache.rootCache == null) {
            LogicalFileCache.rootCache = new HashMap<String, RootCache>();
        }
        return LogicalFileCache.rootCache;
    }
    
    public static void staticReset() {
        LogicalFileCache.rootCache = null;
        LogicalFileCache.filterList = null;
    }
    
    public static LogicalFile get(final String rootKey, final String file) {
        LogicalFile lfile = null;
        final RootCache rootCache = getRootCache().get(rootKey);
        if (rootCache != null) {
            lfile = rootCache.get(file);
        }
        return lfile;
    }
    
    public static List<LogicalFile> getAll(final String rootKey, final String logicalName) {
        final RootCache rootCache = getRootCache().get(rootKey);
        if (rootCache != null) {
            return rootCache.getAll(logicalName);
        }
        return null;
    }
    
    public static void add(final String rootKey, LogicalFile lfile) {
        lfile = filter(lfile);
        if (lfile == null) {
            return;
        }
        RootCache rootCache = getRootCache().get(rootKey);
        if (rootCache == null) {
            rootCache = new RootCache();
            getRootCache().put(rootKey, rootCache);
        }
        rootCache.add(lfile);
    }
    
    public static void addAll(final String rootKey, final Collection<LogicalFile> logicalFiles) {
        for (final LogicalFile logicalFile : logicalFiles) {
            add(rootKey, logicalFile);
        }
    }
    
    public static void addFilter(final LogicalFileCacheFilter filter) {
        getFilters().add(filter);
    }
    
    private static LogicalFile filter(LogicalFile lfile) {
        for (final LogicalFileCacheFilter filter : getFilters()) {
            lfile = filter.filter(lfile);
        }
        return lfile;
    }
    
    private static List<LogicalFileCacheFilter> getFilters() {
        if (LogicalFileCache.filterList == null) {
            LogicalFileCache.filterList = new ArrayList<LogicalFileCacheFilter>();
        }
        return LogicalFileCache.filterList;
    }
    
    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        final Map<String, RootCache> cache = getRootCache();
        final Set<String> keys = cache.keySet();
        for (final String key : keys) {
            buffer.append("RootCache: " + key + "\n");
            buffer.append(cache.get(key) + "\n");
        }
        return buffer.toString();
    }
    
    static {
        LogicalFileCache.rootCache = null;
        LogicalFileCache.filterList = null;
    }
}
