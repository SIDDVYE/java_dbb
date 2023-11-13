// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify;

import com.ibm.jjson.JsonSerializer;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import com.ibm.jjson.JsonMap;
import com.ibm.jjson.JsonList;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import com.ibm.dmh.util.HashAlgorithms;
import java.io.ByteArrayInputStream;
import com.ibm.dmh.scan.classify.utils.FileTypeClassification;
import java.util.HashMap;
import java.io.IOException;
import com.ibm.dmh.scan.classify.utils.FileHandler;
import com.ibm.dmh.cfgmgr.ConfigEntry;
import java.util.TreeMap;
import java.io.InputStream;
import java.io.DataInputStream;
import com.ibm.dmh.cfgmgr.ConfigRuntimeException;
import com.ibm.dmh.cfgmgr.ConfigFile;
import java.util.Map;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;
import com.ibm.dmh.scan.classify.scanners.ClassifierXML;
import com.ibm.dmh.scan.classify.scanners.ClassifierZBND;
import com.ibm.dmh.scan.classify.scanners.ClassifierSORT;
import com.ibm.dmh.scan.classify.scanners.ClassifierREXX;
import com.ibm.dmh.scan.classify.scanners.ClassifierPLX;
import com.ibm.dmh.scan.classify.scanners.ClassifierPLI;
import com.ibm.dmh.scan.classify.scanners.ClassifierJCL;
import com.ibm.dmh.scan.classify.scanners.ClassifierJava;
import com.ibm.dmh.scan.classify.scanners.ClassifierISPF;
import com.ibm.dmh.scan.classify.scanners.ClassifierEASY;
import com.ibm.dmh.scan.classify.scanners.ClassifierCPP;
import com.ibm.dmh.scan.classify.scanners.ClassifierCOB;
import com.ibm.dmh.scan.classify.scanners.ClassifierTEXT;
import com.ibm.dmh.scan.classify.scanners.ClassifierC;
import com.ibm.dmh.scan.classify.scanners.ClassifierASM;
import com.ibm.dmh.util.Environment;
import com.ibm.dmh.scan.classify.scanners.ClassifierByString;
import com.ibm.dmh.scan.classify.scanners.ClassifierByRecord;
import java.util.ArrayList;

public class Dmh5210
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2020\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    public static final char IDENTIFIER_MODE_CONFIRMED = 'C';
    public static final char IDENTIFIER_MODE_REJECTED = 'R';
    public static final char IDENTIFIER_MODE_UNKNOWN = 'U';
    public static final int DEBUG_OFF = 0;
    public static final int DEBUG_ON = 1;
    public static final int DEBUG_VERBOSE = 2;
    public static final int CLASSIFICATION_SCAN_TOOL_ID = 1000217;
    private static final String classifyConfigFile = "/com/ibm/dmh/scan/classify/classify";
    private ArrayList<ClassifierByRecord> classifiersByRecord;
    private ArrayList<ClassifierByString> classifiersByString;
    private boolean extensionDrivesScan;
    private boolean isWindows;
    private int debug;
    private boolean needsReset;
    private int lineCount;
    private int MaximumSeverity;
    private int winlang;
    private ScanProperties scanProperties;
    private SingleFilesMetadata dmh5211;
    private String check_ContentMIMEType;
    private String check_FileExtension;
    private String inrec;
    private String languageHintFromExtension;
    private String[] fileRecords;
    
    public Dmh5210() {
        this.scanProperties = new ScanProperties();
        this.needsReset = true;
        this.reset();
    }
    
    private void reset() {
        if (this.needsReset) {
            this.check_ContentMIMEType = null;
            this.check_FileExtension = null;
            this.classifiersByRecord = new ArrayList<ClassifierByRecord>();
            this.classifiersByString = new ArrayList<ClassifierByString>();
            this.debug = 0;
            this.dmh5211 = new SingleFilesMetadata();
            this.extensionDrivesScan = false;
            this.fileRecords = null;
            this.inrec = null;
            this.isWindows = Environment.isWindows();
            this.languageHintFromExtension = "";
            this.lineCount = 0;
            this.MaximumSeverity = 0;
            this.winlang = 22;
            this.classifiersByRecord.add(new ClassifierASM(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierC(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierTEXT(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierCOB(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierCPP(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierEASY(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierISPF(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierJava(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierJCL(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierPLI(this.scanProperties));
            if (!this.scanProperties.getNoPLX()) {
                this.classifiersByRecord.add(new ClassifierPLX(this.scanProperties));
            }
            this.classifiersByRecord.add(new ClassifierREXX(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierSORT(this.scanProperties));
            this.classifiersByRecord.add(new ClassifierZBND(this.scanProperties));
            this.classifiersByString.add(new ClassifierXML(this.scanProperties));
            this.needsReset = false;
        }
    }
    
    public void setDebug(final int iSetting) {
        this.debug = iSetting;
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            classifierByRecord.setDebug(iSetting);
        }
        for (final ClassifierByString classifierByString : this.classifiersByString) {
            classifierByString.setDebug(iSetting);
        }
    }
    
    private boolean assignLanguageBasedOnExtension(final String languageHintFromUser, final String iFileSpecText, final String iFileContent) {
        if (!languageHintFromUser.equals("EMP?") && !languageHintFromUser.equals("GONE") && !languageHintFromUser.equals("UNKN")) {
            this.languageHintFromExtension = languageHintFromUser;
            return false;
        }
        if (this.languageHintFromExtension.equals("ASM") || this.languageHintFromExtension.equals("COB") || this.languageHintFromExtension.equals("EASY") || this.languageHintFromExtension.equals("JAVA") || this.languageHintFromExtension.equals("JCL") || this.languageHintFromExtension.equals("PLI") || this.languageHintFromExtension.equals("PLX") || this.languageHintFromExtension.equals("XML")) {
            this.extensionDrivesScan = true;
            return false;
        }
        if (!this.DMHIOAPI_CheckIfMemberExists(iFileSpecText, iFileContent)) {
            this.EOF_GONE_Member();
            return true;
        }
        if (this.languageHintFromExtension.length() == 0) {
            return false;
        }
        int lineCount = 0;
        if (this.check_ContentMIMEType.contains("text")) {
            lineCount = this.CountLinesInFile(iFileContent);
            if (lineCount == 0) {
                this.EOF_EMPTY_Member();
                return true;
            }
        }
        this.dmh5211.setLanguageCd(this.languageHintFromExtension);
        final ClassifierMetaData metaData = new ClassifierMetaData();
        metaData.setLanguageCd(this.languageHintFromExtension);
        metaData.setTotalLines(lineCount);
        this.dmh5211.setMetaData(metaData);
        this.addFileHashProperty(iFileContent);
        return true;
    }
    
    private void CaptureMarginsForPLI(final String iParm) {
        final int m = 0;
        final int n = 0;
        String margins = "";
        margins = iParm;
        if (m < 1 || m > 100) {
            return;
        }
        if (n <= m || n < 201) {}
    }
    
    private boolean checkFileExtension(final String iFileNameNoQuotes) {
        final int pChar = iFileNameNoQuotes.lastIndexOf(46);
        if (pChar == -1) {
            return false;
        }
        if (iFileNameNoQuotes.substring(pChar).length() == 1) {
            return false;
        }
        this.check_FileExtension = iFileNameNoQuotes.substring(pChar + 1);
        final String workFileExtension;
        String charValue = workFileExtension = this.check_FileExtension.toUpperCase();
        if (workFileExtension.equals("CPY")) {
            return false;
        }
        if (workFileExtension.equals("TXT")) {
            return false;
        }
        boolean foundExtensionMatch = false;
        boolean foundLanguageCd = false;
        String cfgSection = "";
        String currentCfgSection = null;
        String contentMIMEType = "";
        String languageCd = "";
        final Map<String, String> values = this.getConfigMap("/com/ibm/dmh/scan/classify/classify");
        final TreeSet<String> keys = new TreeSet<String>(values.keySet());
        for (String key : keys) {
            final String value = values.get(key);
            final int index = key.indexOf(46);
            if (index == -1) {
                cfgSection = "";
            }
            else {
                cfgSection = key.substring(0, index);
                key = key.substring(index + 1);
            }
            if (currentCfgSection == null) {
                currentCfgSection = cfgSection;
            }
            else if (!currentCfgSection.equals(cfgSection)) {
                if (foundExtensionMatch && foundLanguageCd) {
                    break;
                }
                foundExtensionMatch = false;
                foundLanguageCd = false;
                contentMIMEType = "";
                languageCd = "";
                currentCfgSection = cfgSection;
            }
            if (key.equals("contentMIMEType")) {
                contentMIMEType = value;
            }
            else if (key.equals("fileExts")) {
                final String[] tempString = value.split(",");
                for (int i = 0; i < tempString.length; ++i) {
                    charValue = tempString[i].toUpperCase();
                    if (charValue.equals(workFileExtension)) {
                        foundExtensionMatch = true;
                        break;
                    }
                }
            }
            else {
                if (!key.equals("languageCd")) {
                    continue;
                }
                foundLanguageCd = true;
                languageCd = value;
            }
        }
        if (foundExtensionMatch && languageCd.length() != 0) {
            this.check_ContentMIMEType = contentMIMEType;
            this.languageHintFromExtension = languageCd;
        }
        return true;
    }
    
    private boolean checkForExactMatchScores() {
        boolean matchedHighestScore = false;
        int highestScore = 0;
        for (int numberOfClassifiers = this.classifiersByRecord.size(), i = 0; i < numberOfClassifiers; ++i) {
            final ClassifierByRecord classifierByRecord1 = this.classifiersByRecord.get(i);
            final int score1 = classifierByRecord1.getScore();
            if (score1 != 0) {
                if (highestScore == 0) {
                    highestScore = score1;
                }
                else {
                    if (score1 <= highestScore) {
                        continue;
                    }
                    highestScore = score1;
                    matchedHighestScore = false;
                }
                for (int j = i + 1; j < numberOfClassifiers; ++j) {
                    final ClassifierByRecord classifierByRecord2 = this.classifiersByRecord.get(j);
                    final int score2 = classifierByRecord2.getScore();
                    if (score2 != 0) {
                        if (score2 == highestScore) {
                            matchedHighestScore = true;
                        }
                    }
                }
            }
        }
        return matchedHighestScore;
    }
    
    private double calculateTotalScore() {
        int totalScore = 0;
        int cScore = 0;
        int cppScore = 0;
        int pliScore = 0;
        int plxScore = 0;
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            final int score = classifierByRecord.getScore();
            final String languageCd = classifierByRecord.getLanguageCd();
            if (languageCd.equals("C")) {
                cScore = score;
            }
            else if (languageCd.equals("CPP")) {
                cppScore = score;
            }
            else if (languageCd.equals("PLI")) {
                pliScore = score;
            }
            else if (languageCd.equals("PLX")) {
                plxScore = score;
            }
            else {
                totalScore += score;
            }
        }
        if (cScore == 0 || cppScore == 0) {
            totalScore = totalScore + cScore + cppScore;
        }
        else {
            totalScore += (cScore + cppScore) / 2;
        }
        if (pliScore == 0 || plxScore == 0) {
            totalScore = totalScore + pliScore + plxScore;
        }
        else {
            totalScore += (pliScore + plxScore) / 2;
        }
        return totalScore;
    }
    
    private int calculateWinScore() {
        int winScore = 0;
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            final int score = classifierByRecord.getScore();
            if (score > winScore) {
                winScore = score;
                this.winlang = classifierByRecord.getLanguageId();
            }
        }
        return winScore;
    }
    
    private boolean ChooseALanguageCode() {
        final double totalScore = this.calculateTotalScore();
        if (totalScore == 0.0) {
            return false;
        }
        final int winScore = this.calculateWinScore();
        if (totalScore == winScore) {
            if (winScore < this.lineCount * 0.05) {
                this.winlang = 22;
                return false;
            }
            return true;
        }
        else {
            if (this.checkForExactMatchScores()) {
                this.winlang = 22;
                return false;
            }
            final double tieBreakScore = totalScore * 0.4;
            if (winScore >= tieBreakScore) {
                return true;
            }
            boolean mustBeAssembler = false;
            if (this.winlang == 2) {
                for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
                    if (classifierByRecord.getLanguageId() != 2) {
                        continue;
                    }
                    if (classifierByRecord.hasMACRO_MEND()) {
                        mustBeAssembler = true;
                        break;
                    }
                    break;
                }
                if (mustBeAssembler) {
                    return true;
                }
            }
            this.winlang = 22;
            return false;
        }
    }
    
    private void ClearBadLanguageScores(final String languageHint) {
        ClassifierASM classifierASM = null;
        ClassifierC classifierC = null;
        ClassifierCOB classifierCOB = null;
        ClassifierCPP classifierCPP = null;
        ClassifierEASY classifierEASY = null;
        ClassifierJCL classifierJCL = null;
        ClassifierPLI classifierPLI = null;
        ClassifierPLX classifierPLX = null;
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            switch (classifierByRecord.getLanguageId()) {
                case 2: {
                    classifierASM = (ClassifierASM)classifierByRecord;
                    break;
                }
                case 4: {
                    classifierC = (ClassifierC)classifierByRecord;
                    break;
                }
                case 6: {
                    classifierCOB = (ClassifierCOB)classifierByRecord;
                    break;
                }
                case 7: {
                    classifierCPP = (ClassifierCPP)classifierByRecord;
                    break;
                }
                case 8: {
                    classifierEASY = (ClassifierEASY)classifierByRecord;
                    break;
                }
                case 14: {
                    classifierJCL = (ClassifierJCL)classifierByRecord;
                    break;
                }
                case 16: {
                    classifierPLI = (ClassifierPLI)classifierByRecord;
                    break;
                }
                case 17: {
                    classifierPLX = (ClassifierPLX)classifierByRecord;
                    break;
                }
            }
            if (classifierByRecord.getScore() != 0) {
                classifierByRecord.isScoreBad(this.lineCount, languageHint);
            }
        }
        this.reportScores();
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            if (classifierByRecord.getScore() != 0) {
                classifierByRecord.isScoreStillBad(this.lineCount, classifierASM, classifierC, classifierCOB, classifierCPP, classifierEASY, classifierJCL, classifierPLI, classifierPLX);
            }
        }
        this.reportScores();
    }
    
    private int CountLinesInFile(final String iFileContent) {
        int lineCount = 0;
        this.fileRecords = iFileContent.split("\n");
        while (this.DMHIOAPI_GetRecord(lineCount)) {
            ++lineCount;
        }
        return lineCount;
    }
    
    private void EOF_EMPTY_Member() {
        this.dmh5211.setLanguageCd("EMP?");
        final ClassifierMetaData metaData = new ClassifierMetaData();
        metaData.setLanguageCd("EMP?");
        this.dmh5211.setMetaData(metaData);
    }
    
    private void EOF_GONE_Member() {
        this.dmh5211.setLanguageCd("GONE");
        final ClassifierMetaData metaData = new ClassifierMetaData();
        metaData.setLanguageCd("GONE");
        this.dmh5211.setMetaData(metaData);
    }
    
    private void EOF_UNK_Member() {
        this.dmh5211.setLanguageCd("UNKN");
        final ClassifierMetaData metaData = new ClassifierMetaData();
        metaData.setLanguageCd("UNKN");
        metaData.setNonCommentLines(this.lineCount);
        metaData.setTotalLines(this.lineCount);
        this.dmh5211.setMetaData(metaData);
    }
    
    private ConfigFile getConfigFile(String filename) throws ConfigRuntimeException {
        if (filename.indexOf(46) == -1) {
            filename += ".cfg";
        }
        final InputStream inputStream = this.getClass().getResourceAsStream(filename);
        if (inputStream == null) {
            throw new ConfigRuntimeException("Could not getResourceAsStream() for [" + filename + "]");
        }
        final DataInputStream dataInputStream = new DataInputStream(inputStream);
        final ConfigFile c = new ConfigFile(dataInputStream);
        return c;
    }
    
    private Map<String, String> getConfigMap(final String config) throws ConfigRuntimeException {
        final Map<String, String> m = new TreeMap<String, String>();
        final ConfigFile c = this.getConfigFile(config);
        final Map<String, ConfigEntry> valueMap = c.getAllValuesMap();
        for (final String key : valueMap.keySet()) {
            m.put(key, valueMap.get(key).getValue());
        }
        return m;
    }
    
    public String getFileTypeCd() {
        return this.dmh5211.getFileTypeCd();
    }
    
    public String getLanguageCd() {
        return this.dmh5211.getLanguageCd();
    }
    
    private boolean haveAllLanguagesBeenRejected() {
        boolean rc = true;
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            if (classifierByRecord.getIdentifierMode() == 'R') {
                continue;
            }
            rc = false;
            break;
        }
        return rc;
    }
    
    public void init(final ScanProperties iScanProperties) {
        this.scanProperties = ((iScanProperties == null) ? new ScanProperties() : iScanProperties);
        this.needsReset = true;
        this.reset();
    }
    
    private void InitializeFields(final String iFileName) {
        this.winlang = 22;
        this.dmh5211.setMemberName(iFileName);
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            classifierByRecord.setIdentifierMode('R');
        }
    }
    
    private void InitializeLanguageValidators(final String languageHintFromUser) {
        if (languageHintFromUser == null || languageHintFromUser.length() == 0 || languageHintFromUser.equals("UNKN")) {
            for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
                classifierByRecord.processCommonInitialization();
                classifierByRecord.processInitialization();
                classifierByRecord.setIdentifierMode('U');
            }
            return;
        }
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            classifierByRecord.processCommonInitialization();
            classifierByRecord.processInitialization();
            final String languageCd = classifierByRecord.getLanguageCd();
            if (languageCd.equals(languageHintFromUser)) {
                continue;
            }
            classifierByRecord.setIdentifierMode('R');
        }
    }
    
    private void MetaDataStructureCleanup() {
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            classifierByRecord.processDeallocate();
        }
    }
    
    private void MemberProcessor(final String iFileContent, final String languageHint) {
        boolean recordRead = this.ReadTheInputFile();
        if (!recordRead || (this.lineCount == 0 && this.inrec.length() == 0)) {
            return;
        }
        boolean returnNow = false;
        while (recordRead) {
            if (this.haveAllLanguagesBeenRejected()) {
                returnNow = true;
                break;
            }
            if (this.winlang != 22) {
                break;
            }
            int tempWinLanguage = 22;
            int tempWinLanguages = 0;
            for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
                classifierByRecord.process(this.lineCount, this.inrec, languageHint);
                if (classifierByRecord.getIdentifierMode() == 'C') {
                    tempWinLanguage = classifierByRecord.getLanguageId();
                    ++tempWinLanguages;
                }
            }
            if (tempWinLanguages == 1) {
                this.winlang = tempWinLanguage;
                break;
            }
            recordRead = this.ReadTheInputFile();
        }
        if (returnNow) {
            return;
        }
        if (!recordRead) {
            for (final ClassifierByRecord classifierByRecord2 : this.classifiersByRecord) {
                if (classifierByRecord2.getScore() > 0) {
                    classifierByRecord2.processEndOfFile(this.lineCount);
                }
            }
        }
        this.reportScores();
        if (this.winlang == 22) {
            this.winlang = this.ProcessFileOfAllCommentsAndBlanks(this.lineCount, languageHint);
        }
        if (this.winlang == 22) {
            this.ClearBadLanguageScores(languageHint);
            this.ChooseALanguageCode();
            return;
        }
        ClassifierByRecord theWinningClassifier = null;
        for (final ClassifierByRecord classifierByRecord3 : this.classifiersByRecord) {
            if (classifierByRecord3.getLanguageId() != this.winlang) {
                continue;
            }
            theWinningClassifier = classifierByRecord3;
            break;
        }
        if (recordRead) {
            while (true) {
                do {
                    recordRead = this.ReadTheInputFile();
                    if (!recordRead) {
                        if (theWinningClassifier.getIdentifierMode() != 'R') {
                            theWinningClassifier.processEndOfFile(this.lineCount);
                        }
                        return;
                    }
                    else {
                        theWinningClassifier.process(this.lineCount, this.inrec, languageHint);
                    }
                } while (theWinningClassifier.getIdentifierMode() != 'R');
                this.winlang = 22;
                continue;
            }
        }
    }
    
    private boolean OpenProcessCloseFile(final String iFileContent, final String iFileSpecText, final String languageHint) {
        this.lineCount = 0;
        this.InitializeLanguageValidators(languageHint);
        if (!this.DMHIOAPI_CheckIfMemberExists(iFileSpecText, iFileContent)) {
            return false;
        }
        if (!this.DMHIOAPI_Open(iFileSpecText, iFileContent)) {
            return false;
        }
        this.MemberProcessor(iFileContent, languageHint);
        return true;
    }
    
    private int ProcessFileOfAllCommentsAndBlanks(final int lineCount, final String languageHint) {
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            if (classifierByRecord.getLanguageCd().equals(languageHint) && classifierByRecord.getScore() > 0) {
                final int blanksAndCommentsCount = classifierByRecord.getBlankLineCount() + classifierByRecord.getCommentCount();
                if (lineCount == blanksAndCommentsCount) {
                    return classifierByRecord.getLanguageId();
                }
                continue;
            }
        }
        return 22;
    }
    
    public SingleFilesMetadata processSingleFile(final InputStream iInputStream) {
        return this.processSingleFile(null, iInputStream);
    }
    
    public SingleFilesMetadata processSingleFile(final String fileName, final InputStream iInputStream) {
        final String codePage = this.scanProperties.getCodePage();
        String convertedContents;
        try {
            convertedContents = FileHandler.readInputStream(iInputStream, codePage);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return this.ProcessSingleFile(null, null, null, null, fileName, null, convertedContents, null);
    }
    
    public ClassifierMetaData processFileContentForLanguageCd(final String siteName, final String rmType, final String containerName, final String fileName, final String fileContent, final String languageHint) {
        this.reset();
        this.needsReset = true;
        this.dmh5211.setSiteName(siteName);
        this.dmh5211.setRmType(rmType);
        this.dmh5211.setContainerName(containerName);
        final FileHandler fileHandler = new FileHandler(containerName, fileName, "");
        this.InitializeFields(fileHandler.getNormalizedFileName());
        final String fileSpecText = fileHandler.getFileToOpen();
        this.ProcessFilesContent(fileHandler, fileSpecText, fileContent, languageHint);
        final ClassifierMetaData metaData = this.dmh5211.getMetaData();
        return metaData;
    }
    
    public SingleFilesMetadata ProcessSingleFile(final String siteName, final String rmType, final String rmDDName, final String containerName, final String fileName, final String localName, final String fileContent, final InputStream inputStream) {
        this.reset();
        this.needsReset = true;
        final FileHandler fileHandler = new FileHandler((containerName == null) ? "" : containerName, (fileName == null) ? "" : fileName, (localName == null) ? "" : localName);
        this.InitializeFields(fileHandler.getNormalizedFileName());
        fileHandler.setRmType((rmType == null) ? "" : rmType);
        fileHandler.setRmDDName((rmDDName == null) ? "" : rmDDName);
        final String fileSpecText = fileHandler.getFileToOpen();
        final String codePage = this.scanProperties.getCodePage();
        String theFilesContents = null;
        Label_0161: {
            if (fileContent == null) {
                if (inputStream == null) {
                    theFilesContents = fileHandler.getFileContent(fileSpecText, codePage);
                    break Label_0161;
                }
                try {
                    theFilesContents = FileHandler.readInputStream(inputStream, codePage);
                    break Label_0161;
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            theFilesContents = fileContent;
        }
        this.dmh5211.setSiteName((siteName == null) ? "" : siteName);
        this.dmh5211.setRmType(fileHandler.getRmType());
        this.dmh5211.setContainerName(fileHandler.getNormalizedContainerName());
        this.ProcessFilesContent(fileHandler, fileSpecText, theFilesContents, this.scanProperties.getLanguageHint());
        final ClassifierMetaData metaData = this.dmh5211.getMetaData();
        final String languageCd = metaData.getLanguageCd();
        final Map<String, Object> filesMetadata = new HashMap<String, Object>();
        filesMetadata.put("attcList", metaData.getAttcList());
        filesMetadata.put("attnList", metaData.getAttnList());
        filesMetadata.put("inclList", metaData.getInclList());
        filesMetadata.put("includedFileContainsEntry", Boolean.FALSE);
        filesMetadata.put("plxIsMain", metaData.getPlxIsMain());
        filesMetadata.put("usedAsProc", Boolean.FALSE);
        final FileTypeClassification fileTypeClassification = new FileTypeClassification(languageCd, filesMetadata);
        final String fileTypeCd = fileTypeClassification.getFileTypeCd();
        this.dmh5211.setFileTypeCd(fileTypeCd);
        return this.dmh5211;
    }
    
    private void ProcessFilesContent(final FileHandler fileHandler, final String fileSpecText, final String fileContent, String languageHint) {
        boolean returnNow = false;
        for (final ClassifierByString classifierByString : this.classifiersByString) {
            if (!classifierByString.checkString(fileContent)) {
                continue;
            }
            final int lineCount = this.CountLinesInFile(fileContent);
            final String languageCd = classifierByString.getLanguageCd();
            this.dmh5211.setLanguageCd(languageCd);
            final ClassifierMetaData metaData = new ClassifierMetaData();
            metaData.setLanguageCd(languageCd);
            metaData.setTotalLines(lineCount);
            this.dmh5211.setMetaData(metaData);
            this.addFileHashProperty(fileContent);
            returnNow = true;
            break;
        }
        if (returnNow) {
            return;
        }
        this.extensionDrivesScan = false;
        this.check_ContentMIMEType = "";
        this.languageHintFromExtension = "";
        final String languageHintFromUser = this.scanProperties.getLanguageHint();
        if (fileHandler != null && this.checkFileExtension(fileHandler.getNormalizedFileName())) {
            if (this.assignLanguageBasedOnExtension(languageHintFromUser, fileSpecText, fileContent)) {
                this.MetaDataStructureCleanup();
                return;
            }
            if (this.languageHintFromExtension.length() != 0) {
                languageHint = this.languageHintFromExtension;
            }
        }
        final boolean rc = this.OpenProcessCloseFile(fileContent, fileSpecText, languageHint);
        this.recordDiscoveredLanguageCd(rc, this.extensionDrivesScan, fileHandler, fileContent, fileSpecText);
        this.addFileHashProperty(fileContent);
        this.MetaDataStructureCleanup();
    }
    
    private void addFileHashProperty(final String fileContent) {
        try {
            long hash = 0L;
            if (fileContent != null) {
                final String codePage = this.scanProperties.getCodePage();
                final ByteArrayInputStream bis = new ByteArrayInputStream((codePage == null) ? fileContent.getBytes() : fileContent.getBytes(codePage));
                hash = HashAlgorithms.useProprietaryAlgorithm(bis);
                bis.close();
            }
            this.dmh5211.getMetaData().setFileHash(hash);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private boolean ReadTheInputFile() {
        boolean rc = false;
        rc = this.DMHIOAPI_GetRecord(this.lineCount);
        if (rc) {
            ++this.lineCount;
            if (this.debug == 2) {
                this.reportScores();
                System.out.println("Record[" + String.valueOf(this.lineCount) + "][" + this.inrec + "]");
            }
        }
        return rc;
    }
    
    private void recordDiscoveredLanguageCd(final boolean iRC, final boolean iExtensionDrivesScan, final FileHandler iFileHandler, final String fileContent, final String fileSpecText) {
        if (this.ReportWinLanguage(iRC)) {
            return;
        }
        if (!iExtensionDrivesScan) {
            this.EOF_UNK_Member();
            return;
        }
        this.MetaDataStructureCleanup();
        if (iFileHandler == null) {
            this.InitializeFields("");
        }
        else {
            this.InitializeFields(iFileHandler.getNormalizedFileName());
        }
        final String languageHint = this.scanProperties.getLanguageHint();
        final boolean rc = this.OpenProcessCloseFile(fileContent, fileSpecText, languageHint);
        if (this.ReportWinLanguage(rc)) {
            return;
        }
        this.EOF_UNK_Member();
    }
    
    private void reportScores() {
        if (this.debug == 0) {
            return;
        }
        int tempScore = 0;
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            tempScore += classifierByRecord.getScore();
        }
        System.out.print("Scores - ");
        if (tempScore == 0) {
            System.out.println("are all zero");
        }
        else {
            for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
                System.out.print(classifierByRecord.getLanguageCd() + "[" + classifierByRecord.getScore() + "] ");
            }
        }
        System.out.println(" ");
    }
    
    private boolean ReportWinLanguage(final boolean iRC) {
        if (!iRC) {
            this.EOF_GONE_Member();
            return true;
        }
        if (this.lineCount == 0) {
            this.EOF_EMPTY_Member();
            return true;
        }
        boolean rc = false;
        for (final ClassifierByRecord classifierByRecord : this.classifiersByRecord) {
            final int languageId = classifierByRecord.getLanguageId();
            if (this.winlang != languageId) {
                continue;
            }
            final String languageCd = classifierByRecord.getLanguageCd();
            this.dmh5211.setLanguageCd(languageCd);
            final ClassifierMetaData metaData = classifierByRecord.getMetaData();
            metaData.setLanguageCd(languageCd);
            this.dmh5211.setMetaData(metaData);
            String workString = classifierByRecord.getLanguageDescription();
            if (languageCd.equals("ASM")) {
                if (classifierByRecord.hasBMSmacro()) {
                    workString += " (BMS macro)";
                }
                else if (classifierByRecord.hasDBDGENstatement()) {
                    workString += " (DBDGEN)";
                }
                else if (classifierByRecord.hasPSBGENstatement()) {
                    workString += " (PSBGEN)";
                }
            }
            rc = true;
            break;
        }
        return rc;
    }
    
    public int DMHU005() {
        return this.MaximumSeverity;
    }
    
    public void ResetMaximumSeverity() {
        this.MaximumSeverity = 0;
    }
    
    public void SetMaximumSeverity(final int setting) {
        this.MaximumSeverity = setting;
    }
    
    private boolean DMHIOAPI_CheckIfMemberExists(final String iFileSpecText, final String iFileContent) {
        if (iFileContent != null) {
            return true;
        }
        final File file = new File(iFileSpecText);
        return file.exists() && file.canRead();
    }
    
    private boolean DMHIOAPI_Open(final String iFileSpecText, final String iFileContent) {
        if (iFileContent != null) {
            this.fileRecords = iFileContent.split("\n");
            return true;
        }
        final File file = new File(iFileSpecText);
        FileInputStream fis = null;
        String contents = null;
        try {
            fis = new FileInputStream(file);
        }
        catch (FileNotFoundException e) {
            return false;
        }
        try {
            contents = this.readInputStream(fis);
            this.fileRecords = contents.split("\n");
            fis.close();
        }
        catch (IOException e2) {
            this.fileRecords = null;
            return false;
        }
        return true;
    }
    
    private String readInputStream(final InputStream readStream) throws IOException {
        final int BUFF_SIZE = 4096;
        final ByteArrayOutputStream accumulator = new ByteArrayOutputStream();
        final byte[] buffer = new byte[4096];
        for (int readSize = readStream.read(buffer, 0, 4096); readSize >= 0; readSize = readStream.read(buffer, 0, 4096)) {
            accumulator.write(buffer, 0, readSize);
        }
        return accumulator.toString();
    }
    
    private boolean DMHIOAPI_GetRecord(final int iLineCount) {
        if (this.fileRecords == null) {
            return false;
        }
        if (iLineCount >= this.fileRecords.length) {
            return false;
        }
        this.inrec = this.fileRecords[iLineCount];
        while (this.inrec.endsWith("\r")) {
            this.inrec = this.inrec.substring(0, this.inrec.length() - 1);
        }
        return this.fileRecords.length != 1 || this.inrec.length() != 0;
    }
    
    private void generateAssignmentsForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<String, String> assignments) {
        if (assignments == null) {
            return;
        }
        if (jsonResponseFormat.equals("ADI")) {
            final List<Map<String, String>> assignment = new JsonList<Map<String, String>>();
            for (final String source : assignments.keySet()) {
                final Map<String, String> stmt = new JsonMap<String, String>();
                stmt.put("source", source);
                stmt.put("destination", assignments.get(source));
                assignment.add(stmt);
            }
            attributes.put("moveStatements", assignment);
        }
    }
    
    private void generateCharacterAttributesForImportFile(final Map<String, Object> attributes, final Map<Integer, String> attcList) {
        if (attcList == null) {
            return;
        }
        this.reportATTCForPLIoptions(attcList);
    }
    
    private void generateNumericAttributesForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<Integer, Integer> attnList) {
        if (attnList == null) {
            return;
        }
        if (jsonResponseFormat.equals("ADI") || jsonResponseFormat.equals("GBS")) {
            for (final Integer key : attnList.keySet()) {
                attributes.put(getNumericAttrName(key, this.getLanguageCd()), attnList.get(key));
            }
        }
        else {
            final List<Map<String, Object>> attrs = new JsonList<Map<String, Object>>();
            attributes.put("attrs", attrs);
            for (final Integer key2 : attnList.keySet()) {
                final Map<String, Object> attr = new JsonMap<String, Object>();
                attr.put("type", getNumericAttrName(key2, this.getLanguageCd()));
                attr.put("value", attnList.get(key2));
                attrs.add(attr);
            }
        }
    }
    
    private void generateCicsMapsForImportFile(final Map<String, Object> attributes, final Map<String, Set<String>> mapSetList) {
        if (mapSetList == null || mapSetList.size() == 0) {
            return;
        }
        final List<Map<String, Object>> cicsMaps = new JsonList<Map<String, Object>>();
        attributes.put("cicsMaps", cicsMaps);
        List<Map<String, String>> maps = null;
        Map<String, String> map = null;
        String currentMapSetName = "";
        for (String mapSetName : mapSetList.keySet()) {
            for (final String mapName : mapSetList.get(mapSetName)) {
                if (mapSetName.length() == 0) {
                    mapSetName = mapName;
                }
                if (!mapSetName.equals(currentMapSetName)) {
                    final Map<String, Object> cicsMap = new JsonMap<String, Object>();
                    cicsMaps.add(cicsMap);
                    if (mapSetName.startsWith("\"") || mapSetName.startsWith("'")) {
                        cicsMap.put("mapSet", mapSetName.substring(1, mapSetName.length() - 1));
                        cicsMap.put("mapSetType", "literal");
                    }
                    else {
                        cicsMap.put("mapSet", mapSetName);
                        cicsMap.put("mapSetType", "dataElement");
                    }
                    maps = new JsonList<Map<String, String>>();
                    cicsMap.put("maps", maps);
                    currentMapSetName = mapSetName;
                }
                map = new JsonMap<String, String>();
                if (mapName.startsWith("\"") || mapName.startsWith("'")) {
                    map.put("map", mapName.substring(1, mapName.length() - 1));
                    map.put("mapType", "literal");
                }
                else {
                    map.put("map", mapName);
                    map.put("mapType", "dataElement");
                }
                maps.add(map);
            }
        }
    }
    
    private void generateControlTransfersForImportFile(final String jsonResponseFormat, final Map<String, Object> attrs, final Map<String, Set<String>> iControlTransfers) {
        if (iControlTransfers == null || iControlTransfers.size() == 0) {
            return;
        }
        if (jsonResponseFormat.equals("ADI") || jsonResponseFormat.equals("GBS")) {
            for (final String typeOfControlTransfer : iControlTransfers.keySet()) {
                String tag;
                if (typeOfControlTransfer.equals("LINK")) {
                    tag = "controlTransfersLink";
                }
                else if (typeOfControlTransfer.equals("XCTL")) {
                    tag = "controlTransfersXctl";
                }
                else {
                    tag = "controlTransfersCall";
                }
                attrs.put(tag, iControlTransfers.get(typeOfControlTransfer));
            }
        }
        else {
            final List<Map<String, String>> controlTransfers = new JsonList<Map<String, String>>();
            attrs.put("controlTransfers", controlTransfers);
            for (final String typeOfControlTransfer2 : iControlTransfers.keySet()) {
                for (final String target : iControlTransfers.get(typeOfControlTransfer2)) {
                    final Map<String, String> controlTransfer = new JsonMap<String, String>();
                    controlTransfer.put("type", typeOfControlTransfer2);
                    controlTransfer.put("target", target);
                    controlTransfers.add(controlTransfer);
                }
            }
        }
    }
    
    private void generateInclsForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<Integer, Map<String, Integer>> inclList) {
        if (inclList == null || inclList.size() == 0) {
            return;
        }
        if (jsonResponseFormat.equals("ADI")) {
            final Map<String, List<String>> references = new JsonMap<String, List<String>>();
            attributes.put("referencesIncl", references);
            for (final Integer inclTypeId : inclList.keySet()) {
                IncludedFileMetaData includedFileMetaData = decodeInclData(inclTypeId, " DD=x");
                List<String> includeNames = references.get(includedFileMetaData.getType());
                if (includeNames == null) {
                    includeNames = new JsonList<String>();
                    references.put(includedFileMetaData.getType(), includeNames);
                }
                for (final String inclName : inclList.get(inclTypeId).keySet()) {
                    includedFileMetaData = decodeInclData(inclTypeId, inclName);
                    final String ddName = includedFileMetaData.getDdName();
                    if (ddName == null) {
                        includeNames.add(includedFileMetaData.getInclName());
                    }
                    else {
                        includeNames.add(includedFileMetaData.getInclName() + " DD=" + ddName);
                    }
                }
            }
        }
        else if (jsonResponseFormat.equals("GBS")) {
            final JsonMap<String, List<Map<String, Integer>>> references2 = new JsonMap<String, List<Map<String, Integer>>>();
            attributes.put("referencesIncl", references2);
            for (final Integer inclTypeId2 : inclList.keySet()) {
                final List<Map<String, Integer>> includeNames2 = new JsonList<Map<String, Integer>>();
                IncludedFileMetaData includedFileMetaData = decodeInclData(inclTypeId2, " DD=x");
                references2.put(includedFileMetaData.getType(), includeNames2);
                final Map<String, Integer> inclNameMap = inclList.get(inclTypeId2);
                for (final String inclName2 : inclNameMap.keySet()) {
                    final Map<String, Integer> includeName = new JsonMap<String, Integer>();
                    final Integer inclCount = inclNameMap.get(inclName2);
                    includedFileMetaData = decodeInclData(inclTypeId2, inclName2);
                    final String ddName = includedFileMetaData.getDdName();
                    if (ddName == null) {
                        includeName.put(includedFileMetaData.getInclName(), inclCount);
                    }
                    else {
                        includeName.put(includedFileMetaData.getInclName() + " DD=" + ddName, inclCount);
                    }
                    includeNames2.add(includeName);
                }
            }
        }
        else {
            final JsonList<Map<String, String>> references3 = new JsonList<Map<String, String>>();
            attributes.put("references", references3);
            for (final Integer inclTypeId : inclList.keySet()) {
                for (final String inclName3 : inclList.get(inclTypeId).keySet()) {
                    final IncludedFileMetaData includedFileMetaData = decodeInclData(inclTypeId, inclName3);
                    final Map<String, String> dependencyData = new JsonMap<String, String>();
                    dependencyData.put("type", includedFileMetaData.getType());
                    dependencyData.put("name", includedFileMetaData.getInclName());
                    final String ddName = includedFileMetaData.getDdName();
                    if (ddName != null) {
                        dependencyData.put("ddName", ddName);
                    }
                    dependencyData.put("fileTypeCd", includedFileMetaData.getFileTypeCd());
                    references3.add(dependencyData);
                }
            }
        }
    }
    
    private void generateCommentsForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<String, Integer> comments) {
        if (comments == null) {
            return;
        }
        if (jsonResponseFormat.equals("GBS")) {
            final List<Map<String, Object>> commentInstances = new JsonList<Map<String, Object>>();
            for (final String comment : comments.keySet()) {
                final Map<String, Object> commentInstance = new JsonMap<String, Object>();
                commentInstance.put("comment", comment);
                commentInstance.put("instances", comments.get(comment));
                commentInstances.add(commentInstance);
            }
            attributes.put("comments", commentInstances);
        }
        else {
            final Set<String> keys = comments.keySet();
            final JsonList<String> jsonList = new JsonList<String>(keys);
            attributes.put("comments", jsonList);
        }
    }
    
    private void generateEntryPointsForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final List<String> entryPoints) {
        if (entryPoints == null) {
            return;
        }
        attributes.put("entryPoints", new JsonList(entryPoints));
    }
    
    private void generateExecStatementsForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<String, Integer> execStatements) {
        if (execStatements == null) {
            return;
        }
        if (jsonResponseFormat.equals("GBS")) {
            final List<Map<String, Object>> execStatementInstances = new JsonList<Map<String, Object>>();
            for (final String execStatement : execStatements.keySet()) {
                final Map<String, Object> execStatementInstance = new JsonMap<String, Object>();
                execStatementInstance.put("execStatement", execStatement);
                execStatementInstance.put("instances", execStatements.get(execStatement));
                execStatementInstances.add(execStatementInstance);
            }
            attributes.put("execStatements", execStatementInstances);
        }
        else {
            attributes.put("execStatements", new JsonList(execStatements.keySet()));
        }
    }
    
    private void generateLiteralsForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<String, Integer> literals) {
        if (literals == null) {
            return;
        }
        if (jsonResponseFormat.equals("GBS")) {
            final List<Map<String, Object>> literalInstances = new JsonList<Map<String, Object>>();
            for (final String literal : literals.keySet()) {
                final Map<String, Object> literalInstance = new JsonMap<String, Object>();
                literalInstance.put("literal", literal);
                literalInstance.put("instances", literals.get(literal));
                literalInstances.add(literalInstance);
            }
            attributes.put("literals", literalInstances);
        }
        else {
            attributes.put("literals", new JsonList(literals.keySet()));
        }
    }
    
    private void generatePicturesForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<String, Integer> pictures) {
        if (pictures == null) {
            return;
        }
        if (jsonResponseFormat.equals("GBS")) {
            final List<Map<String, Object>> pictureInstances = new JsonList<Map<String, Object>>();
            for (final String picture : pictures.keySet()) {
                final Map<String, Object> pictureInstance = new JsonMap<String, Object>();
                pictureInstance.put("picture", picture);
                pictureInstance.put("instances", pictures.get(picture));
                pictureInstances.add(pictureInstance);
            }
            attributes.put("pictures", pictureInstances);
        }
        else {
            attributes.put("pictures", new JsonList(pictures.keySet()));
        }
    }
    
    private void generateProcedureLabelsForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<String, Integer> procedureLabels) {
        if (procedureLabels == null) {
            return;
        }
        if (jsonResponseFormat.equals("ADI")) {
            attributes.put("procedureLabels", new JsonList(procedureLabels.keySet()));
        }
    }
    
    private void generateSymbolsForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<String, Integer> symbolsReserved, final Map<String, Integer> symbolsUserDefined) {
        if (symbolsReserved != null) {
            if (jsonResponseFormat.equals("GBS")) {
                final List<Map<String, Object>> symbolsReservedInstances = new JsonList<Map<String, Object>>();
                for (final String symbolReserved : symbolsReserved.keySet()) {
                    final Map<String, Object> symbolReservedInstance = new JsonMap<String, Object>();
                    symbolReservedInstance.put("symbolReserved", symbolReserved);
                    symbolReservedInstance.put("instances", symbolsReserved.get(symbolReserved));
                    symbolsReservedInstances.add(symbolReservedInstance);
                }
                attributes.put("symbolsReserved", symbolsReservedInstances);
            }
            else {
                attributes.put("symbolsReserved", new JsonList(symbolsReserved.keySet()));
            }
        }
        if (symbolsUserDefined != null) {
            if (jsonResponseFormat.equals("GBS")) {
                final List<Map<String, Object>> symbolsUserDefinedInstances = new JsonList<Map<String, Object>>();
                for (final String symbolUserDefined : symbolsUserDefined.keySet()) {
                    final Map<String, Object> symbolUserDefinedInstance = new JsonMap<String, Object>();
                    symbolUserDefinedInstance.put("symbolUserDefined", symbolUserDefined);
                    symbolUserDefinedInstance.put("instances", symbolsUserDefined.get(symbolUserDefined));
                    symbolsUserDefinedInstances.add(symbolUserDefinedInstance);
                }
                attributes.put("symbolsUserDefined", symbolsUserDefinedInstances);
            }
            else {
                attributes.put("symbolsUserDefined", new JsonList(symbolsUserDefined.keySet()));
            }
        }
    }
    
    private void generateTableOrViewNamesForImportFile(final String jsonResponseFormat, final Map<String, Object> attributes, final Map<String, Integer> tableOrViewNames) {
        if (tableOrViewNames == null) {
            return;
        }
        if (jsonResponseFormat.equals("GBS")) {
            final List<Map<String, Object>> tableOrViewNameInstances = new JsonList<Map<String, Object>>();
            for (final String tableOrViewName : tableOrViewNames.keySet()) {
                final Map<String, Object> tableOrViewNameInstance = new JsonMap<String, Object>();
                tableOrViewNameInstance.put("tableName", tableOrViewName);
                tableOrViewNameInstance.put("instances", tableOrViewNames.get(tableOrViewName));
                tableOrViewNameInstances.add(tableOrViewNameInstance);
            }
            attributes.put("tableNames", tableOrViewNameInstances);
        }
        else {
            attributes.put("tableNames", new JsonList(tableOrViewNames.keySet()));
        }
    }
    
    private void createINCLrecord(final List<String> records, final Map<Integer, Map<String, Integer>> inclList) {
        if (inclList == null || inclList.size() == 0) {
            return;
        }
        for (final Integer inclTypeId : inclList.keySet()) {
            for (final String inclName : inclList.get(inclTypeId).keySet()) {
                records.add("INCL " + inclTypeId + " " + inclName);
            }
        }
    }
    
    private void createCicsMapRecord(final List<String> records, final Map<String, Set<String>> mapSetList) {
        if (mapSetList == null || mapSetList.size() == 0) {
            return;
        }
        for (String mapSetName : mapSetList.keySet()) {
            for (final String mapName : mapSetList.get(mapSetName)) {
                if (mapSetName.length() == 0) {
                    mapSetName = mapName;
                }
            }
        }
    }
    
    private void createControlTransferRecords(final List<String> records, final Map<String, Set<String>> controlTransfers) {
        if (controlTransfers == null || controlTransfers.size() == 0) {
            return;
        }
        final Set<String> types = controlTransfers.keySet();
        for (final String type : types) {
            final Set<String> targets = controlTransfers.get(type);
            for (String s : targets) {}
        }
    }
    
    private void createSITErecord(final List<String> records, final String siteName) {
        if (siteName == null || siteName.length() == 0) {
            return;
        }
        records.add("SITE " + this.quote(siteName));
    }
    
    private void createLITrecords(final List<String> records, final ClassifierMetaData metadata) {
        final Map<String, Integer> literals = metadata.getLiterals();
        if (literals == null) {
            return;
        }
        for (final String literal : literals.keySet()) {
            records.add("LIT " + literal);
        }
    }
    
    private void createPICrecords(final List<String> records, final ClassifierMetaData metadata) {
        final Map<String, Integer> pictures = metadata.getPictures();
        if (pictures == null) {
            return;
        }
        for (final String picture : pictures.keySet()) {
            records.add("PIC " + picture);
        }
    }
    
    private void createSYMrecords(final List<String> records, final ClassifierMetaData metadata) {
        final Map<String, Integer> symbolsUserDefined = metadata.getSymbolsUserDefined();
        if (symbolsUserDefined == null) {
            return;
        }
        for (final String symbolUserDefined : symbolsUserDefined.keySet()) {
            records.add("SYM " + symbolUserDefined);
        }
    }
    
    public static IncludedFileMetaData decodeInclData(final Integer inclTypeId, final String inclName) {
        IncludedFileMetaData includedFileMetaData = null;
        switch (inclTypeId) {
            case 10: {
                includedFileMetaData = new IncludedFileMetaData("#include", inclName, null, "INCL");
                break;
            }
            case 12: {
                includedFileMetaData = new IncludedFileMetaData("import", inclName, null, "INCL");
                break;
            }
            case 1: {
                includedFileMetaData = new IncludedFileMetaData("JCL INCLUDE", inclName, null, "INCL");
                break;
            }
            case 62: {
                includedFileMetaData = new IncludedFileMetaData("MACRO_DEF", inclName, null, "MAC");
                break;
            }
            case 8: {
                includedFileMetaData = new IncludedFileMetaData("MACRO", inclName, null, "MAC");
                break;
            }
            case 6: {
                includedFileMetaData = new IncludedFileMetaData("-INC", inclName, null, "INCL");
                break;
            }
            case 5: {
                includedFileMetaData = new IncludedFileMetaData("++INCLUDE", inclName, null, "INCL");
                break;
            }
            case 9: {
                includedFileMetaData = new IncludedFileMetaData("PROC", inclName, null, "PROC");
                break;
            }
            case 3: {
                includedFileMetaData = new IncludedFileMetaData("COPY", inclName, null, "INCL");
                break;
            }
            case 4: {
                final String[] tokens = inclName.split(" DD=");
                includedFileMetaData = new IncludedFileMetaData("COPY", tokens[0], tokens[1], "INCL");
                break;
            }
            case 7: {
                includedFileMetaData = new IncludedFileMetaData("SQL INCLUDE", inclName, null, "INCL");
                break;
            }
            case 11: {
                includedFileMetaData = new IncludedFileMetaData("system #include", inclName, null, "INCL");
                break;
            }
            default: {
                includedFileMetaData = new IncludedFileMetaData("unknown", inclName, null, "INCL");
                break;
            }
        }
        return includedFileMetaData;
    }
    
    public static String getNumericAttrName(final Integer attrTypeId, final String languageCd) {
        String attrName = null;
        switch (attrTypeId) {
            case 25: {
                attrName = "idmsControlSection";
                break;
            }
            case 27: {
                attrName = "commentLines";
                break;
            }
            case 28: {
                attrName = "nonCommentLines";
                break;
            }
            case 29: {
                attrName = "blankLines";
                break;
            }
            case 30: {
                attrName = "execCICS";
                break;
            }
            case 31: {
                attrName = "execDLI";
                break;
            }
            case 32: {
                attrName = "execIDMS";
                break;
            }
            case 33: {
                attrName = "execSQL";
                break;
            }
            case 34: {
                attrName = "identificationDivision";
                break;
            }
            case 35: {
                attrName = "environmentDivision";
                break;
            }
            case 36: {
                attrName = "dataDivision";
                break;
            }
            case 37: {
                if (languageCd.equals("COB")) {
                    attrName = "procedureDivision";
                    break;
                }
                attrName = "procedure";
                break;
            }
            case 38: {
                attrName = "callCBLTDLI";
                break;
            }
            case 39: {
                attrName = "nonCommentBefore1st";
                break;
            }
            case 40: {
                attrName = "nonCommentAfter1st";
                break;
            }
            case 41: {
                attrName = "callPLITDLI";
                break;
            }
            case 42: {
                attrName = "callASMTDLI";
                break;
            }
            case 43: {
                attrName = "callAIBTDLI";
                break;
            }
            case 44: {
                attrName = "OPSYN";
                break;
            }
            case 45: {
                attrName = "ICTL";
                break;
            }
            case 46: {
                attrName = "CSECT";
                break;
            }
            case 47: {
                attrName = "START";
                break;
            }
            case 48: {
                attrName = "PSB";
                break;
            }
            case 49: {
                attrName = "PCB";
                break;
            }
            case 50: {
                attrName = "FCT";
                break;
            }
            case 51: {
                attrName = "PCT";
                break;
            }
            case 52: {
                attrName = "jobCard";
                break;
            }
            case 53: {
                attrName = "execStmt";
                break;
            }
            case 54: {
                attrName = "execPgm";
                break;
            }
            case 55: {
                attrName = "PPT";
                break;
            }
            case 56: {
                attrName = "OPTIONS";
                break;
            }
            case 57: {
                attrName = "ENTRY";
                break;
            }
            case 59: {
                attrName = "callAERTDLI";
                break;
            }
            case 60: {
                attrName = "function";
                break;
            }
            case 62: {
                attrName = "macroDef";
                break;
            }
            case 63: {
                attrName = "procDef";
                break;
            }
            case 64: {
                attrName = "copyReplacing";
                break;
            }
            case 65: {
                attrName = "DFHMSD";
                break;
            }
            case 81: {
                attrName = "DBD";
                break;
            }
            case 82: {
                attrName = "CEEENTRY";
                break;
            }
            case 83: {
                attrName = "splittingNodes";
                break;
            }
            case 84: {
                attrName = "CEEXAHD";
                break;
            }
            case 85: {
                attrName = "CEEXART";
                break;
            }
            case 86: {
                attrName = "CEEXAST";
                break;
            }
            case 87: {
                attrName = "MFS";
                break;
            }
            case 106: {
                attrName = "recordCount";
                break;
            }
            case 160: {
                attrName = "jclExtension";
                break;
            }
            case 810: {
                attrName = "DFHCSDUP";
                break;
            }
            case 901: {
                attrName = "execMQ";
                break;
            }
            default: {
                attrName = "unknown";
                break;
            }
        }
        return attrName;
    }
    
    public static String getCharacterAttrName(final Integer attrTypeId) {
        String attrName = null;
        switch (attrTypeId) {
            case 56: {
                attrName = "OPTIONS";
                break;
            }
            default: {
                attrName = "unknown";
                break;
            }
        }
        return attrName;
    }
    
    public List<String> generateImportFileRecords(final boolean includeSymbols) {
        final List<String> records = new LinkedList<String>();
        records.add("FMT MEMIDENT 1");
        records.add("TOOL 1000217");
        String currentContainerNameNoQuotes = null;
        String currentRmType = null;
        String currentSiteName = null;
        final String siteName = this.dmh5211.getSiteName();
        if (currentSiteName == null || !currentSiteName.equals(siteName)) {
            this.createSITErecord(records, siteName);
            currentSiteName = siteName;
        }
        final String containerName = this.dmh5211.getContainerName();
        final String rmType = this.dmh5211.getRmType();
        if (currentContainerNameNoQuotes == null || !currentContainerNameNoQuotes.equals(containerName) || currentRmType == null || !currentRmType.equals(rmType)) {
            records.add("LIBR " + this.quote(containerName) + " " + rmType);
            currentContainerNameNoQuotes = containerName;
            currentRmType = rmType;
        }
        final ClassifierMetaData metadata = this.dmh5211.getMetaData();
        final String memberName = this.dmh5211.getMemberName();
        final String languageCd = this.dmh5211.getLanguageCd();
        final String hash = metadata.hasFileHash() ? (" " + metadata.getFileHash()) : "";
        records.add("MEMB " + this.quote(memberName) + " " + languageCd + hash);
        final Map<Integer, Integer> attnList = metadata.getAttnList();
        if (attnList != null) {
            for (final Integer key : attnList.keySet()) {
                records.add("ATTN " + key + " " + attnList.get(key));
            }
        }
        final Map<Integer, String> attcList = metadata.getAttcList();
        if (attcList != null) {
            this.reportATTCForPLIoptions(attcList);
        }
        this.createControlTransferRecords(records, metadata.getControlTransfers());
        this.createINCLrecord(records, metadata.getInclList());
        this.createCicsMapRecord(records, metadata.getMapSetList());
        if (includeSymbols) {
            this.createLITrecords(records, metadata);
            this.createPICrecords(records, metadata);
            this.createSYMrecords(records, metadata);
        }
        return records;
    }
    
    public String generateJsonOutput(final String jsonResponseFormat, final Map<String, Object> attributes) {
        if (jsonResponseFormat.equals("ADI")) {
            return JsonSerializer.DEFAULT_STRICT_CONDENSED.serialize(attributes);
        }
        if (jsonResponseFormat.equals("GBS")) {
            throw new RuntimeException("IBM Services must not call the generateJsonOutput method");
        }
        final Map<String, Map<String, Object>> classify = new JsonMap<String, Map<String, Object>>();
        classify.put("classify", attributes);
        if (jsonResponseFormat.equals("PRETTY")) {
            return JsonSerializer.DEFAULT.serialize(classify);
        }
        return JsonSerializer.DEFAULT_STRICT_CONDENSED.serialize(classify);
    }
    
    public Map<String, Object> gatherAllAttributes(final String jsonResponseFormat) {
        final Map<String, Object> attributes = new JsonMap<String, Object>();
        final String memberName = this.dmh5211.getMemberName();
        if (!jsonResponseFormat.equals("GBS")) {
            attributes.put("name", memberName);
        }
        attributes.put("languageCd", this.dmh5211.getLanguageCd());
        final ClassifierMetaData metaData = this.dmh5211.getMetaData();
        if (metaData.hasFileHash()) {
            attributes.put("fileHash", metaData.getFileHash());
        }
        this.generateNumericAttributesForImportFile(jsonResponseFormat, attributes, metaData.getAttnList());
        this.generateCharacterAttributesForImportFile(attributes, metaData.getAttcList());
        this.generateControlTransfersForImportFile(jsonResponseFormat, attributes, metaData.getControlTransfers());
        this.generateInclsForImportFile(jsonResponseFormat, attributes, metaData.getInclList());
        this.generateCicsMapsForImportFile(attributes, metaData.getMapSetList());
        this.generateCommentsForImportFile(jsonResponseFormat, attributes, metaData.getComments());
        this.generateEntryPointsForImportFile(jsonResponseFormat, attributes, metaData.getEntryPoints());
        this.generateExecStatementsForImportFile(jsonResponseFormat, attributes, metaData.getExecStatements());
        this.generateLiteralsForImportFile(jsonResponseFormat, attributes, metaData.getLiterals());
        this.generatePicturesForImportFile(jsonResponseFormat, attributes, metaData.getPictures());
        this.generateProcedureLabelsForImportFile(jsonResponseFormat, attributes, metaData.getProcedureLabels());
        this.generateSymbolsForImportFile(jsonResponseFormat, attributes, metaData.getSymbolsReserved(), metaData.getSymbolsUserDefined());
        this.generateTableOrViewNamesForImportFile(jsonResponseFormat, attributes, metaData.getTableOrViewNames());
        this.generateAssignmentsForImportFile(jsonResponseFormat, attributes, metaData.getAssignments());
        final String fileTypeCd = this.dmh5211.getFileTypeCd();
        attributes.put("fileTypeCd", fileTypeCd);
        if (fileTypeCd.equals("INCL") || fileTypeCd.equals("PROC")) {
            attributes.put("logicalName", this.getLogicalName(memberName));
        }
        return attributes;
    }
    
    private void reportATTCForPLIoptions(final Map<Integer, String> options) {
    }
    
    private String quote(final String s) {
        return (s.indexOf(32) == -1) ? s : ('\"' + s + '\"');
    }
    
    private String getLogicalName(final String iFilename) {
        final int pChar = iFilename.lastIndexOf(46);
        if (pChar == -1) {
            return iFilename.toUpperCase();
        }
        return iFilename.substring(0, pChar).toUpperCase();
    }
    
    public static void updateAssemblerFileTypeUsingMetadata(final SingleFilesMetadata asmFile, final Collection<SingleFilesMetadata> allMetaData) {
        if (asmFile.getLanguageCd().equals("ASM") && asmFile.getFileTypeCd().equals("INCL")) {
            final Map<Integer, Map<String, Integer>> refs = asmFile.getMetaData().getInclList();
            if (refs != null) {
                final Set<String> macros = refs.get(8).keySet();
                for (final String macroName : macros) {
                    for (final SingleFilesMetadata checkFile : allMetaData) {
                        if (checkFile.getLanguageCd().equals("ASM") && macroName.equals(checkFile.getMemberName())) {
                            final Map<Integer, Integer> attnList = checkFile.getMetaData().getAttnList();
                            final Map<Integer, Map<String, Integer>> inclList = checkFile.getMetaData().getInclList();
                            if (FileTypeClassification.fileContainsEntry(attnList, inclList)) {
                                asmFile.setFileTypeCd("MAIN");
                                break;
                            }
                            continue;
                        }
                    }
                }
            }
        }
    }
}
