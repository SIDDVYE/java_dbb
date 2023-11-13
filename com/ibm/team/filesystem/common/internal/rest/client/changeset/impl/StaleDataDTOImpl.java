// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StaleDataDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StaleDataDTOImpl extends EObjectImpl implements StaleDataDTO
{
    protected int ALL_FLAGS;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 1;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryURL;
    protected static final int REPOSITORY_URL_ESETFLAG = 2;
    protected static final String SOURCE_REPOSITORY_ID_EDEFAULT;
    protected String sourceRepositoryId;
    protected static final int SOURCE_REPOSITORY_ID_ESETFLAG = 4;
    protected static final String SOURCE_REPOSITORY_URL_EDEFAULT;
    protected String sourceRepositoryURL;
    protected static final int SOURCE_REPOSITORY_URL_ESETFLAG = 8;
    protected static final String SOURCE_WORKSPACE_ITEM_ID_EDEFAULT;
    protected String sourceWorkspaceItemId;
    protected static final int SOURCE_WORKSPACE_ITEM_ID_ESETFLAG = 16;
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 32;
    
    static {
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        SOURCE_REPOSITORY_ID_EDEFAULT = null;
        SOURCE_REPOSITORY_URL_EDEFAULT = null;
        SOURCE_WORKSPACE_ITEM_ID_EDEFAULT = null;
        WORKSPACE_ITEM_ID_EDEFAULT = null;
    }
    
    protected StaleDataDTOImpl() {
        this.ALL_FLAGS = 0;
        this.repositoryId = StaleDataDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryURL = StaleDataDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.sourceRepositoryId = StaleDataDTOImpl.SOURCE_REPOSITORY_ID_EDEFAULT;
        this.sourceRepositoryURL = StaleDataDTOImpl.SOURCE_REPOSITORY_URL_EDEFAULT;
        this.sourceWorkspaceItemId = StaleDataDTOImpl.SOURCE_WORKSPACE_ITEM_ID_EDEFAULT;
        this.workspaceItemId = StaleDataDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.STALE_DATA_DTO;
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
        this.repositoryId = StaleDataDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldRepositoryId, (Object)StaleDataDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getRepositoryURL() {
        return this.repositoryURL;
    }
    
    public void setRepositoryURL(final String newRepositoryURL) {
        final String oldRepositoryURL = this.repositoryURL;
        this.repositoryURL = newRepositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldRepositoryURL, (Object)this.repositoryURL, !oldRepositoryURLESet));
        }
    }
    
    public void unsetRepositoryURL() {
        final String oldRepositoryURL = this.repositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repositoryURL = StaleDataDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldRepositoryURL, (Object)StaleDataDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryURLESet));
        }
    }
    
    public boolean isSetRepositoryURL() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getSourceRepositoryId() {
        return this.sourceRepositoryId;
    }
    
    public void setSourceRepositoryId(final String newSourceRepositoryId) {
        final String oldSourceRepositoryId = this.sourceRepositoryId;
        this.sourceRepositoryId = newSourceRepositoryId;
        final boolean oldSourceRepositoryIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldSourceRepositoryId, (Object)this.sourceRepositoryId, !oldSourceRepositoryIdESet));
        }
    }
    
    public void unsetSourceRepositoryId() {
        final String oldSourceRepositoryId = this.sourceRepositoryId;
        final boolean oldSourceRepositoryIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.sourceRepositoryId = StaleDataDTOImpl.SOURCE_REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldSourceRepositoryId, (Object)StaleDataDTOImpl.SOURCE_REPOSITORY_ID_EDEFAULT, oldSourceRepositoryIdESet));
        }
    }
    
    public boolean isSetSourceRepositoryId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getWorkspaceItemId() {
        return this.workspaceItemId;
    }
    
    public void setWorkspaceItemId(final String newWorkspaceItemId) {
        final String oldWorkspaceItemId = this.workspaceItemId;
        this.workspaceItemId = newWorkspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.workspaceItemId = StaleDataDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldWorkspaceItemId, (Object)StaleDataDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getSourceRepositoryURL() {
        return this.sourceRepositoryURL;
    }
    
    public void setSourceRepositoryURL(final String newSourceRepositoryURL) {
        final String oldSourceRepositoryURL = this.sourceRepositoryURL;
        this.sourceRepositoryURL = newSourceRepositoryURL;
        final boolean oldSourceRepositoryURLESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldSourceRepositoryURL, (Object)this.sourceRepositoryURL, !oldSourceRepositoryURLESet));
        }
    }
    
    public void unsetSourceRepositoryURL() {
        final String oldSourceRepositoryURL = this.sourceRepositoryURL;
        final boolean oldSourceRepositoryURLESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.sourceRepositoryURL = StaleDataDTOImpl.SOURCE_REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldSourceRepositoryURL, (Object)StaleDataDTOImpl.SOURCE_REPOSITORY_URL_EDEFAULT, oldSourceRepositoryURLESet));
        }
    }
    
    public boolean isSetSourceRepositoryURL() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getSourceWorkspaceItemId() {
        return this.sourceWorkspaceItemId;
    }
    
    public void setSourceWorkspaceItemId(final String newSourceWorkspaceItemId) {
        final String oldSourceWorkspaceItemId = this.sourceWorkspaceItemId;
        this.sourceWorkspaceItemId = newSourceWorkspaceItemId;
        final boolean oldSourceWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldSourceWorkspaceItemId, (Object)this.sourceWorkspaceItemId, !oldSourceWorkspaceItemIdESet));
        }
    }
    
    public void unsetSourceWorkspaceItemId() {
        final String oldSourceWorkspaceItemId = this.sourceWorkspaceItemId;
        final boolean oldSourceWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.sourceWorkspaceItemId = StaleDataDTOImpl.SOURCE_WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldSourceWorkspaceItemId, (Object)StaleDataDTOImpl.SOURCE_WORKSPACE_ITEM_ID_EDEFAULT, oldSourceWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetSourceWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRepositoryId();
            }
            case 1: {
                return this.getRepositoryURL();
            }
            case 2: {
                return this.getSourceRepositoryId();
            }
            case 3: {
                return this.getSourceRepositoryURL();
            }
            case 4: {
                return this.getSourceWorkspaceItemId();
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
                this.setRepositoryId((String)newValue);
            }
            case 1: {
                this.setRepositoryURL((String)newValue);
            }
            case 2: {
                this.setSourceRepositoryId((String)newValue);
            }
            case 3: {
                this.setSourceRepositoryURL((String)newValue);
            }
            case 4: {
                this.setSourceWorkspaceItemId((String)newValue);
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
                this.unsetRepositoryId();
            }
            case 1: {
                this.unsetRepositoryURL();
            }
            case 2: {
                this.unsetSourceRepositoryId();
            }
            case 3: {
                this.unsetSourceRepositoryURL();
            }
            case 4: {
                this.unsetSourceWorkspaceItemId();
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
                return this.isSetRepositoryId();
            }
            case 1: {
                return this.isSetRepositoryURL();
            }
            case 2: {
                return this.isSetSourceRepositoryId();
            }
            case 3: {
                return this.isSetSourceRepositoryURL();
            }
            case 4: {
                return this.isSetSourceWorkspaceItemId();
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
        result.append(" (repositoryId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryURL: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sourceRepositoryId: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.sourceRepositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sourceRepositoryURL: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.sourceRepositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sourceWorkspaceItemId: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.sourceWorkspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", workspaceItemId: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.workspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
