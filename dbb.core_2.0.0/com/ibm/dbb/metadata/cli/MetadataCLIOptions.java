// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.cli;

import org.apache.commons.cli.Option;

class MetadataCLIOptions
{
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
    
    MetadataCLIOptions() {
        this.buildGroupOption = new Option("g", "build-group", true, "The name of the build group containing the build results to list.");
        this.collectionOption = new Option("c", "collection", true, "The name of the collection that contains the logical file to display.");
        this.db2ConfigOption = new Option("C", "db2-config", true, "Location of Db2 connection configuration file.");
        this.dependencyOption = new Option("d", "dependency", true, "Searches the collection for all logical files that has contains a logical dependency that matches the provided dependency fields. Colons are only required for spacing.");
        this.directoryOption = new Option("D", "directory", true, "Directory to export build group sub-folder or tar file to.");
        this.encodingOption = new Option("e", "encoding", true, "Users can optionally set the encoding of the text artifacts. Defaults to the default codepage of the z/OS Unix system.");
        this.helpOption = new Option("h", "help", false, "Displays the CLI commands.");
        this.locationOption = new Option("L", "location", true, "File System Implementation location. Default is '$HOME'.");
        this.logicalNameOption = new Option("l", "logical-name", true, "Searches the collection for all logical files that has the same logical name.");
        this.orderByOption = new Option("O", "order-by", true, "Build result field used to optionally sort the list of returned build results. Default field is \u2018lastUpdated\u2019. Valid values: group, state, status, created, createdBy, lastUpdated, lastUpdatedBy");
        this.orderOption = new Option("o", "order", true, "Direction of sorting the list of returned build results. Valid values: ASC, DESC");
        this.passwordFileOption = new Option("f", "password-file", true, "Location of Db2 connection password stored in a password file. IMPORTANT! The password file contains an encrypted password and must be generated by the DBB password utility.");
        this.passwordOption = new Option("p", "password", true, "Db2 connection password. IMPORTANT! Password must be encrypted using the DBB password utility.");
        this.stateOption = new Option("s", "state", true, "Numeric value indicating the current state of the build process. DBB default values: 0 - NEW, 1 - PROCESSING, 2 - COMPLETE, 3 - ABANDONED");
        this.statusOption = new Option("S", "status", true, "Numeric value indicating the success or failure of the build. DBB default values: 0 - CLEAN, 1 - ERROR, 2 - WARNING");
        this.typeOption = new Option("t", "type", true, "Metadata Store type. Values: file, db2. Default is file.");
        this.urlOption = new Option("U", "url", true, "Db2 server location. Local or remote URL. Optional if URL is provided in --db2_config file.");
        this.userOption = new Option("u", "user", true, "Db2 connection user ID.");
    }
    
    protected Option getBuildGroupOption() {
        return this.buildGroupOption;
    }
    
    protected Option getCollectionOption() {
        return this.collectionOption;
    }
    
    protected Option getDb2ConfigOption() {
        return this.db2ConfigOption;
    }
    
    protected Option getDependencyOption() {
        return this.dependencyOption;
    }
    
    protected Option getDirectoryOption() {
        return this.directoryOption;
    }
    
    protected Option getEncodingOption() {
        return this.encodingOption;
    }
    
    protected Option getHelpOption() {
        return this.helpOption;
    }
    
    protected Option getLocationOption() {
        return this.locationOption;
    }
    
    protected Option getLogicalNameOption() {
        return this.logicalNameOption;
    }
    
    protected Option getOrderByOption() {
        return this.orderByOption;
    }
    
    protected Option getOrderOption() {
        return this.orderOption;
    }
    
    protected Option getPasswordFileOption() {
        return this.passwordFileOption;
    }
    
    protected Option getPasswordOption() {
        return this.passwordOption;
    }
    
    protected Option getStateOption() {
        return this.stateOption;
    }
    
    protected Option getStatusOption() {
        return this.statusOption;
    }
    
    protected Option getTypeOption() {
        return this.typeOption;
    }
    
    protected Option getUrlOption() {
        return this.urlOption;
    }
    
    protected Option getUserOption() {
        return this.userOption;
    }
}
