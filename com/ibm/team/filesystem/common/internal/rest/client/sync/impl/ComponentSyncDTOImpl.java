// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.sync.UnresolvedFolderSyncDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeSetSyncDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.BaselineSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ComponentSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ComponentSyncDTOImpl extends EObjectImpl implements ComponentSyncDTO
{
    protected int ALL_FLAGS;
    protected static final boolean BOTH_TYPE_EDEFAULT = false;
    protected static final int BOTH_TYPE_EFLAG = 1;
    protected static final int BOTH_TYPE_ESETFLAG = 2;
    protected static final String COMPONENT_NAME_EDEFAULT;
    protected String componentName;
    protected static final int COMPONENT_NAME_ESETFLAG = 4;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 8;
    protected static final String CURRENT_OUTGOING_CHANGE_SET_ITEM_ID_EDEFAULT;
    protected String currentOutgoingChangeSetItemId;
    protected static final int CURRENT_OUTGOING_CHANGE_SET_ITEM_ID_ESETFLAG = 16;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 32;
    protected EList incomingBaselines;
    protected EList incomingChangeSetsAfterBasis;
    protected EList outgoingBaselines;
    protected EList outgoingChangeSetsAfterBasis;
    protected static final boolean LOADED_EDEFAULT = false;
    protected static final int LOADED_EFLAG = 64;
    protected static final int LOADED_ESETFLAG = 128;
    protected static final boolean PRIVATE_TYPE_EDEFAULT = false;
    protected static final int PRIVATE_TYPE_EFLAG = 256;
    protected static final int PRIVATE_TYPE_ESETFLAG = 512;
    protected static final boolean REPLACED_EDEFAULT = false;
    protected static final int REPLACED_EFLAG = 1024;
    protected static final int REPLACED_ESETFLAG = 2048;
    protected EList suspended;
    protected static final String LOCAL_REPOSITORY_ID_EDEFAULT;
    protected String localRepositoryId;
    protected static final int LOCAL_REPOSITORY_ID_ESETFLAG = 4096;
    protected static final String LOCAL_REPOSITORY_URL_EDEFAULT;
    protected String localRepositoryUrl;
    protected static final int LOCAL_REPOSITORY_URL_ESETFLAG = 8192;
    protected static final boolean LOCAL_REPOSITORY_LOGGED_IN_EDEFAULT = false;
    protected static final int LOCAL_REPOSITORY_LOGGED_IN_EFLAG = 16384;
    protected static final int LOCAL_REPOSITORY_LOGGED_IN_ESETFLAG = 32768;
    protected static final String LOCAL_WORKSPACE_ITEM_ID_EDEFAULT;
    protected String localWorkspaceItemId;
    protected static final int LOCAL_WORKSPACE_ITEM_ID_ESETFLAG = 65536;
    protected static final String LOCAL_WORKSPACE_NAME_EDEFAULT;
    protected String localWorkspaceName;
    protected static final int LOCAL_WORKSPACE_NAME_ESETFLAG = 131072;
    protected static final boolean LOCAL_ADDED_TYPE_EDEFAULT = false;
    protected static final int LOCAL_ADDED_TYPE_EFLAG = 262144;
    protected static final int LOCAL_ADDED_TYPE_ESETFLAG = 524288;
    protected static final boolean LOCAL_REMOVED_TYPE_EDEFAULT = false;
    protected static final int LOCAL_REMOVED_TYPE_EFLAG = 1048576;
    protected static final int LOCAL_REMOVED_TYPE_ESETFLAG = 2097152;
    protected static final boolean ISLOCAL_STREAM_EDEFAULT = false;
    protected static final int ISLOCAL_STREAM_EFLAG = 4194304;
    protected static final int ISLOCAL_STREAM_ESETFLAG = 8388608;
    protected static final String TARGET_REPOSITORY_ID_EDEFAULT;
    protected String targetRepositoryId;
    protected static final int TARGET_REPOSITORY_ID_ESETFLAG = 16777216;
    protected static final String TARGET_REPOSITORY_URL_EDEFAULT;
    protected String targetRepositoryUrl;
    protected static final int TARGET_REPOSITORY_URL_ESETFLAG = 33554432;
    protected static final boolean TARGET_REPOSITORY_LOGGED_IN_EDEFAULT = false;
    protected static final int TARGET_REPOSITORY_LOGGED_IN_EFLAG = 67108864;
    protected static final int TARGET_REPOSITORY_LOGGED_IN_ESETFLAG = 134217728;
    protected static final String TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
    protected String targetWorkspaceItemId;
    protected static final int TARGET_WORKSPACE_ITEM_ID_ESETFLAG = 268435456;
    protected static final String TARGET_WORKSPACE_NAME_EDEFAULT;
    protected String targetWorkspaceName;
    protected static final int TARGET_WORKSPACE_NAME_ESETFLAG = 536870912;
    protected static final boolean TARGET_ADDED_TYPE_EDEFAULT = false;
    protected static final int TARGET_ADDED_TYPE_EFLAG = 1073741824;
    protected static final int TARGET_ADDED_TYPE_ESETFLAG = Integer.MIN_VALUE;
    protected static final boolean TARGET_REMOVED_TYPE_EDEFAULT = false;
    protected int ALL_FLAGS1;
    protected static final int TARGET_REMOVED_TYPE_EFLAG = 1;
    protected static final int TARGET_REMOVED_TYPE_ESETFLAG = 2;
    protected static final boolean IS_TARGET_STREAM_EDEFAULT = false;
    protected static final int IS_TARGET_STREAM_EFLAG = 4;
    protected static final int IS_TARGET_STREAM_ESETFLAG = 8;
    protected EList unresolved;
    protected CurrentPatchDTO currentPatch;
    protected static final int CURRENT_PATCH_ESETFLAG = 16;
    protected static final long ACCEPT_QUEUE_SIZE_EDEFAULT = 0L;
    protected long acceptQueueSize;
    protected static final int ACCEPT_QUEUE_SIZE_ESETFLAG = 32;
    protected BaselineSyncDTO localBaseline;
    protected static final int LOCAL_BASELINE_ESETFLAG = 64;
    protected BaselineSyncDTO remoteBaseline;
    protected static final int REMOTE_BASELINE_ESETFLAG = 128;
    
    static {
        COMPONENT_NAME_EDEFAULT = null;
        COMPONENT_ITEM_ID_EDEFAULT = null;
        CURRENT_OUTGOING_CHANGE_SET_ITEM_ID_EDEFAULT = null;
        LOCAL_REPOSITORY_ID_EDEFAULT = null;
        LOCAL_REPOSITORY_URL_EDEFAULT = null;
        LOCAL_WORKSPACE_ITEM_ID_EDEFAULT = null;
        LOCAL_WORKSPACE_NAME_EDEFAULT = null;
        TARGET_REPOSITORY_ID_EDEFAULT = null;
        TARGET_REPOSITORY_URL_EDEFAULT = null;
        TARGET_WORKSPACE_ITEM_ID_EDEFAULT = null;
        TARGET_WORKSPACE_NAME_EDEFAULT = null;
    }
    
    protected ComponentSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.componentName = ComponentSyncDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.componentItemId = ComponentSyncDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.currentOutgoingChangeSetItemId = ComponentSyncDTOImpl.CURRENT_OUTGOING_CHANGE_SET_ITEM_ID_EDEFAULT;
        this.id = 0;
        this.localRepositoryId = ComponentSyncDTOImpl.LOCAL_REPOSITORY_ID_EDEFAULT;
        this.localRepositoryUrl = ComponentSyncDTOImpl.LOCAL_REPOSITORY_URL_EDEFAULT;
        this.localWorkspaceItemId = ComponentSyncDTOImpl.LOCAL_WORKSPACE_ITEM_ID_EDEFAULT;
        this.localWorkspaceName = ComponentSyncDTOImpl.LOCAL_WORKSPACE_NAME_EDEFAULT;
        this.targetRepositoryId = ComponentSyncDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT;
        this.targetRepositoryUrl = ComponentSyncDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT;
        this.targetWorkspaceItemId = ComponentSyncDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
        this.targetWorkspaceName = ComponentSyncDTOImpl.TARGET_WORKSPACE_NAME_EDEFAULT;
        this.ALL_FLAGS1 = 0;
        this.acceptQueueSize = 0L;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.COMPONENT_SYNC_DTO;
    }
    
    public String getComponentName() {
        return this.componentName;
    }
    
    public void setComponentName(final String newComponentName) {
        final String oldComponentName = this.componentName;
        this.componentName = newComponentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldComponentName, (Object)this.componentName, !oldComponentNameESet));
        }
    }
    
    public void unsetComponentName() {
        final String oldComponentName = this.componentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.componentName = ComponentSyncDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldComponentName, (Object)ComponentSyncDTOImpl.COMPONENT_NAME_EDEFAULT, oldComponentNameESet));
        }
    }
    
    public boolean isSetComponentName() {
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.componentItemId = ComponentSyncDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldComponentItemId, (Object)ComponentSyncDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public List getOutgoingChangeSetsAfterBasis() {
        if (this.outgoingChangeSetsAfterBasis == null) {
            this.outgoingChangeSetsAfterBasis = (EList)new EObjectContainmentEList.Unsettable((Class)ChangeSetSyncDTO.class, (InternalEObject)this, 8);
        }
        return (List)this.outgoingChangeSetsAfterBasis;
    }
    
    public void unsetOutgoingChangeSetsAfterBasis() {
        if (this.outgoingChangeSetsAfterBasis != null) {
            ((InternalEList.Unsettable)this.outgoingChangeSetsAfterBasis).unset();
        }
    }
    
    public boolean isSetOutgoingChangeSetsAfterBasis() {
        return this.outgoingChangeSetsAfterBasis != null && ((InternalEList.Unsettable)this.outgoingChangeSetsAfterBasis).isSet();
    }
    
    public List getOutgoingBaselines() {
        if (this.outgoingBaselines == null) {
            this.outgoingBaselines = (EList)new EObjectContainmentEList.Unsettable((Class)BaselineSyncDTO.class, (InternalEObject)this, 7);
        }
        return (List)this.outgoingBaselines;
    }
    
    public void unsetOutgoingBaselines() {
        if (this.outgoingBaselines != null) {
            ((InternalEList.Unsettable)this.outgoingBaselines).unset();
        }
    }
    
    public boolean isSetOutgoingBaselines() {
        return this.outgoingBaselines != null && ((InternalEList.Unsettable)this.outgoingBaselines).isSet();
    }
    
    public List getIncomingChangeSetsAfterBasis() {
        if (this.incomingChangeSetsAfterBasis == null) {
            this.incomingChangeSetsAfterBasis = (EList)new EObjectContainmentEList.Unsettable((Class)ChangeSetSyncDTO.class, (InternalEObject)this, 6);
        }
        return (List)this.incomingChangeSetsAfterBasis;
    }
    
    public void unsetIncomingChangeSetsAfterBasis() {
        if (this.incomingChangeSetsAfterBasis != null) {
            ((InternalEList.Unsettable)this.incomingChangeSetsAfterBasis).unset();
        }
    }
    
    public boolean isSetIncomingChangeSetsAfterBasis() {
        return this.incomingChangeSetsAfterBasis != null && ((InternalEList.Unsettable)this.incomingChangeSetsAfterBasis).isSet();
    }
    
    public List getIncomingBaselines() {
        if (this.incomingBaselines == null) {
            this.incomingBaselines = (EList)new EObjectContainmentEList.Unsettable((Class)BaselineSyncDTO.class, (InternalEObject)this, 5);
        }
        return (List)this.incomingBaselines;
    }
    
    public void unsetIncomingBaselines() {
        if (this.incomingBaselines != null) {
            ((InternalEList.Unsettable)this.incomingBaselines).unset();
        }
    }
    
    public boolean isSetIncomingBaselines() {
        return this.incomingBaselines != null && ((InternalEList.Unsettable)this.incomingBaselines).isSet();
    }
    
    public List getSuspended() {
        if (this.suspended == null) {
            this.suspended = (EList)new EObjectContainmentEList.Unsettable((Class)ChangeSetSyncDTO.class, (InternalEObject)this, 12);
        }
        return (List)this.suspended;
    }
    
    public void unsetSuspended() {
        if (this.suspended != null) {
            ((InternalEList.Unsettable)this.suspended).unset();
        }
    }
    
    public boolean isSetSuspended() {
        return this.suspended != null && ((InternalEList.Unsettable)this.suspended).isSet();
    }
    
    public String getLocalRepositoryId() {
        return this.localRepositoryId;
    }
    
    public void setLocalRepositoryId(final String newLocalRepositoryId) {
        final String oldLocalRepositoryId = this.localRepositoryId;
        this.localRepositoryId = newLocalRepositoryId;
        final boolean oldLocalRepositoryIdESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldLocalRepositoryId, (Object)this.localRepositoryId, !oldLocalRepositoryIdESet));
        }
    }
    
    public void unsetLocalRepositoryId() {
        final String oldLocalRepositoryId = this.localRepositoryId;
        final boolean oldLocalRepositoryIdESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.localRepositoryId = ComponentSyncDTOImpl.LOCAL_REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldLocalRepositoryId, (Object)ComponentSyncDTOImpl.LOCAL_REPOSITORY_ID_EDEFAULT, oldLocalRepositoryIdESet));
        }
    }
    
    public boolean isSetLocalRepositoryId() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public String getLocalRepositoryUrl() {
        return this.localRepositoryUrl;
    }
    
    public void setLocalRepositoryUrl(final String newLocalRepositoryUrl) {
        final String oldLocalRepositoryUrl = this.localRepositoryUrl;
        this.localRepositoryUrl = newLocalRepositoryUrl;
        final boolean oldLocalRepositoryUrlESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 14, (Object)oldLocalRepositoryUrl, (Object)this.localRepositoryUrl, !oldLocalRepositoryUrlESet));
        }
    }
    
    public void unsetLocalRepositoryUrl() {
        final String oldLocalRepositoryUrl = this.localRepositoryUrl;
        final boolean oldLocalRepositoryUrlESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.localRepositoryUrl = ComponentSyncDTOImpl.LOCAL_REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 14, (Object)oldLocalRepositoryUrl, (Object)ComponentSyncDTOImpl.LOCAL_REPOSITORY_URL_EDEFAULT, oldLocalRepositoryUrlESet));
        }
    }
    
    public boolean isSetLocalRepositoryUrl() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public boolean isLocalRepositoryLoggedIn() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public void setLocalRepositoryLoggedIn(final boolean newLocalRepositoryLoggedIn) {
        final boolean oldLocalRepositoryLoggedIn = (this.ALL_FLAGS & 0x4000) != 0x0;
        if (newLocalRepositoryLoggedIn) {
            this.ALL_FLAGS |= 0x4000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFBFFF;
        }
        final boolean oldLocalRepositoryLoggedInESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS |= 0x8000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 15, oldLocalRepositoryLoggedIn, newLocalRepositoryLoggedIn, !oldLocalRepositoryLoggedInESet));
        }
    }
    
    public void unsetLocalRepositoryLoggedIn() {
        final boolean oldLocalRepositoryLoggedIn = (this.ALL_FLAGS & 0x4000) != 0x0;
        final boolean oldLocalRepositoryLoggedInESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 15, oldLocalRepositoryLoggedIn, false, oldLocalRepositoryLoggedInESet));
        }
    }
    
    public boolean isSetLocalRepositoryLoggedIn() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    public String getLocalWorkspaceItemId() {
        return this.localWorkspaceItemId;
    }
    
    public void setLocalWorkspaceItemId(final String newLocalWorkspaceItemId) {
        final String oldLocalWorkspaceItemId = this.localWorkspaceItemId;
        this.localWorkspaceItemId = newLocalWorkspaceItemId;
        final boolean oldLocalWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS |= 0x10000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 16, (Object)oldLocalWorkspaceItemId, (Object)this.localWorkspaceItemId, !oldLocalWorkspaceItemIdESet));
        }
    }
    
    public void unsetLocalWorkspaceItemId() {
        final String oldLocalWorkspaceItemId = this.localWorkspaceItemId;
        final boolean oldLocalWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.localWorkspaceItemId = ComponentSyncDTOImpl.LOCAL_WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFEFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 16, (Object)oldLocalWorkspaceItemId, (Object)ComponentSyncDTOImpl.LOCAL_WORKSPACE_ITEM_ID_EDEFAULT, oldLocalWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetLocalWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x10000) != 0x0;
    }
    
    public String getLocalWorkspaceName() {
        return this.localWorkspaceName;
    }
    
    public void setLocalWorkspaceName(final String newLocalWorkspaceName) {
        final String oldLocalWorkspaceName = this.localWorkspaceName;
        this.localWorkspaceName = newLocalWorkspaceName;
        final boolean oldLocalWorkspaceNameESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.ALL_FLAGS |= 0x20000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 17, (Object)oldLocalWorkspaceName, (Object)this.localWorkspaceName, !oldLocalWorkspaceNameESet));
        }
    }
    
    public void unsetLocalWorkspaceName() {
        final String oldLocalWorkspaceName = this.localWorkspaceName;
        final boolean oldLocalWorkspaceNameESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.localWorkspaceName = ComponentSyncDTOImpl.LOCAL_WORKSPACE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFDFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 17, (Object)oldLocalWorkspaceName, (Object)ComponentSyncDTOImpl.LOCAL_WORKSPACE_NAME_EDEFAULT, oldLocalWorkspaceNameESet));
        }
    }
    
    public boolean isSetLocalWorkspaceName() {
        return (this.ALL_FLAGS & 0x20000) != 0x0;
    }
    
    public String getTargetRepositoryId() {
        return this.targetRepositoryId;
    }
    
    public void setTargetRepositoryId(final String newTargetRepositoryId) {
        final String oldTargetRepositoryId = this.targetRepositoryId;
        this.targetRepositoryId = newTargetRepositoryId;
        final boolean oldTargetRepositoryIdESet = (this.ALL_FLAGS & 0x1000000) != 0x0;
        this.ALL_FLAGS |= 0x1000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 21, (Object)oldTargetRepositoryId, (Object)this.targetRepositoryId, !oldTargetRepositoryIdESet));
        }
    }
    
    public void unsetTargetRepositoryId() {
        final String oldTargetRepositoryId = this.targetRepositoryId;
        final boolean oldTargetRepositoryIdESet = (this.ALL_FLAGS & 0x1000000) != 0x0;
        this.targetRepositoryId = ComponentSyncDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFEFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 21, (Object)oldTargetRepositoryId, (Object)ComponentSyncDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT, oldTargetRepositoryIdESet));
        }
    }
    
    public boolean isSetTargetRepositoryId() {
        return (this.ALL_FLAGS & 0x1000000) != 0x0;
    }
    
    public List getUnresolved() {
        if (this.unresolved == null) {
            this.unresolved = (EList)new EObjectContainmentEList.Unsettable((Class)UnresolvedFolderSyncDTO.class, (InternalEObject)this, 29);
        }
        return (List)this.unresolved;
    }
    
    public void unsetUnresolved() {
        if (this.unresolved != null) {
            ((InternalEList.Unsettable)this.unresolved).unset();
        }
    }
    
    public boolean isSetUnresolved() {
        return this.unresolved != null && ((InternalEList.Unsettable)this.unresolved).isSet();
    }
    
    public boolean isIsTargetStream() {
        return (this.ALL_FLAGS1 & 0x4) != 0x0;
    }
    
    public void setIsTargetStream(final boolean newIsTargetStream) {
        final boolean oldIsTargetStream = (this.ALL_FLAGS1 & 0x4) != 0x0;
        if (newIsTargetStream) {
            this.ALL_FLAGS1 |= 0x4;
        }
        else {
            this.ALL_FLAGS1 &= 0xFFFFFFFB;
        }
        final boolean oldIsTargetStreamESet = (this.ALL_FLAGS1 & 0x8) != 0x0;
        this.ALL_FLAGS1 |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 28, oldIsTargetStream, newIsTargetStream, !oldIsTargetStreamESet));
        }
    }
    
    public void unsetIsTargetStream() {
        final boolean oldIsTargetStream = (this.ALL_FLAGS1 & 0x4) != 0x0;
        final boolean oldIsTargetStreamESet = (this.ALL_FLAGS1 & 0x8) != 0x0;
        this.ALL_FLAGS1 &= 0xFFFFFFFB;
        this.ALL_FLAGS1 &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 28, oldIsTargetStream, false, oldIsTargetStreamESet));
        }
    }
    
    public boolean isSetIsTargetStream() {
        return (this.ALL_FLAGS1 & 0x8) != 0x0;
    }
    
    public CurrentPatchDTO getCurrentPatch() {
        if (this.currentPatch != null && ((EObject)this.currentPatch).eIsProxy()) {
            final InternalEObject oldCurrentPatch = (InternalEObject)this.currentPatch;
            this.currentPatch = (CurrentPatchDTO)this.eResolveProxy(oldCurrentPatch);
            if (this.currentPatch != oldCurrentPatch && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 30, (Object)oldCurrentPatch, (Object)this.currentPatch));
            }
        }
        return this.currentPatch;
    }
    
    public CurrentPatchDTO basicGetCurrentPatch() {
        return this.currentPatch;
    }
    
    public void setCurrentPatch(final CurrentPatchDTO newCurrentPatch) {
        final CurrentPatchDTO oldCurrentPatch = this.currentPatch;
        this.currentPatch = newCurrentPatch;
        final boolean oldCurrentPatchESet = (this.ALL_FLAGS1 & 0x10) != 0x0;
        this.ALL_FLAGS1 |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 30, (Object)oldCurrentPatch, (Object)this.currentPatch, !oldCurrentPatchESet));
        }
    }
    
    public void unsetCurrentPatch() {
        final CurrentPatchDTO oldCurrentPatch = this.currentPatch;
        final boolean oldCurrentPatchESet = (this.ALL_FLAGS1 & 0x10) != 0x0;
        this.currentPatch = null;
        this.ALL_FLAGS1 &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 30, (Object)oldCurrentPatch, (Object)null, oldCurrentPatchESet));
        }
    }
    
    public boolean isSetCurrentPatch() {
        return (this.ALL_FLAGS1 & 0x10) != 0x0;
    }
    
    public long getAcceptQueueSize() {
        return this.acceptQueueSize;
    }
    
    public void setAcceptQueueSize(final long newAcceptQueueSize) {
        final long oldAcceptQueueSize = this.acceptQueueSize;
        this.acceptQueueSize = newAcceptQueueSize;
        final boolean oldAcceptQueueSizeESet = (this.ALL_FLAGS1 & 0x20) != 0x0;
        this.ALL_FLAGS1 |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 31, oldAcceptQueueSize, this.acceptQueueSize, !oldAcceptQueueSizeESet));
        }
    }
    
    public void unsetAcceptQueueSize() {
        final long oldAcceptQueueSize = this.acceptQueueSize;
        final boolean oldAcceptQueueSizeESet = (this.ALL_FLAGS1 & 0x20) != 0x0;
        this.acceptQueueSize = 0L;
        this.ALL_FLAGS1 &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 31, oldAcceptQueueSize, 0L, oldAcceptQueueSizeESet));
        }
    }
    
    public boolean isSetAcceptQueueSize() {
        return (this.ALL_FLAGS1 & 0x20) != 0x0;
    }
    
    public BaselineSyncDTO getLocalBaseline() {
        return this.localBaseline;
    }
    
    public NotificationChain basicSetLocalBaseline(final BaselineSyncDTO newLocalBaseline, NotificationChain msgs) {
        final BaselineSyncDTO oldLocalBaseline = this.localBaseline;
        this.localBaseline = newLocalBaseline;
        final boolean oldLocalBaselineESet = (this.ALL_FLAGS1 & 0x40) != 0x0;
        this.ALL_FLAGS1 |= 0x40;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 32, (Object)oldLocalBaseline, (Object)newLocalBaseline, !oldLocalBaselineESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setLocalBaseline(final BaselineSyncDTO newLocalBaseline) {
        if (newLocalBaseline != this.localBaseline) {
            NotificationChain msgs = null;
            if (this.localBaseline != null) {
                msgs = ((InternalEObject)this.localBaseline).eInverseRemove((InternalEObject)this, -33, (Class)null, msgs);
            }
            if (newLocalBaseline != null) {
                msgs = ((InternalEObject)newLocalBaseline).eInverseAdd((InternalEObject)this, -33, (Class)null, msgs);
            }
            msgs = this.basicSetLocalBaseline(newLocalBaseline, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldLocalBaselineESet = (this.ALL_FLAGS1 & 0x40) != 0x0;
            this.ALL_FLAGS1 |= 0x40;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 32, (Object)newLocalBaseline, (Object)newLocalBaseline, !oldLocalBaselineESet));
            }
        }
    }
    
    public NotificationChain basicUnsetLocalBaseline(NotificationChain msgs) {
        final BaselineSyncDTO oldLocalBaseline = this.localBaseline;
        this.localBaseline = null;
        final boolean oldLocalBaselineESet = (this.ALL_FLAGS1 & 0x40) != 0x0;
        this.ALL_FLAGS1 &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 32, (Object)oldLocalBaseline, (Object)null, oldLocalBaselineESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetLocalBaseline() {
        if (this.localBaseline != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.localBaseline).eInverseRemove((InternalEObject)this, -33, (Class)null, msgs);
            msgs = this.basicUnsetLocalBaseline(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldLocalBaselineESet = (this.ALL_FLAGS1 & 0x40) != 0x0;
            this.ALL_FLAGS1 &= 0xFFFFFFBF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 32, (Object)null, (Object)null, oldLocalBaselineESet));
            }
        }
    }
    
    public boolean isSetLocalBaseline() {
        return (this.ALL_FLAGS1 & 0x40) != 0x0;
    }
    
    public BaselineSyncDTO getRemoteBaseline() {
        return this.remoteBaseline;
    }
    
    public NotificationChain basicSetRemoteBaseline(final BaselineSyncDTO newRemoteBaseline, NotificationChain msgs) {
        final BaselineSyncDTO oldRemoteBaseline = this.remoteBaseline;
        this.remoteBaseline = newRemoteBaseline;
        final boolean oldRemoteBaselineESet = (this.ALL_FLAGS1 & 0x80) != 0x0;
        this.ALL_FLAGS1 |= 0x80;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 33, (Object)oldRemoteBaseline, (Object)newRemoteBaseline, !oldRemoteBaselineESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setRemoteBaseline(final BaselineSyncDTO newRemoteBaseline) {
        if (newRemoteBaseline != this.remoteBaseline) {
            NotificationChain msgs = null;
            if (this.remoteBaseline != null) {
                msgs = ((InternalEObject)this.remoteBaseline).eInverseRemove((InternalEObject)this, -34, (Class)null, msgs);
            }
            if (newRemoteBaseline != null) {
                msgs = ((InternalEObject)newRemoteBaseline).eInverseAdd((InternalEObject)this, -34, (Class)null, msgs);
            }
            msgs = this.basicSetRemoteBaseline(newRemoteBaseline, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldRemoteBaselineESet = (this.ALL_FLAGS1 & 0x80) != 0x0;
            this.ALL_FLAGS1 |= 0x80;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 33, (Object)newRemoteBaseline, (Object)newRemoteBaseline, !oldRemoteBaselineESet));
            }
        }
    }
    
    public NotificationChain basicUnsetRemoteBaseline(NotificationChain msgs) {
        final BaselineSyncDTO oldRemoteBaseline = this.remoteBaseline;
        this.remoteBaseline = null;
        final boolean oldRemoteBaselineESet = (this.ALL_FLAGS1 & 0x80) != 0x0;
        this.ALL_FLAGS1 &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 33, (Object)oldRemoteBaseline, (Object)null, oldRemoteBaselineESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetRemoteBaseline() {
        if (this.remoteBaseline != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.remoteBaseline).eInverseRemove((InternalEObject)this, -34, (Class)null, msgs);
            msgs = this.basicUnsetRemoteBaseline(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldRemoteBaselineESet = (this.ALL_FLAGS1 & 0x80) != 0x0;
            this.ALL_FLAGS1 &= 0xFFFFFF7F;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 33, (Object)null, (Object)null, oldRemoteBaselineESet));
            }
        }
    }
    
    public boolean isSetRemoteBaseline() {
        return (this.ALL_FLAGS1 & 0x80) != 0x0;
    }
    
    public String getTargetRepositoryUrl() {
        return this.targetRepositoryUrl;
    }
    
    public void setTargetRepositoryUrl(final String newTargetRepositoryUrl) {
        final String oldTargetRepositoryUrl = this.targetRepositoryUrl;
        this.targetRepositoryUrl = newTargetRepositoryUrl;
        final boolean oldTargetRepositoryUrlESet = (this.ALL_FLAGS & 0x2000000) != 0x0;
        this.ALL_FLAGS |= 0x2000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 22, (Object)oldTargetRepositoryUrl, (Object)this.targetRepositoryUrl, !oldTargetRepositoryUrlESet));
        }
    }
    
    public void unsetTargetRepositoryUrl() {
        final String oldTargetRepositoryUrl = this.targetRepositoryUrl;
        final boolean oldTargetRepositoryUrlESet = (this.ALL_FLAGS & 0x2000000) != 0x0;
        this.targetRepositoryUrl = ComponentSyncDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFDFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 22, (Object)oldTargetRepositoryUrl, (Object)ComponentSyncDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT, oldTargetRepositoryUrlESet));
        }
    }
    
    public boolean isSetTargetRepositoryUrl() {
        return (this.ALL_FLAGS & 0x2000000) != 0x0;
    }
    
    public boolean isTargetRepositoryLoggedIn() {
        return (this.ALL_FLAGS & 0x4000000) != 0x0;
    }
    
    public void setTargetRepositoryLoggedIn(final boolean newTargetRepositoryLoggedIn) {
        final boolean oldTargetRepositoryLoggedIn = (this.ALL_FLAGS & 0x4000000) != 0x0;
        if (newTargetRepositoryLoggedIn) {
            this.ALL_FLAGS |= 0x4000000;
        }
        else {
            this.ALL_FLAGS &= 0xFBFFFFFF;
        }
        final boolean oldTargetRepositoryLoggedInESet = (this.ALL_FLAGS & 0x8000000) != 0x0;
        this.ALL_FLAGS |= 0x8000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 23, oldTargetRepositoryLoggedIn, newTargetRepositoryLoggedIn, !oldTargetRepositoryLoggedInESet));
        }
    }
    
    public void unsetTargetRepositoryLoggedIn() {
        final boolean oldTargetRepositoryLoggedIn = (this.ALL_FLAGS & 0x4000000) != 0x0;
        final boolean oldTargetRepositoryLoggedInESet = (this.ALL_FLAGS & 0x8000000) != 0x0;
        this.ALL_FLAGS &= 0xFBFFFFFF;
        this.ALL_FLAGS &= 0xF7FFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 23, oldTargetRepositoryLoggedIn, false, oldTargetRepositoryLoggedInESet));
        }
    }
    
    public boolean isSetTargetRepositoryLoggedIn() {
        return (this.ALL_FLAGS & 0x8000000) != 0x0;
    }
    
    public String getTargetWorkspaceItemId() {
        return this.targetWorkspaceItemId;
    }
    
    public void setTargetWorkspaceItemId(final String newTargetWorkspaceItemId) {
        final String oldTargetWorkspaceItemId = this.targetWorkspaceItemId;
        this.targetWorkspaceItemId = newTargetWorkspaceItemId;
        final boolean oldTargetWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10000000) != 0x0;
        this.ALL_FLAGS |= 0x10000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 24, (Object)oldTargetWorkspaceItemId, (Object)this.targetWorkspaceItemId, !oldTargetWorkspaceItemIdESet));
        }
    }
    
    public void unsetTargetWorkspaceItemId() {
        final String oldTargetWorkspaceItemId = this.targetWorkspaceItemId;
        final boolean oldTargetWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10000000) != 0x0;
        this.targetWorkspaceItemId = ComponentSyncDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xEFFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 24, (Object)oldTargetWorkspaceItemId, (Object)ComponentSyncDTOImpl.TARGET_WORKSPACE_ITEM_ID_EDEFAULT, oldTargetWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetTargetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x10000000) != 0x0;
    }
    
    public String getTargetWorkspaceName() {
        return this.targetWorkspaceName;
    }
    
    public void setTargetWorkspaceName(final String newTargetWorkspaceName) {
        final String oldTargetWorkspaceName = this.targetWorkspaceName;
        this.targetWorkspaceName = newTargetWorkspaceName;
        final boolean oldTargetWorkspaceNameESet = (this.ALL_FLAGS & 0x20000000) != 0x0;
        this.ALL_FLAGS |= 0x20000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 25, (Object)oldTargetWorkspaceName, (Object)this.targetWorkspaceName, !oldTargetWorkspaceNameESet));
        }
    }
    
    public void unsetTargetWorkspaceName() {
        final String oldTargetWorkspaceName = this.targetWorkspaceName;
        final boolean oldTargetWorkspaceNameESet = (this.ALL_FLAGS & 0x20000000) != 0x0;
        this.targetWorkspaceName = ComponentSyncDTOImpl.TARGET_WORKSPACE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xDFFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 25, (Object)oldTargetWorkspaceName, (Object)ComponentSyncDTOImpl.TARGET_WORKSPACE_NAME_EDEFAULT, oldTargetWorkspaceNameESet));
        }
    }
    
    public boolean isSetTargetWorkspaceName() {
        return (this.ALL_FLAGS & 0x20000000) != 0x0;
    }
    
    public String getCurrentOutgoingChangeSetItemId() {
        return this.currentOutgoingChangeSetItemId;
    }
    
    public void setCurrentOutgoingChangeSetItemId(final String newCurrentOutgoingChangeSetItemId) {
        final String oldCurrentOutgoingChangeSetItemId = this.currentOutgoingChangeSetItemId;
        this.currentOutgoingChangeSetItemId = newCurrentOutgoingChangeSetItemId;
        final boolean oldCurrentOutgoingChangeSetItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldCurrentOutgoingChangeSetItemId, (Object)this.currentOutgoingChangeSetItemId, !oldCurrentOutgoingChangeSetItemIdESet));
        }
    }
    
    public void unsetCurrentOutgoingChangeSetItemId() {
        final String oldCurrentOutgoingChangeSetItemId = this.currentOutgoingChangeSetItemId;
        final boolean oldCurrentOutgoingChangeSetItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.currentOutgoingChangeSetItemId = ComponentSyncDTOImpl.CURRENT_OUTGOING_CHANGE_SET_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldCurrentOutgoingChangeSetItemId, (Object)ComponentSyncDTOImpl.CURRENT_OUTGOING_CHANGE_SET_ITEM_ID_EDEFAULT, oldCurrentOutgoingChangeSetItemIdESet));
        }
    }
    
    public boolean isSetCurrentOutgoingChangeSetItemId() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public boolean isPrivateType() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public void setPrivateType(final boolean newPrivateType) {
        final boolean oldPrivateType = (this.ALL_FLAGS & 0x100) != 0x0;
        if (newPrivateType) {
            this.ALL_FLAGS |= 0x100;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFEFF;
        }
        final boolean oldPrivateTypeESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, oldPrivateType, newPrivateType, !oldPrivateTypeESet));
        }
    }
    
    public void unsetPrivateType() {
        final boolean oldPrivateType = (this.ALL_FLAGS & 0x100) != 0x0;
        final boolean oldPrivateTypeESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, oldPrivateType, false, oldPrivateTypeESet));
        }
    }
    
    public boolean isSetPrivateType() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public boolean isBothType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setBothType(final boolean newBothType) {
        final boolean oldBothType = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newBothType) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldBothTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldBothType, newBothType, !oldBothTypeESet));
        }
    }
    
    public void unsetBothType() {
        final boolean oldBothType = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldBothTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldBothType, false, oldBothTypeESet));
        }
    }
    
    public boolean isSetBothType() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public boolean isLocalAddedType() {
        return (this.ALL_FLAGS & 0x40000) != 0x0;
    }
    
    public void setLocalAddedType(final boolean newLocalAddedType) {
        final boolean oldLocalAddedType = (this.ALL_FLAGS & 0x40000) != 0x0;
        if (newLocalAddedType) {
            this.ALL_FLAGS |= 0x40000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFBFFFF;
        }
        final boolean oldLocalAddedTypeESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.ALL_FLAGS |= 0x80000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 18, oldLocalAddedType, newLocalAddedType, !oldLocalAddedTypeESet));
        }
    }
    
    public void unsetLocalAddedType() {
        final boolean oldLocalAddedType = (this.ALL_FLAGS & 0x40000) != 0x0;
        final boolean oldLocalAddedTypeESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.ALL_FLAGS &= 0xFFFBFFFF;
        this.ALL_FLAGS &= 0xFFF7FFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 18, oldLocalAddedType, false, oldLocalAddedTypeESet));
        }
    }
    
    public boolean isSetLocalAddedType() {
        return (this.ALL_FLAGS & 0x80000) != 0x0;
    }
    
    public boolean isLocalRemovedType() {
        return (this.ALL_FLAGS & 0x100000) != 0x0;
    }
    
    public void setLocalRemovedType(final boolean newLocalRemovedType) {
        final boolean oldLocalRemovedType = (this.ALL_FLAGS & 0x100000) != 0x0;
        if (newLocalRemovedType) {
            this.ALL_FLAGS |= 0x100000;
        }
        else {
            this.ALL_FLAGS &= 0xFFEFFFFF;
        }
        final boolean oldLocalRemovedTypeESet = (this.ALL_FLAGS & 0x200000) != 0x0;
        this.ALL_FLAGS |= 0x200000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 19, oldLocalRemovedType, newLocalRemovedType, !oldLocalRemovedTypeESet));
        }
    }
    
    public void unsetLocalRemovedType() {
        final boolean oldLocalRemovedType = (this.ALL_FLAGS & 0x100000) != 0x0;
        final boolean oldLocalRemovedTypeESet = (this.ALL_FLAGS & 0x200000) != 0x0;
        this.ALL_FLAGS &= 0xFFEFFFFF;
        this.ALL_FLAGS &= 0xFFDFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 19, oldLocalRemovedType, false, oldLocalRemovedTypeESet));
        }
    }
    
    public boolean isSetLocalRemovedType() {
        return (this.ALL_FLAGS & 0x200000) != 0x0;
    }
    
    public boolean isIslocalStream() {
        return (this.ALL_FLAGS & 0x400000) != 0x0;
    }
    
    public void setIslocalStream(final boolean newIslocalStream) {
        final boolean oldIslocalStream = (this.ALL_FLAGS & 0x400000) != 0x0;
        if (newIslocalStream) {
            this.ALL_FLAGS |= 0x400000;
        }
        else {
            this.ALL_FLAGS &= 0xFFBFFFFF;
        }
        final boolean oldIslocalStreamESet = (this.ALL_FLAGS & 0x800000) != 0x0;
        this.ALL_FLAGS |= 0x800000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 20, oldIslocalStream, newIslocalStream, !oldIslocalStreamESet));
        }
    }
    
    public void unsetIslocalStream() {
        final boolean oldIslocalStream = (this.ALL_FLAGS & 0x400000) != 0x0;
        final boolean oldIslocalStreamESet = (this.ALL_FLAGS & 0x800000) != 0x0;
        this.ALL_FLAGS &= 0xFFBFFFFF;
        this.ALL_FLAGS &= 0xFF7FFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 20, oldIslocalStream, false, oldIslocalStreamESet));
        }
    }
    
    public boolean isSetIslocalStream() {
        return (this.ALL_FLAGS & 0x800000) != 0x0;
    }
    
    public boolean isTargetAddedType() {
        return (this.ALL_FLAGS & 0x40000000) != 0x0;
    }
    
    public void setTargetAddedType(final boolean newTargetAddedType) {
        final boolean oldTargetAddedType = (this.ALL_FLAGS & 0x40000000) != 0x0;
        if (newTargetAddedType) {
            this.ALL_FLAGS |= 0x40000000;
        }
        else {
            this.ALL_FLAGS &= 0xBFFFFFFF;
        }
        final boolean oldTargetAddedTypeESet = (this.ALL_FLAGS & Integer.MIN_VALUE) != 0x0;
        this.ALL_FLAGS |= Integer.MIN_VALUE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 26, oldTargetAddedType, newTargetAddedType, !oldTargetAddedTypeESet));
        }
    }
    
    public void unsetTargetAddedType() {
        final boolean oldTargetAddedType = (this.ALL_FLAGS & 0x40000000) != 0x0;
        final boolean oldTargetAddedTypeESet = (this.ALL_FLAGS & Integer.MIN_VALUE) != 0x0;
        this.ALL_FLAGS &= 0xBFFFFFFF;
        this.ALL_FLAGS &= Integer.MAX_VALUE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 26, oldTargetAddedType, false, oldTargetAddedTypeESet));
        }
    }
    
    public boolean isSetTargetAddedType() {
        return (this.ALL_FLAGS & Integer.MIN_VALUE) != 0x0;
    }
    
    public boolean isTargetRemovedType() {
        return (this.ALL_FLAGS1 & 0x1) != 0x0;
    }
    
    public void setTargetRemovedType(final boolean newTargetRemovedType) {
        final boolean oldTargetRemovedType = (this.ALL_FLAGS1 & 0x1) != 0x0;
        if (newTargetRemovedType) {
            this.ALL_FLAGS1 |= 0x1;
        }
        else {
            this.ALL_FLAGS1 &= 0xFFFFFFFE;
        }
        final boolean oldTargetRemovedTypeESet = (this.ALL_FLAGS1 & 0x2) != 0x0;
        this.ALL_FLAGS1 |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 27, oldTargetRemovedType, newTargetRemovedType, !oldTargetRemovedTypeESet));
        }
    }
    
    public void unsetTargetRemovedType() {
        final boolean oldTargetRemovedType = (this.ALL_FLAGS1 & 0x1) != 0x0;
        final boolean oldTargetRemovedTypeESet = (this.ALL_FLAGS1 & 0x2) != 0x0;
        this.ALL_FLAGS1 &= 0xFFFFFFFE;
        this.ALL_FLAGS1 &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 27, oldTargetRemovedType, false, oldTargetRemovedTypeESet));
        }
    }
    
    public boolean isSetTargetRemovedType() {
        return (this.ALL_FLAGS1 & 0x2) != 0x0;
    }
    
    public boolean isReplaced() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public void setReplaced(final boolean newReplaced) {
        final boolean oldReplaced = (this.ALL_FLAGS & 0x400) != 0x0;
        if (newReplaced) {
            this.ALL_FLAGS |= 0x400;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFBFF;
        }
        final boolean oldReplacedESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, oldReplaced, newReplaced, !oldReplacedESet));
        }
    }
    
    public void unsetReplaced() {
        final boolean oldReplaced = (this.ALL_FLAGS & 0x400) != 0x0;
        final boolean oldReplacedESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, oldReplaced, false, oldReplacedESet));
        }
    }
    
    public boolean isSetReplaced() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public boolean isLoaded() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public void setLoaded(final boolean newLoaded) {
        final boolean oldLoaded = (this.ALL_FLAGS & 0x40) != 0x0;
        if (newLoaded) {
            this.ALL_FLAGS |= 0x40;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFBF;
        }
        final boolean oldLoadedESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, oldLoaded, newLoaded, !oldLoadedESet));
        }
    }
    
    public void unsetLoaded() {
        final boolean oldLoaded = (this.ALL_FLAGS & 0x40) != 0x0;
        final boolean oldLoadedESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, oldLoaded, false, oldLoadedESet));
        }
    }
    
    public boolean isSetLoaded() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 5: {
                return ((InternalEList)this.getIncomingBaselines()).basicRemove((Object)otherEnd, msgs);
            }
            case 6: {
                return ((InternalEList)this.getIncomingChangeSetsAfterBasis()).basicRemove((Object)otherEnd, msgs);
            }
            case 7: {
                return ((InternalEList)this.getOutgoingBaselines()).basicRemove((Object)otherEnd, msgs);
            }
            case 8: {
                return ((InternalEList)this.getOutgoingChangeSetsAfterBasis()).basicRemove((Object)otherEnd, msgs);
            }
            case 12: {
                return ((InternalEList)this.getSuspended()).basicRemove((Object)otherEnd, msgs);
            }
            case 29: {
                return ((InternalEList)this.getUnresolved()).basicRemove((Object)otherEnd, msgs);
            }
            case 32: {
                return this.basicUnsetLocalBaseline(msgs);
            }
            case 33: {
                return this.basicUnsetRemoteBaseline(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isBothType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.getComponentName();
            }
            case 2: {
                return this.getComponentItemId();
            }
            case 3: {
                return this.getCurrentOutgoingChangeSetItemId();
            }
            case 4: {
                return new Integer(this.getId());
            }
            case 5: {
                return this.getIncomingBaselines();
            }
            case 6: {
                return this.getIncomingChangeSetsAfterBasis();
            }
            case 7: {
                return this.getOutgoingBaselines();
            }
            case 8: {
                return this.getOutgoingChangeSetsAfterBasis();
            }
            case 9: {
                return this.isLoaded() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 10: {
                return this.isPrivateType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 11: {
                return this.isReplaced() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 12: {
                return this.getSuspended();
            }
            case 13: {
                return this.getLocalRepositoryId();
            }
            case 14: {
                return this.getLocalRepositoryUrl();
            }
            case 15: {
                return this.isLocalRepositoryLoggedIn() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 16: {
                return this.getLocalWorkspaceItemId();
            }
            case 17: {
                return this.getLocalWorkspaceName();
            }
            case 18: {
                return this.isLocalAddedType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 19: {
                return this.isLocalRemovedType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 20: {
                return this.isIslocalStream() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 21: {
                return this.getTargetRepositoryId();
            }
            case 22: {
                return this.getTargetRepositoryUrl();
            }
            case 23: {
                return this.isTargetRepositoryLoggedIn() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 24: {
                return this.getTargetWorkspaceItemId();
            }
            case 25: {
                return this.getTargetWorkspaceName();
            }
            case 26: {
                return this.isTargetAddedType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 27: {
                return this.isTargetRemovedType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 28: {
                return this.isIsTargetStream() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 29: {
                return this.getUnresolved();
            }
            case 30: {
                if (resolve) {
                    return this.getCurrentPatch();
                }
                return this.basicGetCurrentPatch();
            }
            case 31: {
                return new Long(this.getAcceptQueueSize());
            }
            case 32: {
                return this.getLocalBaseline();
            }
            case 33: {
                return this.getRemoteBaseline();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setBothType((boolean)newValue);
            }
            case 1: {
                this.setComponentName((String)newValue);
            }
            case 2: {
                this.setComponentItemId((String)newValue);
            }
            case 3: {
                this.setCurrentOutgoingChangeSetItemId((String)newValue);
            }
            case 4: {
                this.setId((int)newValue);
            }
            case 5: {
                this.getIncomingBaselines().clear();
                this.getIncomingBaselines().addAll((Collection)newValue);
            }
            case 6: {
                this.getIncomingChangeSetsAfterBasis().clear();
                this.getIncomingChangeSetsAfterBasis().addAll((Collection)newValue);
            }
            case 7: {
                this.getOutgoingBaselines().clear();
                this.getOutgoingBaselines().addAll((Collection)newValue);
            }
            case 8: {
                this.getOutgoingChangeSetsAfterBasis().clear();
                this.getOutgoingChangeSetsAfterBasis().addAll((Collection)newValue);
            }
            case 9: {
                this.setLoaded((boolean)newValue);
            }
            case 10: {
                this.setPrivateType((boolean)newValue);
            }
            case 11: {
                this.setReplaced((boolean)newValue);
            }
            case 12: {
                this.getSuspended().clear();
                this.getSuspended().addAll((Collection)newValue);
            }
            case 13: {
                this.setLocalRepositoryId((String)newValue);
            }
            case 14: {
                this.setLocalRepositoryUrl((String)newValue);
            }
            case 15: {
                this.setLocalRepositoryLoggedIn((boolean)newValue);
            }
            case 16: {
                this.setLocalWorkspaceItemId((String)newValue);
            }
            case 17: {
                this.setLocalWorkspaceName((String)newValue);
            }
            case 18: {
                this.setLocalAddedType((boolean)newValue);
            }
            case 19: {
                this.setLocalRemovedType((boolean)newValue);
            }
            case 20: {
                this.setIslocalStream((boolean)newValue);
            }
            case 21: {
                this.setTargetRepositoryId((String)newValue);
            }
            case 22: {
                this.setTargetRepositoryUrl((String)newValue);
            }
            case 23: {
                this.setTargetRepositoryLoggedIn((boolean)newValue);
            }
            case 24: {
                this.setTargetWorkspaceItemId((String)newValue);
            }
            case 25: {
                this.setTargetWorkspaceName((String)newValue);
            }
            case 26: {
                this.setTargetAddedType((boolean)newValue);
            }
            case 27: {
                this.setTargetRemovedType((boolean)newValue);
            }
            case 28: {
                this.setIsTargetStream((boolean)newValue);
            }
            case 29: {
                this.getUnresolved().clear();
                this.getUnresolved().addAll((Collection)newValue);
            }
            case 30: {
                this.setCurrentPatch((CurrentPatchDTO)newValue);
            }
            case 31: {
                this.setAcceptQueueSize((long)newValue);
            }
            case 32: {
                this.setLocalBaseline((BaselineSyncDTO)newValue);
            }
            case 33: {
                this.setRemoteBaseline((BaselineSyncDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBothType();
            }
            case 1: {
                this.unsetComponentName();
            }
            case 2: {
                this.unsetComponentItemId();
            }
            case 3: {
                this.unsetCurrentOutgoingChangeSetItemId();
            }
            case 4: {
                this.unsetId();
            }
            case 5: {
                this.unsetIncomingBaselines();
            }
            case 6: {
                this.unsetIncomingChangeSetsAfterBasis();
            }
            case 7: {
                this.unsetOutgoingBaselines();
            }
            case 8: {
                this.unsetOutgoingChangeSetsAfterBasis();
            }
            case 9: {
                this.unsetLoaded();
            }
            case 10: {
                this.unsetPrivateType();
            }
            case 11: {
                this.unsetReplaced();
            }
            case 12: {
                this.unsetSuspended();
            }
            case 13: {
                this.unsetLocalRepositoryId();
            }
            case 14: {
                this.unsetLocalRepositoryUrl();
            }
            case 15: {
                this.unsetLocalRepositoryLoggedIn();
            }
            case 16: {
                this.unsetLocalWorkspaceItemId();
            }
            case 17: {
                this.unsetLocalWorkspaceName();
            }
            case 18: {
                this.unsetLocalAddedType();
            }
            case 19: {
                this.unsetLocalRemovedType();
            }
            case 20: {
                this.unsetIslocalStream();
            }
            case 21: {
                this.unsetTargetRepositoryId();
            }
            case 22: {
                this.unsetTargetRepositoryUrl();
            }
            case 23: {
                this.unsetTargetRepositoryLoggedIn();
            }
            case 24: {
                this.unsetTargetWorkspaceItemId();
            }
            case 25: {
                this.unsetTargetWorkspaceName();
            }
            case 26: {
                this.unsetTargetAddedType();
            }
            case 27: {
                this.unsetTargetRemovedType();
            }
            case 28: {
                this.unsetIsTargetStream();
            }
            case 29: {
                this.unsetUnresolved();
            }
            case 30: {
                this.unsetCurrentPatch();
            }
            case 31: {
                this.unsetAcceptQueueSize();
            }
            case 32: {
                this.unsetLocalBaseline();
            }
            case 33: {
                this.unsetRemoteBaseline();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBothType();
            }
            case 1: {
                return this.isSetComponentName();
            }
            case 2: {
                return this.isSetComponentItemId();
            }
            case 3: {
                return this.isSetCurrentOutgoingChangeSetItemId();
            }
            case 4: {
                return this.isSetId();
            }
            case 5: {
                return this.isSetIncomingBaselines();
            }
            case 6: {
                return this.isSetIncomingChangeSetsAfterBasis();
            }
            case 7: {
                return this.isSetOutgoingBaselines();
            }
            case 8: {
                return this.isSetOutgoingChangeSetsAfterBasis();
            }
            case 9: {
                return this.isSetLoaded();
            }
            case 10: {
                return this.isSetPrivateType();
            }
            case 11: {
                return this.isSetReplaced();
            }
            case 12: {
                return this.isSetSuspended();
            }
            case 13: {
                return this.isSetLocalRepositoryId();
            }
            case 14: {
                return this.isSetLocalRepositoryUrl();
            }
            case 15: {
                return this.isSetLocalRepositoryLoggedIn();
            }
            case 16: {
                return this.isSetLocalWorkspaceItemId();
            }
            case 17: {
                return this.isSetLocalWorkspaceName();
            }
            case 18: {
                return this.isSetLocalAddedType();
            }
            case 19: {
                return this.isSetLocalRemovedType();
            }
            case 20: {
                return this.isSetIslocalStream();
            }
            case 21: {
                return this.isSetTargetRepositoryId();
            }
            case 22: {
                return this.isSetTargetRepositoryUrl();
            }
            case 23: {
                return this.isSetTargetRepositoryLoggedIn();
            }
            case 24: {
                return this.isSetTargetWorkspaceItemId();
            }
            case 25: {
                return this.isSetTargetWorkspaceName();
            }
            case 26: {
                return this.isSetTargetAddedType();
            }
            case 27: {
                return this.isSetTargetRemovedType();
            }
            case 28: {
                return this.isSetIsTargetStream();
            }
            case 29: {
                return this.isSetUnresolved();
            }
            case 30: {
                return this.isSetCurrentPatch();
            }
            case 31: {
                return this.isSetAcceptQueueSize();
            }
            case 32: {
                return this.isSetLocalBaseline();
            }
            case 33: {
                return this.isSetRemoteBaseline();
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
        result.append(" (bothType: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentName: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.componentName);
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
        result.append(", currentOutgoingChangeSetItemId: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.currentOutgoingChangeSetItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", id: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", loaded: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append((this.ALL_FLAGS & 0x40) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", privateType: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append((this.ALL_FLAGS & 0x100) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", replaced: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append((this.ALL_FLAGS & 0x400) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", localRepositoryId: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append(this.localRepositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", localRepositoryUrl: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append(this.localRepositoryUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(", localRepositoryLoggedIn: ");
        if ((this.ALL_FLAGS & 0x8000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", localWorkspaceItemId: ");
        if ((this.ALL_FLAGS & 0x10000) != 0x0) {
            result.append(this.localWorkspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", localWorkspaceName: ");
        if ((this.ALL_FLAGS & 0x20000) != 0x0) {
            result.append(this.localWorkspaceName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", localAddedType: ");
        if ((this.ALL_FLAGS & 0x80000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x40000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", localRemovedType: ");
        if ((this.ALL_FLAGS & 0x200000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x100000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", islocalStream: ");
        if ((this.ALL_FLAGS & 0x800000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x400000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRepositoryId: ");
        if ((this.ALL_FLAGS & 0x1000000) != 0x0) {
            result.append(this.targetRepositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRepositoryUrl: ");
        if ((this.ALL_FLAGS & 0x2000000) != 0x0) {
            result.append(this.targetRepositoryUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRepositoryLoggedIn: ");
        if ((this.ALL_FLAGS & 0x8000000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4000000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetWorkspaceItemId: ");
        if ((this.ALL_FLAGS & 0x10000000) != 0x0) {
            result.append(this.targetWorkspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetWorkspaceName: ");
        if ((this.ALL_FLAGS & 0x20000000) != 0x0) {
            result.append(this.targetWorkspaceName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetAddedType: ");
        if ((this.ALL_FLAGS & Integer.MIN_VALUE) != 0x0) {
            result.append((this.ALL_FLAGS & 0x40000000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRemovedType: ");
        if ((this.ALL_FLAGS1 & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS1 & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", isTargetStream: ");
        if ((this.ALL_FLAGS1 & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS1 & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", acceptQueueSize: ");
        if ((this.ALL_FLAGS1 & 0x20) != 0x0) {
            result.append(this.acceptQueueSize);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
