// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.SymbolicLinkChangeDetailDTO;

public class SymbolicLinkChangeDetailDTOImpl extends ChangeDetailDTOImpl implements SymbolicLinkChangeDetailDTO
{
    protected static final String BEFORE_TARGET_EDEFAULT;
    protected String beforeTarget;
    protected static final int BEFORE_TARGET_ESETFLAG = 32;
    protected static final String AFTER_TARGET_EDEFAULT;
    protected String afterTarget;
    protected static final int AFTER_TARGET_ESETFLAG = 64;
    protected static final boolean BEFORE_DIRECTORY_EDEFAULT = false;
    protected static final int BEFORE_DIRECTORY_EFLAG = 128;
    protected static final int BEFORE_DIRECTORY_ESETFLAG = 256;
    protected static final boolean AFTER_DIRECTORY_EDEFAULT = false;
    protected static final int AFTER_DIRECTORY_EFLAG = 512;
    protected static final int AFTER_DIRECTORY_ESETFLAG = 1024;
    
    static {
        BEFORE_TARGET_EDEFAULT = null;
        AFTER_TARGET_EDEFAULT = null;
    }
    
    protected SymbolicLinkChangeDetailDTOImpl() {
        this.beforeTarget = SymbolicLinkChangeDetailDTOImpl.BEFORE_TARGET_EDEFAULT;
        this.afterTarget = SymbolicLinkChangeDetailDTOImpl.AFTER_TARGET_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.SYMBOLIC_LINK_CHANGE_DETAIL_DTO;
    }
    
    @Override
    public String getBeforeTarget() {
        return this.beforeTarget;
    }
    
    @Override
    public void setBeforeTarget(final String newBeforeTarget) {
        final String oldBeforeTarget = this.beforeTarget;
        this.beforeTarget = newBeforeTarget;
        final boolean oldBeforeTargetESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldBeforeTarget, (Object)this.beforeTarget, !oldBeforeTargetESet));
        }
    }
    
    @Override
    public void unsetBeforeTarget() {
        final String oldBeforeTarget = this.beforeTarget;
        final boolean oldBeforeTargetESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeTarget = SymbolicLinkChangeDetailDTOImpl.BEFORE_TARGET_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldBeforeTarget, (Object)SymbolicLinkChangeDetailDTOImpl.BEFORE_TARGET_EDEFAULT, oldBeforeTargetESet));
        }
    }
    
    @Override
    public boolean isSetBeforeTarget() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getAfterTarget() {
        return this.afterTarget;
    }
    
    @Override
    public void setAfterTarget(final String newAfterTarget) {
        final String oldAfterTarget = this.afterTarget;
        this.afterTarget = newAfterTarget;
        final boolean oldAfterTargetESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldAfterTarget, (Object)this.afterTarget, !oldAfterTargetESet));
        }
    }
    
    @Override
    public void unsetAfterTarget() {
        final String oldAfterTarget = this.afterTarget;
        final boolean oldAfterTargetESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterTarget = SymbolicLinkChangeDetailDTOImpl.AFTER_TARGET_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldAfterTarget, (Object)SymbolicLinkChangeDetailDTOImpl.AFTER_TARGET_EDEFAULT, oldAfterTargetESet));
        }
    }
    
    @Override
    public boolean isSetAfterTarget() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public boolean isBeforeDirectory() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    @Override
    public void setBeforeDirectory(final boolean newBeforeDirectory) {
        final boolean oldBeforeDirectory = (this.ALL_FLAGS & 0x80) != 0x0;
        if (newBeforeDirectory) {
            this.ALL_FLAGS |= 0x80;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFF7F;
        }
        final boolean oldBeforeDirectoryESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, oldBeforeDirectory, newBeforeDirectory, !oldBeforeDirectoryESet));
        }
    }
    
    @Override
    public void unsetBeforeDirectory() {
        final boolean oldBeforeDirectory = (this.ALL_FLAGS & 0x80) != 0x0;
        final boolean oldBeforeDirectoryESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, oldBeforeDirectory, false, oldBeforeDirectoryESet));
        }
    }
    
    @Override
    public boolean isSetBeforeDirectory() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    @Override
    public boolean isAfterDirectory() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    @Override
    public void setAfterDirectory(final boolean newAfterDirectory) {
        final boolean oldAfterDirectory = (this.ALL_FLAGS & 0x200) != 0x0;
        if (newAfterDirectory) {
            this.ALL_FLAGS |= 0x200;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFDFF;
        }
        final boolean oldAfterDirectoryESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, oldAfterDirectory, newAfterDirectory, !oldAfterDirectoryESet));
        }
    }
    
    @Override
    public void unsetAfterDirectory() {
        final boolean oldAfterDirectory = (this.ALL_FLAGS & 0x200) != 0x0;
        final boolean oldAfterDirectoryESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, oldAfterDirectory, false, oldAfterDirectoryESet));
        }
    }
    
    @Override
    public boolean isSetAfterDirectory() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getBeforeTarget();
            }
            case 5: {
                return this.getAfterTarget();
            }
            case 6: {
                return this.isBeforeDirectory() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 7: {
                return this.isAfterDirectory() ? Boolean.TRUE : Boolean.FALSE;
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
                this.setBeforeTarget((String)newValue);
            }
            case 5: {
                this.setAfterTarget((String)newValue);
            }
            case 6: {
                this.setBeforeDirectory((boolean)newValue);
            }
            case 7: {
                this.setAfterDirectory((boolean)newValue);
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
                this.unsetBeforeTarget();
            }
            case 5: {
                this.unsetAfterTarget();
            }
            case 6: {
                this.unsetBeforeDirectory();
            }
            case 7: {
                this.unsetAfterDirectory();
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
                return this.isSetBeforeTarget();
            }
            case 5: {
                return this.isSetAfterTarget();
            }
            case 6: {
                return this.isSetBeforeDirectory();
            }
            case 7: {
                return this.isSetAfterDirectory();
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
        result.append(" (beforeTarget: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.beforeTarget);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterTarget: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.afterTarget);
        }
        else {
            result.append("<unset>");
        }
        result.append(", beforeDirectory: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append((this.ALL_FLAGS & 0x80) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterDirectory: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append((this.ALL_FLAGS & 0x200) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
