// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.io.IOException;
import java.io.Reader;

public class HtmlParser extends Parser
{
    public static final HtmlParser DEFAULT;
    
    public HtmlParser clone() {
        try {
            return (HtmlParser)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Object parse(final Reader r, final long length) throws ParseException, IOException {
        throw new UnsupportedOperationException("Method not implemented.");
    }
    
    @Override
    protected void parseInto(final Reader r, final long length, final Object o) throws ParseException, IOException {
        throw new UnsupportedOperationException("Method not implemented.");
    }
    
    static {
        DEFAULT = new HtmlParser();
    }
}
