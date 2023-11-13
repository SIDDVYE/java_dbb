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
import com.ibm.team.filesystem.common.internal.rest.client.sync.AcceptAsPatchDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class AcceptAsPatchDTOImpl extends EObjectImpl implements AcceptAsPatchDTO
{
    protected int ALL_FLAGS;
    protected EList pendingPatchIds;
    
    protected AcceptAsPatchDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.ACCEPT_AS_PATCH_DTO;
    }
    
    public List getPendingPatchIds() {
        if (this.pendingPatchIds == null) {
            this.pendingPatchIds = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 0);
        }
        return (List)this.pendingPatchIds;
    }
    
    public void unsetPendingPatchIds() {
        if (this.pendingPatchIds != null) {
            ((InternalEList.Unsettable)this.pendingPatchIds).unset();
        }
    }
    
    public boolean isSetPendingPatchIds() {
        return this.pendingPatchIds != null && ((InternalEList.Unsettable)this.pendingPatchIds).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getPendingPatchIds();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getPendingPatchIds().clear();
                this.getPendingPatchIds().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetPendingPatchIds();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetPendingPatchIds();
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
        result.append(" (pendingPatchIds: ");
        result.append(this.pendingPatchIds);
        result.append(')');
        return result.toString();
    }
}
