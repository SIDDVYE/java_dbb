// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.EncodingChangeDetailDTO;

public class EncodingChangeDetailDTOImpl extends ChangeDetailDTOImpl implements EncodingChangeDetailDTO
{
    protected static final String BEFORE_CHARACTER_ENCODING_EDEFAULT;
    protected String beforeCharacterEncoding;
    protected static final int BEFORE_CHARACTER_ENCODING_ESETFLAG = 32;
    protected static final String AFTER_CHARACTER_ENCODING_EDEFAULT;
    protected String afterCharacterEncoding;
    protected static final int AFTER_CHARACTER_ENCODING_ESETFLAG = 64;
    
    static {
        BEFORE_CHARACTER_ENCODING_EDEFAULT = null;
        AFTER_CHARACTER_ENCODING_EDEFAULT = null;
    }
    
    protected EncodingChangeDetailDTOImpl() {
        this.beforeCharacterEncoding = EncodingChangeDetailDTOImpl.BEFORE_CHARACTER_ENCODING_EDEFAULT;
        this.afterCharacterEncoding = EncodingChangeDetailDTOImpl.AFTER_CHARACTER_ENCODING_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.ENCODING_CHANGE_DETAIL_DTO;
    }
    
    @Override
    public String getBeforeCharacterEncoding() {
        return this.beforeCharacterEncoding;
    }
    
    @Override
    public void setBeforeCharacterEncoding(final String newBeforeCharacterEncoding) {
        final String oldBeforeCharacterEncoding = this.beforeCharacterEncoding;
        this.beforeCharacterEncoding = newBeforeCharacterEncoding;
        final boolean oldBeforeCharacterEncodingESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldBeforeCharacterEncoding, (Object)this.beforeCharacterEncoding, !oldBeforeCharacterEncodingESet));
        }
    }
    
    @Override
    public void unsetBeforeCharacterEncoding() {
        final String oldBeforeCharacterEncoding = this.beforeCharacterEncoding;
        final boolean oldBeforeCharacterEncodingESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeCharacterEncoding = EncodingChangeDetailDTOImpl.BEFORE_CHARACTER_ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldBeforeCharacterEncoding, (Object)EncodingChangeDetailDTOImpl.BEFORE_CHARACTER_ENCODING_EDEFAULT, oldBeforeCharacterEncodingESet));
        }
    }
    
    @Override
    public boolean isSetBeforeCharacterEncoding() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getAfterCharacterEncoding() {
        return this.afterCharacterEncoding;
    }
    
    @Override
    public void setAfterCharacterEncoding(final String newAfterCharacterEncoding) {
        final String oldAfterCharacterEncoding = this.afterCharacterEncoding;
        this.afterCharacterEncoding = newAfterCharacterEncoding;
        final boolean oldAfterCharacterEncodingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldAfterCharacterEncoding, (Object)this.afterCharacterEncoding, !oldAfterCharacterEncodingESet));
        }
    }
    
    @Override
    public void unsetAfterCharacterEncoding() {
        final String oldAfterCharacterEncoding = this.afterCharacterEncoding;
        final boolean oldAfterCharacterEncodingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterCharacterEncoding = EncodingChangeDetailDTOImpl.AFTER_CHARACTER_ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldAfterCharacterEncoding, (Object)EncodingChangeDetailDTOImpl.AFTER_CHARACTER_ENCODING_EDEFAULT, oldAfterCharacterEncodingESet));
        }
    }
    
    @Override
    public boolean isSetAfterCharacterEncoding() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
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
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
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
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
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
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
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
    
    @Override
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
