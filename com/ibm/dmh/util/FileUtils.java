// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class FileUtils
{
    public static void deleteChildren(final File file) {
        if (!file.isDirectory()) {
            return;
        }
        for (final File child : file.listFiles()) {
            if (child.isDirectory()) {
                deleteChildren(child);
            }
            child.delete();
        }
    }
    
    public static void delete(final File file) {
        deleteChildren(file);
        file.delete();
    }
    
    public static void copy(final File source, final File target) throws IOException {
        if (!source.exists()) {
            throw new FileNotFoundException(source.getAbsolutePath());
        }
        if (source.isDirectory()) {
            if (target.exists()) {
                delete(target);
            }
            target.mkdirs();
            for (final String child : source.list()) {
                copy(new File(source, child), new File(target, child));
            }
        }
        else {
            final InputStream in = new FileInputStream(source);
            final OutputStream out = new FileOutputStream(target);
            final byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        }
    }
    
    public static File[] findChildren(final File parent, final String pattern) {
        return findChildren(parent, Pattern.compile(pattern.replace(".", "\\.").replace("*", ".*")));
    }
    
    public static File[] findChildren(final File parent, final Pattern p) {
        return parent.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(final File dir, final String name) {
                return p.matcher(name).matches();
            }
        });
    }
    
    public static void write(final File f, final String contents) throws IOException {
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        final Writer w = new BufferedWriter(new FileWriter(f));
        w.write(contents);
        w.flush();
        w.close();
    }
    
    public static void write(final File f, final InputStream is) throws IOException {
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        final BufferedInputStream bis = (BufferedInputStream)((is instanceof BufferedInputStream) ? is : new BufferedInputStream(is));
        final BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
        final byte[] bbuf = new byte[1024];
        int i = 0;
        while ((i = bis.read(bbuf)) != -1) {
            bos.write(bbuf, 0, i);
        }
        bos.flush();
        bos.close();
    }
    
    public static void write(final File f, final Reader r) throws IOException {
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        final BufferedReader br = (BufferedReader)((r instanceof BufferedReader) ? r : new BufferedReader(r));
        final BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        final char[] cbuf = new char[1024];
        int i = 0;
        while ((i = br.read(cbuf)) != -1) {
            bw.write(cbuf, 0, i);
        }
        bw.flush();
        bw.close();
    }
    
    public static void mkdirs(final File f) throws IOException {
        if (!f.exists()) {
            f.mkdirs();
        }
        if (Environment.isUnix() && (!f.canRead() || !f.canWrite())) {
            Runtime.getRuntime().exec("chmod 777 " + f.getAbsolutePath());
        }
    }
}
