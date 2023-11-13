// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.MimeTypeErrorDTO;

public class MimeTypeErrorDTOImpl extends FileErrorDTOImpl implements MimeTypeErrorDTO
{
    protected static final String MIME_TYPE_EDEFAULT;
    protected String mimeType;
    protected static final int MIME_TYPE_ESETFLAG = 4;
    
    static {
        MIME_TYPE_EDEFAULT = null;
    }
    
    protected MimeTypeErrorDTOImpl() {
        this.mimeType = MimeTypeErrorDTOImpl.MIME_TYPE_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.MIME_TYPE_ERROR_DTO;
    }
    
    @Override
    public String getMimeType() {
        return this.mimeType;
    }
    
    @Override
    public void setMimeType(final String newMimeType) {
        final String oldMimeType = this.mimeType;
        this.mimeType = newMimeType;
        final boolean oldMimeTypeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldMimeType, (Object)this.mimeType, !oldMimeTypeESet));
        }
    }
    
    @Override
    public void unsetMimeType() {
        final String oldMimeType = this.mimeType;
        final boolean oldMimeTypeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.mimeType = MimeTypeErrorDTOImpl.MIME_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldMimeType, (Object)MimeTypeErrorDTOImpl.MIME_TYPE_EDEFAULT, oldMimeTypeESet));
        }
    }
    
    @Override
    public boolean isSetMimeType() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 2: {
                return this.getMimeType();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 2: {
                this.setMimeType((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 2: {
                this.unsetMimeType();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 2: {
                return this.isSetMimeType();
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
        result.append(" (mimeType: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.mimeType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
