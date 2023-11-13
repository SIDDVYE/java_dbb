// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.RemoveChangeRequestDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class RemoveChangeRequestDTOImpl extends EObjectImpl implements RemoveChangeRequestDTO
{
    protected int ALL_FLAGS;
    protected static final boolean BACK_LINK_REMOVED_EDEFAULT = false;
    protected static final int BACK_LINK_REMOVED_EFLAG = 1;
    protected static final int BACK_LINK_REMOVED_ESETFLAG = 2;
    protected static final boolean LINK_REMOVED_EDEFAULT = false;
    protected static final int LINK_REMOVED_EFLAG = 4;
    protected static final int LINK_REMOVED_ESETFLAG = 8;
    
    protected RemoveChangeRequestDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.REMOVE_CHANGE_REQUEST_DTO;
    }
    
    public boolean isLinkRemoved() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setLinkRemoved(final boolean newLinkRemoved) {
        final boolean oldLinkRemoved = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newLinkRemoved) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldLinkRemovedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldLinkRemoved, newLinkRemoved, !oldLinkRemovedESet));
        }
    }
    
    public void unsetLinkRemoved() {
        final boolean oldLinkRemoved = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldLinkRemovedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldLinkRemoved, false, oldLinkRemovedESet));
        }
    }
    
    public boolean isSetLinkRemoved() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public boolean isBackLinkRemoved() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setBackLinkRemoved(final boolean newBackLinkRemoved) {
        final boolean oldBackLinkRemoved = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newBackLinkRemoved) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldBackLinkRemovedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldBackLinkRemoved, newBackLinkRemoved, !oldBackLinkRemovedESet));
        }
    }
    
    public void unsetBackLinkRemoved() {
        final boolean oldBackLinkRemoved = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldBackLinkRemovedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldBackLinkRemoved, false, oldBackLinkRemovedESet));
        }
    }
    
    public boolean isSetBackLinkRemoved() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isBackLinkRemoved() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.isLinkRemoved() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setBackLinkRemoved((boolean)newValue);
            }
            case 1: {
                this.setLinkRemoved((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBackLinkRemoved();
            }
            case 1: {
                this.unsetLinkRemoved();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBackLinkRemoved();
            }
            case 1: {
                return this.isSetLinkRemoved();
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
        result.append(" (backLinkRemoved: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", linkRemoved: ");
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
