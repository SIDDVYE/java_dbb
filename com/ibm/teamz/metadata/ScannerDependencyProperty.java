// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.teamz.metadata;

import java.util.ArrayList;
import com.ibm.team.enterprise.metadata.scanner.IGeneralProperty;
import java.util.List;
import com.ibm.team.enterprise.metadata.scanner.IDependencyProperty;

public class ScannerDependencyProperty implements IDependencyProperty
{
    private List<IGeneralProperty> extendedProperties;
    private String fileType;
    private String logicalName;
    private String path;
    private String referenceType;
    
    ScannerDependencyProperty() {
        this.extendedProperties = null;
        this.fileType = null;
        this.logicalName = null;
        this.path = null;
        this.referenceType = null;
    }
    
    public void addExtendedProperty(final IGeneralProperty property) {
        if (this.extendedProperties == null) {
            this.extendedProperties = new ArrayList<IGeneralProperty>();
        }
        this.extendedProperties.add(property);
    }
    
    @Override
    public String getDependencyFileType() {
        return this.fileType;
    }
    
    @Override
    public String getDependencyLogicalName() {
        return this.logicalName;
    }
    
    @Override
    public String getDependencyPath() {
        return this.path;
    }
    
    @Override
    public String getDependencyReferenceType() {
        return this.referenceType;
    }
    
    public void setDependencyPath(final String iPath) {
        this.path = iPath;
    }
    
    public void setFileType(final String type) {
        this.fileType = type;
    }
    
    @Override
    public List<IGeneralProperty> getExtendedProperties() {
        return this.extendedProperties;
    }
    
    public void setLogicalName(final String iSetting) {
        this.logicalName = iSetting;
    }
    
    public void setReferenceType(final String iSetting) {
        this.referenceType = iSetting;
    }
}
