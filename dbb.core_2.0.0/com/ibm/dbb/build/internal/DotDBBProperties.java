// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.EnvVars;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import com.ibm.dbb.build.BuildException;
import java.io.File;
import java.util.Properties;
import org.slf4j.Logger;

public class DotDBBProperties
{
    private static Logger logger;
    private static final long serialVersionUID = 1L;
    private static final String dot_dbb = ".dbb";
    private static DotDBBProperties INSTANCE;
    private Properties _properties;
    private File _dotDBBFile;
    public static final String DBB_TRIAL_EXPIRATION = "dbb_trex";
    
    private DotDBBProperties() throws BuildException {
        this._properties = null;
        this._dotDBBFile = null;
        this.load();
    }
    
    public static DotDBBProperties getInstance() throws BuildException {
        if (DotDBBProperties.INSTANCE == null) {
            DotDBBProperties.INSTANCE = new DotDBBProperties();
        }
        return DotDBBProperties.INSTANCE;
    }
    
    private void load() throws BuildException {
        final File dotDBBFile = this.getDotDBBFile();
        if (dotDBBFile.exists()) {
            try {
                this.properties().load(new FileInputStream(dotDBBFile));
            }
            catch (FileNotFoundException e) {
                throw new BuildException(e.getMessage(), e);
            }
            catch (IOException e2) {
                throw new BuildException(e2.getMessage(), e2);
            }
        }
    }
    
    private Properties properties() {
        if (this._properties == null) {
            this._properties = new Properties();
        }
        return this._properties;
    }
    
    public String getProperty(final String key) {
        return this.properties().getProperty(key);
    }
    
    public String getProperty(final String key, final String defaultValue) {
        return this.properties().getProperty(key, defaultValue);
    }
    
    public Object setProperty(final String key, final String value) throws BuildException {
        final Object previous = this.properties().setProperty(key, value);
        this.store();
        return previous;
    }
    
    private void store() throws BuildException {
        final File dotDBBFile = this.getDotDBBFile();
        try {
            this.properties().store(new FileOutputStream(dotDBBFile), null);
        }
        catch (FileNotFoundException e) {
            throw new BuildException(e.getMessage(), e);
        }
        catch (IOException e2) {
            throw new BuildException(e2.getMessage(), e2);
        }
    }
    
    private File getDotDBBFile() throws BuildException {
        if (this._dotDBBFile == null) {
            this._dotDBBFile = new File(EnvVars.getConf() + "/" + ".dbb");
            DotDBBProperties.logger.debug(this._dotDBBFile.getParentFile() + " is writeable? " + this._dotDBBFile.getParentFile().canWrite());
            DotDBBProperties.logger.debug("_dotDBBFile.exists()? " + this._dotDBBFile.exists());
            DotDBBProperties.logger.debug(this._dotDBBFile + " is writeable? " + this._dotDBBFile.canWrite());
            if (!this._dotDBBFile.getParentFile().canWrite() || (this._dotDBBFile.exists() && !this._dotDBBFile.canWrite())) {
                throw new BuildException(Messages.getMessage("DBB_CONF_NOT_WRITABLE"));
            }
        }
        return this._dotDBBFile;
    }
    
    static {
        DotDBBProperties.logger = LoggerFactory.getLogger((Class)DotDBBProperties.class);
        DotDBBProperties.INSTANCE = null;
    }
}
