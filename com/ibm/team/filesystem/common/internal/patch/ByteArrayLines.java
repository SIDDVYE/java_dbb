// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.io.InputStream;
import java.util.List;

public class ByteArrayLines
{
    List<ByteArrayLine> lines;
    boolean hasTrailingNL;
    
    public ByteArrayLines(final InputStream in) throws IOException {
        this.hasTrailingNL = true;
        this.lines = new ArrayList<ByteArrayLine>();
        if (in != null) {
            try {
                final ByteArrayOutputStream out = new ByteArrayOutputStream(256);
                final byte[] buf = new byte[8192];
                while (true) {
                    final int count = in.read(buf);
                    if (count == -1) {
                        break;
                    }
                    int start = 0;
                    for (int i = 0; i < count; ++i) {
                        if (buf[i] == 10) {
                            out.write(buf, start, i - start + 1);
                            this.lines.add(new ByteArrayLine(out.toByteArray()));
                            out.reset();
                            start = i + 1;
                        }
                    }
                    if (start >= count) {
                        continue;
                    }
                    out.write(buf, start, count - start);
                }
                final byte[] content = out.toByteArray();
                if (content.length != 0) {
                    this.lines.add(new ByteArrayLine(content));
                    this.hasTrailingNL = false;
                }
            }
            finally {
                try {
                    in.close();
                }
                catch (IOException ex) {}
            }
            try {
                in.close();
            }
            catch (IOException ex2) {}
        }
    }
    
    public int numLines() {
        return this.lines.size();
    }
    
    public ByteArrayLine getLine(final int line) {
        return this.lines.get(line);
    }
    
    public byte[] get(final int line) {
        return this.lines.get(line).bytes;
    }
    
    public boolean hasTrailingNL() {
        return this.hasTrailingNL;
    }
    
    public LCS lcs(final ByteArrayLines other) {
        final ILCSInput<ByteArrayLine> input = new ILCSInput<ByteArrayLine>() {
            @Override
            public int length1() {
                return ByteArrayLines.this.numLines();
            }
            
            @Override
            public int length2() {
                return other.numLines();
            }
            
            @Override
            public ByteArrayLine get1(final int i) {
                return ByteArrayLines.this.getLine(i);
            }
            
            @Override
            public ByteArrayLine get2(final int i) {
                return other.getLine(i);
            }
            
            @Override
            public boolean match(final ByteArrayLine e1, final ByteArrayLine e2) {
                return e1.equals(e2);
            }
        };
        return LCS.lcs(input);
    }
}
