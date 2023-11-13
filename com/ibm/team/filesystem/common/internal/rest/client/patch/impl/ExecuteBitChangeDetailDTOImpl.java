// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ExecuteBitChangeDetailDTO;

public class ExecuteBitChangeDetailDTOImpl extends ChangeDetailDTOImpl implements ExecuteBitChangeDetailDTO
{
    protected static final boolean EXECUTABLE_EDEFAULT = false;
    protected static final int EXECUTABLE_EFLAG = 32;
    protected static final int EXECUTABLE_ESETFLAG = 64;
    
    protected ExecuteBitChangeDetailDTOImpl() {
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.EXECUTE_BIT_CHANGE_DETAIL_DTO;
    }
    
    @Override
    public boolean isExecutable() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldExecutable, newExecutable, !oldExecutableESet));
        }
    }
    
    @Override
    public void unsetExecutable() {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x20) != 0x0;
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldExecutable, false, oldExecutableESet));
        }
    }
    
    @Override
    public boolean isSetExecutable() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.isExecutable() ? Boolean.TRUE : Boolean.FALSE;
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
                this.setExecutable((boolean)newValue);
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
                this.unsetExecutable();
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
                return this.isSetExecutable();
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
