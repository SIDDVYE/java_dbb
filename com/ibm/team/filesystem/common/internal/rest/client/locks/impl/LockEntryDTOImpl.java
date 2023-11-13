// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockEntryDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LockEntryDTOImpl extends EObjectImpl implements LockEntryDTO
{
    protected int ALL_FLAGS;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 1;
    protected static final String REPOSITORY_ITEM_ID_EDEFAULT;
    protected String repositoryItemId;
    protected static final int REPOSITORY_ITEM_ID_ESETFLAG = 2;
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 4;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 8;
    protected static final String VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String versionableItemId;
    protected static final int VERSIONABLE_ITEM_ID_ESETFLAG = 16;
    
    static {
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_ITEM_ID_EDEFAULT = null;
        WORKSPACE_ITEM_ID_EDEFAULT = null;
        COMPONENT_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_ID_EDEFAULT = null;
    }
    
    protected LockEntryDTOImpl() {
        this.ALL_FLAGS = 0;
        this.repositoryId = LockEntryDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryItemId = LockEntryDTOImpl.REPOSITORY_ITEM_ID_EDEFAULT;
        this.workspaceItemId = LockEntryDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.componentItemId = LockEntryDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.versionableItemId = LockEntryDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOlocksPackage.Literals.LOCK_ENTRY_DTO;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.repositoryId = LockEntryDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldRepositoryId, (Object)LockEntryDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getRepositoryItemId() {
        return this.repositoryItemId;
    }
    
    public void setRepositoryItemId(final String newRepositoryItemId) {
        final String oldRepositoryItemId = this.repositoryItemId;
        this.repositoryItemId = newRepositoryItemId;
        final boolean oldRepositoryItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldRepositoryItemId, (Object)this.repositoryItemId, !oldRepositoryItemIdESet));
        }
    }
    
    public void unsetRepositoryItemId() {
        final String oldRepositoryItemId = this.repositoryItemId;
        final boolean oldRepositoryItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repositoryItemId = LockEntryDTOImpl.REPOSITORY_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldRepositoryItemId, (Object)LockEntryDTOImpl.REPOSITORY_ITEM_ID_EDEFAULT, oldRepositoryItemIdESet));
        }
    }
    
    public boolean isSetRepositoryItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getWorkspaceItemId() {
        return this.workspaceItemId;
    }
    
    public void setWorkspaceItemId(final String newWorkspaceItemId) {
        final String oldWorkspaceItemId = this.workspaceItemId;
        this.workspaceItemId = newWorkspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.workspaceItemId = LockEntryDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldWorkspaceItemId, (Object)LockEntryDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.componentItemId = LockEntryDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldComponentItemId, (Object)LockEntryDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getVersionableItemId() {
        return this.versionableItemId;
    }
    
    public void setVersionableItemId(final String newVersionableItemId) {
        final String oldVersionableItemId = this.versionableItemId;
        this.versionableItemId = newVersionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldVersionableItemId, (Object)this.versionableItemId, !oldVersionableItemIdESet));
        }
    }
    
    public void unsetVersionableItemId() {
        final String oldVersionableItemId = this.versionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.versionableItemId = LockEntryDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldVersionableItemId, (Object)LockEntryDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT, oldVersionableItemIdESet));
        }
    }
    
    public boolean isSetVersionableItemId() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRepositoryId();
            }
            case 1: {
                return this.getRepositoryItemId();
            }
            case 2: {
                return this.getWorkspaceItemId();
            }
            case 3: {
                return this.getComponentItemId();
            }
            case 4: {
                return this.getVersionableItemId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setRepositoryId((String)newValue);
            }
            case 1: {
                this.setRepositoryItemId((String)newValue);
            }
            case 2: {
                this.setWorkspaceItemId((String)newValue);
            }
            case 3: {
                this.setComponentItemId((String)newValue);
            }
            case 4: {
                this.setVersionableItemId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRepositoryId();
            }
            case 1: {
                this.unsetRepositoryItemId();
            }
            case 2: {
                this.unsetWorkspaceItemId();
            }
            case 3: {
                this.unsetComponentItemId();
            }
            case 4: {
                this.unsetVersionableItemId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRepositoryId();
            }
            case 1: {
                return this.isSetRepositoryItemId();
            }
            case 2: {
                return this.isSetWorkspaceItemId();
            }
            case 3: {
                return this.isSetComponentItemId();
            }
            case 4: {
                return this.isSetVersionableItemId();
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
        result.append(" (repositoryId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repositoryItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", workspaceItemId: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.workspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentItemId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemId: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.versionableItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
