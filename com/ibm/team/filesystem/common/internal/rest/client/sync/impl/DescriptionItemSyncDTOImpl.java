// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.DescriptionItemSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class DescriptionItemSyncDTOImpl extends EObjectImpl implements DescriptionItemSyncDTO
{
    protected int ALL_FLAGS;
    protected static final String CATEGORY_EDEFAULT;
    protected String category;
    protected static final int CATEGORY_ESETFLAG = 1;
    protected static final String VALUE_EDEFAULT;
    protected String value;
    protected static final int VALUE_ESETFLAG = 2;
    
    static {
        CATEGORY_EDEFAULT = null;
        VALUE_EDEFAULT = null;
    }
    
    protected DescriptionItemSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.category = DescriptionItemSyncDTOImpl.CATEGORY_EDEFAULT;
        this.value = DescriptionItemSyncDTOImpl.VALUE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.DESCRIPTION_ITEM_SYNC_DTO;
    }
    
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(final String newCategory) {
        final String oldCategory = this.category;
        this.category = newCategory;
        final boolean oldCategoryESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldCategory, (Object)this.category, !oldCategoryESet));
        }
    }
    
    public void unsetCategory() {
        final String oldCategory = this.category;
        final boolean oldCategoryESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.category = DescriptionItemSyncDTOImpl.CATEGORY_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldCategory, (Object)DescriptionItemSyncDTOImpl.CATEGORY_EDEFAULT, oldCategoryESet));
        }
    }
    
    public boolean isSetCategory() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public void setValue(final String newValue) {
        final String oldValue = this.value;
        this.value = newValue;
        final boolean oldValueESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldValue, (Object)this.value, !oldValueESet));
        }
    }
    
    public void unsetValue() {
        final String oldValue = this.value;
        final boolean oldValueESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.value = DescriptionItemSyncDTOImpl.VALUE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldValue, (Object)DescriptionItemSyncDTOImpl.VALUE_EDEFAULT, oldValueESet));
        }
    }
    
    public boolean isSetValue() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getCategory();
            }
            case 1: {
                return this.getValue();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setCategory((String)newValue);
            }
            case 1: {
                this.setValue((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetCategory();
            }
            case 1: {
                this.unsetValue();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetCategory();
            }
            case 1: {
                return this.isSetValue();
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
        result.append(" (category: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.category);
        }
        else {
            result.append("<unset>");
        }
        result.append(", value: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.value);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
