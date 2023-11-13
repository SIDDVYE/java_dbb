// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class PathMatcher
{
    private static final String WILDCARD = "**";
    private final MatcherChain leadMatcher;
    private final List<MatcherChain> chains;
    private final String pattern;
    private final boolean anchorEnd;
    final int minSegments;
    
    protected PathMatcher(final String pattern, final MatcherChain leadMatcher, final ArrayList<MatcherChain> chains, final boolean anchorEnd) {
        this.pattern = pattern;
        this.leadMatcher = leadMatcher;
        this.chains = chains;
        this.anchorEnd = anchorEnd;
        int tmpMinSegments = 0;
        for (final MatcherChain chain : chains) {
            tmpMinSegments += chain.chain.size();
        }
        if (leadMatcher != null) {
            tmpMinSegments += leadMatcher.chain.size();
        }
        this.minSegments = tmpMinSegments;
    }
    
    public static PathMatcher create(final String matcher) {
        final String[] split = matcher.split("(?<!\\\\)/");
        if (split.length == 0) {
            throw new IllegalArgumentException();
        }
        boolean anchorStart = false;
        int start = 0;
        if ("".equals(split[0])) {
            anchorStart = true;
            start = 1;
        }
        boolean anchorEnd = true;
        int end = split.length;
        if ("**".equals(split[end - 1])) {
            anchorEnd = false;
            --end;
        }
        final ArrayList<MatcherChain> chains = new ArrayList<MatcherChain>(split.length);
        ArrayList<StringMatcher> currentChain = new ArrayList<StringMatcher>(split.length);
        for (int i = start; i < end; ++i) {
            if ("**".equals(split[i])) {
                if (!currentChain.isEmpty()) {
                    chains.add(new MatcherChain(currentChain));
                    currentChain = new ArrayList<StringMatcher>(split.length - i);
                }
            }
            else {
                currentChain.add(new StringMatcher(split[i], false, false));
            }
        }
        if (!currentChain.isEmpty()) {
            chains.add(new MatcherChain(currentChain));
        }
        MatcherChain leadMatcher = null;
        if (anchorStart) {
            leadMatcher = chains.remove(0);
        }
        return new PathMatcher(matcher, leadMatcher, chains, anchorEnd);
    }
    
    public boolean match(final String... segments) {
        if (this.minSegments > segments.length) {
            return false;
        }
        int segStart = 0;
        if (this.leadMatcher != null) {
            for (int i = 0; i < this.leadMatcher.chain.size(); ++i) {
                if (!this.leadMatcher.chain.get(i).match(segments[i])) {
                    return false;
                }
            }
            segStart = this.leadMatcher.chain.size() - 1;
        }
        boolean anchored = this.anchorEnd;
        int iSeg = segments.length - 1;
        for (int iChain = this.chains.size() - 1; iChain >= 0; --iChain) {
            final MatcherChain cur = this.chains.get(iChain);
            int iSegCandidate = iSeg;
            boolean anchoredCandidate = anchored;
            int iPattern = cur.chain.size() - 1;
            while (iSeg >= segStart) {
                if (cur.chain.get(iPattern).match(segments[iSegCandidate])) {
                    anchoredCandidate = false;
                    --iSegCandidate;
                    if (--iPattern < 0) {
                        break;
                    }
                    continue;
                }
                else {
                    iSegCandidate = --iSeg;
                    iPattern = cur.chain.size() - 1;
                    anchoredCandidate = anchored;
                    if (anchoredCandidate) {
                        return false;
                    }
                    continue;
                }
            }
            if (iPattern != -1) {
                return false;
            }
            iSeg = iSegCandidate;
            anchored = anchoredCandidate;
            cur.chain.size();
        }
        return true;
    }
    
    public String pattern() {
        return this.pattern;
    }
    
    private static class MatcherChain
    {
        final ArrayList<StringMatcher> chain;
        
        public MatcherChain(final ArrayList<StringMatcher> chain) {
            this.chain = chain;
        }
        
        @Override
        public String toString() {
            final ArrayList<String> s = new ArrayList<String>(this.chain.size());
            for (final StringMatcher matcher : this.chain) {
                s.add(matcher.getPattern());
            }
            return s.toString();
        }
    }
}
