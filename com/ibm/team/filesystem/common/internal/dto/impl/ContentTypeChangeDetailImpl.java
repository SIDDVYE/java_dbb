// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.filesystem.common.IContentTypeChangeDetail;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import com.ibm.team.filesystem.common.internal.dto.ContentTypeChangeDetail;
import com.ibm.team.scm.common.internal.dto2.impl.ChangeDetailImpl;

public class ContentTypeChangeDetailImpl extends ChangeDetailImpl implements ContentTypeChangeDetail
{
    protected int ALL_FLAGS;
    protected static final String BEFORE_CONTENT_TYPE_EDEFAULT;
    protected String beforeContentType;
    protected static final int BEFORE_CONTENT_TYPE_ESETFLAG = 32;
    protected static final String AFTER_CONTENT_TYPE_EDEFAULT;
    protected String afterContentType;
    protected static final int AFTER_CONTENT_TYPE_ESETFLAG = 64;
    private static final int EOFFSET_CORRECTION;
    
    static {
        BEFORE_CONTENT_TYPE_EDEFAULT = null;
        AFTER_CONTENT_TYPE_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemDTOPackage.Literals.CONTENT_TYPE_CHANGE_DETAIL.getFeatureID((EStructuralFeature)FilesystemDTOPackage.Literals.CONTENT_TYPE_CHANGE_DETAIL__BEFORE_CONTENT_TYPE) - 4;
    }
    
    protected ContentTypeChangeDetailImpl() {
        this.ALL_FLAGS = 0;
        this.beforeContentType = ContentTypeChangeDetailImpl.BEFORE_CONTENT_TYPE_EDEFAULT;
        this.afterContentType = ContentTypeChangeDetailImpl.AFTER_CONTENT_TYPE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.CONTENT_TYPE_CHANGE_DETAIL;
    }
    
    public String getBeforeContentType() {
        return this.beforeContentType;
    }
    
    public void setBeforeContentType(final String newBeforeContentType) {
        final String oldBeforeContentType = this.beforeContentType;
        this.beforeContentType = newBeforeContentType;
        final boolean oldBeforeContentTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4 + ContentTypeChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldBeforeContentType, (Object)this.beforeContentType, !oldBeforeContentTypeESet));
        }
    }
    
    public void unsetBeforeContentType() {
        final String oldBeforeContentType = this.beforeContentType;
        final boolean oldBeforeContentTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeContentType = ContentTypeChangeDetailImpl.BEFORE_CONTENT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4 + ContentTypeChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldBeforeContentType, (Object)ContentTypeChangeDetailImpl.BEFORE_CONTENT_TYPE_EDEFAULT, oldBeforeContentTypeESet));
        }
    }
    
    public boolean isSetBeforeContentType() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getAfterContentType() {
        return this.afterContentType;
    }
    
    public void setAfterContentType(final String newAfterContentType) {
        final String oldAfterContentType = this.afterContentType;
        this.afterContentType = newAfterContentType;
        final boolean oldAfterContentTypeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5 + ContentTypeChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldAfterContentType, (Object)this.afterContentType, !oldAfterContentTypeESet));
        }
    }
    
    public void unsetAfterContentType() {
        final String oldAfterContentType = this.afterContentType;
        final boolean oldAfterContentTypeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterContentType = ContentTypeChangeDetailImpl.AFTER_CONTENT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5 + ContentTypeChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldAfterContentType, (Object)ContentTypeChangeDetailImpl.AFTER_CONTENT_TYPE_EDEFAULT, oldAfterContentTypeESet));
        }
    }
    
    public boolean isSetAfterContentType() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - ContentTypeChangeDetailImpl.EOFFSET_CORRECTION) {
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
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - ContentTypeChangeDetailImpl.EOFFSET_CORRECTION) {
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
    
    public void eUnset(final int featureID) {
        switch (featureID - ContentTypeChangeDetailImpl.EOFFSET_CORRECTION) {
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
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - ContentTypeChangeDetailImpl.EOFFSET_CORRECTION) {
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
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == IContentTypeChangeDetail.class) {
            return -1;
        }
        if (baseClass != ContentTypeChangeDetail.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - ContentTypeChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return 4 + ContentTypeChangeDetailImpl.EOFFSET_CORRECTION;
            }
            case 5: {
                return 5 + ContentTypeChangeDetailImpl.EOFFSET_CORRECTION;
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
    
    public String getBeforeType() {
        return this.getBeforeContentType();
    }
    
    public String getAfterType() {
        return this.getAfterContentType();
    }
}
