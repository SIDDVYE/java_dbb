// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.teamz.metadata;

import com.ibm.team.enterprise.metadata.scanner.IMetadataValueType;
import java.util.List;
import com.ibm.team.enterprise.metadata.scanner.IGeneralProperty;

public class ScannerGeneralProperty implements IGeneralProperty
{
    String name;
    Object value;
    
    private ScannerGeneralProperty() {
        this.name = null;
        this.value = null;
    }
    
    public ScannerGeneralProperty(final String iName, final Object iValue) {
        this.name = iName;
        this.value = iValue;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public Object getValue() {
        return this.value;
    }
    
    @Override
    public Boolean toBoolean() {
        if (this.value instanceof Boolean) {
            return (Boolean)this.value;
        }
        return null;
    }
    
    @Override
    public List<IGeneralProperty> toList() {
        return null;
    }
    
    @Override
    public Number toNumber() {
        if (this.value instanceof Number) {
            return (Number)this.value;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return (this.value == null) ? null : this.value.toString();
    }
    
    @Override
    public IMetadataValueType valueType() {
        if (this.value instanceof Boolean) {
            return IMetadataValueType.BOOLEAN;
        }
        if (this.value instanceof Number) {
            return IMetadataValueType.NUMBER;
        }
        if (this.value instanceof String) {
            return IMetadataValueType.STRING;
        }
        return IMetadataValueType.LIST;
    }
}
