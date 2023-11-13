// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierByRecord extends Classifier implements IClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2011, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final int SYNTAX_STATE_ASSIGNMENT_STMT = 0;
    protected static final int SYNTAX_STATE_C_INCLUDE = 1;
    protected static final int SYNTAX_STATE_C_INCLUDE_NAME = 2;
    protected static final int SYNTAX_STATE_CALL = 3;
    protected static final int SYNTAX_STATE_CICS_MAP_MAPSET = 4;
    protected static final int SYNTAX_STATE_COPY = 5;
    protected static final int SYNTAX_STATE_COPY_IN = 6;
    protected static final int SYNTAX_STATE_EXEC = 7;
    protected static final int SYNTAX_STATE_EXEC_CICS = 8;
    protected static final int SYNTAX_STATE_EXEC_CICS_RECEIVE_SEND = 9;
    protected static final int SYNTAX_STATE_EXEC_SQL = 10;
    protected static final int SYNTAX_STATE_EXEC_SQL_CLAUSE_FROM = 11;
    protected static final int SYNTAX_STATE_EXEC_SQL_STMT = 12;
    protected static final int SYNTAX_STATE_EXEC_SQL_STMT_INCLUDE = 13;
    protected static final int SYNTAX_STATE_IN_OF_or_REPLACING = 14;
    protected static final int SYNTAX_STATE_LINK_XCTL = 15;
    protected static final int SYNTAX_STATE_NORMAL = 16;
    protected static final int SYNTAX_STATE_PLI_INCLUDE = 17;
    protected static final int SYNTAX_STATE_PLI_PROC = 18;
    protected static final int SYNTAX_STATE_PROGRAM = 19;
    protected boolean EXEC_CICS_flag;
    protected boolean EXEC_SQL_flag;
    protected int ircaIndex;
    protected int syntaxState;
    protected short columnCurrentRecord;
    protected short currentTokenColumnNo;
    protected short previousTokenColumnNo;
    protected short previousTokenNumberOnLine;
    protected short tokenNumberOnLine;
    protected String currentToken;
    private String execSqlStatement;
    protected String literalToken;
    protected String mapName;
    protected String mapSetName;
    protected String previousPreviousToken;
    protected String previousToken;
    protected String typeOfControlTransfer;
    protected StringBuffer execStatementText;
    
    protected ClassifierByRecord(final ScanProperties scanProperties) {
        super(scanProperties);
        this.columnCurrentRecord = 1;
        this.currentToken = "";
        this.currentTokenColumnNo = 0;
        this.literalToken = "";
        this.EXEC_CICS_flag = false;
        this.EXEC_SQL_flag = false;
        this.execSqlStatement = "";
        this.execStatementText = null;
        this.ircaIndex = 0;
        this.mapName = null;
        this.mapSetName = null;
        this.previousPreviousToken = "";
        this.previousToken = "";
        this.previousTokenColumnNo = 0;
        this.previousTokenNumberOnLine = 0;
        this.syntaxState = 16;
        this.tokenNumberOnLine = 0;
        this.typeOfControlTransfer = null;
    }
    
    protected void captureExecStatementText() {
        if (this.currentToken.length() > 1 && this.previousToken.length() > 1) {
            this.execStatementText.append(" ");
        }
        else if (!this.currentToken.equals(",") && !this.currentToken.equals(".") && !this.currentToken.equals("(") && !this.currentToken.equals(")") && !this.previousToken.equals(".") && !this.previousToken.equals("(") && !this.previousToken.equals(":")) {
            this.execStatementText.append(" ");
        }
        this.execStatementText.append(this.currentToken);
    }
    
    protected boolean checkForBlankLine(final String iRecord) {
        final String recordTrimmed = iRecord.trim();
        if (recordTrimmed.length() != 0) {
            return false;
        }
        ++this.blankLineCount;
        return true;
    }
    
    protected void debugReportCompletedToken(final int fileLineNo, final int tokenNumberOnLine, final String token) {
        if (this.debug == 2) {
            System.out.println("   " + this.getLanguageCd() + " " + StringUtils.format("%06d", fileLineNo) + " " + StringUtils.format("%02d", tokenNumberOnLine) + " " + token);
        }
    }
    
    protected void debugReportScore() {
        if (this.debug == 2) {
            System.out.println("   " + this.getLanguageCd() + " score[" + this.score + "]");
        }
    }
    
    protected String getEndExecToken() {
        return "END-EXEC";
    }
    
    @Override
    public String getLanguageDescription() {
        return "unknown";
    }
    
    @Override
    public int getLanguageId() {
        return 22;
    }
    
    protected String getLiteralText() {
        final char delimiter = this.currentToken.charAt(0);
        if (delimiter != '\'' && delimiter != '\"') {
            return null;
        }
        String literalText = this.currentToken.substring(1);
        literalText = literalText.substring(0, literalText.length() - 1);
        return literalText;
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
    }
    
    @Override
    public void isScoreStillBad(final int lineCount, final ClassifierASM classifierASM, final ClassifierC classifierC, final ClassifierCOB classifierCOB, final ClassifierCPP classifierCPP, final ClassifierEASY classifierEASY, final ClassifierJCL classifierJCL, final ClassifierPLI classifierPLI, final ClassifierPLX classifierPLX) {
    }
    
    private boolean isSpecificToOneClassifier(final String iRecord) {
        if (this.identifierMode != 'U') {
            return false;
        }
        final String languageCd = this.getLanguageCd();
        if (!languageCd.equals("PLX")) {
            if (iRecord.startsWith(" /*") && iRecord.contains("*/")) {
                if (languageCd.equals("ASM") || languageCd.equals("COB")) {
                    return true;
                }
            }
            else if (iRecord.startsWith(" !")) {
                return true;
            }
        }
        return false;
    }
    
    protected void moveToNextCharOnRecord() {
        ++this.columnCurrentRecord;
        ++this.ircaIndex;
    }
    
    public void process(final int recordCount, final String iRecord, final String languageHint) {
        if (this.getIdentifierMode() == 'R') {
            return;
        }
        if (this.checkForBlankLine(iRecord)) {
            return;
        }
        if (this.isSpecificToOneClassifier(iRecord)) {
            return;
        }
        String record;
        if (this.getIgnoreCase()) {
            record = iRecord.toUpperCase();
        }
        else {
            record = iRecord;
        }
        this.processOneRecord(recordCount, iRecord, record, languageHint);
    }
    
    protected void processState_execCics() {
        if (this.currentToken.equalsIgnoreCase("HANDLE")) {
            this.metaData.incrementNumValue(83);
            this.syntaxState = 16;
        }
        else if (this.currentToken.equalsIgnoreCase("LINK") || this.currentToken.equalsIgnoreCase("XCTL")) {
            this.metaData.incrementNumValue(83);
            this.typeOfControlTransfer = this.currentToken;
            this.syntaxState = 15;
        }
        else if (this.currentToken.equalsIgnoreCase("RECEIVE") || this.currentToken.equalsIgnoreCase("SEND")) {
            this.mapName = null;
            this.mapSetName = null;
            this.syntaxState = 9;
        }
        else {
            this.syntaxState = 16;
        }
    }
    
    protected void processState_execCicsLinkOrXctl() {
        if (this.currentToken.equalsIgnoreCase(this.getEndExecToken())) {
            this.EXEC_CICS_flag = false;
            this.syntaxState = 16;
        }
        else if (this.currentToken.equalsIgnoreCase("PROGRAM")) {
            this.syntaxState = 19;
        }
    }
    
    protected void processState_execCicsReceiveOrSend() {
        if (this.currentToken.equalsIgnoreCase(this.getEndExecToken())) {
            this.EXEC_CICS_flag = false;
            this.syntaxState = 16;
        }
        else if (this.currentToken.equalsIgnoreCase("MAP") || this.currentToken.equalsIgnoreCase("MAPSET")) {
            this.syntaxState = 4;
        }
    }
    
    protected void processState_execSql() {
        this.execSqlStatement = this.currentToken;
        if (this.execSqlStatement.equalsIgnoreCase("INCLUDE")) {
            this.score += 10;
            this.syntaxState = 13;
        }
        else {
            this.syntaxState = 16;
        }
    }
    
    protected void processState_execSqlStmtInclude() {
        if (this.debug == 2) {
            System.out.println("Found EXEC SQL INCLUDE [" + this.currentToken + "]");
        }
        this.metaData.captureInclude(7, this.currentToken);
        this.syntaxState = 16;
    }
    
    protected void processState_mapOrMapset() {
        if (this.currentToken.equalsIgnoreCase(this.getEndExecToken())) {
            if (this.mapName != null) {
                if (this.mapSetName == null) {
                    this.metaData.addMap(this.mapName, this.mapName);
                }
                else {
                    this.metaData.addMap(this.mapSetName, this.mapName);
                }
            }
            this.EXEC_CICS_flag = false;
            this.syntaxState = 16;
        }
        else if (this.previousPreviousToken.equalsIgnoreCase("MAP") && this.previousToken.equals("(")) {
            this.mapName = this.currentToken;
        }
        else if (this.previousPreviousToken.equalsIgnoreCase("MAPSET") && this.previousToken.equals("(")) {
            this.mapSetName = this.currentToken;
        }
    }
    
    protected void processState_program() {
        if (this.currentToken.equalsIgnoreCase(this.getEndExecToken())) {
            this.EXEC_CICS_flag = false;
            this.syntaxState = 16;
        }
        else if (this.previousPreviousToken.equalsIgnoreCase("PROGRAM") && this.previousToken.equals("(")) {
            final String literalText = this.getLiteralText();
            if (literalText != null) {
                this.metaData.addControlTransfer(this.typeOfControlTransfer, literalText);
            }
            this.syntaxState = 16;
        }
    }
}
