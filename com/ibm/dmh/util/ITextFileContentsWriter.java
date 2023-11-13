// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.io.IOException;
import java.io.OutputStreamWriter;

public interface ITextFileContentsWriter
{
    void writeContents(final TextFileContents p0, final OutputStreamWriter p1) throws IOException;
}
