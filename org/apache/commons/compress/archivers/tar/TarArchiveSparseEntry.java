// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.compress.archivers.tar;

import java.io.IOException;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class TarArchiveSparseEntry implements TarConstants
{
    private final boolean isExtended;
    private final List<TarArchiveStructSparse> sparseHeaders;
    
    public TarArchiveSparseEntry(final byte[] headerBuf) throws IOException {
        int offset = 0;
        this.sparseHeaders = new ArrayList<TarArchiveStructSparse>(TarUtils.readSparseStructs(headerBuf, 0, 21));
        offset += 504;
        this.isExtended = TarUtils.parseBoolean(headerBuf, offset);
    }
    
    public boolean isExtended() {
        return this.isExtended;
    }
    
    public List<TarArchiveStructSparse> getSparseHeaders() {
        return this.sparseHeaders;
    }
}
