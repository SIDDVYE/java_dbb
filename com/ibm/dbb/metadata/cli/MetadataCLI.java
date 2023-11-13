// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.cli;

import com.ibm.dbb.metadata.MetadataStoreFactory;
import java.io.InputStream;
import java.io.FileInputStream;
import java.nio.file.Path;
import com.ibm.dbb.metadata.common.PasswordUtil;
import java.util.regex.Pattern;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.io.Console;
import java.io.FileNotFoundException;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import java.util.Properties;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermissions;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import com.ibm.dbb.metadata.BuildResult;
import java.util.Iterator;
import com.ibm.dbb.dependency.LogicalFile;
import java.util.List;
import java.util.ArrayList;
import com.ibm.dbb.dependency.LogicalDependency;
import com.ibm.dbb.metadata.Collection;
import java.io.IOException;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.OptionGroup;
import java.util.HashMap;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.BuildException;
import org.apache.commons.cli.ParseException;
import com.ibm.dbb.metadata.MetadataStore;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import java.util.Map;

public class MetadataCLI
{
    protected final String COLLECTION = "collection";
    protected final String LOGICAL_FILE = "logical-file";
    protected final String BUILD_RESULT = "build-result";
    protected final String BUILD_GROUP = "build-group";
    protected final String LIST = "list";
    protected final String VIEW = "view";
    protected final String FIND = "find";
    protected final String FIND_LAST = "find-last";
    protected final String EXPORT = "export";
    protected final String DELETE = "delete";
    protected final String SESSION = "session";
    protected final String START = "start";
    protected final String STOP = "stop";
    protected Map<String, String> shorthandArgs;
    private MetadataCLIOptions metadataCLIOptions;
    private Options options;
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
    private MetadataHelp helpHandler;
    private CommandLine commandLine;
    private MetadataStore store;
    private String[] positionalArguments;
    private int argumentsCount;
    private String sessionFilePath;
    
    public static void main(final String[] args) {
        main(new MetadataCLI(), args);
    }
    
    public static void main(final MetadataCLI instance, final String[] args) {
        try {
            instance.execute(args);
        }
        catch (ParseException | BuildException ex2) {
            final Exception ex;
            final Exception error = ex;
            System.err.println(error.getMessage());
            System.exit(1);
        }
        catch (Exception error) {
            System.err.println(Messages.getMessage("MetadataStore_CLI_UNEXPECTED_ERROR_OCCURRED", error.getMessage()));
            System.exit(1);
        }
    }
    
    public MetadataCLI() {
        (this.shorthandArgs = new HashMap<String, String>()).put("collection", "col");
        this.shorthandArgs.put("logical-file", "lfile");
        this.shorthandArgs.put("build-group", "group");
        this.shorthandArgs.put("build-result", "result");
        this.shorthandArgs.put("list", "ls");
        this.shorthandArgs.put("view", "vw");
        this.shorthandArgs.put("delete", "del");
        this.shorthandArgs.put("export", "ex");
        this.shorthandArgs.put("find", "fi");
        this.metadataCLIOptions = new MetadataCLIOptions();
        this.options = new Options();
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
        this.helpHandler = new MetadataHelp();
        this.sessionFilePath = System.getenv("HOME") + "/.dbb/cli/cli.sf";
        final OptionGroup passwordGroup = new OptionGroup();
        passwordGroup.setRequired(false);
        passwordGroup.addOption(this.passwordOption);
        passwordGroup.addOption(this.passwordFileOption);
        this.options.addOption(this.helpOption).addOption(this.encodingOption).addOption(this.locationOption).addOption(this.db2ConfigOption).addOption(this.directoryOption).addOption(this.collectionOption).addOption(this.logicalNameOption).addOption(this.buildGroupOption).addOption(this.stateOption).addOption(this.statusOption).addOption(this.orderOption).addOption(this.orderByOption).addOption(this.dependencyOption).addOption(this.userOption).addOption(this.typeOption).addOption(this.urlOption).addOptionGroup(passwordGroup);
        this.helpHandler.setConsoleWidth(79);
    }
    
    protected void execute(final String[] args) throws ParseException, BuildException, IOException {
        try {
            this.commandLine = new DefaultParser().parse(this.options, args);
        }
        catch (ParseException error) {
            throw new ParseException(Messages.getMessage("MetadataStore_CLI_FAILED_TO_PARSE", String.join(" ", (CharSequence[])args), error.getMessage()));
        }
        this.positionalArguments = this.commandLine.getArgs();
        this.argumentsCount = this.positionalArguments.length;
        if (this.positionalArguments.length > 0) {
            if (this.matchPositional(0, "collection")) {
                if (this.argumentsCount < 2 || this.commandLine.hasOption(this.helpOption)) {
                    this.helpHandler.printCollectionHelp();
                    return;
                }
                this.createMetadataStore(this.mergeUserInput());
                this.parseCollection();
            }
            else if (this.matchPositional(0, "logical-file")) {
                if (this.argumentsCount < 2 || this.commandLine.hasOption(this.helpOption)) {
                    this.helpHandler.printLogicalFileHelp();
                    return;
                }
                this.createMetadataStore(this.mergeUserInput());
                this.parseLogicalFile();
            }
            else if (this.matchPositional(0, "build-group")) {
                if (this.argumentsCount < 2 || this.commandLine.hasOption(this.helpOption)) {
                    this.helpHandler.printBuildGroupHelp();
                    return;
                }
                this.createMetadataStore(this.mergeUserInput());
                this.parseBuildGroup();
            }
            else if (this.matchPositional(0, "build-result")) {
                if (this.argumentsCount < 2 || this.commandLine.hasOption(this.helpOption)) {
                    this.helpHandler.printBuildResultHelp();
                    return;
                }
                this.createMetadataStore(this.mergeUserInput());
                this.parseBuildResult();
            }
            else {
                if (!this.matchPositional(0, "session")) {
                    throw new BuildException(Messages.getMessage("MetadataStore_CLI_UNRECOGNIZED_PRIMARY_ARGUMENT", this.positionalArguments[0]));
                }
                if (this.argumentsCount < 2 || this.commandLine.hasOption(this.helpOption)) {
                    this.helpHandler.printSessionHelp();
                    return;
                }
                if (this.matchPositional(1, "start")) {
                    this.countExpectedArguments(2);
                    this.startSession();
                }
                else {
                    if (!this.matchPositional(1, "stop")) {
                        throw new BuildException(Messages.getMessage("MetadataStore_CLI_UNRECOGNIZED_ACTION", this.positionalArguments[1], "session"));
                    }
                    this.countExpectedArguments(2);
                    this.stopSession();
                }
            }
        }
        else {
            this.helpHandler.printHelp();
        }
    }
    
    protected void parseCollection() throws BuildException, IOException {
        if (this.matchPositional(1, "list")) {
            this.countExpectedArguments(2);
            if (this.argumentsCount == 2) {
                MetadataPrinter.printCollections(this.store.getCollections());
            }
            return;
        }
        String collectionName = "";
        if (this.argumentsCount > 2) {
            collectionName = this.positionalArguments[2];
            this.validateCollectionExists(collectionName);
        }
        if (this.matchPositional(1, "view")) {
            this.countExpectedArguments(3);
            MetadataPrinter.printCollection(this.store.getCollection(this.positionalArguments[2]));
        }
        else if (this.matchPositional(1, "delete")) {
            this.countExpectedArguments(3);
            this.store.deleteCollection(collectionName);
            System.out.println("Successfully deleted collection \"" + collectionName + "\"");
        }
        else if (this.matchPositional(1, "export")) {
            this.countExpectedArguments(3);
            final String directory = this.validateRequiredFlag(this.directoryOption, "collection");
            final Collection collection = this.store.getCollection(this.positionalArguments[2]);
            final boolean tar = false;
            if (this.commandLine.hasOption(this.encodingOption)) {
                MetadataExport.exportCollection(collection, directory, tar, this.commandLine.getOptionValue(this.encodingOption));
            }
            else {
                MetadataExport.exportCollection(collection, directory, tar);
            }
        }
        else {
            this.printErrorUnrecognizedAction(this.positionalArguments[1], "collection");
        }
    }
    
    protected void parseLogicalFile() throws BuildException {
        final String collectionName = this.validateRequiredFlag(this.collectionOption, "logical-file");
        this.validateCollectionExists(collectionName);
        final Collection collection = this.store.getCollection(collectionName);
        if (this.matchPositional(1, "list")) {
            this.countExpectedArguments(2);
            if (this.argumentsCount == 2) {
                MetadataPrinter.printLogicalFiles(collection.getLogicalFiles());
            }
        }
        else if (this.matchPositional(1, "view")) {
            this.countExpectedArguments(3);
            final LogicalFile logicalFile = collection.getLogicalFile(this.positionalArguments[2]);
            this.validateObjectExists(logicalFile != null, "logical-file", this.positionalArguments[2]);
            MetadataPrinter.printLogicalFile(logicalFile, collection);
        }
        else if (this.matchPositional(1, "find")) {
            this.countExpectedArguments(2);
            if (this.commandLine.hasOption(this.logicalNameOption)) {
                MetadataPrinter.printLogicalFiles(collection.getLogicalFiles(this.commandLine.getOptionValue(this.logicalNameOption)));
            }
            else {
                if (!this.commandLine.hasOption(this.dependencyOption)) {
                    throw new BuildException(Messages.getMessage("MetadataStore_CLI_FIND_MISSING_FLAG"));
                }
                int counter = 0;
                final LogicalDependency dependency = new LogicalDependency();
                for (final String dependencyFilter : this.commandLine.getOptionValue(this.dependencyOption).split(":")) {
                    if (!dependencyFilter.isEmpty()) {
                        if (counter == 0) {
                            dependency.setLibrary(dependencyFilter);
                        }
                        else if (counter == 1) {
                            dependency.setCategory(dependencyFilter);
                        }
                        else if (counter == 2) {
                            dependency.setLname(dependencyFilter);
                        }
                    }
                    ++counter;
                }
                final List<Collection> filteredCollections = this.store.getImpactedFiles(new ArrayList<String>() {
                    {
                        this.add(collectionName);
                    }
                }, new ArrayList<LogicalDependency>() {
                    {
                        this.add(dependency);
                    }
                });
                final List<LogicalFile> logicalFiles = new ArrayList<LogicalFile>();
                for (final Collection filteredCollection : filteredCollections) {
                    logicalFiles.addAll(filteredCollection.getLogicalFiles());
                }
                MetadataPrinter.printLogicalFiles(logicalFiles);
            }
        }
        else {
            this.printErrorUnrecognizedAction(this.positionalArguments[1], "logical-file");
        }
    }
    
    protected void parseBuildGroup() throws BuildException, IOException {
        if (this.matchPositional(1, "list")) {
            if (this.argumentsCount == 2) {
                this.countExpectedArguments(2);
                MetadataPrinter.printBuildGroups(this.store.listBuildResultGroups());
            }
            return;
        }
        String groupName = "";
        if (this.argumentsCount > 2) {
            groupName = this.positionalArguments[2];
            this.validateBuildGroupExists(groupName);
        }
        if (this.matchPositional(1, "view")) {
            this.countExpectedArguments(3);
            MetadataPrinter.printBuildGroup(groupName, this.store.getBuildResults(groupName));
        }
        else if (this.matchPositional(1, "delete")) {
            this.countExpectedArguments(3);
            this.store.deleteBuildResults(groupName);
            System.out.println("Successfully deleted build group \"" + groupName + "\"");
        }
        else if (this.matchPositional(1, "export")) {
            this.countExpectedArguments(3);
            final String directory = this.validateRequiredFlag(this.directoryOption, "build-group");
            final boolean tar = false;
            if (this.commandLine.hasOption(this.encodingOption)) {
                MetadataExport.exportBuildGroup(groupName, this.store, directory, tar, this.commandLine.getOptionValue(this.encodingOption));
            }
            else {
                MetadataExport.exportBuildGroup(groupName, this.store, directory, tar);
            }
        }
        else {
            this.printErrorUnrecognizedAction(this.positionalArguments[1], "build-group");
        }
    }
    
    protected void parseBuildResult() throws BuildException, IOException {
        final String groupName = this.validateRequiredFlag(this.buildGroupOption, "build-result");
        this.validateBuildGroupExists(groupName);
        if (this.matchPositional(1, "list")) {
            if (this.argumentsCount == 2) {
                MetadataPrinter.printBuildResults(groupName, this.store.getBuildResults(groupName));
            }
            return;
        }
        if (this.matchPositional(1, "find")) {
            MetadataPrinter.printBuildResults(groupName, this.store.getBuildResults(this.parseBuildResultFlags("find")));
            return;
        }
        if (this.matchPositional(1, "find-last")) {
            final Map<BuildResult.QueryParms, String> queryParms = this.parseBuildResultFlags("find-last");
            MetadataPrinter.printBuildResult(groupName, this.store.getLastBuildResult(groupName, Integer.parseInt(queryParms.get(BuildResult.QueryParms.STATE)), Integer.parseInt(queryParms.get(BuildResult.QueryParms.STATUS))));
            return;
        }
        String label = "";
        if (this.argumentsCount > 2) {
            label = this.positionalArguments[2];
            this.validateObjectExists(this.store.buildResultExists(groupName, label), "build-result", label);
        }
        if (this.matchPositional(1, "view")) {
            this.countExpectedArguments(3);
            MetadataPrinter.printBuildResult(groupName, this.store.getBuildResult(groupName, label));
        }
        else if (this.matchPositional(1, "delete")) {
            this.countExpectedArguments(3);
            this.store.deleteBuildResult(this.store.getBuildResult(groupName, label));
            System.out.println("Successfully deleted build result \"" + label + "\"");
        }
        else if (this.matchPositional(1, "export")) {
            this.countExpectedArguments(3);
            final String directory = this.validateRequiredFlag(this.directoryOption, "build-result");
            final BuildResult buildResult = this.store.getBuildResult(groupName, label);
            final boolean tar = false;
            if (this.commandLine.hasOption(this.encodingOption)) {
                MetadataExport.exportBuildResult(buildResult, directory, tar, this.commandLine.getOptionValue(this.encodingOption));
            }
            else {
                MetadataExport.exportBuildResult(buildResult, directory, tar);
            }
        }
        else {
            this.printErrorUnrecognizedAction(this.positionalArguments[1], "build-result");
        }
    }
    
    protected void startSession() throws BuildException, FileNotFoundException, IOException {
        final Properties sessionInfo = this.promptSessionInfo();
        final File sessionFile = new File(this.sessionFilePath);
        sessionFile.getParentFile().mkdirs();
        try (final FileOutputStream outStream = new FileOutputStream(sessionFile)) {
            sessionInfo.storeToXML(outStream, "2.0", "UTF-8");
        }
        final Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-------");
        Files.setPosixFilePermissions(sessionFile.toPath(), permissions);
        System.out.println("Saved session.");
    }
    
    private void stopSession() {
        final File sessionFile = new File(this.sessionFilePath);
        String message;
        if (sessionFile.delete()) {
            message = "Successfully stopped session.";
        }
        else {
            message = "Failed to stop session or there is no existing session.";
        }
        System.out.println(message);
    }
    
    protected String promptLine(final String prompt) {
        final Console console = System.console();
        final String input = console.readLine(prompt, new Object[0]).trim();
        System.out.println();
        return input;
    }
    
    private String promptLine(final String prompt, final String errorMessage, final String defaultValue, final Predicate<String> condition) {
        String line;
        while (true) {
            line = this.promptLine(prompt);
            if (line.isEmpty() && defaultValue != null) {
                line = defaultValue;
            }
            if (condition.test(line)) {
                break;
            }
            System.out.println(String.format(errorMessage, line));
        }
        return line;
    }
    
    private int promptChoice(final String prompt, final int lowerBound, final int upperBound) {
        while (true) {
            final String choice = this.promptLine(prompt);
            try {
                final int numChoice = Integer.parseInt(choice);
                if (numChoice >= lowerBound && numChoice <= upperBound) {
                    return numChoice;
                }
            }
            catch (NumberFormatException ex) {}
            System.out.println(String.format("Your input must be between %s and %s (inclusive).", lowerBound, upperBound));
        }
    }
    
    protected char[] promptPassword(final String prompt) {
        final Console console = System.console();
        final char[] input = console.readPassword(prompt, new Object[0]);
        System.out.println();
        return input;
    }
    
    private Properties promptSessionInfo() {
        final String dirError = "The path \"%s\" is not a valid or existing directory.";
        Path path;
        final RuntimeException ex;
        RuntimeException error;
        final Predicate<String> isValidDir = line -> {
            if (line.equals("")) {
                return false;
            }
            else {
                try {
                    path = Paths.get(line, new String[0]);
                    return Files.isDirectory(path, new LinkOption[0]);
                }
                catch (SecurityException | InvalidPathException | NullPointerException ex4) {
                    error = ex;
                    return false;
                }
            }
        };
        final String fileError = "The path \"%s\" is not a valid or existing file.";
        Path path2;
        final RuntimeException ex2;
        RuntimeException error2;
        final Predicate<String> isValidFile = line -> {
            try {
                path2 = Paths.get(line, new String[0]);
                return Files.isRegularFile(path2, new LinkOption[0]);
            }
            catch (SecurityException | InvalidPathException | NullPointerException ex5) {
                error2 = ex2;
                return false;
            }
        };
        final String urlError = "The url \"%s\" is not a valid url.";
        final String regexLocal;
        final String regexNet;
        final Predicate<String> isValidURL = line -> {
            regexLocal = "^jdbc:(db2|db2os390|db2os390sqlj|default):[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*(:-a-zA-Z0-9+&@#/%?=~_|!:,.;)*";
            regexNet = "^jdbc:(db2|db2j|ids|ibmdb):(net:)?//[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
            return Pattern.matches(regexLocal, line) || Pattern.matches(regexNet, line);
        };
        final String floatError = "The value \"%s\" is not a number.";
        final RuntimeException ex3;
        RuntimeException error3;
        final Predicate<String> isValidFloat = line -> {
            try {
                Float.parseFloat(line);
            }
            catch (NumberFormatException | NullPointerException ex6) {
                error3 = ex3;
                return false;
            }
            return true;
        };
        char[] password = null;
        final String defaultFilePath = System.getenv("HOME");
        final Map<String, String> sessionValues = new HashMap<String, String>();
        String prompt = "Please choose the metadata store type:\n[1]: File\n[2]: Db2\nChoice: ";
        int choice = this.promptChoice(prompt, 1, 2);
        if (choice == 1) {
            sessionValues.put("f5", "file");
            prompt = "Please enter the directory of your file metadata store:\nLeave blank to default to \"" + defaultFilePath + "\"\nDirectory: ";
            sessionValues.put("f6", this.promptLine(prompt, dirError, defaultFilePath, isValidDir));
        }
        else if (choice == 2) {
            sessionValues.put("f5", "db2");
            prompt = "Please enter your Db2 username:\nUsername: ";
            sessionValues.put("f2", this.promptLine(prompt));
            prompt = "Would you like to provide a password, or a password file?\n[1]: Password\n[2]: Password File\nChoice: ";
            choice = this.promptChoice(prompt, 1, 2);
            if (choice == 1) {
                prompt = "Please enter your Db2 password:\nPassword: ";
                password = this.promptPassword(prompt);
            }
            else if (choice == 2) {
                prompt = "Please enter the path to your password file:\nPassword file: ";
                sessionValues.put("f1", this.promptLine(prompt, fileError, null, isValidFile));
            }
            prompt = "Would you like to provide a URL, or a Db2 configuration file?\n[1]: URL\n[2]: Db2 Configuration File\nChoice: ";
            choice = this.promptChoice(prompt, 1, 2);
            if (choice == 1) {
                prompt = "Please enter your Db2 URL:\nURL: ";
                sessionValues.put("f7", this.promptLine(prompt, urlError, null, isValidURL));
            }
            else if (choice == 2) {
                prompt = "Please enter the path to your Db2 configuration file:\nFile Path: ";
                sessionValues.put("f8", this.promptLine(prompt, fileError, null, isValidFile));
            }
        }
        prompt = "How long would you like your session to last?\nEnter a negative to disable\nLeave blank to default to \"1\"\nHours: ";
        sessionValues.put("f9", this.promptLine(prompt, floatError, "1", isValidFloat));
        sessionValues.put("f4", String.valueOf(System.currentTimeMillis()));
        final PasswordUtil util = new PasswordUtil();
        final Properties sessionInfo = new Properties();
        sessionValues.forEach((key, value) -> sessionInfo.setProperty(key, util.encryptString(value.toCharArray())));
        if (password != null) {
            sessionInfo.setProperty("f3", util.encryptString(password));
        }
        return sessionInfo;
    }
    
    protected Properties getSessionInfo(final File sessionFile) throws IOException, BuildException {
        final Properties sessionInfo = new Properties();
        sessionInfo.loadFromXML(new FileInputStream(sessionFile));
        final PasswordUtil util = new PasswordUtil();
        final long timestamp = Long.parseLong(String.valueOf(util.decryptString(sessionInfo.getProperty("f4"))));
        final float timeout = Float.parseFloat(String.valueOf(util.decryptString(sessionInfo.getProperty("f9"))));
        final long elapsedSeconds = (System.currentTimeMillis() - timestamp) / 1000L;
        if (timeout < 0.0f || elapsedSeconds <= timeout * 60.0f * 60.0f) {
            return sessionInfo;
        }
        if (sessionFile.delete()) {
            throw new BuildException(Messages.getMessage("MetadataStore_CLI_SESSION_ENDED_CLEARED"));
        }
        throw new IOException(Messages.getMessage("MetadataStore_CLI_SESSION_ENDED_NOT_CLEARED"));
    }
    
    protected void decryptSessionInfo(final Properties sessionInfo) {
        final Map<String, String> sessionValues = new HashMap<String, String>();
        sessionValues.put("f5", sessionInfo.getProperty("f5"));
        sessionValues.put("f6", sessionInfo.getProperty("f6"));
        sessionValues.put("f2", sessionInfo.getProperty("f2"));
        sessionValues.put("f1", sessionInfo.getProperty("f1"));
        sessionValues.put("f7", sessionInfo.getProperty("f7"));
        sessionValues.put("f8", sessionInfo.getProperty("f8"));
        final PasswordUtil util = new PasswordUtil();
        sessionValues.entrySet().stream().filter(entry -> entry.getValue() != null).forEach(entry -> sessionInfo.setProperty(entry.getKey(), String.valueOf(util.decryptString((String)entry.getValue()))));
    }
    
    protected Map<String, Map<String, String>> mergeUserInput() throws ParseException, BuildException, IOException {
        Properties sessionInfo = null;
        final File sessionFile = new File(this.sessionFilePath);
        if (sessionFile.exists()) {
            sessionInfo = this.getSessionInfo(sessionFile);
            this.decryptSessionInfo(sessionInfo);
        }
        if (sessionInfo == null) {
            sessionInfo = new Properties();
        }
        String typeValue = this.commandLine.getOptionValue(this.typeOption);
        String locationValue = this.commandLine.getOptionValue(this.locationOption);
        String userValue = this.commandLine.getOptionValue(this.userOption);
        final String passwordValue = this.commandLine.getOptionValue(this.passwordOption);
        final String passwordFilePath = this.commandLine.getOptionValue(this.passwordFileOption);
        String urlValue = this.commandLine.getOptionValue(this.urlOption);
        final String db2ConfigValue = this.commandLine.getOptionValue(this.db2ConfigOption);
        if (typeValue == null) {
            typeValue = sessionInfo.getProperty("f5");
            if (typeValue == null) {
                throw new ParseException(Messages.getMessage("MetadataStore_CLI_MISSING_SESSION_PARAMETER", "Metadata Store type"));
            }
        }
        final Map<String, Map<String, String>> metadataStoreProperties = new HashMap<String, Map<String, String>>();
        final Map<String, String> mergedInput = new HashMap<String, String>();
        if (!typeValue.equals("db2")) {
            if (locationValue == null) {
                locationValue = sessionInfo.getProperty("f6", System.getenv("HOME"));
            }
            mergedInput.put("location", locationValue);
            metadataStoreProperties.put("mergedInput", mergedInput);
            return metadataStoreProperties;
        }
        Properties db2Properties = null;
        if (db2ConfigValue != null || sessionInfo.containsKey("f8")) {
            final String configPath = (db2ConfigValue != null) ? db2ConfigValue : sessionInfo.getProperty("f8");
            db2Properties = new Properties();
            try (final FileInputStream inStream = new FileInputStream(configPath)) {
                db2Properties.load(inStream);
            }
            if (urlValue != null) {
                db2Properties.setProperty("url", urlValue);
                urlValue = null;
            }
        }
        else if (urlValue == null && sessionInfo.containsKey("f7")) {
            urlValue = sessionInfo.getProperty("f7");
        }
        else if (urlValue == null) {
            throw new ParseException(Messages.getMessage("MetadataStore_CLI_MISSING_SESSION_PARAMETER", "url and/or Db2 config parameter"));
        }
        if (userValue == null && sessionInfo.containsKey("f2")) {
            userValue = sessionInfo.getProperty("f2");
        }
        else if (userValue == null) {
            throw new ParseException(Messages.getMessage("MetadataStore_CLI_MISSING_SESSION_PARAMETER", "userid"));
        }
        if (passwordValue != null || (sessionInfo.containsKey("f3") && passwordFilePath == null)) {
            final String password = (passwordValue != null) ? passwordValue : sessionInfo.getProperty("f3");
            if (db2Properties == null) {
                mergedInput.put("user", userValue);
                mergedInput.put("password", password);
                mergedInput.put("url", urlValue);
                metadataStoreProperties.put("mergedInput", mergedInput);
                return metadataStoreProperties;
            }
            mergedInput.put("user", userValue);
            mergedInput.put("password", password);
            final Map<String, String> db2MapProperties = (Map<String, String>)db2Properties;
            metadataStoreProperties.put("db2Config", db2MapProperties);
            metadataStoreProperties.put("mergedInput", mergedInput);
            return metadataStoreProperties;
        }
        else {
            if (passwordFilePath == null && (!sessionInfo.containsKey("f1") || passwordValue != null)) {
                throw new ParseException(Messages.getMessage("MetadataStore_CLI_MISSING_SESSION_PARAMETER", "password options"));
            }
            final String passwordPath = (passwordFilePath != null) ? passwordFilePath : sessionInfo.getProperty("f1");
            if (db2Properties == null) {
                mergedInput.put("user", userValue);
                mergedInput.put("passwordFile", passwordPath);
                mergedInput.put("url", urlValue);
                metadataStoreProperties.put("mergedInput", mergedInput);
                return metadataStoreProperties;
            }
            mergedInput.put("user", userValue);
            mergedInput.put("passwordFile", passwordPath);
            final Map<String, String> db2MapProperties = (Map<String, String>)db2Properties;
            metadataStoreProperties.put("db2Config", db2MapProperties);
            metadataStoreProperties.put("mergedInput", mergedInput);
            return metadataStoreProperties;
        }
    }
    
    protected void createMetadataStore(final Map<String, Map<String, String>> metadataStoreProperties) throws ParseException, BuildException, IOException {
        final Map<String, String> mergedInput = metadataStoreProperties.get("mergedInput");
        if (mergedInput.containsKey("location")) {
            final String location = mergedInput.get("location");
            final File metadata = new File(location, ".dbb/metadata");
            if (!metadata.exists()) {
                throw new BuildException(Messages.getMessage("MetadataStore_CLI_NO_FILE_STORE_FOUND", location));
            }
            final String[] metadataFiles = metadata.list();
            if (metadataFiles == null || metadataFiles.length == 0) {
                throw new BuildException(Messages.getMessage("MetadataStore_CLI_EMPTY_FILE_STORE", location));
            }
            this.store = MetadataStoreFactory.createFileMetadataStore(location);
        }
        else {
            final String user = mergedInput.get("user");
            if (mergedInput.containsKey("password")) {
                final String password = mergedInput.get("password");
                if (mergedInput.containsKey("url")) {
                    this.store = MetadataStoreFactory.createDb2MetadataStore(mergedInput.get("url"), user, password);
                }
                else {
                    final Properties db2Properties = new Properties();
                    db2Properties.putAll(metadataStoreProperties.get("db2Config"));
                    this.store = MetadataStoreFactory.createDb2MetadataStore(user, password, db2Properties);
                }
            }
            else {
                final File passwordFile = new File(mergedInput.get("passwordFile"));
                if (mergedInput.containsKey("url")) {
                    this.store = MetadataStoreFactory.createDb2MetadataStore(mergedInput.get("url"), user, passwordFile);
                }
                else {
                    final Properties db2Properties = new Properties();
                    db2Properties.putAll(metadataStoreProperties.get("db2Config"));
                    this.store = MetadataStoreFactory.createDb2MetadataStore(user, passwordFile, db2Properties);
                }
            }
        }
    }
    
    protected void countExpectedArguments(final int expectedCount) throws BuildException {
        if (this.argumentsCount > expectedCount || this.argumentsCount < expectedCount) {
            throw new BuildException(Messages.getMessage("MetadataStore_CLI_UNEXPECTED_ARGUMENTS", expectedCount, this.argumentsCount, String.join(" ", (CharSequence[])this.positionalArguments)));
        }
    }
    
    protected Map<BuildResult.QueryParms, String> parseBuildResultFlags(final String command) throws BuildException {
        this.countExpectedArguments(2);
        String errorMessage = "";
        if (!this.commandLine.hasOption(this.buildGroupOption)) {
            errorMessage = errorMessage + "--" + this.buildGroupOption.getLongOpt() + " ";
        }
        if (!this.commandLine.hasOption(this.stateOption)) {
            errorMessage = errorMessage + "--" + this.stateOption.getLongOpt() + " ";
        }
        if (!this.commandLine.hasOption(this.statusOption)) {
            errorMessage = errorMessage + "--" + this.statusOption.getLongOpt();
        }
        if (!errorMessage.isEmpty()) {
            throw new BuildException(Messages.getMessage("MetadataStore_CLI_BUILD_RESULT_MISSING_FLAGS", command, errorMessage));
        }
        final String state = this.commandLine.getOptionValue(this.stateOption);
        final String status = this.commandLine.getOptionValue(this.statusOption);
        try {
            Integer.parseInt(state);
            Integer.parseInt(status);
        }
        catch (NumberFormatException error) {
            errorMessage = errorMessage + Messages.getMessage("MetadataStore_CLI_INVALID_STATE_STATUS") + "\n";
        }
        final Map<BuildResult.QueryParms, String> queryParms = new HashMap<BuildResult.QueryParms, String>() {
            {
                this.put(BuildResult.QueryParms.GROUP, MetadataCLI.this.commandLine.getOptionValue(MetadataCLI.this.buildGroupOption));
                this.put(BuildResult.QueryParms.STATE, state);
                this.put(BuildResult.QueryParms.STATUS, status);
            }
        };
        if (command.equals("find-last")) {
            return queryParms;
        }
        if (command.equals("find-last")) {
            return queryParms;
        }
        if (this.commandLine.hasOption(this.orderOption)) {
            final String order = this.commandLine.getOptionValue(this.orderOption).toLowerCase();
            if (order.equals("asc") || order.equals("desc")) {
                queryParms.put(BuildResult.QueryParms.ORDER, order);
            }
            else {
                errorMessage = errorMessage + Messages.getMessage("MetadataStore_CLI_INVALID_ORDER") + "\n";
            }
        }
        if (this.commandLine.hasOption(this.orderByOption)) {
            final String orderBy = this.commandLine.getOptionValue(this.orderByOption);
            if (orderBy.matches("label|created|createdBy|state|status|lastUpdated|lastUpdatedBy")) {
                queryParms.put(BuildResult.QueryParms.ORDER_BY, orderBy);
            }
            else {
                errorMessage = errorMessage + Messages.getMessage("MetadataStore_CLI_INVALID_ORDER_BY") + "\n";
            }
        }
        if (!errorMessage.isEmpty()) {
            throw new BuildException(errorMessage);
        }
        return queryParms;
    }
    
    protected String validateRequiredFlag(final Option option, final String mainArgument) throws BuildException {
        if (!this.commandLine.hasOption(option)) {
            throw new BuildException(Messages.getMessage("MetadataStore_CLI_MISSING_FLAG", option.getLongOpt(), mainArgument));
        }
        return this.commandLine.getOptionValue(option);
    }
    
    protected void validateCollectionExists(final String collectionName) throws BuildException {
        this.validateObjectExists(this.store.collectionExists(collectionName), "collection", collectionName);
    }
    
    protected void validateBuildGroupExists(final String groupName) throws BuildException {
        this.validateObjectExists(this.store.listBuildResultGroups().contains(groupName), "GROUP", groupName);
    }
    
    protected void validateObjectExists(final Boolean exists, final String objectType, final String objectName) throws BuildException {
        if (!exists) {
            throw new BuildException(Messages.getMessage("MetadataStore_" + objectType.toUpperCase().replaceAll("-", "_") + "_DNE", objectName));
        }
    }
    
    protected void printErrorUnrecognizedAction(final String action, final String mainArgument) throws BuildException {
        throw new BuildException(Messages.getMessage("MetadataStore_CLI_UNRECOGNIZED_ACTION", action, mainArgument));
    }
    
    protected boolean matchPositional(final int position, final String argumentMatch) {
        final String argument = this.positionalArguments[position];
        return argument.equals(argumentMatch) || argument.equals(this.shorthandArgs.get(argumentMatch));
    }
}
