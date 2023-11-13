// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeMethodDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeServiceDTO;

public class MetronomeServiceDTOImpl extends MetronomeBaseDTOImpl implements MetronomeServiceDTO
{
    protected EList methods;
    
    protected MetronomeServiceDTOImpl() {
    }
    
    @Override
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.METRONOME_SERVICE_DTO;
    }
    
    @Override
    public List getMethods() {
        if (this.methods == null) {
            this.methods = (EList)new EObjectResolvingEList.Unsettable((Class)MetronomeMethodDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.methods;
    }
    
    @Override
    public void unsetMethods() {
        if (this.methods != null) {
            ((InternalEList.Unsettable)this.methods).unset();
        }
    }
    
    @Override
    public boolean isSetMethods() {
        return this.methods != null && ((InternalEList.Unsettable)this.methods).isSet();
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 3: {
                return this.getMethods();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 3: {
                this.getMethods().clear();
                this.getMethods().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 3: {
                this.unsetMethods();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 3: {
                return this.isSetMethods();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
