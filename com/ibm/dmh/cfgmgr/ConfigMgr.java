// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr;

import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.FileWriter;
import java.util.regex.Pattern;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import com.ibm.dmh.util.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.StringTokenizer;
import java.io.File;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Hashtable;

public class ConfigMgr
{
    private static Hashtable<String, ConfigFile> configFileTable;
    private static ArrayList<String> configSearchPaths;
    public static ConfigRuntimeException loadErrorsException;
    public static boolean autoSave;
    
    public static String[] getConfigSearchPaths() {
        return ConfigMgr.configSearchPaths.toArray(new String[ConfigMgr.configSearchPaths.size()]);
    }
    
    public static boolean isAutoSave() {
        return ConfigMgr.autoSave;
    }
    
    public static void setAutoSave(final boolean b) {
        ConfigMgr.autoSave = b;
    }
    
    public static void load(final String searchPath) throws ConfigRuntimeException {
        final ArrayList<String> newSearchPaths = new ArrayList<String>();
        final List<String> loadErrors = new LinkedList<String>();
        loadErrors.clear();
        if (searchPath == null || searchPath.equals("")) {
            loadErrors.add("Search path passed to ConfigMgr.load() was empty:  searchPath=[" + searchPath + "]");
        }
        else {
            final StringTokenizer st = new StringTokenizer(searchPath, File.pathSeparator);
            while (st.hasMoreTokens()) {
                final String token = st.nextToken().trim();
                try {
                    final File f = new File(token);
                    if (!f.exists()) {
                        continue;
                    }
                    final String s = f.getCanonicalPath();
                    if (newSearchPaths.contains(s)) {
                        continue;
                    }
                    newSearchPaths.add(s);
                }
                catch (Exception e) {
                    throw new ConfigRuntimeException("Could not get canonical path for token [" + token + "].", e);
                }
            }
            boolean isSamePath = ConfigMgr.configSearchPaths.size() == newSearchPaths.size();
            for (int i = 0; i < ConfigMgr.configSearchPaths.size() && isSamePath; ++i) {
                if (!ConfigMgr.configSearchPaths.get(i).equalsIgnoreCase(newSearchPaths.get(i))) {
                    isSamePath = false;
                }
            }
            if (isSamePath) {
                return;
            }
            ConfigMgr.configSearchPaths = newSearchPaths;
            File configDir = null;
            for (final String configDirPath : ConfigMgr.configSearchPaths) {
                configDir = new File(configDirPath);
                if (!configDir.exists()) {
                    continue;
                }
                if (!configDir.canRead()) {
                    loadErrors.add("Search path passed to ConfigMgr.load() is not readable:  searchPath=[" + searchPath + "]");
                }
                else {
                    final File[] children = configDir.listFiles();
                    for (int j = 0; j < children.length; ++j) {
                        final File f2 = children[j];
                        if (f2.isFile() && f2.getAbsolutePath().toLowerCase().endsWith(".cfg")) {
                            ConfigFile cf = null;
                            try {
                                cf = new ConfigFile(f2.getAbsolutePath());
                                cf.setAutoSave(isAutoSave());
                                if (!ConfigMgr.configFileTable.containsKey(cf.name)) {
                                    ConfigMgr.configFileTable.put(cf.name, cf);
                                }
                            }
                            catch (ConfigRuntimeException e2) {
                                loadErrors.addAll(e2.getErrors());
                            }
                        }
                    }
                }
            }
            for (final ConfigFile cf2 : ConfigMgr.configFileTable.values()) {
                try {
                    cf2.resolveAllValues();
                    if (!cf2.isAutoSave()) {
                        continue;
                    }
                    cf2.save();
                }
                catch (ConfigRuntimeException e3) {
                    loadErrors.addAll(e3.getErrors());
                }
            }
        }
        if (!loadErrors.isEmpty()) {
            ConfigMgr.loadErrorsException = new ConfigRuntimeException("Problems occurred while trying to load configuration files into memory. ", loadErrors);
        }
        if (ConfigMgr.loadErrorsException != null) {
            throw ConfigMgr.loadErrorsException;
        }
    }
    
    public static void reload() throws ConfigRuntimeException {
        final String searchPath = StringUtils.join(ConfigMgr.configSearchPaths.toArray(), File.pathSeparator);
        ConfigMgr.configSearchPaths.clear();
        ConfigMgr.configFileTable.clear();
        load(searchPath);
    }
    
    public static void addPath(final String searchPath) throws ConfigRuntimeException {
        load(StringUtils.join(ConfigMgr.configSearchPaths.toArray(), File.pathSeparator) + File.pathSeparator + searchPath);
    }
    
    public static void set(final String key, final String value, final boolean createIfNotThere) throws ConfigRuntimeException {
        getConfigFile(getFirstToken(key)).set(getLastTokens(key), value, createIfNotThere);
    }
    
    public static void set(final String fileName, final String key, final String value, final boolean createIfNotThere) throws ConfigRuntimeException {
        getConfigFile(fileName).set(key, value, createIfNotThere);
    }
    
    public static String getRawValue(final String key) throws ConfigRuntimeException {
        return getConfigFile(getFirstToken(key)).getRawValue(getLastTokens(key));
    }
    
    public static String get(final String key) throws ConfigRuntimeException {
        return getConfigFile(getFirstToken(key)).get(getLastTokens(key));
    }
    
    public static HashSet<String> getStringSet(final String key) throws ConfigRuntimeException {
        return new HashSet<String>(Arrays.asList(StringUtils.split(get(key), ',')));
    }
    
    public static String get(final String key, final String defaultValue) {
        String rv = defaultValue;
        try {
            rv = getConfigFile(getFirstToken(key)).get(getLastTokens(key), defaultValue);
            if (StringUtils.isEmpty(rv)) {
                rv = defaultValue;
            }
        }
        catch (ConfigRuntimeException e) {
            rv = defaultValue;
        }
        return rv;
    }
    
    public static String get(final String key, final Object[] args) throws ConfigRuntimeException {
        return getConfigFile(getFirstToken(key)).get(getLastTokens(key), args);
    }
    
    public static String get(final String key, final Object[] args, final String defaultValue) throws ConfigRuntimeException {
        return getConfigFile(getFirstToken(key)).get(getLastTokens(key), args, defaultValue);
    }
    
    public static boolean getBoolean(final String key) throws ConfigRuntimeException {
        final String value = get(key);
        return testBooleanValue(value);
    }
    
    public static boolean getBoolean(final String key, final boolean defaultValue) {
        final String value = get(key, String.valueOf(defaultValue));
        return testBooleanValue(value);
    }
    
    private static boolean testBooleanValue(final String iValue) {
        if (iValue.length() == 0) {
            return false;
        }
        boolean rc = false;
        switch (iValue.charAt(0)) {
            case '1':
            case 'T':
            case 'Y':
            case 't':
            case 'y': {
                rc = true;
                break;
            }
            default: {
                rc = false;
                break;
            }
        }
        return rc;
    }
    
    public static long getTime(final String key) throws ConfigRuntimeException {
        final String s = get(key).toUpperCase();
        try {
            return StringUtils.parseTime(s);
        }
        catch (Exception e) {
            throw new ConfigRuntimeException("Invalid value for key [" + key + "].  " + e.getMessage());
        }
    }
    
    public static long getTime(final String key, final long defaultValue) {
        final String value = get(key, (String)null);
        if (StringUtils.isEmpty(value)) {
            return defaultValue;
        }
        try {
            return StringUtils.parseTime(value);
        }
        catch (Exception e) {
            throw new ConfigRuntimeException("Invalid value for key [" + key + "].  " + e.getMessage());
        }
    }
    
    public static int getInt(final String key) throws ConfigRuntimeException {
        final String value = get(key);
        try {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException e) {
            throw new ConfigRuntimeException("Can not return int value for key [" + key + "].  Value was [" + value + "].");
        }
    }
    
    public static int getInt(final String key, final int defaultValue) {
        final String value = get(key, (String)null);
        return StringUtils.getInt(value, defaultValue);
    }
    
    public static int[] getInts(final String key) throws ConfigRuntimeException {
        try {
            return StringUtils.getInts(get(key));
        }
        catch (NumberFormatException e) {
            throw new ConfigRuntimeException("Cannot return value as int for key [" + key + "].  Value was [" + get(key) + "].");
        }
    }
    
    public static Set<String> getKeyNames(final String key) throws ConfigRuntimeException {
        return getConfigFile(getFirstToken(key)).getKeyNamesInSection(getLastTokens(key));
    }
    
    public static boolean isEncoded(final String fileName, final String key) throws ConfigRuntimeException {
        return getConfigFile(fileName).isEncoded(key);
    }
    
    public static boolean isEncoded(final String key) throws ConfigRuntimeException {
        return getConfigFile(getFirstToken(key)).isEncoded(getLastTokens(key));
    }
    
    public static Hashtable<String, String> getSection(final String key) throws ConfigRuntimeException {
        try {
            final Map<String, ConfigEntry> m = getConfigFile(getFirstToken(key)).sectionValuesMap.get(getLastTokens(key));
            if (m == null) {
                throw new ConfigRuntimeException("Section not found for key [" + key + "].");
            }
            final Hashtable<String, String> ht = new Hashtable<String, String>();
            for (final ConfigEntry x : m.values()) {
                ht.put(x.propName, x.getValue());
            }
            return ht;
        }
        catch (Exception e) {
            throw new ConfigRuntimeException("Exception of type [" + e.getClass().getName() + "] caught in method ConfigMgr.getSection() for key [" + key + "]", e);
        }
    }
    
    public static Map<String, String> getConfigMap(final String config) throws ConfigRuntimeException {
        final Map<String, String> m = new TreeMap<String, String>();
        final Map<String, ConfigEntry> valueMap = getConfigFile(config).allValuesMap;
        for (final Map.Entry<String, ConfigEntry> e : valueMap.entrySet()) {
            m.put(e.getKey(), e.getValue().getValue());
        }
        return m;
    }
    
    public static void save() throws ConfigRuntimeException {
        for (final ConfigFile f : ConfigMgr.configFileTable.values()) {
            f.save();
        }
    }
    
    public static void createBatchEnvFile(String configFileName, final String batchFilePath, final boolean includeConfigName, final boolean verbose) throws ConfigRuntimeException {
        try {
            final ConfigFile c = getConfigFile(configFileName);
            final StringBuffer sb = new StringBuffer("echo off\r\n\r\n");
            sb.append("rem This file was automatically generated from the contents in the " + configFileName + ".cfg file\r\n\r\n");
            sb.append("rem version 2\r\n\r\n");
            if (configFileName.indexOf(46) > -1) {
                configFileName = configFileName.substring(0, configFileName.lastIndexOf(46));
            }
            final Pattern p = Pattern.compile("(<|>|\\^|\\||&)");
            for (final String sectionName : c.sectionList) {
                for (final String line : c.sectionContents.get(sectionName)) {
                    if (line.length() > 0 && line.charAt(0) == '=') {
                        final ConfigEntry ce = c.allValuesMap.get(line.substring(1));
                        String value = ce.getValue();
                        value = value.replace("%", "%%");
                        value = p.matcher(value).replaceAll("^$1");
                        if (ce.isEncoded) {
                            value = ce.getRawValue();
                        }
                        sb.append("set " + ce.configKey.replace('.', '_') + "=" + value + "\r\n");
                    }
                    else {
                        sb.append("rem " + line + "\r\n");
                    }
                }
            }
            final FileWriter fw = new FileWriter(batchFilePath);
            fw.write(sb.toString());
            fw.flush();
            fw.close();
        }
        catch (Exception e) {
            throw new ConfigRuntimeException("Exception of type [" + e.getClass().getName() + "] caught while trying to generate batch file [" + batchFilePath + "].");
        }
    }
    
    public static void createShellEnvFile(String configFileName, final String batchFilePath, final boolean includeConfigName, final boolean verbose) throws ConfigRuntimeException {
        try {
            final ConfigFile c = getConfigFile(configFileName);
            final StringBuffer sb = new StringBuffer("#!/bin/sh\n\n");
            sb.append("# This file was automatically generated from the contents in the " + configFileName + ".cfg file\n\n");
            sb.append("# version 2\n\n");
            if (configFileName.indexOf(46) > -1) {
                configFileName = configFileName.substring(0, configFileName.lastIndexOf(46));
            }
            final Pattern p = Pattern.compile("(`|\\\\)");
            for (final String sectionName : c.sectionList) {
                for (final String line : c.sectionContents.get(sectionName)) {
                    if (line.length() > 0 && line.charAt(0) == '=') {
                        final ConfigEntry ce = c.allValuesMap.get(line.substring(1));
                        String value = ce.getValue();
                        value = p.matcher(value).replaceAll("\\\\$1");
                        if (ce.isEncoded) {
                            value = ce.getRawValue();
                        }
                        sb.append("export " + ce.configKey.replace('.', '_') + "=\"" + value + "\"\n");
                    }
                    else {
                        sb.append((line.startsWith("#") ? "" : "# ") + line + "\n");
                    }
                }
            }
            final FileWriter fw = new FileWriter(batchFilePath);
            fw.write(sb.toString().toCharArray());
            fw.flush();
            fw.close();
        }
        catch (Exception e) {
            throw new ConfigRuntimeException("Exception of type [" + e.getClass().getName() + "] caught while trying to generate batch file [" + batchFilePath + "].");
        }
    }
    
    private static String replace(String s, final String replace, final String with) {
        for (int i = -1; (i = s.indexOf(replace, i + 1)) != -1; s = s.substring(0, i) + with + s.substring(i += replace.length())) {}
        return s;
    }
    
    public static ConfigFile getConfigFile(String filename) throws ConfigRuntimeException {
        if (filename.indexOf(46) == -1) {
            filename += ".cfg";
        }
        if (!ConfigMgr.configFileTable.containsKey(filename)) {
            boolean foundIt = false;
            final Iterator<String> i = ConfigMgr.configSearchPaths.iterator();
            while (i.hasNext() && !foundIt) {
                final String searchPath = i.next();
                final File f = new File(searchPath + File.separator + filename);
                try {
                    if (!f.exists() || !f.getCanonicalFile().getName().equals(filename)) {
                        continue;
                    }
                    final ConfigFile cf = new ConfigFile(f.getAbsolutePath());
                    cf.setAutoSave(isAutoSave());
                    ConfigMgr.configFileTable.put(filename, cf);
                    foundIt = true;
                }
                catch (Exception e) {
                    throw new ConfigRuntimeException("Unexpected exception caught in ConfigMgr.getConfigFile(" + filename + "):  msg=[" + e.getLocalizedMessage() + "]", e);
                }
            }
        }
        final ConfigFile c = ConfigMgr.configFileTable.get(filename);
        if (c == null) {
            throw new ConfigRuntimeException("Could not find configuration file [" + filename + "] in search path [" + getSearchPath() + "]");
        }
        if (c.hasBeenModified && c.isAutoSave()) {
            try {
                c.save();
            }
            catch (ConfigRuntimeException e2) {
                System.err.println("WARNING:  Could not save configuration file [" + filename + "].  File is read-only.  File may now contain unencoded passwords.");
                c.hasBeenModified = false;
            }
        }
        return c;
    }
    
    private static String getSearchPath() {
        String searchPath = "";
        for (int i = 0; i < ConfigMgr.configSearchPaths.size(); ++i) {
            searchPath = searchPath + ConfigMgr.configSearchPaths.get(i) + File.pathSeparator;
        }
        return searchPath;
    }
    
    public static Hashtable<String, String> getAllValues(final boolean resolveValues) throws Exception {
        final Hashtable<String, String> m = new Hashtable<String, String>();
        for (final String f : ConfigMgr.configSearchPaths) {
            final File dir = new File(f);
            if (dir.exists() && dir.isDirectory()) {
                final String[] files = dir.list(new FilenameFilter() {
                    @Override
                    public boolean accept(final File dir, final String name) {
                        return name.toLowerCase().endsWith("cfg");
                    }
                });
                for (int j = 0; j < files.length; ++j) {
                    final ConfigFile c = getConfigFile(files[j]);
                    final String configName = files[j].substring(0, files[j].indexOf(46));
                    String secretKey = null;
                    for (final Map.Entry<String, ConfigEntry> e : c.allValuesMap.entrySet()) {
                        final ConfigEntry ce = e.getValue();
                        String value = null;
                        if (resolveValues) {
                            value = ce.getValue();
                        }
                        else {
                            if (ce.isEncoded && secretKey == null) {
                                secretKey = PasswordUtil.getSecretKeyFromKeyStore(new File(c.configFilePath).getParent(), "aGwdHmobGmdnaB4bZxxqaG1oGmgZaG0ebx1pbGYcHGs=");
                            }
                            value = (ce.isEncoded ? PasswordUtil.decode(ce.rawValue, secretKey) : ce.rawValue);
                        }
                        m.put(configName + "." + e.getKey(), value);
                    }
                }
            }
        }
        return m;
    }
    
    public static Hashtable<String, String> getAllValues() throws Exception {
        return getAllValues(true);
    }
    
    public static void main(final String[] args) {
        if (args.length == 0) {
            printUsageAndExit();
        }
        if (args[0].equals("setVals")) {
            String searchPath = null;
            final List<String> commands = new LinkedList<String>();
            boolean verbose = false;
            for (int i = 1; i < args.length; ++i) {
                System.out.println("looking at arg [" + args[i] + "]");
                if (args[i].equals("-searchPath") && args.length > i + 1 && !args[i + 1].startsWith("-")) {
                    searchPath = args[++i];
                }
                else if (args[i].equals("-vals")) {
                    final StringBuffer sb = new StringBuffer();
                    while (i + 1 < args.length && !args[i + 1].startsWith("-")) {
                        sb.append(args[++i] + " ");
                    }
                    final String[] tokens = StringUtils.split(sb.toString());
                    for (int j = 0; j < tokens.length; ++j) {
                        if (j % 2 == 1) {
                            commands.add(tokens[j - 1] + "=" + tokens[j]);
                        }
                    }
                }
                else if (args[i].equals("-verbose")) {
                    verbose = true;
                }
            }
            if (searchPath == null || commands.size() == 0) {
                printUsageAndExit();
            }
            try {
                if (verbose) {
                    System.out.println("Setting search path to [" + searchPath + "]");
                }
                load(searchPath);
                for (final String s : commands) {
                    System.out.println("Command=[" + s + "]");
                    final int eq;
                    if ((eq = s.indexOf(61)) == -1) {
                        printUsageAndExit();
                    }
                    final String var = s.substring(0, eq);
                    final String val = s.substring(eq + 1);
                    if (verbose) {
                        System.out.println("Setting [" + var + "] to [" + val + "]");
                    }
                    set(var, val, false);
                }
                if (verbose) {
                    System.out.println("Saving...");
                }
                if (isAutoSave()) {
                    save();
                }
            }
            catch (Exception e) {
                e.printStackTrace(System.err);
            }
            if (verbose) {
                System.out.println("Done.");
            }
        }
        else if (args[0].equals("createShellEnvFile") && args.length >= 3) {
            String searchPath = null;
            String configFile = null;
            String batchPathname = null;
            boolean verbose2 = false;
            for (int k = 1; k < args.length; ++k) {
                if (args[k].equals("-searchPath") && args.length > k + 1 && !args[k + 1].startsWith("-")) {
                    searchPath = args[++k];
                }
                else if (args[k].equals("-configFile") && args.length > k + 1 && !args[k + 1].startsWith("-")) {
                    configFile = args[++k];
                }
                else if (args[k].equals("-batchPathname") && args.length > k + 1 && !args[k + 1].startsWith("-")) {
                    batchPathname = args[++k];
                }
                else if (args[k].equals("-verbose")) {
                    verbose2 = true;
                }
            }
            if (searchPath == null || configFile == null || batchPathname == null) {
                printUsageAndExit();
            }
            try {
                if (verbose2) {
                    System.out.println("creating shell script [" + batchPathname + "]...");
                }
                load(searchPath);
                createShellEnvFile(configFile, batchPathname, false, verbose2);
                if (verbose2) {
                    System.out.println("Done.");
                }
                System.exit(0);
            }
            catch (Exception e2) {
                e2.printStackTrace(System.err);
            }
        }
        else if (args[0].equals("createBatchEnvFile") && args.length >= 3) {
            String searchPath = null;
            String configFile = null;
            String batchPathname = null;
            boolean verbose2 = false;
            final boolean decodePasswords = false;
            for (int l = 1; l < args.length; ++l) {
                if (args[l].equals("-searchPath") && args.length > l + 1 && !args[l + 1].startsWith("-")) {
                    searchPath = args[++l];
                }
                else if (args[l].equals("-configFile") && args.length > l + 1 && !args[l + 1].startsWith("-")) {
                    configFile = args[++l];
                }
                else if (args[l].equals("-batchPathname") && args.length > l + 1 && !args[l + 1].startsWith("-")) {
                    batchPathname = args[++l];
                }
                else if (args[l].equals("-verbose")) {
                    verbose2 = true;
                }
            }
            if (searchPath == null || configFile == null || batchPathname == null) {
                printUsageAndExit();
            }
            try {
                if (verbose2) {
                    System.out.println("creating batch file [" + batchPathname + "]...");
                }
                load(searchPath);
                createBatchEnvFile(configFile, batchPathname, false, verbose2);
                if (verbose2) {
                    System.out.println("Done.");
                }
                System.exit(0);
            }
            catch (Exception e3) {
                e3.printStackTrace(System.err);
            }
        }
        else {
            printUsageAndExit();
        }
    }
    
    public static void printUsageAndExit() {
        System.err.println("---Usage---");
        System.err.println("java -jar ConfigMgr.jar createBatchEnvFile -searchPath <searchPath> -configFile <configFile> -batchPathname <batchFilePath> [-verbose]");
        System.err.println("java -jar ConfigMgr.jar createShellEnvFile -searchPath <searchPath> -configFile <configFile> -batchPathname <batchFilePath> [-verbose]");
        System.err.println("java -jar ConfigMgr.jar setVals -searchPath <searchPath> -vals [var1 val1 [var2 val2...]] [-verbose]");
        System.exit(2);
    }
    
    private static String getFirstToken(final String s) throws ConfigRuntimeException {
        if (s.indexOf(46) == -1) {
            throw new ConfigRuntimeException("Invalid config key [" + s + "].  Must be of the format [config.key] or [config.section.key]");
        }
        return s.substring(0, s.indexOf(46));
    }
    
    private static String getLastTokens(final String s) throws ConfigRuntimeException {
        if (s.indexOf(46) == -1) {
            throw new ConfigRuntimeException("Invalid config key [" + s + "].  Must be of the format [config.key] or [config.section.key]");
        }
        return s.substring(s.indexOf(46) + 1);
    }
    
    private static String checkConfigPath(final String iPath) {
        if (StringUtils.isEmpty(iPath)) {
            return null;
        }
        final File f = new File(iPath + "\\Common.cfg");
        if (!f.exists() || !f.canRead()) {
            return null;
        }
        return f.getParent();
    }
    
    public static String getConfigPath() throws FileNotFoundException {
        String configPath = checkConfigPath(System.getProperty("wsaaConfig"));
        if (configPath != null) {
            return configPath;
        }
        configPath = checkConfigPath(System.getenv("WSAA_CONFIG"));
        if (configPath != null) {
            return configPath;
        }
        configPath = checkConfigPath(System.getenv("WSAA_HOME") + "\\config");
        if (configPath == null) {
            throw new FileNotFoundException("Common.cfg");
        }
        return configPath;
    }
    
    static {
        ConfigMgr.configFileTable = new Hashtable<String, ConfigFile>();
        ConfigMgr.configSearchPaths = new ArrayList<String>();
        ConfigMgr.loadErrorsException = null;
        ConfigMgr.autoSave = true;
    }
}
