// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.reservedWords;

import java.util.TreeMap;
import java.util.Map;

public class ReservedWordsPLX
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final Map<String, String> reservedWords;
    
    public static boolean containsKey(final String token) {
        return ReservedWordsPLX.reservedWords.containsKey(token);
    }
    
    public static String get(final String token) {
        return ReservedWordsPLX.reservedWords.get(token);
    }
    
    static {
        (reservedWords = new TreeMap<String, String>()).put(";", "Delimit, 2,  1");
        ReservedWordsPLX.reservedWords.put("@ENDGEN", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("@INLINE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("@NOINLINE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ABNL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ABNORMAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ABOVE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ABS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ADDR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ADDROFF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ALET", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ALIGNMENT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ALL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AMODE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ANY", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AREA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ARGADDR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ARGCOUNT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AUTO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AUTODATA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AUTOMATIC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("AUTOSIZE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("B", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BASED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BASSM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BDY", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BEGIN", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("BELOW", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BIN", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BINARY", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BIT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BITPOS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BIT_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BNE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BNH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BNL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BNM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BNO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BNP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BNZ", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BOUNDARY", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BRC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BRCL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BSM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BUILTIN", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BY", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("BYADDR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BYADDROFF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BYOFFSET", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BYTE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BYVALUE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BYVIAADDR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("BZ", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("C", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CALL", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("CALLASSIST", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CAP24", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CAP31", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CAP64", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CCMASK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CDS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CDSG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CFC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CHAR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CHARACTER", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CHAR_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CLASS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CLCL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CLCLE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CLCLU", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CLRIO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CODE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CODENUM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CODEREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("COMMON", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("COND", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CONDCODEMASK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CONSTANT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CONSTR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CONSTRAINED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("COPYRIGHT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CORP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CPYA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CSCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CSG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CUTFU", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CUUTF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CVB", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CVBG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CVD", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("CVDG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DATA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DATAMODULE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DATANUM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DATAREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DCL", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("DCLCLASS", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("DECLARE", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("DECLARECLASS", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("DEF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DEFAULTS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DEFINED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DEFS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DIAG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DIM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DO", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("DONTSAVE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DOWNTO", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("DP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("DWORD", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EAR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EDMK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EFPC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EINIT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ELSE", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("END", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("ENTREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ENTRY", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("ENV", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ENVIRONMENT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EPAR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EPILOG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EREGG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ESAR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ESEA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ESTA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EVAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EXIT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EXPLICITINITIAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EXT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("EXTERNAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("FIXED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("FIXED_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("FLOWS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("FOREVER", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("FRIENDS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("GEN", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("GEND", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("GENERATE", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("GENERATED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("GLOBAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("GO", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("GOTO", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("HBOUND", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("HIO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("HSCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("HVAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("HVAL_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("HWORD", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("IAC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ID", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("IF", "ReservedWord,  3,  0");
        ReservedWordsPLX.reservedWords.put("IMPLEMENTS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INARGLIST", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INDEX", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INHERITS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INIT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INITIAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INITIALIZE", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("INLINE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INPUT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INTERNAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("INTOAREA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("IPK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("IPM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ISA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ISKE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ITERATE", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("IVSK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("KEY", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LABEL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LAE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LAM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LBOUND", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LCTL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LCTLG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LEAVE", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("LENGTH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LFPC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LIKE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LINKAGE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LINKSTACK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LLGTR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LMG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LMH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LOC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LOCAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LOCATES", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LOCATESA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LOCATION", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LPSW", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LPSWE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LRA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LRAG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LURA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LURAG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LVAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("LVAL_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MAIN", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MAPPED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MAX", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MIN", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MSCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MSTA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVCDK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVCK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVCL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVCLE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVCLU", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVCP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVCS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVCSK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVN", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("MVZ", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOAUTODATA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOCODEREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NODEFS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOENTREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOEPILOG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOEXIT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOFLOWS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOID", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NONLOCAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NONREENTRANT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOPARMREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOPATCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOPATCHAREA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOPROLOG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOREFS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOREGISTER", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NORENT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NORETREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NORMAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOSAVE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOSAVEAREA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOSAVEREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOSEQFLOW", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOSETS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOSTACK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOSTATREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOTEMPS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NOVET", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NULL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NUM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("NUMBER", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("OFFSET", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("OMITTED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("OPTACROSS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("OPTIONAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("OPTIONS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ORDER", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("OTHER", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("OTHERWISE", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("OUTPUT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("OVERLOADED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PACK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PALB", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PARM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PARMREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PATCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PATCHAREA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PKA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PKU", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PLO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PLX", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PLX370", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PLX390", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("POINTER", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("POINTER_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("POP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("POS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("POSITION", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PRI", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PRIMARY", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PRIVATE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PROC", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("PROCEDURE", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("PROLOG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PROTECTED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PTR", "ReservedWord,  3,  0");
        ReservedWordsPLX.reservedWords.put("PTROFF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PTR_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PUBLIC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("PUSH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RCHP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("READONLY", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("READWRITE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("REENTRANT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("REFS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("REG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("REGISTER", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RENT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("REORDER", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("REPEAT", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("RES", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RESPECIFY", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("RESTRICTED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RETCODE", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("RETREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RETURN", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("RETURNASSIST", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RETURNS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RFY", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("RLL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RLLG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RMODE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RSCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RSECT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("RSTD", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SAC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SAME", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SAR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SAVE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SAVEAREA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SAVEREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SCHM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SCK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SCKC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SCOPEINITIAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SELECT", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("SEQFLOW", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SETS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SFPC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SIGNED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SIGNED_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SIGP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SINIT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SIO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SIZE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SLA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SLAG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SLDA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SLDL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SLL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SLLG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SPACEID", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SPACETYPE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SPKA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SPM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SPT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SPX", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SRA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SRAG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SRDA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SRDL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SRL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SRLG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SRNM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SSAR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SSCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SSKE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SSM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STACK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STAM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STAP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STATIC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STATICLOCAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STATNUM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STATREG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STCK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STCKC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STCPS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STCRW", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STCTG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STCTL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STFPC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STIDC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STIDP", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STMG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STMH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STNSM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STORAGE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STORAGECLASS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STOSM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STPT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STPX", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STRAG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STRING", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STRONG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STSCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STURA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("STURG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SUBPOOL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SUBSTRLEN", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SUBSYSTEM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SVC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SYNONYM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SYSDATE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SYSDATEC", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SYSPARM", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("SYSTIME", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TAR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TEMPS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("THEN", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("TIO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TMH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TMHH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TMHL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TML", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TO", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("TPI", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TPROT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TRANS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TRANSLATE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TROO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TROT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TRT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TRTO", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TRTT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TS", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TSCH", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("TYPE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNCHECKED_INPUT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNCHECKED_OUTPUT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNDEFINED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNION", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNPK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNPKA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNPKU", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNRESTRICTED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNRSTD", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNSIGNED", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNSIGNED_OF", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UNTIL", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("UPORDOWNTO", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("UPT", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("UPTO", "ReservedWord,  4,  0");
        ReservedWordsPLX.reservedWords.put("VALRG", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VALUERANGE", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VAR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VARYING", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VERIFY", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VET", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VIA", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VIAADDR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VIAPOINTER", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VIAPTR", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VIRTUAL", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("VLIST", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("WEAK", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("WHEN", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("WHILE", "ReservedWord,  2,  0");
        ReservedWordsPLX.reservedWords.put("WORD", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("YES", ",  0,  0");
        ReservedWordsPLX.reservedWords.put("ZAP", ",  0,  0");
    }
}
