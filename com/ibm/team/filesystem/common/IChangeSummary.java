// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.scm.common.dto.INameItemPair;
import java.util.List;
import com.ibm.team.filesystem.common.internal.Messages;

public interface IChangeSummary extends IBasicChange
{
    public static final String UNKNOWN_PATH = Messages.getString("UNKNOWN_PATH");
    
    String[] getPathHint();
    
    String[] getNewPathHint();
    
    List<INameItemPair> getAncestorPathHint();
    
    List<INameItemPair> getNewAncestorPathHint();
}
