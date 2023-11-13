// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;

public class ReaderUtils
{
    public static String read(final Reader r) throws IOException {
        try {
            final char[] cbuf = new char[1024];
            int c = 0;
            final StringBuilder sb = new StringBuilder();
            while ((c = r.read(cbuf, 0, 1024)) != -1) {
                sb.append(cbuf, 0, c);
            }
            r.close();
            return sb.toString();
        }
        finally {
            r.close();
        }
    }
    
    public static String read(final InputStream is, final Charset cs) throws IOException {
        return read(new BufferedReader(new InputStreamReader(is, cs)));
    }
    
    public static String read(final InputStream is) throws IOException {
        return read(new BufferedReader(new InputStreamReader(is, Charset.defaultCharset())));
    }
}
