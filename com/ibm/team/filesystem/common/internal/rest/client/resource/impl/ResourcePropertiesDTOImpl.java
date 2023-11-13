// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import com.ibm.team.scm.common.internal.impl.PropertyImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.PermissionsContextDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SymlinkPropertiesDTO;
import org.eclipse.emf.common.util.EMap;
import com.ibm.team.filesystem.common.internal.rest.client.resource.IgnoreReasonDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilePropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertiesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ResourcePropertiesDTOImpl extends EObjectImpl implements ResourcePropertiesDTO
{
    protected int ALL_FLAGS;
    protected static final String FULL_PATH_EDEFAULT;
    protected String fullPath;
    protected static final int FULL_PATH_ESETFLAG = 1;
    protected ShareableDTO path;
    protected static final int PATH_ESETFLAG = 2;
    protected PathDTO remotePath;
    protected static final int REMOTE_PATH_ESETFLAG = 4;
    protected static final boolean SHARED_EDEFAULT = false;
    protected static final int SHARED_EFLAG = 8;
    protected static final int SHARED_ESETFLAG = 16;
    protected ShareDTO share;
    protected static final int SHARE_ESETFLAG = 32;
    protected static final String VERSIONABLE_ITEM_TYPE_EDEFAULT;
    protected String versionableItemType;
    protected static final int VERSIONABLE_ITEM_TYPE_ESETFLAG = 64;
    protected static final String ITEM_ID_EDEFAULT;
    protected String itemId;
    protected static final int ITEM_ID_ESETFLAG = 128;
    protected static final String STATE_ID_EDEFAULT;
    protected String stateId;
    protected static final int STATE_ID_ESETFLAG = 256;
    protected static final boolean IGNORED_EDEFAULT = false;
    protected static final int IGNORED_EFLAG = 512;
    protected static final int IGNORED_ESETFLAG = 1024;
    protected static final boolean LOCAL_EDEFAULT = false;
    protected static final int LOCAL_EFLAG = 2048;
    protected static final int LOCAL_ESETFLAG = 4096;
    protected static final boolean REMOTE_EDEFAULT = false;
    protected static final int REMOTE_EFLAG = 8192;
    protected static final int REMOTE_ESETFLAG = 16384;
    protected static final boolean DIRTY_EDEFAULT = false;
    protected static final int DIRTY_EFLAG = 32768;
    protected static final int DIRTY_ESETFLAG = 65536;
    protected FilePropertiesDTO fileProperties;
    protected static final int FILE_PROPERTIES_ESETFLAG = 131072;
    protected IgnoreReasonDTO ignoreReason;
    protected static final int IGNORE_REASON_ESETFLAG = 262144;
    protected EMap userProperties;
    protected SymlinkPropertiesDTO symlinkProperties;
    protected static final int SYMLINK_PROPERTIES_ESETFLAG = 524288;
    protected PermissionsContextDTO permissionsContext;
    protected static final int PERMISSIONS_CONTEXT_ESETFLAG = 1048576;
    
    static {
        FULL_PATH_EDEFAULT = null;
        VERSIONABLE_ITEM_TYPE_EDEFAULT = null;
        ITEM_ID_EDEFAULT = null;
        STATE_ID_EDEFAULT = null;
    }
    
    protected ResourcePropertiesDTOImpl() {
        this.ALL_FLAGS = 0;
        this.fullPath = ResourcePropertiesDTOImpl.FULL_PATH_EDEFAULT;
        this.versionableItemType = ResourcePropertiesDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.itemId = ResourcePropertiesDTOImpl.ITEM_ID_EDEFAULT;
        this.stateId = ResourcePropertiesDTOImpl.STATE_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.RESOURCE_PROPERTIES_DTO;
    }
    
    public String getFullPath() {
        return this.fullPath;
    }
    
    public void setFullPath(final String newFullPath) {
        final String oldFullPath = this.fullPath;
        this.fullPath = newFullPath;
        final boolean oldFullPathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldFullPath, (Object)this.fullPath, !oldFullPathESet));
        }
    }
    
    public void unsetFullPath() {
        final String oldFullPath = this.fullPath;
        final boolean oldFullPathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.fullPath = ResourcePropertiesDTOImpl.FULL_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldFullPath, (Object)ResourcePropertiesDTOImpl.FULL_PATH_EDEFAULT, oldFullPathESet));
        }
    }
    
    public boolean isSetFullPath() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public ShareableDTO getPath() {
        return this.path;
    }
    
    public NotificationChain basicSetPath(final ShareableDTO newPath, NotificationChain msgs) {
        final ShareableDTO oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldPath, (Object)newPath, !oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setPath(final ShareableDTO newPath) {
        if (newPath != this.path) {
            NotificationChain msgs = null;
            if (this.path != null) {
                msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newPath != null) {
                msgs = ((InternalEObject)newPath).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
            }
            msgs = this.basicSetPath(newPath, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS |= 0x2;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newPath, (Object)newPath, !oldPathESet));
            }
        }
    }
    
    public NotificationChain basicUnsetPath(NotificationChain msgs) {
        final ShareableDTO oldPath = this.path;
        this.path = null;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldPath, (Object)null, oldPathESet);
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
            msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetPath(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFD;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldPathESet));
            }
        }
    }
    
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public PathDTO getRemotePath() {
        return this.remotePath;
    }
    
    public NotificationChain basicSetRemotePath(final PathDTO newRemotePath, NotificationChain msgs) {
        final PathDTO oldRemotePath = this.remotePath;
        this.remotePath = newRemotePath;
        final boolean oldRemotePathESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldRemotePath, (Object)newRemotePath, !oldRemotePathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setRemotePath(final PathDTO newRemotePath) {
        if (newRemotePath != this.remotePath) {
            NotificationChain msgs = null;
            if (this.remotePath != null) {
                msgs = ((InternalEObject)this.remotePath).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            }
            if (newRemotePath != null) {
                msgs = ((InternalEObject)newRemotePath).eInverseAdd((InternalEObject)this, -3, (Class)null, msgs);
            }
            msgs = this.basicSetRemotePath(newRemotePath, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldRemotePathESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS |= 0x4;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)newRemotePath, (Object)newRemotePath, !oldRemotePathESet));
            }
        }
    }
    
    public NotificationChain basicUnsetRemotePath(NotificationChain msgs) {
        final PathDTO oldRemotePath = this.remotePath;
        this.remotePath = null;
        final boolean oldRemotePathESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldRemotePath, (Object)null, oldRemotePathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetRemotePath() {
        if (this.remotePath != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.remotePath).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            msgs = this.basicUnsetRemotePath(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldRemotePathESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFB;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)null, (Object)null, oldRemotePathESet));
            }
        }
    }
    
    public boolean isSetRemotePath() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public boolean isShared() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public void setShared(final boolean newShared) {
        final boolean oldShared = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newShared) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldSharedESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldShared, newShared, !oldSharedESet));
        }
    }
    
    public void unsetShared() {
        final boolean oldShared = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldSharedESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldShared, false, oldSharedESet));
        }
    }
    
    public boolean isSetShared() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public ShareDTO getShare() {
        return this.share;
    }
    
    public NotificationChain basicSetShare(final ShareDTO newShare, NotificationChain msgs) {
        final ShareDTO oldShare = this.share;
        this.share = newShare;
        final boolean oldShareESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldShare, (Object)newShare, !oldShareESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setShare(final ShareDTO newShare) {
        if (newShare != this.share) {
            NotificationChain msgs = null;
            if (this.share != null) {
                msgs = ((InternalEObject)this.share).eInverseRemove((InternalEObject)this, -5, (Class)null, msgs);
            }
            if (newShare != null) {
                msgs = ((InternalEObject)newShare).eInverseAdd((InternalEObject)this, -5, (Class)null, msgs);
            }
            msgs = this.basicSetShare(newShare, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS |= 0x20;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)newShare, (Object)newShare, !oldShareESet));
            }
        }
    }
    
    public NotificationChain basicUnsetShare(NotificationChain msgs) {
        final ShareDTO oldShare = this.share;
        this.share = null;
        final boolean oldShareESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldShare, (Object)null, oldShareESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetShare() {
        if (this.share != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.share).eInverseRemove((InternalEObject)this, -5, (Class)null, msgs);
            msgs = this.basicUnsetShare(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFDF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)null, (Object)null, oldShareESet));
            }
        }
    }
    
    public boolean isSetShare() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getVersionableItemType() {
        return this.versionableItemType;
    }
    
    public void setVersionableItemType(final String newVersionableItemType) {
        final String oldVersionableItemType = this.versionableItemType;
        this.versionableItemType = newVersionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldVersionableItemType, (Object)this.versionableItemType, !oldVersionableItemTypeESet));
        }
    }
    
    public void unsetVersionableItemType() {
        final String oldVersionableItemType = this.versionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.versionableItemType = ResourcePropertiesDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldVersionableItemType, (Object)ResourcePropertiesDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT, oldVersionableItemTypeESet));
        }
    }
    
    public boolean isSetVersionableItemType() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(final String newItemId) {
        final String oldItemId = this.itemId;
        this.itemId = newItemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldItemId, (Object)this.itemId, !oldItemIdESet));
        }
    }
    
    public void unsetItemId() {
        final String oldItemId = this.itemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.itemId = ResourcePropertiesDTOImpl.ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldItemId, (Object)ResourcePropertiesDTOImpl.ITEM_ID_EDEFAULT, oldItemIdESet));
        }
    }
    
    public boolean isSetItemId() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public String getStateId() {
        return this.stateId;
    }
    
    public void setStateId(final String newStateId) {
        final String oldStateId = this.stateId;
        this.stateId = newStateId;
        final boolean oldStateIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldStateId, (Object)this.stateId, !oldStateIdESet));
        }
    }
    
    public void unsetStateId() {
        final String oldStateId = this.stateId;
        final boolean oldStateIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.stateId = ResourcePropertiesDTOImpl.STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldStateId, (Object)ResourcePropertiesDTOImpl.STATE_ID_EDEFAULT, oldStateIdESet));
        }
    }
    
    public boolean isSetStateId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public boolean isIgnored() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public void setIgnored(final boolean newIgnored) {
        final boolean oldIgnored = (this.ALL_FLAGS & 0x200) != 0x0;
        if (newIgnored) {
            this.ALL_FLAGS |= 0x200;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFDFF;
        }
        final boolean oldIgnoredESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, oldIgnored, newIgnored, !oldIgnoredESet));
        }
    }
    
    public void unsetIgnored() {
        final boolean oldIgnored = (this.ALL_FLAGS & 0x200) != 0x0;
        final boolean oldIgnoredESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, oldIgnored, false, oldIgnoredESet));
        }
    }
    
    public boolean isSetIgnored() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public boolean isLocal() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public void setLocal(final boolean newLocal) {
        final boolean oldLocal = (this.ALL_FLAGS & 0x800) != 0x0;
        if (newLocal) {
            this.ALL_FLAGS |= 0x800;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFF7FF;
        }
        final boolean oldLocalESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, oldLocal, newLocal, !oldLocalESet));
        }
    }
    
    public void unsetLocal() {
        final boolean oldLocal = (this.ALL_FLAGS & 0x800) != 0x0;
        final boolean oldLocalESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, oldLocal, false, oldLocalESet));
        }
    }
    
    public boolean isSetLocal() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public boolean isRemote() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public void setRemote(final boolean newRemote) {
        final boolean oldRemote = (this.ALL_FLAGS & 0x2000) != 0x0;
        if (newRemote) {
            this.ALL_FLAGS |= 0x2000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFDFFF;
        }
        final boolean oldRemoteESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, oldRemote, newRemote, !oldRemoteESet));
        }
    }
    
    public void unsetRemote() {
        final boolean oldRemote = (this.ALL_FLAGS & 0x2000) != 0x0;
        final boolean oldRemoteESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, oldRemote, false, oldRemoteESet));
        }
    }
    
    public boolean isSetRemote() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public boolean isDirty() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    public void setDirty(final boolean newDirty) {
        final boolean oldDirty = (this.ALL_FLAGS & 0x8000) != 0x0;
        if (newDirty) {
            this.ALL_FLAGS |= 0x8000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFF7FFF;
        }
        final boolean oldDirtyESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS |= 0x10000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, oldDirty, newDirty, !oldDirtyESet));
        }
    }
    
    public void unsetDirty() {
        final boolean oldDirty = (this.ALL_FLAGS & 0x8000) != 0x0;
        final boolean oldDirtyESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        this.ALL_FLAGS &= 0xFFFEFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, oldDirty, false, oldDirtyESet));
        }
    }
    
    public boolean isSetDirty() {
        return (this.ALL_FLAGS & 0x10000) != 0x0;
    }
    
    public FilePropertiesDTO getFileProperties() {
        return this.fileProperties;
    }
    
    public NotificationChain basicSetFileProperties(final FilePropertiesDTO newFileProperties, NotificationChain msgs) {
        final FilePropertiesDTO oldFileProperties = this.fileProperties;
        this.fileProperties = newFileProperties;
        final boolean oldFilePropertiesESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.ALL_FLAGS |= 0x20000;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 12, (Object)oldFileProperties, (Object)newFileProperties, !oldFilePropertiesESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setFileProperties(final FilePropertiesDTO newFileProperties) {
        if (newFileProperties != this.fileProperties) {
            NotificationChain msgs = null;
            if (this.fileProperties != null) {
                msgs = ((InternalEObject)this.fileProperties).eInverseRemove((InternalEObject)this, -13, (Class)null, msgs);
            }
            if (newFileProperties != null) {
                msgs = ((InternalEObject)newFileProperties).eInverseAdd((InternalEObject)this, -13, (Class)null, msgs);
            }
            msgs = this.basicSetFileProperties(newFileProperties, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldFilePropertiesESet = (this.ALL_FLAGS & 0x20000) != 0x0;
            this.ALL_FLAGS |= 0x20000;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, (Object)newFileProperties, (Object)newFileProperties, !oldFilePropertiesESet));
            }
        }
    }
    
    public NotificationChain basicUnsetFileProperties(NotificationChain msgs) {
        final FilePropertiesDTO oldFileProperties = this.fileProperties;
        this.fileProperties = null;
        final boolean oldFilePropertiesESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.ALL_FLAGS &= 0xFFFDFFFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 12, (Object)oldFileProperties, (Object)null, oldFilePropertiesESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetFileProperties() {
        if (this.fileProperties != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.fileProperties).eInverseRemove((InternalEObject)this, -13, (Class)null, msgs);
            msgs = this.basicUnsetFileProperties(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldFilePropertiesESet = (this.ALL_FLAGS & 0x20000) != 0x0;
            this.ALL_FLAGS &= 0xFFFDFFFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, (Object)null, (Object)null, oldFilePropertiesESet));
            }
        }
    }
    
    public boolean isSetFileProperties() {
        return (this.ALL_FLAGS & 0x20000) != 0x0;
    }
    
    public IgnoreReasonDTO getIgnoreReason() {
        return this.ignoreReason;
    }
    
    public NotificationChain basicSetIgnoreReason(final IgnoreReasonDTO newIgnoreReason, NotificationChain msgs) {
        final IgnoreReasonDTO oldIgnoreReason = this.ignoreReason;
        this.ignoreReason = newIgnoreReason;
        final boolean oldIgnoreReasonESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.ALL_FLAGS |= 0x40000;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldIgnoreReason, (Object)newIgnoreReason, !oldIgnoreReasonESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setIgnoreReason(final IgnoreReasonDTO newIgnoreReason) {
        if (newIgnoreReason != this.ignoreReason) {
            NotificationChain msgs = null;
            if (this.ignoreReason != null) {
                msgs = ((InternalEObject)this.ignoreReason).eInverseRemove((InternalEObject)this, -14, (Class)null, msgs);
            }
            if (newIgnoreReason != null) {
                msgs = ((InternalEObject)newIgnoreReason).eInverseAdd((InternalEObject)this, -14, (Class)null, msgs);
            }
            msgs = this.basicSetIgnoreReason(newIgnoreReason, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldIgnoreReasonESet = (this.ALL_FLAGS & 0x40000) != 0x0;
            this.ALL_FLAGS |= 0x40000;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)newIgnoreReason, (Object)newIgnoreReason, !oldIgnoreReasonESet));
            }
        }
    }
    
    public NotificationChain basicUnsetIgnoreReason(NotificationChain msgs) {
        final IgnoreReasonDTO oldIgnoreReason = this.ignoreReason;
        this.ignoreReason = null;
        final boolean oldIgnoreReasonESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.ALL_FLAGS &= 0xFFFBFFFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldIgnoreReason, (Object)null, oldIgnoreReasonESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetIgnoreReason() {
        if (this.ignoreReason != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.ignoreReason).eInverseRemove((InternalEObject)this, -14, (Class)null, msgs);
            msgs = this.basicUnsetIgnoreReason(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldIgnoreReasonESet = (this.ALL_FLAGS & 0x40000) != 0x0;
            this.ALL_FLAGS &= 0xFFFBFFFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)null, (Object)null, oldIgnoreReasonESet));
            }
        }
    }
    
    public boolean isSetIgnoreReason() {
        return (this.ALL_FLAGS & 0x40000) != 0x0;
    }
    
    public Map getUserProperties() {
        if (this.userProperties == null) {
            this.userProperties = (EMap)new EcoreEMap.Unsettable(ScmPackage.Literals.PROPERTY, (Class)PropertyImpl.class, (InternalEObject)this, 14);
        }
        return this.userProperties.map();
    }
    
    public void unsetUserProperties() {
        if (this.userProperties != null) {
            ((InternalEList.Unsettable)this.userProperties).unset();
        }
    }
    
    public boolean isSetUserProperties() {
        return this.userProperties != null && ((InternalEList.Unsettable)this.userProperties).isSet();
    }
    
    public SymlinkPropertiesDTO getSymlinkProperties() {
        return this.symlinkProperties;
    }
    
    public NotificationChain basicSetSymlinkProperties(final SymlinkPropertiesDTO newSymlinkProperties, NotificationChain msgs) {
        final SymlinkPropertiesDTO oldSymlinkProperties = this.symlinkProperties;
        this.symlinkProperties = newSymlinkProperties;
        final boolean oldSymlinkPropertiesESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.ALL_FLAGS |= 0x80000;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 15, (Object)oldSymlinkProperties, (Object)newSymlinkProperties, !oldSymlinkPropertiesESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setSymlinkProperties(final SymlinkPropertiesDTO newSymlinkProperties) {
        if (newSymlinkProperties != this.symlinkProperties) {
            NotificationChain msgs = null;
            if (this.symlinkProperties != null) {
                msgs = ((InternalEObject)this.symlinkProperties).eInverseRemove((InternalEObject)this, -16, (Class)null, msgs);
            }
            if (newSymlinkProperties != null) {
                msgs = ((InternalEObject)newSymlinkProperties).eInverseAdd((InternalEObject)this, -16, (Class)null, msgs);
            }
            msgs = this.basicSetSymlinkProperties(newSymlinkProperties, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSymlinkPropertiesESet = (this.ALL_FLAGS & 0x80000) != 0x0;
            this.ALL_FLAGS |= 0x80000;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 15, (Object)newSymlinkProperties, (Object)newSymlinkProperties, !oldSymlinkPropertiesESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSymlinkProperties(NotificationChain msgs) {
        final SymlinkPropertiesDTO oldSymlinkProperties = this.symlinkProperties;
        this.symlinkProperties = null;
        final boolean oldSymlinkPropertiesESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.ALL_FLAGS &= 0xFFF7FFFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 15, (Object)oldSymlinkProperties, (Object)null, oldSymlinkPropertiesESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetSymlinkProperties() {
        if (this.symlinkProperties != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.symlinkProperties).eInverseRemove((InternalEObject)this, -16, (Class)null, msgs);
            msgs = this.basicUnsetSymlinkProperties(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSymlinkPropertiesESet = (this.ALL_FLAGS & 0x80000) != 0x0;
            this.ALL_FLAGS &= 0xFFF7FFFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 15, (Object)null, (Object)null, oldSymlinkPropertiesESet));
            }
        }
    }
    
    public boolean isSetSymlinkProperties() {
        return (this.ALL_FLAGS & 0x80000) != 0x0;
    }
    
    public PermissionsContextDTO getPermissionsContext() {
        return this.permissionsContext;
    }
    
    public NotificationChain basicSetPermissionsContext(final PermissionsContextDTO newPermissionsContext, NotificationChain msgs) {
        final PermissionsContextDTO oldPermissionsContext = this.permissionsContext;
        this.permissionsContext = newPermissionsContext;
        final boolean oldPermissionsContextESet = (this.ALL_FLAGS & 0x100000) != 0x0;
        this.ALL_FLAGS |= 0x100000;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 16, (Object)oldPermissionsContext, (Object)newPermissionsContext, !oldPermissionsContextESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setPermissionsContext(final PermissionsContextDTO newPermissionsContext) {
        if (newPermissionsContext != this.permissionsContext) {
            NotificationChain msgs = null;
            if (this.permissionsContext != null) {
                msgs = ((InternalEObject)this.permissionsContext).eInverseRemove((InternalEObject)this, -17, (Class)null, msgs);
            }
            if (newPermissionsContext != null) {
                msgs = ((InternalEObject)newPermissionsContext).eInverseAdd((InternalEObject)this, -17, (Class)null, msgs);
            }
            msgs = this.basicSetPermissionsContext(newPermissionsContext, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPermissionsContextESet = (this.ALL_FLAGS & 0x100000) != 0x0;
            this.ALL_FLAGS |= 0x100000;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 16, (Object)newPermissionsContext, (Object)newPermissionsContext, !oldPermissionsContextESet));
            }
        }
    }
    
    public NotificationChain basicUnsetPermissionsContext(NotificationChain msgs) {
        final PermissionsContextDTO oldPermissionsContext = this.permissionsContext;
        this.permissionsContext = null;
        final boolean oldPermissionsContextESet = (this.ALL_FLAGS & 0x100000) != 0x0;
        this.ALL_FLAGS &= 0xFFEFFFFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 16, (Object)oldPermissionsContext, (Object)null, oldPermissionsContextESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetPermissionsContext() {
        if (this.permissionsContext != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.permissionsContext).eInverseRemove((InternalEObject)this, -17, (Class)null, msgs);
            msgs = this.basicUnsetPermissionsContext(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPermissionsContextESet = (this.ALL_FLAGS & 0x100000) != 0x0;
            this.ALL_FLAGS &= 0xFFEFFFFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 16, (Object)null, (Object)null, oldPermissionsContextESet));
            }
        }
    }
    
    public boolean isSetPermissionsContext() {
        return (this.ALL_FLAGS & 0x100000) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return this.basicUnsetPath(msgs);
            }
            case 2: {
                return this.basicUnsetRemotePath(msgs);
            }
            case 4: {
                return this.basicUnsetShare(msgs);
            }
            case 12: {
                return this.basicUnsetFileProperties(msgs);
            }
            case 13: {
                return this.basicUnsetIgnoreReason(msgs);
            }
            case 14: {
                return ((InternalEList)((EMap.InternalMapView)this.getUserProperties()).eMap()).basicRemove((Object)otherEnd, msgs);
            }
            case 15: {
                return this.basicUnsetSymlinkProperties(msgs);
            }
            case 16: {
                return this.basicUnsetPermissionsContext(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getFullPath();
            }
            case 1: {
                return this.getPath();
            }
            case 2: {
                return this.getRemotePath();
            }
            case 3: {
                return this.isShared() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 4: {
                return this.getShare();
            }
            case 5: {
                return this.getVersionableItemType();
            }
            case 6: {
                return this.getItemId();
            }
            case 7: {
                return this.getStateId();
            }
            case 8: {
                return this.isIgnored() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 9: {
                return this.isLocal() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 10: {
                return this.isRemote() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 11: {
                return this.isDirty() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 12: {
                return this.getFileProperties();
            }
            case 13: {
                return this.getIgnoreReason();
            }
            case 14: {
                if (coreType) {
                    return ((EMap.InternalMapView)this.getUserProperties()).eMap();
                }
                return this.getUserProperties();
            }
            case 15: {
                return this.getSymlinkProperties();
            }
            case 16: {
                return this.getPermissionsContext();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setFullPath((String)newValue);
            }
            case 1: {
                this.setPath((ShareableDTO)newValue);
            }
            case 2: {
                this.setRemotePath((PathDTO)newValue);
            }
            case 3: {
                this.setShared((boolean)newValue);
            }
            case 4: {
                this.setShare((ShareDTO)newValue);
            }
            case 5: {
                this.setVersionableItemType((String)newValue);
            }
            case 6: {
                this.setItemId((String)newValue);
            }
            case 7: {
                this.setStateId((String)newValue);
            }
            case 8: {
                this.setIgnored((boolean)newValue);
            }
            case 9: {
                this.setLocal((boolean)newValue);
            }
            case 10: {
                this.setRemote((boolean)newValue);
            }
            case 11: {
                this.setDirty((boolean)newValue);
            }
            case 12: {
                this.setFileProperties((FilePropertiesDTO)newValue);
            }
            case 13: {
                this.setIgnoreReason((IgnoreReasonDTO)newValue);
            }
            case 14: {
                ((EStructuralFeature.Setting)((EMap.InternalMapView)this.getUserProperties()).eMap()).set(newValue);
            }
            case 15: {
                this.setSymlinkProperties((SymlinkPropertiesDTO)newValue);
            }
            case 16: {
                this.setPermissionsContext((PermissionsContextDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetFullPath();
            }
            case 1: {
                this.unsetPath();
            }
            case 2: {
                this.unsetRemotePath();
            }
            case 3: {
                this.unsetShared();
            }
            case 4: {
                this.unsetShare();
            }
            case 5: {
                this.unsetVersionableItemType();
            }
            case 6: {
                this.unsetItemId();
            }
            case 7: {
                this.unsetStateId();
            }
            case 8: {
                this.unsetIgnored();
            }
            case 9: {
                this.unsetLocal();
            }
            case 10: {
                this.unsetRemote();
            }
            case 11: {
                this.unsetDirty();
            }
            case 12: {
                this.unsetFileProperties();
            }
            case 13: {
                this.unsetIgnoreReason();
            }
            case 14: {
                this.unsetUserProperties();
            }
            case 15: {
                this.unsetSymlinkProperties();
            }
            case 16: {
                this.unsetPermissionsContext();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetFullPath();
            }
            case 1: {
                return this.isSetPath();
            }
            case 2: {
                return this.isSetRemotePath();
            }
            case 3: {
                return this.isSetShared();
            }
            case 4: {
                return this.isSetShare();
            }
            case 5: {
                return this.isSetVersionableItemType();
            }
            case 6: {
                return this.isSetItemId();
            }
            case 7: {
                return this.isSetStateId();
            }
            case 8: {
                return this.isSetIgnored();
            }
            case 9: {
                return this.isSetLocal();
            }
            case 10: {
                return this.isSetRemote();
            }
            case 11: {
                return this.isSetDirty();
            }
            case 12: {
                return this.isSetFileProperties();
            }
            case 13: {
                return this.isSetIgnoreReason();
            }
            case 14: {
                return this.isSetUserProperties();
            }
            case 15: {
                return this.isSetSymlinkProperties();
            }
            case 16: {
                return this.isSetPermissionsContext();
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
        result.append(" (fullPath: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.fullPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(", shared: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemType: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.versionableItemType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", itemId: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.itemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", stateId: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.stateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", ignored: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append((this.ALL_FLAGS & 0x200) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", local: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x800) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", remote: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", dirty: ");
        if ((this.ALL_FLAGS & 0x10000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
