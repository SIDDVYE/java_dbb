// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.proto;

import java.io.IOException;
import java.io.Reader;

public class PeekableReader extends Reader
{
    public static final int BUFFER_SIZE = 65535;
    private int blockSize;
    private int[] buffer;
    private PositionedReader in;
    private RollingInt iNext;
    private RollingInt iPeek;
    private RollingInt iRead;
    
    public PeekableReader(final Reader in, final int initBufferSize) {
        this.in = new PositionedReader(in);
        this.blockSize = initBufferSize / 2;
        this.buffer = new int[initBufferSize];
        this.iNext = new RollingInt(0);
        this.iPeek = new RollingInt(0);
        this.iRead = new RollingInt(0);
    }
    
    public int peek() throws IOException {
        if (this.iPeek.value == this.iNext.value) {
            if (this.iNext.minus(this.iRead) == this.buffer.length - 1) {
                this.expandBuffer();
            }
            this.buffer[this.iNext.postIncrement()] = this.in.read();
        }
        return this.buffer[this.iPeek.postIncrement()];
    }
    
    public void unread(final int c) {
        if (this.iNext.minus(this.iRead) == this.buffer.length - 1) {
            this.expandBuffer();
        }
        this.iRead.postDecrement();
        this.buffer[this.iRead.value] = c;
    }
    
    public void unpeek() throws IOException {
        if (this.iPeek.value == this.iRead.value) {
            throw new IOException("Cannot unpeek past last read point.");
        }
        this.iPeek.postDecrement();
    }
    
    public void peekReset() {
        this.iPeek.value = this.iRead.value;
    }
    
    private void fillBuffer() {
        final RollingInt n1 = new RollingInt(this.iNext.value);
        int n2 = this.iNext.value + this.blockSize;
        if (n2 >= this.buffer.length) {
            n2 -= this.buffer.length;
        }
        int n3 = n2 + this.blockSize;
        if (n3 >= this.buffer.length) {
            n3 -= this.buffer.length;
        }
    }
    
    private void expandBuffer() {
        System.err.println("EXPAND!");
        final int blen = this.buffer.length;
        final int[] x = new int[blen * 2];
        System.arraycopy(this.buffer, 0, x, 0, this.iRead.value);
        System.arraycopy(this.buffer, this.iRead.value, x, this.iRead.value + blen, blen - this.iRead.value);
        this.buffer = x;
        final RollingInt iRead = this.iRead;
        iRead.value += blen;
        if (this.iRead.value <= this.iPeek.value) {
            final RollingInt iPeek = this.iPeek;
            iPeek.value += blen;
        }
    }
    
    public String readPeeked() throws IOException {
        return this.read(this.iPeek.minus(this.iRead));
    }
    
    public String read(int count) throws IOException {
        if (count < 0) {
            count += this.iPeek.minus(this.iRead);
        }
        final char[] c = new char[count];
        this.read(c, 0, count);
        return new String(c);
    }
    
    public void reset(int count) throws IOException {
        count += this.iPeek.minus(this.iRead);
        for (int i = 0; i < count; ++i) {
            this.read();
        }
    }
    
    @Override
    public void close() throws IOException {
        this.in.close();
    }
    
    public String readString(final int n) throws IOException {
        final char[] c = new char[n];
        for (int i = 0; i < c.length; ++i) {
            c[i] = (char)this.read();
        }
        return new String(c);
    }
    
    @Override
    public int read() throws IOException {
        final int c = (this.iRead.value == this.iNext.value) ? this.in.read() : this.buffer[this.iRead.postIncrement()];
        this.peekReset();
        return c;
    }
    
    @Override
    public int read(final char[] cbuf, int off, int len) throws IOException {
        int rv = 0;
        if (this.iNext.value != this.iRead.value) {
            while (this.iNext.value != this.iRead.value && len > 0) {
                cbuf[off++] = (char)this.buffer[this.iRead.postIncrement()];
                --len;
                ++rv;
            }
            rv += this.in.read(cbuf, off, len);
        }
        else {
            rv = this.in.read(cbuf, off, len);
        }
        this.peekReset();
        return rv;
    }
    
    public int getLineNo() {
        return this.in.getLineNo();
    }
    
    public int getColumnNo() {
        return this.in.getColumnNo();
    }
    
    class RollingInt
    {
        private int value;
        
        public RollingInt(final int value) {
            this.value = 0;
            this.add(value);
        }
        
        private void add(final int i) {
            if (i == 0) {
                return;
            }
            this.value += i;
            if (this.value >= PeekableReader.this.buffer.length) {
                this.value -= PeekableReader.this.buffer.length;
            }
        }
        
        private int minus(final RollingInt i2) {
            if (this.value >= i2.value) {
                return this.value - i2.value;
            }
            return this.value + PeekableReader.this.buffer.length - i2.value;
        }
        
        private int postDecrement() {
            final int v = this.value;
            --this.value;
            if (this.value == -1) {
                this.value = PeekableReader.this.buffer.length - 1;
            }
            return v;
        }
        
        private int postIncrement() {
            final int v = this.value;
            ++this.value;
            if (this.value == PeekableReader.this.buffer.length) {
                this.value = 0;
            }
            return v;
        }
        
        @Override
        public String toString() {
            return "value[" + this.value + "]";
        }
    }
    
    public class PositionedReader extends Reader
    {
        private int lineNo;
        private int columnNo;
        private Reader in;
        
        public PositionedReader(final Reader in) {
            this.in = in;
            this.columnNo = 0;
            this.lineNo = 1;
        }
        
        @Override
        public void close() throws IOException {
            this.in.close();
        }
        
        public int getColumnNo() {
            return this.columnNo;
        }
        
        public int getLineNo() {
            return this.lineNo;
        }
        
        private void incrementPositions(final char c) {
            if (c == '\n') {
                ++this.lineNo;
                this.columnNo = 0;
            }
            else {
                ++this.columnNo;
            }
        }
        
        @Override
        public int read() throws IOException {
            final int c = this.in.read();
            this.incrementPositions((char)c);
            return c;
        }
        
        @Override
        public int read(final char[] cbuf, final int off, final int len) throws IOException {
            final int rv = this.in.read(cbuf, off, len);
            for (int i = 0; i < rv; ++i) {
                this.incrementPositions(cbuf[i + off]);
            }
            return rv;
        }
        
        @Override
        public String toString() {
            return "lineNo[" + this.lineNo + "] columnNo[" + this.columnNo + "]";
        }
    }
}
