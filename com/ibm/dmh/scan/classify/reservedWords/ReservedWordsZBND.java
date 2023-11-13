// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.HashSet;
import java.util.Set;

public class ReservedWordsZBND
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2014, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final Set<String> reservedWords;
    
    public static boolean contains(final String token) {
        return ReservedWordsZBND.reservedWords.contains(token);
    }
    
    static {
        (reservedWords = new HashSet<String>()).add("ALIAS");
        ReservedWordsZBND.reservedWords.add("ALIGNT");
        ReservedWordsZBND.reservedWords.add("AUTOCALL");
        ReservedWordsZBND.reservedWords.add("CHANGE");
        ReservedWordsZBND.reservedWords.add("ENTRY");
        ReservedWordsZBND.reservedWords.add("EXPAND");
        ReservedWordsZBND.reservedWords.add("IDENTIFY");
        ReservedWordsZBND.reservedWords.add("IMPORT");
        ReservedWordsZBND.reservedWords.add("INCLUDE");
        ReservedWordsZBND.reservedWords.add("INSERT");
        ReservedWordsZBND.reservedWords.add("LIBRARY");
        ReservedWordsZBND.reservedWords.add("MODE");
        ReservedWordsZBND.reservedWords.add("NAME");
        ReservedWordsZBND.reservedWords.add("ORDER");
        ReservedWordsZBND.reservedWords.add("OVERLAY");
        ReservedWordsZBND.reservedWords.add("PAGE");
        ReservedWordsZBND.reservedWords.add("RENAME");
        ReservedWordsZBND.reservedWords.add("REPLACE");
        ReservedWordsZBND.reservedWords.add("SETCODE");
        ReservedWordsZBND.reservedWords.add("SETOPT");
        ReservedWordsZBND.reservedWords.add("SETSSI");
    }
}
