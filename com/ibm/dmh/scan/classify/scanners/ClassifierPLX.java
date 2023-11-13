// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.ClassifierReservedWord;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsPLX_macroDefinition;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsPLX;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsPLX_compilerControl;
import com.ibm.dmh.scan.classify.ScanProperties;
import com.ibm.dmh.scan.classify.utils.ParserAsmStatement;

public class ClassifierPLX extends ClassifierPLI
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2011, 2022\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final int GENERATE_TYPE_NONE = 0;
    private static final int GENERATE_TYPE_UNKNOWN = 1;
    private static final int GENERATE_TYPE_SIMPLE = 2;
    private static final int GENERATE_TYPE_BLOCK = 3;
    private static final int STATE_IN_AT_SIGN = 1;
    private static final int STATE_IN_AT_SIGN_LOGIC = 2;
    private static final int STATE_IN_ASM_COPY = 3;
    private static final int STATE_IN_GENERATE = 4;
    private static final int STATE_IN_GENERATE_INSTRUCTION = 5;
    private static final int STATE_IN_GENERATE_VALUE_LIST = 6;
    private static final int STATE_IN_INCLUDE = 7;
    private static final int STATE_IN_MACRO = 8;
    private static final int STATE_IN_MACRO_PARMS = 9;
    private static final int STATE_IN_PROC = 10;
    private static final int STATE_IN_PROC_IN_MACRO = 11;
    private static final int STATE_IN_PROC_IN_MACRO_PARMS = 12;
    private static final int STATE_IN_PROC_START_QUESTION_MARK = 13;
    private static final int STATE_INITIAL = 14;
    private static final int STATE_START_AT_SIGN = 15;
    private static final int STATE_START_CALL = 16;
    private static final int STATE_START_PERCENT_SIGN = 17;
    private static final int STATE_START_PROC = 18;
    private static final int STATE_START_QUESTION_MARK = 19;
    private static final int STATE_IN_PROCESS_STATEMENT = 20;
    private static final int STATE_IN_GENMARGINS_OPTION = 21;
    private static final int STATE_IN_MARGINS_OPTION = 22;
    private static final String BEX_INIT_MACRO = "ZYBPINT";
    private static final String BEX_TERM_MACRO = "ZYBPEND";
    private boolean continuedAsmStatement;
    private boolean foundAtLeastOne_ANSWER;
    private boolean generateStatementFound;
    private boolean generateIsDeclared;
    private boolean genIsDeclared;
    private int blankCount_PLX;
    private int generateType;
    private int genMarginsValue1;
    private int genMarginsValue2;
    private int macroDeclarationFound;
    private int macroInvocationFound;
    private int plxCommentCount;
    private int plxCompilerControlCount;
    private int symanticState;
    private String currentMacroName;
    private String currentMacroParm;
    private int usesBexProductMacros;
    private ClassifierASM classifierASM;
    private ParserAsmStatement parserAsmStatement;
    
    public ClassifierPLX(final ScanProperties scanProperties) {
        super(scanProperties);
        this.init();
    }
    
    private String adjustAsmLineForMargins(final String iRecord) {
        final String record = this.padOrTruncate(iRecord, 80);
        String asmRecord;
        if (this.genMarginsValue1 == 2 && this.genMarginsValue2 == 72) {
            final String columns2_72 = record.substring(1, 72);
            final String column72 = record.substring(71, 72);
            final String columns73_80 = record.substring(72, 80);
            asmRecord = columns2_72 + column72 + columns73_80;
        }
        else {
            asmRecord = record.substring(this.genMarginsValue1 - 1, this.genMarginsValue2);
            final int lineLengthAllowed = this.genMarginsValue2 - this.genMarginsValue1 + 1;
            if (lineLengthAllowed > 72) {
                asmRecord = asmRecord.substring(0, 73);
            }
            asmRecord = this.padOrTruncate(asmRecord, 80);
            final String columns1_72 = asmRecord.substring(0, 72);
            final char rightSourceMarginChar = record.charAt(this.marginsValue2 - 1);
            String column72;
            if (lineLengthAllowed == 71) {
                if (rightSourceMarginChar != ' ') {
                    final String column73 = asmRecord.substring(70, 71);
                    if (column73.equals("*")) {
                        column72 = "+";
                    }
                    else {
                        column72 = "*";
                    }
                }
                else {
                    column72 = " ";
                }
            }
            else {
                column72 = String.valueOf(rightSourceMarginChar);
            }
            final String columns73_80 = asmRecord.substring(72, 80);
            asmRecord = columns1_72 + column72 + columns73_80;
        }
        return asmRecord;
    }
    
    private int calculateSLOC(final int lineCount) {
        return lineCount - (this.blankLineCount + this.blankCount_PLX) - this.getCommentCount();
    }
    
    private void captureMacroName() {
        if (this.currentMacroName.length() == 0) {
            return;
        }
        if (this.currentMacroName.equals("@")) {
            this.currentMacroName += this.currentToken;
        }
        ++this.macroInvocationFound;
        this.metaData.captureInclude(8, this.currentMacroName);
        this.score += 15;
        if (this.currentMacroName.equals("ZYBPINT")) {
            this.usesBexProductMacros = 1;
        }
        else if (this.currentMacroName.equals("ZYBPEND") && this.usesBexProductMacros == 1) {
            this.usesBexProductMacros = 2;
        }
    }
    
    private void checkSymanticState() {
        switch (this.symanticState) {
            case 3: {
                if (this.currentToken.equals(")")) {
                    this.symanticState = 4;
                    break;
                }
                this.metaData.captureInclude(3, this.currentToken);
                break;
            }
            case 1: {}
            case 4: {
                if (this.generateType == 0) {
                    this.generateType = 1;
                }
                if (this.currentToken.equals("(")) {
                    this.symanticState = 5;
                    break;
                }
                if (this.currentToken.equals("AMODE") || this.currentToken.equals("DEFS") || this.currentToken.equals("ENVIRONMENT") || this.currentToken.equals("FLOWS") || this.currentToken.equals("OPTACROSS") || this.currentToken.equals("REFS") || this.currentToken.equals("RETCODE") || this.currentToken.equals("SETS")) {
                    this.symanticState = 6;
                    break;
                }
                if (this.currentToken.equals("CODE") || this.currentToken.equals("DATA") || this.currentToken.equals("EXIT") || this.currentToken.equals("NODEFS") || this.currentToken.equals("NOEXIT") || this.currentToken.equals("NOFLOWS") || this.currentToken.equals("NOREFS") || this.currentToken.equals("NOSEQFLOW") || this.currentToken.equals("NOSETS")) {
                    break;
                }
                if (this.currentToken.equals("SEQFLOW")) {
                    break;
                }
                this.symanticState = 14;
                this.handle_STATE_INITIAL();
                break;
            }
            case 5: {
                this.generateType = 2;
                this.score += 50;
                if (this.currentToken.equals("COPY")) {
                    this.symanticState = 3;
                    break;
                }
                break;
            }
            case 6: {
                if (this.currentToken.equals(")")) {
                    this.symanticState = 4;
                    break;
                }
                break;
            }
            case 21: {
                if (this.previousToken.equals("(")) {
                    try {
                        this.genMarginsValue1 = Integer.parseInt(this.currentToken);
                    }
                    catch (NumberFormatException e) {
                        this.genMarginsValue1 = this.marginsValue1;
                    }
                    break;
                }
                if (this.previousToken.equals(",")) {
                    try {
                        this.genMarginsValue2 = Integer.parseInt(this.currentToken);
                    }
                    catch (NumberFormatException e) {
                        this.genMarginsValue2 = this.marginsValue2;
                    }
                    this.symanticState = 20;
                    break;
                }
                break;
            }
            case 7: {
                if (this.currentToken.equals(")")) {
                    this.ddName = "";
                    break;
                }
                if (this.currentToken.equals("(")) {
                    if (this.ddName.length() == 0) {
                        this.ddName = "SYSLIB";
                        break;
                    }
                    break;
                }
                else {
                    if (this.ddName.length() == 0 && !this.previousToken.equals("(")) {
                        this.ddName = this.currentToken;
                        break;
                    }
                    if (this.currentToken.equals(",")) {
                        this.metaData.captureInclude(3, this.ddName);
                        this.ddName = "";
                        break;
                    }
                    if (this.previousToken.equals("(")) {
                        this.metaData.captureInclude(this.currentToken, this.ddName, this.debug);
                        this.ddName = "";
                        break;
                    }
                    this.metaData.captureInclude(3, this.ddName);
                    break;
                }
                break;
            }
            case 8: {
                if (this.currentToken.equals(":")) {
                    this.currentMacroName = "";
                    this.symanticState = 19;
                    break;
                }
                this.captureMacroName();
                this.symanticState = 9;
                break;
            }
            case 9: {
                if (!this.currentMacroName.equals("ZYBPINT")) {
                    break;
                }
                if (this.currentToken.equals("(")) {
                    this.currentMacroParm = this.previousToken;
                    break;
                }
                if (this.currentMacroParm.equals("PTYPE") && this.previousToken.equals("(") && this.currentToken.equals("OS")) {
                    this.metaData.setPlxIsMain();
                    break;
                }
                break;
            }
            case 22: {
                if (this.previousToken.equals("(")) {
                    try {
                        this.marginsValue1 = Integer.parseInt(this.currentToken);
                    }
                    catch (NumberFormatException e) {
                        this.marginsValue1 = 2;
                    }
                    break;
                }
                if (this.previousToken.equals(",")) {
                    try {
                        this.marginsValue2 = Integer.parseInt(this.currentToken);
                    }
                    catch (NumberFormatException e) {
                        this.marginsValue2 = 72;
                    }
                    break;
                }
                break;
            }
            case 10: {
                if (this.currentToken.equals("?")) {
                    this.currentMacroName = "";
                    this.symanticState = 13;
                    break;
                }
                break;
            }
            case 11: {
                this.captureMacroName();
                this.symanticState = 12;
            }
            case 13: {
                this.currentMacroName = this.currentToken;
                this.symanticState = 11;
                break;
            }
            case 20: {
                if (this.currentToken.equals("MAR") || this.currentToken.equals("MARGINS")) {
                    this.symanticState = 22;
                    break;
                }
                if (this.currentToken.equals("GMAR") || this.currentToken.equals("GENMARGINS")) {
                    this.symanticState = 21;
                    break;
                }
                break;
            }
            case 14: {
                this.handle_STATE_INITIAL();
                break;
            }
            case 15: {
                if (!this.previousToken.equals("@")) {
                    this.symanticState = 14;
                    this.handle_STATE_INITIAL();
                    break;
                }
                if (ReservedWordsPLX_compilerControl.contains(this.currentToken)) {
                    ++this.plxCompilerControlCount;
                    this.score += 15;
                }
                if (this.currentToken.equals("EJECT") || this.currentToken.equals("LIST")) {
                    this.symanticState = 1;
                    break;
                }
                if (this.currentToken.equals("INCLUDE")) {
                    if (this.identifierMode == 'U') {
                        this.identifierMode = 'C';
                    }
                    this.foundAtLeastOne_INCLUDE = true;
                    this.ddName = "";
                    this.symanticState = 7;
                    break;
                }
                if (this.currentToken.equals("LOGIC")) {
                    this.symanticState = 2;
                    break;
                }
                if (this.currentToken.equals("PROCESS")) {
                    this.metaData.setPlxIsMain();
                    this.symanticState = 20;
                    break;
                }
                break;
            }
            case 16: {
                if (this.currentToken.equals("PLITDLI")) {
                    this.metaData.incrementNumValue(41);
                    if (this.identifierMode == 'U') {
                        this.identifierMode = 'C';
                    }
                }
                this.symanticState = 14;
                break;
            }
            case 17: {
                if (this.currentToken.equals("INCLUDE")) {
                    this.foundAtLeastOne_INCLUDE = true;
                    this.score += 25;
                    this.ddName = "";
                    this.symanticState = 7;
                    break;
                }
                if (this.currentToken.equals("MACRO") && this.previousToken.equals(":")) {
                    ++this.macroDeclarationFound;
                    this.score += 50;
                    break;
                }
                break;
            }
            case 19: {
                this.currentMacroName = this.currentToken;
                this.symanticState = 8;
                break;
            }
            case 18: {
                this.symanticState = 10;
                break;
            }
        }
    }
    
    private void handle_STATE_INITIAL() {
        if (this.currentToken.equals("?")) {
            this.currentMacroName = "";
            this.symanticState = 19;
        }
        else if (this.tokenNumberOnLine == 1) {
            if (this.currentToken.equals("@")) {
                this.symanticState = 15;
            }
            else if (this.currentToken.equals("%")) {
                this.symanticState = 17;
            }
            else if (this.currentToken.equals("GEN")) {
                if (this.previousToken.equals("DCL")) {
                    this.genIsDeclared = true;
                }
                else if (!this.genIsDeclared) {
                    this.generateStatementFound = true;
                    this.generateType = 0;
                    this.symanticState = 4;
                }
            }
            else if (this.currentToken.equals("GENERATE")) {
                if (this.previousToken.equals("DCL")) {
                    this.generateIsDeclared = true;
                }
                else if (!this.generateIsDeclared) {
                    this.generateStatementFound = true;
                    this.generateType = 0;
                    this.symanticState = 4;
                }
            }
        }
        else if (this.currentToken.equals("CALL")) {
            this.symanticState = 16;
        }
        else if (this.currentToken.equals("PROC") || this.currentToken.equals("PROCEDURE")) {
            if (this.previousToken.equals("%")) {
                return;
            }
            if (!this.previousToken.equals(":")) {
                return;
            }
            ++this.procedureIsSubroutineCount;
            this.symanticState = 18;
        }
    }
    
    private void handleSemiColon() {
        this.score += 2;
        this.semicolonFound = true;
        switch (this.symanticState) {
            case 2: {
                if (this.previousPreviousToken.equals("@") && this.previousToken.equals("ENDLOGIC")) {
                    this.symanticState = 14;
                    break;
                }
                break;
            }
            case 7: {
                if (this.ddName.length() != 0) {
                    this.metaData.captureInclude(3, this.ddName);
                }
                this.symanticState = 14;
                break;
            }
            case 8: {
                this.captureMacroName();
                this.symanticState = 14;
                break;
            }
            case 12: {
                this.symanticState = 10;
                break;
            }
            default: {
                if (this.generateType == 1) {
                    this.generateType = 3;
                }
                else if (this.generateType == 2) {
                    this.generateType = 0;
                }
                this.symanticState = 14;
                break;
            }
        }
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        final int plxWordCount = this.reserveWordCount + this.plxCompilerControlCount + this.macroDeclarationFound + this.macroInvocationFound;
        switch (plxWordCount) {
            case 0: {
                this.score = 0;
                break;
            }
            case 1: {
                if (plxWordCount < this.calculateSLOC(lineCount) * 0.25) {
                    this.score = 0;
                    break;
                }
                if (!this.semicolonFound) {
                    this.score = 0;
                    break;
                }
                break;
            }
            default: {
                this.isScoreBadWithMoreThanOnePlxWord(lineCount, plxWordCount);
                break;
            }
        }
    }
    
    private void isScoreBadWithMoreThanOnePlxWord(final int lineCount, final int plxWordCount) {
        if (!this.foundAtLeastOne_ANSWER && !this.foundAtLeastOne_DECLARE && !this.foundAtLeastOne_INCLUDE) {
            final int SLOC = this.calculateSLOC(lineCount);
            if (plxWordCount > SLOC * 1.2 || plxWordCount < SLOC * 0.5) {
                this.score = 0;
                return;
            }
            if (this.score < lineCount * 0.05) {
                this.score = 0;
            }
        }
    }
    
    public int getPlxCommentCount() {
        return this.plxCommentCount;
    }
    
    @Override
    public void isScoreStillBad(final int lineCount, final ClassifierASM classifierASM, final ClassifierC classifierC, final ClassifierCOB classifierCOB, final ClassifierCPP classifierCPP, final ClassifierEASY classifierEASY, final ClassifierJCL classifierJCL, final ClassifierPLI classifierPLI, final ClassifierPLX classifierPLX) {
        if (!this.semicolonFound) {
            this.score = 0;
        }
        else {
            final int pliScore = classifierPLI.getScore();
            if (this.usesBexProductMacros == 0 && this.plxCommentCount == 0 && this.plxCompilerControlCount == 0 && !this.generateStatementFound && this.macroDeclarationFound == 0 && this.macroInvocationFound == 0) {
                if (pliScore != 0) {
                    this.score = 0;
                }
            }
            else if (this.score == pliScore) {
                this.score = 0;
            }
        }
    }
    
    @Override
    protected void TokenComplete(final char[] inputRecordCharArray) {
        this.P_TokenState = 'S';
        if (this.currentToken.length() == 0) {
            return;
        }
        ++this.tokenNumberOnLine;
        if (this.currentToken.startsWith("\"") || this.currentToken.startsWith("'")) {
            this.resetToken();
            return;
        }
        if (this.currentToken.length() != 1) {
            if (ReservedWordsPLX.containsKey(this.currentToken)) {
                final String value = ReservedWordsPLX.get(this.currentToken);
                final ClassifierReservedWord rw = this.allocateReserveWord(this.currentToken, value);
                if (rw != null) {
                    this.AccumulatePointsForTheScore(rw, inputRecordCharArray);
                }
            }
            else if (ReservedWordsPLX_macroDefinition.contains(this.currentToken)) {
                this.incrementReservedWordCount(25);
                if (this.currentToken.equalsIgnoreCase("ANS") || this.currentToken.equalsIgnoreCase("ANSWER") || this.currentToken.equalsIgnoreCase("BANS") || this.currentToken.equalsIgnoreCase("BLOCKANSWER")) {
                    this.foundAtLeastOne_ANSWER = true;
                }
            }
        }
        if (this.currentToken.equals(";")) {
            this.handleSemiColon();
        }
        else {
            if (this.previousToken.equals("DCL") && this.currentToken.equals("(")) {
                this.score -= this.lastTokenWeight;
            }
            else if (this.previousToken.equals(".") && this.currentToken.equals("RETCODE")) {
                this.score -= this.lastTokenWeight;
            }
            this.checkSymanticState();
        }
        if (this.P_NewLine) {
            this.tokenNumberOnLine = 0;
        }
        this.resetToken();
    }
    
    public boolean usesBexProductMacros() {
        return this.usesBexProductMacros != 0;
    }
    
    @Override
    public boolean getIgnoreCase() {
        return true;
    }
    
    @Override
    public String getLanguageCd() {
        return "PLX";
    }
    
    @Override
    public String getLanguageDescription() {
        return "PL/X";
    }
    
    @Override
    public int getLanguageId() {
        return 17;
    }
    
    private void handleGenerateBlock(final String record) {
        final String currentRecord = record.substring(this.ircaIndex);
        final String currentRecordTrimmed = currentRecord.trim();
        if (currentRecordTrimmed.startsWith("@ENDGEN")) {
            this.generateType = 0;
            this.score += 100;
            return;
        }
        final String asmRecord = this.adjustAsmLineForMargins(record);
        if (!this.continuedAsmStatement) {
            this.processInlineASM(asmRecord);
        }
        if (asmRecord.charAt(71) == ' ') {
            this.continuedAsmStatement = false;
        }
        else {
            this.continuedAsmStatement = true;
        }
    }
    
    private boolean isCharADelimiter(final char iChar) {
        return iChar == ' ' || iChar == '&' || iChar == '@' || iChar == '\'' || iChar == ':' || iChar == ',' || iChar == '=' || iChar == '/' || iChar == '>' || iChar == '(' || iChar == '<' || iChar == '-' || iChar == '.' || iChar == '%' || iChar == '+' || iChar == '?' || iChar == ')' || iChar == ';';
    }
    
    private String padOrTruncate(final String iRecord, final int toLength) {
        String record;
        if (iRecord.length() > toLength) {
            record = iRecord.substring(0, toLength);
        }
        else {
            for (record = iRecord; record.length() < toLength; record += " ") {}
        }
        return record;
    }
    
    @Override
    public ClassifierMetaData processEndOfFile(final int iLineCount) {
        this.metaData.setTotalLines(iLineCount);
        final int blankCount = this.blankLineCount + this.blankCount_PLX;
        this.metaData.setBlanklines(blankCount);
        final int nonCommentLineCount = iLineCount - blankCount - this.getCommentCount();
        this.metaData.setNonCommentLines(nonCommentLineCount);
        return this.metaData;
    }
    
    @Override
    protected boolean ProcessFunctionCode(final char[] inputRecordCharArray, final String languageHint) {
        if (this.identifierMode != 'U') {
            return this.identifierMode != 'C';
        }
        if (!languageHint.equals("PLX") && ((inputRecordCharArray.length >= 2 && inputRecordCharArray[0] == '/' && inputRecordCharArray[1] == '/') || (inputRecordCharArray.length >= 1 && inputRecordCharArray[0] == '>'))) {
            this.rejectThisLanguageCd();
            return true;
        }
        return false;
    }
    
    @Override
    public void processInitialization() {
        super.processInitialization();
        this.init();
    }
    
    private void processInlineASM(final String record) {
        if (this.classifierASM == null) {
            (this.classifierASM = new ClassifierASM(this.scanProperties)).processInitialization();
        }
        if (this.classifierASM.checkAsmComment(record)) {
            return;
        }
        if (this.parserAsmStatement == null) {
            this.parserAsmStatement = new ParserAsmStatement();
        }
        if (this.parserAsmStatement.getLiteralContinued()) {
            return;
        }
        this.classifierASM.clearTokenFields();
        final int phonyLineNo = 0;
        this.parserAsmStatement.getNameOperationOperands(phonyLineNo, record, false);
        final int validNames = this.parserAsmStatement.validateNames();
        if (validNames == 1 || validNames == 5 || validNames == 9 || validNames == 11 || validNames == 12) {
            return;
        }
        final String realOperation = this.parserAsmStatement.getRealOperation();
        if (realOperation.length() != 0) {
            final boolean operationIsMacro = this.parserAsmStatement.getOperationIsMacro();
            if (operationIsMacro) {
                this.metaData.captureInclude(8, realOperation);
            }
            else {
                final int wordIs = ClassifierASM.checkForReservedWord(realOperation, true);
                if (wordIs == 4) {
                    this.metaData.captureInclude(8, realOperation);
                }
            }
        }
    }
    
    private void init() {
        this.blankCount_PLX = 0;
        this.classifierASM = null;
        this.continuedAsmStatement = false;
        this.currentMacroName = "";
        this.currentMacroParm = "";
        this.foundAtLeastOne_ANSWER = false;
        this.generateStatementFound = false;
        this.generateIsDeclared = false;
        this.generateType = 0;
        this.genIsDeclared = false;
        this.genMarginsValue1 = 2;
        this.genMarginsValue2 = 72;
        this.marginsValue1 = 2;
        this.marginsValue2 = 72;
        this.macroDeclarationFound = 0;
        this.macroInvocationFound = 0;
        this.plxCommentCount = 0;
        this.plxCompilerControlCount = 0;
        this.sequentialCommentLines = 0;
        this.symanticState = 14;
        this.usesBexProductMacros = 0;
    }
    
    private boolean processOneCharacter(final char[] inputRecordCharArray, final boolean P_IsDelimiter) {
        boolean commentCompleted = false;
        boolean tokenComplete = false;
        final char currentChar = inputRecordCharArray[this.ircaIndex];
        Label_0752: {
            switch (this.P_TokenState) {
                case 'B': {
                    if (this.P_NewLine) {
                        tokenComplete = true;
                        break;
                    }
                    if (currentChar == ' ') {
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    tokenComplete = true;
                    break;
                }
                case 'C': {
                    if (this.P_NewLine) {
                        tokenComplete = true;
                        break;
                    }
                    if (currentChar == ' ') {
                        this.P_TokenState = 'B';
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    if (P_IsDelimiter) {
                        tokenComplete = true;
                        break;
                    }
                    this.currentToken += inputRecordCharArray[this.ircaIndex];
                    this.moveToNextCharOnRecord();
                    break;
                }
                case 'E': {
                    if (currentChar == this.P_StringDelimiter) {
                        this.P_TokenState = 'Q';
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    tokenComplete = true;
                    break;
                }
                case 'M': {
                    if (inputRecordCharArray[this.ircaIndex] == '*' && this.ircaIndex + 1 < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex + 1] == '/') {
                        commentCompleted = true;
                        this.score += 5;
                        this.moveToNextCharOnRecord();
                        this.moveToNextCharOnRecord();
                        tokenComplete = true;
                        this.sequentialCommentLines = 0;
                        break;
                    }
                    this.moveToNextCharOnRecord();
                    break;
                }
                case 'Q': {
                    if (currentChar == this.P_StringDelimiter) {
                        this.P_TokenState = 'E';
                    }
                    this.currentToken += inputRecordCharArray[this.ircaIndex];
                    this.moveToNextCharOnRecord();
                    if (this.ircaIndex == inputRecordCharArray.length) {
                        this.TokenComplete(inputRecordCharArray);
                        break;
                    }
                    break;
                }
                case 'S': {
                    switch (currentChar) {
                        case ' ': {
                            this.moveToNextCharOnRecord();
                            break Label_0752;
                        }
                        case 'F':
                        case 'X': {
                            this.currentToken += inputRecordCharArray[this.ircaIndex];
                            this.P_TokenState = 'X';
                            this.moveToNextCharOnRecord();
                            break Label_0752;
                        }
                        case '\"':
                        case '\'': {
                            this.P_StringDelimiter = inputRecordCharArray[this.ircaIndex];
                            this.currentToken += inputRecordCharArray[this.ircaIndex];
                            this.P_TokenState = 'Q';
                            this.moveToNextCharOnRecord();
                            break Label_0752;
                        }
                        default: {
                            this.currentToken += inputRecordCharArray[this.ircaIndex];
                            this.moveToNextCharOnRecord();
                            if (P_IsDelimiter) {
                                tokenComplete = true;
                                break Label_0752;
                            }
                            this.P_TokenState = 'C';
                            break Label_0752;
                        }
                    }
                    break;
                }
                case 'X': {
                    if (currentChar == ' ') {
                        this.P_TokenState = 'B';
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    if (currentChar == '\"' || currentChar == '\'') {
                        this.P_StringDelimiter = inputRecordCharArray[this.ircaIndex];
                        this.currentToken += inputRecordCharArray[this.ircaIndex];
                        this.P_TokenState = 'Q';
                        this.moveToNextCharOnRecord();
                        break;
                    }
                    if (P_IsDelimiter) {
                        tokenComplete = true;
                        break;
                    }
                    this.currentToken += inputRecordCharArray[this.ircaIndex];
                    this.P_TokenState = 'C';
                    this.moveToNextCharOnRecord();
                    break;
                }
            }
        }
        if (tokenComplete) {
            this.TokenComplete(inputRecordCharArray);
        }
        return commentCompleted;
    }
    
    @Override
    public void processOneRecord(final int recordCount, final String literalRecord, final String inputRecord, final String languageHint) {
        final char[] inputRecordCharArray = inputRecord.toCharArray();
        if (this.ProcessFunctionCode(inputRecordCharArray, languageHint)) {
            return;
        }
        if (inputRecordCharArray.length == 0) {
            return;
        }
        final char firstChar = inputRecordCharArray[0];
        if (firstChar != ' ') {
            inputRecordCharArray[0] = ' ';
        }
        if (inputRecordCharArray.length < 2) {
            return;
        }
        this.columnCurrentRecord = 2;
        this.ircaIndex = 1;
        if (this.symanticState == 2) {
            if (inputRecordCharArray[this.ircaIndex] != '@') {
                return;
            }
        }
        else if (this.symanticState == 7) {
            if (this.ddName.length() != 0) {
                if (this.previousToken.equals("(")) {
                    this.metaData.captureInclude(this.currentToken, this.ddName, this.debug);
                }
                else {
                    this.metaData.captureInclude(3, this.ddName);
                }
            }
            this.symanticState = 14;
        }
        if (this.generateType == 3) {
            this.handleGenerateBlock(inputRecord);
            return;
        }
        if (inputRecordCharArray[this.ircaIndex] == '!' && (this.ircaIndex + 1 == inputRecordCharArray.length || (this.ircaIndex + 1 < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex + 1] != '!'))) {
            this.metaData.incrementCommentLines();
            ++this.plxCommentCount;
            this.score += 5;
            return;
        }
        if (this.P_TokenState != 'Q') {
            while (this.ircaIndex < inputRecordCharArray.length && this.columnCurrentRecord <= this.marginsValue2 && inputRecordCharArray[this.ircaIndex] == ' ') {
                this.moveToNextCharOnRecord();
            }
        }
        if (this.ircaIndex == inputRecordCharArray.length || this.columnCurrentRecord > this.marginsValue2 || inputRecordCharArray[this.ircaIndex] == '\n') {
            ++this.blankCount_PLX;
            return;
        }
        boolean completeRecordIsComment = true;
        boolean P_IsDelimiter = false;
        this.P_NewLine = true;
        final boolean returnNow = false;
        if (this.P_TokenState == 'S') {
            this.tokenNumberOnLine = 0;
        }
        while (this.ircaIndex < inputRecordCharArray.length && this.columnCurrentRecord <= this.marginsValue2) {
            if (this.P_TokenState != 'M') {
                if (this.P_TokenState != 'Q' && inputRecordCharArray[this.ircaIndex] == '!' && (this.ircaIndex + 1 == inputRecordCharArray.length || (this.ircaIndex + 1 < inputRecordCharArray.length && inputRecordCharArray[this.ircaIndex + 1] != '!')) && !this.currentToken.endsWith("!")) {
                    this.TokenComplete(inputRecordCharArray);
                    ++this.plxCommentCount;
                    this.score += 5;
                    break;
                }
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
                    if (this.ircaIndex + 1 > inputRecordCharArray.length) {
                        break;
                    }
                }
                if (completeRecordIsComment && this.P_TokenState != 'M' && inputRecordCharArray[this.ircaIndex] != ' ') {
                    completeRecordIsComment = false;
                }
            }
            this.processOneCharacter(inputRecordCharArray, P_IsDelimiter);
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
}
