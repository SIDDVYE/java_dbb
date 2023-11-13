// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify;

import com.ibm.dmh.util.StringUtils;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.List;

public class ClassifierMetaData
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2019\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    public static final int IDMS_CONTROL_SECTION = 25;
    public static final int RD_COMMENT_LINES = 27;
    public static final int RD_NONCOMMENT_LINES = 28;
    public static final int RD_BLANK_LINES = 29;
    public static final int RD_EXEC_CICS = 30;
    public static final int RD_EXEC_DLI = 31;
    public static final int RD_EXEC_IDMS = 32;
    public static final int RD_EXEC_SQL = 33;
    public static final int RD_IDENTIFICATION_DIVISION = 34;
    public static final int RD_ENVIRONMENT_DIVISION = 35;
    public static final int RD_DATA_DIVISION = 36;
    public static final int RD_PROC = 37;
    public static final int RD_CALL_CBLTDLI = 38;
    public static final int RD_NONCOMNT_BEF_1ST = 39;
    public static final int RD_NONCOMNT_AFT_1ST = 40;
    public static final int RD_CALL_PLITDLI = 41;
    public static final int RD_CALL_ASMTDLI = 42;
    public static final int RD_CALL_AIBTDLI = 43;
    public static final int RD_OPSYN = 44;
    public static final int RD_ICTL = 45;
    public static final int RD_CSECT = 46;
    public static final int RD_START = 47;
    public static final int RD_PSB = 48;
    public static final int RD_PCB = 49;
    public static final int RD_FCT = 50;
    public static final int RD_PCT = 51;
    public static final int RD_JOB_CARD = 52;
    public static final int RD_EXEC_STMT = 53;
    public static final int RD_EXEC_PGM_EQ = 54;
    public static final int RD_PPT = 55;
    public static final int RD_ENTRY = 57;
    public static final int DMH_RSECT = 58;
    public static final int DMH_CALL_AERTDLI = 59;
    public static final int DMH_FUNCTION = 60;
    public static final int RD_COPY_REPLACING = 64;
    public static final int RD_DFHMSD = 65;
    public static final int RD_DBD = 81;
    public static final int DMH_CEEENTRY = 82;
    public static final int RD_SPLIT_NODE = 83;
    public static final int DMH_CEEXAHD = 84;
    public static final int DMH_CEEXART = 85;
    public static final int DMH_CEEXAST = 86;
    public static final int ID_MFS = 87;
    public static final int DMH_RECORD_COUNT_MEM = 106;
    public static final int ID_JCL_EXTENSION = 160;
    public static final int DMH_DFHCSDUP_DEFINE = 810;
    public static final int RD_EXEC_MQ = 901;
    private boolean captureComments;
    private boolean captureEntryPoints;
    private boolean captureExecStatements;
    private boolean captureLiterals;
    private boolean capturePictures;
    private boolean captureSymbolsReserved;
    private boolean captureSymbolsUserDefined;
    private Boolean plxIsMain;
    private List<String> entryPoints;
    private Map<Integer, Integer> attnList;
    private Map<Integer, Map<String, Integer>> inclList;
    private Map<Integer, String> attcList;
    private Map<String, Integer> comments;
    private Map<String, Integer> execStatements;
    private Map<String, Integer> literals;
    private Map<String, Integer> pictures;
    private Map<String, Integer> procedureLabels;
    private Map<String, Integer> symbolsReserved;
    private Map<String, Integer> symbolsUserDefined;
    private Map<String, Integer> tableOrViewNames;
    private Map<String, Set<String>> controlTransfers;
    private Map<String, Set<String>> mapSetList;
    private Map<String, String> assignments;
    private String languageCd;
    private Long fileHash;
    
    public ClassifierMetaData() {
        this(false, false, false, false, false, false, false);
    }
    
    public ClassifierMetaData(final boolean captureComments, final boolean captureEntryPoints, final boolean captureExecStatements, final boolean captureLiterals, final boolean capturePictures, final boolean captureSymbolsReserved, final boolean captureSymbolsUserDefined) {
        this.captureComments = captureComments;
        this.captureEntryPoints = captureEntryPoints;
        this.captureExecStatements = captureExecStatements;
        this.captureLiterals = captureLiterals;
        this.capturePictures = capturePictures;
        this.captureSymbolsReserved = captureSymbolsReserved;
        this.captureSymbolsUserDefined = captureSymbolsUserDefined;
        this.assignments = null;
        this.attcList = null;
        this.attnList = null;
        this.comments = null;
        this.controlTransfers = null;
        this.entryPoints = null;
        this.execStatements = null;
        this.fileHash = null;
        this.inclList = null;
        this.languageCd = "UNKN";
        this.literals = null;
        this.mapSetList = null;
        this.pictures = null;
        this.plxIsMain = Boolean.FALSE;
        this.procedureLabels = null;
        this.symbolsReserved = null;
        this.symbolsUserDefined = null;
        this.tableOrViewNames = null;
        this.setBlanklines(0);
        this.setCommentLines(0);
        this.setNonCommentLines(0);
        this.setTotalLines(0);
    }
    
    public void addAssignment(final String source, final String destination) {
        if (!this.captureSymbolsUserDefined) {
            return;
        }
        if (this.assignments == null) {
            this.assignments = new HashMap<String, String>();
        }
        this.assignments.put(source, destination);
    }
    
    public void addComment(final String comment) {
        if (!this.captureComments) {
            return;
        }
        int count;
        if (this.comments == null) {
            this.comments = new TreeMap<String, Integer>();
            count = 0;
        }
        else {
            final Integer value = this.comments.get(comment);
            if (value == null) {
                count = 0;
            }
            else {
                count = value;
            }
        }
        ++count;
        this.comments.put(comment, new Integer(count));
    }
    
    public void addControlTransfer(final String type, final String name) {
        if (this.controlTransfers == null) {
            this.controlTransfers = new TreeMap<String, Set<String>>();
        }
        if (!this.controlTransfers.containsKey(type)) {
            final Set<String> names = new TreeSet<String>();
            this.controlTransfers.put(type, names);
        }
        final Set<String> names = this.controlTransfers.get(type);
        names.add(name);
        if (name.startsWith("MQ")) {
            this.incrementNumValue(901);
        }
    }
    
    public void addEntryPoint(String entryPoint) {
        if (!this.captureEntryPoints) {
            return;
        }
        if (this.entryPoints == null) {
            this.entryPoints = new LinkedList<String>();
        }
        if (entryPoint.startsWith("'")) {
            entryPoint = StringUtils.strip(entryPoint, "'");
        }
        else if (entryPoint.startsWith("\"")) {
            entryPoint = StringUtils.strip(entryPoint, "\"");
        }
        this.entryPoints.add(entryPoint);
    }
    
    public void addExecStatement(final String execStatement) {
        if (!this.captureExecStatements) {
            return;
        }
        int count;
        if (this.execStatements == null) {
            this.execStatements = new TreeMap<String, Integer>();
            count = 0;
        }
        else {
            final Integer value = this.execStatements.get(execStatement);
            if (value == null) {
                count = 0;
            }
            else {
                count = value;
            }
        }
        ++count;
        this.execStatements.put(execStatement, new Integer(count));
    }
    
    private void addInclude(final Integer inclTypeId, final String inclName) {
        if (this.inclList == null) {
            this.inclList = new TreeMap<Integer, Map<String, Integer>>();
        }
        Map<String, Integer> inclNameMap = this.inclList.get(inclTypeId);
        if (inclNameMap == null) {
            inclNameMap = new TreeMap<String, Integer>();
            this.inclList.put(inclTypeId, inclNameMap);
        }
        final Integer inclCount = inclNameMap.get(inclName);
        int count;
        if (inclCount == null) {
            count = 1;
        }
        else {
            count = inclCount;
            ++count;
        }
        inclNameMap.put(inclName, new Integer(count));
    }
    
    public void addLiteral(final String literal) {
        if (!this.captureLiterals) {
            return;
        }
        int count;
        if (this.literals == null) {
            this.literals = new TreeMap<String, Integer>();
            count = 0;
        }
        else {
            final Integer value = this.literals.get(literal);
            if (value == null) {
                count = 0;
            }
            else {
                count = value;
            }
        }
        ++count;
        this.literals.put(literal, new Integer(count));
    }
    
    public void addMap(final String mapSetName, final String mapName) {
        if (this.mapSetList == null) {
            this.mapSetList = new TreeMap<String, Set<String>>();
        }
        if (!this.mapSetList.containsKey(mapSetName)) {
            final Set<String> mapNames = new TreeSet<String>();
            this.mapSetList.put(mapSetName, mapNames);
        }
        final Set<String> mapNames = this.mapSetList.get(mapSetName);
        mapNames.add(mapName);
    }
    
    public void addNumValue(final Integer attrTypeId, final int attrNumValue) {
        if (this.attnList == null) {
            this.attnList = new TreeMap<Integer, Integer>();
        }
        this.attnList.put(attrTypeId, new Integer(attrNumValue));
    }
    
    public void addOptions(final Integer attrTypeId, final String attrCharValue) {
        if (this.attcList == null) {
            this.attcList = new TreeMap<Integer, String>();
        }
        this.attcList.put(attrTypeId, attrCharValue);
    }
    
    public void addPicture(final String picture) {
        if (!this.capturePictures) {
            return;
        }
        int count;
        if (this.pictures == null) {
            this.pictures = new TreeMap<String, Integer>();
            count = 0;
        }
        else {
            final Integer value = this.pictures.get(picture);
            if (value == null) {
                count = 0;
            }
            else {
                count = value;
            }
        }
        ++count;
        this.pictures.put(picture, new Integer(count));
    }
    
    public void addProcedureLabel(final String procedureLabel) {
        if (!this.captureSymbolsUserDefined) {
            return;
        }
        int count;
        if (this.procedureLabels == null) {
            this.procedureLabels = new TreeMap<String, Integer>();
            count = 0;
        }
        else {
            final Integer value = this.procedureLabels.get(procedureLabel);
            if (value == null) {
                count = 0;
            }
            else {
                count = value;
            }
        }
        ++count;
        this.procedureLabels.put(procedureLabel, new Integer(count));
    }
    
    public void addSymbolReserved(final String symbol) {
        if (!this.captureSymbolsReserved) {
            return;
        }
        int count;
        if (this.symbolsReserved == null) {
            this.symbolsReserved = new TreeMap<String, Integer>();
            count = 0;
        }
        else {
            final Integer value = this.symbolsReserved.get(symbol);
            if (value == null) {
                count = 0;
            }
            else {
                count = value;
            }
        }
        ++count;
        this.symbolsReserved.put(symbol, new Integer(count));
    }
    
    public void addSymbolUserDefined(final String symbol) {
        if (!this.captureSymbolsUserDefined) {
            return;
        }
        int count;
        if (this.symbolsUserDefined == null) {
            this.symbolsUserDefined = new TreeMap<String, Integer>();
            count = 0;
        }
        else {
            final Integer value = this.symbolsUserDefined.get(symbol);
            if (value == null) {
                count = 0;
            }
            else {
                count = value;
            }
        }
        ++count;
        this.symbolsUserDefined.put(symbol, new Integer(count));
    }
    
    public void captureInclude(final int inclTypeId, String inclName) {
        if (inclName.startsWith("'")) {
            this.addLiteral(inclName);
            inclName = StringUtils.strip(inclName, "'");
        }
        else if (inclName.startsWith("\"")) {
            this.addLiteral(inclName);
            inclName = StringUtils.strip(inclName, "\"");
        }
        else {
            this.addSymbolUserDefined(inclName);
        }
        this.addInclude(new Integer(inclTypeId), inclName);
    }
    
    public void captureInclude(String inclName, String ddName, final int debug) {
        if (inclName.startsWith("'")) {
            this.addLiteral(inclName);
            inclName = StringUtils.strip(inclName, "'");
        }
        else if (inclName.startsWith("\"")) {
            this.addLiteral(inclName);
            inclName = StringUtils.strip(inclName, "\"");
        }
        else {
            this.addSymbolUserDefined(inclName);
        }
        if (ddName.startsWith("'")) {
            this.addLiteral(ddName);
            ddName = StringUtils.strip(ddName, "'");
        }
        else if (ddName.startsWith("\"")) {
            this.addLiteral(ddName);
            ddName = StringUtils.strip(ddName, "\"");
        }
        else {
            this.addSymbolUserDefined(ddName);
        }
        if (debug != 0) {
            System.out.println("include DD found : ddName=" + ddName + " inclName=" + inclName);
        }
        this.addInclude(new Integer(4), inclName + " DD=" + ddName);
    }
    
    public void addTableOrViewName(final String tableOrViewName) {
        if (!this.captureSymbolsUserDefined) {
            return;
        }
        int count;
        if (this.tableOrViewNames == null) {
            this.tableOrViewNames = new TreeMap<String, Integer>();
            count = 0;
        }
        else {
            final Integer value = this.tableOrViewNames.get(tableOrViewName);
            if (value == null) {
                count = 0;
            }
            else {
                count = value;
            }
        }
        ++count;
        this.tableOrViewNames.put(tableOrViewName, new Integer(count));
    }
    
    public void clearInclList() {
        if (this.inclList != null) {
            this.inclList.clear();
        }
    }
    
    public Map<String, String> getAssignments() {
        return this.assignments;
    }
    
    public Map<Integer, String> getAttcList() {
        return this.attcList;
    }
    
    public Map<Integer, Integer> getAttnList() {
        return this.attnList;
    }
    
    public int getAttnListValue(final int attrTypeId) {
        if (this.attnList == null || !this.attnList.containsKey(attrTypeId)) {
            return 0;
        }
        return this.attnList.get(attrTypeId);
    }
    
    public Map<String, Integer> getComments() {
        return this.comments;
    }
    
    public Map<String, Set<String>> getControlTransfers() {
        return this.controlTransfers;
    }
    
    public List<String> getEntryPoints() {
        return this.entryPoints;
    }
    
    public Map<String, Integer> getExecStatements() {
        return this.execStatements;
    }
    
    public boolean hasFileHash() {
        return this.fileHash != null;
    }
    
    public long getFileHash() {
        return this.fileHash;
    }
    
    public Map<Integer, Map<String, Integer>> getInclList() {
        return this.inclList;
    }
    
    public String getLanguageCd() {
        return this.languageCd;
    }
    
    public Map<String, Integer> getLiterals() {
        return this.literals;
    }
    
    public Map<String, Set<String>> getMapSetList() {
        return this.mapSetList;
    }
    
    public Map<String, Integer> getPictures() {
        return this.pictures;
    }
    
    public Boolean getPlxIsMain() {
        return this.plxIsMain;
    }
    
    public void setPlxIsMain() {
        this.plxIsMain = Boolean.TRUE;
    }
    
    public Map<String, Integer> getProcedureLabels() {
        return this.procedureLabels;
    }
    
    public Map<String, Integer> getSymbolsReserved() {
        return this.symbolsReserved;
    }
    
    public Map<String, Integer> getSymbolsUserDefined() {
        return this.symbolsUserDefined;
    }
    
    public Map<String, Integer> getTableOrViewNames() {
        return this.tableOrViewNames;
    }
    
    public void incrementCommentLines() {
        this.incrementNumValue(27);
    }
    
    public void setAttnListKey(final Integer attrTypeId) {
        if (this.attnList == null) {
            this.attnList = new TreeMap<Integer, Integer>();
        }
        if (!this.attnList.containsKey(attrTypeId)) {
            this.attnList.put(attrTypeId, new Integer(0));
        }
    }
    
    public void setBlanklines(final int setting) {
        this.addNumValue(29, setting);
    }
    
    private void setCommentLines(final int setting) {
        this.addNumValue(27, setting);
    }
    
    public void setJclExtension(final int setting) {
        this.addNumValue(160, setting);
    }
    
    public void setLanguageCd(final String setting) {
        this.languageCd = setting;
    }
    
    public void setNonAfter(final int setting) {
        this.addNumValue(40, setting);
    }
    
    public void setNonCommentBefore1st(final int setting) {
        this.addNumValue(39, setting);
    }
    
    public void setNonCommentLines(final int setting) {
        this.addNumValue(28, setting);
    }
    
    public void incrementNumValue(final Integer attrTypeId) {
        if (this.attnList == null) {
            this.attnList = new TreeMap<Integer, Integer>();
        }
        if (!this.attnList.containsKey(attrTypeId)) {
            this.attnList.put(attrTypeId, new Integer(0));
        }
        int value = this.attnList.get(attrTypeId);
        ++value;
        this.attnList.put(attrTypeId, new Integer(value));
    }
    
    public void setFileHash(final long hash) {
        this.fileHash = hash;
    }
    
    public void setTotalLines(final int setting) {
        this.addNumValue(106, setting);
    }
}
