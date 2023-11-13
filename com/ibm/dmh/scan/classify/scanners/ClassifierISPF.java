// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierISPF extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2013, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private boolean requiredSection;
    private int panelSections;
    
    public ClassifierISPF(final ScanProperties scanProperties) {
        super(scanProperties);
        this.panelSections = 0;
        this.requiredSection = false;
    }
    
    @Override
    public String getLanguageCd() {
        return "ISPF";
    }
    
    @Override
    public String getLanguageDescription() {
        return "ISPF Panel";
    }
    
    @Override
    public int getLanguageId() {
        return 12;
    }
    
    @Override
    public void isScoreBad(final int iLineCount, final String languageHint) {
    }
    
    @Override
    public ClassifierMetaData processEndOfFile(final int iLineCount) {
        this.metaData.setTotalLines(iLineCount);
        this.metaData.setBlanklines(this.blankLineCount);
        this.metaData.setNonCommentLines(iLineCount - this.blankLineCount - this.getCommentCount());
        return this.metaData;
    }
    
    @Override
    public void processInitialization() {
        this.currentToken = "";
        this.previousToken = "";
        this.reserveWordCount = 0;
        this.identifierMode = 'U';
        this.metaData = new ClassifierMetaData();
    }
    
    @Override
    public void processOneRecord(final int recordCount, final String literalRecord, final String inputRecord, final String languageHint) {
        final char[] inputRecordCharArray = inputRecord.toCharArray();
        short columnCurrentRecord = 1;
        int index;
        for (index = 0; index < inputRecordCharArray.length && inputRecordCharArray[index] == ' '; ++index) {
            ++columnCurrentRecord;
        }
        if (index == inputRecordCharArray.length) {
            ++this.blankLineCount;
            return;
        }
        final String record = inputRecord.substring(index);
        if (record.startsWith("/*")) {
            final String recordTrimmed = record.trim();
            if (recordTrimmed.endsWith("*/")) {
                this.metaData.incrementCommentLines();
                return;
            }
        }
        if (columnCurrentRecord == 1) {
            if (record.startsWith(")ABC") || record.startsWith(")ABCINIT") || record.startsWith(")ABCPROC") || record.startsWith(")AREA") || record.startsWith(")ATTR") || record.startsWith(")CCSID") || record.startsWith(")FIELD") || record.startsWith(")HELP") || record.startsWith(")INIT") || record.startsWith(")LIST") || record.startsWith(")MODEL") || record.startsWith(")PANEL") || record.startsWith(")PNTS") || record.startsWith(")PROC") || record.startsWith(")REINIT")) {
                ++this.panelSections;
                this.increaseScore(100);
            }
            else if (record.startsWith(")BODY") || record.startsWith(")END")) {
                ++this.panelSections;
                this.requiredSection = true;
                this.increaseScore(500);
            }
        }
    }
}
