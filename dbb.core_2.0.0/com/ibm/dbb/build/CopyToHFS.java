// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import org.slf4j.LoggerFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.jzos.FileAttribute;
import java.io.FileOutputStream;
import com.ibm.jzos.ZFileException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import com.ibm.dbb.build.internal.DDProcess;
import com.ibm.dbb.build.internal.EBCDICFilterInputStream;
import com.ibm.jzos.ZFile;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.report.records.CopyToHFSRecord;
import com.ibm.dbb.build.internal.DDProcessFactory;
import com.ibm.dbb.build.internal.Utils;
import java.io.IOException;
import java.io.File;
import org.slf4j.Logger;

public class CopyToHFS implements IExecute
{
    private static Logger logger;
    private static final String DEFAULT_READ_TEXT_OPTIONS = "r";
    private static final String DEFAULT_READ_BINARY_OPTIONS = "rb,noseek";
    private static final byte[] NL;
    private String dataset;
    private String member;
    private String ddName;
    private File file;
    private String readOptions;
    private boolean append;
    private String hfsEncoding;
    private String pdsEncoding;
    private DBBConstants.CopyMode copyMode;
    private String volser;
    private DDStatement dummyDD;
    private boolean convertControlCharacters;
    
    public CopyToHFS() {
        this.copyMode = DBBConstants.CopyMode.TEXT;
    }
    
    public void copy() throws IOException {
        this.doCopy();
    }
    
    @Override
    public int execute() throws BuildException {
        try {
            return this.doCopy();
        }
        catch (IOException ioe) {
            throw new BuildException(ioe);
        }
    }
    
    private int doCopy() throws IOException {
        int rc = 0;
        if (Utils.isBuildReportOnly()) {
            this.createBuildRecord();
            return rc;
        }
        try {
            if (this.copyMode == DBBConstants.CopyMode.BINARY) {
                rc = this.copyAsBinary();
            }
            else if (this.copyMode == DBBConstants.CopyMode.LOAD) {
                rc = this.copyAsLoad();
            }
            else if (this.copyMode == DBBConstants.CopyMode.ASA_TEXT) {
                rc = this.copyAsASAText();
            }
            else {
                rc = this.copyAsText();
            }
            return rc;
        }
        finally {
            if (this.dummyDD != null) {
                DDProcessFactory.getDDProcess().free(this.dummyDD, true);
            }
            this.createBuildRecord();
        }
    }
    
    private void createBuildRecord() {
        final CopyToHFSRecord record = new CopyToHFSRecord();
        record.setSource(this.getSourceForReport());
        record.setDestination(this.file);
        record.setMode(this.copyMode);
        BuildReportFactory.getBuildReport().addRecord(record);
    }
    
    private int copyAsText() throws IOException {
        final String tempReadOptions = (this.readOptions == null) ? "r" : ("r," + this.readOptions);
        if (this.file.getParentFile() != null) {
            this.file.getParentFile().mkdirs();
        }
        if (this.pdsEncoding == null || this.pdsEncoding.isEmpty()) {
            this.pdsEncoding = Utils.retrieveEncoding();
        }
        if (this.hfsEncoding == null || this.hfsEncoding.isEmpty()) {
            this.hfsEncoding = this.pdsEncoding;
        }
        if (this.ddName != null) {
            CopyToHFS.logger.debug("Copying " + this.ddName + " (encoding=" + this.pdsEncoding + ") to '" + this.file.getAbsolutePath() + "' (encoding=" + this.hfsEncoding + ")");
            final DDProcess ddProcess = DDProcessFactory.getDDProcess();
            try {
                return ddProcess.copydd(this.ddName, this.pdsEncoding, tempReadOptions, this.file, this.hfsEncoding, this.append, this.convertControlCharacters);
            }
            catch (BuildException e) {
                throw new IOException(e);
            }
        }
        final String source = this.getSource();
        CopyToHFS.logger.debug("Copying " + source + " (encoding=" + this.pdsEncoding + ") to '" + this.file.getAbsolutePath() + "' (encoding=" + this.hfsEncoding + ")");
        ZFile zFile = null;
        InputStream ins = null;
        try {
            zFile = new ZFile(source, tempReadOptions);
            ins = (this.convertControlCharacters ? new EBCDICFilterInputStream(zFile.getInputStream()) : zFile.getInputStream());
            Utils.saveContentToFile(ins, this.file, this.pdsEncoding, this.hfsEncoding, this.append);
        }
        finally {
            if (ins != null) {
                ins.close();
            }
            if (zFile != null) {
                zFile.close();
            }
        }
        return 0;
    }
    
    private int copyAsBinary() throws IOException {
        if (this.pdsEncoding != null && !this.pdsEncoding.isEmpty()) {
            CopyToHFS.logger.debug("Ignore pdsEncoding as binary being specified");
        }
        if (this.hfsEncoding != null && !this.hfsEncoding.isEmpty()) {
            CopyToHFS.logger.debug("Ignore hfsEncoding as binary being specified");
        }
        final String tempReadOptions = (this.readOptions == null) ? "rb,noseek" : ("rb,noseek," + this.readOptions);
        final String source = this.getSource();
        if (this.file.getParentFile() != null) {
            this.file.getParentFile().mkdirs();
        }
        FileOutputStream fos = null;
        InputStream is = null;
        try {
            ZFile zFile = null;
            try {
                zFile = new ZFile(source, tempReadOptions);
            }
            catch (ZFileException e) {
                throw new FileNotFoundException(source);
            }
            is = zFile.getInputStream();
            fos = new FileOutputStream(this.file);
            final byte[] buffer = new byte[zFile.getLrecl()];
            int numBytesRead = -1;
            while ((numBytesRead = is.read(buffer)) >= 0) {
                fos.write(buffer, 0, numBytesRead);
            }
            if (Utils.isSetFileTagging()) {
                final FileAttribute.Tag tag = new FileAttribute.Tag('\uffff', false);
                FileAttribute.setTag(this.file.getAbsolutePath(), tag);
            }
            return 0;
        }
        finally {
            if (is != null) {
                is.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
    
    private int copyAsLoad() throws IOException {
        if (this.file.getParentFile() != null) {
            this.file.getParentFile().mkdirs();
        }
        final String source = this.getSource();
        CopyToHFS.logger.debug("Copying the load module " + source + " to " + this.file.getAbsolutePath());
        final StringBuilder error = new StringBuilder();
        final Process process = Utils.runInProcess("cp -X " + source + " " + this.file.getAbsolutePath(), error);
        if (process.exitValue() == 0) {
            CopyToHFS.logger.debug("Successfully copying load module " + source + " to " + this.file.getAbsolutePath());
            return process.exitValue();
        }
        CopyToHFS.logger.debug("Failed to copying load module " + source + " to " + this.file.getAbsolutePath() + ".  The returned code is : " + process.exitValue() + " Detailed error is : " + error.toString());
        final String errorMessage = this.removeUsageInErrorMessage(error.toString());
        throw new IOException(Messages.getMessage("CopyToPDS_ERROR", source, this.file.getAbsolutePath(), errorMessage));
    }
    
    private String getSource() throws IOException {
        if (this.ddName != null) {
            return Utils.formatDDNameForZFileOperation(this.ddName);
        }
        if (this.volser == null) {
            return Utils.formatDatasetNameForZFileOperation(Utils.getFullyQualifiedDsn(this.dataset, this.member));
        }
        if (this.copyMode == DBBConstants.CopyMode.LOAD) {
            throw new IOException(Messages.getMessage("CopytoHFS_UNSUPPORTED_VOLSER"));
        }
        this.dummyDD = new DDStatement().dsn(Utils.getFullyQualifiedDsn(this.dataset, this.member)).name(ZFile.allocDummyDDName()).options("vol(" + this.volser + ") shr reuse msg(1)");
        try {
            DDProcessFactory.getDDProcess().alloc(this.dummyDD);
        }
        catch (BuildException e) {
            throw new IOException(e);
        }
        return Utils.formatDDNameForZFileOperation(this.dummyDD.getName());
    }
    
    private String getSourceForReport() {
        if (this.ddName != null) {
            return this.ddName;
        }
        return Utils.getFullyQualifiedDsn(this.dataset, this.member);
    }
    
    public File getFile() {
        return this.file;
    }
    
    public void setFile(final File file) {
        this.file = file;
    }
    
    public String getReadOptions() {
        return this.readOptions;
    }
    
    public void setReadOptions(final String options) {
        this.readOptions = options;
    }
    
    public boolean isAppend() {
        return this.append;
    }
    
    public void setAppend(final boolean append) {
        this.append = append;
    }
    
    public void setHFSEncoding(final String encoding) {
        this.hfsEncoding = encoding;
    }
    
    public void setPDSEncoding(final String encoding) {
        this.pdsEncoding = encoding;
    }
    
    public String getHFSEncoding() {
        return this.hfsEncoding;
    }
    
    public String getPDSEncoding() {
        return this.pdsEncoding;
    }
    
    public String getMember() {
        return this.member;
    }
    
    public void setMember(final String member) {
        this.member = member;
    }
    
    public String getDataset() {
        return this.dataset;
    }
    
    public void setDataset(final String dataset) {
        this.dataset = dataset;
    }
    
    public String getDdName() {
        return this.ddName;
    }
    
    public void setDdName(final String ddName) {
        this.ddName = ddName;
    }
    
    public CopyToHFS dataset(final String dataset) {
        this.setDataset(dataset);
        return this;
    }
    
    public CopyToHFS member(final String member) {
        this.setMember(member);
        return this;
    }
    
    public CopyToHFS ddName(final String ddName) {
        this.setDdName(ddName);
        return this;
    }
    
    public CopyToHFS file(final File file) {
        this.setFile(file);
        return this;
    }
    
    public CopyToHFS readOptions(final String options) {
        this.setReadOptions(options);
        return this;
    }
    
    public CopyToHFS append(final boolean append) {
        this.setAppend(append);
        return this;
    }
    
    public CopyToHFS hfsEncoding(final String encoding) {
        this.setHFSEncoding(encoding);
        return this;
    }
    
    public CopyToHFS pdsEncoding(final String encoding) {
        this.setPDSEncoding(encoding);
        return this;
    }
    
    public DBBConstants.CopyMode getCopyMode() {
        return this.copyMode;
    }
    
    public void setCopyMode(final DBBConstants.CopyMode copyMode) {
        this.copyMode = copyMode;
    }
    
    public CopyToHFS copyMode(final DBBConstants.CopyMode copyMode) {
        this.setCopyMode(copyMode);
        return this;
    }
    
    private String removeUsageInErrorMessage(final String errorMessage) {
        if (errorMessage != null) {
            final int index = errorMessage.indexOf("Usage:");
            if (index > 0) {
                return errorMessage.substring(0, index);
            }
        }
        return errorMessage;
    }
    
    public String getVolser() {
        return this.volser;
    }
    
    public void setVolser(final String volser) {
        this.volser = volser;
    }
    
    public CopyToHFS volser(final String volser) {
        this.setVolser(volser);
        return this;
    }
    
    public boolean isConvertControlCharacters() {
        return this.convertControlCharacters;
    }
    
    public void setConvertControlCharacters(final boolean convertControlCharacters) {
        this.convertControlCharacters = convertControlCharacters;
    }
    
    public CopyToHFS convertControlCharacters(final boolean convertControlCharacters) {
        this.convertControlCharacters = convertControlCharacters;
        return this;
    }
    
    private int copyAsASAText() throws IOException {
        final String tempReadOptions = (this.readOptions == null) ? "rb,noseek" : ("rb,noseek," + this.readOptions);
        if (this.file.getParentFile() != null) {
            this.file.getParentFile().mkdirs();
        }
        InputStream is = null;
        ZFile zFile = null;
        try {
            final String source = this.getSource();
            if (this.pdsEncoding == null || this.pdsEncoding.isEmpty()) {
                this.pdsEncoding = Utils.retrieveEncoding();
            }
            if (this.hfsEncoding == null || this.hfsEncoding.isEmpty()) {
                this.hfsEncoding = this.pdsEncoding;
            }
            CopyToHFS.logger.debug("Copying " + source + " (encoding=" + this.pdsEncoding + ") to '" + this.file.getAbsolutePath() + "' (encoding=" + this.hfsEncoding + ")");
            try {
                zFile = new ZFile(source, tempReadOptions);
            }
            catch (ZFileException e) {
                throw new FileNotFoundException(source);
            }
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            is = zFile.getInputStream();
            final byte[] buffer = new byte[zFile.getLrecl()];
            int numBytesRead = -1;
            while ((numBytesRead = is.read(buffer)) >= 0) {
                baos.write(buffer, 0, numBytesRead);
                baos.write(CopyToHFS.NL);
            }
            baos.close();
            final InputStream ins = new ByteArrayInputStream(baos.toByteArray());
            Utils.saveContentToFile(ins, this.file, this.pdsEncoding, this.hfsEncoding, this.append);
            return 0;
        }
        finally {
            if (is != null) {
                is.close();
            }
            if (zFile != null) {
                zFile.close();
            }
        }
    }
    
    static {
        CopyToHFS.logger = LoggerFactory.getLogger((Class)CopyToHFS.class);
        NL = System.getProperty("line.separator").getBytes();
    }
}
