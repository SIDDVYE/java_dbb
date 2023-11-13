// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadLocationDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LoadLocationDTOImpl extends EObjectImpl implements LoadLocationDTO
{
    protected int ALL_FLAGS;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryURL;
    protected static final int REPOSITORY_URL_ESETFLAG = 1;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 2;
    protected static final String CONTEXT_ITEM_ID_EDEFAULT;
    protected String contextItemId;
    protected static final int CONTEXT_ITEM_ID_ESETFLAG = 4;
    protected static final boolean IS_WORKSPACE_CONTEXT_EDEFAULT = false;
    protected static final int IS_WORKSPACE_CONTEXT_EFLAG = 8;
    protected static final int IS_WORKSPACE_CONTEXT_ESETFLAG = 16;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 32;
    protected static final String VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String versionableItemId;
    protected static final int VERSIONABLE_ITEM_ID_ESETFLAG = 64;
    protected static final String VERSIONABLE_ITEM_TYPE_EDEFAULT;
    protected String versionableItemType;
    protected static final int VERSIONABLE_ITEM_TYPE_ESETFLAG = 128;
    
    static {
        REPOSITORY_URL_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        CONTEXT_ITEM_ID_EDEFAULT = null;
        COMPONENT_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_TYPE_EDEFAULT = null;
    }
    
    protected LoadLocationDTOImpl() {
        this.ALL_FLAGS = 0;
        this.repositoryURL = LoadLocationDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.repositoryId = LoadLocationDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.contextItemId = LoadLocationDTOImpl.CONTEXT_ITEM_ID_EDEFAULT;
        this.componentItemId = LoadLocationDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.versionableItemId = LoadLocationDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.versionableItemType = LoadLocationDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.LOAD_LOCATION_DTO;
    }
    
    public String getRepositoryURL() {
        return this.repositoryURL;
    }
    
    public void setRepositoryURL(final String newRepositoryURL) {
        final String oldRepositoryURL = this.repositoryURL;
        this.repositoryURL = newRepositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldRepositoryURL, (Object)this.repositoryURL, !oldRepositoryURLESet));
        }
    }
    
    public void unsetRepositoryURL() {
        final String oldRepositoryURL = this.repositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.repositoryURL = LoadLocationDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldRepositoryURL, (Object)LoadLocationDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryURLESet));
        }
    }
    
    public boolean isSetRepositoryURL() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repositoryId = LoadLocationDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldRepositoryId, (Object)LoadLocationDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getContextItemId() {
        return this.contextItemId;
    }
    
    public void setContextItemId(final String newContextItemId) {
        final String oldContextItemId = this.contextItemId;
        this.contextItemId = newContextItemId;
        final boolean oldContextItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldContextItemId, (Object)this.contextItemId, !oldContextItemIdESet));
        }
    }
    
    public void unsetContextItemId() {
        final String oldContextItemId = this.contextItemId;
        final boolean oldContextItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.contextItemId = LoadLocationDTOImpl.CONTEXT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldContextItemId, (Object)LoadLocationDTOImpl.CONTEXT_ITEM_ID_EDEFAULT, oldContextItemIdESet));
        }
    }
    
    public boolean isSetContextItemId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public boolean isIsWorkspaceContext() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public void setIsWorkspaceContext(final boolean newIsWorkspaceContext) {
        final boolean oldIsWorkspaceContext = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newIsWorkspaceContext) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldIsWorkspaceContextESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldIsWorkspaceContext, newIsWorkspaceContext, !oldIsWorkspaceContextESet));
        }
    }
    
    public void unsetIsWorkspaceContext() {
        final boolean oldIsWorkspaceContext = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldIsWorkspaceContextESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldIsWorkspaceContext, false, oldIsWorkspaceContextESet));
        }
    }
    
    public boolean isSetIsWorkspaceContext() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.componentItemId = LoadLocationDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldComponentItemId, (Object)LoadLocationDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getVersionableItemId() {
        return this.versionableItemId;
    }
    
    public void setVersionableItemId(final String newVersionableItemId) {
        final String oldVersionableItemId = this.versionableItemId;
        this.versionableItemId = newVersionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldVersionableItemId, (Object)this.versionableItemId, !oldVersionableItemIdESet));
        }
    }
    
    public void unsetVersionableItemId() {
        final String oldVersionableItemId = this.versionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.versionableItemId = LoadLocationDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldVersionableItemId, (Object)LoadLocationDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT, oldVersionableItemIdESet));
        }
    }
    
    public boolean isSetVersionableItemId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getVersionableItemType() {
        return this.versionableItemType;
    }
    
    public void setVersionableItemType(final String newVersionableItemType) {
        final String oldVersionableItemType = this.versionableItemType;
        this.versionableItemType = newVersionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldVersionableItemType, (Object)this.versionableItemType, !oldVersionableItemTypeESet));
        }
    }
    
    public void unsetVersionableItemType() {
        final String oldVersionableItemType = this.versionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.versionableItemType = LoadLocationDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldVersionableItemType, (Object)LoadLocationDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT, oldVersionableItemTypeESet));
        }
    }
    
    public boolean isSetVersionableItemType() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRepositoryURL();
            }
            case 1: {
                return this.getRepositoryId();
            }
            case 2: {
                return this.getContextItemId();
            }
            case 3: {
                return this.isIsWorkspaceContext() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 4: {
                return this.getComponentItemId();
            }
            case 5: {
                return this.getVersionableItemId();
            }
            case 6: {
                return this.getVersionableItemType();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setRepositoryURL((String)newValue);
            }
            case 1: {
                this.setRepositoryId((String)newValue);
            }
            case 2: {
                this.setContextItemId((String)newValue);
            }
            case 3: {
                this.setIsWorkspaceContext((boolean)newValue);
            }
            case 4: {
                this.setComponentItemId((String)newValue);
            }
            case 5: {
                this.setVersionableItemId((String)newValue);
            }
            case 6: {
                this.setVersionableItemType((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRepositoryURL();
            }
            case 1: {
                this.unsetRepositoryId();
            }
            case 2: {
                this.unsetContextItemId();
            }
            case 3: {
                this.unsetIsWorkspaceContext();
            }
            case 4: {
                this.unsetComponentItemId();
            }
            case 5: {
                this.unsetVersionableItemId();
            }
            case 6: {
                this.unsetVersionableItemType();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRepositoryURL();
            }
            case 1: {
                return this.isSetRepositoryId();
            }
            case 2: {
                return this.isSetContextItemId();
            }
            case 3: {
                return this.isSetIsWorkspaceContext();
            }
            case 4: {
                return this.isSetComponentItemId();
            }
            case 5: {
                return this.isSetVersionableItemId();
            }
            case 6: {
                return this.isSetVersionableItemType();
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
        result.append(" (repositoryURL: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.repositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", contextItemId: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.contextItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", isWorkspaceContext: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentItemId: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemId: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.versionableItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemType: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.versionableItemType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
