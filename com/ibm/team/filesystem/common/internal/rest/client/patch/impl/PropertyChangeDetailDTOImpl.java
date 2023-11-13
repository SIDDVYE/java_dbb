// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.PropertyChangeDetailDTO;

public class PropertyChangeDetailDTOImpl extends ChangeDetailDTOImpl implements PropertyChangeDetailDTO
{
    protected static final String PROPERTY_NAME_EDEFAULT;
    protected String propertyName;
    protected static final int PROPERTY_NAME_ESETFLAG = 32;
    protected static final String BEFORE_VALUE_EDEFAULT;
    protected String beforeValue;
    protected static final int BEFORE_VALUE_ESETFLAG = 64;
    protected static final String AFTER_VALUE_EDEFAULT;
    protected String afterValue;
    protected static final int AFTER_VALUE_ESETFLAG = 128;
    protected static final String TYPE_EDEFAULT;
    protected String type;
    protected static final int TYPE_ESETFLAG = 256;
    
    static {
        PROPERTY_NAME_EDEFAULT = null;
        BEFORE_VALUE_EDEFAULT = null;
        AFTER_VALUE_EDEFAULT = null;
        TYPE_EDEFAULT = null;
    }
    
    protected PropertyChangeDetailDTOImpl() {
        this.propertyName = PropertyChangeDetailDTOImpl.PROPERTY_NAME_EDEFAULT;
        this.beforeValue = PropertyChangeDetailDTOImpl.BEFORE_VALUE_EDEFAULT;
        this.afterValue = PropertyChangeDetailDTOImpl.AFTER_VALUE_EDEFAULT;
        this.type = PropertyChangeDetailDTOImpl.TYPE_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.PROPERTY_CHANGE_DETAIL_DTO;
    }
    
    @Override
    public String getPropertyName() {
        return this.propertyName;
    }
    
    @Override
    public void setPropertyName(final String newPropertyName) {
        final String oldPropertyName = this.propertyName;
        this.propertyName = newPropertyName;
        final boolean oldPropertyNameESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldPropertyName, (Object)this.propertyName, !oldPropertyNameESet));
        }
    }
    
    @Override
    public void unsetPropertyName() {
        final String oldPropertyName = this.propertyName;
        final boolean oldPropertyNameESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.propertyName = PropertyChangeDetailDTOImpl.PROPERTY_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldPropertyName, (Object)PropertyChangeDetailDTOImpl.PROPERTY_NAME_EDEFAULT, oldPropertyNameESet));
        }
    }
    
    @Override
    public boolean isSetPropertyName() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getBeforeValue() {
        return this.beforeValue;
    }
    
    @Override
    public void setBeforeValue(final String newBeforeValue) {
        final String oldBeforeValue = this.beforeValue;
        this.beforeValue = newBeforeValue;
        final boolean oldBeforeValueESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldBeforeValue, (Object)this.beforeValue, !oldBeforeValueESet));
        }
    }
    
    @Override
    public void unsetBeforeValue() {
        final String oldBeforeValue = this.beforeValue;
        final boolean oldBeforeValueESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.beforeValue = PropertyChangeDetailDTOImpl.BEFORE_VALUE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldBeforeValue, (Object)PropertyChangeDetailDTOImpl.BEFORE_VALUE_EDEFAULT, oldBeforeValueESet));
        }
    }
    
    @Override
    public boolean isSetBeforeValue() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public String getAfterValue() {
        return this.afterValue;
    }
    
    @Override
    public void setAfterValue(final String newAfterValue) {
        final String oldAfterValue = this.afterValue;
        this.afterValue = newAfterValue;
        final boolean oldAfterValueESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldAfterValue, (Object)this.afterValue, !oldAfterValueESet));
        }
    }
    
    @Override
    public void unsetAfterValue() {
        final String oldAfterValue = this.afterValue;
        final boolean oldAfterValueESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.afterValue = PropertyChangeDetailDTOImpl.AFTER_VALUE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldAfterValue, (Object)PropertyChangeDetailDTOImpl.AFTER_VALUE_EDEFAULT, oldAfterValueESet));
        }
    }
    
    @Override
    public boolean isSetAfterValue() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    @Override
    public String getType() {
        return this.type;
    }
    
    @Override
    public void setType(final String newType) {
        final String oldType = this.type;
        this.type = newType;
        final boolean oldTypeESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldType, (Object)this.type, !oldTypeESet));
        }
    }
    
    @Override
    public void unsetType() {
        final String oldType = this.type;
        final boolean oldTypeESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.type = PropertyChangeDetailDTOImpl.TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldType, (Object)PropertyChangeDetailDTOImpl.TYPE_EDEFAULT, oldTypeESet));
        }
    }
    
    @Override
    public boolean isSetType() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getPropertyName();
            }
            case 5: {
                return this.getBeforeValue();
            }
            case 6: {
                return this.getAfterValue();
            }
            case 7: {
                return this.getType();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 4: {
                this.setPropertyName((String)newValue);
            }
            case 5: {
                this.setBeforeValue((String)newValue);
            }
            case 6: {
                this.setAfterValue((String)newValue);
            }
            case 7: {
                this.setType((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 4: {
                this.unsetPropertyName();
            }
            case 5: {
                this.unsetBeforeValue();
            }
            case 6: {
                this.unsetAfterValue();
            }
            case 7: {
                this.unsetType();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 4: {
                return this.isSetPropertyName();
            }
            case 5: {
                return this.isSetBeforeValue();
            }
            case 6: {
                return this.isSetAfterValue();
            }
            case 7: {
                return this.isSetType();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (propertyName: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.propertyName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", beforeValue: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.beforeValue);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterValue: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.afterValue);
        }
        else {
            result.append("<unset>");
        }
        result.append(", type: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.type);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
