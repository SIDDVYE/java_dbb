// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rich.rest.dto.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.RichRestDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.ContentStatusDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ContentStatusDTOImpl extends EObjectImpl implements ContentStatusDTO
{
    protected int ALL_FLAGS;
    protected static final String STATUS_EDEFAULT;
    protected String status;
    protected static final int STATUS_ESETFLAG = 1;
    protected static final String DELETED_BY_CONTRIBUTOR_ID_EDEFAULT;
    protected String deletedByContributorId;
    protected static final int DELETED_BY_CONTRIBUTOR_ID_ESETFLAG = 2;
    protected static final long DELETED_ON_EDEFAULT = 0L;
    protected long deletedOn;
    protected static final int DELETED_ON_ESETFLAG = 4;
    
    static {
        STATUS_EDEFAULT = null;
        DELETED_BY_CONTRIBUTOR_ID_EDEFAULT = null;
    }
    
    protected ContentStatusDTOImpl() {
        this.ALL_FLAGS = 0;
        this.status = ContentStatusDTOImpl.STATUS_EDEFAULT;
        this.deletedByContributorId = ContentStatusDTOImpl.DELETED_BY_CONTRIBUTOR_ID_EDEFAULT;
        this.deletedOn = 0L;
    }
    
    protected EClass eStaticClass() {
        return RichRestDTOPackage.Literals.CONTENT_STATUS_DTO;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(final String newStatus) {
        final String oldStatus = this.status;
        this.status = newStatus;
        final boolean oldStatusESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldStatus, (Object)this.status, !oldStatusESet));
        }
    }
    
    public void unsetStatus() {
        final String oldStatus = this.status;
        final boolean oldStatusESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.status = ContentStatusDTOImpl.STATUS_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldStatus, (Object)ContentStatusDTOImpl.STATUS_EDEFAULT, oldStatusESet));
        }
    }
    
    public boolean isSetStatus() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getDeletedByContributorId() {
        return this.deletedByContributorId;
    }
    
    public void setDeletedByContributorId(final String newDeletedByContributorId) {
        final String oldDeletedByContributorId = this.deletedByContributorId;
        this.deletedByContributorId = newDeletedByContributorId;
        final boolean oldDeletedByContributorIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldDeletedByContributorId, (Object)this.deletedByContributorId, !oldDeletedByContributorIdESet));
        }
    }
    
    public void unsetDeletedByContributorId() {
        final String oldDeletedByContributorId = this.deletedByContributorId;
        final boolean oldDeletedByContributorIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.deletedByContributorId = ContentStatusDTOImpl.DELETED_BY_CONTRIBUTOR_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldDeletedByContributorId, (Object)ContentStatusDTOImpl.DELETED_BY_CONTRIBUTOR_ID_EDEFAULT, oldDeletedByContributorIdESet));
        }
    }
    
    public boolean isSetDeletedByContributorId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public long getDeletedOn() {
        return this.deletedOn;
    }
    
    public void setDeletedOn(final long newDeletedOn) {
        final long oldDeletedOn = this.deletedOn;
        this.deletedOn = newDeletedOn;
        final boolean oldDeletedOnESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldDeletedOn, this.deletedOn, !oldDeletedOnESet));
        }
    }
    
    public void unsetDeletedOn() {
        final long oldDeletedOn = this.deletedOn;
        final boolean oldDeletedOnESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.deletedOn = 0L;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldDeletedOn, 0L, oldDeletedOnESet));
        }
    }
    
    public boolean isSetDeletedOn() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getStatus();
            }
            case 1: {
                return this.getDeletedByContributorId();
            }
            case 2: {
                return new Long(this.getDeletedOn());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setStatus((String)newValue);
            }
            case 1: {
                this.setDeletedByContributorId((String)newValue);
            }
            case 2: {
                this.setDeletedOn((long)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetStatus();
            }
            case 1: {
                this.unsetDeletedByContributorId();
            }
            case 2: {
                this.unsetDeletedOn();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetStatus();
            }
            case 1: {
                return this.isSetDeletedByContributorId();
            }
            case 2: {
                return this.isSetDeletedOn();
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
        result.append(" (status: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.status);
        }
        else {
            result.append("<unset>");
        }
        result.append(", deletedByContributorId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.deletedByContributorId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", deletedOn: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.deletedOn);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
