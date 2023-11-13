// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierMetaData;
import java.util.List;
import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsPLI;
import com.ibm.dmh.scan.classify.ClassifierReservedWord;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierPLI extends ClassifierByRecordCobPliPlx
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2019\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final int ANSWER_NO = 0;
    protected static final int ANSWER_MAYBE = 1;
    protected static final int ANSWER_YES = 2;
    protected static final int MARGIN_VALUE_1_DEFAULT = 2;
    protected static final int MARGIN_VALUE_2_DEFAULT = 72;
    protected static final char TOKEN_STATE_IN_COMMENT = 'M';
    protected static final char TOKEN_STATE_IN_CONTINUE = 'C';
    protected static final char TOKEN_STATE_IN_EMBEDDED_QUOTE = 'E';
    protected static final char TOKEN_STATE_IN_HEX_LITERAL = 'X';
    protected static final char TOKEN_STATE_IN_LITERAL = 'Q';
    protected static final char TOKEN_STATE_ON_BLANK = 'B';
    protected static final char TOKEN_STATE_START = 'S';
    protected boolean foundAtLeastOne_DECLARE;
    protected boolean foundAtLeastOne_INCLUDE;
    protected boolean P_NewLine;
    protected boolean semicolonFound;
    protected char P_StringDelimiter;
    protected char P_TokenState;
    protected int dataDeclarationCount;
    protected int lastTokenWeight;
    protected int marginsValue1;
    protected int marginsValue2;
    protected int procedureIsSubroutineCount;
    protected int sequentialCommentLines;
    protected String ddName;
    private Boolean declareFoundFirst;
    private boolean inMacroDefinition;
    private boolean possibleHyphenFound;
    private int blankCount_PLI;
    private int procedureIsFunctionCount;
    private int reserveWordCount_COBOL;
    private int reserveWordCount_C;
    private int reserveWordCount_SQL;
    private short parenCount;
    private String firstTokenOfStmt;
    
    public ClassifierPLI(final ScanProperties scanProperties) {
        super(scanProperties);
        this.blankCount_PLI = 0;
        this.dataDeclarationCount = 0;
        this.ddName = "";
        this.declareFoundFirst = null;
        this.firstTokenOfStmt = null;
        this.foundAtLeastOne_DECLARE = false;
        this.foundAtLeastOne_INCLUDE = false;
        this.inMacroDefinition = false;
        this.lastTokenWeight = 0;
        this.marginsValue1 = 2;
        this.marginsValue2 = 72;
        this.P_NewLine = false;
        this.P_StringDelimiter = ' ';
        this.P_TokenState = 'S';
        this.parenCount = 0;
        this.possibleHyphenFound = false;
        this.procedureIsFunctionCount = 0;
        this.procedureIsSubroutineCount = 0;
        this.reserveWordCount_C = 0;
        this.reserveWordCount_COBOL = 0;
        this.reserveWordCount_SQL = 0;
        this.semicolonFound = false;
        this.sequentialCommentLines = 0;
    }
    
    protected void AccumulatePointsForTheScore(final ClassifierReservedWord iRw, final char[] inputRecordCharArray) {
        if (this.EXEC_CICS_flag || this.EXEC_SQL_flag) {
            return;
        }
        final int tokenWordType = iRw.getTokenWordType();
        int tokenWeight = iRw.getTokenWeight();
        switch (tokenWordType) {
            case 0: {
                if (this.currentToken.equalsIgnoreCase("%END") && this.inMacroDefinition) {
                    this.inMacroDefinition = false;
                }
                this.incrementReservedWordCount(1);
                break;
            }
            case 1: {
                if (this.ircaIndex < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex] == '-') {
                    break;
                }
                if (this.possibleHyphenFound) {
                    break;
                }
                if (inputRecordCharArray[0] == '*') {
                    break;
                }
                if (inputRecordCharArray[0] == '&') {
                    break;
                }
                if (this.currentToken.equalsIgnoreCase("BIN") || this.currentToken.equalsIgnoreCase("BINARY") || this.currentToken.equalsIgnoreCase("BIT") || this.currentToken.equalsIgnoreCase("CHAR") || this.currentToken.equalsIgnoreCase("CHARACTER") || this.currentToken.equalsIgnoreCase("DEC") || this.currentToken.equalsIgnoreCase("DECIMAL") || this.currentToken.equalsIgnoreCase("POINTER")) {
                    ++this.dataDeclarationCount;
                }
                if (this.currentToken.equalsIgnoreCase("CHAR")) {
                    if (this.ircaIndex < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex] != '(') {
                        ++this.reserveWordCount_C;
                    }
                }
                else if (this.currentToken.equalsIgnoreCase("COPY") || this.currentToken.equalsIgnoreCase("PIC") || this.currentToken.equalsIgnoreCase("PICTURE") || this.currentToken.equalsIgnoreCase("VALUE")) {
                    ++this.reserveWordCount_COBOL;
                    if (this.currentToken.equalsIgnoreCase("PIC") || (this.currentToken.equalsIgnoreCase("PICTURE") && (this.declareFoundFirst == null || !this.declareFoundFirst))) {
                        --tokenWeight;
                    }
                }
                else if (this.currentToken.equalsIgnoreCase("DCL") || this.currentToken.equalsIgnoreCase("DECLARE")) {
                    if (!this.inMacroDefinition) {
                        this.checkDeclareFoundFirst(Boolean.TRUE);
                    }
                    if (this.tokenNumberOnLine == 1) {
                        this.foundAtLeastOne_DECLARE = true;
                    }
                    this.lastTokenWeight = tokenWeight;
                }
                else if (this.currentToken.equalsIgnoreCase("ENV") || this.currentToken.equalsIgnoreCase("RETCODE")) {
                    this.lastTokenWeight = tokenWeight;
                }
                else if (this.currentToken.equalsIgnoreCase("INT")) {
                    ++this.reserveWordCount_C;
                }
                else if (this.currentToken.equalsIgnoreCase("FROM") || this.currentToken.equalsIgnoreCase("SELECT")) {
                    ++this.reserveWordCount_SQL;
                }
                this.incrementReservedWordCount(tokenWeight);
                break;
            }
            case 3: {
                if (this.ircaIndex + 1 == inputRecordCharArray.length) {
                    this.incrementReservedWordCount(tokenWeight);
                    break;
                }
                if (this.currentToken.equalsIgnoreCase("EXIT") || this.currentToken.equalsIgnoreCase("PROC")) {
                    if (this.ircaIndex < inputRecordCharArray.length && (inputRecordCharArray[this.ircaIndex] == '.' || inputRecordCharArray[this.ircaIndex] == '-')) {
                        break;
                    }
                    if (this.possibleHyphenFound) {
                        break;
                    }
                }
                this.incrementReservedWordCount(tokenWeight);
                break;
            }
            case 5: {
                this.incrementReservedWordCount(tokenWeight);
                break;
            }
        }
    }
    
    private int calculateSLOC(final int lineCount) {
        return lineCount - (this.blankLineCount + this.blankCount_PLI) - this.getCommentCount();
    }
    
    private void checkDeclareFoundFirst(final Boolean foundDeclare) {
        if (this.declareFoundFirst == null) {
            this.declareFoundFirst = foundDeclare;
        }
    }
    
    private void checkForReservedWord(final char[] inputRecordCharArray) {
        String keyUC;
        if (this.previousToken.equals("%") && !this.currentToken.startsWith("%")) {
            keyUC = this.previousToken + this.currentToken;
        }
        else {
            keyUC = this.currentToken;
        }
        keyUC = keyUC.toUpperCase();
        ClassifierReservedWord rw = null;
        if (ReservedWordsPLI.containsKey(keyUC)) {
            final String value = ReservedWordsPLI.get(keyUC);
            rw = this.allocateReserveWord(keyUC, value);
        }
        if (rw == null) {
            this.processNonReservedWord();
        }
        else {
            this.processReservedWord(rw, inputRecordCharArray);
        }
        this.possibleHyphenFound = false;
    }
    
    private void checkForSemicolon() {
        if (!this.semicolonFound) {
            this.score = 0;
            if (this.debug == 2) {
                System.out.println("*** PLI score set to 0 because no semicolons were found.");
            }
        }
    }
    
    private boolean checkPercentInclude() {
        if (this.currentToken.equalsIgnoreCase("%INCLUDE") || (this.previousToken.equals("%") && this.currentToken.equalsIgnoreCase("INCLUDE"))) {
            this.score += 25;
            this.ddName = "";
            return this.foundAtLeastOne_INCLUDE = true;
        }
        return false;
    }
    
    @Override
    protected boolean checkPlusPlusInclude(final String inputRecord) {
        if (inputRecord.length() < 18) {
            return false;
        }
        String s;
        if (!this.scanProperties.getAllowIncludeInAnyColumn()) {
            if (!this.scanProperties.getExpandIncludeInComment()) {
                s = inputRecord.substring(this.marginsValue1 - 1);
                s = s.trim();
                if (s.length() == 0) {
                    return false;
                }
                if (s.startsWith("/*") || this.P_TokenState == 'M') {
                    return false;
                }
            }
            s = inputRecord.substring(7);
        }
        else {
            s = inputRecord.substring(this.marginsValue1 - 1);
            s = s.trim();
            if (s.length() == 0) {
                return false;
            }
            if ((s.startsWith("/*") || this.P_TokenState == 'M') && !this.scanProperties.getExpandIncludeInComment()) {
                return false;
            }
            while (s.length() > 17) {
                if (s.startsWith("++")) {
                    break;
                }
                s = s.substring(1);
            }
        }
        return this.capturePlusPlusIncludeName(s, this.scanProperties.getTruncateFilenames());
    }
    
    private void checkSymanticState() {
        switch (this.syntaxState) {
            case 3: {
                this.processState_call();
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
            case 17: {
                this.processState_pliInclude();
                break;
            }
            case 18: {
                this.processState_pliProc();
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
    
    @Override
    public String getLanguageCd() {
        return "PLI";
    }
    
    @Override
    public String getLanguageDescription() {
        return "PL/I";
    }
    
    @Override
    public int getLanguageId() {
        return 16;
    }
    
    private boolean hasProcedureFunctions() {
        return this.procedureIsFunctionCount != 0;
    }
    
    private boolean hasProcedureSubroutines() {
        return this.procedureIsSubroutineCount != 0;
    }
    
    @Override
    public boolean getIgnoreCase() {
        return false;
    }
    
    protected void incrementReservedWordCount(final int scoreAdjustment) {
        ++this.reserveWordCount;
        this.increaseScore(scoreAdjustment);
    }
    
    private void isItReallyPLX(final int lineCount, final ClassifierPLX classifierPLX) {
        if (classifierPLX.getScore() == 0) {
            return;
        }
        if (classifierPLX.usesBexProductMacros()) {
            this.score = 0;
            if (this.debug == 2) {
                System.out.println("*** PLI score set to 0 because file uses Bex product macros.");
            }
        }
        else {
            final int plxCommentCount = classifierPLX.getPlxCommentCount();
            final int percentPlxComment = plxCommentCount / lineCount * 100;
            if (percentPlxComment > 5) {
                this.score = 0;
                if (this.debug == 2) {
                    System.out.println("*** PLI score set to 0 because % of PL/X comment was > 5.  It was: " + percentPlxComment);
                }
            }
        }
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        switch (this.reserveWordCount) {
            case 0: {
                this.score = 0;
                if (this.debug == 2) {
                    System.out.println("*** PLI score set to 0 because no reserved words were found.");
                    break;
                }
                break;
            }
            case 1: {
                final int SLOC = this.calculateSLOC(lineCount);
                if (this.reserveWordCount >= SLOC * 0.25) {
                    this.checkForSemicolon();
                    break;
                }
                this.score = 0;
                if (this.debug == 2) {
                    System.out.println("*** PLI score set to 0 because the reserved word count is < SLOC * .25.  Reserved word count: " + this.reserveWordCount + " SLOC: " + SLOC);
                    break;
                }
                break;
            }
            default: {
                this.isScoreBadWithMoreThanOneReservedWord(lineCount);
                break;
            }
        }
    }
    
    private void isScoreBadWithMoreThanOneReservedWord(final int lineCount) {
        if (!this.foundAtLeastOne_DECLARE && !this.foundAtLeastOne_INCLUDE && !this.hasProcedureFunctions() && !this.hasProcedureSubroutines()) {
            final int SLOC = this.calculateSLOC(lineCount);
            if (this.dataDeclarationCount > SLOC * 0.8) {
                return;
            }
            if (this.reserveWordCount > SLOC * 1.3 || this.reserveWordCount < SLOC * 0.5) {
                this.score = 0;
                if (this.debug == 2) {
                    System.out.println("*** PLI score set to 0 because too many or too few reserved words relative to SLOC.  Reserved word count: " + this.reserveWordCount + " SLOC: " + SLOC);
                }
                return;
            }
            if (this.score < lineCount * 0.05) {
                this.score = 0;
                if (this.debug == 2) {
                    System.out.println("*** PLI score set to 0 because not 1 line in 20 were from PLI.  Score: " + this.score + " lineCount: " + lineCount);
                }
                return;
            }
        }
        int reserveWordDiff = this.reserveWordCount - this.reserveWordCount_C;
        if (reserveWordDiff < this.reserveWordCount * 0.05) {
            this.score = 0;
            if (this.debug == 2) {
                System.out.println("*** PLI score set to 0 because not enough PLI.  ReservedWordCount: " + this.reserveWordCount + " ReservedWordCount_C: " + this.reserveWordCount_C);
            }
            return;
        }
        reserveWordDiff = this.reserveWordCount - this.reserveWordCount_COBOL;
        if (reserveWordDiff < this.reserveWordCount * 0.05) {
            this.score = 0;
            if (this.debug == 2) {
                System.out.println("*** PLI score set to 0 because not enough PLI.  ReservedWordCount: " + this.reserveWordCount + " ReservedWordCount_COBOL: " + this.reserveWordCount_COBOL);
            }
            return;
        }
        reserveWordDiff = this.reserveWordCount - this.reserveWordCount_SQL;
        if (reserveWordDiff < this.reserveWordCount * 0.05) {
            this.score = 0;
            if (this.debug == 2) {
                System.out.println("*** PLI score set to 0 because not enough PLI.  ReservedWordCount: " + this.reserveWordCount + " ReservedWordCount_SQL: " + this.reserveWordCount_SQL);
            }
        }
    }
    
    @Override
    public void isScoreStillBad(final int lineCount, final ClassifierASM classifierASM, final ClassifierC classifierC, final ClassifierCOB classifierCOB, final ClassifierCPP classifierCPP, final ClassifierEASY classifierEASY, final ClassifierJCL classifierJCL, final ClassifierPLI classifierPLI, final ClassifierPLX classifierPLX) {
        if (this.reserveWordCount >= this.calculateSLOC(lineCount) / 2) {
            final int asmScore = classifierASM.getScore();
            final int cScore = classifierC.getScore();
            final int cblScore = classifierCOB.getScore();
            final int cppScore = classifierCPP.getScore();
            final int easyScore = classifierEASY.getScore();
            final int jclScore = classifierJCL.getScore();
            if (asmScore != 0 && classifierASM.getReserveWordCount() != 0) {
                if (this.score / 3 < asmScore) {
                    this.checkForSemicolon();
                }
            }
            else if (cblScore != 0 && (classifierCOB.getVerbCount() != 0 || classifierCOB.getPictureCount() != 0 || classifierCOB.getCompilerDirectingCount() != 0)) {
                if (this.score / 3 < cblScore) {
                    this.checkForSemicolon();
                }
            }
            else if (easyScore != 0 && (classifierEASY.getReserveWordCount() != 0 || !classifierEASY.getEasyMajorKeyWordFound())) {
                if (this.score / 3 < easyScore) {
                    this.checkForSemicolon();
                }
            }
            else if (jclScore != 0 && classifierJCL.getReserveWordCount() != 0 && this.score / 3 < jclScore) {
                this.checkForSemicolon();
            }
        }
        if (this.score != 0) {
            this.isItReallyPLX(lineCount, classifierPLX);
        }
    }
    
    private boolean isCharADelimiter(final char iChar) {
        return iChar == ' ' || iChar == '&' || iChar == '\'' || iChar == ':' || iChar == ',' || iChar == '=' || iChar == '/' || iChar == '>' || iChar == '(' || iChar == '<' || iChar == '-' || iChar == '.' || iChar == '+' || iChar == ')' || iChar == ';';
    }
    
    protected void TokenComplete(final char[] inputRecordCharArray) {
        this.P_TokenState = 'S';
        if (this.currentToken.length() == 0) {
            return;
        }
        ++this.tokenNumberOnLine;
        if (this.firstTokenOfStmt == null) {
            this.firstTokenOfStmt = this.currentToken;
        }
        if (this.previousToken.equalsIgnoreCase("ENV") && !this.currentToken.equals("(")) {
            this.score -= this.lastTokenWeight;
        }
        if (this.currentToken.equals(";")) {
            this.score += 2;
            this.semicolonFound = true;
            if (this.syntaxState == 17 && this.ddName.length() != 0) {
                this.metaData.captureInclude(3, this.ddName.toUpperCase());
            }
            this.EXEC_CICS_flag = false;
            this.EXEC_SQL_flag = false;
            this.parenCount = 0;
            this.syntaxState = 16;
        }
        else if (this.currentToken.equals("(")) {
            ++this.parenCount;
            if (this.previousToken.equalsIgnoreCase("DCL")) {
                this.score -= this.lastTokenWeight;
            }
            this.checkSymanticState();
        }
        else if (this.currentToken.equals(")")) {
            --this.parenCount;
            this.checkSymanticState();
        }
        else if (this.currentToken.length() == 1) {
            if (this.currentToken.equals("&") || this.currentToken.equals("'") || this.currentToken.equals("*") || this.currentToken.equals(":") || this.currentToken.equals(",") || this.currentToken.equals("=") || this.currentToken.equals("/") || this.currentToken.equals(">") || this.currentToken.equals("<") || this.currentToken.equals("+") || this.currentToken.equals(".")) {
                this.possibleHyphenFound = false;
            }
            else if (this.currentToken.equals("-")) {
                this.possibleHyphenFound = true;
            }
            else {
                this.checkForReservedWord(inputRecordCharArray);
                this.checkSymanticState();
            }
        }
        else {
            this.checkForReservedWord(inputRecordCharArray);
            this.checkSymanticState();
        }
        if (this.P_NewLine) {
            this.tokenNumberOnLine = 0;
        }
        this.resetToken();
    }
    
    private void processNonReservedWord() {
        if (this.currentToken.startsWith("\"") || this.currentToken.startsWith("'")) {
            this.metaData.addLiteral(this.currentToken);
        }
        else if (!this.currentToken.equals("^") && (!this.EXEC_SQL_flag || !this.currentToken.equalsIgnoreCase("NOT")) && !this.currentToken.equalsIgnoreCase("SMALLINT")) {
            if (!this.currentToken.equalsIgnoreCase("TABLE")) {
                if (StringUtils.isNumeric(this.currentToken)) {
                    this.metaData.addLiteral(this.currentToken);
                }
                else {
                    this.metaData.addSymbolUserDefined(this.currentToken);
                }
            }
        }
    }
    
    private void processReservedWord(final ClassifierReservedWord rw, final char[] inputRecordCharArray) {
        this.metaData.addSymbolReserved(rw.getToken());
        this.AccumulatePointsForTheScore(rw, inputRecordCharArray);
    }
    
    protected void resetToken() {
        if (this.currentToken.equals(";")) {
            this.firstTokenOfStmt = null;
        }
        this.previousPreviousToken = this.previousToken;
        this.previousToken = this.currentToken;
        this.currentToken = "";
    }
    
    private void processState_call() {
        if (this.currentToken.equalsIgnoreCase("AIBTDLI")) {
            this.metaData.incrementNumValue(43);
        }
        else if (this.currentToken.equalsIgnoreCase("ASMTDLI")) {
            this.metaData.incrementNumValue(42);
        }
        else if (this.currentToken.equalsIgnoreCase("PLITDLI")) {
            this.metaData.incrementNumValue(41);
            if (this.identifierMode == 'U') {
                this.identifierMode = 'C';
            }
        }
        else if (this.currentToken.startsWith("MQ")) {
            this.metaData.incrementNumValue(901);
        }
        this.syntaxState = 16;
    }
    
    private void processState_normalToken() {
        if (this.checkPercentInclude()) {
            this.syntaxState = 17;
        }
        else if (this.currentToken.equalsIgnoreCase("CALL")) {
            this.syntaxState = 3;
        }
        else if (this.currentToken.equalsIgnoreCase("END-EXEC")) {
            this.EXEC_CICS_flag = false;
            this.EXEC_SQL_flag = false;
        }
        else if (this.currentToken.equalsIgnoreCase("EXEC") || this.currentToken.equalsIgnoreCase("EXECUTE")) {
            this.syntaxState = 7;
        }
        else if (this.currentToken.equalsIgnoreCase("%XINCLUDE") || (this.previousToken.equals("%") && this.currentToken.equalsIgnoreCase("XINCLUDE"))) {
            if (this.identifierMode == 'U') {
                this.identifierMode = 'C';
            }
            this.score += 25;
            this.ddName = "";
            this.foundAtLeastOne_INCLUDE = true;
            this.syntaxState = 17;
        }
        else if (this.currentToken.equalsIgnoreCase("PACKAGE")) {
            this.checkDeclareFoundFirst(Boolean.FALSE);
        }
        else if (this.currentToken.equalsIgnoreCase("PROC") || this.currentToken.equalsIgnoreCase("PROCEDURE")) {
            if (this.firstTokenOfStmt.startsWith("%")) {
                this.inMacroDefinition = true;
                return;
            }
            if (!this.previousToken.equals(":")) {
                return;
            }
            this.checkDeclareFoundFirst(Boolean.FALSE);
            if (this.declareFoundFirst.equals(Boolean.FALSE)) {
                final List<String> entryPoints = this.metaData.getEntryPoints();
                if (entryPoints == null || entryPoints.size() == 0) {
                    this.metaData.addEntryPoint(this.previousPreviousToken);
                }
            }
            ++this.procedureIsSubroutineCount;
            this.syntaxState = 18;
        }
    }
    
    private void processState_pliInclude() {
        if (this.currentToken.equals(")")) {
            this.ddName = "";
        }
        else if (this.currentToken.equals("(")) {
            if (this.ddName.length() == 0) {
                this.ddName = "SYSLIB";
            }
        }
        else if (this.ddName.length() == 0 && !this.previousToken.equals("(")) {
            this.ddName = this.currentToken;
        }
        else if (this.previousToken.equals(",")) {
            this.metaData.captureInclude(3, this.ddName.toUpperCase());
            this.ddName = this.currentToken;
        }
        else if (this.previousToken.equals("(")) {
            this.metaData.captureInclude(this.currentToken, this.ddName.toUpperCase(), this.debug);
        }
        else {
            this.metaData.captureInclude(3, this.ddName.toUpperCase());
        }
    }
    
    private void processState_pliProc() {
        if (this.currentToken.equals("(")) {
            if (this.previousToken.equalsIgnoreCase("RETURNS")) {
                --this.procedureIsSubroutineCount;
                ++this.procedureIsFunctionCount;
            }
        }
        else if (this.checkPercentInclude()) {
            this.syntaxState = 17;
        }
    }
    
    @Override
    public ClassifierMetaData processEndOfFile(final int lineCount) {
        if (this.declareFoundFirst != null && this.declareFoundFirst.equals(Boolean.TRUE)) {
            this.metaData.setNonCommentBefore1st(0);
        }
        if (this.procedureIsFunctionCount != 0) {
            this.metaData.addNumValue(60, this.procedureIsFunctionCount);
        }
        if (this.procedureIsSubroutineCount != 0) {
            this.metaData.addNumValue(37, this.procedureIsSubroutineCount);
        }
        this.metaData.setBlanklines(this.blankLineCount + this.blankCount_PLI);
        this.metaData.setNonCommentLines(this.calculateSLOC(lineCount));
        this.metaData.setTotalLines(lineCount);
        return this.metaData;
    }
    
    @Override
    public void processInitialization() {
        this.blankCount_PLI = 0;
        this.currentToken = "";
        this.ddName = "";
        this.declareFoundFirst = null;
        this.EXEC_CICS_flag = false;
        this.EXEC_SQL_flag = false;
        this.firstTokenOfStmt = null;
        this.inMacroDefinition = false;
        this.P_TokenState = 'S';
        this.parenCount = 0;
        this.previousPreviousToken = "";
        this.previousToken = "";
        this.procedureIsFunctionCount = 0;
        this.procedureIsSubroutineCount = 0;
        this.reserveWordCount = 0;
        this.reserveWordCount_C = 0;
        this.reserveWordCount_COBOL = 0;
        this.reserveWordCount_SQL = 0;
        this.semicolonFound = false;
        this.sequentialCommentLines = 0;
        this.syntaxState = 16;
        this.identifierMode = 'U';
        this.metaData = new ClassifierMetaData(this.scanProperties.getCaptureComments(), this.scanProperties.getCaptureEntryPoints(), this.scanProperties.getCaptureExecStatements(), this.scanProperties.getCaptureLiterals(), this.scanProperties.getCapturePictures(), this.scanProperties.getCaptureSymbolsReserved(), this.scanProperties.getCaptureSymbolsUserDefined());
    }
    
    protected boolean ProcessFunctionCode(final char[] inputRecordCharArray, final String languageHint) {
        if (this.identifierMode != 'U') {
            return this.identifierMode != 'C';
        }
        if (!languageHint.equals("PLI") && ((inputRecordCharArray[0] == '/' && inputRecordCharArray[1] == '/') || inputRecordCharArray[0] == '>')) {
            this.rejectThisLanguageCd();
            return true;
        }
        return false;
    }
    
    @Override
    public void processOneRecord(final int recordCount, final String literalRecord, String inputRecord, final String languageHint) {
        char[] inputRecordCharArray = inputRecord.toCharArray();
        if (inputRecordCharArray.length < this.marginsValue2) {
            inputRecord += StringUtils.repeat(" ", this.marginsValue2 - inputRecordCharArray.length);
            inputRecordCharArray = inputRecord.toCharArray();
        }
        if (this.checkAlternateFormsOfCopy(inputRecord)) {
            return;
        }
        if (this.ProcessFunctionCode(inputRecordCharArray, languageHint)) {
            return;
        }
        if (this.P_TokenState != 'Q') {
            final String inputRecordTrimmed = StringUtils.trimEnd(inputRecord);
            if (inputRecordTrimmed.length() < this.marginsValue1) {
                if (this.P_TokenState == 'M') {
                    this.metaData.incrementCommentLines();
                }
                return;
            }
        }
        this.columnCurrentRecord = 1;
        this.ircaIndex = 0;
        if (this.marginsValue1 > 1 && (inputRecordCharArray[0] == '0' || inputRecordCharArray[0] == '-' || inputRecordCharArray[0] == '+' || inputRecordCharArray[0] == '1')) {
            inputRecordCharArray[0] = ' ';
        }
        if ((inputRecordCharArray[0] != '*' && inputRecordCharArray[0] != '%') || this.columnCurrentRecord != 1) {
            if (this.P_TokenState != 'Q') {
                if (inputRecordCharArray[0] == ' ' || this.marginsValue1 == 1) {
                    this.skipToFirstPLIcharacter(inputRecordCharArray);
                }
                else if (this.P_TokenState != 'S' || inputRecordCharArray[0] != '/' || inputRecordCharArray[1] != '*') {
                    if (this.P_TokenState != 'M') {
                        if (this.marginsValue1 != 2) {
                            this.rejectThisLanguageCd();
                            return;
                        }
                        inputRecordCharArray[0] = ' ';
                    }
                }
            }
        }
        if (this.columnCurrentRecord > this.marginsValue2 && (this.ircaIndex + 1 == inputRecordCharArray.length || inputRecordCharArray[this.ircaIndex] == '\n')) {
            return;
        }
        while (this.ircaIndex < inputRecordCharArray.length && this.columnCurrentRecord <= this.marginsValue2 && inputRecordCharArray[this.ircaIndex] == ' ' && inputRecordCharArray[this.ircaIndex] != '\n' && this.P_TokenState != 'Q') {
            this.moveToNextCharOnRecord();
        }
        if (this.ircaIndex == inputRecordCharArray.length || this.columnCurrentRecord > this.marginsValue2 || inputRecordCharArray[this.ircaIndex] == '\n') {
            ++this.blankCount_PLI;
            return;
        }
        boolean completeRecordIsComment = true;
        boolean P_IsDelimiter = false;
        final boolean returnNow = false;
        this.P_NewLine = true;
        if (this.P_TokenState == 'S') {
            this.tokenNumberOnLine = 0;
        }
        while (this.ircaIndex < inputRecordCharArray.length && this.columnCurrentRecord <= this.marginsValue2) {
            if (this.P_TokenState != 'M') {
                if (inputRecordCharArray[this.ircaIndex] == '*') {
                    if (this.columnCurrentRecord == 1 && this.ircaIndex + 8 < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex] == '*' && inputRecordCharArray[this.ircaIndex + 1] == 'P' && inputRecordCharArray[this.ircaIndex + 2] == 'R' && inputRecordCharArray[this.ircaIndex + 3] == 'O' && inputRecordCharArray[this.ircaIndex + 4] == 'C' && inputRecordCharArray[this.ircaIndex + 5] == 'E' && inputRecordCharArray[this.ircaIndex + 6] == 'S' && inputRecordCharArray[this.ircaIndex + 7] == 'S' && inputRecordCharArray[this.ircaIndex + 8] == ' ') {
                        inputRecordCharArray[this.ircaIndex] = '%';
                    }
                    else {
                        P_IsDelimiter = true;
                    }
                }
                else {
                    P_IsDelimiter = this.isCharADelimiter(inputRecordCharArray[this.ircaIndex]);
                }
                if (inputRecordCharArray[this.ircaIndex] == '/' && this.ircaIndex + 1 < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex + 1] == '*' && this.P_TokenState != 'Q') {
                    this.P_TokenState = 'M';
                    this.moveToNextCharOnRecord();
                    this.moveToNextCharOnRecord();
                    if (this.ircaIndex == inputRecordCharArray.length) {
                        break;
                    }
                }
                if (completeRecordIsComment && this.P_TokenState != 'M' && inputRecordCharArray[this.ircaIndex] != ' ') {
                    completeRecordIsComment = false;
                }
            }
            Label_1641: {
                switch (this.P_TokenState) {
                    case 'B': {
                        if (this.P_NewLine) {
                            this.TokenComplete(inputRecordCharArray);
                            break;
                        }
                        if (inputRecordCharArray[this.ircaIndex] == ' ') {
                            this.moveToNextCharOnRecord();
                            break;
                        }
                        this.TokenComplete(inputRecordCharArray);
                        break;
                    }
                    case 'C': {
                        if (this.P_NewLine) {
                            this.TokenComplete(inputRecordCharArray);
                            break;
                        }
                        if (inputRecordCharArray[this.ircaIndex] == ' ') {
                            this.P_TokenState = 'B';
                            this.moveToNextCharOnRecord();
                            break;
                        }
                        if (P_IsDelimiter) {
                            this.TokenComplete(inputRecordCharArray);
                            break;
                        }
                        this.currentToken += inputRecordCharArray[this.ircaIndex];
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    case 'E': {
                        if (inputRecordCharArray[this.ircaIndex] == this.P_StringDelimiter) {
                            this.moveToNextCharOnRecord();
                            this.P_TokenState = 'Q';
                            break;
                        }
                        this.TokenComplete(inputRecordCharArray);
                        break;
                    }
                    case 'M': {
                        if (inputRecordCharArray[this.ircaIndex] == '*' && this.ircaIndex + 1 < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex + 1] == '/') {
                            this.score += 5;
                            this.moveToNextCharOnRecord();
                            this.moveToNextCharOnRecord();
                            this.TokenComplete(inputRecordCharArray);
                            this.sequentialCommentLines = 0;
                            break;
                        }
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    case 'Q': {
                        if (inputRecordCharArray[this.ircaIndex] == this.P_StringDelimiter) {
                            this.P_TokenState = 'E';
                        }
                        if (this.ircaIndex + 1 >= this.marginsValue1) {
                            this.currentToken += inputRecordCharArray[this.ircaIndex];
                        }
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    case 'S': {
                        switch (inputRecordCharArray[this.ircaIndex]) {
                            case ' ': {
                                this.moveToNextCharOnRecord();
                                break Label_1641;
                            }
                            case 'X': {
                                this.currentToken += inputRecordCharArray[this.ircaIndex];
                                this.moveToNextCharOnRecord();
                                this.P_TokenState = 'X';
                                break Label_1641;
                            }
                            case '\"':
                            case '\'': {
                                this.P_StringDelimiter = inputRecordCharArray[this.ircaIndex];
                                this.currentToken += inputRecordCharArray[this.ircaIndex];
                                this.moveToNextCharOnRecord();
                                this.P_TokenState = 'Q';
                                break Label_1641;
                            }
                            default: {
                                if (P_IsDelimiter) {
                                    this.currentToken += inputRecordCharArray[this.ircaIndex];
                                    this.moveToNextCharOnRecord();
                                    this.TokenComplete(inputRecordCharArray);
                                    break Label_1641;
                                }
                                this.currentToken += inputRecordCharArray[this.ircaIndex];
                                this.moveToNextCharOnRecord();
                                this.P_TokenState = 'C';
                                break Label_1641;
                            }
                        }
                        break;
                    }
                    case 'X': {
                        if (inputRecordCharArray[this.ircaIndex] == ' ') {
                            this.moveToNextCharOnRecord();
                            this.P_TokenState = 'B';
                            break;
                        }
                        if (inputRecordCharArray[this.ircaIndex] == '\"' || inputRecordCharArray[this.ircaIndex] == '\'') {
                            this.P_StringDelimiter = inputRecordCharArray[this.ircaIndex];
                            this.currentToken += inputRecordCharArray[this.ircaIndex];
                            this.moveToNextCharOnRecord();
                            this.P_TokenState = 'Q';
                            break;
                        }
                        if (P_IsDelimiter) {
                            this.TokenComplete(inputRecordCharArray);
                            break;
                        }
                        this.currentToken += inputRecordCharArray[this.ircaIndex];
                        this.moveToNextCharOnRecord();
                        this.P_TokenState = 'C';
                        break;
                    }
                }
            }
            if (returnNow) {
                break;
            }
            if (this.currentToken.length() >= 1024) {
                this.TokenComplete(inputRecordCharArray);
            }
            this.P_NewLine = false;
        }
        if (returnNow) {
            return;
        }
        if (completeRecordIsComment) {
            ++this.sequentialCommentLines;
            this.score += 5;
            this.metaData.incrementCommentLines();
        }
    }
    
    private void skipToFirstPLIcharacter(final char[] inputRecordCharArray) {
        while (this.ircaIndex < inputRecordCharArray.length && this.columnCurrentRecord < this.marginsValue1 && this.columnCurrentRecord <= this.marginsValue2 && inputRecordCharArray[this.ircaIndex] != '\n') {
            this.moveToNextCharOnRecord();
        }
    }
    
    @Override
    protected boolean checkForBlankLine(final String iRecord) {
        return this.P_TokenState != 'Q' && super.checkForBlankLine(iRecord);
    }
}
