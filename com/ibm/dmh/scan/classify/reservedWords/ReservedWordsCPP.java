// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.TreeMap;
import java.util.Map;

public class ReservedWordsCPP
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2014\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final Map<String, String> reservedWords;
    
    public static boolean containsKey(final String token) {
        return ReservedWordsCPP.reservedWords.containsKey(token);
    }
    
    public static String get(final String token) {
        return ReservedWordsCPP.reservedWords.get(token);
    }
    
    static {
        (reservedWords = new TreeMap<String, String>()).put("#define", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#elif", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#else", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#endif", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#error", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#if", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#ifdef", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#ifndef", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#import", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#include", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#line", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#pragma", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("#undef", "Verb,          4,  0");
        ReservedWordsCPP.reservedWords.put("__asm", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__based", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__cdecl", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__cplusplus", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__emit", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__export", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__far", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__fastcall", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__fortran", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__huge", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__inline", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__interrupt", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__loadds", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__multiple_inheritance", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("__near", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__pascal", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__saveregs", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__segment", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__segname", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__self", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__single_inheritance", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("__stdcall", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__syscall", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("__virtual_inheritance", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("argc", "ReservedWord,  3,  0");
        ReservedWordsCPP.reservedWords.put("argv", "ReservedWord,  3,  0");
        ReservedWordsCPP.reservedWords.put("auto", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("bool", "Ignore,        0,  0");
        ReservedWordsCPP.reservedWords.put("break", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("case", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("catch", "Verb,          5,  0");
        ReservedWordsCPP.reservedWords.put("char", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("class", "Ignore,        0,  0");
        ReservedWordsCPP.reservedWords.put("const", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("const_cast", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("continue", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("default", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("defined", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("delete", "Verb,          5,  0");
        ReservedWordsCPP.reservedWords.put("do", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("double", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("dynamic_cast", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("else", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("enum", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("envp", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("explicit", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("extern", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("false", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("float", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("for", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("friend", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("goto", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("if", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("inline", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("int", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("long", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("main", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("mutable", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("namespace", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("new", "Verb,          5,  0");
        ReservedWordsCPP.reservedWords.put("operator", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("private", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("protected", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("public", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("register", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("reinterpret_cast", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("return", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("short", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("signed", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("sizeof", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("static", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("static_cast", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("struct", "ReservedWord,  3,  0");
        ReservedWordsCPP.reservedWords.put("switch", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("template", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("this", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("throw", "Verb,          5,  0");
        ReservedWordsCPP.reservedWords.put("true", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("try", "Verb,          5,  0");
        ReservedWordsCPP.reservedWords.put("typedef", "ReservedWord,  3,  0");
        ReservedWordsCPP.reservedWords.put("typeid", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("typename", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("union", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("unsigned", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("using", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("virtual", "ReservedWord,  5,  0");
        ReservedWordsCPP.reservedWords.put("void", "ReservedWord,  3,  0");
        ReservedWordsCPP.reservedWords.put("volatile", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("wchar_t", "ReservedWord,  2,  0");
        ReservedWordsCPP.reservedWords.put("while", "Verb,          3,  0");
        ReservedWordsCPP.reservedWords.put("wmain", "ReservedWord,  2,  0");
    }
}
