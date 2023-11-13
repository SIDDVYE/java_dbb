// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.util;

import com.ibm.team.repository.common.utils.ContentLineDelimiterError;
import com.ibm.team.repository.common.util.NLS;
import com.ibm.team.filesystem.common.internal.Messages;
import java.io.IOException;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.io.UnsupportedEncodingException;
import java.io.InputStream;
import com.ibm.team.filesystem.common.FileLineDelimiter;
import java.io.InputStreamReader;

public abstract class LineDelimiterVerifier extends InputStreamReader
{
    private long lineDelimiterCount;
    private long markLineDelimiterCount;
    private boolean enabled;
    private FileLineDelimiter lineDelimiter;
    
    public LineDelimiterVerifier(final InputStream in, final String encoding, final FileLineDelimiter expectedLineTerminator) throws UnsupportedEncodingException {
        super(in, getCharsetDecoder(encoding));
        this.lineDelimiterCount = 0L;
        this.markLineDelimiterCount = 0L;
        this.lineDelimiter = FileLineDelimiter.LINE_DELIMITER_NONE;
        this.enabled = true;
        this.lineDelimiter = expectedLineTerminator;
        if (expectedLineTerminator == FileLineDelimiter.LINE_DELIMITER_PLATFORM) {
            throw new IllegalArgumentException();
        }
    }
    
    private static CharsetDecoder getCharsetDecoder(String encoding) {
        if (encoding == null) {
            encoding = "";
        }
        return Charset.forName(encoding).newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
    }
    
    public LineDelimiterVerifier(final InputStream in, final String encoding) throws UnsupportedEncodingException {
        this(in, encoding, FileLineDelimiter.LINE_DELIMITER_NONE);
    }
    
    @Override
    public void mark(final int readlimit) throws IOException {
        super.mark(readlimit);
        this.markLineDelimiterCount = this.lineDelimiterCount;
    }
    
    @Override
    public void reset() throws IOException {
        super.reset();
        this.lineDelimiterCount = this.markLineDelimiterCount;
    }
    
    protected final void validateLineDelimiter(final FileLineDelimiter delimiterFound) throws ContentLineDelimiterError {
        ++this.lineDelimiterCount;
        if (this.lineDelimiter == FileLineDelimiter.LINE_DELIMITER_NONE) {
            this.lineDelimiter = delimiterFound;
        }
        else if (this.enabled && this.lineDelimiter != delimiterFound) {
            final String msg = NLS.bind(Messages.getString("LineDelimiterVerifier_ErrorMismatchedDelimiters"), (Object)this.lineDelimiterCount, new Object[] { delimiterFound.toString(), this.lineDelimiter.toString() });
            throw new ContentLineDelimiterError(msg);
        }
    }
    
    public final long getLineDelimiterCount() {
        return this.lineDelimiterCount;
    }
    
    public final FileLineDelimiter getLineDelimiter() {
        return this.lineDelimiter;
    }
    
    final void setVerifyEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
}
