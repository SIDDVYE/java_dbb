// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.TreeMap;
import java.util.Map;

public class ReservedWordsASM_netView
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final Map<String, String> reservedWords;
    
    public static boolean containsKey(final String token) {
        return ReservedWordsASM_netView.reservedWords.containsKey(token);
    }
    
    public static String get(final String token) {
        return ReservedWordsASM_netView.reservedWords.get(token);
    }
    
    static {
        (reservedWords = new TreeMap<String, String>()).put("AAUTISAW", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("AAUTLOGR", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("BNJTBRF", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSI6REGS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSI6SNDS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIABN", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIAIFRO", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIART", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIASYPN", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIAUTO", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIBAM", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIBAMKW", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIC2T", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSICBH", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSICBHLG", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSICBS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSICES", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSICLB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSICLS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSICVTHE", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSICWB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIDATIM", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIDCT", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIDEL", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIDKS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIDSB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIDSRB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIDQT", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIDTR", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIELB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIFIND", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIFRE", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIFREBS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIGET", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIGETDS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIGFPL", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIHREGS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIHSNDS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIID", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIIFR", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIINTLK", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIKVS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSILCS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSILOD", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSILOGDS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIMBS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIMDS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIMMDBS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIMQS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIMVT", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSINOR", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIOIS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIPAS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIPDB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIPOP", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIPOS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIPRS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIPSS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIPUSH", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIQOS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIQRS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIRDS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIRXEBS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISCB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISCE", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISCT", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISDS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISNT", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISRCMV", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISSS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISVL", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISWB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSISYS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSITECBR", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSITECBS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSITIB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSITID", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSITVB", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIUSE", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIVARS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIWAT", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIWCS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIWLS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIXMH", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIXRCMD", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIZCSMS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DSIZVSMS", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DUIFEDST", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DUIFSMTE", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DUITRXCM", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("DUITSTAT", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("FLBACTHD", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("FLBCONVG", "Verb,  3,  0");
        ReservedWordsASM_netView.reservedWords.put("FLBSESSG", "Verb,  3,  0");
    }
}
