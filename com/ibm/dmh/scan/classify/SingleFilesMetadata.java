// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify;

public class SingleFilesMetadata
{
    private ClassifierMetaData metaData;
    private String containerName;
    private String fileTypeCd;
    private String languageCd;
    private String memberName;
    private String rmType;
    private String siteName;
    
    public SingleFilesMetadata() {
        this.containerName = null;
        this.fileTypeCd = null;
        this.languageCd = null;
        this.memberName = null;
        this.metaData = null;
        this.rmType = null;
        this.siteName = null;
    }
    
    public String getContainerName() {
        return this.containerName;
    }
    
    public String getFileTypeCd() {
        return this.fileTypeCd;
    }
    
    public String getLanguageCd() {
        return this.languageCd;
    }
    
    public String getMemberName() {
        return this.memberName;
    }
    
    public ClassifierMetaData getMetaData() {
        return this.metaData;
    }
    
    public String getRmType() {
        return this.rmType;
    }
    
    public String getSiteName() {
        return this.siteName;
    }
    
    public void setContainerName(final String iSetting) {
        this.containerName = iSetting;
    }
    
    public void setFileTypeCd(final String iSetting) {
        this.fileTypeCd = iSetting;
    }
    
    public void setLanguageCd(final String iSetting) {
        this.languageCd = iSetting;
    }
    
    public void setMemberName(final String iSetting) {
        this.memberName = iSetting;
    }
    
    public void setMetaData(final ClassifierMetaData iSetting) {
        this.metaData = iSetting;
    }
    
    public void setRmType(final String iSetting) {
        this.rmType = iSetting;
    }
    
    public void setSiteName(final String iSetting) {
        this.siteName = iSetting;
    }
}
