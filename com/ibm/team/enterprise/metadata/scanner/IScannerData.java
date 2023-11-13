// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner;

import java.util.List;

public interface IScannerData
{
    IDependencyData getDependencyData();
    
    List<IGeneralProperty> getGeneralData();
}
