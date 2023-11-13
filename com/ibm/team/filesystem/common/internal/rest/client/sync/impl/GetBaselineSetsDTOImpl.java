// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineSetDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.GetBaselineSetsDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class GetBaselineSetsDTOImpl extends EObjectImpl implements GetBaselineSetsDTO
{
    protected int ALL_FLAGS;
    protected EList baselineSets;
    
    protected GetBaselineSetsDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.GET_BASELINE_SETS_DTO;
    }
    
    public List getBaselineSets() {
        if (this.baselineSets == null) {
            this.baselineSets = (EList)new EObjectContainmentEList.Unsettable((Class)BaselineSetDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.baselineSets;
    }
    
    public void unsetBaselineSets() {
        if (this.baselineSets != null) {
            ((InternalEList.Unsettable)this.baselineSets).unset();
        }
    }
    
    public boolean isSetBaselineSets() {
        return this.baselineSets != null && ((InternalEList.Unsettable)this.baselineSets).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getBaselineSets()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBaselineSets();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getBaselineSets().clear();
                this.getBaselineSets().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBaselineSets();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBaselineSets();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
