// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import java.io.FileNotFoundException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import java.io.FileInputStream;
import java.io.InputStream;
import com.ibm.json.java.JSONObject;
import java.io.File;
import com.ibm.dbb.metadata.common.Attachment;

public class AttachmentImpl extends Attachment
{
    private File location;
    
    public AttachmentImpl(final String name, final File location, final String contentType) {
        this(name, location, contentType, 0L, 0L);
    }
    
    public AttachmentImpl(final String name, final File location, final String contentType, final long size, final long checksum) {
        super(name, contentType, size, checksum);
        this.location = location;
    }
    
    @Override
    public JSONObject toJSON() {
        return super.toJSON();
    }
    
    public static AttachmentImpl load(final File location, final JSONObject jsonObject) {
        final long size = (long)jsonObject.get((Object)"size");
        final long checksum = (long)jsonObject.get((Object)"checksum");
        final String name = (String)jsonObject.get((Object)"name");
        final String contentType = (String)jsonObject.get((Object)"contentType");
        return new AttachmentImpl(name, location, contentType, size, checksum);
    }
    
    @Override
    public InputStream getContent() throws BuildException {
        try {
            final String fileName = Utils.encodeFilename(this.name);
            this.content = new FileInputStream(new File(this.location, fileName));
        }
        catch (FileNotFoundException fnfe) {
            throw new BuildException(Messages.getMessage("MetadataStore_ATTACHMENT_DATA_DNE", this.name));
        }
        return this.content;
    }
}
