// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

final class OptionValidator
{
    private static boolean isValidChar(final char c) {
        return Character.isJavaIdentifierPart(c);
    }
    
    private static boolean isValidOpt(final char c) {
        return isValidChar(c) || c == '?' || c == '@';
    }
    
    static String validate(final String option) throws IllegalArgumentException {
        if (option == null) {
            return null;
        }
        if (option.length() == 1) {
            final char ch = option.charAt(0);
            if (!isValidOpt(ch)) {
                throw new IllegalArgumentException("Illegal option name '" + ch + "'");
            }
        }
        else {
            for (final char ch2 : option.toCharArray()) {
                if (!isValidChar(ch2)) {
                    throw new IllegalArgumentException("The option '" + option + "' contains an illegal character : '" + ch2 + "'");
                }
            }
        }
        return option;
    }
}
