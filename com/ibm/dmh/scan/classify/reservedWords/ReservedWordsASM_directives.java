// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.TreeMap;
import java.util.Map;

public class ReservedWordsASM_directives
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final Map<String, String> directives;
    
    public static boolean containsKey(final String iToken) {
        return ReservedWordsASM_directives.directives.containsKey(iToken);
    }
    
    static {
        (directives = new TreeMap<String, String>()).put("*ASM", "CICS translator for HLASM options");
        ReservedWordsASM_directives.directives.put("*PROCESS", "PROCESSing options");
        ReservedWordsASM_directives.directives.put("%PROCESS", "PROCESSing options");
        ReservedWordsASM_directives.directives.put("PROCESS", "PROCESSing options");
    }
}
