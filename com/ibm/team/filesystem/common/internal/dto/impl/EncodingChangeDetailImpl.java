// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.filesystem.common.IEncodingChangeDetail;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import com.ibm.team.filesystem.common.internal.dto.EncodingChangeDetail;
import com.ibm.team.scm.common.internal.dto2.impl.ChangeDetailImpl;

public class EncodingChangeDetailImpl extends ChangeDetailImpl implements EncodingChangeDetail
{
    protected int ALL_FLAGS;
    protected static final String BEFORE_CHARACTER_ENCODING_EDEFAULT;
    protected String beforeCharacterEncoding;
    protected static final int BEFORE_CHARACTER_ENCODING_ESETFLAG = 32;
    protected static final String AFTER_CHARACTER_ENCODING_EDEFAULT;
    protected String afterCharacterEncoding;
    protected static final int AFTER_CHARACTER_ENCODING_ESETFLAG = 64;
    private static final int EOFFSET_CORRECTION;
    
    static {
        BEFORE_CHARACTER_ENCODING_EDEFAULT = null;
        AFTER_CHARACTER_ENCODING_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemDTOPackage.Literals.ENCODING_CHANGE_DETAIL.getFeatureID((EStructuralFeature)FilesystemDTOPackage.Literals.ENCODING_CHANGE_DETAIL__BEFORE_CHARACTER_ENCODING) - 4;
    }
    
    protected EncodingChangeDetailImpl() {
        this.ALL_FLAGS = 0;
        this.beforeCharacterEncoding = EncodingChangeDetailImpl.BEFORE_CHARACTER_ENCODING_EDEFAULT;
        this.afterCharacterEncoding = EncodingChangeDetailImpl.AFTER_CHARACTER_ENCODING_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.ENCODING_CHANGE_DETAIL;
    }
    
    public String getBeforeCharacterEncoding() {
        return this.beforeCharacterEncoding;
    }
    
    public void setBeforeCharacterEncoding(final String newBeforeCharacterEncoding) {
        final String oldBeforeCharacterEncoding = this.beforeCharacterEncoding;
        this.beforeCharacterEncoding = newBeforeCharacterEncoding;
        final boolean oldBeforeCharacterEncodingESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4 + EncodingChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldBeforeCharacterEncoding, (Object)this.beforeCharacterEncoding, !oldBeforeCharacterEncodingESet));
        }
    }
    
    public void unsetBeforeCharacterEncoding() {
        final String oldBeforeCharacterEncoding = this.beforeCharacterEncoding;
        final boolean oldBeforeCharacterEncodingESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeCharacterEncoding = EncodingChangeDetailImpl.BEFORE_CHARACTER_ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4 + EncodingChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldBeforeCharacterEncoding, (Object)EncodingChangeDetailImpl.BEFORE_CHARACTER_ENCODING_EDEFAULT, oldBeforeCharacterEncodingESet));
        }
    }
    
    public boolean isSetBeforeCharacterEncoding() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getAfterCharacterEncoding() {
        return this.afterCharacterEncoding;
    }
    
    public void setAfterCharacterEncoding(final String newAfterCharacterEncoding) {
        final String oldAfterCharacterEncoding = this.afterCharacterEncoding;
        this.afterCharacterEncoding = newAfterCharacterEncoding;
        final boolean oldAfterCharacterEncodingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5 + EncodingChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldAfterCharacterEncoding, (Object)this.afterCharacterEncoding, !oldAfterCharacterEncodingESet));
        }
    }
    
    public void unsetAfterCharacterEncoding() {
        final String oldAfterCharacterEncoding = this.afterCharacterEncoding;
        final boolean oldAfterCharacterEncodingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterCharacterEncoding = EncodingChangeDetailImpl.AFTER_CHARACTER_ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5 + EncodingChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldAfterCharacterEncoding, (Object)EncodingChangeDetailImpl.AFTER_CHARACTER_ENCODING_EDEFAULT, oldAfterCharacterEncodingESet));
        }
    }
    
    public boolean isSetAfterCharacterEncoding() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - EncodingChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return this.getBeforeCharacterEncoding();
            }
            case 5: {
                return this.getAfterCharacterEncoding();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - EncodingChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                this.setBeforeCharacterEncoding((String)newValue);
            }
            case 5: {
                this.setAfterCharacterEncoding((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - EncodingChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                this.unsetBeforeCharacterEncoding();
            }
            case 5: {
                this.unsetAfterCharacterEncoding();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - EncodingChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return this.isSetBeforeCharacterEncoding();
            }
            case 5: {
                return this.isSetAfterCharacterEncoding();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == IEncodingChangeDetail.class) {
            return -1;
        }
        if (baseClass != EncodingChangeDetail.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - EncodingChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return 4 + EncodingChangeDetailImpl.EOFFSET_CORRECTION;
            }
            case 5: {
                return 5 + EncodingChangeDetailImpl.EOFFSET_CORRECTION;
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
        result.append(" (beforeCharacterEncoding: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.beforeCharacterEncoding);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterCharacterEncoding: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.afterCharacterEncoding);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
