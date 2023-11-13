// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.LocalChangeSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LocalChangeSyncDTOImpl extends EObjectImpl implements LocalChangeSyncDTO
{
    protected int ALL_FLAGS;
    protected static final boolean ADDITION_TYPE_EDEFAULT = false;
    protected static final int ADDITION_TYPE_EFLAG = 1;
    protected static final int ADDITION_TYPE_ESETFLAG = 2;
    protected static final boolean ATTRIBUTES_TYPE_EDEFAULT = false;
    protected static final int ATTRIBUTES_TYPE_EFLAG = 4;
    protected static final int ATTRIBUTES_TYPE_ESETFLAG = 8;
    protected static final boolean CONTENT_TYPE_EDEFAULT = false;
    protected static final int CONTENT_TYPE_EFLAG = 16;
    protected static final int CONTENT_TYPE_ESETFLAG = 32;
    protected static final boolean DELETION_TYPE_EDEFAULT = false;
    protected static final int DELETION_TYPE_EFLAG = 64;
    protected static final int DELETION_TYPE_ESETFLAG = 128;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 256;
    protected static final boolean MOVE_TYPE_EDEFAULT = false;
    protected static final int MOVE_TYPE_EFLAG = 512;
    protected static final int MOVE_TYPE_ESETFLAG = 1024;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 2048;
    protected static final String ORIGINAL_PATH_EDEFAULT;
    protected String originalPath;
    protected static final int ORIGINAL_PATH_ESETFLAG = 4096;
    protected static final String PATH_EDEFAULT;
    protected String path;
    protected static final int PATH_ESETFLAG = 8192;
    protected static final String RESULTING_PATH_EDEFAULT;
    protected String resultingPath;
    protected static final int RESULTING_PATH_ESETFLAG = 16384;
    protected static final String SANDBOX_PATH_EDEFAULT;
    protected String sandboxPath;
    protected static final int SANDBOX_PATH_ESETFLAG = 32768;
    protected static final String TARGET_VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String targetVersionableItemId;
    protected static final int TARGET_VERSIONABLE_ITEM_ID_ESETFLAG = 65536;
    protected static final String TARGET_VERSIONABLE_STATE_ID_EDEFAULT;
    protected String targetVersionableStateId;
    protected static final int TARGET_VERSIONABLE_STATE_ID_ESETFLAG = 131072;
    protected static final String VERSIONABLE_ITEM_TYPE_EDEFAULT;
    protected String versionableItemType;
    protected static final int VERSIONABLE_ITEM_TYPE_ESETFLAG = 262144;
    
    static {
        NAME_EDEFAULT = null;
        ORIGINAL_PATH_EDEFAULT = null;
        PATH_EDEFAULT = null;
        RESULTING_PATH_EDEFAULT = null;
        SANDBOX_PATH_EDEFAULT = null;
        TARGET_VERSIONABLE_ITEM_ID_EDEFAULT = null;
        TARGET_VERSIONABLE_STATE_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_TYPE_EDEFAULT = null;
    }
    
    protected LocalChangeSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.id = 0;
        this.name = LocalChangeSyncDTOImpl.NAME_EDEFAULT;
        this.originalPath = LocalChangeSyncDTOImpl.ORIGINAL_PATH_EDEFAULT;
        this.path = LocalChangeSyncDTOImpl.PATH_EDEFAULT;
        this.resultingPath = LocalChangeSyncDTOImpl.RESULTING_PATH_EDEFAULT;
        this.sandboxPath = LocalChangeSyncDTOImpl.SANDBOX_PATH_EDEFAULT;
        this.targetVersionableItemId = LocalChangeSyncDTOImpl.TARGET_VERSIONABLE_ITEM_ID_EDEFAULT;
        this.targetVersionableStateId = LocalChangeSyncDTOImpl.TARGET_VERSIONABLE_STATE_ID_EDEFAULT;
        this.versionableItemType = LocalChangeSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.LOCAL_CHANGE_SYNC_DTO;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.name = LocalChangeSyncDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldName, (Object)LocalChangeSyncDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public String getTargetVersionableItemId() {
        return this.targetVersionableItemId;
    }
    
    public void setTargetVersionableItemId(final String newTargetVersionableItemId) {
        final String oldTargetVersionableItemId = this.targetVersionableItemId;
        this.targetVersionableItemId = newTargetVersionableItemId;
        final boolean oldTargetVersionableItemIdESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS |= 0x10000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, (Object)oldTargetVersionableItemId, (Object)this.targetVersionableItemId, !oldTargetVersionableItemIdESet));
        }
    }
    
    public void unsetTargetVersionableItemId() {
        final String oldTargetVersionableItemId = this.targetVersionableItemId;
        final boolean oldTargetVersionableItemIdESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.targetVersionableItemId = LocalChangeSyncDTOImpl.TARGET_VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFEFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, (Object)oldTargetVersionableItemId, (Object)LocalChangeSyncDTOImpl.TARGET_VERSIONABLE_ITEM_ID_EDEFAULT, oldTargetVersionableItemIdESet));
        }
    }
    
    public boolean isSetTargetVersionableItemId() {
        return (this.ALL_FLAGS & 0x10000) != 0x0;
    }
    
    public String getVersionableItemType() {
        return this.versionableItemType;
    }
    
    public void setVersionableItemType(final String newVersionableItemType) {
        final String oldVersionableItemType = this.versionableItemType;
        this.versionableItemType = newVersionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.ALL_FLAGS |= 0x40000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldVersionableItemType, (Object)this.versionableItemType, !oldVersionableItemTypeESet));
        }
    }
    
    public void unsetVersionableItemType() {
        final String oldVersionableItemType = this.versionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.versionableItemType = LocalChangeSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFBFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldVersionableItemType, (Object)LocalChangeSyncDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT, oldVersionableItemTypeESet));
        }
    }
    
    public boolean isSetVersionableItemType() {
        return (this.ALL_FLAGS & 0x40000) != 0x0;
    }
    
    public boolean isContentType() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public void setContentType(final boolean newContentType) {
        final boolean oldContentType = (this.ALL_FLAGS & 0x10) != 0x0;
        if (newContentType) {
            this.ALL_FLAGS |= 0x10;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFEF;
        }
        final boolean oldContentTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldContentType, newContentType, !oldContentTypeESet));
        }
    }
    
    public void unsetContentType() {
        final boolean oldContentType = (this.ALL_FLAGS & 0x10) != 0x0;
        final boolean oldContentTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldContentType, false, oldContentTypeESet));
        }
    }
    
    public boolean isSetContentType() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public boolean isAdditionType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setAdditionType(final boolean newAdditionType) {
        final boolean oldAdditionType = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newAdditionType) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldAdditionTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldAdditionType, newAdditionType, !oldAdditionTypeESet));
        }
    }
    
    public void unsetAdditionType() {
        final boolean oldAdditionType = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldAdditionTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldAdditionType, false, oldAdditionTypeESet));
        }
    }
    
    public boolean isSetAdditionType() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public boolean isDeletionType() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public void setDeletionType(final boolean newDeletionType) {
        final boolean oldDeletionType = (this.ALL_FLAGS & 0x40) != 0x0;
        if (newDeletionType) {
            this.ALL_FLAGS |= 0x40;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFBF;
        }
        final boolean oldDeletionTypeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldDeletionType, newDeletionType, !oldDeletionTypeESet));
        }
    }
    
    public void unsetDeletionType() {
        final boolean oldDeletionType = (this.ALL_FLAGS & 0x40) != 0x0;
        final boolean oldDeletionTypeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldDeletionType, false, oldDeletionTypeESet));
        }
    }
    
    public boolean isSetDeletionType() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public boolean isMoveType() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public void setMoveType(final boolean newMoveType) {
        final boolean oldMoveType = (this.ALL_FLAGS & 0x200) != 0x0;
        if (newMoveType) {
            this.ALL_FLAGS |= 0x200;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFDFF;
        }
        final boolean oldMoveTypeESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldMoveType, newMoveType, !oldMoveTypeESet));
        }
    }
    
    public void unsetMoveType() {
        final boolean oldMoveType = (this.ALL_FLAGS & 0x200) != 0x0;
        final boolean oldMoveTypeESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldMoveType, false, oldMoveTypeESet));
        }
    }
    
    public boolean isSetMoveType() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public boolean isAttributesType() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setAttributesType(final boolean newAttributesType) {
        final boolean oldAttributesType = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newAttributesType) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldAttributesTypeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldAttributesType, newAttributesType, !oldAttributesTypeESet));
        }
    }
    
    public void unsetAttributesType() {
        final boolean oldAttributesType = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldAttributesTypeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldAttributesType, false, oldAttributesTypeESet));
        }
    }
    
    public boolean isSetAttributesType() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getPath() {
        return this.path;
    }
    
    public void setPath(final String newPath) {
        final String oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldPath, (Object)this.path, !oldPathESet));
        }
    }
    
    public void unsetPath() {
        final String oldPath = this.path;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.path = LocalChangeSyncDTOImpl.PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldPath, (Object)LocalChangeSyncDTOImpl.PATH_EDEFAULT, oldPathESet));
        }
    }
    
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public String getResultingPath() {
        return this.resultingPath;
    }
    
    public void setResultingPath(final String newResultingPath) {
        final String oldResultingPath = this.resultingPath;
        this.resultingPath = newResultingPath;
        final boolean oldResultingPathESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldResultingPath, (Object)this.resultingPath, !oldResultingPathESet));
        }
    }
    
    public void unsetResultingPath() {
        final String oldResultingPath = this.resultingPath;
        final boolean oldResultingPathESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.resultingPath = LocalChangeSyncDTOImpl.RESULTING_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldResultingPath, (Object)LocalChangeSyncDTOImpl.RESULTING_PATH_EDEFAULT, oldResultingPathESet));
        }
    }
    
    public boolean isSetResultingPath() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public String getOriginalPath() {
        return this.originalPath;
    }
    
    public void setOriginalPath(final String newOriginalPath) {
        final String oldOriginalPath = this.originalPath;
        this.originalPath = newOriginalPath;
        final boolean oldOriginalPathESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldOriginalPath, (Object)this.originalPath, !oldOriginalPathESet));
        }
    }
    
    public void unsetOriginalPath() {
        final String oldOriginalPath = this.originalPath;
        final boolean oldOriginalPathESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.originalPath = LocalChangeSyncDTOImpl.ORIGINAL_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldOriginalPath, (Object)LocalChangeSyncDTOImpl.ORIGINAL_PATH_EDEFAULT, oldOriginalPathESet));
        }
    }
    
    public boolean isSetOriginalPath() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public String getTargetVersionableStateId() {
        return this.targetVersionableStateId;
    }
    
    public void setTargetVersionableStateId(final String newTargetVersionableStateId) {
        final String oldTargetVersionableStateId = this.targetVersionableStateId;
        this.targetVersionableStateId = newTargetVersionableStateId;
        final boolean oldTargetVersionableStateIdESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.ALL_FLAGS |= 0x20000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, (Object)oldTargetVersionableStateId, (Object)this.targetVersionableStateId, !oldTargetVersionableStateIdESet));
        }
    }
    
    public void unsetTargetVersionableStateId() {
        final String oldTargetVersionableStateId = this.targetVersionableStateId;
        final boolean oldTargetVersionableStateIdESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.targetVersionableStateId = LocalChangeSyncDTOImpl.TARGET_VERSIONABLE_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFDFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, (Object)oldTargetVersionableStateId, (Object)LocalChangeSyncDTOImpl.TARGET_VERSIONABLE_STATE_ID_EDEFAULT, oldTargetVersionableStateIdESet));
        }
    }
    
    public boolean isSetTargetVersionableStateId() {
        return (this.ALL_FLAGS & 0x20000) != 0x0;
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public String getSandboxPath() {
        return this.sandboxPath;
    }
    
    public void setSandboxPath(final String newSandboxPath) {
        final String oldSandboxPath = this.sandboxPath;
        this.sandboxPath = newSandboxPath;
        final boolean oldSandboxPathESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS |= 0x8000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, (Object)oldSandboxPath, (Object)this.sandboxPath, !oldSandboxPathESet));
        }
    }
    
    public void unsetSandboxPath() {
        final String oldSandboxPath = this.sandboxPath;
        final boolean oldSandboxPathESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.sandboxPath = LocalChangeSyncDTOImpl.SANDBOX_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, (Object)oldSandboxPath, (Object)LocalChangeSyncDTOImpl.SANDBOX_PATH_EDEFAULT, oldSandboxPathESet));
        }
    }
    
    public boolean isSetSandboxPath() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isAdditionType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.isAttributesType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.isContentType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 3: {
                return this.isDeletionType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 4: {
                return new Integer(this.getId());
            }
            case 5: {
                return this.isMoveType() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 6: {
                return this.getName();
            }
            case 7: {
                return this.getOriginalPath();
            }
            case 8: {
                return this.getPath();
            }
            case 9: {
                return this.getResultingPath();
            }
            case 10: {
                return this.getSandboxPath();
            }
            case 11: {
                return this.getTargetVersionableItemId();
            }
            case 12: {
                return this.getTargetVersionableStateId();
            }
            case 13: {
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
                this.setAdditionType((boolean)newValue);
            }
            case 1: {
                this.setAttributesType((boolean)newValue);
            }
            case 2: {
                this.setContentType((boolean)newValue);
            }
            case 3: {
                this.setDeletionType((boolean)newValue);
            }
            case 4: {
                this.setId((int)newValue);
            }
            case 5: {
                this.setMoveType((boolean)newValue);
            }
            case 6: {
                this.setName((String)newValue);
            }
            case 7: {
                this.setOriginalPath((String)newValue);
            }
            case 8: {
                this.setPath((String)newValue);
            }
            case 9: {
                this.setResultingPath((String)newValue);
            }
            case 10: {
                this.setSandboxPath((String)newValue);
            }
            case 11: {
                this.setTargetVersionableItemId((String)newValue);
            }
            case 12: {
                this.setTargetVersionableStateId((String)newValue);
            }
            case 13: {
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
                this.unsetAdditionType();
            }
            case 1: {
                this.unsetAttributesType();
            }
            case 2: {
                this.unsetContentType();
            }
            case 3: {
                this.unsetDeletionType();
            }
            case 4: {
                this.unsetId();
            }
            case 5: {
                this.unsetMoveType();
            }
            case 6: {
                this.unsetName();
            }
            case 7: {
                this.unsetOriginalPath();
            }
            case 8: {
                this.unsetPath();
            }
            case 9: {
                this.unsetResultingPath();
            }
            case 10: {
                this.unsetSandboxPath();
            }
            case 11: {
                this.unsetTargetVersionableItemId();
            }
            case 12: {
                this.unsetTargetVersionableStateId();
            }
            case 13: {
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
                return this.isSetAdditionType();
            }
            case 1: {
                return this.isSetAttributesType();
            }
            case 2: {
                return this.isSetContentType();
            }
            case 3: {
                return this.isSetDeletionType();
            }
            case 4: {
                return this.isSetId();
            }
            case 5: {
                return this.isSetMoveType();
            }
            case 6: {
                return this.isSetName();
            }
            case 7: {
                return this.isSetOriginalPath();
            }
            case 8: {
                return this.isSetPath();
            }
            case 9: {
                return this.isSetResultingPath();
            }
            case 10: {
                return this.isSetSandboxPath();
            }
            case 11: {
                return this.isSetTargetVersionableItemId();
            }
            case 12: {
                return this.isSetTargetVersionableStateId();
            }
            case 13: {
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
        result.append(" (additionType: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", attributesType: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", contentType: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", deletionType: ");
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
        result.append(", moveType: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append((this.ALL_FLAGS & 0x200) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", originalPath: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append(this.originalPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(", path: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append(this.path);
        }
        else {
            result.append("<unset>");
        }
        result.append(", resultingPath: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append(this.resultingPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sandboxPath: ");
        if ((this.ALL_FLAGS & 0x8000) != 0x0) {
            result.append(this.sandboxPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetVersionableItemId: ");
        if ((this.ALL_FLAGS & 0x10000) != 0x0) {
            result.append(this.targetVersionableItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetVersionableStateId: ");
        if ((this.ALL_FLAGS & 0x20000) != 0x0) {
            result.append(this.targetVersionableStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemType: ");
        if ((this.ALL_FLAGS & 0x40000) != 0x0) {
            result.append(this.versionableItemType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
