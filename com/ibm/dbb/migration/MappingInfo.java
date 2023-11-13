// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.migration;

import com.ibm.dbb.build.internal.Utils;

public class MappingInfo
{
    private static final String ATTR_PDS_ENCODING = "pdsEncoding";
    private static final char EQUAL = '=';
    private String dataset;
    private String member;
    private String hfsPath;
    private String pdsEncoding;
    
    public String getDataset() {
        return this.dataset;
    }
    
    public void setDataset(final String dataset) {
        this.dataset = dataset;
    }
    
    public String getMember() {
        return this.member;
    }
    
    public void setMember(final String member) {
        this.member = member;
    }
    
    public String getFullyQualifiedDsn() {
        return Utils.getFullyQualifiedDsn(this.dataset, this.member);
    }
    
    public String getHfsPath() {
        return this.hfsPath;
    }
    
    public void setHfsPath(final String hfsPath) {
        this.hfsPath = hfsPath;
    }
    
    public String getPdsEncoding() {
        return this.pdsEncoding;
    }
    
    public void setPdsEncoding(final String pdsEncoding) {
        this.pdsEncoding = pdsEncoding;
    }
    
    @Override
    public String toString() {
        final String fullyQualifiedDsn = Utils.getFullyQualifiedDsn(this.dataset, this.member);
        final StringBuilder buffer = new StringBuilder(fullyQualifiedDsn);
        buffer.append(' ').append(this.hfsPath);
        if (this.pdsEncoding != null) {
            buffer.append(' ').append("pdsEncoding").append('=').append(this.pdsEncoding);
        }
        return buffer.toString();
    }
}
