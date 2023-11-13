// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma;

import java.util.List;

public interface UpdateDilemmaDTO
{
    List getInaccessibleForUpdate();
    
    void unsetInaccessibleForUpdate();
    
    boolean isSetInaccessibleForUpdate();
    
    List getSiblingSharesToAdd();
    
    void unsetSiblingSharesToAdd();
    
    boolean isSetSiblingSharesToAdd();
}
