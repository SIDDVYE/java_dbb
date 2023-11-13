// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.scm.common.IVersionableHandle;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.Inaccessible;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class InaccessibleImpl extends EObjectImpl implements Inaccessible
{
    protected int ALL_FLAGS;
    protected EList requests;
    
    protected InaccessibleImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.INACCESSIBLE;
    }
    
    public List getRequests() {
        if (this.requests == null) {
            this.requests = (EList)new EObjectResolvingEList.Unsettable((Class)IVersionableHandle.class, (InternalEObject)this, 0);
        }
        return (List)this.requests;
    }
    
    public void unsetRequests() {
        if (this.requests != null) {
            ((InternalEList.Unsettable)this.requests).unset();
        }
    }
    
    public boolean isSetRequests() {
        return this.requests != null && ((InternalEList.Unsettable)this.requests).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRequests();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getRequests().clear();
                this.getRequests().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRequests();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRequests();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
