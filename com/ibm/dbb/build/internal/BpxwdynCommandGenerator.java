// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.util.Iterator;
import java.util.List;
import com.ibm.dbb.build.DDStatement;

public class BpxwdynCommandGenerator
{
    private static final String ALLOC_COMMAND = "alloc";
    private static final String FREE_COMMAND = "free";
    private static final String CONCAT_COMMAND = "concat";
    private static final String DD_KEYWORD = "dd";
    private static final String DSN_KEYWORD = "dsn";
    private static final String PATH_KEYWORD = "path";
    private static final String DDLIST_KEYWORD = "ddlist";
    private static final char SINGLE_QUOTE = '\'';
    private static final char SPACE = ' ';
    private static final char OPEN_PAREN = '(';
    private static final char CLOSED_PAREN = ')';
    private static final String DEFAULT_IN_STREAM_DD_ALLOC = "tracks space(5,5) unit(vio) blksize(80) lrecl(80) recfm(f,b) new";
    
    public static String generateAllocCommand(final DDStatement dd, final String globalOptions) {
        final boolean isInStreamDD = dd.getInstreamData() != null;
        return generateAllocCommand(dd, globalOptions, isInStreamDD);
    }
    
    public static String generateAllocCommand(final DDStatement dd, final String globalOptions, final boolean isInStreamDD) {
        final StringBuilder buffer = new StringBuilder("alloc");
        if (dd.getName() != null && !dd.getName().isEmpty()) {
            buffer.append(' ').append("dd").append('(').append(dd.getName().trim()).append(')');
        }
        if (dd.getDsn() != null && !dd.getDsn().isEmpty()) {
            buffer.append(' ').append("dsn").append('(').append(dd.getDsn().trim()).append(')');
        }
        if (dd.getPath() != null && !dd.getPath().isEmpty()) {
            buffer.append(' ').append("path").append('(').append('\'').append(dd.getPath().trim()).append('\'').append(')');
        }
        if (dd.getOptions() != null && !dd.getOptions().isEmpty()) {
            buffer.append(' ').append(dd.getOptions());
        }
        else if (isInStreamDD) {
            buffer.append(' ').append("tracks space(5,5) unit(vio) blksize(80) lrecl(80) recfm(f,b) new");
        }
        if (!isInStreamDD && globalOptions != null && !globalOptions.isEmpty()) {
            buffer.append(' ').append(globalOptions);
        }
        return buffer.toString();
    }
    
    public static String generateFreeCommand(final String ddName, final String globalOptions) {
        final StringBuilder buffer = new StringBuilder("free");
        buffer.append(' ').append("dd").append('(').append(ddName.trim()).append(')');
        if (globalOptions != null && !globalOptions.isEmpty()) {
            buffer.append(' ').append(globalOptions);
        }
        return buffer.toString();
    }
    
    public static String generateConcatCommand(final List<String> ddNames, final String globalOptions) {
        final StringBuilder buffer = new StringBuilder("concat");
        buffer.append(' ').append("ddlist").append('(');
        final Iterator<String> ddNameIterator = ddNames.iterator();
        while (ddNameIterator.hasNext()) {
            buffer.append(ddNameIterator.next().trim());
            if (ddNameIterator.hasNext()) {
                buffer.append(',');
            }
        }
        buffer.append(')');
        if (globalOptions != null && !globalOptions.isEmpty()) {
            buffer.append(' ').append(globalOptions);
        }
        return buffer.toString();
    }
}
