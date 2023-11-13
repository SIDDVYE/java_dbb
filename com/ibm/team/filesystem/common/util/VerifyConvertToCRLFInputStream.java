// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.util;

import java.io.InterruptedIOException;
import java.io.IOException;
import com.ibm.team.filesystem.common.FileLineDelimiter;
import java.io.UnsupportedEncodingException;
import java.io.InputStream;

public class VerifyConvertToCRLFInputStream extends LineDelimiterVerifier
{
    private boolean pendingChar;
    private int lastChar;
    private boolean mustReturnLF;
    
    public VerifyConvertToCRLFInputStream(final InputStream in, final String encoding) throws UnsupportedEncodingException {
        super(in, encoding);
        this.pendingChar = false;
        this.lastChar = -1;
        this.mustReturnLF = false;
    }
    
    @Override
    public int read() throws IOException {
        if (this.mustReturnLF) {
            this.mustReturnLF = false;
            return 10;
        }
        if (!this.pendingChar) {
            this.lastChar = super.read();
            this.pendingChar = true;
        }
        if (this.lastChar == 13) {
            this.lastChar = super.read();
            if (this.lastChar == 10) {
                this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CRLF);
                this.pendingChar = false;
            }
            else {
                this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                if (this.lastChar == -1) {
                    this.pendingChar = false;
                }
            }
            this.mustReturnLF = true;
            return 13;
        }
        if (this.lastChar == 10) {
            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_LF);
            this.pendingChar = false;
            this.mustReturnLF = true;
            return 13;
        }
        this.pendingChar = false;
        return this.lastChar;
    }
    
    @Override
    public int read(final char[] buffer, int off, int len) throws IOException {
        if (len == 0) {
            return 0;
        }
        if (len <= 2) {
            final int b = this.read();
            if (b == -1) {
                return -1;
            }
            buffer[off] = (char)b;
            return 1;
        }
        else {
            int charsReturned = 0;
            if (this.mustReturnLF) {
                this.mustReturnLF = false;
                buffer[off++] = '\n';
                --len;
                ++charsReturned;
                if (len < 2) {
                    return charsReturned;
                }
            }
            len /= 2;
            int j = off + len;
            int toProcess = 0;
            int toRead = len;
            if (this.pendingChar) {
                this.pendingChar = false;
                buffer[j] = (char)this.lastChar;
                --toRead;
                ++charsReturned;
                ++toProcess;
            }
            InterruptedIOException iioe = null;
            try {
                len = super.read(buffer, j + toProcess, toRead);
                if (len == -1) {
                    if (toProcess == 0) {
                        return (charsReturned == 0) ? -1 : charsReturned;
                    }
                    char b2 = buffer[j];
                    if (b2 == '\n') {
                        this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_LF);
                        buffer[off++] = '\r';
                        ++charsReturned;
                    }
                    else if (b2 == '\r') {
                        this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                        buffer[off++] = b2;
                        ++charsReturned;
                        b2 = '\n';
                    }
                    buffer[off++] = b2;
                    return charsReturned;
                }
            }
            catch (InterruptedIOException e) {
                len = e.bytesTransferred;
                iioe = e;
            }
            charsReturned += len;
            toProcess += len;
            while (toProcess-- > 0) {
                final char b2 = buffer[j++];
                if (b2 == '\r') {
                    if (toProcess > 0) {
                        if (buffer[j] == '\n') {
                            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CRLF);
                            buffer[off++] = b2;
                            buffer[off++] = buffer[j++];
                            --toProcess;
                        }
                        else {
                            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                            buffer[off++] = b2;
                            buffer[off++] = '\n';
                            ++charsReturned;
                        }
                    }
                    else {
                        this.pendingChar = true;
                        this.lastChar = b2;
                        --charsReturned;
                    }
                }
                else if (b2 == '\n') {
                    this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_LF);
                    buffer[off++] = '\r';
                    ++charsReturned;
                    buffer[off++] = b2;
                }
                else {
                    buffer[off++] = b2;
                }
            }
            if (iioe != null) {
                iioe.bytesTransferred = charsReturned;
                throw iioe;
            }
            if (charsReturned != 0) {
                return charsReturned;
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
    public long skip(long skipBytes) throws IOException {
        int actualCount = 0;
        try {
            while (skipBytes-- > 0L && this.read() != -1) {
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
    public boolean markSupported() {
        return false;
    }
}
