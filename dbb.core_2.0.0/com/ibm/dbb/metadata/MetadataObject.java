// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata;

import com.ibm.dbb.build.BuildException;
import com.ibm.json.java.JSONObject;
import java.util.Date;

public interface MetadataObject
{
    Date getCreated();
    
    String getCreatedBy();
    
    Date getLastUpdated();
    
    String getLastUpdatedBy();
    
    JSONObject toJSON() throws BuildException;
    
    String toString();
}
