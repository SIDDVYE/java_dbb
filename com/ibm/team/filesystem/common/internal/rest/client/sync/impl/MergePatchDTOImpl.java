// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.MergePatchDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class MergePatchDTOImpl extends EObjectImpl implements MergePatchDTO
{
    protected int ALL_FLAGS;
    protected static final boolean SOME_HUNKS_FAILED_EDEFAULT = false;
    protected static final int SOME_HUNKS_FAILED_EFLAG = 1;
    protected static final int SOME_HUNKS_FAILED_ESETFLAG = 2;
    protected static final boolean SOME_HUNKS_MATCHED_EDEFAULT = false;
    protected static final int SOME_HUNKS_MATCHED_EFLAG = 4;
    protected static final int SOME_HUNKS_MATCHED_ESETFLAG = 8;
    
    protected MergePatchDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.MERGE_PATCH_DTO;
    }
    
    public boolean isSomeHunksMatched() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setSomeHunksMatched(final boolean newSomeHunksMatched) {
        final boolean oldSomeHunksMatched = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newSomeHunksMatched) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldSomeHunksMatchedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldSomeHunksMatched, newSomeHunksMatched, !oldSomeHunksMatchedESet));
        }
    }
    
    public void unsetSomeHunksMatched() {
        final boolean oldSomeHunksMatched = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldSomeHunksMatchedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldSomeHunksMatched, false, oldSomeHunksMatchedESet));
        }
    }
    
    public boolean isSetSomeHunksMatched() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public boolean isSomeHunksFailed() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setSomeHunksFailed(final boolean newSomeHunksFailed) {
        final boolean oldSomeHunksFailed = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newSomeHunksFailed) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldSomeHunksFailedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldSomeHunksFailed, newSomeHunksFailed, !oldSomeHunksFailedESet));
        }
    }
    
    public void unsetSomeHunksFailed() {
        final boolean oldSomeHunksFailed = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldSomeHunksFailedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldSomeHunksFailed, false, oldSomeHunksFailedESet));
        }
    }
    
    public boolean isSetSomeHunksFailed() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isSomeHunksFailed() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.isSomeHunksMatched() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setSomeHunksFailed((boolean)newValue);
            }
            case 1: {
                this.setSomeHunksMatched((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetSomeHunksFailed();
            }
            case 1: {
                this.unsetSomeHunksMatched();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetSomeHunksFailed();
            }
            case 1: {
                return this.isSetSomeHunksMatched();
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
        result.append(" (someHunksFailed: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", someHunksMatched: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
