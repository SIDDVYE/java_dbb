// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core;

public interface ChangeSetDTO
{
    String getItemId();
    
    void setItemId(final String p0);
    
    void unsetItemId();
    
    boolean isSetItemId();
    
    String getComment();
    
    void setComment(final String p0);
    
    void unsetComment();
    
    boolean isSetComment();
    
    long getLastChangeDate();
    
    void setLastChangeDate(final long p0);
    
    void unsetLastChangeDate();
    
    boolean isSetLastChangeDate();
    
    ComponentDTO getComponent();
    
    void setComponent(final ComponentDTO p0);
    
    void unsetComponent();
    
    boolean isSetComponent();
    
    ContributorDTO getAuthor();
    
    void setAuthor(final ContributorDTO p0);
    
    void unsetAuthor();
    
    boolean isSetAuthor();
}
