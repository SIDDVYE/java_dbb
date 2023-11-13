// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.filesystem.common.IContentTypeChangeDetail;
import com.ibm.team.scm.common.internal.dto2.ChangeDetail;

public interface ContentTypeChangeDetail extends ChangeDetail, IContentTypeChangeDetail
{
    String getBeforeContentType();
    
    void setBeforeContentType(final String p0);
    
    void unsetBeforeContentType();
    
    boolean isSetBeforeContentType();
    
    String getAfterContentType();
    
    void setAfterContentType(final String p0);
    
    void unsetAfterContentType();
    
    boolean isSetAfterContentType();
}
