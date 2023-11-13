// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import java.util.ArrayList;
import java.util.Iterator;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import com.ibm.dbb.metadata.common.MetadataStoreUtil;
import java.io.IOException;
import com.ibm.dbb.build.internal.Messages;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.CopyOption;
import java.util.zip.Checksum;
import java.util.zip.CheckedInputStream;
import java.util.zip.Adler32;
import com.ibm.dbb.metadata.MetadataStoreFactory;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import com.ibm.dbb.metadata.Attachment;
import java.io.InputStream;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.metadata.ManagedObject;
import java.util.Date;
import java.io.File;
import com.ibm.dbb.metadata.common.BuildResult;

public class BuildResultImpl extends BuildResult
{
    private File location;
    private File saveFile;
    private File attachmentsDir;
    private long saveFileLastModified;
    
    protected BuildResultImpl(final String group, final File location, final String label, final int state, final int status, final String owner, final String team, final int permission, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) {
        super(group, label, state, status, owner, team, permission, created, createdBy, lastUpdated, lastUpdatedBy);
        this.location = location;
        this.saveFile = new File(location, "buildResult.json");
        this.attachmentsDir = new File(location, "attachments/");
    }
    
    private BuildResultImpl(final String group, final File location, final String label, final int state, final int status, final ManagedObject obj) throws BuildException {
        this(group, location, label, state, status, obj.getOwner(), obj.getTeam(), obj.getPermission(), obj.getCreated(), obj.getCreatedBy(), obj.getLastUpdated(), obj.getLastUpdatedBy());
    }
    
    @Override
    public int getState() throws BuildException {
        this.loadVolatile();
        return super.getState();
    }
    
    @Override
    public int getStatus() throws BuildException {
        this.loadVolatile();
        return super.getStatus();
    }
    
    @Override
    public void addAttachment(final String name, final String contentType, final InputStream contents) throws BuildException {
        this.loadVolatile();
        final Attachment attachment = new AttachmentImpl(name, this.attachmentsDir, contentType);
        this.saveAttachment(attachment, contents);
        super.addAttachment(attachment);
        this.updateBuildResult();
    }
    
    public Map<String, Set<String>> getProperties() throws BuildException {
        this.loadVolatile();
        if (this.properties == null) {
            this.properties = new HashMap<String, Set<String>>();
        }
        return this.properties;
    }
    
    @Override
    public List<Attachment> getAttachments() throws BuildException {
        this.loadVolatile();
        return super.getAttachments();
    }
    
    @Override
    public void deleteAttachment(final String name) throws BuildException {
        this.loadVolatile();
        super.deleteAttachment(name);
        this.updateBuildResult();
    }
    
    @Override
    public Attachment getBuildReport() throws BuildException {
        this.loadVolatile();
        return super.getBuildReport();
    }
    
    @Override
    public void setBuildReport(final InputStream is) throws BuildException {
        this.loadVolatile();
        final Attachment buildReport = new AttachmentImpl("BuildReport.html", this.attachmentsDir, "text/html");
        this.saveAttachment(buildReport, is);
        super.setBuildReport(buildReport);
        this.updateBuildResult();
    }
    
    @Override
    public Attachment getBuildReportData() throws BuildException {
        this.loadVolatile();
        return super.getBuildReportData();
    }
    
    @Override
    public void setBuildReportData(final InputStream is) throws BuildException {
        this.loadVolatile();
        final Attachment buildReportData = new AttachmentImpl("BuildReport.json", this.attachmentsDir, "application/json");
        this.saveAttachment(buildReportData, is);
        super.setBuildReportData(buildReportData);
        this.updateBuildResult();
    }
    
    @Override
    public void setProperty(final String key, final String value) throws BuildException {
        this.loadVolatile();
        super.setProperty(key, value);
        this.updateBuildResult();
    }
    
    @Override
    public void setProperty(final String key, final List<String> values) throws BuildException {
        this.loadVolatile();
        super.setProperty(key, values);
        this.updateBuildResult();
    }
    
    @Override
    public void addProperty(final String key, final String value) throws BuildException {
        this.loadVolatile();
        Set<String> values = this.getProperties().get(key);
        if (values == null) {
            values = new HashSet<String>();
        }
        values.add(value);
        this.getProperties().put(key, values);
        this.updateBuildResult();
    }
    
    @Override
    public void deleteProperty(final String name, final String value) throws BuildException {
        this.loadVolatile();
        final Set<String> values = this.getProperties().get(name);
        if (values != null) {
            if (value == null) {
                this.getProperties().remove(name);
            }
            else {
                values.remove(value);
            }
        }
        this.updateBuildResult();
    }
    
    @Override
    public void setState(final int value) throws BuildException {
        super.setState(value);
        ((FileMetadataStore)MetadataStoreFactory.getMetadataStore()).getBuildGroup(this.getGroup()).updateBuildResultState(this.getLabel(), value);
        this.updateBuildResult();
    }
    
    @Override
    public void setStatus(final int value) throws BuildException {
        super.setStatus(value);
        ((FileMetadataStore)MetadataStoreFactory.getMetadataStore()).getBuildGroup(this.getGroup()).updateBuildResultStatus(this.getLabel(), value);
        this.updateBuildResult();
    }
    
    @Override
    public void setOwner(final String owner) throws BuildException {
        super.setOwner(owner);
        this.updateBuildResult();
    }
    
    @Override
    public void setPermission(final int permission) throws BuildException {
        super.setPermission(permission);
        this.updateBuildResult();
    }
    
    @Override
    public void setTeam(final String team) throws BuildException {
        super.setTeam(team);
        this.updateBuildResult();
    }
    
    protected File getLocation() {
        return this.location;
    }
    
    protected void setLocation(final File location) {
        this.location = location;
    }
    
    private void saveAttachment(final Attachment attachment, final InputStream is) throws BuildException {
        final CheckedInputStream cis = new CheckedInputStream(is, new Adler32());
        final String filename = Utils.encodeFilename(attachment.getName());
        final File target = new File(this.attachmentsDir, filename);
        try {
            final long size = Files.copy(cis, target.toPath(), StandardCopyOption.REPLACE_EXISTING);
            cis.close();
            is.close();
            attachment.setSize(size);
            attachment.setChecksum(cis.getChecksum().getValue());
        }
        catch (IOException ioe) {
            throw new BuildException(Messages.getMessage("MetadataStore_ATTACHMENT_UNABLE_COPY", attachment.getName(), ioe.getMessage()));
        }
    }
    
    private void updateBuildResult() throws BuildException {
        super.objectUpdated();
        this.save();
        ((FileMetadataStore)MetadataStoreFactory.getMetadataStore()).getBuildGroup(this.getGroup()).refreshBuildResult(this.getLabel());
    }
    
    protected void save() throws BuildException {
        try {
            this.attachmentsDir.mkdirs();
            final JSONObject jObj = super.toJSON();
            MetadataStoreUtil.exportJSONToFile(jObj, this.saveFile);
            this.saveFileLastModified = this.saveFile.lastModified();
        }
        catch (IOException ioe) {
            throw new BuildException(Messages.getMessage("MetadataStore_FILE_SAVE_ERROR", this.getLabel(), this.getClass().getName(), ioe.getMessage()));
        }
    }
    
    private void loadVolatile() throws BuildException {
        if (this.saveFile.exists() && Utils.isFileModified(this.saveFile, this.saveFileLastModified)) {
            try {
                final JSONObject jObj = MetadataStoreUtil.importJSONFromFile(this.saveFile);
                super.setState(((Long)jObj.get((Object)"state")).intValue());
                super.setStatus(((Long)jObj.get((Object)"status")).intValue());
                if (jObj.containsKey((Object)"buildReport")) {
                    super.setBuildReport(AttachmentImpl.load(this.attachmentsDir, (JSONObject)jObj.get((Object)"buildReport")));
                }
                if (jObj.containsKey((Object)"buildReportData")) {
                    super.setBuildReportData(AttachmentImpl.load(this.attachmentsDir, (JSONObject)jObj.get((Object)"buildReportData")));
                }
                if (jObj.containsKey((Object)"property")) {
                    final JSONObject jProps = (JSONObject)jObj.get((Object)"property");
                    this.properties = new HashMap<String, Set<String>>();
                    final Set<String> keys = (Set<String>)jProps.keySet();
                    for (final String key : keys) {
                        final Set<String> values = new HashSet<String>();
                        final ArrayList<String> valueArray = (ArrayList<String>)jProps.get((Object)key);
                        if (valueArray != null) {
                            for (final String value : valueArray) {
                                values.add(value);
                            }
                        }
                        this.properties.put(key, values);
                    }
                }
                if (jObj.containsKey((Object)"log")) {
                    if (this.attachments != null) {
                        this.attachments.clear();
                    }
                    JSONArray jLogs = new JSONArray();
                    jLogs = (JSONArray)jObj.get((Object)"log");
                    for (final Object attachmentJSON : jLogs) {
                        super.addAttachment(AttachmentImpl.load(this.attachmentsDir, (JSONObject)attachmentJSON));
                    }
                }
                this.saveFileLastModified = this.saveFile.lastModified();
            }
            catch (ClassCastException cce) {
                throw new BuildException(Messages.getMessage("MetadataStore_READ_JSON_FORMAT", this.saveFile.getAbsolutePath(), cce.getMessage()));
            }
            catch (IOException ioe) {
                throw new BuildException(Messages.getMessage("MetadataStore_READ_JSON_FORMAT", this.saveFile.getAbsolutePath(), ioe.getMessage()));
            }
        }
    }
    
    protected static BuildResultImpl loadBuildResult(final File location) throws BuildException {
        final File saveFile = new File(location, "buildResult.json");
        JSONObject jObj;
        try {
            jObj = MetadataStoreUtil.importJSONFromFile(saveFile);
        }
        catch (IOException ioe) {
            throw new BuildException(Messages.getMessage("MetadataStore_READ_JSON_FORMAT", saveFile.getAbsolutePath()));
        }
        final ManagedObject obj = com.ibm.dbb.metadata.common.ManagedObject.loadManagedObject(jObj);
        final String group = (String)jObj.get((Object)"group");
        final String label = (String)jObj.get((Object)"label");
        final int state = ((Long)jObj.get((Object)"state")).intValue();
        final int status = ((Long)jObj.get((Object)"status")).intValue();
        return new BuildResultImpl(group, location, label, state, status, obj);
    }
}
