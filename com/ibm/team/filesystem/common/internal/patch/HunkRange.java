// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class HunkRange
{
    private int beforeStart;
    private int beforeLength;
    private int afterStart;
    private int afterLength;
    
    public HunkRange(final int beforeStart, final int beforeLength, final int afterStart, final int afterLength) {
        this.beforeStart = beforeStart;
        this.beforeLength = beforeLength;
        this.afterStart = afterStart;
        this.afterLength = afterLength;
    }
    
    public int getBeforeStart() {
        return this.beforeStart;
    }
    
    public int getBeforeLength() {
        return this.beforeLength;
    }
    
    public int getAfterStart() {
        return this.afterStart;
    }
    
    public int getAfterLength() {
        return this.afterLength;
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + this.afterLength;
        result = 31 * result + this.afterStart;
        result = 31 * result + this.beforeLength;
        result = 31 * result + this.beforeStart;
        return result;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final HunkRange other = (HunkRange)obj;
        return this.afterLength == other.afterLength && this.afterStart == other.afterStart && this.beforeLength == other.beforeLength && this.beforeStart == other.beforeStart;
    }
    
    @Override
    public String toString() {
        final StringBuffer result = new StringBuffer();
        result.append("@@ -");
        result.append(Integer.toString((this.beforeLength == 0) ? 0 : (this.beforeStart + 1)));
        result.append(',');
        result.append(Integer.toString(this.beforeLength));
        result.append(" +");
        result.append(Integer.toString((this.afterLength == 0) ? 0 : (this.afterStart + 1)));
        result.append(',');
        result.append(Integer.toString(this.afterLength));
        result.append(" @@");
        return result.toString();
    }
    
    public static HunkRange fromString(final String toParse) {
        int beforeStart = 0;
        int beforeLength = 0;
        int afterStart = 0;
        int afterLength = 0;
        final StringTokenizer tokenizer = new StringTokenizer(toParse, " @-,+", false);
        try {
            beforeStart = Integer.parseInt(tokenizer.nextToken());
            beforeLength = Integer.parseInt(tokenizer.nextToken());
            afterStart = Integer.parseInt(tokenizer.nextToken());
            afterLength = Integer.parseInt(tokenizer.nextToken());
        }
        catch (NoSuchElementException ex) {}
        return new HunkRange(beforeStart, beforeLength, afterStart, afterLength);
    }
}
