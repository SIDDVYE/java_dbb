// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

public class ParseException extends RuntimeException
{
    private static final long serialVersionUID = 1L;
    
    public ParseException(final Exception e) {
        super(e.getLocalizedMessage());
    }
    
    public ParseException(final CharSequence input, final int startPos, final String errorMsg) {
        this(input, startPos, startPos, errorMsg);
    }
    
    public ParseException(final int lineNumber, final int colNumber, final String errorMsg) {
        super("Syntax error at line=[" + lineNumber + "], column=[" + colNumber + "], [" + errorMsg + "], ");
    }
    
    public ParseException(final CharSequence input, final int startPos, final int errorPos, final String errorMsg) {
        super("Syntax error at line [" + getLineNum(input, errorPos) + "], " + errorMsg + ".\n\tfragment=[" + (Object)getFragment(input, startPos, errorPos) + "]");
    }
    
    private static int getLineNum(final CharSequence input, final int startPos) {
        int lineNum = 1;
        for (int i = 0; i < startPos; ++i) {
            if (input.charAt(i) == '\n') {
                ++lineNum;
            }
        }
        return lineNum;
    }
    
    private static CharSequence getFragment(final CharSequence input, final int startPos, final int errorPos) {
        if (input.length() == 0) {
            return "";
        }
        final int sp = Math.min(startPos, input.length() - 1);
        final int ep = Math.min((startPos == errorPos) ? (100 + startPos) : errorPos, input.length() - 1);
        return input.subSequence(sp, ep);
    }
}
