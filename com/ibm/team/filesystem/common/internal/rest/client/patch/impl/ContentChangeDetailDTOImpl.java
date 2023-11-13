// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ContentChangeDetailDTO;

public class ContentChangeDetailDTOImpl extends ChangeDetailDTOImpl implements ContentChangeDetailDTO
{
    protected static final String BEFORE_CONTENT_HASH_EDEFAULT;
    protected String beforeContentHash;
    protected static final int BEFORE_CONTENT_HASH_ESETFLAG = 32;
    protected static final String AFTER_CONTENT_HASH_EDEFAULT;
    protected String afterContentHash;
    protected static final int AFTER_CONTENT_HASH_ESETFLAG = 64;
    
    static {
        BEFORE_CONTENT_HASH_EDEFAULT = null;
        AFTER_CONTENT_HASH_EDEFAULT = null;
    }
    
    protected ContentChangeDetailDTOImpl() {
        this.beforeContentHash = ContentChangeDetailDTOImpl.BEFORE_CONTENT_HASH_EDEFAULT;
        this.afterContentHash = ContentChangeDetailDTOImpl.AFTER_CONTENT_HASH_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.CONTENT_CHANGE_DETAIL_DTO;
    }
    
    @Override
    public String getBeforeContentHash() {
        return this.beforeContentHash;
    }
    
    @Override
    public void setBeforeContentHash(final String newBeforeContentHash) {
        final String oldBeforeContentHash = this.beforeContentHash;
        this.beforeContentHash = newBeforeContentHash;
        final boolean oldBeforeContentHashESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldBeforeContentHash, (Object)this.beforeContentHash, !oldBeforeContentHashESet));
        }
    }
    
    @Override
    public void unsetBeforeContentHash() {
        final String oldBeforeContentHash = this.beforeContentHash;
        final boolean oldBeforeContentHashESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeContentHash = ContentChangeDetailDTOImpl.BEFORE_CONTENT_HASH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldBeforeContentHash, (Object)ContentChangeDetailDTOImpl.BEFORE_CONTENT_HASH_EDEFAULT, oldBeforeContentHashESet));
        }
    }
    
    @Override
    public boolean isSetBeforeContentHash() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getAfterContentHash() {
        return this.afterContentHash;
    }
    
    @Override
    public void setAfterContentHash(final String newAfterContentHash) {
        final String oldAfterContentHash = this.afterContentHash;
        this.afterContentHash = newAfterContentHash;
        final boolean oldAfterContentHashESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldAfterContentHash, (Object)this.afterContentHash, !oldAfterContentHashESet));
        }
    }
    
    @Override
    public void unsetAfterContentHash() {
        final String oldAfterContentHash = this.afterContentHash;
        final boolean oldAfterContentHashESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterContentHash = ContentChangeDetailDTOImpl.AFTER_CONTENT_HASH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldAfterContentHash, (Object)ContentChangeDetailDTOImpl.AFTER_CONTENT_HASH_EDEFAULT, oldAfterContentHashESet));
        }
    }
    
    @Override
    public boolean isSetAfterContentHash() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getBeforeContentHash();
            }
            case 5: {
                return this.getAfterContentHash();
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
                this.setBeforeContentHash((String)newValue);
            }
            case 5: {
                this.setAfterContentHash((String)newValue);
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
                this.unsetBeforeContentHash();
            }
            case 5: {
                this.unsetAfterContentHash();
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
                return this.isSetBeforeContentHash();
            }
            case 5: {
                return this.isSetAfterContentHash();
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
        result.append(" (beforeContentHash: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.beforeContentHash);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterContentHash: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.afterContentHash);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
