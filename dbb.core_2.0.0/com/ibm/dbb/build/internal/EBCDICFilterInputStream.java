// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public class EBCDICFilterInputStream extends FilterInputStream
{
    private static final int LINE_FEED = 37;
    private static final int CARRIAGE_RETURN = 13;
    private static final int NEW_LINE = 21;
    private static final int HORIZONTAL_TAB = 5;
    private static final int GRAPHIC_ESCAPE = 8;
    private static final int SHIFT_IN = 15;
    private static final int SHIFT_OUT = 14;
    private static final int EBCDIC_SPACE = 64;
    private static final int PRINT_AND_SKIP_TO_CHANNEL_1 = 137;
    private static final int SKIP_TO_CHANNEL_1 = 139;
    private boolean lineBoundary;
    InputStream in;
    
    public EBCDICFilterInputStream(final InputStream in) {
        super(in);
        this.lineBoundary = true;
        this.in = in;
    }
    
    @Override
    public int read() throws IOException {
        return this.convert(this.in.read());
    }
    
    @Override
    public int read(final byte[] b) throws IOException {
        return (b == null) ? 0 : this.read(b, 0, b.length);
    }
    
    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        final int n = this.in.read(b, off, len);
        if (n > 0) {
            for (int i = off; i < off + n; ++i) {
                b[i] = (byte)this.convert(b[i] & 0xFF);
            }
        }
        return n;
    }
    
    private int convert(final int c) {
        if (this.lineBoundary && (c == 137 || c == 139)) {
            this.lineBoundary = false;
            return 64;
        }
        this.lineBoundary = (c == 21 || c == 37);
        return (c >= 64 || c == 14 || c == 15 || c == 8 || c == 5 || c == 21 || c == 13 || c == 37) ? c : 64;
    }
}
