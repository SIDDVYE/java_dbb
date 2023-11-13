// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.teamz.metadata;

import java.util.ArrayList;
import com.ibm.team.enterprise.metadata.scanner.IDependencyData;
import com.ibm.team.enterprise.metadata.scanner.IGeneralProperty;
import java.util.List;
import com.ibm.team.enterprise.metadata.scanner.IScannerData;

public class ScannerData implements IScannerData
{
    List<IGeneralProperty> scannerGeneralProperties;
    ScannerDependencyData scannerDependencyData;
    
    public ScannerData() {
        this.scannerDependencyData = null;
        this.scannerGeneralProperties = null;
    }
    
    @Override
    public IDependencyData getDependencyData() {
        return this.scannerDependencyData;
    }
    
    @Override
    public List<IGeneralProperty> getGeneralData() {
        return this.scannerGeneralProperties;
    }
    
    public void addDependencyData(final String iLogicalName, final String iReferenceType, final String iFileTypeCd, final String iDdName) {
        this.addDependencyData(iLogicalName, iReferenceType, iFileTypeCd, iDdName, false);
    }
    
    public void addDependencyData(final String iLogicalName, final String iReferenceType, final String iFileTypeCd, final String iDdName, final boolean ignoreInBuild) {
        if (this.scannerDependencyData == null) {
            this.scannerDependencyData = new ScannerDependencyData();
        }
        this.scannerDependencyData.addDependency(iLogicalName, iReferenceType, iFileTypeCd, iDdName, ignoreInBuild);
    }
    
    public void addGeneralProperty(final String iName, final Object iValue) {
        if (this.scannerGeneralProperties == null) {
            this.scannerGeneralProperties = new ArrayList<IGeneralProperty>();
        }
        final ScannerGeneralProperty property = new ScannerGeneralProperty(iName, iValue);
        this.scannerGeneralProperties.add(property);
    }
    
    public void setFileType(final String iSetting) {
        if (this.scannerDependencyData == null) {
            this.scannerDependencyData = new ScannerDependencyData();
        }
        this.scannerDependencyData.setFileType(iSetting);
    }
    
    public void setLanguage(final String iSetting) {
        if (this.scannerDependencyData == null) {
            this.scannerDependencyData = new ScannerDependencyData();
        }
        this.scannerDependencyData.setLanguage(iSetting);
    }
}
