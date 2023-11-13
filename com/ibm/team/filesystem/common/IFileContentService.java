// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.repository.common.transport.ITeamRestService;

public interface IFileContentService extends ITeamRestService
{
    public static final String HASH_CODE_PARAM = "hashcode";
    public static final String PREDECESSOR_HINT_HASH_PARAM = "predecessorHintHash";
    public static final String LENGTH_PARAM = "length";
    public static final String LINE_DELIMITER_PARAM = "lineDelimiter";
    public static final String LINE_DELIMITER_LF = "LF";
    public static final String LINE_DELIMITER_CRLF = "CRLF";
    public static final String LINE_DELIMITER_CR = "CR";
    public static final String LINE_DELIMITER_COUNT_PARAM = "lineDelimiterCount";
    public static final String ENCODING_PARAM = "encoding";
    public static final String CONTENT_SEGMENT = "content";
    
    void storeContent();
}
