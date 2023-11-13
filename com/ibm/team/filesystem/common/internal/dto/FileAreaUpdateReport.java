// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import java.util.List;

public interface FileAreaUpdateReport
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
    
    List getShareParents();
    
    void unsetShareParents();
    
    boolean isSetShareParents();
    
    List getCopyFileAreasWithOverlaps();
    
    void unsetCopyFileAreasWithOverlaps();
    
    boolean isSetCopyFileAreasWithOverlaps();
    
    List getOverlaps();
    
    void unsetOverlaps();
    
    boolean isSetOverlaps();
}
