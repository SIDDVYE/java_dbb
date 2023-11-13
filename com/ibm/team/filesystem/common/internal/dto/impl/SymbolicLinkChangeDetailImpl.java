// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.filesystem.common.ISymbolicLinkChangeDetail;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import com.ibm.team.filesystem.common.internal.dto.SymbolicLinkChangeDetail;
import com.ibm.team.scm.common.internal.dto2.impl.ChangeDetailImpl;

public class SymbolicLinkChangeDetailImpl extends ChangeDetailImpl implements SymbolicLinkChangeDetail
{
    protected int ALL_FLAGS;
    protected static final String BEFORE_TARGET_EDEFAULT = "";
    protected String beforeTarget;
    protected static final int BEFORE_TARGET_ESETFLAG = 32;
    protected static final String AFTER_TARGET_EDEFAULT = "";
    protected String afterTarget;
    protected static final int AFTER_TARGET_ESETFLAG = 64;
    protected static final boolean BEFORE_DIRECTORY_EDEFAULT = false;
    protected static final int BEFORE_DIRECTORY_EFLAG = 128;
    protected static final int BEFORE_DIRECTORY_ESETFLAG = 256;
    protected static final boolean AFTER_DIRECTORY_EDEFAULT = false;
    protected static final int AFTER_DIRECTORY_EFLAG = 512;
    protected static final int AFTER_DIRECTORY_ESETFLAG = 1024;
    private static final int EOFFSET_CORRECTION;
    
    static {
        EOFFSET_CORRECTION = FilesystemDTOPackage.Literals.SYMBOLIC_LINK_CHANGE_DETAIL.getFeatureID((EStructuralFeature)FilesystemDTOPackage.Literals.SYMBOLIC_LINK_CHANGE_DETAIL__BEFORE_TARGET) - 4;
    }
    
    protected SymbolicLinkChangeDetailImpl() {
        this.ALL_FLAGS = 0;
        this.beforeTarget = "";
        this.afterTarget = "";
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.SYMBOLIC_LINK_CHANGE_DETAIL;
    }
    
    public String getBeforeTarget() {
        return this.beforeTarget;
    }
    
    public void setBeforeTarget(final String newBeforeTarget) {
        final String oldBeforeTarget = this.beforeTarget;
        this.beforeTarget = newBeforeTarget;
        final boolean oldBeforeTargetESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldBeforeTarget, (Object)this.beforeTarget, !oldBeforeTargetESet));
        }
    }
    
    public void unsetBeforeTarget() {
        final String oldBeforeTarget = this.beforeTarget;
        final boolean oldBeforeTargetESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeTarget = "";
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldBeforeTarget, (Object)"", oldBeforeTargetESet));
        }
    }
    
    public boolean isSetBeforeTarget() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getAfterTarget() {
        return this.afterTarget;
    }
    
    public void setAfterTarget(final String newAfterTarget) {
        final String oldAfterTarget = this.afterTarget;
        this.afterTarget = newAfterTarget;
        final boolean oldAfterTargetESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldAfterTarget, (Object)this.afterTarget, !oldAfterTargetESet));
        }
    }
    
    public void unsetAfterTarget() {
        final String oldAfterTarget = this.afterTarget;
        final boolean oldAfterTargetESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterTarget = "";
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldAfterTarget, (Object)"", oldAfterTargetESet));
        }
    }
    
    public boolean isSetAfterTarget() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public boolean isBeforeDirectory() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION, oldBeforeDirectory, newBeforeDirectory, !oldBeforeDirectoryESet));
        }
    }
    
    public void unsetBeforeDirectory() {
        final boolean oldBeforeDirectory = (this.ALL_FLAGS & 0x80) != 0x0;
        final boolean oldBeforeDirectoryESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION, oldBeforeDirectory, false, oldBeforeDirectoryESet));
        }
    }
    
    public boolean isSetBeforeDirectory() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public boolean isAfterDirectory() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION, oldAfterDirectory, newAfterDirectory, !oldAfterDirectoryESet));
        }
    }
    
    public void unsetAfterDirectory() {
        final boolean oldAfterDirectory = (this.ALL_FLAGS & 0x200) != 0x0;
        final boolean oldAfterDirectoryESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION, oldAfterDirectory, false, oldAfterDirectoryESet));
        }
    }
    
    public boolean isSetAfterDirectory() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION) {
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
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION) {
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
    
    public void eUnset(final int featureID) {
        switch (featureID - SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION) {
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
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION) {
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
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == ISymbolicLinkChangeDetail.class) {
            return -1;
        }
        if (baseClass != SymbolicLinkChangeDetail.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return 4 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION;
            }
            case 5: {
                return 5 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION;
            }
            case 6: {
                return 6 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION;
            }
            case 7: {
                return 7 + SymbolicLinkChangeDetailImpl.EOFFSET_CORRECTION;
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
