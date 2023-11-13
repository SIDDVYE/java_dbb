// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierMetaData;

public interface IClassifierByRecord
{
    boolean getIgnoreCase();
    
    String getLanguageCd();
    
    String getLanguageDescription();
    
    int getLanguageId();
    
    void isScoreBad(final int p0, final String p1);
    
    void isScoreStillBad(final int p0, final ClassifierASM p1, final ClassifierC p2, final ClassifierCOB p3, final ClassifierCPP p4, final ClassifierEASY p5, final ClassifierJCL p6, final ClassifierPLI p7, final ClassifierPLX p8);
    
    ClassifierMetaData processEndOfFile(final int p0);
    
    void processInitialization();
    
    void processOneRecord(final int p0, final String p1, final String p2, final String p3);
}
