// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.ext.jenkins.report;

import com.ibm.json.java.JSONObject;
import com.ibm.dbb.build.report.records.Record;

public class JenkinsRecord extends Record
{
    public static final String PROP_JOB_NAME = "jobName";
    public static final String PROP_JOB_URL = "jobUrl";
    public static final String PROP_BUILD_URL = "buildUrl";
    public static final String PROP_BUILD_NUMBER = "buildNumber";
    public static final String PROP_WORKSPACE = "workspace";
    private String jobName;
    private String jobUrl;
    private String buildUrl;
    private String buildNumber;
    private String workspace;
    
    public JenkinsRecord() {
        super("JENKINS");
    }
    
    public JenkinsRecord(final String id) {
        super(id, "JENKINS");
    }
    
    public String getJobName() {
        return this.jobName;
    }
    
    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }
    
    public String getJobUrl() {
        return this.jobUrl;
    }
    
    public void setJobUrl(final String jobUrl) {
        this.jobUrl = jobUrl;
    }
    
    public String getBuildUrl() {
        return this.buildUrl;
    }
    
    public void setBuildUrl(final String buildUrl) {
        this.buildUrl = buildUrl;
    }
    
    public String getBuildNumber() {
        return this.buildNumber;
    }
    
    public void setBuildNumber(final String buildNumber) {
        this.buildNumber = buildNumber;
    }
    
    public String getWorkspace() {
        return this.workspace;
    }
    
    public void setWorkspace(final String workspace) {
        this.workspace = workspace;
    }
    
    public JSONObject toJSON() {
        final JSONObject jsonObj = super.toJSON();
        jsonObj.put((Object)"jobName", (Object)this.jobName);
        jsonObj.put((Object)"jobUrl", (Object)this.jobUrl);
        jsonObj.put((Object)"buildUrl", (Object)this.buildUrl);
        jsonObj.put((Object)"buildNumber", (Object)this.buildNumber);
        jsonObj.put((Object)"workspace", (Object)this.workspace);
        return jsonObj;
    }
    
    public Record parse(final JSONObject jsonObj) {
        this.jobName = (String)jsonObj.get((Object)"jobName");
        this.jobUrl = (String)jsonObj.get((Object)"jobUrl");
        this.buildUrl = (String)jsonObj.get((Object)"buildUrl");
        this.buildNumber = (String)jsonObj.get((Object)"buildNumber");
        this.workspace = (String)jsonObj.get((Object)"workspace");
        return this;
    }
}
