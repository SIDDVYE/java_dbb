// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SyncViewFiltersDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SyncViewFiltersDTOImpl extends EObjectImpl implements SyncViewFiltersDTO
{
    protected int ALL_FLAGS;
    protected static final boolean ALL_FLOW_TARGETS_EDEFAULT = false;
    protected static final int ALL_FLOW_TARGETS_EFLAG = 1;
    protected static final int ALL_FLOW_TARGETS_ESETFLAG = 2;
    protected static final boolean ALL_FLOW_TARGETS_DEFAULT_EDEFAULT = false;
    protected static final int ALL_FLOW_TARGETS_DEFAULT_EFLAG = 4;
    protected static final int ALL_FLOW_TARGETS_DEFAULT_ESETFLAG = 8;
    protected static final int MAX_NUMBER_CHANGES_SHOWN_IN_CHANGE_SET_EDEFAULT = 0;
    protected int maxNumberChangesShownInChangeSet;
    protected static final int MAX_NUMBER_CHANGES_SHOWN_IN_CHANGE_SET_ESETFLAG = 16;
    protected static final int MAX_NUMBER_CHANGES_SHOWN_IN_CHANGE_SET_DEFAULT_EDEFAULT = 0;
    protected int maxNumberChangesShownInChangeSetDefault;
    protected static final int MAX_NUMBER_CHANGES_SHOWN_IN_CHANGE_SET_DEFAULT_ESETFLAG = 32;
    protected static final boolean SHOW_ALL_BASELINES_EDEFAULT = false;
    protected static final int SHOW_ALL_BASELINES_EFLAG = 64;
    protected static final int SHOW_ALL_BASELINES_ESETFLAG = 128;
    protected static final boolean SHOW_ALL_BASELINES_DEFAULT_EDEFAULT = false;
    protected static final int SHOW_ALL_BASELINES_DEFAULT_EFLAG = 256;
    protected static final int SHOW_ALL_BASELINES_DEFAULT_ESETFLAG = 512;
    
    protected SyncViewFiltersDTOImpl() {
        this.ALL_FLAGS = 0;
        this.maxNumberChangesShownInChangeSet = 0;
        this.maxNumberChangesShownInChangeSetDefault = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.SYNC_VIEW_FILTERS_DTO;
    }
    
    public int getMaxNumberChangesShownInChangeSet() {
        return this.maxNumberChangesShownInChangeSet;
    }
    
    public void setMaxNumberChangesShownInChangeSet(final int newMaxNumberChangesShownInChangeSet) {
        final int oldMaxNumberChangesShownInChangeSet = this.maxNumberChangesShownInChangeSet;
        this.maxNumberChangesShownInChangeSet = newMaxNumberChangesShownInChangeSet;
        final boolean oldMaxNumberChangesShownInChangeSetESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldMaxNumberChangesShownInChangeSet, this.maxNumberChangesShownInChangeSet, !oldMaxNumberChangesShownInChangeSetESet));
        }
    }
    
    public void unsetMaxNumberChangesShownInChangeSet() {
        final int oldMaxNumberChangesShownInChangeSet = this.maxNumberChangesShownInChangeSet;
        final boolean oldMaxNumberChangesShownInChangeSetESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.maxNumberChangesShownInChangeSet = 0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldMaxNumberChangesShownInChangeSet, 0, oldMaxNumberChangesShownInChangeSetESet));
        }
    }
    
    public boolean isSetMaxNumberChangesShownInChangeSet() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public boolean isAllFlowTargets() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setAllFlowTargets(final boolean newAllFlowTargets) {
        final boolean oldAllFlowTargets = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newAllFlowTargets) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldAllFlowTargetsESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldAllFlowTargets, newAllFlowTargets, !oldAllFlowTargetsESet));
        }
    }
    
    public void unsetAllFlowTargets() {
        final boolean oldAllFlowTargets = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldAllFlowTargetsESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldAllFlowTargets, false, oldAllFlowTargetsESet));
        }
    }
    
    public boolean isSetAllFlowTargets() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public int getMaxNumberChangesShownInChangeSetDefault() {
        return this.maxNumberChangesShownInChangeSetDefault;
    }
    
    public void setMaxNumberChangesShownInChangeSetDefault(final int newMaxNumberChangesShownInChangeSetDefault) {
        final int oldMaxNumberChangesShownInChangeSetDefault = this.maxNumberChangesShownInChangeSetDefault;
        this.maxNumberChangesShownInChangeSetDefault = newMaxNumberChangesShownInChangeSetDefault;
        final boolean oldMaxNumberChangesShownInChangeSetDefaultESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldMaxNumberChangesShownInChangeSetDefault, this.maxNumberChangesShownInChangeSetDefault, !oldMaxNumberChangesShownInChangeSetDefaultESet));
        }
    }
    
    public void unsetMaxNumberChangesShownInChangeSetDefault() {
        final int oldMaxNumberChangesShownInChangeSetDefault = this.maxNumberChangesShownInChangeSetDefault;
        final boolean oldMaxNumberChangesShownInChangeSetDefaultESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.maxNumberChangesShownInChangeSetDefault = 0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldMaxNumberChangesShownInChangeSetDefault, 0, oldMaxNumberChangesShownInChangeSetDefaultESet));
        }
    }
    
    public boolean isSetMaxNumberChangesShownInChangeSetDefault() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public boolean isAllFlowTargetsDefault() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setAllFlowTargetsDefault(final boolean newAllFlowTargetsDefault) {
        final boolean oldAllFlowTargetsDefault = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newAllFlowTargetsDefault) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldAllFlowTargetsDefaultESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldAllFlowTargetsDefault, newAllFlowTargetsDefault, !oldAllFlowTargetsDefaultESet));
        }
    }
    
    public void unsetAllFlowTargetsDefault() {
        final boolean oldAllFlowTargetsDefault = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldAllFlowTargetsDefaultESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldAllFlowTargetsDefault, false, oldAllFlowTargetsDefaultESet));
        }
    }
    
    public boolean isSetAllFlowTargetsDefault() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public boolean isShowAllBaselines() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public void setShowAllBaselines(final boolean newShowAllBaselines) {
        final boolean oldShowAllBaselines = (this.ALL_FLAGS & 0x40) != 0x0;
        if (newShowAllBaselines) {
            this.ALL_FLAGS |= 0x40;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFBF;
        }
        final boolean oldShowAllBaselinesESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldShowAllBaselines, newShowAllBaselines, !oldShowAllBaselinesESet));
        }
    }
    
    public void unsetShowAllBaselines() {
        final boolean oldShowAllBaselines = (this.ALL_FLAGS & 0x40) != 0x0;
        final boolean oldShowAllBaselinesESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldShowAllBaselines, false, oldShowAllBaselinesESet));
        }
    }
    
    public boolean isSetShowAllBaselines() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public boolean isShowAllBaselinesDefault() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public void setShowAllBaselinesDefault(final boolean newShowAllBaselinesDefault) {
        final boolean oldShowAllBaselinesDefault = (this.ALL_FLAGS & 0x100) != 0x0;
        if (newShowAllBaselinesDefault) {
            this.ALL_FLAGS |= 0x100;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFEFF;
        }
        final boolean oldShowAllBaselinesDefaultESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldShowAllBaselinesDefault, newShowAllBaselinesDefault, !oldShowAllBaselinesDefaultESet));
        }
    }
    
    public void unsetShowAllBaselinesDefault() {
        final boolean oldShowAllBaselinesDefault = (this.ALL_FLAGS & 0x100) != 0x0;
        final boolean oldShowAllBaselinesDefaultESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldShowAllBaselinesDefault, false, oldShowAllBaselinesDefaultESet));
        }
    }
    
    public boolean isSetShowAllBaselinesDefault() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isAllFlowTargets() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.isAllFlowTargetsDefault() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return new Integer(this.getMaxNumberChangesShownInChangeSet());
            }
            case 3: {
                return new Integer(this.getMaxNumberChangesShownInChangeSetDefault());
            }
            case 4: {
                return this.isShowAllBaselines() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return this.isShowAllBaselinesDefault() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setAllFlowTargets((boolean)newValue);
            }
            case 1: {
                this.setAllFlowTargetsDefault((boolean)newValue);
            }
            case 2: {
                this.setMaxNumberChangesShownInChangeSet((int)newValue);
            }
            case 3: {
                this.setMaxNumberChangesShownInChangeSetDefault((int)newValue);
            }
            case 4: {
                this.setShowAllBaselines((boolean)newValue);
            }
            case 5: {
                this.setShowAllBaselinesDefault((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAllFlowTargets();
            }
            case 1: {
                this.unsetAllFlowTargetsDefault();
            }
            case 2: {
                this.unsetMaxNumberChangesShownInChangeSet();
            }
            case 3: {
                this.unsetMaxNumberChangesShownInChangeSetDefault();
            }
            case 4: {
                this.unsetShowAllBaselines();
            }
            case 5: {
                this.unsetShowAllBaselinesDefault();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAllFlowTargets();
            }
            case 1: {
                return this.isSetAllFlowTargetsDefault();
            }
            case 2: {
                return this.isSetMaxNumberChangesShownInChangeSet();
            }
            case 3: {
                return this.isSetMaxNumberChangesShownInChangeSetDefault();
            }
            case 4: {
                return this.isSetShowAllBaselines();
            }
            case 5: {
                return this.isSetShowAllBaselinesDefault();
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
        result.append(" (allFlowTargets: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", allFlowTargetsDefault: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", maxNumberChangesShownInChangeSet: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.maxNumberChangesShownInChangeSet);
        }
        else {
            result.append("<unset>");
        }
        result.append(", maxNumberChangesShownInChangeSetDefault: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.maxNumberChangesShownInChangeSetDefault);
        }
        else {
            result.append("<unset>");
        }
        result.append(", showAllBaselines: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append((this.ALL_FLAGS & 0x40) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", showAllBaselinesDefault: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append((this.ALL_FLAGS & 0x100) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
