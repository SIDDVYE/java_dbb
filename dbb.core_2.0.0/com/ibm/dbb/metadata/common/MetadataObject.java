// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import java.util.Calendar;
import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import com.ibm.json.java.JSONObject;
import java.util.Date;

public class MetadataObject implements com.ibm.dbb.metadata.MetadataObject
{
    private Date created;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    
    protected MetadataObject(final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        this.created = created;
        this.createdBy = createdBy;
        this.lastUpdated = lastUpdated;
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
    @Override
    public Date getCreated() {
        return this.created;
    }
    
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    @Override
    public Date getLastUpdated() {
        return this.lastUpdated;
    }
    
    @Override
    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    
    protected void setLastUpdated(final Date date) {
        this.lastUpdated = date;
        this.lastUpdatedBy = System.getProperty("user.name");
    }
    
    private void setLastUpdatedBy(final String user) {
        this.lastUpdatedBy = user;
    }
    
    public void objectUpdated() {
        this.setLastUpdatedBy(System.getProperty("user.name"));
        this.setLastUpdated(new Date());
    }
    
    @Override
    public JSONObject toJSON() throws BuildException {
        final JSONObject jObj = new JSONObject();
        if (this.created != null) {
            jObj.put((Object)"created", (Object)this.created.toString());
        }
        if (this.createdBy != null && this.createdBy.length() > 0) {
            jObj.put((Object)"createdBy", (Object)this.createdBy);
        }
        if (this.lastUpdated != null) {
            jObj.put((Object)"lastUpdated", (Object)this.lastUpdated.toString());
        }
        if (this.lastUpdatedBy != null && this.lastUpdatedBy.length() > 0) {
            jObj.put((Object)"lastUpdatedBy", (Object)this.lastUpdatedBy);
        }
        return jObj;
    }
    
    @Override
    public String toString() {
        String s = null;
        try {
            s = this.toJSON().serialize(true);
        }
        catch (IOException | BuildException ex2) {
            final Exception ex;
            final Exception e = ex;
            s = e.getMessage();
        }
        return s;
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
        final MetadataObject other = (MetadataObject)o;
        if (this.getCreated() == null) {
            if (other.getCreated() != null) {
                return false;
            }
        }
        else if (!this.datesEqual(this.getCreated(), other.getCreated())) {
            return false;
        }
        if (this.getCreatedBy() == null) {
            if (other.getCreatedBy() != null) {
                return false;
            }
        }
        else if (!this.getCreatedBy().equals(other.getCreatedBy())) {
            return false;
        }
        if (this.getLastUpdated() == null) {
            if (other.getLastUpdated() != null) {
                return false;
            }
        }
        else if (!this.datesEqual(this.getLastUpdated(), other.getLastUpdated())) {
            return false;
        }
        if (this.getLastUpdatedBy() == null) {
            if (other.getLastUpdatedBy() != null) {
                return false;
            }
        }
        else if (!this.getLastUpdatedBy().equals(other.getLastUpdatedBy())) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = 31 * result + ((this.getCreatedBy() == null) ? 0 : this.getCreatedBy().hashCode());
        result = 31 * result + ((this.getLastUpdatedBy() == null) ? 0 : this.getLastUpdatedBy().hashCode());
        return result;
    }
    
    private boolean datesEqual(final Date date1, final Date date2) {
        final Calendar cal1 = Calendar.getInstance();
        final Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        cal1.set(14, 0);
        cal2.set(14, 0);
        return cal1.equals(cal2);
    }
}
