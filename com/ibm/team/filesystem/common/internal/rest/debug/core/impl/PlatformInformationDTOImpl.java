// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.debug.core.PlatformInformationDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class PlatformInformationDTOImpl extends EObjectImpl implements PlatformInformationDTO
{
    protected int ALL_FLAGS;
    protected static final String ECLIPSE_WORKSPACE_PATH_EDEFAULT;
    protected String eclipseWorkspacePath;
    protected static final int ECLIPSE_WORKSPACE_PATH_ESETFLAG = 1;
    protected static final String USER_CONFIGURATION_PATH_EDEFAULT;
    protected String userConfigurationPath;
    protected static final int USER_CONFIGURATION_PATH_ESETFLAG = 2;
    
    static {
        ECLIPSE_WORKSPACE_PATH_EDEFAULT = null;
        USER_CONFIGURATION_PATH_EDEFAULT = null;
    }
    
    protected PlatformInformationDTOImpl() {
        this.ALL_FLAGS = 0;
        this.eclipseWorkspacePath = PlatformInformationDTOImpl.ECLIPSE_WORKSPACE_PATH_EDEFAULT;
        this.userConfigurationPath = PlatformInformationDTOImpl.USER_CONFIGURATION_PATH_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.PLATFORM_INFORMATION_DTO;
    }
    
    public String getEclipseWorkspacePath() {
        return this.eclipseWorkspacePath;
    }
    
    public void setEclipseWorkspacePath(final String newEclipseWorkspacePath) {
        final String oldEclipseWorkspacePath = this.eclipseWorkspacePath;
        this.eclipseWorkspacePath = newEclipseWorkspacePath;
        final boolean oldEclipseWorkspacePathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldEclipseWorkspacePath, (Object)this.eclipseWorkspacePath, !oldEclipseWorkspacePathESet));
        }
    }
    
    public void unsetEclipseWorkspacePath() {
        final String oldEclipseWorkspacePath = this.eclipseWorkspacePath;
        final boolean oldEclipseWorkspacePathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.eclipseWorkspacePath = PlatformInformationDTOImpl.ECLIPSE_WORKSPACE_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldEclipseWorkspacePath, (Object)PlatformInformationDTOImpl.ECLIPSE_WORKSPACE_PATH_EDEFAULT, oldEclipseWorkspacePathESet));
        }
    }
    
    public boolean isSetEclipseWorkspacePath() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getUserConfigurationPath() {
        return this.userConfigurationPath;
    }
    
    public void setUserConfigurationPath(final String newUserConfigurationPath) {
        final String oldUserConfigurationPath = this.userConfigurationPath;
        this.userConfigurationPath = newUserConfigurationPath;
        final boolean oldUserConfigurationPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldUserConfigurationPath, (Object)this.userConfigurationPath, !oldUserConfigurationPathESet));
        }
    }
    
    public void unsetUserConfigurationPath() {
        final String oldUserConfigurationPath = this.userConfigurationPath;
        final boolean oldUserConfigurationPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.userConfigurationPath = PlatformInformationDTOImpl.USER_CONFIGURATION_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldUserConfigurationPath, (Object)PlatformInformationDTOImpl.USER_CONFIGURATION_PATH_EDEFAULT, oldUserConfigurationPathESet));
        }
    }
    
    public boolean isSetUserConfigurationPath() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getEclipseWorkspacePath();
            }
            case 1: {
                return this.getUserConfigurationPath();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setEclipseWorkspacePath((String)newValue);
            }
            case 1: {
                this.setUserConfigurationPath((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetEclipseWorkspacePath();
            }
            case 1: {
                this.unsetUserConfigurationPath();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetEclipseWorkspacePath();
            }
            case 1: {
                return this.isSetUserConfigurationPath();
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
        result.append(" (eclipseWorkspacePath: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.eclipseWorkspacePath);
        }
        else {
            result.append("<unset>");
        }
        result.append(", userConfigurationPath: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.userConfigurationPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
