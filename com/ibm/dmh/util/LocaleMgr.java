// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.regex.Matcher;
import java.net.MalformedURLException;
import java.util.MissingResourceException;
import java.net.URLClassLoader;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.ResourceBundle;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Locale;

public class LocaleMgr
{
    private static String externalDefaultEncoding;
    
    public static String getExternalDefaultEncoding() {
        final String fileEncoding = System.getProperty("externalFileEncoding");
        if (!StringUtils.isEmpty(fileEncoding)) {
            return fileEncoding;
        }
        if (!StringUtils.isEmpty(LocaleMgr.externalDefaultEncoding)) {
            return LocaleMgr.externalDefaultEncoding;
        }
        if (Environment.isZOS()) {
            final String language = Locale.getDefault().getLanguage();
            if (language.equals("en")) {
                return "Cp1047";
            }
            if (language.equals("ja")) {
                return "Cp930";
            }
            if (language.equals("zh")) {
                return "Cp1388";
            }
        }
        return Charset.defaultCharset().toString();
    }
    
    public static String getAssetAnalyzerFileEncoding() {
        final String fileEncoding = System.getProperty("assetAnalyzerFileEncoding");
        if (!StringUtils.isEmpty(fileEncoding)) {
            return fileEncoding;
        }
        if (Environment.isZOS()) {
            return "Cp1047";
        }
        return Charset.defaultCharset().toString();
    }
    
    public static ResourceBundle getBundleForFile(final File f) {
        return getBundleForFile(f.getAbsolutePath(), Locale.getDefault());
    }
    
    public static ResourceBundle getBundleForFile(final String path) {
        return getBundleForFile(path, Locale.getDefault());
    }
    
    public static ResourceBundle getBundleForFile(String path, final Locale locale) {
        path = path.replace('\\', '/');
        final Pattern p = Pattern.compile("\\/?([^\\/].*)[\\/]([^\\/\\.]+)\\.[^\\.]+");
        final Matcher m = p.matcher(path);
        if (!m.matches()) {
            return null;
        }
        final String directory = m.group(1);
        final String bundleName = m.group(2);
        try {
            final ClassLoader c = new URLClassLoader(new URL[] { new URL("file:/" + directory + "/"), new URL("file:/" + directory + "/i18n/") });
            return ResourceBundle.getBundle(bundleName, locale, c);
        }
        catch (IllegalArgumentException ex) {}
        catch (MissingResourceException ex2) {}
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        try {
            path = directory.replace('/', '.') + "." + bundleName;
            return ResourceBundle.getBundle(path, locale);
        }
        catch (IllegalArgumentException ex3) {}
        catch (MissingResourceException ex4) {}
        try {
            path = directory.replace('/', '.') + ".i18n." + bundleName;
            return ResourceBundle.getBundle(path, locale);
        }
        catch (IllegalArgumentException ex5) {}
        catch (MissingResourceException ex6) {}
        return null;
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
    
    public static boolean isEnglishLocale() {
        return Locale.getDefault().getLanguage().equals("en");
    }
    
    public static void setExternalDefaultEncoding(final String externalDefaultEncoding) {
        LocaleMgr.externalDefaultEncoding = externalDefaultEncoding;
    }
    
    static {
        LocaleMgr.externalDefaultEncoding = null;
    }
}
