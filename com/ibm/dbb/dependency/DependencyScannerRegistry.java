// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import java.util.HashMap;
import java.util.Map;

public class DependencyScannerRegistry
{
    private static Map<String, IDependencyScanner> scanners;
    private static DependencyScannerRegistry _instance;
    
    private DependencyScannerRegistry() {
    }
    
    public static IDependencyScanner getScanner(final String filepath) {
        IDependencyScanner scanner = DependencyScannerRegistry.scanners.get(getFileExtension(filepath));
        if (scanner == null) {
            scanner = new DependencyScanner();
        }
        return scanner;
    }
    
    public static void addScanner(final String fileExtension, final IDependencyScanner scanner) {
        DependencyScannerRegistry.scanners.put(fileExtension, scanner);
    }
    
    public static void removeScanner(final String fileExtension) {
        DependencyScannerRegistry.scanners.remove(fileExtension);
    }
    
    private static String getFileExtension(final String filepath) {
        String ext = "";
        final int idx = filepath.lastIndexOf(46);
        if (idx > -1) {
            ext = filepath.substring(idx + 1);
        }
        else {
            ext = filepath;
        }
        return ext;
    }
    
    public static void staticReset() {
        DependencyScannerRegistry.scanners = addDefaultScanners();
    }
    
    private static Map<String, IDependencyScanner> addDefaultScanners() {
        final Map<String, IDependencyScanner> defaultScanners = new HashMap<String, IDependencyScanner>();
        final DependencyScanner asmScanner = new DependencyScanner();
        asmScanner.setLanguageHint("ASM");
        defaultScanners.put("asm", asmScanner);
        defaultScanners.put("mac", asmScanner);
        final DependencyScanner cScanner = new DependencyScanner();
        cScanner.setLanguageHint("C");
        defaultScanners.put("c", cScanner);
        defaultScanners.put("h", cScanner);
        final DependencyScanner cobolScanner = new DependencyScanner();
        cobolScanner.setLanguageHint("COB");
        defaultScanners.put("cbl", cobolScanner);
        defaultScanners.put("cpy", cobolScanner);
        final DependencyScanner cppScanner = new DependencyScanner();
        cppScanner.setLanguageHint("CPP");
        defaultScanners.put("cpp", cppScanner);
        defaultScanners.put("hpp", cppScanner);
        final DependencyScanner pliScanner = new DependencyScanner();
        pliScanner.setLanguageHint("PLI");
        defaultScanners.put("pli", pliScanner);
        defaultScanners.put("inc", pliScanner);
        defaultScanners.put("bzucfg", new ZUnitConfigScanner());
        return defaultScanners;
    }
    
    static {
        DependencyScannerRegistry.scanners = addDefaultScanners();
    }
}
