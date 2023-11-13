// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

public class BuildException extends Exception
{
    private static final long serialVersionUID = 4693819162018589691L;
    
    public BuildException() {
    }
    
    public BuildException(final String message) {
        super(message);
    }
    
    public BuildException(final Throwable cause) {
        super(cause);
    }
    
    public BuildException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
