// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata;

import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.File;
import com.ibm.dbb.metadata.jdbc.JDBCMetadataStore;
import com.ibm.dbb.metadata.filesystem.FileMetadataStore;
import com.ibm.dbb.build.BuildException;

public class MetadataStoreFactory
{
    protected static MetadataStore metadataStore;
    
    public static boolean metadataStoreExists() {
        return MetadataStoreFactory.metadataStore != null;
    }
    
    public static MetadataStore getMetadataStore() {
        return MetadataStoreFactory.metadataStore;
    }
    
    public static MetadataStore createFileMetadataStore() throws BuildException {
        return createFileMetadataStore(null);
    }
    
    public static MetadataStore createFileMetadataStore(String location) throws BuildException {
        if (location == null) {
            location = System.getenv("HOME");
        }
        return MetadataStoreFactory.metadataStore = new FileMetadataStore(location);
    }
    
    public static MetadataStore createDb2MetadataStore(final String url, final String userId, final String password) throws BuildException {
        return MetadataStoreFactory.metadataStore = new JDBCMetadataStore(url, userId, password);
    }
    
    public static MetadataStore createDb2MetadataStore(final String url, final String userid, final File passwordFile) throws BuildException {
        try {
            if (passwordFile == null || !passwordFile.exists()) {
                throw new IllegalArgumentException("Required argument passwordFile must exist!");
            }
            final Properties properties = new Properties();
            final FileInputStream fis = new FileInputStream(passwordFile);
            properties.loadFromXML(fis);
            return createDb2MetadataStore(url, userid, (String)properties.get("password"));
        }
        catch (Exception e) {
            throw new BuildException(e);
        }
    }
    
    public static MetadataStore createDb2MetadataStore(final String userid, final String password, final Properties connectionProperties) throws BuildException {
        return MetadataStoreFactory.metadataStore = new JDBCMetadataStore(userid, password, connectionProperties);
    }
    
    public static MetadataStore createDb2MetadataStore(final String userid, final File passwordFile, final Properties connectionProperties) throws BuildException {
        try {
            if (passwordFile == null || !passwordFile.exists()) {
                throw new BuildException("Required argument passwordFile must exist!");
            }
            final Properties properties = new Properties();
            final FileInputStream fis = new FileInputStream(passwordFile);
            properties.loadFromXML(fis);
            return createDb2MetadataStore(userid, (String)properties.get("password"), connectionProperties);
        }
        catch (Exception e) {
            throw new BuildException(e);
        }
    }
    
    static {
        MetadataStoreFactory.metadataStore = null;
    }
}
