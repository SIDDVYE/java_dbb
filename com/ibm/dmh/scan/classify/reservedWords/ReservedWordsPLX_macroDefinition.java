// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.ArrayList;
import java.util.List;

public class ReservedWordsPLX_macroDefinition
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final List<String> reservedWords;
    
    public static boolean contains(final String token) {
        return ReservedWordsPLX_macroDefinition.reservedWords.contains(token);
    }
    
    static {
        (reservedWords = new ArrayList<String>(22)).add("ACT");
        ReservedWordsPLX_macroDefinition.reservedWords.add("ANS");
        ReservedWordsPLX_macroDefinition.reservedWords.add("ANSWER");
        ReservedWordsPLX_macroDefinition.reservedWords.add("BANS");
        ReservedWordsPLX_macroDefinition.reservedWords.add("BLOCKANSWER");
        ReservedWordsPLX_macroDefinition.reservedWords.add("DEACT");
        ReservedWordsPLX_macroDefinition.reservedWords.add("DEACTIVATE");
        ReservedWordsPLX_macroDefinition.reservedWords.add("DCL");
        ReservedWordsPLX_macroDefinition.reservedWords.add("DECLARE");
        ReservedWordsPLX_macroDefinition.reservedWords.add("DO");
        ReservedWordsPLX_macroDefinition.reservedWords.add("GO");
        ReservedWordsPLX_macroDefinition.reservedWords.add("IF");
        ReservedWordsPLX_macroDefinition.reservedWords.add("INCLUDE");
        ReservedWordsPLX_macroDefinition.reservedWords.add("ITERATE");
        ReservedWordsPLX_macroDefinition.reservedWords.add("LEAVE");
        ReservedWordsPLX_macroDefinition.reservedWords.add("NOSCAN");
        ReservedWordsPLX_macroDefinition.reservedWords.add("NOTE");
        ReservedWordsPLX_macroDefinition.reservedWords.add("RESCAN");
        ReservedWordsPLX_macroDefinition.reservedWords.add("RETURN");
        ReservedWordsPLX_macroDefinition.reservedWords.add("SCAN");
        ReservedWordsPLX_macroDefinition.reservedWords.add("SELECT");
    }
}
