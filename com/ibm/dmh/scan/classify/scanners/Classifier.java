// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.util.StringUtils;
import com.ibm.dmh.scan.classify.ClassifierReservedWord;
import com.ibm.dmh.util.Environment;
import com.ibm.dmh.scan.classify.ScanProperties;
import com.ibm.dmh.scan.classify.ClassifierMetaData;

public class Classifier
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2009, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    protected static final int COMMENT_SCORE_POINTS = 5;
    protected static final int TOKEN_WEIGHT_KEYWORD = 0;
    protected static final int TOKEN_WEIGHT_SYMBOL = 1;
    protected static final int TOKEN_WEIGHT_FREQUENT = 2;
    protected static final int TOKEN_WEIGHT_RARE = 3;
    protected static final int TOKEN_WEIGHT_NON_ENGLISH = 4;
    protected static final int TOKEN_WEIGHT_LANGUAGE_WORD = 5;
    private static final int TOKEN_WEIGHT_KEYWORD_VALUE = 0;
    private static final int TOKEN_WEIGHT_SYMBOL_VALUE = 0;
    public static final int TOKEN_WEIGHT_FREQUENT_VALUE = 1;
    public static final int TOKEN_WEIGHT_RARE_VALUE = 10;
    public static final int TOKEN_WEIGHT_NON_ENGLISH_VALUE = 25;
    public static final int TOKEN_WEIGHT_LANGUAGE_WORD_VALUE = 60;
    protected static final String KEYWORD_ALTER = "ALTER";
    protected static final String KEYWORD_AND = "AND";
    protected static final String KEYWORD_CICS = "CICS";
    protected static final String KEYWORD_CORR = "CORR";
    protected static final String KEYWORD_CORRESPONDING = "CORRESPONDING";
    protected static final String KEYWORD_COMMENT = "COMMENT";
    protected static final String KEYWORD_CREATE = "CREATE";
    protected static final String KEYWORD_DECLARE = "DECLARE";
    protected static final String KEYWORD_DELETE = "DELETE";
    protected static final String KEYWORD_DFHCOMMAREA = "DFHCOMMAREA";
    protected static final String KEYWORD_DFHEIBLK = "DFHEIBLK";
    protected static final String KEYWORD_DLI = "DLI";
    protected static final String KEYWORD_DROP = "DROP";
    protected static final String KEYWORD_END_EXEC = "END-EXEC";
    protected static final String KEYWORD_EXCHANGE = "EXCHANGE";
    protected static final String KEYWORD_EXEC = "EXEC";
    protected static final String KEYWORD_FOR = "FOR";
    protected static final String KEYWORD_FROM = "FROM";
    protected static final String KEYWORD_GRANT = "GRANT";
    protected static final String KEYWORD_GROUP = "GROUP";
    protected static final String KEYWORD_HANDLE = "HANDLE";
    protected static final String KEYWORD_HAVING = "HAVING";
    protected static final String KEYWORD_HYPHEN_INC = "-INC";
    protected static final String KEYWORD_IDMS = "IDMS";
    protected static final String KEYWORD_IN = "IN";
    protected static final String KEYWORD_INSERT = "INSERT";
    protected static final String KEYWORD_INTO = "INTO";
    protected static final String KEYWORD_INCLUDE = "INCLUDE";
    protected static final String KEYWORD_LIKE = "LIKE";
    protected static final String KEYWORD_LINK = "LINK";
    protected static final String KEYWORD_LOCK = "LOCK";
    protected static final String KEYWORD_MAP = "MAP";
    protected static final String KEYWORD_MAPSET = "MAPSET";
    protected static final String KEYWORD_MERGE = "MERGE";
    protected static final String KEYWORD_MOVE = "MOVE";
    protected static final String KEYWORD_OF = "OF";
    protected static final String KEYWORD_ON = "ON";
    protected static final String KEYWORD_PLUS_PLUS_INCLUDE = "++INCLUDE";
    protected static final String KEYWORD_PROGRAM = "PROGRAM";
    protected static final String KEYWORD_RECEIVE = "RECEIVE";
    protected static final String KEYWORD_REFRESH = "REFRESH";
    protected static final String KEYWORD_RENAME = "RENAME";
    protected static final String KEYWORD_REPLACING = "REPLACING";
    protected static final String KEYWORD_SELECT = "SELECT";
    protected static final String KEYWORD_SEND = "SEND";
    protected static final String KEYWORD_SKIP = "SKIP";
    protected static final String KEYWORD_SQL = "SQL";
    protected static final String KEYWORD_STORES = "STORES";
    protected static final String KEYWORD_TABLE = "TABLE";
    protected static final String KEYWORD_TO = "TO";
    protected static final String KEYWORD_TRUNCATE = "TRUNCATE";
    protected static final String KEYWORD_UPDATE = "UPDATE";
    protected static final String KEYWORD_VIEW = "VIEW";
    protected static final String KEYWORD_WHERE = "WHERE";
    protected static final String KEYWORD_XCTL = "XCTL";
    private static final String TOKEN_TYPE_DELIMITER = "Delimit";
    private static final String TOKEN_TYPE_IGNORE = "Ignore";
    private static final String TOKEN_TYPE_KEYWORD = "";
    protected static final String TOKEN_TYPE_RESERVED_WORD = "ReservedWord";
    private static final String TOKEN_TYPE_SCOPE_DELIMITER = "ScopeDelimit";
    protected static final String TOKEN_TYPE_VERB = "Verb";
    protected boolean isWindows;
    protected char identifierMode;
    protected ClassifierMetaData metaData;
    protected int blankLineCount;
    protected int debug;
    protected int languageWordCount;
    protected int reserveWordCount;
    protected int score;
    protected ScanProperties scanProperties;
    
    protected Classifier(final ScanProperties scanProperties) {
        this.scanProperties = scanProperties;
        this.blankLineCount = 0;
        this.debug = 0;
        this.identifierMode = 'U';
        this.isWindows = Environment.isWindows();
        this.languageWordCount = 0;
        this.metaData = null;
        this.reserveWordCount = 0;
        this.score = 0;
    }
    
    public ClassifierMetaData getMetaData() {
        return this.metaData;
    }
    
    public String getLanguageCd() {
        return "UNKN";
    }
    
    public void setDebug(final int iSetting) {
        this.debug = iSetting;
    }
    
    protected ClassifierReservedWord allocateReserveWord(final String key, final String value) {
        final String[] tokens = StringUtils.split(value, ',');
        final String tokenType = tokens[0];
        final int tokenWeight = Integer.parseInt(tokens[1]);
        final int tokenAttrTypeId = Integer.parseInt(tokens[2]);
        final ClassifierReservedWord reservedWord = new ClassifierReservedWord(key, tokenAttrTypeId, tokenType, tokenWeight);
        switch (tokenWeight) {
            case 0: {
                reservedWord.setTokenWeight(0);
                break;
            }
            case 1: {
                reservedWord.setTokenWeight(0);
                break;
            }
            case 2: {
                reservedWord.setTokenWeight(1);
                break;
            }
            case 3: {
                reservedWord.setTokenWeight(10);
                break;
            }
            case 4: {
                reservedWord.setTokenWeight(25);
                break;
            }
            case 5: {
                reservedWord.setTokenWeight(60);
                break;
            }
            default: {
                return null;
            }
        }
        if (tokenType.equals("")) {
            reservedWord.setTokenWordType(0);
        }
        else if (tokenType.equals("ReservedWord")) {
            reservedWord.setTokenWordType(1);
        }
        else if (tokenType.equals("Delimit")) {
            reservedWord.setTokenWordType(2);
        }
        else if (tokenType.equals("Verb")) {
            reservedWord.setTokenWordType(3);
        }
        else if (tokenType.equals("ScopeDelimit")) {
            reservedWord.setTokenWordType(4);
        }
        else {
            if (!tokenType.equals("Ignore")) {
                return null;
            }
            reservedWord.setTokenWordType(5);
        }
        return reservedWord;
    }
    
    public int getBlankLineCount() {
        return this.metaData.getAttnListValue(29);
    }
    
    public int getCommentCount() {
        return this.metaData.getAttnListValue(27);
    }
    
    public char getIdentifierMode() {
        return this.identifierMode;
    }
    
    public boolean getIgnoreCase() {
        return true;
    }
    
    public int getReserveWordCount() {
        return this.reserveWordCount;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public boolean hasBMSmacro() {
        return false;
    }
    
    public boolean hasDBDGENstatement() {
        return false;
    }
    
    public boolean hasMACRO_MEND() {
        return false;
    }
    
    public boolean hasPSBGENstatement() {
        return false;
    }
    
    protected void increaseScore(final int increaseAmount) {
        this.score += increaseAmount;
    }
    
    public ClassifierMetaData processEndOfFile(final int iLineCount) {
        return null;
    }
    
    public void processCommonInitialization() {
        this.blankLineCount = 0;
        this.identifierMode = 'U';
        this.languageWordCount = 0;
        this.reserveWordCount = 0;
        this.score = 0;
    }
    
    public void processInitialization() {
    }
    
    public void processOneRecord(final int recordCount, final String literalRecord, final String record, final String languageHint) {
    }
    
    public void processDeallocate() {
        this.metaData = null;
    }
    
    protected void rejectThisLanguageCd() {
        this.identifierMode = 'R';
        this.score = 0;
        this.processDeallocate();
    }
    
    public void setIdentifierMode(final char iSetting) {
        this.identifierMode = iSetting;
    }
    
    public void setScore(final int setting) {
        this.score = setting;
    }
}
