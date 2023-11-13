// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner;

import java.util.List;

public interface IDependencyData
{
    List<IDependencyProperty> getDependencies();
    
    List<IGeneralProperty> getProperties();
    
    String getFileType();
    
    String getLanguage();
    
    String getLogicalName();
}
