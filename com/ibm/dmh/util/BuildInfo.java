// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import com.ibm.dmh.log.LoggerManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuildInfo
{
    private String buildLabel;
    private String buildDate;
    private String buildVersion;
    private String buildUser;
    private String propFile;
    protected static Logger logger;
    protected static boolean debug;
    
    public BuildInfo(final String propertiesFile) {
        this.propFile = propertiesFile;
        this.buildLabel = "";
        this.buildDate = "";
        this.buildUser = "";
        this.loadBuildProperties();
    }
    
    private void loadBuildProperties() {
        if (BuildInfo.debug) {
            BuildInfo.logger.log(Level.FINER, "Loading build properties...");
        }
        try {
            final ResourceBundle rb = ResourceBundle.getBundle(this.propFile);
            this.setLabel(rb.getString("BuildName"));
            this.setDate(rb.getString("BuildTime"));
            this.setUser(rb.getString("BuildUser"));
            this.setVersion(rb.getString("Version"));
        }
        catch (MissingResourceException e) {
            BuildInfo.logger.log(Level.SEVERE, "Missing resource bundle [" + this.propFile + "] or property", e);
        }
        catch (Throwable t) {
            BuildInfo.logger.log(Level.SEVERE, t.getLocalizedMessage(), t);
        }
    }
    
    private void setDate(final String date) {
        this.buildDate = date;
    }
    
    private void setLabel(final String label) {
        this.buildLabel = label;
    }
    
    private void setUser(final String user) {
        this.buildUser = user;
    }
    
    private void setVersion(final String version) {
        this.buildVersion = version;
    }
    
    public String getLabel() {
        return this.buildLabel;
    }
    
    public String getUser() {
        return this.buildUser;
    }
    
    public String getVersion() {
        return this.buildVersion;
    }
    
    public String getDate() {
        return this.buildDate;
    }
    
    public String getYear() {
        String year = "";
        final Pattern p = Pattern.compile(".*(\\d{4,4}).*");
        final Matcher m = p.matcher(this.getDate());
        if (m.matches()) {
            year = m.group(1);
        }
        return year;
    }
    
    static {
        BuildInfo.logger = LoggerManager.getMainLogger();
        BuildInfo.debug = BuildInfo.logger.isLoggable(Level.FINE);
    }
}
