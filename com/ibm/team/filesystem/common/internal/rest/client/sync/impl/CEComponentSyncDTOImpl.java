// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.CEComponentSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CEComponentSyncDTOImpl extends EObjectImpl implements CEComponentSyncDTO
{
    protected int ALL_FLAGS;
    protected EList changeSets;
    protected EList baselines;
    
    protected CEComponentSyncDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.CE_COMPONENT_SYNC_DTO;
    }
    
    public List getChangeSets() {
        if (this.changeSets == null) {
            this.changeSets = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 0);
        }
        return (List)this.changeSets;
    }
    
    public void unsetChangeSets() {
        if (this.changeSets != null) {
            ((InternalEList.Unsettable)this.changeSets).unset();
        }
    }
    
    public boolean isSetChangeSets() {
        return this.changeSets != null && ((InternalEList.Unsettable)this.changeSets).isSet();
    }
    
    public List getBaselines() {
        if (this.baselines == null) {
            this.baselines = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 1);
        }
        return (List)this.baselines;
    }
    
    public void unsetBaselines() {
        if (this.baselines != null) {
            ((InternalEList.Unsettable)this.baselines).unset();
        }
    }
    
    public boolean isSetBaselines() {
        return this.baselines != null && ((InternalEList.Unsettable)this.baselines).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getChangeSets();
            }
            case 1: {
                return this.getBaselines();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getChangeSets().clear();
                this.getChangeSets().addAll((Collection)newValue);
            }
            case 1: {
                this.getBaselines().clear();
                this.getBaselines().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetChangeSets();
            }
            case 1: {
                this.unsetBaselines();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetChangeSets();
            }
            case 1: {
                return this.isSetBaselines();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (changeSets: ");
        result.append(this.changeSets);
        result.append(", baselines: ");
        result.append(this.baselines);
        result.append(')');
        return result.toString();
    }
}
