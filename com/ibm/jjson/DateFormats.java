// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class DateFormats
{
    public static DateFormat DEFAULT;
    public static DateFormat ISO8601;
    public static DateFormat RFC822;
    
    static {
        DateFormats.DEFAULT = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        DateFormats.ISO8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        DateFormats.RFC822 = new SimpleDateFormat("EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z");
    }
}
