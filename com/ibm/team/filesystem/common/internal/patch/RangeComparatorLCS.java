// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

import java.util.List;
import java.util.ArrayList;

class RangeComparatorLCS
{
    private RangeComparatorLCS() {
    }
    
    public static RangeDifference[] findRanges(final LCS lcs) {
        final RangeDifference[] in = getDifferences(lcs);
        final List out = new ArrayList();
        int mstart = 0;
        int ystart = 0;
        for (int i = 0; i < in.length; ++i) {
            final RangeDifference es = in[i];
            final RangeDifference rd = new RangeDifference(0, mstart, es.rightStart() - mstart, ystart, es.leftStart() - ystart);
            if (rd.maxLength() != 0) {
                out.add(rd);
            }
            out.add(es);
            mstart = es.rightEnd();
            ystart = es.leftEnd();
        }
        final RangeDifference rd = new RangeDifference(0, mstart, lcs.length() - mstart, ystart, lcs.length() - ystart);
        if (rd.maxLength() > 0) {
            out.add(rd);
        }
        return out.toArray(new RangeDifference[out.size()]);
    }
    
    public static RangeDifference[] getDifferences(final LCS lcs) {
        final List differences = new ArrayList();
        final ILCSInput input = lcs.getInput();
        final int length = lcs.length();
        final int length2 = input.length2();
        final int length3 = input.length1();
        if (length == 0) {
            if (length3 != 0 || length2 != 0) {
                differences.add(new RangeDifference(2, 0, length2, 0, length3));
            }
        }
        else {
            int index1 = 0;
            int index2 = 0;
            int s1 = -1;
            int s2 = -1;
            for (int[] lcs2 = lcs.getLCSIndices1(), lcs3 = lcs.getLCSIndices2(); index1 < lcs2.length && index2 < lcs3.length; ++index1, ++index2) {
                int l1;
                while ((l1 = lcs2[index1]) == -1 && ++index1 < lcs2.length) {}
                if (index1 >= lcs2.length) {
                    break;
                }
                int l2;
                while ((l2 = lcs3[index2]) == -1 && ++index2 < lcs3.length) {}
                if (index2 >= lcs3.length) {
                    break;
                }
                final int end1 = l1;
                final int end2 = l2;
                if (s1 == -1 && (end1 != 0 || end2 != 0)) {
                    differences.add(new RangeDifference(2, 0, end2, 0, end1));
                }
                else if (end1 != s1 + 1 || end2 != s2 + 1) {
                    final int leftStart = s1 + 1;
                    final int leftLength = end1 - leftStart;
                    final int rightStart = s2 + 1;
                    final int rightLength = end2 - rightStart;
                    differences.add(new RangeDifference(2, rightStart, rightLength, leftStart, leftLength));
                }
                s1 = end1;
                s2 = end2;
            }
            if (s1 != -1 && (s1 + 1 < length3 || s2 + 1 < length2)) {
                final int leftStart2 = (s1 < length3) ? (s1 + 1) : s1;
                final int rightStart2 = (s2 < length2) ? (s2 + 1) : s2;
                differences.add(new RangeDifference(2, rightStart2, length2 - (s2 + 1), leftStart2, length3 - (s1 + 1)));
            }
        }
        return differences.toArray(new RangeDifference[differences.size()]);
    }
}
