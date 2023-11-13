// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ComponentSyncDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.WorkspaceSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class WorkspaceSyncDTOImpl extends EObjectImpl implements WorkspaceSyncDTO
{
    protected int ALL_FLAGS;
    protected EList components;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 1;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 2;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryUrl;
    protected static final int REPOSITORY_URL_ESETFLAG = 4;
    protected static final boolean REPOSITORY_LOGGED_IN_EDEFAULT = false;
    protected static final int REPOSITORY_LOGGED_IN_EFLAG = 8;
    protected static final int REPOSITORY_LOGGED_IN_ESETFLAG = 16;
    protected static final boolean TARGET_REPOSITORY_LOGGED_IN_EDEFAULT = false;
    protected static final int TARGET_REPOSITORY_LOGGED_IN_EFLAG = 32;
    protected static final int TARGET_REPOSITORY_LOGGED_IN_ESETFLAG = 64;
    protected static final String TARGET_REPOSITORY_ID_EDEFAULT;
    protected String targetRepositoryId;
    protected static final int TARGET_REPOSITORY_ID_ESETFLAG = 128;
    protected static final String TARGET_REPOSITORY_URL_EDEFAULT;
    protected String targetRepositoryUrl;
    protected static final int TARGET_REPOSITORY_URL_ESETFLAG = 256;
    protected static final String TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
    protected String targetWorkspaceItemId;
    protected static final int TARGET_WORKSPACE_ITEM_ID_ESETFLAG = 512;
    protected static final String TARGET_WORKSPACE_NAME_EDEFAULT;
    protected String targetWorkspaceName;
    protected static final int TARGET_WORKSPACE_NAME_ESETFLAG = 1024;
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 2048;
    protected static final String WORKSPACE_NAME_EDEFAULT;
    protected String workspaceName;
    protected static final int WORKSPACE_NAME_ESETFLAG = 4096;
    protected static final boolean IS_STREAM_EDEFAULT = false;
    protected static final int IS_STREAM_EFLAG = 8192;
    protected static final int IS_STREAM_ESETFLAG = 16384;
    
    static {
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        TARGET_REPOSITORY_ID_EDEFAULT = null;
        TARGET_REPOSITORY_URL_EDEFAULT = null;
        TARGET_WORKSPACE_ITEM_ID_EDEFAULT = null;
        TARGET_WORKSPACE_NAME_EDEFAULT = null;
        WORKSPACE_ITEM_ID_EDEFAULT = null;
        WORKSPACE_NAME_EDEFAULT = null;
    }
    
    protected WorkspaceSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.id = 0;
        this.repositoryId = WorkspaceSyncDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryUrl = WorkspaceSyncDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.targetRepositoryId = WorkspaceSyncDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT;
        this.targetRepositoryUrl = WorkspaceSyncDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT;
        this.targetWorkspaceItemId = WorkspaceSyncDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
        this.targetWorkspaceName = WorkspaceSyncDTOImpl.TARGET_WORKSPACE_NAME_EDEFAULT;
        this.workspaceItemId = WorkspaceSyncDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.workspaceName = WorkspaceSyncDTOImpl.WORKSPACE_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.WORKSPACE_SYNC_DTO;
    }
    
    public String getWorkspaceName() {
        return this.workspaceName;
    }
    
    public void setWorkspaceName(final String newWorkspaceName) {
        final String oldWorkspaceName = this.workspaceName;
        this.workspaceName = newWorkspaceName;
        final boolean oldWorkspaceNameESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, (Object)oldWorkspaceName, (Object)this.workspaceName, !oldWorkspaceNameESet));
        }
    }
    
    public void unsetWorkspaceName() {
        final String oldWorkspaceName = this.workspaceName;
        final boolean oldWorkspaceNameESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.workspaceName = WorkspaceSyncDTOImpl.WORKSPACE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, (Object)oldWorkspaceName, (Object)WorkspaceSyncDTOImpl.WORKSPACE_NAME_EDEFAULT, oldWorkspaceNameESet));
        }
    }
    
    public boolean isSetWorkspaceName() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public boolean isIsStream() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public void setIsStream(final boolean newIsStream) {
        final boolean oldIsStream = (this.ALL_FLAGS & 0x2000) != 0x0;
        if (newIsStream) {
            this.ALL_FLAGS |= 0x2000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFDFFF;
        }
        final boolean oldIsStreamESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, oldIsStream, newIsStream, !oldIsStreamESet));
        }
    }
    
    public void unsetIsStream() {
        final boolean oldIsStream = (this.ALL_FLAGS & 0x2000) != 0x0;
        final boolean oldIsStreamESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, oldIsStream, false, oldIsStreamESet));
        }
    }
    
    public boolean isSetIsStream() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    
    public void setRepositoryUrl(final String newRepositoryUrl) {
        final String oldRepositoryUrl = this.repositoryUrl;
        this.repositoryUrl = newRepositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldRepositoryUrl, (Object)this.repositoryUrl, !oldRepositoryUrlESet));
        }
    }
    
    public void unsetRepositoryUrl() {
        final String oldRepositoryUrl = this.repositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.repositoryUrl = WorkspaceSyncDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldRepositoryUrl, (Object)WorkspaceSyncDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryUrlESet));
        }
    }
    
    public boolean isSetRepositoryUrl() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public boolean isRepositoryLoggedIn() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public void setRepositoryLoggedIn(final boolean newRepositoryLoggedIn) {
        final boolean oldRepositoryLoggedIn = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newRepositoryLoggedIn) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldRepositoryLoggedInESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldRepositoryLoggedIn, newRepositoryLoggedIn, !oldRepositoryLoggedInESet));
        }
    }
    
    public void unsetRepositoryLoggedIn() {
        final boolean oldRepositoryLoggedIn = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldRepositoryLoggedInESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldRepositoryLoggedIn, false, oldRepositoryLoggedInESet));
        }
    }
    
    public boolean isSetRepositoryLoggedIn() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getWorkspaceItemId() {
        return this.workspaceItemId;
    }
    
    public void setWorkspaceItemId(final String newWorkspaceItemId) {
        final String oldWorkspaceItemId = this.workspaceItemId;
        this.workspaceItemId = newWorkspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.workspaceItemId = WorkspaceSyncDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, (Object)oldWorkspaceItemId, (Object)WorkspaceSyncDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public String getTargetWorkspaceItemId() {
        return this.targetWorkspaceItemId;
    }
    
    public void setTargetWorkspaceItemId(final String newTargetWorkspaceItemId) {
        final String oldTargetWorkspaceItemId = this.targetWorkspaceItemId;
        this.targetWorkspaceItemId = newTargetWorkspaceItemId;
        final boolean oldTargetWorkspaceItemIdESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldTargetWorkspaceItemId, (Object)this.targetWorkspaceItemId, !oldTargetWorkspaceItemIdESet));
        }
    }
    
    public void unsetTargetWorkspaceItemId() {
        final String oldTargetWorkspaceItemId = this.targetWorkspaceItemId;
        final boolean oldTargetWorkspaceItemIdESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.targetWorkspaceItemId = WorkspaceSyncDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldTargetWorkspaceItemId, (Object)WorkspaceSyncDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT, oldTargetWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetTargetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public boolean isTargetRepositoryLoggedIn() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public void setTargetRepositoryLoggedIn(final boolean newTargetRepositoryLoggedIn) {
        final boolean oldTargetRepositoryLoggedIn = (this.ALL_FLAGS & 0x20) != 0x0;
        if (newTargetRepositoryLoggedIn) {
            this.ALL_FLAGS |= 0x20;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFDF;
        }
        final boolean oldTargetRepositoryLoggedInESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldTargetRepositoryLoggedIn, newTargetRepositoryLoggedIn, !oldTargetRepositoryLoggedInESet));
        }
    }
    
    public void unsetTargetRepositoryLoggedIn() {
        final boolean oldTargetRepositoryLoggedIn = (this.ALL_FLAGS & 0x20) != 0x0;
        final boolean oldTargetRepositoryLoggedInESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldTargetRepositoryLoggedIn, false, oldTargetRepositoryLoggedInESet));
        }
    }
    
    public boolean isSetTargetRepositoryLoggedIn() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getTargetRepositoryId() {
        return this.targetRepositoryId;
    }
    
    public void setTargetRepositoryId(final String newTargetRepositoryId) {
        final String oldTargetRepositoryId = this.targetRepositoryId;
        this.targetRepositoryId = newTargetRepositoryId;
        final boolean oldTargetRepositoryIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldTargetRepositoryId, (Object)this.targetRepositoryId, !oldTargetRepositoryIdESet));
        }
    }
    
    public void unsetTargetRepositoryId() {
        final String oldTargetRepositoryId = this.targetRepositoryId;
        final boolean oldTargetRepositoryIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.targetRepositoryId = WorkspaceSyncDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldTargetRepositoryId, (Object)WorkspaceSyncDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT, oldTargetRepositoryIdESet));
        }
    }
    
    public boolean isSetTargetRepositoryId() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public List getComponents() {
        if (this.components == null) {
            this.components = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentSyncDTO.class, (InternalEObject)this, 0);
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
    
    public String getTargetWorkspaceName() {
        return this.targetWorkspaceName;
    }
    
    public void setTargetWorkspaceName(final String newTargetWorkspaceName) {
        final String oldTargetWorkspaceName = this.targetWorkspaceName;
        this.targetWorkspaceName = newTargetWorkspaceName;
        final boolean oldTargetWorkspaceNameESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldTargetWorkspaceName, (Object)this.targetWorkspaceName, !oldTargetWorkspaceNameESet));
        }
    }
    
    public void unsetTargetWorkspaceName() {
        final String oldTargetWorkspaceName = this.targetWorkspaceName;
        final boolean oldTargetWorkspaceNameESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.targetWorkspaceName = WorkspaceSyncDTOImpl.TARGET_WORKSPACE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldTargetWorkspaceName, (Object)WorkspaceSyncDTOImpl.TARGET_WORKSPACE_NAME_EDEFAULT, oldTargetWorkspaceNameESet));
        }
    }
    
    public boolean isSetTargetWorkspaceName() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public String getTargetRepositoryUrl() {
        return this.targetRepositoryUrl;
    }
    
    public void setTargetRepositoryUrl(final String newTargetRepositoryUrl) {
        final String oldTargetRepositoryUrl = this.targetRepositoryUrl;
        this.targetRepositoryUrl = newTargetRepositoryUrl;
        final boolean oldTargetRepositoryUrlESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldTargetRepositoryUrl, (Object)this.targetRepositoryUrl, !oldTargetRepositoryUrlESet));
        }
    }
    
    public void unsetTargetRepositoryUrl() {
        final String oldTargetRepositoryUrl = this.targetRepositoryUrl;
        final boolean oldTargetRepositoryUrlESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.targetRepositoryUrl = WorkspaceSyncDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldTargetRepositoryUrl, (Object)WorkspaceSyncDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT, oldTargetRepositoryUrlESet));
        }
    }
    
    public boolean isSetTargetRepositoryUrl() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repositoryId = WorkspaceSyncDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldRepositoryId, (Object)WorkspaceSyncDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
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
                return new Integer(this.getId());
            }
            case 2: {
                return this.getRepositoryId();
            }
            case 3: {
                return this.getRepositoryUrl();
            }
            case 4: {
                return this.isRepositoryLoggedIn() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return this.isTargetRepositoryLoggedIn() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 6: {
                return this.getTargetRepositoryId();
            }
            case 7: {
                return this.getTargetRepositoryUrl();
            }
            case 8: {
                return this.getTargetWorkspaceItemId();
            }
            case 9: {
                return this.getTargetWorkspaceName();
            }
            case 10: {
                return this.getWorkspaceItemId();
            }
            case 11: {
                return this.getWorkspaceName();
            }
            case 12: {
                return this.isIsStream() ? Boolean.TRUE : Boolean.FALSE;
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
                this.setId((int)newValue);
            }
            case 2: {
                this.setRepositoryId((String)newValue);
            }
            case 3: {
                this.setRepositoryUrl((String)newValue);
            }
            case 4: {
                this.setRepositoryLoggedIn((boolean)newValue);
            }
            case 5: {
                this.setTargetRepositoryLoggedIn((boolean)newValue);
            }
            case 6: {
                this.setTargetRepositoryId((String)newValue);
            }
            case 7: {
                this.setTargetRepositoryUrl((String)newValue);
            }
            case 8: {
                this.setTargetWorkspaceItemId((String)newValue);
            }
            case 9: {
                this.setTargetWorkspaceName((String)newValue);
            }
            case 10: {
                this.setWorkspaceItemId((String)newValue);
            }
            case 11: {
                this.setWorkspaceName((String)newValue);
            }
            case 12: {
                this.setIsStream((boolean)newValue);
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
                this.unsetId();
            }
            case 2: {
                this.unsetRepositoryId();
            }
            case 3: {
                this.unsetRepositoryUrl();
            }
            case 4: {
                this.unsetRepositoryLoggedIn();
            }
            case 5: {
                this.unsetTargetRepositoryLoggedIn();
            }
            case 6: {
                this.unsetTargetRepositoryId();
            }
            case 7: {
                this.unsetTargetRepositoryUrl();
            }
            case 8: {
                this.unsetTargetWorkspaceItemId();
            }
            case 9: {
                this.unsetTargetWorkspaceName();
            }
            case 10: {
                this.unsetWorkspaceItemId();
            }
            case 11: {
                this.unsetWorkspaceName();
            }
            case 12: {
                this.unsetIsStream();
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
                return this.isSetId();
            }
            case 2: {
                return this.isSetRepositoryId();
            }
            case 3: {
                return this.isSetRepositoryUrl();
            }
            case 4: {
                return this.isSetRepositoryLoggedIn();
            }
            case 5: {
                return this.isSetTargetRepositoryLoggedIn();
            }
            case 6: {
                return this.isSetTargetRepositoryId();
            }
            case 7: {
                return this.isSetTargetRepositoryUrl();
            }
            case 8: {
                return this.isSetTargetWorkspaceItemId();
            }
            case 9: {
                return this.isSetTargetWorkspaceName();
            }
            case 10: {
                return this.isSetWorkspaceItemId();
            }
            case 11: {
                return this.isSetWorkspaceName();
            }
            case 12: {
                return this.isSetIsStream();
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
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryUrl: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.repositoryUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryLoggedIn: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRepositoryLoggedIn: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append((this.ALL_FLAGS & 0x20) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRepositoryId: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.targetRepositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRepositoryUrl: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.targetRepositoryUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetWorkspaceItemId: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.targetWorkspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetWorkspaceName: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.targetWorkspaceName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", workspaceItemId: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.workspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", workspaceName: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append(this.workspaceName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", isStream: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
