// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.util.Vector;

public class StringMatcher
{
    protected String fPattern;
    protected int fLength;
    protected boolean fIgnoreWildCards;
    protected boolean fIgnoreCase;
    protected boolean fHasLeadingStar;
    protected boolean fHasTrailingStar;
    protected String[] fSegments;
    protected int fBound;
    private String fOriginalPattern;
    protected static final char fSingleWildCard = '\0';
    
    public Position find(final String text, int start, int end) {
        if (this.fPattern == null || text == null) {
            throw new IllegalArgumentException();
        }
        final int tlen = text.length();
        if (start < 0) {
            start = 0;
        }
        if (end > tlen) {
            end = tlen;
        }
        if (end < 0 || start >= end) {
            return null;
        }
        if (this.fLength == 0) {
            return new Position(start, start);
        }
        if (this.fIgnoreWildCards) {
            final int x = this.posIn(text, start, end);
            if (x < 0) {
                return null;
            }
            return new Position(x, x + this.fLength);
        }
        else {
            final int segCount = this.fSegments.length;
            if (segCount == 0) {
                return new Position(start, end);
            }
            int curPos = start;
            int matchStart = -1;
            int i;
            String current;
            int nextMatch;
            for (i = 0; i < segCount && curPos < end; curPos = nextMatch + current.length(), ++i) {
                current = this.fSegments[i];
                nextMatch = this.regExpPosIn(text, curPos, end, current);
                if (nextMatch < 0) {
                    return null;
                }
                if (i == 0) {
                    matchStart = nextMatch;
                }
            }
            if (i < segCount) {
                return null;
            }
            return new Position(matchStart, curPos);
        }
    }
    
    public StringMatcher(final String aPattern, final boolean ignoreCase, final boolean ignoreWildCards) {
        this.fBound = 0;
        this.fIgnoreCase = ignoreCase;
        this.fIgnoreWildCards = ignoreWildCards;
        this.fLength = aPattern.length();
        this.fOriginalPattern = aPattern;
        if (this.fIgnoreCase) {
            this.fPattern = aPattern.toUpperCase();
        }
        else {
            this.fPattern = aPattern;
        }
        if (this.fIgnoreWildCards) {
            this.parseNoWildCards();
        }
        else {
            this.parseWildCards();
        }
    }
    
    public boolean isIgnoreCase() {
        return this.fIgnoreCase;
    }
    
    public String getPattern() {
        return this.fOriginalPattern;
    }
    
    public boolean match(final String text, int start, int end) {
        if (null == text) {
            throw new IllegalArgumentException();
        }
        if (start > end) {
            return false;
        }
        if (this.fIgnoreWildCards) {
            return end - start == this.fLength && this.fPattern.regionMatches(this.fIgnoreCase, 0, text, start, this.fLength);
        }
        final int segCount = this.fSegments.length;
        if (segCount == 0 && (this.fHasLeadingStar || this.fHasTrailingStar)) {
            return true;
        }
        if (start == end) {
            return this.fLength == 0;
        }
        if (this.fLength == 0) {
            return start == end;
        }
        final int tlen = text.length();
        if (start < 0) {
            start = 0;
        }
        if (end > tlen) {
            end = tlen;
        }
        int tCurPos = start;
        final int bound = end - this.fBound;
        if (bound < 0) {
            return false;
        }
        int i = 0;
        String current = this.fSegments[i];
        final int segLength = current.length();
        if (!this.fHasLeadingStar) {
            if (!this.regExpRegionMatches(text, start, current, 0, segLength)) {
                return false;
            }
            ++i;
            tCurPos += segLength;
        }
        if (this.fSegments.length == 1 && !this.fHasLeadingStar && !this.fHasTrailingStar) {
            return tCurPos == end;
        }
        while (i < segCount) {
            current = this.fSegments[i];
            final int k = current.indexOf(0);
            int currentMatch;
            if (k < 0) {
                currentMatch = this.textPosIn(text, tCurPos, end, current);
                if (currentMatch < 0) {
                    return false;
                }
            }
            else {
                currentMatch = this.regExpPosIn(text, tCurPos, end, current);
                if (currentMatch < 0) {
                    return false;
                }
            }
            tCurPos = currentMatch + current.length();
            ++i;
        }
        if (!this.fHasTrailingStar && tCurPos != end) {
            final int clen = current.length();
            return this.regExpRegionMatches(text, end - clen, current, 0, clen);
        }
        return i == segCount;
    }
    
    public boolean match(final String text) {
        return this.match(text, 0, text.length());
    }
    
    private void parseNoWildCards() {
        (this.fSegments = new String[1])[0] = this.fPattern;
        this.fBound = this.fLength;
    }
    
    private void parseWildCards() {
        if (this.fPattern.startsWith("*")) {
            this.fHasLeadingStar = true;
        }
        if (this.fPattern.endsWith("*") && this.fLength > 1 && this.fPattern.charAt(this.fLength - 2) != '\\') {
            this.fHasTrailingStar = true;
        }
        final Vector temp = new Vector();
        int pos = 0;
        final StringBuffer buf = new StringBuffer();
        while (pos < this.fLength) {
            final char c = this.fPattern.charAt(pos++);
            switch (c) {
                case '\\': {
                    if (pos >= this.fLength) {
                        buf.append(c);
                        continue;
                    }
                    final char next = this.fPattern.charAt(pos++);
                    if (next == '*' || next == '?' || next == '\\') {
                        buf.append(next);
                    }
                    else {
                        buf.append(c);
                        buf.append(next);
                    }
                    continue;
                }
                case '*': {
                    if (buf.length() > 0) {
                        temp.addElement(buf.toString());
                        this.fBound += buf.length();
                        buf.setLength(0);
                        continue;
                    }
                    continue;
                }
                case '?': {
                    buf.append('\0');
                    continue;
                }
                default: {
                    buf.append(c);
                    continue;
                }
            }
        }
        if (buf.length() > 0) {
            temp.addElement(buf.toString());
            this.fBound += buf.length();
        }
        temp.copyInto(this.fSegments = new String[temp.size()]);
    }
    
    protected int posIn(final String text, final int start, final int end) {
        final int max = end - this.fLength;
        if (this.fIgnoreCase) {
            for (int i = start; i <= max; ++i) {
                if (text.regionMatches(true, i, this.fPattern, 0, this.fLength)) {
                    return i;
                }
            }
            return -1;
        }
        int i = text.indexOf(this.fPattern, start);
        if (i == -1 || i > max) {
            return -1;
        }
        return i;
    }
    
    protected int regExpPosIn(final String text, final int start, final int end, final String p) {
        final int plen = p.length();
        for (int max = end - plen, i = start; i <= max; ++i) {
            if (this.regExpRegionMatches(text, i, p, 0, plen)) {
                return i;
            }
        }
        return -1;
    }
    
    protected boolean regExpRegionMatches(final String text, int tStart, final String p, int pStart, int plen) {
        while (plen-- > 0) {
            final char tchar = text.charAt(tStart++);
            final char pchar = p.charAt(pStart++);
            if (!this.fIgnoreWildCards && pchar == '\0') {
                continue;
            }
            if (pchar == tchar) {
                continue;
            }
            if (this.fIgnoreCase) {
                final char tc = Character.toUpperCase(tchar);
                if (tc == pchar) {
                    continue;
                }
            }
            return false;
        }
        return true;
    }
    
    protected int textPosIn(final String text, final int start, final int end, final String p) {
        final int plen = p.length();
        final int max = end - plen;
        if (this.fIgnoreCase) {
            for (int i = start; i <= max; ++i) {
                if (text.regionMatches(true, i, p, 0, plen)) {
                    return i;
                }
            }
            return -1;
        }
        int i = text.indexOf(p, start);
        if (i == -1 || i > max) {
            return -1;
        }
        return i;
    }
    
    public boolean containsWildcards() {
        if (this.fHasLeadingStar || this.fHasTrailingStar || this.fSegments.length > 1) {
            return true;
        }
        for (final String segment : this.fSegments) {
            if (segment.indexOf(0) >= 0) {
                return true;
            }
        }
        return false;
    }
    
    public static class Position
    {
        int start;
        int end;
        
        public Position(final int start, final int end) {
            this.start = start;
            this.end = end;
        }
        
        public int getStart() {
            return this.start;
        }
        
        public int getEnd() {
            return this.end;
        }
    }
}
