// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.util.HashSet;
import java.util.Set;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class PropertyMappings
{
    protected String keyName;
    
    public PropertyMappings(final String key) {
        this.keyName = key;
    }
    
    public String getValue(final String file) {
        return BuildProperties.getFileProperty(this.getKeyName(), file);
    }
    
    public void setValue(final String value, final List<String> filePatterns) {
        BuildProperties.setFileProperty(this.getKeyName(), value, filePatterns);
    }
    
    public void addFilePattern(final String value, final String filePattern) {
        BuildProperties.addFilePattern(this.getKeyName(), value, filePattern);
    }
    
    public void addFilePatterns(final String value, final List<String> filePatterns) {
        BuildProperties.addFilePatterns(this.getKeyName(), value, filePatterns);
    }
    
    public boolean isMapped(final String value, final String file) {
        if (value == null) {
            return false;
        }
        final String fileMapping = BuildProperties.getFileProperty(this.getKeyName(), file);
        return value.equals(fileMapping);
    }
    
    public List<String> getMappedList(final String value, final List<String> files) {
        final ArrayList<String> buildList = new ArrayList<String>();
        for (final String file : files) {
            if (this.isMapped(value, file)) {
                buildList.add(file);
            }
        }
        return buildList;
    }
    
    public List<String> getMappedList(final String value, final File file) throws IOException {
        return this.getMappedList(value, file, "Cp1047");
    }
    
    public List<String> getMappedList(final String value, final File file, final String encoding) throws IOException {
        BufferedReader br = null;
        final ArrayList<String> files = new ArrayList<String>();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding));
            String line;
            while ((line = br.readLine()) != null) {
                files.add(line);
            }
        }
        finally {
            if (br != null) {
                br.close();
            }
        }
        return this.getMappedList(value, files);
    }
    
    public Set<String> getValues() {
        final Set<String> values = BuildProperties.filePropertyValueKeySet().get(this.getKeyName());
        return (values != null) ? values : new HashSet<String>();
    }
    
    public void setKeyName(final String newKeyName) {
        this.keyName = newKeyName;
    }
    
    public String getKeyName() {
        return this.keyName;
    }
}
