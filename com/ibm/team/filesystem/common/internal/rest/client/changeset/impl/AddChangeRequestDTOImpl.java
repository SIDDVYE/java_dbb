// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.AddChangeRequestDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class AddChangeRequestDTOImpl extends EObjectImpl implements AddChangeRequestDTO
{
    protected int ALL_FLAGS;
    protected static final boolean LINK_ADDED_EDEFAULT = false;
    protected static final int LINK_ADDED_EFLAG = 1;
    protected static final int LINK_ADDED_ESETFLAG = 2;
    protected static final boolean BACK_LINK_ADDED_EDEFAULT = false;
    protected static final int BACK_LINK_ADDED_EFLAG = 4;
    protected static final int BACK_LINK_ADDED_ESETFLAG = 8;
    
    protected AddChangeRequestDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.ADD_CHANGE_REQUEST_DTO;
    }
    
    public boolean isLinkAdded() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setLinkAdded(final boolean newLinkAdded) {
        final boolean oldLinkAdded = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newLinkAdded) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldLinkAddedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldLinkAdded, newLinkAdded, !oldLinkAddedESet));
        }
    }
    
    public void unsetLinkAdded() {
        final boolean oldLinkAdded = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldLinkAddedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldLinkAdded, false, oldLinkAddedESet));
        }
    }
    
    public boolean isSetLinkAdded() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public boolean isBackLinkAdded() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setBackLinkAdded(final boolean newBackLinkAdded) {
        final boolean oldBackLinkAdded = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newBackLinkAdded) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldBackLinkAddedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldBackLinkAdded, newBackLinkAdded, !oldBackLinkAddedESet));
        }
    }
    
    public void unsetBackLinkAdded() {
        final boolean oldBackLinkAdded = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldBackLinkAddedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldBackLinkAdded, false, oldBackLinkAddedESet));
        }
    }
    
    public boolean isSetBackLinkAdded() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isLinkAdded() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.isBackLinkAdded() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setLinkAdded((boolean)newValue);
            }
            case 1: {
                this.setBackLinkAdded((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetLinkAdded();
            }
            case 1: {
                this.unsetBackLinkAdded();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetLinkAdded();
            }
            case 1: {
                return this.isSetBackLinkAdded();
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
        result.append(" (linkAdded: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", backLinkAdded: ");
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
