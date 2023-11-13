// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

import org.slf4j.LoggerFactory;
import com.ibm.json.java.JSONObject;
import com.ibm.dbb.build.BuildException;
import java.io.ByteArrayInputStream;
import com.ibm.dbb.metadata.MetadataStoreFactory;
import java.io.InputStream;
import org.slf4j.Logger;
import com.ibm.dbb.metadata.common.Attachment;

public class AttachmentImpl extends Attachment
{
    private long id;
    private byte[] contents;
    private static Logger logger;
    
    AttachmentImpl(final long id, final String name, final String contentType, final long size, final long checksum) {
        super(name, contentType, size, checksum);
        this.id = -1L;
        this.contents = null;
        this.id = id;
    }
    
    public long getId() {
        return this.id;
    }
    
    @Override
    public InputStream getContent() throws BuildException {
        if (this.contents == null && this.getId() != -1L) {
            this.contents = ((JDBCMetadataStore)MetadataStoreFactory.getMetadataStore()).getAttachmentContent(this);
            final long newChecksum = Utils.calculateChecksum(this.contents);
            if (this.getChecksum() != newChecksum) {
                AttachmentImpl.logger.debug("WARNING: Attachment checksums for " + this.getName() + " don't match. Existing(" + this.getChecksum() + ") vs New(" + newChecksum + ")");
            }
            if (this.getSize() != this.contents.length) {
                AttachmentImpl.logger.debug("WARNING: Attachment lengths for " + this.getName() + " don't match. Existing(" + this.getSize() + ") vs New(" + this.contents.length + ")");
            }
        }
        return this.content = ((this.contents == null) ? null : new ByteArrayInputStream(this.contents));
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject jObj = super.toJSON();
        jObj.put((Object)"id", (Object)this.id);
        return jObj;
    }
    
    void setContents(final byte[] contents) {
        this.contents = contents;
    }
    
    byte[] getContents() {
        return this.contents;
    }
    
    static {
        AttachmentImpl.logger = LoggerFactory.getLogger((Class)AttachmentImpl.class);
    }
}
