// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SyncStatusDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SyncStatusDTOImpl extends EObjectImpl implements SyncStatusDTO
{
    protected int ALL_FLAGS;
    protected static final int NCOLLISION_EDEFAULT = 0;
    protected int nCollision;
    protected static final int NCOLLISION_ESETFLAG = 1;
    protected static final int NCOMPONENT_CHANGES_EDEFAULT = 0;
    protected int nComponentChanges;
    protected static final int NCOMPONENT_CHANGES_ESETFLAG = 2;
    protected static final int NCONFLICT_EDEFAULT = 0;
    protected int nConflict;
    protected static final int NCONFLICT_ESETFLAG = 4;
    protected static final int NINCOMING_EDEFAULT = 0;
    protected int nIncoming;
    protected static final int NINCOMING_ESETFLAG = 8;
    protected static final int NINCOMING_BASELINES_EDEFAULT = 0;
    protected int nIncomingBaselines;
    protected static final int NINCOMING_BASELINES_ESETFLAG = 16;
    protected static final int NLOCAL_EDEFAULT = 0;
    protected int nLocal;
    protected static final int NLOCAL_ESETFLAG = 32;
    protected static final int NOUTGOING_EDEFAULT = 0;
    protected int nOutgoing;
    protected static final int NOUTGOING_ESETFLAG = 64;
    protected static final int NOUTGOING_BASELINES_EDEFAULT = 0;
    protected int nOutgoingBaselines;
    protected static final int NOUTGOING_BASELINES_ESETFLAG = 128;
    
    protected SyncStatusDTOImpl() {
        this.ALL_FLAGS = 0;
        this.nCollision = 0;
        this.nComponentChanges = 0;
        this.nConflict = 0;
        this.nIncoming = 0;
        this.nIncomingBaselines = 0;
        this.nLocal = 0;
        this.nOutgoing = 0;
        this.nOutgoingBaselines = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.SYNC_STATUS_DTO;
    }
    
    public int getNLocal() {
        return this.nLocal;
    }
    
    public void setNLocal(final int newNLocal) {
        final int oldNLocal = this.nLocal;
        this.nLocal = newNLocal;
        final boolean oldNLocalESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldNLocal, this.nLocal, !oldNLocalESet));
        }
    }
    
    public void unsetNLocal() {
        final int oldNLocal = this.nLocal;
        final boolean oldNLocalESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.nLocal = 0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldNLocal, 0, oldNLocalESet));
        }
    }
    
    public boolean isSetNLocal() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public int getNIncomingBaselines() {
        return this.nIncomingBaselines;
    }
    
    public void setNIncomingBaselines(final int newNIncomingBaselines) {
        final int oldNIncomingBaselines = this.nIncomingBaselines;
        this.nIncomingBaselines = newNIncomingBaselines;
        final boolean oldNIncomingBaselinesESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldNIncomingBaselines, this.nIncomingBaselines, !oldNIncomingBaselinesESet));
        }
    }
    
    public void unsetNIncomingBaselines() {
        final int oldNIncomingBaselines = this.nIncomingBaselines;
        final boolean oldNIncomingBaselinesESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.nIncomingBaselines = 0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldNIncomingBaselines, 0, oldNIncomingBaselinesESet));
        }
    }
    
    public boolean isSetNIncomingBaselines() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public int getNIncoming() {
        return this.nIncoming;
    }
    
    public void setNIncoming(final int newNIncoming) {
        final int oldNIncoming = this.nIncoming;
        this.nIncoming = newNIncoming;
        final boolean oldNIncomingESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldNIncoming, this.nIncoming, !oldNIncomingESet));
        }
    }
    
    public void unsetNIncoming() {
        final int oldNIncoming = this.nIncoming;
        final boolean oldNIncomingESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.nIncoming = 0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldNIncoming, 0, oldNIncomingESet));
        }
    }
    
    public boolean isSetNIncoming() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public int getNOutgoingBaselines() {
        return this.nOutgoingBaselines;
    }
    
    public void setNOutgoingBaselines(final int newNOutgoingBaselines) {
        final int oldNOutgoingBaselines = this.nOutgoingBaselines;
        this.nOutgoingBaselines = newNOutgoingBaselines;
        final boolean oldNOutgoingBaselinesESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, oldNOutgoingBaselines, this.nOutgoingBaselines, !oldNOutgoingBaselinesESet));
        }
    }
    
    public void unsetNOutgoingBaselines() {
        final int oldNOutgoingBaselines = this.nOutgoingBaselines;
        final boolean oldNOutgoingBaselinesESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.nOutgoingBaselines = 0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, oldNOutgoingBaselines, 0, oldNOutgoingBaselinesESet));
        }
    }
    
    public boolean isSetNOutgoingBaselines() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public int getNOutgoing() {
        return this.nOutgoing;
    }
    
    public void setNOutgoing(final int newNOutgoing) {
        final int oldNOutgoing = this.nOutgoing;
        this.nOutgoing = newNOutgoing;
        final boolean oldNOutgoingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, oldNOutgoing, this.nOutgoing, !oldNOutgoingESet));
        }
    }
    
    public void unsetNOutgoing() {
        final int oldNOutgoing = this.nOutgoing;
        final boolean oldNOutgoingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.nOutgoing = 0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, oldNOutgoing, 0, oldNOutgoingESet));
        }
    }
    
    public boolean isSetNOutgoing() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public int getNConflict() {
        return this.nConflict;
    }
    
    public void setNConflict(final int newNConflict) {
        final int oldNConflict = this.nConflict;
        this.nConflict = newNConflict;
        final boolean oldNConflictESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldNConflict, this.nConflict, !oldNConflictESet));
        }
    }
    
    public void unsetNConflict() {
        final int oldNConflict = this.nConflict;
        final boolean oldNConflictESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.nConflict = 0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldNConflict, 0, oldNConflictESet));
        }
    }
    
    public boolean isSetNConflict() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public int getNCollision() {
        return this.nCollision;
    }
    
    public void setNCollision(final int newNCollision) {
        final int oldNCollision = this.nCollision;
        this.nCollision = newNCollision;
        final boolean oldNCollisionESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldNCollision, this.nCollision, !oldNCollisionESet));
        }
    }
    
    public void unsetNCollision() {
        final int oldNCollision = this.nCollision;
        final boolean oldNCollisionESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.nCollision = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldNCollision, 0, oldNCollisionESet));
        }
    }
    
    public boolean isSetNCollision() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public int getNComponentChanges() {
        return this.nComponentChanges;
    }
    
    public void setNComponentChanges(final int newNComponentChanges) {
        final int oldNComponentChanges = this.nComponentChanges;
        this.nComponentChanges = newNComponentChanges;
        final boolean oldNComponentChangesESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldNComponentChanges, this.nComponentChanges, !oldNComponentChangesESet));
        }
    }
    
    public void unsetNComponentChanges() {
        final int oldNComponentChanges = this.nComponentChanges;
        final boolean oldNComponentChangesESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.nComponentChanges = 0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldNComponentChanges, 0, oldNComponentChangesESet));
        }
    }
    
    public boolean isSetNComponentChanges() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getNCollision());
            }
            case 1: {
                return new Integer(this.getNComponentChanges());
            }
            case 2: {
                return new Integer(this.getNConflict());
            }
            case 3: {
                return new Integer(this.getNIncoming());
            }
            case 4: {
                return new Integer(this.getNIncomingBaselines());
            }
            case 5: {
                return new Integer(this.getNLocal());
            }
            case 6: {
                return new Integer(this.getNOutgoing());
            }
            case 7: {
                return new Integer(this.getNOutgoingBaselines());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setNCollision((int)newValue);
            }
            case 1: {
                this.setNComponentChanges((int)newValue);
            }
            case 2: {
                this.setNConflict((int)newValue);
            }
            case 3: {
                this.setNIncoming((int)newValue);
            }
            case 4: {
                this.setNIncomingBaselines((int)newValue);
            }
            case 5: {
                this.setNLocal((int)newValue);
            }
            case 6: {
                this.setNOutgoing((int)newValue);
            }
            case 7: {
                this.setNOutgoingBaselines((int)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetNCollision();
            }
            case 1: {
                this.unsetNComponentChanges();
            }
            case 2: {
                this.unsetNConflict();
            }
            case 3: {
                this.unsetNIncoming();
            }
            case 4: {
                this.unsetNIncomingBaselines();
            }
            case 5: {
                this.unsetNLocal();
            }
            case 6: {
                this.unsetNOutgoing();
            }
            case 7: {
                this.unsetNOutgoingBaselines();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetNCollision();
            }
            case 1: {
                return this.isSetNComponentChanges();
            }
            case 2: {
                return this.isSetNConflict();
            }
            case 3: {
                return this.isSetNIncoming();
            }
            case 4: {
                return this.isSetNIncomingBaselines();
            }
            case 5: {
                return this.isSetNLocal();
            }
            case 6: {
                return this.isSetNOutgoing();
            }
            case 7: {
                return this.isSetNOutgoingBaselines();
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
        result.append(" (nCollision: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.nCollision);
        }
        else {
            result.append("<unset>");
        }
        result.append(", nComponentChanges: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.nComponentChanges);
        }
        else {
            result.append("<unset>");
        }
        result.append(", nConflict: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.nConflict);
        }
        else {
            result.append("<unset>");
        }
        result.append(", nIncoming: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.nIncoming);
        }
        else {
            result.append("<unset>");
        }
        result.append(", nIncomingBaselines: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.nIncomingBaselines);
        }
        else {
            result.append("<unset>");
        }
        result.append(", nLocal: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.nLocal);
        }
        else {
            result.append("<unset>");
        }
        result.append(", nOutgoing: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.nOutgoing);
        }
        else {
            result.append("<unset>");
        }
        result.append(", nOutgoingBaselines: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.nOutgoingBaselines);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
