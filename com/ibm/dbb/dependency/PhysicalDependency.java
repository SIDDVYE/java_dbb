// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import java.io.IOException;
import com.ibm.json.java.JSONObject;

public class PhysicalDependency extends LogicalDependency
{
    private String collection;
    private String sourceDir;
    private String file;
    private String archive;
    private boolean resolved;
    private boolean excluded;
    
    public PhysicalDependency() {
    }
    
    public PhysicalDependency(final LogicalDependency dependency) {
        super(dependency.getLname(), dependency.getLibrary(), dependency.getCategory());
        this.resolved = false;
        this.excluded = false;
    }
    
    public PhysicalDependency(final LogicalDependency dependency, final String collection, final String sourceDir, final String file) {
        super(dependency.getLname(), dependency.getLibrary(), dependency.getCategory());
        this.collection = collection;
        this.sourceDir = sourceDir;
        this.file = file;
        this.resolved = false;
        this.excluded = false;
    }
    
    public String getCollection() {
        return this.collection;
    }
    
    public void setCollection(final String collection) {
        this.collection = collection;
    }
    
    public String getSourceDir() {
        return this.sourceDir;
    }
    
    public void setSourceDir(final String sourceDir) {
        this.sourceDir = sourceDir;
    }
    
    public String getFile() {
        return this.file;
    }
    
    public void setFile(final String file) {
        this.file = file;
    }
    
    public String getArchive() {
        return this.archive;
    }
    
    public void setArchive(final String archive) {
        this.archive = archive;
    }
    
    public boolean isResolved() {
        return this.resolved;
    }
    
    public void setResolved(final boolean value) {
        this.resolved = value;
    }
    
    public boolean isExcluded() {
        return this.excluded;
    }
    
    public void setExcluded(final boolean excluded) {
        this.excluded = excluded;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = 31 * result + ((this.collection == null) ? 0 : this.collection.hashCode());
        result = 31 * result + ((this.file == null) ? 0 : this.file.hashCode());
        result = 31 * result + (this.resolved ? 1231 : 1237);
        result = 31 * result + ((this.sourceDir == null) ? 0 : this.sourceDir.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final PhysicalDependency other = (PhysicalDependency)obj;
        if (this.collection == null) {
            if (other.collection != null) {
                return false;
            }
        }
        else if (!this.collection.equals(other.collection)) {
            return false;
        }
        if (this.file == null) {
            if (other.file != null) {
                return false;
            }
        }
        else if (!this.file.equals(other.file)) {
            return false;
        }
        if (this.resolved != other.resolved) {
            return false;
        }
        if (this.excluded != other.excluded) {
            return false;
        }
        if (this.sourceDir == null) {
            if (other.sourceDir != null) {
                return false;
            }
        }
        else if (!this.sourceDir.equals(other.sourceDir)) {
            return false;
        }
        if (this.archive == null) {
            if (other.archive != null) {
                return false;
            }
        }
        else if (!this.archive.equals(other.archive)) {
            return false;
        }
        return true;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject jObj = super.toJSON();
        if (this.collection != null) {
            jObj.put((Object)"collection", (Object)this.collection);
        }
        if (this.archive != null) {
            jObj.put((Object)"archive", (Object)this.archive);
        }
        if (this.sourceDir != null) {
            jObj.put((Object)"sourceDir", (Object)this.sourceDir);
        }
        if (this.file != null && this.file.length() > 0) {
            jObj.put((Object)"file", (Object)this.file);
        }
        jObj.put((Object)"resolved", (Object)new Boolean(this.resolved));
        jObj.put((Object)"excluded", (Object)new Boolean(this.excluded));
        return jObj;
    }
    
    @Override
    public void parseFromJSON(final JSONObject jsonObject) {
        super.parseFromJSON(jsonObject);
        this.collection = (String)jsonObject.get((Object)"collection");
        this.sourceDir = (String)jsonObject.get((Object)"sourceDir");
        this.archive = (String)jsonObject.get((Object)"archive");
        this.file = (String)jsonObject.get((Object)"file");
        this.resolved = (boolean)jsonObject.get((Object)"resolved");
        final Object jExcluded = jsonObject.get((Object)"excluded");
        this.excluded = (jExcluded != null && (boolean)jExcluded);
    }
    
    @Override
    public String toString() {
        String s = null;
        try {
            s = this.toJSON().serialize();
        }
        catch (IOException ioe) {
            s = ioe.getMessage();
        }
        return s;
    }
}
