// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

public interface MoveChangeDetailDTO extends ChangeDetailDTO
{
    String getBeforeParentId();
    
    void setBeforeParentId(final String p0);
    
    void unsetBeforeParentId();
    
    boolean isSetBeforeParentId();
    
    String getAfterParentId();
    
    void setAfterParentId(final String p0);
    
    void unsetAfterParentId();
    
    boolean isSetAfterParentId();
    
    String getBeforeName();
    
    void setBeforeName(final String p0);
    
    void unsetBeforeName();
    
    boolean isSetBeforeName();
    
    String getAfterName();
    
    void setAfterName(final String p0);
    
    void unsetAfterName();
    
    boolean isSetAfterName();
    
    String getBeforeParentPathHint();
    
    void setBeforeParentPathHint(final String p0);
    
    void unsetBeforeParentPathHint();
    
    boolean isSetBeforeParentPathHint();
    
    String getAfterParentPathHint();
    
    void setAfterParentPathHint(final String p0);
    
    void unsetAfterParentPathHint();
    
    boolean isSetAfterParentPathHint();
    
    boolean isMove();
    
    void setMove(final boolean p0);
    
    void unsetMove();
    
    boolean isSetMove();
    
    boolean isRename();
    
    void setRename(final boolean p0);
    
    void unsetRename();
    
    boolean isSetRename();
    
    String getIncidentalDetails();
    
    void setIncidentalDetails(final String p0);
    
    void unsetIncidentalDetails();
    
    boolean isSetIncidentalDetails();
}
