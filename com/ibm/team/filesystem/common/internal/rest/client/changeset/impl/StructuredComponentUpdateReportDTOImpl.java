// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredBaselineUpdateReportDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredComponentUpdateReportDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StructuredComponentUpdateReportDTOImpl extends EObjectImpl implements StructuredComponentUpdateReportDTO
{
    protected int ALL_FLAGS;
    protected EList baselines;
    protected EList changeSetItemIds;
    protected EList conflictedItemIds;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 1;
    protected static final String COMPONENT_NAME_EDEFAULT;
    protected String componentName;
    protected static final int COMPONENT_NAME_ESETFLAG = 2;
    protected CurrentPatchDTO currentPatch;
    protected static final int CURRENT_PATCH_ESETFLAG = 4;
    
    static {
        COMPONENT_ITEM_ID_EDEFAULT = null;
        COMPONENT_NAME_EDEFAULT = null;
    }
    
    protected StructuredComponentUpdateReportDTOImpl() {
        this.ALL_FLAGS = 0;
        this.componentItemId = StructuredComponentUpdateReportDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.componentName = StructuredComponentUpdateReportDTOImpl.COMPONENT_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.STRUCTURED_COMPONENT_UPDATE_REPORT_DTO;
    }
    
    public String getComponentName() {
        return this.componentName;
    }
    
    public void setComponentName(final String newComponentName) {
        final String oldComponentName = this.componentName;
        this.componentName = newComponentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldComponentName, (Object)this.componentName, !oldComponentNameESet));
        }
    }
    
    public void unsetComponentName() {
        final String oldComponentName = this.componentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.componentName = StructuredComponentUpdateReportDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldComponentName, (Object)StructuredComponentUpdateReportDTOImpl.COMPONENT_NAME_EDEFAULT, oldComponentNameESet));
        }
    }
    
    public boolean isSetComponentName() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public CurrentPatchDTO getCurrentPatch() {
        if (this.currentPatch != null && ((EObject)this.currentPatch).eIsProxy()) {
            final InternalEObject oldCurrentPatch = (InternalEObject)this.currentPatch;
            this.currentPatch = (CurrentPatchDTO)this.eResolveProxy(oldCurrentPatch);
            if (this.currentPatch != oldCurrentPatch && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 5, (Object)oldCurrentPatch, (Object)this.currentPatch));
            }
        }
        return this.currentPatch;
    }
    
    public CurrentPatchDTO basicGetCurrentPatch() {
        return this.currentPatch;
    }
    
    public void setCurrentPatch(final CurrentPatchDTO newCurrentPatch) {
        final CurrentPatchDTO oldCurrentPatch = this.currentPatch;
        this.currentPatch = newCurrentPatch;
        final boolean oldCurrentPatchESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldCurrentPatch, (Object)this.currentPatch, !oldCurrentPatchESet));
        }
    }
    
    public void unsetCurrentPatch() {
        final CurrentPatchDTO oldCurrentPatch = this.currentPatch;
        final boolean oldCurrentPatchESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.currentPatch = null;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldCurrentPatch, (Object)null, oldCurrentPatchESet));
        }
    }
    
    public boolean isSetCurrentPatch() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.componentItemId = StructuredComponentUpdateReportDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldComponentItemId, (Object)StructuredComponentUpdateReportDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public List getConflictedItemIds() {
        if (this.conflictedItemIds == null) {
            this.conflictedItemIds = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 2);
        }
        return (List)this.conflictedItemIds;
    }
    
    public void unsetConflictedItemIds() {
        if (this.conflictedItemIds != null) {
            ((InternalEList.Unsettable)this.conflictedItemIds).unset();
        }
    }
    
    public boolean isSetConflictedItemIds() {
        return this.conflictedItemIds != null && ((InternalEList.Unsettable)this.conflictedItemIds).isSet();
    }
    
    public List getChangeSetItemIds() {
        if (this.changeSetItemIds == null) {
            this.changeSetItemIds = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 1);
        }
        return (List)this.changeSetItemIds;
    }
    
    public void unsetChangeSetItemIds() {
        if (this.changeSetItemIds != null) {
            ((InternalEList.Unsettable)this.changeSetItemIds).unset();
        }
    }
    
    public boolean isSetChangeSetItemIds() {
        return this.changeSetItemIds != null && ((InternalEList.Unsettable)this.changeSetItemIds).isSet();
    }
    
    public List getBaselines() {
        if (this.baselines == null) {
            this.baselines = (EList)new EObjectContainmentEList.Unsettable((Class)StructuredBaselineUpdateReportDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.baselines;
    }
    
    public void unsetBaselines() {
        if (this.baselines != null) {
            ((InternalEList.Unsettable)this.baselines).unset();
        }
    }
    
    public boolean isSetBaselines() {
        return this.baselines != null && ((InternalEList.Unsettable)this.baselines).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getBaselines()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBaselines();
            }
            case 1: {
                return this.getChangeSetItemIds();
            }
            case 2: {
                return this.getConflictedItemIds();
            }
            case 3: {
                return this.getComponentItemId();
            }
            case 4: {
                return this.getComponentName();
            }
            case 5: {
                if (resolve) {
                    return this.getCurrentPatch();
                }
                return this.basicGetCurrentPatch();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getBaselines().clear();
                this.getBaselines().addAll((Collection)newValue);
            }
            case 1: {
                this.getChangeSetItemIds().clear();
                this.getChangeSetItemIds().addAll((Collection)newValue);
            }
            case 2: {
                this.getConflictedItemIds().clear();
                this.getConflictedItemIds().addAll((Collection)newValue);
            }
            case 3: {
                this.setComponentItemId((String)newValue);
            }
            case 4: {
                this.setComponentName((String)newValue);
            }
            case 5: {
                this.setCurrentPatch((CurrentPatchDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBaselines();
            }
            case 1: {
                this.unsetChangeSetItemIds();
            }
            case 2: {
                this.unsetConflictedItemIds();
            }
            case 3: {
                this.unsetComponentItemId();
            }
            case 4: {
                this.unsetComponentName();
            }
            case 5: {
                this.unsetCurrentPatch();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBaselines();
            }
            case 1: {
                return this.isSetChangeSetItemIds();
            }
            case 2: {
                return this.isSetConflictedItemIds();
            }
            case 3: {
                return this.isSetComponentItemId();
            }
            case 4: {
                return this.isSetComponentName();
            }
            case 5: {
                return this.isSetCurrentPatch();
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
        result.append(" (changeSetItemIds: ");
        result.append(this.changeSetItemIds);
        result.append(", conflictedItemIds: ");
        result.append(this.conflictedItemIds);
        result.append(", componentItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentName: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.componentName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
