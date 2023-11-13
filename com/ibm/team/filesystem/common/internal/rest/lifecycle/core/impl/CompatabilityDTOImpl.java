// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core.impl;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import java.util.Map;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EMap;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.CompatabilityDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CompatabilityDTOImpl extends EObjectImpl implements CompatabilityDTO
{
    protected int ALL_FLAGS;
    protected EMap services;
    
    protected CompatabilityDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return LifecycleRestClientDTOPackage.Literals.COMPATABILITY_DTO;
    }
    
    public Map getServices() {
        if (this.services == null) {
            this.services = (EMap)new EcoreEMap.Unsettable(LifecycleRestClientDTOPackage.Literals.SERVICE_ENTRY, (Class)ServiceEntryImpl.class, (InternalEObject)this, 0);
        }
        return this.services.map();
    }
    
    public void unsetServices() {
        if (this.services != null) {
            ((InternalEList.Unsettable)this.services).unset();
        }
    }
    
    public boolean isSetServices() {
        return this.services != null && ((InternalEList.Unsettable)this.services).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)((EMap.InternalMapView)this.getServices()).eMap()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (coreType) {
                    return ((EMap.InternalMapView)this.getServices()).eMap();
                }
                return this.getServices();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                ((EStructuralFeature.Setting)((EMap.InternalMapView)this.getServices()).eMap()).set(newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetServices();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetServices();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
