// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.repository.common.IItemHandle;
import com.ibm.team.filesystem.common.IBasicChange;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.repository.common.UUID;
import com.ibm.team.scm.common.IFolderHandle;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.filesystem.common.internal.dto.BasicChange;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class BasicChangeImpl extends EObjectImpl implements BasicChange
{
    protected int ALL_FLAGS;
    protected IComponentHandle component;
    protected static final int COMPONENT_ESETFLAG = 1;
    protected static final int CHANGE_TYPE_EDEFAULT = 0;
    protected int changeType;
    protected static final int CHANGE_TYPE_ESETFLAG = 2;
    protected static final String NAME_EDEFAULT = "";
    protected String name;
    protected static final int NAME_ESETFLAG = 4;
    protected static final String OLD_NAME_EDEFAULT = "";
    protected String oldName;
    protected static final int OLD_NAME_ESETFLAG = 8;
    protected IVersionableHandle item;
    protected static final int ITEM_ESETFLAG = 16;
    protected IFolderHandle sourceParent;
    protected static final int SOURCE_PARENT_ESETFLAG = 32;
    protected IFolderHandle destinationParent;
    protected static final int DESTINATION_PARENT_ESETFLAG = 64;
    protected static final UUID BEFORE_EDEFAULT;
    protected UUID before;
    protected static final int BEFORE_ESETFLAG = 128;
    protected static final UUID AFTER_EDEFAULT;
    protected UUID after;
    protected static final int AFTER_ESETFLAG = 256;
    protected IComponentHandle previousComponent;
    protected static final int PREVIOUS_COMPONENT_ESETFLAG = 512;
    protected static final int CHANGE_DETAILS_EDEFAULT = 0;
    protected int changeDetails;
    protected static final int CHANGE_DETAILS_ESETFLAG = 1024;
    
    static {
        BEFORE_EDEFAULT = null;
        AFTER_EDEFAULT = null;
    }
    
    protected BasicChangeImpl() {
        this.ALL_FLAGS = 0;
        this.changeType = 0;
        this.name = "";
        this.oldName = "";
        this.before = BasicChangeImpl.BEFORE_EDEFAULT;
        this.after = BasicChangeImpl.AFTER_EDEFAULT;
        this.changeDetails = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.BASIC_CHANGE;
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
    
    public int getChangeType() {
        return this.changeType;
    }
    
    public void setChangeType(final int newChangeType) {
        final int oldChangeType = this.changeType;
        this.changeType = newChangeType;
        final boolean oldChangeTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldChangeType, this.changeType, !oldChangeTypeESet));
        }
    }
    
    public void unsetChangeType() {
        final int oldChangeType = this.changeType;
        final boolean oldChangeTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.changeType = 0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldChangeType, 0, oldChangeTypeESet));
        }
    }
    
    public boolean isSetChangeType() {
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
    
    public String getOldName() {
        return this.oldName;
    }
    
    public void setOldName(final String newOldName) {
        final String oldOldName = this.oldName;
        this.oldName = newOldName;
        final boolean oldOldNameESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldOldName, (Object)this.oldName, !oldOldNameESet));
        }
    }
    
    public void unsetOldName() {
        final String oldOldName = this.oldName;
        final boolean oldOldNameESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.oldName = "";
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldOldName, (Object)"", oldOldNameESet));
        }
    }
    
    public boolean isSetOldName() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public IVersionableHandle getItem() {
        if (this.item != null && ((EObject)this.item).eIsProxy()) {
            final InternalEObject oldItem = (InternalEObject)this.item;
            this.item = (IVersionableHandle)this.eResolveProxy(oldItem);
            if (this.item != oldItem && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 4, (Object)oldItem, (Object)this.item));
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
        final boolean oldItemESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldItem, (Object)this.item, !oldItemESet));
        }
    }
    
    public void unsetItem() {
        final IVersionableHandle oldItem = this.item;
        final boolean oldItemESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.item = null;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldItem, (Object)null, oldItemESet));
        }
    }
    
    public boolean isSetItem() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public IFolderHandle getSourceParent() {
        if (this.sourceParent != null && ((EObject)this.sourceParent).eIsProxy()) {
            final InternalEObject oldSourceParent = (InternalEObject)this.sourceParent;
            this.sourceParent = (IFolderHandle)this.eResolveProxy(oldSourceParent);
            if (this.sourceParent != oldSourceParent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 5, (Object)oldSourceParent, (Object)this.sourceParent));
            }
        }
        return this.sourceParent;
    }
    
    public IFolderHandle basicGetSourceParent() {
        return this.sourceParent;
    }
    
    public void setSourceParent(final IFolderHandle newSourceParent) {
        final IFolderHandle oldSourceParent = this.sourceParent;
        this.sourceParent = newSourceParent;
        final boolean oldSourceParentESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldSourceParent, (Object)this.sourceParent, !oldSourceParentESet));
        }
    }
    
    public void unsetSourceParent() {
        final IFolderHandle oldSourceParent = this.sourceParent;
        final boolean oldSourceParentESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.sourceParent = null;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldSourceParent, (Object)null, oldSourceParentESet));
        }
    }
    
    public boolean isSetSourceParent() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public IFolderHandle getDestinationParent() {
        if (this.destinationParent != null && ((EObject)this.destinationParent).eIsProxy()) {
            final InternalEObject oldDestinationParent = (InternalEObject)this.destinationParent;
            this.destinationParent = (IFolderHandle)this.eResolveProxy(oldDestinationParent);
            if (this.destinationParent != oldDestinationParent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 6, (Object)oldDestinationParent, (Object)this.destinationParent));
            }
        }
        return this.destinationParent;
    }
    
    public IFolderHandle basicGetDestinationParent() {
        return this.destinationParent;
    }
    
    public void setDestinationParent(final IFolderHandle newDestinationParent) {
        final IFolderHandle oldDestinationParent = this.destinationParent;
        this.destinationParent = newDestinationParent;
        final boolean oldDestinationParentESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldDestinationParent, (Object)this.destinationParent, !oldDestinationParentESet));
        }
    }
    
    public void unsetDestinationParent() {
        final IFolderHandle oldDestinationParent = this.destinationParent;
        final boolean oldDestinationParentESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.destinationParent = null;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldDestinationParent, (Object)null, oldDestinationParentESet));
        }
    }
    
    public boolean isSetDestinationParent() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public UUID getBefore() {
        return this.before;
    }
    
    public void setBefore(final UUID newBefore) {
        final UUID oldBefore = this.before;
        this.before = newBefore;
        final boolean oldBeforeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldBefore, (Object)this.before, !oldBeforeESet));
        }
    }
    
    public void unsetBefore() {
        final UUID oldBefore = this.before;
        final boolean oldBeforeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.before = BasicChangeImpl.BEFORE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldBefore, (Object)BasicChangeImpl.BEFORE_EDEFAULT, oldBeforeESet));
        }
    }
    
    public boolean isSetBefore() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public UUID getAfter() {
        return this.after;
    }
    
    public void setAfter(final UUID newAfter) {
        final UUID oldAfter = this.after;
        this.after = newAfter;
        final boolean oldAfterESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldAfter, (Object)this.after, !oldAfterESet));
        }
    }
    
    public void unsetAfter() {
        final UUID oldAfter = this.after;
        final boolean oldAfterESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.after = BasicChangeImpl.AFTER_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldAfter, (Object)BasicChangeImpl.AFTER_EDEFAULT, oldAfterESet));
        }
    }
    
    public boolean isSetAfter() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public IComponentHandle getPreviousComponent() {
        if (this.previousComponent != null && ((EObject)this.previousComponent).eIsProxy()) {
            final InternalEObject oldPreviousComponent = (InternalEObject)this.previousComponent;
            this.previousComponent = (IComponentHandle)this.eResolveProxy(oldPreviousComponent);
            if (this.previousComponent != oldPreviousComponent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 9, (Object)oldPreviousComponent, (Object)this.previousComponent));
            }
        }
        return this.previousComponent;
    }
    
    public IComponentHandle basicGetPreviousComponent() {
        return this.previousComponent;
    }
    
    public void setPreviousComponent(final IComponentHandle newPreviousComponent) {
        final IComponentHandle oldPreviousComponent = this.previousComponent;
        this.previousComponent = newPreviousComponent;
        final boolean oldPreviousComponentESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldPreviousComponent, (Object)this.previousComponent, !oldPreviousComponentESet));
        }
    }
    
    public void unsetPreviousComponent() {
        final IComponentHandle oldPreviousComponent = this.previousComponent;
        final boolean oldPreviousComponentESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.previousComponent = null;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldPreviousComponent, (Object)null, oldPreviousComponentESet));
        }
    }
    
    public boolean isSetPreviousComponent() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public int getChangeDetails() {
        return this.changeDetails;
    }
    
    public void setChangeDetails(final int newChangeDetails) {
        final int oldChangeDetails = this.changeDetails;
        this.changeDetails = newChangeDetails;
        final boolean oldChangeDetailsESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, oldChangeDetails, this.changeDetails, !oldChangeDetailsESet));
        }
    }
    
    public void unsetChangeDetails() {
        final int oldChangeDetails = this.changeDetails;
        final boolean oldChangeDetailsESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.changeDetails = 0;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, oldChangeDetails, 0, oldChangeDetailsESet));
        }
    }
    
    public boolean isSetChangeDetails() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
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
                return new Integer(this.getChangeType());
            }
            case 2: {
                return this.getName();
            }
            case 3: {
                return this.getOldName();
            }
            case 4: {
                if (resolve) {
                    return this.getItem();
                }
                return this.basicGetItem();
            }
            case 5: {
                if (resolve) {
                    return this.getSourceParent();
                }
                return this.basicGetSourceParent();
            }
            case 6: {
                if (resolve) {
                    return this.getDestinationParent();
                }
                return this.basicGetDestinationParent();
            }
            case 7: {
                return this.getBefore();
            }
            case 8: {
                return this.getAfter();
            }
            case 9: {
                if (resolve) {
                    return this.getPreviousComponent();
                }
                return this.basicGetPreviousComponent();
            }
            case 10: {
                return new Integer(this.getChangeDetails());
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
                this.setChangeType((int)newValue);
            }
            case 2: {
                this.setName((String)newValue);
            }
            case 3: {
                this.setOldName((String)newValue);
            }
            case 4: {
                this.setItem((IVersionableHandle)newValue);
            }
            case 5: {
                this.setSourceParent((IFolderHandle)newValue);
            }
            case 6: {
                this.setDestinationParent((IFolderHandle)newValue);
            }
            case 7: {
                this.setBefore((UUID)newValue);
            }
            case 8: {
                this.setAfter((UUID)newValue);
            }
            case 9: {
                this.setPreviousComponent((IComponentHandle)newValue);
            }
            case 10: {
                this.setChangeDetails((int)newValue);
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
                this.unsetChangeType();
            }
            case 2: {
                this.unsetName();
            }
            case 3: {
                this.unsetOldName();
            }
            case 4: {
                this.unsetItem();
            }
            case 5: {
                this.unsetSourceParent();
            }
            case 6: {
                this.unsetDestinationParent();
            }
            case 7: {
                this.unsetBefore();
            }
            case 8: {
                this.unsetAfter();
            }
            case 9: {
                this.unsetPreviousComponent();
            }
            case 10: {
                this.unsetChangeDetails();
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
                return this.isSetChangeType();
            }
            case 2: {
                return this.isSetName();
            }
            case 3: {
                return this.isSetOldName();
            }
            case 4: {
                return this.isSetItem();
            }
            case 5: {
                return this.isSetSourceParent();
            }
            case 6: {
                return this.isSetDestinationParent();
            }
            case 7: {
                return this.isSetBefore();
            }
            case 8: {
                return this.isSetAfter();
            }
            case 9: {
                return this.isSetPreviousComponent();
            }
            case 10: {
                return this.isSetChangeDetails();
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
        result.append(" (changeType: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.changeType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", oldName: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.oldName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", before: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.before);
        }
        else {
            result.append("<unset>");
        }
        result.append(", after: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.after);
        }
        else {
            result.append("<unset>");
        }
        result.append(", changeDetails: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.changeDetails);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    public IComponentHandle component() {
        return this.getComponent();
    }
    
    public IFolderHandle parent() {
        if (this.isChangeType(2)) {
            return this.getSourceParent();
        }
        return this.getDestinationParent();
    }
    
    public IFolderHandle oldParent() {
        if (this.isChangeType(1)) {
            return null;
        }
        return this.getSourceParent();
    }
    
    public IVersionableHandle afterState() {
        if (this.getAfter() == null) {
            return null;
        }
        return (IVersionableHandle)this.getItem().getItemType().createItemHandle(this.getItem().getItemId(), this.getAfter());
    }
    
    public IVersionableHandle beforeState() {
        if (this.getBefore() == null) {
            return null;
        }
        return (IVersionableHandle)this.getItem().getItemType().createItemHandle(this.getItem().getItemId(), this.getBefore());
    }
    
    public boolean isChangeType(final int type) {
        return type == (this.getChangeType() & type);
    }
    
    public IVersionableHandle item() {
        return this.getItem();
    }
    
    public boolean isSameChangeType(final IBasicChange change) {
        return change != null && change.item().sameItemId((IItemHandle)this.item()) && ((BasicChangeImpl)change).getChangeType() == this.getChangeType();
    }
    
    public boolean isModificationChange(final int changeDetail) {
        return this.isChangeType(4) && (this.getChangeDetails() & changeDetail) == changeDetail;
    }
}
