// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsCOB;
import com.ibm.dmh.scan.classify.ClassifierMetaData;
import java.util.Iterator;
import java.util.HashSet;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsASM_netView;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsASM_mfs;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsASM_ibmMacros;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsASM_optableUNI;
import com.ibm.dmh.util.StringUtils;
import java.util.HashMap;
import com.ibm.dmh.scan.classify.ScanProperties;
import com.ibm.dmh.scan.classify.utils.ParserAsmStatement;
import java.util.Set;
import java.util.Map;

public class ClassifierASM extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2022\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final int WORD_IS_IBM_MACRO = 1;
    private static final int WORD_IS_IBM_NETVIEW_MACRO = 2;
    private static final int WORD_IS_MFS = 3;
    public static final int WORD_IS_NOT_RESERVED = 4;
    private static final int WORD_IS_RESERVED = 5;
    private boolean after_1st_macro;
    private boolean BMSmacroFound;
    private boolean continuationLine;
    private boolean DBDGEN_END_Found;
    private boolean DBDGEN_Found;
    private boolean first_macro;
    private boolean firstLineInMacro;
    private boolean MACRO_MEND_Found;
    private boolean macroWellFormed;
    private boolean operandWellFormed;
    private boolean processingComment;
    private boolean PSBGEN_Found;
    private boolean REPRO_Found;
    private boolean TELL_Found;
    private int DBDGEN_Operations_score;
    private int macroCount;
    private int noncomment_after_1st_macro;
    private int numberOfLabelsInFile;
    private int PSBGEN_Operations_score;
    private Map<String, String> macroKeyValuePairs;
    private Set<String> namesUsingSetC;
    protected ParserAsmStatement parserAsmStatement;
    
    public ClassifierASM(final ScanProperties scanProperties) {
        super(scanProperties);
        this.parserAsmStatement = new ParserAsmStatement(scanProperties.getMvsCodePage());
        this.init();
    }
    
    private int calculateSLOC(final int lineCount) {
        return lineCount - this.blankLineCount - this.getCommentCount();
    }
    
    private void captureMacroDefinition(final String operation, final String operands) {
        this.metaData.captureInclude(62, operation);
        if (operands == null) {
            return;
        }
        this.macroKeyValuePairs = new HashMap<String, String>();
        final String[] split;
        final String[] operand = split = StringUtils.split(operands, ",");
        for (final String keyValue : split) {
            final int equalSign = keyValue.indexOf(61);
            String key;
            String value;
            if (equalSign == -1) {
                key = keyValue;
                value = "";
            }
            else {
                key = keyValue.substring(0, equalSign);
                value = keyValue.substring(equalSign + 1);
            }
            this.macroKeyValuePairs.put(key, value);
        }
    }
    
    private void captureMacroInvocation(final String operation, final boolean reportNetViewMacros) {
        if (operation.startsWith("&")) {
            if (this.macroKeyValuePairs != null) {
                final String value = this.macroKeyValuePairs.get(operation);
                if (!StringUtils.isEmpty(value)) {
                    if (!value.contains("&")) {
                        if (this.namesUsingSetC == null || !this.namesUsingSetC.contains(operation)) {
                            final int wordIs = checkForReservedWord(value, reportNetViewMacros);
                            if (wordIs == 4) {
                                this.metaData.captureInclude(8, value);
                            }
                        }
                    }
                }
            }
        }
        else if (!operation.contains("&")) {
            this.metaData.captureInclude(8, operation);
        }
    }
    
    public static int checkForReservedWord(final String operation, final boolean reportNetViewMacros) {
        if (ReservedWordsASM_optableUNI.containsKey(operation)) {
            return 5;
        }
        if (ReservedWordsASM_ibmMacros.containsKey(operation)) {
            return 1;
        }
        if (ReservedWordsASM_mfs.containsKey(operation)) {
            return 3;
        }
        if (!reportNetViewMacros && ReservedWordsASM_netView.containsKey(operation)) {
            return 2;
        }
        return 4;
    }
    
    @Override
    public boolean getIgnoreCase() {
        return false;
    }
    
    @Override
    public String getLanguageCd() {
        return "ASM";
    }
    
    @Override
    public String getLanguageDescription() {
        return "Assembler";
    }
    
    @Override
    public int getLanguageId() {
        return 2;
    }
    
    private int calculateLabelsLength() {
        final String name = this.parserAsmStatement.getName();
        final int length = name.length();
        if (length < 2) {
            return length;
        }
        int index = name.indexOf(38);
        if (index == -1) {
            return length;
        }
        int calculatedLength = index + 1;
        boolean inSymbolicVariable = true;
        ++index;
        while (index < length) {
            if (inSymbolicVariable) {
                if (name.charAt(index) == '.') {
                    inSymbolicVariable = false;
                }
                else if (name.charAt(index) == '&') {
                    ++calculatedLength;
                }
            }
            else {
                ++calculatedLength;
                if (name.charAt(index) == '&') {
                    inSymbolicVariable = true;
                }
            }
            ++index;
        }
        return calculatedLength;
    }
    
    public boolean checkAsmComment(final String record) {
        if (record.length() == 0 || record.charAt(0) != '*') {
            return false;
        }
        this.processingComment = true;
        this.increaseScore(5);
        this.metaData.incrementCommentLines();
        this.continuationLine = ParserAsmStatement.checkIfContinuationLine(record);
        return true;
    }
    
    private boolean CheckFirstColumn(final String iRecord, final int iLineCount, final String languageHint) {
        if (iRecord.length() >= 1 && iRecord.charAt(0) == '>' && iLineCount == 1) {
            return true;
        }
        if (this.checkAsmComment(iRecord)) {
            return true;
        }
        if (this.processingComment && this.continuationLine) {
            this.continuationLine = ParserAsmStatement.checkIfContinuationLine(iRecord);
            return true;
        }
        this.processingComment = false;
        if (!languageHint.equals("ASM") && iRecord.startsWith("//")) {
            if (this.DBDGEN_END_Found) {
                return true;
            }
            this.rejectThisLanguageCd();
            return true;
        }
        else {
            final String tokens = iRecord.trim();
            if (tokens.startsWith(".*")) {
                this.increaseScore(5);
                this.metaData.incrementCommentLines();
                return true;
            }
            return false;
        }
    }
    
    private void CheckIncludeOperand(final String[] tokens) {
        if (tokens.length <= 1) {
            return;
        }
        if (!tokens[1].equals("INCLUDE")) {
            return;
        }
        if (tokens.length == 2) {
            return;
        }
        this.metaData.captureInclude(7, tokens[2]);
    }
    
    private void handleNonReservedWord(final boolean reportNetViewMacros) {
        final String realOperation = this.parserAsmStatement.getRealOperation();
        final String operands = this.parserAsmStatement.getOperands();
        if (realOperation.equals("EXEC")) {
            this.macroWellFormed = false;
            if (StringUtils.isEmpty(operands)) {
                return;
            }
            final String[] tokens = StringUtils.split(operands);
            if (tokens[0].equals("CICS")) {
                if (!this.parserAsmStatement.getSkipCicsCommand()) {
                    this.metaData.incrementNumValue(30);
                }
            }
            else if (tokens[0].equals("DLI")) {
                this.metaData.incrementNumValue(31);
            }
            else if (tokens[0].equals("IDMS")) {
                this.metaData.incrementNumValue(32);
            }
            else if (tokens[0].equals("SQL")) {
                this.metaData.incrementNumValue(33);
                this.CheckIncludeOperand(tokens);
            }
            else {
                this.metaData.addSymbolUserDefined(realOperation);
            }
        }
        else {
            ++this.macroCount;
            if (realOperation.equals("TELL")) {
                if (operands.contains("CODE=NO")) {
                    this.TELL_Found = true;
                }
                return;
            }
            this.captureMacroInvocation(realOperation, reportNetViewMacros);
            if (realOperation.equals("AREA") || realOperation.equals("DATASET") || realOperation.equals("FIELD") || realOperation.equals("FINISH") || realOperation.equals("FLD") || realOperation.equals("FLDK") || realOperation.equals("LCHILD") || realOperation.equals("SEGM") || realOperation.equals("XDFLD")) {
                this.DBDGEN_Operations_score += 10;
            }
            else if (realOperation.equals("DBDGEN")) {
                this.increaseScore(this.DBDGEN_Operations_score);
                this.DBDGEN_Operations_score = 0;
                this.DBDGEN_Found = true;
            }
            else if (realOperation.equals("PSBGEN")) {
                this.increaseScore(this.PSBGEN_Operations_score);
                this.PSBGEN_Operations_score = 0;
                this.PSBGEN_Found = true;
            }
            else if (realOperation.equals("SENSEG")) {
                this.PSBGEN_Operations_score += 10;
            }
            else {
                this.metaData.addSymbolUserDefined(realOperation);
            }
        }
    }
    
    private boolean CheckOperandContents() {
        final String operands = this.parserAsmStatement.getOperands();
        return operands.contains("'") || !operands.contains(";");
    }
    
    private void handleReservedWord(final int wordIs, final String name, final String operation, final String operands, final int lineCount) {
        ++this.reserveWordCount;
        int attrTypeId = 0;
        if (operation.equals("EJECT") || operation.equals("SPACE")) {
            this.increaseScore(1);
        }
        else if (operation.equals("TITLE")) {
            this.increaseScore(10);
        }
        else if (wordIs == 3) {
            if (operation.equals("FMT") || operation.equals("FMTEND") || operation.equals("MSG") || operation.equals("MSGEND") || operation.equals("PDB") || operation.equals("PDBEND") || operation.equals("TABLE") || operation.equals("TABLEEND") || operation.equals("UNSTACK")) {
                this.increaseScore(10);
            }
            else {
                this.increaseScore(25);
            }
            attrTypeId = 87;
        }
        else if (operation.startsWith("C")) {
            if (operation.equals("CALL") || operation.equals("CALLDLI")) {
                this.increaseScore(10);
                if (operands.equals("AERTDLI")) {
                    attrTypeId = 59;
                }
                else if (operands.equals("AIBTDLI")) {
                    attrTypeId = 43;
                }
                else if (operands.equals("ASMTDLI")) {
                    attrTypeId = 42;
                }
                else if (operands.equals("CBLTDLI")) {
                    attrTypeId = 38;
                }
                else {
                    final String[] targetCall = operands.split(",");
                    if (targetCall.length >= 1 && !targetCall[0].equals("") && !targetCall[0].startsWith("(")) {
                        this.metaData.addControlTransfer(operation, targetCall[0]);
                    }
                }
            }
            else if (operation.equals("CEEENTRY")) {
                this.increaseScore(25);
                attrTypeId = 82;
            }
            else if (operation.equals("CEEXAHD")) {
                this.increaseScore(25);
                attrTypeId = 84;
            }
            else if (operation.equals("CEEXART")) {
                this.increaseScore(25);
                attrTypeId = 85;
            }
            else if (operation.equals("CEEXAST")) {
                this.increaseScore(25);
                attrTypeId = 86;
            }
            else if (operation.equals("COPY")) {
                this.increaseScore(10);
                this.metaData.captureInclude(3, operands);
            }
            else if (operation.equals("CSECT")) {
                this.increaseScore(60);
                attrTypeId = 46;
            }
            else {
                this.accumulateScore(wordIs);
            }
        }
        else if (operation.startsWith("D")) {
            if (operation.equals("DBD")) {
                this.increaseScore(25);
                attrTypeId = 81;
            }
            else if (operation.equals("DFHMDI") || operation.equals("DFHMDF")) {
                this.increaseScore(60);
            }
            else if (operation.equals("DFHMSD")) {
                this.increaseScore(60);
                if (!operands.contains("TYPE=FINAL")) {
                    attrTypeId = 65;
                    this.BMSmacroFound = true;
                }
            }
            else if (operation.equals("DROP")) {
                this.increaseScore(25);
            }
            else {
                this.accumulateScore(wordIs);
            }
        }
        else if (operation.startsWith("E")) {
            if (operation.equals("EXTRN")) {
                this.increaseScore(25);
            }
            else if (operation.equals("END")) {
                if (this.DBDGEN_Found) {
                    this.DBDGEN_END_Found = true;
                }
                this.increaseScore(25);
            }
            else if (operation.equals("ENTRY")) {
                this.increaseScore(25);
                attrTypeId = 57;
            }
            else {
                this.accumulateScore(wordIs);
            }
        }
        else if (operation.equals("FCT")) {
            this.increaseScore(25);
            attrTypeId = 50;
        }
        else if (operation.equals("ICTL")) {
            this.increaseScore(25);
            attrTypeId = 45;
        }
        else if (operation.startsWith("M")) {
            if (operation.equals("MACRO")) {
                this.increaseScore(25);
                if (!this.first_macro) {
                    this.first_macro = true;
                    this.metaData.setNonCommentBefore1st(this.calculateSLOC(lineCount) - 1);
                }
                this.firstLineInMacro = true;
            }
            else if (operation.equals("MEND")) {
                this.increaseScore(60);
                this.after_1st_macro = true;
                if (this.first_macro) {
                    this.MACRO_MEND_Found = true;
                }
            }
            else {
                this.accumulateScore(wordIs);
            }
        }
        else if (operation.equals("OPSYN")) {
            this.increaseScore(25);
            attrTypeId = 44;
        }
        else if (operation.startsWith("P")) {
            if (operation.equals("PCB")) {
                this.increaseScore(25);
                attrTypeId = 49;
            }
            else if (operation.equals("PCT")) {
                this.increaseScore(25);
                attrTypeId = 51;
            }
            else if (operation.equals("PPT")) {
                this.increaseScore(25);
                attrTypeId = 55;
            }
            else if (operation.equals("PSB")) {
                this.increaseScore(25);
                attrTypeId = 48;
            }
            else {
                this.accumulateScore(wordIs);
            }
        }
        else if (operation.startsWith("R")) {
            if (operation.equals("REPRO")) {
                this.increaseScore(10);
                this.REPRO_Found = true;
            }
            else if (operation.equals("RSECT")) {
                this.increaseScore(60);
                attrTypeId = 58;
            }
            else {
                this.accumulateScore(wordIs);
            }
        }
        else if (operation.startsWith("S")) {
            if (operation.equals("SETC")) {
                if (this.namesUsingSetC == null) {
                    this.namesUsingSetC = new HashSet<String>();
                }
                this.namesUsingSetC.add(name);
                this.increaseScore(25);
            }
            else if (operation.equals("START")) {
                this.increaseScore(25);
                attrTypeId = 47;
            }
            else {
                this.accumulateScore(wordIs);
            }
        }
        else {
            this.accumulateScore(wordIs);
        }
        if (attrTypeId != 0) {
            this.metaData.incrementNumValue(attrTypeId);
        }
        if (this.hasItBeenDelcaredAMacro()) {
            this.metaData.captureInclude(8, operation);
        }
    }
    
    private void accumulateScore(final int wordIs) {
        if (wordIs == 1 || wordIs == 2) {
            this.increaseScore(10);
        }
        else {
            this.increaseScore(25);
        }
    }
    
    public void clearTokenFields() {
        this.macroWellFormed = true;
        this.operandWellFormed = true;
    }
    
    @Override
    public boolean hasBMSmacro() {
        return this.BMSmacroFound;
    }
    
    @Override
    public boolean hasDBDGENstatement() {
        return this.DBDGEN_Found;
    }
    
    @Override
    public boolean hasMACRO_MEND() {
        return this.MACRO_MEND_Found;
    }
    
    @Override
    public boolean hasPSBGENstatement() {
        return this.PSBGEN_Found;
    }
    
    public boolean hasWellFormedMacro() {
        return this.macroWellFormed;
    }
    
    private boolean CompleteAStatement(final int lineCount, final String languageHint, final boolean reportNetViewMacros) {
        final String name = this.parserAsmStatement.getName();
        final String realOperation = this.parserAsmStatement.getRealOperation();
        final String operands = this.parserAsmStatement.getOperands();
        if (name.length() != 0) {
            if (name.contains("=") || name.contains(",")) {
                this.macroWellFormed = false;
            }
            else {
                this.metaData.addSymbolUserDefined(name);
            }
        }
        if (realOperation.length() == 0) {
            return true;
        }
        if (realOperation.contains("=") || realOperation.contains(",")) {
            this.macroWellFormed = false;
        }
        if (this.identifierMode == 'U' && !languageHint.equals("ASM") && this.ShouldItBeRejectedAsASM()) {
            this.rejectThisLanguageCd();
            return false;
        }
        if (this.firstLineInMacro) {
            this.captureMacroDefinition(realOperation, operands);
            this.firstLineInMacro = false;
        }
        else {
            final boolean operationIsMacro = this.parserAsmStatement.getOperationIsMacro();
            if (operationIsMacro) {
                this.handleNonReservedWord(reportNetViewMacros);
            }
            else {
                final int wordIs = checkForReservedWord(realOperation, reportNetViewMacros);
                if (wordIs == 4) {
                    this.handleNonReservedWord(reportNetViewMacros);
                }
                else {
                    this.macroWellFormed = false;
                    this.handleReservedWord(wordIs, name, realOperation, operands, lineCount);
                }
            }
        }
        return true;
    }
    
    private boolean hasItBeenDelcaredAMacro() {
        final Map<Integer, Map<String, Integer>> inclList = this.metaData.getInclList();
        final String realOperation = this.parserAsmStatement.getRealOperation();
        if (inclList == null || inclList.size() == 0) {
            return false;
        }
        final Map<String, Integer> values = inclList.get(new Integer(62));
        if (values == null) {
            return false;
        }
        boolean rc = false;
        for (final String value : values.keySet()) {
            if (realOperation.equals(value)) {
                rc = true;
                break;
            }
        }
        return rc;
    }
    
    protected void init() {
        this.clearTokenFields();
        this.after_1st_macro = false;
        this.BMSmacroFound = false;
        this.continuationLine = false;
        this.DBDGEN_END_Found = false;
        this.DBDGEN_Found = false;
        this.DBDGEN_Operations_score = 0;
        this.first_macro = false;
        this.firstLineInMacro = false;
        this.MACRO_MEND_Found = false;
        this.macroCount = 0;
        this.macroKeyValuePairs = null;
        this.namesUsingSetC = null;
        this.noncomment_after_1st_macro = 0;
        this.numberOfLabelsInFile = 0;
        this.processingComment = false;
        this.PSBGEN_Found = false;
        this.PSBGEN_Operations_score = 0;
        this.REPRO_Found = false;
        this.TELL_Found = false;
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        if (this.BMSmacroFound || this.DBDGEN_Found || this.PSBGEN_Found || (this.first_macro && this.hasMACRO_MEND())) {
            return;
        }
        if (this.numberOfLabelsInFile == 0) {
            final int SLOC = this.calculateSLOC(lineCount);
            if (this.reserveWordCount == 0) {
                final double thirdOfTheAsmLines = SLOC / 3;
                if (this.macroCount < thirdOfTheAsmLines) {
                    this.score = 0;
                }
            }
            else {
                final double aboutHalfOfTheAsmLines = SLOC / 2.5;
                if (this.reserveWordCount + this.macroCount < aboutHalfOfTheAsmLines) {
                    this.score = 0;
                }
            }
        }
        else if (this.reserveWordCount == 0 && !this.hasWellFormedMacro()) {
            this.score = 0;
        }
    }
    
    @Override
    public ClassifierMetaData processEndOfFile(final int lineCount) {
        if (this.after_1st_macro) {
            this.metaData.setNonAfter(this.noncomment_after_1st_macro);
        }
        this.metaData.setBlanklines(this.blankLineCount);
        this.metaData.setNonCommentLines(this.calculateSLOC(lineCount));
        this.metaData.setTotalLines(lineCount);
        return this.metaData;
    }
    
    @Override
    public void processInitialization() {
        this.init();
        this.identifierMode = 'U';
        this.metaData = new ClassifierMetaData();
    }
    
    @Override
    public void processOneRecord(final int recordCount, final String literalRecord, final String record, final String languageHint) {
        if (this.REPRO_Found) {
            this.REPRO_Found = false;
            if (this.after_1st_macro) {
                ++this.noncomment_after_1st_macro;
            }
            return;
        }
        if (this.TELL_Found) {
            if (record.length() >= 4 && record.substring(0, 4).equals("-END")) {
                this.TELL_Found = false;
            }
            if (this.after_1st_macro) {
                ++this.noncomment_after_1st_macro;
            }
            return;
        }
        if (this.CheckFirstColumn(record, recordCount, languageHint)) {
            return;
        }
        if (this.after_1st_macro) {
            ++this.noncomment_after_1st_macro;
        }
        if (record.trim().isEmpty()) {
            this.continuationLine = false;
        }
        else {
            this.continuationLine = this.parserAsmStatement.getNameOperationOperands(recordCount, record, this.continuationLine);
        }
        final int validNames = this.parserAsmStatement.validateNames();
        if (validNames == 1 || validNames == 11) {
            this.rejectThisLanguageCd();
            return;
        }
        if (validNames == 3 || validNames == 7) {
            return;
        }
        if (this.continuationLine) {
            final String operands = this.parserAsmStatement.getOperands();
            if (operands.length() == 0) {
                return;
            }
            this.operandWellFormed = this.parserAsmStatement.checkOperandForm(operands, false);
            if (this.operandWellFormed) {
                this.increaseScore(5);
            }
        }
        else {
            final String operands = this.parserAsmStatement.getOperands();
            if (operands.length() > 0) {
                this.operandWellFormed = this.parserAsmStatement.checkOperandForm(operands, true);
            }
            if (validNames == 6 || validNames == 8 || validNames == 9) {
                ++this.numberOfLabelsInFile;
            }
            if (!this.CompleteAStatement(recordCount, languageHint, this.scanProperties.getReportNetViewMacros())) {
                return;
            }
            final String realOperation = this.parserAsmStatement.getRealOperation();
            if (!this.operandWellFormed) {
                this.macroWellFormed = false;
            }
            else if (!realOperation.equals("END;")) {
                this.updateScoreIfMacro();
            }
        }
    }
    
    private void updateScoreIfMacro() {
        if (!this.CheckOperandContents()) {
            return;
        }
        if (!(this instanceof ClassifierASM)) {
            return;
        }
        final String realOperation = this.parserAsmStatement.getRealOperation();
        if (ReservedWordsCOB.containsKey(realOperation)) {
            final String value = ReservedWordsCOB.get(realOperation);
            final String[] tokens = StringUtils.split(value, ',');
            final String tokenType = tokens[0];
            if (tokenType.equals("Verb")) {
                return;
            }
            if (tokenType.equals("ReservedWord")) {
                final String name = this.parserAsmStatement.getName();
                final int nameColumnNo = this.parserAsmStatement.getNameColumnNo();
                if (nameColumnNo == 1 && name.length() == 6 && StringUtils.isNumeric(name)) {
                    return;
                }
            }
        }
        if (this.macroWellFormed) {
            this.increaseScore(5);
        }
    }
    
    private boolean ShouldItBeRejectedAsASM() {
        final String operands = this.parserAsmStatement.getOperands();
        final String realOperation = this.parserAsmStatement.getRealOperation();
        if (realOperation.equals("TITLE")) {
            final int labelsLength = this.calculateLabelsLength();
            return (labelsLength > 8 || operands.length() != 0) && operands.charAt(0) != '\'' && operands.charAt(0) != '&';
        }
        final int validNames = this.parserAsmStatement.validateNames();
        return validNames == 1 || StringUtils.isNumeric(realOperation.substring(0, 1)) || realOperation.charAt(0) == '_' || (realOperation.contains("+") || realOperation.contains("-") || realOperation.contains(",") || realOperation.contains("=") || realOperation.contains("*") || realOperation.contains("'") || realOperation.contains("/") || realOperation.contains("\\") || realOperation.contains("%") || realOperation.contains("?") || realOperation.contains(":") || realOperation.contains("{") || realOperation.contains("}")) || (realOperation.equals("CALL") && operands.length() != 0 && operands.endsWith(";"));
    }
    
    @Override
    protected boolean checkForBlankLine(final String iRecord) {
        if (!iRecord.trim().isEmpty()) {
            return false;
        }
        ++this.blankLineCount;
        if (this.continuationLine) {
            this.parserAsmStatement.removeTrailingOperandComma();
            return false;
        }
        return true;
    }
}
