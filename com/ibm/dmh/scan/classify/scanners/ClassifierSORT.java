// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierReservedWord;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsSORT;
import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierSORT extends ClassifierASM
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2016, 2022\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    int countOfVerbs;
    
    public ClassifierSORT(final ScanProperties scanProperties) {
        super(scanProperties);
        this.countOfVerbs = 0;
    }
    
    @Override
    public String getLanguageCd() {
        return "SORT";
    }
    
    @Override
    public String getLanguageDescription() {
        return "Sort control";
    }
    
    @Override
    public int getLanguageId() {
        return 19;
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        if (this.countOfVerbs == 0) {
            this.score = 0;
        }
    }
    
    @Override
    public ClassifierMetaData processEndOfFile(final int lineCount) {
        this.metaData.clearInclList();
        this.metaData.setTotalLines(lineCount);
        this.metaData.setBlanklines(this.blankLineCount);
        this.metaData.setNonCommentLines(lineCount - this.blankLineCount - this.getCommentCount());
        return this.metaData;
    }
    
    @Override
    public void processOneRecord(final int recordCount, final String literalRecord, final String record, final String languageHint) {
        super.processOneRecord(recordCount, literalRecord, record, languageHint);
        final String name = this.parserAsmStatement.getName();
        if (name.length() != 0) {
            this.rejectThisLanguageCd();
            return;
        }
        final String realOperation = this.parserAsmStatement.getRealOperation();
        final String value = ReservedWordsSORT.get(realOperation);
        if (value == null) {
            this.rejectThisLanguageCd();
            return;
        }
        final ClassifierReservedWord rw = this.allocateReserveWord(realOperation, value);
        final int tokenWordType = rw.getTokenWordType();
        switch (tokenWordType) {
            case 3: {
                ++this.countOfVerbs;
                this.score += 1000;
                break;
            }
            default: {
                this.score += 100;
                break;
            }
        }
    }
}
