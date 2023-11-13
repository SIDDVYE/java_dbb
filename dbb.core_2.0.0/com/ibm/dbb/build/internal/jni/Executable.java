// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jni;

import com.ibm.jzos.FileFactory;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class Executable
{
    private static final String ENCODING_ENVIRONMENT_VARIABLE = "ZLANG";
    private static final String SHARED_LIBRARY = "DBB_JNI";
    private static final String SHARED_LIBRARY_64 = "DBB_JNI64";
    private static final String VM_BITMODE = "com.ibm.vm.bitmode";
    private static final String BITMODE_64 = "64";
    private static final String Z_OS = "z/OS";
    private static final String OS_NAME = "os.name";
    
    private static void loadNativeLibrary() {
        if ("z/OS".equals(System.getProperty("os.name"))) {
            final String bitmode = System.getProperty("com.ibm.vm.bitmode");
            System.loadLibrary("64".equals(bitmode) ? "DBB_JNI64" : "DBB_JNI");
        }
    }
    
    public native int compile(final byte[] p0, final byte[] p1, final byte[] p2, final boolean p3);
    
    public native byte[] getProductStatus(final byte[] p0, final byte[] p1, final byte[] p2, final byte[] p3);
    
    public native byte[] registerProduct(final byte[] p0, final byte[] p1, final byte[] p2, final byte[] p3, final byte[] p4, final byte[] p5, final byte[] p6, final byte[] p7);
    
    public native byte[] deregisterProduct(final byte[] p0);
    
    public native String[] getDDNames();
    
    public int compile(final String pgm, final String options, final String ddnames, final boolean attachx) {
        return this.compile(getBytesInEBCDIC(pgm), getHalfWordPrefiexedBytes(getBytesInEBCDIC(options)), getHalfWordPrefiexedBytes(getBytesInEBCDIC(ddnames)), attachx);
    }
    
    public byte[] getProductStatus(final String prodName, final String featureName, final String prodVendor, final String prodID) {
        return this.getProductStatus(getBytesInEBCDIC(prodName), getBytesInEBCDIC(featureName), getBytesInEBCDIC(prodVendor), getBytesInEBCDIC(prodID));
    }
    
    public byte[] registerProduct(final String prodName, final String featureName, final String prodVers, final String prodRel, final String prodMod, final String prodVendor, final String prodID, final String prodMeta) {
        return this.registerProduct(getBytesInEBCDIC(prodName), getBytesInEBCDIC(featureName), getBytesInEBCDIC(prodVers), getBytesInEBCDIC(prodRel), getBytesInEBCDIC(prodMod), getBytesInEBCDIC(prodVendor), getBytesInEBCDIC(prodID), getBytesInEBCDIC(prodMeta));
    }
    
    public byte[] deregisterProduct(final String prodToken) {
        return this.deregisterProduct(getBytesInEBCDIC(prodToken));
    }
    
    public List<String> getDDNameList() {
        return Arrays.asList(this.getDDNames());
    }
    
    private static byte[] getBytesInEBCDIC(final String s) {
        byte[] b = null;
        if (s != null) {
            try {
                b = s.getBytes(retrieveEncoding());
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return b;
    }
    
    private static byte[] getHalfWordPrefiexedBytes(final byte[] in) {
        byte[] b = null;
        if (in != null) {
            final int len = in.length;
            final int bufLen = (len + 9) / 8 * 8;
            b = new byte[bufLen];
            b[0] = (byte)(len >> 8 & 0xFF);
            b[1] = (byte)(len & 0xFF);
            System.arraycopy(in, 0, b, 2, len);
        }
        else {
            b = new byte[8];
        }
        return b;
    }
    
    private static String retrieveEncoding() {
        final String zLang = System.getenv("ZLANG");
        return (zLang != null && zLang.length() > 0) ? zLang : FileFactory.getDefaultZFileEncoding();
    }
    
    static {
        loadNativeLibrary();
    }
}
