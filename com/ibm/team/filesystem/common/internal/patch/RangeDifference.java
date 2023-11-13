// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

public class RangeDifference
{
    public static final int NOCHANGE = 0;
    public static final int CHANGE = 2;
    public static final int CONFLICT = 1;
    public static final int RIGHT = 2;
    public static final int LEFT = 3;
    public static final int ANCESTOR = 4;
    public static final int ERROR = 5;
    int fKind;
    int fLeftStart;
    int fLeftLength;
    int fRightStart;
    int fRightLength;
    int lAncestorStart;
    int lAncestorLength;
    
    RangeDifference(final int changeKind) {
        this.fKind = changeKind;
    }
    
    RangeDifference(final int kind, final int rightStart, final int rightLength, final int leftStart, final int leftLength) {
        this.fKind = kind;
        this.fRightStart = rightStart;
        this.fRightLength = rightLength;
        this.fLeftStart = leftStart;
        this.fLeftLength = leftLength;
    }
    
    RangeDifference(final int kind, final int rightStart, final int rightLength, final int leftStart, final int leftLength, final int ancestorStart, final int ancestorLength) {
        this(kind, rightStart, rightLength, leftStart, leftLength);
        this.lAncestorStart = ancestorStart;
        this.lAncestorLength = ancestorLength;
    }
    
    public int kind() {
        return this.fKind;
    }
    
    public int ancestorStart() {
        return this.lAncestorStart;
    }
    
    public int ancestorLength() {
        return this.lAncestorLength;
    }
    
    public int ancestorEnd() {
        return this.lAncestorStart + this.lAncestorLength;
    }
    
    public int rightStart() {
        return this.fRightStart;
    }
    
    public int rightLength() {
        return this.fRightLength;
    }
    
    public int rightEnd() {
        return this.fRightStart + this.fRightLength;
    }
    
    public int leftStart() {
        return this.fLeftStart;
    }
    
    public int leftLength() {
        return this.fLeftLength;
    }
    
    public int leftEnd() {
        return this.fLeftStart + this.fLeftLength;
    }
    
    public int maxLength() {
        return Math.max(this.fRightLength, Math.max(this.fLeftLength, this.lAncestorLength));
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof RangeDifference) {
            final RangeDifference other = (RangeDifference)obj;
            return this.fKind == other.fKind && this.fLeftStart == other.fLeftStart && this.fLeftLength == other.fLeftLength && this.fRightStart == other.fRightStart && this.fRightLength == other.fRightLength && this.lAncestorStart == other.lAncestorStart && this.lAncestorLength == other.lAncestorLength;
        }
        return super.equals(obj);
    }
    
    @Override
    public String toString() {
        String string = "Left: " + this.toRangeString(this.fLeftStart, this.fLeftLength) + " Right: " + this.toRangeString(this.fRightStart, this.fRightLength);
        if (this.lAncestorLength > 0 || this.lAncestorStart > 0) {
            string = String.valueOf(string) + " Ancestor: " + this.toRangeString(this.lAncestorStart, this.lAncestorLength);
        }
        return string;
    }
    
    private String toRangeString(final int start, final int length) {
        return "(" + start + ", " + length + ")";
    }
}
