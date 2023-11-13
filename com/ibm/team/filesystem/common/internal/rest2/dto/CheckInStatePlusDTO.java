// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest2.dto;

import com.ibm.team.scm.common.internal.rest.ICheckInState;
import java.sql.Timestamp;
import com.ibm.team.scm.common.internal.rest.dto.ContributorDTO;
import com.ibm.team.repository.common.model.Helper;

public interface CheckInStatePlusDTO extends Helper
{
    ContributorDTO getDeletedBy();
    
    void setDeletedBy(final ContributorDTO p0);
    
    void unsetDeletedBy();
    
    boolean isSetDeletedBy();
    
    Timestamp getDeletedOn();
    
    void setDeletedOn(final Timestamp p0);
    
    void unsetDeletedOn();
    
    boolean isSetDeletedOn();
    
    ICheckInState getCheckInState();
    
    void setCheckInState(final ICheckInState p0);
    
    void unsetCheckInState();
    
    boolean isSetCheckInState();
}
