// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.utils;

public class InclTypeId
{
    public static final int INCL_ID_UNKNOWN = 0;
    public static final int INCL_ID_JCL = 1;
    public static final int INCL_ID_CATALOGED_PROC = 2;
    public static final int INCL_ID_SOURCE = 3;
    public static final int INCL_ID_SOURCE_DDN = 4;
    public static final int INCL_ID_PP = 5;
    public static final int INCL_ID_MM = 6;
    public static final int INCL_ID_SQL = 7;
    public static final int INCL_ID_MACRO = 8;
    public static final int INCL_ID_PROC = 9;
    public static final int INCL_ID_INCLUDE = 10;
    public static final int INCL_ID_SYSTEM_INCLUDE = 11;
    public static final int INCL_ID_IMPORT = 12;
    public static final int INCL_ID_MACRO_DEF = 62;
    public static final int INCL_ID_PROC_DEF = 63;
    public static final String INCL_CD_UNKNOWN = "unknown";
    public static final String INCL_CD_JCL = "JCL INCLUDE";
    public static final String INCL_CD_CATALOGED_PROC = "";
    public static final String INCL_CD_SOURCE = "COPY";
    public static final String INCL_CD_SOURCE_DDN = "COPY";
    public static final String INCL_CD_PP = "++INCLUDE";
    public static final String INCL_CD_MM = "-INC";
    public static final String INCL_CD_SQL = "SQL INCLUDE";
    public static final String INCL_CD_MACRO = "MACRO";
    public static final String INCL_CD_PROC = "PROC";
    public static final String INCL_CD_INCLUDE = "#include";
    public static final String INCL_CD_SYSTEM_INCLUDE = "system #include";
    public static final String INCL_CD_IMPORT = "import";
    public static final String INCL_CD_MACRO_DEF = "MACRO_DEF";
    public static final String INCL_CD_PROC_DEF = "PROC_DEF";
}
