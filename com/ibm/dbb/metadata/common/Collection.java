// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.metadata.cli.MetadataPrinter;
import com.ibm.json.java.JSONObject;
import com.ibm.dbb.metadata.MetadataStoreFactory;
import com.ibm.dbb.dependency.LogicalDependency;
import java.util.Iterator;
import com.ibm.dbb.build.BuildException;
import java.util.ArrayList;
import java.util.Date;
import com.ibm.dbb.dependency.LogicalFile;
import java.util.List;

public class Collection extends ManagedObject implements com.ibm.dbb.metadata.Collection
{
    private String name;
    protected List<LogicalFile> logicalFiles;
    
    protected Collection(final String name, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(created, createdBy, lastUpdated, lastUpdatedBy);
        this.name = null;
        this.logicalFiles = null;
        this.name = name;
    }
    
    protected Collection(final String name, final String owner, final String team, final int permission, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(owner, team, permission, created, createdBy, lastUpdated, lastUpdatedBy);
        this.name = null;
        this.logicalFiles = null;
        this.name = name;
    }
    
    public Collection(final com.ibm.dbb.metadata.Collection collection) throws BuildException {
        super(collection.getOwner(), collection.getTeam(), collection.getPermission(), collection.getCreated(), collection.getCreatedBy(), collection.getLastUpdated(), collection.getLastUpdatedBy());
        this.name = null;
        this.logicalFiles = null;
        this.name = collection.getName();
        this.logicalFiles = new ArrayList<LogicalFile>();
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public void setName(final String name) throws BuildException {
        this.name = name;
    }
    
    @Override
    public List<LogicalFile> getLogicalFiles() throws BuildException {
        if (this.logicalFiles == null) {
            this.logicalFiles = new ArrayList<LogicalFile>();
        }
        return this.logicalFiles;
    }
    
    @Override
    public LogicalFile getLogicalFile(final String file) throws BuildException {
        LogicalFile logicalFile = null;
        for (final LogicalFile lf : this.getLogicalFiles()) {
            if (lf.getFile().equals(file)) {
                logicalFile = lf;
                break;
            }
        }
        return logicalFile;
    }
    
    @Override
    public List<LogicalFile> getLogicalFiles(final String logicalName) throws BuildException {
        final List<LogicalFile> logicalFiles = new ArrayList<LogicalFile>();
        for (final LogicalFile lf : this.getLogicalFiles()) {
            if (lf.getLname().equals(logicalName)) {
                logicalFiles.add(lf);
            }
        }
        return logicalFiles;
    }
    
    @Override
    public List<LogicalFile> getLogicalFiles(final LogicalDependency logicalDependency) throws BuildException {
        final List<LogicalFile> logicalFiles = new ArrayList<LogicalFile>();
        for (final LogicalFile lf : this.getLogicalFiles()) {
            for (final LogicalDependency ld : lf.getLogicalDependencies()) {
                final boolean matches = (logicalDependency.getLname() == null || logicalDependency.getLname().equals(ld.getLname())) && (logicalDependency.getCategory() == null || logicalDependency.getCategory().equals(ld.getCategory())) && (logicalDependency.getLibrary() == null || logicalDependency.getLibrary().equals(ld.getLibrary()));
                if (matches) {
                    logicalFiles.add(lf);
                    break;
                }
            }
        }
        return logicalFiles;
    }
    
    @Override
    public void deleteLogicalFile(final String file) throws BuildException {
        final LogicalFile logicalFile = this.getLogicalFile(file);
        if (logicalFile != null) {
            this.logicalFiles.remove(logicalFile);
        }
    }
    
    @Override
    public void addLogicalFile(final LogicalFile logicalFile) throws BuildException {
        this.getLogicalFiles().add(logicalFile);
    }
    
    @Override
    public void addLogicalFiles(final List<LogicalFile> logicalFiles) throws BuildException {
        this.getLogicalFiles().addAll(logicalFiles);
    }
    
    @Override
    public com.ibm.dbb.metadata.Collection copy(final String newName) throws BuildException {
        return MetadataStoreFactory.getMetadataStore().copyCollection(this.name, newName);
    }
    
    @Override
    public JSONObject toJSON() throws BuildException {
        final JSONObject jObj = super.toJSON();
        jObj.put((Object)"name", (Object)this.name);
        return jObj;
    }
    
    @Override
    public String toString() {
        String output = "";
        try {
            output = MetadataPrinter.formatCollection(this);
        }
        catch (BuildException error) {
            output = Messages.getMessage("MetadataStore_CLI_FORMAT_COLLECTION_FAILED");
        }
        return output;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final Collection other = (Collection)o;
        if (this.getName() == null) {
            if (other.getName() != null) {
                return false;
            }
        }
        else if (!this.getName().equals(other.getName())) {
            return false;
        }
        try {
            if (this.getLogicalFiles() == null) {
                if (other.getLogicalFiles() != null) {
                    return false;
                }
            }
            else if (!this.getLogicalFiles().equals(other.getLogicalFiles())) {
                return false;
            }
        }
        catch (BuildException be) {
            return false;
        }
        return super.equals(o);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = 31 * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = 31 * result + super.hashCode();
        return result;
    }
}
