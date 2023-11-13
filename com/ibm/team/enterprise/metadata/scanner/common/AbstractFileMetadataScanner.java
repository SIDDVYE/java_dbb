// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner.common;

import com.ibm.dmh.util.StringMatcher;
import java.util.StringTokenizer;
import com.ibm.team.enterprise.metadata.scanner.IFileMetadataScanner;

public abstract class AbstractFileMetadataScanner implements IFileMetadataScanner
{
    protected String excludeFiles;
    protected String name;
    protected String label;
    protected String classname;
    protected String type;
    protected String namespace;
    protected String category;
    protected String dependencyTypes;
    protected IPropertyProvider propertyProvider;
    
    @Override
    public boolean accept(final String fileName) {
        if (this.excludeFiles != null) {
            final StringTokenizer st = new StringTokenizer(this.excludeFiles, ",");
            while (st.hasMoreTokens()) {
                final String str = st.nextToken();
                final StringMatcher matcher = new StringMatcher(str, false);
                if (matcher.matches(fileName)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public String getExcludeFiles() {
        return this.excludeFiles;
    }
    
    @Override
    public void setExcludeFiles(final String excludeFiles) {
        this.excludeFiles = excludeFiles;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public String getLabel() {
        return this.label;
    }
    
    @Override
    public void setLabel(final String label) {
        this.label = label;
    }
    
    @Override
    public String getClassname() {
        return this.classname;
    }
    
    @Override
    public void setClassname(final String classname) {
        this.classname = classname;
    }
    
    @Override
    public String getType() {
        return this.type;
    }
    
    @Override
    public void setType(final String type) {
        this.type = type;
    }
    
    @Override
    public String getNamespace() {
        return this.namespace;
    }
    
    @Override
    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }
    
    @Override
    public String getCategory() {
        return this.category;
    }
    
    @Override
    public void setCategory(final String category) {
        this.category = category;
    }
    
    @Override
    public String getDependencyTypes() {
        return this.dependencyTypes;
    }
    
    @Override
    public void setDependencyTypes(final String dependencyTypes) {
        this.dependencyTypes = dependencyTypes;
    }
    
    @Override
    public IPropertyProvider getPropertyProvider() {
        return this.propertyProvider;
    }
    
    @Override
    public void setPropertyProviderClass(final IPropertyProvider propertyProvider) {
        this.propertyProvider = propertyProvider;
    }
}
