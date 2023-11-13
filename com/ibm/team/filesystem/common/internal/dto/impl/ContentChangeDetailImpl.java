// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.scm.common.ContentHash;
import com.ibm.team.filesystem.common.IContentChangeDetail;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import com.ibm.team.filesystem.common.internal.dto.ContentChangeDetail;
import com.ibm.team.scm.common.internal.dto2.impl.ChangeDetailImpl;

public class ContentChangeDetailImpl extends ChangeDetailImpl implements ContentChangeDetail
{
    protected int ALL_FLAGS;
    protected static final String BEFORE_HASH_STRING_EDEFAULT;
    protected String beforeHashString;
    protected static final int BEFORE_HASH_STRING_ESETFLAG = 32;
    protected static final String AFTER_HASH_STRING_EDEFAULT;
    protected String afterHashString;
    protected static final int AFTER_HASH_STRING_ESETFLAG = 64;
    private static final int EOFFSET_CORRECTION;
    
    static {
        BEFORE_HASH_STRING_EDEFAULT = null;
        AFTER_HASH_STRING_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemDTOPackage.Literals.CONTENT_CHANGE_DETAIL.getFeatureID((EStructuralFeature)FilesystemDTOPackage.Literals.CONTENT_CHANGE_DETAIL__BEFORE_HASH_STRING) - 4;
    }
    
    protected ContentChangeDetailImpl() {
        this.ALL_FLAGS = 0;
        this.beforeHashString = ContentChangeDetailImpl.BEFORE_HASH_STRING_EDEFAULT;
        this.afterHashString = ContentChangeDetailImpl.AFTER_HASH_STRING_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.CONTENT_CHANGE_DETAIL;
    }
    
    public String getBeforeHashString() {
        return this.beforeHashString;
    }
    
    public void setBeforeHashString(final String newBeforeHashString) {
        final String oldBeforeHashString = this.beforeHashString;
        this.beforeHashString = newBeforeHashString;
        final boolean oldBeforeHashStringESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4 + ContentChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldBeforeHashString, (Object)this.beforeHashString, !oldBeforeHashStringESet));
        }
    }
    
    public void unsetBeforeHashString() {
        final String oldBeforeHashString = this.beforeHashString;
        final boolean oldBeforeHashStringESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeHashString = ContentChangeDetailImpl.BEFORE_HASH_STRING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4 + ContentChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldBeforeHashString, (Object)ContentChangeDetailImpl.BEFORE_HASH_STRING_EDEFAULT, oldBeforeHashStringESet));
        }
    }
    
    public boolean isSetBeforeHashString() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getAfterHashString() {
        return this.afterHashString;
    }
    
    public void setAfterHashString(final String newAfterHashString) {
        final String oldAfterHashString = this.afterHashString;
        this.afterHashString = newAfterHashString;
        final boolean oldAfterHashStringESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5 + ContentChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldAfterHashString, (Object)this.afterHashString, !oldAfterHashStringESet));
        }
    }
    
    public void unsetAfterHashString() {
        final String oldAfterHashString = this.afterHashString;
        final boolean oldAfterHashStringESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterHashString = ContentChangeDetailImpl.AFTER_HASH_STRING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5 + ContentChangeDetailImpl.EOFFSET_CORRECTION, (Object)oldAfterHashString, (Object)ContentChangeDetailImpl.AFTER_HASH_STRING_EDEFAULT, oldAfterHashStringESet));
        }
    }
    
    public boolean isSetAfterHashString() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - ContentChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return this.getBeforeHashString();
            }
            case 5: {
                return this.getAfterHashString();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - ContentChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                this.setBeforeHashString((String)newValue);
            }
            case 5: {
                this.setAfterHashString((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - ContentChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                this.unsetBeforeHashString();
            }
            case 5: {
                this.unsetAfterHashString();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - ContentChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return this.isSetBeforeHashString();
            }
            case 5: {
                return this.isSetAfterHashString();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == IContentChangeDetail.class) {
            return -1;
        }
        if (baseClass != ContentChangeDetail.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - ContentChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return 4 + ContentChangeDetailImpl.EOFFSET_CORRECTION;
            }
            case 5: {
                return 5 + ContentChangeDetailImpl.EOFFSET_CORRECTION;
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
        result.append(" (beforeHashString: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.beforeHashString);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterHashString: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.afterHashString);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    public ContentHash getBeforeContentHash() {
        return ContentHash.valueOf(this.getBeforeHashString());
    }
    
    public ContentHash getAfterContentHash() {
        return ContentHash.valueOf(this.getAfterHashString());
    }
}
