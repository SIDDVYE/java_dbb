// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.CreateResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CreateResultDTOImpl extends EObjectImpl implements CreateResultDTO
{
    protected int ALL_FLAGS;
    protected static final String CHANGE_SET_ITEM_ID_EDEFAULT;
    protected String changeSetItemId;
    protected static final int CHANGE_SET_ITEM_ID_ESETFLAG = 1;
    
    static {
        CHANGE_SET_ITEM_ID_EDEFAULT = null;
    }
    
    protected CreateResultDTOImpl() {
        this.ALL_FLAGS = 0;
        this.changeSetItemId = CreateResultDTOImpl.CHANGE_SET_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.CREATE_RESULT_DTO;
    }
    
    public String getChangeSetItemId() {
        return this.changeSetItemId;
    }
    
    public void setChangeSetItemId(final String newChangeSetItemId) {
        final String oldChangeSetItemId = this.changeSetItemId;
        this.changeSetItemId = newChangeSetItemId;
        final boolean oldChangeSetItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldChangeSetItemId, (Object)this.changeSetItemId, !oldChangeSetItemIdESet));
        }
    }
    
    public void unsetChangeSetItemId() {
        final String oldChangeSetItemId = this.changeSetItemId;
        final boolean oldChangeSetItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.changeSetItemId = CreateResultDTOImpl.CHANGE_SET_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldChangeSetItemId, (Object)CreateResultDTOImpl.CHANGE_SET_ITEM_ID_EDEFAULT, oldChangeSetItemIdESet));
        }
    }
    
    public boolean isSetChangeSetItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getChangeSetItemId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setChangeSetItemId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetChangeSetItemId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetChangeSetItemId();
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
        result.append(" (changeSetItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.changeSetItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
