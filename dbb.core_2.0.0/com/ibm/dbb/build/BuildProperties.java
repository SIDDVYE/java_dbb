// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.util.Collection;
import java.util.TreeSet;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.util.Set;
import java.util.Iterator;
import com.ibm.dbb.utils.FilePatternMatcher;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import com.ibm.dbb.build.internal.ValidationHelper;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.internal.Utils;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class BuildProperties implements Map<String, String>
{
    private static HashMap<String, String> basicProperties;
    private static HashMap<String, HashMap<String, List<String>>> fileProperties;
    private static BuildProperties _instance;
    public static final String METADATA_STORE_TYPE = "dbb.metadata.type";
    public static final String METADATA_STORE_TYPE_FILE = "file";
    public static final String METADATA_STORE_TYPE_DB2 = "db2";
    public static final String METADATA_STORE_USERID = "dbb.metadata.server.userId";
    public static final String METADATA_STORE_URL = "dbb.metadata.db2.url";
    public static final String METADATA_STORE_PASSWORD = "dbb.metadata.db2.password";
    public static final String METADATA_STORE_SCHEMA = "dbb.metadata.db2.schema";
    public static final String BUILD_REPORT_ONLY = "dbb.command.reportOnly";
    
    private BuildProperties() {
    }
    
    public static BuildProperties getInstance() {
        if (BuildProperties._instance == null) {
            BuildProperties._instance = new BuildProperties();
        }
        return BuildProperties._instance;
    }
    
    public static void load(final String sourceDir, final String file) throws IOException {
        final File jfile = Utils.createFile(file, sourceDir);
        ValidationHelper.fileExists(jfile, Messages.getMessage("BuildProperties_FILE_NOT_FOUND", jfile));
        load(jfile, Utils.retrieveHFSEncoding(jfile));
    }
    
    public static void load(final String sourceDir, final String file, final String encoding) throws IOException {
        load(Utils.createFile(file, sourceDir), encoding);
    }
    
    public static void load(final File file) throws IOException {
        ValidationHelper.fileExists(file, Messages.getMessage("BuildProperties_FILE_NOT_FOUND", file));
        load(file, Utils.retrieveHFSEncoding(file));
    }
    
    public static void load(final File file, final String encoding) throws IOException {
        if (file.getName().endsWith(".properties")) {
            loadProperties(new FileInputStream(file), encoding);
            return;
        }
        throw new IOException(Messages.getMessage("BuildProperties_UNKNOWN_FILE_TYPE", file.getName()));
    }
    
    private static void loadProperties(final InputStream inStream, final String encoding) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(inStream, encoding));
            String line = null;
            String rawProperty = null;
            boolean inConcat = false;
            while ((line = br.readLine()) != null) {
                if (!line.trim().startsWith("#") && !line.trim().startsWith("?")) {
                    if (line.trim().length() == 0) {
                        continue;
                    }
                    inConcat = line.trim().endsWith("\\");
                    if (inConcat) {
                        line = line.trim().substring(0, line.trim().length() - 1);
                    }
                    rawProperty = ((rawProperty == null) ? line : (rawProperty + line));
                    if (inConcat) {
                        continue;
                    }
                    final int idx = rawProperty.indexOf("=");
                    if (idx > -1) {
                        final String key = rawProperty.substring(0, idx).trim();
                        final String rawValue = rawProperty.substring(idx + 1).trim();
                        String delim = "::";
                        String regex = "(?<!\\\\)" + Pattern.quote(delim);
                        final String[] tokens = rawValue.split(regex, 2);
                        if (tokens.length > 1) {
                            final String value = unEscapeColons(tokens[0].trim());
                            final String patternString = tokens[1].trim();
                            final List<String> filePatterns = new ArrayList<String>();
                            delim = ",";
                            regex = "(?<!\\\\)" + Pattern.quote(delim);
                            final String[] split;
                            final String[] patterntokens = split = patternString.split(regex);
                            for (final String pattern : split) {
                                filePatterns.add(pattern.replace("\\,", ",").trim());
                            }
                            setFileProperty(key, value, filePatterns);
                        }
                        else {
                            setProperty(key, unEscapeColons(rawValue));
                        }
                    }
                    rawProperty = null;
                }
            }
        }
        finally {
            if (br != null) {
                br.close();
            }
        }
    }
    
    public static String getFileProperty(final String key, final String file) {
        final HashMap<String, List<String>> valueMap = BuildProperties.fileProperties.get(key);
        if (valueMap == null) {
            return getProperty(key);
        }
        for (final Entry<String, List<String>> entry : valueMap.entrySet()) {
            final FilePatternMatcher matcher = new FilePatternMatcher(entry.getValue());
            if (matcher.matches(file)) {
                return replaceReferences(entry.getKey());
            }
        }
        return getProperty(key);
    }
    
    public static String getProperty(final String key) {
        return getProperty(key, null);
    }
    
    private static String getProperty(final String key, final List<String> used) {
        final String rawValue = BuildProperties.basicProperties.get(key);
        final List<String> usedProps = (used == null) ? new ArrayList<String>() : used;
        usedProps.add(key);
        return replaceReferences(rawValue, usedProps);
    }
    
    private static String replaceReferences(final String rawValue) {
        return replaceReferences(rawValue, new ArrayList<String>());
    }
    
    private static String replaceReferences(final String rawValue, final List<String> used) {
        if (rawValue == null) {
            return rawValue;
        }
        String res = "";
        String propName;
        String replace;
        for (int lagger = 0, curr = 0; curr < rawValue.length(); curr = rawValue.indexOf("}", lagger) + 1, propName = rawValue.substring(lagger + 2, curr - 1), replace = replaceReference(propName, used), res += replace, lagger = curr) {
            curr = rawValue.indexOf("${", lagger);
            if (curr == -1) {
                res += rawValue.substring(lagger, rawValue.length());
                break;
            }
            res += rawValue.substring(lagger, curr);
            lagger = curr;
        }
        return res;
    }
    
    private static String replaceReference(final String ref, final List<String> used) {
        if (used.contains(ref)) {
            return "${" + ref + "}";
        }
        String property = BuildProperties.basicProperties.get(ref);
        if (property == null) {
            return "${" + ref + "}";
        }
        if (property.indexOf("${") != -1) {
            property = getProperty(ref, used);
        }
        return property;
    }
    
    public static void setFileProperty(final String key, final String value, final String filePattern) {
        final List<String> filePatterns = new ArrayList<String>();
        filePatterns.add(filePattern);
        setFileProperty(key, value, filePatterns);
    }
    
    public static void setFileProperty(final String key, final String value, final List<String> filePatterns) {
        HashMap<String, List<String>> valueMap = BuildProperties.fileProperties.get(key);
        if (valueMap == null) {
            valueMap = new HashMap<String, List<String>>();
            BuildProperties.fileProperties.put(key, valueMap);
        }
        valueMap.put(value, filePatterns);
    }
    
    public static void setProperty(final String key, final String value) {
        BuildProperties.basicProperties.put(key, value);
    }
    
    public static void removeProperty(final String key) {
        BuildProperties.basicProperties.remove(key);
    }
    
    public static void removeFileProperty(final String key) {
        BuildProperties.fileProperties.remove(key);
    }
    
    public static void clearProperties() {
        BuildProperties.basicProperties.clear();
    }
    
    public static void clearFileProperties() {
        BuildProperties.fileProperties.clear();
    }
    
    public static Set<String> basicPropertyKeySet() {
        return BuildProperties.basicProperties.keySet();
    }
    
    public static Map<String, Set<String>> filePropertyValueKeySet() {
        final Map<String, Set<String>> valueSetMap = new HashMap<String, Set<String>>();
        for (final String propKey : BuildProperties.fileProperties.keySet()) {
            valueSetMap.put(propKey, BuildProperties.fileProperties.get(propKey).keySet());
        }
        return valueSetMap;
    }
    
    public static List<String> getFilePropertyPatterns(final String key, final String value) {
        final HashMap<String, List<String>> valueMap = BuildProperties.fileProperties.get(key);
        if (valueMap == null) {
            return new ArrayList<String>();
        }
        final List<String> patterns = valueMap.get(value);
        return (patterns != null) ? patterns : new ArrayList<String>();
    }
    
    public static void addFilePattern(final String key, final String value, final String filePattern) {
        HashMap<String, List<String>> valueMap = BuildProperties.fileProperties.get(key);
        if (valueMap == null) {
            valueMap = new HashMap<String, List<String>>();
            BuildProperties.fileProperties.put(key, valueMap);
        }
        List<String> filePatterns = valueMap.get(value);
        if (filePatterns == null) {
            filePatterns = new ArrayList<String>();
            valueMap.put(value, filePatterns);
        }
        filePatterns.add(filePattern);
    }
    
    public static void addFilePatterns(final String key, final String value, final List<String> filePatterns) {
        for (final String filePattern : filePatterns) {
            addFilePattern(key, value, filePattern);
        }
    }
    
    protected static String unEscapeColons(final String rawString) {
        return rawString.replace("\\::", "::");
    }
    
    protected static String toJSON() throws IOException {
        final JSONObject json = new JSONObject();
        final JSONArray defaultPropArray = new JSONArray();
        json.put((Object)"defaultProperties", (Object)defaultPropArray);
        for (final Entry<String, String> entry : BuildProperties.basicProperties.entrySet()) {
            final JSONObject jObj = new JSONObject();
            jObj.put((Object)"key", (Object)entry.getKey());
            jObj.put((Object)"value", (Object)entry.getValue());
            defaultPropArray.add((Object)jObj);
        }
        final JSONArray filePropArray = new JSONArray();
        json.put((Object)"fileProperties", (Object)filePropArray);
        for (final Entry<String, HashMap<String, List<String>>> entry2 : BuildProperties.fileProperties.entrySet()) {
            for (final Entry<String, List<String>> valueEntry : entry2.getValue().entrySet()) {
                final List<String> patterns = valueEntry.getValue();
                final JSONObject jObj2 = new JSONObject();
                jObj2.put((Object)"key", (Object)entry2.getKey());
                jObj2.put((Object)"value", (Object)valueEntry.getKey());
                final JSONArray patternArray = new JSONArray();
                jObj2.put((Object)"filePatterns", (Object)patternArray);
                for (final String pattern : patterns) {
                    patternArray.add((Object)pattern);
                }
                filePropArray.add((Object)jObj2);
            }
        }
        return json.serialize(true);
    }
    
    public static String list() {
        final TreeSet<String> sorted = new TreeSet<String>();
        final Set<String> basicKeys = basicPropertyKeySet();
        for (final String key : basicKeys) {
            sorted.add(key + "=" + getProperty(key));
        }
        final Map<String, Set<String>> fileKeyMap = filePropertyValueKeySet();
        final Set<String> fileKeyMapKeys = fileKeyMap.keySet();
        for (final String key2 : fileKeyMapKeys) {
            final Set<String> values = fileKeyMap.get(key2);
            for (final String value : values) {
                final List<String> patterns = getFilePropertyPatterns(key2, value);
                final StringBuffer patternList = new StringBuffer();
                for (final String pattern : patterns) {
                    patternList.append(pattern + ",");
                }
                if (patternList.length() > 0) {
                    patternList.deleteCharAt(patternList.length() - 1);
                }
                sorted.add(key2 + "=" + value + "::" + (Object)patternList);
            }
        }
        return String.join("\n", sorted);
    }
    
    public static void staticReset() {
        BuildProperties.basicProperties = new HashMap<String, String>();
        BuildProperties.fileProperties = new HashMap<String, HashMap<String, List<String>>>();
        BuildProperties._instance = new BuildProperties();
    }
    
    @Override
    public void clear() {
        BuildProperties.basicProperties.clear();
    }
    
    @Override
    public boolean containsKey(final Object arg0) {
        return BuildProperties.basicProperties.containsKey(arg0);
    }
    
    @Override
    public boolean containsValue(final Object arg0) {
        final String searchedValue = replaceReferences(arg0.toString());
        for (final String value : BuildProperties.basicProperties.values()) {
            if (replaceReferences(value.toString()).equals(searchedValue)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Set<Entry<String, String>> entrySet() {
        return BuildProperties.basicProperties.entrySet();
    }
    
    @Override
    public String get(final Object arg0) {
        if (arg0 instanceof String) {
            return getProperty((String)arg0);
        }
        return BuildProperties.basicProperties.get(arg0);
    }
    
    @Override
    public boolean isEmpty() {
        return BuildProperties.basicProperties.isEmpty();
    }
    
    @Override
    public Set<String> keySet() {
        return BuildProperties.basicProperties.keySet();
    }
    
    @Override
    public String put(final String arg0, final String arg1) {
        return BuildProperties.basicProperties.put(arg0, arg1);
    }
    
    @Override
    public void putAll(final Map<? extends String, ? extends String> arg0) {
        BuildProperties.basicProperties.putAll(arg0);
    }
    
    @Override
    public String remove(final Object arg0) {
        return BuildProperties.basicProperties.remove(arg0);
    }
    
    @Override
    public int size() {
        return BuildProperties.basicProperties.size();
    }
    
    @Override
    public Collection<String> values() {
        return BuildProperties.basicProperties.values();
    }
    
    static {
        BuildProperties.basicProperties = new HashMap<String, String>();
        BuildProperties.fileProperties = new HashMap<String, HashMap<String, List<String>>>();
    }
}
