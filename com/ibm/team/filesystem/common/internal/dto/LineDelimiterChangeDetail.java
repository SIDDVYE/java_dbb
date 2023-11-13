// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.filesystem.common.ILineDelimiterChangeDetail;
import com.ibm.team.scm.common.internal.dto2.ChangeDetail;

public interface LineDelimiterChangeDetail extends ChangeDetail, ILineDelimiterChangeDetail
{
    int getBeforeLineDelimiterValue();
    
    void setBeforeLineDelimiterValue(final int p0);
    
    void unsetBeforeLineDelimiterValue();
    
    boolean isSetBeforeLineDelimiterValue();
    
    int getAfterLineDelimiterValue();
    
    void setAfterLineDelimiterValue(final int p0);
    
    void unsetAfterLineDelimiterValue();
    
    boolean isSetAfterLineDelimiterValue();
}
