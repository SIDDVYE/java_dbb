// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import com.ibm.dbb.dependency.LogicalDependency;
import com.ibm.json.java.JSONArray;
import java.io.FileNotFoundException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.dependency.LogicalFile;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import com.ibm.json.java.JSONObject;
import java.io.File;

public class MetadataStoreUtil implements MetadataStoreConstants
{
    public static String getLogicalName(final String file) {
        final File javaFile = new File(file);
        String fileName = javaFile.getName().toUpperCase();
        final int dot = fileName.lastIndexOf(46);
        if (dot > -1) {
            fileName = fileName.substring(0, dot);
        }
        return fileName;
    }
    
    public static void exportJSONToFile(final JSONObject jObj, final File saveFile) throws IOException {
        final FileWriter writer = new FileWriter(saveFile);
        jObj.serialize((Writer)writer);
    }
    
    public static JSONObject importJSONFromFile(final File saveFile) throws IOException {
        final FileReader reader = new FileReader(saveFile);
        return JSONObject.parse((Reader)reader);
    }
    
    public static void saveLogicalFileToJSON(final LogicalFile lfile, final File saveFile) throws BuildException {
        final JSONObject jObj = lfile.toJSON();
        try {
            exportJSONToFile(jObj, saveFile);
        }
        catch (IOException ioe) {
            throw new BuildException("An exception ocurred during Logical File exportation.", ioe);
        }
    }
    
    public static LogicalFile parseLogicalFileFromJSON(final File saveFile) throws BuildException {
        JSONObject jObj;
        try {
            jObj = importJSONFromFile(saveFile);
        }
        catch (FileNotFoundException fnfe) {
            return null;
        }
        catch (IOException ioe) {
            throw new BuildException("An exception occured while parsing logical file from file:" + saveFile.getAbsolutePath(), ioe);
        }
        final LogicalFile lFile = convertJSONObjectToLogicalFile(jObj);
        return lFile;
    }
    
    public static LogicalFile parseLogicalFileFromJSON(final String jsonString) throws BuildException {
        JSONObject jObj;
        try {
            jObj = JSONObject.parse(jsonString);
        }
        catch (IOException ioe) {
            throw new BuildException("An exception occured while parsing logical file from string: " + jsonString, ioe);
        }
        return convertJSONObjectToLogicalFile(jObj);
    }
    
    private static LogicalFile convertJSONObjectToLogicalFile(final JSONObject jObj) {
        final String lName = (String)jObj.get((Object)"lname");
        final String file = (String)jObj.get((Object)"file");
        final String language = (String)jObj.get((Object)"language");
        final Boolean cics = (Boolean)jObj.get((Object)"cics");
        final Boolean sql = (Boolean)jObj.get((Object)"sql");
        final Boolean dli = (Boolean)jObj.get((Object)"dli");
        Boolean mq = false;
        final Object tempMQ = jObj.get((Object)"mq");
        if (tempMQ != null) {
            mq = (Boolean)tempMQ;
        }
        final LogicalFile lFile = new LogicalFile(lName, file, language, cics, sql, dli, mq);
        final JSONArray jArray = (JSONArray)jObj.get((Object)"logicalDependencies");
        if (jArray != null && jArray.size() > 0) {
            for (int i = 0; i < jArray.size(); ++i) {
                final JSONObject jDep = (JSONObject)jArray.get(i);
                final LogicalDependency lDep = convertJSONObjectToLogicalDependency(jDep);
                lFile.addLogicalDependency(lDep);
            }
        }
        return lFile;
    }
    
    private static LogicalDependency convertJSONObjectToLogicalDependency(final JSONObject jObj) {
        final String lName = (String)jObj.get((Object)"lname");
        final String library = (String)jObj.get((Object)"library");
        final String category = (String)jObj.get((Object)"category");
        return new LogicalDependency(lName, library, category);
    }
    
    public static Date parseDate(final String dateString) throws BuildException {
        if (dateString == null) {
            return null;
        }
        final SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", new Locale("us"));
        try {
            return sdf.parse(dateString);
        }
        catch (ParseException pe) {
            throw new BuildException("Error parsing date", pe);
        }
    }
}
