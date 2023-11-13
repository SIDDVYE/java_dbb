// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.ext.jenkins.report;

import com.ibm.json.java.JSONObject;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.records.IRecordFactory;
import com.ibm.dbb.build.report.records.AbstractRecordFactory;

public class JenkinsRecordFactory extends AbstractRecordFactory implements IRecordFactory
{
    public static final String TYPE_JENKINS = "JENKINS";
    
    public Record createRecord(final String id, final String type) {
        if ("JENKINS".equals(type)) {
            return new JenkinsRecord(id);
        }
        return null;
    }
    
    protected Record doParseRecord(final JSONObject jsonObj, final String id, final String type) {
        final Record record = this.createRecord(id, type);
        if (record != null) {
            record.parse(jsonObj);
        }
        return record;
    }
    
    public String[] getAllSupportedTypes() {
        return new String[] { "JENKINS" };
    }
}
