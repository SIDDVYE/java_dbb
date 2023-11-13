// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import com.ibm.team.filesystem.common.FileLineDelimiter;
import java.util.Map;
import com.ibm.team.filesystem.common.IFileContent;
import com.ibm.team.scm.common.internal.VersionedContent;

public interface FileContent extends VersionedContent, IFileContent
{
    String getCharacterEncoding();
    
    void setCharacterEncoding(final String p0);
    
    void unsetCharacterEncoding();
    
    boolean isSetCharacterEncoding();
    
    int getLineDelimiterSetting();
    
    void setLineDelimiterSetting(final int p0);
    
    void unsetLineDelimiterSetting();
    
    boolean isSetLineDelimiterSetting();
    
    Map getProperties();
    
    void unsetProperties();
    
    boolean isSetProperties();
    
    long getLineDelimiterCount();
    
    void setLineDelimiterCount(final long p0);
    
    void setLineDelimiter(final FileLineDelimiter p0);
    
    long getEstimatedConvertedLength(final FileLineDelimiter p0);
}
