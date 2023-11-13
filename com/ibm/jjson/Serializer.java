// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.io.StringWriter;
import java.io.IOException;
import java.io.Writer;

public abstract class Serializer implements Cloneable
{
    public abstract Writer serialize(final Writer p0, final Object p1, final int p2) throws IOException;
    
    public Writer serialize(final Writer w, final Object o) throws IOException {
        return this.serialize(w, o, 0);
    }
    
    public String serialize(final Object o) {
        try {
            return this.serialize(new StringWriter(), o, 0).toString();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String serialize(final Object o, final int depth) {
        try {
            return this.serialize(new StringWriter(), o, depth).toString();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    protected static void cr(final Writer out, final int depth) throws IOException {
        out.write(10);
        for (int i = 0; i < depth; ++i) {
            out.write(9);
        }
    }
}
