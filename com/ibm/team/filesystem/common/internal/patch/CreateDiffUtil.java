// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.eclipse.core.runtime.Path;
import java.util.Date;
import java.io.InputStream;
import com.ibm.team.scm.common.VersionedContentDeleted;
import org.eclipse.core.runtime.SubMonitor;
import com.ibm.team.repository.common.TeamRepositoryException;
import java.io.IOException;
import org.eclipse.core.runtime.IProgressMonitor;
import com.ibm.team.filesystem.common.changemodel.ResolvedConfigurationChangePaths;
import com.ibm.team.filesystem.common.changemodel.FileChange;
import java.io.UnsupportedEncodingException;

public class CreateDiffUtil
{
    public static final int BOTH_STATES_PRESENT = 0;
    public static final int BEFORE_STATE_DELETED = 1;
    public static final int AFTER_STATE_DELETED = 2;
    public static final String DIFF_DATE_FORMAT_STR = "yyyy-MM-dd HH:mm:ss.SSSSSSSSS Z";
    public static final String NO_TRAILING_NL_STRING = "\n\\ No newline at end of file\n";
    static final String UTF8 = "UTF-8";
    public static final byte[] NO_TRAILING_NL;
    public static final String NONEXISTENT_PATH = "/dev/null";
    static final int CONTEXT_LINES = 3;
    
    static {
        try {
            NO_TRAILING_NL = "\n\\ No newline at end of file\n".getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static <T> void writeDiff(final DiffParticipant<T> participant, final FileChange change, final ResolvedConfigurationChangePaths paths, final IProgressMonitor monitor) throws IOException, TeamRepositoryException {
        String beforePath = null;
        String afterPath = null;
        if (paths != null) {
            if (!change.getInitial().isDeleted()) {
                beforePath = paths.computePath(change.getSiloedItemId(), true, null).toPath().toString();
            }
            if (!change.getFinal().isDeleted()) {
                afterPath = paths.computePath(change.getSiloedItemId(), false, null).toPath().toString();
            }
        }
        writeDiff(participant, change, beforePath, afterPath, true, monitor);
    }
    
    public static <T> int writeDiff(final DiffParticipant<T> participant, final FileChange change, final String beforePath, final String afterPath, final boolean throwOnContentDeleted, final IProgressMonitor monitor) throws IOException {
        final SubMonitor progress = SubMonitor.convert(monitor, 100);
        InputStream afterStream = null;
        T beforeRange = null;
        T afterRange = null;
        InputStream beforeStream = null;
        int code = 0;
        Label_0210: {
            try {
                try {
                    beforeStream = change.getInitial().getContents().getInputStream((IProgressMonitor)progress.newChild(25));
                    beforeRange = participant.getRange(beforeStream, change.getInitial().getCharacterEncoding());
                    beforeStream.close();
                    beforeStream = null;
                }
                catch (IOException e) {
                    if (throwOnContentDeleted || !(e.getCause() instanceof VersionedContentDeleted)) {
                        throw e;
                    }
                    code = 1;
                }
                try {
                    afterStream = change.getFinal().getContents().getInputStream((IProgressMonitor)progress.newChild(25));
                    afterRange = participant.getRange(afterStream, change.getFinal().getCharacterEncoding());
                }
                catch (IOException e) {
                    if (!throwOnContentDeleted && e.getCause() instanceof VersionedContentDeleted) {
                        code |= 0x2;
                        break Label_0210;
                    }
                    throw e;
                }
            }
            finally {
                try {
                    if (beforeStream != null) {
                        beforeStream.close();
                    }
                }
                finally {
                    if (afterStream != null) {
                        afterStream.close();
                    }
                }
                if (afterStream != null) {
                    afterStream.close();
                }
            }
            try {
                if (beforeStream != null) {
                    beforeStream.close();
                }
            }
            finally {
                if (afterStream != null) {
                    afterStream.close();
                }
            }
        }
        if (afterStream != null) {
            afterStream.close();
        }
        if (code != 0) {
            return code;
        }
        beforeStream = null;
        afterStream = null;
        progress.setWorkRemaining(50);
        final RangeDifference[] diff = participant.getDifferences(beforeRange, afterRange);
        progress.worked(50);
        if (diff.length != 0) {
            participant.writeHeader(beforePath, afterPath, change.getInitial().getTimestamp(), change.getFinal().getTimestamp());
            final boolean beforeHasTrailingNL = participant.hasTrailingNL(beforeRange);
            final int beforeLines = participant.numLines(beforeRange);
            final boolean afterHasTrailingNL = participant.hasTrailingNL(afterRange);
            final int afterLines = participant.numLines(afterRange);
            int lastHunk = 0;
            do {
                final int[] counts = writeHunk(diff, lastHunk, beforeLines, beforeHasTrailingNL, beforeRange, afterLines, afterHasTrailingNL, afterRange, null, false);
                final HunkRange range = new HunkRange(counts[0], counts[1], counts[2], counts[3]);
                participant.writeHunkRange(range);
                writeHunk(diff, lastHunk, beforeLines, beforeHasTrailingNL, beforeRange, afterLines, afterHasTrailingNL, afterRange, participant, true);
                lastHunk = counts[4];
            } while (lastHunk < diff.length);
        }
        return 0;
    }
    
    public static <T> int[] writeHunk(final RangeDifference[] diff, final int startIndex, final int beforeLines, final boolean beforeHasTrailingNL, final T beforeRange, final int afterLines, final boolean afterHasTrailingNL, final T afterRange, final DiffParticipant<T> participant, final boolean doWrite) throws IOException {
        int i = startIndex;
        int beforeBegin = diff[i].leftStart();
        final int commonBeforeBegin = Math.max(beforeBegin - 3, 0);
        final int commonAfterBegin = diff[i].rightStart() - beforeBegin + commonBeforeBegin;
        int numBeforeLines = 0;
        int numAfterLines = 0;
        for (int j = commonBeforeBegin; j < beforeBegin; ++j) {
            if (doWrite) {
                participant.writeCommonLine(beforeRange, j);
            }
            ++numBeforeLines;
            ++numAfterLines;
        }
        boolean goAgain;
        do {
            final int beforeEnd = diff[i].leftEnd();
            for (int k = beforeBegin; k < beforeEnd; ++k) {
                if (doWrite) {
                    participant.writeRemovedLine(beforeRange, k);
                    if (!beforeHasTrailingNL && k == beforeLines - 1) {
                        participant.writeNoTrailingNL(beforeRange);
                    }
                }
                ++numBeforeLines;
            }
            for (int afterEnd = diff[i].rightEnd(), l = diff[i].rightStart(); l < afterEnd; ++l) {
                if (doWrite) {
                    participant.writeAddedLine(afterRange, l);
                    if (!afterHasTrailingNL && l == afterLines - 1) {
                        participant.writeNoTrailingNL(afterRange);
                    }
                }
                ++numAfterLines;
            }
            int commonLinesEnd;
            if (i < diff.length - 1) {
                final int nextStart = diff[i + 1].leftStart();
                if (nextStart <= beforeEnd + 6) {
                    goAgain = true;
                    commonLinesEnd = nextStart;
                    beforeBegin = nextStart;
                    ++i;
                }
                else {
                    goAgain = false;
                    commonLinesEnd = beforeEnd + 3;
                }
            }
            else {
                goAgain = false;
                commonLinesEnd = Math.min(beforeEnd + 3, beforeLines);
            }
            for (int m = beforeEnd; m < commonLinesEnd; ++m) {
                if (doWrite) {
                    participant.writeCommonLine(beforeRange, m);
                    if (!beforeHasTrailingNL && m == beforeLines - 1) {
                        participant.writeNoTrailingNL(beforeRange);
                    }
                }
                ++numBeforeLines;
                ++numAfterLines;
            }
        } while (goAgain);
        return new int[] { commonBeforeBegin, numBeforeLines, commonAfterBegin, numAfterLines, i + 1 };
    }
    
    public static String getFilePatchHeader(String beforePath, String afterPath, Date beforeDate, Date afterDate) {
        final StringBuffer result = new StringBuffer();
        boolean isCreation = false;
        boolean isDeletion = true;
        if (beforePath == null || beforePath.length() == 0 || beforeDate == null) {
            isCreation = true;
            beforePath = new Path("/dev/null").toString();
            beforeDate = new Date(0L);
        }
        if (afterPath == null || afterPath.length() == 0 || afterDate == null) {
            isDeletion = true;
            afterPath = new Path("/dev/null").toString();
            afterDate = new Date(0L);
        }
        if (isCreation || isDeletion) {
            result.append("diff -u -N ");
        }
        else {
            result.append("diff -u ");
        }
        final DateFormat diff_date_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSS Z", Locale.ENGLISH);
        result.append(beforePath);
        result.append(" ");
        result.append(afterPath);
        result.append("\n--- ");
        result.append(beforePath);
        result.append('\t');
        result.append(diff_date_format.format(beforeDate));
        result.append("\n+++ ");
        result.append(afterPath);
        result.append('\t');
        result.append(diff_date_format.format(afterDate));
        result.append('\n');
        return result.toString();
    }
}
