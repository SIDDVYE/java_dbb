// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.reservedWords.ReservedWordsZBND;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierZBND extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2014, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final int OPERANDS_LENGTH = 8192;
    private static final int OPERATION_LENGTH = 63;
    private static final int SCAN_STATE_Initial = 1;
    private static final int SCAN_STATE_LookingForOperation = 2;
    private static final int SCAN_STATE_ScanningOperation = 3;
    private static final int SCAN_STATE_LookingForOperands = 4;
    private static final int SCAN_STATE_ScanningOperands = 5;
    private static final int SCAN_STATE_ScanningQuotedString = 6;
    private static final int SCAN_STATE_QuoteFoundInString = 7;
    private static final int SCAN_STATE_OperandsComplete = 8;
    private static final String standardCharSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@$#_0123456789+-,=.*()'/& ";
    private boolean continuationLine;
    private boolean literalContinued;
    private boolean processingComment;
    private int scanState;
    private String operands;
    private String operandsContinued;
    private String operation;
    
    public ClassifierZBND(final ScanProperties scanProperties) {
        super(scanProperties);
        this.initializeInstanceVariables();
    }
    
    private int calculateSLOC(final int lineCount) {
        return lineCount - this.blankLineCount - this.getCommentCount();
    }
    
    private boolean checkFirstColumn(final String inputRecord) {
        if (inputRecord.charAt(0) == '*') {
            this.processingComment = true;
            this.increaseScore(5);
            this.metaData.incrementCommentLines();
            this.continuationLine = checkIfContinuationLine(inputRecord);
            return true;
        }
        if (this.processingComment && this.continuationLine) {
            this.continuationLine = checkIfContinuationLine(inputRecord);
            return true;
        }
        this.processingComment = false;
        if (inputRecord.charAt(0) != ' ') {
            this.rejectThisLanguageCd();
            return true;
        }
        return false;
    }
    
    private static boolean checkIfContinuationLine(final String inputRecord) {
        return inputRecord.length() >= 72 && inputRecord.charAt(71) != ' ';
    }
    
    private boolean checkStandardCharacterSet(final char currentChar) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@$#_0123456789+-,=.*()'/& ".indexOf(currentChar) != -1;
    }
    
    private void clearTokenFields() {
        this.operands = "";
        this.operandsContinued = "";
        this.operation = "";
    }
    
    private void completeAStatement() {
        if (ReservedWordsZBND.contains(this.operation.toUpperCase())) {
            this.increaseScore(100);
        }
        else {
            this.rejectThisLanguageCd();
        }
    }
    
    @Override
    public String getLanguageCd() {
        return "ZBND";
    }
    
    @Override
    public String getLanguageDescription() {
        return "zOS Binder control statements";
    }
    
    @Override
    public int getLanguageId() {
        return 24;
    }
    
    private boolean getOperationOperands(final String inputRecord) {
        boolean invalidChar = false;
        boolean stopScanningRecord = false;
        this.columnCurrentRecord = 1;
        this.ircaIndex = 0;
        final char[] inputRecordCharArray = inputRecord.toCharArray();
        while (this.ircaIndex < inputRecordCharArray.length) {
            final char currentChar = inputRecordCharArray[this.ircaIndex];
            switch (this.scanState) {
                case 1: {
                    if (currentChar == ' ') {
                        this.scanState = 2;
                        break;
                    }
                    invalidChar = true;
                    break;
                }
                case 2: {
                    if (this.columnCurrentRecord == 72) {
                        stopScanningRecord = true;
                        break;
                    }
                    if (currentChar == ' ') {
                        break;
                    }
                    if (this.checkStandardCharacterSet(currentChar)) {
                        this.operation += currentChar;
                        this.scanState = 3;
                        break;
                    }
                    invalidChar = true;
                    break;
                }
                case 3: {
                    if (currentChar == ' ' || this.operation.length() >= 63) {
                        this.scanState = 4;
                        break;
                    }
                    if (this.checkStandardCharacterSet(currentChar)) {
                        this.operation += currentChar;
                        break;
                    }
                    invalidChar = true;
                    break;
                }
                case 4: {
                    if (this.columnCurrentRecord == 72) {
                        stopScanningRecord = true;
                        break;
                    }
                    if (currentChar == ' ') {
                        break;
                    }
                    if (this.operandsContinued.length() != 0) {
                        this.operandsContinued += currentChar;
                    }
                    else {
                        this.operands += currentChar;
                    }
                    if (currentChar == '\'' || this.literalContinued) {
                        this.scanState = 6;
                        break;
                    }
                    this.scanState = 5;
                    break;
                }
                case 5: {
                    if (this.operands.length() >= 8192) {
                        stopScanningRecord = true;
                        break;
                    }
                    if (currentChar == ' ') {
                        this.scanState = 8;
                        stopScanningRecord = true;
                        break;
                    }
                    final String prevOperand = this.operands;
                    this.operands += currentChar;
                    if (this.columnCurrentRecord == 71) {
                        stopScanningRecord = true;
                    }
                    else if (currentChar == '\'' && !prevOperand.endsWith("L")) {
                        this.scanState = 6;
                    }
                    break;
                }
                case 6: {
                    this.literalContinued = false;
                    if (this.operands.length() >= 8192) {
                        stopScanningRecord = true;
                        break;
                    }
                    if (this.columnCurrentRecord == 72) {
                        this.literalContinued = true;
                        stopScanningRecord = true;
                        break;
                    }
                    this.operands += currentChar;
                    if (currentChar == '\'') {
                        this.scanState = 7;
                        break;
                    }
                    break;
                }
                case 7: {
                    if (currentChar == ' ' || this.operands.length() >= 8192) {
                        this.scanState = 8;
                        stopScanningRecord = true;
                        break;
                    }
                    this.operands += currentChar;
                    if (currentChar == '\'') {
                        this.scanState = 6;
                        break;
                    }
                    this.scanState = 5;
                    break;
                }
                case 8: {
                    stopScanningRecord = true;
                    break;
                }
            }
            if (invalidChar) {
                break;
            }
            if (stopScanningRecord) {
                break;
            }
            this.moveToNextCharOnRecord();
        }
        return !invalidChar;
    }
    
    private void initializeInstanceVariables() {
        this.continuationLine = false;
        this.literalContinued = false;
        this.processingComment = false;
        this.scanState = 1;
        this.clearTokenFields();
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        if (lineCount == this.getCommentCount()) {
            this.score = 0;
        }
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
        this.initializeInstanceVariables();
        this.identifierMode = 'U';
        this.metaData = new ClassifierMetaData();
    }
    
    @Override
    public void processOneRecord(final int recordCount, final String literalRecord, final String inputRecord, final String languageHint) {
        if (this.checkFirstColumn(inputRecord)) {
            return;
        }
        if (this.continuationLine) {
            this.continuationLine = checkIfContinuationLine(inputRecord);
            if (this.scanState != 8) {
                this.scanState = 4;
            }
        }
        else {
            this.continuationLine = checkIfContinuationLine(inputRecord);
            this.clearTokenFields();
            this.scanState = 1;
        }
        if (!this.getOperationOperands(inputRecord)) {
            return;
        }
        if (this.continuationLine) {
            return;
        }
        this.completeAStatement();
    }
}
