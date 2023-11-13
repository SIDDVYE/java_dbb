// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.ComponentHierarchyUpdateResultDTO;
import com.ibm.team.repository.common.model.impl.HelperImpl;

public class ComponentHierarchyUpdateResultDTOImpl extends HelperImpl implements ComponentHierarchyUpdateResultDTO
{
    protected int ALL_FLAGS;
    protected static final String AFFECTED_CHANGE_SET_ITEM_ID_EDEFAULT;
    protected String affectedChangeSetItemId;
    protected static final int AFFECTED_CHANGE_SET_ITEM_ID_ESETFLAG = 2;
    protected EList updatedChildrenItemIds;
    private static final int EOFFSET_CORRECTION;
    
    static {
        AFFECTED_CHANGE_SET_ITEM_ID_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemRestClientDTOworkspacePackage.Literals.COMPONENT_HIERARCHY_UPDATE_RESULT_DTO.getFeatureID((EStructuralFeature)FilesystemRestClientDTOworkspacePackage.Literals.COMPONENT_HIERARCHY_UPDATE_RESULT_DTO__AFFECTED_CHANGE_SET_ITEM_ID) - 1;
    }
    
    protected ComponentHierarchyUpdateResultDTOImpl() {
        this.ALL_FLAGS = 0;
        this.affectedChangeSetItemId = ComponentHierarchyUpdateResultDTOImpl.AFFECTED_CHANGE_SET_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOworkspacePackage.Literals.COMPONENT_HIERARCHY_UPDATE_RESULT_DTO;
    }
    
    public String getAffectedChangeSetItemId() {
        return this.affectedChangeSetItemId;
    }
    
    public void setAffectedChangeSetItemId(final String newAffectedChangeSetItemId) {
        final String oldAffectedChangeSetItemId = this.affectedChangeSetItemId;
        this.affectedChangeSetItemId = newAffectedChangeSetItemId;
        final boolean oldAffectedChangeSetItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1 + ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION, (Object)oldAffectedChangeSetItemId, (Object)this.affectedChangeSetItemId, !oldAffectedChangeSetItemIdESet));
        }
    }
    
    public void unsetAffectedChangeSetItemId() {
        final String oldAffectedChangeSetItemId = this.affectedChangeSetItemId;
        final boolean oldAffectedChangeSetItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.affectedChangeSetItemId = ComponentHierarchyUpdateResultDTOImpl.AFFECTED_CHANGE_SET_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1 + ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION, (Object)oldAffectedChangeSetItemId, (Object)ComponentHierarchyUpdateResultDTOImpl.AFFECTED_CHANGE_SET_ITEM_ID_EDEFAULT, oldAffectedChangeSetItemIdESet));
        }
    }
    
    public boolean isSetAffectedChangeSetItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getUpdatedChildrenItemIds() {
        if (this.updatedChildrenItemIds == null) {
            this.updatedChildrenItemIds = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 2 + ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION);
        }
        return (List)this.updatedChildrenItemIds;
    }
    
    public void unsetUpdatedChildrenItemIds() {
        if (this.updatedChildrenItemIds != null) {
            ((InternalEList.Unsettable)this.updatedChildrenItemIds).unset();
        }
    }
    
    public boolean isSetUpdatedChildrenItemIds() {
        return this.updatedChildrenItemIds != null && ((InternalEList.Unsettable)this.updatedChildrenItemIds).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.getAffectedChangeSetItemId();
            }
            case 2: {
                return this.getUpdatedChildrenItemIds();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.setAffectedChangeSetItemId((String)newValue);
            }
            case 2: {
                this.getUpdatedChildrenItemIds().clear();
                this.getUpdatedChildrenItemIds().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.unsetAffectedChangeSetItemId();
            }
            case 2: {
                this.unsetUpdatedChildrenItemIds();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.isSetAffectedChangeSetItemId();
            }
            case 2: {
                return this.isSetUpdatedChildrenItemIds();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != ComponentHierarchyUpdateResultDTO.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return 1 + ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION;
            }
            case 2: {
                return 2 + ComponentHierarchyUpdateResultDTOImpl.EOFFSET_CORRECTION;
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
        result.append(" (affectedChangeSetItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.affectedChangeSetItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", updatedChildrenItemIds: ");
        result.append(this.updatedChildrenItemIds);
        result.append(')');
        return result.toString();
    }
}
