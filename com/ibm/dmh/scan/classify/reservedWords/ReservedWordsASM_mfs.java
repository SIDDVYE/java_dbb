// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.TreeMap;
import java.util.Map;

public class ReservedWordsASM_mfs
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final Map<String, String> reservedWords;
    
    public static boolean containsKey(final String token) {
        return ReservedWordsASM_mfs.reservedWords.containsKey(token);
    }
    
    public static String get(final String token) {
        return ReservedWordsASM_mfs.reservedWords.get(token);
    }
    
    static {
        (reservedWords = new TreeMap<String, String>()).put("ALPHA", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("COPY", "ReservedWord,  4,  0");
        ReservedWordsASM_mfs.reservedWords.put("DEV", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("DFLD", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("DIV", "Verb,          2,  0");
        ReservedWordsASM_mfs.reservedWords.put("DO", "Verb,          3,  0");
        ReservedWordsASM_mfs.reservedWords.put("DPAGE", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("EJECT", "Ignore,        2,  0");
        ReservedWordsASM_mfs.reservedWords.put("END", "ReservedWord,  4,  0");
        ReservedWordsASM_mfs.reservedWords.put("ENDDO", "Verb,          3,  0");
        ReservedWordsASM_mfs.reservedWords.put("EQU", "ReservedWord,  4,  0");
        ReservedWordsASM_mfs.reservedWords.put("FMT", "Verb,          3, 87");
        ReservedWordsASM_mfs.reservedWords.put("FMTEND", "Verb,          3, 87");
        ReservedWordsASM_mfs.reservedWords.put("IF", "Verb,          3,  0");
        ReservedWordsASM_mfs.reservedWords.put("LPAGE", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("MFLD", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("MSG", "Verb,          3, 87");
        ReservedWordsASM_mfs.reservedWords.put("MSGEND", "Verb,          3, 87");
        ReservedWordsASM_mfs.reservedWords.put("PASSWORD", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("PD", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("PDB", "Verb,          3, 87");
        ReservedWordsASM_mfs.reservedWords.put("PDBEND", "Verb,          3, 87");
        ReservedWordsASM_mfs.reservedWords.put("PPAGE", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("PRINT", "ReservedWord,  4,  0");
        ReservedWordsASM_mfs.reservedWords.put("RCD", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("RESCAN", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("SEG", "ReservedWord,  4, 87");
        ReservedWordsASM_mfs.reservedWords.put("SPACE", "Ignore,        2,  0");
        ReservedWordsASM_mfs.reservedWords.put("STACK", "Verb,          2,  0");
        ReservedWordsASM_mfs.reservedWords.put("TABLE", "Verb,          3, 87");
        ReservedWordsASM_mfs.reservedWords.put("TABLEEND", "Verb,          3, 87");
        ReservedWordsASM_mfs.reservedWords.put("TITLE", "Ignore,        3,  0");
        ReservedWordsASM_mfs.reservedWords.put("UNSTACK", "Verb,          3, 87");
    }
}
