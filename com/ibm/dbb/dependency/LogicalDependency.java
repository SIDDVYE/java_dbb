// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import java.io.IOException;
import com.ibm.json.java.JSONObject;

public class LogicalDependency
{
    protected String lname;
    protected String library;
    protected String category;
    
    public LogicalDependency() {
    }
    
    public LogicalDependency(final String lname, final String library, final String category) {
        this.lname = ((lname != null) ? lname.trim() : lname);
        this.library = ((library != null) ? library.trim() : library);
        this.category = ((category != null) ? category.trim() : category);
    }
    
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(final String lname) {
        this.lname = ((lname != null) ? lname.trim() : lname);
    }
    
    public String getLibrary() {
        return this.library;
    }
    
    public void setLibrary(final String library) {
        this.library = ((library != null) ? library.trim() : library);
    }
    
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(final String category) {
        this.category = ((category != null) ? category.trim() : category);
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = 31 * result + ((this.category == null) ? 0 : this.category.hashCode());
        result = 31 * result + ((this.library == null) ? 0 : this.library.hashCode());
        result = 31 * result + ((this.lname == null) ? 0 : this.lname.hashCode());
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
        if (!(obj instanceof LogicalDependency)) {
            return false;
        }
        final LogicalDependency other = (LogicalDependency)obj;
        if (this.category == null) {
            if (other.category != null) {
                return false;
            }
        }
        else if (!this.category.equals(other.category)) {
            return false;
        }
        if (this.library == null) {
            if (other.library != null) {
                return false;
            }
        }
        else if (!this.library.equals(other.library)) {
            return false;
        }
        if (this.lname == null) {
            if (other.lname != null) {
                return false;
            }
        }
        else if (!this.lname.equals(other.lname)) {
            return false;
        }
        return true;
    }
    
    public JSONObject toJSON() {
        final JSONObject jObj = new JSONObject();
        if (this.lname != null && this.lname.length() > 0) {
            jObj.put((Object)"lname", (Object)this.lname);
        }
        if (this.library != null && this.library.length() > 0) {
            jObj.put((Object)"library", (Object)this.library);
        }
        if (this.category != null && this.category.length() > 0) {
            jObj.put((Object)"category", (Object)this.category);
        }
        return jObj;
    }
    
    public void parseFromJSON(final JSONObject jsonObject) {
        this.setLname((String)jsonObject.get((Object)"lname"));
        this.setLibrary((String)jsonObject.get((Object)"library"));
        this.setCategory((String)jsonObject.get((Object)"category"));
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
