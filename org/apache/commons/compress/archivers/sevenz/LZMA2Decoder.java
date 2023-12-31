// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.compress.archivers.sevenz;

import org.tukaani.xz.FinishableOutputStream;
import org.tukaani.xz.FinishableWrapperOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import org.apache.commons.compress.MemoryLimitException;
import org.tukaani.xz.LZMA2InputStream;
import java.io.InputStream;
import org.tukaani.xz.LZMA2Options;

class LZMA2Decoder extends CoderBase
{
    LZMA2Decoder() {
        super((Class<?>[])new Class[] { LZMA2Options.class, Number.class });
    }
    
    @Override
    InputStream decode(final String archiveName, final InputStream in, final long uncompressedLength, final Coder coder, final byte[] password, final int maxMemoryLimitInKb) throws IOException {
        try {
            final int dictionarySize = this.getDictionarySize(coder);
            final int memoryUsageInKb = LZMA2InputStream.getMemoryUsage(dictionarySize);
            if (memoryUsageInKb > maxMemoryLimitInKb) {
                throw new MemoryLimitException(memoryUsageInKb, maxMemoryLimitInKb);
            }
            return (InputStream)new LZMA2InputStream(in, dictionarySize);
        }
        catch (IllegalArgumentException ex) {
            throw new IOException(ex.getMessage());
        }
    }
    
    @Override
    OutputStream encode(final OutputStream out, final Object opts) throws IOException {
        final LZMA2Options options = this.getOptions(opts);
        final FinishableOutputStream wrapped = (FinishableOutputStream)new FinishableWrapperOutputStream(out);
        return (OutputStream)options.getOutputStream(wrapped);
    }
    
    @Override
    byte[] getOptionsAsProperties(final Object opts) {
        final int dictSize = this.getDictSize(opts);
        final int lead = Integer.numberOfLeadingZeros(dictSize);
        final int secondBit = (dictSize >>> 30 - lead) - 2;
        return new byte[] { (byte)((19 - lead) * 2 + secondBit) };
    }
    
    @Override
    Object getOptionsFromCoder(final Coder coder, final InputStream in) throws IOException {
        return this.getDictionarySize(coder);
    }
    
    private int getDictSize(final Object opts) {
        if (opts instanceof LZMA2Options) {
            return ((LZMA2Options)opts).getDictSize();
        }
        return this.numberOptionOrDefault(opts);
    }
    
    private int getDictionarySize(final Coder coder) throws IOException {
        if (coder.properties == null) {
            throw new IOException("Missing LZMA2 properties");
        }
        if (coder.properties.length < 1) {
            throw new IOException("LZMA2 properties too short");
        }
        final int dictionarySizeBits = 0xFF & coder.properties[0];
        if ((dictionarySizeBits & 0xFFFFFFC0) != 0x0) {
            throw new IOException("Unsupported LZMA2 property bits");
        }
        if (dictionarySizeBits > 40) {
            throw new IOException("Dictionary larger than 4GiB maximum size");
        }
        if (dictionarySizeBits == 40) {
            return -1;
        }
        return (0x2 | (dictionarySizeBits & 0x1)) << dictionarySizeBits / 2 + 11;
    }
    
    private LZMA2Options getOptions(final Object opts) throws IOException {
        if (opts instanceof LZMA2Options) {
            return (LZMA2Options)opts;
        }
        final LZMA2Options options = new LZMA2Options();
        options.setDictSize(this.numberOptionOrDefault(opts));
        return options;
    }
    
    private int numberOptionOrDefault(final Object opts) {
        return CoderBase.numberOptionOrDefault(opts, 8388608);
    }
}
