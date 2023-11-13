// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.utils;

import java.io.UnsupportedEncodingException;
import java.io.ByteArrayOutputStream;
import com.ibm.dmh.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import com.ibm.dmh.util.Environment;

public class FileHandler
{
    private boolean isWindows;
    private static final int SZLIBN = 230;
    private static final int SZLIBM = 254;
    private String containerName;
    private String containerNameNoQuotes;
    private String fileName;
    private String fileNameNoQuotes;
    private String localName;
    private String rmDDName;
    private String rmType;
    
    public FileHandler(final String iContainerName, final String iFileName, final String iLocalName) {
        this.containerName = iContainerName;
        this.containerNameNoQuotes = null;
        this.fileName = iFileName;
        this.fileNameNoQuotes = null;
        this.isWindows = Environment.isWindows();
        this.localName = iLocalName;
        this.rmDDName = "";
        this.rmType = null;
    }
    
    private String fileSpec(final String iContainerName, final String iFileName) {
        return iContainerName + File.separator + iFileName;
    }
    
    public String getFileContent(final String iPathName, final String codePage) {
        if (iPathName == null) {
            return null;
        }
        FileInputStream fis = null;
        String fileContents = null;
        try {
            fis = new FileInputStream(iPathName);
        }
        catch (FileNotFoundException e) {
            return null;
        }
        try {
            fileContents = readInputStream(fis, codePage);
            fis.close();
        }
        catch (IOException e2) {
            return null;
        }
        return fileContents;
    }
    
    public String getFileToOpen() {
        return this.setupFileSpecForOpen();
    }
    
    public String getRmType() {
        if (this.rmType == null) {
            this.setRmType("");
        }
        return this.rmType;
    }
    
    public String getNormalizedContainerName() {
        if (this.containerNameNoQuotes == null) {
            this.containerNameNoQuotes = this.normalizeName(this.containerName, 230, true, true);
        }
        return this.containerNameNoQuotes;
    }
    
    public String getNormalizedFileName() {
        if (this.fileNameNoQuotes == null) {
            this.fileNameNoQuotes = this.normalizeName(this.fileName, 254, true, true);
        }
        return this.fileNameNoQuotes;
    }
    
    private String normalizeName(final String iName, int iMaxNameLength, final boolean stripLeadingBlanks, final boolean stripTrailingBlanks) {
        String workName1 = "";
        String workName2 = "";
        String workName3 = "";
        if (iName.length() == 0) {
            return workName3;
        }
        if (iMaxNameLength > 1024) {
            iMaxNameLength = 1024;
            workName1 = iName.substring(0, iMaxNameLength);
        }
        else {
            workName1 = iName;
        }
        String pCharStart = workName1;
        if (pCharStart.charAt(0) == '\"') {
            pCharStart = StringUtils.strip(workName1, "\"");
        }
        workName2 = pCharStart;
        if (stripLeadingBlanks) {
            workName3 = workName2;
            final int length = workName3.length();
            pCharStart = workName3;
            for (int i = 0; i < length && pCharStart.charAt(0) == ' '; pCharStart = pCharStart.substring(1), ++i) {}
            workName2 = "";
            workName2 = pCharStart;
            workName3 = "";
        }
        int length = workName2.length();
        workName3 = workName2;
        if (stripTrailingBlanks) {
            while (workName3.charAt(length - 1) == ' ') {
                workName3 = workName3.substring(0, length - 1);
                --length;
            }
        }
        return workName3;
    }
    
    public static String readInputStream(final InputStream readStream, final String codePage) throws IOException {
        final int BUFF_SIZE = 4096;
        final ByteArrayOutputStream accumulator = new ByteArrayOutputStream();
        final byte[] buffer = new byte[4096];
        int currentSize = 0;
        for (int readSize = readStream.read(buffer, 0, 4096); readSize >= 0; readSize = readStream.read(buffer, 0, 4096)) {
            accumulator.write(buffer, 0, readSize);
            currentSize += readSize;
        }
        if (codePage == null) {
            return accumulator.toString();
        }
        String contents;
        try {
            contents = accumulator.toString(codePage);
        }
        catch (UnsupportedEncodingException e) {
            contents = accumulator.toString();
        }
        return contents;
    }
    
    public void setRmDDName(final String iRmDDName) {
        if (this.getRmType().equals("PAN")) {
            if (iRmDDName == null || iRmDDName.length() == 0) {
                this.rmDDName = "PANDD1";
            }
            else {
                this.rmDDName = iRmDDName;
            }
        }
        else {
            this.rmDDName = "";
        }
    }
    
    public void setRmType(final String iRmType) {
        if (iRmType == null || iRmType.length() == 0) {
            this.rmType = "NTFS";
        }
        else {
            this.rmType = iRmType;
        }
    }
    
    private String setupFileSpecForOpen() {
        final String localFileNoQuotes = this.normalizeName(this.localName, 230, true, true);
        if (this.localName.length() != 0) {
            return localFileNoQuotes;
        }
        return this.fileSpec(this.getNormalizedContainerName(), this.getNormalizedFileName());
    }
}
