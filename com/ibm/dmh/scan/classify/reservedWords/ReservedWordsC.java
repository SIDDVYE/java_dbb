// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.TreeMap;
import java.util.Map;

public class ReservedWordsC
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2014\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final Map<String, String> reservedWords;
    
    public static boolean containsKey(final String token) {
        return ReservedWordsC.reservedWords.containsKey(token);
    }
    
    public static String get(final String token) {
        return ReservedWordsC.reservedWords.get(token);
    }
    
    static {
        (reservedWords = new TreeMap<String, String>()).put("#define", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#elif", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#else", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#endif", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#error", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#if", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#ifdef", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#ifndef", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#import", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#include", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#line", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#pragma", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("#undef", "Verb,          4,  0");
        ReservedWordsC.reservedWords.put("__asm", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__based", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__cdecl", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__cplusplus", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__emit", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__export", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__far", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__fastcall", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__fortran", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__huge", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__inline", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__interrupt", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__loadds", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__near", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__pascal", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__saveregs", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__segment", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__segname", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__self", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__stdcall", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("__syscall", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("argc", "ReservedWord,  3,  0");
        ReservedWordsC.reservedWords.put("argv", "ReservedWord,  3,  0");
        ReservedWordsC.reservedWords.put("auto", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("break", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("case", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("char", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("const", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("continue", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("default", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("defined", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("do", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("double", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("else", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("enum", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("envp", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("extern", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("float", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("for", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("goto", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("if", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("int", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("long", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("main", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("register", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("return", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("short", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("signed", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("sizeof", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("static", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("struct", "ReservedWord,  3,  0");
        ReservedWordsC.reservedWords.put("switch", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("typedef", "ReservedWord,  3,  0");
        ReservedWordsC.reservedWords.put("union", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("unsigned", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("void", "ReservedWord,  3,  0");
        ReservedWordsC.reservedWords.put("volatile", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("wchar_t", "ReservedWord,  2,  0");
        ReservedWordsC.reservedWords.put("while", "Verb,          3,  0");
        ReservedWordsC.reservedWords.put("wmain", "ReservedWord,  2,  0");
    }
}
