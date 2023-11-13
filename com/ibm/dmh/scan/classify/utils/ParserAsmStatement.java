// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.utils;

import java.util.ArrayList;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsASM_optableUNI;
import java.io.UnsupportedEncodingException;
import com.ibm.dmh.util.StringUtils;
import java.util.List;

public class ParserAsmStatement
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2022\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final int NAME_LENGTH = 63;
    public static final int NAME_INVALID = 1;
    private static final int NAME_NONE = 2;
    public static final int NAME_NONE_OPERATION_BAD = 3;
    private static final int NAME_NONE_OPERATION_VALID_MACRO = 4;
    public static final int NAME_NONE_OPERATION_VALID_NOT_MACRO = 5;
    public static final int NAME_VALID = 6;
    public static final int NAME_VALID_OPERATION_BAD = 7;
    public static final int NAME_VALID_OPERATION_VALID_MACRO = 8;
    public static final int NAME_VALID_OPERATION_VALID_NOT_MACRO = 9;
    private static final int OPERATION_BAD = 10;
    public static final int OPERATION_INVALID = 11;
    public static final int OPERATION_NONE = 12;
    private static final int OPERATION_VALID = 13;
    private static final int OPERATION_VALID_MACRO = 14;
    private static final int OPERANDS_LENGTH = 8192;
    private static final int OPERATION_LENGTH = 63;
    private static final int SCAN_STATE_LookingForName = 1;
    private static final int SCAN_STATE_LookingForOperand = 2;
    private static final int SCAN_STATE_LookingForOperation = 3;
    private static final int SCAN_STATE_LookingForRemarks = 4;
    private static final int SCAN_STATE_LookingForRemarksWithComma = 5;
    private static final int SCAN_STATE_ScanningExec = 6;
    private static final int SCAN_STATE_ScanningName = 7;
    private static final int SCAN_STATE_ScanningOperand = 8;
    private static final int SCAN_STATE_ScanningOperandWithSpaces = 9;
    private static final int SCAN_STATE_ScanningOperation = 10;
    private static final int SCAN_STATE_ScanningQuotedString = 11;
    private static final int SCAN_STATE_Setup = 12;
    private static final int OPERAND_IS_CONTINUED_FALSE = 0;
    private static final int OPERAND_IS_CONTINUED_TRUE = 1;
    private static final int OPERAND_IS_CONTINUED_MAYBE = 2;
    public static final String ASM_STMT_ACTR = "ACTR";
    public static final String ASM_STMT_AEJECT = "AEJECT";
    private static final String ASM_STMT_AGO = "AGO";
    private static final String ASM_STMT_AIF = "AIF";
    public static final String ASM_STMT_AINSERT = "AINSERT";
    public static final String ASM_STMT_AMODE = "AMODE";
    public static final String ASM_STMT_ANOP = "ANOP";
    public static final String ASM_STMT_AREAD = "AREAD";
    public static final String ASM_STMT_ASPACE = "ASPACE";
    public static final String ASM_STMT_EJECT = "EJECT";
    public static final String ASM_STMT_END = "END";
    public static final String ASM_STMT_ENTRY = "ENTRY";
    public static final String ASM_STMT_EQU = "EQU";
    private static final String ASM_STMT_GBLA = "GBLA";
    private static final String ASM_STMT_GBLB = "GBLB";
    private static final String ASM_STMT_GBLC = "GBLC";
    private static final String ASM_STMT_LCLA = "LCLA";
    private static final String ASM_STMT_LCLB = "LCLB";
    private static final String ASM_STMT_LCLC = "LCLC";
    public static final String ASM_STMT_RMODE = "RMODE";
    public static final String ASM_STMT_SETA = "SETA";
    private static final String ASM_STMT_SETAF = "SETAF";
    public static final String ASM_STMT_SETB = "SETB";
    public static final String ASM_STMT_SETC = "SETC";
    private static final String ASM_STMT_SETCF = "SETCF";
    public static final String ASM_STMT_TITLE = "TITLE";
    private String standardCharSet;
    private static final String standardCharSetNationals = "@$#";
    private static final String extendedCharSet1141 = "§";
    private boolean allowSpacesOnContinuedLine;
    private boolean literalContinued;
    private boolean nonBlankCol72;
    private boolean operationIsMacro;
    private boolean skipCicsCommand;
    private boolean stopScanningRecord;
    private int currentColumnNo;
    private int currentFileLineNo;
    private int currentSourceLineNo;
    private int nameColumnNo;
    private int nameFileLineNo;
    private int nameSourceLineNo;
    private int operandIsContinued;
    private int operationColumnNo;
    private int operationFileLineNo;
    private int operationSourceLineNo;
    private int parenCount;
    private int scanState;
    private List<String> remarks;
    private String currentChar;
    private String name;
    private String nextChar;
    private String operands;
    private String operation;
    private String previousChar;
    private String previousPreviousChar;
    private String prevOperands;
    private String realOperation;
    
    public ParserAsmStatement() {
        this(null);
    }
    
    public ParserAsmStatement(String mvsCodePage) {
        this.standardCharSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_0123456789+-,=.*()'/& ";
        this.allowSpacesOnContinuedLine = false;
        this.currentColumnNo = 0;
        this.currentFileLineNo = 0;
        this.currentSourceLineNo = 0;
        this.literalContinued = false;
        this.name = "";
        this.nameColumnNo = 0;
        this.nameFileLineNo = 0;
        this.nameSourceLineNo = 0;
        this.nonBlankCol72 = false;
        this.operandIsContinued = 0;
        this.operands = "";
        this.operation = "";
        this.operationColumnNo = 0;
        this.operationFileLineNo = 0;
        this.operationIsMacro = false;
        this.operationSourceLineNo = 0;
        this.parenCount = 0;
        this.previousChar = "";
        this.previousPreviousChar = "";
        this.prevOperands = "";
        this.realOperation = "";
        this.scanState = 12;
        this.skipCicsCommand = false;
        this.stopScanningRecord = false;
        if (!StringUtils.isEmpty(mvsCodePage)) {
            try {
                final byte[] bytes1047 = "@$#".getBytes("Cp1047");
                final String chars = new String(bytes1047, mvsCodePage);
                this.standardCharSet += chars;
                if (mvsCodePage.contains("1141")) {
                    this.standardCharSet += "§";
                }
            }
            catch (UnsupportedEncodingException e) {
                mvsCodePage = null;
            }
        }
        if (StringUtils.isEmpty(mvsCodePage)) {
            this.standardCharSet += "@$#";
            this.standardCharSet += "§";
        }
    }
    
    private boolean adjustScanStateForContinuationIndicator(final String record, final boolean useContinuedColumn) {
        boolean continuationLine;
        if (useContinuedColumn) {
            continuationLine = checkIfContinuationLine(record);
            switch (this.scanState) {
                case 4: {
                    if (this.remarks == null) {
                        break;
                    }
                    if (this.remarks.size() == 0) {
                        break;
                    }
                    this.scanState = 2;
                    break;
                }
                case 5: {
                    this.scanState = 2;
                    break;
                }
                case 12: {
                    this.setup();
                    this.scanState = 1;
                    break;
                }
            }
        }
        else {
            continuationLine = checkIfContinuationLine(record);
            this.setup();
            this.scanState = 1;
        }
        if (this.skipCicsCommand) {
            this.scanState = 6;
        }
        return continuationLine;
    }
    
    private int checkName() {
        final int nameLength = this.name.length();
        if (nameLength == 0) {
            return 2;
        }
        int rc = 6;
        for (int i = 0; i < this.name.length(); ++i) {
            final String nameChar = this.name.substring(i, i + 1);
            if (!this.standardCharSet.contains(nameChar)) {
                rc = 1;
                break;
            }
        }
        return rc;
    }
    
    public boolean checkOperandForm(final String operands, final boolean isCompleteOperands) {
        return (isCompleteOperands || operands.contains("=")) && ((!isCompleteOperands && operands.endsWith(",")) || (isCompleteOperands && !operands.endsWith(",")) || this.scanState == 11);
    }
    
    private int checkOperation() {
        final int operationLength = this.operation.length();
        if (operationLength == 0) {
            return 12;
        }
        final String firstChar = this.operation.substring(0, 1);
        if (firstChar.equals("*")) {
            return 10;
        }
        if (this.operation.endsWith(":ASM")) {
            this.realOperation = this.operation.substring(0, this.operation.length() - 4);
            this.operationIsMacro = false;
        }
        if (this.operation.endsWith(":MAC")) {
            this.realOperation = this.operation.substring(0, this.operation.length() - 4);
            this.operationIsMacro = true;
        }
        else {
            this.realOperation = this.operation;
            this.operationIsMacro = false;
        }
        int rc = 13;
        for (int i = 0; i < this.realOperation.length(); ++i) {
            final String realOperationChar = this.realOperation.substring(i, i + 1);
            if (!this.standardCharSet.contains(realOperationChar)) {
                rc = 11;
                break;
            }
        }
        return rc;
    }
    
    public static boolean checkIfContinuationLine(final String record) {
        return record.length() >= 72 && record.charAt(71) != ' ';
    }
    
    public Boolean getLiteralContinued() {
        return this.literalContinued;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getNameColumnNo() {
        return this.nameColumnNo;
    }
    
    public int getNameFileLineNo() {
        return this.nameFileLineNo;
    }
    
    public int getNameSourceLineNo() {
        return this.nameSourceLineNo;
    }
    
    public String getOperands() {
        return this.operands;
    }
    
    public String getOperation() {
        return this.operation;
    }
    
    public int getOperationColumnNo() {
        return this.operationColumnNo;
    }
    
    public int getOperationFileLineNo() {
        return this.operationFileLineNo;
    }
    
    public boolean getOperationIsMacro() {
        return this.operationIsMacro;
    }
    
    public int getOperationSourceLineNo() {
        return this.operationSourceLineNo;
    }
    
    public String getRealOperation() {
        return this.realOperation;
    }
    
    public List<String> getRemarks() {
        return this.remarks;
    }
    
    public boolean getSkipCicsCommand() {
        return this.skipCicsCommand;
    }
    
    public boolean getNameOperationOperands(final int lineNo, String A_p_line, final boolean useContinuedColumn) {
        final boolean continuationLine = this.adjustScanStateForContinuationIndicator(A_p_line, useContinuedColumn);
        final String wholeLine = A_p_line;
        this.currentFileLineNo = lineNo;
        this.currentSourceLineNo = lineNo;
        this.stopScanningRecord = false;
        if (useContinuedColumn && A_p_line.length() > 15) {
            A_p_line = A_p_line.substring(15);
            this.currentColumnNo = 15;
            if (this.operandIsContinued == 2) {
                this.operands = this.operands.substring(0, this.operands.length() - 1);
            }
            this.operandIsContinued = 0;
        }
        else {
            this.currentColumnNo = 0;
        }
        while (A_p_line.length() != 0) {
            ++this.currentColumnNo;
            this.currentChar = A_p_line.substring(0, 1);
            try {
                this.nextChar = A_p_line.substring(1, 2);
            }
            catch (Exception e) {
                this.nextChar = "";
            }
            switch (this.scanState) {
                case 1: {
                    this.processScanStateLookingForName();
                    break;
                }
                case 2: {
                    this.processScanStateLookingForOperand();
                    break;
                }
                case 3: {
                    this.processScanStateLookingForOperation();
                    break;
                }
                case 4: {
                    this.processScanStateLookingForRemarks(A_p_line, wholeLine);
                    break;
                }
                case 5: {
                    this.processScanStateLookingForRemarksWithComma(A_p_line, wholeLine);
                    break;
                }
                case 6: {
                    this.processScanStateScanningExec(wholeLine);
                    break;
                }
                case 7: {
                    this.processScanStateScanningName();
                    break;
                }
                case 8: {
                    this.processScanStateScanningOperand(wholeLine);
                    break;
                }
                case 9: {
                    this.processScanStateScanningOperandWithSpaces();
                    break;
                }
                case 10: {
                    this.processScanStateScanningOperation();
                    break;
                }
                case 11: {
                    this.processScanStateScanningQuotedString();
                    break;
                }
            }
            if (this.stopScanningRecord) {
                break;
            }
            if (this.scanState != 2 && this.scanState != 4 && this.scanState != 5) {
                this.previousPreviousChar = this.previousChar;
                this.previousChar = this.currentChar;
            }
            A_p_line = A_p_line.substring(1);
        }
        if ((this.operandIsContinued == 1 || this.operandIsContinued == 2) && this.scanState == 8 && !this.stopScanningRecord && A_p_line.length() == 0) {
            this.operandIsContinued = 0;
            this.scanState = 1;
        }
        return continuationLine;
    }
    
    private boolean hasAlternativeStatementFormat() {
        return this.operation.equals("AGO") || this.operation.equals("AIF") || this.operation.equals("GBLA") || this.operation.equals("GBLB") || this.operation.equals("GBLC") || this.operation.equals("LCLA") || this.operation.equals("LCLB") || this.operation.equals("LCLC") || this.operation.equals("SETA") || this.operation.equals("SETAF") || this.operation.equals("SETB") || this.operation.equals("SETC") || this.operation.equals("SETCF");
    }
    
    private boolean isAsmDirective() {
        final String frmt = ReservedWordsASM_optableUNI.get(this.realOperation);
        return frmt != null && frmt.equals("HLASM");
    }
    
    private boolean isAsmOpcode() {
        final String frmt = ReservedWordsASM_optableUNI.get(this.realOperation);
        return frmt != null && !frmt.equals("HLASM");
    }
    
    private void clearRemarks() {
        if (this.remarks != null && this.remarks.size() != 0) {
            this.remarks.clear();
        }
    }
    
    private void collectRemarks(final String wholeLine, final String A_p_line) {
        final int checkForSeqNums = wholeLine.length();
        if (checkForSeqNums > 80) {
            return;
        }
        String remark;
        if (checkForSeqNums > 72) {
            final int lineNumOffset = checkForSeqNums - 72;
            final int endOfValidText = checkForSeqNums - this.currentColumnNo - lineNumOffset;
            if (endOfValidText > -1) {
                remark = A_p_line.substring(0, endOfValidText);
            }
            else {
                remark = A_p_line;
            }
        }
        else {
            remark = A_p_line;
        }
        if (checkForSeqNums == 72) {
            remark = remark.substring(0, remark.length() - 1);
        }
        remark = remark.trim();
        if (remark.length() != 0) {
            if (this.remarks == null) {
                this.remarks = new ArrayList<String>();
            }
            if (this.remarks.size() != 0) {
                this.remarks.add(" " + remark);
            }
            else {
                this.remarks.add(remark);
            }
        }
    }
    
    private void processScanStateLookingForName() {
        this.parenCount = 0;
        if (this.currentChar.equals(" ")) {
            this.operandIsContinued = 0;
            this.scanState = 3;
        }
        else {
            this.nameColumnNo = this.currentColumnNo;
            this.nameFileLineNo = this.currentFileLineNo;
            this.nameSourceLineNo = this.currentSourceLineNo;
            this.name += this.currentChar.toUpperCase();
            this.scanState = 7;
        }
    }
    
    private void processScanStateLookingForOperand() {
        if (this.currentColumnNo == 72) {
            this.stopScanningRecord = true;
            return;
        }
        if (this.currentChar.equals(" ")) {
            if (this.currentColumnNo == 71 && !this.nextChar.equals(" ")) {
                return;
            }
            if (this.literalContinued) {
                if (this.currentColumnNo > 15) {
                    this.operands += this.currentChar;
                }
            }
            else if (this.operandIsContinued == 1 || this.operandIsContinued == 2) {
                if (this.currentColumnNo > 15) {
                    this.operands += this.currentChar;
                }
            }
            else if (this.operands.length() != 0 && this.currentColumnNo > 15) {
                this.scanState = 4;
            }
        }
        else {
            this.operands += this.currentChar.toUpperCase();
            if (this.currentChar.equals("'") || this.literalContinued) {
                this.literalContinued = false;
                this.scanState = 11;
                return;
            }
            if (this.operation.equals("AIF") || this.operation.equals("SETB") || this.operation.equals("SETC") || this.allowSpacesOnContinuedLine) {
                if (this.currentChar.equals("(")) {
                    ++this.parenCount;
                    this.scanState = 9;
                    return;
                }
                if (this.currentChar.equals(")")) {
                    --this.parenCount;
                }
            }
            this.scanState = 8;
        }
    }
    
    private void processScanStateLookingForOperation() {
        if (this.currentColumnNo == 72) {
            this.stopScanningRecord = true;
        }
        else if (this.currentChar.equals(" ")) {
            if (!this.nextChar.equals(" ") && this.nonBlankCol72 && this.name.length() == 0 && this.operation.length() == 0) {
                if (this.currentColumnNo > 16) {
                    this.scanState = 4;
                    this.nonBlankCol72 = false;
                }
            }
            else {
                this.operandIsContinued = 0;
            }
        }
        else if (this.currentColumnNo == 16 && !this.currentChar.equals(" ") && this.previousChar.equals(" ") && this.nonBlankCol72 && this.name.length() == 0 && this.operation.length() == 0) {
            this.operandIsContinued = 1;
            this.operands += this.currentChar;
            this.scanState = 2;
        }
        else {
            this.operationColumnNo = this.currentColumnNo;
            this.operationFileLineNo = this.currentFileLineNo;
            this.operationSourceLineNo = this.currentSourceLineNo;
            this.operation += this.currentChar.toUpperCase();
            this.scanState = 10;
        }
    }
    
    private void processScanStateLookingForRemarks(final String A_p_line, final String wholeLine) {
        if (this.currentColumnNo < 72) {
            if (!this.currentChar.equals(" ")) {
                if (this.currentChar.equals(",")) {
                    if (!this.nextChar.equals(" ")) {
                        this.nonBlankCol72 = checkIfContinuationLine(wholeLine);
                        this.collectRemarks(wholeLine, A_p_line);
                        this.scanState = 1;
                        this.stopScanningRecord = true;
                    }
                }
                else {
                    this.nonBlankCol72 = checkIfContinuationLine(wholeLine);
                    this.collectRemarks(wholeLine, A_p_line);
                    if (!this.nonBlankCol72) {
                        this.scanState = 1;
                    }
                    this.stopScanningRecord = true;
                }
            }
        }
        else if (this.currentColumnNo == 72) {
            if (!this.currentChar.equals(" ")) {}
            this.stopScanningRecord = true;
        }
        else {
            this.scanState = 1;
            this.stopScanningRecord = true;
        }
    }
    
    private void processScanStateLookingForRemarksWithComma(final String A_p_line, final String wholeLine) {
        if (this.currentColumnNo < 72 && this.currentChar.equals(" ")) {
            return;
        }
        if (this.currentColumnNo == 72) {
            if (!this.currentChar.equals(" ")) {}
        }
        else if (!this.currentChar.equals(" ")) {
            this.collectRemarks(wholeLine, A_p_line);
        }
        this.scanState = 2;
        if (this.operandIsContinued != 2) {
            this.operandIsContinued = 1;
        }
        this.stopScanningRecord = true;
    }
    
    private void processScanStateScanningExec(final String wholeLine) {
        if (this.currentColumnNo == 72) {
            this.stopScanningRecord = true;
        }
        else if (this.skipCicsCommand) {
            if (!checkIfContinuationLine(wholeLine)) {
                this.skipCicsCommand = false;
                this.scanState = 1;
                this.stopScanningRecord = true;
            }
        }
        else if (this.currentChar.equals(" ") && this.operands.equals("CICS")) {
            this.skipCicsCommand = true;
        }
        this.operands += this.currentChar;
    }
    
    private void processScanStateScanningName() {
        if (this.currentChar.equals(" ") || this.name.length() == 63) {
            this.operandIsContinued = 0;
            this.scanState = 3;
        }
        else {
            this.name += this.currentChar.toUpperCase();
        }
    }
    
    private void processScanStateScanningOperand(final String wholeLine) {
        if (this.operands.length() >= 8192) {
            this.stopScanningRecord = true;
        }
        else if (this.currentChar.equals(" ")) {
            if (this.operandIsContinued == 0) {
                if (this.previousChar.equals(",")) {
                    this.scanState = 5;
                }
                else if (this.hasAlternativeStatementFormat()) {
                    this.scanState = 4;
                }
                else if (checkIfContinuationLine(wholeLine)) {
                    this.operandIsContinued = 2;
                    this.operands += ",";
                    this.scanState = 5;
                }
                else {
                    this.scanState = 4;
                }
            }
        }
        else if (this.currentColumnNo == 72) {
            if (!this.currentChar.equals(" ")) {
                this.operandIsContinued = 1;
            }
            this.stopScanningRecord = true;
        }
        else {
            this.prevOperands = this.operands;
            this.operands += this.currentChar.toUpperCase();
            if (this.currentColumnNo == 71) {
                if (!this.nextChar.equals(" ")) {
                    this.operandIsContinued = 1;
                }
                this.stopScanningRecord = true;
            }
            else if (this.currentChar.equals("'") && !this.prevOperands.endsWith("K") && !this.prevOperands.endsWith("L") && !this.prevOperands.endsWith("N")) {
                if (!this.prevOperands.endsWith("T")) {
                    this.literalContinued = false;
                    this.scanState = 11;
                }
            }
        }
    }
    
    private void processScanStateScanningOperandWithSpaces() {
        if (this.operands.length() >= 8192) {
            this.stopScanningRecord = true;
            return;
        }
        this.prevOperands = this.operands;
        this.operands += this.currentChar.toUpperCase();
        if (this.currentColumnNo == 71) {
            if (!this.nextChar.equals(" ")) {
                this.operandIsContinued = 1;
            }
            if (this.parenCount != 0) {
                this.allowSpacesOnContinuedLine = true;
            }
            this.stopScanningRecord = true;
            return;
        }
        if (this.currentChar.equals("'")) {
            if (this.prevOperands.endsWith("K") || this.prevOperands.endsWith("L") || this.prevOperands.endsWith("N") || this.prevOperands.endsWith("T")) {
                if (this.nextChar.equals("&")) {
                    return;
                }
                if (this.previousPreviousChar.equals("+")) {
                    return;
                }
            }
            this.scanState = 11;
        }
        else if (this.currentChar.equals("(")) {
            ++this.parenCount;
        }
        else if (this.currentChar.equals(")")) {
            --this.parenCount;
            if (this.parenCount == 0) {
                this.allowSpacesOnContinuedLine = false;
                this.scanState = 8;
            }
        }
    }
    
    private void processScanStateScanningOperation() {
        if (this.currentChar.equals(" ") || this.operation.length() >= 63) {
            this.operandIsContinued = 0;
            this.clearRemarks();
            if (this.operation.equals("ANOP") || this.operation.equals("CSECT")) {
                this.scanState = 4;
            }
            else if (this.operation.equals("EXEC")) {
                this.scanState = 6;
            }
            else {
                this.scanState = 2;
            }
        }
        else if (this.currentChar.equals(",")) {
            this.operandIsContinued = 0;
            this.clearRemarks();
            this.scanState = 4;
        }
        else {
            this.operation += this.currentChar.toUpperCase();
        }
    }
    
    private void processScanStateScanningQuotedString() {
        if (this.operands.length() >= 8192) {
            this.stopScanningRecord = true;
        }
        else if (this.currentColumnNo == 72) {
            if (!this.currentChar.equals(" ")) {
                this.literalContinued = true;
                this.operandIsContinued = 1;
            }
            this.stopScanningRecord = true;
        }
        else {
            this.operands += this.currentChar;
            if (this.currentChar.equals("'")) {
                if (this.operation.equals("AIF") || this.operation.equals("SETB") || this.allowSpacesOnContinuedLine) {
                    this.scanState = 9;
                }
                else {
                    this.scanState = 8;
                }
            }
        }
    }
    
    private void setup() {
        this.allowSpacesOnContinuedLine = false;
        this.literalContinued = false;
        this.name = "";
        this.nameColumnNo = 0;
        this.nameFileLineNo = 0;
        this.nameSourceLineNo = 0;
        this.operandIsContinued = 0;
        this.operands = "";
        this.operation = "";
        this.operationColumnNo = 0;
        this.operationFileLineNo = 0;
        this.operationIsMacro = false;
        this.operationSourceLineNo = 0;
        this.previousChar = "";
        this.previousPreviousChar = "";
        this.prevOperands = "";
        this.realOperation = "";
        this.clearRemarks();
    }
    
    public int validateNames() {
        final int validOperation = this.checkOperation();
        if (validOperation == 12) {
            return this.checkName();
        }
        if (validOperation == 11) {
            return 11;
        }
        if (validOperation == 10) {
            final int validName = this.checkName();
            if (validName == 1) {
                return 1;
            }
            if (validName == 2) {
                return 3;
            }
            return 7;
        }
        else {
            final int validName = this.checkName();
            if (this.isAsmDirective() || this.isAsmOpcode()) {
                if (validName == 1) {
                    return 1;
                }
                if (validName == 2) {
                    return 5;
                }
                return 9;
            }
            else {
                if (validName == 2) {
                    return 4;
                }
                if (validName == 1) {
                    return 14;
                }
                return 8;
            }
        }
    }
    
    public void removeTrailingOperandComma() {
        if (this.operands.endsWith(",")) {
            this.operands = this.operands.substring(0, this.operands.length() - 1);
        }
    }
}
