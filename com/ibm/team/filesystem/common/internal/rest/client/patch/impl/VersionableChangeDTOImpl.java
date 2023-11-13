// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeDetailDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.patch.VersionableChangeDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class VersionableChangeDTOImpl extends EObjectImpl implements VersionableChangeDTO
{
    protected int ALL_FLAGS;
    protected static final boolean RESOLVED_EDEFAULT = false;
    protected static final int RESOLVED_EFLAG = 1;
    protected static final int RESOLVED_ESETFLAG = 2;
    protected static final String VERSIONABLE_ITEM_ID_EDEFAULT;
    protected String versionableItemId;
    protected static final int VERSIONABLE_ITEM_ID_ESETFLAG = 4;
    protected static final String VERSIONABLE_TYPE_EDEFAULT;
    protected String versionableType;
    protected static final int VERSIONABLE_TYPE_ESETFLAG = 8;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 16;
    protected static final String PARENT_PATH_HINT_EDEFAULT;
    protected String parentPathHint;
    protected static final int PARENT_PATH_HINT_ESETFLAG = 32;
    protected static final String BEFORE_STATE_ID_EDEFAULT;
    protected String beforeStateId;
    protected static final int BEFORE_STATE_ID_ESETFLAG = 64;
    protected static final String AFTER_STATE_ID_EDEFAULT;
    protected String afterStateId;
    protected static final int AFTER_STATE_ID_ESETFLAG = 128;
    protected static final String CONFIGURATION_STATE_ID_EDEFAULT;
    protected String configurationStateId;
    protected static final int CONFIGURATION_STATE_ID_ESETFLAG = 256;
    protected static final String KIND_EDEFAULT;
    protected String kind;
    protected static final int KIND_ESETFLAG = 512;
    protected static final String CHANGE_TYPE_EDEFAULT;
    protected String changeType;
    protected static final int CHANGE_TYPE_ESETFLAG = 1024;
    protected EList incidentals;
    protected EList changeDetails;
    protected EList childChanges;
    protected static final String DEPENDS_ON_ID_EDEFAULT;
    protected String dependsOnId;
    protected static final int DEPENDS_ON_ID_ESETFLAG = 2048;
    
    static {
        VERSIONABLE_ITEM_ID_EDEFAULT = null;
        VERSIONABLE_TYPE_EDEFAULT = null;
        NAME_EDEFAULT = null;
        PARENT_PATH_HINT_EDEFAULT = null;
        BEFORE_STATE_ID_EDEFAULT = null;
        AFTER_STATE_ID_EDEFAULT = null;
        CONFIGURATION_STATE_ID_EDEFAULT = null;
        KIND_EDEFAULT = null;
        CHANGE_TYPE_EDEFAULT = null;
        DEPENDS_ON_ID_EDEFAULT = null;
    }
    
    protected VersionableChangeDTOImpl() {
        this.ALL_FLAGS = 0;
        this.versionableItemId = VersionableChangeDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.versionableType = VersionableChangeDTOImpl.VERSIONABLE_TYPE_EDEFAULT;
        this.name = VersionableChangeDTOImpl.NAME_EDEFAULT;
        this.parentPathHint = VersionableChangeDTOImpl.PARENT_PATH_HINT_EDEFAULT;
        this.beforeStateId = VersionableChangeDTOImpl.BEFORE_STATE_ID_EDEFAULT;
        this.afterStateId = VersionableChangeDTOImpl.AFTER_STATE_ID_EDEFAULT;
        this.configurationStateId = VersionableChangeDTOImpl.CONFIGURATION_STATE_ID_EDEFAULT;
        this.kind = VersionableChangeDTOImpl.KIND_EDEFAULT;
        this.changeType = VersionableChangeDTOImpl.CHANGE_TYPE_EDEFAULT;
        this.dependsOnId = VersionableChangeDTOImpl.DEPENDS_ON_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.VERSIONABLE_CHANGE_DTO;
    }
    
    public boolean isResolved() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setResolved(final boolean newResolved) {
        final boolean oldResolved = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newResolved) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldResolvedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldResolved, newResolved, !oldResolvedESet));
        }
    }
    
    public void unsetResolved() {
        final boolean oldResolved = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldResolvedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldResolved, false, oldResolvedESet));
        }
    }
    
    public boolean isSetResolved() {
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldVersionableItemId, (Object)this.versionableItemId, !oldVersionableItemIdESet));
        }
    }
    
    public void unsetVersionableItemId() {
        final String oldVersionableItemId = this.versionableItemId;
        final boolean oldVersionableItemIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.versionableItemId = VersionableChangeDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldVersionableItemId, (Object)VersionableChangeDTOImpl.VERSIONABLE_ITEM_ID_EDEFAULT, oldVersionableItemIdESet));
        }
    }
    
    public boolean isSetVersionableItemId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getVersionableType() {
        return this.versionableType;
    }
    
    public void setVersionableType(final String newVersionableType) {
        final String oldVersionableType = this.versionableType;
        this.versionableType = newVersionableType;
        final boolean oldVersionableTypeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldVersionableType, (Object)this.versionableType, !oldVersionableTypeESet));
        }
    }
    
    public void unsetVersionableType() {
        final String oldVersionableType = this.versionableType;
        final boolean oldVersionableTypeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.versionableType = VersionableChangeDTOImpl.VERSIONABLE_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldVersionableType, (Object)VersionableChangeDTOImpl.VERSIONABLE_TYPE_EDEFAULT, oldVersionableTypeESet));
        }
    }
    
    public boolean isSetVersionableType() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.name = VersionableChangeDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldName, (Object)VersionableChangeDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getParentPathHint() {
        return this.parentPathHint;
    }
    
    public void setParentPathHint(final String newParentPathHint) {
        final String oldParentPathHint = this.parentPathHint;
        this.parentPathHint = newParentPathHint;
        final boolean oldParentPathHintESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldParentPathHint, (Object)this.parentPathHint, !oldParentPathHintESet));
        }
    }
    
    public void unsetParentPathHint() {
        final String oldParentPathHint = this.parentPathHint;
        final boolean oldParentPathHintESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.parentPathHint = VersionableChangeDTOImpl.PARENT_PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldParentPathHint, (Object)VersionableChangeDTOImpl.PARENT_PATH_HINT_EDEFAULT, oldParentPathHintESet));
        }
    }
    
    public boolean isSetParentPathHint() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getBeforeStateId() {
        return this.beforeStateId;
    }
    
    public void setBeforeStateId(final String newBeforeStateId) {
        final String oldBeforeStateId = this.beforeStateId;
        this.beforeStateId = newBeforeStateId;
        final boolean oldBeforeStateIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldBeforeStateId, (Object)this.beforeStateId, !oldBeforeStateIdESet));
        }
    }
    
    public void unsetBeforeStateId() {
        final String oldBeforeStateId = this.beforeStateId;
        final boolean oldBeforeStateIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.beforeStateId = VersionableChangeDTOImpl.BEFORE_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldBeforeStateId, (Object)VersionableChangeDTOImpl.BEFORE_STATE_ID_EDEFAULT, oldBeforeStateIdESet));
        }
    }
    
    public boolean isSetBeforeStateId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getAfterStateId() {
        return this.afterStateId;
    }
    
    public void setAfterStateId(final String newAfterStateId) {
        final String oldAfterStateId = this.afterStateId;
        this.afterStateId = newAfterStateId;
        final boolean oldAfterStateIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldAfterStateId, (Object)this.afterStateId, !oldAfterStateIdESet));
        }
    }
    
    public void unsetAfterStateId() {
        final String oldAfterStateId = this.afterStateId;
        final boolean oldAfterStateIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.afterStateId = VersionableChangeDTOImpl.AFTER_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldAfterStateId, (Object)VersionableChangeDTOImpl.AFTER_STATE_ID_EDEFAULT, oldAfterStateIdESet));
        }
    }
    
    public boolean isSetAfterStateId() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public String getConfigurationStateId() {
        return this.configurationStateId;
    }
    
    public void setConfigurationStateId(final String newConfigurationStateId) {
        final String oldConfigurationStateId = this.configurationStateId;
        this.configurationStateId = newConfigurationStateId;
        final boolean oldConfigurationStateIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldConfigurationStateId, (Object)this.configurationStateId, !oldConfigurationStateIdESet));
        }
    }
    
    public void unsetConfigurationStateId() {
        final String oldConfigurationStateId = this.configurationStateId;
        final boolean oldConfigurationStateIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.configurationStateId = VersionableChangeDTOImpl.CONFIGURATION_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldConfigurationStateId, (Object)VersionableChangeDTOImpl.CONFIGURATION_STATE_ID_EDEFAULT, oldConfigurationStateIdESet));
        }
    }
    
    public boolean isSetConfigurationStateId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public String getKind() {
        return this.kind;
    }
    
    public void setKind(final String newKind) {
        final String oldKind = this.kind;
        this.kind = newKind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldKind, (Object)this.kind, !oldKindESet));
        }
    }
    
    public void unsetKind() {
        final String oldKind = this.kind;
        final boolean oldKindESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.kind = VersionableChangeDTOImpl.KIND_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldKind, (Object)VersionableChangeDTOImpl.KIND_EDEFAULT, oldKindESet));
        }
    }
    
    public boolean isSetKind() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public String getChangeType() {
        return this.changeType;
    }
    
    public void setChangeType(final String newChangeType) {
        final String oldChangeType = this.changeType;
        this.changeType = newChangeType;
        final boolean oldChangeTypeESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldChangeType, (Object)this.changeType, !oldChangeTypeESet));
        }
    }
    
    public void unsetChangeType() {
        final String oldChangeType = this.changeType;
        final boolean oldChangeTypeESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.changeType = VersionableChangeDTOImpl.CHANGE_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldChangeType, (Object)VersionableChangeDTOImpl.CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
        }
    }
    
    public boolean isSetChangeType() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public List getIncidentals() {
        if (this.incidentals == null) {
            this.incidentals = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 10);
        }
        return (List)this.incidentals;
    }
    
    public void unsetIncidentals() {
        if (this.incidentals != null) {
            ((InternalEList.Unsettable)this.incidentals).unset();
        }
    }
    
    public boolean isSetIncidentals() {
        return this.incidentals != null && ((InternalEList.Unsettable)this.incidentals).isSet();
    }
    
    public List getChangeDetails() {
        if (this.changeDetails == null) {
            this.changeDetails = (EList)new EObjectContainmentEList.Unsettable((Class)ChangeDetailDTO.class, (InternalEObject)this, 11);
        }
        return (List)this.changeDetails;
    }
    
    public void unsetChangeDetails() {
        if (this.changeDetails != null) {
            ((InternalEList.Unsettable)this.changeDetails).unset();
        }
    }
    
    public boolean isSetChangeDetails() {
        return this.changeDetails != null && ((InternalEList.Unsettable)this.changeDetails).isSet();
    }
    
    public List getChildChanges() {
        if (this.childChanges == null) {
            this.childChanges = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 12);
        }
        return (List)this.childChanges;
    }
    
    public void unsetChildChanges() {
        if (this.childChanges != null) {
            ((InternalEList.Unsettable)this.childChanges).unset();
        }
    }
    
    public boolean isSetChildChanges() {
        return this.childChanges != null && ((InternalEList.Unsettable)this.childChanges).isSet();
    }
    
    public String getDependsOnId() {
        return this.dependsOnId;
    }
    
    public void setDependsOnId(final String newDependsOnId) {
        final String oldDependsOnId = this.dependsOnId;
        this.dependsOnId = newDependsOnId;
        final boolean oldDependsOnIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldDependsOnId, (Object)this.dependsOnId, !oldDependsOnIdESet));
        }
    }
    
    public void unsetDependsOnId() {
        final String oldDependsOnId = this.dependsOnId;
        final boolean oldDependsOnIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.dependsOnId = VersionableChangeDTOImpl.DEPENDS_ON_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldDependsOnId, (Object)VersionableChangeDTOImpl.DEPENDS_ON_ID_EDEFAULT, oldDependsOnIdESet));
        }
    }
    
    public boolean isSetDependsOnId() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 11: {
                return ((InternalEList)this.getChangeDetails()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isResolved() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.getVersionableItemId();
            }
            case 2: {
                return this.getVersionableType();
            }
            case 3: {
                return this.getName();
            }
            case 4: {
                return this.getParentPathHint();
            }
            case 5: {
                return this.getBeforeStateId();
            }
            case 6: {
                return this.getAfterStateId();
            }
            case 7: {
                return this.getConfigurationStateId();
            }
            case 8: {
                return this.getKind();
            }
            case 9: {
                return this.getChangeType();
            }
            case 10: {
                return this.getIncidentals();
            }
            case 11: {
                return this.getChangeDetails();
            }
            case 12: {
                return this.getChildChanges();
            }
            case 13: {
                return this.getDependsOnId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setResolved((boolean)newValue);
            }
            case 1: {
                this.setVersionableItemId((String)newValue);
            }
            case 2: {
                this.setVersionableType((String)newValue);
            }
            case 3: {
                this.setName((String)newValue);
            }
            case 4: {
                this.setParentPathHint((String)newValue);
            }
            case 5: {
                this.setBeforeStateId((String)newValue);
            }
            case 6: {
                this.setAfterStateId((String)newValue);
            }
            case 7: {
                this.setConfigurationStateId((String)newValue);
            }
            case 8: {
                this.setKind((String)newValue);
            }
            case 9: {
                this.setChangeType((String)newValue);
            }
            case 10: {
                this.getIncidentals().clear();
                this.getIncidentals().addAll((Collection)newValue);
            }
            case 11: {
                this.getChangeDetails().clear();
                this.getChangeDetails().addAll((Collection)newValue);
            }
            case 12: {
                this.getChildChanges().clear();
                this.getChildChanges().addAll((Collection)newValue);
            }
            case 13: {
                this.setDependsOnId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetResolved();
            }
            case 1: {
                this.unsetVersionableItemId();
            }
            case 2: {
                this.unsetVersionableType();
            }
            case 3: {
                this.unsetName();
            }
            case 4: {
                this.unsetParentPathHint();
            }
            case 5: {
                this.unsetBeforeStateId();
            }
            case 6: {
                this.unsetAfterStateId();
            }
            case 7: {
                this.unsetConfigurationStateId();
            }
            case 8: {
                this.unsetKind();
            }
            case 9: {
                this.unsetChangeType();
            }
            case 10: {
                this.unsetIncidentals();
            }
            case 11: {
                this.unsetChangeDetails();
            }
            case 12: {
                this.unsetChildChanges();
            }
            case 13: {
                this.unsetDependsOnId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetResolved();
            }
            case 1: {
                return this.isSetVersionableItemId();
            }
            case 2: {
                return this.isSetVersionableType();
            }
            case 3: {
                return this.isSetName();
            }
            case 4: {
                return this.isSetParentPathHint();
            }
            case 5: {
                return this.isSetBeforeStateId();
            }
            case 6: {
                return this.isSetAfterStateId();
            }
            case 7: {
                return this.isSetConfigurationStateId();
            }
            case 8: {
                return this.isSetKind();
            }
            case 9: {
                return this.isSetChangeType();
            }
            case 10: {
                return this.isSetIncidentals();
            }
            case 11: {
                return this.isSetChangeDetails();
            }
            case 12: {
                return this.isSetChildChanges();
            }
            case 13: {
                return this.isSetDependsOnId();
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
        result.append(" (resolved: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
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
        result.append(", versionableType: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.versionableType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", parentPathHint: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.parentPathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(", beforeStateId: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.beforeStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterStateId: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.afterStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", configurationStateId: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.configurationStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", kind: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.kind);
        }
        else {
            result.append("<unset>");
        }
        result.append(", changeType: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.changeType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", incidentals: ");
        result.append(this.incidentals);
        result.append(", childChanges: ");
        result.append(this.childChanges);
        result.append(", dependsOnId: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.dependsOnId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
