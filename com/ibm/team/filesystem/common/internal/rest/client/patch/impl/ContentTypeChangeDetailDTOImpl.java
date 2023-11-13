// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ContentTypeChangeDetailDTO;

public class ContentTypeChangeDetailDTOImpl extends ChangeDetailDTOImpl implements ContentTypeChangeDetailDTO
{
    protected static final String BEFORE_CONTENT_TYPE_EDEFAULT;
    protected String beforeContentType;
    protected static final int BEFORE_CONTENT_TYPE_ESETFLAG = 32;
    protected static final String AFTER_CONTENT_TYPE_EDEFAULT;
    protected String afterContentType;
    protected static final int AFTER_CONTENT_TYPE_ESETFLAG = 64;
    
    static {
        BEFORE_CONTENT_TYPE_EDEFAULT = null;
        AFTER_CONTENT_TYPE_EDEFAULT = null;
    }
    
    protected ContentTypeChangeDetailDTOImpl() {
        this.beforeContentType = ContentTypeChangeDetailDTOImpl.BEFORE_CONTENT_TYPE_EDEFAULT;
        this.afterContentType = ContentTypeChangeDetailDTOImpl.AFTER_CONTENT_TYPE_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.CONTENT_TYPE_CHANGE_DETAIL_DTO;
    }
    
    @Override
    public String getBeforeContentType() {
        return this.beforeContentType;
    }
    
    @Override
    public void setBeforeContentType(final String newBeforeContentType) {
        final String oldBeforeContentType = this.beforeContentType;
        this.beforeContentType = newBeforeContentType;
        final boolean oldBeforeContentTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldBeforeContentType, (Object)this.beforeContentType, !oldBeforeContentTypeESet));
        }
    }
    
    @Override
    public void unsetBeforeContentType() {
        final String oldBeforeContentType = this.beforeContentType;
        final boolean oldBeforeContentTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeContentType = ContentTypeChangeDetailDTOImpl.BEFORE_CONTENT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldBeforeContentType, (Object)ContentTypeChangeDetailDTOImpl.BEFORE_CONTENT_TYPE_EDEFAULT, oldBeforeContentTypeESet));
        }
    }
    
    @Override
    public boolean isSetBeforeContentType() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getAfterContentType() {
        return this.afterContentType;
    }
    
    @Override
    public void setAfterContentType(final String newAfterContentType) {
        final String oldAfterContentType = this.afterContentType;
        this.afterContentType = newAfterContentType;
        final boolean oldAfterContentTypeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldAfterContentType, (Object)this.afterContentType, !oldAfterContentTypeESet));
        }
    }
    
    @Override
    public void unsetAfterContentType() {
        final String oldAfterContentType = this.afterContentType;
        final boolean oldAfterContentTypeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterContentType = ContentTypeChangeDetailDTOImpl.AFTER_CONTENT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldAfterContentType, (Object)ContentTypeChangeDetailDTOImpl.AFTER_CONTENT_TYPE_EDEFAULT, oldAfterContentTypeESet));
        }
    }
    
    @Override
    public boolean isSetAfterContentType() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getBeforeContentType();
            }
            case 5: {
                return this.getAfterContentType();
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
                this.setBeforeContentType((String)newValue);
            }
            case 5: {
                this.setAfterContentType((String)newValue);
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
                this.unsetBeforeContentType();
            }
            case 5: {
                this.unsetAfterContentType();
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
                return this.isSetBeforeContentType();
            }
            case 5: {
                return this.isSetAfterContentType();
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
        result.append(" (beforeContentType: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.beforeContentType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterContentType: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.afterContentType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
