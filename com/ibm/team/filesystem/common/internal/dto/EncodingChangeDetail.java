// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.filesystem.common.IEncodingChangeDetail;
import com.ibm.team.scm.common.internal.dto2.ChangeDetail;

public interface EncodingChangeDetail extends ChangeDetail, IEncodingChangeDetail
{
    String getBeforeCharacterEncoding();
    
    void setBeforeCharacterEncoding(final String p0);
    
    void unsetBeforeCharacterEncoding();
    
    boolean isSetBeforeCharacterEncoding();
    
    String getAfterCharacterEncoding();
    
    void setAfterCharacterEncoding(final String p0);
    
    void unsetAfterCharacterEncoding();
    
    boolean isSetAfterCharacterEncoding();
}
