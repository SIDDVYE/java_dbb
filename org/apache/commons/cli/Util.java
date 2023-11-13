// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

final class Util
{
    static final String[] EMPTY_STRING_ARRAY;
    
    static String stripLeadingAndTrailingQuotes(String str) {
        final int length = str.length();
        if (length > 1 && str.startsWith("\"") && str.endsWith("\"") && str.substring(1, length - 1).indexOf(34) == -1) {
            str = str.substring(1, length - 1);
        }
        return str;
    }
    
    static String stripLeadingHyphens(final String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("--")) {
            return str.substring(2);
        }
        if (str.startsWith("-")) {
            return str.substring(1);
        }
        return str;
    }
    
    static {
        EMPTY_STRING_ARRAY = new String[0];
    }
}
