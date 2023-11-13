// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.util.List;

public abstract class StringDiffParticipant extends DiffParticipant<List<String>>
{
    public static final String UTF_8 = "UTF-8";
    
    @Override
    public List<String> getRange(final InputStream in, final String optionalCharsetName) throws IOException {
        Charset c;
        try {
            c = Charset.forName(optionalCharsetName);
        }
        catch (IllegalArgumentException ex) {
            c = Charset.forName("UTF-8");
        }
        final ArrayList<String> lines = new ArrayList<String>();
        final InputStreamReader r = new InputStreamReader(in, c.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE));
        final char[] buf = new char[32768];
        final StringBuilder currentLine = new StringBuilder();
        while (true) {
            final int count = r.read(buf);
            if (count == -1) {
                break;
            }
            int start = 0;
            for (int i = 0; i < count; ++i) {
                if (buf[i] == '\n') {
                    currentLine.append(buf, start, i - start + 1);
                    lines.add(currentLine.toString());
                    currentLine.setLength(0);
                    start = i + 1;
                }
            }
            if (start >= count) {
                continue;
            }
            currentLine.append(buf, start, count - start);
        }
        if (currentLine.length() != 0) {
            lines.add(currentLine.toString());
        }
        return lines;
    }
    
    @Override
    public RangeDifference[] getDifferences(final List<String> range1, final List<String> range2) {
        final ILCSInput<String> input = new ILCSInput<String>() {
            @Override
            public int length1() {
                return range1.size();
            }
            
            @Override
            public int length2() {
                return range2.size();
            }
            
            @Override
            public String get1(final int i) {
                return range1.get(i);
            }
            
            @Override
            public String get2(final int i) {
                return range2.get(i);
            }
            
            @Override
            public boolean match(final String e1, final String e2) {
                return e1.hashCode() == e2.hashCode() && e1.equals(e2);
            }
        };
        return LCS.lcs(input).getDifferences();
    }
    
    @Override
    public boolean hasTrailingNL(final List<String> range) {
        final int size = range.size();
        if (size == 0) {
            return true;
        }
        final String last = range.get(size - 1);
        return last.charAt(last.length() - 1) == '\n';
    }
    
    @Override
    public int numLines(final List<String> range) {
        return range.size();
    }
}
