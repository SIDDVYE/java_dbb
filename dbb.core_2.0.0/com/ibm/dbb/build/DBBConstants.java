// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

public interface DBBConstants
{
    public static final String DEFAULT_ENCODING = "Cp1047";
    public static final String DEFAULT_NEWLINE = System.getProperty("line.separator");
    public static final boolean SECURITY_TRACE = Boolean.getBoolean("com.ibm.dbb.SecurityTrace");
    
    public enum CopyMode
    {
        TEXT, 
        BINARY, 
        LOAD, 
        ASA_TEXT;
    }
}
