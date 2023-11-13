// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.List;

public interface FileAreaUpdateReport2
{
    List getAdds();
    
    void unsetAdds();
    
    boolean isSetAdds();
    
    List getMoves();
    
    void unsetMoves();
    
    boolean isSetMoves();
    
    List getDeletes();
    
    void unsetDeletes();
    
    boolean isSetDeletes();
    
    List getModifies();
    
    void unsetModifies();
    
    boolean isSetModifies();
}
