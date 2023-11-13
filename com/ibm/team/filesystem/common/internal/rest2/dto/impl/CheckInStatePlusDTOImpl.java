// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest2.dto.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.rest2.dto.Rest2DTOPackage;
import com.ibm.team.scm.common.internal.rest.ICheckInState;
import java.sql.Timestamp;
import com.ibm.team.scm.common.internal.rest.dto.ContributorDTO;
import com.ibm.team.filesystem.common.internal.rest2.dto.CheckInStatePlusDTO;
import com.ibm.team.repository.common.model.impl.HelperImpl;

public class CheckInStatePlusDTOImpl extends HelperImpl implements CheckInStatePlusDTO
{
    protected int ALL_FLAGS;
    protected ContributorDTO deletedBy;
    protected static final int DELETED_BY_ESETFLAG = 2;
    protected static final Timestamp DELETED_ON_EDEFAULT;
    protected Timestamp deletedOn;
    protected static final int DELETED_ON_ESETFLAG = 4;
    protected ICheckInState checkInState;
    protected static final int CHECK_IN_STATE_ESETFLAG = 8;
    private static final int EOFFSET_CORRECTION;
    
    static {
        DELETED_ON_EDEFAULT = null;
        EOFFSET_CORRECTION = Rest2DTOPackage.Literals.CHECK_IN_STATE_PLUS_DTO.getFeatureID((EStructuralFeature)Rest2DTOPackage.Literals.CHECK_IN_STATE_PLUS_DTO__DELETED_BY) - 1;
    }
    
    protected CheckInStatePlusDTOImpl() {
        this.ALL_FLAGS = 0;
        this.deletedOn = CheckInStatePlusDTOImpl.DELETED_ON_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return Rest2DTOPackage.Literals.CHECK_IN_STATE_PLUS_DTO;
    }
    
    public ContributorDTO getDeletedBy() {
        if (this.deletedBy != null && ((EObject)this.deletedBy).eIsProxy()) {
            final InternalEObject oldDeletedBy = (InternalEObject)this.deletedBy;
            this.deletedBy = (ContributorDTO)this.eResolveProxy(oldDeletedBy);
            if (this.deletedBy != oldDeletedBy && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION, (Object)oldDeletedBy, (Object)this.deletedBy));
            }
        }
        return this.deletedBy;
    }
    
    public ContributorDTO basicGetDeletedBy() {
        return this.deletedBy;
    }
    
    public void setDeletedBy(final ContributorDTO newDeletedBy) {
        final ContributorDTO oldDeletedBy = this.deletedBy;
        this.deletedBy = newDeletedBy;
        final boolean oldDeletedByESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION, (Object)oldDeletedBy, (Object)this.deletedBy, !oldDeletedByESet));
        }
    }
    
    public void unsetDeletedBy() {
        final ContributorDTO oldDeletedBy = this.deletedBy;
        final boolean oldDeletedByESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.deletedBy = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION, (Object)oldDeletedBy, (Object)null, oldDeletedByESet));
        }
    }
    
    public boolean isSetDeletedBy() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Timestamp getDeletedOn() {
        return this.deletedOn;
    }
    
    public void setDeletedOn(final Timestamp newDeletedOn) {
        final Timestamp oldDeletedOn = this.deletedOn;
        this.deletedOn = newDeletedOn;
        final boolean oldDeletedOnESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION, (Object)oldDeletedOn, (Object)this.deletedOn, !oldDeletedOnESet));
        }
    }
    
    public void unsetDeletedOn() {
        final Timestamp oldDeletedOn = this.deletedOn;
        final boolean oldDeletedOnESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.deletedOn = CheckInStatePlusDTOImpl.DELETED_ON_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION, (Object)oldDeletedOn, (Object)CheckInStatePlusDTOImpl.DELETED_ON_EDEFAULT, oldDeletedOnESet));
        }
    }
    
    public boolean isSetDeletedOn() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public ICheckInState getCheckInState() {
        if (this.checkInState != null && ((EObject)this.checkInState).eIsProxy()) {
            final InternalEObject oldCheckInState = (InternalEObject)this.checkInState;
            this.checkInState = (ICheckInState)this.eResolveProxy(oldCheckInState);
            if (this.checkInState != oldCheckInState && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 3 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION, (Object)oldCheckInState, (Object)this.checkInState));
            }
        }
        return this.checkInState;
    }
    
    public ICheckInState basicGetCheckInState() {
        return this.checkInState;
    }
    
    public void setCheckInState(final ICheckInState newCheckInState) {
        final ICheckInState oldCheckInState = this.checkInState;
        this.checkInState = newCheckInState;
        final boolean oldCheckInStateESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION, (Object)oldCheckInState, (Object)this.checkInState, !oldCheckInStateESet));
        }
    }
    
    public void unsetCheckInState() {
        final ICheckInState oldCheckInState = this.checkInState;
        final boolean oldCheckInStateESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.checkInState = null;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION, (Object)oldCheckInState, (Object)null, oldCheckInStateESet));
        }
    }
    
    public boolean isSetCheckInState() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - CheckInStatePlusDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                if (resolve) {
                    return this.getDeletedBy();
                }
                return this.basicGetDeletedBy();
            }
            case 2: {
                return this.getDeletedOn();
            }
            case 3: {
                if (resolve) {
                    return this.getCheckInState();
                }
                return this.basicGetCheckInState();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - CheckInStatePlusDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.setDeletedBy((ContributorDTO)newValue);
            }
            case 2: {
                this.setDeletedOn((Timestamp)newValue);
            }
            case 3: {
                this.setCheckInState((ICheckInState)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - CheckInStatePlusDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.unsetDeletedBy();
            }
            case 2: {
                this.unsetDeletedOn();
            }
            case 3: {
                this.unsetCheckInState();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - CheckInStatePlusDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.isSetDeletedBy();
            }
            case 2: {
                return this.isSetDeletedOn();
            }
            case 3: {
                return this.isSetCheckInState();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != CheckInStatePlusDTO.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - CheckInStatePlusDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return 1 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION;
            }
            case 2: {
                return 2 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION;
            }
            case 3: {
                return 3 + CheckInStatePlusDTOImpl.EOFFSET_CORRECTION;
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
        result.append(" (deletedOn: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.deletedOn);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
