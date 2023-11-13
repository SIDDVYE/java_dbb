// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core.impl;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.ServiceReport;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ServiceEntryImpl extends EObjectImpl implements BasicEMap.Entry
{
    protected int ALL_FLAGS;
    protected static final String KEY_EDEFAULT;
    protected String key;
    protected static final int KEY_ESETFLAG = 1;
    protected ServiceReport value;
    protected static final int VALUE_ESETFLAG = 2;
    protected int hash;
    
    static {
        KEY_EDEFAULT = null;
    }
    
    protected ServiceEntryImpl() {
        this.ALL_FLAGS = 0;
        this.key = ServiceEntryImpl.KEY_EDEFAULT;
        this.hash = -1;
    }
    
    protected EClass eStaticClass() {
        return LifecycleRestClientDTOPackage.Literals.SERVICE_ENTRY;
    }
    
    public String getTypedKey() {
        return this.key;
    }
    
    public void setTypedKey(final String newKey) {
        final String oldKey = this.key;
        this.key = newKey;
        final boolean oldKeyESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldKey, (Object)this.key, !oldKeyESet));
        }
    }
    
    public void unsetTypedKey() {
        final String oldKey = this.key;
        final boolean oldKeyESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.key = ServiceEntryImpl.KEY_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldKey, (Object)ServiceEntryImpl.KEY_EDEFAULT, oldKeyESet));
        }
    }
    
    public boolean isSetTypedKey() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public ServiceReport getTypedValue() {
        if (this.value != null && ((EObject)this.value).eIsProxy()) {
            final InternalEObject oldValue = (InternalEObject)this.value;
            this.value = (ServiceReport)this.eResolveProxy(oldValue);
            if (this.value != oldValue && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldValue, (Object)this.value));
            }
        }
        return this.value;
    }
    
    public ServiceReport basicGetTypedValue() {
        return this.value;
    }
    
    public void setTypedValue(final ServiceReport newValue) {
        final ServiceReport oldValue = this.value;
        this.value = newValue;
        final boolean oldValueESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldValue, (Object)this.value, !oldValueESet));
        }
    }
    
    public void unsetTypedValue() {
        final ServiceReport oldValue = this.value;
        final boolean oldValueESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.value = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldValue, (Object)null, oldValueESet));
        }
    }
    
    public boolean isSetTypedValue() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getTypedKey();
            }
            case 1: {
                if (resolve) {
                    return this.getTypedValue();
                }
                return this.basicGetTypedValue();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setTypedKey((String)newValue);
            }
            case 1: {
                this.setTypedValue((ServiceReport)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetTypedKey();
            }
            case 1: {
                this.unsetTypedValue();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetTypedKey();
            }
            case 1: {
                return this.isSetTypedValue();
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
        result.append(" (key: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.key);
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
        this.setTypedValue((ServiceReport)value);
        return oldValue;
    }
    
    public EMap getEMap() {
        final EObject container = this.eContainer();
        return (container == null) ? null : ((EMap)container.eGet((EStructuralFeature)this.eContainmentFeature()));
    }
}
