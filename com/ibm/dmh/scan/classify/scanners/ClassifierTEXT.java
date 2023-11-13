// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierTEXT extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final int STMT_TYPE_IS_UNKNOWN = 0;
    private static final int STMT_TYPE_IS_DEFINE_MAPSET = 1;
    private static final int STMT_TYPE_IS_DEFINE_PROGRAM = 2;
    private static final int STMT_TYPE_IS_DEFINE_TRANSACTION = 3;
    private boolean majorKeywordFound;
    private int currentStmtType;
    
    public ClassifierTEXT(final ScanProperties scanProperties) {
        super(scanProperties);
        this.currentStmtType = 0;
        this.majorKeywordFound = false;
    }
    
    private int calculateSLOC(final int lineCount) {
        return lineCount - this.blankLineCount - this.getCommentCount();
    }
    
    @Override
    public String getLanguageCd() {
        return "TEXT";
    }
    
    @Override
    public String getLanguageDescription() {
        return "CICS DFHCSDUP EXTRACT report";
    }
    
    @Override
    public int getLanguageId() {
        return 21;
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        if (!languageHint.equals("TEXT") && (lineCount == this.getCommentCount() || !this.majorKeywordFound)) {
            this.score = 0;
        }
    }
    
    @Override
    public ClassifierMetaData processEndOfFile(final int lineCount) {
        this.metaData.setBlanklines(this.blankLineCount);
        this.metaData.setNonCommentLines(this.calculateSLOC(lineCount));
        this.metaData.setTotalLines(lineCount);
        return this.metaData;
    }
    
    @Override
    public void processInitialization() {
        this.currentStmtType = 0;
        this.majorKeywordFound = false;
        this.identifierMode = 'U';
        this.metaData = new ClassifierMetaData();
    }
    
    @Override
    public void processOneRecord(final int recordCount, final String literalRecord, final String record, final String languageHint) {
        final String recordTrimmed = record.trim();
        if (recordTrimmed.length() == 0) {
            ++this.blankLineCount;
        }
        else if (!this.checkMajorKeywords(record)) {
            this.checkMinorKeywords(record);
        }
        if (this.identifierMode != 'R' && languageHint.equals("TEXT")) {
            ++this.score;
        }
    }
    
    private boolean checkMajorKeywords(final String record) {
        if (record.startsWith(" DEFINE MAPSET(")) {
            this.currentStmtType = 1;
            this.metaData.incrementNumValue(810);
            this.majorKeywordFound = true;
            this.score += 100;
            return true;
        }
        if (record.startsWith(" DEFINE PROGRAM(")) {
            this.currentStmtType = 2;
            this.metaData.incrementNumValue(810);
            this.majorKeywordFound = true;
            this.score += 100;
            return true;
        }
        if (record.startsWith(" DEFINE TRANSACTION(")) {
            this.currentStmtType = 3;
            this.metaData.incrementNumValue(810);
            this.majorKeywordFound = true;
            this.score += 100;
            return true;
        }
        if (record.startsWith(" DEFINE ")) {
            this.currentStmtType = 0;
            return true;
        }
        return false;
    }
    
    private void checkMinorKeywords(final String record) {
        switch (this.currentStmtType) {
            case 1: {
                if (record.startsWith("        CHANGEUSRID(") || record.startsWith("        DEFINETIME(") || record.startsWith("        RESIDENT(")) {
                    this.score += 50;
                    break;
                }
                break;
            }
            case 2: {
                if (record.startsWith("        CHANGEAGENT(") || record.startsWith("        CHANGETIME(") || record.startsWith("        EXECKEY(") || record.startsWith("        EXECUTIONSET(") || record.startsWith("        LANGUAGE(") || record.startsWith("        USELPACOPY(")) {
                    this.score += 50;
                    break;
                }
                break;
            }
            case 3: {
                if (record.startsWith("        CHANGEUSRID(") || record.startsWith("        CONFDATA(") || record.startsWith("        DEFINETIME(") || record.startsWith("        PROGRAM(") || record.startsWith("        RESTART(") || record.startsWith("        ROUTABLE(") || record.startsWith("        RUNAWAY(") || record.startsWith("        TASKDATALOC(") || record.startsWith("        WAITTIME(")) {
                    this.score += 50;
                    break;
                }
                break;
            }
        }
    }
}
