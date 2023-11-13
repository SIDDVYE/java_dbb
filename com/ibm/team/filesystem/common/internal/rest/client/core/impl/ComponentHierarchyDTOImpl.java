// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentHierarchyDTO;

public class ComponentHierarchyDTOImpl extends HierarchyDTOImpl implements ComponentHierarchyDTO
{
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 2048;
    protected EList subcomponents;
    protected static final boolean IN_WORKSPACE_EDEFAULT = false;
    protected static final int IN_WORKSPACE_EFLAG = 4096;
    protected static final int IN_WORKSPACE_ESETFLAG = 8192;
    private static final int EOFFSET_CORRECTION;
    
    static {
        WORKSPACE_ITEM_ID_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemRestClientDTOcorePackage.Literals.COMPONENT_HIERARCHY_DTO.getFeatureID((EStructuralFeature)FilesystemRestClientDTOcorePackage.Literals.COMPONENT_HIERARCHY_DTO__WORKSPACE_ITEM_ID) - 8;
    }
    
    protected ComponentHierarchyDTOImpl() {
        this.workspaceItemId = ComponentHierarchyDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.COMPONENT_HIERARCHY_DTO;
    }
    
    @Override
    public String getWorkspaceItemId() {
        return this.workspaceItemId;
    }
    
    @Override
    public void setWorkspaceItemId(final String newWorkspaceItemId) {
        final String oldWorkspaceItemId = this.workspaceItemId;
        this.workspaceItemId = newWorkspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8 + ComponentHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    @Override
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.workspaceItemId = ComponentHierarchyDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8 + ComponentHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldWorkspaceItemId, (Object)ComponentHierarchyDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    @Override
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    @Override
    public List getSubcomponents() {
        if (this.subcomponents == null) {
            this.subcomponents = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentHierarchyDTO.class, (InternalEObject)this, 9 + ComponentHierarchyDTOImpl.EOFFSET_CORRECTION);
        }
        return (List)this.subcomponents;
    }
    
    @Override
    public void unsetSubcomponents() {
        if (this.subcomponents != null) {
            ((InternalEList.Unsettable)this.subcomponents).unset();
        }
    }
    
    @Override
    public boolean isSetSubcomponents() {
        return this.subcomponents != null && ((InternalEList.Unsettable)this.subcomponents).isSet();
    }
    
    @Override
    public boolean isInWorkspace() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    @Override
    public void setInWorkspace(final boolean newInWorkspace) {
        final boolean oldInWorkspace = (this.ALL_FLAGS & 0x1000) != 0x0;
        if (newInWorkspace) {
            this.ALL_FLAGS |= 0x1000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFEFFF;
        }
        final boolean oldInWorkspaceESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10 + ComponentHierarchyDTOImpl.EOFFSET_CORRECTION, oldInWorkspace, newInWorkspace, !oldInWorkspaceESet));
        }
    }
    
    @Override
    public void unsetInWorkspace() {
        final boolean oldInWorkspace = (this.ALL_FLAGS & 0x1000) != 0x0;
        final boolean oldInWorkspaceESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10 + ComponentHierarchyDTOImpl.EOFFSET_CORRECTION, oldInWorkspace, false, oldInWorkspaceESet));
        }
    }
    
    @Override
    public boolean isSetInWorkspace() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID - ComponentHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 9: {
                return ((InternalEList)this.getSubcomponents()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - ComponentHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                return this.getWorkspaceItemId();
            }
            case 9: {
                return this.getSubcomponents();
            }
            case 10: {
                return this.isInWorkspace() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - ComponentHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                this.setWorkspaceItemId((String)newValue);
            }
            case 9: {
                this.getSubcomponents().clear();
                this.getSubcomponents().addAll((Collection)newValue);
            }
            case 10: {
                this.setInWorkspace((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID - ComponentHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                this.unsetWorkspaceItemId();
            }
            case 9: {
                this.unsetSubcomponents();
            }
            case 10: {
                this.unsetInWorkspace();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID - ComponentHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                return this.isSetWorkspaceItemId();
            }
            case 9: {
                return this.isSetSubcomponents();
            }
            case 10: {
                return this.isSetInWorkspace();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != ComponentHierarchyDTO.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - ComponentHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                return 8 + ComponentHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 9: {
                return 9 + ComponentHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 10: {
                return 10 + ComponentHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (workspaceItemId: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.workspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", inWorkspace: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
