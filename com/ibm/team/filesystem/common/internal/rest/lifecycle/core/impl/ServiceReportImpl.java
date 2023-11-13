// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.ServiceReport;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ServiceReportImpl extends EObjectImpl implements ServiceReport
{
    protected int ALL_FLAGS;
    protected static final boolean COMPATIBLE_EDEFAULT = false;
    protected static final int COMPATIBLE_EFLAG = 1;
    protected static final int COMPATIBLE_ESETFLAG = 2;
    protected static final String INSTALLED_VERSION_EDEFAULT;
    protected String installedVersion;
    protected static final int INSTALLED_VERSION_ESETFLAG = 4;
    
    static {
        INSTALLED_VERSION_EDEFAULT = null;
    }
    
    protected ServiceReportImpl() {
        this.ALL_FLAGS = 0;
        this.installedVersion = ServiceReportImpl.INSTALLED_VERSION_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return LifecycleRestClientDTOPackage.Literals.SERVICE_REPORT;
    }
    
    public boolean isCompatible() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setCompatible(final boolean newCompatible) {
        final boolean oldCompatible = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newCompatible) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldCompatibleESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldCompatible, newCompatible, !oldCompatibleESet));
        }
    }
    
    public void unsetCompatible() {
        final boolean oldCompatible = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldCompatibleESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldCompatible, false, oldCompatibleESet));
        }
    }
    
    public boolean isSetCompatible() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getInstalledVersion() {
        return this.installedVersion;
    }
    
    public void setInstalledVersion(final String newInstalledVersion) {
        final String oldInstalledVersion = this.installedVersion;
        this.installedVersion = newInstalledVersion;
        final boolean oldInstalledVersionESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldInstalledVersion, (Object)this.installedVersion, !oldInstalledVersionESet));
        }
    }
    
    public void unsetInstalledVersion() {
        final String oldInstalledVersion = this.installedVersion;
        final boolean oldInstalledVersionESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.installedVersion = ServiceReportImpl.INSTALLED_VERSION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldInstalledVersion, (Object)ServiceReportImpl.INSTALLED_VERSION_EDEFAULT, oldInstalledVersionESet));
        }
    }
    
    public boolean isSetInstalledVersion() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isCompatible() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.getInstalledVersion();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setCompatible((boolean)newValue);
            }
            case 1: {
                this.setInstalledVersion((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetCompatible();
            }
            case 1: {
                this.unsetInstalledVersion();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetCompatible();
            }
            case 1: {
                return this.isSetInstalledVersion();
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
        result.append(" (compatible: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", installedVersion: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.installedVersion);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
