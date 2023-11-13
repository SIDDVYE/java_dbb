// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.dbb.build.report.Util;
import com.ibm.json.java.JSONObject;

public class DefaultRecordFactory extends AbstractRecordFactory implements IRecordFactory
{
    public static final String TYPE_COPY_TO_HFS = "COPY_TO_HFS";
    public static final String TYPE_COPY_TO_PDS = "COPY_TO_PDS";
    public static final String TYPE_CREATE_PDS = "CREATE_PDS";
    public static final String TYPE_EXECUTE = "EXECUTE";
    public static final String TYPE_DEPENDENCY_SET = "DEPENDENCY_SET";
    public static final String TYPE_REFERENCE = "REFERENCE";
    public static final String TYPE_BUILD_RESULT = "BUILD_RESULT";
    public static final String TYPE_VERSION = "VERSION";
    public static final String TYPE_BUILD_MODE = "BUILD_MODE";
    public static final String TYPE_PROPERTIES = "PROPERTIES";
    
    @Override
    public Record createRecord(final String id, final String type) {
        if ("COPY_TO_HFS".equals(type)) {
            return new CopyToHFSRecord(id);
        }
        if ("COPY_TO_PDS".equals(type)) {
            return new CopyToPDSRecord(id);
        }
        if ("CREATE_PDS".equals(type)) {
            return new CreatePDSRecord(id);
        }
        if ("EXECUTE".equals(type)) {
            return new ExecuteRecord(id);
        }
        if ("DEPENDENCY_SET".equals(type)) {
            return new DependencySetRecord(id);
        }
        if ("BUILD_RESULT".equals(type)) {
            return new BuildResultRecord(id);
        }
        if ("VERSION".equals(type)) {
            return new VersionRecord(id);
        }
        if ("PROPERTIES".equals(type)) {
            return new PropertiesRecord(id);
        }
        return new AnyTypeRecord(id, type);
    }
    
    @Override
    protected Record doParseRecord(final JSONObject jsonObj, final String id, final String type) {
        final boolean ref = "REFERENCE".equals(type);
        if (ref) {
            final Reference reference = Util.createReference(id, null, null);
            return reference.parse(jsonObj);
        }
        final Record record = this.createRecord(id, type);
        return (record == null) ? null : record.parse(jsonObj);
    }
    
    @Override
    public String[] getAllSupportedTypes() {
        return new String[] { "COPY_TO_HFS", "COPY_TO_PDS", "CREATE_PDS", "EXECUTE", "DEPENDENCY_SET", "REFERENCE", "BUILD_RESULT", "VERSION", "PROPERTIES" };
    }
}
