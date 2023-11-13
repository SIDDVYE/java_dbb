// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.filesystem.common.ISymbolicLinkChangeDetail;
import com.ibm.team.scm.common.internal.dto2.ChangeDetail;

public interface SymbolicLinkChangeDetail extends ChangeDetail, ISymbolicLinkChangeDetail
{
    String getBeforeTarget();
    
    void setBeforeTarget(final String p0);
    
    void unsetBeforeTarget();
    
    boolean isSetBeforeTarget();
    
    String getAfterTarget();
    
    void setAfterTarget(final String p0);
    
    void unsetAfterTarget();
    
    boolean isSetAfterTarget();
    
    boolean isBeforeDirectory();
    
    void setBeforeDirectory(final boolean p0);
    
    void unsetBeforeDirectory();
    
    boolean isSetBeforeDirectory();
    
    boolean isAfterDirectory();
    
    void setAfterDirectory(final boolean p0);
    
    void unsetAfterDirectory();
    
    boolean isSetAfterDirectory();
}
