// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeSetSyncDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.BaselineSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class BaselineSyncDTOImpl extends EObjectImpl implements BaselineSyncDTO
{
    protected int ALL_FLAGS;
    protected static final int BASELINE_ID_EDEFAULT = 0;
    protected int baselineId;
    protected static final int BASELINE_ID_ESETFLAG = 1;
    protected static final String BASELINE_ITEM_ID_EDEFAULT;
    protected String baselineItemId;
    protected static final int BASELINE_ITEM_ID_ESETFLAG = 2;
    protected static final String BASELINE_NAME_EDEFAULT;
    protected String baselineName;
    protected static final int BASELINE_NAME_ESETFLAG = 4;
    protected EList changeSets;
    protected static final boolean CHANGE_SETS_RESOLVED_EDEFAULT = false;
    protected static final int CHANGE_SETS_RESOLVED_EFLAG = 8;
    protected static final int CHANGE_SETS_RESOLVED_ESETFLAG = 16;
    protected static final String CREATION_DATE_EDEFAULT;
    protected String creationDate;
    protected static final int CREATION_DATE_ESETFLAG = 32;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 64;
    protected static final String PREVIOUS_BASELINE_ITEM_ID_EDEFAULT;
    protected String previousBaselineItemId;
    protected static final int PREVIOUS_BASELINE_ITEM_ID_ESETFLAG = 128;
    protected static final String PREVIOUS_BASELINE_NAME_EDEFAULT;
    protected String previousBaselineName;
    protected static final int PREVIOUS_BASELINE_NAME_ESETFLAG = 256;
    
    static {
        BASELINE_ITEM_ID_EDEFAULT = null;
        BASELINE_NAME_EDEFAULT = null;
        CREATION_DATE_EDEFAULT = null;
        PREVIOUS_BASELINE_ITEM_ID_EDEFAULT = null;
        PREVIOUS_BASELINE_NAME_EDEFAULT = null;
    }
    
    protected BaselineSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.baselineId = 0;
        this.baselineItemId = BaselineSyncDTOImpl.BASELINE_ITEM_ID_EDEFAULT;
        this.baselineName = BaselineSyncDTOImpl.BASELINE_NAME_EDEFAULT;
        this.creationDate = BaselineSyncDTOImpl.CREATION_DATE_EDEFAULT;
        this.id = 0;
        this.previousBaselineItemId = BaselineSyncDTOImpl.PREVIOUS_BASELINE_ITEM_ID_EDEFAULT;
        this.previousBaselineName = BaselineSyncDTOImpl.PREVIOUS_BASELINE_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.BASELINE_SYNC_DTO;
    }
    
    public String getBaselineName() {
        return this.baselineName;
    }
    
    public void setBaselineName(final String newBaselineName) {
        final String oldBaselineName = this.baselineName;
        this.baselineName = newBaselineName;
        final boolean oldBaselineNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldBaselineName, (Object)this.baselineName, !oldBaselineNameESet));
        }
    }
    
    public void unsetBaselineName() {
        final String oldBaselineName = this.baselineName;
        final boolean oldBaselineNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.baselineName = BaselineSyncDTOImpl.BASELINE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldBaselineName, (Object)BaselineSyncDTOImpl.BASELINE_NAME_EDEFAULT, oldBaselineNameESet));
        }
    }
    
    public boolean isSetBaselineName() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getBaselineItemId() {
        return this.baselineItemId;
    }
    
    public void setBaselineItemId(final String newBaselineItemId) {
        final String oldBaselineItemId = this.baselineItemId;
        this.baselineItemId = newBaselineItemId;
        final boolean oldBaselineItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldBaselineItemId, (Object)this.baselineItemId, !oldBaselineItemIdESet));
        }
    }
    
    public void unsetBaselineItemId() {
        final String oldBaselineItemId = this.baselineItemId;
        final boolean oldBaselineItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.baselineItemId = BaselineSyncDTOImpl.BASELINE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldBaselineItemId, (Object)BaselineSyncDTOImpl.BASELINE_ITEM_ID_EDEFAULT, oldBaselineItemIdESet));
        }
    }
    
    public boolean isSetBaselineItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getPreviousBaselineItemId() {
        return this.previousBaselineItemId;
    }
    
    public void setPreviousBaselineItemId(final String newPreviousBaselineItemId) {
        final String oldPreviousBaselineItemId = this.previousBaselineItemId;
        this.previousBaselineItemId = newPreviousBaselineItemId;
        final boolean oldPreviousBaselineItemIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldPreviousBaselineItemId, (Object)this.previousBaselineItemId, !oldPreviousBaselineItemIdESet));
        }
    }
    
    public void unsetPreviousBaselineItemId() {
        final String oldPreviousBaselineItemId = this.previousBaselineItemId;
        final boolean oldPreviousBaselineItemIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.previousBaselineItemId = BaselineSyncDTOImpl.PREVIOUS_BASELINE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldPreviousBaselineItemId, (Object)BaselineSyncDTOImpl.PREVIOUS_BASELINE_ITEM_ID_EDEFAULT, oldPreviousBaselineItemIdESet));
        }
    }
    
    public boolean isSetPreviousBaselineItemId() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public boolean isChangeSetsResolved() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public void setChangeSetsResolved(final boolean newChangeSetsResolved) {
        final boolean oldChangeSetsResolved = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newChangeSetsResolved) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldChangeSetsResolvedESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldChangeSetsResolved, newChangeSetsResolved, !oldChangeSetsResolvedESet));
        }
    }
    
    public void unsetChangeSetsResolved() {
        final boolean oldChangeSetsResolved = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldChangeSetsResolvedESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldChangeSetsResolved, false, oldChangeSetsResolvedESet));
        }
    }
    
    public boolean isSetChangeSetsResolved() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public List getChangeSets() {
        if (this.changeSets == null) {
            this.changeSets = (EList)new EObjectContainmentEList.Unsettable((Class)ChangeSetSyncDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.changeSets;
    }
    
    public void unsetChangeSets() {
        if (this.changeSets != null) {
            ((InternalEList.Unsettable)this.changeSets).unset();
        }
    }
    
    public boolean isSetChangeSets() {
        return this.changeSets != null && ((InternalEList.Unsettable)this.changeSets).isSet();
    }
    
    public String getPreviousBaselineName() {
        return this.previousBaselineName;
    }
    
    public void setPreviousBaselineName(final String newPreviousBaselineName) {
        final String oldPreviousBaselineName = this.previousBaselineName;
        this.previousBaselineName = newPreviousBaselineName;
        final boolean oldPreviousBaselineNameESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldPreviousBaselineName, (Object)this.previousBaselineName, !oldPreviousBaselineNameESet));
        }
    }
    
    public void unsetPreviousBaselineName() {
        final String oldPreviousBaselineName = this.previousBaselineName;
        final boolean oldPreviousBaselineNameESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.previousBaselineName = BaselineSyncDTOImpl.PREVIOUS_BASELINE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldPreviousBaselineName, (Object)BaselineSyncDTOImpl.PREVIOUS_BASELINE_NAME_EDEFAULT, oldPreviousBaselineNameESet));
        }
    }
    
    public boolean isSetPreviousBaselineName() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(final String newCreationDate) {
        final String oldCreationDate = this.creationDate;
        this.creationDate = newCreationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldCreationDate, (Object)this.creationDate, !oldCreationDateESet));
        }
    }
    
    public void unsetCreationDate() {
        final String oldCreationDate = this.creationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.creationDate = BaselineSyncDTOImpl.CREATION_DATE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldCreationDate, (Object)BaselineSyncDTOImpl.CREATION_DATE_EDEFAULT, oldCreationDateESet));
        }
    }
    
    public boolean isSetCreationDate() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public int getBaselineId() {
        return this.baselineId;
    }
    
    public void setBaselineId(final int newBaselineId) {
        final int oldBaselineId = this.baselineId;
        this.baselineId = newBaselineId;
        final boolean oldBaselineIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldBaselineId, this.baselineId, !oldBaselineIdESet));
        }
    }
    
    public void unsetBaselineId() {
        final int oldBaselineId = this.baselineId;
        final boolean oldBaselineIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.baselineId = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldBaselineId, 0, oldBaselineIdESet));
        }
    }
    
    public boolean isSetBaselineId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 3: {
                return ((InternalEList)this.getChangeSets()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getBaselineId());
            }
            case 1: {
                return this.getBaselineItemId();
            }
            case 2: {
                return this.getBaselineName();
            }
            case 3: {
                return this.getChangeSets();
            }
            case 4: {
                return this.isChangeSetsResolved() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return this.getCreationDate();
            }
            case 6: {
                return new Integer(this.getId());
            }
            case 7: {
                return this.getPreviousBaselineItemId();
            }
            case 8: {
                return this.getPreviousBaselineName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setBaselineId((int)newValue);
            }
            case 1: {
                this.setBaselineItemId((String)newValue);
            }
            case 2: {
                this.setBaselineName((String)newValue);
            }
            case 3: {
                this.getChangeSets().clear();
                this.getChangeSets().addAll((Collection)newValue);
            }
            case 4: {
                this.setChangeSetsResolved((boolean)newValue);
            }
            case 5: {
                this.setCreationDate((String)newValue);
            }
            case 6: {
                this.setId((int)newValue);
            }
            case 7: {
                this.setPreviousBaselineItemId((String)newValue);
            }
            case 8: {
                this.setPreviousBaselineName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBaselineId();
            }
            case 1: {
                this.unsetBaselineItemId();
            }
            case 2: {
                this.unsetBaselineName();
            }
            case 3: {
                this.unsetChangeSets();
            }
            case 4: {
                this.unsetChangeSetsResolved();
            }
            case 5: {
                this.unsetCreationDate();
            }
            case 6: {
                this.unsetId();
            }
            case 7: {
                this.unsetPreviousBaselineItemId();
            }
            case 8: {
                this.unsetPreviousBaselineName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBaselineId();
            }
            case 1: {
                return this.isSetBaselineItemId();
            }
            case 2: {
                return this.isSetBaselineName();
            }
            case 3: {
                return this.isSetChangeSets();
            }
            case 4: {
                return this.isSetChangeSetsResolved();
            }
            case 5: {
                return this.isSetCreationDate();
            }
            case 6: {
                return this.isSetId();
            }
            case 7: {
                return this.isSetPreviousBaselineItemId();
            }
            case 8: {
                return this.isSetPreviousBaselineName();
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
        result.append(" (baselineId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.baselineId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", baselineItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.baselineItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", baselineName: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.baselineName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", changeSetsResolved: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", creationDate: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.creationDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(", id: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", previousBaselineItemId: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.previousBaselineItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", previousBaselineName: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.previousBaselineName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
