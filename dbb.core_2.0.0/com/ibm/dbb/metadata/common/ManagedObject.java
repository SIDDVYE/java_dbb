// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import com.ibm.json.java.JSONObject;
import com.ibm.dbb.build.BuildException;
import java.util.Date;

public class ManagedObject extends MetadataObject implements com.ibm.dbb.metadata.ManagedObject
{
    protected String owner;
    protected String team;
    protected int permission;
    
    protected ManagedObject(final String owner, final String team, final int permission, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(created, createdBy, lastUpdated, lastUpdatedBy);
        this.owner = null;
        this.team = null;
        this.permission = 436;
        this.owner = owner;
        this.team = team;
        this.permission = (permission & 0x1B6);
    }
    
    protected ManagedObject(final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(created, createdBy, lastUpdated, lastUpdatedBy);
        this.owner = null;
        this.team = null;
        this.permission = 436;
    }
    
    @Override
    public String getOwner() throws BuildException {
        return this.owner;
    }
    
    @Override
    public void setOwner(final String owner) throws BuildException {
        if (owner == null) {
            throw new IllegalArgumentException("Owner can not be null.");
        }
        this.owner = owner;
    }
    
    @Override
    public String getTeam() throws BuildException {
        return this.team;
    }
    
    @Override
    public void setTeam(final String team) throws BuildException {
        this.team = team;
    }
    
    @Override
    public int getPermission() throws BuildException {
        return this.permission;
    }
    
    @Override
    public void setPermission(final int permission) throws BuildException {
        this.permission = (permission & 0x1B6);
    }
    
    @Override
    public JSONObject toJSON() throws BuildException {
        final JSONObject jObj = super.toJSON();
        if (this.getOwner() != null && this.getOwner().length() > 0) {
            jObj.put((Object)"owner", (Object)this.getOwner());
        }
        if (this.getTeam() != null) {
            jObj.put((Object)"team", (Object)this.getTeam());
        }
        if (this.getPermission() != -1) {
            jObj.put((Object)"permission", (Object)Integer.toOctalString(this.getPermission()));
        }
        return jObj;
    }
    
    public static ManagedObject loadManagedObject(final JSONObject jObj) throws BuildException {
        final String owner = (String)jObj.get((Object)"owner");
        final String team = (String)jObj.get((Object)"team");
        final int permission = Integer.parseUnsignedInt((String)jObj.get((Object)"permission"), 8) & 0x1B6;
        final Date created = MetadataStoreUtil.parseDate((String)jObj.get((Object)"created"));
        final String createdBy = (String)jObj.get((Object)"createdBy");
        final Date lastUpdated = MetadataStoreUtil.parseDate((String)jObj.get((Object)"lastUpdated"));
        final String lastUpdatedBy = (String)jObj.get((Object)"lastUpdatedBy");
        return new ManagedObject(owner, team, permission, created, createdBy, lastUpdated, lastUpdatedBy);
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
        final ManagedObject other = (ManagedObject)o;
        try {
            if (this.getOwner() == null) {
                if (other.getOwner() != null) {
                    return false;
                }
            }
            else if (!this.getOwner().equals(other.getOwner())) {
                return false;
            }
            if (this.getTeam() == null) {
                if (other.getTeam() != null) {
                    return false;
                }
            }
            else if (!this.getTeam().equals(other.getTeam())) {
                return false;
            }
            if (this.getPermission() != other.getPermission()) {
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
        result = 31 * result + ((this.owner == null) ? 0 : this.owner.hashCode());
        result = 31 * result + ((this.team == null) ? 0 : this.team.hashCode());
        result = 31 * result + super.hashCode();
        return result;
    }
}
