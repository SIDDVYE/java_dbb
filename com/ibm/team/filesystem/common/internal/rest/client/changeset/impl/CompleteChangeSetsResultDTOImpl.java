// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ChangeSetDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.CompleteChangeSetsResultDTO;
import com.ibm.team.repository.common.model.impl.HelperImpl;

public class CompleteChangeSetsResultDTOImpl extends HelperImpl implements CompleteChangeSetsResultDTO
{
    protected int ALL_FLAGS;
    protected EList targetChangeSets;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 2;
    protected static final int CANCELLED_ESETFLAG = 4;
    private static final int EOFFSET_CORRECTION;
    
    static {
        EOFFSET_CORRECTION = FilesystemRestClientDTOchangesetPackage.Literals.COMPLETE_CHANGE_SETS_RESULT_DTO.getFeatureID((EStructuralFeature)FilesystemRestClientDTOchangesetPackage.Literals.COMPLETE_CHANGE_SETS_RESULT_DTO__TARGET_CHANGE_SETS) - 1;
    }
    
    protected CompleteChangeSetsResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.COMPLETE_CHANGE_SETS_RESULT_DTO;
    }
    
    public List getTargetChangeSets() {
        if (this.targetChangeSets == null) {
            this.targetChangeSets = (EList)new EObjectResolvingEList.Unsettable((Class)ChangeSetDTO.class, (InternalEObject)this, 1 + CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION);
        }
        return (List)this.targetChangeSets;
    }
    
    public void unsetTargetChangeSets() {
        if (this.targetChangeSets != null) {
            ((InternalEList.Unsettable)this.targetChangeSets).unset();
        }
    }
    
    public boolean isSetTargetChangeSets() {
        return this.targetChangeSets != null && ((InternalEList.Unsettable)this.targetChangeSets).isSet();
    }
    
    public boolean isCancelled() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public void setCancelled(final boolean newCancelled) {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x2) != 0x0;
        if (newCancelled) {
            this.ALL_FLAGS |= 0x2;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFD;
        }
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2 + CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION, oldCancelled, newCancelled, !oldCancelledESet));
        }
    }
    
    public void unsetCancelled() {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x2) != 0x0;
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2 + CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION, oldCancelled, false, oldCancelledESet));
        }
    }
    
    public boolean isSetCancelled() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.getTargetChangeSets();
            }
            case 2: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.getTargetChangeSets().clear();
                this.getTargetChangeSets().addAll((Collection)newValue);
            }
            case 2: {
                this.setCancelled((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.unsetTargetChangeSets();
            }
            case 2: {
                this.unsetCancelled();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.isSetTargetChangeSets();
            }
            case 2: {
                return this.isSetCancelled();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != CompleteChangeSetsResultDTO.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return 1 + CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION;
            }
            case 2: {
                return 2 + CompleteChangeSetsResultDTOImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (cancelled: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
