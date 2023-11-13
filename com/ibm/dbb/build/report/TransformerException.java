// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report;

public class TransformerException extends Exception
{
    private static final long serialVersionUID = -4863148374625109303L;
    
    public TransformerException() {
    }
    
    public TransformerException(final String message) {
        super(message);
    }
    
    public TransformerException(final Throwable cause) {
        super(cause);
    }
    
    public TransformerException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
