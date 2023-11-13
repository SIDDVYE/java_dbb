// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify;

import com.ibm.dmh.util.StringUtils;

public class ScanProperties
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2014, 2019\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static final String defaultCodePage = "UTF-8";
    public static final String JSON_RESPONSE_FORMAT_ADI = "ADI";
    public static final String JSON_RESPONSE_FORMAT_DEFAULT = "";
    public static final String JSON_RESPONSE_FORMAT_IBM_SERVICES = "GBS";
    public static final String JSON_RESPONSE_FORMAT_PRETTY = "PRETTY";
    private boolean allowIncludeInAnyColumn;
    private boolean expandIncludeInComment;
    private boolean freeFormatCobol;
    private boolean noPLX;
    private boolean truncateFilenames;
    private String codePage;
    private String languageHint;
    private String mvsCodePage;
    private boolean captureComments;
    private boolean captureEntryPoints;
    private boolean captureExecStatements;
    private boolean captureLiterals;
    private boolean capturePictures;
    private boolean captureSymbolsReserved;
    private boolean captureSymbolsUserDefined;
    private String jsonResponseFormat;
    private boolean reportNetViewMacros;
    
    public ScanProperties() {
        this.allowIncludeInAnyColumn = false;
        this.codePage = "UTF-8";
        this.expandIncludeInComment = true;
        this.freeFormatCobol = false;
        this.mvsCodePage = null;
        this.noPLX = false;
        this.languageHint = "UNKN";
        this.truncateFilenames = false;
        this.captureComments = false;
        this.captureEntryPoints = false;
        this.captureExecStatements = false;
        this.captureLiterals = false;
        this.capturePictures = false;
        this.captureSymbolsReserved = false;
        this.captureSymbolsUserDefined = false;
        this.jsonResponseFormat = "";
        this.reportNetViewMacros = false;
    }
    
    public boolean getAllowIncludeInAnyColumn() {
        return this.allowIncludeInAnyColumn;
    }
    
    public boolean getCaptureComments() {
        return this.captureComments;
    }
    
    public boolean getCaptureEntryPoints() {
        return this.captureEntryPoints;
    }
    
    public boolean getCaptureExecStatements() {
        return this.captureExecStatements;
    }
    
    public boolean getCaptureLiterals() {
        return this.captureLiterals;
    }
    
    public boolean getCapturePictures() {
        return this.capturePictures;
    }
    
    public boolean getCaptureSymbolsReserved() {
        return this.captureSymbolsReserved;
    }
    
    public boolean getCaptureSymbolsUserDefined() {
        return this.captureSymbolsUserDefined;
    }
    
    public String getCodePage() {
        return this.codePage;
    }
    
    public boolean getExpandIncludeInComment() {
        return this.expandIncludeInComment;
    }
    
    public boolean getFreeFormatCobol() {
        return this.freeFormatCobol;
    }
    
    public String getJsonResponseFormat() {
        return this.jsonResponseFormat;
    }
    
    public String getLanguageHint() {
        return this.languageHint;
    }
    
    public String getMvsCodePage() {
        return this.mvsCodePage;
    }
    
    public boolean getNoPLX() {
        return this.noPLX;
    }
    
    public boolean getReportNetViewMacros() {
        return this.reportNetViewMacros;
    }
    
    public boolean getTruncateFilenames() {
        return this.truncateFilenames;
    }
    
    public void setAllowIncludeInAnyColumn(final String iSetting) {
        this.allowIncludeInAnyColumn = this.validateBooleanProperty(iSetting, false);
    }
    
    public void setCaptureComments(final String setting) {
        this.captureComments = this.validateBooleanProperty(setting, false);
    }
    
    public void setCaptureEntryPoints(final String setting) {
        this.captureEntryPoints = this.validateBooleanProperty(setting, false);
    }
    
    public void setCaptureExecStatements(final String setting) {
        this.captureExecStatements = this.validateBooleanProperty(setting, false);
    }
    
    public void setCaptureLiterals(final String setting) {
        this.captureLiterals = this.validateBooleanProperty(setting, false);
    }
    
    public void setCapturePictures(final String setting) {
        this.capturePictures = this.validateBooleanProperty(setting, false);
    }
    
    public void setCaptureSymbolsReserved(final String setting) {
        this.captureSymbolsReserved = this.validateBooleanProperty(setting, false);
    }
    
    public void setCaptureSymbolsUserDefined(final String setting) {
        this.captureSymbolsUserDefined = this.validateBooleanProperty(setting, false);
    }
    
    public void setCodePage(final String setting) {
        if (StringUtils.isEmpty(setting)) {
            this.codePage = "UTF-8";
        }
        else {
            this.codePage = setting;
        }
    }
    
    public void setExpandIncludeInComment(final String setting) {
        this.expandIncludeInComment = this.validateBooleanProperty(setting, true);
    }
    
    public void setFreeFormatCobol(final String setting) {
        this.freeFormatCobol = this.validateBooleanProperty(setting, false);
    }
    
    public void setJsonResponseFormat(final String setting) {
        if (StringUtils.isEmpty(setting)) {
            this.jsonResponseFormat = "";
        }
        else if (setting.equalsIgnoreCase("ADI")) {
            this.jsonResponseFormat = "ADI";
        }
        else if (setting.equalsIgnoreCase("GBS")) {
            this.jsonResponseFormat = "GBS";
        }
        else if (setting.equalsIgnoreCase("PRETTY")) {
            this.jsonResponseFormat = "PRETTY";
        }
        else {
            this.jsonResponseFormat = "";
        }
    }
    
    public void setLanguageHint(final String setting) {
        this.languageHint = this.validateLanguageHint(setting, "UNKN");
    }
    
    public void setMvsCodePage(final String setting) {
        this.mvsCodePage = setting;
    }
    
    public void setNoPLX(final boolean setting) {
        this.noPLX = setting;
    }
    
    public void setReportNetViewMacros(final String setting) {
        this.reportNetViewMacros = this.validateBooleanProperty(setting, false);
    }
    
    public void setTruncateFilenames(final String setting) {
        this.truncateFilenames = this.validateBooleanProperty(setting, false);
    }
    
    private boolean validateBooleanProperty(final String setting, final boolean defaultBooleanValue) {
        if (StringUtils.isEmpty(setting)) {
            return defaultBooleanValue;
        }
        return setting.startsWith("t") || setting.startsWith("T");
    }
    
    private String validateLanguageHint(final String setting, final String defaultLanguageHint) {
        if (StringUtils.isEmpty(setting)) {
            return defaultLanguageHint;
        }
        if (setting.equals("ASM") || setting.equals("C") || setting.equals("COB") || setting.equals("CPP") || setting.equals("EASY") || setting.equals("ISPF") || setting.equals("JCL") || setting.equals("PLI") || setting.equals("PLX") || setting.equals("SORT") || setting.equals("TEXT") || setting.equals("UNKN") || setting.equals("XML") || setting.equals("ZBND")) {
            return setting;
        }
        return defaultLanguageHint;
    }
}
