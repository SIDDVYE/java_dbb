// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ChangeSyncDTOImpl extends EObjectImpl implements ChangeSyncDTO
{
    protected int ALL_FLAGS;
    protected static final boolean ADD_TYPE_EDEFAULT = false;
    protected static final int ADD_TYPE_EFLAG = 1;
    protected static final int ADD_TYPE_ESETFLAG = 2;
    protected static final String AFTER_STATE_ID_EDEFAULT;
    protected String afterStateId;
    protected static final int AFTER_STATE_ID_ESETFLAG = 4;
    protected static final String BEFORE_STATE_ID_EDEFAULT;
    protected String beforeStateId;
    protected static final int BEFORE_STATE_ID_ESETFLAG = 8;
    protected static final boolean CONTENT_CHANGE_EDEFAULT = false;
    protected static final int CONTENT_CHANGE_EFLAG = 16;
    protected static final int CONTENT_CHANGE_ESETFLAG = 32;
    protected static final boolean DELETE_TYPE_EDEFAULT = false;
    protected static final int DELETE_TYPE_EFLAG = 64;
    protected static final int DELETE_TYPE_ESETFLAG = 128;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 256;
    protected static final String LAST_MERGE_STATE_EDEFAULT;
    protected String lastMergeState;
    protected static final int LAST_MERGE_STATE_ESETFLAG = 512;
    protected static final boolean MISSING_DETAILS_EDEFAULT = false;
    protected static final int MISSING_DETAILS_EFLAG = 1024;
    protected static final int MISSING_DETAILS_ESETFLAG = 2048;
    protected static final boolean MODIFY_TYPE_EDEFAULT = false;
    protected static final int MODIFY_TYPE_EFLAG = 4096;
    protected static final int MODIFY_TYPE_ESETFLAG = 8192;
    protected static final boolean MOVE_TYPE_EDEFAULT = false;
    protected static final int MOVE_TYPE_EFLAG = 16384;
    protected static final int MOVE_TYPE_ESETFLAG = 32768;
    protected static final String NEW_PATH_HINT_EDEFAULT;
    protected String newPathHint;
    protected static final int NEW_PATH_HINT_ESETFLAG = 65536;
    protected static final boolean NOOP_TYPE_EDEFAULT = false;
    protected static final int NOOP_TYPE_EFLAG = 131072;
    protected static final int NOOP_TYPE_ESETFLAG = 262144;
    protected static final String PATH_HINT_EDEFAULT;
    protected String pathHint;
    protected static final int PATH_HINT_ESETFLAG = 524288;
    protected static final boolean POTENTIAL_CONFLICT_EDEFAULT = false;
    protected static final int POTENTIAL_CONFLICT_EFLAG = 1048576;
    protected static final int POTENTIAL_CONFLICT_ESETFLAG = 2097152;
    protected static final boolean PROPERTY_CHANGE_EDEFAULT = false;
    protected static final int PROPERTY_CHANGE_EFLAG = 4194304;
    protected static final int PROPERTY_CHANGE_ESETFLAG = 8388608;
    protected static final int START_LINE_EDEFAULT = 0;
    protected int startLine;
    protected static final int START_LINE_ESETFLAG = 16777216;
    protected static final String VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String versionableItemId;
    protected static final int VERSIONABLE_ITEM_ID_ESETFLAG = 33554432;
    protected static final String VERSIONABLE_ITEM_TYPE_EDEFAULT;
    protected String versionableItemType;
    protected static final int VERSIONABLE_ITEM_TYPE_ESETFLAG = 67108864;
    protected static final String VERSIONABLE_NAME_EDEFAULT;
    protected String versionableName;
    protected static final int VERSIONABLE_NAME_ESETFLAG = 134217728;
    protected static final String BEFORE_PARENT_ITEM_ID_EDEFAULT;
    protected String beforeParentItemId;
    protected static final int BEFORE_PARENT_ITEM_ID_ESETFLAG = 268435456;
    protected static final String AFTER_PARENT_ITEM_ID_EDEFAULT;
    protected String afterParentItemId;
    protected static final int AFTER_PARENT_ITEM_ID_ESETFLAG = 536870912;
    protected EList mergeStates;
    
    static {
        AFTER_STATE_ID_EDEFAULT = null;
        BEFORE_STATE_ID_EDEFAULT = null;
        LAST_MERGE_STATE_EDEFAULT = null;
        NEW_PATH_HINT_EDEFAULT = null;
        PATH_HINT_EDEFAULT = null;
        VERSIONABLE_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_TYPE_EDEFAULT = null;
        VERSIONABLE_NAME_EDEFAULT = null;
        BEFORE_PARENT_ITEM_ID_EDEFAULT = null;
        AFTER_PARENT_ITEM_ID_EDEFAULT = null;
    }
    
    protected ChangeSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.afterStateId = ChangeSyncDTOImpl.AFTER_STATE_ID_EDEFAULT;
        this.beforeStateId = ChangeSyncDTOImpl.BEFORE_STATE_ID_EDEFAULT;
        this.id = 0;
        this.lastMergeState = ChangeSyncDTOImpl.LAST_MERGE_STATE_EDEFAULT;
        this.newPathHint = ChangeSyncDTOImpl.NEW_PATH_HINT_EDEFAULT;
        this.pathHint = ChangeSyncDTOImpl.PATH_HINT_EDEFAULT;
        this.startLine = 0;
        this.versionableItemId = ChangeSyncDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.versionableItemType = ChangeSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.versionableName = ChangeSyncDTOImpl.VERSIONABLE_NAME_EDEFAULT;
        this.beforeParentItemId = ChangeSyncDTOImpl.BEFORE_PARENT_ITEM_ID_EDEFAULT;
        this.afterParentItemId = ChangeSyncDTOImpl.AFTER_PARENT_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.CHANGE_SYNC_DTO;
    }
    
    public String getVersionableName() {
        return this.versionableName;
    }
    
    public void setVersionableName(final String newVersionableName) {
        final String oldVersionableName = this.versionableName;
        this.versionableName = newVersionableName;
        final boolean oldVersionableNameESet = (this.ALL_FLAGS & 0x8000000) != 0x0;
        this.ALL_FLAGS |= 0x8000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 18, (Object)oldVersionableName, (Object)this.versionableName, !oldVersionableNameESet));
        }
    }
    
    public void unsetVersionableName() {
        final String oldVersionableName = this.versionableName;
        final boolean oldVersionableNameESet = (this.ALL_FLAGS & 0x8000000) != 0x0;
        this.versionableName = ChangeSyncDTOImpl.VERSIONABLE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xF7FFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 18, (Object)oldVersionableName, (Object)ChangeSyncDTOImpl.VERSIONABLE_NAME_EDEFAULT, oldVersionableNameESet));
        }
    }
    
    public boolean isSetVersionableName() {
        return (this.ALL_FLAGS & 0x8000000) != 0x0;
    }
    
    public String getBeforeParentItemId() {
        return this.beforeParentItemId;
    }
    
    public void setBeforeParentItemId(final String newBeforeParentItemId) {
        final String oldBeforeParentItemId = this.beforeParentItemId;
        this.beforeParentItemId = newBeforeParentItemId;
        final boolean oldBeforeParentItemIdESet = (this.ALL_FLAGS & 0x10000000) != 0x0;
        this.ALL_FLAGS |= 0x10000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 19, (Object)oldBeforeParentItemId, (Object)this.beforeParentItemId, !oldBeforeParentItemIdESet));
        }
    }
    
    public void unsetBeforeParentItemId() {
        final String oldBeforeParentItemId = this.beforeParentItemId;
        final boolean oldBeforeParentItemIdESet = (this.ALL_FLAGS & 0x10000000) != 0x0;
        this.beforeParentItemId = ChangeSyncDTOImpl.BEFORE_PARENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xEFFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 19, (Object)oldBeforeParentItemId, (Object)ChangeSyncDTOImpl.BEFORE_PARENT_ITEM_ID_EDEFAULT, oldBeforeParentItemIdESet));
        }
    }
    
    public boolean isSetBeforeParentItemId() {
        return (this.ALL_FLAGS & 0x10000000) != 0x0;
    }
    
    public String getAfterParentItemId() {
        return this.afterParentItemId;
    }
    
    public void setAfterParentItemId(final String newAfterParentItemId) {
        final String oldAfterParentItemId = this.afterParentItemId;
        this.afterParentItemId = newAfterParentItemId;
        final boolean oldAfterParentItemIdESet = (this.ALL_FLAGS & 0x20000000) != 0x0;
        this.ALL_FLAGS |= 0x20000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 20, (Object)oldAfterParentItemId, (Object)this.afterParentItemId, !oldAfterParentItemIdESet));
        }
    }
    
    public void unsetAfterParentItemId() {
        final String oldAfterParentItemId = this.afterParentItemId;
        final boolean oldAfterParentItemIdESet = (this.ALL_FLAGS & 0x20000000) != 0x0;
        this.afterParentItemId = ChangeSyncDTOImpl.AFTER_PARENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xDFFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 20, (Object)oldAfterParentItemId, (Object)ChangeSyncDTOImpl.AFTER_PARENT_ITEM_ID_EDEFAULT, oldAfterParentItemIdESet));
        }
    }
    
    public boolean isSetAfterParentItemId() {
        return (this.ALL_FLAGS & 0x20000000) != 0x0;
    }
    
    public List getMergeStates() {
        if (this.mergeStates == null) {
            this.mergeStates = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 21);
        }
        return (List)this.mergeStates;
    }
    
    public void unsetMergeStates() {
        if (this.mergeStates != null) {
            ((InternalEList.Unsettable)this.mergeStates).unset();
        }
    }
    
    public boolean isSetMergeStates() {
        return this.mergeStates != null && ((InternalEList.Unsettable)this.mergeStates).isSet();
    }
    
    public String getVersionableItemId() {
        return this.versionableItemId;
    }
    
    public void setVersionableItemId(final String newVersionableItemId) {
        final String oldVersionableItemId = this.versionableItemId;
        this.versionableItemId = newVersionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x2000000) != 0x0;
        this.ALL_FLAGS |= 0x2000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 16, (Object)oldVersionableItemId, (Object)this.versionableItemId, !oldVersionableItemIdESet));
        }
    }
    
    public void unsetVersionableItemId() {
        final String oldVersionableItemId = this.versionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x2000000) != 0x0;
        this.versionableItemId = ChangeSyncDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFDFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 16, (Object)oldVersionableItemId, (Object)ChangeSyncDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT, oldVersionableItemIdESet));
        }
    }
    
    public boolean isSetVersionableItemId() {
        return (this.ALL_FLAGS & 0x2000000) != 0x0;
    }
    
    public String getVersionableItemType() {
        return this.versionableItemType;
    }
    
    public void setVersionableItemType(final String newVersionableItemType) {
        final String oldVersionableItemType = this.versionableItemType;
        this.versionableItemType = newVersionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x4000000) != 0x0;
        this.ALL_FLAGS |= 0x4000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 17, (Object)oldVersionableItemType, (Object)this.versionableItemType, !oldVersionableItemTypeESet));
        }
    }
    
    public void unsetVersionableItemType() {
        final String oldVersionableItemType = this.versionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x4000000) != 0x0;
        this.versionableItemType = ChangeSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFBFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 17, (Object)oldVersionableItemType, (Object)ChangeSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT, oldVersionableItemTypeESet));
        }
    }
    
    public boolean isSetVersionableItemType() {
        return (this.ALL_FLAGS & 0x4000000) != 0x0;
    }
    
    public String getBeforeStateId() {
        return this.beforeStateId;
    }
    
    public void setBeforeStateId(final String newBeforeStateId) {
        final String oldBeforeStateId = this.beforeStateId;
        this.beforeStateId = newBeforeStateId;
        final boolean oldBeforeStateIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldBeforeStateId, (Object)this.beforeStateId, !oldBeforeStateIdESet));
        }
    }
    
    public void unsetBeforeStateId() {
        final String oldBeforeStateId = this.beforeStateId;
        final boolean oldBeforeStateIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.beforeStateId = ChangeSyncDTOImpl.BEFORE_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldBeforeStateId, (Object)ChangeSyncDTOImpl.BEFORE_STATE_ID_EDEFAULT, oldBeforeStateIdESet));
        }
    }
    
    public boolean isSetBeforeStateId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getAfterStateId() {
        return this.afterStateId;
    }
    
    public void setAfterStateId(final String newAfterStateId) {
        final String oldAfterStateId = this.afterStateId;
        this.afterStateId = newAfterStateId;
        final boolean oldAfterStateIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldAfterStateId, (Object)this.afterStateId, !oldAfterStateIdESet));
        }
    }
    
    public void unsetAfterStateId() {
        final String oldAfterStateId = this.afterStateId;
        final boolean oldAfterStateIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.afterStateId = ChangeSyncDTOImpl.AFTER_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldAfterStateId, (Object)ChangeSyncDTOImpl.AFTER_STATE_ID_EDEFAULT, oldAfterStateIdESet));
        }
    }
    
    public boolean isSetAfterStateId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public boolean isAddType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setAddType(final boolean newAddType) {
        final boolean oldAddType = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newAddType) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldAddTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldAddType, newAddType, !oldAddTypeESet));
        }
    }
    
    public void unsetAddType() {
        final boolean oldAddType = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldAddTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldAddType, false, oldAddTypeESet));
        }
    }
    
    public boolean isSetAddType() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public boolean isDeleteType() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public void setDeleteType(final boolean newDeleteType) {
        final boolean oldDeleteType = (this.ALL_FLAGS & 0x40) != 0x0;
        if (newDeleteType) {
            this.ALL_FLAGS |= 0x40;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFBF;
        }
        final boolean oldDeleteTypeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldDeleteType, newDeleteType, !oldDeleteTypeESet));
        }
    }
    
    public void unsetDeleteType() {
        final boolean oldDeleteType = (this.ALL_FLAGS & 0x40) != 0x0;
        final boolean oldDeleteTypeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldDeleteType, false, oldDeleteTypeESet));
        }
    }
    
    public boolean isSetDeleteType() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public boolean isModifyType() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public void setModifyType(final boolean newModifyType) {
        final boolean oldModifyType = (this.ALL_FLAGS & 0x1000) != 0x0;
        if (newModifyType) {
            this.ALL_FLAGS |= 0x1000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFEFFF;
        }
        final boolean oldModifyTypeESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, oldModifyType, newModifyType, !oldModifyTypeESet));
        }
    }
    
    public void unsetModifyType() {
        final boolean oldModifyType = (this.ALL_FLAGS & 0x1000) != 0x0;
        final boolean oldModifyTypeESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, oldModifyType, false, oldModifyTypeESet));
        }
    }
    
    public boolean isSetModifyType() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public boolean isNoopType() {
        return (this.ALL_FLAGS & 0x20000) != 0x0;
    }
    
    public void setNoopType(final boolean newNoopType) {
        final boolean oldNoopType = (this.ALL_FLAGS & 0x20000) != 0x0;
        if (newNoopType) {
            this.ALL_FLAGS |= 0x20000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFDFFFF;
        }
        final boolean oldNoopTypeESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.ALL_FLAGS |= 0x40000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, oldNoopType, newNoopType, !oldNoopTypeESet));
        }
    }
    
    public void unsetNoopType() {
        final boolean oldNoopType = (this.ALL_FLAGS & 0x20000) != 0x0;
        final boolean oldNoopTypeESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.ALL_FLAGS &= 0xFFFDFFFF;
        this.ALL_FLAGS &= 0xFFFBFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, oldNoopType, false, oldNoopTypeESet));
        }
    }
    
    public boolean isSetNoopType() {
        return (this.ALL_FLAGS & 0x40000) != 0x0;
    }
    
    public boolean isMissingDetails() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public void setMissingDetails(final boolean newMissingDetails) {
        final boolean oldMissingDetails = (this.ALL_FLAGS & 0x400) != 0x0;
        if (newMissingDetails) {
            this.ALL_FLAGS |= 0x400;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFBFF;
        }
        final boolean oldMissingDetailsESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, oldMissingDetails, newMissingDetails, !oldMissingDetailsESet));
        }
    }
    
    public void unsetMissingDetails() {
        final boolean oldMissingDetails = (this.ALL_FLAGS & 0x400) != 0x0;
        final boolean oldMissingDetailsESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, oldMissingDetails, false, oldMissingDetailsESet));
        }
    }
    
    public boolean isSetMissingDetails() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public String getPathHint() {
        return this.pathHint;
    }
    
    public void setPathHint(final String newPathHint) {
        final String oldPathHint = this.pathHint;
        this.pathHint = newPathHint;
        final boolean oldPathHintESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.ALL_FLAGS |= 0x80000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, (Object)oldPathHint, (Object)this.pathHint, !oldPathHintESet));
        }
    }
    
    public void unsetPathHint() {
        final String oldPathHint = this.pathHint;
        final boolean oldPathHintESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.pathHint = ChangeSyncDTOImpl.PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFF7FFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, (Object)oldPathHint, (Object)ChangeSyncDTOImpl.PATH_HINT_EDEFAULT, oldPathHintESet));
        }
    }
    
    public boolean isSetPathHint() {
        return (this.ALL_FLAGS & 0x80000) != 0x0;
    }
    
    public String getNewPathHint() {
        return this.newPathHint;
    }
    
    public void setNewPathHint(final String newNewPathHint) {
        final String oldNewPathHint = this.newPathHint;
        this.newPathHint = newNewPathHint;
        final boolean oldNewPathHintESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS |= 0x10000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, (Object)oldNewPathHint, (Object)this.newPathHint, !oldNewPathHintESet));
        }
    }
    
    public void unsetNewPathHint() {
        final String oldNewPathHint = this.newPathHint;
        final boolean oldNewPathHintESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.newPathHint = ChangeSyncDTOImpl.NEW_PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFEFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, (Object)oldNewPathHint, (Object)ChangeSyncDTOImpl.NEW_PATH_HINT_EDEFAULT, oldNewPathHintESet));
        }
    }
    
    public boolean isSetNewPathHint() {
        return (this.ALL_FLAGS & 0x10000) != 0x0;
    }
    
    public boolean isMoveType() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public void setMoveType(final boolean newMoveType) {
        final boolean oldMoveType = (this.ALL_FLAGS & 0x4000) != 0x0;
        if (newMoveType) {
            this.ALL_FLAGS |= 0x4000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFBFFF;
        }
        final boolean oldMoveTypeESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS |= 0x8000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, oldMoveType, newMoveType, !oldMoveTypeESet));
        }
    }
    
    public void unsetMoveType() {
        final boolean oldMoveType = (this.ALL_FLAGS & 0x4000) != 0x0;
        final boolean oldMoveTypeESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, oldMoveType, false, oldMoveTypeESet));
        }
    }
    
    public boolean isSetMoveType() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    public boolean isPotentialConflict() {
        return (this.ALL_FLAGS & 0x100000) != 0x0;
    }
    
    public void setPotentialConflict(final boolean newPotentialConflict) {
        final boolean oldPotentialConflict = (this.ALL_FLAGS & 0x100000) != 0x0;
        if (newPotentialConflict) {
            this.ALL_FLAGS |= 0x100000;
        }
        else {
            this.ALL_FLAGS &= 0xFFEFFFFF;
        }
        final boolean oldPotentialConflictESet = (this.ALL_FLAGS & 0x200000) != 0x0;
        this.ALL_FLAGS |= 0x200000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, oldPotentialConflict, newPotentialConflict, !oldPotentialConflictESet));
        }
    }
    
    public void unsetPotentialConflict() {
        final boolean oldPotentialConflict = (this.ALL_FLAGS & 0x100000) != 0x0;
        final boolean oldPotentialConflictESet = (this.ALL_FLAGS & 0x200000) != 0x0;
        this.ALL_FLAGS &= 0xFFEFFFFF;
        this.ALL_FLAGS &= 0xFFDFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, oldPotentialConflict, false, oldPotentialConflictESet));
        }
    }
    
    public boolean isSetPotentialConflict() {
        return (this.ALL_FLAGS & 0x200000) != 0x0;
    }
    
    public String getLastMergeState() {
        return this.lastMergeState;
    }
    
    public void setLastMergeState(final String newLastMergeState) {
        final String oldLastMergeState = this.lastMergeState;
        this.lastMergeState = newLastMergeState;
        final boolean oldLastMergeStateESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldLastMergeState, (Object)this.lastMergeState, !oldLastMergeStateESet));
        }
    }
    
    public void unsetLastMergeState() {
        final String oldLastMergeState = this.lastMergeState;
        final boolean oldLastMergeStateESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.lastMergeState = ChangeSyncDTOImpl.LAST_MERGE_STATE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldLastMergeState, (Object)ChangeSyncDTOImpl.LAST_MERGE_STATE_EDEFAULT, oldLastMergeStateESet));
        }
    }
    
    public boolean isSetLastMergeState() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public int getStartLine() {
        return this.startLine;
    }
    
    public void setStartLine(final int newStartLine) {
        final int oldStartLine = this.startLine;
        this.startLine = newStartLine;
        final boolean oldStartLineESet = (this.ALL_FLAGS & 0x1000000) != 0x0;
        this.ALL_FLAGS |= 0x1000000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 15, oldStartLine, this.startLine, !oldStartLineESet));
        }
    }
    
    public void unsetStartLine() {
        final int oldStartLine = this.startLine;
        final boolean oldStartLineESet = (this.ALL_FLAGS & 0x1000000) != 0x0;
        this.startLine = 0;
        this.ALL_FLAGS &= 0xFEFFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 15, oldStartLine, 0, oldStartLineESet));
        }
    }
    
    public boolean isSetStartLine() {
        return (this.ALL_FLAGS & 0x1000000) != 0x0;
    }
    
    public boolean isContentChange() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public void setContentChange(final boolean newContentChange) {
        final boolean oldContentChange = (this.ALL_FLAGS & 0x10) != 0x0;
        if (newContentChange) {
            this.ALL_FLAGS |= 0x10;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFEF;
        }
        final boolean oldContentChangeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldContentChange, newContentChange, !oldContentChangeESet));
        }
    }
    
    public void unsetContentChange() {
        final boolean oldContentChange = (this.ALL_FLAGS & 0x10) != 0x0;
        final boolean oldContentChangeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldContentChange, false, oldContentChangeESet));
        }
    }
    
    public boolean isSetContentChange() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public boolean isPropertyChange() {
        return (this.ALL_FLAGS & 0x400000) != 0x0;
    }
    
    public void setPropertyChange(final boolean newPropertyChange) {
        final boolean oldPropertyChange = (this.ALL_FLAGS & 0x400000) != 0x0;
        if (newPropertyChange) {
            this.ALL_FLAGS |= 0x400000;
        }
        else {
            this.ALL_FLAGS &= 0xFFBFFFFF;
        }
        final boolean oldPropertyChangeESet = (this.ALL_FLAGS & 0x800000) != 0x0;
        this.ALL_FLAGS |= 0x800000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 14, oldPropertyChange, newPropertyChange, !oldPropertyChangeESet));
        }
    }
    
    public void unsetPropertyChange() {
        final boolean oldPropertyChange = (this.ALL_FLAGS & 0x400000) != 0x0;
        final boolean oldPropertyChangeESet = (this.ALL_FLAGS & 0x800000) != 0x0;
        this.ALL_FLAGS &= 0xFFBFFFFF;
        this.ALL_FLAGS &= 0xFF7FFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 14, oldPropertyChange, false, oldPropertyChangeESet));
        }
    }
    
    public boolean isSetPropertyChange() {
        return (this.ALL_FLAGS & 0x800000) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isAddType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.getAfterStateId();
            }
            case 2: {
                return this.getBeforeStateId();
            }
            case 3: {
                return this.isContentChange() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 4: {
                return this.isDeleteType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return new Integer(this.getId());
            }
            case 6: {
                return this.getLastMergeState();
            }
            case 7: {
                return this.isMissingDetails() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 8: {
                return this.isModifyType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 9: {
                return this.isMoveType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 10: {
                return this.getNewPathHint();
            }
            case 11: {
                return this.isNoopType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 12: {
                return this.getPathHint();
            }
            case 13: {
                return this.isPotentialConflict() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 14: {
                return this.isPropertyChange() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 15: {
                return new Integer(this.getStartLine());
            }
            case 16: {
                return this.getVersionableItemId();
            }
            case 17: {
                return this.getVersionableItemType();
            }
            case 18: {
                return this.getVersionableName();
            }
            case 19: {
                return this.getBeforeParentItemId();
            }
            case 20: {
                return this.getAfterParentItemId();
            }
            case 21: {
                return this.getMergeStates();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setAddType((boolean)newValue);
            }
            case 1: {
                this.setAfterStateId((String)newValue);
            }
            case 2: {
                this.setBeforeStateId((String)newValue);
            }
            case 3: {
                this.setContentChange((boolean)newValue);
            }
            case 4: {
                this.setDeleteType((boolean)newValue);
            }
            case 5: {
                this.setId((int)newValue);
            }
            case 6: {
                this.setLastMergeState((String)newValue);
            }
            case 7: {
                this.setMissingDetails((boolean)newValue);
            }
            case 8: {
                this.setModifyType((boolean)newValue);
            }
            case 9: {
                this.setMoveType((boolean)newValue);
            }
            case 10: {
                this.setNewPathHint((String)newValue);
            }
            case 11: {
                this.setNoopType((boolean)newValue);
            }
            case 12: {
                this.setPathHint((String)newValue);
            }
            case 13: {
                this.setPotentialConflict((boolean)newValue);
            }
            case 14: {
                this.setPropertyChange((boolean)newValue);
            }
            case 15: {
                this.setStartLine((int)newValue);
            }
            case 16: {
                this.setVersionableItemId((String)newValue);
            }
            case 17: {
                this.setVersionableItemType((String)newValue);
            }
            case 18: {
                this.setVersionableName((String)newValue);
            }
            case 19: {
                this.setBeforeParentItemId((String)newValue);
            }
            case 20: {
                this.setAfterParentItemId((String)newValue);
            }
            case 21: {
                this.getMergeStates().clear();
                this.getMergeStates().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAddType();
            }
            case 1: {
                this.unsetAfterStateId();
            }
            case 2: {
                this.unsetBeforeStateId();
            }
            case 3: {
                this.unsetContentChange();
            }
            case 4: {
                this.unsetDeleteType();
            }
            case 5: {
                this.unsetId();
            }
            case 6: {
                this.unsetLastMergeState();
            }
            case 7: {
                this.unsetMissingDetails();
            }
            case 8: {
                this.unsetModifyType();
            }
            case 9: {
                this.unsetMoveType();
            }
            case 10: {
                this.unsetNewPathHint();
            }
            case 11: {
                this.unsetNoopType();
            }
            case 12: {
                this.unsetPathHint();
            }
            case 13: {
                this.unsetPotentialConflict();
            }
            case 14: {
                this.unsetPropertyChange();
            }
            case 15: {
                this.unsetStartLine();
            }
            case 16: {
                this.unsetVersionableItemId();
            }
            case 17: {
                this.unsetVersionableItemType();
            }
            case 18: {
                this.unsetVersionableName();
            }
            case 19: {
                this.unsetBeforeParentItemId();
            }
            case 20: {
                this.unsetAfterParentItemId();
            }
            case 21: {
                this.unsetMergeStates();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAddType();
            }
            case 1: {
                return this.isSetAfterStateId();
            }
            case 2: {
                return this.isSetBeforeStateId();
            }
            case 3: {
                return this.isSetContentChange();
            }
            case 4: {
                return this.isSetDeleteType();
            }
            case 5: {
                return this.isSetId();
            }
            case 6: {
                return this.isSetLastMergeState();
            }
            case 7: {
                return this.isSetMissingDetails();
            }
            case 8: {
                return this.isSetModifyType();
            }
            case 9: {
                return this.isSetMoveType();
            }
            case 10: {
                return this.isSetNewPathHint();
            }
            case 11: {
                return this.isSetNoopType();
            }
            case 12: {
                return this.isSetPathHint();
            }
            case 13: {
                return this.isSetPotentialConflict();
            }
            case 14: {
                return this.isSetPropertyChange();
            }
            case 15: {
                return this.isSetStartLine();
            }
            case 16: {
                return this.isSetVersionableItemId();
            }
            case 17: {
                return this.isSetVersionableItemType();
            }
            case 18: {
                return this.isSetVersionableName();
            }
            case 19: {
                return this.isSetBeforeParentItemId();
            }
            case 20: {
                return this.isSetAfterParentItemId();
            }
            case 21: {
                return this.isSetMergeStates();
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
        result.append(" (addType: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterStateId: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.afterStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", beforeStateId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.beforeStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", contentChange: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", deleteType: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append((this.ALL_FLAGS & 0x40) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", id: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lastMergeState: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.lastMergeState);
        }
        else {
            result.append("<unset>");
        }
        result.append(", missingDetails: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append((this.ALL_FLAGS & 0x400) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", modifyType: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", moveType: ");
        if ((this.ALL_FLAGS & 0x8000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", newPathHint: ");
        if ((this.ALL_FLAGS & 0x10000) != 0x0) {
            result.append(this.newPathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(", noopType: ");
        if ((this.ALL_FLAGS & 0x40000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x20000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", pathHint: ");
        if ((this.ALL_FLAGS & 0x80000) != 0x0) {
            result.append(this.pathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(", potentialConflict: ");
        if ((this.ALL_FLAGS & 0x200000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x100000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", propertyChange: ");
        if ((this.ALL_FLAGS & 0x800000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x400000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", startLine: ");
        if ((this.ALL_FLAGS & 0x1000000) != 0x0) {
            result.append(this.startLine);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemId: ");
        if ((this.ALL_FLAGS & 0x2000000) != 0x0) {
            result.append(this.versionableItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemType: ");
        if ((this.ALL_FLAGS & 0x4000000) != 0x0) {
            result.append(this.versionableItemType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableName: ");
        if ((this.ALL_FLAGS & 0x8000000) != 0x0) {
            result.append(this.versionableName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", beforeParentItemId: ");
        if ((this.ALL_FLAGS & 0x10000000) != 0x0) {
            result.append(this.beforeParentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterParentItemId: ");
        if ((this.ALL_FLAGS & 0x20000000) != 0x0) {
            result.append(this.afterParentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", mergeStates: ");
        result.append(this.mergeStates);
        result.append(')');
        return result.toString();
    }
}
