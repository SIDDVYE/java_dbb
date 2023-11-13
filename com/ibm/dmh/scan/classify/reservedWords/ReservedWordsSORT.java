// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.TreeMap;
import java.util.Map;

public class ReservedWordsSORT
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2016\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final Map<String, String> reservedWords;
    
    public static boolean containsKey(final String token) {
        return ReservedWordsSORT.reservedWords.containsKey(token);
    }
    
    public static String get(final String token) {
        return ReservedWordsSORT.reservedWords.get(token);
    }
    
    static {
        (reservedWords = new TreeMap<String, String>()).put("ALTSEQ", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("DEBUG", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("END", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("INCLUDE", "ReservedWord, 3, 0");
        ReservedWordsSORT.reservedWords.put("INREC", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("JOINKEYS", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("JOIN", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("MERGE", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("MODS", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("OMIT", "ReservedWord, 3, 0");
        ReservedWordsSORT.reservedWords.put("OPTION", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("OUTFIL", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("OUTREC", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("RECORD", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("REFORMAT", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("SORT", "Verb,         2, 0");
        ReservedWordsSORT.reservedWords.put("SUM", "Verb,         2, 0");
    }
}
