// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.CharBuffer;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.security.MessageDigest;
import java.security.Key;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Base64;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import com.ibm.dbb.build.internal.Messages;

public class StringUtil
{
    private static final byte[] v2_dbbzkey;
    private static final String v2_algorithm = "AES/CBC/PKCS5Padding";
    private static final int v2_keylength = 32;
    
    protected static String encryptString(final char[] value, String keyVersion, byte[] key) {
        if (keyVersion == null) {
            keyVersion = "none";
        }
        if (keyVersion.equals("1")) {
            throw new IllegalArgumentException(Messages.getMessage("PasswordUtility_UNSUPPORTED_KEY_VERSION", keyVersion));
        }
        if (key == null) {
            key = StringUtil.v2_dbbzkey;
        }
        return encryptString(value, "AES/CBC/PKCS5Padding", key, 32);
    }
    
    protected static char[] decryptString(final String value, String keyVersion, byte[] key) {
        if (keyVersion == null) {
            keyVersion = "none";
        }
        if (keyVersion.equals("1")) {
            throw new IllegalArgumentException(Messages.getMessage("PasswordUtility_UNSUPPORTED_KEY_VERSION", keyVersion));
        }
        if (key == null) {
            key = StringUtil.v2_dbbzkey;
        }
        return decryptString(value, "AES/CBC/PKCS5Padding", key, 32);
    }
    
    private static String encryptString(final char[] value, final String algorithm, final byte[] key, final int keylength) {
        if (value == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "password"));
        }
        try {
            final Key keySpec = buildKey(key, algorithm, keylength);
            final Cipher c = Cipher.getInstance(algorithm);
            final byte[] ivSpec = new byte[c.getBlockSize()];
            final IvParameterSpec ivParamSpec = new IvParameterSpec(ivSpec);
            c.init(1, keySpec, ivParamSpec);
            final byte[] encryptedBytes = c.doFinal(toBytes(value, "UTF-8"));
            return new String(Base64.getEncoder().encode(encryptedBytes), "UTF-8");
        }
        catch (GeneralSecurityException e) {
            e.printStackTrace();
            throw new IllegalStateException(Messages.getMessage("PasswordUtility_CIPHER_ERROR", e));
        }
        catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException(Messages.getMessage("PasswordUtility_UNSUPPORTED_ENCODING", "UTF-8"));
        }
    }
    
    private static char[] decryptString(final String value, final String algorithm, final byte[] key, final int keylength) {
        if (value == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "password"));
        }
        try {
            final Key keySpec = buildKey(key, algorithm, keylength);
            final Cipher c = Cipher.getInstance(algorithm);
            if (algorithm.startsWith("AES")) {
                final byte[] ivSpec = new byte[c.getBlockSize()];
                final IvParameterSpec ivParamSpec = new IvParameterSpec(ivSpec);
                c.init(2, keySpec, ivParamSpec);
            }
            else {
                c.init(2, keySpec);
            }
            final byte[] clearBytes = c.doFinal(Base64.getDecoder().decode(value.getBytes("UTF-8")));
            return toChars(clearBytes, "UTF-8");
        }
        catch (GeneralSecurityException e) {
            e.printStackTrace();
            throw new IllegalStateException(Messages.getMessage("PasswordUtility_CIPHER_ERROR", e));
        }
        catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException(Messages.getMessage("PasswordUtility_UNSUPPORTED_ENCODING", "UTF-8"));
        }
    }
    
    private static Key buildKey(byte[] key, String algorithm, final int keylength) {
        try {
            final MessageDigest md = MessageDigest.getInstance("SHA-2");
            key = md.digest(key);
            key = Arrays.copyOf(key, keylength);
        }
        catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
        final int ndx = algorithm.indexOf("/");
        algorithm = ((ndx == -1) ? algorithm : algorithm.substring(0, ndx));
        final SecretKeySpec keySpec = new SecretKeySpec(key, algorithm);
        return keySpec;
    }
    
    private static byte[] toBytes(final char[] chars, final String charsetName) {
        final CharBuffer charBuffer = CharBuffer.wrap(chars);
        final ByteBuffer byteBuffer = Charset.forName(charsetName).encode(charBuffer);
        final byte[] bytes = Arrays.copyOfRange(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        Arrays.fill(byteBuffer.array(), (byte)0);
        return bytes;
    }
    
    private static char[] toChars(final byte[] bytes, final String charsetName) {
        final ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        final CharBuffer charBuffer = Charset.forName(charsetName).decode(byteBuffer);
        final char[] chars = Arrays.copyOfRange(charBuffer.array(), charBuffer.position(), charBuffer.limit());
        Arrays.fill(charBuffer.array(), '\0');
        return chars;
    }
    
    static {
        v2_dbbzkey = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7, 8 };
    }
}
