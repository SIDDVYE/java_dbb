// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.cli;

import com.ibm.dbb.build.VersionInfo;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.metadata.Attachment;
import com.ibm.dbb.dependency.LogicalDependency;
import java.util.Iterator;
import com.ibm.dbb.metadata.BuildResult;
import com.ibm.dbb.dependency.LogicalFile;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.metadata.Collection;
import java.util.List;

public class MetadataPrinter
{
    protected static final String[] STATE_ARRAY;
    protected static final String[] STATUS_ARRAY;
    
    public static void printCollections(final List<Collection> collections) throws BuildException {
        System.out.println(formatCollections(collections));
    }
    
    public static void printCollection(final Collection collection) throws BuildException {
        System.out.println(formatCollection(collection));
    }
    
    public static void printLogicalFiles(final List<LogicalFile> logicalFiles) throws BuildException {
        System.out.println(formatLogicalFiles(logicalFiles));
    }
    
    public static void printLogicalFile(final LogicalFile logicalFile, final Collection collection) throws BuildException {
        System.out.println(formatLogicalFile(logicalFile, collection));
    }
    
    public static void printBuildGroups(final List<String> buildGroups) throws BuildException {
        System.out.println(formatBuildGroups(buildGroups));
    }
    
    public static void printBuildGroup(final String buildGroupName, final List<BuildResult> buildResults) throws BuildException {
        System.out.println(formatBuildGroup(buildGroupName, buildResults));
    }
    
    public static void printBuildResults(final String buildGroupName, final List<BuildResult> buildResults) throws BuildException {
        System.out.println(formatBuildResults(buildGroupName, buildResults));
    }
    
    public static void printBuildResult(final String buildGroupName, final BuildResult buildResult) throws BuildException {
        System.out.println(formatBuildResult(buildGroupName, buildResult));
    }
    
    protected static String formatCollections(final List<Collection> collections) throws BuildException {
        checkIfObjectIsNull(collections);
        String output = getHeader() + "COLLECTIONS\n";
        if (collections.size() == 0) {
            output += "\nNo collections found.";
        }
        else {
            for (final Collection collection : collections) {
                output = output + "\n" + collection.getName();
            }
        }
        return output;
    }
    
    public static String formatCollection(final Collection collection) throws BuildException {
        checkIfObjectIsNull(collection);
        final List<LogicalFile> logicalFiles = collection.getLogicalFiles();
        final String output = getHeader() + "COLLECTION\n\nDETAILS:\n\nname: " + collection.getName() + "\ncreated: " + collection.getCreated() + "\ncreatedBy: " + collection.getCreatedBy() + "\nlastUpdated: " + collection.getLastUpdated() + "\nlastUpdatedBy: " + collection.getLastUpdatedBy() + "\npermissions: " + Integer.toOctalString(collection.getPermission()) + "\n\nLOGICAL FILES: " + logicalFiles.size() + "\n\n" + formatLogicalFilesChart(logicalFiles);
        return output;
    }
    
    protected static String formatLogicalFiles(final List<LogicalFile> logicalFiles) throws BuildException {
        checkIfObjectIsNull(logicalFiles);
        final String output = getHeader() + "LOGICAL FILES\n\n" + formatLogicalFilesChart(logicalFiles);
        return output;
    }
    
    public static String formatLogicalFile(final LogicalFile logicalFile, final Collection collection) throws BuildException {
        checkIfObjectIsNull(logicalFile);
        checkIfObjectIsNull(collection);
        final List<LogicalDependency> dependencies = logicalFile.getLogicalDependencies();
        String output = getHeader() + "LOGICAL FILE\n\nDETAILS:\n\ncollection: " + collection.getName() + "\nlname: " + logicalFile.getLname() + "\nfile: " + logicalFile.getFile() + "\nlanguage: " + logicalFile.getLanguage() + "\ncics: " + logicalFile.isCICS() + "\nsql: " + logicalFile.isSQL() + "\ndli: " + logicalFile.isDLI() + "\nmq: " + logicalFile.isMQ() + "\n\n\nLOGICAL DEPENDENCIES: " + dependencies.size() + "\n\n";
        int columnWidthLname = 12;
        int columnWidthLibrary = 12;
        for (final LogicalDependency dependency : dependencies) {
            final int lengthLname = dependency.getLname().length();
            if (lengthLname + 3 > columnWidthLname) {
                columnWidthLname = lengthLname + 3;
            }
            final int lengthLibrary = dependency.getLibrary().length();
            if (lengthLibrary + 3 > columnWidthLibrary) {
                columnWidthLibrary = lengthLibrary + 3;
            }
        }
        output += String.format("%1$-" + columnWidthLname + "s%2$-" + columnWidthLibrary + "scategory\n%3$-" + columnWidthLname + "s%4$-" + columnWidthLibrary + "s--------", "lname", "library", "--------", "--------");
        for (final LogicalDependency dependency : dependencies) {
            output += String.format("\n%1$-" + columnWidthLname + "s%2$-" + columnWidthLibrary + "s%3$s", dependency.getLname(), dependency.getLibrary(), dependency.getCategory());
        }
        return output;
    }
    
    protected static String formatBuildGroups(final List<String> buildGroups) throws BuildException {
        checkIfObjectIsNull(buildGroups);
        String output = getHeader() + "BUILD GROUPS\n\n";
        if (buildGroups.size() == 0) {
            output += "\nNo build groups found.";
        }
        else {
            output += String.join("\n", buildGroups);
        }
        return output;
    }
    
    public static String formatBuildGroup(final String buildGroupName, final List<BuildResult> buildResults) throws BuildException {
        checkIfObjectIsNull(buildResults);
        final int numOfBuildResults = buildResults.size();
        final String output = getHeader() + "BUILD GROUP\n\nname: " + buildGroupName + "\n\nBUILD RESULTS: " + numOfBuildResults + "\n\n" + formatBuildResultsChart(buildResults);
        return output;
    }
    
    protected static String formatBuildResults(final String buildGroupName, final List<BuildResult> buildResults) throws BuildException {
        checkIfObjectIsNull(buildResults);
        final String output = getHeader() + "BUILD RESULTS\n\ngroup: " + buildGroupName + "\n\n" + formatBuildResultsChart(buildResults);
        return output;
    }
    
    public static String formatBuildResult(final String buildGroupName, final BuildResult buildResult) throws BuildException {
        checkIfObjectIsNull(buildResult);
        String output = getHeader() + "BUILD RESULT\n\nDETAILS:\n\nlabel: " + buildResult.getLabel() + "\ngroup: " + buildGroupName + "\nstate: " + processState(buildResult.getState()) + "\nstatus: " + processStatus(buildResult.getStatus()) + "\ncreated: " + buildResult.getCreated() + "\ncreatedBy: " + buildResult.getCreatedBy() + "\nlastUpdated: " + buildResult.getLastUpdated() + "\nlastUpdatedBy: " + buildResult.getLastUpdatedBy() + "\npermissions: " + Integer.toOctalString(buildResult.getPermission()) + "\n\n\nPROPERTIES:\n";
        int columnWidth = 12;
        final List<String> propertyNames = buildResult.getPropertyNames();
        if (propertyNames.size() == 0) {
            output += "No properties found.";
        }
        else {
            for (final String propertyName : propertyNames) {
                final int propertyLength = propertyName.length();
                if (propertyLength + 3 > columnWidth) {
                    columnWidth = propertyLength + 3;
                }
            }
            for (final String propertyName : propertyNames) {
                output += String.format("\n%1$-" + columnWidth + "s%2$s", propertyName, buildResult.getProperty(propertyName));
            }
        }
        output += "\n\n\nATTACHMENTS:\n";
        final List<Attachment> attachments = buildResult.getAttachments();
        if (buildResult.getBuildReport() != null) {
            attachments.add(buildResult.getBuildReport());
        }
        if (buildResult.getBuildReportData() != null) {
            attachments.add(buildResult.getBuildReportData());
        }
        if (attachments.size() == 0) {
            output += "No attachments found.";
        }
        else {
            for (final Attachment attachment : attachments) {
                output = output + "\n" + attachment.getName();
            }
        }
        return output;
    }
    
    protected static String formatLogicalFilesChart(final List<LogicalFile> logicalFiles) throws BuildException {
        checkIfObjectIsNull(logicalFiles);
        if (logicalFiles.size() == 0) {
            return "No logical files found.";
        }
        int columnWidth = 12;
        for (final LogicalFile logicalFile : logicalFiles) {
            final int length = logicalFile.getLname().length();
            if (length + 3 > columnWidth) {
                columnWidth = length + 3;
            }
        }
        String output = String.format("%1$-" + columnWidth + "sfile\n%2$-" + columnWidth + "s----------", "lname", "--------");
        for (final LogicalFile logicalFile2 : logicalFiles) {
            output += String.format("\n%1$-" + columnWidth + "s%2$s", logicalFile2.getLname(), logicalFile2.getFile());
        }
        return output;
    }
    
    protected static String formatBuildResultsChart(final List<BuildResult> buildResults) throws BuildException {
        checkIfObjectIsNull(buildResults);
        if (buildResults.size() == 0) {
            return "No build results found.";
        }
        int columnWidth = 37;
        for (final BuildResult buildResult : buildResults) {
            final int lengthLname = buildResult.getLabel().length();
            if (lengthLname + 3 > columnWidth) {
                columnWidth = lengthLname + 3;
            }
        }
        String output = String.format("%1$-" + columnWidth + "sstate           status\n%2$-" + columnWidth + "s-------------   ---------", "label", "---------------------------");
        for (final BuildResult buildResult2 : buildResults) {
            final int state = buildResult2.getState();
            final int status = buildResult2.getStatus();
            output += String.format("\n%1$-" + columnWidth + "s%2$-16s%3$s", buildResult2.getLabel(), processState(state), processStatus(status));
        }
        return output;
    }
    
    protected static String processState(final int state) {
        String stateLabel = String.valueOf(state);
        if (state >= 0 && state < MetadataPrinter.STATE_ARRAY.length) {
            stateLabel = String.format(" '%1$s'", MetadataPrinter.STATE_ARRAY[state]);
        }
        return state + stateLabel;
    }
    
    protected static String processStatus(final int status) {
        String statusLabel = String.valueOf(status);
        if (status >= 0 && status < MetadataPrinter.STATUS_ARRAY.length) {
            statusLabel += String.format(" '%1$s'", MetadataPrinter.STATUS_ARRAY[status]);
        }
        return statusLabel;
    }
    
    protected static void checkIfObjectIsNull(final Object object) throws BuildException {
        if (object == null) {
            throw new BuildException(Messages.getMessage("MetadataStore_CLI_PRINTER_RECEIVED_NULL"));
        }
    }
    
    protected static String getHeader() {
        final VersionInfo versionInfo = VersionInfo.getInstance();
        return "IBM Dependency Based Build " + versionInfo.getVersion() + "\n\n";
    }
    
    static {
        STATE_ARRAY = new String[] { "NEW", "PROCESSING", "COMPLETE", "ABANDONED" };
        STATUS_ARRAY = new String[] { "CLEAN", "ERROR", "WARNING" };
    }
}
