// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency.internal;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.io.File;
import com.ibm.dbb.metadata.common.MetadataStoreUtil;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;
import com.ibm.dbb.dependency.LogicalFile;
import java.util.Set;
import java.util.Map;

final class RootCache
{
    private static final long MAX_SIZE = 32767L;
    private long ageSequence;
    private Map<String, Set<CacheObject<LogicalFile>>> logicalFileCache;
    private TreeSet<CacheObject<LogicalFile>> logicalFileSet;
    
    RootCache() {
        this.ageSequence = 0L;
        this.logicalFileCache = null;
        this.logicalFileSet = null;
    }
    
    private Map<String, Set<CacheObject<LogicalFile>>> getLogicalFileCache() {
        if (this.logicalFileCache == null) {
            this.logicalFileCache = new HashMap<String, Set<CacheObject<LogicalFile>>>();
        }
        return this.logicalFileCache;
    }
    
    private TreeSet<CacheObject<LogicalFile>> getLogicalFileSet() {
        if (this.logicalFileSet == null) {
            this.logicalFileSet = new TreeSet<CacheObject<LogicalFile>>(new Comparator<CacheObject<LogicalFile>>() {
                @Override
                public int compare(final CacheObject<LogicalFile> o1, final CacheObject<LogicalFile> o2) {
                    if (o1.getSequence() < o2.getSequence()) {
                        return -1;
                    }
                    if (o1.getSequence() > o2.getSequence()) {
                        return 1;
                    }
                    return 0;
                }
            });
        }
        return this.logicalFileSet;
    }
    
    private void ageCacheObject(final CacheObject<LogicalFile> co) {
        co.setSequence(this.ageSequence++);
        this.getLogicalFileSet().remove(co);
        this.getLogicalFileSet().add(co);
    }
    
    private void ageOutCacheObject() {
        if (this.size() + 1L > 32767L) {
            final CacheObject<LogicalFile> co = this.getLogicalFileSet().pollFirst();
            if (co == null) {
                return;
            }
            final Set<CacheObject<LogicalFile>> lfileSet = this.getLogicalFileCache().get(co.getCachedObject().getLname());
            if (lfileSet != null) {
                lfileSet.remove(co);
            }
        }
    }
    
    public LogicalFile get(final String file) {
        final Set<CacheObject<LogicalFile>> lfileSet = this.getLogicalFileCache().get(MetadataStoreUtil.getLogicalName(file));
        if (lfileSet != null) {
            final File jfile = new File(file);
            for (final CacheObject<LogicalFile> co : lfileSet) {
                final LogicalFile lfile = co.getCachedObject();
                final File jlfile = new File(lfile.getFile());
                if (jfile.equals(jlfile)) {
                    this.ageCacheObject(co);
                    return lfile;
                }
            }
        }
        return null;
    }
    
    public List<LogicalFile> getAll(final String logicalName) {
        final Set<CacheObject<LogicalFile>> lfileSet = this.getLogicalFileCache().get(logicalName);
        if (lfileSet != null) {
            final List<LogicalFile> lfiles = new ArrayList<LogicalFile>();
            for (final CacheObject<LogicalFile> co : lfileSet) {
                final LogicalFile lfile = co.getCachedObject();
                lfiles.add(lfile);
            }
            return lfiles;
        }
        return null;
    }
    
    public void add(final LogicalFile lfile) {
        Set<CacheObject<LogicalFile>> lfiles = this.getLogicalFileCache().get(lfile.getLname());
        if (lfiles == null) {
            lfiles = new HashSet<CacheObject<LogicalFile>>();
            this.getLogicalFileCache().put(lfile.getLname(), lfiles);
        }
        final CacheObject<LogicalFile> co = new CacheObject<LogicalFile>(this.ageSequence++, lfile);
        lfiles.remove(co);
        this.getLogicalFileSet().remove(co);
        this.ageOutCacheObject();
        lfiles.add(co);
        this.getLogicalFileSet().add(co);
    }
    
    private long size() {
        long size = 0L;
        for (final String key : this.getLogicalFileCache().keySet()) {
            final Set<CacheObject<LogicalFile>> lfileSet = this.getLogicalFileCache().get(key);
            size += lfileSet.size();
        }
        return size;
    }
    
    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append("RootCache hashcode: " + this.hashCode() + "\n");
        buffer.append("Next Sequence: " + this.ageSequence + "\n");
        buffer.append("Cache: " + this.getLogicalFileCache() + "\n");
        return buffer.toString();
    }
}
