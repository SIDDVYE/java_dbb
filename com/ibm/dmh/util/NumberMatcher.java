// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Collection;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.LinkedList;

public class NumberMatcher implements IMatcher<Number>
{
    private NumberPattern[] numberPatterns;
    
    public NumberMatcher(final String searchPattern) {
        (this.numberPatterns = new NumberPattern[1])[0] = new NumberPattern(searchPattern);
    }
    
    public NumberMatcher(final String[] searchPatterns) {
        this.numberPatterns = new NumberPattern[searchPatterns.length];
        for (int i = 0; i < searchPatterns.length; ++i) {
            this.numberPatterns[i] = new NumberPattern(searchPatterns[i]);
        }
    }
    
    @Override
    public boolean matches(final Number input) {
        for (int i = 0; i < this.numberPatterns.length; ++i) {
            if (!this.numberPatterns[i].matches(input)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean matches(final Integer input) {
        return input != null && this.matches((int)input);
    }
    
    private class NumberPattern
    {
        NumberRange[] numberRanges;
        
        public NumberPattern(final String searchPattern) {
            final List<NumberRange> l = new LinkedList<NumberRange>();
            for (final String s : this.breakUpTokens(searchPattern)) {
                final boolean isNot = s.charAt(0) == '!';
                final String token = s.substring(1);
                final Pattern p = Pattern.compile("(([<>]=?)?)(-?\\d+)(-?(-?\\d+)?)");
                final Matcher m = p.matcher(token);
                if (!m.matches()) {
                    throw new RuntimeException("Numeric value didn't match pattern:  [" + token + "]");
                }
                final String arg1 = m.group(1);
                final String start = m.group(3);
                final String end = m.group(5);
                l.add(new NumberRange(arg1, start, end, isNot));
            }
            this.numberRanges = l.toArray(new NumberRange[l.size()]);
        }
        
        private List<String> breakUpTokens(String s) {
            s = s.replaceAll("(-?\\d+)\\s*-\\s*(-?\\d+)", "$1-$2");
            s = s.replaceAll("([<>]=?)\\s+(-?\\d+)", "$1$2");
            s = s.replaceAll("(!)\\s+(-?\\d+)", "$1$2");
            s = s.replaceAll(",", " ");
            final String[] s2 = StringUtils.split(s);
            for (int i = 0; i < s2.length; ++i) {
                if (!s2[i].startsWith("!")) {
                    s2[i] = "^" + s2[i];
                }
            }
            final List<String> l = new LinkedList<String>();
            l.addAll(Arrays.asList(s2));
            return l;
        }
        
        public boolean matches(final Number number) {
            if (this.numberRanges.length == 0) {
                return true;
            }
            for (int i = 0; i < this.numberRanges.length; ++i) {
                if (this.numberRanges[i].matches(number)) {
                    return true;
                }
            }
            return false;
        }
    }
    
    private class NumberRange
    {
        int start;
        int end;
        boolean isNot;
        
        public NumberRange(final String arg, final String start, final String end, final boolean isNot) {
            this.isNot = isNot;
            if (arg.equals("") && end == null) {
                final int int1 = Integer.parseInt(start);
                this.start = int1;
                this.end = int1;
            }
            else if (arg.equals(">")) {
                this.start = Integer.parseInt(start) + 1;
                this.end = Integer.MAX_VALUE;
            }
            else if (arg.equals(">=")) {
                this.start = Integer.parseInt(start);
                this.end = Integer.MAX_VALUE;
            }
            else if (arg.equals("<")) {
                this.start = Integer.MIN_VALUE;
                this.end = Integer.parseInt(start) - 1;
            }
            else if (arg.equals("<=")) {
                this.start = Integer.MIN_VALUE;
                this.end = Integer.parseInt(start);
            }
            else {
                this.start = Integer.parseInt(start);
                this.end = Integer.parseInt(end);
            }
        }
        
        public boolean matches(final Number n) {
            final long i = n.longValue();
            boolean b = i >= this.start && i <= this.end;
            if (this.isNot) {
                b = !b;
            }
            return b;
        }
    }
}
