// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsREXX;
import java.util.regex.Matcher;
import com.ibm.dmh.scan.classify.ScanProperties;
import java.util.regex.Pattern;

public class ClassifierREXX extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2018\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static Pattern inclPattern;
    private static Pattern inclDDPattern;
    private static final String APOSTROPHE = "'";
    private static final String QUOTE = "\"";
    private static final int TOKEN_STATE_BLANK = 1;
    private static final int TOKEN_STATE_EMBEDDED_QUOTE = 2;
    private static final int TOKEN_STATE_HEX_LITERAL = 3;
    private static final int TOKEN_STATE_INITIAL = 4;
    private static final int TOKEN_STATE_LITERAL = 5;
    private static final int TOKEN_STATE_NORMAL = 6;
    private static final String BRACKET_CHARS = "{[()]}";
    private static final String COLON = ":";
    private static final String COMMENT_END = "*/";
    private static final String COMMENT_START = "/*";
    private static final String OPERATOR_CHARS = "-+*/<>!~%^&|=";
    private static final String SEMI_COLON = ";";
    private static final String SEQUENCE_CHARS = ",";
    private int tokenState;
    private String currentChar;
    private String inComment;
    
    public ClassifierREXX(final ScanProperties scanProperties) {
        super(scanProperties);
        this.currentChar = "";
        this.inComment = null;
        this.tokenState = 4;
    }
    
    protected void AccumulatePointsForTheScore() {
        if (this.EXEC_CICS_flag || this.EXEC_SQL_flag) {
            return;
        }
        this.score += 60;
        ++this.reserveWordCount;
    }
    
    private void addToCurrentToken() {
        this.currentToken += this.currentChar;
    }
    
    private int calculateSLOC(final int lineCount) {
        return lineCount - this.blankLineCount - this.getCommentCount();
    }
    
    private void checkForIncludes(final String line) {
        final Matcher inclMatcher = ClassifierREXX.inclPattern.matcher(line);
        while (inclMatcher.find()) {
            final String result = inclMatcher.group(1);
            if (this.debug != 0) {
                System.out.println("include found : " + result);
            }
            if (result != null) {
                this.metaData.captureInclude(3, result);
                this.score += 250;
            }
        }
        final Matcher inclDDMatcher = ClassifierREXX.inclDDPattern.matcher(line);
        while (inclDDMatcher.find()) {
            final String ddName = inclDDMatcher.group(1);
            final String ddMember = inclDDMatcher.group(2);
            if (ddName != null && ddMember != null) {
                this.metaData.captureInclude(ddMember, ddName, this.debug);
                this.score += 250;
            }
        }
    }
    
    private boolean checkIfReservedWord() {
        return ReservedWordsREXX.contains(this.currentToken);
    }
    
    private void CompleteToken(final int recordCount) {
        this.debugReportCompletedToken(recordCount, ++this.tokenNumberOnLine, this.currentToken);
        this.scoreCompletedToken();
        this.previousToken = this.currentToken;
        this.currentToken = "";
        this.tokenState = 4;
    }
    
    @Override
    public String getLanguageCd() {
        return "REXX";
    }
    
    @Override
    public String getLanguageDescription() {
        return "REXX";
    }
    
    @Override
    public int getLanguageId() {
        return 18;
    }
    
    @Override
    public boolean getIgnoreCase() {
        return false;
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        if (this.identifierMode == 'R') {
            this.score = 0;
        }
    }
    
    private void parseSpecificStatements() {
        final int syntaxState = this.syntaxState;
        this.processState_normalToken();
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
        this.identifierMode = 'U';
        this.metaData = new ClassifierMetaData(this.scanProperties.getCaptureComments(), this.scanProperties.getCaptureEntryPoints(), this.scanProperties.getCaptureExecStatements(), this.scanProperties.getCaptureLiterals(), this.scanProperties.getCapturePictures(), this.scanProperties.getCaptureSymbolsReserved(), this.scanProperties.getCaptureSymbolsUserDefined());
    }
    
    private void processNonReservedWord() {
        this.metaData.addSymbolUserDefined(this.currentToken);
    }
    
    private void processReservedWord() {
        this.metaData.addSymbolReserved(this.currentToken);
        this.AccumulatePointsForTheScore();
    }
    
    private void processState_normalToken() {
    }
    
    @Override
    public void processOneRecord(final int recordCount, final String literalRecord, String record, final String languageHint) {
        String stringDelimiter = null;
        boolean newLine = true;
        this.tokenNumberOnLine = 0;
        record = record.trim();
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
            else if (record.startsWith("/*")) {
                this.inComment = "/*";
                record = record.substring("/*".length());
                continue;
            }
            final boolean isDelimiter = "{[()]}".contains(this.currentChar) || ":".contains(this.currentChar) || "-+*/<>!~%^&|=".contains(this.currentChar) || ";".contains(this.currentChar) || ",".contains(this.currentChar);
            boolean tokenComplete = false;
            switch (this.tokenState) {
                case 1: {
                    if (newLine || !this.currentChar.equals(" ")) {
                        tokenComplete = true;
                        break;
                    }
                    break;
                }
                case 6: {
                    if (newLine) {
                        tokenComplete = true;
                        break;
                    }
                    if (this.currentChar.equals(" ")) {
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
                    if (this.currentChar.equals(stringDelimiter)) {
                        this.tokenState = 5;
                        break;
                    }
                    tokenComplete = true;
                    break;
                }
                case 5: {
                    if (this.currentChar.equals(stringDelimiter)) {
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
                    if (this.currentChar.equals("'") || this.currentChar.equals("\"")) {
                        stringDelimiter = this.currentChar;
                        this.addToCurrentToken();
                        this.tokenState = 5;
                        break;
                    }
                    if (this.currentChar.equals(" ")) {
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
                    if (this.currentChar.equals(" ")) {
                        this.tokenState = 1;
                        break;
                    }
                    if (this.currentChar.equals("'") || this.currentChar.equals("\"")) {
                        stringDelimiter = this.currentChar;
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
                this.CompleteToken(recordCount);
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
            newLine = false;
        }
        if (this.identifierMode == 'R') {
            return;
        }
        if (this.inComment != null) {
            if (this.tokenNumberOnLine == 0 && (this.tokenState == 2 || this.tokenState == 3 || this.tokenState == 4 || this.tokenState == 5)) {
                this.metaData.incrementCommentLines();
                this.score += 5;
                if (recordCount == 1) {
                    String recordTrimmed = literalRecord.trim();
                    recordTrimmed = recordTrimmed.substring(2);
                    recordTrimmed = recordTrimmed.trim();
                    recordTrimmed = recordTrimmed.toUpperCase();
                    if (recordTrimmed.indexOf("REXX") <= -1) {
                        this.identifierMode = 'R';
                        return;
                    }
                    this.identifierMode = 'C';
                    this.score += 1000;
                }
                final String literalRecordTrimmed = literalRecord.trim();
                this.metaData.addComment(literalRecordTrimmed);
                this.checkForIncludes(literalRecordTrimmed);
            }
            if (this.inComment == "*/") {
                this.inComment = null;
            }
        }
        if (recordCount == 1 && this.identifierMode == 'U') {
            this.identifierMode = 'R';
        }
        else if (this.tokenState != 4) {
            this.CompleteToken(recordCount);
        }
    }
    
    private void scoreCompletedToken() {
        if (this.currentToken.startsWith("'") || this.currentToken.startsWith("\"")) {
            this.metaData.addLiteral(this.currentToken);
        }
        else if (this.currentToken.contains("{[()]}") || this.currentToken.contains(":") || this.currentToken.contains("-+*/<>!~%^&|=") || this.currentToken.contains(";")) {
            this.metaData.addSymbolReserved(this.currentToken);
        }
        else if (StringUtils.isNumeric(this.currentToken)) {
            this.metaData.addLiteral(this.currentToken);
        }
        else if (this.checkIfReservedWord()) {
            this.processReservedWord();
        }
        else {
            this.processNonReservedWord();
        }
        this.parseSpecificStatements();
    }
    
    static {
        ClassifierREXX.inclPattern = Pattern.compile("\\/\\*%INCLUDE\\s*([a-zA-Z0-9\\$@%]{1,8})\\s*\\*\\/", 2);
        ClassifierREXX.inclDDPattern = Pattern.compile("\\/\\*%INCLUDE\\s*([a-zA-Z0-9\\$@%]{1,8})\\(([a-zA-Z0-9\\$@%]{1,8})\\)\\s*\\*\\/", 2);
    }
}
