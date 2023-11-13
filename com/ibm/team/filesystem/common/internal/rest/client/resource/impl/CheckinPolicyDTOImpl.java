// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.CheckinPolicyDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CheckinPolicyDTOImpl extends EObjectImpl implements CheckinPolicyDTO
{
    protected int ALL_FLAGS;
    protected static final boolean AUTO_CHECKIN_EDEFAULT = false;
    protected static final int AUTO_CHECKIN_EFLAG = 1;
    protected static final int AUTO_CHECKIN_ESETFLAG = 2;
    protected static final boolean AUTO_CHECKIN_DEFAULT_EDEFAULT = false;
    protected static final int AUTO_CHECKIN_DEFAULT_EFLAG = 4;
    protected static final int AUTO_CHECKIN_DEFAULT_ESETFLAG = 8;
    
    protected CheckinPolicyDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.CHECKIN_POLICY_DTO;
    }
    
    public boolean isAutoCheckin() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setAutoCheckin(final boolean newAutoCheckin) {
        final boolean oldAutoCheckin = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newAutoCheckin) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldAutoCheckinESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldAutoCheckin, newAutoCheckin, !oldAutoCheckinESet));
        }
    }
    
    public void unsetAutoCheckin() {
        final boolean oldAutoCheckin = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldAutoCheckinESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldAutoCheckin, false, oldAutoCheckinESet));
        }
    }
    
    public boolean isSetAutoCheckin() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public boolean isAutoCheckinDefault() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setAutoCheckinDefault(final boolean newAutoCheckinDefault) {
        final boolean oldAutoCheckinDefault = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newAutoCheckinDefault) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldAutoCheckinDefaultESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldAutoCheckinDefault, newAutoCheckinDefault, !oldAutoCheckinDefaultESet));
        }
    }
    
    public void unsetAutoCheckinDefault() {
        final boolean oldAutoCheckinDefault = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldAutoCheckinDefaultESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldAutoCheckinDefault, false, oldAutoCheckinDefaultESet));
        }
    }
    
    public boolean isSetAutoCheckinDefault() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isAutoCheckin() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.isAutoCheckinDefault() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setAutoCheckin((boolean)newValue);
            }
            case 1: {
                this.setAutoCheckinDefault((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAutoCheckin();
            }
            case 1: {
                this.unsetAutoCheckinDefault();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAutoCheckin();
            }
            case 1: {
                return this.isSetAutoCheckinDefault();
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
        result.append(" (autoCheckin: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", autoCheckinDefault: ");
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
