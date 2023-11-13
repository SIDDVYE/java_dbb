// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

public interface MergePatchDTO
{
    boolean isSomeHunksMatched();
    
    void setSomeHunksMatched(final boolean p0);
    
    void unsetSomeHunksMatched();
    
    boolean isSetSomeHunksMatched();
    
    boolean isSomeHunksFailed();
    
    void setSomeHunksFailed(final boolean p0);
    
    void unsetSomeHunksFailed();
    
    boolean isSetSomeHunksFailed();
}
