// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.filesystem.common.IContentChangeDetail;
import com.ibm.team.scm.common.internal.dto2.ChangeDetail;

public interface ContentChangeDetail extends ChangeDetail, IContentChangeDetail
{
    String getBeforeHashString();
    
    void setBeforeHashString(final String p0);
    
    void unsetBeforeHashString();
    
    boolean isSetBeforeHashString();
    
    String getAfterHashString();
    
    void setAfterHashString(final String p0);
    
    void unsetAfterHashString();
    
    boolean isSetAfterHashString();
}
