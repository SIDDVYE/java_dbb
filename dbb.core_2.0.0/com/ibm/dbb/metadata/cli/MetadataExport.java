// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.cli;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.Paths;
import com.ibm.dbb.build.internal.Messages;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.CopyOption;
import java.util.zip.Checksum;
import java.util.zip.CheckedInputStream;
import java.util.zip.Adler32;
import com.ibm.dbb.metadata.Attachment;
import java.util.Iterator;
import java.util.List;
import com.ibm.dbb.dependency.LogicalFile;
import com.ibm.dbb.build.internal.Utils;
import java.io.File;
import java.nio.charset.Charset;
import com.ibm.dbb.metadata.MetadataStore;
import com.ibm.dbb.metadata.BuildResult;
import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.metadata.Collection;

class MetadataExport
{
    protected static void exportCollection(final Collection collection, final String path, final boolean tar) throws BuildException, IOException {
        exportCollection(collection, path, tar, null);
    }
    
    protected static void exportBuildResult(final BuildResult buildResult, final String path, final boolean tar) throws BuildException, IOException {
        exportBuildResult(buildResult, path, tar, null);
    }
    
    protected static void exportBuildGroup(final String groupName, final MetadataStore store, final String path, final boolean tar) throws BuildException, IOException {
        exportBuildGroup(groupName, store, path, tar, null);
    }
    
    protected static void exportCollection(final Collection collection, final String path, final boolean tar, String codePage) throws BuildException, IOException {
        if (codePage == null) {
            codePage = Charset.defaultCharset().name();
        }
        final String dirPath = getDirPath(path, tar);
        String workPath = formatPath(dirPath) + "collections/";
        workPath = workPath + createSafeFileName(collection.getName()) + "/";
        final String collectionData = MetadataPrinter.formatCollection(collection);
        File file = new File(workPath + "collection.txt");
        Utils.createFile(file, collectionData, codePage);
        final List<LogicalFile> logicalFiles = collection.getLogicalFiles();
        for (final LogicalFile logicalFile : logicalFiles) {
            final String logicalFileData = MetadataPrinter.formatLogicalFile(logicalFile, collection);
            file = new File(workPath + "logicalFiles/" + createSafeFilePath(logicalFile.getFile()) + ".txt");
            Utils.createFile(file, logicalFileData, codePage);
        }
        if (tar) {
            createTar("collections", path, dirPath, "collections");
        }
        System.out.println("Successfully Exported Collection " + collection.getName() + " to path " + path);
    }
    
    protected static void exportBuildResult(final BuildResult buildResult, final String path, final boolean tar, String codePage) throws BuildException, IOException {
        if (codePage == null) {
            codePage = Charset.defaultCharset().name();
        }
        final String dirPath = getDirPath(path, tar);
        String workPath = formatPath(dirPath) + "build-results/";
        final String buildResultLabel = buildResult.getLabel();
        workPath = workPath + createSafeFileName(buildResult.getGroup()) + "/" + createSafeFileName(buildResultLabel) + "/";
        final String buildResultData = MetadataPrinter.formatBuildResult(buildResult.getGroup(), buildResult);
        final File file = new File(workPath + "build-result.txt");
        Utils.createFile(file, buildResultData, codePage);
        final List<Attachment> attachments = buildResult.getAttachments();
        for (final Attachment attachment : attachments) {
            final File aFile = new File(workPath + "/attachments/" + createSafeFilePath(attachment.getName()));
            if (aFile.getParentFile() != null) {
                aFile.getParentFile().mkdirs();
            }
            final CheckedInputStream cis = new CheckedInputStream(attachment.getContent(), new Adler32());
            Files.copy(cis, aFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            if (cis != null) {
                cis.close();
            }
            if (cis.getChecksum().getValue() != attachment.getChecksum()) {
                System.out.println("WARNING: Group: " + buildResult.getGroup() + " Label: " + buildResult.getLabel() + " attachment: " + attachment.getName() + " was not copied correctly. Expected checksum: " + attachment.getChecksum() + " but was: " + cis.getChecksum().getValue());
            }
        }
        if (tar) {
            createTar("build-results", path, dirPath, "build-results");
        }
        System.out.println("Successfully Exported Build Result " + buildResultLabel + " to path " + path);
    }
    
    protected static void exportBuildGroup(final String groupName, final MetadataStore store, final String path, final boolean tar, String codePage) throws BuildException, IOException {
        if (codePage == null) {
            codePage = Charset.defaultCharset().name();
        }
        final String dirPath = getDirPath(path, tar);
        String workPath = formatPath(dirPath) + "build-results/";
        workPath = workPath + createSafeFileName(groupName) + "/";
        final List<BuildResult> buildResultList = store.getBuildResults(groupName);
        final String buildGroupData = MetadataPrinter.formatBuildGroup(groupName, buildResultList);
        final File file = new File(workPath + "build-group.txt");
        Utils.createFile(file, buildGroupData, codePage);
        for (final BuildResult buildResult : buildResultList) {
            exportBuildResult(buildResult, dirPath, false, codePage);
        }
        if (tar) {
            createTar("build-group", path, dirPath, "build-results");
        }
        System.out.println("Successfully Exported Build Group " + groupName + " to path " + path);
    }
    
    private static void createTar(final String fileName, String finalPath, String dirPath, final String dirName) throws IOException {
        finalPath = formatPath(finalPath);
        dirPath = formatPath(dirPath);
        final StringBuilder out = new StringBuilder();
        final String command = "tar -cf " + finalPath + fileName + ".tar " + dirPath + dirName;
        final Process process = Utils.runInProcess(command, out);
        if (process.exitValue() == 0) {
            System.out.println("Successfully created tar archive at " + finalPath + fileName + ".tar ");
            com.ibm.dbb.metadata.filesystem.Utils.deleteDirectory(new File(dirPath));
            return;
        }
        throw new IOException(Messages.getMessage("MetadataStore_CLI_ARCHIVE_CREATION_FAILED", finalPath, process.exitValue()));
    }
    
    private static String formatPath(String path) {
        if (!path.endsWith("/")) {
            path += "/";
        }
        return path;
    }
    
    private static String getDirPath(final String path, final boolean tar) throws IOException {
        if (tar) {
            return Files.createTempDirectory(Paths.get(path, new String[0]), "temp", (FileAttribute<?>[])new FileAttribute[0]).toString();
        }
        return path;
    }
    
    protected static String createSafeFilePath(final String input) {
        return input.replaceAll("[^a-zA-Z0-9_.\\/-]", "");
    }
    
    protected static String createSafeFileName(final String input) {
        return input.replaceAll("[^a-zA-Z0-9_.-]", "");
    }
}
