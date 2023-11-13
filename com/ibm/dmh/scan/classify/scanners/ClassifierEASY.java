// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsEASY;
import com.ibm.dmh.scan.classify.ClassifierReservedWord;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierEASY extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2003, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private boolean EASY_majorKeyWordFound;
    private char EASY_featurestate;
    private char EASY_keywordFlag1;
    private char EASY_keywordFlag2;
    private char EASY_keywordFlag3;
    private char EASY_keywordFlag4;
    private char EASY_tokenState;
    private char stringDelimiter;
    private String EASY_majorKeyWordToken;
    
    public ClassifierEASY(final ScanProperties scanProperties) {
        super(scanProperties);
        this.EASY_featurestate = 'I';
        this.EASY_keywordFlag1 = 'F';
        this.EASY_keywordFlag2 = 'F';
        this.EASY_keywordFlag3 = 'F';
        this.EASY_keywordFlag4 = 'F';
        this.EASY_majorKeyWordFound = false;
        this.EASY_majorKeyWordToken = "";
        this.EASY_tokenState = 'S';
        this.stringDelimiter = ' ';
    }
    
    private int calculateSLOC(final int lineCount) {
        return lineCount - this.blankLineCount - this.getCommentCount();
    }
    
    @Override
    public String getLanguageCd() {
        return "EASY";
    }
    
    @Override
    public String getLanguageDescription() {
        return "CA-Easytrieve";
    }
    
    @Override
    public int getLanguageId() {
        return 8;
    }
    
    private void AccumulatePointsForTheScore(final ClassifierReservedWord rw, final int lineCount) {
        final int tokenWordType = rw.getTokenWordType();
        switch (tokenWordType) {
            case 1: {
                if (!this.currentToken.equals("X") || this.EASY_majorKeyWordToken.equals("FILE") || !this.EASY_majorKeyWordToken.equals("DEFINE")) {}
                this.increaseScore(rw.getTokenWeight());
                break;
            }
            case 3: {
                this.increaseScore(rw.getTokenWeight());
                ++this.reserveWordCount;
                if (this.currentToken.equals("DEFINE") || this.currentToken.equals("FILE") || this.currentToken.equals("JOB") || this.currentToken.equals("PARM") || this.currentToken.equals("REPORT") || this.currentToken.equals("SORT")) {
                    if (this.tokenNumberOnLine == 1) {
                        this.EASY_majorKeyWordFound = true;
                        this.EASY_majorKeyWordToken = this.currentToken;
                    }
                }
                else if (this.currentToken.equals("MACRO") && this.tokenNumberOnLine == 1) {
                    this.EASY_majorKeyWordFound = true;
                    this.EASY_majorKeyWordToken = this.currentToken;
                    this.metaData.setNonCommentBefore1st(this.calculateSLOC(lineCount) - 1);
                }
                if (this.EASY_keywordFlag1 == 'F' && this.EASY_keywordFlag2 == '.' && this.previousToken.equals("PROC")) {
                    this.increaseScore(250);
                    break;
                }
                break;
            }
            default: {
                this.increaseScore(rw.getTokenWeight());
                break;
            }
        }
    }
    
    private void CompleteToken(final int lineCount, final String languageHint) {
        ++this.tokenNumberOnLine;
        this.EASY_tokenState = 'S';
        this.EASY_keywordFlag1 = this.EASY_keywordFlag2;
        this.EASY_keywordFlag2 = this.EASY_keywordFlag3;
        this.EASY_keywordFlag3 = this.EASY_keywordFlag4;
        if (this.currentToken.charAt(0) == '%') {
            this.metaData.captureInclude(8, this.currentToken.substring(1));
        }
        if (this.currentToken.charAt(0) == '\"' || this.currentToken.charAt(0) == '\'' || this.currentToken.charAt(0) == '(' || this.currentToken.charAt(0) == ')') {
            this.EASY_keywordFlag4 = 'F';
            this.previousToken = this.currentToken;
            this.currentToken = "";
            return;
        }
        ClassifierReservedWord rw = null;
        if (ReservedWordsEASY.containsKey(this.currentToken)) {
            final String value = ReservedWordsEASY.get(this.currentToken);
            rw = this.allocateReserveWord(this.currentToken, value);
        }
        if (rw != null) {
            this.EASY_keywordFlag4 = 'T';
            this.AccumulatePointsForTheScore(rw, lineCount);
        }
        else if (this.currentToken.charAt(0) == '.') {
            this.EASY_keywordFlag4 = '.';
        }
        else {
            this.EASY_keywordFlag4 = 'F';
        }
        switch (this.EASY_featurestate) {
            case 'E': {
                if (!languageHint.equals("EASY")) {
                    if (this.currentToken.equals("CICS")) {
                        this.rejectThisLanguageCd();
                        break;
                    }
                    if (this.currentToken.equals("SQL")) {
                        this.rejectThisLanguageCd();
                        break;
                    }
                }
                this.EASY_featurestate = 'I';
                break;
            }
            case 'I': {
                if (this.currentToken.equals("EXEC") || this.currentToken.equals("EXECUTE")) {
                    this.EASY_featurestate = 'E';
                    break;
                }
                break;
            }
        }
        this.previousToken = this.currentToken;
        this.currentToken = "";
    }
    
    public boolean getEasyMajorKeyWordFound() {
        return this.EASY_majorKeyWordFound;
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        if (!this.getEasyMajorKeyWordFound()) {
            this.score = 0;
        }
        else if (this.reserveWordCount <= 99) {
            final int nonBlankLines = lineCount - this.blankLineCount;
            final int commentLines = this.getCommentCount();
            final int nonComments = nonBlankLines - commentLines;
            if (this.reserveWordCount < nonComments * 0.2) {
                this.score = 0;
            }
        }
    }
    
    @Override
    public void isScoreStillBad(final int lineCount, final ClassifierASM classifierASM, final ClassifierC classifierC, final ClassifierCOB classifierCOB, final ClassifierCPP classifierCPP, final ClassifierEASY classifierEASY, final ClassifierJCL classifierJCL, final ClassifierPLI classifierPLI, final ClassifierPLX classifierPLX) {
        final int cScore = classifierC.getScore();
        final int cppScore = classifierCPP.getScore();
        if (cScore != 0 && cppScore != 0 && (cScore > this.score || cppScore > this.score)) {
            this.score = 0;
        }
    }
    
    private boolean lastCharOnTheRecord(int index, final char[] inputRecordCharArray) {
        boolean rc = true;
        ++index;
        while (index < inputRecordCharArray.length) {
            if (inputRecordCharArray[index] != ' ') {
                rc = false;
                break;
            }
            ++index;
        }
        return rc;
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
        this.EASY_featurestate = 'I';
        this.EASY_keywordFlag1 = 'F';
        this.EASY_keywordFlag2 = 'F';
        this.EASY_keywordFlag3 = 'F';
        this.EASY_keywordFlag4 = 'F';
        this.EASY_majorKeyWordFound = false;
        this.EASY_majorKeyWordToken = "";
        this.EASY_tokenState = 'S';
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
        String record = inputRecord.substring(index);
        if (record.startsWith("/*")) {
            return;
        }
        if (record.charAt(0) == '*') {
            if (columnCurrentRecord != 7) {
                this.increaseScore(5);
                this.metaData.incrementCommentLines();
            }
            return;
        }
        if (record.length() > 7 && record.charAt(6) == '*') {
            return;
        }
        this.tokenNumberOnLine = 0;
        boolean newLine = true;
        char prevChar = ' ';
        while (index < inputRecordCharArray.length) {
            boolean isDelimiter;
            if (inputRecordCharArray[index] == '(' || inputRecordCharArray[index] == ')' || inputRecordCharArray[index] == ',' || inputRecordCharArray[index] == ':' || inputRecordCharArray[index] == '=' || inputRecordCharArray[index] == '\'' || inputRecordCharArray[index] == ' ') {
                isDelimiter = true;
            }
            else if (inputRecordCharArray[index] == '.') {
                if (this.currentToken.length() == 0) {
                    isDelimiter = false;
                }
                else if (!StringUtils.isNumeric(this.currentToken)) {
                    isDelimiter = true;
                }
                else {
                    record = inputRecord.substring(index);
                    if (record.length() == 1) {
                        isDelimiter = true;
                    }
                    else {
                        final String ifDecimalPoint = record.substring(1, 2);
                        isDelimiter = !StringUtils.isNumeric(ifDecimalPoint);
                    }
                }
            }
            else {
                isDelimiter = false;
            }
            boolean tokenComplete = false;
            Label_1021: {
                switch (this.EASY_tokenState) {
                    case 'B': {
                        if (newLine || inputRecordCharArray[index] != ' ') {
                            tokenComplete = true;
                            break;
                        }
                        break;
                    }
                    case 'C': {
                        if (newLine) {
                            tokenComplete = true;
                            break;
                        }
                        if (inputRecordCharArray[index] == ' ') {
                            this.EASY_tokenState = 'B';
                            break;
                        }
                        if (isDelimiter) {
                            tokenComplete = true;
                            break;
                        }
                        this.currentToken += inputRecordCharArray[index];
                        break;
                    }
                    case 'E': {
                        if (inputRecordCharArray[index] == this.stringDelimiter) {
                            this.EASY_tokenState = 'Q';
                            break;
                        }
                        tokenComplete = true;
                        break;
                    }
                    case 'Q': {
                        if (inputRecordCharArray[index] == this.stringDelimiter) {
                            this.EASY_tokenState = 'E';
                        }
                        if ((inputRecordCharArray[index] == '+' || inputRecordCharArray[index] == '-') && this.lastCharOnTheRecord(index, inputRecordCharArray)) {
                            break;
                        }
                        this.currentToken += inputRecordCharArray[index];
                        break;
                    }
                    case 'S': {
                        switch (inputRecordCharArray[index]) {
                            case ' ': {
                                break Label_1021;
                            }
                            case 'X': {
                                this.currentToken += inputRecordCharArray[index];
                                this.EASY_tokenState = 'X';
                                break Label_1021;
                            }
                            case '\"':
                            case '\'': {
                                this.stringDelimiter = inputRecordCharArray[index];
                                this.currentToken += inputRecordCharArray[index];
                                this.EASY_tokenState = 'Q';
                                break Label_1021;
                            }
                            case '%': {
                                this.stringDelimiter = inputRecordCharArray[index];
                                this.currentToken += inputRecordCharArray[index];
                                this.EASY_tokenState = 'C';
                                break Label_1021;
                            }
                            default: {
                                if ((inputRecordCharArray[index] == '+' || inputRecordCharArray[index] == '-') && this.lastCharOnTheRecord(index, inputRecordCharArray)) {
                                    break Label_1021;
                                }
                                this.currentToken += inputRecordCharArray[index];
                                if (isDelimiter) {
                                    ++index;
                                    tokenComplete = true;
                                    break Label_1021;
                                }
                                this.EASY_tokenState = 'C';
                                break Label_1021;
                            }
                        }
                        break;
                    }
                    case 'X': {
                        switch (inputRecordCharArray[index]) {
                            case ' ': {
                                this.EASY_tokenState = 'B';
                                break Label_1021;
                            }
                            case '\"':
                            case '\'': {
                                this.stringDelimiter = inputRecordCharArray[index];
                                this.currentToken += inputRecordCharArray[index];
                                this.EASY_tokenState = 'Q';
                                break Label_1021;
                            }
                            default: {
                                if (isDelimiter) {
                                    tokenComplete = true;
                                    break Label_1021;
                                }
                                this.currentToken += inputRecordCharArray[index];
                                this.EASY_tokenState = 'C';
                                break Label_1021;
                            }
                        }
                        break;
                    }
                }
            }
            if (tokenComplete || this.currentToken.length() >= 255) {
                this.CompleteToken(recordCount, languageHint);
                if (this.identifierMode == 'R') {
                    break;
                }
            }
            else {
                if (prevChar != ' ') {
                    prevChar = inputRecordCharArray[index];
                }
                ++index;
            }
            newLine = false;
        }
        if (this.identifierMode == 'R') {
            return;
        }
        if (prevChar == '+' || prevChar == '-') {
            return;
        }
        if (this.EASY_tokenState != 'S') {
            this.CompleteToken(recordCount, languageHint);
        }
    }
}
