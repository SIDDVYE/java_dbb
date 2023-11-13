// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import java.util.Locale;

public class MigrationUtil
{
    public static String guessContentType(String filename) {
        if (filename == null) {
            return "application/unknown";
        }
        filename = filename.toLowerCase(Locale.ENGLISH);
        if (filename.endsWith(".java") || filename.endsWith(".cpp") || filename.endsWith(".txt") || filename.endsWith(".cc") || filename.endsWith(".c") || filename.endsWith(".cxx") || filename.endsWith(".h") || filename.endsWith(".properties") || filename.endsWith(".mf") || filename.endsWith(".pl") || filename.endsWith(".cvsignore") || filename.endsWith(".classpath") || filename.endsWith(".jazzignore") || filename.endsWith(".project")) {
            return "text/plain";
        }
        if (filename.endsWith(".jpg") || filename.endsWith(".jpeg")) {
            return "image/jpeg";
        }
        if (filename.endsWith(".gif")) {
            return "image/gif";
        }
        if (filename.endsWith(".xml")) {
            return "application/xml";
        }
        if (filename.endsWith(".png")) {
            return "image/png";
        }
        if (filename.endsWith(".html") || filename.endsWith(".htm")) {
            return "text/html";
        }
        if (filename.endsWith(".js")) {
            return "application/javascript";
        }
        if (filename.endsWith(".css")) {
            return "text/css";
        }
        if (filename.endsWith(".ico")) {
            return "image/vnd.microsoft.icon";
        }
        if (filename.endsWith(".mp4")) {
            return "video/mp4";
        }
        if (filename.endsWith(".zip")) {
            return "application/zip";
        }
        return "application/unknown";
    }
}
