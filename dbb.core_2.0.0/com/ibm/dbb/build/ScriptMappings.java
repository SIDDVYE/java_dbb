// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.util.HashSet;
import java.util.Set;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ScriptMappings
{
    @Deprecated
    public static final String SCRIPT_MAPPING_KEY = "scriptMapping";
    public static final String DBB_SCRIPT_MAPPING_KEY = "dbb.scriptMapping";
    
    public static String getScriptName(final String file) {
        String scriptName = BuildProperties.getFileProperty("dbb.scriptMapping", file);
        if (scriptName == null) {
            scriptName = BuildProperties.getFileProperty("scriptMapping", file);
        }
        return scriptName;
    }
    
    public static void setScriptName(final String scriptName, final List<String> filePatterns) {
        BuildProperties.setFileProperty("dbb.scriptMapping", scriptName, filePatterns);
    }
    
    public static void addFilePattern(final String scriptName, final String filePattern) {
        BuildProperties.addFilePattern("dbb.scriptMapping", scriptName, filePattern);
    }
    
    public static void addFilePatterns(final String scriptName, final List<String> filePatterns) {
        BuildProperties.addFilePatterns("dbb.scriptMapping", scriptName, filePatterns);
    }
    
    public static boolean isMapped(final String scriptName, final String file) {
        if (scriptName == null) {
            return false;
        }
        String scriptMapping = BuildProperties.getFileProperty("dbb.scriptMapping", file);
        if (scriptMapping == null) {
            scriptMapping = BuildProperties.getFileProperty("scriptMapping", file);
        }
        return scriptName.equals(scriptMapping);
    }
    
    public static List<String> getMappedList(final String scriptName, final List<String> files) {
        final ArrayList<String> buildList = new ArrayList<String>();
        for (final String file : files) {
            if (isMapped(scriptName, file)) {
                buildList.add(file);
            }
        }
        return buildList;
    }
    
    public static List<String> getMappedList(final String scriptName, final File file) throws IOException {
        return getMappedList(scriptName, file, "Cp1047");
    }
    
    public static List<String> getMappedList(final String scriptName, final File file, final String encoding) throws IOException {
        BufferedReader br = null;
        final ArrayList<String> files = new ArrayList<String>();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding));
            String line;
            while ((line = br.readLine()) != null) {
                files.add(line);
            }
        }
        finally {
            if (br != null) {
                br.close();
            }
        }
        return getMappedList(scriptName, files);
    }
    
    public static Set<String> getScriptNames() {
        Set<String> scriptNames = BuildProperties.filePropertyValueKeySet().get("dbb.scriptMapping");
        if (scriptNames == null) {
            scriptNames = BuildProperties.filePropertyValueKeySet().get("scriptMapping");
        }
        return (scriptNames != null) ? scriptNames : new HashSet<String>();
    }
}
