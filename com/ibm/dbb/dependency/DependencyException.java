// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

public class DependencyException extends Exception
{
    private static final long serialVersionUID = 4693819162018589691L;
    
    public DependencyException() {
    }
    
    public DependencyException(final String message) {
        super(message);
    }
    
    public DependencyException(final Throwable cause) {
        super(cause);
    }
    
    public DependencyException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
