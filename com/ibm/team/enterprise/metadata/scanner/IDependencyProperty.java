// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner;

import java.util.List;

public interface IDependencyProperty
{
    List<IGeneralProperty> getExtendedProperties();
    
    String getDependencyFileType();
    
    String getDependencyLogicalName();
    
    String getDependencyPath();
    
    String getDependencyReferenceType();
}
