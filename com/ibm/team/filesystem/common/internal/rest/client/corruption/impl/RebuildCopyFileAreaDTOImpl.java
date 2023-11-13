// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.corruption.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.FilesystemRestClientDTOcorruptionPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.RebuildCopyFileAreaDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class RebuildCopyFileAreaDTOImpl extends EObjectImpl implements RebuildCopyFileAreaDTO
{
    protected int ALL_FLAGS;
    protected static final boolean NO_DESCRIPTORS_FOUND_EDEFAULT = false;
    protected static final int NO_DESCRIPTORS_FOUND_EFLAG = 1;
    protected static final int NO_DESCRIPTORS_FOUND_ESETFLAG = 2;
    protected static final boolean IGNORED_ERRORS_EDEFAULT = false;
    protected static final int IGNORED_ERRORS_EFLAG = 4;
    protected static final int IGNORED_ERRORS_ESETFLAG = 8;
    
    protected RebuildCopyFileAreaDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorruptionPackage.Literals.REBUILD_COPY_FILE_AREA_DTO;
    }
    
    public boolean isNoDescriptorsFound() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setNoDescriptorsFound(final boolean newNoDescriptorsFound) {
        final boolean oldNoDescriptorsFound = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newNoDescriptorsFound) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldNoDescriptorsFoundESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldNoDescriptorsFound, newNoDescriptorsFound, !oldNoDescriptorsFoundESet));
        }
    }
    
    public void unsetNoDescriptorsFound() {
        final boolean oldNoDescriptorsFound = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldNoDescriptorsFoundESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldNoDescriptorsFound, false, oldNoDescriptorsFoundESet));
        }
    }
    
    public boolean isSetNoDescriptorsFound() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public boolean isIgnoredErrors() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setIgnoredErrors(final boolean newIgnoredErrors) {
        final boolean oldIgnoredErrors = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newIgnoredErrors) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldIgnoredErrorsESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldIgnoredErrors, newIgnoredErrors, !oldIgnoredErrorsESet));
        }
    }
    
    public void unsetIgnoredErrors() {
        final boolean oldIgnoredErrors = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldIgnoredErrorsESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldIgnoredErrors, false, oldIgnoredErrorsESet));
        }
    }
    
    public boolean isSetIgnoredErrors() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isNoDescriptorsFound() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.isIgnoredErrors() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setNoDescriptorsFound((boolean)newValue);
            }
            case 1: {
                this.setIgnoredErrors((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetNoDescriptorsFound();
            }
            case 1: {
                this.unsetIgnoredErrors();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetNoDescriptorsFound();
            }
            case 1: {
                return this.isSetIgnoredErrors();
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
        result.append(" (noDescriptorsFound: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", ignoredErrors: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
