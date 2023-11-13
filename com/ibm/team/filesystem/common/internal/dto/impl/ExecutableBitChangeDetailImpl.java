// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.filesystem.common.IExecutableBitChangeDetail;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import com.ibm.team.filesystem.common.internal.dto.ExecutableBitChangeDetail;
import com.ibm.team.scm.common.internal.dto2.impl.ChangeDetailImpl;

public class ExecutableBitChangeDetailImpl extends ChangeDetailImpl implements ExecutableBitChangeDetail
{
    protected int ALL_FLAGS;
    protected static final boolean EXECUTABLE_EDEFAULT = false;
    protected static final int EXECUTABLE_EFLAG = 32;
    protected static final int EXECUTABLE_ESETFLAG = 64;
    private static final int EOFFSET_CORRECTION;
    
    static {
        EOFFSET_CORRECTION = FilesystemDTOPackage.Literals.EXECUTABLE_BIT_CHANGE_DETAIL.getFeatureID((EStructuralFeature)FilesystemDTOPackage.Literals.EXECUTABLE_BIT_CHANGE_DETAIL__EXECUTABLE) - 4;
    }
    
    protected ExecutableBitChangeDetailImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.EXECUTABLE_BIT_CHANGE_DETAIL;
    }
    
    public boolean isExecutable() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public void setExecutable(final boolean newExecutable) {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x20) != 0x0;
        if (newExecutable) {
            this.ALL_FLAGS |= 0x20;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFDF;
        }
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4 + ExecutableBitChangeDetailImpl.EOFFSET_CORRECTION, oldExecutable, newExecutable, !oldExecutableESet));
        }
    }
    
    public void unsetExecutable() {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x20) != 0x0;
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4 + ExecutableBitChangeDetailImpl.EOFFSET_CORRECTION, oldExecutable, false, oldExecutableESet));
        }
    }
    
    public boolean isSetExecutable() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - ExecutableBitChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return this.isExecutable() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - ExecutableBitChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                this.setExecutable((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - ExecutableBitChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                this.unsetExecutable();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - ExecutableBitChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return this.isSetExecutable();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == IExecutableBitChangeDetail.class) {
            return -1;
        }
        if (baseClass != ExecutableBitChangeDetail.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - ExecutableBitChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return 4 + ExecutableBitChangeDetailImpl.EOFFSET_CORRECTION;
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
        result.append(" (executable: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append((this.ALL_FLAGS & 0x20) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
