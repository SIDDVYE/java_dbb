// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import java.io.IOException;
import com.ibm.json.java.JSONObject;
import com.ibm.dbb.build.BuildException;
import java.io.InputStream;

public class Attachment implements com.ibm.dbb.metadata.Attachment
{
    public String name;
    public String contentType;
    public long size;
    public long checksum;
    protected InputStream content;
    
    public Attachment(final String name, final String contentType, final long size, final long checksum) {
        this.size = 0L;
        this.checksum = 0L;
        this.content = null;
        this.setName(name);
        this.setContentType(contentType);
        this.setSize(size);
        this.setChecksum(checksum);
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public void setName(final String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Attachment name cannot be null or blank.");
        }
        this.name = name;
    }
    
    @Override
    public String getContentType() {
        return this.contentType;
    }
    
    @Override
    public void setContentType(final String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Attachment content type cannot be null or blank.");
        }
        this.contentType = type;
    }
    
    @Override
    public long getSize() {
        return this.size;
    }
    
    @Override
    public long getChecksum() {
        return this.checksum;
    }
    
    @Override
    public InputStream getContent() throws BuildException {
        return this.content;
    }
    
    @Override
    public void setContent(final InputStream content) {
        if (content == null) {
            throw new IllegalArgumentException("Attachment content cannot be null.");
        }
        this.content = content;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject jObj = new JSONObject();
        jObj.put((Object)"size", (Object)this.size);
        jObj.put((Object)"checksum", (Object)this.checksum);
        if (this.name != null && this.name.length() > 0) {
            jObj.put((Object)"name", (Object)this.name);
        }
        if (this.contentType != null && this.contentType.length() > 0) {
            jObj.put((Object)"contentType", (Object)this.contentType);
        }
        return jObj;
    }
    
    @Override
    public String toString() {
        String s = null;
        try {
            s = this.toJSON().serialize(true);
        }
        catch (IOException e) {
            s = e.getMessage();
        }
        return s;
    }
    
    @Override
    public void setSize(final long size) {
        this.size = size;
    }
    
    @Override
    public void setChecksum(final long checksum) {
        this.checksum = checksum;
    }
}
