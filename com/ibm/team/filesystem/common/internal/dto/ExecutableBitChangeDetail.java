// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.filesystem.common.IExecutableBitChangeDetail;
import com.ibm.team.scm.common.internal.dto2.ChangeDetail;

public interface ExecutableBitChangeDetail extends ChangeDetail, IExecutableBitChangeDetail
{
    boolean isExecutable();
    
    void setExecutable(final boolean p0);
    
    void unsetExecutable();
    
    boolean isSetExecutable();
}
