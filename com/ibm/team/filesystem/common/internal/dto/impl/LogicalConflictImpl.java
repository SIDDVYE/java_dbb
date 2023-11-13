// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collections;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.scm.common.IVersionableHandle;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflict;

public class LogicalConflictImpl extends LogicalChangeImpl implements LogicalConflict
{
    protected EList conflicts;
    protected static final int CONFLICT_TYPE_EDEFAULT = 0;
    protected int conflictType;
    protected static final int CONFLICT_TYPE_ESETFLAG = 8192;
    protected static final int SELECTED_CHANGE_DETAILS_EDEFAULT = 0;
    protected int selectedChangeDetails;
    protected static final int SELECTED_CHANGE_DETAILS_ESETFLAG = 16384;
    
    protected LogicalConflictImpl() {
        this.conflictType = 0;
        this.selectedChangeDetails = 0;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.LOGICAL_CONFLICT;
    }
    
    @Override
    public List getConflicts() {
        if (this.conflicts == null) {
            this.conflicts = (EList)new EObjectResolvingEList.Unsettable((Class)IVersionableHandle.class, (InternalEObject)this, 17);
        }
        return (List)this.conflicts;
    }
    
    @Override
    public void unsetConflicts() {
        if (this.conflicts != null) {
            ((InternalEList.Unsettable)this.conflicts).unset();
        }
    }
    
    @Override
    public boolean isSetConflicts() {
        return this.conflicts != null && ((InternalEList.Unsettable)this.conflicts).isSet();
    }
    
    @Override
    public int getConflictType() {
        return this.conflictType;
    }
    
    @Override
    public void setConflictType(final int newConflictType) {
        final int oldConflictType = this.conflictType;
        this.conflictType = newConflictType;
        final boolean oldConflictTypeESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 18, oldConflictType, this.conflictType, !oldConflictTypeESet));
        }
    }
    
    @Override
    public void unsetConflictType() {
        final int oldConflictType = this.conflictType;
        final boolean oldConflictTypeESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.conflictType = 0;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 18, oldConflictType, 0, oldConflictTypeESet));
        }
    }
    
    @Override
    public boolean isSetConflictType() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    @Override
    public int getSelectedChangeDetails() {
        return this.selectedChangeDetails;
    }
    
    @Override
    public void setSelectedChangeDetails(final int newSelectedChangeDetails) {
        final int oldSelectedChangeDetails = this.selectedChangeDetails;
        this.selectedChangeDetails = newSelectedChangeDetails;
        final boolean oldSelectedChangeDetailsESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 19, oldSelectedChangeDetails, this.selectedChangeDetails, !oldSelectedChangeDetailsESet));
        }
    }
    
    @Override
    public void unsetSelectedChangeDetails() {
        final int oldSelectedChangeDetails = this.selectedChangeDetails;
        final boolean oldSelectedChangeDetailsESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.selectedChangeDetails = 0;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 19, oldSelectedChangeDetails, 0, oldSelectedChangeDetailsESet));
        }
    }
    
    @Override
    public boolean isSetSelectedChangeDetails() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 17: {
                return this.getConflicts();
            }
            case 18: {
                return new Integer(this.getConflictType());
            }
            case 19: {
                return new Integer(this.getSelectedChangeDetails());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 17: {
                this.getConflicts().clear();
                this.getConflicts().addAll((Collection)newValue);
            }
            case 18: {
                this.setConflictType((int)newValue);
            }
            case 19: {
                this.setSelectedChangeDetails((int)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 17: {
                this.unsetConflicts();
            }
            case 18: {
                this.unsetConflictType();
            }
            case 19: {
                this.unsetSelectedChangeDetails();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 17: {
                return this.isSetConflicts();
            }
            case 18: {
                return this.isSetConflictType();
            }
            case 19: {
                return this.isSetSelectedChangeDetails();
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
        result.append(" (conflictType: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append(this.conflictType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", selectedChangeDetails: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append(this.selectedChangeDetails);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    @Override
    public int conflictType() {
        return this.getConflictType();
    }
    
    @Override
    public Collection conflictingItems() {
        return Collections.unmodifiableCollection((Collection<?>)this.getConflicts());
    }
    
    @Override
    public boolean isSelectedModificationChange(final int changeDetail) {
        final int type = this.getConflictType();
        return (type == 5 || type == 9) && (this.getSelectedChangeDetails() & changeDetail) == changeDetail;
    }
    
    @Override
    public boolean isModificationConflict(final int changeDetail) {
        if (this.getConflictType() == 9) {
            final int conflict = this.getSelectedChangeDetails() & this.getChangeDetails();
            return (conflict & changeDetail) == changeDetail;
        }
        return false;
    }
}
