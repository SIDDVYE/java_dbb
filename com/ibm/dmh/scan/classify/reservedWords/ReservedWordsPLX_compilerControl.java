// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.ArrayList;
import java.util.List;

public class ReservedWordsPLX_compilerControl
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final List<String> reservedWords;
    
    public static boolean contains(final String token) {
        return ReservedWordsPLX_compilerControl.reservedWords.contains(token);
    }
    
    static {
        (reservedWords = new ArrayList<String>(14)).add("CREATE");
        ReservedWordsPLX_compilerControl.reservedWords.add("EJECT");
        ReservedWordsPLX_compilerControl.reservedWords.add("ENDCREATE");
        ReservedWordsPLX_compilerControl.reservedWords.add("ENDLOGIC");
        ReservedWordsPLX_compilerControl.reservedWords.add("ENDSEGMENT");
        ReservedWordsPLX_compilerControl.reservedWords.add("FORMAT");
        ReservedWordsPLX_compilerControl.reservedWords.add("INCLUDE");
        ReservedWordsPLX_compilerControl.reservedWords.add("LIST");
        ReservedWordsPLX_compilerControl.reservedWords.add("LOGIC");
        ReservedWordsPLX_compilerControl.reservedWords.add("POP");
        ReservedWordsPLX_compilerControl.reservedWords.add("PROCESS");
        ReservedWordsPLX_compilerControl.reservedWords.add("PUSH");
        ReservedWordsPLX_compilerControl.reservedWords.add("SEGMENT");
        ReservedWordsPLX_compilerControl.reservedWords.add("SPACE");
    }
}
