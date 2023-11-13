// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsC;
import com.ibm.dmh.scan.classify.ClassifierReservedWord;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierC extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
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
    private static final String PRAGMA_START = "#";
    private static final String SEMI_COLON = ";";
    private static final String SEQUENCE_CHARS = ",";
    private static final String SINGLE_COMMENT = "//";
    private static final String[] TRIGRAPH_CHARS;
    private boolean newLine;
    private boolean pragmaFound;
    private int inputRecordCount;
    private int tokenState;
    private String currentChar;
    private String inComment;
    private String stringDelimiter;
    
    public ClassifierC(final ScanProperties scanProperties) {
        super(scanProperties);
        this.inputRecordCount = 0;
        this.pragmaFound = false;
    }
    
    protected void AccumulatePointsForTheScore(final ClassifierReservedWord rw) {
        if (this.EXEC_CICS_flag || this.EXEC_SQL_flag) {
            return;
        }
        this.score += rw.getTokenWeight();
        final int tokenWordType = rw.getTokenWordType();
        switch (tokenWordType) {
            case 1: {
                ++this.reserveWordCount;
                break;
            }
            case 3: {
                ++this.reserveWordCount;
                break;
            }
        }
    }
    
    private void addToCurrentToken() {
        this.currentToken += this.currentChar;
    }
    
    protected ClassifierReservedWord checkIfReservedWord() {
        ClassifierReservedWord rw = null;
        if (ReservedWordsC.containsKey(this.currentToken)) {
            final String value = ReservedWordsC.get(this.currentToken);
            rw = this.allocateReserveWord(this.currentToken, value);
        }
        return rw;
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
        return "C";
    }
    
    @Override
    public String getLanguageDescription() {
        return "C";
    }
    
    @Override
    public int getLanguageId() {
        return 4;
    }
    
    @Override
    public void isScoreBad(final int iLineCount, final String languageHint) {
        if (this.reserveWordCount == 0 && !this.pragmaFound) {
            this.score = 0;
        }
    }
    
    private void scoreCompletedToken() {
        if (!this.currentToken.equals(Character.toString('\''))) {
            if (!this.currentToken.equals(Character.toString('\"'))) {
                if (!this.currentToken.contains("{[()]}") && !this.currentToken.contains("-+*/<>!~%^&|=")) {
                    if (!this.currentToken.contains(";")) {
                        final ClassifierReservedWord rw = this.checkIfReservedWord();
                        if (rw == null) {
                            this.processNonReservedWord();
                        }
                        else {
                            if (this.currentToken.startsWith("#")) {
                                this.pragmaFound = true;
                            }
                            this.AccumulatePointsForTheScore(rw);
                        }
                    }
                }
            }
        }
        this.checkSymanticState();
    }
    
    private void checkSymanticState() {
        switch (this.syntaxState) {
            case 1: {
                if (this.currentToken.equals("<")) {
                    this.syntaxState = 2;
                    break;
                }
                if (this.currentToken.equals(Character.toString('\"'))) {
                    if (this.debug == 2) {
                        System.out.println("Found include [" + this.currentToken + "]");
                    }
                    this.metaData.captureInclude(10, this.currentToken);
                    this.syntaxState = 16;
                    break;
                }
                break;
            }
            case 2: {
                if (this.debug == 2) {
                    System.out.println("Found include [" + this.currentToken + "]");
                }
                this.metaData.captureInclude(11, this.currentToken);
                if (this.currentToken.equals("assert.h") || this.currentToken.equals("stdio.h") || this.currentToken.equals("stdlib.h") || this.currentToken.equals("string.h") || this.currentToken.equals("time.h")) {
                    this.score += 250;
                }
                this.syntaxState = 16;
                break;
            }
            case 4: {
                this.processState_mapOrMapset();
                break;
            }
            case 7: {
                this.processState_exec();
                break;
            }
            case 8: {
                this.processState_execCics();
                break;
            }
            case 9: {
                this.processState_execCicsReceiveOrSend();
                break;
            }
            case 10: {
                this.processState_execSql();
                break;
            }
            case 13: {
                this.processState_execSqlStmtInclude();
                break;
            }
            case 15: {
                this.processState_execCicsLinkOrXctl();
                break;
            }
            case 19: {
                this.processState_program();
                break;
            }
            default: {
                this.processState_normalToken();
                break;
            }
        }
    }
    
    private void processNonReservedWord() {
        if (this.currentToken.equals("(") && (this.previousToken.equals("atoi") || this.previousToken.equals("fprintf") || this.previousToken.equals("memcpy") || this.previousToken.equals("memset") || this.previousToken.equals("sizeof") || this.previousToken.equals("strcmp") || this.previousToken.equals("strncmp") || this.previousToken.equals("strpy") || this.previousToken.equals("printf"))) {
            this.score += 250;
        }
    }
    
    private void processState_normalToken() {
        if (this.currentToken.equals("EXEC") || this.currentToken.equals("EXECUTE")) {
            this.syntaxState = 7;
        }
        else if (this.currentToken.equals("#include") || (this.previousToken.equals("??=") && this.currentToken.equals("include"))) {
            this.syntaxState = 1;
        }
        else if (this.currentToken.equals(this.getEndExecToken())) {
            this.EXEC_CICS_flag = false;
            this.EXEC_SQL_flag = false;
        }
    }
    
    private void processState_exec() {
        if (this.currentToken.equals("CICS")) {
            this.EXEC_CICS_flag = true;
            this.metaData.incrementNumValue(30);
            this.syntaxState = 8;
        }
        else if (this.currentToken.equals("SQL")) {
            this.EXEC_SQL_flag = true;
            this.metaData.incrementNumValue(33);
            this.syntaxState = 10;
        }
        else {
            this.syntaxState = 16;
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
        this.EXEC_CICS_flag = false;
        this.EXEC_SQL_flag = false;
        this.inComment = null;
        this.mapName = null;
        this.mapSetName = null;
        this.pragmaFound = false;
        this.previousToken = "";
        this.reserveWordCount = 0;
        this.syntaxState = 16;
        this.tokenState = 4;
        this.typeOfControlTransfer = null;
        this.identifierMode = 'U';
        this.metaData = new ClassifierMetaData();
    }
    
    @Override
    public void processOneRecord(final int iInputRecordCount, final String literalRecord, String record, final String languageHint) {
        this.inputRecordCount = iInputRecordCount;
        while (record.length() != 0) {
            this.currentChar = record.substring(0, 1);
            if (Character.isWhitespace(this.currentChar.charAt(0))) {
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
            if (record.startsWith("?") && record.length() > 2) {
                final String tempTrigraphChar = record.substring(0, 3);
                boolean found = false;
                for (int i = 0; i < ClassifierC.TRIGRAPH_CHARS.length; ++i) {
                    if (tempTrigraphChar.equals(ClassifierC.TRIGRAPH_CHARS[i])) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    this.currentToken = tempTrigraphChar;
                    record = record.substring(3);
                    this.CompleteToken();
                    continue;
                }
            }
            boolean isDelimiter;
            if (this.syntaxState == 2) {
                isDelimiter = this.currentChar.equals(">");
            }
            else {
                isDelimiter = ("{[()]}".contains(this.currentChar) || "-+*/<>!~%^&|=".contains(this.currentChar) || ";".contains(this.currentChar) || ",".contains(this.currentChar));
            }
            boolean tokenComplete = false;
            switch (this.tokenState) {
                case 1: {
                    if (this.newLine || !Character.isWhitespace(this.currentChar.charAt(0))) {
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
                    if (Character.isWhitespace(this.currentChar.charAt(0))) {
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
                    if (this.currentChar.equals(Character.toString('\'')) || this.currentChar.equals(Character.toString('\"'))) {
                        this.stringDelimiter = this.currentChar;
                        this.addToCurrentToken();
                        this.tokenState = 5;
                        break;
                    }
                    if (Character.isWhitespace(this.currentChar.charAt(0))) {
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
                    if (Character.isWhitespace(this.currentChar.charAt(0))) {
                        this.tokenState = 1;
                        break;
                    }
                    if (this.currentChar.equals(Character.toString('\'')) || this.currentChar.equals(Character.toString('\"'))) {
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
            if (this.inComment.equalsIgnoreCase("*/") || this.inComment.equals("//")) {
                this.inComment = null;
            }
        }
        if (this.tokenState != 4) {
            this.CompleteToken();
        }
    }
    
    static {
        TRIGRAPH_CHARS = new String[] { "??=", "??(", "??)", "??/", "??'", "??<", "??>", "??!", "??-" };
    }
}
