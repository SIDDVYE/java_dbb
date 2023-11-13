// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import com.ibm.team.filesystem.common.internal.FileContent;
import com.ibm.team.filesystem.common.IFileContent;
import com.ibm.team.filesystem.common.FileLineDelimiter;

public class FileContentProperties
{
    public final String encoding;
    public final FileLineDelimiter lineDelimiter;
    private long numLineDelimiters;
    private boolean lineDelimiterCountComputed;
    
    public FileContentProperties(final String encoding, final FileLineDelimiter lineDelimiter) {
        this.encoding = encoding;
        this.lineDelimiter = lineDelimiter;
        this.numLineDelimiters = 0L;
        this.lineDelimiterCountComputed = false;
        this.validateInitial();
    }
    
    public FileContentProperties(final IFileContent content) {
        this.encoding = content.getCharacterEncoding();
        this.lineDelimiter = content.getLineDelimiter();
        this.numLineDelimiters = ((FileContent)content).getLineDelimiterCount();
        this.lineDelimiterCountComputed = true;
        this.validateInitial();
    }
    
    public long getLineDelimiterCount() {
        return this.numLineDelimiters;
    }
    
    public void setLineDelimiterCount(final long count) {
        this.numLineDelimiters = count;
        this.lineDelimiterCountComputed = true;
    }
    
    public void validateForStore() {
        if (!this.lineDelimiterCountComputed && this.lineDelimiter != FileLineDelimiter.LINE_DELIMITER_NONE) {
            throw new IllegalStateException("Line delimiter count was not computed but line delimiter is " + this.lineDelimiter);
        }
        this.validateInitial();
    }
    
    private void validateInitial() {
        if (!validLineDelimiter(this.lineDelimiter)) {
            throw new IllegalArgumentException();
        }
        if (this.lineDelimiter != FileLineDelimiter.LINE_DELIMITER_NONE && (this.encoding == null || this.encoding.trim().length() == 0)) {
            throw new IllegalArgumentException("Character encoding must be supplied if line delimiters are present");
        }
        if (this.lineDelimiter == FileLineDelimiter.LINE_DELIMITER_NONE && this.numLineDelimiters != 0L) {
            throw new IllegalArgumentException("Line delimiter count should be 0 is line delimiter is NONE");
        }
    }
    
    public static boolean validLineDelimiter(final FileLineDelimiter lineDelimiter) {
        return lineDelimiter == FileLineDelimiter.LINE_DELIMITER_NONE || lineDelimiter == FileLineDelimiter.LINE_DELIMITER_LF || lineDelimiter == FileLineDelimiter.LINE_DELIMITER_CRLF || lineDelimiter == FileLineDelimiter.LINE_DELIMITER_CR || lineDelimiter == FileLineDelimiter.LINE_DELIMITER_PLATFORM;
    }
}
