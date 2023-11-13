// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

import com.ibm.json.java.JSONObject;
import com.ibm.dbb.dependency.LogicalDependency;

public class LogicalDependencyImpl extends LogicalDependency
{
    private long id;
    
    public LogicalDependencyImpl(final long id, final String lname, final String library, final String category) {
        super(lname, library, category);
        this.id = -1L;
        this.id = id;
    }
    
    public long getId() {
        return this.id;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject jObj = super.toJSON();
        jObj.put((Object)"id", (Object)this.id);
        return jObj;
    }
}
