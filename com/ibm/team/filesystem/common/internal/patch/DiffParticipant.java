// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

import java.util.Date;
import java.io.IOException;
import java.io.InputStream;

public abstract class DiffParticipant<T>
{
    public abstract T getRange(final InputStream p0, final String p1) throws IOException;
    
    public abstract RangeDifference[] getDifferences(final T p0, final T p1);
    
    public abstract boolean hasTrailingNL(final T p0);
    
    public abstract int numLines(final T p0);
    
    public void writeHeader(final String beforePath, final String afterPath, final Date beforeDate, final Date afterDate) throws IOException {
        this.writeHeader(CreateDiffUtil.getFilePatchHeader(beforePath, afterPath, beforeDate, afterDate));
    }
    
    protected void writeHeader(final String header) throws IOException {
    }
    
    public abstract void writeHunkRange(final HunkRange p0) throws IOException;
    
    public abstract void writeCommonLine(final T p0, final int p1) throws IOException;
    
    public abstract void writeAddedLine(final T p0, final int p1) throws IOException;
    
    public abstract void writeRemovedLine(final T p0, final int p1) throws IOException;
    
    public abstract void writeNoTrailingNL(final T p0) throws IOException;
}
