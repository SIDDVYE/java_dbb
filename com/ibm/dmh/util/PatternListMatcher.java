// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.util.List;

public class PatternListMatcher
{
    private List<Pattern> patterns;
    private boolean matchesByDefault;
    
    public PatternListMatcher(final String p) {
        this(p, false);
    }
    
    public PatternListMatcher(final String p, final boolean matchesByDefault) {
        this.patterns = new LinkedList<Pattern>();
        this.matchesByDefault = matchesByDefault;
        for (final String s : StringUtils.split(p)) {
            this.patterns.add(Pattern.compile(s.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*").replaceAll("^\\-\\s*", "^").replaceAll("^\\+\\s*", "")));
        }
    }
    
    public boolean matches(final String s) {
        boolean b = this.matchesByDefault;
        for (final Pattern p : this.patterns) {
            final boolean isNot = p.pattern().length() > 0 && p.pattern().charAt(0) == '^';
            if ((b && isNot) || (!b && !isNot)) {
                b = (isNot ? (!p.matcher(s).matches()) : p.matcher(s).matches());
            }
        }
        return b;
    }
}
