// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import java.io.InputStream;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.metadata.cli.MetadataPrinter;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import com.ibm.dbb.build.BuildException;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Map;
import com.ibm.dbb.metadata.Attachment;

public class BuildResult extends ManagedObject implements com.ibm.dbb.metadata.BuildResult
{
    private String group;
    private String label;
    private int state;
    private int status;
    protected Attachment buildReport;
    protected Attachment buildReportData;
    protected Map<String, Set<String>> properties;
    protected List<Attachment> attachments;
    
    protected BuildResult(final String group, final String label, final int state, final int status, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(created, createdBy, lastUpdated, lastUpdatedBy);
        this.buildReport = null;
        this.buildReportData = null;
        this.properties = null;
        this.attachments = null;
        this.group = group;
        this.label = label;
        this.state = state;
        this.status = status;
    }
    
    protected BuildResult(final String group, final String label, final int state, final int status, final String owner, final String team, final int permission, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(owner, team, permission, created, createdBy, lastUpdated, lastUpdatedBy);
        this.buildReport = null;
        this.buildReportData = null;
        this.properties = null;
        this.attachments = null;
        this.group = group;
        this.label = label;
        this.state = state;
        this.status = status;
    }
    
    @Override
    public String getGroup() {
        return this.group;
    }
    
    @Override
    public void setGroup(final String group) throws BuildException {
        this.group = group;
    }
    
    @Override
    public String getLabel() {
        return this.label;
    }
    
    @Override
    public void setLabel(final String label) throws BuildException {
        this.label = label;
    }
    
    @Override
    public int getState() throws BuildException {
        return this.state;
    }
    
    @Override
    public void setState(final int value) throws BuildException {
        this.state = value;
    }
    
    @Override
    public int getStatus() throws BuildException {
        return this.status;
    }
    
    @Override
    public void setStatus(final int value) throws BuildException {
        this.status = value;
    }
    
    @Override
    public Attachment getBuildReport() throws BuildException {
        return this.buildReport;
    }
    
    protected void setBuildReport(final Attachment buildReport) throws BuildException {
        this.buildReport = buildReport;
    }
    
    @Override
    public Attachment getBuildReportData() throws BuildException {
        return this.buildReportData;
    }
    
    protected void setBuildReportData(final Attachment buildReportData) throws BuildException {
        this.buildReportData = buildReportData;
    }
    
    @Override
    public String getProperty(final String key) throws BuildException {
        final Set<String> values = this.getProperties().get(key);
        if (values != null && values.size() > 0) {
            return values.iterator().next();
        }
        return null;
    }
    
    @Override
    public List<String> getProperties(final String key) throws BuildException {
        final List<String> values = new ArrayList<String>();
        values.addAll(this.getProperties().get(key));
        return values;
    }
    
    @Override
    public List<String> getPropertyNames() throws BuildException {
        final List<String> names = new ArrayList<String>();
        names.addAll(this.getProperties().keySet());
        return names;
    }
    
    protected Map<String, Set<String>> getProperties() throws BuildException {
        if (this.properties == null) {
            this.properties = new HashMap<String, Set<String>>();
        }
        return this.properties;
    }
    
    @Override
    public void setProperty(final String key, final String value) throws BuildException {
        if (key == null) {
            throw new IllegalArgumentException("Property key cannot be null");
        }
        this.deleteProperty(key);
        this.addProperty(key, value);
    }
    
    @Override
    public void setProperty(final String key, final List<String> values) throws BuildException {
        if (key == null) {
            throw new IllegalArgumentException("Property key cannot be null");
        }
        this.deleteProperty(key);
        this.addProperty(key, values);
    }
    
    @Override
    public void addProperty(final String name, final String value) throws BuildException {
        Set<String> values = new HashSet<String>();
        if (this.getProperties().containsKey(name)) {
            values = this.getProperties().get(name);
        }
        values.add(value);
        this.getProperties().put(name, values);
    }
    
    @Override
    public void addProperty(final String name, final List<String> values) throws BuildException {
        for (final String value : values) {
            this.addProperty(name, value);
        }
    }
    
    @Override
    public void deleteProperty(final String name) throws BuildException {
        this.deleteProperty(name, null);
    }
    
    @Override
    public void deleteProperty(final String name, final String value) throws BuildException {
        if (value == null) {
            this.getProperties().remove(name);
        }
        else {
            final Set<String> values = this.getProperties().get(name);
            if (values != null) {
                values.remove(value);
            }
        }
    }
    
    @Override
    public void deleteAttachment(final String name) throws BuildException {
    Label_0000:
        while (true) {
            for (final Attachment a : this.getAttachments()) {
                if (a.getName().equals(name)) {
                    this.attachments.remove(a);
                    continue Label_0000;
                }
            }
            break;
        }
    }
    
    @Override
    public List<Attachment> getAttachments() throws BuildException {
        if (this.attachments == null) {
            this.attachments = new ArrayList<Attachment>();
        }
        return this.attachments;
    }
    
    @Override
    public JSONObject toJSON() throws BuildException {
        final JSONObject jObj = super.toJSON();
        jObj.put((Object)"state", (Object)this.state);
        jObj.put((Object)"status", (Object)this.status);
        if (this.group != null && this.group.length() > 0) {
            jObj.put((Object)"group", (Object)this.group);
        }
        if (this.label != null && this.label.length() > 0) {
            jObj.put((Object)"label", (Object)this.label);
        }
        if (this.buildReport != null) {
            jObj.put((Object)"buildReport", (Object)this.buildReport.toJSON());
        }
        if (this.buildReportData != null) {
            jObj.put((Object)"buildReportData", (Object)this.buildReportData.toJSON());
        }
        if (this.getProperties().size() > 0) {
            final JSONObject jProps = new JSONObject();
            final Set<String> keys = this.properties.keySet();
            for (final String key : keys) {
                final Set<String> values = this.properties.get(key);
                if (values != null) {
                    final JSONArray valuesArray = new JSONArray();
                    for (final String value : values) {
                        valuesArray.add((Object)value);
                    }
                    jProps.put((Object)key, (Object)valuesArray);
                }
            }
            jObj.put((Object)"property", (Object)jProps);
        }
        if (this.getAttachments().size() > 0) {
            final JSONArray jLogs = new JSONArray();
            for (final Attachment attachment : this.attachments) {
                jLogs.add((Object)attachment.toJSON());
            }
            jObj.put((Object)"log", (Object)jLogs);
        }
        return jObj;
    }
    
    @Override
    public String toString() {
        String output = "";
        try {
            output = MetadataPrinter.formatBuildResult(this.getGroup(), this);
        }
        catch (BuildException error) {
            output = Messages.getMessage("MetadataStore_CLI_FORMAT_BUILD_RESULT_FAILED");
        }
        return output;
    }
    
    protected void addAttachment(final Attachment attachment) throws BuildException {
        if (this.attachments == null) {
            this.attachments = new ArrayList<Attachment>();
        }
        this.attachments.add(attachment);
    }
    
    @Override
    public void addAttachment(final String name, final InputStream contents) throws BuildException {
        this.addAttachment(name, "user", contents);
    }
    
    @Override
    public void addAttachment(final String name, final String contentType, final InputStream contents) throws BuildException {
        final Attachment attachment = new com.ibm.dbb.metadata.common.Attachment(name, contentType, 0L, 0L);
        attachment.setContent(contents);
        this.addAttachment(attachment);
    }
    
    @Override
    public void setBuildReport(final InputStream contents) throws BuildException {
        final Attachment buildReport = new com.ibm.dbb.metadata.common.Attachment("BuildReport.html", "text/html", 0L, 0L);
        buildReport.setContent(contents);
        this.setBuildReport(buildReport);
    }
    
    @Override
    public void setBuildReportData(final InputStream contents) throws BuildException {
        final Attachment buildReportData = new com.ibm.dbb.metadata.common.Attachment("BuildReport.json", "application/json", 0L, 0L);
        buildReportData.setContent(contents);
        this.setBuildReport(buildReportData);
    }
    
    @Override
    public Attachment getAttachment(final String name) throws BuildException {
        for (final Attachment attachment : this.getAttachments()) {
            if (attachment.getName().trim().equals(name.trim())) {
                return attachment;
            }
        }
        return null;
    }
}
