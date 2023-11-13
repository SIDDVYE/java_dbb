// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class StringMatcher implements IMatcher<Object>
{
    private SearchPattern[] searchPatterns;
    
    public StringMatcher(final String searchPattern, final boolean ignoreCase) {
        (this.searchPatterns = new SearchPattern[1])[0] = new SearchPattern(searchPattern, ignoreCase);
    }
    
    public StringMatcher(final String[] searchPatterns, final boolean ignoreCase) {
        this.searchPatterns = new SearchPattern[searchPatterns.length];
        for (int i = 0; i < searchPatterns.length; ++i) {
            this.searchPatterns[i] = new SearchPattern(searchPatterns[i], ignoreCase);
        }
    }
    
    @Override
    public boolean matches(final Object input) {
        if (input == null) {
            return false;
        }
        for (int i = 0; i < this.searchPatterns.length; ++i) {
            if (!this.searchPatterns[i].matches(input.toString())) {
                return false;
            }
        }
        return true;
    }
    
    private class SearchPattern
    {
        Pattern[] orPatterns;
        Pattern[] andPatterns;
        Pattern[] notPatterns;
        
        public SearchPattern(final String searchPattern, final boolean ignoreCase) {
            final List<Pattern> ors = new LinkedList<Pattern>();
            final List<Pattern> ands = new LinkedList<Pattern>();
            final List<Pattern> nots = new LinkedList<Pattern>();
            for (final String arg : this.breakUpTokens(searchPattern)) {
                final char prefix = arg.charAt(0);
                String token = arg.substring(1);
                token = token.replaceAll("([\\?\\*\\+\\\\\\[\\]\\{\\}\\(\\)\\^\\$\\.])", "\\\\$1");
                token = StringUtils.replace(token, "\u3001", ".*");
                token = StringUtils.replace(token, "\u3002", ".?");
                if (!token.startsWith(".*")) {
                    token = "^" + token;
                }
                if (!token.endsWith(".*")) {
                    token += "$";
                }
                int flags = 32;
                if (ignoreCase) {
                    flags |= 0x2;
                }
                final Pattern p = Pattern.compile(token, flags);
                if (prefix == '^') {
                    ors.add(p);
                }
                else if (prefix == '+') {
                    ands.add(p);
                }
                else {
                    if (prefix != '-') {
                        continue;
                    }
                    nots.add(p);
                }
            }
            this.orPatterns = ors.toArray(new Pattern[ors.size()]);
            this.andPatterns = ands.toArray(new Pattern[ands.size()]);
            this.notPatterns = nots.toArray(new Pattern[nots.size()]);
        }
        
        private List<String> breakUpTokens(String s) {
            if (s == null || StringUtils.strip(s).length() == 0) {
                return Collections.emptyList();
            }
            s = " " + s + " ";
            int escapeCount = 0;
            boolean inSingleQuote = false;
            boolean inDoubleQuote = false;
            final char[] ca = s.toCharArray();
            for (int i = 0; i < ca.length; ++i) {
                if (ca[i] == '\\') {
                    ++escapeCount;
                }
                else if (escapeCount % 2 == 0) {
                    if (ca[i] == '\'') {
                        inSingleQuote = !inSingleQuote;
                    }
                    else if (ca[i] == '\"') {
                        inDoubleQuote = !inDoubleQuote;
                    }
                    else if (ca[i] == '+' && (inSingleQuote || inDoubleQuote)) {
                        ca[i] = '\u2001';
                    }
                    else if (ca[i] == '-' && (inSingleQuote || inDoubleQuote)) {
                        ca[i] = '\u2002';
                    }
                }
                if (ca[i] != '\\') {
                    escapeCount = 0;
                }
            }
            s = new String(ca);
            s = s.replaceAll("([\\+\\-])\\s+", "$1");
            s = StringUtils.replace(s, '*', '\u3001', true, false);
            s = StringUtils.replace(s, '?', '\u3002', true, false);
            s = StringUtils.unEscapeChars(s, new char[] { '*', '?' });
            s = s.trim();
            s = s.replace('\u2001', '+');
            s = s.replace('\u2002', '-');
            final String[] sa = StringUtils.splitQuoted(s, ' ');
            final List<String> l = new ArrayList<String>(sa.length);
            int numOrs = 0;
            for (int j = 0; j < sa.length; ++j) {
                final String token = sa[j];
                final int len = token.length();
                if (len > 0) {
                    char c = token.charAt(0);
                    String s2 = null;
                    if ((c == '+' || c == '-') && len > 1) {
                        s2 = token.substring(1);
                    }
                    else {
                        s2 = token;
                        c = '^';
                        ++numOrs;
                    }
                    if (s2.matches("\".*\"") || s2.matches("'.*'")) {
                        s2 = s2.substring(1, s2.length() - 1);
                    }
                    s2 = StringUtils.unEscapeChars(s2, new char[] { '\"', '\'' });
                    s2 = StringUtils.unEscapeChars(s2, new char[] { '\\' });
                    l.add(c + s2);
                }
            }
            if (numOrs == 1) {
                for (int j = 0; j < l.size(); ++j) {
                    final String x = l.get(j);
                    if (x.charAt(0) == '^') {
                        l.set(j, '+' + x.substring(1));
                    }
                }
            }
            return l;
        }
        
        public boolean matches(final String input) {
            if (input == null) {
                return false;
            }
            for (int i = 0; i < this.andPatterns.length; ++i) {
                if (!this.andPatterns[i].matcher(input).matches()) {
                    return false;
                }
            }
            for (int i = 0; i < this.notPatterns.length; ++i) {
                if (this.notPatterns[i].matcher(input).matches()) {
                    return false;
                }
            }
            for (int i = 0; i < this.orPatterns.length; ++i) {
                if (this.orPatterns[i].matcher(input).matches()) {
                    return true;
                }
            }
            return this.orPatterns.length == 0;
        }
    }
}
