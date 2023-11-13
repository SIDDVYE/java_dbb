// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IFolderHandle;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ConflictResolutionImpl extends EObjectImpl implements ConflictResolution
{
    protected int ALL_FLAGS;
    protected IFolderHandle parent;
    protected static final int PARENT_ESETFLAG = 1;
    protected IVersionableHandle item;
    protected static final int ITEM_ESETFLAG = 2;
    protected static final String NAME_EDEFAULT = "";
    protected String name;
    protected static final int NAME_ESETFLAG = 4;
    protected static final int CONFLICT_TYPE_EDEFAULT = 0;
    protected int conflictType;
    protected static final int CONFLICT_TYPE_ESETFLAG = 8;
    
    protected ConflictResolutionImpl() {
        this.ALL_FLAGS = 0;
        this.name = "";
        this.conflictType = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.CONFLICT_RESOLUTION;
    }
    
    public IFolderHandle getParent() {
        if (this.parent != null && ((EObject)this.parent).eIsProxy()) {
            final InternalEObject oldParent = (InternalEObject)this.parent;
            this.parent = (IFolderHandle)this.eResolveProxy(oldParent);
            if (this.parent != oldParent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 0, (Object)oldParent, (Object)this.parent));
            }
        }
        return this.parent;
    }
    
    public IFolderHandle basicGetParent() {
        return this.parent;
    }
    
    public void setParent(final IFolderHandle newParent) {
        final IFolderHandle oldParent = this.parent;
        this.parent = newParent;
        final boolean oldParentESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldParent, (Object)this.parent, !oldParentESet));
        }
    }
    
    public void unsetParent() {
        final IFolderHandle oldParent = this.parent;
        final boolean oldParentESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.parent = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldParent, (Object)null, oldParentESet));
        }
    }
    
    public boolean isSetParent() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public IVersionableHandle getItem() {
        if (this.item != null && ((EObject)this.item).eIsProxy()) {
            final InternalEObject oldItem = (InternalEObject)this.item;
            this.item = (IVersionableHandle)this.eResolveProxy(oldItem);
            if (this.item != oldItem && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldItem, (Object)this.item));
            }
        }
        return this.item;
    }
    
    public IVersionableHandle basicGetItem() {
        return this.item;
    }
    
    public void setItem(final IVersionableHandle newItem) {
        final IVersionableHandle oldItem = this.item;
        this.item = newItem;
        final boolean oldItemESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldItem, (Object)this.item, !oldItemESet));
        }
    }
    
    public void unsetItem() {
        final IVersionableHandle oldItem = this.item;
        final boolean oldItemESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.item = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldItem, (Object)null, oldItemESet));
        }
    }
    
    public boolean isSetItem() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.name = "";
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldName, (Object)"", oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public int getConflictType() {
        return this.conflictType;
    }
    
    public void setConflictType(final int newConflictType) {
        final int oldConflictType = this.conflictType;
        this.conflictType = newConflictType;
        final boolean oldConflictTypeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldConflictType, this.conflictType, !oldConflictTypeESet));
        }
    }
    
    public void unsetConflictType() {
        final int oldConflictType = this.conflictType;
        final boolean oldConflictTypeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.conflictType = 0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldConflictType, 0, oldConflictTypeESet));
        }
    }
    
    public boolean isSetConflictType() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (resolve) {
                    return this.getParent();
                }
                return this.basicGetParent();
            }
            case 1: {
                if (resolve) {
                    return this.getItem();
                }
                return this.basicGetItem();
            }
            case 2: {
                return this.getName();
            }
            case 3: {
                return new Integer(this.getConflictType());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setParent((IFolderHandle)newValue);
            }
            case 1: {
                this.setItem((IVersionableHandle)newValue);
            }
            case 2: {
                this.setName((String)newValue);
            }
            case 3: {
                this.setConflictType((int)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetParent();
            }
            case 1: {
                this.unsetItem();
            }
            case 2: {
                this.unsetName();
            }
            case 3: {
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
                return this.isSetParent();
            }
            case 1: {
                return this.isSetItem();
            }
            case 2: {
                return this.isSetName();
            }
            case 3: {
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
        result.append(" (name: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", conflictType: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.conflictType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
