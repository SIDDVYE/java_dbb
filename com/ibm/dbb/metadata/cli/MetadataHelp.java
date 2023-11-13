// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.cli;

import java.io.OutputStream;
import java.io.PrintWriter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.HelpFormatter;

class MetadataHelp
{
    private HelpFormatter helpFormatter;
    private MetadataCLIOptions metadataCLIOptions;
    private Option buildGroupOption;
    private Option collectionOption;
    private Option db2ConfigOption;
    private Option dependencyOption;
    private Option directoryOption;
    private Option encodingOption;
    private Option helpOption;
    private Option locationOption;
    private Option logicalNameOption;
    private Option orderByOption;
    private Option orderOption;
    private Option passwordFileOption;
    private Option passwordOption;
    private Option stateOption;
    private Option statusOption;
    private Option typeOption;
    private Option urlOption;
    private Option userOption;
    private Options configOptions;
    
    MetadataHelp() {
        this.helpFormatter = new HelpFormatter();
        this.metadataCLIOptions = new MetadataCLIOptions();
        this.buildGroupOption = this.metadataCLIOptions.getBuildGroupOption();
        this.collectionOption = this.metadataCLIOptions.getCollectionOption();
        this.db2ConfigOption = this.metadataCLIOptions.getDb2ConfigOption();
        this.dependencyOption = this.metadataCLIOptions.getDependencyOption();
        this.directoryOption = this.metadataCLIOptions.getDirectoryOption();
        this.encodingOption = this.metadataCLIOptions.getEncodingOption();
        this.helpOption = this.metadataCLIOptions.getHelpOption();
        this.locationOption = this.metadataCLIOptions.getLocationOption();
        this.logicalNameOption = this.metadataCLIOptions.getLogicalNameOption();
        this.orderByOption = this.metadataCLIOptions.getOrderByOption();
        this.orderOption = this.metadataCLIOptions.getOrderOption();
        this.passwordFileOption = this.metadataCLIOptions.getPasswordFileOption();
        this.passwordOption = this.metadataCLIOptions.getPasswordOption();
        this.stateOption = this.metadataCLIOptions.getStateOption();
        this.statusOption = this.metadataCLIOptions.getStatusOption();
        this.typeOption = this.metadataCLIOptions.getTypeOption();
        this.urlOption = this.metadataCLIOptions.getUrlOption();
        this.userOption = this.metadataCLIOptions.getUserOption();
        this.configOptions = new Options().addOption(this.typeOption).addOption(this.locationOption).addOption(this.userOption).addOption(this.passwordOption).addOption(this.passwordFileOption).addOption(this.urlOption).addOption(this.db2ConfigOption).addOption(this.helpOption);
    }
    
    protected void setConsoleWidth(final int width) {
        this.helpFormatter.setWidth(width);
    }
    
    protected void printHelp() {
        this.printHeader("DESCRIPTION");
        this.printWrap("Query a Metadata Store for information.\n");
        this.printWrap("For additional DBB CLI documentation, visit: https://www.ibm.com/docs/en/dbb/2.0.0?topic=CLI");
        this.printHeader("USAGE");
        this.printWrap("dbb <command> [argument] [options]");
        this.printWrap("Where <command> is one of the following:");
        this.printHeader("COMMANDS");
        this.printDescription("session [argument]", "Start and stop a CLI session used to set up configuration and authentication options for subsequent authentication options for subsequent commands. For more detailed usage, see 'dbb session --help'.");
        System.out.println();
        this.printDescription("collection [argument] [options]", "List, view, delete, and export collections. Shorthand: 'col'. For more detailed usage, see 'dbb collection --help'.");
        System.out.println();
        this.printDescription("logical-file [argument] [options]", "List, view, and find logical files in a collection. Shorthand: 'lfile'. For more detailed usage, 'see dbb logical-file --help'.");
        System.out.println();
        this.printDescription("build-group [argument] [options]", "List, view, delete, and export build groups. Shorthand 'group'. For more detailed usage, see 'dbb build-group --help'.");
        System.out.println();
        this.printDescription("build-result [argument] [options]", "List, view, delete, export, and find build results in a build group. Shorthand: 'result'. For more detailed usage, see 'dbb build-result --help'.");
        this.printConfigOptions();
    }
    
    protected void printSessionHelp() {
        this.printHeader("DESCRIPTION");
        this.printWrap("Start and stop a CLI session used to set up configuration and authentication options for subsequent commands.");
        this.printHeader("USAGE");
        this.printWrap("dbb session [argument]");
        this.printWrap("Where [argument] is one of the following:");
        this.printHeader("ARGUMENTS");
        this.printDescription("start", "Prompts for metadata store implementation options and generates an encrypted configuration file that is used by subsequent CLI commands eliminating the need to pass in the options on CLI commands while the session is active. Session will time out after desired timeout span has elapsed.");
        System.out.println();
        this.printDescription("stop", "Deletes the encrypted configuration file created earlier by the dbb start command.\n");
        System.out.println();
    }
    
    protected void printCollectionHelp() {
        this.printHeader("DESCRIPTION");
        this.printWrap("Query a Metadata Store collection.");
        this.printWrap("Shorthand: 'col'");
        this.printHeader("USAGE");
        this.printWrap("dbb collection [argument] [options]");
        this.printWrap("Where [argument] is one of the following:");
        this.printHeader("ARGUMENTS");
        this.printDescription("ls, list", "List the names of all the collections in the metadata store.");
        System.out.println();
        this.printDescription("vw, view <collectionName>", "Displays a collection.");
        System.out.println();
        this.printDescription("del, delete <collectionName>", "Deletes a collection from the metadata store.");
        System.out.println();
        this.printDescription("ex, export <collectionName> --directory <exportDirectory> --encoding <codePage>", "Exports a collection and all logical files to a sub-directory in the export directory. Users can optionally set the encoding of the text artifacts. Defaults to the default codepage of the z/OS Unix system.");
        this.printHeader("COMMAND OPTIONS");
        final Options comOptions = new Options();
        comOptions.addOption(this.directoryOption).addOption(this.encodingOption);
        final PrintWriter pw = new PrintWriter(System.out);
        this.helpFormatter.printOptions(pw, this.helpFormatter.getWidth(), comOptions, this.helpFormatter.getLeftPadding(), this.helpFormatter.getDescPadding());
        pw.flush();
        this.printConfigOptions();
    }
    
    protected void printLogicalFileHelp() {
        this.printHeader("DESCRIPTION");
        this.printWrap("Query a Metadata Store for logical files.");
        this.printWrap("Shorthand: 'lfile'");
        this.printHeader("USAGE");
        this.printWrap("dbb logical-file [argument] [options]");
        this.printWrap("Where [argument] is one of the following:");
        this.printHeader("ARGUMENTS");
        this.printDescription("ls, list --collection <collectionName>", "Lists all the logical files for a collection.");
        System.out.println();
        this.printDescription("vw, view <fileName> --collection <collectionName>", "Displays the logical file for the file.");
        System.out.println();
        this.printDescription("fi, find --collection <collectionName> --logical-name <logicalName>", "Searches the collection for all logical files that matches the given logical name.");
        System.out.println();
        this.printDescription("fi, find --collection <collectionName> --dependency <library>:<category>:<lname>", "Searches the collection for all logical files that has a dependency that matches the given dependency fields. Ex. SYSLIB, ::SQLCA");
        this.printHeader("COMMAND OPTIONS");
        final Options comOptions = new Options();
        comOptions.addOption(this.collectionOption).addOption(this.logicalNameOption).addOption(this.dependencyOption);
        final PrintWriter pw = new PrintWriter(System.out);
        this.helpFormatter.printOptions(pw, this.helpFormatter.getWidth(), comOptions, this.helpFormatter.getLeftPadding(), this.helpFormatter.getDescPadding());
        pw.flush();
        this.printConfigOptions();
    }
    
    protected void printBuildGroupHelp() {
        this.printHeader("DESCRIPTION");
        this.printWrap("Query a Metadata Store for build groups.");
        this.printWrap("Shorthand: 'group'");
        this.printHeader("USAGE");
        this.printWrap("dbb build-group [argument] [options]");
        this.printWrap("Where [argument] is one of the following:");
        this.printHeader("ARGUMENTS");
        this.printDescription("ls, list", "List all build groups in the metadata store.");
        System.out.println();
        this.printDescription("vw, view <groupName>", "Displays the objects of the build group.");
        System.out.println();
        this.printDescription("del, delete <groupName>", "Deletes a build group from the metadata store");
        System.out.println();
        this.printDescription("ex, export <groupName> --directory <exportDirectory> --encoding <codePage>", "Exports a build group and all build results to a sub-directory in the export directory. Users can optionally set the encoding of the text artifacts. Defaults to the default codepage of the z/OS Unix system.");
        this.printHeader("COMMAND OPTIONS");
        final Options comOptions = new Options();
        comOptions.addOption(this.directoryOption).addOption(this.encodingOption);
        final PrintWriter pw = new PrintWriter(System.out);
        this.helpFormatter.printOptions(pw, this.helpFormatter.getWidth(), comOptions, this.helpFormatter.getLeftPadding(), this.helpFormatter.getDescPadding());
        pw.flush();
        this.printConfigOptions();
    }
    
    protected void printBuildResultHelp() {
        this.printHeader("DESCRIPTION");
        this.printWrap("Query a Metadata Store for build results.");
        this.printWrap("Shorthand: 'result'");
        this.printHeader("USAGE");
        this.printWrap("dbb build-result [argument] [options]");
        this.printWrap("Where [argument] is one of the following:");
        this.printHeader("ARGUMENTS");
        this.printDescription("ls, list --build-group <groupName>", "List the labels of all the build results in a build group.");
        System.out.println();
        this.printDescription("vw, view <label> --build-group <groupName>", "Displays a build result.");
        System.out.println();
        this.printDescription("del, delete <label> --build-group <groupName>", "Deletes a build result.");
        System.out.println();
        this.printDescription("ex, export <label> --build-group <groupName> --directory <exportDirectory> --encoding <codePage>", "Exports a build result and all attachments to a sub-directory in the export directory. Users can optionally set the encoding of the text artifacts. Defaults to the default codepage of the z/OS Unix system.");
        System.out.println();
        this.printDescription("fi, find --build-group <groupName> --state <int> --status <int> --order-by <field> --order <direction>", "Searches for all build results in a build group that matches a given build state and/or build status. Results can optionally be ordered by a build result field.");
        System.out.println();
        this.printDescription("find-last --build-group <groupName> --state <int> --status <int>", "Searches for the last created build result in a build group based that matches state and status.");
        this.printHeader("COMMAND OPTIONS");
        final Options comOptions = new Options();
        comOptions.addOption(this.buildGroupOption).addOption(this.directoryOption).addOption(this.encodingOption).addOption(this.orderOption).addOption(this.orderByOption).addOption(this.stateOption).addOption(this.statusOption);
        final PrintWriter pw = new PrintWriter(System.out);
        this.helpFormatter.printOptions(pw, this.helpFormatter.getWidth(), comOptions, this.helpFormatter.getLeftPadding(), this.helpFormatter.getDescPadding());
        pw.flush();
        this.printConfigOptions();
    }
    
    private void printHeader(final String header) {
        String underline = " ";
        for (int i = 0; i < header.length(); ++i) {
            underline += "-";
        }
        System.out.print("\n " + header + "\n" + underline + "\n");
    }
    
    private void printWrap(final String string) {
        final int width = this.helpFormatter.getWidth();
        final String[] wordList = string.split("\\s");
        int len = width;
        for (final String word : wordList) {
            final int add = word.length() + 1;
            if (add <= len) {
                len -= add;
                System.out.print(" " + word);
            }
            else {
                len = width - add;
                System.out.print("\n " + word);
            }
        }
        System.out.print("\n");
    }
    
    private void printDescription(final String option, final String description) {
        final int width = this.helpFormatter.getWidth();
        final int offset = 5;
        final int descLen = width - offset;
        this.printWrap(option);
        System.out.println();
        this.printOffset(offset);
        final String[] wordList = description.split("\\s");
        int len = descLen;
        for (final String word : wordList) {
            final int add = word.length() + 1;
            if (add <= len) {
                len -= add;
                System.out.print(" " + word);
            }
            else {
                len = descLen - add;
                System.out.print("\n");
                this.printOffset(offset);
                System.out.print(" " + word);
            }
        }
        System.out.print("\n");
    }
    
    private void printOffset(final int offset) {
        for (int i = 0; i < offset; ++i) {
            System.out.print(" ");
        }
    }
    
    private void printConfigOptions() {
        this.printHeader("CONFIGURATION OPTIONS");
        this.printWrap("NOTE! Configuration options can be omitted if CLI session has been started and active.");
        System.out.println();
        final PrintWriter pw = new PrintWriter(System.out);
        this.helpFormatter.printOptions(pw, this.helpFormatter.getWidth(), this.configOptions, this.helpFormatter.getLeftPadding(), this.helpFormatter.getDescPadding());
        pw.write("\n");
        pw.flush();
    }
}
