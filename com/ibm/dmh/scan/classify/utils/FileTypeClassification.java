// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.utils;

import java.util.Set;
import java.util.Map;

public class FileTypeClassification
{
    public static final String METADATA_ATTCLIST = "attcList";
    public static final String METADATA_ATTNLIST = "attnList";
    public static final String METADATA_CONTAINER_ID = "containerId";
    public static final String METADATA_FILE_ID = "fileId";
    public static final String METADATA_INCLLIST = "inclList";
    public static final String METADATA_INCLUDED_FILE_CONTAINS_ENTRY = "includedFileContainsEntry";
    public static final String METADATA_PLX_IS_MAIN = "plxIsMain";
    public static final String METADATA_SEARCHED = "searched";
    public static final String METADATA_USED_AS_PROC = "usedAsProc";
    private Map<String, Object> filesMetadata;
    private String fileTypeCd;
    private String languageCd;
    
    public FileTypeClassification(final String languageCd, final Map<String, Object> filesMetadata) {
        this.filesMetadata = filesMetadata;
        this.languageCd = languageCd;
        this.fileTypeCd = null;
    }
    
    private void classifyAsm() {
        final Map<Integer, Integer> attnList = this.filesMetadata.get("attnList");
        if (attnList != null) {
            if (attnList.containsKey(39) && attnList.get(39) == 0) {
                if (attnList.containsKey(40) && attnList.get(40) != 0) {
                    this.fileTypeCd = "MAIN";
                }
                else {
                    this.fileTypeCd = "MAC";
                }
                return;
            }
            if (attnList.containsKey(65)) {
                this.fileTypeCd = "MAP";
                return;
            }
            if (attnList.containsKey(87)) {
                this.fileTypeCd = "MFS";
                return;
            }
        }
        final Map<Integer, Map<String, Integer>> inclList = this.filesMetadata.get("inclList");
        if (inclList != null && inclList.containsKey(8)) {
            final Map<String, Integer> inclNameMap = inclList.get(8);
            final Set<String> inclNames = inclNameMap.keySet();
            if (inclNames.contains("DBDGEN")) {
                this.fileTypeCd = "DBD";
                return;
            }
            if (inclNames.contains("PSBGEN")) {
                this.fileTypeCd = "PSB";
                return;
            }
        }
        if (fileContainsEntry(attnList, inclList)) {
            this.fileTypeCd = "MAIN";
            return;
        }
        final Boolean includedFileContainsEntry = this.filesMetadata.get("includedFileContainsEntry");
        if (includedFileContainsEntry) {
            this.fileTypeCd = "MAIN";
        }
        else {
            this.fileTypeCd = "INCL";
        }
    }
    
    private void classifyCobol() {
        final Map<Integer, Integer> attnList = this.filesMetadata.get("attnList");
        if (attnList != null && attnList.containsKey(34)) {
            this.fileTypeCd = "MAIN";
            return;
        }
        this.fileTypeCd = "INCL";
    }
    
    private void classifyEasytrieve() {
        final Map<Integer, Integer> attnList = this.filesMetadata.get("attnList");
        if (attnList != null && attnList.containsKey(39) && attnList.get(39) == 0) {
            this.fileTypeCd = "MAC";
            return;
        }
        this.fileTypeCd = "UNKN";
    }
    
    private void classifyJcl() {
        final Map<Integer, Integer> attnList = this.filesMetadata.get("attnList");
        if (attnList != null) {
            if (attnList.containsKey(39)) {
                final Integer value = attnList.get(39);
                if (value == 0) {
                    this.fileTypeCd = "PROC";
                    return;
                }
            }
            if (attnList.containsKey(52)) {
                this.fileTypeCd = "MAIN";
                return;
            }
        }
        final Boolean usedAsProc = this.filesMetadata.get("usedAsProc");
        if (usedAsProc) {
            this.fileTypeCd = "PROC";
        }
        else {
            this.fileTypeCd = "INCL";
        }
    }
    
    private void classifyPli() {
        final Map<Integer, Integer> attnList = this.filesMetadata.get("attnList");
        if (attnList != null && (attnList.containsKey(37) || attnList.containsKey(60)) && !attnList.containsKey(39)) {
            this.fileTypeCd = "MAIN";
        }
        else {
            this.fileTypeCd = "INCL";
        }
    }
    
    private void classifyPlx() {
        final Map<Integer, Integer> attnList = this.filesMetadata.get("attnList");
        if (attnList != null && attnList.containsKey(37)) {
            this.fileTypeCd = "MAIN";
            return;
        }
        final Boolean plxIsMain = this.filesMetadata.get("plxIsMain");
        if (plxIsMain) {
            this.fileTypeCd = "MAIN";
            return;
        }
        this.fileTypeCd = "INCL";
    }
    
    private void classifyText() {
        final Map<Integer, Integer> attnList = this.filesMetadata.get("attnList");
        if (attnList != null && attnList.containsKey(810)) {
            this.fileTypeCd = "CSD";
            return;
        }
        this.fileTypeCd = "";
    }
    
    public static boolean fileContainsEntry(final Map<Integer, Integer> iAttnList, final Map<Integer, Map<String, Integer>> iInclList) {
        if (iAttnList != null && (iAttnList.containsKey(46) || iAttnList.containsKey(57) || iAttnList.containsKey(47) || iAttnList.containsKey(82) || iAttnList.containsKey(84) || iAttnList.containsKey(85) || iAttnList.containsKey(86) || iAttnList.containsKey(58))) {
            return true;
        }
        if (iInclList != null && iInclList.containsKey(8)) {
            final Set<String> includedMacros = iInclList.get(8).keySet();
            return includedMacros.contains("DFHEIENT");
        }
        return false;
    }
    
    public String getFileTypeCd() {
        if (this.fileTypeCd == null) {
            this.run();
        }
        return this.fileTypeCd;
    }
    
    private void run() {
        if (this.languageCd.equals("ASM")) {
            this.classifyAsm();
        }
        else if (this.languageCd.equals("C") || this.languageCd.equals("CPP")) {
            this.fileTypeCd = "INCL";
        }
        else if (this.languageCd.equals("COB")) {
            this.classifyCobol();
        }
        else if (this.languageCd.equals("EASY")) {
            this.classifyEasytrieve();
        }
        else if (this.languageCd.equals("JCL")) {
            this.classifyJcl();
        }
        else if (this.languageCd.equals("PLI")) {
            this.classifyPli();
        }
        else if (this.languageCd.equals("PLX")) {
            this.classifyPlx();
        }
        else if (this.languageCd.equals("REXX")) {
            this.fileTypeCd = "MAIN";
        }
        else if (this.languageCd.equals("SORT") || this.languageCd.equals("ZBND")) {
            this.fileTypeCd = "";
        }
        else if (this.languageCd.equals("TEXT")) {
            this.classifyText();
        }
        else {
            this.fileTypeCd = "UNKN";
        }
    }
}
