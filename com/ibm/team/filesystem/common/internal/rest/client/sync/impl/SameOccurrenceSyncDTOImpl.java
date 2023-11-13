// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SameOccurrenceSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SameOccurrenceSyncDTOImpl extends EObjectImpl implements SameOccurrenceSyncDTO
{
    protected int ALL_FLAGS;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 1;
    protected static final boolean INCOMING_EDEFAULT = false;
    protected static final int INCOMING_EFLAG = 2;
    protected static final int INCOMING_ESETFLAG = 4;
    protected static final boolean OUTGOING_EDEFAULT = false;
    protected static final int OUTGOING_EFLAG = 8;
    protected static final int OUTGOING_ESETFLAG = 16;
    protected static final boolean SUSPENDED_EDEFAULT = false;
    protected static final int SUSPENDED_EFLAG = 32;
    protected static final int SUSPENDED_ESETFLAG = 64;
    protected static final boolean UNRESOLVED_EDEFAULT = false;
    protected static final int UNRESOLVED_EFLAG = 128;
    protected static final int UNRESOLVED_ESETFLAG = 256;
    
    protected SameOccurrenceSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.id = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.SAME_OCCURRENCE_SYNC_DTO;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public boolean isOutgoing() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public void setOutgoing(final boolean newOutgoing) {
        final boolean oldOutgoing = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newOutgoing) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldOutgoingESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldOutgoing, newOutgoing, !oldOutgoingESet));
        }
    }
    
    public void unsetOutgoing() {
        final boolean oldOutgoing = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldOutgoingESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldOutgoing, false, oldOutgoingESet));
        }
    }
    
    public boolean isSetOutgoing() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public boolean isIncoming() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public void setIncoming(final boolean newIncoming) {
        final boolean oldIncoming = (this.ALL_FLAGS & 0x2) != 0x0;
        if (newIncoming) {
            this.ALL_FLAGS |= 0x2;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFD;
        }
        final boolean oldIncomingESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldIncoming, newIncoming, !oldIncomingESet));
        }
    }
    
    public void unsetIncoming() {
        final boolean oldIncoming = (this.ALL_FLAGS & 0x2) != 0x0;
        final boolean oldIncomingESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldIncoming, false, oldIncomingESet));
        }
    }
    
    public boolean isSetIncoming() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public boolean isSuspended() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public void setSuspended(final boolean newSuspended) {
        final boolean oldSuspended = (this.ALL_FLAGS & 0x20) != 0x0;
        if (newSuspended) {
            this.ALL_FLAGS |= 0x20;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFDF;
        }
        final boolean oldSuspendedESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldSuspended, newSuspended, !oldSuspendedESet));
        }
    }
    
    public void unsetSuspended() {
        final boolean oldSuspended = (this.ALL_FLAGS & 0x20) != 0x0;
        final boolean oldSuspendedESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldSuspended, false, oldSuspendedESet));
        }
    }
    
    public boolean isSetSuspended() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public boolean isUnresolved() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public void setUnresolved(final boolean newUnresolved) {
        final boolean oldUnresolved = (this.ALL_FLAGS & 0x80) != 0x0;
        if (newUnresolved) {
            this.ALL_FLAGS |= 0x80;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFF7F;
        }
        final boolean oldUnresolvedESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldUnresolved, newUnresolved, !oldUnresolvedESet));
        }
    }
    
    public void unsetUnresolved() {
        final boolean oldUnresolved = (this.ALL_FLAGS & 0x80) != 0x0;
        final boolean oldUnresolvedESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldUnresolved, false, oldUnresolvedESet));
        }
    }
    
    public boolean isSetUnresolved() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getId());
            }
            case 1: {
                return this.isIncoming() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.isOutgoing() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 3: {
                return this.isSuspended() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 4: {
                return this.isUnresolved() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setId((int)newValue);
            }
            case 1: {
                this.setIncoming((boolean)newValue);
            }
            case 2: {
                this.setOutgoing((boolean)newValue);
            }
            case 3: {
                this.setSuspended((boolean)newValue);
            }
            case 4: {
                this.setUnresolved((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetId();
            }
            case 1: {
                this.unsetIncoming();
            }
            case 2: {
                this.unsetOutgoing();
            }
            case 3: {
                this.unsetSuspended();
            }
            case 4: {
                this.unsetUnresolved();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetId();
            }
            case 1: {
                return this.isSetIncoming();
            }
            case 2: {
                return this.isSetOutgoing();
            }
            case 3: {
                return this.isSetSuspended();
            }
            case 4: {
                return this.isSetUnresolved();
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
        result.append(" (id: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", incoming: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", outgoing: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", suspended: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append((this.ALL_FLAGS & 0x20) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", unresolved: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append((this.ALL_FLAGS & 0x80) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
