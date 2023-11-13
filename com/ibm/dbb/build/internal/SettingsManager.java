// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import com.ibm.dbb.build.report.records.IRecordFactory;
import java.util.List;
import org.slf4j.Logger;

public class SettingsManager
{
    private static Logger logger;
    public static final String SETTING_REPORT_RECORD_FACTORIES = "dbb.report.record.factories";
    public static final String DEFAULT_REPORT_RECORD_FACTORIES = "com.ibm.dbb.build.ext.jenkins.report.JenkinsRecordFactory";
    private static SettingsManager _instance;
    private String reportRecordFactories;
    
    private SettingsManager() {
        this.reportRecordFactories = System.getProperty("dbb.report.record.factories", "com.ibm.dbb.build.ext.jenkins.report.JenkinsRecordFactory");
    }
    
    public static SettingsManager getInstance() {
        if (SettingsManager._instance == null) {
            SettingsManager._instance = new SettingsManager();
        }
        return SettingsManager._instance;
    }
    
    public static void staticReset() {
        SettingsManager._instance = null;
    }
    
    public List<IRecordFactory> getReportRecordFactories() {
        final List<IRecordFactory> reportRecordFactoryList = new ArrayList<IRecordFactory>();
        for (final String reportRecordFactory : this.reportRecordFactories.split(",")) {
            try {
                if (!reportRecordFactory.isEmpty()) {
                    final Class<IRecordFactory> zClass = (Class<IRecordFactory>)Class.forName(reportRecordFactory);
                    final IRecordFactory recordFactoryObj = zClass.newInstance();
                    reportRecordFactoryList.add(recordFactoryObj);
                }
            }
            catch (Exception e) {
                SettingsManager.logger.debug("Could not load : " + reportRecordFactory + ". Actual cause is: " + e);
            }
        }
        return reportRecordFactoryList;
    }
    
    static {
        SettingsManager.logger = LoggerFactory.getLogger((Class)SettingsManager.class);
    }
}
