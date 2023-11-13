// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class VersionInfo
{
    private static final String UNKNOWN = "UNKNOWN";
    private static VersionInfo instance;
    private String version;
    private String build;
    private String date;
    
    private VersionInfo() {
        try {
            InputStream inputStream = null;
            try {
                inputStream = this.getClass().getResourceAsStream("internal/version.properties");
                final Properties properties = new Properties();
                properties.load(inputStream);
                this.version = properties.getProperty("version");
                this.build = properties.getProperty("build");
                this.date = properties.getProperty("date");
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        catch (IOException e) {
            this.version = "UNKNOWN";
            this.build = "UNKNOWN";
            this.date = "UNKNOWN";
        }
    }
    
    public static VersionInfo getInstance() {
        if (VersionInfo.instance == null) {
            VersionInfo.instance = new VersionInfo();
        }
        return VersionInfo.instance;
    }
    
    public static void staticReset() {
        VersionInfo.instance = null;
    }
    
    public String getVersion() {
        return this.version;
    }
    
    public String getBuild() {
        return this.build;
    }
    
    public String getDate() {
        return this.date;
    }
}
