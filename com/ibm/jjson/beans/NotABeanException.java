// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.beans;

public class NotABeanException extends RuntimeException
{
    public NotABeanException(final String message) {
        super(message);
    }
    
    public NotABeanException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public NotABeanException(final Throwable cause) {
        super(cause);
    }
}
