// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner.common;

public class MetadataScannerException extends Exception
{
    private static final long serialVersionUID = 1L;
    
    public MetadataScannerException() {
    }
    
    public MetadataScannerException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public MetadataScannerException(final String message) {
        super(message);
    }
    
    public MetadataScannerException(final Throwable cause) {
        super(cause);
    }
}
