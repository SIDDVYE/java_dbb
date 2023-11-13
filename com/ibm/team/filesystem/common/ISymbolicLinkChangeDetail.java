// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.scm.common.IChangeDetail;

public interface ISymbolicLinkChangeDetail extends IChangeDetail
{
    String getBeforeTarget();
    
    String getAfterTarget();
    
    boolean isBeforeDirectory();
    
    boolean isAfterDirectory();
}
