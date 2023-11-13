// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.utils;

import com.ibm.dmh.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;
import java.io.FileInputStream;
import java.util.ResourceBundle;
import java.net.URL;
import java.io.File;
import java.util.Locale;
import com.ibm.dmh.util.Environment;

public class LocaleMgr
{
    private static LocaleMgr localeMgr;
    
    public static String getExternalDefaultEncoding() {
        final String fileEncoding = System.getProperty("externalFileEncoding");
        if (fileEncoding != null && !fileEncoding.trim().equals("")) {
            return fileEncoding;
        }
        if (!Environment.isZOS()) {
            return "UTF-8";
        }
        final String language = Locale.getDefault().getLanguage();
        final String country = Locale.getDefault().getCountry();
        if (language.equals("ja") || country.equals("JP")) {
            return "Cp939";
        }
        return "Cp1047";
    }
    
    public static String getLocaleSpecificPath(String filePath, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        final char fsc = File.separatorChar;
        filePath = filePath.replace('\\', fsc).replace('/', fsc);
        String directory = filePath.substring(0, filePath.lastIndexOf(fsc));
        final String fileName = filePath.substring(filePath.lastIndexOf(fsc) + 1);
        final String base = fileName.substring(0, fileName.lastIndexOf(46));
        final String extension = fileName.substring(fileName.lastIndexOf(46));
        String localeString = "_" + locale.toString() + "_";
        while (localeString.length() > 0) {
            localeString = localeString.substring(0, localeString.lastIndexOf(95));
            final String path = directory + fsc + base + localeString + extension;
            if (new File(path).exists()) {
                return path;
            }
        }
        directory = directory + fsc + "i18n";
        localeString = "_" + locale.toString() + "_";
        while (localeString.length() > 0) {
            localeString = localeString.substring(0, localeString.lastIndexOf(95));
            final String path = directory + fsc + base + localeString + extension;
            if (new File(path).exists()) {
                return path;
            }
        }
        return null;
    }
    
    public static URL getLocaleSpecificClasspathFile(final String fileName, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        final String base = fileName.substring(0, fileName.lastIndexOf(46));
        final String extension = fileName.substring(fileName.lastIndexOf(46));
        String localeString = "_" + locale.toString() + "_";
        while (localeString.length() > 0) {
            localeString = localeString.substring(0, localeString.lastIndexOf(95));
            final String testFile = "/" + base + localeString + extension;
            final URL url = LocaleMgr.localeMgr.getClass().getResource(testFile);
            if (url != null) {
                return url;
            }
        }
        localeString = "_" + locale.toString() + "_";
        while (localeString.length() > 0) {
            localeString = localeString.substring(0, localeString.lastIndexOf(95));
            final String testFile = "/i18n/" + base + localeString + extension;
            final URL url = LocaleMgr.localeMgr.getClass().getResource(testFile);
            if (url != null) {
                return url;
            }
        }
        return null;
    }
    
    public static ResourceBundle getResourceBundle(String filePath, final Locale locale) throws IOException {
        filePath = filePath.substring(0, filePath.lastIndexOf(46)) + ".properties";
        final String path = getLocaleSpecificPath(filePath, locale);
        if (path == null) {
            return null;
        }
        return new PropertyResourceBundle(new FileInputStream(new File(path)));
    }
    
    public static Locale getLocale(final String localeString) {
        final String[] s = StringUtils.split(localeString, '_');
        if (s.length == 0) {
            return null;
        }
        if (s.length == 1) {
            return new Locale(s[0], "");
        }
        if (s.length == 2) {
            return new Locale(s[0], s[1]);
        }
        return new Locale(s[0], s[1], s[2]);
    }
    
    static {
        LocaleMgr.localeMgr = new LocaleMgr();
    }
}
