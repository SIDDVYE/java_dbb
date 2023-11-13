// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner.common;

import com.ibm.team.filesystem.common.IFileItem;

public class ScanFileDesc
{
    private IFileItem fileItem;
    private String fileContents;
    private String filePath;
    private boolean delete;
    
    public ScanFileDesc() {
    }
    
    public ScanFileDesc(final IFileItem fileItem, final String filePath, final boolean delete) {
        this.fileItem = fileItem;
        this.filePath = filePath;
        this.delete = delete;
    }
    
    public IFileItem getFileItem() {
        return this.fileItem;
    }
    
    public void setFileItem(final IFileItem fileItem) {
        this.fileItem = fileItem;
    }
    
    public boolean isDelete() {
        return this.delete;
    }
    
    public void setDelete(final boolean delete) {
        this.delete = delete;
    }
    
    public String getFilePath() {
        return this.filePath;
    }
    
    public String getFileContents() {
        return this.fileContents;
    }
    
    public void setFileContents(final String fileContents) {
        this.fileContents = fileContents;
    }
    
    public void setFilePath(final String filePath) {
        this.filePath = filePath;
    }
}
