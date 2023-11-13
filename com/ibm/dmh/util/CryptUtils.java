// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;

public class CryptUtils
{
    public static String TRANSFORMATION;
    
    public static String generateSecretKey() throws NoSuchAlgorithmException {
        final KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        return StringUtils.bytesToHex(keyGen.generateKey().getEncoded());
    }
    
    public static String encrypt(final String value, final String secretKey) throws Exception {
        final SecretKeySpec sks = new SecretKeySpec(StringUtils.hexToBytes(secretKey), "AES");
        final Cipher cipher = Cipher.getInstance(CryptUtils.TRANSFORMATION);
        cipher.init(1, sks, cipher.getParameters());
        final byte[] encrypted = cipher.doFinal(value.getBytes("UTF-8"));
        return StringUtils.bytesToHex(encrypted);
    }
    
    public static String decrypt(final String message, final String secretKey) throws Exception {
        final SecretKeySpec sks = new SecretKeySpec(StringUtils.hexToBytes(secretKey), "AES");
        final Cipher cipher = Cipher.getInstance(CryptUtils.TRANSFORMATION);
        cipher.init(2, sks);
        final byte[] decrypted = cipher.doFinal(StringUtils.hexToBytes(message));
        return new String(decrypted, "UTF-8");
    }
    
    static {
        CryptUtils.TRANSFORMATION = "AES/ECB/PKCS5Padding";
    }
}
