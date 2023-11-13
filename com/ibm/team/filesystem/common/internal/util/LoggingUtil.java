// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.ByteArrayOutputStream;

public class LoggingUtil
{
    private static final String NEWLINE;
    
    static {
        NEWLINE = System.getProperty("line.separator");
    }
    
    public static String getStackTrace(final Throwable t) {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final PrintWriter printWriter = new PrintWriter(baos);
        t.fillInStackTrace();
        t.printStackTrace(printWriter);
        printWriter.close();
        return baos.toString();
    }
    
    public static String indent(final String s) {
        final StringBuffer buf = new StringBuffer((int)(s.length() * 1.1));
        final BufferedReader multilineContent = new BufferedReader(new StringReader(s));
        try {
            try {
                String line;
                while ((line = multilineContent.readLine()) != null) {
                    buf.append('\t');
                    buf.append(line);
                    buf.append(LoggingUtil.NEWLINE);
                }
            }
            finally {
                multilineContent.close();
            }
            multilineContent.close();
        }
        catch (IOException e) {
            return "IOExcention while buffering content: " + e.getMessage();
        }
        return buf.toString();
    }
}
