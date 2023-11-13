// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr;

import org.omg.CORBA.UserException;

public class SecurityException extends UserException
{
    private static final long serialVersionUID = 1L;
    public static final int PASSWORD_CIPHER_EXCEPTION = 1;
    public static final int PASSWORD_DECODING_EXCEPTION = 2;
    public static final int PASSWORD_ENCODING_EXCEPTION = 3;
    public static final int UNSUPPORTED_CRYPTO_ALGORITHM_EXCEPTION = 4;
    public int type;
    
    public SecurityException(final int type) {
        this.type = type;
    }
}
