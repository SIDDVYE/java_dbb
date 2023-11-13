// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import org.eclipse.core.runtime.IStatus;
import com.ibm.team.scm.common.IVersionedContent;

public interface IFileContent extends IVersionedContent
{
    public static final String ENCODING_US_ASCII = "us-ascii";
    public static final String ENCODING_UTF_8 = "UTF-8";
    public static final String ENCODING_UTF_16BE = "UTF-16BE";
    public static final String ENCODING_UTF_16LE = "UTF-16LE";
    
    String getCharacterEncoding();
    
    long getRawLength();
    
    long getEstimatedConvertedLength();
    
    FileLineDelimiter getLineDelimiter();
    
    boolean sameContent(final IFileContent p0);
    
    IStatus validate();
}
