// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.scm.common.IChangeDetail;

public interface IEncodingChangeDetail extends IChangeDetail
{
    String getBeforeCharacterEncoding();
    
    String getAfterCharacterEncoding();
}
