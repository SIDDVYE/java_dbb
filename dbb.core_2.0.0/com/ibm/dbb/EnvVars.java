// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb;

import org.slf4j.LoggerFactory;
import java.io.File;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import org.slf4j.Logger;

public class EnvVars
{
    private static final String DBB_HOME = "DBB_HOME";
    private static final String DBB_CONF = "DBB_CONF";
    private static final String CONF = "conf";
    private static final String BACK_SLASH = "/";
    private static Logger logger;
    
    public static String getHome() throws BuildException {
        String home = System.getenv("DBB_HOME");
        if (home == null) {
            EnvVars.logger.debug("DBB_HOME environment variable not set");
            home = getHomeFromCodeSource();
        }
        if (home == null) {
            throw new BuildException(Messages.getMessage("EnvVars_ERROR_DBB_HOME_NOT_SET"));
        }
        EnvVars.logger.debug("DBB_HOME=" + home);
        return home;
    }
    
    public static String getConf() throws BuildException {
        String conf = System.getenv("DBB_CONF");
        if (conf == null) {
            EnvVars.logger.debug("DBB_CONF environment variable not set");
            String home = getHome();
            home = (home.endsWith("/") ? home : (home + "/"));
            conf = home + "conf";
        }
        EnvVars.logger.debug("DBB_CONF=" + conf);
        return conf;
    }
    
    private static String getHomeFromCodeSource() throws BuildException {
        EnvVars.logger.debug("Calculating DBB_HOME from code source location");
        File sourceFile = null;
        try {
            sourceFile = new File(EnvVars.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        }
        catch (Exception ex) {}
        final File libDir = (sourceFile == null) ? null : sourceFile.getParentFile();
        if (libDir != null) {
            EnvVars.logger.warn(Messages.getMessage("EnvVars_WARNING_DBB_HOME_CALCULATED", libDir.getParent()));
            return libDir.getParent();
        }
        return null;
    }
    
    static {
        EnvVars.logger = LoggerFactory.getLogger((Class)EnvVars.class);
    }
}
