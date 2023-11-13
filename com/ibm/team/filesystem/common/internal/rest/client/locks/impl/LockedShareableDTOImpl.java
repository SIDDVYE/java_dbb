// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedShareableDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LockedShareableDTOImpl extends EObjectImpl implements LockedShareableDTO
{
    protected int ALL_FLAGS;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 1;
    protected ShareableDTO lockedShareable;
    protected static final int LOCKED_SHAREABLE_ESETFLAG = 2;
    protected static final String VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String versionableItemId;
    protected static final int VERSIONABLE_ITEM_ID_ESETFLAG = 4;
    protected static final String STREAM_ITEM_ID_EDEFAULT;
    protected String streamItemId;
    protected static final int STREAM_ITEM_ID_ESETFLAG = 8;
    
    static {
        COMPONENT_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_ITEM_ID_EDEFAULT = null;
        STREAM_ITEM_ID_EDEFAULT = null;
    }
    
    protected LockedShareableDTOImpl() {
        this.ALL_FLAGS = 0;
        this.componentItemId = LockedShareableDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.versionableItemId = LockedShareableDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.streamItemId = LockedShareableDTOImpl.STREAM_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOlocksPackage.Literals.LOCKED_SHAREABLE_DTO;
    }
    
    public ShareableDTO getLockedShareable() {
        return this.lockedShareable;
    }
    
    public NotificationChain basicSetLockedShareable(final ShareableDTO newLockedShareable, NotificationChain msgs) {
        final ShareableDTO oldLockedShareable = this.lockedShareable;
        this.lockedShareable = newLockedShareable;
        final boolean oldLockedShareableESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldLockedShareable, (Object)newLockedShareable, !oldLockedShareableESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setLockedShareable(final ShareableDTO newLockedShareable) {
        if (newLockedShareable != this.lockedShareable) {
            NotificationChain msgs = null;
            if (this.lockedShareable != null) {
                msgs = ((InternalEObject)this.lockedShareable).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newLockedShareable != null) {
                msgs = ((InternalEObject)newLockedShareable).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
            }
            msgs = this.basicSetLockedShareable(newLockedShareable, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldLockedShareableESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS |= 0x2;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newLockedShareable, (Object)newLockedShareable, !oldLockedShareableESet));
            }
        }
    }
    
    public NotificationChain basicUnsetLockedShareable(NotificationChain msgs) {
        final ShareableDTO oldLockedShareable = this.lockedShareable;
        this.lockedShareable = null;
        final boolean oldLockedShareableESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldLockedShareable, (Object)null, oldLockedShareableESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetLockedShareable() {
        if (this.lockedShareable != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.lockedShareable).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetLockedShareable(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldLockedShareableESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFD;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldLockedShareableESet));
            }
        }
    }
    
    public boolean isSetLockedShareable() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getVersionableItemId() {
        return this.versionableItemId;
    }
    
    public void setVersionableItemId(final String newVersionableItemId) {
        final String oldVersionableItemId = this.versionableItemId;
        this.versionableItemId = newVersionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldVersionableItemId, (Object)this.versionableItemId, !oldVersionableItemIdESet));
        }
    }
    
    public void unsetVersionableItemId() {
        final String oldVersionableItemId = this.versionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.versionableItemId = LockedShareableDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldVersionableItemId, (Object)LockedShareableDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT, oldVersionableItemIdESet));
        }
    }
    
    public boolean isSetVersionableItemId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
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
        this.componentItemId = LockedShareableDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldComponentItemId, (Object)LockedShareableDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getStreamItemId() {
        return this.streamItemId;
    }
    
    public void setStreamItemId(final String newStreamItemId) {
        final String oldStreamItemId = this.streamItemId;
        this.streamItemId = newStreamItemId;
        final boolean oldStreamItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldStreamItemId, (Object)this.streamItemId, !oldStreamItemIdESet));
        }
    }
    
    public void unsetStreamItemId() {
        final String oldStreamItemId = this.streamItemId;
        final boolean oldStreamItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.streamItemId = LockedShareableDTOImpl.STREAM_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldStreamItemId, (Object)LockedShareableDTOImpl.STREAM_ITEM_ID_EDEFAULT, oldStreamItemIdESet));
        }
    }
    
    public boolean isSetStreamItemId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return this.basicUnsetLockedShareable(msgs);
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
                return this.getLockedShareable();
            }
            case 2: {
                return this.getVersionableItemId();
            }
            case 3: {
                return this.getStreamItemId();
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
                this.setLockedShareable((ShareableDTO)newValue);
            }
            case 2: {
                this.setVersionableItemId((String)newValue);
            }
            case 3: {
                this.setStreamItemId((String)newValue);
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
                this.unsetLockedShareable();
            }
            case 2: {
                this.unsetVersionableItemId();
            }
            case 3: {
                this.unsetStreamItemId();
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
                return this.isSetLockedShareable();
            }
            case 2: {
                return this.isSetVersionableItemId();
            }
            case 3: {
                return this.isSetStreamItemId();
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
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.versionableItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", streamItemId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.streamItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
