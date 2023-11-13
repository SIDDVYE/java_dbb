// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.teamz.metadata;

import java.util.Iterator;
import java.util.ArrayList;
import com.ibm.team.enterprise.metadata.scanner.IGeneralProperty;
import com.ibm.team.enterprise.metadata.scanner.IDependencyProperty;
import java.util.List;
import com.ibm.team.enterprise.metadata.scanner.IDependencyData;

public class ScannerDependencyData implements IDependencyData
{
    private List<IDependencyProperty> dependencies;
    private List<IGeneralProperty> properties;
    private String fileType;
    private String language;
    private String logicalName;
    
    public ScannerDependencyData() {
        this.dependencies = null;
        this.properties = null;
        this.fileType = null;
        this.language = null;
        this.logicalName = null;
    }
    
    public void addDependency(final String iLogicalName, final String iReferenceType, final String iFileTypeCd, final String iDdName) {
        this.addDependency(iLogicalName, iReferenceType, iFileTypeCd, iDdName, false);
    }
    
    public void addDependency(final String iLogicalName, final String iReferenceType, final String iFileTypeCd, final String iDdName, final boolean ignoreInBuild) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<IDependencyProperty>();
        }
        final ScannerDependencyProperty scannerDependencyProperty = new ScannerDependencyProperty();
        scannerDependencyProperty.setLogicalName(iLogicalName);
        scannerDependencyProperty.setReferenceType(iReferenceType);
        scannerDependencyProperty.setFileType(iFileTypeCd);
        scannerDependencyProperty.setDependencyPath(iDdName);
        if (ignoreInBuild) {
            scannerDependencyProperty.addExtendedProperty(new ScannerGeneralProperty("ignoreInBuild", "YES"));
        }
        this.dependencies.add(scannerDependencyProperty);
    }
    
    @Override
    public List<IDependencyProperty> getDependencies() {
        return this.dependencies;
    }
    
    @Override
    public List<IGeneralProperty> getProperties() {
        return this.properties;
    }
    
    @Override
    public String getFileType() {
        return this.fileType;
    }
    
    @Override
    public String getLanguage() {
        return this.language;
    }
    
    @Override
    public String getLogicalName() {
        return this.logicalName;
    }
    
    public void setFileType(final String iSetting) {
        this.fileType = iSetting;
    }
    
    public void setLanguage(final String iSetting) {
        this.language = iSetting;
    }
    
    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("    logicalName: " + this.logicalName + "\n");
        stringBuffer.append("    language: " + this.language + "\n");
        stringBuffer.append("    fileType: " + this.fileType + "\n");
        stringBuffer.append("    properties:\n");
        if (this.properties != null) {
            for (final IGeneralProperty property : this.properties) {
                stringBuffer.append("      " + property.getName() + "=" + property.getValue() + "\n");
            }
        }
        stringBuffer.append("    dependencies: \n");
        if (this.dependencies != null) {
            for (final IDependencyProperty dependency : this.dependencies) {
                stringBuffer.append("      fileType: " + dependency.getDependencyFileType() + "\n");
                stringBuffer.append("      logicalName: " + dependency.getDependencyLogicalName() + "\n");
                stringBuffer.append("      path: " + dependency.getDependencyPath() + "\n");
                stringBuffer.append("      referenceType: " + dependency.getDependencyReferenceType() + "\n");
            }
        }
        return stringBuffer.toString();
    }
    
    public void setLogicalName(final String iSetting) {
        this.logicalName = iSetting;
    }
}
