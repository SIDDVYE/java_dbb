// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.EMap;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import org.eclipse.emf.common.util.BasicEMap;
import com.ibm.team.repository.common.model.impl.HelperImpl;

public class PropertyImpl extends HelperImpl implements BasicEMap.Entry
{
    protected int ALL_FLAGS;
    protected static final String KEY_EDEFAULT;
    protected String key;
    protected static final int KEY_ESETFLAG = 2;
    protected static final String VALUE_EDEFAULT;
    protected String value;
    protected static final int VALUE_ESETFLAG = 4;
    private static final int EOFFSET_CORRECTION;
    protected int hash;
    
    static {
        KEY_EDEFAULT = null;
        VALUE_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemPackage.Literals.PROPERTY.getFeatureID((EStructuralFeature)FilesystemPackage.Literals.PROPERTY__KEY) - 1;
    }
    
    protected PropertyImpl() {
        this.ALL_FLAGS = 0;
        this.key = PropertyImpl.KEY_EDEFAULT;
        this.value = PropertyImpl.VALUE_EDEFAULT;
        this.hash = -1;
    }
    
    protected EClass eStaticClass() {
        return FilesystemPackage.Literals.PROPERTY;
    }
    
    public String getTypedKey() {
        return this.key;
    }
    
    public void setTypedKey(final String newKey) {
        final String oldKey = this.key;
        this.key = newKey;
        final boolean oldKeyESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1 + PropertyImpl.EOFFSET_CORRECTION, (Object)oldKey, (Object)this.key, !oldKeyESet));
        }
    }
    
    public void unsetTypedKey() {
        final String oldKey = this.key;
        final boolean oldKeyESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.key = PropertyImpl.KEY_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1 + PropertyImpl.EOFFSET_CORRECTION, (Object)oldKey, (Object)PropertyImpl.KEY_EDEFAULT, oldKeyESet));
        }
    }
    
    public boolean isSetTypedKey() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getTypedValue() {
        return this.value;
    }
    
    public void setTypedValue(final String newValue) {
        final String oldValue = this.value;
        this.value = newValue;
        final boolean oldValueESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2 + PropertyImpl.EOFFSET_CORRECTION, (Object)oldValue, (Object)this.value, !oldValueESet));
        }
    }
    
    public void unsetTypedValue() {
        final String oldValue = this.value;
        final boolean oldValueESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.value = PropertyImpl.VALUE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2 + PropertyImpl.EOFFSET_CORRECTION, (Object)oldValue, (Object)PropertyImpl.VALUE_EDEFAULT, oldValueESet));
        }
    }
    
    public boolean isSetTypedValue() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - PropertyImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.getTypedKey();
            }
            case 2: {
                return this.getTypedValue();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - PropertyImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.setTypedKey((String)newValue);
            }
            case 2: {
                this.setTypedValue((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - PropertyImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.unsetTypedKey();
            }
            case 2: {
                this.unsetTypedValue();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - PropertyImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.isSetTypedKey();
            }
            case 2: {
                return this.isSetTypedValue();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != Map.Entry.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - PropertyImpl.EOFFSET_CORRECTION) {
            case 1: {
                return 1 + PropertyImpl.EOFFSET_CORRECTION;
            }
            case 2: {
                return 2 + PropertyImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (key: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.key);
        }
        else {
            result.append("<unset>");
        }
        result.append(", value: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.value);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    public int getHash() {
        if (this.hash == -1) {
            final Object theKey = this.getKey();
            this.hash = ((theKey == null) ? 0 : theKey.hashCode());
        }
        return this.hash;
    }
    
    public void setHash(final int hash) {
        this.hash = hash;
    }
    
    public Object getKey() {
        return this.getTypedKey();
    }
    
    public void setKey(final Object key) {
        this.setTypedKey((String)key);
    }
    
    public Object getValue() {
        return this.getTypedValue();
    }
    
    public Object setValue(final Object value) {
        final Object oldValue = this.getValue();
        this.setTypedValue((String)value);
        return oldValue;
    }
    
    public EMap getEMap() {
        final EObject container = this.eContainer();
        return (container == null) ? null : ((EMap)container.eGet((EStructuralFeature)this.eContainmentFeature()));
    }
}
