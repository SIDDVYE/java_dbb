// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.DeliveryRequiresHistoryReorderingDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class DeliveryRequiresHistoryReorderingDTOImpl extends EObjectImpl implements DeliveryRequiresHistoryReorderingDTO
{
    protected int ALL_FLAGS;
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 1;
    protected static final String TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
    protected String targetWorkspaceItemId;
    protected static final int TARGET_WORKSPACE_ITEM_ID_ESETFLAG = 2;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 4;
    
    static {
        WORKSPACE_ITEM_ID_EDEFAULT = null;
        TARGET_WORKSPACE_ITEM_ID_EDEFAULT = null;
        COMPONENT_ITEM_ID_EDEFAULT = null;
    }
    
    protected DeliveryRequiresHistoryReorderingDTOImpl() {
        this.ALL_FLAGS = 0;
        this.workspaceItemId = DeliveryRequiresHistoryReorderingDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.targetWorkspaceItemId = DeliveryRequiresHistoryReorderingDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
        this.componentItemId = DeliveryRequiresHistoryReorderingDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.DELIVERY_REQUIRES_HISTORY_REORDERING_DTO;
    }
    
    public String getWorkspaceItemId() {
        return this.workspaceItemId;
    }
    
    public void setWorkspaceItemId(final String newWorkspaceItemId) {
        final String oldWorkspaceItemId = this.workspaceItemId;
        this.workspaceItemId = newWorkspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.workspaceItemId = DeliveryRequiresHistoryReorderingDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldWorkspaceItemId, (Object)DeliveryRequiresHistoryReorderingDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getTargetWorkspaceItemId() {
        return this.targetWorkspaceItemId;
    }
    
    public void setTargetWorkspaceItemId(final String newTargetWorkspaceItemId) {
        final String oldTargetWorkspaceItemId = this.targetWorkspaceItemId;
        this.targetWorkspaceItemId = newTargetWorkspaceItemId;
        final boolean oldTargetWorkspaceItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldTargetWorkspaceItemId, (Object)this.targetWorkspaceItemId, !oldTargetWorkspaceItemIdESet));
        }
    }
    
    public void unsetTargetWorkspaceItemId() {
        final String oldTargetWorkspaceItemId = this.targetWorkspaceItemId;
        final boolean oldTargetWorkspaceItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.targetWorkspaceItemId = DeliveryRequiresHistoryReorderingDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldTargetWorkspaceItemId, (Object)DeliveryRequiresHistoryReorderingDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT, oldTargetWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetTargetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.componentItemId = DeliveryRequiresHistoryReorderingDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldComponentItemId, (Object)DeliveryRequiresHistoryReorderingDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getWorkspaceItemId();
            }
            case 1: {
                return this.getTargetWorkspaceItemId();
            }
            case 2: {
                return this.getComponentItemId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setWorkspaceItemId((String)newValue);
            }
            case 1: {
                this.setTargetWorkspaceItemId((String)newValue);
            }
            case 2: {
                this.setComponentItemId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetWorkspaceItemId();
            }
            case 1: {
                this.unsetTargetWorkspaceItemId();
            }
            case 2: {
                this.unsetComponentItemId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetWorkspaceItemId();
            }
            case 1: {
                return this.isSetTargetWorkspaceItemId();
            }
            case 2: {
                return this.isSetComponentItemId();
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
        result.append(" (workspaceItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.workspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetWorkspaceItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.targetWorkspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentItemId: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
