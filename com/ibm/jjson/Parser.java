// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.io.StringReader;
import java.io.IOException;
import java.io.Reader;

public abstract class Parser implements Cloneable
{
    public abstract Object parse(final Reader p0, final long p1) throws ParseException, IOException;
    
    public Object parse(final CharSequence s) throws ParseException {
        try {
            return this.parse(new StringReader(s.toString()), s.length());
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Object parse(final Reader r) throws ParseException, IOException {
        return this.parse(r, 0L);
    }
    
    protected abstract void parseInto(final Reader p0, final long p1, final Object p2) throws ParseException, IOException;
    
    protected void parseInto(final CharSequence s, final Object o) throws ParseException {
        try {
            this.parseInto(new StringReader(s.toString()), s.length(), o);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
