// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

public class ValidationException extends RuntimeException
{
    private static final long serialVersionUID = 8209376982233234427L;
    
    public ValidationException() {
    }
    
    public ValidationException(final String message) {
        super(message);
    }
    
    public ValidationException(final Throwable cause) {
        super(cause);
    }
    
    public ValidationException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
