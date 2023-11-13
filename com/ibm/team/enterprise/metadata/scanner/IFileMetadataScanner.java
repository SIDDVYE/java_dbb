// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner;

import java.util.Map;
import java.io.InputStream;
import com.ibm.team.enterprise.metadata.scanner.common.IPropertyProvider;

public interface IFileMetadataScanner
{
    String getName();
    
    void setName(final String p0);
    
    String getLabel();
    
    void setLabel(final String p0);
    
    String getClassname();
    
    void setClassname(final String p0);
    
    String getType();
    
    void setType(final String p0);
    
    String getExcludeFiles();
    
    void setExcludeFiles(final String p0);
    
    String getNamespace();
    
    void setNamespace(final String p0);
    
    String getDependencyTypes();
    
    void setDependencyTypes(final String p0);
    
    void setCategory(final String p0);
    
    String getCategory();
    
    IPropertyProvider getPropertyProvider();
    
    void setPropertyProviderClass(final IPropertyProvider p0);
    
    boolean accept(final String p0);
    
    IScannerData scan(final InputStream p0, final Map<String, String> p1) throws Exception;
    
    Map<String, IMetadataValueType> getGeneralMetadataTypes();
}
