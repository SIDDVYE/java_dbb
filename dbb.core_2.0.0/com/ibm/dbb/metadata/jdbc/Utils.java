// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

import java.io.InputStream;
import java.util.zip.ZipInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import java.util.zip.ZipEntry;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.Adler32;

public class Utils
{
    private static final int BUFFER = 1024;
    
    public static long calculateChecksum(final byte[] source) {
        if (source == null) {
            return 0L;
        }
        final Adler32 alder = new Adler32();
        alder.update(source);
        return alder.getValue();
    }
    
    public static byte[] compress(final byte[] source) throws BuildException {
        if (source == null) {
            return null;
        }
        try {
            final ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
            final ZipOutputStream zipStream = new ZipOutputStream(byteStream);
            zipStream.putNextEntry(new ZipEntry("Content"));
            zipStream.write(source);
            zipStream.closeEntry();
            zipStream.finish();
            final byte[] bytes = byteStream.toByteArray();
            return bytes;
        }
        catch (IOException e) {
            throw new BuildException(e);
        }
    }
    
    public static byte[] decompress(final byte[] source) throws BuildException {
        if (source == null) {
            return null;
        }
        try {
            final ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
            final ByteArrayInputStream byteInputStream = new ByteArrayInputStream(source);
            final ZipInputStream zipStream = new ZipInputStream(byteInputStream);
            final ZipEntry entry = zipStream.getNextEntry();
            final byte[] bytes = new byte[1024];
            int count;
            while ((count = zipStream.read(bytes, 0, 1024)) != -1) {
                byteOutputStream.write(bytes, 0, count);
            }
            zipStream.close();
            return byteOutputStream.toByteArray();
        }
        catch (IOException e) {
            throw new BuildException(e);
        }
    }
}
