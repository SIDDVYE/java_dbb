// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeDetailDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public abstract class ChangeDetailDTOImpl extends EObjectImpl implements ChangeDetailDTO
{
    protected int ALL_FLAGS;
    protected static final String PORT_CHANGE_ID_EDEFAULT = "";
    protected String portChangeId;
    protected static final int PORT_CHANGE_ID_ESETFLAG = 1;
    protected static final String ID_EDEFAULT = "";
    protected String id;
    protected static final int ID_ESETFLAG = 2;
    protected static final boolean RESOLVED_EDEFAULT = false;
    protected static final int RESOLVED_EFLAG = 4;
    protected static final int RESOLVED_ESETFLAG = 8;
    protected static final String KIND_EDEFAULT;
    protected String kind;
    protected static final int KIND_ESETFLAG = 16;
    
    static {
        KIND_EDEFAULT = null;
    }
    
    protected ChangeDetailDTOImpl() {
        this.ALL_FLAGS = 0;
        this.portChangeId = "";
        this.id = "";
        this.kind = ChangeDetailDTOImpl.KIND_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.CHANGE_DETAIL_DTO;
    }
    
    public String getPortChangeId() {
        return this.portChangeId;
    }
    
    public void setPortChangeId(final String newPortChangeId) {
        final String oldPortChangeId = this.portChangeId;
        this.portChangeId = newPortChangeId;
        final boolean oldPortChangeIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldPortChangeId, (Object)this.portChangeId, !oldPortChangeIdESet));
        }
    }
    
    public void unsetPortChangeId() {
        final String oldPortChangeId = this.portChangeId;
        final boolean oldPortChangeIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.portChangeId = "";
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldPortChangeId, (Object)"", oldPortChangeIdESet));
        }
    }
    
    public boolean isSetPortChangeId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(final String newId) {
        final String oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldId, (Object)this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final String oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.id = "";
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldId, (Object)"", oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public boolean isResolved() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setResolved(final boolean newResolved) {
        final boolean oldResolved = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newResolved) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldResolvedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldResolved, newResolved, !oldResolvedESet));
        }
    }
    
    public void unsetResolved() {
        final boolean oldResolved = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldResolvedESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldResolved, false, oldResolvedESet));
        }
    }
    
    public boolean isSetResolved() {
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldKind, (Object)this.kind, !oldKindESet));
        }
    }
    
    public void unsetKind() {
        final String oldKind = this.kind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.kind = ChangeDetailDTOImpl.KIND_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldKind, (Object)ChangeDetailDTOImpl.KIND_EDEFAULT, oldKindESet));
        }
    }
    
    public boolean isSetKind() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getPortChangeId();
            }
            case 1: {
                return this.getId();
            }
            case 2: {
                return this.isResolved() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 3: {
                return this.getKind();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setPortChangeId((String)newValue);
            }
            case 1: {
                this.setId((String)newValue);
            }
            case 2: {
                this.setResolved((boolean)newValue);
            }
            case 3: {
                this.setKind((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetPortChangeId();
            }
            case 1: {
                this.unsetId();
            }
            case 2: {
                this.unsetResolved();
            }
            case 3: {
                this.unsetKind();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetPortChangeId();
            }
            case 1: {
                return this.isSetId();
            }
            case 2: {
                return this.isSetResolved();
            }
            case 3: {
                return this.isSetKind();
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
        result.append(" (portChangeId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.portChangeId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", id: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", resolved: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
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
        result.append(')');
        return result.toString();
    }
}
