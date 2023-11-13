// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ShareDTOImpl extends EObjectImpl implements ShareDTO
{
    protected int ALL_FLAGS;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 1;
    protected static final String COMPONENT_NAME_EDEFAULT;
    protected String componentName;
    protected static final int COMPONENT_NAME_ESETFLAG = 2;
    protected static final String CONTEXT_ITEM_ID_EDEFAULT;
    protected String contextItemId;
    protected static final int CONTEXT_ITEM_ID_ESETFLAG = 4;
    protected static final String CONTEXT_NAME_EDEFAULT;
    protected String contextName;
    protected static final int CONTEXT_NAME_ESETFLAG = 8;
    protected static final boolean IS_WORKSPACE_CONTEXT_EDEFAULT = false;
    protected static final int IS_WORKSPACE_CONTEXT_EFLAG = 16;
    protected static final int IS_WORKSPACE_CONTEXT_ESETFLAG = 32;
    protected PathDTO path;
    protected static final int PATH_ESETFLAG = 64;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 128;
    protected static final String ROOT_VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String rootVersionableItemId;
    protected static final int ROOT_VERSIONABLE_ITEM_ID_ESETFLAG = 256;
    protected static final String ROOT_VERSIONABLE_ITEM_TYPE_EDEFAULT;
    protected String rootVersionableItemType;
    protected static final int ROOT_VERSIONABLE_ITEM_TYPE_ESETFLAG = 512;
    protected static final String SANDBOX_PATH_EDEFAULT;
    protected String sandboxPath;
    protected static final int SANDBOX_PATH_ESETFLAG = 1024;
    protected static final boolean IS_LOADED_WITH_ANOTHER_NAME_EDEFAULT = false;
    protected static final int IS_LOADED_WITH_ANOTHER_NAME_EFLAG = 2048;
    protected static final int IS_LOADED_WITH_ANOTHER_NAME_ESETFLAG = 4096;
    
    static {
        COMPONENT_ITEM_ID_EDEFAULT = null;
        COMPONENT_NAME_EDEFAULT = null;
        CONTEXT_ITEM_ID_EDEFAULT = null;
        CONTEXT_NAME_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        ROOT_VERSIONABLE_ITEM_ID_EDEFAULT = null;
        ROOT_VERSIONABLE_ITEM_TYPE_EDEFAULT = null;
        SANDBOX_PATH_EDEFAULT = null;
    }
    
    protected ShareDTOImpl() {
        this.ALL_FLAGS = 0;
        this.componentItemId = ShareDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.componentName = ShareDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.contextItemId = ShareDTOImpl.CONTEXT_ITEM_ID_EDEFAULT;
        this.contextName = ShareDTOImpl.CONTEXT_NAME_EDEFAULT;
        this.repositoryId = ShareDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.rootVersionableItemId = ShareDTOImpl.ROOT_VERSIONABLE_ITEM_ID_EDEFAULT;
        this.rootVersionableItemType = ShareDTOImpl.ROOT_VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.sandboxPath = ShareDTOImpl.SANDBOX_PATH_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.SHARE_DTO;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.componentItemId = ShareDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldComponentItemId, (Object)ShareDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getComponentName() {
        return this.componentName;
    }
    
    public void setComponentName(final String newComponentName) {
        final String oldComponentName = this.componentName;
        this.componentName = newComponentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldComponentName, (Object)this.componentName, !oldComponentNameESet));
        }
    }
    
    public void unsetComponentName() {
        final String oldComponentName = this.componentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.componentName = ShareDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldComponentName, (Object)ShareDTOImpl.COMPONENT_NAME_EDEFAULT, oldComponentNameESet));
        }
    }
    
    public boolean isSetComponentName() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getRootVersionableItemId() {
        return this.rootVersionableItemId;
    }
    
    public void setRootVersionableItemId(final String newRootVersionableItemId) {
        final String oldRootVersionableItemId = this.rootVersionableItemId;
        this.rootVersionableItemId = newRootVersionableItemId;
        final boolean oldRootVersionableItemIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldRootVersionableItemId, (Object)this.rootVersionableItemId, !oldRootVersionableItemIdESet));
        }
    }
    
    public void unsetRootVersionableItemId() {
        final String oldRootVersionableItemId = this.rootVersionableItemId;
        final boolean oldRootVersionableItemIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.rootVersionableItemId = ShareDTOImpl.ROOT_VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldRootVersionableItemId, (Object)ShareDTOImpl.ROOT_VERSIONABLE_ITEM_ID_EDEFAULT, oldRootVersionableItemIdESet));
        }
    }
    
    public boolean isSetRootVersionableItemId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public String getRootVersionableItemType() {
        return this.rootVersionableItemType;
    }
    
    public void setRootVersionableItemType(final String newRootVersionableItemType) {
        final String oldRootVersionableItemType = this.rootVersionableItemType;
        this.rootVersionableItemType = newRootVersionableItemType;
        final boolean oldRootVersionableItemTypeESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldRootVersionableItemType, (Object)this.rootVersionableItemType, !oldRootVersionableItemTypeESet));
        }
    }
    
    public void unsetRootVersionableItemType() {
        final String oldRootVersionableItemType = this.rootVersionableItemType;
        final boolean oldRootVersionableItemTypeESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.rootVersionableItemType = ShareDTOImpl.ROOT_VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldRootVersionableItemType, (Object)ShareDTOImpl.ROOT_VERSIONABLE_ITEM_TYPE_EDEFAULT, oldRootVersionableItemTypeESet));
        }
    }
    
    public boolean isSetRootVersionableItemType() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public String getSandboxPath() {
        return this.sandboxPath;
    }
    
    public void setSandboxPath(final String newSandboxPath) {
        final String oldSandboxPath = this.sandboxPath;
        this.sandboxPath = newSandboxPath;
        final boolean oldSandboxPathESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldSandboxPath, (Object)this.sandboxPath, !oldSandboxPathESet));
        }
    }
    
    public void unsetSandboxPath() {
        final String oldSandboxPath = this.sandboxPath;
        final boolean oldSandboxPathESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.sandboxPath = ShareDTOImpl.SANDBOX_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldSandboxPath, (Object)ShareDTOImpl.SANDBOX_PATH_EDEFAULT, oldSandboxPathESet));
        }
    }
    
    public boolean isSetSandboxPath() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public boolean isIsLoadedWithAnotherName() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public void setIsLoadedWithAnotherName(final boolean newIsLoadedWithAnotherName) {
        final boolean oldIsLoadedWithAnotherName = (this.ALL_FLAGS & 0x800) != 0x0;
        if (newIsLoadedWithAnotherName) {
            this.ALL_FLAGS |= 0x800;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFF7FF;
        }
        final boolean oldIsLoadedWithAnotherNameESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, oldIsLoadedWithAnotherName, newIsLoadedWithAnotherName, !oldIsLoadedWithAnotherNameESet));
        }
    }
    
    public void unsetIsLoadedWithAnotherName() {
        final boolean oldIsLoadedWithAnotherName = (this.ALL_FLAGS & 0x800) != 0x0;
        final boolean oldIsLoadedWithAnotherNameESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, oldIsLoadedWithAnotherName, false, oldIsLoadedWithAnotherNameESet));
        }
    }
    
    public boolean isSetIsLoadedWithAnotherName() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public PathDTO getPath() {
        return this.path;
    }
    
    public NotificationChain basicSetPath(final PathDTO newPath, NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldPath, (Object)newPath, !oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setPath(final PathDTO newPath) {
        if (newPath != this.path) {
            NotificationChain msgs = null;
            if (this.path != null) {
                msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -6, (Class)null, msgs);
            }
            if (newPath != null) {
                msgs = ((InternalEObject)newPath).eInverseAdd((InternalEObject)this, -6, (Class)null, msgs);
            }
            msgs = this.basicSetPath(newPath, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x40) != 0x0;
            this.ALL_FLAGS |= 0x40;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)newPath, (Object)newPath, !oldPathESet));
            }
        }
    }
    
    public NotificationChain basicUnsetPath(NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = null;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldPath, (Object)null, oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetPath() {
        if (this.path != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -6, (Class)null, msgs);
            msgs = this.basicUnsetPath(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x40) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFBF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)null, (Object)null, oldPathESet));
            }
        }
    }
    
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.repositoryId = ShareDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldRepositoryId, (Object)ShareDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
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
        this.contextItemId = ShareDTOImpl.CONTEXT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldContextItemId, (Object)ShareDTOImpl.CONTEXT_ITEM_ID_EDEFAULT, oldContextItemIdESet));
        }
    }
    
    public boolean isSetContextItemId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public boolean isIsWorkspaceContext() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public void setIsWorkspaceContext(final boolean newIsWorkspaceContext) {
        final boolean oldIsWorkspaceContext = (this.ALL_FLAGS & 0x10) != 0x0;
        if (newIsWorkspaceContext) {
            this.ALL_FLAGS |= 0x10;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFEF;
        }
        final boolean oldIsWorkspaceContextESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldIsWorkspaceContext, newIsWorkspaceContext, !oldIsWorkspaceContextESet));
        }
    }
    
    public void unsetIsWorkspaceContext() {
        final boolean oldIsWorkspaceContext = (this.ALL_FLAGS & 0x10) != 0x0;
        final boolean oldIsWorkspaceContextESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldIsWorkspaceContext, false, oldIsWorkspaceContextESet));
        }
    }
    
    public boolean isSetIsWorkspaceContext() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getContextName() {
        return this.contextName;
    }
    
    public void setContextName(final String newContextName) {
        final String oldContextName = this.contextName;
        this.contextName = newContextName;
        final boolean oldContextNameESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldContextName, (Object)this.contextName, !oldContextNameESet));
        }
    }
    
    public void unsetContextName() {
        final String oldContextName = this.contextName;
        final boolean oldContextNameESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.contextName = ShareDTOImpl.CONTEXT_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldContextName, (Object)ShareDTOImpl.CONTEXT_NAME_EDEFAULT, oldContextNameESet));
        }
    }
    
    public boolean isSetContextName() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 5: {
                return this.basicUnsetPath(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getComponentItemId();
            }
            case 1: {
                return this.getComponentName();
            }
            case 2: {
                return this.getContextItemId();
            }
            case 3: {
                return this.getContextName();
            }
            case 4: {
                return this.isIsWorkspaceContext() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return this.getPath();
            }
            case 6: {
                return this.getRepositoryId();
            }
            case 7: {
                return this.getRootVersionableItemId();
            }
            case 8: {
                return this.getRootVersionableItemType();
            }
            case 9: {
                return this.getSandboxPath();
            }
            case 10: {
                return this.isIsLoadedWithAnotherName() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setComponentItemId((String)newValue);
            }
            case 1: {
                this.setComponentName((String)newValue);
            }
            case 2: {
                this.setContextItemId((String)newValue);
            }
            case 3: {
                this.setContextName((String)newValue);
            }
            case 4: {
                this.setIsWorkspaceContext((boolean)newValue);
            }
            case 5: {
                this.setPath((PathDTO)newValue);
            }
            case 6: {
                this.setRepositoryId((String)newValue);
            }
            case 7: {
                this.setRootVersionableItemId((String)newValue);
            }
            case 8: {
                this.setRootVersionableItemType((String)newValue);
            }
            case 9: {
                this.setSandboxPath((String)newValue);
            }
            case 10: {
                this.setIsLoadedWithAnotherName((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComponentItemId();
            }
            case 1: {
                this.unsetComponentName();
            }
            case 2: {
                this.unsetContextItemId();
            }
            case 3: {
                this.unsetContextName();
            }
            case 4: {
                this.unsetIsWorkspaceContext();
            }
            case 5: {
                this.unsetPath();
            }
            case 6: {
                this.unsetRepositoryId();
            }
            case 7: {
                this.unsetRootVersionableItemId();
            }
            case 8: {
                this.unsetRootVersionableItemType();
            }
            case 9: {
                this.unsetSandboxPath();
            }
            case 10: {
                this.unsetIsLoadedWithAnotherName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComponentItemId();
            }
            case 1: {
                return this.isSetComponentName();
            }
            case 2: {
                return this.isSetContextItemId();
            }
            case 3: {
                return this.isSetContextName();
            }
            case 4: {
                return this.isSetIsWorkspaceContext();
            }
            case 5: {
                return this.isSetPath();
            }
            case 6: {
                return this.isSetRepositoryId();
            }
            case 7: {
                return this.isSetRootVersionableItemId();
            }
            case 8: {
                return this.isSetRootVersionableItemType();
            }
            case 9: {
                return this.isSetSandboxPath();
            }
            case 10: {
                return this.isSetIsLoadedWithAnotherName();
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
        result.append(" (componentItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentName: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.componentName);
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
        result.append(", contextName: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.contextName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", isWorkspaceContext: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", rootVersionableItemId: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.rootVersionableItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", rootVersionableItemType: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.rootVersionableItemType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sandboxPath: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.sandboxPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(", isLoadedWithAnotherName: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x800) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
