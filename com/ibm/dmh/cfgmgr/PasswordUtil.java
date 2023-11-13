// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import com.ibm.dmh.util.StringUtils;
import java.io.OutputStream;
import javax.crypto.SecretKey;
import java.io.InputStream;
import java.io.FileOutputStream;
import javax.crypto.spec.SecretKeySpec;
import com.ibm.dmh.util.CryptUtils;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.io.File;
import java.io.UnsupportedEncodingException;

public class PasswordUtil
{
    public static final String STRING_CONVERSION_CODE = "UTF-8";
    public static final String DEFAULT_CRYPTO_ALGORITHM;
    private static final String CRYPTO_ALGORITHM_STARTED = "{";
    private static final String CRYPTO_ALGORITHM_STOPPED = "}";
    public static final String DEFAULT_CRYPTO_EYECATCHER;
    public static final String CRYPTO_XOR_EYECATCHER = "{xor}";
    public static final String CRYPTO_AES_EYECATCHER = "{aes}";
    private static final String EMPTY_STRING;
    private static final byte[] EMPTY_BYTE_ARRAY;
    private static final String[] SUPPORTED_CRYPTO_ALGORITHMS;
    private static final byte[] BASE64_ENCODE_MAP;
    private static final byte[] BASE64_DECODE_MAP;
    
    public static String decode(final String encoded_string, final String iSecret) throws SecurityException {
        if (encoded_string == null) {
            throw new SecurityException(2);
        }
        final String crypto_algorithm = getCryptoAlgorithm(encoded_string);
        if (crypto_algorithm == null) {
            throw new SecurityException(2);
        }
        if (!isValidCryptoAlgorithm(crypto_algorithm)) {
            throw new SecurityException(4);
        }
        final String decoded_string = decode_password(removeCryptoAlgorithmTag(encoded_string), iSecret, crypto_algorithm);
        if (decoded_string == null) {
            throw new SecurityException(2);
        }
        return decoded_string;
    }
    
    public static String encode(final String decoded_string, final String iSecret, final String crypto_algorithm) throws SecurityException {
        if (!isValidCryptoAlgorithm(crypto_algorithm)) {
            throw new SecurityException(4);
        }
        if (decoded_string == null) {
            throw new SecurityException(3);
        }
        if (getCryptoAlgorithm(decoded_string) != null) {
            throw new SecurityException(3);
        }
        final String encoded_string = encode_password(decoded_string.trim(), iSecret, crypto_algorithm.trim());
        if (encoded_string == null) {
            throw new SecurityException(3);
        }
        return encoded_string;
    }
    
    public static String getCryptoAlgorithm(String encoded_string) {
        String crypto_algorithm = null;
        if (encoded_string != null) {
            encoded_string = encoded_string.trim();
            if (encoded_string.length() >= 2) {
                int algorithm_started = encoded_string.indexOf("{");
                if (algorithm_started == 0) {
                    final int algorithm_stopped = encoded_string.indexOf("}", ++algorithm_started);
                    if (algorithm_stopped > 0) {
                        if (algorithm_started < algorithm_stopped) {
                            crypto_algorithm = encoded_string.substring(algorithm_started, algorithm_stopped).trim();
                        }
                        else {
                            crypto_algorithm = PasswordUtil.EMPTY_STRING;
                        }
                    }
                }
            }
        }
        return crypto_algorithm;
    }
    
    public static String getCryptoAlgorithmTag(final String encoded_string) {
        String crypto_algorithm_tag = null;
        final String crypto_algorithm = getCryptoAlgorithm(encoded_string);
        if (crypto_algorithm != null) {
            final StringBuffer buffer = new StringBuffer("{");
            if (crypto_algorithm.length() > 0) {
                buffer.append(crypto_algorithm);
            }
            buffer.append("}");
            crypto_algorithm_tag = buffer.toString();
        }
        return crypto_algorithm_tag;
    }
    
    public static boolean isValidCryptoAlgorithm(String crypto_algorithm) {
        if (crypto_algorithm != null) {
            crypto_algorithm = crypto_algorithm.trim();
            if (crypto_algorithm.length() == 0) {
                return true;
            }
            for (int i = 0; i < PasswordUtil.SUPPORTED_CRYPTO_ALGORITHMS.length; ++i) {
                if (crypto_algorithm.equalsIgnoreCase(PasswordUtil.SUPPORTED_CRYPTO_ALGORITHMS[i])) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isValidCryptoAlgorithmTag(final String crypto_algorithm_tag) {
        return isValidCryptoAlgorithm(getCryptoAlgorithm(crypto_algorithm_tag));
    }
    
    public static String removeCryptoAlgorithmTag(String encoded_string) {
        String encoded_password = null;
        if (encoded_string != null) {
            encoded_string = encoded_string.trim();
            if (encoded_string.length() >= 2) {
                int algorithm_started = encoded_string.indexOf("{");
                if (algorithm_started == 0) {
                    int algorithm_stopped = encoded_string.indexOf("}", ++algorithm_started);
                    if (algorithm_stopped > 0) {
                        if (++algorithm_stopped < encoded_string.length()) {
                            encoded_password = encoded_string.substring(algorithm_stopped).trim();
                        }
                        else {
                            encoded_password = PasswordUtil.EMPTY_STRING;
                        }
                    }
                }
            }
        }
        return encoded_password;
    }
    
    private static byte[] convert_to_bytes(final String string) {
        byte[] bytes = null;
        if (string != null) {
            if (string.length() == 0) {
                bytes = PasswordUtil.EMPTY_BYTE_ARRAY;
            }
            else {
                try {
                    bytes = string.getBytes("UTF-8");
                }
                catch (UnsupportedEncodingException e) {
                    e.printStackTrace(System.err);
                }
            }
        }
        return bytes;
    }
    
    private static String convert_to_string(final byte[] bytes) {
        String string = null;
        if (bytes != null) {
            if (bytes.length == 0) {
                string = PasswordUtil.EMPTY_STRING;
            }
            else {
                try {
                    string = new String(bytes, "UTF-8");
                }
                catch (UnsupportedEncodingException e) {
                    e.printStackTrace(System.err);
                }
            }
        }
        return string;
    }
    
    private static byte[] convert_viewable_to_bytes(final String string) {
        byte[] bytes = null;
        if (string != null) {
            if (string.length() == 0) {
                bytes = PasswordUtil.EMPTY_BYTE_ARRAY;
            }
            else {
                try {
                    bytes = base64Decode(convert_to_bytes(string));
                }
                catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        }
        return bytes;
    }
    
    private static byte[] base64Decode(final byte[] bytes) {
        int tail = bytes.length;
        while (bytes[--tail] == 61) {}
        final byte[] dest = new byte[tail + 1 - bytes.length / 4];
        for (int idx = 0; idx < bytes.length; ++idx) {
            bytes[idx] = PasswordUtil.BASE64_DECODE_MAP[bytes[idx]];
        }
        int destx;
        int didx;
        int sidx;
        for (destx = dest.length - 2, didx = 0, sidx = 0; didx < destx; didx += 3, sidx += 4) {
            dest[didx] = (byte)((bytes[sidx] << 2 & 0xFF) | (bytes[sidx + 1] >>> 4 & 0x3));
            dest[didx + 1] = (byte)((bytes[sidx + 1] << 4 & 0xFF) | (bytes[sidx + 2] >>> 2 & 0xF));
            dest[didx + 2] = (byte)((bytes[sidx + 2] << 6 & 0xFF) | (bytes[sidx + 3] & 0x3F));
        }
        if (didx < dest.length) {
            dest[didx++] = (byte)((bytes[sidx] << 2 & 0xFF) | (bytes[sidx + 1] >>> 4 & 0x3));
            if (didx < dest.length) {
                dest[didx] = (byte)((bytes[sidx + 1] << 4 & 0xFF) | (bytes[sidx + 2] >>> 2 & 0xF));
            }
        }
        return dest;
    }
    
    private static String convert_viewable_to_string(final byte[] bytes) {
        String string = null;
        if (bytes != null) {
            if (bytes.length == 0) {
                string = PasswordUtil.EMPTY_STRING;
            }
            else {
                try {
                    string = convert_to_string(base64Encode(bytes));
                }
                catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        }
        return string;
    }
    
    private static byte[] base64Encode(final byte[] bytes) {
        final byte[] dest = new byte[(bytes.length + 2) / 3 * 4];
        int sidx = 0;
        int didx = 0;
        while (sidx < bytes.length - 2) {
            dest[didx++] = PasswordUtil.BASE64_ENCODE_MAP[bytes[sidx] >>> 2 & 0x3F];
            dest[didx++] = PasswordUtil.BASE64_ENCODE_MAP[(bytes[sidx + 1] >>> 4 & 0xF) | (bytes[sidx] << 4 & 0x3F)];
            dest[didx++] = PasswordUtil.BASE64_ENCODE_MAP[(bytes[sidx + 2] >>> 6 & 0x3) | (bytes[sidx + 1] << 2 & 0x3F)];
            dest[didx++] = PasswordUtil.BASE64_ENCODE_MAP[bytes[sidx + 2] & 0x3F];
            sidx += 3;
        }
        if (sidx < bytes.length) {
            dest[didx++] = PasswordUtil.BASE64_ENCODE_MAP[bytes[sidx] >>> 2 & 0x3F];
            if (sidx < bytes.length - 1) {
                dest[didx++] = PasswordUtil.BASE64_ENCODE_MAP[(bytes[sidx + 1] >>> 4 & 0xF) | (bytes[sidx] << 4 & 0x3F)];
                dest[didx++] = PasswordUtil.BASE64_ENCODE_MAP[bytes[sidx + 1] << 2 & 0x3F];
            }
            else {
                dest[didx++] = PasswordUtil.BASE64_ENCODE_MAP[bytes[sidx] << 4 & 0x3F];
            }
        }
        while (didx < dest.length) {
            dest[didx] = 61;
            ++didx;
        }
        return dest;
    }
    
    private static String decode_password(final String encoded_string, final String iSecret, final String crypto_algorithm) {
        final StringBuffer buffer = new StringBuffer();
        if (crypto_algorithm.length() == 0) {
            buffer.append(encoded_string);
        }
        else {
            String decoded_string = null;
            if (encoded_string.length() > 0) {
                final byte[] encrypted_bytes = convert_viewable_to_bytes(encoded_string);
                if (encrypted_bytes == null) {
                    return null;
                }
                if (encrypted_bytes.length > 0) {
                    byte[] decrypted_bytes = null;
                    try {
                        decrypted_bytes = PasswordCipherUtil.decipher(encrypted_bytes, iSecret, crypto_algorithm);
                    }
                    catch (SecurityException e) {
                        e.printStackTrace(System.err);
                        return null;
                    }
                    if (decrypted_bytes != null && decrypted_bytes.length > 0) {
                        decoded_string = convert_to_string(decrypted_bytes);
                    }
                }
            }
            if (decoded_string != null && decoded_string.length() > 0) {
                buffer.append(decoded_string);
            }
        }
        return buffer.toString();
    }
    
    private static String encode_password(final String decoded_string, final String iSecret, final String crypto_algorithm) {
        final StringBuffer buffer = new StringBuffer("{");
        if (crypto_algorithm.length() == 0) {
            buffer.append("}").append(decoded_string);
        }
        else {
            buffer.append(crypto_algorithm).append("}");
            String encoded_string = null;
            if (decoded_string.length() > 0) {
                final byte[] decrypted_bytes = convert_to_bytes(decoded_string);
                if (decrypted_bytes.length > 0) {
                    byte[] encrypted_bytes = null;
                    try {
                        encrypted_bytes = PasswordCipherUtil.encipher(decrypted_bytes, iSecret, crypto_algorithm);
                    }
                    catch (SecurityException e) {
                        e.printStackTrace(System.err);
                        return null;
                    }
                    if (encrypted_bytes != null && encrypted_bytes.length > 0) {
                        encoded_string = convert_viewable_to_string(encrypted_bytes);
                        if (encoded_string == null) {
                            return null;
                        }
                    }
                }
            }
            if (encoded_string != null && encoded_string.length() > 0) {
                buffer.append(encoded_string);
            }
        }
        return buffer.toString();
    }
    
    public static String getSecretKeyFromKeyStore(final String path, final String password) {
        String secretKey = null;
        try {
            final String keystorePassword = decode("{xor}" + password, null);
            final File keystoreFile = new File(path, "dmh.keystore");
            final KeyStore ks = KeyStore.getInstance("JCEKS");
            final KeyStore.ProtectionParameter protParam = new KeyStore.PasswordProtection(keystorePassword.toCharArray());
            final InputStream is = keystoreFile.exists() ? new FileInputStream(keystoreFile) : null;
            ks.load(is, keystorePassword.toCharArray());
            if (is != null) {
                is.close();
                final KeyStore.SecretKeyEntry skEntry = (KeyStore.SecretKeyEntry)ks.getEntry("secretKeyAlias", protParam);
                secretKey = new String(skEntry.getSecretKey().getEncoded(), "UTF-8");
            }
            else {
                secretKey = CryptUtils.generateSecretKey();
                final SecretKey mySecretKey = new SecretKeySpec(secretKey.getBytes("UTF-8"), "AES");
                final KeyStore.SecretKeyEntry skEntry2 = new KeyStore.SecretKeyEntry(mySecretKey);
                ks.setEntry("secretKeyAlias", skEntry2, protParam);
                final OutputStream os = new FileOutputStream(keystoreFile);
                ks.store(os, keystorePassword.toCharArray());
                os.close();
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return secretKey;
    }
    
    public static String getSecretKeyFromKeyStore(final StringBuffer buffer, final String password) {
        String secretKey = null;
        try {
            final String keystorePassword = decode("{xor}" + password, null);
            final KeyStore ks = KeyStore.getInstance("JCEKS");
            final KeyStore.ProtectionParameter protParam = new KeyStore.PasswordProtection(keystorePassword.toCharArray());
            final InputStream is = (buffer.length() > 0) ? new ByteArrayInputStream(StringUtils.hexToBytes(buffer.toString())) : null;
            ks.load(is, keystorePassword.toCharArray());
            if (is != null) {
                is.close();
                final KeyStore.SecretKeyEntry skEntry = (KeyStore.SecretKeyEntry)ks.getEntry("secretKeyAlias", protParam);
                secretKey = new String(skEntry.getSecretKey().getEncoded(), "UTF-8");
            }
            else {
                secretKey = CryptUtils.generateSecretKey();
                final SecretKey mySecretKey = new SecretKeySpec(secretKey.getBytes("UTF-8"), "AES");
                final KeyStore.SecretKeyEntry skEntry2 = new KeyStore.SecretKeyEntry(mySecretKey);
                ks.setEntry("secretKeyAlias", skEntry2, protParam);
                final ByteArrayOutputStream os = new ByteArrayOutputStream(500);
                ks.store(os, keystorePassword.toCharArray());
                buffer.append(StringUtils.bytesToHex(os.toByteArray()));
                os.close();
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return secretKey;
    }
    
    static {
        EMPTY_STRING = new String("");
        EMPTY_BYTE_ARRAY = new byte[0];
        SUPPORTED_CRYPTO_ALGORITHMS = PasswordCipherUtil.getSupportedCryptoAlgorithms();
        DEFAULT_CRYPTO_ALGORITHM = "aes";
        DEFAULT_CRYPTO_EYECATCHER = "{" + PasswordUtil.DEFAULT_CRYPTO_ALGORITHM + "}";
        final byte[] map = BASE64_ENCODE_MAP = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        BASE64_DECODE_MAP = new byte[128];
        for (int idx = 0; idx < PasswordUtil.BASE64_DECODE_MAP.length; ++idx) {
            PasswordUtil.BASE64_DECODE_MAP[idx] = -1;
        }
        for (int idx = 0; idx < PasswordUtil.BASE64_ENCODE_MAP.length; ++idx) {
            PasswordUtil.BASE64_DECODE_MAP[PasswordUtil.BASE64_ENCODE_MAP[idx]] = (byte)idx;
        }
    }
}
