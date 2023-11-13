// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.teamz.classify;

import com.ibm.dmh.scan.classify.IncludedFileMetaData;
import java.util.Iterator;
import java.util.Set;
import com.ibm.dmh.scan.classify.ClassifierMetaData;
import com.ibm.teamz.metadata.ScannerData;
import com.ibm.dmh.scan.classify.SingleFilesMetadata;
import com.ibm.team.enterprise.metadata.scanner.IScannerData;
import java.util.Map;
import com.ibm.dmh.scan.classify.Dmh5210;
import com.ibm.dmh.scan.classify.ScanProperties;
import java.io.InputStream;
import com.ibm.team.enterprise.metadata.scanner.IMetadataValueType;
import java.util.HashMap;
import com.ibm.team.enterprise.metadata.scanner.IMetadataScanner;

public class ClassifyFileContent implements IMetadataScanner
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 1996, 2019\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    public static final String[] versionTokens;
    HashMap<String, IMetadataValueType> generalMetadataTypes;
    int debug;
    String containerName;
    String fileContent;
    String fileName;
    
    public ClassifyFileContent() {
        this.containerName = "";
        this.debug = 0;
        this.fileContent = "";
        this.fileName = "";
        this.generalMetadataTypes = null;
    }
    
    public String getFilesMetadata(final String containerName, final String fileName, final String fileContent, final InputStream inputStream, final ScanProperties scanProperties) {
        if (this.debug == 1 || this.debug == 2) {
            System.out.println("\nAsset: " + containerName + "(" + fileName + ")");
        }
        final Dmh5210 dmh5210 = new Dmh5210();
        dmh5210.init(scanProperties);
        dmh5210.setDebug(this.debug);
        dmh5210.ProcessSingleFile(null, null, null, containerName, fileName, null, fileContent, inputStream);
        String jsonResponseFormat;
        if (scanProperties == null) {
            jsonResponseFormat = "";
        }
        else {
            jsonResponseFormat = scanProperties.getJsonResponseFormat();
        }
        final Map<String, Object> attributes = dmh5210.gatherAllAttributes(jsonResponseFormat);
        final String metaData = dmh5210.generateJsonOutput(jsonResponseFormat, attributes);
        if (this.debug == 1 || this.debug == 2) {
            System.out.println(metaData);
        }
        return metaData;
    }
    
    public String getFilesMetadata(final String containerName, final String fileName, final String fileContent) {
        return this.getFilesMetadata(containerName, fileName, fileContent, null, null);
    }
    
    public String getFilesMetadata(final String containerName, final String fileName) {
        return this.getFilesMetadata(containerName, fileName, null, null, null);
    }
    
    public String getFilesMetadata(final String fileContent) {
        return this.getFilesMetadata(null, null, fileContent, null, null);
    }
    
    public String getFilesMetadata(final InputStream inputStream) {
        return this.getFilesMetadata(null, null, null, inputStream, null);
    }
    
    private String getFileTypeCd(final String containerName, final String fileName, final String fileContent, final InputStream inputStream, final ScanProperties scanProperties) {
        final Dmh5210 dmh5210 = new Dmh5210();
        dmh5210.init(scanProperties);
        dmh5210.setDebug(this.debug);
        dmh5210.ProcessSingleFile(null, null, null, containerName, fileName, null, fileContent, inputStream);
        return dmh5210.getFileTypeCd();
    }
    
    public String getFileTypeCd(final String containerName, final String fileName) {
        return this.getFileTypeCd(containerName, fileName, null, null, null);
    }
    
    public String getFileTypeCd(final String containerName, final String fileName, final ScanProperties scanProperties) {
        return this.getFileTypeCd(containerName, fileName, null, null, scanProperties);
    }
    
    public String getFileTypeCd(final String fileContent) {
        return this.getFileTypeCd(null, null, fileContent, null, null);
    }
    
    public String getFileTypeCd(final String fileContent, final ScanProperties scanProperties) {
        return this.getFileTypeCd(null, null, fileContent, null, scanProperties);
    }
    
    public String getFileTypeCd(final InputStream inputStream) {
        return this.getFileTypeCd(null, null, null, inputStream, null);
    }
    
    public String getFileTypeCd(final InputStream inputStream, final ScanProperties scanProperties) {
        return this.getFileTypeCd(null, null, null, inputStream, scanProperties);
    }
    
    @Override
    public Map<String, IMetadataValueType> getGeneralMetadataTypes() {
        if (this.generalMetadataTypes != null) {
            return this.generalMetadataTypes;
        }
        (this.generalMetadataTypes = new HashMap<String, IMetadataValueType>()).put("blankLines", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("callAERTDLI", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("callCBLTDLI", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("commentLines", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("copyReplacing", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("CSECT", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("dataDivision", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("DFHMSD", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("ENTRY", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("environmentDivision", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("execCICS", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("execPgm", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("execStmt", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("execSQL", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("identificationDivision", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("jobCard", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("nonCommentAfter1st", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("nonCommentBefore1st", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("nonCommentLines", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("OPTIONS", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("procedureDivision", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("recordCount", IMetadataValueType.NUMBER);
        this.generalMetadataTypes.put("splittingNodes", IMetadataValueType.NUMBER);
        return this.generalMetadataTypes;
    }
    
    private String getLanguageCd(final String containerName, final String fileName, final String fileContent, final InputStream inputStream, final ScanProperties scanProperties) {
        final Dmh5210 dmh5210 = new Dmh5210();
        dmh5210.init(scanProperties);
        dmh5210.setDebug(this.debug);
        dmh5210.ProcessSingleFile(null, null, null, containerName, fileName, null, fileContent, inputStream);
        return dmh5210.getLanguageCd();
    }
    
    public String getLanguageCd(final String containerName, final String fileName) {
        return this.getLanguageCd(containerName, fileName, null, null, null);
    }
    
    public String getLanguageCd(final String containerName, final String fileName, final ScanProperties scanProperties) {
        return this.getLanguageCd(containerName, fileName, null, null, scanProperties);
    }
    
    public String getLanguageCd(final String fileContent) {
        return this.getLanguageCd(null, null, fileContent, null, null);
    }
    
    public String getLanguageCd(final String fileContent, final ScanProperties scanProperties) {
        return this.getLanguageCd(null, null, fileContent, null, scanProperties);
    }
    
    public String getLanguageCd(final InputStream inputStream) {
        return this.getLanguageCd(null, null, null, inputStream, null);
    }
    
    public String getLanguageCd(final InputStream inputStream, final ScanProperties scanProperties) {
        return this.getLanguageCd(null, null, null, inputStream, scanProperties);
    }
    
    @Override
    public IScannerData scan(final InputStream inputStream, final Map<String, String> properties) {
        final ScanProperties scanProperties = new ScanProperties();
        if (properties != null) {
            final String scannedFileAllowIncludeInAnyColumn = properties.get("scanned.file.allowIncludeInAnyColumn");
            scanProperties.setAllowIncludeInAnyColumn(scannedFileAllowIncludeInAnyColumn);
            final String scannedFileCaptureComments = properties.get("scanned.file.capture.comments");
            scanProperties.setCaptureComments(scannedFileCaptureComments);
            final String scannedFileCaptureEntryPoints = properties.get("scanned.file.capture.entry.points");
            scanProperties.setCaptureEntryPoints(scannedFileCaptureEntryPoints);
            final String scannedFileCaptureExecStatements = properties.get("scanned.file.capture.exec.statements");
            scanProperties.setCaptureExecStatements(scannedFileCaptureExecStatements);
            final String scannedFileCaptureLiterals = properties.get("scanned.file.capture.literals");
            scanProperties.setCaptureLiterals(scannedFileCaptureLiterals);
            final String scannedFileCapturePictures = properties.get("scanned.file.capture.pictures");
            scanProperties.setCapturePictures(scannedFileCapturePictures);
            final String scannedFileCaptureSymbolsReserved = properties.get("scanned.file.capture.symbols.reserved");
            scanProperties.setCaptureSymbolsReserved(scannedFileCaptureSymbolsReserved);
            final String scannedFileCaptureSymbolsUserDefined = properties.get("scanned.file.capture.symbols.user.defined");
            scanProperties.setCaptureSymbolsUserDefined(scannedFileCaptureSymbolsUserDefined);
            final String scannedFileCodePage = properties.get("scanned.file.code.page");
            scanProperties.setCodePage(scannedFileCodePage);
            final String scannedFileExpandIncludeInComment = properties.get("scanned.file.expandIncludeInComment");
            scanProperties.setExpandIncludeInComment(scannedFileExpandIncludeInComment);
            final String scannedFileFreeFormatCobol = properties.get("scanned.file.freeFormatCobol");
            scanProperties.setFreeFormatCobol(scannedFileFreeFormatCobol);
            final String scannedFileLanguageHint = properties.get("scanned.file.language.hint");
            scanProperties.setLanguageHint(scannedFileLanguageHint);
            final String scannedFileNLSCharacters = properties.get("scanned.file.mvs.codepage.nls.characters");
            scanProperties.setMvsCodePage(scannedFileNLSCharacters);
            final String scannedFileReportNetViewMacros = properties.get("scanned.file.report.net.view.macros");
            scanProperties.setReportNetViewMacros(scannedFileReportNetViewMacros);
            final String scannedFileTruncateFilenames = properties.get("scanned.file.truncate.filenames");
            scanProperties.setTruncateFilenames(scannedFileTruncateFilenames);
        }
        final Dmh5210 dmh5210 = new Dmh5210();
        dmh5210.init(scanProperties);
        dmh5210.setDebug(this.debug);
        final SingleFilesMetadata file = dmh5210.processSingleFile(inputStream);
        return this.generateScannerData(file);
    }
    
    private ScannerData generateScannerData(final SingleFilesMetadata file) {
        final ScannerData scannerData = new ScannerData();
        final ClassifierMetaData metaData = file.getMetaData();
        scannerData.setLanguage(file.getLanguageCd());
        scannerData.setFileType(file.getFileTypeCd());
        this.gatherNumericAttributes(metaData, scannerData);
        this.gatherCharacterAttributes(metaData, scannerData);
        this.gatherControlTransfers(metaData, scannerData);
        this.gatherIncludeFileReferences(metaData, scannerData);
        this.gatherCicsMapsetReferences(metaData, scannerData);
        return scannerData;
    }
    
    private void gatherCharacterAttributes(final ClassifierMetaData metaData, final ScannerData scannerData) {
        final Map<Integer, String> attcList = metaData.getAttcList();
        if (attcList == null) {
            return;
        }
        final Set<Integer> keys = attcList.keySet();
        for (final Integer key : keys) {
            final String attrName = Dmh5210.getCharacterAttrName(key);
            scannerData.addGeneralProperty(attrName, attcList.get(key));
        }
    }
    
    private void gatherCicsMapsetReferences(final ClassifierMetaData metaData, final ScannerData scannerData) {
        final Map<String, Set<String>> mapSetList = metaData.getMapSetList();
        if (mapSetList == null) {
            return;
        }
        boolean firstMapSet = true;
        String currentMapSetName = "";
        final Set<String> mapSetNames = mapSetList.keySet();
        for (String mapSetName : mapSetNames) {
            final Set<String> mapNames = mapSetList.get(mapSetName);
            for (final String mapName : mapNames) {
                if (mapSetName.length() == 0) {
                    mapSetName = mapName;
                }
                if (firstMapSet) {
                    firstMapSet = false;
                    currentMapSetName = mapSetName;
                }
                else {
                    if (mapSetName.equals(currentMapSetName)) {
                        continue;
                    }
                    currentMapSetName = mapSetName;
                }
            }
        }
    }
    
    private void gatherControlTransfers(final ClassifierMetaData metaData, final ScannerData scannerData) {
        final Map<String, Set<String>> controlTransfers = metaData.getControlTransfers();
        if (controlTransfers == null) {
            return;
        }
        final Set<String> types = controlTransfers.keySet();
        for (final String type : types) {
            final Set<String> targets = controlTransfers.get(type);
            for (final String target : targets) {
                scannerData.addDependencyData(target, type, "MAIN", null, true);
            }
        }
    }
    
    private void gatherIncludeFileReferences(final ClassifierMetaData metaData, final ScannerData scannerData) {
        final Map<Integer, Map<String, Integer>> inclList = metaData.getInclList();
        if (inclList == null) {
            return;
        }
        final Set<Integer> inclTypeIds = inclList.keySet();
        for (final Integer inclTypeId : inclTypeIds) {
            final Set<String> inclNames = inclList.get(inclTypeId).keySet();
            for (final String inclName : inclNames) {
                final IncludedFileMetaData includedFileMetaData = Dmh5210.decodeInclData(inclTypeId, inclName);
                final String mdInclName = includedFileMetaData.getInclName();
                final String mdType = includedFileMetaData.getType();
                final String mdFileTypeCd = includedFileMetaData.getFileTypeCd();
                final String mdDdName = includedFileMetaData.getDdName();
                scannerData.addDependencyData(mdInclName, mdType, mdFileTypeCd, mdDdName);
            }
        }
    }
    
    private void gatherNumericAttributes(final ClassifierMetaData metaData, final ScannerData scannerData) {
        final Map<Integer, Integer> attnList = metaData.getAttnList();
        if (attnList == null) {
            return;
        }
        final Set<Integer> keys = attnList.keySet();
        for (final Integer key : keys) {
            final String attrName = Dmh5210.getNumericAttrName(key, metaData.getLanguageCd());
            scannerData.addGeneralProperty(attrName, attnList.get(key));
        }
    }
    
    public void setDebug(final int setting) {
        this.debug = setting;
    }
    
    static {
        versionTokens = new String[] { "V6.1.0.21", "97247" };
    }
}
