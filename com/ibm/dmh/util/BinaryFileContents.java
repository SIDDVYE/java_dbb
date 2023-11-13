// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.IOException;

public class BinaryFileContents extends FileContents
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2016, 2019\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private byte[] contents;
    
    public BinaryFileContents() {
        this.contents = new byte[0];
    }
    
    @Override
    public boolean isText() {
        return false;
    }
    
    public byte[] getBinaryFileContents(final String iPathName) throws IOException {
        if (FileContents.useZFile(iPathName)) {
            ZFile zFile = null;
            try {
                zFile = this.createZFile(iPathName, true);
                this.readFile(zFile);
            }
            finally {
                if (zFile != null) {
                    try {
                        zFile.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        else {
            final File file = this.createFile(iPathName);
            this.readFile(file);
        }
        return this.contents;
    }
    
    public void readFile(final InputStream is) throws IOException {
        this.readFile(is, 8096);
    }
    
    @Override
    protected void readFile(InputStream is, int iFileSize) throws IOException {
        if (iFileSize <= 0) {
            iFileSize = 1024;
        }
        try {
            is = this.calculateFileHash(is);
            is = new BufferedInputStream(is, 32768);
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final byte[] dataBuffer = new byte[16384];
            int size = 0;
            while ((size = is.read(dataBuffer)) != -1) {
                out.write(dataBuffer, 0, size);
            }
            this.contents = out.toByteArray();
        }
        finally {
            if (is != null) {
                try {
                    is.close();
                }
                catch (IOException ex) {}
            }
        }
    }
    
    public void saveFile(final String iFilename) throws IOException {
        final String targetFilename = (iFilename == null) ? this.getFileName() : iFilename;
        ZFile zFile = null;
        OutputStream os = null;
        try {
            if (FileContents.useZFile(targetFilename)) {
                zFile = this.createZFile(targetFilename, false);
                os = zFile.getOutputStream();
            }
            else {
                File f = new File(targetFilename);
                f = f.getAbsoluteFile();
                if (f.exists()) {
                    f.delete();
                }
                final File parent = f.getParentFile();
                if (!parent.exists()) {
                    parent.mkdirs();
                }
                os = new FileOutputStream(targetFilename, false);
            }
            os = new BufferedOutputStream(os);
            os.write(this.getContents());
            os.flush();
        }
        finally {
            if (os != null) {
                os.close();
                os = null;
            }
            if (zFile != null) {
                try {
                    zFile.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public byte[] getContents() {
        return this.contents;
    }
    
    public void setContents(final byte[] iContents) {
        this.contents = iContents;
    }
    
    public static void main(final String[] argsParm) {
        try {
            if (argsParm.length < 4) {
                System.err.format("Syntax: java com.ibm.dmh.util.BinaryFileContents -input file-or-dataset -output file-or-dataset [-fileInput] [-fileOutput]\n", new Object[0]);
                System.exit(1);
            }
            final Args args = new Args(argsParm, new String[] { "input", "output", "fileInput", "fileOutput" });
            String inputFileName = args.get("input");
            String outputFileName = args.get("output");
            FileType outputFileType;
            FileType inputFileType = outputFileType = (Environment.isZOS() ? FileType.MVS_PDSMEM_OR_SEQ : FileType.NON_MVS);
            if (StringUtils.isEmpty(inputFileName)) {
                throw new IllegalArgumentException("Missing -input parameter");
            }
            if (StringUtils.isEmpty(outputFileName)) {
                throw new IllegalArgumentException("Missing -output parameter");
            }
            if (Environment.isZOS()) {
                final String inputFile = args.get("fileInput", null);
                if (inputFile != null) {
                    inputFileType = FileType.NON_MVS;
                }
                final String outputFile = args.get("fileOutput", null);
                if (outputFile != null) {
                    outputFileType = FileType.NON_MVS;
                }
            }
            inputFileName = Args.getCanonicalName(inputFileName, inputFileType == FileType.NON_MVS);
            outputFileName = Args.getCanonicalName(outputFileName, outputFileType == FileType.NON_MVS);
            final BinaryFileContents fc = new BinaryFileContents();
            byte[] b = null;
            try {
                b = fc.getBinaryFileContents(inputFileName);
                System.out.format("%s is %d bytes\n", inputFileName, b.length);
                try {
                    fc.saveFile(outputFileName);
                    System.out.format("Wrote to %s\n", outputFileName);
                }
                catch (IOException e) {
                    System.out.format("Failure saving %s: %s\n", inputFileName, e.getLocalizedMessage());
                }
            }
            catch (IOException e) {
                System.out.format("Failure reading %s: %s\n", inputFileName, e.getLocalizedMessage());
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
