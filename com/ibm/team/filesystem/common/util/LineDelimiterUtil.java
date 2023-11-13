// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.util;

import java.io.IOException;
import com.ibm.team.filesystem.common.FileLineDelimiter;
import java.io.InputStream;

public class LineDelimiterUtil
{
    public static LineDelimiterVerifier getNonVerifyingLineDelimiterConverter(final InputStream content, final String encoding, FileLineDelimiter lineDelimiter) throws IOException {
        if (content == null) {
            throw new IllegalArgumentException("content stream must be supplied");
        }
        if (encoding == null) {
            throw new IllegalArgumentException("encoding must be supplied");
        }
        if (lineDelimiter == null) {
            throw new IllegalArgumentException("line delimiter must be supplied");
        }
        if (lineDelimiter == FileLineDelimiter.LINE_DELIMITER_NONE) {
            throw new IllegalArgumentException("no line delimiter as the conversion option is not valid");
        }
        if (lineDelimiter == FileLineDelimiter.LINE_DELIMITER_PLATFORM) {
            lineDelimiter = FileLineDelimiter.getPlatformDelimiter();
        }
        LineDelimiterVerifier result = null;
        switch (lineDelimiter) {
            case LINE_DELIMITER_CRLF: {
                result = new VerifyConvertToCRLFInputStream(content, encoding);
                break;
            }
            case LINE_DELIMITER_LF: {
                result = new VerifyConvertToLFInputStream(content, encoding);
                break;
            }
            case LINE_DELIMITER_CR: {
                result = new VerifyConvertToCRInputStream(content, encoding);
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        result.setVerifyEnabled(false);
        return result;
    }
}
