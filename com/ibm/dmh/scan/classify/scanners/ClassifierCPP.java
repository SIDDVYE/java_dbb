// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsCPP;
import com.ibm.dmh.scan.classify.ClassifierReservedWord;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierCPP extends ClassifierC
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2011, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    
    public ClassifierCPP(final ScanProperties scanProperties) {
        super(scanProperties);
    }
    
    @Override
    protected ClassifierReservedWord checkIfReservedWord() {
        ClassifierReservedWord rw = null;
        if (ReservedWordsCPP.containsKey(this.currentToken)) {
            final String value = ReservedWordsCPP.get(this.currentToken);
            rw = this.allocateReserveWord(this.currentToken, value);
        }
        return rw;
    }
    
    @Override
    public String getLanguageCd() {
        return "CPP";
    }
    
    @Override
    public String getLanguageDescription() {
        return "C++";
    }
    
    @Override
    public int getLanguageId() {
        return 7;
    }
    
    @Override
    protected void AccumulatePointsForTheScore(final ClassifierReservedWord rw) {
        this.score += rw.getTokenWeight();
        switch (rw.getTokenWordType()) {
            case 1: {
                ++this.reserveWordCount;
                break;
            }
            case 5: {
                ++this.languageWordCount;
                break;
            }
        }
    }
    
    @Override
    public void isScoreBad(final int iLineCount, final String languageHint) {
        if (this.languageWordCount == 0 && this.reserveWordCount == 0) {
            this.score = 0;
        }
    }
    
    @Override
    public void isScoreStillBad(final int lineCount, final ClassifierASM classifierASM, final ClassifierC classifierC, final ClassifierCOB classifierCOB, final ClassifierCPP classifierCPP, final ClassifierEASY classifierEASY, final ClassifierJCL classifierJCL, final ClassifierPLI classifierPLI, final ClassifierPLX classifierPLX) {
        final int cScore = classifierC.getScore();
        if (this.score == cScore) {
            this.score = 0;
        }
    }
    
    @Override
    public void processInitialization() {
        super.processInitialization();
    }
}
