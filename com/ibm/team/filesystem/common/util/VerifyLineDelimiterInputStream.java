// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.util;

import java.io.InterruptedIOException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import com.ibm.team.filesystem.common.FileLineDelimiter;
import java.io.InputStream;

public class VerifyLineDelimiterInputStream extends LineDelimiterVerifier
{
    private boolean pendingChar;
    private int lastChar;
    private boolean markPendingChar;
    private int markLastChar;
    
    public VerifyLineDelimiterInputStream(final InputStream in, final String encoding, final FileLineDelimiter expectedLineTerminator) throws UnsupportedEncodingException {
        super(in, encoding, expectedLineTerminator);
        this.pendingChar = false;
        this.lastChar = -1;
        this.markPendingChar = false;
        this.markLastChar = -1;
    }
    
    public VerifyLineDelimiterInputStream(final InputStream in, final String encoding) throws UnsupportedEncodingException {
        this(in, encoding, FileLineDelimiter.LINE_DELIMITER_NONE);
    }
    
    @Override
    public int read() throws IOException {
        boolean wasPending = false;
        if (!this.pendingChar) {
            this.lastChar = super.read();
            this.pendingChar = true;
        }
        else {
            wasPending = true;
        }
        if (this.lastChar == 13) {
            this.lastChar = super.read();
            if (this.lastChar == 10) {
                this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CRLF);
            }
            else {
                this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                if (this.lastChar == -1) {
                    this.pendingChar = false;
                }
            }
            return 13;
        }
        if (this.lastChar == 10 && !wasPending) {
            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_LF);
        }
        this.pendingChar = false;
        return this.lastChar;
    }
    
    @Override
    public int read(final char[] buffer, final int off, int len) throws IOException {
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            final int b = this.read();
            if (b == -1) {
                return -1;
            }
            buffer[off] = (char)b;
            return 1;
        }
        else {
            int count = 0;
            int startValidate = off;
            if (this.pendingChar) {
                buffer[off] = (char)this.lastChar;
                this.pendingChar = false;
                count = 1;
                if (this.lastChar == 10) {
                    ++startValidate;
                }
            }
            InterruptedIOException iioe = null;
            try {
                len = super.read(buffer, off + count, len - count);
                if (len == -1) {
                    if (count == 0) {
                        return -1;
                    }
                    if (startValidate == off) {
                        final char b2 = buffer[startValidate];
                        if (b2 == '\r') {
                            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                        }
                        return count;
                    }
                }
            }
            catch (InterruptedIOException e) {
                len = e.bytesTransferred;
                iioe = e;
            }
            int j = startValidate;
            for (int i = startValidate; i < off + count + len; ++i) {
                this.lastChar = buffer[i];
                if (this.lastChar == 13) {
                    if (this.pendingChar) {
                        this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                        ++j;
                    }
                    else {
                        this.pendingChar = true;
                    }
                }
                else {
                    if (this.pendingChar) {
                        ++j;
                        if (this.lastChar == 10) {
                            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CRLF);
                        }
                        else {
                            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                        }
                        this.pendingChar = false;
                    }
                    else if (this.lastChar == 10) {
                        this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_LF);
                    }
                    ++j;
                }
            }
            if (iioe != null) {
                iioe.bytesTransferred = j - off;
                throw iioe;
            }
            if (j - off != 0) {
                return j - off;
            }
            final int b3 = this.read();
            if (b3 == -1) {
                return -1;
            }
            buffer[off] = (char)b3;
            return 1;
        }
    }
    
    @Override
    public long skip(long count) throws IOException {
        int actualCount = 0;
        try {
            while (count-- > 0L && this.read() != -1) {
                ++actualCount;
            }
            return actualCount;
        }
        catch (InterruptedIOException e) {
            e.bytesTransferred = actualCount;
            throw e;
        }
    }
    
    @Override
    public void mark(final int readlimit) throws IOException {
        super.mark(readlimit + 2);
        this.markLastChar = this.lastChar;
        this.markPendingChar = this.pendingChar;
    }
    
    @Override
    public void reset() throws IOException {
        super.reset();
        this.lastChar = this.markLastChar;
        this.pendingChar = this.markPendingChar;
    }
}
