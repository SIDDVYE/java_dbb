// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ContributorNameDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ContributorNameDTOImpl extends EObjectImpl implements ContributorNameDTO
{
    protected int ALL_FLAGS;
    protected static final String CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String contributorItemId;
    protected static final int CONTRIBUTOR_ITEM_ID_ESETFLAG = 1;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 2;
    
    static {
        CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        NAME_EDEFAULT = null;
    }
    
    protected ContributorNameDTOImpl() {
        this.ALL_FLAGS = 0;
        this.contributorItemId = ContributorNameDTOImpl.CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.name = ContributorNameDTOImpl.NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOlocksPackage.Literals.CONTRIBUTOR_NAME_DTO;
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
        this.contributorItemId = ContributorNameDTOImpl.CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldContributorItemId, (Object)ContributorNameDTOImpl.CONTRIBUTOR_ITEM_ID_EDEFAULT, oldContributorItemIdESet));
        }
    }
    
    public boolean isSetContributorItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.name = ContributorNameDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldName, (Object)ContributorNameDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getContributorItemId();
            }
            case 1: {
                return this.getName();
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
                this.setName((String)newValue);
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
                this.unsetName();
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
                return this.isSetName();
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
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
