// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner;

import java.util.List;

public interface IGeneralProperty
{
    String getName();
    
    Object getValue();
    
    Boolean toBoolean();
    
    List<IGeneralProperty> toList();
    
    Number toNumber();
    
    String toString();
    
    IMetadataValueType valueType();
}
