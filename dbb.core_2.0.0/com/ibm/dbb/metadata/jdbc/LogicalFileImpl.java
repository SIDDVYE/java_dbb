// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

import com.ibm.json.java.JSONObject;
import com.ibm.dbb.dependency.LogicalFile;

public class LogicalFileImpl extends LogicalFile
{
    private long id;
    
    public LogicalFileImpl(final long id, final String lname, final String file, final String language, final boolean cics, final boolean sql, final boolean dli, final boolean mq) {
        super(lname, file, language, cics, sql, dli, mq);
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
