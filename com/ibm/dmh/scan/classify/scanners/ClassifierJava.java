// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsJAVA;
import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierJava extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final char CHAR_START = '\'';
    private static final char STRING_START = '\"';
    private static final int TOKEN_STATE_BLANK = 1;
    private static final int TOKEN_STATE_EMBEDDED_QUOTE = 2;
    private static final int TOKEN_STATE_HEX_LITERAL = 3;
    private static final int TOKEN_STATE_INITIAL = 4;
    private static final int TOKEN_STATE_LITERAL = 5;
    private static final int TOKEN_STATE_NORMAL = 6;
    private static final String BRACKET_CHARS = "{[()]}";
    private static final String COMMENT_END = "*/";
    private static final String COMMENT_START = "/*";
    private static final String OPERATOR_CHARS = "-+*/<>!~%^&|=";
    private static final String SEMI_COLON = ";";
    private static final String SEQUENCE_CHARS = ",";
    private static final String SINGLE_COMMENT = "//";
    private boolean newLine;
    private boolean packageFound;
    private int inputRecordCount;
    private int tokenState;
    private String currentChar;
    private String inComment;
    private String stringDelimiter;
    
    public ClassifierJava(final ScanProperties scanProperties) {
        super(scanProperties);
        this.currentChar = "";
        this.inComment = "";
        this.inputRecordCount = 0;
        this.newLine = false;
        this.packageFound = false;
        this.stringDelimiter = "";
        this.tokenState = 4;
    }
    
    private void AccumulatePointsForTheScore() {
        ++this.score;
        ++this.reserveWordCount;
    }
    
    private void addToCurrentToken() {
        this.currentToken += this.currentChar;
    }
    
    private void CompleteToken() {
        ++this.tokenNumberOnLine;
        this.scoreCompletedToken();
        this.previousToken = this.currentToken;
        this.currentToken = "";
        this.tokenState = 4;
    }
    
    @Override
    protected String getEndExecToken() {
        return ";";
    }
    
    @Override
    public String getLanguageCd() {
        return "JAVA";
    }
    
    @Override
    public String getLanguageDescription() {
        return "Java";
    }
    
    @Override
    public int getLanguageId() {
        return 13;
    }
    
    @Override
    public void isScoreBad(final int iLineCount, final String languageHint) {
        if (!this.packageFound) {
            this.score = 0;
        }
    }
    
    private void scoreCompletedToken() {
        if (this.currentToken.charAt(0) == '\'' || this.currentToken.charAt(0) == '\"' || this.currentToken.equals("true") || this.currentToken.equals("false") || this.currentToken.equals("null") || (StringUtils.isNumeric(this.currentToken) && !this.currentToken.equals("-"))) {
            this.metaData.addLiteral(this.currentToken);
        }
        else if (!this.currentToken.contains("{[()]}") && !this.currentToken.contains("-+*/<>!~%^&|=")) {
            if (!this.currentToken.contains(";")) {
                if (ReservedWordsJAVA.contains(this.currentToken)) {
                    this.processReservedWord();
                }
                else {
                    this.processNonReservedWord();
                }
            }
        }
    }
    
    private void processNonReservedWord() {
        this.metaData.addSymbolUserDefined(this.currentToken);
        if (this.previousToken.equals("import")) {
            this.metaData.captureInclude(12, this.currentToken);
        }
    }
    
    private void processReservedWord() {
        this.metaData.addSymbolReserved(this.currentToken);
        this.AccumulatePointsForTheScore();
        if (this.currentToken.equals("package")) {
            this.packageFound = true;
        }
    }
    
    @Override
    public boolean getIgnoreCase() {
        return false;
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
        this.identifierMode = 'U';
        this.inComment = null;
        this.metaData = new ClassifierMetaData(this.scanProperties.getCaptureComments(), this.scanProperties.getCaptureEntryPoints(), this.scanProperties.getCaptureExecStatements(), this.scanProperties.getCaptureLiterals(), this.scanProperties.getCapturePictures(), this.scanProperties.getCaptureSymbolsReserved(), this.scanProperties.getCaptureSymbolsUserDefined());
        this.previousToken = "";
        this.reserveWordCount = 0;
        this.syntaxState = 16;
        this.tokenState = 4;
    }
    
    @Override
    public void processOneRecord(final int iInputRecordCount, final String literalRecord, String record, final String languageHint) {
        this.inputRecordCount = iInputRecordCount;
        while (record.length() != 0) {
            this.currentChar = record.substring(0, 1);
            if (!this.currentChar.equals(" ") && !this.currentChar.equals("\t")) {
                break;
            }
            record = record.substring(1);
        }
        if (record.length() == 0) {
            return;
        }
        this.newLine = true;
        this.tokenNumberOnLine = 0;
        while (record.length() != 0) {
            this.currentChar = record.substring(0, 1);
            if (this.inComment != null) {
                if (this.inComment.equals("/*")) {
                    if (record.startsWith("*/")) {
                        record = record.substring("*/".length());
                        this.inComment = "*/";
                        continue;
                    }
                    record = record.substring(1);
                    continue;
                }
                else if (!this.inComment.equals("*/")) {
                    record = record.substring(1);
                    continue;
                }
            }
            else {
                if (record.startsWith("/*")) {
                    this.inComment = "/*";
                    record = record.substring("/*".length());
                    continue;
                }
                if (record.startsWith("//")) {
                    this.inComment = "//";
                    record = record.substring("//".length());
                    continue;
                }
            }
            final boolean isDelimiter = "{[()]}".contains(this.currentChar) || "-+*/<>!~%^&|=".contains(this.currentChar) || ";".contains(this.currentChar) || ",".contains(this.currentChar) || (this.currentChar.equals(".") && !this.previousToken.equals("import") && !this.previousToken.equals("package"));
            boolean tokenComplete = false;
            switch (this.tokenState) {
                case 1: {
                    if (this.newLine || !this.currentChar.equals(" ") || !this.currentChar.equals("\t")) {
                        tokenComplete = true;
                        break;
                    }
                    break;
                }
                case 6: {
                    if (this.newLine) {
                        tokenComplete = true;
                        break;
                    }
                    if (this.currentChar.equals(" ") || this.currentChar.equals("\t")) {
                        this.tokenState = 1;
                        break;
                    }
                    if (isDelimiter) {
                        tokenComplete = true;
                        break;
                    }
                    this.addToCurrentToken();
                    break;
                }
                case 2: {
                    if (this.currentChar.equals(this.stringDelimiter)) {
                        this.tokenState = 5;
                        break;
                    }
                    tokenComplete = true;
                    break;
                }
                case 5: {
                    if (this.currentChar.equals(this.stringDelimiter)) {
                        this.tokenState = 2;
                    }
                    this.addToCurrentToken();
                    break;
                }
                case 4: {
                    if (this.currentChar.equals("X")) {
                        this.currentToken += record.substring(0, 1);
                        this.tokenState = 3;
                        break;
                    }
                    if (this.currentChar.charAt(0) == '\'' || this.currentChar.charAt(0) == '\"') {
                        this.stringDelimiter = this.currentChar;
                        this.addToCurrentToken();
                        this.tokenState = 5;
                        break;
                    }
                    if (this.currentChar.equals(" ") || this.currentChar.equals("\t")) {
                        break;
                    }
                    this.addToCurrentToken();
                    if (isDelimiter) {
                        record = record.substring(1);
                        tokenComplete = true;
                        break;
                    }
                    this.tokenState = 6;
                    break;
                }
                case 3: {
                    if (this.currentChar.equals(" ") || this.currentChar.equals("\t")) {
                        this.tokenState = 1;
                        break;
                    }
                    if (this.currentChar.equals('\'') || this.currentChar.equals('\"')) {
                        this.stringDelimiter = this.currentChar;
                        this.addToCurrentToken();
                        this.tokenState = 5;
                        break;
                    }
                    if (isDelimiter) {
                        tokenComplete = true;
                        break;
                    }
                    this.addToCurrentToken();
                    this.tokenState = 6;
                    break;
                }
            }
            if (tokenComplete || this.currentToken.length() >= 255) {
                this.CompleteToken();
                if (this.identifierMode == 'R') {
                    break;
                }
            }
            else {
                if (record.length() == 0) {
                    break;
                }
                record = record.substring(1);
            }
            this.newLine = false;
        }
        if (this.identifierMode == 'R') {
            return;
        }
        if (this.inComment != null) {
            if (this.tokenNumberOnLine == 0 && (this.tokenState == 2 || this.tokenState == 3 || this.tokenState == 4 || this.tokenState == 5)) {
                this.metaData.incrementCommentLines();
                this.score += 5;
            }
            if (this.inComment == "*/" || this.inComment == "//") {
                this.inComment = null;
            }
        }
        if (this.tokenState != 4) {
            this.CompleteToken();
        }
    }
}
