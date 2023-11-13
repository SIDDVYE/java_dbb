// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.ArrayList;
import java.util.List;

public class ReservedWordsREXX
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final List<String> reservedWords;
    
    public static boolean contains(final String token) {
        return ReservedWordsREXX.reservedWords.contains(token);
    }
    
    static {
        (reservedWords = new ArrayList<String>()).add("ADDRESS");
        ReservedWordsREXX.reservedWords.add("ARG");
        ReservedWordsREXX.reservedWords.add("CALL");
        ReservedWordsREXX.reservedWords.add("DELSTACK");
        ReservedWordsREXX.reservedWords.add("DO");
        ReservedWordsREXX.reservedWords.add("DROP");
        ReservedWordsREXX.reservedWords.add("DROPBUF");
        ReservedWordsREXX.reservedWords.add("EXECIO");
        ReservedWordsREXX.reservedWords.add("EXECUTIL");
        ReservedWordsREXX.reservedWords.add("EXIT");
        ReservedWordsREXX.reservedWords.add("HE");
        ReservedWordsREXX.reservedWords.add("HI");
        ReservedWordsREXX.reservedWords.add("HT");
        ReservedWordsREXX.reservedWords.add("IF");
        ReservedWordsREXX.reservedWords.add("INTERPRET");
        ReservedWordsREXX.reservedWords.add("ITERATE");
        ReservedWordsREXX.reservedWords.add("LEAVE");
        ReservedWordsREXX.reservedWords.add("MAKEBUF");
        ReservedWordsREXX.reservedWords.add("NEWSTACK");
        ReservedWordsREXX.reservedWords.add("NOP");
        ReservedWordsREXX.reservedWords.add("NUMERIC");
        ReservedWordsREXX.reservedWords.add("OPTIONS");
        ReservedWordsREXX.reservedWords.add("PARSE");
        ReservedWordsREXX.reservedWords.add("PROCEDURE");
        ReservedWordsREXX.reservedWords.add("PULL");
        ReservedWordsREXX.reservedWords.add("PUSH");
        ReservedWordsREXX.reservedWords.add("QBUF");
        ReservedWordsREXX.reservedWords.add("QELEM");
        ReservedWordsREXX.reservedWords.add("QSTACK");
        ReservedWordsREXX.reservedWords.add("QUEUE");
        ReservedWordsREXX.reservedWords.add("RETURN");
        ReservedWordsREXX.reservedWords.add("RT");
        ReservedWordsREXX.reservedWords.add("SAY");
        ReservedWordsREXX.reservedWords.add("SELECT");
        ReservedWordsREXX.reservedWords.add("SIGNAL");
        ReservedWordsREXX.reservedWords.add("SUBCOM");
        ReservedWordsREXX.reservedWords.add("TE");
        ReservedWordsREXX.reservedWords.add("TRACE");
        ReservedWordsREXX.reservedWords.add("TS");
        ReservedWordsREXX.reservedWords.add("UPPER");
    }
}
