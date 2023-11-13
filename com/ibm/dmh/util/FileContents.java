// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.File;

public abstract class FileContents
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2015, 2019\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private String fileName;
    private boolean calculateFileHash;
    private Long fileHash;
    
    protected FileContents() {
        this.calculateFileHash = false;
        this.fileName = null;
        this.fileHash = null;
    }
    
    protected File createFile(final String pathName) {
        final File file = new File(pathName);
        return file;
    }
    
    public void setCalculateFileHash(final boolean setting) {
        this.calculateFileHash = setting;
    }
    
    public boolean isCalculateFileHash() {
        return this.calculateFileHash;
    }
    
    protected InputStream calculateFileHash(InputStream is) throws IOException {
        if (this.isCalculateFileHash()) {
            is = new BufferedInputStream(is, 32768);
            final ByteArrayOutputStream accumulator = new ByteArrayOutputStream();
            final byte[] dataBuffer = new byte[16384];
            int size = 0;
            while ((size = is.read(dataBuffer)) != -1) {
                accumulator.write(dataBuffer, 0, size);
            }
            final byte[] bytes = accumulator.toByteArray();
            is = new ByteArrayInputStream(bytes);
            this.fileHash = HashAlgorithms.useProprietaryAlgorithm(is);
            is = new ByteArrayInputStream(bytes);
        }
        return is;
    }
    
    public Long getFileHash() {
        return this.fileHash;
    }
    
    protected ZFile createZFile(final String pathName, final boolean isRead) throws IOException {
        final ZFile file = new ZFile(pathName, this.getAccessType(isRead));
        return file;
    }
    
    public static void delete(final String pathName) throws IOException {
        if (Environment.isZOS()) {
            ZFile.delete(pathName);
        }
        else {
            final TextFileContents fc = new TextFileContents();
            final File file = fc.createFile(pathName);
            if (file != null) {
                file.delete();
            }
        }
    }
    
    private ZFile.AccessType getAccessType(final boolean isRead) {
        if (this.isText()) {
            if (isRead) {
                return ZFile.AccessType.READ_TEXT;
            }
            return ZFile.AccessType.WRITE_TEXT;
        }
        else {
            if (isRead) {
                return ZFile.AccessType.READ_BINARY;
            }
            return ZFile.AccessType.WRITE_BINARY;
        }
    }
    
    public String getFileName() {
        return this.fileName;
    }
    
    public abstract boolean isText();
    
    protected void readFile(final File file) throws IOException {
        this.setFileName(file.getAbsolutePath());
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            this.readFile(is, (int)file.length());
        }
        finally {
            try {
                if (is != null) {
                    is.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    protected abstract void readFile(final InputStream p0, final int p1) throws IOException;
    
    protected void readFile(final ZFile file) throws IOException {
        this.fileHash = null;
        this.setFileName(file.getActualFilename());
        InputStream is = null;
        try {
            is = file.getInputStream();
            this.readFile(is, 8096);
        }
        finally {
            try {
                if (is != null) {
                    is.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }
    
    static boolean useZFile(final String fileName) {
        final boolean result = Environment.isZOS() && fileName.indexOf("/") == -1;
        return result;
    }
    
    public enum FileType
    {
        MVS_PDSMEM_OR_SEQ, 
        NON_MVS;
    }
}
