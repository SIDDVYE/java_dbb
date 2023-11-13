// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.record.internal;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import com.ibm.dbb.build.internal.StringMatcher;

public class IncludeRecordFilter extends AbstractRecordFilter implements IRecordFilter
{
    private StringMatcher matcher;
    
    public IncludeRecordFilter(final String type) {
        this.matcher = new StringMatcher(type, true, false);
    }
    
    @Override
    public IRecordFilter apply(final Set<String> candidates) {
        if (this.includedTypes == null) {
            this.includedTypes = new HashSet<String>();
        }
        for (final String candidate : candidates) {
            final boolean isMatch = this.matcher.match(candidate);
            if (isMatch) {
                this.includedTypes.add(candidate);
            }
        }
        return this;
    }
}
