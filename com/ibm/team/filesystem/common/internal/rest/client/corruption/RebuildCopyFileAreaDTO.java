// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.corruption;

public interface RebuildCopyFileAreaDTO
{
    boolean isNoDescriptorsFound();
    
    void setNoDescriptorsFound(final boolean p0);
    
    void unsetNoDescriptorsFound();
    
    boolean isSetNoDescriptorsFound();
    
    boolean isIgnoredErrors();
    
    void setIgnoredErrors(final boolean p0);
    
    void unsetIgnoredErrors();
    
    boolean isSetIgnoredErrors();
}
