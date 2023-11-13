// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb;

import com.ibm.dbb.dependency.internal.SearchPath;
import com.ibm.dbb.dependency.internal.LogicalFileCache;
import com.ibm.dbb.build.report.records.RecordFactoryManager;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.internal.SettingsManager;
import com.ibm.dbb.build.internal.DBBSMFWriter;
import com.ibm.dbb.build.internal.ProductRegistrationChecker;
import com.ibm.dbb.build.VersionInfo;
import com.ibm.dbb.build.BuildProperties;

public class StaticMemoryReset
{
    public static void reset() {
        BuildProperties.staticReset();
        VersionInfo.staticReset();
        ProductRegistrationChecker.staticReset();
        DBBSMFWriter.staticReset();
        SettingsManager.staticReset();
        BuildReportFactory.staticReset();
        RecordFactoryManager.staticReset();
        LogicalFileCache.staticReset();
        SearchPath.staticReset();
    }
}
