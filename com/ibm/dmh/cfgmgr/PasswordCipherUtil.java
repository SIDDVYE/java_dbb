// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr;

import com.ibm.dmh.util.CryptUtils;

public class PasswordCipherUtil
{
    private static final byte XOR_MASK = 95;
    public static final String CRYPTO_ALGORITHM_AES = "aes";
    public static final String CRYPTO_ALGORITHM_XOR = "xor";
    private static final String[] SUPPORTED_CRYPTO_ALGORITHMS;
    private static String secretPrefix;
    
    public static byte[] decipher(final byte[] encrypted_bytes, final String iSecret, final String crypto_algorithm) throws SecurityException {
        if (crypto_algorithm == null) {
            throw new SecurityException(4);
        }
        byte[] decrypted_bytes = null;
        Label_0139: {
            if (!crypto_algorithm.equalsIgnoreCase("xor")) {
                if (crypto_algorithm.equalsIgnoreCase("aes")) {
                    try {
                        final String secret = PasswordUtil.decode("{xor}" + PasswordCipherUtil.secretPrefix, null) + iSecret.substring(16);
                        final String decryptedString = CryptUtils.decrypt(new String(encrypted_bytes, "UTF-8"), secret);
                        decrypted_bytes = decryptedString.getBytes("UTF-8");
                        break Label_0139;
                    }
                    catch (Throwable t) {
                        throw new java.lang.SecurityException(t);
                    }
                }
                throw new SecurityException(4);
            }
            decrypted_bytes = xor(encrypted_bytes);
        }
        if (decrypted_bytes == null) {
            throw new SecurityException(1);
        }
        return decrypted_bytes;
    }
    
    public static byte[] encipher(final byte[] decrypted_bytes, final String iSecret, final String crypto_algorithm) throws SecurityException {
        if (crypto_algorithm == null) {
            throw new SecurityException(4);
        }
        byte[] encrypted_bytes = null;
        Label_0139: {
            if (!crypto_algorithm.equalsIgnoreCase("xor")) {
                if (crypto_algorithm.equalsIgnoreCase("aes")) {
                    try {
                        final String secret = PasswordUtil.decode("{xor}" + PasswordCipherUtil.secretPrefix, null) + iSecret.substring(16);
                        final String encryptedString = CryptUtils.encrypt(new String(decrypted_bytes, "UTF-8"), secret);
                        encrypted_bytes = encryptedString.getBytes("UTF-8");
                        break Label_0139;
                    }
                    catch (Throwable t) {
                        throw new java.lang.SecurityException(t);
                    }
                }
                throw new SecurityException(4);
            }
            encrypted_bytes = xor(decrypted_bytes);
        }
        if (encrypted_bytes == null) {
            throw new SecurityException(1);
        }
        return encrypted_bytes;
    }
    
    public static String[] getSupportedCryptoAlgorithms() {
        return PasswordCipherUtil.SUPPORTED_CRYPTO_ALGORITHMS;
    }
    
    private static byte[] xor(final byte[] bytes) {
        byte[] xor_bytes = null;
        if (bytes != null) {
            xor_bytes = new byte[bytes.length];
            for (int i = 0; i < bytes.length; ++i) {
                xor_bytes[i] = (byte)(0x5F ^ bytes[i]);
            }
        }
        return xor_bytes;
    }
    
    static {
        SUPPORTED_CRYPTO_ALGORITHMS = new String[] { "xor", "aes" };
        PasswordCipherUtil.secretPrefix = "aGlvZx4abW0dZh4eaRwdZw==";
    }
}
