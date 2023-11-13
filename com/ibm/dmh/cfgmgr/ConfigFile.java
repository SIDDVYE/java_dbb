// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr;

import java.io.StringWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import com.ibm.dmh.util.StringUtils;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.io.FileInputStream;
import com.ibm.dmh.util.LocaleMgr;
import java.io.IOException;
import java.util.Iterator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConfigFile
{
    protected Map<String, List<String>> sectionContents;
    protected LinkedList<String> sectionList;
    public LinkedList<String> loadErrors;
    public String configFilePath;
    public String name;
    protected boolean hasBeenModified;
    protected ResourceBundle resourceBundle;
    protected boolean autoSave;
    protected Map<String, ConfigEntry> allValuesMap;
    protected Map<String, Map<String, ConfigEntry>> sectionValuesMap;
    
    public ConfigFile(final String configFilePath) throws ConfigRuntimeException {
        this.sectionContents = new LinkedHashMap<String, List<String>>();
        this.sectionList = new LinkedList<String>();
        this.loadErrors = new LinkedList<String>();
        this.hasBeenModified = false;
        this.autoSave = true;
        this.allValuesMap = new LinkedHashMap<String, ConfigEntry>();
        this.sectionValuesMap = new LinkedHashMap<String, Map<String, ConfigEntry>>();
        this.configFilePath = configFilePath;
        this.name = getFileName(configFilePath);
        this.readFile(configFilePath);
        if (!this.loadErrors.isEmpty()) {
            throw new ConfigRuntimeException("Errors occurred while trying to load config file [" + this.name + "].", this.loadErrors);
        }
    }
    
    public ConfigFile(final File file) throws ConfigRuntimeException {
        this(file.getAbsolutePath());
    }
    
    public ConfigFile(final String configFilePath, final boolean createIfNotExists) throws ConfigRuntimeException {
        this.sectionContents = new LinkedHashMap<String, List<String>>();
        this.sectionList = new LinkedList<String>();
        this.loadErrors = new LinkedList<String>();
        this.hasBeenModified = false;
        this.autoSave = true;
        this.allValuesMap = new LinkedHashMap<String, ConfigEntry>();
        this.sectionValuesMap = new LinkedHashMap<String, Map<String, ConfigEntry>>();
        this.configFilePath = configFilePath;
        this.name = getFileName(configFilePath);
        final File f = new File(configFilePath);
        if (!f.exists() && createIfNotExists) {
            this.readReader(new BufferedReader(new StringReader("")), configFilePath);
        }
        else {
            this.readFile(configFilePath);
        }
        if (!this.loadErrors.isEmpty()) {
            throw new ConfigRuntimeException("Errors occurred while trying to load config file [" + this.name + "].", this.loadErrors);
        }
    }
    
    public ConfigFile(final DataInputStream in) throws ConfigRuntimeException {
        this.sectionContents = new LinkedHashMap<String, List<String>>();
        this.sectionList = new LinkedList<String>();
        this.loadErrors = new LinkedList<String>();
        this.hasBeenModified = false;
        this.autoSave = true;
        this.allValuesMap = new LinkedHashMap<String, ConfigEntry>();
        this.sectionValuesMap = new LinkedHashMap<String, Map<String, ConfigEntry>>();
        this.configFilePath = null;
        this.name = null;
        this.readReader(new BufferedReader(new InputStreamReader(in)), null);
        if (!this.loadErrors.isEmpty()) {
            throw new ConfigRuntimeException("Errors occurred while trying to load config file [" + this.name + "].", this.loadErrors);
        }
    }
    
    public ConfigFile() {
        this.sectionContents = new LinkedHashMap<String, List<String>>();
        this.sectionList = new LinkedList<String>();
        this.loadErrors = new LinkedList<String>();
        this.hasBeenModified = false;
        this.autoSave = true;
        this.allValuesMap = new LinkedHashMap<String, ConfigEntry>();
        this.sectionValuesMap = new LinkedHashMap<String, Map<String, ConfigEntry>>();
        this.configFilePath = null;
        this.name = null;
    }
    
    public boolean isAutoSave() {
        return this.autoSave;
    }
    
    public void setAutoSave(final boolean b) {
        this.autoSave = b;
    }
    
    public void resolveAllValues() throws ConfigRuntimeException {
        final List<String> errors = new LinkedList<String>();
        for (final Map.Entry<String, ConfigEntry> e : this.allValuesMap.entrySet()) {
            final ConfigEntry ce = e.getValue();
            try {
                ce.getValue();
            }
            catch (ConfigRuntimeException ex) {
                errors.add(ex.getLocalizedMessage());
            }
        }
        if (!errors.isEmpty()) {
            throw new ConfigRuntimeException("Errors occurred while trying to resolve all values in config file [" + this.name + "].", errors);
        }
    }
    
    private void readFile(final String configFilePath) {
        BufferedReader br = null;
        final File f = new File(configFilePath);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
        }
        catch (IOException e) {
            this.loadErrors.add("Could not create config file on filesystem:  [" + configFilePath + "], msg=[" + e.getLocalizedMessage() + "]");
            return;
        }
        try {
            this.resourceBundle = LocaleMgr.getBundleForFile(f);
        }
        catch (Exception e2) {
            this.loadErrors.add("Could not load resource bundle for config file.  configFilePath=[" + configFilePath + "], msg=[" + e2.getLocalizedMessage() + "]");
        }
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(f), LocaleMgr.getAssetAnalyzerFileEncoding()));
            this.readReader(br, configFilePath);
            br.close();
        }
        catch (UnsupportedEncodingException e3) {
            this.loadErrors.add("Unsupported encoding exception caught trying to load config file.  configFilePath=[" + configFilePath + "], encoding=[" + LocaleMgr.getAssetAnalyzerFileEncoding() + "], msg=[" + e3.getLocalizedMessage() + "]");
        }
        catch (FileNotFoundException e4) {
            this.loadErrors.add("Could not find config file.  configFilePath=[" + configFilePath + "], msg=[" + e4.getLocalizedMessage() + "]");
        }
        catch (IOException e) {
            this.loadErrors.add("Error occurred while trying to close reader.  configFilePath=[" + configFilePath + "], msg=[" + e.getLocalizedMessage() + "]");
        }
    }
    
    private void readReader(final BufferedReader brin, final String fileName) {
        LinkedList<String> linesInSection = new LinkedList<String>();
        String currentSection = null;
        Map<String, ConfigEntry> currentSectionMap = new LinkedHashMap<String, ConfigEntry>();
        this.sectionValuesMap.put(currentSection, currentSectionMap);
        this.sectionList.add(null);
        this.sectionContents.put(null, linesInSection);
        String line = null;
        int lineNum = 0;
        try {
            while ((line = brin.readLine()) != null) {
                ++lineNum;
                line = line.trim();
                if (!line.startsWith("#")) {
                    if (line.startsWith("[")) {
                        final int index = line.indexOf("]");
                        if (index == -1) {
                            this.loadErrors.add("Missing ']' at line " + lineNum + " of config file [" + this.configFilePath + "]");
                            continue;
                        }
                        currentSection = line.substring(1, index).trim();
                        if (this.sectionValuesMap.containsKey(currentSection)) {
                            this.loadErrors.add("Duplicate sections [" + currentSection + "] defined in config file [" + this.configFilePath + "]");
                            continue;
                        }
                        currentSectionMap = new LinkedHashMap<String, ConfigEntry>();
                        this.sectionValuesMap.put(currentSection, currentSectionMap);
                        this.sectionList.add(currentSection);
                        linesInSection = new LinkedList<String>();
                        this.sectionContents.put(currentSection, linesInSection);
                    }
                    else if (line.indexOf(61) != -1) {
                        final int index = line.indexOf(61);
                        String key = line.substring(0, index).trim();
                        String value = line.substring(index + 1).trim();
                        for (String nextLine = null; value.endsWith("\\") && !value.endsWith("\\\\") && (nextLine = brin.readLine()) != null; value = value.substring(0, value.length() - 1) + nextLine.trim()) {}
                        if (value.indexOf(92) != -1) {
                            value = StringUtils.unEscapeChars(value, new char[] { '\\' });
                        }
                        final boolean isEncoded = key.charAt(key.length() - 1) == '*';
                        if (isEncoded) {
                            key = key.substring(0, key.length() - 1);
                        }
                        ConfigEntry c = null;
                        try {
                            c = new ConfigEntry(this, currentSection, key, value, isEncoded, lineNum);
                            currentSectionMap.put(key, c);
                            this.allValuesMap.put(c.configKey, c);
                            line = "=" + c.configKey;
                        }
                        catch (ConfigRuntimeException e) {
                            this.loadErrors.add(e.getMessage());
                        }
                    }
                }
                linesInSection.addLast(line);
            }
        }
        catch (IOException e2) {
            this.loadErrors.add("IOException [" + e2.getLocalizedMessage() + "] caught at line [" + lineNum + "] while trying to read config file [" + this.configFilePath + "] at line [" + lineNum + "]");
        }
    }
    
    public synchronized String get(final String key) throws ConfigRuntimeException {
        final String value = this.get(key, null, null);
        if (value == null) {
            throw new ConfigRuntimeException("Key '" + key + "' not found in file '" + this.configFilePath + "'");
        }
        return value;
    }
    
    public synchronized String get(final String key, final Object[] args) throws ConfigRuntimeException {
        final String value = this.get(key, args, null);
        if (value == null) {
            throw new ConfigRuntimeException("Key '" + key + "' not found in file '" + this.configFilePath + "'");
        }
        return value;
    }
    
    public synchronized String get(final String key, final String defaultValue) throws ConfigRuntimeException {
        return this.get(key, null, defaultValue);
    }
    
    public synchronized String get(final String key, final Object[] args, final String defaultValue) throws ConfigRuntimeException {
        final ConfigEntry c = this.allValuesMap.get(key);
        if (c == null) {
            return defaultValue;
        }
        try {
            if (args == null) {
                return c.getValue();
            }
            return c.getValue(args);
        }
        catch (Exception e) {
            throw new ConfigRuntimeException("Exception of type [" + e.getClass().getName() + "] caught trying to retrieve value for [" + key + "] in config file [" + this.configFilePath + "]", e);
        }
    }
    
    public synchronized String getRawValue(final String key) {
        final ConfigEntry c = this.allValuesMap.get(key);
        return (c == null) ? null : c.getRawValue();
    }
    
    public synchronized boolean isEncoded(final String key) {
        final ConfigEntry c = this.allValuesMap.get(key);
        return c != null && c.isEncoded;
    }
    
    public synchronized void set(String key, final String value, final boolean createIfNotThere) throws ConfigRuntimeException {
        try {
            ConfigEntry c = this.allValuesMap.get(key);
            if (c == null && !createIfNotThere) {
                throw new ConfigRuntimeException("Key [" + key + "] not found in file [" + this.configFilePath + "]");
            }
            if (c == null) {
                String section = null;
                final int index = key.indexOf(".");
                if (index != -1) {
                    section = key.substring(0, index);
                    key = key.substring(index + 1);
                }
                c = new ConfigEntry(this, section, key, value, false, 0);
                Map<String, ConfigEntry> m = this.sectionValuesMap.get(section);
                if (m == null) {
                    m = new LinkedHashMap<String, ConfigEntry>();
                    this.sectionValuesMap.put(section, m);
                    final String lastSection = this.sectionList.getLast();
                    final LinkedList<String> lastSectionContents = this.sectionContents.get(lastSection);
                    final String lastLine = lastSectionContents.isEmpty() ? "" : lastSectionContents.getLast();
                    if (lastLine == null || !lastLine.trim().equals("")) {
                        lastSectionContents.addLast("");
                    }
                    this.sectionList.addLast(c.sectionName);
                    final LinkedList<String> l = new LinkedList<String>();
                    l.addLast("[" + c.sectionName + "]");
                    this.sectionContents.put(c.sectionName, l);
                }
                m.put(c.propName, c);
                this.allValuesMap.put(c.configKey, c);
                final LinkedList<String> i = this.sectionContents.get(c.sectionName);
                if (i.isEmpty()) {
                    i.add("");
                }
                if (i.getLast().equals("")) {
                    i.removeLast();
                }
                i.addLast("=" + c.configKey);
                i.addLast("");
            }
            else {
                c.setValue(value);
            }
            this.hasBeenModified = true;
        }
        catch (Exception e) {
            throw new ConfigRuntimeException("Exception of type [" + e.getClass().getName() + "] caught trying to set value for [" + key + "] in config file [" + this.configFilePath + "]", e);
        }
    }
    
    public synchronized void remove(final String key) throws ConfigRuntimeException {
        try {
            final ConfigEntry c = this.allValuesMap.get(key);
            if (c == null) {
                return;
            }
            this.allValuesMap.remove(key);
            String sectionName = null;
            String sectionKey = null;
            final int index = key.indexOf(".");
            if (index != -1) {
                sectionName = key.substring(0, index);
                sectionKey = key.substring(index + 1);
            }
            final Map<String, ConfigEntry> m = this.sectionValuesMap.get(sectionName);
            if (m != null) {
                m.remove(sectionKey);
                final List<String> l = this.sectionContents.get(sectionName);
                int x = -1;
                for (int i = 0; i < l.size(); ++i) {
                    if (l.get(i).toString().equals("=" + key)) {
                        x = i;
                    }
                }
                if (x != -1) {
                    l.remove(x);
                }
            }
            this.hasBeenModified = true;
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
            throw new ConfigRuntimeException("Exception of type [" + e.getClass().getName() + "] caught trying to remove value for [" + key + "] in config file [" + this.configFilePath + "]", e);
        }
    }
    
    public synchronized LinkedHashMap<String, String> getSectionMap(String section) throws ConfigRuntimeException {
        if (section.equals("")) {
            section = null;
        }
        final Map<String, ConfigEntry> m = this.sectionValuesMap.get(section);
        if (m == null) {
            throw new ConfigRuntimeException("Section '" + section + "' not found in file '" + this.configFilePath + "'");
        }
        final LinkedHashMap<String, String> newMap = new LinkedHashMap<String, String>();
        for (final String key : m.keySet()) {
            final ConfigEntry ce = m.get(key);
            newMap.put(key, ce.getValue());
        }
        return newMap;
    }
    
    public synchronized Set<String> getKeyNamesInSection(String section) throws ConfigRuntimeException {
        if (section.equals("")) {
            section = null;
        }
        final Map<String, ConfigEntry> m = this.sectionValuesMap.get(section);
        if (m == null) {
            throw new ConfigRuntimeException("Section '" + section + "' not found in file '" + this.configFilePath + "'");
        }
        return m.keySet();
    }
    
    public Map<String, ConfigEntry> getAllValuesMap() {
        return this.allValuesMap;
    }
    
    public synchronized Set<String> getKeyNames() {
        return this.allValuesMap.keySet();
    }
    
    public synchronized Set<String> getSectionNames() {
        final Set<String> s = new LinkedHashSet<String>();
        s.addAll(this.sectionValuesMap.keySet());
        s.remove(null);
        return s;
    }
    
    public synchronized void printOn(final PrintWriter out) {
        for (final String sectionName : this.sectionList) {
            final List<String> sectionList = this.sectionContents.get(sectionName);
            for (final String line : sectionList) {
                if (line.length() > 0 && line.charAt(0) == '=') {
                    final ConfigEntry c = this.allValuesMap.get(line.substring(1));
                    if (c == null) {
                        System.err.println("ERROR: No config file entry for [" + line.substring(1) + "]");
                    }
                    else {
                        String val = c.rawValue;
                        if (val.endsWith("\\")) {
                            val += "\\";
                        }
                        out.println(c.propName + (c.isEncoded ? "*" : "") + " = " + val);
                    }
                }
                else {
                    out.println(line);
                }
            }
        }
        out.flush();
    }
    
    public synchronized void save() throws ConfigRuntimeException {
        this.save(this.configFilePath);
    }
    
    public synchronized void save(final String path) throws ConfigRuntimeException {
        if (!this.hasBeenModified) {
            return;
        }
        PrintWriter out = null;
        try {
            final File configFile = new File(path);
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(configFile), LocaleMgr.getAssetAnalyzerFileEncoding())));
            this.printOn(out);
            this.hasBeenModified = false;
        }
        catch (IOException ie) {
            throw new ConfigRuntimeException("Trouble saving configuration to file \"" + path + "\"", ie);
        }
        finally {
            if (out != null) {
                out.close();
            }
        }
    }
    
    public synchronized String getContents() {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);
        this.printOn(pw);
        pw.flush();
        return sw.getBuffer().toString();
    }
    
    public synchronized String getLocation() {
        return this.configFilePath;
    }
    
    private static String getFileName(String path) {
        if (path == null) {
            path = "";
        }
        path = path.replace('\\', '/');
        final int i = path.lastIndexOf(47);
        if (i == -1) {
            return path;
        }
        return path.substring(i + 1);
    }
    
    public static void main(final String[] args) {
    }
}
