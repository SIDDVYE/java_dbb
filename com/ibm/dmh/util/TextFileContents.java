// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Scanner;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.InputStream;

public class TextFileContents extends FileContents implements ITextFileContentsWriter
{
    int maxReuseCapacity;
    private String encoding;
    private StringBuffer contents;
    private boolean removeLineNumbers;
    
    public TextFileContents() {
        this.contents = new StringBuffer();
        this.encoding = null;
        this.maxReuseCapacity = 100000;
        this.removeLineNumbers = false;
    }
    
    @Override
    public boolean isText() {
        return true;
    }
    
    private BufferedReader createBufferedReader(final InputStream is) throws IOException {
        final CharsetDecoder decoder = (this.encoding == null) ? Charset.defaultCharset().newDecoder() : Charset.forName(this.encoding).newDecoder();
        decoder.onMalformedInput(CodingErrorAction.REPLACE);
        decoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        decoder.replaceWith(".");
        final InputStreamReader isr = new InputStreamReader(is, decoder);
        final BufferedReader reader = new BufferedReader(isr);
        return reader;
    }
    
    public String getFileContents(final String iPathName, final String iEncoding) throws FileNotFoundException, IOException {
        this.encoding = iEncoding;
        this.setFileName(iPathName);
        if (FileContents.useZFile(iPathName)) {
            ZFile zFile = null;
            try {
                zFile = this.createZFile(iPathName, true);
                this.readFile(zFile);
            }
            finally {
                try {
                    if (zFile != null) {
                        zFile.close();
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        else {
            final File file = this.createFile(iPathName);
            this.readFile(file);
        }
        return this.getContents();
    }
    
    public void readFile(final String iFilename, final String iEncoding) throws IOException {
        this.encoding = iEncoding;
        this.setFileName(iFilename);
        int fileLength = 0;
        InputStream is = null;
        try {
            final File f = new File(iFilename);
            if (!f.exists()) {
                is = ClassLoader.getSystemResourceAsStream(this.getFileName());
                if (is == null) {
                    is = this.getClass().getClassLoader().getResourceAsStream(this.getFileName());
                }
            }
            if (is == null) {
                is = new FileInputStream(f);
                fileLength = (int)f.length();
            }
            this.readFile(is, fileLength);
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
    
    public void readFile(final File file, final String iEncoding) throws IOException {
        this.encoding = iEncoding;
        this.readFile(file);
    }
    
    public void readFile(final InputStream is, final String iEncoding) throws IOException {
        this.encoding = iEncoding;
        this.readFile(is, 8096);
    }
    
    @Override
    protected void readFile(InputStream is, int iFileSize) throws IOException {
        if (iFileSize <= 0) {
            iFileSize = 1024;
        }
        if (this.contents.capacity() > this.maxReuseCapacity || this.contents.capacity() < iFileSize) {
            this.contents = new StringBuffer((int)(iFileSize * 1.2));
        }
        else {
            this.contents.setLength(0);
        }
        BufferedReader reader = null;
        try {
            is = this.calculateFileHash(is);
            reader = this.createBufferedReader(is);
            final char[] cbuf = new char[1024];
            int charsRead = 0;
            while ((charsRead = reader.read(cbuf, 0, 1024)) != -1) {
                this.contents.append(cbuf, 0, charsRead);
            }
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException ex) {}
            }
            reader = null;
            if (is != null) {
                try {
                    is.close();
                }
                catch (IOException ex2) {}
            }
            is = null;
        }
    }
    
    public String readFirstLine(final String iPathName, final String iEncoding) throws FileNotFoundException, IOException {
        return this.readFirstLine(iPathName, iEncoding, null);
    }
    
    public String readFirstLine(final String iPathName, final String iEncoding, final String[] skipLineStartingWithChars) throws FileNotFoundException, IOException {
        this.encoding = iEncoding;
        ZFile zFile = null;
        InputStream is = null;
        BufferedReader reader = null;
        try {
            if (FileContents.useZFile(iPathName)) {
                zFile = this.createZFile(iPathName, true);
                is = zFile.getInputStream();
            }
            else {
                final File file = this.createFile(iPathName);
                is = new FileInputStream(file);
            }
            reader = this.createBufferedReader(is);
            String firstLine = reader.readLine();
            if (skipLineStartingWithChars != null && skipLineStartingWithChars.length > 0) {
                while (firstLine != null) {
                    boolean comment = StringUtils.isEmpty(firstLine);
                    for (int i = 0; i < skipLineStartingWithChars.length && !comment; ++i) {
                        if (firstLine.trim().startsWith(skipLineStartingWithChars[i])) {
                            comment = true;
                        }
                    }
                    if (!comment) {
                        break;
                    }
                    firstLine = reader.readLine();
                }
            }
            firstLine = StringUtils.getString(firstLine, "");
            return firstLine;
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException ex) {}
            }
            reader = null;
            if (is != null) {
                try {
                    is.close();
                }
                catch (IOException ex2) {}
            }
            is = null;
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
    
    @Override
    public void writeContents(final TextFileContents fc, final OutputStreamWriter osw) throws IOException {
        osw.write(fc.getContents());
    }
    
    public void saveFile(final String iFilename, final String iEncoding) throws IOException {
        this.saveFile(this, iFilename, iEncoding);
    }
    
    public void saveFile(final ITextFileContentsWriter writer, final String iFilename, final String iEncoding) throws IOException {
        final String targetFilename = (iFilename == null) ? this.getFileName() : iFilename;
        OutputStream os = null;
        ZFile zFile = null;
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
            OutputStreamWriter osw = null;
            if (iEncoding != null) {
                osw = new OutputStreamWriter(os, iEncoding);
            }
            else if (this.encoding != null) {
                osw = new OutputStreamWriter(os, this.encoding);
            }
            else {
                osw = new OutputStreamWriter(os);
            }
            writer.writeContents(this, osw);
            osw.flush();
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
    
    public String getContents() {
        String result = this.contents.substring(0, this.contents.length());
        if (this.removeLineNumbers) {
            final StringBuilder newContents = new StringBuilder();
            final Scanner scanner = new Scanner(this.contents.substring(0, this.contents.length()));
            final String eol = System.getProperty("line.separator");
            final int MIN_LINE_LENGTH = 80;
            int lineLen = -1;
            boolean isNum = true;
            while (scanner.hasNextLine() && isNum) {
                String line = scanner.nextLine();
                if (lineLen == -1 && !StringUtils.isEmpty(line)) {
                    lineLen = line.length();
                    if (lineLen < 80) {
                        isNum = false;
                    }
                }
                if (isNum) {
                    if (line.length() == lineLen) {
                        final String numStr = line.substring(line.length() - 8, line.length());
                        if (StringUtils.isNumeric(numStr)) {
                            line = line.substring(0, line.length() - 8) + "        ";
                        }
                        else {
                            isNum = false;
                        }
                    }
                    else if (!StringUtils.isEmpty(line)) {
                        isNum = false;
                    }
                }
                if (newContents.length() > 0) {
                    newContents.append(eol);
                }
                newContents.append(line);
            }
            scanner.close();
            if (isNum) {
                result = newContents.substring(0, newContents.length());
            }
        }
        return result;
    }
    
    public StringBuffer getContentsBuffer() {
        return this.contents;
    }
    
    public void setCapacity(final int iSetting) {
        this.contents = new StringBuffer(iSetting);
    }
    
    public void setContents(final StringBuffer iContents) {
        this.contents = iContents;
    }
    
    public void setMaxReuseCapacity(final int iSetting) {
        this.maxReuseCapacity = iSetting;
    }
    
    public static void main(final String[] argsParm) {
        try {
            if (argsParm.length < 4) {
                System.err.format("Syntax: java com.ibm.dmh.util.TextFileContents -input file-or-dataset -output file-or-dataset [-fileInput] [-fileOutput]\n", new Object[0]);
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
            final TextFileContents fc = new TextFileContents();
            String contents = null;
            try {
                contents = fc.getFileContents(inputFileName, LocaleMgr.getExternalDefaultEncoding());
                System.out.format("%s is %d bytes\n", inputFileName, contents.length());
                try {
                    fc.saveFile(outputFileName, LocaleMgr.getExternalDefaultEncoding());
                    System.out.format("Wrote to %s\n", outputFileName);
                }
                catch (IOException e) {
                    System.out.format("Saving %s: %s\n", inputFileName, e.getLocalizedMessage());
                }
            }
            catch (IOException e) {
                System.out.format("Reading %s: %s\n", inputFileName, e.getLocalizedMessage());
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    public void removeLineNumbers(final boolean remove) {
        this.removeLineNumbers = remove;
    }
}
