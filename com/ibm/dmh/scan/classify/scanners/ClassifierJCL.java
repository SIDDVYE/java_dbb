// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierJCL extends ClassifierByRecord
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2018\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    public static final int JCL_EXTENSION_CA7 = 1;
    public static final int JCL_EXTENSION_CONTROL_M = 2;
    public static final int SYMBOL_TEXT_MAX_LENGTH = 230;
    private boolean after_first_proc;
    private boolean first_proc;
    private boolean J_Continuation;
    private int commentCount_ControlM;
    private int continuedOperatorLines;
    private int linesWithJclExtension_CA7;
    private int linesWithJclExtension_ControlM;
    private int noncomment_aft_proc;
    private String Name;
    private String Operator;
    private String Parameter;
    
    public ClassifierJCL(final ScanProperties scanProperties) {
        super(scanProperties);
        this.init();
    }
    
    private int calculateSLOC(final int lineCount) {
        return lineCount - this.blankLineCount - this.getCommentCount();
    }
    
    @Override
    public String getLanguageCd() {
        return "JCL";
    }
    
    @Override
    public String getLanguageDescription() {
        return "JCL";
    }
    
    @Override
    public int getLanguageId() {
        return 14;
    }
    
    private void captureIncludeFromControlM(final String record, int index) {
        if (index == -1) {
            return;
        }
        final String subRecord = record.substring(index + 7).trim();
        index = subRecord.indexOf(" ");
        String memberName;
        if (index != -1) {
            memberName = subRecord.substring(0, index);
        }
        else {
            memberName = subRecord;
        }
        this.RecordIncludedSource(1, memberName);
    }
    
    private boolean checkStatementsForCA7(final String iRecord) {
        final String record = iRecord.trim();
        if (!record.startsWith("#")) {
            return false;
        }
        final int length = record.length();
        if (length < 3) {
            return false;
        }
        String token = record.substring(0, 3);
        if (token.equals("#JI") || token.equals("#JO") || token.equals("#XI") || token.equals("#XO")) {
            return true;
        }
        if (length < 4) {
            return false;
        }
        token = record.substring(0, 4);
        if (token.equals("#ARF") || token.equals("#HLD") || token.equals("#JCL") || token.equals("#MNT") || token.equals("#MSG") || token.equals("#NOX") || token.equals("#NTR") || token.equals("#RES") || token.equals("#SCC") || token.equals("#VER")) {
            return true;
        }
        if (length < 5) {
            return false;
        }
        token = record.substring(0, 5);
        return token.equals("#JEND") || token.equals("#XEND") || token.equals("#7UNI");
    }
    
    private boolean checkStatementsForControlM(final String iRecord) {
        final String record = iRecord.trim();
        if (record.startsWith("*")) {
            ++this.commentCount_ControlM;
            ++this.linesWithJclExtension_ControlM;
            this.score += 5;
            return true;
        }
        if (record.startsWith("%%")) {
            if (record.startsWith("%%ELSE") || record.startsWith("%%ENDIF") || record.startsWith("%%IF") || record.startsWith("%%GLOBAL") || record.startsWith("%%GOTO") || record.startsWith("%%LABEL") || record.startsWith("%%LISTVAR") || record.startsWith("%%LISTVARS") || record.startsWith("%%RESOLVE") || record.startsWith("%%SET")) {
                ++this.linesWithJclExtension_ControlM;
                this.score += 10;
            }
            else if (record.startsWith("%%INCLIB")) {
                ++this.linesWithJclExtension_ControlM;
                this.score += 10;
                final int i = record.indexOf("%INCMEM");
                this.captureIncludeFromControlM(record, i);
            }
            else if (record.startsWith("%%LIBSYM")) {
                ++this.linesWithJclExtension_ControlM;
                this.score += 10;
                final int i = record.indexOf("%MEMSYM");
                this.captureIncludeFromControlM(record, i);
            }
            else {
                ++this.linesWithJclExtension_ControlM;
                this.score += 5;
            }
            return true;
        }
        return false;
    }
    
    private void clearTokenFields() {
        this.continuedOperatorLines = 0;
        this.Name = "";
        this.Operator = "";
        this.Parameter = "";
    }
    
    private void CompleteJStatement(final int iLineCount) {
        if (this.Name.equals("JOBLIB") || this.Name.equals("STEPLIB")) {
            ++this.reserveWordCount;
            this.score += 50;
        }
        if (this.Operator.equals("CNTL") || this.Operator.equals("COMMAND") || this.Operator.equals("ELSE") || this.Operator.equals("ENDCNTL") || this.Operator.equals("ENDIF") || this.Operator.equals("IF") || this.Operator.equals("JCLLIB") || this.Operator.equals("OUTPUT") || this.Operator.equals("SET") || this.Operator.equals("XMIT")) {
            ++this.reserveWordCount;
        }
        else if (this.Operator.equals("COPY") || this.Operator.equals("INCLUDE")) {
            if (this.Parameter.contains("MEMBER=(")) {
                ++this.reserveWordCount;
                final String pChar = this.Parameter.substring(8);
                this.RecordIncludedSource(1, pChar);
            }
            else if (this.Parameter.contains("MEMBER=")) {
                ++this.reserveWordCount;
                final String pChar = this.Parameter.substring(7);
                this.RecordIncludedSource(1, pChar);
            }
        }
        else if (this.Operator.equals("DD")) {
            ++this.reserveWordCount;
            this.score += 500;
            if (this.identifierMode == 'U') {
                this.identifierMode = 'C';
            }
        }
        else if (this.Operator.equals("EXEC")) {
            ++this.reserveWordCount;
            this.score += 500;
            this.metaData.incrementNumValue(53);
            if (this.identifierMode == 'U') {
                this.identifierMode = 'C';
            }
            if (this.Parameter.length() != 0) {
                if (this.Parameter.contains("PGM=")) {
                    this.metaData.incrementNumValue(54);
                }
                else {
                    final int pSearchChar = this.Parameter.indexOf(",");
                    if (pSearchChar != -1) {
                        this.Parameter = this.Parameter.substring(0, pSearchChar);
                    }
                    if (this.Parameter.contains("PROC=")) {
                        final String pChar2 = this.Parameter.substring(5);
                        this.RecordIncludedSource(9, pChar2);
                    }
                    else {
                        this.RecordIncludedSource(9, this.Parameter);
                    }
                }
            }
        }
        else if (this.Operator.equals("JOB") || this.Operator.equals("JOB,")) {
            ++this.reserveWordCount;
            this.score += 500;
            this.metaData.incrementNumValue(52);
            if (this.identifierMode == 'U') {
                this.identifierMode = 'C';
            }
        }
        else if (this.Operator.equals("PROC")) {
            ++this.reserveWordCount;
            if (this.first_proc) {
                this.metaData.setNonCommentBefore1st(iLineCount - this.continuedOperatorLines - this.blankLineCount - this.getCommentCount() - 1);
                this.first_proc = false;
            }
        }
        else if (this.Operator.equals("PEND")) {
            ++this.reserveWordCount;
            this.after_first_proc = true;
        }
        if (this.Name.length() != 0) {
            this.metaData.addSymbolUserDefined(this.Name);
        }
        final int parmLength = this.Parameter.length();
        if (parmLength != 0) {
            if (parmLength > 230) {
                final String s = this.Parameter;
                final String parmFrag = s.substring(0, 229);
                this.Parameter = parmFrag;
            }
            this.metaData.addSymbolUserDefined(this.Parameter);
        }
    }
    
    private boolean containsCA7() {
        return this.linesWithJclExtension_CA7 != 0;
    }
    
    private boolean containsControlM() {
        return this.linesWithJclExtension_ControlM != 0;
    }
    
    @Override
    public boolean getIgnoreCase() {
        return true;
    }
    
    private void init() {
        this.after_first_proc = false;
        this.commentCount_ControlM = 0;
        this.first_proc = true;
        this.J_Continuation = false;
        this.linesWithJclExtension_CA7 = 0;
        this.linesWithJclExtension_ControlM = 0;
        this.noncomment_aft_proc = 0;
        this.clearTokenFields();
    }
    
    @Override
    public void isScoreBad(final int lineCount, final String languageHint) {
        if (this.reserveWordCount != 0) {
            return;
        }
        if (lineCount == this.commentCount_ControlM) {
            this.score = 0;
            return;
        }
        final int commentCount = this.getCommentCount();
        if (lineCount == commentCount) {
            return;
        }
        if (lineCount == commentCount + this.linesWithJclExtension_ControlM) {
            return;
        }
        this.score = 0;
    }
    
    @Override
    public ClassifierMetaData processEndOfFile(final int lineCount) {
        if (this.after_first_proc) {
            this.metaData.setNonAfter(this.noncomment_aft_proc);
        }
        if (this.containsCA7()) {
            this.metaData.setJclExtension(1);
        }
        else if (this.containsControlM()) {
            this.metaData.setJclExtension(2);
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
        if (this.checkStatementsForCA7(record)) {
            return;
        }
        if (this.checkStatementsForControlM(record)) {
            return;
        }
        if (this.identifierMode == 'U') {
            if (!record.startsWith("/")) {
                if (record.startsWith(" ")) {
                    final String tempChar = record.trim();
                    if (tempChar.length() == 0) {
                        return;
                    }
                }
                else if (!languageHint.equals("JCL")) {
                    this.rejectThisLanguageCd();
                    return;
                }
            }
        }
        if (!record.startsWith("/")) {
            return;
        }
        if (record.startsWith("/*")) {
            if (this.after_first_proc) {
                ++this.noncomment_aft_proc;
            }
            return;
        }
        if (!record.startsWith("//")) {
            return;
        }
        if (record.startsWith("//*")) {
            this.score += 5;
            this.metaData.incrementCommentLines();
            return;
        }
        this.score += 8;
        if (record.equals("//")) {
            return;
        }
        final String jclText = record.substring(2).trim();
        if (jclText.length() == 0) {
            return;
        }
        if (this.after_first_proc) {
            ++this.noncomment_aft_proc;
        }
        final String[] tokens = StringUtils.splitQuoted(jclText, ' ', false, false, true);
        if (this.J_Continuation) {
            ++this.continuedOperatorLines;
            if (tokens.length != 0) {
                this.Parameter += tokens[0];
            }
            this.J_Continuation = false;
        }
        else {
            this.clearTokenFields();
            if (record.startsWith("// ")) {
                if (tokens.length == 1) {
                    this.Operator = tokens[0];
                }
                else if (tokens.length > 1) {
                    this.Operator = tokens[0];
                    this.Parameter = tokens[1];
                }
            }
            else if (tokens.length == 1) {
                this.Name = tokens[0];
            }
            else if (tokens.length == 2) {
                this.Name = tokens[0];
                this.Operator = tokens[1];
            }
            else if (tokens.length > 2) {
                this.Name = tokens[0];
                this.Operator = tokens[1];
                this.Parameter = tokens[2];
            }
        }
        if (this.Parameter.endsWith(",")) {
            this.J_Continuation = true;
        }
        else {
            this.CompleteJStatement(recordCount);
            this.clearTokenFields();
        }
    }
    
    private void RecordIncludedSource(final int inclTypeId, final String inclName) {
        if (this.DMHU997(inclName)) {
            this.metaData.captureInclude(inclTypeId, inclName);
        }
    }
    
    private boolean DMHU997(final String iFileName) {
        int MEMBER_NAME_LENGTH;
        String validChars;
        String validFirstChar;
        if (this.isWindows) {
            MEMBER_NAME_LENGTH = 255;
            validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz$#@1234567890-._ ~";
            validFirstChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz$#@1234567890-._~";
        }
        else {
            MEMBER_NAME_LENGTH = 11;
            validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz$#@1234567890-";
            validFirstChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz$#@";
        }
        final int length = iFileName.length();
        if (length > MEMBER_NAME_LENGTH - 1) {
            return false;
        }
        if (length < 1) {
            return false;
        }
        boolean invalidCharFound = false;
        final char[] validCharArray = validChars.toCharArray();
        for (int i = 0; i < iFileName.length(); ++i) {
            boolean foundCharInArray = false;
            for (int j = 0; j < validCharArray.length; ++j) {
                if (iFileName.charAt(i) == validCharArray[j]) {
                    foundCharInArray = true;
                    break;
                }
            }
            if (!foundCharInArray) {
                invalidCharFound = true;
                break;
            }
        }
        if (invalidCharFound) {
            return false;
        }
        final String firstChar = iFileName.substring(0, 1);
        return validFirstChar.contains(firstChar);
    }
}
