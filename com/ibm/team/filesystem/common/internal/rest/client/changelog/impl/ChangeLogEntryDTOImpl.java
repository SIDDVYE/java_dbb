// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogEntryDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ChangeLogEntryDTOImpl extends EObjectImpl implements ChangeLogEntryDTO
{
    protected int ALL_FLAGS;
    protected static final String ENTRY_TYPE_EDEFAULT;
    protected String entryType;
    protected static final int ENTRY_TYPE_ESETFLAG = 1;
    protected static final String ITEM_ID_EDEFAULT;
    protected String itemId;
    protected static final int ITEM_ID_ESETFLAG = 2;
    protected EList childEntries;
    protected static final String ENTRY_NAME_EDEFAULT;
    protected String entryName;
    protected static final int ENTRY_NAME_ESETFLAG = 4;
    
    static {
        ENTRY_TYPE_EDEFAULT = null;
        ITEM_ID_EDEFAULT = null;
        ENTRY_NAME_EDEFAULT = null;
    }
    
    protected ChangeLogEntryDTOImpl() {
        this.ALL_FLAGS = 0;
        this.entryType = ChangeLogEntryDTOImpl.ENTRY_TYPE_EDEFAULT;
        this.itemId = ChangeLogEntryDTOImpl.ITEM_ID_EDEFAULT;
        this.entryName = ChangeLogEntryDTOImpl.ENTRY_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_ENTRY_DTO;
    }
    
    public String getEntryType() {
        return this.entryType;
    }
    
    public void setEntryType(final String newEntryType) {
        final String oldEntryType = this.entryType;
        this.entryType = newEntryType;
        final boolean oldEntryTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldEntryType, (Object)this.entryType, !oldEntryTypeESet));
        }
    }
    
    public void unsetEntryType() {
        final String oldEntryType = this.entryType;
        final boolean oldEntryTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.entryType = ChangeLogEntryDTOImpl.ENTRY_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldEntryType, (Object)ChangeLogEntryDTOImpl.ENTRY_TYPE_EDEFAULT, oldEntryTypeESet));
        }
    }
    
    public boolean isSetEntryType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(final String newItemId) {
        final String oldItemId = this.itemId;
        this.itemId = newItemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldItemId, (Object)this.itemId, !oldItemIdESet));
        }
    }
    
    public void unsetItemId() {
        final String oldItemId = this.itemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.itemId = ChangeLogEntryDTOImpl.ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldItemId, (Object)ChangeLogEntryDTOImpl.ITEM_ID_EDEFAULT, oldItemIdESet));
        }
    }
    
    public boolean isSetItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getChildEntries() {
        if (this.childEntries == null) {
            this.childEntries = (EList)new EObjectResolvingEList.Unsettable((Class)ChangeLogEntryDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.childEntries;
    }
    
    public void unsetChildEntries() {
        if (this.childEntries != null) {
            ((InternalEList.Unsettable)this.childEntries).unset();
        }
    }
    
    public boolean isSetChildEntries() {
        return this.childEntries != null && ((InternalEList.Unsettable)this.childEntries).isSet();
    }
    
    public String getEntryName() {
        return this.entryName;
    }
    
    public void setEntryName(final String newEntryName) {
        final String oldEntryName = this.entryName;
        this.entryName = newEntryName;
        final boolean oldEntryNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldEntryName, (Object)this.entryName, !oldEntryNameESet));
        }
    }
    
    public void unsetEntryName() {
        final String oldEntryName = this.entryName;
        final boolean oldEntryNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.entryName = ChangeLogEntryDTOImpl.ENTRY_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldEntryName, (Object)ChangeLogEntryDTOImpl.ENTRY_NAME_EDEFAULT, oldEntryNameESet));
        }
    }
    
    public boolean isSetEntryName() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getEntryType();
            }
            case 1: {
                return this.getItemId();
            }
            case 2: {
                return this.getChildEntries();
            }
            case 3: {
                return this.getEntryName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setEntryType((String)newValue);
            }
            case 1: {
                this.setItemId((String)newValue);
            }
            case 2: {
                this.getChildEntries().clear();
                this.getChildEntries().addAll((Collection)newValue);
            }
            case 3: {
                this.setEntryName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetEntryType();
            }
            case 1: {
                this.unsetItemId();
            }
            case 2: {
                this.unsetChildEntries();
            }
            case 3: {
                this.unsetEntryName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetEntryType();
            }
            case 1: {
                return this.isSetItemId();
            }
            case 2: {
                return this.isSetChildEntries();
            }
            case 3: {
                return this.isSetEntryName();
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
        result.append(" (entryType: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.entryType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", itemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.itemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", entryName: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.entryName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
