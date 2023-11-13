// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify;

import java.util.Map;
import java.io.InputStream;
import java.io.File;

public class ScanAFile
{
    private static final int RC_OK = 0;
    private static final int RC_WARNING = 4;
    private static final int RC_ERROR = 8;
    private static final int RC_SEVERE = 16;
    private static final int RC_FATAL = 20;
    private int debug;
    private int rc;
    private String containerName;
    private String fileName;
    private String languageHint;
    private String codePage;
    private String mvsCodePage;
    private boolean captureLiterals;
    private boolean captureSymbolsReserved;
    private boolean captureSymbolsUserDefined;
    private boolean noPLX;
    private boolean prettyPrint;
    private boolean adi;
    
    public ScanAFile() {
        this(0);
    }
    
    public ScanAFile(final int debug) {
        this.debug = debug;
        this.captureLiterals = false;
        this.captureSymbolsReserved = false;
        this.captureSymbolsUserDefined = false;
        this.containerName = null;
        this.fileName = null;
        this.noPLX = false;
        this.prettyPrint = false;
        this.adi = false;
        this.rc = 0;
    }
    
    public int getRC() {
        return this.rc;
    }
    
    public void run() {
        if (this.containerName == null || this.fileName == null) {
            showUsage();
            this.rc = 8;
            return;
        }
        if (this.debug == 1 || this.debug == 2) {
            System.out.println("\nScanning: " + this.containerName + File.separatorChar + this.fileName);
        }
        final Dmh5210 dmh5210 = new Dmh5210();
        final ScanProperties scanProperties = new ScanProperties();
        if (this.languageHint != null) {
            scanProperties.setLanguageHint(this.languageHint);
        }
        if (this.captureLiterals) {
            scanProperties.setCaptureLiterals("T");
        }
        if (this.captureSymbolsReserved) {
            scanProperties.setCaptureSymbolsReserved("T");
        }
        if (this.captureSymbolsUserDefined) {
            scanProperties.setCaptureSymbolsUserDefined("T");
        }
        if (this.prettyPrint) {
            scanProperties.setJsonResponseFormat("PRETTY");
        }
        if (this.adi) {
            scanProperties.setJsonResponseFormat("ADI");
        }
        if (this.codePage != null) {
            scanProperties.setCodePage(this.codePage);
        }
        if (this.mvsCodePage != null) {
            scanProperties.setMvsCodePage(this.mvsCodePage);
        }
        scanProperties.setNoPLX(this.noPLX);
        dmh5210.init(scanProperties);
        dmh5210.setDebug(this.debug);
        dmh5210.ProcessSingleFile(null, null, null, this.containerName, this.fileName, null, null, null);
        final String languageCd = dmh5210.getLanguageCd();
        if (languageCd.equals("EMP?") || languageCd.equals("UNKN")) {
            this.rc = 4;
        }
        else if (languageCd.equals("GONE")) {
            this.rc = 8;
        }
        final String jsonResponseFormat = scanProperties.getJsonResponseFormat();
        final Map<String, Object> attributes = dmh5210.gatherAllAttributes(jsonResponseFormat);
        final String metaData = dmh5210.generateJsonOutput(jsonResponseFormat, attributes);
        System.out.println(metaData);
    }
    
    public void setUp(final String containerName, final String fileName, final String languageHint) {
        this.containerName = containerName;
        this.fileName = fileName;
        this.languageHint = languageHint;
    }
    
    public static void showUsage() {
        System.err.println("Usage: java com.ibm.dmh.scan.classify.ScanAFile containerName fileName [/D|/D1|/D2] [/L languageCode] [/Literals] [/NoPLX] [/ReservedSymbols] [/UserSymbols] [/PrettyPrint] /Cp codePage /MvsCp mvsCodePage");
    }
    
    public static void main(final String[] args) {
        String containerName = null;
        String fileName = null;
        String languageHint = null;
        final ScanAFile scanAFile = new ScanAFile();
        boolean showUsage = false;
        for (int i = 0; i < args.length; ++i) {
            if (args[i].startsWith("/")) {
                if (args[i].equalsIgnoreCase("/Cp") && i < args.length - 1) {
                    scanAFile.codePage = args[i++ + 1];
                }
                else if (args[i].equalsIgnoreCase("/D") || args[i].equalsIgnoreCase("/D1")) {
                    scanAFile.debug = 1;
                }
                else if (args[i].equalsIgnoreCase("/D2")) {
                    scanAFile.debug = 2;
                }
                else if (args[i].equalsIgnoreCase("/L")) {
                    if (i + 1 < args.length) {
                        languageHint = args[++i].toUpperCase();
                    }
                    else {
                        System.err.println("ERROR: The /L parameter requires a language code.");
                        showUsage = true;
                    }
                }
                else if (args[i].equalsIgnoreCase("/LITERALS")) {
                    scanAFile.captureLiterals = true;
                }
                else if (args[i].equalsIgnoreCase("/MvsCp") && i < args.length - 1) {
                    scanAFile.mvsCodePage = args[i++ + 1];
                }
                else if (args[i].equalsIgnoreCase("/NOPLX")) {
                    scanAFile.noPLX = true;
                }
                else if (args[i].equalsIgnoreCase("/PRETTYPRINT")) {
                    scanAFile.prettyPrint = true;
                }
                else if (args[i].equalsIgnoreCase("/ADI")) {
                    scanAFile.adi = true;
                }
                else if (args[i].equalsIgnoreCase("/RESERVEDSYMBOLS")) {
                    scanAFile.captureSymbolsReserved = true;
                }
                else if (args[i].equalsIgnoreCase("/USERSYMBOLS")) {
                    scanAFile.captureSymbolsUserDefined = true;
                }
                else {
                    System.err.println("ERROR: Invalid parameter specified [" + args[i] + "]");
                    showUsage = true;
                }
            }
            else if (containerName == null) {
                containerName = args[i];
            }
            else if (fileName == null) {
                fileName = args[i];
            }
            else {
                System.err.println("ERROR: Unexpected parameter [" + args[i] + "]");
                showUsage = true;
            }
        }
        if (showUsage || containerName == null || fileName == null) {
            showUsage();
            return;
        }
        scanAFile.setUp(containerName, fileName, languageHint);
        scanAFile.run();
        final int rc = scanAFile.getRC();
        switch (rc) {
            case 8:
            case 16:
            case 20: {
                System.err.println("Error: rc = " + rc);
                break;
            }
            case 4: {
                System.out.println("Warning: rc = " + rc);
                break;
            }
        }
        System.exit(rc);
    }
}
