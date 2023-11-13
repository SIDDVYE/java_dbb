// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import java.util.HashMap;
import java.util.Map;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class PasswordUtil
{
    public char[] decryptPasswordFile(final File passwordFile) throws FileNotFoundException, IOException {
        return this.decryptPasswordFile(passwordFile, null);
    }
    
    public char[] decryptPasswordFile(final File passwordFile, final byte[] key) throws FileNotFoundException, IOException {
        final Properties props = new Properties();
        props.loadFromXML(new FileInputStream(passwordFile));
        final String version = props.getProperty("version");
        return StringUtil.decryptString(props.getProperty("password"), version, key);
    }
    
    public void encryptPasswordFile(final File passwordFile, final char[] password) throws IOException {
        this.encryptPasswordFile(passwordFile, password, null);
    }
    
    public void encryptPasswordFile(final File passwordFile, final char[] password, final byte[] key) throws IOException {
        final String version = "2";
        FileOutputStream outStream = null;
        try {
            final Properties props = new Properties();
            props.setProperty("version", version);
            props.setProperty("password", StringUtil.encryptString(password, version, key));
            outStream = new FileOutputStream(passwordFile);
            props.storeToXML(outStream, "1.0", "UTF-8");
        }
        finally {
            if (outStream != null) {
                outStream.close();
            }
        }
    }
    
    public Map<String, String> getEncryptedPasswordFromFile(final File passwordFile) throws IOException {
        final Properties props = new Properties();
        props.loadFromXML(new FileInputStream(passwordFile));
        final String version = props.getProperty("version");
        final String password = props.getProperty("password");
        final Map<String, String> passwordInfo = new HashMap<String, String>();
        passwordInfo.put("version", version);
        passwordInfo.put("password", password);
        return passwordInfo;
    }
    
    public String encryptString(final char[] value) {
        final String version = "2";
        return StringUtil.encryptString(value, version, null);
    }
    
    public String encryptString(final char[] value, final byte[] key) {
        final String version = "2";
        return StringUtil.encryptString(value, version, key);
    }
    
    public String encryptString(final char[] value, final String keyVersion) {
        return StringUtil.encryptString(value, keyVersion, null);
    }
    
    public char[] decryptString(final String value) {
        final String version = "2";
        return StringUtil.decryptString(value, version, null);
    }
    
    public char[] decryptString(final String value, final byte[] key) {
        final String version = "2";
        return StringUtil.decryptString(value, version, key);
    }
    
    public char[] decryptString(final String value, final String keyVersion) {
        return StringUtil.decryptString(value, keyVersion, null);
    }
}
