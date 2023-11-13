// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.InvalidPropertyDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class InvalidPropertyDTOImpl extends EObjectImpl implements InvalidPropertyDTO
{
    protected int ALL_FLAGS;
    protected static final String PROPERTY_NAME_EDEFAULT;
    protected String propertyName;
    protected static final int PROPERTY_NAME_ESETFLAG = 1;
    protected static final String REASON_EDEFAULT;
    protected String reason;
    protected static final int REASON_ESETFLAG = 2;
    
    static {
        PROPERTY_NAME_EDEFAULT = null;
        REASON_EDEFAULT = null;
    }
    
    protected InvalidPropertyDTOImpl() {
        this.ALL_FLAGS = 0;
        this.propertyName = InvalidPropertyDTOImpl.PROPERTY_NAME_EDEFAULT;
        this.reason = InvalidPropertyDTOImpl.REASON_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.INVALID_PROPERTY_DTO;
    }
    
    public String getPropertyName() {
        return this.propertyName;
    }
    
    public void setPropertyName(final String newPropertyName) {
        final String oldPropertyName = this.propertyName;
        this.propertyName = newPropertyName;
        final boolean oldPropertyNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldPropertyName, (Object)this.propertyName, !oldPropertyNameESet));
        }
    }
    
    public void unsetPropertyName() {
        final String oldPropertyName = this.propertyName;
        final boolean oldPropertyNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.propertyName = InvalidPropertyDTOImpl.PROPERTY_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldPropertyName, (Object)InvalidPropertyDTOImpl.PROPERTY_NAME_EDEFAULT, oldPropertyNameESet));
        }
    }
    
    public boolean isSetPropertyName() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(final String newReason) {
        final String oldReason = this.reason;
        this.reason = newReason;
        final boolean oldReasonESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldReason, (Object)this.reason, !oldReasonESet));
        }
    }
    
    public void unsetReason() {
        final String oldReason = this.reason;
        final boolean oldReasonESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.reason = InvalidPropertyDTOImpl.REASON_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldReason, (Object)InvalidPropertyDTOImpl.REASON_EDEFAULT, oldReasonESet));
        }
    }
    
    public boolean isSetReason() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getPropertyName();
            }
            case 1: {
                return this.getReason();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setPropertyName((String)newValue);
            }
            case 1: {
                this.setReason((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetPropertyName();
            }
            case 1: {
                this.unsetReason();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetPropertyName();
            }
            case 1: {
                return this.isSetReason();
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
        result.append(" (propertyName: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.propertyName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", reason: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.reason);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
