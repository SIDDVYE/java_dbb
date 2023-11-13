// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.smf.DBBSmfRecord;
import org.slf4j.Logger;

public class DBBSMFWriter
{
    public static final String DBB_SMFWRITE_ENABLED = "DBB_SMFWRITE_ENABLED";
    private static Boolean bDBBRecordWritten;
    private static Logger logger;
    
    public static void staticReset() {
        DBBSMFWriter.bDBBRecordWritten = null;
    }
    
    public static void writeDBBSMFRecord() throws BuildException {
        if (DBBSMFWriter.bDBBRecordWritten == null && isWriteSMFEnabled()) {
            DBBSMFWriter.bDBBRecordWritten = new Boolean(true);
            DBBSMFWriter.logger.debug("Writing DBB SMF Record");
            final DBBSmfRecord smfRecord = new DBBSmfRecord();
            smfRecord.write();
        }
    }
    
    private static boolean isWriteSMFEnabled() {
        return Boolean.parseBoolean(System.getProperty("DBB_SMFWRITE_ENABLED"));
    }
    
    static {
        DBBSMFWriter.bDBBRecordWritten = null;
        DBBSMFWriter.logger = LoggerFactory.getLogger((Class)DBBSMFWriter.class);
    }
}
