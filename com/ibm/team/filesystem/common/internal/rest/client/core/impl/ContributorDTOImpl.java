// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ContributorDTOImpl extends EObjectImpl implements ContributorDTO
{
    protected int ALL_FLAGS;
    protected static final String CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String contributorItemId;
    protected static final int CONTRIBUTOR_ITEM_ID_ESETFLAG = 1;
    protected static final String EMAIL_ADDRESS_EDEFAULT;
    protected String emailAddress;
    protected static final int EMAIL_ADDRESS_ESETFLAG = 2;
    protected static final String FULL_NAME_EDEFAULT;
    protected String fullName;
    protected static final int FULL_NAME_ESETFLAG = 4;
    protected static final String USER_ID_EDEFAULT;
    protected String userId;
    protected static final int USER_ID_ESETFLAG = 8;
    
    static {
        CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        EMAIL_ADDRESS_EDEFAULT = null;
        FULL_NAME_EDEFAULT = null;
        USER_ID_EDEFAULT = null;
    }
    
    protected ContributorDTOImpl() {
        this.ALL_FLAGS = 0;
        this.contributorItemId = ContributorDTOImpl.CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.emailAddress = ContributorDTOImpl.EMAIL_ADDRESS_EDEFAULT;
        this.fullName = ContributorDTOImpl.FULL_NAME_EDEFAULT;
        this.userId = ContributorDTOImpl.USER_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.CONTRIBUTOR_DTO;
    }
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(final String newUserId) {
        final String oldUserId = this.userId;
        this.userId = newUserId;
        final boolean oldUserIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldUserId, (Object)this.userId, !oldUserIdESet));
        }
    }
    
    public void unsetUserId() {
        final String oldUserId = this.userId;
        final boolean oldUserIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.userId = ContributorDTOImpl.USER_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldUserId, (Object)ContributorDTOImpl.USER_ID_EDEFAULT, oldUserIdESet));
        }
    }
    
    public boolean isSetUserId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(final String newFullName) {
        final String oldFullName = this.fullName;
        this.fullName = newFullName;
        final boolean oldFullNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldFullName, (Object)this.fullName, !oldFullNameESet));
        }
    }
    
    public void unsetFullName() {
        final String oldFullName = this.fullName;
        final boolean oldFullNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.fullName = ContributorDTOImpl.FULL_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldFullName, (Object)ContributorDTOImpl.FULL_NAME_EDEFAULT, oldFullNameESet));
        }
    }
    
    public boolean isSetFullName() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(final String newEmailAddress) {
        final String oldEmailAddress = this.emailAddress;
        this.emailAddress = newEmailAddress;
        final boolean oldEmailAddressESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldEmailAddress, (Object)this.emailAddress, !oldEmailAddressESet));
        }
    }
    
    public void unsetEmailAddress() {
        final String oldEmailAddress = this.emailAddress;
        final boolean oldEmailAddressESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.emailAddress = ContributorDTOImpl.EMAIL_ADDRESS_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldEmailAddress, (Object)ContributorDTOImpl.EMAIL_ADDRESS_EDEFAULT, oldEmailAddressESet));
        }
    }
    
    public boolean isSetEmailAddress() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getContributorItemId() {
        return this.contributorItemId;
    }
    
    public void setContributorItemId(final String newContributorItemId) {
        final String oldContributorItemId = this.contributorItemId;
        this.contributorItemId = newContributorItemId;
        final boolean oldContributorItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldContributorItemId, (Object)this.contributorItemId, !oldContributorItemIdESet));
        }
    }
    
    public void unsetContributorItemId() {
        final String oldContributorItemId = this.contributorItemId;
        final boolean oldContributorItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.contributorItemId = ContributorDTOImpl.CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldContributorItemId, (Object)ContributorDTOImpl.CONTRIBUTOR_ITEM_ID_EDEFAULT, oldContributorItemIdESet));
        }
    }
    
    public boolean isSetContributorItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getContributorItemId();
            }
            case 1: {
                return this.getEmailAddress();
            }
            case 2: {
                return this.getFullName();
            }
            case 3: {
                return this.getUserId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setContributorItemId((String)newValue);
            }
            case 1: {
                this.setEmailAddress((String)newValue);
            }
            case 2: {
                this.setFullName((String)newValue);
            }
            case 3: {
                this.setUserId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetContributorItemId();
            }
            case 1: {
                this.unsetEmailAddress();
            }
            case 2: {
                this.unsetFullName();
            }
            case 3: {
                this.unsetUserId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetContributorItemId();
            }
            case 1: {
                return this.isSetEmailAddress();
            }
            case 2: {
                return this.isSetFullName();
            }
            case 3: {
                return this.isSetUserId();
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
        result.append(" (contributorItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.contributorItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", emailAddress: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.emailAddress);
        }
        else {
            result.append("<unset>");
        }
        result.append(", fullName: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.fullName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", userId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.userId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
