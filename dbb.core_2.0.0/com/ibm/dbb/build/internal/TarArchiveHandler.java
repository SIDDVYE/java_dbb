// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import java.io.File;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.io.IOException;
import java.io.FileNotFoundException;
import com.ibm.dbb.build.BuildException;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import java.io.InputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.slf4j.Logger;

public class TarArchiveHandler
{
    private static Logger logger;
    private String archive;
    private final String encoding = "ISO8859-1";
    
    public TarArchiveHandler(final String file, final String sourceDir) {
        this.archive = Utils.createAbsoluteFileName(file, sourceDir);
    }
    
    public ArrayList<String> getFileNames() throws BuildException {
        final ArrayList<String> files = new ArrayList<String>();
        TarArchiveInputStream tarArchiveInputStream = null;
        Label_0220: {
            if (this.isCompressed(this.archive)) {
                TarArchiveHandler.logger.debug("Found compressed archive file: " + this.archive);
                try {
                    tarArchiveInputStream = new TarArchiveInputStream((InputStream)new GzipCompressorInputStream((InputStream)new FileInputStream(this.archive)), "ISO8859-1");
                    break Label_0220;
                }
                catch (FileNotFoundException e2) {
                    throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_NOT_FOUND", this.archive));
                }
                catch (IOException e) {
                    throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_IOEXCEPTION", this.archive, e.getMessage()));
                }
            }
            TarArchiveHandler.logger.debug("Found archive file: " + this.archive);
            try {
                tarArchiveInputStream = new TarArchiveInputStream((InputStream)new FileInputStream(this.archive), "ISO8859-1");
            }
            catch (FileNotFoundException e2) {
                throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_NOT_FOUND", this.archive));
            }
            try {
                TarArchiveEntry nextTarArchiveEntry;
                while ((nextTarArchiveEntry = tarArchiveInputStream.getNextTarEntry()) != null) {
                    TarArchiveHandler.logger.debug("Next archive entry: " + nextTarArchiveEntry.getName());
                    if (!nextTarArchiveEntry.getName().endsWith("/")) {
                        files.add(nextTarArchiveEntry.getName());
                    }
                }
            }
            catch (IOException e) {
                throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_IOEXCEPTION", this.archive, e.getMessage()));
            }
        }
        try {
            tarArchiveInputStream.close();
        }
        catch (IOException e) {
            throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_IOEXCEPTION", this.archive, e.getMessage()));
        }
        return files;
    }
    
    public InputStream getFileContents(final String file) throws BuildException {
        if (file == null) {
            throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_FILE_NULL"));
        }
        TarArchiveInputStream tarArchiveInputStream = null;
        Label_0229: {
            if (this.isCompressed(this.archive)) {
                TarArchiveHandler.logger.debug("Found compressed archive file: " + this.archive);
                try {
                    tarArchiveInputStream = new TarArchiveInputStream((InputStream)new GzipCompressorInputStream((InputStream)new FileInputStream(this.archive)), "ISO8859-1");
                    break Label_0229;
                }
                catch (FileNotFoundException e3) {
                    throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_NOT_FOUND", this.archive));
                }
                catch (IOException e) {
                    throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_IOEXCEPTION", this.archive, e.getMessage()));
                }
            }
            TarArchiveHandler.logger.debug("Found archive file: " + this.archive);
            try {
                tarArchiveInputStream = new TarArchiveInputStream((InputStream)new FileInputStream(this.archive), "ISO8859-1");
            }
            catch (FileNotFoundException e3) {
                throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_NOT_FOUND", this.archive));
            }
        }
        String searchFile = file;
        final File jfile = new File(searchFile);
        if (jfile.getParent() == null) {
            searchFile = "./" + searchFile;
        }
        try {
            TarArchiveEntry nextTarArchiveEntry;
            while ((nextTarArchiveEntry = tarArchiveInputStream.getNextTarEntry()) != null) {
                TarArchiveHandler.logger.debug("Next archive entry: " + nextTarArchiveEntry.getName());
                if (!nextTarArchiveEntry.getName().equals(searchFile)) {
                    continue;
                }
                TarArchiveHandler.logger.debug("Archive entry matches requested file name: " + file);
                return (InputStream)tarArchiveInputStream;
            }
        }
        catch (IOException e2) {
            throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_IOEXCEPTION", this.archive, e2.getMessage()));
        }
        throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_FILE_NOT_FOUND", file, this.archive));
    }
    
    private boolean isCompressed(final String filename) {
        return filename.endsWith(".gz");
    }
    
    static {
        TarArchiveHandler.logger = LoggerFactory.getLogger((Class)TarArchiveHandler.class);
    }
}
