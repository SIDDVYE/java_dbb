// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.beans;

public class BeanRuntimeException extends RuntimeException
{
    public BeanRuntimeException(final String message) {
        super(message);
    }
    
    public BeanRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public BeanRuntimeException(final Throwable cause) {
        super(cause);
    }
}
