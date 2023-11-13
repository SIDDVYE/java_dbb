// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceFlowEntryDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class WorkspaceFlowEntryDTOImpl extends EObjectImpl implements WorkspaceFlowEntryDTO
{
    protected int ALL_FLAGS;
    protected static final boolean CURRENT_FLOW_EDEFAULT = false;
    protected static final int CURRENT_FLOW_EFLAG = 1;
    protected static final int CURRENT_FLOW_ESETFLAG = 2;
    protected static final boolean DEFAULT_FLOW_EDEFAULT = false;
    protected static final int DEFAULT_FLOW_EFLAG = 4;
    protected static final int DEFAULT_FLOW_ESETFLAG = 8;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 16;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryURL;
    protected static final int REPOSITORY_URL_ESETFLAG = 32;
    protected EList scopedComponentItemIds;
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 64;
    
    static {
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        WORKSPACE_ITEM_ID_EDEFAULT = null;
    }
    
    protected WorkspaceFlowEntryDTOImpl() {
        this.ALL_FLAGS = 0;
        this.repositoryId = WorkspaceFlowEntryDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryURL = WorkspaceFlowEntryDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.workspaceItemId = WorkspaceFlowEntryDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.WORKSPACE_FLOW_ENTRY_DTO;
    }
    
    public String getRepositoryURL() {
        return this.repositoryURL;
    }
    
    public void setRepositoryURL(final String newRepositoryURL) {
        final String oldRepositoryURL = this.repositoryURL;
        this.repositoryURL = newRepositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldRepositoryURL, (Object)this.repositoryURL, !oldRepositoryURLESet));
        }
    }
    
    public void unsetRepositoryURL() {
        final String oldRepositoryURL = this.repositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.repositoryURL = WorkspaceFlowEntryDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldRepositoryURL, (Object)WorkspaceFlowEntryDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryURLESet));
        }
    }
    
    public boolean isSetRepositoryURL() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.repositoryId = WorkspaceFlowEntryDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldRepositoryId, (Object)WorkspaceFlowEntryDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getWorkspaceItemId() {
        return this.workspaceItemId;
    }
    
    public void setWorkspaceItemId(final String newWorkspaceItemId) {
        final String oldWorkspaceItemId = this.workspaceItemId;
        this.workspaceItemId = newWorkspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.workspaceItemId = WorkspaceFlowEntryDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldWorkspaceItemId, (Object)WorkspaceFlowEntryDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public List getScopedComponentItemIds() {
        if (this.scopedComponentItemIds == null) {
            this.scopedComponentItemIds = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 4);
        }
        return (List)this.scopedComponentItemIds;
    }
    
    public void unsetScopedComponentItemIds() {
        if (this.scopedComponentItemIds != null) {
            ((InternalEList.Unsettable)this.scopedComponentItemIds).unset();
        }
    }
    
    public boolean isSetScopedComponentItemIds() {
        return this.scopedComponentItemIds != null && ((InternalEList.Unsettable)this.scopedComponentItemIds).isSet();
    }
    
    public boolean isDefaultFlow() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setDefaultFlow(final boolean newDefaultFlow) {
        final boolean oldDefaultFlow = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newDefaultFlow) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldDefaultFlowESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldDefaultFlow, newDefaultFlow, !oldDefaultFlowESet));
        }
    }
    
    public void unsetDefaultFlow() {
        final boolean oldDefaultFlow = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldDefaultFlowESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldDefaultFlow, false, oldDefaultFlowESet));
        }
    }
    
    public boolean isSetDefaultFlow() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public boolean isCurrentFlow() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setCurrentFlow(final boolean newCurrentFlow) {
        final boolean oldCurrentFlow = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newCurrentFlow) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldCurrentFlowESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldCurrentFlow, newCurrentFlow, !oldCurrentFlowESet));
        }
    }
    
    public void unsetCurrentFlow() {
        final boolean oldCurrentFlow = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldCurrentFlowESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldCurrentFlow, false, oldCurrentFlowESet));
        }
    }
    
    public boolean isSetCurrentFlow() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isCurrentFlow() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.isDefaultFlow() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.getRepositoryId();
            }
            case 3: {
                return this.getRepositoryURL();
            }
            case 4: {
                return this.getScopedComponentItemIds();
            }
            case 5: {
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
                this.setCurrentFlow((boolean)newValue);
            }
            case 1: {
                this.setDefaultFlow((boolean)newValue);
            }
            case 2: {
                this.setRepositoryId((String)newValue);
            }
            case 3: {
                this.setRepositoryURL((String)newValue);
            }
            case 4: {
                this.getScopedComponentItemIds().clear();
                this.getScopedComponentItemIds().addAll((Collection)newValue);
            }
            case 5: {
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
                this.unsetCurrentFlow();
            }
            case 1: {
                this.unsetDefaultFlow();
            }
            case 2: {
                this.unsetRepositoryId();
            }
            case 3: {
                this.unsetRepositoryURL();
            }
            case 4: {
                this.unsetScopedComponentItemIds();
            }
            case 5: {
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
                return this.isSetCurrentFlow();
            }
            case 1: {
                return this.isSetDefaultFlow();
            }
            case 2: {
                return this.isSetRepositoryId();
            }
            case 3: {
                return this.isSetRepositoryURL();
            }
            case 4: {
                return this.isSetScopedComponentItemIds();
            }
            case 5: {
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
        result.append(" (currentFlow: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", defaultFlow: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryURL: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.repositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(", scopedComponentItemIds: ");
        result.append(this.scopedComponentItemIds);
        result.append(", workspaceItemId: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.workspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
