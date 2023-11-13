// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency.internal;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.dependency.IDependencyScanner;
import java.io.FileNotFoundException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.dependency.DependencyScannerRegistry;
import com.ibm.dbb.dependency.LogicalFile;
import org.slf4j.Logger;

public class DependencyUtilities
{
    private static Logger logger;
    
    public static LogicalFile getLogicalFile(final String file, final String sourceDir, final boolean disableCache) throws BuildException {
        DependencyUtilities.logger.debug("Getting logical file for file " + file);
        LogicalFile lfile = null;
        if (!disableCache) {
            DependencyUtilities.logger.debug("Checking cache for file " + file);
            final String cacheKey = sourceDir;
            lfile = LogicalFileCache.get(cacheKey, file);
        }
        if (lfile == null) {
            DependencyUtilities.logger.debug("Logical file not in cache");
            DependencyUtilities.logger.debug("Creating logical file by scanning file in sourceDir " + sourceDir);
            try {
                final IDependencyScanner scanner = DependencyScannerRegistry.getScanner(file);
                if (scanner == null) {
                    throw new BuildException(Messages.getMessage("LOGICAL_FILE_NO_SCANNER_REGISTERED", file));
                }
                lfile = scanner.scan(file, sourceDir);
                if (lfile != null && !disableCache) {
                    DependencyUtilities.logger.debug("Caching file " + lfile);
                    LogicalFileCache.add(sourceDir, lfile);
                }
                return lfile;
            }
            catch (FileNotFoundException fnfe) {
                throw new BuildException(fnfe);
            }
        }
        DependencyUtilities.logger.debug("Logical file retrieved from cache");
        return lfile;
    }
    
    public static LogicalFile getArchivedLogicalFile(final String file, final String archive, final boolean disableCache) throws BuildException {
        DependencyUtilities.logger.debug("Getting logical file for file " + file);
        LogicalFile lfile = null;
        if (!disableCache) {
            DependencyUtilities.logger.debug("Checking cache for file " + file);
            final String cacheKey = archive;
            lfile = LogicalFileCache.get(cacheKey, file);
        }
        if (lfile == null) {
            DependencyUtilities.logger.debug("Logical file not in cache");
            DependencyUtilities.logger.debug("Creating logical file by scanning file in archive " + archive);
            final IDependencyScanner scanner = DependencyScannerRegistry.getScanner(file);
            if (scanner == null) {
                throw new BuildException(Messages.getMessage("LOGICAL_FILE_NO_SCANNER_REGISTERED", file));
            }
            lfile = scanner.scanArchivedFile(archive, null, file);
            if (lfile != null && !disableCache) {
                DependencyUtilities.logger.debug("Caching file " + lfile);
                LogicalFileCache.add(archive, lfile);
            }
        }
        else {
            DependencyUtilities.logger.debug("Logical file retrieved from cache");
        }
        return lfile;
    }
    
    static {
        DependencyUtilities.logger = LoggerFactory.getLogger((Class)DependencyUtilities.class);
    }
}
