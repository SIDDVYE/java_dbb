// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierByRecordCobPliPlx extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2014, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected String assignmentSymbolFrom;
    
    protected ClassifierByRecordCobPliPlx(final ScanProperties scanProperties) {
        super(scanProperties);
        this.assignmentSymbolFrom = null;
    }
    
    protected boolean capturePlusPlusIncludeName(final String record, final boolean truncateFilenames) {
        if (!record.startsWith("++INCLUDE ")) {
            return false;
        }
        String includedText = record.substring(9);
        includedText = includedText.trim();
        if (includedText.length() == 0) {
            return false;
        }
        final String[] tokens = StringUtils.split(includedText, " ");
        final String memberName = tokens[0];
        if (memberName.length() == 0) {
            return false;
        }
        final String[] multiPartName = StringUtils.split(memberName, ".");
        String includedName = multiPartName[0];
        if (truncateFilenames && includedName.length() > 8) {
            includedName = includedName.substring(0, 8);
        }
        this.metaData.captureInclude(5, includedName);
        return true;
    }
    
    protected boolean checkAlternateFormsOfCopy(final String inputRecord) {
        return this.checkHyphenInclude(inputRecord) || this.checkPlusPlusInclude(inputRecord);
    }
    
    private boolean checkHyphenInclude(final String inputRecord) {
        return inputRecord.length() >= 5 && inputRecord.startsWith("-INC ") && this.captureIncMemberName(inputRecord);
    }
    
    protected boolean captureIncMemberName(final String inputRecord) {
        final String record = inputRecord.substring(4);
        final String recordTrimmed = record.trim();
        if (recordTrimmed.length() == 0) {
            return false;
        }
        final String[] token = StringUtils.split(recordTrimmed);
        String memberName = token[0];
        if (memberName.contains(".")) {
            final String[] subToken = StringUtils.split(memberName, ".");
            memberName = subToken[0];
        }
        else if (memberName.contains(";")) {
            final String[] subToken = StringUtils.split(memberName, ";");
            memberName = subToken[0];
        }
        this.metaData.captureInclude(6, memberName);
        return true;
    }
    
    protected boolean checkPlusPlusInclude(final String inputRecord) {
        return false;
    }
    
    protected void processState_exec() {
        if (this.execStatementText != null) {
            this.metaData.addExecStatement(this.execStatementText.toString());
        }
        this.execStatementText = new StringBuffer("EXEC");
        if (this.currentToken.equalsIgnoreCase("CICS")) {
            this.EXEC_CICS_flag = true;
            this.metaData.incrementNumValue(30);
            this.syntaxState = 8;
        }
        else if (this.currentToken.equalsIgnoreCase("DLI")) {
            this.metaData.incrementNumValue(31);
            this.syntaxState = 16;
        }
        else if (this.currentToken.equalsIgnoreCase("IDMS")) {
            this.metaData.incrementNumValue(32);
            this.syntaxState = 16;
        }
        else if (this.currentToken.equalsIgnoreCase("SQL")) {
            this.EXEC_SQL_flag = true;
            this.metaData.incrementNumValue(33);
            this.captureExecStatementText();
            this.syntaxState = 10;
        }
    }
}
