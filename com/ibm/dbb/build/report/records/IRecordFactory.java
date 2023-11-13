// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.json.java.JSONObject;

public interface IRecordFactory
{
    Record createRecord(final String p0, final String p1);
    
    Record parseRecord(final JSONObject p0);
    
    String[] getAllSupportedTypes();
}
