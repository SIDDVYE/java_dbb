// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.repository.common.TeamRepositoryException;
import com.ibm.team.repository.common.util.NLS;
import com.ibm.team.filesystem.common.internal.Messages;
import java.util.Arrays;

public enum FileLineDelimiter
{
    LINE_DELIMITER_NONE("LINE_DELIMITER_NONE", 0, 0), 
    LINE_DELIMITER_LF("LINE_DELIMITER_LF", 1, 1), 
    LINE_DELIMITER_CR("LINE_DELIMITER_CR", 2, 2), 
    LINE_DELIMITER_CRLF("LINE_DELIMITER_CRLF", 3, 3), 
    LINE_DELIMITER_PLATFORM("LINE_DELIMITER_PLATFORM", 4, 4);
    
    private static final String[] PRETTY_NAME;
    private final int dbValue;
    private static final boolean IS_CRLF_PLATFORM;
    private static final boolean IS_LF_PLATFORM;
    private static final boolean IS_CR_PLATFORM;
    
    static {
        PRETTY_NAME = new String[] { "None", "LF (Unix)", "CR (Mac)", "CRLF (Windows)", "Platform" };
        IS_CRLF_PLATFORM = Arrays.equals(System.getProperty("line.separator").toCharArray(), new char[] { '\r', '\n' });
        IS_LF_PLATFORM = Arrays.equals(System.getProperty("line.separator").toCharArray(), new char[] { '\n' });
        IS_CR_PLATFORM = Arrays.equals(System.getProperty("line.separator").toCharArray(), new char[] { '\r' });
    }
    
    private FileLineDelimiter(final String name, final int ordinal, final int dbValue) {
        this.dbValue = dbValue;
    }
    
    public int dbValue() {
        return this.dbValue;
    }
    
    public static FileLineDelimiter getLineDelimiter(final int dbValue) {
        FileLineDelimiter[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final FileLineDelimiter delimiter = values[i];
            if (delimiter.dbValue() == dbValue) {
                return delimiter;
            }
        }
        return null;
    }
    
    public static FileLineDelimiter fromString(final String name) {
        if (name == null) {
            return null;
        }
        for (int i = 0; i < FileLineDelimiter.PRETTY_NAME.length; ++i) {
            if (name.equals(FileLineDelimiter.PRETTY_NAME[i])) {
                return values()[i];
            }
        }
        return null;
    }
    
    public String asQuery() throws TeamRepositoryException {
        if (this == FileLineDelimiter.LINE_DELIMITER_NONE) {
            return "";
        }
        if (this == FileLineDelimiter.LINE_DELIMITER_LF) {
            return "LF";
        }
        if (this == FileLineDelimiter.LINE_DELIMITER_CR) {
            return "CR";
        }
        if (this == FileLineDelimiter.LINE_DELIMITER_CRLF) {
            return "CRLF";
        }
        throw new TeamRepositoryException(NLS.bind(Messages.getString("LineDelimiter_0"), (Object)this.toString(), new Object[0]));
    }
    
    public static FileLineDelimiter fromQuery(final String query) {
        if (query == null || query.length() == 0) {
            return FileLineDelimiter.LINE_DELIMITER_NONE;
        }
        if (query.equals("LF")) {
            return FileLineDelimiter.LINE_DELIMITER_LF;
        }
        if (query.equals("CR")) {
            return FileLineDelimiter.LINE_DELIMITER_CR;
        }
        if (query.equals("CRLF")) {
            return FileLineDelimiter.LINE_DELIMITER_CRLF;
        }
        throw new IllegalArgumentException("Unrecognized query string for delimiter type");
    }
    
    public static FileLineDelimiter getPlatformDelimiter() {
        if (FileLineDelimiter.IS_CRLF_PLATFORM) {
            return FileLineDelimiter.LINE_DELIMITER_CRLF;
        }
        if (FileLineDelimiter.IS_LF_PLATFORM) {
            return FileLineDelimiter.LINE_DELIMITER_LF;
        }
        if (FileLineDelimiter.IS_CR_PLATFORM) {
            return FileLineDelimiter.LINE_DELIMITER_CR;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public String toString() {
        return FileLineDelimiter.PRETTY_NAME[this.dbValue];
    }
}
