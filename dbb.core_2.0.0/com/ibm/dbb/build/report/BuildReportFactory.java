// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report;

import com.ibm.dbb.build.internal.Utils;
import com.ibm.dbb.build.report.records.ModeRecord;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.VersionInfo;
import com.ibm.dbb.build.report.records.VersionRecord;

public class BuildReportFactory
{
    private static BuildReport buildReport;
    
    public static BuildReport createDefaultReport() {
        BuildReportFactory.buildReport = new BuildReport();
        final VersionRecord versionRecord = new VersionRecord("DBB API Version");
        versionRecord.setVersion(VersionInfo.getInstance().getVersion());
        versionRecord.setBuild(VersionInfo.getInstance().getBuild());
        versionRecord.setDate(VersionInfo.getInstance().getDate());
        BuildReportFactory.buildReport.addRecord(versionRecord);
        final ModeRecord modeRecord = new ModeRecord("DBB Build Mode");
        String buildMode = "NORMAL";
        if (Utils.isBuildReportOnly()) {
            buildMode = "REPORT-ONLY";
        }
        modeRecord.setBuildMode(buildMode);
        BuildReportFactory.buildReport.addRecord(modeRecord);
        return BuildReportFactory.buildReport;
    }
    
    public static BuildReport getBuildReport() {
        if (BuildReportFactory.buildReport == null) {
            BuildReportFactory.buildReport = new NoopBuildReport();
        }
        return BuildReportFactory.buildReport;
    }
    
    public static void staticReset() {
        BuildReportFactory.buildReport = null;
    }
}
