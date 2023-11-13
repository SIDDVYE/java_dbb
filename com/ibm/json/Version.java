// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json;

import java.util.jar.Manifest;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.io.File;

public class Version
{
    private static String DEFAULT;
    private String buildDate;
    private String specTitle;
    private String specVersion;
    private String specVendor;
    private String implTitle;
    private String implVersion;
    private String implVendor;
    private String file;
    
    public static void main(final String[] array) {
        try {
            final Version version = new Version();
            System.out.println("");
            System.out.println("MANIFEST information for jar: [" + version.getFile() + "]");
            System.out.println("");
            System.out.println("Specification:");
            System.out.println("\tTitle: [" + version.getSpecificationTitle() + "]");
            System.out.println("\tVersion: [" + version.getSpecificationVersion() + "]");
            System.out.println("\tVendor: [" + version.getSpecificationVendor() + "]");
            System.out.println("");
            System.out.println("Implementation:");
            System.out.println("\tTitle: [" + version.getImplementationTitle() + "]");
            System.out.println("\tVersion: [" + version.getImplementationVersion() + "]");
            System.out.println("\tVendor: [" + version.getImplementationVendor() + "]");
            System.out.println("");
            System.out.println("Build date: [" + version.getBuildDate() + "]");
        }
        catch (Exception ex) {
            System.out.println("Fatal error: " + ex.toString());
            ex.printStackTrace();
        }
    }
    
    public Version() {
        this.buildDate = Version.DEFAULT;
        this.specTitle = Version.DEFAULT;
        this.specVersion = Version.DEFAULT;
        this.specVendor = Version.DEFAULT;
        this.implTitle = Version.DEFAULT;
        this.implVersion = Version.DEFAULT;
        this.implVendor = Version.DEFAULT;
        this.file = Version.DEFAULT;
        try {
            final String file = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
            if (file != null) {
                this.file = new File(file).getAbsolutePath();
                final JarFile jarFile = new JarFile(file);
                final Manifest manifest = jarFile.getManifest();
                jarFile.close();
                if (manifest != null) {
                    final Attributes mainAttributes = manifest.getMainAttributes();
                    if (mainAttributes.getValue("Build-Date") != null) {
                        this.buildDate = mainAttributes.getValue("Build-Date");
                    }
                    if (mainAttributes.getValue(Attributes.Name.SPECIFICATION_TITLE) != null) {
                        this.specTitle = mainAttributes.getValue(Attributes.Name.SPECIFICATION_TITLE);
                    }
                    if (mainAttributes.getValue(Attributes.Name.SPECIFICATION_VERSION) != null) {
                        this.specVersion = mainAttributes.getValue(Attributes.Name.SPECIFICATION_VERSION);
                    }
                    if (mainAttributes.getValue(Attributes.Name.SPECIFICATION_VENDOR) != null) {
                        this.specVendor = mainAttributes.getValue(Attributes.Name.SPECIFICATION_VENDOR);
                    }
                    if (mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_TITLE) != null) {
                        this.implTitle = mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_TITLE);
                    }
                    if (mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_VERSION) != null) {
                        this.implVersion = mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_VERSION);
                    }
                    if (mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_VENDOR) != null) {
                        this.implVendor = mainAttributes.getValue(Attributes.Name.IMPLEMENTATION_VENDOR);
                    }
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Fatal error: " + ex.toString());
            ex.printStackTrace();
        }
    }
    
    public String getBuildDate() {
        return this.buildDate;
    }
    
    public String getSpecificationVersion() {
        return this.specVersion;
    }
    
    public String getSpecificationTitle() {
        return this.specTitle;
    }
    
    public String getSpecificationVendor() {
        return this.specVendor;
    }
    
    public String getImplementationVersion() {
        return this.implVersion;
    }
    
    public String getImplementationTitle() {
        return this.implTitle;
    }
    
    public String getImplementationVendor() {
        return this.implVendor;
    }
    
    public String getFile() {
        return this.file;
    }
    
    static {
        Version.DEFAULT = "UNKNOWN";
    }
}
