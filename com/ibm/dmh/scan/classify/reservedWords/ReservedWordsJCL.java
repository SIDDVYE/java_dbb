// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.TreeMap;
import java.util.Map;

public class ReservedWordsJCL
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2014\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final Map<String, String> reservedWords;
    
    public static boolean containsKey(final String token) {
        return ReservedWordsJCL.reservedWords.containsKey(token);
    }
    
    public static String get(final String token) {
        return ReservedWordsJCL.reservedWords.get(token);
    }
    
    static {
        reservedWords = new TreeMap<String, String>();
    }
}
