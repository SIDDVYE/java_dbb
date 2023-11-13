// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.HashMap;
import java.util.Map;

public class ReservedWordsJAVA
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final Map<String, Boolean> reservedWords;
    
    public static boolean contains(final String token) {
        final Boolean rc = ReservedWordsJAVA.reservedWords.get(token);
        return rc != null && rc;
    }
    
    static {
        (reservedWords = new HashMap<String, Boolean>()).put("abstract", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("assert", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("boolean", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("break", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("byte", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("case", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("catch", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("char", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("class", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("const", Boolean.FALSE);
        ReservedWordsJAVA.reservedWords.put("continue", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("default", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("do", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("double", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("else", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("enum", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("extends", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("final", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("finally", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("float", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("for", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("goto", Boolean.FALSE);
        ReservedWordsJAVA.reservedWords.put("if", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("implements", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("import", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("instanceof", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("int", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("interface", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("long", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("native", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("new", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("package", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("private", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("protected", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("public", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("return", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("short", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("static", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("strictfp", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("super", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("switch", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("synchronized", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("this", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("throw", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("throws", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("transient", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("try", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("void", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("volatile", Boolean.TRUE);
        ReservedWordsJAVA.reservedWords.put("while", Boolean.TRUE);
    }
}
