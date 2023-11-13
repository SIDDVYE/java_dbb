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
import com.ibm.team.filesystem.common.internal.rest.client.sync.CESyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CESyncDTOImpl extends EObjectImpl implements CESyncDTO
{
    protected int ALL_FLAGS;
    protected EList addedComponents;
    protected EList changedComponents;
    protected EList removedComponents;
    
    protected CESyncDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.CE_SYNC_DTO;
    }
    
    public List getAddedComponents() {
        if (this.addedComponents == null) {
            this.addedComponents = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 0);
        }
        return (List)this.addedComponents;
    }
    
    public void unsetAddedComponents() {
        if (this.addedComponents != null) {
            ((InternalEList.Unsettable)this.addedComponents).unset();
        }
    }
    
    public boolean isSetAddedComponents() {
        return this.addedComponents != null && ((InternalEList.Unsettable)this.addedComponents).isSet();
    }
    
    public List getRemovedComponents() {
        if (this.removedComponents == null) {
            this.removedComponents = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 2);
        }
        return (List)this.removedComponents;
    }
    
    public void unsetRemovedComponents() {
        if (this.removedComponents != null) {
            ((InternalEList.Unsettable)this.removedComponents).unset();
        }
    }
    
    public boolean isSetRemovedComponents() {
        return this.removedComponents != null && ((InternalEList.Unsettable)this.removedComponents).isSet();
    }
    
    public List getChangedComponents() {
        if (this.changedComponents == null) {
            this.changedComponents = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 1);
        }
        return (List)this.changedComponents;
    }
    
    public void unsetChangedComponents() {
        if (this.changedComponents != null) {
            ((InternalEList.Unsettable)this.changedComponents).unset();
        }
    }
    
    public boolean isSetChangedComponents() {
        return this.changedComponents != null && ((InternalEList.Unsettable)this.changedComponents).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getAddedComponents();
            }
            case 1: {
                return this.getChangedComponents();
            }
            case 2: {
                return this.getRemovedComponents();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getAddedComponents().clear();
                this.getAddedComponents().addAll((Collection)newValue);
            }
            case 1: {
                this.getChangedComponents().clear();
                this.getChangedComponents().addAll((Collection)newValue);
            }
            case 2: {
                this.getRemovedComponents().clear();
                this.getRemovedComponents().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAddedComponents();
            }
            case 1: {
                this.unsetChangedComponents();
            }
            case 2: {
                this.unsetRemovedComponents();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAddedComponents();
            }
            case 1: {
                return this.isSetChangedComponents();
            }
            case 2: {
                return this.isSetRemovedComponents();
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
        result.append(" (addedComponents: ");
        result.append(this.addedComponents);
        result.append(", changedComponents: ");
        result.append(this.changedComponents);
        result.append(", removedComponents: ");
        result.append(this.removedComponents);
        result.append(')');
        return result.toString();
    }
}
