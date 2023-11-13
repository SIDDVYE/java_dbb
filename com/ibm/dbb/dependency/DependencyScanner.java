// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.build.BuildProperties;
import com.ibm.dmh.scan.classify.IncludedFileMetaData;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import com.ibm.dmh.scan.classify.SingleFilesMetadata;
import com.ibm.dmh.scan.classify.ScanProperties;
import com.ibm.dmh.scan.classify.Dmh5210;
import java.io.InputStream;
import org.slf4j.Logger;

public class DependencyScanner extends AbstractDependencyScanner
{
    private String allowIncludeInAnyColumn;
    private String expandIncludeInComment;
    private String freeFormatCobol;
    private String languageHint;
    private String scanNetviewDependencies;
    private String defaultLibrary;
    private String collectControlTransfers;
    private static final String SYSLIB_LIBRARY = "SYSLIB";
    private static final String OPTION_ALLOW_INCLUDE_IN_ANY_COLUMN = "dbb.DependencyScanner.allowIncludeInAnyColumn";
    private static final String OPTION_EXPAND_INCLUDE_IN_COMMENT = "dbb.DependencyScanner.expandIncludeInComment";
    private static final String OPTION_FREE_FORMAT_COBOL = "dbb.DependencyScanner.freeFormatCobol";
    private static final String OPTION_LANGUAGE_HINT = "dbb.DependencyScanner.languageHint";
    private static final String OPTION_SCAN_NETVIEW_DEPS = "dbb.DependencyScanner.scanNetviewDependencies";
    private static final String OPTION_DEFAULT_LIBRARY = "dbb.DependencyScanner.defaultLibrary";
    private static final String OPTION_CONTROL_TRANSFERS = "dbb.DependencyScanner.controlTransfers";
    protected static Logger logger;
    
    @Override
    protected Object runScan(final String file, final InputStream is, final String encoding) {
        final ScanProperties properties = this.createScanProperties(file, encoding);
        final Dmh5210 dmh5210 = new Dmh5210();
        dmh5210.init(properties);
        return dmh5210.processSingleFile(is);
    }
    
    @Override
    protected LogicalFile createLogicalFile(final String file, final Object scanMetadata) {
        final SingleFilesMetadata dmhfile = (SingleFilesMetadata)scanMetadata;
        final boolean cics = this.hasAttribute(dmhfile, 30);
        final boolean sql = this.hasAttribute(dmhfile, 33);
        final boolean dli = this.hasAttribute(dmhfile, 31);
        final boolean mq = this.hasAttribute(dmhfile, 901);
        final LogicalFile lfile = new LogicalFile(this.createLogicalName(file), file, dmhfile.getLanguageCd(), cics, sql, dli, mq);
        final Map<Integer, Map<String, Integer>> includeList = (Map<Integer, Map<String, Integer>>)dmhfile.getMetaData().getInclList();
        if (includeList != null) {
            for (final Map.Entry<Integer, Map<String, Integer>> entry : includeList.entrySet()) {
                final Integer includeType = entry.getKey();
                final Map<String, Integer> includes = entry.getValue();
                for (final String include : includes.keySet()) {
                    final IncludedFileMetaData includedFileMetaData = Dmh5210.decodeInclData(includeType, include);
                    String lname = includedFileMetaData.getInclName();
                    if (lname != null && lname.length() > 0) {
                        lname = this.createLogicalName(lname);
                    }
                    String library = includedFileMetaData.getDdName();
                    if (library == null || library.length() == 0) {
                        library = ((this.getDefaultLibrary() != null) ? this.getDefaultLibrary() : this.getFileProperty("dbb.DependencyScanner.defaultLibrary", file));
                        if (library == null || library.length() == 0) {
                            library = "SYSLIB";
                        }
                    }
                    final String category = includedFileMetaData.getType();
                    final int max = 32;
                    if (lname.length() <= max && library.length() <= max && category.length() <= max) {
                        lfile.addLogicalDependency(new LogicalDependency(lname, library, category));
                    }
                    else {
                        DependencyScanner.logger.debug("Skipping logical dependency due to field size exceeding max length of " + max);
                        DependencyScanner.logger.debug("lname = " + lname + " : library = " + library + " : category = " + category);
                    }
                }
            }
        }
        final String gatherCallTransfers = (this.getCollectControlTransfers() != null) ? this.getCollectControlTransfers() : this.getFileProperty("dbb.DependencyScanner.controlTransfers", file);
        if (gatherCallTransfers != null && Boolean.parseBoolean(gatherCallTransfers)) {
            final Map<String, Set<String>> controlTransfers = (Map<String, Set<String>>)dmhfile.getMetaData().getControlTransfers();
            if (controlTransfers != null) {
                final Set<String> types = controlTransfers.keySet();
                for (final String type : types) {
                    final Set<String> targets = controlTransfers.get(type);
                    for (final String target : targets) {
                        lfile.addLogicalDependency(new LogicalDependency(target, "SYSLIB", type));
                    }
                }
            }
        }
        return lfile;
    }
    
    private ScanProperties createScanProperties(final String file, final String encoding) {
        final ScanProperties scanProperties = new ScanProperties();
        scanProperties.setCodePage(encoding);
        scanProperties.setLanguageHint((this.getLanguageHint() != null) ? this.getLanguageHint() : this.getFileProperty("dbb.DependencyScanner.languageHint", file));
        scanProperties.setAllowIncludeInAnyColumn((this.getAllowIncludeInAnyColumn() != null) ? this.getAllowIncludeInAnyColumn() : this.getFileProperty("dbb.DependencyScanner.allowIncludeInAnyColumn", file));
        scanProperties.setExpandIncludeInComment((this.getExpandIncludeInComment() != null) ? this.getExpandIncludeInComment() : this.getFileProperty("dbb.DependencyScanner.expandIncludeInComment", file));
        scanProperties.setFreeFormatCobol((this.getFreeFormatCobol() != null) ? this.getFreeFormatCobol() : this.getFileProperty("dbb.DependencyScanner.freeFormatCobol", file));
        scanProperties.setReportNetViewMacros((this.getScanNetviewDependencies() != null) ? this.getScanNetviewDependencies() : this.getFileProperty("dbb.DependencyScanner.scanNetviewDependencies", file));
        return scanProperties;
    }
    
    private boolean hasAttribute(final SingleFilesMetadata dmhfile, final Integer attributeKey) {
        final Map<Integer, Integer> attnList = (Map<Integer, Integer>)dmhfile.getMetaData().getAttnList();
        final Integer numStatements = attnList.get(attributeKey);
        return numStatements != null && numStatements > 0;
    }
    
    private String getFileProperty(final String key, final String file) {
        String value = BuildProperties.getFileProperty(key, file);
        if (value == null) {
            final String key2 = key.replace("dbb.DependencyScanner", "scanner");
            value = BuildProperties.getFileProperty(key2, file);
        }
        return value;
    }
    
    public String getAllowIncludeInAnyColumn() {
        return this.allowIncludeInAnyColumn;
    }
    
    public String getExpandIncludeInComment() {
        return this.expandIncludeInComment;
    }
    
    public String getFreeFormatCobol() {
        return this.freeFormatCobol;
    }
    
    public String getLanguageHint() {
        return this.languageHint;
    }
    
    public String getScanNetviewDependencies() {
        return this.scanNetviewDependencies;
    }
    
    public String getDefaultLibrary() {
        return this.defaultLibrary;
    }
    
    public String getCollectControlTransfers() {
        return this.collectControlTransfers;
    }
    
    public void setAllowIncludeInAnyColumn(final String allowIncludeInAnyColumn) {
        this.allowIncludeInAnyColumn = allowIncludeInAnyColumn;
    }
    
    public void setExpandIncludeInComment(final String expandIncludeInComment) {
        this.expandIncludeInComment = expandIncludeInComment;
    }
    
    public void setFreeFormatCobol(final String freeFormatCobol) {
        this.freeFormatCobol = freeFormatCobol;
    }
    
    public void setLanguageHint(final String languageHint) {
        this.languageHint = languageHint;
    }
    
    public void setScanNetviewDependencies(final String scanNetviewDependencies) {
        this.scanNetviewDependencies = scanNetviewDependencies;
    }
    
    public void setDefaultLibrary(final String defaultLibrary) {
        this.defaultLibrary = defaultLibrary;
    }
    
    public void setCollectControlTransfers(final String collectControlTransfers) {
        this.collectControlTransfers = collectControlTransfers;
    }
    
    static {
        DependencyScanner.logger = LoggerFactory.getLogger((Class)DependencyScanner.class);
    }
}
