// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report;

public class ParseException extends RuntimeException
{
    private static final long serialVersionUID = 581016122004752336L;
    
    public ParseException() {
    }
    
    public ParseException(final String message) {
        super(message);
    }
    
    public ParseException(final Throwable cause) {
        super(cause);
    }
    
    public ParseException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
