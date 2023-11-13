// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import java.util.HashSet;
import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsCOB;
import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.ClassifierReservedWord;
import com.ibm.dmh.scan.classify.ScanProperties;
import java.util.Set;

public class ClassifierCOB extends ClassifierByRecordCobPliPlx
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2019\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final String FIGURATIVE_CONSTANTS = "'HIGH-VALUE', 'HIGH-VALUES', 'LOW-VALUE', 'LOW-VALUES', 'NULL', 'NULLS', 'SPACE', 'SPACES', 'ZERO', 'ZEROES', 'ZEROS'";
    private static Set<String> figurativeConstants;
    private boolean buildingPictureClause;
    private boolean C_Continuation;
    private boolean C_NewLine;
    private boolean CBL_marker;
    private boolean found_COPY_IN;
    private boolean found_IDMS_SECTION;
    private boolean idDivFound;
    private boolean inRemarksParaFlag;
    private boolean invalidCOBOLsequence;
    private boolean suspectFreeFormatCobol;
    private boolean validatedPrevCol7Comment;
    private boolean watchForCommentDelimiter;
    private char C_StringDelimiter;
    private char C_TokenState;
    private char inDivision;
    private int compilerDirectingCount_COBOL;
    private int inclTypeId;
    private int inputRecordCount;
    private int periodWORDperiod;
    private int pictureCount;
    private int verbCount_COBOL;
    private String includedDDName;
    private String includedMemberName;
    private String literalRecord;
    
    public ClassifierCOB(final ScanProperties scanProperties) {
        super(scanProperties);
        this.initializeInstanceVariables();
    }
    
    private void addToCurrentToken(final char text) {
        this.currentToken += text;
    }
    
    private void addToLiteralToken() {
        this.literalToken += this.literalRecord.charAt(this.columnCurrentRecord - 1);
    }
    
    private void captureEntryPointName() {
        if ((this.previousPreviousToken.equals("PROGRAM-ID") && this.previousToken.equals(".")) || this.previousToken.equals("PROGRAM-ID")) {
            this.metaData.addEntryPoint(this.currentToken);
        }
        else if (this.previousToken.equals("ENTRY") && !this.previousPreviousToken.equals("TO")) {
            this.metaData.addEntryPoint(this.currentToken);
        }
    }
    
    @Override
    protected boolean checkPlusPlusInclude(final String inputRecord) {
        if (inputRecord.length() < 18) {
            return false;
        }
        String s;
        if (!this.scanProperties.getAllowIncludeInAnyColumn()) {
            if (!this.scanProperties.getExpandIncludeInComment()) {
                s = inputRecord.substring(6);
                if (s.startsWith("*") || s.startsWith("/")) {
                    return false;
                }
            }
            s = inputRecord.substring(7);
        }
        else {
            s = inputRecord.substring(6);
            if (s.startsWith("*") || s.startsWith("/")) {
                if (!this.scanProperties.getExpandIncludeInComment()) {
                    return false;
                }
                s = inputRecord.substring(7);
            }
            while (s.startsWith(" ")) {
                s = s.substring(1);
            }
        }
        return this.capturePlusPlusIncludeName(s, this.scanProperties.getTruncateFilenames());
    }
    
    @Override
    public String getLanguageCd() {
        return "COB";
    }
    
    @Override
    public String getLanguageDescription() {
        return "COBOL";
    }
    
    @Override
    protected String getEndExecToken() {
        return "END-EXEC";
    }
    
    @Override
    public int getLanguageId() {
        return 6;
    }
    
    private void AccumulatePointsForTheScore(final char[] inputRecordCharArray, final ClassifierReservedWord rw) {
        this.periodWORDperiod = 0;
        if (this.EXEC_CICS_flag || this.EXEC_SQL_flag) {
            return;
        }
        Label_0099: {
            if (this.inRemarksParaFlag) {
                if (this.tokenNumberOnLine == 1) {
                    if (this.currentToken.equalsIgnoreCase("ID") || this.currentToken.equalsIgnoreCase("IDENTIFICATION") || this.currentToken.equalsIgnoreCase("ENVIRONMENT") || this.currentToken.equalsIgnoreCase("DATA")) {
                        break Label_0099;
                    }
                    if (this.currentToken.equalsIgnoreCase("PROCEDURE")) {
                        break Label_0099;
                    }
                }
                return;
            }
        }
        final int tokenWordType = rw.getTokenWordType();
        Label_0271: {
            switch (tokenWordType) {
                case 1: {
                    if (this.currentToken.equalsIgnoreCase("FILLER")) {
                        if (this.tokenNumberOnLine == 2 || StringUtils.isNumeric(this.previousToken)) {
                            this.increaseScore(rw.getTokenWeight());
                        }
                        break Label_0271;
                    }
                    else {
                        this.increaseScore(rw.getTokenWeight());
                        if (this.currentToken.equalsIgnoreCase("PIC")) {
                            if (inputRecordCharArray[this.ircaIndex] == '\'') {
                                break Label_0271;
                            }
                            ++this.pictureCount;
                            break Label_0271;
                        }
                        else {
                            if (this.currentToken.equalsIgnoreCase("PICTURE")) {
                                ++this.pictureCount;
                            }
                            break Label_0271;
                        }
                    }
                    break;
                }
                case 3: {
                    this.increaseScore(rw.getTokenWeight());
                    ++this.verbCount_COBOL;
                    break;
                }
            }
            this.increaseScore(rw.getTokenWeight());
        }
        if (this.tokenNumberOnLine == 1 && (this.currentToken.equalsIgnoreCase("BASIS") || this.currentToken.equalsIgnoreCase("CBL") || this.currentToken.equalsIgnoreCase("COPY") || this.currentToken.equalsIgnoreCase("DELETE") || this.currentToken.equalsIgnoreCase("EJECT") || this.currentToken.equalsIgnoreCase("ENTER") || this.currentToken.equalsIgnoreCase("INSERT") || this.currentToken.equalsIgnoreCase("PROCESS") || this.currentToken.equalsIgnoreCase("READY") || this.currentToken.equalsIgnoreCase("RESET") || this.currentToken.equalsIgnoreCase("REPLACE") || this.currentToken.equalsIgnoreCase("SERVICE") || this.currentToken.equalsIgnoreCase("SKIP1") || this.currentToken.equalsIgnoreCase("SKIP2") || this.currentToken.equalsIgnoreCase("SKIP3") || this.currentToken.equalsIgnoreCase("TITLE") || this.currentToken.equalsIgnoreCase("USE") || this.currentToken.equalsIgnoreCase("*CBL") || this.currentToken.equalsIgnoreCase("*CONTROL"))) {
            ++this.compilerDirectingCount_COBOL;
            this.increaseScore(2);
        }
        final int attrTypeId = rw.getTokenAttrTypeId();
        if (attrTypeId != 0 && this.inDivision == 'P') {
            this.metaData.incrementNumValue(attrTypeId);
            if (this.debug == 2) {
                System.out.println("attrTypeId[" + attrTypeId + "] recordCount[" + this.inputRecordCount + "] currentToken[" + this.currentToken + "]");
            }
        }
    }
    
    private void CaptureCopyName() {
        String inclName;
        if (this.includedMemberName.length() > 5 && this.includedMemberName.substring(0, 5).equalsIgnoreCase("LIB$:")) {
            inclName = this.includedMemberName.substring(5);
        }
        else {
            inclName = this.includedMemberName;
        }
        if (this.inclTypeId == 4) {
            this.metaData.captureInclude(inclName, this.includedDDName, this.debug);
            this.includedDDName = "";
        }
        else {
            this.metaData.captureInclude(this.inclTypeId, inclName);
        }
        this.found_COPY_IN = false;
        this.inclTypeId = 3;
        this.includedMemberName = "";
    }
    
    private boolean CheckAlternateLocationOfINC(final String inputRecord) {
        if (inputRecord.length() < 12) {
            return false;
        }
        final String record = inputRecord.substring(6);
        final String recordTrimmed = record.trim();
        return recordTrimmed.length() != 0 && recordTrimmed.startsWith("-INC ") && this.captureIncMemberName(recordTrimmed);
    }
    
    private boolean checkContinuedLiteral(final char[] inputRecordCharArray) {
        if (this.C_Continuation) {
            this.columnCurrentRecord = 8;
            this.ircaIndex = 7;
            this.skipLeadingWhiteSpace(inputRecordCharArray);
            if (this.ircaIndex >= inputRecordCharArray.length) {
                return false;
            }
            if (inputRecordCharArray[this.ircaIndex] == '\"' || inputRecordCharArray[this.ircaIndex] == '\'') {
                this.moveToNextCharOnRecord();
            }
            return true;
        }
        else {
            if (inputRecordCharArray.length < 12) {
                this.TokenComplete(inputRecordCharArray);
                return true;
            }
            if (inputRecordCharArray[7] != ' ' || inputRecordCharArray[8] != ' ' || inputRecordCharArray[9] != ' ' || inputRecordCharArray[10] != ' ') {
                this.TokenComplete(inputRecordCharArray);
                return true;
            }
            final String inputRecord = String.valueOf(inputRecordCharArray);
            final String areaB = inputRecord.substring(11);
            areaB.trim();
            if (areaB.charAt(0) != this.C_StringDelimiter) {
                this.TokenComplete(inputRecordCharArray);
                return true;
            }
            this.addToCurrentToken('.');
            if (this.currentToken.length() >= 160) {
                this.TokenComplete(inputRecordCharArray);
                this.periodWORDperiod = 0;
                return false;
            }
            this.columnCurrentRecord = 1;
            this.skipLeadingWhiteSpace(inputRecordCharArray);
            return this.ircaIndex < inputRecordCharArray.length;
        }
    }
    
    @Override
    protected boolean checkForBlankLine(final String record) {
        if (record.length() > 6) {
            String recordTrimmed = record.substring(6);
            if (recordTrimmed.length() > 65) {
                recordTrimmed = recordTrimmed.substring(0, 65);
            }
            recordTrimmed = recordTrimmed.trim();
            if (recordTrimmed.length() != 0) {
                return false;
            }
        }
        ++this.blankLineCount;
        return true;
    }
    
    private void checkForFreeFormatCobol(final String inputRecord) {
        final char column1char = inputRecord.charAt(0);
        final char column7char = inputRecord.charAt(6);
        switch (column1char) {
            case 'D': {
                if (!this.validatedPrevCol7Comment) {
                    this.suspectFreeFormatCobol = true;
                    break;
                }
                break;
            }
            case '*':
            case '/': {
                if (!this.validatedPrevCol7Comment && column7char != '*' && column7char != 'D' && column7char != '-') {
                    this.suspectFreeFormatCobol = true;
                    break;
                }
                break;
            }
            case '-': {
                if (!this.validatedPrevCol7Comment) {
                    this.increaseScore(1);
                    this.C_Continuation = true;
                    this.suspectFreeFormatCobol = true;
                    break;
                }
                break;
            }
        }
    }
    
    private boolean checkIfCurrentCharIsADelimiter(final char currentChar, final char[] inputRecordCharArray) {
        if (currentChar == '.') {
            if (this.EXEC_SQL_flag) {
                return true;
            }
            if (this.columnCurrentRecord + 1 == 72) {
                return true;
            }
            if (this.ircaIndex + 1 == inputRecordCharArray.length) {
                return true;
            }
            final char nextChar = inputRecordCharArray[this.ircaIndex + 1];
            if (nextChar == ' ' || nextChar == '\n' || nextChar == '\t') {
                return true;
            }
        }
        else if (this.buildingPictureClause) {
            if (currentChar == ' ') {
                return true;
            }
        }
        else if (currentChar == '/' && this.C_TokenState != 'Q' && (this.ircaIndex < 7 || (inputRecordCharArray[6] != '*' && inputRecordCharArray[6] != '/'))) {
            if (!this.suspectFreeFormatCobol) {
                return true;
            }
            this.watchForCommentDelimiter = true;
        }
        else {
            if (currentChar == '*' && this.C_TokenState != 'Q') {
                return true;
            }
            if (currentChar == ' ' || currentChar == '(' || currentChar == ')' || currentChar == ',' || currentChar == ':' || currentChar == ';' || currentChar == '\'' || currentChar == '>' || currentChar == '<' || currentChar == '+' || currentChar == '\"') {
                return true;
            }
            if (currentChar == '=') {
                if (this.ircaIndex + 1 == inputRecordCharArray.length) {
                    return true;
                }
                final char nextChar = inputRecordCharArray[this.ircaIndex + 1];
                if (nextChar != '=') {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean CheckOtherColumnSevenValues(final String inputRecord, final String languageHint) {
        if (this.identifierMode == 'C' || this.CBL_marker || this.suspectFreeFormatCobol) {
            return false;
        }
        final String col7 = inputRecord.substring(6, 7);
        if (StringUtils.isNumeric(col7)) {
            boolean letItGo = true;
            for (short column = 1; column < 7; ++column) {
                if (inputRecord.substring(column - 1, 1).equals("*")) {
                    break;
                }
                if (!inputRecord.substring(column - 1, 1).equals(" ") && !StringUtils.isNumeric(inputRecord.substring(column - 1, 1))) {
                    letItGo = false;
                    break;
                }
            }
            if (letItGo) {
                return false;
            }
        }
        if (languageHint.equals("COB")) {
            return false;
        }
        if (col7.startsWith("$")) {
            return true;
        }
        this.rejectThisLanguageCd();
        return true;
    }
    
    private boolean findFirstCharacterOnLine(final char[] inputRecordCharArray) {
        if (this.C_TokenState == 'Q') {
            return this.checkContinuedLiteral(inputRecordCharArray) && (this.C_TokenState != 'S' || this.findStartOfLine(inputRecordCharArray));
        }
        return this.findStartOfLine(inputRecordCharArray);
    }
    
    private boolean findStartOfLine(final char[] inputRecordCharArray) {
        if (this.suspectFreeFormatCobol) {
            this.columnCurrentRecord = 1;
            this.ircaIndex = 0;
        }
        else {
            this.suspectFreeFormatCobol = false;
            this.columnCurrentRecord = 7;
            this.ircaIndex = 6;
        }
        this.skipLeadingWhiteSpace(inputRecordCharArray);
        if (this.ircaIndex >= inputRecordCharArray.length) {
            return false;
        }
        if (inputRecordCharArray[this.ircaIndex] == '*') {
            this.increaseScore(5);
            this.metaData.incrementCommentLines();
            return false;
        }
        return (!this.EXEC_CICS_flag && !this.EXEC_SQL_flag) || inputRecordCharArray[this.ircaIndex] != 'D' || this.ircaIndex != 6;
    }
    
    public int getCompilerDirectingCount() {
        return this.compilerDirectingCount_COBOL;
    }
    
    @Override
    public boolean getIgnoreCase() {
        return false;
    }
    
    public boolean getInvalidCOBOLsequence() {
        return this.invalidCOBOLsequence;
    }
    
    public int getPictureCount() {
        return this.pictureCount;
    }
    
    public int getVerbCount() {
        return this.verbCount_COBOL;
    }
    
    private boolean nextTokenIsPictureClause() {
        return this.currentToken.equalsIgnoreCase("PIC") || this.currentToken.equalsIgnoreCase("PICTURE") || ((this.previousToken.equalsIgnoreCase("PIC") || this.previousToken.equalsIgnoreCase("PICTURE")) && this.currentToken.equalsIgnoreCase("IS"));
    }
    
    private void TokenComplete(final char[] inputRecordCharArray) {
        ++this.tokenNumberOnLine;
        this.debugReportCompletedToken(this.inputRecordCount, this.tokenNumberOnLine, this.currentToken);
        if (this.EXEC_SQL_flag) {
            this.captureExecStatementText();
        }
        final boolean checkSymbolFurther = this.scoreCompletedToken(inputRecordCharArray);
        if (checkSymbolFurther) {
            this.checkSymanticState();
        }
        if (this.EXEC_SQL_flag && this.currentToken.equalsIgnoreCase(this.getEndExecToken())) {
            this.EXEC_SQL_flag = false;
            this.syntaxState = 16;
        }
        this.resetTokenState();
    }
    
    private void handleDivisionToken() {
        if (this.previousTokenNumberOnLine == 1) {
            if (this.previousToken.equalsIgnoreCase("ID") || this.previousToken.equalsIgnoreCase("IDENTIFICATION")) {
                this.inDivision = 'I';
                this.idDivFound = true;
                this.metaData.incrementNumValue(34);
                this.inRemarksParaFlag = false;
                if (this.identifierMode == 'U') {
                    this.identifierMode = 'C';
                }
            }
            else if (this.previousToken.equalsIgnoreCase("ENVIRONMENT")) {
                this.inDivision = 'E';
                this.metaData.incrementNumValue(35);
                this.inRemarksParaFlag = false;
                if (this.identifierMode == 'U') {
                    this.identifierMode = 'C';
                }
            }
            else if (this.previousToken.equalsIgnoreCase("DATA")) {
                this.inDivision = 'D';
                this.metaData.incrementNumValue(36);
                this.inRemarksParaFlag = false;
                if (this.identifierMode == 'U') {
                    this.identifierMode = 'C';
                }
            }
            else if (this.previousToken.equalsIgnoreCase("PROCEDURE")) {
                this.inDivision = 'P';
                this.metaData.incrementNumValue(37);
                this.inRemarksParaFlag = false;
                if (this.identifierMode == 'U') {
                    this.identifierMode = 'C';
                }
            }
        }
    }
    
    private void HandlePeriodToken() {
        this.metaData.addSymbolReserved(this.currentToken);
        if (this.syntaxState == 14) {
            this.CaptureCopyName();
            this.syntaxState = 16;
            return;
        }
        if (this.EXEC_SQL_flag) {
            return;
        }
        if (this.periodWORDperiod == 0) {
            this.periodWORDperiod = 1;
        }
        else if (this.periodWORDperiod == 2) {
            this.invalidCOBOLsequence = true;
            this.periodWORDperiod = 0;
        }
        if (this.inDivision == 'P' && this.tokenNumberOnLine == 2 && this.currentToken.equals(".") && this.previousTokenColumnNo < 12 && !ReservedWordsCOB.containsKey(this.previousToken.toUpperCase())) {
            this.metaData.addProcedureLabel(this.previousToken);
        }
    }
    
    private void initializeInstanceVariables() {
        this.buildingPictureClause = false;
        this.C_Continuation = false;
        this.C_NewLine = false;
        this.C_StringDelimiter = ' ';
        this.C_TokenState = 'S';
        this.CBL_marker = false;
        this.compilerDirectingCount_COBOL = 0;
        this.found_COPY_IN = false;
        this.found_IDMS_SECTION = false;
        this.idDivFound = false;
        this.inclTypeId = 3;
        this.includedDDName = "";
        this.includedMemberName = "";
        this.inDivision = ' ';
        this.inputRecordCount = 0;
        this.inRemarksParaFlag = false;
        this.invalidCOBOLsequence = false;
        this.literalRecord = null;
        this.periodWORDperiod = 0;
        this.pictureCount = 0;
        this.suspectFreeFormatCobol = false;
        this.validatedPrevCol7Comment = false;
        this.verbCount_COBOL = 0;
        this.watchForCommentDelimiter = false;
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        if (this.getInvalidCOBOLsequence()) {
            this.score = 0;
        }
        else if (this.getVerbCount() == 0 && this.getPictureCount() == 0 && this.getCompilerDirectingCount() == 0) {
            if (this.suspectFreeFormatCobol) {
                this.score = 0;
            }
            else {
                final int numberOfComments = this.getCommentCount();
                if (numberOfComments == 0) {
                    if (lineCount == 1) {
                        if (this.score < 5) {
                            this.score = 0;
                        }
                    }
                    else if (lineCount < 5 && this.score < 9) {
                        this.score = 0;
                    }
                }
            }
        }
    }
    
    @Override
    public ClassifierMetaData processEndOfFile(final int iLineCount) {
        this.metaData.setTotalLines(iLineCount);
        this.metaData.setBlanklines(this.blankLineCount);
        this.metaData.setNonCommentLines(iLineCount - this.blankLineCount - this.getCommentCount());
        if (this.found_IDMS_SECTION) {
            this.metaData.addNumValue(25, 1);
        }
        return this.metaData;
    }
    
    @Override
    public void processInitialization() {
        this.initializeInstanceVariables();
        this.currentToken = "";
        this.EXEC_CICS_flag = false;
        this.EXEC_SQL_flag = false;
        this.identifierMode = 'U';
        this.mapName = null;
        this.mapSetName = null;
        this.metaData = new ClassifierMetaData(this.scanProperties.getCaptureComments(), this.scanProperties.getCaptureEntryPoints(), this.scanProperties.getCaptureExecStatements(), this.scanProperties.getCaptureLiterals(), this.scanProperties.getCapturePictures(), this.scanProperties.getCaptureSymbolsReserved(), this.scanProperties.getCaptureSymbolsUserDefined());
        this.previousToken = "";
        this.previousPreviousToken = "";
        this.syntaxState = 16;
        this.typeOfControlTransfer = null;
    }
    
    @Override
    public void processOneRecord(final int inputRecordCount, final String literalRecord, final String inputRecord, final String languageHint) {
        this.inputRecordCount = inputRecordCount;
        this.literalRecord = literalRecord;
        if (this.checkAlternateFormsOfCopy(inputRecord)) {
            return;
        }
        if (this.idDivFound) {
            this.CBL_marker = false;
        }
        else if (inputRecord.contains("CBL ") || inputRecord.contains("CBL\n") || inputRecord.contains("PROCESS ") || inputRecord.contains("PROCESS\n")) {
            this.CBL_marker = true;
        }
        else {
            this.CBL_marker = false;
        }
        this.C_Continuation = false;
        this.checkForFreeFormatCobol(inputRecord);
        if (!this.suspectFreeFormatCobol) {
            if (this.CheckAlternateLocationOfINC(inputRecord)) {
                return;
            }
            if (this.ValidateColumnSeven(inputRecord, languageHint)) {
                return;
            }
        }
        if (this.C_TokenState == 'E') {
            this.C_TokenState = 'C';
        }
        if (this.C_TokenState == 'Q' && this.suspectFreeFormatCobol) {
            this.C_TokenState = 'C';
        }
        final char[] inputRecordCharArray = inputRecord.toCharArray();
        if (!this.findFirstCharacterOnLine(inputRecordCharArray)) {
            return;
        }
        this.C_NewLine = true;
        this.watchForCommentDelimiter = false;
        if (this.C_TokenState == 'S') {
            this.tokenNumberOnLine = 0;
        }
        while (this.ircaIndex < inputRecordCharArray.length && this.columnCurrentRecord != 73 && inputRecordCharArray[this.ircaIndex] != '\n') {
            if (inputRecordCharArray[this.ircaIndex] == ' ' && this.ircaIndex + 3 < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex + 1] == '*' && inputRecordCharArray[this.ircaIndex + 2] == '>' && inputRecordCharArray[this.ircaIndex + 3] == ' ') {
                this.increaseScore(5);
                break;
            }
            char currentChar = inputRecordCharArray[this.ircaIndex];
            final boolean C_IsDelimiter = this.checkIfCurrentCharIsADelimiter(currentChar, inputRecordCharArray);
            if (this.identifierMode == 'R') {
                break;
            }
            Label_0938: {
                switch (this.C_TokenState) {
                    case 'S': {
                        if (currentChar == ' ' || currentChar == '\t') {
                            this.moveToNextCharOnRecord();
                            break;
                        }
                        this.currentTokenColumnNo = this.columnCurrentRecord;
                        if (currentChar == 'X') {
                            this.addToCurrentToken(currentChar);
                            ++this.ircaIndex;
                            if (this.ircaIndex + 1 >= inputRecordCharArray.length) {
                                this.C_TokenState = 'C';
                                break;
                            }
                            currentChar = inputRecordCharArray[this.ircaIndex];
                            ++this.columnCurrentRecord;
                            if (currentChar == '\"' || currentChar == '\'') {
                                this.C_TokenState = 'X';
                                break;
                            }
                            this.C_TokenState = 'C';
                            break;
                        }
                        else {
                            if (currentChar == '\"' || currentChar == '\'') {
                                this.addToCurrentToken(this.C_StringDelimiter = currentChar);
                                this.addToLiteralToken();
                                this.moveToNextCharOnRecord();
                                this.C_TokenState = 'Q';
                                break;
                            }
                            this.addToCurrentToken(currentChar);
                            this.moveToNextCharOnRecord();
                            if (C_IsDelimiter) {
                                this.TokenComplete(inputRecordCharArray);
                                break;
                            }
                            this.C_TokenState = 'C';
                            break;
                        }
                        break;
                    }
                    case 'C': {
                        if (this.C_NewLine && !this.C_Continuation) {
                            this.TokenComplete(inputRecordCharArray);
                            this.tokenNumberOnLine = 0;
                            break;
                        }
                        if (!C_IsDelimiter) {
                            this.addToCurrentToken(currentChar);
                            this.moveToNextCharOnRecord();
                            break;
                        }
                        this.TokenComplete(inputRecordCharArray);
                        if (currentChar == ' ') {
                            this.moveToNextCharOnRecord();
                            break;
                        }
                        break;
                    }
                    case 'B': {
                        if (this.C_NewLine) {
                            if (this.C_Continuation) {
                                this.C_TokenState = 'C';
                                break;
                            }
                            this.TokenComplete(inputRecordCharArray);
                            break;
                        }
                        else {
                            if (inputRecordCharArray[this.ircaIndex] == ' ' || inputRecordCharArray[this.ircaIndex] == '\t') {
                                this.moveToNextCharOnRecord();
                                break;
                            }
                            this.C_TokenState = 'S';
                            break;
                        }
                        break;
                    }
                    case 'Q': {
                        if (currentChar == this.C_StringDelimiter) {
                            this.C_TokenState = 'E';
                        }
                        this.addToCurrentToken(currentChar);
                        this.addToLiteralToken();
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    case 'E': {
                        if (currentChar == this.C_StringDelimiter) {
                            this.addToCurrentToken(currentChar);
                            this.addToLiteralToken();
                            this.moveToNextCharOnRecord();
                            this.C_TokenState = 'Q';
                            break;
                        }
                        this.TokenComplete(inputRecordCharArray);
                        break;
                    }
                    case 'X': {
                        switch (inputRecordCharArray[this.ircaIndex]) {
                            case '\t':
                            case ' ': {
                                this.TokenComplete(inputRecordCharArray);
                                this.moveToNextCharOnRecord();
                                this.C_TokenState = 'B';
                                break Label_0938;
                            }
                            case '\"':
                            case '\'': {
                                this.C_StringDelimiter = inputRecordCharArray[this.ircaIndex];
                                this.addToCurrentToken(currentChar);
                                this.moveToNextCharOnRecord();
                                this.C_TokenState = 'Q';
                                break Label_0938;
                            }
                            default: {
                                if (C_IsDelimiter) {
                                    this.TokenComplete(inputRecordCharArray);
                                    break Label_0938;
                                }
                                this.addToCurrentToken(currentChar);
                                this.moveToNextCharOnRecord();
                                this.C_TokenState = 'C';
                                break Label_0938;
                            }
                        }
                        break;
                    }
                }
            }
            if (this.currentToken.length() >= 160) {
                this.TokenComplete(inputRecordCharArray);
                if (this.identifierMode == 'R') {
                    break;
                }
            }
            this.C_NewLine = false;
            this.C_Continuation = false;
        }
        while (this.C_TokenState == 'Q' && this.ircaIndex++ < 72) {
            this.addToCurrentToken(' ');
            this.literalToken += ' ';
        }
        this.periodWORDperiod = 0;
    }
    
    private void resetTokenState() {
        this.buildingPictureClause = this.nextTokenIsPictureClause();
        this.previousPreviousToken = this.previousToken;
        this.previousToken = this.currentToken;
        this.previousTokenNumberOnLine = this.tokenNumberOnLine;
        this.previousTokenColumnNo = this.currentTokenColumnNo;
        this.currentToken = "";
        this.currentTokenColumnNo = 0;
        this.literalToken = "";
        this.C_TokenState = 'S';
    }
    
    private boolean scoreCompletedToken(final char[] inputRecordCharArray) {
        if (this.currentToken.length() == 1) {
            if (this.currentToken.equals(".")) {
                this.HandlePeriodToken();
                return false;
            }
            if (this.currentToken.equals("'") || this.currentToken.equals("\"")) {
                this.periodWORDperiod = 0;
                return false;
            }
            if (this.currentToken.equals("*") || this.currentToken.equals(":") || this.currentToken.equals(",") || this.currentToken.equals("=") || this.currentToken.equals("/") || this.currentToken.equals(">") || this.currentToken.equals("(") || this.currentToken.equals("<") || this.currentToken.equals("+") || this.currentToken.equals(")")) {
                this.metaData.addSymbolReserved(this.currentToken);
                this.periodWORDperiod = 0;
                return false;
            }
            if (this.currentToken.equals(";")) {
                this.metaData.addSymbolReserved(this.currentToken);
                this.periodWORDperiod = 0;
                this.EXEC_CICS_flag = false;
                return this.EXEC_SQL_flag = false;
            }
        }
        ClassifierReservedWord rw = null;
        final String currentTokenUC = this.currentToken.toUpperCase();
        if (ReservedWordsCOB.containsKey(currentTokenUC)) {
            final String value = ReservedWordsCOB.get(currentTokenUC);
            rw = this.allocateReserveWord(currentTokenUC, value);
        }
        if (rw == null) {
            this.processNonReservedWord();
        }
        else {
            this.processReservedWord(rw, inputRecordCharArray);
        }
        return true;
    }
    
    private void skipLeadingWhiteSpace(final char[] inputRecordCharArray) {
        while (this.ircaIndex < inputRecordCharArray.length && (inputRecordCharArray[this.ircaIndex] == ' ' || inputRecordCharArray[this.ircaIndex] == '\t')) {
            this.moveToNextCharOnRecord();
        }
    }
    
    private boolean isCICSKeyword(final String currentToken) {
        return currentToken.equalsIgnoreCase("DFHCOMMAREA") || currentToken.equalsIgnoreCase("DFHEIBLK");
    }
    
    private void processNonReservedWord() {
        if (this.inRemarksParaFlag) {
            this.periodWORDperiod = 0;
        }
        else if (this.currentToken.startsWith("\"") || this.currentToken.startsWith("'")) {
            this.metaData.addLiteral(this.literalToken);
            this.captureEntryPointName();
        }
        else if (!this.currentToken.startsWith("-")) {
            if (this.buildingPictureClause) {
                this.metaData.addPicture(this.currentToken);
            }
            else if (StringUtils.isNumeric(this.currentToken)) {
                if (this.previousPreviousToken.equalsIgnoreCase("VALUE")) {
                    if (this.previousToken.equals("-") || this.previousToken.equals("+")) {
                        this.metaData.addLiteral(this.previousToken + this.currentToken);
                    }
                    else {
                        this.metaData.addLiteral(this.currentToken);
                    }
                }
                else {
                    this.metaData.addLiteral(this.currentToken);
                }
            }
            else {
                this.metaData.addSymbolUserDefined(this.currentToken);
                if (this.isCICSKeyword(this.currentToken)) {
                    this.metaData.setAttnListKey(30);
                }
                else if (this.inDivision == 'P') {
                    if (this.periodWORDperiod == 1) {
                        this.periodWORDperiod = 2;
                    }
                    else {
                        this.periodWORDperiod = 0;
                    }
                }
                else {
                    this.captureEntryPointName();
                }
            }
        }
    }
    
    private void processReservedWord(final ClassifierReservedWord rw, final char[] inputRecordCharArray) {
        this.metaData.addSymbolReserved(this.currentToken);
        this.AccumulatePointsForTheScore(inputRecordCharArray, rw);
    }
    
    private void checkSymanticState() {
        switch (this.syntaxState) {
            case 0: {
                this.processState_assignmentStmt();
                break;
            }
            case 3: {
                this.processState_call();
                break;
            }
            case 4: {
                this.processState_mapOrMapset();
                break;
            }
            case 5: {
                this.processState_copy();
                break;
            }
            case 6: {
                this.processState_copyIn();
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
            case 14: {
                this.processState_inOfOrReplacing();
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
    
    private void processState_assignmentStmt() {
        if (this.previousToken.equalsIgnoreCase("MOVE")) {
            if (this.currentToken.startsWith("\"") || this.currentToken.startsWith("'") || ClassifierCOB.figurativeConstants.contains(this.currentToken) || StringUtils.isNumeric(this.currentToken)) {
                this.syntaxState = 16;
            }
            else if (this.assignmentSymbolFrom == null) {
                this.assignmentSymbolFrom = this.currentToken;
            }
        }
        else if (this.previousToken.equalsIgnoreCase("CORR") || this.previousToken.equalsIgnoreCase("CORRESPONDING")) {
            if (this.assignmentSymbolFrom == null) {
                this.assignmentSymbolFrom = this.currentToken;
            }
        }
        else if (this.previousToken.equalsIgnoreCase("TO")) {
            if (this.assignmentSymbolFrom != null) {
                this.metaData.addAssignment(this.assignmentSymbolFrom, this.currentToken);
            }
            this.assignmentSymbolFrom = null;
            this.syntaxState = 16;
        }
        else if (this.currentToken.equals(".") || (!this.currentToken.equals("CORR") && !this.currentToken.equals("CORRESPONDING") && !this.currentToken.equals("MOVE") && !this.currentToken.equals("TO") && ReservedWordsCOB.containsKey(this.currentToken.toUpperCase()))) {
            this.assignmentSymbolFrom = null;
            this.syntaxState = 16;
        }
    }
    
    private void processState_call() {
        final String literalText = this.getLiteralText();
        if (literalText != null) {
            if (literalText.equalsIgnoreCase("AERTDLI")) {
                this.metaData.incrementNumValue(59);
            }
            else if (literalText.equalsIgnoreCase("AIBTDLI")) {
                this.metaData.incrementNumValue(43);
            }
            else if (literalText.equalsIgnoreCase("CBLTDLI")) {
                this.metaData.incrementNumValue(38);
            }
            this.metaData.addControlTransfer(this.typeOfControlTransfer, literalText);
        }
        this.syntaxState = 16;
    }
    
    private void processState_copy() {
        this.includedMemberName = this.currentToken;
        this.found_COPY_IN = false;
        this.syntaxState = 14;
    }
    
    private void processState_normalToken() {
        if (this.currentToken.equalsIgnoreCase("DIVISION")) {
            this.handleDivisionToken();
        }
        else if (!this.inRemarksParaFlag) {
            if (this.currentToken.equalsIgnoreCase("CALL")) {
                this.typeOfControlTransfer = this.currentToken;
                this.syntaxState = 3;
            }
            else if (this.currentToken.equalsIgnoreCase("COPY")) {
                this.syntaxState = 5;
            }
            else if (this.currentToken.equalsIgnoreCase("EXEC") || this.currentToken.equalsIgnoreCase("EXECUTE")) {
                this.syntaxState = 7;
            }
            else if (this.currentToken.equalsIgnoreCase(this.getEndExecToken())) {
                this.EXEC_CICS_flag = false;
                this.EXEC_SQL_flag = false;
            }
            else if (this.currentToken.equalsIgnoreCase("MOVE")) {
                this.assignmentSymbolFrom = null;
                this.syntaxState = 0;
            }
            else if (this.currentToken.equalsIgnoreCase("REMARKS") && this.inDivision == 'I') {
                this.inRemarksParaFlag = true;
            }
            else if (this.inDivision == 'E' && this.currentToken.equalsIgnoreCase("SECTION") && this.previousToken.equalsIgnoreCase("IDMS-CONTROL")) {
                this.found_IDMS_SECTION = true;
                this.metaData.addSymbolReserved(this.previousToken);
                this.increaseScore(2);
            }
        }
    }
    
    private void processState_copyIn() {
        if (!this.found_COPY_IN) {
            this.found_COPY_IN = true;
            this.inclTypeId = 4;
            this.includedDDName = this.currentToken;
            this.syntaxState = 14;
        }
        else {
            this.syntaxState = 6;
        }
    }
    
    private void processState_inOfOrReplacing() {
        if (this.currentToken.equalsIgnoreCase("IN") || this.currentToken.equalsIgnoreCase("OF")) {
            this.syntaxState = 6;
        }
        else if (this.currentToken.equalsIgnoreCase("REPLACING")) {
            this.metaData.incrementNumValue(64);
            this.CaptureCopyName();
            this.syntaxState = 16;
        }
    }
    
    private boolean ValidateColumnSeven(final String inputRecord, final String languageHint) {
        if (inputRecord.length() < 7) {
            return true;
        }
        final char column7char = inputRecord.charAt(6);
        boolean rc = false;
        switch (column7char) {
            case ' ': {
                rc = false;
                break;
            }
            case 'D': {
                rc = false;
                break;
            }
            case '*':
            case '/': {
                this.increaseScore(5);
                this.metaData.incrementCommentLines();
                String commentText = inputRecord.substring(6);
                if (commentText.length() > 66) {
                    commentText = commentText.substring(0, 66);
                }
                this.metaData.addComment(commentText.trim());
                rc = true;
                this.validatedPrevCol7Comment = true;
                break;
            }
            case '-': {
                this.increaseScore(1);
                this.C_Continuation = true;
                rc = false;
                break;
            }
            default: {
                rc = this.CheckOtherColumnSevenValues(inputRecord, languageHint);
                break;
            }
        }
        return rc;
    }
    
    static {
        ClassifierCOB.figurativeConstants = new HashSet<String>();
        final String[] split;
        final String[] fcs = split = StringUtils.split("'HIGH-VALUE', 'HIGH-VALUES', 'LOW-VALUE', 'LOW-VALUES', 'NULL', 'NULLS', 'SPACE', 'SPACES', 'ZERO', 'ZEROES', 'ZEROS'", ",");
        for (String fc : split) {
            fc = StringUtils.strip(fc, "'");
            fc = fc.trim();
            ClassifierCOB.figurativeConstants.add(fc);
        }
    }
}
