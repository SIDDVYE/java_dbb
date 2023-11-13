// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

import java.util.Iterator;
import com.ibm.dbb.dependency.LogicalDependency;
import com.ibm.dbb.dependency.LogicalFile;
import java.util.List;
import com.ibm.dbb.metadata.MetadataStoreFactory;
import com.ibm.dbb.build.BuildException;
import com.ibm.json.java.JSONObject;
import java.util.Date;
import com.ibm.dbb.metadata.ManagedObject;
import com.ibm.dbb.metadata.common.Collection;

public class CollectionImpl extends Collection implements ManagedObject
{
    private long id;
    private long permissionId;
    private PermissionImpl permissionObj;
    
    CollectionImpl(final long id, final String name, final long permissionId, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(name, created, createdBy, lastUpdated, lastUpdatedBy);
        this.id = -1L;
        this.permissionId = -1L;
        this.permissionObj = null;
        this.id = id;
        this.permissionId = permissionId;
    }
    
    public long getId() {
        return this.id;
    }
    
    @Override
    public JSONObject toJSON() throws BuildException {
        final JSONObject jObj = super.toJSON();
        jObj.put((Object)"id", (Object)this.id);
        return jObj;
    }
    
    @Override
    public String getOwner() throws BuildException {
        return this.owner = this.getPermissionObj().getOwner();
    }
    
    @Override
    public int getPermission() throws BuildException {
        return this.permission = this.getPermissionObj().getPermission();
    }
    
    @Override
    public String getTeam() throws BuildException {
        return this.team = this.getPermissionObj().getTeam();
    }
    
    PermissionImpl getPermissionObj() throws BuildException {
        if (this.permissionObj == null) {
            this.permissionObj = ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getPermission(this.permissionId);
        }
        return this.permissionObj;
    }
    
    @Override
    public void setOwner(final String owner) throws BuildException {
        super.setOwner(owner);
        this.getPermissionObj().setOwner(owner);
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).updatePermission(this));
    }
    
    @Override
    public void setPermission(final int permission) throws BuildException {
        super.setPermission(permission);
        this.getPermissionObj().setPermission(permission);
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).updatePermission(this));
    }
    
    @Override
    public void setTeam(final String team) throws BuildException {
        super.setTeam(team);
        this.getPermissionObj().setTeam(team);
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).updatePermission(this));
    }
    
    @Override
    public List<LogicalFile> getLogicalFiles() throws BuildException {
        if (this.logicalFiles == null) {
            this.logicalFiles = ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getLogicalFiles(this);
        }
        return this.logicalFiles;
    }
    
    @Override
    public List<LogicalFile> getLogicalFiles(final LogicalDependency logicalDependency) throws BuildException {
        return ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getLogicalFiles(this, logicalDependency);
    }
    
    @Override
    public void deleteLogicalFile(final String file) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).deleteLogicalFile(this, file));
        this.logicalFiles = null;
    }
    
    @Override
    public void addLogicalFile(final LogicalFile logicalFile) throws BuildException {
        for (final LogicalFile existingLF : this.getLogicalFiles()) {
            if (existingLF.equals(logicalFile)) {
                return;
            }
            if (existingLF.getFile().equals(logicalFile.getFile())) {
                this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).deleteLogicalFile(this, existingLF.getFile()));
                this.logicalFiles.remove(existingLF);
                break;
            }
        }
        this.logicalFiles.add(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).addLogicalFile(this, logicalFile));
    }
    
    @Override
    public void addLogicalFiles(final List<LogicalFile> logicalFiles) throws BuildException {
        for (final LogicalFile lf : logicalFiles) {
            this.addLogicalFile(lf);
        }
        this.logicalFiles = null;
    }
    
    @Override
    public void setName(final String name) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).setCollectionName(this, name));
        super.setName(name);
    }
    
    public void setLastUpdated(final Date lastUpdated) {
        super.setLastUpdated(lastUpdated);
    }
}
