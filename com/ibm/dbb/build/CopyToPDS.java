// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import org.slf4j.LoggerFactory;
import java.io.OutputStream;
import java.io.BufferedWriter;
import com.ibm.jzos.FileFactory;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.ibm.dbb.build.internal.BpxwdynCommandGenerator;
import com.ibm.jzos.ZFile;
import java.io.FileInputStream;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.report.records.CopyToPDSRecord;
import java.io.InputStream;
import java.util.Iterator;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import com.ibm.dbb.build.internal.Utils;
import com.ibm.dbb.build.internal.TarArchiveHandler;
import com.ibm.dbb.build.internal.Messages;
import java.io.IOException;
import com.ibm.dbb.dependency.PhysicalDependency;
import java.util.List;
import java.io.File;
import org.slf4j.Logger;

public class CopyToPDS implements IExecute
{
    private static Logger logger;
    private static final String DEFAULT_WRITE_BINARY_OPTIONS = "wb,noseek";
    private File file;
    private List<PhysicalDependency> dependencies;
    private String dataset;
    private String member;
    private String archive;
    private String archivedFile;
    private String hfsEncoding;
    private String pdsEncoding;
    private DBBConstants.CopyMode copyMode;
    private String volser;
    private boolean output;
    private String deployType;
    private String key;
    
    public CopyToPDS() {
        this.copyMode = DBBConstants.CopyMode.TEXT;
        this.output = false;
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
    
    public void copy() throws IOException, BuildException {
        this.doCopy();
    }
    
    private int doCopy() throws IOException, BuildException {
        if (this.volser != null && this.copyMode == DBBConstants.CopyMode.LOAD) {
            throw new IOException(Messages.getMessage("CopytoHFS_UNSUPPORTED_VOLSER"));
        }
        int rc = 0;
        if (this.dependencies != null) {
            if (this.member != null) {
                throw new IllegalArgumentException(Messages.getMessage("UNEXPECTED_PARAMETER", "member"));
            }
            if (this.file != null) {
                throw new IllegalArgumentException(Messages.getMessage("UNEXPECTED_PARAMETER", "file"));
            }
            if (this.dataset == null || this.dataset.isEmpty()) {
                throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", this.dataset));
            }
            CopyToPDS.logger.debug("Resolving " + this.dependencies.size() + "' dependencies to copy to data set " + this.dataset);
            for (final PhysicalDependency dependency : this.dependencies) {
                if (dependency.isResolved()) {
                    if (dependency.getArchive() != null && !dependency.getArchive().isEmpty()) {
                        CopyToPDS.logger.debug("Searching for " + dependency.getFile() + " in " + dependency.getArchive());
                        final TarArchiveHandler tarArchiveHandler = new TarArchiveHandler(dependency.getArchive(), dependency.getSourceDir());
                        final InputStream fileContents = tarArchiveHandler.getFileContents(dependency.getFile());
                        final String member = createMemberName(dependency.getFile());
                        this.copyInputStream(fileContents, this.dataset, member);
                    }
                    else {
                        final File file = Utils.createFile(dependency.getFile(), dependency.getSourceDir());
                        final String member2 = createMemberName(file.getName());
                        this.copyFile(file, this.dataset, member2);
                        CopyToPDS.logger.debug("Successfully copying '" + file.getAbsolutePath() + "' to " + Utils.getFullyQualifiedDsn(this.dataset, member2));
                    }
                }
                else {
                    CopyToPDS.logger.debug("Dependency '" + dependency.getLname() + "' was not resolved and will not be copied.");
                }
            }
        }
        else if (this.archive != null && !this.archive.isEmpty()) {
            final TarArchiveHandler tarArchiveHandler2 = new TarArchiveHandler(this.archive, null);
            if (this.archivedFile != null && !this.archivedFile.isEmpty()) {
                final String tempMember = (this.member == null || this.member.isEmpty()) ? createMemberName(this.archivedFile) : this.member;
                rc = this.copyInputStream(tarArchiveHandler2.getFileContents(this.archivedFile), this.dataset, tempMember);
            }
            else {
                final List<String> fileNames = tarArchiveHandler2.getFileNames();
                for (final String filename : fileNames) {
                    final int tar_rc = this.copyInputStream(tarArchiveHandler2.getFileContents(filename), this.dataset, createMemberName(filename));
                    if (tar_rc < rc) {
                        rc = tar_rc;
                    }
                }
            }
        }
        else {
            if (!this.file.exists()) {
                throw new FileNotFoundException(this.file.getAbsolutePath());
            }
            if (this.file.getName().endsWith("tar") || this.file.getName().endsWith("tar.gz")) {
                final TarArchiveHandler tarArchiveHandler2 = new TarArchiveHandler(this.file.getAbsolutePath(), null);
                final List<String> fileNames = tarArchiveHandler2.getFileNames();
                for (final String filename : fileNames) {
                    final int tar_rc = this.copyInputStream(tarArchiveHandler2.getFileContents(filename), this.dataset, createMemberName(filename));
                    if (tar_rc < rc) {
                        rc = tar_rc;
                    }
                }
            }
            else if (this.file.isFile()) {
                if (this.dataset == null || this.dataset.isEmpty()) {
                    throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", this.dataset));
                }
                final String tempMember2 = (this.member == null || this.member.isEmpty()) ? createMemberName(this.file.getName()) : this.member;
                rc = this.copyFile(this.file, this.dataset, tempMember2);
            }
            else if (this.file.isDirectory()) {
                if (this.member != null) {
                    throw new IllegalArgumentException(Messages.getMessage("UNEXPECTED_PARAMETER", "member"));
                }
                int fileCopyRc = 0;
                final File[] files = this.file.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(final File file) {
                        return file.isFile();
                    }
                });
                CopyToPDS.logger.debug("Found " + files.length + " files to copy to data set '" + this.dataset + "'");
                for (final File f : files) {
                    final String m = createMemberName(f.getName());
                    fileCopyRc = this.copyFile(f, this.dataset, m);
                    if (fileCopyRc > rc) {
                        rc = fileCopyRc;
                    }
                    CopyToPDS.logger.debug("Successfully copying '" + f.getAbsolutePath() + "' to " + Utils.getFullyQualifiedDsn(this.dataset, m));
                }
            }
        }
        return rc;
    }
    
    private int copyFile(final File file, final String dsn, final String member) throws IOException {
        int rc = 0;
        final String fullyQualifiedDsn = Utils.getFullyQualifiedDsn(dsn, member);
        if (Utils.isBuildReportOnly()) {
            this.createBuildCopyFileRecord(file, fullyQualifiedDsn);
            return rc;
        }
        try {
            if (this.copyMode == DBBConstants.CopyMode.BINARY) {
                rc = this.copyAsBinary(file, fullyQualifiedDsn);
            }
            else if (this.copyMode == DBBConstants.CopyMode.LOAD) {
                rc = this.copyAsLoad(file, fullyQualifiedDsn);
            }
            else {
                rc = this.copyAsText(file, fullyQualifiedDsn);
            }
            return rc;
        }
        finally {
            this.createBuildCopyFileRecord(file, fullyQualifiedDsn);
        }
    }
    
    private void createBuildCopyFileRecord(final File file, final String fullyQualifiedDsn) {
        final CopyToPDSRecord record = new CopyToPDSRecord();
        record.setSource(file);
        record.setDestination(fullyQualifiedDsn);
        record.setMode(this.copyMode);
        if (this.output) {
            if (this.key == null) {
                this.key = file.toString();
            }
            record.setOutput(this.output);
            record.setDeployType(this.deployType);
            record.setFile(this.key);
        }
        BuildReportFactory.getBuildReport().addRecord(record);
    }
    
    private int copyInputStream(final InputStream inputStream, final String dsn, final String member) throws IOException, BuildException {
        int rc = 0;
        final String fullyQualifiedDsn = Utils.getFullyQualifiedDsn(dsn, member);
        if (Utils.isBuildReportOnly()) {
            this.createBuildCopyFileRecord(this.file, fullyQualifiedDsn);
            return rc;
        }
        try {
            if (this.copyMode == DBBConstants.CopyMode.BINARY) {
                rc = this.copyAsBinary(inputStream, fullyQualifiedDsn);
            }
            else {
                if (this.copyMode != DBBConstants.CopyMode.TEXT) {
                    throw new BuildException(Messages.getMessage("INVALID_COPY_MODE", "LOAD"));
                }
                rc = this.copyAsText(inputStream, fullyQualifiedDsn);
            }
            return rc;
        }
        finally {
            this.createBuildCopyStreamRecord(fullyQualifiedDsn);
        }
    }
    
    private void createBuildCopyStreamRecord(final String fullyQualifiedDsn) {
        final CopyToPDSRecord record = new CopyToPDSRecord();
        record.setDestination(fullyQualifiedDsn);
        record.setMode(this.copyMode);
        BuildReportFactory.getBuildReport().addRecord(record);
    }
    
    private int copyAsText(final File file, final String fullyQualifiedDsn) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            return this.copyAsText(fis, fullyQualifiedDsn);
        }
        finally {
            if (fis != null) {
                fis.close();
            }
        }
    }
    
    private int copyAsBinary(final File file, final String fullyQualifiedDsn) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            return this.copyAsBinary(fis, fullyQualifiedDsn);
        }
        finally {
            if (fis != null) {
                fis.close();
            }
        }
    }
    
    private int copyAsLoad(final File file, final String fullyQualifiedDsn) throws IOException {
        final String source = file.getAbsolutePath();
        final String target = Utils.formatDatasetNameForZFileOperation(fullyQualifiedDsn);
        CopyToPDS.logger.debug("Copying as load, " + source + " to " + target);
        final StringBuilder output = new StringBuilder();
        final Process process = Utils.runInProcess("cp -X -I " + source + " " + target, output);
        if (process.exitValue() == 0) {
            CopyToPDS.logger.debug("Successfully copying " + source + " to " + target);
            return process.exitValue();
        }
        CopyToPDS.logger.debug("Failed to copy " + source + " to " + target + " RC is " + process.exitValue() + " and detailed output is " + output.toString());
        final String errorMessage = this.removeUsageInErrorMessage(output.toString());
        throw new IOException(Messages.getMessage("CopyToPDS_ERROR", source, fullyQualifiedDsn, errorMessage));
    }
    
    private int copyAsText(final InputStream inputStream, final String fullyQualifiedDsn) throws IOException {
        if (this.hfsEncoding == null || this.hfsEncoding.isEmpty()) {
            if (this.archivedFile != null && !this.archivedFile.isEmpty()) {
                this.hfsEncoding = Utils.retrieveHFSEncoding(new File(this.archive));
            }
            else {
                this.hfsEncoding = Utils.retrieveHFSEncoding(this.file);
            }
        }
        if (this.pdsEncoding == null || this.pdsEncoding.isEmpty()) {
            this.pdsEncoding = this.hfsEncoding;
        }
        CopyToPDS.logger.debug("Copying as text" + ((this.file == null) ? "" : (", '" + this.file.getAbsolutePath() + "',")) + " (encoding=" + this.hfsEncoding + ") to " + fullyQualifiedDsn + " (encoding=" + this.pdsEncoding + ")");
        DDStatement dummyDD = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            String options = "shr reuse msg(1)";
            if (this.volser != null) {
                options = options + " vol(" + this.volser + ")";
            }
            dummyDD = new DDStatement().dsn(fullyQualifiedDsn).name(ZFile.allocDummyDDName()).options(options);
            final String command = BpxwdynCommandGenerator.generateAllocCommand(dummyDD, null);
            CopyToPDS.logger.debug("Alloc Command: \"" + command + "\"");
            Utils.bpxwdyn(command);
            final String target = Utils.formatDDNameForZFileOperation(dummyDD.getName());
            br = new BufferedReader(new InputStreamReader(inputStream, this.hfsEncoding));
            bw = FileFactory.newBufferedWriter(target, this.pdsEncoding);
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            return 0;
        }
        catch (BuildException e) {
            throw new IOException(e);
        }
        finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
            if (dummyDD != null) {
                try {
                    Utils.bpxwdyn(BpxwdynCommandGenerator.generateFreeCommand(dummyDD.getName(), null));
                }
                catch (BuildException e2) {
                    throw new IOException(e2);
                }
            }
        }
    }
    
    private int copyAsBinary(final InputStream inputStream, final String fullyQualifiedDsn) throws IOException {
        if (this.pdsEncoding != null && !this.pdsEncoding.isEmpty()) {
            CopyToPDS.logger.debug("Ignore pdsEncoding as binary being specified");
        }
        if (this.hfsEncoding != null && !this.hfsEncoding.isEmpty()) {
            CopyToPDS.logger.debug("Ignore hfsEncoding as binary being specified");
        }
        CopyToPDS.logger.debug("Copying as binary, '" + this.file.getAbsolutePath() + "' (encoding=" + this.hfsEncoding + ") to " + fullyQualifiedDsn + " (encoding=" + this.pdsEncoding + ")");
        OutputStream os = null;
        DDStatement dummyDD = null;
        ZFile zOut = null;
        try {
            String options = "shr reuse msg(1)";
            if (this.volser != null) {
                options = options + " vol(" + this.volser + ")";
            }
            dummyDD = new DDStatement().dsn(fullyQualifiedDsn).name(ZFile.allocDummyDDName()).options(options);
            final String command = BpxwdynCommandGenerator.generateAllocCommand(dummyDD, null);
            CopyToPDS.logger.debug("Alloc Command: \"" + command + "\"");
            Utils.bpxwdyn(command);
            final String target = Utils.formatDDNameForZFileOperation(dummyDD.getName());
            zOut = new ZFile(target, "wb,noseek");
            os = zOut.getOutputStream();
            final byte[] buffer = new byte[zOut.getLrecl()];
            int nBytesRead = -1;
            while ((nBytesRead = inputStream.read(buffer)) >= 0) {
                os.write(buffer, 0, nBytesRead);
            }
            return 0;
        }
        catch (BuildException e) {
            throw new IOException(e);
        }
        finally {
            if (os != null) {
                os.close();
            }
            if (zOut != null) {
                zOut.close();
            }
            if (dummyDD != null) {
                try {
                    Utils.bpxwdyn(BpxwdynCommandGenerator.generateFreeCommand(dummyDD.getName(), null));
                }
                catch (BuildException e2) {
                    throw new IOException(e2);
                }
            }
        }
    }
    
    public static String createMemberName(final String filepath) {
        final File file = new File(filepath);
        String name = file.getName();
        final int idx = name.lastIndexOf(46);
        if (idx > -1) {
            name = name.substring(0, idx);
        }
        return name.toUpperCase();
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
    
    public File getFile() {
        return this.file;
    }
    
    public void setFile(final File file) {
        this.file = file;
    }
    
    public String getArchive() {
        return this.archive;
    }
    
    public void setArchive(final String archive) {
        this.archive = archive;
    }
    
    public CopyToPDS archive(final String archive) {
        this.setArchive(archive);
        return this;
    }
    
    public String getArchivedFile() {
        return this.archivedFile;
    }
    
    public void setArchivedFile(final String archivedFile) throws BuildException {
        if (this.archive == null || this.archive.isEmpty()) {
            throw new BuildException(Messages.getMessage("CopyToPDS_ARCHIVE_UNSET"));
        }
        this.archivedFile = archivedFile;
    }
    
    public CopyToPDS archivedFile(final String archivedFile) throws BuildException {
        this.setArchivedFile(archivedFile);
        return this;
    }
    
    public List<PhysicalDependency> getDependencies() {
        return this.dependencies;
    }
    
    public void setDependencies(final List<PhysicalDependency> dependencies) {
        this.dependencies = dependencies;
    }
    
    public String getDataset() {
        return this.dataset;
    }
    
    public void setDataset(final String dataset) {
        this.dataset = dataset;
    }
    
    public String getMember() {
        return this.member;
    }
    
    public void setMember(final String member) {
        this.member = member;
    }
    
    public CopyToPDS file(final File file) {
        this.setFile(file);
        return this;
    }
    
    public CopyToPDS dependencies(final List<PhysicalDependency> dependencies) {
        this.setDependencies(dependencies);
        return this;
    }
    
    public CopyToPDS dataset(final String dataset) {
        this.setDataset(dataset);
        return this;
    }
    
    public CopyToPDS member(final String member) {
        this.setMember(member);
        return this;
    }
    
    public CopyToPDS hfsEncoding(final String encoding) {
        this.setHFSEncoding(encoding);
        return this;
    }
    
    public CopyToPDS pdsEncoding(final String encoding) {
        this.setPDSEncoding(encoding);
        return this;
    }
    
    public DBBConstants.CopyMode getCopyMode() {
        return this.copyMode;
    }
    
    public void setCopyMode(final DBBConstants.CopyMode copyMode) {
        this.copyMode = copyMode;
    }
    
    public CopyToPDS copyMode(final DBBConstants.CopyMode copyMode) {
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
    
    public CopyToPDS volser(final String volser) {
        this.setVolser(volser);
        return this;
    }
    
    public String getDeployType() {
        return this.deployType;
    }
    
    public void setDeployType(final String deployType) {
        this.deployType = deployType;
    }
    
    public CopyToPDS deployType(final String deployType) {
        this.setDeployType(deployType);
        return this;
    }
    
    public String getKey() {
        return this.key;
    }
    
    public void setKey(final String key) {
        this.key = key;
    }
    
    public CopyToPDS key(final String key) {
        this.setKey(key);
        return this;
    }
    
    public boolean isOutput() {
        return this.output;
    }
    
    public void setOutput(final boolean output) {
        this.output = output;
    }
    
    public CopyToPDS output(final boolean output) {
        this.setOutput(output);
        return this;
    }
    
    static {
        CopyToPDS.logger = LoggerFactory.getLogger((Class)CopyToPDS.class);
    }
}
