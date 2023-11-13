// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ConflictedChangeDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ConflictedChangeDTOImpl extends EObjectImpl implements ConflictedChangeDTO
{
    protected int ALL_FLAGS;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 1;
    protected static final String VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String versionableItemId;
    protected static final int VERSIONABLE_ITEM_ID_ESETFLAG = 2;
    protected static final String VERSIONABLE_ITEM_TYPE_EDEFAULT;
    protected String versionableItemType;
    protected static final int VERSIONABLE_ITEM_TYPE_ESETFLAG = 4;
    protected PathDTO path;
    protected static final int PATH_ESETFLAG = 8;
    protected static final String KIND_EDEFAULT;
    protected String kind;
    protected static final int KIND_ESETFLAG = 16;
    protected static final String CONFLICT_TYPE_EDEFAULT;
    protected String conflictType;
    protected static final int CONFLICT_TYPE_ESETFLAG = 32;
    
    static {
        COMPONENT_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_TYPE_EDEFAULT = null;
        KIND_EDEFAULT = null;
        CONFLICT_TYPE_EDEFAULT = null;
    }
    
    protected ConflictedChangeDTOImpl() {
        this.ALL_FLAGS = 0;
        this.componentItemId = ConflictedChangeDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.versionableItemId = ConflictedChangeDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.versionableItemType = ConflictedChangeDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.kind = ConflictedChangeDTOImpl.KIND_EDEFAULT;
        this.conflictType = ConflictedChangeDTOImpl.CONFLICT_TYPE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOconflictPackage.Literals.CONFLICTED_CHANGE_DTO;
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
        this.componentItemId = ConflictedChangeDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldComponentItemId, (Object)ConflictedChangeDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getVersionableItemId() {
        return this.versionableItemId;
    }
    
    public void setVersionableItemId(final String newVersionableItemId) {
        final String oldVersionableItemId = this.versionableItemId;
        this.versionableItemId = newVersionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldVersionableItemId, (Object)this.versionableItemId, !oldVersionableItemIdESet));
        }
    }
    
    public void unsetVersionableItemId() {
        final String oldVersionableItemId = this.versionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.versionableItemId = ConflictedChangeDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldVersionableItemId, (Object)ConflictedChangeDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT, oldVersionableItemIdESet));
        }
    }
    
    public boolean isSetVersionableItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getVersionableItemType() {
        return this.versionableItemType;
    }
    
    public void setVersionableItemType(final String newVersionableItemType) {
        final String oldVersionableItemType = this.versionableItemType;
        this.versionableItemType = newVersionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldVersionableItemType, (Object)this.versionableItemType, !oldVersionableItemTypeESet));
        }
    }
    
    public void unsetVersionableItemType() {
        final String oldVersionableItemType = this.versionableItemType;
        final boolean oldVersionableItemTypeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.versionableItemType = ConflictedChangeDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldVersionableItemType, (Object)ConflictedChangeDTOImpl.VERSIONABLE_ITEM_TYPE_EDEFAULT, oldVersionableItemTypeESet));
        }
    }
    
    public boolean isSetVersionableItemType() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public PathDTO getPath() {
        return this.path;
    }
    
    public NotificationChain basicSetPath(final PathDTO newPath, NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldPath, (Object)newPath, !oldPathESet);
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
                msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -4, (Class)null, msgs);
            }
            if (newPath != null) {
                msgs = ((InternalEObject)newPath).eInverseAdd((InternalEObject)this, -4, (Class)null, msgs);
            }
            msgs = this.basicSetPath(newPath, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS |= 0x8;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)newPath, (Object)newPath, !oldPathESet));
            }
        }
    }
    
    public NotificationChain basicUnsetPath(NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = null;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldPath, (Object)null, oldPathESet);
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
            msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -4, (Class)null, msgs);
            msgs = this.basicUnsetPath(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFF7;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)null, (Object)null, oldPathESet));
            }
        }
    }
    
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getKind() {
        return this.kind;
    }
    
    public void setKind(final String newKind) {
        final String oldKind = this.kind;
        this.kind = newKind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldKind, (Object)this.kind, !oldKindESet));
        }
    }
    
    public void unsetKind() {
        final String oldKind = this.kind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.kind = ConflictedChangeDTOImpl.KIND_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldKind, (Object)ConflictedChangeDTOImpl.KIND_EDEFAULT, oldKindESet));
        }
    }
    
    public boolean isSetKind() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getConflictType() {
        return this.conflictType;
    }
    
    public void setConflictType(final String newConflictType) {
        final String oldConflictType = this.conflictType;
        this.conflictType = newConflictType;
        final boolean oldConflictTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldConflictType, (Object)this.conflictType, !oldConflictTypeESet));
        }
    }
    
    public void unsetConflictType() {
        final String oldConflictType = this.conflictType;
        final boolean oldConflictTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.conflictType = ConflictedChangeDTOImpl.CONFLICT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldConflictType, (Object)ConflictedChangeDTOImpl.CONFLICT_TYPE_EDEFAULT, oldConflictTypeESet));
        }
    }
    
    public boolean isSetConflictType() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 3: {
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
                return this.getVersionableItemId();
            }
            case 2: {
                return this.getVersionableItemType();
            }
            case 3: {
                return this.getPath();
            }
            case 4: {
                return this.getKind();
            }
            case 5: {
                return this.getConflictType();
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
                this.setVersionableItemId((String)newValue);
            }
            case 2: {
                this.setVersionableItemType((String)newValue);
            }
            case 3: {
                this.setPath((PathDTO)newValue);
            }
            case 4: {
                this.setKind((String)newValue);
            }
            case 5: {
                this.setConflictType((String)newValue);
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
                this.unsetVersionableItemId();
            }
            case 2: {
                this.unsetVersionableItemType();
            }
            case 3: {
                this.unsetPath();
            }
            case 4: {
                this.unsetKind();
            }
            case 5: {
                this.unsetConflictType();
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
                return this.isSetVersionableItemId();
            }
            case 2: {
                return this.isSetVersionableItemType();
            }
            case 3: {
                return this.isSetPath();
            }
            case 4: {
                return this.isSetKind();
            }
            case 5: {
                return this.isSetConflictType();
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
        result.append(", versionableItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.versionableItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", versionableItemType: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.versionableItemType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", kind: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.kind);
        }
        else {
            result.append("<unset>");
        }
        result.append(", conflictType: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.conflictType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
