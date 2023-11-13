// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SymlinkPropertiesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SymlinkPropertiesDTOImpl extends EObjectImpl implements SymlinkPropertiesDTO
{
    protected int ALL_FLAGS;
    protected static final String TYPE_EDEFAULT;
    protected String type;
    protected static final int TYPE_ESETFLAG = 1;
    
    static {
        TYPE_EDEFAULT = null;
    }
    
    protected SymlinkPropertiesDTOImpl() {
        this.ALL_FLAGS = 0;
        this.type = SymlinkPropertiesDTOImpl.TYPE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.SYMLINK_PROPERTIES_DTO;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String newType) {
        final String oldType = this.type;
        this.type = newType;
        final boolean oldTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldType, (Object)this.type, !oldTypeESet));
        }
    }
    
    public void unsetType() {
        final String oldType = this.type;
        final boolean oldTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.type = SymlinkPropertiesDTOImpl.TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldType, (Object)SymlinkPropertiesDTOImpl.TYPE_EDEFAULT, oldTypeESet));
        }
    }
    
    public boolean isSetType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getType();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setType((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetType();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetType();
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
        result.append(" (type: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.type);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
