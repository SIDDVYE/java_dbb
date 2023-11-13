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
import com.ibm.team.scm.common.IFolderHandle;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution2;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ConflictResolution2Impl extends EObjectImpl implements ConflictResolution2
{
    protected int ALL_FLAGS;
    protected IComponentHandle component;
    protected static final int COMPONENT_ESETFLAG = 1;
    protected IVersionableHandle item;
    protected static final int ITEM_ESETFLAG = 2;
    protected IFolderHandle parent;
    protected static final int PARENT_ESETFLAG = 4;
    protected static final String NAME_EDEFAULT = "";
    protected String name;
    protected static final int NAME_ESETFLAG = 8;
    
    protected ConflictResolution2Impl() {
        this.ALL_FLAGS = 0;
        this.name = "";
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.CONFLICT_RESOLUTION2;
    }
    
    public IComponentHandle getComponent() {
        if (this.component != null && ((EObject)this.component).eIsProxy()) {
            final InternalEObject oldComponent = (InternalEObject)this.component;
            this.component = (IComponentHandle)this.eResolveProxy(oldComponent);
            if (this.component != oldComponent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 0, (Object)oldComponent, (Object)this.component));
            }
        }
        return this.component;
    }
    
    public IComponentHandle basicGetComponent() {
        return this.component;
    }
    
    public void setComponent(final IComponentHandle newComponent) {
        final IComponentHandle oldComponent = this.component;
        this.component = newComponent;
        final boolean oldComponentESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldComponent, (Object)this.component, !oldComponentESet));
        }
    }
    
    public void unsetComponent() {
        final IComponentHandle oldComponent = this.component;
        final boolean oldComponentESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.component = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldComponent, (Object)null, oldComponentESet));
        }
    }
    
    public boolean isSetComponent() {
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
    
    public IFolderHandle getParent() {
        if (this.parent != null && ((EObject)this.parent).eIsProxy()) {
            final InternalEObject oldParent = (InternalEObject)this.parent;
            this.parent = (IFolderHandle)this.eResolveProxy(oldParent);
            if (this.parent != oldParent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 2, (Object)oldParent, (Object)this.parent));
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
        final boolean oldParentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldParent, (Object)this.parent, !oldParentESet));
        }
    }
    
    public void unsetParent() {
        final IFolderHandle oldParent = this.parent;
        final boolean oldParentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.parent = null;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldParent, (Object)null, oldParentESet));
        }
    }
    
    public boolean isSetParent() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.name = "";
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldName, (Object)"", oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (resolve) {
                    return this.getComponent();
                }
                return this.basicGetComponent();
            }
            case 1: {
                if (resolve) {
                    return this.getItem();
                }
                return this.basicGetItem();
            }
            case 2: {
                if (resolve) {
                    return this.getParent();
                }
                return this.basicGetParent();
            }
            case 3: {
                return this.getName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setComponent((IComponentHandle)newValue);
            }
            case 1: {
                this.setItem((IVersionableHandle)newValue);
            }
            case 2: {
                this.setParent((IFolderHandle)newValue);
            }
            case 3: {
                this.setName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComponent();
            }
            case 1: {
                this.unsetItem();
            }
            case 2: {
                this.unsetParent();
            }
            case 3: {
                this.unsetName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComponent();
            }
            case 1: {
                return this.isSetItem();
            }
            case 2: {
                return this.isSetParent();
            }
            case 3: {
                return this.isSetName();
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
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
