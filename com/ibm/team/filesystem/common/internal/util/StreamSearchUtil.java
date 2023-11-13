// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import java.io.IOException;
import org.eclipse.core.runtime.OperationCanceledException;
import java.io.BufferedReader;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.IProgressMonitor;
import java.io.Reader;

public abstract class StreamSearchUtil
{
    public static boolean streamContains(final Reader raw, final long streamLength, final String requiredText, final IProgressMonitor progress) throws IOException {
        SubMonitor mon = null;
        long remaining = streamLength;
        try {
            mon = SubMonitor.convert(progress);
            mon.setWorkRemaining((int)remaining);
            if (requiredText.length() == 0) {
                return true;
            }
            final BufferedReader reader = new BufferedReader(raw);
            int matchLen = 0;
            int ch;
            while (-1 != (ch = reader.read())) {
                mon.worked(1);
                --remaining;
                if (requiredText.charAt(matchLen) == ch) {
                    if (matchLen == 0) {
                        reader.mark(requiredText.length());
                    }
                    if (++matchLen == requiredText.length()) {
                        return true;
                    }
                }
                else if (matchLen != 0) {
                    remaining += matchLen;
                    mon.setWorkRemaining((int)remaining);
                    reader.reset();
                    matchLen = 0;
                }
                if (mon.isCanceled()) {
                    throw new OperationCanceledException();
                }
            }
            return false;
        }
        finally {
            raw.close();
            if (mon != null) {
                mon.done();
            }
        }
    }
}
