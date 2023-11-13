// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SymlinkWarningDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SymlinkWarningDTOImpl extends EObjectImpl implements SymlinkWarningDTO
{
    protected int ALL_FLAGS;
    protected static final String TARGET_EDEFAULT;
    protected String target;
    protected static final int TARGET_ESETFLAG = 1;
    protected static final String TYPE_EDEFAULT;
    protected String type;
    protected static final int TYPE_ESETFLAG = 2;
    protected static final String LOCATION_EDEFAULT;
    protected String location;
    protected static final int LOCATION_ESETFLAG = 4;
    protected static final String SANDBOX_LOCATION_EDEFAULT;
    protected String sandboxLocation;
    protected static final int SANDBOX_LOCATION_ESETFLAG = 8;
    
    static {
        TARGET_EDEFAULT = null;
        TYPE_EDEFAULT = null;
        LOCATION_EDEFAULT = null;
        SANDBOX_LOCATION_EDEFAULT = null;
    }
    
    protected SymlinkWarningDTOImpl() {
        this.ALL_FLAGS = 0;
        this.target = SymlinkWarningDTOImpl.TARGET_EDEFAULT;
        this.type = SymlinkWarningDTOImpl.TYPE_EDEFAULT;
        this.location = SymlinkWarningDTOImpl.LOCATION_EDEFAULT;
        this.sandboxLocation = SymlinkWarningDTOImpl.SANDBOX_LOCATION_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.SYMLINK_WARNING_DTO;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(final String newLocation) {
        final String oldLocation = this.location;
        this.location = newLocation;
        final boolean oldLocationESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldLocation, (Object)this.location, !oldLocationESet));
        }
    }
    
    public void unsetLocation() {
        final String oldLocation = this.location;
        final boolean oldLocationESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.location = SymlinkWarningDTOImpl.LOCATION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldLocation, (Object)SymlinkWarningDTOImpl.LOCATION_EDEFAULT, oldLocationESet));
        }
    }
    
    public boolean isSetLocation() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getTarget() {
        return this.target;
    }
    
    public void setTarget(final String newTarget) {
        final String oldTarget = this.target;
        this.target = newTarget;
        final boolean oldTargetESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldTarget, (Object)this.target, !oldTargetESet));
        }
    }
    
    public void unsetTarget() {
        final String oldTarget = this.target;
        final boolean oldTargetESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.target = SymlinkWarningDTOImpl.TARGET_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldTarget, (Object)SymlinkWarningDTOImpl.TARGET_EDEFAULT, oldTargetESet));
        }
    }
    
    public boolean isSetTarget() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String newType) {
        final String oldType = this.type;
        this.type = newType;
        final boolean oldTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldType, (Object)this.type, !oldTypeESet));
        }
    }
    
    public void unsetType() {
        final String oldType = this.type;
        final boolean oldTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.type = SymlinkWarningDTOImpl.TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldType, (Object)SymlinkWarningDTOImpl.TYPE_EDEFAULT, oldTypeESet));
        }
    }
    
    public boolean isSetType() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getSandboxLocation() {
        return this.sandboxLocation;
    }
    
    public void setSandboxLocation(final String newSandboxLocation) {
        final String oldSandboxLocation = this.sandboxLocation;
        this.sandboxLocation = newSandboxLocation;
        final boolean oldSandboxLocationESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldSandboxLocation, (Object)this.sandboxLocation, !oldSandboxLocationESet));
        }
    }
    
    public void unsetSandboxLocation() {
        final String oldSandboxLocation = this.sandboxLocation;
        final boolean oldSandboxLocationESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.sandboxLocation = SymlinkWarningDTOImpl.SANDBOX_LOCATION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldSandboxLocation, (Object)SymlinkWarningDTOImpl.SANDBOX_LOCATION_EDEFAULT, oldSandboxLocationESet));
        }
    }
    
    public boolean isSetSandboxLocation() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getTarget();
            }
            case 1: {
                return this.getType();
            }
            case 2: {
                return this.getLocation();
            }
            case 3: {
                return this.getSandboxLocation();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setTarget((String)newValue);
            }
            case 1: {
                this.setType((String)newValue);
            }
            case 2: {
                this.setLocation((String)newValue);
            }
            case 3: {
                this.setSandboxLocation((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetTarget();
            }
            case 1: {
                this.unsetType();
            }
            case 2: {
                this.unsetLocation();
            }
            case 3: {
                this.unsetSandboxLocation();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetTarget();
            }
            case 1: {
                return this.isSetType();
            }
            case 2: {
                return this.isSetLocation();
            }
            case 3: {
                return this.isSetSandboxLocation();
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
        result.append(" (target: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.target);
        }
        else {
            result.append("<unset>");
        }
        result.append(", type: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.type);
        }
        else {
            result.append("<unset>");
        }
        result.append(", location: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.location);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sandboxLocation: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.sandboxLocation);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
