// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import com.ibm.dbb.metadata.Attachment;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import org.apache.commons.compress.utils.IOUtils;
import com.ibm.dbb.build.internal.Messages;
import java.io.InputStream;
import com.ibm.dbb.metadata.MetadataStoreFactory;
import com.ibm.dbb.build.BuildException;
import com.ibm.json.java.JSONObject;
import java.util.Date;
import com.ibm.dbb.metadata.common.MetadataStoreConstants;
import com.ibm.dbb.metadata.ManagedObject;
import com.ibm.dbb.metadata.common.BuildResult;

public class BuildResultImpl extends BuildResult implements ManagedObject, MetadataStoreConstants
{
    private long id;
    private long permissionId;
    private PermissionImpl permissionObj;
    
    BuildResultImpl(final long id, final String group, final String label, final int state, final int status, final long permissionId, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(group, label, state, status, created, createdBy, lastUpdated, lastUpdatedBy);
        this.id = -1L;
        this.permissionId = -1L;
        this.permissionObj = null;
        this.id = id;
        this.permissionId = permissionId;
    }
    
    @Override
    public JSONObject toJSON() throws BuildException {
        final JSONObject jObj = super.toJSON();
        jObj.put((Object)"id", (Object)this.id);
        return jObj;
    }
    
    @Override
    public void addProperty(final String key, final String value) throws BuildException {
        ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).addProperty(this, key, value);
        this.properties = null;
    }
    
    @Override
    public void deleteProperty(final String key, final String value) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).deleteProperty(this, key, value));
        this.properties = null;
    }
    
    protected void addAttachment(final AttachmentImpl attachment) throws BuildException {
        if (attachment != null) {
            this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).addAttachment(this, attachment));
            this.attachments = null;
        }
    }
    
    @Override
    public void addAttachment(final String name, final String contentType, final InputStream contents) throws BuildException {
        if (contents == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "contents"));
        }
        try {
            final byte[] data = IOUtils.toByteArray(contents);
            final AttachmentImpl attachment = new AttachmentImpl(-1L, name, contentType, data.length, Utils.calculateChecksum(data));
            attachment.setContent(new ByteArrayInputStream(data));
            attachment.setContents(data);
            this.addAttachment(attachment);
        }
        catch (IOException e) {
            throw new BuildException(e);
        }
    }
    
    @Override
    public void deleteAttachment(final String name) throws BuildException {
        for (final Attachment attachment : this.getAttachments()) {
            if (attachment.getName().equals(name)) {
                this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).deleteAttachment(this, (AttachmentImpl)attachment));
            }
        }
        this.attachments = null;
    }
    
    @Override
    public Attachment getBuildReport() throws BuildException {
        if (this.buildReport == null) {
            this.buildReport = ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getBuildReport(this);
        }
        return this.buildReport;
    }
    
    protected void setBuildReport(AttachmentImpl buildReport) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).deleteBuildReport(this));
        this.buildReport = null;
        if (buildReport != null) {
            this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).setBuildReport(this, buildReport));
        }
        buildReport = null;
        super.setBuildReport(buildReport);
    }
    
    @Override
    public void setBuildReport(final InputStream contents) throws BuildException {
        AttachmentImpl buildReport = null;
        if (contents == null) {
            this.setBuildReport(buildReport);
        }
        else {
            try {
                final byte[] data = IOUtils.toByteArray(contents);
                buildReport = new AttachmentImpl(-1L, "BuildReport.html", "text/html", data.length, Utils.calculateChecksum(data));
                buildReport.setContent(new ByteArrayInputStream(data));
                buildReport.setContents(data);
                this.setBuildReport(buildReport);
            }
            catch (IOException e) {
                throw new BuildException(e);
            }
        }
    }
    
    @Override
    public Attachment getBuildReportData() throws BuildException {
        if (this.buildReportData == null) {
            this.buildReportData = ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getBuildReportData(this);
        }
        return this.buildReportData;
    }
    
    protected void setBuildReportData(AttachmentImpl buildReportData) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).deleteBuildReportData(this));
        this.buildReportData = null;
        if (buildReportData != null) {
            this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).setBuildReportData(this, buildReportData));
        }
        buildReportData = null;
        super.setBuildReportData(buildReportData);
    }
    
    @Override
    public void setBuildReportData(final InputStream contents) throws BuildException {
        AttachmentImpl buildReportData = null;
        if (contents == null) {
            this.setBuildReportData(buildReportData);
        }
        else {
            try {
                final byte[] data = IOUtils.toByteArray(contents);
                buildReportData = new AttachmentImpl(-1L, "BuildReport.json", "application/json", data.length, Utils.calculateChecksum(data));
                buildReportData.setContent(new ByteArrayInputStream(data));
                buildReportData.setContents(data);
                this.setBuildReportData(buildReportData);
            }
            catch (IOException e) {
                throw new BuildException(e);
            }
        }
    }
    
    @Override
    protected Map<String, Set<String>> getProperties() throws BuildException {
        if (this.properties == null) {
            this.properties = ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getProperties(this);
        }
        return this.properties;
    }
    
    @Override
    public List<Attachment> getAttachments() throws BuildException {
        if (this.attachments == null) {
            this.attachments = ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getAttachments(this);
        }
        return this.attachments;
    }
    
    public long getId() {
        return this.id;
    }
    
    @Override
    public String getOwner() throws BuildException {
        return this.owner = this.getPermissionObj().getOwner();
    }
    
    @Override
    public int getPermission() throws BuildException {
        return this.permission = this.getPermissionObj().getPermission();
    }
    
    PermissionImpl getPermissionObj() throws BuildException {
        if (this.permissionObj == null) {
            this.permissionObj = ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getPermission(this.permissionId);
        }
        return this.permissionObj;
    }
    
    @Override
    public String getTeam() throws BuildException {
        return this.team = this.getPermissionObj().getTeam();
    }
    
    @Override
    public void setOwner(final String owner) throws BuildException {
        super.setOwner(owner);
        this.getPermissionObj().setOwner(owner);
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).updatePermission(this));
    }
    
    @Override
    public void setPermission(final int permission) throws BuildException {
        super.setPermission(permission);
        this.getPermissionObj().setPermission(permission);
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).updatePermission(this));
    }
    
    @Override
    public void setTeam(final String team) throws BuildException {
        super.setTeam(team);
        this.getPermissionObj().setTeam(team);
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).updatePermission(this));
    }
    
    @Override
    public void setLabel(final String label) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).setBuildResultLabel(this, label));
        super.setLabel(label);
    }
    
    @Override
    public void setGroup(final String group) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).setBuildResultGroup(this, group));
        super.setGroup(group);
    }
    
    @Override
    public void setState(final int state) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).setBuildState(this, state));
        super.setState(state);
    }
    
    @Override
    public void setStatus(final int status) throws BuildException {
        this.setLastUpdated(((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).setBuildStatus(this, status));
        super.setStatus(status);
    }
}
