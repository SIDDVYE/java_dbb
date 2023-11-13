// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import com.ibm.json.java.JSONObject;
import com.ibm.dbb.metadata.Collection;

public class ImpactFile
{
    private LogicalFile logicalFile;
    private Collection collection;
    
    public ImpactFile(final String lname, final String file, final String language, final Collection collection) {
        (this.logicalFile = new LogicalFile(lname, file)).setLanguage(language);
        this.setCollection(collection);
    }
    
    public ImpactFile(final LogicalFile logicalFile, final Collection collection) {
        this.logicalFile = logicalFile;
        this.setCollection(collection);
    }
    
    public Collection getCollection() {
        return this.collection;
    }
    
    public void setCollection(final Collection collection) {
        this.collection = collection;
    }
    
    public String getFile() {
        return this.logicalFile.getFile();
    }
    
    public void setFile(final String file) {
        this.logicalFile.setFile(file);
    }
    
    public JSONObject toJSON() throws BuildException {
        final JSONObject jObj = new JSONObject();
        if (this.getCollection() != null) {
            jObj.put((Object)"collection", (Object)this.getCollection().toJSON());
        }
        final String lname = this.logicalFile.getLname();
        if (lname != null && lname.length() > 0) {
            jObj.put((Object)"lname", (Object)lname);
        }
        final String file = this.logicalFile.getFile();
        if (file != null && file.length() > 0) {
            jObj.put((Object)"file", (Object)file);
        }
        final String language = this.logicalFile.getLanguage();
        if (language != null && language.length() > 0) {
            jObj.put((Object)"language", (Object)language);
        }
        return jObj;
    }
    
    @Override
    public String toString() {
        String s = null;
        try {
            s = this.toJSON().serialize();
        }
        catch (IOException | BuildException ex2) {
            final Exception ex;
            final Exception e = ex;
            s = e.getMessage();
        }
        return s;
    }
    
    public String getLname() {
        return this.logicalFile.getLname();
    }
    
    public void setLname(final String lname) {
        this.logicalFile.setLname(lname);
    }
    
    public String getLanguage() {
        return this.logicalFile.getLanguage();
    }
    
    public void setLanguage(final String language) {
        this.logicalFile.setLanguage(language);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = 31 * result + ((this.getCollection() == null) ? 0 : this.getCollection().getName().hashCode());
        result = 31 * result + ((this.logicalFile == null) ? 0 : this.logicalFile.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final ImpactFile other = (ImpactFile)obj;
        if (this.collection == null) {
            if (other.collection != null) {
                return false;
            }
        }
        else if (!this.collection.getName().equals(other.getCollection().getName())) {
            return false;
        }
        if (this.logicalFile == null) {
            if (other.logicalFile != null) {
                return false;
            }
        }
        else if (!this.logicalFile.equals(other.logicalFile)) {
            return false;
        }
        return true;
    }
    
    public LogicalFile getLogicalFile() {
        return this.logicalFile;
    }
}
