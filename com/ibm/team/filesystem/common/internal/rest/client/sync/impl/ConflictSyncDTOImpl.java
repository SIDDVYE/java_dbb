// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ConflictSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ConflictSyncDTOImpl extends EObjectImpl implements ConflictSyncDTO
{
    protected int ALL_FLAGS;
    protected static final String COMMON_ANCESTOR_VERSIONABLE_STATE_ID_EDEFAULT;
    protected String commonAncestorVersionableStateId;
    protected static final int COMMON_ANCESTOR_VERSIONABLE_STATE_ID_ESETFLAG = 1;
    protected static final String CONFLICT_TYPE_EDEFAULT;
    protected String conflictType;
    protected static final int CONFLICT_TYPE_ESETFLAG = 2;
    protected static final String CONFLICT_TYPE_OUTGOING_EDEFAULT;
    protected String conflictTypeOutgoing;
    protected static final int CONFLICT_TYPE_OUTGOING_ESETFLAG = 4;
    protected static final String CONFLICT_TYPE_PROPOSED_EDEFAULT;
    protected String conflictTypeProposed;
    protected static final int CONFLICT_TYPE_PROPOSED_ESETFLAG = 8;
    protected static final boolean CONTENT_CONFLICT_EDEFAULT = false;
    protected static final int CONTENT_CONFLICT_EFLAG = 16;
    protected static final int CONTENT_CONFLICT_ESETFLAG = 32;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 64;
    protected static final String KIND_EDEFAULT;
    protected String kind;
    protected static final int KIND_ESETFLAG = 128;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 256;
    protected static final String NEW_PATH_HINT_EDEFAULT;
    protected String newPathHint;
    protected static final int NEW_PATH_HINT_ESETFLAG = 512;
    protected static final String ORIGINAL_SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
    protected String originalSelectedContributorVersionableStateId;
    protected static final int ORIGINAL_SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_ESETFLAG = 1024;
    protected static final String PATH_HINT_EDEFAULT;
    protected String pathHint;
    protected static final int PATH_HINT_ESETFLAG = 2048;
    protected static final boolean PROPERTY_CONFLICT_EDEFAULT = false;
    protected static final int PROPERTY_CONFLICT_EFLAG = 4096;
    protected static final int PROPERTY_CONFLICT_ESETFLAG = 8192;
    protected static final String PROPOSED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
    protected String proposedContributorVersionableStateId;
    protected static final int PROPOSED_CONTRIBUTOR_VERSIONABLE_STATE_ID_ESETFLAG = 16384;
    protected static final String SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
    protected String selectedContributorVersionableStateId;
    protected static final int SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_ESETFLAG = 32768;
    protected static final String VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String versionableItemId;
    protected static final int VERSIONABLE_ITEM_ID_ESETFLAG = 65536;
    protected static final String VERSIONABLE_ITEM_TYPE_EDEFAULT;
    protected String versionableItemType;
    protected static final int VERSIONABLE_ITEM_TYPE_ESETFLAG = 131072;
    
    static {
        COMMON_ANCESTOR_VERSIONABLE_STATE_ID_EDEFAULT = null;
        CONFLICT_TYPE_EDEFAULT = null;
        CONFLICT_TYPE_OUTGOING_EDEFAULT = null;
        CONFLICT_TYPE_PROPOSED_EDEFAULT = null;
        KIND_EDEFAULT = null;
        NAME_EDEFAULT = null;
        NEW_PATH_HINT_EDEFAULT = null;
        ORIGINAL_SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT = null;
        PATH_HINT_EDEFAULT = null;
        PROPOSED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT = null;
        SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_TYPE_EDEFAULT = null;
    }
    
    protected ConflictSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.commonAncestorVersionableStateId = ConflictSyncDTOImpl.COMMON_ANCESTOR_VERSIONABLE_STATE_ID_EDEFAULT;
        this.conflictType = ConflictSyncDTOImpl.CONFLICT_TYPE_EDEFAULT;
        this.conflictTypeOutgoing = ConflictSyncDTOImpl.CONFLICT_TYPE_OUTGOING_EDEFAULT;
        this.conflictTypeProposed = ConflictSyncDTOImpl.CONFLICT_TYPE_PROPOSED_EDEFAULT;
        this.id = 0;
        this.kind = ConflictSyncDTOImpl.KIND_EDEFAULT;
        this.name = ConflictSyncDTOImpl.NAME_EDEFAULT;
        this.newPathHint = ConflictSyncDTOImpl.NEW_PATH_HINT_EDEFAULT;
        this.originalSelectedContributorVersionableStateId = ConflictSyncDTOImpl.ORIGINAL_SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
        this.pathHint = ConflictSyncDTOImpl.PATH_HINT_EDEFAULT;
        this.proposedContributorVersionableStateId = ConflictSyncDTOImpl.PROPOSED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
        this.selectedContributorVersionableStateId = ConflictSyncDTOImpl.SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
        this.versionableItemId = ConflictSyncDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.versionableItemType = ConflictSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.CONFLICT_SYNC_DTO;
    }
    
    public String getPathHint() {
        return this.pathHint;
    }
    
    public void setPathHint(final String newPathHint) {
        final String oldPathHint = this.pathHint;
        this.pathHint = newPathHint;
        final boolean oldPathHintESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, (Object)oldPathHint, (Object)this.pathHint, !oldPathHintESet));
        }
    }
    
    public void unsetPathHint() {
        final String oldPathHint = this.pathHint;
        final boolean oldPathHintESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.pathHint = ConflictSyncDTOImpl.PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, (Object)oldPathHint, (Object)ConflictSyncDTOImpl.PATH_HINT_EDEFAULT, oldPathHintESet));
        }
    }
    
    public boolean isSetPathHint() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public String getVersionableItemId() {
        return this.versionableItemId;
    }
    
    public void setVersionableItemId(final String newVersionableItemId) {
        final String oldVersionableItemId = this.versionableItemId;
        this.versionableItemId = newVersionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS |= 0x10000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 14, (Object)oldVersionableItemId, (Object)this.versionableItemId, !oldVersionableItemIdESet));
        }
    }
    
    public void unsetVersionableItemId() {
        final String oldVersionableItemId = this.versionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.versionableItemId = ConflictSyncDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFEFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 14, (Object)oldVersionableItemId, (Object)ConflictSyncDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT, oldVersionableItemIdESet));
        }
    }
    
    public boolean isSetVersionableItemId() {
        return (this.ALL_FLAGS & 0x10000) != 0x0;
    }
    
    public String getVersionableItemType() {
        return this.versionableItemType;
    }
    
    public void setVersionableItemType(final String newVersionableItemType) {
        final String oldVersionableItemType = this.versionableItemType;
        this.versionableItemType = newVersionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.ALL_FLAGS |= 0x20000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 15, (Object)oldVersionableItemType, (Object)this.versionableItemType, !oldVersionableItemTypeESet));
        }
    }
    
    public void unsetVersionableItemType() {
        final String oldVersionableItemType = this.versionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.versionableItemType = ConflictSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFDFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 15, (Object)oldVersionableItemType, (Object)ConflictSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT, oldVersionableItemTypeESet));
        }
    }
    
    public boolean isSetVersionableItemType() {
        return (this.ALL_FLAGS & 0x20000) != 0x0;
    }
    
    public String getConflictTypeOutgoing() {
        return this.conflictTypeOutgoing;
    }
    
    public void setConflictTypeOutgoing(final String newConflictTypeOutgoing) {
        final String oldConflictTypeOutgoing = this.conflictTypeOutgoing;
        this.conflictTypeOutgoing = newConflictTypeOutgoing;
        final boolean oldConflictTypeOutgoingESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldConflictTypeOutgoing, (Object)this.conflictTypeOutgoing, !oldConflictTypeOutgoingESet));
        }
    }
    
    public void unsetConflictTypeOutgoing() {
        final String oldConflictTypeOutgoing = this.conflictTypeOutgoing;
        final boolean oldConflictTypeOutgoingESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.conflictTypeOutgoing = ConflictSyncDTOImpl.CONFLICT_TYPE_OUTGOING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldConflictTypeOutgoing, (Object)ConflictSyncDTOImpl.CONFLICT_TYPE_OUTGOING_EDEFAULT, oldConflictTypeOutgoingESet));
        }
    }
    
    public boolean isSetConflictTypeOutgoing() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getConflictTypeProposed() {
        return this.conflictTypeProposed;
    }
    
    public void setConflictTypeProposed(final String newConflictTypeProposed) {
        final String oldConflictTypeProposed = this.conflictTypeProposed;
        this.conflictTypeProposed = newConflictTypeProposed;
        final boolean oldConflictTypeProposedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldConflictTypeProposed, (Object)this.conflictTypeProposed, !oldConflictTypeProposedESet));
        }
    }
    
    public void unsetConflictTypeProposed() {
        final String oldConflictTypeProposed = this.conflictTypeProposed;
        final boolean oldConflictTypeProposedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.conflictTypeProposed = ConflictSyncDTOImpl.CONFLICT_TYPE_PROPOSED_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldConflictTypeProposed, (Object)ConflictSyncDTOImpl.CONFLICT_TYPE_PROPOSED_EDEFAULT, oldConflictTypeProposedESet));
        }
    }
    
    public boolean isSetConflictTypeProposed() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getNewPathHint() {
        return this.newPathHint;
    }
    
    public void setNewPathHint(final String newNewPathHint) {
        final String oldNewPathHint = this.newPathHint;
        this.newPathHint = newNewPathHint;
        final boolean oldNewPathHintESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldNewPathHint, (Object)this.newPathHint, !oldNewPathHintESet));
        }
    }
    
    public void unsetNewPathHint() {
        final String oldNewPathHint = this.newPathHint;
        final boolean oldNewPathHintESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.newPathHint = ConflictSyncDTOImpl.NEW_PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldNewPathHint, (Object)ConflictSyncDTOImpl.NEW_PATH_HINT_EDEFAULT, oldNewPathHintESet));
        }
    }
    
    public boolean isSetNewPathHint() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.name = ConflictSyncDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldName, (Object)ConflictSyncDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public String getCommonAncestorVersionableStateId() {
        return this.commonAncestorVersionableStateId;
    }
    
    public void setCommonAncestorVersionableStateId(final String newCommonAncestorVersionableStateId) {
        final String oldCommonAncestorVersionableStateId = this.commonAncestorVersionableStateId;
        this.commonAncestorVersionableStateId = newCommonAncestorVersionableStateId;
        final boolean oldCommonAncestorVersionableStateIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldCommonAncestorVersionableStateId, (Object)this.commonAncestorVersionableStateId, !oldCommonAncestorVersionableStateIdESet));
        }
    }
    
    public void unsetCommonAncestorVersionableStateId() {
        final String oldCommonAncestorVersionableStateId = this.commonAncestorVersionableStateId;
        final boolean oldCommonAncestorVersionableStateIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.commonAncestorVersionableStateId = ConflictSyncDTOImpl.COMMON_ANCESTOR_VERSIONABLE_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldCommonAncestorVersionableStateId, (Object)ConflictSyncDTOImpl.COMMON_ANCESTOR_VERSIONABLE_STATE_ID_EDEFAULT, oldCommonAncestorVersionableStateIdESet));
        }
    }
    
    public boolean isSetCommonAncestorVersionableStateId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getSelectedContributorVersionableStateId() {
        return this.selectedContributorVersionableStateId;
    }
    
    public void setSelectedContributorVersionableStateId(final String newSelectedContributorVersionableStateId) {
        final String oldSelectedContributorVersionableStateId = this.selectedContributorVersionableStateId;
        this.selectedContributorVersionableStateId = newSelectedContributorVersionableStateId;
        final boolean oldSelectedContributorVersionableStateIdESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS |= 0x8000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldSelectedContributorVersionableStateId, (Object)this.selectedContributorVersionableStateId, !oldSelectedContributorVersionableStateIdESet));
        }
    }
    
    public void unsetSelectedContributorVersionableStateId() {
        final String oldSelectedContributorVersionableStateId = this.selectedContributorVersionableStateId;
        final boolean oldSelectedContributorVersionableStateIdESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.selectedContributorVersionableStateId = ConflictSyncDTOImpl.SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldSelectedContributorVersionableStateId, (Object)ConflictSyncDTOImpl.SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT, oldSelectedContributorVersionableStateIdESet));
        }
    }
    
    public boolean isSetSelectedContributorVersionableStateId() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    public String getOriginalSelectedContributorVersionableStateId() {
        return this.originalSelectedContributorVersionableStateId;
    }
    
    public void setOriginalSelectedContributorVersionableStateId(final String newOriginalSelectedContributorVersionableStateId) {
        final String oldOriginalSelectedContributorVersionableStateId = this.originalSelectedContributorVersionableStateId;
        this.originalSelectedContributorVersionableStateId = newOriginalSelectedContributorVersionableStateId;
        final boolean oldOriginalSelectedContributorVersionableStateIdESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldOriginalSelectedContributorVersionableStateId, (Object)this.originalSelectedContributorVersionableStateId, !oldOriginalSelectedContributorVersionableStateIdESet));
        }
    }
    
    public void unsetOriginalSelectedContributorVersionableStateId() {
        final String oldOriginalSelectedContributorVersionableStateId = this.originalSelectedContributorVersionableStateId;
        final boolean oldOriginalSelectedContributorVersionableStateIdESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.originalSelectedContributorVersionableStateId = ConflictSyncDTOImpl.ORIGINAL_SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldOriginalSelectedContributorVersionableStateId, (Object)ConflictSyncDTOImpl.ORIGINAL_SELECTED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT, oldOriginalSelectedContributorVersionableStateIdESet));
        }
    }
    
    public boolean isSetOriginalSelectedContributorVersionableStateId() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public String getProposedContributorVersionableStateId() {
        return this.proposedContributorVersionableStateId;
    }
    
    public void setProposedContributorVersionableStateId(final String newProposedContributorVersionableStateId) {
        final String oldProposedContributorVersionableStateId = this.proposedContributorVersionableStateId;
        this.proposedContributorVersionableStateId = newProposedContributorVersionableStateId;
        final boolean oldProposedContributorVersionableStateIdESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, (Object)oldProposedContributorVersionableStateId, (Object)this.proposedContributorVersionableStateId, !oldProposedContributorVersionableStateIdESet));
        }
    }
    
    public void unsetProposedContributorVersionableStateId() {
        final String oldProposedContributorVersionableStateId = this.proposedContributorVersionableStateId;
        final boolean oldProposedContributorVersionableStateIdESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.proposedContributorVersionableStateId = ConflictSyncDTOImpl.PROPOSED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, (Object)oldProposedContributorVersionableStateId, (Object)ConflictSyncDTOImpl.PROPOSED_CONTRIBUTOR_VERSIONABLE_STATE_ID_EDEFAULT, oldProposedContributorVersionableStateIdESet));
        }
    }
    
    public boolean isSetProposedContributorVersionableStateId() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public String getKind() {
        return this.kind;
    }
    
    public void setKind(final String newKind) {
        final String oldKind = this.kind;
        this.kind = newKind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldKind, (Object)this.kind, !oldKindESet));
        }
    }
    
    public void unsetKind() {
        final String oldKind = this.kind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.kind = ConflictSyncDTOImpl.KIND_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldKind, (Object)ConflictSyncDTOImpl.KIND_EDEFAULT, oldKindESet));
        }
    }
    
    public boolean isSetKind() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public String getConflictType() {
        return this.conflictType;
    }
    
    public void setConflictType(final String newConflictType) {
        final String oldConflictType = this.conflictType;
        this.conflictType = newConflictType;
        final boolean oldConflictTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldConflictType, (Object)this.conflictType, !oldConflictTypeESet));
        }
    }
    
    public void unsetConflictType() {
        final String oldConflictType = this.conflictType;
        final boolean oldConflictTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.conflictType = ConflictSyncDTOImpl.CONFLICT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldConflictType, (Object)ConflictSyncDTOImpl.CONFLICT_TYPE_EDEFAULT, oldConflictTypeESet));
        }
    }
    
    public boolean isSetConflictType() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public boolean isContentConflict() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public void setContentConflict(final boolean newContentConflict) {
        final boolean oldContentConflict = (this.ALL_FLAGS & 0x10) != 0x0;
        if (newContentConflict) {
            this.ALL_FLAGS |= 0x10;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFEF;
        }
        final boolean oldContentConflictESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldContentConflict, newContentConflict, !oldContentConflictESet));
        }
    }
    
    public void unsetContentConflict() {
        final boolean oldContentConflict = (this.ALL_FLAGS & 0x10) != 0x0;
        final boolean oldContentConflictESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldContentConflict, false, oldContentConflictESet));
        }
    }
    
    public boolean isSetContentConflict() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public boolean isPropertyConflict() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public void setPropertyConflict(final boolean newPropertyConflict) {
        final boolean oldPropertyConflict = (this.ALL_FLAGS & 0x1000) != 0x0;
        if (newPropertyConflict) {
            this.ALL_FLAGS |= 0x1000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFEFFF;
        }
        final boolean oldPropertyConflictESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, oldPropertyConflict, newPropertyConflict, !oldPropertyConflictESet));
        }
    }
    
    public void unsetPropertyConflict() {
        final boolean oldPropertyConflict = (this.ALL_FLAGS & 0x1000) != 0x0;
        final boolean oldPropertyConflictESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, oldPropertyConflict, false, oldPropertyConflictESet));
        }
    }
    
    public boolean isSetPropertyConflict() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getCommonAncestorVersionableStateId();
            }
            case 1: {
                return this.getConflictType();
            }
            case 2: {
                return this.getConflictTypeOutgoing();
            }
            case 3: {
                return this.getConflictTypeProposed();
            }
            case 4: {
                return this.isContentConflict() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return new Integer(this.getId());
            }
            case 6: {
                return this.getKind();
            }
            case 7: {
                return this.getName();
            }
            case 8: {
                return this.getNewPathHint();
            }
            case 9: {
                return this.getOriginalSelectedContributorVersionableStateId();
            }
            case 10: {
                return this.getPathHint();
            }
            case 11: {
                return this.isPropertyConflict() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 12: {
                return this.getProposedContributorVersionableStateId();
            }
            case 13: {
                return this.getSelectedContributorVersionableStateId();
            }
            case 14: {
                return this.getVersionableItemId();
            }
            case 15: {
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
                this.setCommonAncestorVersionableStateId((String)newValue);
            }
            case 1: {
                this.setConflictType((String)newValue);
            }
            case 2: {
                this.setConflictTypeOutgoing((String)newValue);
            }
            case 3: {
                this.setConflictTypeProposed((String)newValue);
            }
            case 4: {
                this.setContentConflict((boolean)newValue);
            }
            case 5: {
                this.setId((int)newValue);
            }
            case 6: {
                this.setKind((String)newValue);
            }
            case 7: {
                this.setName((String)newValue);
            }
            case 8: {
                this.setNewPathHint((String)newValue);
            }
            case 9: {
                this.setOriginalSelectedContributorVersionableStateId((String)newValue);
            }
            case 10: {
                this.setPathHint((String)newValue);
            }
            case 11: {
                this.setPropertyConflict((boolean)newValue);
            }
            case 12: {
                this.setProposedContributorVersionableStateId((String)newValue);
            }
            case 13: {
                this.setSelectedContributorVersionableStateId((String)newValue);
            }
            case 14: {
                this.setVersionableItemId((String)newValue);
            }
            case 15: {
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
                this.unsetCommonAncestorVersionableStateId();
            }
            case 1: {
                this.unsetConflictType();
            }
            case 2: {
                this.unsetConflictTypeOutgoing();
            }
            case 3: {
                this.unsetConflictTypeProposed();
            }
            case 4: {
                this.unsetContentConflict();
            }
            case 5: {
                this.unsetId();
            }
            case 6: {
                this.unsetKind();
            }
            case 7: {
                this.unsetName();
            }
            case 8: {
                this.unsetNewPathHint();
            }
            case 9: {
                this.unsetOriginalSelectedContributorVersionableStateId();
            }
            case 10: {
                this.unsetPathHint();
            }
            case 11: {
                this.unsetPropertyConflict();
            }
            case 12: {
                this.unsetProposedContributorVersionableStateId();
            }
            case 13: {
                this.unsetSelectedContributorVersionableStateId();
            }
            case 14: {
                this.unsetVersionableItemId();
            }
            case 15: {
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
                return this.isSetCommonAncestorVersionableStateId();
            }
            case 1: {
                return this.isSetConflictType();
            }
            case 2: {
                return this.isSetConflictTypeOutgoing();
            }
            case 3: {
                return this.isSetConflictTypeProposed();
            }
            case 4: {
                return this.isSetContentConflict();
            }
            case 5: {
                return this.isSetId();
            }
            case 6: {
                return this.isSetKind();
            }
            case 7: {
                return this.isSetName();
            }
            case 8: {
                return this.isSetNewPathHint();
            }
            case 9: {
                return this.isSetOriginalSelectedContributorVersionableStateId();
            }
            case 10: {
                return this.isSetPathHint();
            }
            case 11: {
                return this.isSetPropertyConflict();
            }
            case 12: {
                return this.isSetProposedContributorVersionableStateId();
            }
            case 13: {
                return this.isSetSelectedContributorVersionableStateId();
            }
            case 14: {
                return this.isSetVersionableItemId();
            }
            case 15: {
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
        result.append(" (commonAncestorVersionableStateId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.commonAncestorVersionableStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", conflictType: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.conflictType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", conflictTypeOutgoing: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.conflictTypeOutgoing);
        }
        else {
            result.append("<unset>");
        }
        result.append(", conflictTypeProposed: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.conflictTypeProposed);
        }
        else {
            result.append("<unset>");
        }
        result.append(", contentConflict: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", id: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", kind: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.kind);
        }
        else {
            result.append("<unset>");
        }
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", newPathHint: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.newPathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(", originalSelectedContributorVersionableStateId: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.originalSelectedContributorVersionableStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", pathHint: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.pathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(", propertyConflict: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", proposedContributorVersionableStateId: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append(this.proposedContributorVersionableStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", selectedContributorVersionableStateId: ");
        if ((this.ALL_FLAGS & 0x8000) != 0x0) {
            result.append(this.selectedContributorVersionableStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemId: ");
        if ((this.ALL_FLAGS & 0x10000) != 0x0) {
            result.append(this.versionableItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemType: ");
        if ((this.ALL_FLAGS & 0x20000) != 0x0) {
            result.append(this.versionableItemType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
