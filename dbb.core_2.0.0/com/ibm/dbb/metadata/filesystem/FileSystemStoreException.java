// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import com.ibm.dbb.build.BuildException;

public class FileSystemStoreException extends BuildException
{
    public FileSystemStoreException(final String message) {
        super(message);
    }
    
    public FileSystemStoreException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
