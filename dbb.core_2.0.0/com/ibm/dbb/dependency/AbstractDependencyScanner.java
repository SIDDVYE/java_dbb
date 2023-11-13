// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import org.slf4j.LoggerFactory;
import java.util.Iterator;
import com.ibm.dbb.build.internal.TarArchiveHandler;
import java.util.ArrayList;
import com.ibm.dbb.build.BuildException;
import java.util.List;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import com.ibm.dbb.build.internal.Utils;
import org.slf4j.Logger;

public abstract class AbstractDependencyScanner implements IDependencyScanner
{
    protected static Logger logger;
    
    @Override
    public LogicalFile scan(final String file, final String sourceDir) throws FileNotFoundException {
        final File jfile = Utils.createFile(file, sourceDir);
        String encoding = null;
        try {
            encoding = Utils.retrieveHFSEncoding(jfile);
        }
        catch (IOException e) {
            throw new FileNotFoundException(e.getMessage());
        }
        AbstractDependencyScanner.logger.debug("Retrieved HFS Encoding for " + jfile + " = " + encoding);
        return this.scan(file, sourceDir, encoding);
    }
    
    @Override
    public LogicalFile scan(final String file, final String sourceDir, final String encoding) throws FileNotFoundException {
        AbstractDependencyScanner.logger.debug("AbstractDependencyScanner.scan file = " + file + " sourceDir = " + sourceDir + " encoding = " + encoding);
        final FileInputStream fis = new FileInputStream(Utils.createFile(file, sourceDir));
        final Object scanMetadata = this.runScan(file, fis, encoding);
        return this.createLogicalFile(file, scanMetadata);
    }
    
    @Override
    public LogicalFile scan(final String file, final InputStream inputStream) {
        final String encoding = Utils.retrieveEncoding();
        final Object scanMetadata = this.runScan(file, inputStream, encoding);
        return this.createLogicalFile(file, scanMetadata);
    }
    
    @Override
    public LogicalFile scan(final String file, final InputStream inputStream, final String encoding) {
        AbstractDependencyScanner.logger.debug("AbstractDependencyScanner.scan file = " + file + " inputStream encoding = " + encoding);
        final Object scanMetadata = this.runScan(file, inputStream, encoding);
        return this.createLogicalFile(file, scanMetadata);
    }
    
    @Override
    public List<LogicalFile> scanArchive(final String archive, final String sourceDir) throws BuildException {
        final String encoding = Utils.retrieveEncoding();
        return this.scanArchive(archive, sourceDir, encoding);
    }
    
    @Override
    public List<LogicalFile> scanArchive(final String archive, final String sourceDir, final String encoding) throws BuildException {
        AbstractDependencyScanner.logger.debug("AbstractDependencyScanner.scan archive = " + archive + " sourceDir = " + sourceDir + " encoding = " + encoding);
        final ArrayList<LogicalFile> logicalFiles = new ArrayList<LogicalFile>();
        final TarArchiveHandler tarArchiveHandler = new TarArchiveHandler(archive, sourceDir);
        for (final String file : tarArchiveHandler.getFileNames()) {
            final Object scanMetadata = this.runScan(file, tarArchiveHandler.getFileContents(file), encoding);
            logicalFiles.add(this.createLogicalFile(file, scanMetadata));
        }
        return logicalFiles;
    }
    
    @Override
    public LogicalFile scanArchivedFile(final String archive, final String sourceDir, final String file) throws BuildException {
        final String encoding = Utils.retrieveEncoding();
        return this.scanArchivedFile(archive, sourceDir, file, encoding);
    }
    
    @Override
    public LogicalFile scanArchivedFile(final String archive, final String sourceDir, final String file, final String encoding) throws BuildException {
        AbstractDependencyScanner.logger.debug("AbstractDependencyScanner.scan archive = " + archive + " file = " + file + " sourceDir = " + sourceDir + " encoding = " + encoding);
        final TarArchiveHandler tarArchiveHandler = new TarArchiveHandler(archive, sourceDir);
        final Object scanMetadata = this.runScan(file, tarArchiveHandler.getFileContents(file), encoding);
        return this.createLogicalFile(file, scanMetadata);
    }
    
    public String createLogicalName(final String fileName) {
        final File jfile = new File(fileName);
        String lname = jfile.getName();
        final int idx = lname.lastIndexOf(46);
        if (idx > -1) {
            lname = lname.substring(0, idx);
        }
        return lname.toUpperCase();
    }
    
    protected abstract Object runScan(final String p0, final InputStream p1, final String p2);
    
    protected abstract LogicalFile createLogicalFile(final String p0, final Object p1);
    
    static {
        AbstractDependencyScanner.logger = LoggerFactory.getLogger((Class)AbstractDependencyScanner.class);
    }
}
