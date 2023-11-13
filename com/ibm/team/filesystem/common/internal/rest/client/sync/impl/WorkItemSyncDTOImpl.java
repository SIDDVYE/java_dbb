// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.WorkItemSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class WorkItemSyncDTOImpl extends EObjectImpl implements WorkItemSyncDTO
{
    protected int ALL_FLAGS;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 1;
    protected static final String LABEL_EDEFAULT;
    protected String label;
    protected static final int LABEL_ESETFLAG = 2;
    protected static final String WORK_ITEM_ITEM_ID_EDEFAULT;
    protected String workItemItemId;
    protected static final int WORK_ITEM_ITEM_ID_ESETFLAG = 4;
    
    static {
        LABEL_EDEFAULT = null;
        WORK_ITEM_ITEM_ID_EDEFAULT = null;
    }
    
    protected WorkItemSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.id = 0;
        this.label = WorkItemSyncDTOImpl.LABEL_EDEFAULT;
        this.workItemItemId = WorkItemSyncDTOImpl.WORK_ITEM_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.WORK_ITEM_SYNC_DTO;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(final String newLabel) {
        final String oldLabel = this.label;
        this.label = newLabel;
        final boolean oldLabelESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldLabel, (Object)this.label, !oldLabelESet));
        }
    }
    
    public void unsetLabel() {
        final String oldLabel = this.label;
        final boolean oldLabelESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.label = WorkItemSyncDTOImpl.LABEL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldLabel, (Object)WorkItemSyncDTOImpl.LABEL_EDEFAULT, oldLabelESet));
        }
    }
    
    public boolean isSetLabel() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getWorkItemItemId() {
        return this.workItemItemId;
    }
    
    public void setWorkItemItemId(final String newWorkItemItemId) {
        final String oldWorkItemItemId = this.workItemItemId;
        this.workItemItemId = newWorkItemItemId;
        final boolean oldWorkItemItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldWorkItemItemId, (Object)this.workItemItemId, !oldWorkItemItemIdESet));
        }
    }
    
    public void unsetWorkItemItemId() {
        final String oldWorkItemItemId = this.workItemItemId;
        final boolean oldWorkItemItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.workItemItemId = WorkItemSyncDTOImpl.WORK_ITEM_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldWorkItemItemId, (Object)WorkItemSyncDTOImpl.WORK_ITEM_ITEM_ID_EDEFAULT, oldWorkItemItemIdESet));
        }
    }
    
    public boolean isSetWorkItemItemId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getId());
            }
            case 1: {
                return this.getLabel();
            }
            case 2: {
                return this.getWorkItemItemId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setId((int)newValue);
            }
            case 1: {
                this.setLabel((String)newValue);
            }
            case 2: {
                this.setWorkItemItemId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetId();
            }
            case 1: {
                this.unsetLabel();
            }
            case 2: {
                this.unsetWorkItemItemId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetId();
            }
            case 1: {
                return this.isSetLabel();
            }
            case 2: {
                return this.isSetWorkItemItemId();
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
        result.append(" (id: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", label: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.label);
        }
        else {
            result.append("<unset>");
        }
        result.append(", workItemItemId: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.workItemItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
