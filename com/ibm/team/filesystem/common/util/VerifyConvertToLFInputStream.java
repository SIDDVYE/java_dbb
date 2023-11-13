// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.util;

import java.io.InterruptedIOException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import com.ibm.team.filesystem.common.FileLineDelimiter;
import java.io.InputStream;

public class VerifyConvertToLFInputStream extends LineDelimiterVerifier
{
    private boolean pendingChar;
    private int lastChar;
    
    public VerifyConvertToLFInputStream(final InputStream in, final String encoding) throws UnsupportedEncodingException {
        super(in, encoding, FileLineDelimiter.LINE_DELIMITER_NONE);
        this.pendingChar = false;
        this.lastChar = -1;
    }
    
    @Override
    public int read() throws IOException {
        if (!this.pendingChar) {
            this.lastChar = super.read();
            this.pendingChar = true;
        }
        if (this.lastChar == 13) {
            this.lastChar = super.read();
            if (this.lastChar != 10) {
                this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                if (this.lastChar == -1) {
                    this.pendingChar = false;
                }
                return 10;
            }
            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CRLF);
        }
        else if (this.lastChar == 10) {
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
            int charsReturned = 0;
            if (this.pendingChar) {
                buffer[off] = (char)this.lastChar;
                this.pendingChar = false;
                charsReturned = 1;
            }
            InterruptedIOException iioe = null;
            try {
                len = super.read(buffer, off + charsReturned, len - charsReturned);
                if (len == -1) {
                    if (charsReturned == 0) {
                        return -1;
                    }
                    if (buffer[off] == '\r') {
                        this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                        buffer[off] = '\n';
                    }
                    else if (buffer[off] == '\n') {
                        this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_LF);
                    }
                    return charsReturned;
                }
            }
            catch (InterruptedIOException e) {
                len = e.bytesTransferred;
                iioe = e;
            }
            int j = off;
            for (int i = off; i < off + len + charsReturned; ++i) {
                this.lastChar = buffer[i];
                if (this.lastChar == 13) {
                    if (this.pendingChar) {
                        this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                        buffer[j++] = '\n';
                    }
                    else {
                        this.pendingChar = true;
                    }
                }
                else {
                    if (this.pendingChar) {
                        if (this.lastChar == 10) {
                            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CRLF);
                        }
                        else {
                            this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_CR);
                            buffer[j++] = '\n';
                        }
                        this.pendingChar = false;
                    }
                    else if (this.lastChar == 10) {
                        this.validateLineDelimiter(FileLineDelimiter.LINE_DELIMITER_LF);
                    }
                    buffer[j++] = (char)this.lastChar;
                }
            }
            if (iioe != null) {
                iioe.bytesTransferred = j - off;
                throw iioe;
            }
            if (j - off != 0) {
                return j - off;
            }
            final int b2 = this.read();
            if (b2 == -1) {
                return -1;
            }
            buffer[off] = (char)b2;
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
