// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogVersionableEntry2DTO;

public class ChangeLogVersionableEntry2DTOImpl extends ChangeLogVersionableEntryDTOImpl implements ChangeLogVersionableEntry2DTO
{
    protected static final String SHORT_VERSION_ID_EDEFAULT;
    protected String shortVersionId;
    protected static final int SHORT_VERSION_ID_ESETFLAG = 32;
    protected static final String LONG_VERSION_ID_EDEFAULT;
    protected String longVersionId;
    protected static final int LONG_VERSION_ID_ESETFLAG = 64;
    
    static {
        SHORT_VERSION_ID_EDEFAULT = null;
        LONG_VERSION_ID_EDEFAULT = null;
    }
    
    protected ChangeLogVersionableEntry2DTOImpl() {
        this.shortVersionId = ChangeLogVersionableEntry2DTOImpl.SHORT_VERSION_ID_EDEFAULT;
        this.longVersionId = ChangeLogVersionableEntry2DTOImpl.LONG_VERSION_ID_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_VERSIONABLE_ENTRY2_DTO;
    }
    
    @Override
    public String getShortVersionId() {
        return this.shortVersionId;
    }
    
    @Override
    public void setShortVersionId(final String newShortVersionId) {
        final String oldShortVersionId = this.shortVersionId;
        this.shortVersionId = newShortVersionId;
        final boolean oldShortVersionIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldShortVersionId, (Object)this.shortVersionId, !oldShortVersionIdESet));
        }
    }
    
    @Override
    public void unsetShortVersionId() {
        final String oldShortVersionId = this.shortVersionId;
        final boolean oldShortVersionIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.shortVersionId = ChangeLogVersionableEntry2DTOImpl.SHORT_VERSION_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldShortVersionId, (Object)ChangeLogVersionableEntry2DTOImpl.SHORT_VERSION_ID_EDEFAULT, oldShortVersionIdESet));
        }
    }
    
    @Override
    public boolean isSetShortVersionId() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getLongVersionId() {
        return this.longVersionId;
    }
    
    @Override
    public void setLongVersionId(final String newLongVersionId) {
        final String oldLongVersionId = this.longVersionId;
        this.longVersionId = newLongVersionId;
        final boolean oldLongVersionIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldLongVersionId, (Object)this.longVersionId, !oldLongVersionIdESet));
        }
    }
    
    @Override
    public void unsetLongVersionId() {
        final String oldLongVersionId = this.longVersionId;
        final boolean oldLongVersionIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.longVersionId = ChangeLogVersionableEntry2DTOImpl.LONG_VERSION_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldLongVersionId, (Object)ChangeLogVersionableEntry2DTOImpl.LONG_VERSION_ID_EDEFAULT, oldLongVersionIdESet));
        }
    }
    
    @Override
    public boolean isSetLongVersionId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 6: {
                return this.getShortVersionId();
            }
            case 7: {
                return this.getLongVersionId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 6: {
                this.setShortVersionId((String)newValue);
            }
            case 7: {
                this.setLongVersionId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 6: {
                this.unsetShortVersionId();
            }
            case 7: {
                this.unsetLongVersionId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 6: {
                return this.isSetShortVersionId();
            }
            case 7: {
                return this.isSetLongVersionId();
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
        result.append(" (shortVersionId: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.shortVersionId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", longVersionId: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.longVersionId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
