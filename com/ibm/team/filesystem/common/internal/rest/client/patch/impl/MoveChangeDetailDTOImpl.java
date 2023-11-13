// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.MoveChangeDetailDTO;

public class MoveChangeDetailDTOImpl extends ChangeDetailDTOImpl implements MoveChangeDetailDTO
{
    protected static final String BEFORE_PARENT_ID_EDEFAULT;
    protected String beforeParentId;
    protected static final int BEFORE_PARENT_ID_ESETFLAG = 32;
    protected static final String AFTER_PARENT_ID_EDEFAULT;
    protected String afterParentId;
    protected static final int AFTER_PARENT_ID_ESETFLAG = 64;
    protected static final String BEFORE_NAME_EDEFAULT;
    protected String beforeName;
    protected static final int BEFORE_NAME_ESETFLAG = 128;
    protected static final String AFTER_NAME_EDEFAULT;
    protected String afterName;
    protected static final int AFTER_NAME_ESETFLAG = 256;
    protected static final String BEFORE_PARENT_PATH_HINT_EDEFAULT;
    protected String beforeParentPathHint;
    protected static final int BEFORE_PARENT_PATH_HINT_ESETFLAG = 512;
    protected static final String AFTER_PARENT_PATH_HINT_EDEFAULT;
    protected String afterParentPathHint;
    protected static final int AFTER_PARENT_PATH_HINT_ESETFLAG = 1024;
    protected static final boolean MOVE_EDEFAULT = false;
    protected static final int MOVE_EFLAG = 2048;
    protected static final int MOVE_ESETFLAG = 4096;
    protected static final boolean RENAME_EDEFAULT = false;
    protected static final int RENAME_EFLAG = 8192;
    protected static final int RENAME_ESETFLAG = 16384;
    protected static final String INCIDENTAL_DETAILS_EDEFAULT;
    protected String incidentalDetails;
    protected static final int INCIDENTAL_DETAILS_ESETFLAG = 32768;
    
    static {
        BEFORE_PARENT_ID_EDEFAULT = null;
        AFTER_PARENT_ID_EDEFAULT = null;
        BEFORE_NAME_EDEFAULT = null;
        AFTER_NAME_EDEFAULT = null;
        BEFORE_PARENT_PATH_HINT_EDEFAULT = null;
        AFTER_PARENT_PATH_HINT_EDEFAULT = null;
        INCIDENTAL_DETAILS_EDEFAULT = null;
    }
    
    protected MoveChangeDetailDTOImpl() {
        this.beforeParentId = MoveChangeDetailDTOImpl.BEFORE_PARENT_ID_EDEFAULT;
        this.afterParentId = MoveChangeDetailDTOImpl.AFTER_PARENT_ID_EDEFAULT;
        this.beforeName = MoveChangeDetailDTOImpl.BEFORE_NAME_EDEFAULT;
        this.afterName = MoveChangeDetailDTOImpl.AFTER_NAME_EDEFAULT;
        this.beforeParentPathHint = MoveChangeDetailDTOImpl.BEFORE_PARENT_PATH_HINT_EDEFAULT;
        this.afterParentPathHint = MoveChangeDetailDTOImpl.AFTER_PARENT_PATH_HINT_EDEFAULT;
        this.incidentalDetails = MoveChangeDetailDTOImpl.INCIDENTAL_DETAILS_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.MOVE_CHANGE_DETAIL_DTO;
    }
    
    @Override
    public String getBeforeParentId() {
        return this.beforeParentId;
    }
    
    @Override
    public void setBeforeParentId(final String newBeforeParentId) {
        final String oldBeforeParentId = this.beforeParentId;
        this.beforeParentId = newBeforeParentId;
        final boolean oldBeforeParentIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldBeforeParentId, (Object)this.beforeParentId, !oldBeforeParentIdESet));
        }
    }
    
    @Override
    public void unsetBeforeParentId() {
        final String oldBeforeParentId = this.beforeParentId;
        final boolean oldBeforeParentIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeParentId = MoveChangeDetailDTOImpl.BEFORE_PARENT_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldBeforeParentId, (Object)MoveChangeDetailDTOImpl.BEFORE_PARENT_ID_EDEFAULT, oldBeforeParentIdESet));
        }
    }
    
    @Override
    public boolean isSetBeforeParentId() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getAfterParentId() {
        return this.afterParentId;
    }
    
    @Override
    public void setAfterParentId(final String newAfterParentId) {
        final String oldAfterParentId = this.afterParentId;
        this.afterParentId = newAfterParentId;
        final boolean oldAfterParentIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldAfterParentId, (Object)this.afterParentId, !oldAfterParentIdESet));
        }
    }
    
    @Override
    public void unsetAfterParentId() {
        final String oldAfterParentId = this.afterParentId;
        final boolean oldAfterParentIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterParentId = MoveChangeDetailDTOImpl.AFTER_PARENT_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldAfterParentId, (Object)MoveChangeDetailDTOImpl.AFTER_PARENT_ID_EDEFAULT, oldAfterParentIdESet));
        }
    }
    
    @Override
    public boolean isSetAfterParentId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public String getBeforeName() {
        return this.beforeName;
    }
    
    @Override
    public void setBeforeName(final String newBeforeName) {
        final String oldBeforeName = this.beforeName;
        this.beforeName = newBeforeName;
        final boolean oldBeforeNameESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldBeforeName, (Object)this.beforeName, !oldBeforeNameESet));
        }
    }
    
    @Override
    public void unsetBeforeName() {
        final String oldBeforeName = this.beforeName;
        final boolean oldBeforeNameESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.beforeName = MoveChangeDetailDTOImpl.BEFORE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldBeforeName, (Object)MoveChangeDetailDTOImpl.BEFORE_NAME_EDEFAULT, oldBeforeNameESet));
        }
    }
    
    @Override
    public boolean isSetBeforeName() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    @Override
    public String getAfterName() {
        return this.afterName;
    }
    
    @Override
    public void setAfterName(final String newAfterName) {
        final String oldAfterName = this.afterName;
        this.afterName = newAfterName;
        final boolean oldAfterNameESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldAfterName, (Object)this.afterName, !oldAfterNameESet));
        }
    }
    
    @Override
    public void unsetAfterName() {
        final String oldAfterName = this.afterName;
        final boolean oldAfterNameESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.afterName = MoveChangeDetailDTOImpl.AFTER_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldAfterName, (Object)MoveChangeDetailDTOImpl.AFTER_NAME_EDEFAULT, oldAfterNameESet));
        }
    }
    
    @Override
    public boolean isSetAfterName() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    @Override
    public String getBeforeParentPathHint() {
        return this.beforeParentPathHint;
    }
    
    @Override
    public void setBeforeParentPathHint(final String newBeforeParentPathHint) {
        final String oldBeforeParentPathHint = this.beforeParentPathHint;
        this.beforeParentPathHint = newBeforeParentPathHint;
        final boolean oldBeforeParentPathHintESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldBeforeParentPathHint, (Object)this.beforeParentPathHint, !oldBeforeParentPathHintESet));
        }
    }
    
    @Override
    public void unsetBeforeParentPathHint() {
        final String oldBeforeParentPathHint = this.beforeParentPathHint;
        final boolean oldBeforeParentPathHintESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.beforeParentPathHint = MoveChangeDetailDTOImpl.BEFORE_PARENT_PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldBeforeParentPathHint, (Object)MoveChangeDetailDTOImpl.BEFORE_PARENT_PATH_HINT_EDEFAULT, oldBeforeParentPathHintESet));
        }
    }
    
    @Override
    public boolean isSetBeforeParentPathHint() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    @Override
    public String getAfterParentPathHint() {
        return this.afterParentPathHint;
    }
    
    @Override
    public void setAfterParentPathHint(final String newAfterParentPathHint) {
        final String oldAfterParentPathHint = this.afterParentPathHint;
        this.afterParentPathHint = newAfterParentPathHint;
        final boolean oldAfterParentPathHintESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldAfterParentPathHint, (Object)this.afterParentPathHint, !oldAfterParentPathHintESet));
        }
    }
    
    @Override
    public void unsetAfterParentPathHint() {
        final String oldAfterParentPathHint = this.afterParentPathHint;
        final boolean oldAfterParentPathHintESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.afterParentPathHint = MoveChangeDetailDTOImpl.AFTER_PARENT_PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldAfterParentPathHint, (Object)MoveChangeDetailDTOImpl.AFTER_PARENT_PATH_HINT_EDEFAULT, oldAfterParentPathHintESet));
        }
    }
    
    @Override
    public boolean isSetAfterParentPathHint() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    @Override
    public boolean isMove() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    @Override
    public void setMove(final boolean newMove) {
        final boolean oldMove = (this.ALL_FLAGS & 0x800) != 0x0;
        if (newMove) {
            this.ALL_FLAGS |= 0x800;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFF7FF;
        }
        final boolean oldMoveESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, oldMove, newMove, !oldMoveESet));
        }
    }
    
    @Override
    public void unsetMove() {
        final boolean oldMove = (this.ALL_FLAGS & 0x800) != 0x0;
        final boolean oldMoveESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, oldMove, false, oldMoveESet));
        }
    }
    
    @Override
    public boolean isSetMove() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    @Override
    public boolean isRename() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    @Override
    public void setRename(final boolean newRename) {
        final boolean oldRename = (this.ALL_FLAGS & 0x2000) != 0x0;
        if (newRename) {
            this.ALL_FLAGS |= 0x2000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFDFFF;
        }
        final boolean oldRenameESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, oldRename, newRename, !oldRenameESet));
        }
    }
    
    @Override
    public void unsetRename() {
        final boolean oldRename = (this.ALL_FLAGS & 0x2000) != 0x0;
        final boolean oldRenameESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, oldRename, false, oldRenameESet));
        }
    }
    
    @Override
    public boolean isSetRename() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    @Override
    public String getIncidentalDetails() {
        return this.incidentalDetails;
    }
    
    @Override
    public void setIncidentalDetails(final String newIncidentalDetails) {
        final String oldIncidentalDetails = this.incidentalDetails;
        this.incidentalDetails = newIncidentalDetails;
        final boolean oldIncidentalDetailsESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS |= 0x8000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, (Object)oldIncidentalDetails, (Object)this.incidentalDetails, !oldIncidentalDetailsESet));
        }
    }
    
    @Override
    public void unsetIncidentalDetails() {
        final String oldIncidentalDetails = this.incidentalDetails;
        final boolean oldIncidentalDetailsESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.incidentalDetails = MoveChangeDetailDTOImpl.INCIDENTAL_DETAILS_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, (Object)oldIncidentalDetails, (Object)MoveChangeDetailDTOImpl.INCIDENTAL_DETAILS_EDEFAULT, oldIncidentalDetailsESet));
        }
    }
    
    @Override
    public boolean isSetIncidentalDetails() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getBeforeParentId();
            }
            case 5: {
                return this.getAfterParentId();
            }
            case 6: {
                return this.getBeforeName();
            }
            case 7: {
                return this.getAfterName();
            }
            case 8: {
                return this.getBeforeParentPathHint();
            }
            case 9: {
                return this.getAfterParentPathHint();
            }
            case 10: {
                return this.isMove() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 11: {
                return this.isRename() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 12: {
                return this.getIncidentalDetails();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 4: {
                this.setBeforeParentId((String)newValue);
            }
            case 5: {
                this.setAfterParentId((String)newValue);
            }
            case 6: {
                this.setBeforeName((String)newValue);
            }
            case 7: {
                this.setAfterName((String)newValue);
            }
            case 8: {
                this.setBeforeParentPathHint((String)newValue);
            }
            case 9: {
                this.setAfterParentPathHint((String)newValue);
            }
            case 10: {
                this.setMove((boolean)newValue);
            }
            case 11: {
                this.setRename((boolean)newValue);
            }
            case 12: {
                this.setIncidentalDetails((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 4: {
                this.unsetBeforeParentId();
            }
            case 5: {
                this.unsetAfterParentId();
            }
            case 6: {
                this.unsetBeforeName();
            }
            case 7: {
                this.unsetAfterName();
            }
            case 8: {
                this.unsetBeforeParentPathHint();
            }
            case 9: {
                this.unsetAfterParentPathHint();
            }
            case 10: {
                this.unsetMove();
            }
            case 11: {
                this.unsetRename();
            }
            case 12: {
                this.unsetIncidentalDetails();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 4: {
                return this.isSetBeforeParentId();
            }
            case 5: {
                return this.isSetAfterParentId();
            }
            case 6: {
                return this.isSetBeforeName();
            }
            case 7: {
                return this.isSetAfterName();
            }
            case 8: {
                return this.isSetBeforeParentPathHint();
            }
            case 9: {
                return this.isSetAfterParentPathHint();
            }
            case 10: {
                return this.isSetMove();
            }
            case 11: {
                return this.isSetRename();
            }
            case 12: {
                return this.isSetIncidentalDetails();
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
        result.append(" (beforeParentId: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.beforeParentId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterParentId: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.afterParentId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", beforeName: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.beforeName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterName: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.afterName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", beforeParentPathHint: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.beforeParentPathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterParentPathHint: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.afterParentPathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(", move: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x800) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", rename: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", incidentalDetails: ");
        if ((this.ALL_FLAGS & 0x8000) != 0x0) {
            result.append(this.incidentalDetails);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
