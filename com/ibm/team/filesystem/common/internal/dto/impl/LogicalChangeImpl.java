// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.repository.common.UUID;
import com.ibm.team.filesystem.common.internal.dto.LogicalChange;

public class LogicalChangeImpl extends ChangeSynopsisImpl implements LogicalChange
{
    protected static final UUID ID_EDEFAULT;
    protected UUID id;
    protected static final int ID_ESETFLAG = 2048;
    protected EList dependentChanges;
    protected EList relatedChanges;
    protected static final int KIND_EDEFAULT = 0;
    protected int kind;
    protected static final int KIND_ESETFLAG = 4096;
    
    static {
        ID_EDEFAULT = null;
    }
    
    protected LogicalChangeImpl() {
        this.id = LogicalChangeImpl.ID_EDEFAULT;
        this.kind = 0;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.LOGICAL_CHANGE;
    }
    
    @Override
    public UUID getId() {
        return this.id;
    }
    
    @Override
    public void setId(final UUID newId) {
        final UUID oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldId, (Object)this.id, !oldIdESet));
        }
    }
    
    @Override
    public void unsetId() {
        final UUID oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.id = LogicalChangeImpl.ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldId, (Object)LogicalChangeImpl.ID_EDEFAULT, oldIdESet));
        }
    }
    
    @Override
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    @Override
    public List getDependentChanges() {
        if (this.dependentChanges == null) {
            this.dependentChanges = (EList)new EDataTypeEList.Unsettable((Class)UUID.class, (InternalEObject)this, 14);
        }
        return (List)this.dependentChanges;
    }
    
    @Override
    public void unsetDependentChanges() {
        if (this.dependentChanges != null) {
            ((InternalEList.Unsettable)this.dependentChanges).unset();
        }
    }
    
    @Override
    public boolean isSetDependentChanges() {
        return this.dependentChanges != null && ((InternalEList.Unsettable)this.dependentChanges).isSet();
    }
    
    @Override
    public List getRelatedChanges() {
        if (this.relatedChanges == null) {
            this.relatedChanges = (EList)new EDataTypeEList.Unsettable((Class)UUID.class, (InternalEObject)this, 15);
        }
        return (List)this.relatedChanges;
    }
    
    @Override
    public void unsetRelatedChanges() {
        if (this.relatedChanges != null) {
            ((InternalEList.Unsettable)this.relatedChanges).unset();
        }
    }
    
    @Override
    public boolean isSetRelatedChanges() {
        return this.relatedChanges != null && ((InternalEList.Unsettable)this.relatedChanges).isSet();
    }
    
    @Override
    public int getKind() {
        return this.kind;
    }
    
    @Override
    public void setKind(final int newKind) {
        final int oldKind = this.kind;
        this.kind = newKind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 16, oldKind, this.kind, !oldKindESet));
        }
    }
    
    @Override
    public void unsetKind() {
        final int oldKind = this.kind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.kind = 0;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 16, oldKind, 0, oldKindESet));
        }
    }
    
    @Override
    public boolean isSetKind() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 13: {
                return this.getId();
            }
            case 14: {
                return this.getDependentChanges();
            }
            case 15: {
                return this.getRelatedChanges();
            }
            case 16: {
                return new Integer(this.getKind());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 13: {
                this.setId((UUID)newValue);
            }
            case 14: {
                this.getDependentChanges().clear();
                this.getDependentChanges().addAll((Collection)newValue);
            }
            case 15: {
                this.getRelatedChanges().clear();
                this.getRelatedChanges().addAll((Collection)newValue);
            }
            case 16: {
                this.setKind((int)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 13: {
                this.unsetId();
            }
            case 14: {
                this.unsetDependentChanges();
            }
            case 15: {
                this.unsetRelatedChanges();
            }
            case 16: {
                this.unsetKind();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 13: {
                return this.isSetId();
            }
            case 14: {
                return this.isSetDependentChanges();
            }
            case 15: {
                return this.isSetRelatedChanges();
            }
            case 16: {
                return this.isSetKind();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (id: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", dependentChanges: ");
        result.append(this.dependentChanges);
        result.append(", relatedChanges: ");
        result.append(this.relatedChanges);
        result.append(", kind: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append(this.kind);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    @Override
    public int kind() {
        return this.getKind();
    }
}
