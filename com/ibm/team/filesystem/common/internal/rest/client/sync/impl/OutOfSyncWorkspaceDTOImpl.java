// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OutOfSyncComponentDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OutOfSyncWorkspaceDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class OutOfSyncWorkspaceDTOImpl extends EObjectImpl implements OutOfSyncWorkspaceDTO
{
    protected int ALL_FLAGS;
    protected EList components;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 1;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryUrl;
    protected static final int REPOSITORY_URL_ESETFLAG = 2;
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 4;
    
    static {
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        WORKSPACE_ITEM_ID_EDEFAULT = null;
    }
    
    protected OutOfSyncWorkspaceDTOImpl() {
        this.ALL_FLAGS = 0;
        this.repositoryId = OutOfSyncWorkspaceDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryUrl = OutOfSyncWorkspaceDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.workspaceItemId = OutOfSyncWorkspaceDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.OUT_OF_SYNC_WORKSPACE_DTO;
    }
    
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    
    public void setRepositoryUrl(final String newRepositoryUrl) {
        final String oldRepositoryUrl = this.repositoryUrl;
        this.repositoryUrl = newRepositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldRepositoryUrl, (Object)this.repositoryUrl, !oldRepositoryUrlESet));
        }
    }
    
    public void unsetRepositoryUrl() {
        final String oldRepositoryUrl = this.repositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repositoryUrl = OutOfSyncWorkspaceDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldRepositoryUrl, (Object)OutOfSyncWorkspaceDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryUrlESet));
        }
    }
    
    public boolean isSetRepositoryUrl() {
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.workspaceItemId = OutOfSyncWorkspaceDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldWorkspaceItemId, (Object)OutOfSyncWorkspaceDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public List getComponents() {
        if (this.components == null) {
            this.components = (EList)new EObjectContainmentEList.Unsettable((Class)OutOfSyncComponentDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.components;
    }
    
    public void unsetComponents() {
        if (this.components != null) {
            ((InternalEList.Unsettable)this.components).unset();
        }
    }
    
    public boolean isSetComponents() {
        return this.components != null && ((InternalEList.Unsettable)this.components).isSet();
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.repositoryId = OutOfSyncWorkspaceDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldRepositoryId, (Object)OutOfSyncWorkspaceDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getComponents()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getComponents();
            }
            case 1: {
                return this.getRepositoryId();
            }
            case 2: {
                return this.getRepositoryUrl();
            }
            case 3: {
                return this.getWorkspaceItemId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getComponents().clear();
                this.getComponents().addAll((Collection)newValue);
            }
            case 1: {
                this.setRepositoryId((String)newValue);
            }
            case 2: {
                this.setRepositoryUrl((String)newValue);
            }
            case 3: {
                this.setWorkspaceItemId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComponents();
            }
            case 1: {
                this.unsetRepositoryId();
            }
            case 2: {
                this.unsetRepositoryUrl();
            }
            case 3: {
                this.unsetWorkspaceItemId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComponents();
            }
            case 1: {
                return this.isSetRepositoryId();
            }
            case 2: {
                return this.isSetRepositoryUrl();
            }
            case 3: {
                return this.isSetWorkspaceItemId();
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
        result.append(", repositoryUrl: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repositoryUrl);
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
        result.append(')');
        return result.toString();
    }
}
