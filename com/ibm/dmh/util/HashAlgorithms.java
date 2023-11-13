// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.security.NoSuchAlgorithmException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

public class HashAlgorithms
{
    private static int BUFFER_SIZE;
    public static final String ALGORITHM_MD5 = "MD5";
    public static final String ALGORITHM_PROPRIETARY = "PROPRIETARY";
    public static final String ALGORITHM_SAME_AS_GIT = "GIT";
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String ALGORITHM_SHA256 = "SHA-256";
    public static final String PARM_ALGORITHM_MD5 = "MD5";
    public static final String PARM_ALGORITHM_RAA = "RAA";
    public static final String PARM_ALGORITHM_SAME_AS_GIT = "GIT";
    public static final String PARM_ALGORITHM_SHA1 = "SHA1";
    public static final String PARM_ALGORITHM_SHA256 = "SHA256";
    public static final String RESPONSE_HEADER_FILE_HASH_RAA = "X-com.ibm.dmh.FileHash";
    
    private static long clshift(long hash, final int pos) {
        for (int i = 0; i < pos; ++i) {
            hash = (hash << 1 ^ (long)((hash < 0L) ? 1 : 0));
        }
        return hash;
    }
    
    private static String convertBytesToHexFormat(final byte[] mdbytes) {
        final StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < mdbytes.length; ++i) {
            hexString.append(Integer.toHexString(0x100 | (0xFF & mdbytes[i])).substring(1));
        }
        return hexString.toString();
    }
    
    private static byte[] digestData(final MessageDigest md, final InputStream is) throws IOException {
        final byte[] dataBytes = new byte[HashAlgorithms.BUFFER_SIZE];
        int nread = 0;
        while ((nread = is.read(dataBytes)) != -1) {
            md.update(dataBytes, 0, nread);
        }
        return md.digest();
    }
    
    public static long useProprietaryAlgorithm(final InputStream is) throws IOException {
        long hash = 5381L;
        final BufferedInputStream bis = new BufferedInputStream(is, HashAlgorithms.BUFFER_SIZE);
        final byte[] bytes = new byte[HashAlgorithms.BUFFER_SIZE];
        for (int bytesRead = bis.read(bytes); bytesRead != -1; bytesRead = bis.read(bytes)) {
            for (int i = 0; i < bytesRead; ++i) {
                hash = clshift(hash, 5) + hash + bytes[i];
            }
        }
        bis.close();
        hash -= 5381L;
        if (hash == 0L) {
            return -1L;
        }
        return hash;
    }
    
    public static String useStandardAlgorithm(final String algorithm, final InputStream is) throws IOException, NoSuchAlgorithmException {
        final MessageDigest md = MessageDigest.getInstance(algorithm);
        final byte[] mdbytes = digestData(md, is);
        return convertBytesToHexFormat(mdbytes);
    }
    
    public static String validateHashParm(final String hashParm) {
        if (hashParm == null) {
            return null;
        }
        if (hashParm.equals("MD5")) {
            return "MD5";
        }
        if (hashParm.equals("RAA")) {
            return "PROPRIETARY";
        }
        if (hashParm.equals("GIT")) {
            return "GIT";
        }
        if (hashParm.equals("SHA1")) {
            return "SHA-1";
        }
        if (hashParm.equals("SHA256")) {
            return "SHA-256";
        }
        return null;
    }
    
    static {
        HashAlgorithms.BUFFER_SIZE = 65536;
    }
}
